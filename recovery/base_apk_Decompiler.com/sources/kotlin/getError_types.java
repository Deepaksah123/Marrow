package kotlin;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\u000b\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\r\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\r\u0010\fJ!\u0010\r\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J-\u0010\u0010\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0014J!\u0010\u0010\u001a\u00020\u00062\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0015¢\u0006\u0004\b\u0010\u0010\u0016J)\u0010\u0017\u001a\u00020\u00132\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00152\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0018"}, d2 = {"Lo/getError_types;", "", "<init>", "()V", "Lo/ThemeKtExternalSyntheticLambda0;", "p0", "", "AudioAttributesCompatParcelizer", "(Lo/ThemeKtExternalSyntheticLambda0;)Ljava/lang/String;", "p1", "p2", "RemoteActionCompatParcelizer", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "write", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "", "IconCompatParcelizer", "(Ljava/lang/String;Ljava/lang/String;J)Ljava/lang/String;", "p3", "", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)Z", "", "(Ljava/util/Map;)Ljava/lang/String;", "read", "(Ljava/util/Map;Ljava/lang/String;)Z"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class getError_types {
    public static final getError_types INSTANCE = new getError_types();

    private getError_types() {
    }

    public static String AudioAttributesCompatParcelizer(ThemeKtExternalSyntheticLambda0 p0) {
        if (p0 == null) {
            return "";
        }
        return RemoteActionCompatParcelizer(p0.AudioAttributesCompatParcelizer("Dr-Dv-Ts"), p0.AudioAttributesCompatParcelizer("Dr-Dv"), p0.AudioAttributesCompatParcelizer("Dr-Platform"));
    }

    private static String RemoteActionCompatParcelizer(String p0, String p1, String p2) {
        StringBuilder sb = new StringBuilder();
        sb.append(p1);
        sb.append("_");
        sb.append(p2);
        sb.append("_");
        sb.append(p0);
        return sb.toString();
    }

    public static String write(String p0, String p1, String p2) {
        StringBuilder sb = new StringBuilder();
        sb.append(p1);
        sb.append("_");
        sb.append(p2);
        sb.append("_");
        sb.append(p0);
        sb.append("_a81ca170fd4c47ae82a5021595841994");
        return sb.toString();
    }

    public static String write(String p0, String p1) {
        StringBuilder sb = new StringBuilder();
        sb.append(p0);
        sb.append("_");
        sb.append(p1);
        return sb.toString();
    }

    public static String IconCompatParcelizer(String p0, String p1, long p2) throws NoSuchAlgorithmException {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        StringBuilder sb = new StringBuilder();
        sb.append(p0);
        sb.append("|");
        sb.append(p1);
        sb.append("|");
        sb.append(p2);
        sb.append("|e574bf06a7a938ff371f012e00d9fc793a2f5a983abb13d4bbeac91384e5ea85");
        String string = sb.toString();
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        byte[] bytes = string.getBytes(getSubmissionTimestamp.IconCompatParcelizer);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(bytes, "");
        byte[] bArrDigest = messageDigest.digest(bytes);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(bArrDigest, "");
        return getOrderDetails.write(bArrDigest, "", "", "", -1, "...", (getAnswerMap<? super Byte, ? extends CharSequence>) new getAnswerMap() { // from class: o.getQbankThreshold
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return getError_types.write(((Byte) obj).byteValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence write(byte b) {
        String str = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
        return str;
    }

    public static boolean IconCompatParcelizer(String p0, String p1, long p2, String p3) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        toMagicModuleMetaRepoModel.write(p3, "");
        return TestGroupLSModel.read(IconCompatParcelizer(p0, p1, p2), p3, true);
    }

    public static String IconCompatParcelizer(final Map<String, String> p0) throws NoSuchAlgorithmException {
        toMagicModuleMetaRepoModel.write(p0, "");
        String strRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer(IntermediateLoginResponseBody.onPause(p0.keySet()), "|", null, null, 0, null, new getAnswerMap() { // from class: o.getFeedback_type
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return getError_types.AudioAttributesCompatParcelizer(p0, (String) obj);
            }
        }, 30);
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        byte[] bytes = strRemoteActionCompatParcelizer.getBytes(getSubmissionTimestamp.IconCompatParcelizer);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(bytes, "");
        byte[] bArrDigest = messageDigest.digest(bytes);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(bArrDigest, "");
        return getOrderDetails.write(bArrDigest, "", "", "", -1, "...", (getAnswerMap<? super Byte, ? extends CharSequence>) new getAnswerMap() { // from class: o.ComplainRequestBodyKt
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return getError_types.RemoteActionCompatParcelizer(((Byte) obj).byteValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence AudioAttributesCompatParcelizer(Map map, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        String str2 = (String) map.get(str);
        String str3 = str2 != null ? str2 : "";
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("=");
        sb.append(str3);
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence RemoteActionCompatParcelizer(byte b) {
        String str = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
        return str;
    }

    public static boolean read(Map<String, String> p0, String p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        return TestGroupLSModel.read(IconCompatParcelizer(p0), p1, true);
    }
}
