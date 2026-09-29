package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.source.rtsp.RtspHeaders;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import com.razorpay.C$0o__;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.getCurrentSampleFlags;
import kotlin.initExtraTracks;
import kotlin.onContainerAtomRead;
import kotlin.parseSchiFromParent;
import kotlin.parseVideoSampleEntry;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
final class RtspMessageUtil {
    public static final long DEFAULT_RTSP_TIMEOUT_MS = 60000;
    private static final String RTSP_VERSION = "RTSP/1.0";
    private static final Pattern REQUEST_LINE_PATTERN = Pattern.compile("([A-Z_]+) (.*) RTSP/1\\.0");
    private static final Pattern STATUS_LINE_PATTERN = Pattern.compile("RTSP/1\\.0 (\\d+) (.+)");
    private static final Pattern CONTENT_LENGTH_HEADER_PATTERN = Pattern.compile("Content-Length:\\s?(\\d+)", 2);
    private static final Pattern SESSION_HEADER_PATTERN = Pattern.compile("([\\w$\\-_.+]+)(?:;\\s?timeout=(\\d+))?");
    private static final Pattern WWW_AUTHENTICATION_HEADER_DIGEST_PATTERN = Pattern.compile("Digest realm=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\",\\s?(?:domain=\"(.+)\",\\s?)?nonce=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\"(?:,\\s?opaque=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\")?");
    private static final Pattern WWW_AUTHENTICATION_HEADER_BASIC_PATTERN = Pattern.compile("Basic realm=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\"");
    private static final String LF = new String(new byte[]{10});
    private static final String CRLF = new String(new byte[]{13, 10});

    public static final class RtspSessionHeader {
        public final String sessionId;
        public final long timeoutMs;

        public RtspSessionHeader(String str, long j) {
            this.sessionId = str;
            this.timeoutMs = j;
        }
    }

    public static final class RtspAuthUserInfo {
        public final String password;
        public final String username;

        public RtspAuthUserInfo(String str, String str2) {
            this.username = str;
            this.password = str2;
        }
    }

    public static initExtraTracks<String> serializeRequest(RtspRequest rtspRequest) {
        Assertions.checkArgument(rtspRequest.headers.get(RtspHeaders.CSEQ) != null);
        initExtraTracks.IconCompatParcelizer iconCompatParcelizer = new initExtraTracks.IconCompatParcelizer();
        iconCompatParcelizer.read(Util.formatInvariant("%s %s %s", toMethodString(rtspRequest.method), rtspRequest.uri, RTSP_VERSION));
        onContainerAtomRead<String, String> oncontaineratomreadAsMultiMap = rtspRequest.headers.asMultiMap();
        getCurrentSampleFlags<String> it = oncontaineratomreadAsMultiMap.onCommand().iterator();
        while (it.hasNext()) {
            String next = it.next();
            initExtraTracks<String> initextratracksRemoteActionCompatParcelizer = oncontaineratomreadAsMultiMap.RemoteActionCompatParcelizer(next);
            for (int i = 0; i < initextratracksRemoteActionCompatParcelizer.size(); i++) {
                iconCompatParcelizer.read(Util.formatInvariant("%s: %s", next, initextratracksRemoteActionCompatParcelizer.get(i)));
            }
        }
        iconCompatParcelizer.read("");
        iconCompatParcelizer.read(rtspRequest.messageBody);
        return iconCompatParcelizer.IconCompatParcelizer();
    }

    public static initExtraTracks<String> serializeResponse(RtspResponse rtspResponse) {
        Assertions.checkArgument(rtspResponse.headers.get(RtspHeaders.CSEQ) != null);
        initExtraTracks.IconCompatParcelizer iconCompatParcelizer = new initExtraTracks.IconCompatParcelizer();
        iconCompatParcelizer.read(Util.formatInvariant("%s %s %s", RTSP_VERSION, Integer.valueOf(rtspResponse.status), getRtspStatusReasonPhrase(rtspResponse.status)));
        onContainerAtomRead<String, String> oncontaineratomreadAsMultiMap = rtspResponse.headers.asMultiMap();
        getCurrentSampleFlags<String> it = oncontaineratomreadAsMultiMap.onCommand().iterator();
        while (it.hasNext()) {
            String next = it.next();
            initExtraTracks<String> initextratracksRemoteActionCompatParcelizer = oncontaineratomreadAsMultiMap.RemoteActionCompatParcelizer(next);
            for (int i = 0; i < initextratracksRemoteActionCompatParcelizer.size(); i++) {
                iconCompatParcelizer.read(Util.formatInvariant("%s: %s", next, initextratracksRemoteActionCompatParcelizer.get(i)));
            }
        }
        iconCompatParcelizer.read("");
        iconCompatParcelizer.read(rtspResponse.messageBody);
        return iconCompatParcelizer.IconCompatParcelizer();
    }

