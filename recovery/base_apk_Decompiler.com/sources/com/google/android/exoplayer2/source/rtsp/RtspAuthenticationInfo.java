package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import android.util.Base64;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.source.rtsp.RtspMessageUtil;
import com.google.android.exoplayer2.util.Util;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
final class RtspAuthenticationInfo {
    private static final String ALGORITHM = "MD5";
    public static final int BASIC = 1;
    private static final String BASIC_AUTHORIZATION_HEADER_FORMAT = "Basic %s";
    public static final int DIGEST = 2;
    private static final String DIGEST_AUTHORIZATION_HEADER_FORMAT = "Digest username=\"%s\", realm=\"%s\", nonce=\"%s\", uri=\"%s\", response=\"%s\"";
    private static final String DIGEST_AUTHORIZATION_HEADER_FORMAT_WITH_OPAQUE = "Digest username=\"%s\", realm=\"%s\", nonce=\"%s\", uri=\"%s\", response=\"%s\", opaque=\"%s\"";
    public final int authenticationMechanism;
    public final String nonce;
    public final String opaque;
    public final String realm;

    public RtspAuthenticationInfo(int i, String str, String str2, String str3) {
        this.authenticationMechanism = i;
        this.realm = str;
        this.nonce = str2;
        this.opaque = str3;
    }

    public final String getAuthorizationHeaderValue(RtspMessageUtil.RtspAuthUserInfo rtspAuthUserInfo, Uri uri, int i) throws ParserException {
        int i2 = this.authenticationMechanism;
        if (i2 == 1) {
            return getBasicAuthorizationHeaderValue(rtspAuthUserInfo);
        }
        if (i2 == 2) {
            return getDigestAuthorizationHeaderValue(rtspAuthUserInfo, uri, i);
        }
        throw ParserException.createForManifestWithUnsupportedFeature(null, new UnsupportedOperationException());
    }

    private String getBasicAuthorizationHeaderValue(RtspMessageUtil.RtspAuthUserInfo rtspAuthUserInfo) {
        StringBuilder sb = new StringBuilder();
        sb.append(rtspAuthUserInfo.username);
        sb.append(":");
        sb.append(rtspAuthUserInfo.password);
        return Util.formatInvariant(BASIC_AUTHORIZATION_HEADER_FORMAT, Base64.encodeToString(RtspMessageUtil.getStringBytes(sb.toString()), 0));
    }

    private String getDigestAuthorizationHeaderValue(RtspMessageUtil.RtspAuthUserInfo rtspAuthUserInfo, Uri uri, int i) throws ParserException {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(ALGORITHM);
            String methodString = RtspMessageUtil.toMethodString(i);
            StringBuilder sb = new StringBuilder();
            sb.append(rtspAuthUserInfo.username);
            sb.append(":");
            sb.append(this.realm);
            sb.append(":");
            sb.append(rtspAuthUserInfo.password);
            String hexString = Util.toHexString(messageDigest.digest(RtspMessageUtil.getStringBytes(sb.toString())));
            StringBuilder sb2 = new StringBuilder();
            sb2.append(methodString);
            sb2.append(":");
            sb2.append(uri);
            String hexString2 = Util.toHexString(messageDigest.digest(RtspMessageUtil.getStringBytes(sb2.toString())));
            StringBuilder sb3 = new StringBuilder();
            sb3.append(hexString);
            sb3.append(":");
            sb3.append(this.nonce);
            sb3.append(":");
            sb3.append(hexString2);
            String hexString3 = Util.toHexString(messageDigest.digest(RtspMessageUtil.getStringBytes(sb3.toString())));
            if (this.opaque.isEmpty()) {
                return Util.formatInvariant(DIGEST_AUTHORIZATION_HEADER_FORMAT, rtspAuthUserInfo.username, this.realm, this.nonce, uri, hexString3);
            }
            return Util.formatInvariant(DIGEST_AUTHORIZATION_HEADER_FORMAT_WITH_OPAQUE, rtspAuthUserInfo.username, this.realm, this.nonce, uri, hexString3, this.opaque);
        } catch (NoSuchAlgorithmException e) {
            throw ParserException.createForManifestWithUnsupportedFeature(null, e);
        }
    }
}