    public static byte[] convertMessageToByteArray(List<String> list) {
        return parseSchiFromParent.write(CRLF).RemoteActionCompatParcelizer(list).getBytes(RtspMessageChannel.CHARSET);
    }

    public static Uri removeUserInfo(Uri uri) {
        if (uri.getUserInfo() == null) {
            return uri;
        }
        String str = (String) Assertions.checkNotNull(uri.getAuthority());
        Assertions.checkArgument(str.contains("@"));
        return uri.buildUpon().encodedAuthority(Util.split(str, "@")[1]).build();
    }

    public static RtspAuthUserInfo parseUserInfo(Uri uri) {
        String userInfo = uri.getUserInfo();
        if (userInfo == null || !userInfo.contains(":")) {
            return null;
        }
        String[] strArrSplitAtFirst = Util.splitAtFirst(userInfo, ":");
        return new RtspAuthUserInfo(strArrSplitAtFirst[0], strArrSplitAtFirst[1]);
    }

    public static byte[] getStringBytes(String str) {
        return str.getBytes(RtspMessageChannel.CHARSET);
    }

    public static String toMethodString(int i) {
        switch (i) {
            case 1:
                return "ANNOUNCE";
            case 2:
                return "DESCRIBE";
            case 3:
                return "GET_PARAMETER";
            case 4:
                return C$0o__.OPTIONS;
            case 5:
                return "PAUSE";
            case 6:
                return "PLAY";
            case 7:
                return "PLAY_NOTIFY";
            case 8:
                return "RECORD";
            case 9:
                return "REDIRECT";
            case 10:
                return "SETUP";
            case 11:
                return "SET_PARAMETER";
            case 12:
                return "TEARDOWN";
            default:
                throw new IllegalStateException();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int parseMethodString(java.lang.String r12) {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.rtsp.RtspMessageUtil.parseMethodString(java.lang.String):int");
    }

    public static RtspResponse parseResponse(List<String> list) {
        Matcher matcher = STATUS_LINE_PATTERN.matcher(list.get(0));
        Assertions.checkArgument(matcher.matches());
        int i = Integer.parseInt((String) Assertions.checkNotNull(matcher.group(1)));
        int iIndexOf = list.indexOf("");
        Assertions.checkArgument(iIndexOf > 0);
        return new RtspResponse(i, new RtspHeaders.Builder().addAll(list.subList(1, iIndexOf)).build(), parseSchiFromParent.write(CRLF).RemoteActionCompatParcelizer(list.subList(iIndexOf + 1, list.size())));
    }

    public static RtspRequest parseRequest(List<String> list) {
        Matcher matcher = REQUEST_LINE_PATTERN.matcher(list.get(0));
        Assertions.checkArgument(matcher.matches());
        int methodString = parseMethodString((String) Assertions.checkNotNull(matcher.group(1)));
        Uri uri = Uri.parse((String) Assertions.checkNotNull(matcher.group(2)));
        int iIndexOf = list.indexOf("");
        Assertions.checkArgument(iIndexOf > 0);
        return new RtspRequest(uri, methodString, new RtspHeaders.Builder().addAll(list.subList(1, iIndexOf)).build(), parseSchiFromParent.write(CRLF).RemoteActionCompatParcelizer(list.subList(iIndexOf + 1, list.size())));
    }

    public static boolean isRtspStartLine(String str) {
        return REQUEST_LINE_PATTERN.matcher(str).matches() || STATUS_LINE_PATTERN.matcher(str).matches();
    }

    public static boolean isRtspResponse(List<String> list) {
        return STATUS_LINE_PATTERN.matcher(list.get(0)).matches();
    }

    public static String[] splitRtspMessageBody(String str) {
        String str2 = CRLF;
        if (!str.contains(str2)) {
            str2 = LF;
        }
        return Util.split(str, str2);
    }

    public static long parseContentLengthHeader(String str) throws ParserException {
        try {
            Matcher matcher = CONTENT_LENGTH_HEADER_PATTERN.matcher(str);
            if (matcher.find()) {
                return Long.parseLong((String) Assertions.checkNotNull(matcher.group(1)));
            }
            return -1L;
        } catch (NumberFormatException e) {
            throw ParserException.createForMalformedManifest(str, e);
        }
    }

    public static initExtraTracks<Integer> parsePublicHeader(String str) {
        if (str == null) {
            return initExtraTracks.AudioAttributesImplApi26Parcelizer();
        }
        initExtraTracks.IconCompatParcelizer iconCompatParcelizer = new initExtraTracks.IconCompatParcelizer();
        for (String str2 : Util.split(str, ",\\s?")) {
            iconCompatParcelizer.read(Integer.valueOf(parseMethodString(str2)));
        }
        return iconCompatParcelizer.IconCompatParcelizer();
    }

    public static RtspSessionHeader parseSessionHeader(String str) throws ParserException {
        long j;
        Matcher matcher = SESSION_HEADER_PATTERN.matcher(str);
        if (!matcher.matches()) {
            throw ParserException.createForMalformedManifest(str, null);
        }
        String str2 = (String) Assertions.checkNotNull(matcher.group(1));
        String strGroup = matcher.group(2);
        if (strGroup != null) {
            try {
                j = ((long) Integer.parseInt(strGroup)) * 1000;
            } catch (NumberFormatException e) {
                throw ParserException.createForMalformedManifest(str, e);
            }
        } else {
            j = 60000;
        }
        return new RtspSessionHeader(str2, j);
    }

    public static RtspAuthenticationInfo parseWwwAuthenticateHeader(String str) throws ParserException {
        Matcher matcher = WWW_AUTHENTICATION_HEADER_DIGEST_PATTERN.matcher(str);
        if (matcher.find()) {
            return new RtspAuthenticationInfo(2, (String) Assertions.checkNotNull(matcher.group(1)), (String) Assertions.checkNotNull(matcher.group(3)), parseVideoSampleEntry.RemoteActionCompatParcelizer(matcher.group(4)));
        }
        Matcher matcher2 = WWW_AUTHENTICATION_HEADER_BASIC_PATTERN.matcher(str);
        if (matcher2.matches()) {
            return new RtspAuthenticationInfo(1, (String) Assertions.checkNotNull(matcher2.group(1)), "", "");
        }
        throw ParserException.createForMalformedManifest("Invalid WWW-Authenticate header ".concat(String.valueOf(str)), null);
    }

    public static void checkManifestExpression(boolean z, String str) throws ParserException {
        if (!z) {
            throw ParserException.createForMalformedManifest(str, null);
        }
    }

    private static String getRtspStatusReasonPhrase(int i) {
        if (i == 200) {
            return "OK";
        }
        if (i == 461) {
            return "Unsupported Transport";
        }
        if (i == 500) {
            return "Internal Server Error";
        }
        if (i == 505) {
            return "RTSP Version Not Supported";
        }
        if (i == 301) {
            return "Move Permanently";
        }
        if (i == 302) {
            return "Move Temporarily";
        }
        if (i == 400) {
            return "Bad Request";
        }
        if (i == 401) {
            return "Unauthorized";
        }
        if (i == 404) {
            return "Not Found";
        }
        if (i == 405) {
            return "Method Not Allowed";
        }
        switch (i) {
            case 454:
                return "Session Not Found";
            case 455:
                return "Method Not Valid In This State";
            case 456:
                return "Header Field Not Valid";
            case 457:
                return "Invalid Range";
            default:
                throw new IllegalArgumentException();
        }
    }

    public static int parseInt(String str) throws ParserException {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            throw ParserException.createForMalformedManifest(str, e);
        }
    }

    private RtspMessageUtil() {
    }
}
