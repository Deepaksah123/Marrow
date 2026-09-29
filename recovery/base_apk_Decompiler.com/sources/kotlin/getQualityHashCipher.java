package kotlin;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u0007"}, d2 = {"Lo/getQualityHashCipher;", "", "", "p0", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "javaName", "Ljava/lang/String;", "read", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class getQualityHashCipher {
    private final String javaName;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Comparator<String> ORDER_BY_NAME = new read();
    private static final Map<String, getQualityHashCipher> INSTANCES = new LinkedHashMap();
    public static final getQualityHashCipher TLS_RSA_WITH_NULL_MD5 = Companion.RemoteActionCompatParcelizer("SSL_RSA_WITH_NULL_MD5");
    public static final getQualityHashCipher TLS_RSA_WITH_NULL_SHA = Companion.RemoteActionCompatParcelizer("SSL_RSA_WITH_NULL_SHA");
    public static final getQualityHashCipher TLS_RSA_EXPORT_WITH_RC4_40_MD5 = Companion.RemoteActionCompatParcelizer("SSL_RSA_EXPORT_WITH_RC4_40_MD5");
    public static final getQualityHashCipher TLS_RSA_WITH_RC4_128_MD5 = Companion.RemoteActionCompatParcelizer("SSL_RSA_WITH_RC4_128_MD5");
    public static final getQualityHashCipher TLS_RSA_WITH_RC4_128_SHA = Companion.RemoteActionCompatParcelizer("SSL_RSA_WITH_RC4_128_SHA");
    public static final getQualityHashCipher TLS_RSA_EXPORT_WITH_DES40_CBC_SHA = Companion.RemoteActionCompatParcelizer("SSL_RSA_EXPORT_WITH_DES40_CBC_SHA");
    public static final getQualityHashCipher TLS_RSA_WITH_DES_CBC_SHA = Companion.RemoteActionCompatParcelizer("SSL_RSA_WITH_DES_CBC_SHA");
    public static final getQualityHashCipher TLS_RSA_WITH_3DES_EDE_CBC_SHA = Companion.RemoteActionCompatParcelizer("SSL_RSA_WITH_3DES_EDE_CBC_SHA");
    public static final getQualityHashCipher TLS_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA = Companion.RemoteActionCompatParcelizer("SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA");
    public static final getQualityHashCipher TLS_DHE_DSS_WITH_DES_CBC_SHA = Companion.RemoteActionCompatParcelizer("SSL_DHE_DSS_WITH_DES_CBC_SHA");
    public static final getQualityHashCipher TLS_DHE_DSS_WITH_3DES_EDE_CBC_SHA = Companion.RemoteActionCompatParcelizer("SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA");
    public static final getQualityHashCipher TLS_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA = Companion.RemoteActionCompatParcelizer("SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA");
    public static final getQualityHashCipher TLS_DHE_RSA_WITH_DES_CBC_SHA = Companion.RemoteActionCompatParcelizer("SSL_DHE_RSA_WITH_DES_CBC_SHA");
    public static final getQualityHashCipher TLS_DHE_RSA_WITH_3DES_EDE_CBC_SHA = Companion.RemoteActionCompatParcelizer("SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA");
    public static final getQualityHashCipher TLS_DH_anon_EXPORT_WITH_RC4_40_MD5 = Companion.RemoteActionCompatParcelizer("SSL_DH_anon_EXPORT_WITH_RC4_40_MD5");
    public static final getQualityHashCipher TLS_DH_anon_WITH_RC4_128_MD5 = Companion.RemoteActionCompatParcelizer("SSL_DH_anon_WITH_RC4_128_MD5");
    public static final getQualityHashCipher TLS_DH_anon_EXPORT_WITH_DES40_CBC_SHA = Companion.RemoteActionCompatParcelizer("SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA");
    public static final getQualityHashCipher TLS_DH_anon_WITH_DES_CBC_SHA = Companion.RemoteActionCompatParcelizer("SSL_DH_anon_WITH_DES_CBC_SHA");
    public static final getQualityHashCipher TLS_DH_anon_WITH_3DES_EDE_CBC_SHA = Companion.RemoteActionCompatParcelizer("SSL_DH_anon_WITH_3DES_EDE_CBC_SHA");
    public static final getQualityHashCipher TLS_KRB5_WITH_DES_CBC_SHA = Companion.RemoteActionCompatParcelizer("TLS_KRB5_WITH_DES_CBC_SHA");
    public static final getQualityHashCipher TLS_KRB5_WITH_3DES_EDE_CBC_SHA = Companion.RemoteActionCompatParcelizer("TLS_KRB5_WITH_3DES_EDE_CBC_SHA");
    public static final getQualityHashCipher TLS_KRB5_WITH_RC4_128_SHA = Companion.RemoteActionCompatParcelizer("TLS_KRB5_WITH_RC4_128_SHA");
    public static final getQualityHashCipher TLS_KRB5_WITH_DES_CBC_MD5 = Companion.RemoteActionCompatParcelizer("TLS_KRB5_WITH_DES_CBC_MD5");
    public static final getQualityHashCipher TLS_KRB5_WITH_3DES_EDE_CBC_MD5 = Companion.RemoteActionCompatParcelizer("TLS_KRB5_WITH_3DES_EDE_CBC_MD5");
    public static final getQualityHashCipher TLS_KRB5_WITH_RC4_128_MD5 = Companion.RemoteActionCompatParcelizer("TLS_KRB5_WITH_RC4_128_MD5");
    public static final getQualityHashCipher TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA = Companion.RemoteActionCompatParcelizer("TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA");
    public static final getQualityHashCipher TLS_KRB5_EXPORT_WITH_RC4_40_SHA = Companion.RemoteActionCompatParcelizer("TLS_KRB5_EXPORT_WITH_RC4_40_SHA");
    public static final getQualityHashCipher TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5 = Companion.RemoteActionCompatParcelizer("TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5");
    public static final getQualityHashCipher TLS_KRB5_EXPORT_WITH_RC4_40_MD5 = Companion.RemoteActionCompatParcelizer("TLS_KRB5_EXPORT_WITH_RC4_40_MD5");
    public static final getQualityHashCipher TLS_RSA_WITH_AES_128_CBC_SHA = Companion.RemoteActionCompatParcelizer("TLS_RSA_WITH_AES_128_CBC_SHA");
    public static final getQualityHashCipher TLS_DHE_DSS_WITH_AES_128_CBC_SHA = Companion.RemoteActionCompatParcelizer("TLS_DHE_DSS_WITH_AES_128_CBC_SHA");
    public static final getQualityHashCipher TLS_DHE_RSA_WITH_AES_128_CBC_SHA = Companion.RemoteActionCompatParcelizer("TLS_DHE_RSA_WITH_AES_128_CBC_SHA");
    public static final getQualityHashCipher TLS_DH_anon_WITH_AES_128_CBC_SHA = Companion.RemoteActionCompatParcelizer("TLS_DH_anon_WITH_AES_128_CBC_SHA");
    public static final getQualityHashCipher TLS_RSA_WITH_AES_256_CBC_SHA = Companion.RemoteActionCompatParcelizer("TLS_RSA_WITH_AES_256_CBC_SHA");
    public static final getQualityHashCipher TLS_DHE_DSS_WITH_AES_256_CBC_SHA = Companion.RemoteActionCompatParcelizer("TLS_DHE_DSS_WITH_AES_256_CBC_SHA");
    public static final getQualityHashCipher TLS_DHE_RSA_WITH_AES_256_CBC_SHA = Companion.RemoteActionCompatParcelizer("TLS_DHE_RSA_WITH_AES_256_CBC_SHA");
    public static final getQualityHashCipher TLS_DH_anon_WITH_AES_256_CBC_SHA = Companion.RemoteActionCompatParcelizer("TLS_DH_anon_WITH_AES_256_CBC_SHA");
    public static final getQualityHashCipher TLS_RSA_WITH_NULL_SHA256 = Companion.RemoteActionCompatParcelizer("TLS_RSA_WITH_NULL_SHA256");
    public static final getQualityHashCipher TLS_RSA_WITH_AES_128_CBC_SHA256 = Companion.RemoteActionCompatParcelizer("TLS_RSA_WITH_AES_128_CBC_SHA256");
    public static final getQualityHashCipher TLS_RSA_WITH_AES_256_CBC_SHA256 = Companion.RemoteActionCompatParcelizer("TLS_RSA_WITH_AES_256_CBC_SHA256");
    public static final getQualityHashCipher TLS_DHE_DSS_WITH_AES_128_CBC_SHA256 = Companion.RemoteActionCompatParcelizer("TLS_DHE_DSS_WITH_AES_128_CBC_SHA256");
    public static final getQualityHashCipher TLS_RSA_WITH_CAMELLIA_128_CBC_SHA = Companion.RemoteActionCompatParcelizer("TLS_RSA_WITH_CAMELLIA_128_CBC_SHA");
    public static final getQualityHashCipher TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA = Companion.RemoteActionCompatParcelizer("TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA");
    public static final getQualityHashCipher TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA = Companion.RemoteActionCompatParcelizer("TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA");
    public static final getQualityHashCipher TLS_DHE_RSA_WITH_AES_128_CBC_SHA256 = Companion.RemoteActionCompatParcelizer("TLS_DHE_RSA_WITH_AES_128_CBC_SHA256");
    public static final getQualityHashCipher TLS_DHE_DSS_WITH_AES_256_CBC_SHA256 = Companion.RemoteActionCompatParcelizer("TLS_DHE_DSS_WITH_AES_256_CBC_SHA256");
    public static final getQualityHashCipher TLS_DHE_RSA_WITH_AES_256_CBC_SHA256 = Companion.RemoteActionCompatParcelizer("TLS_DHE_RSA_WITH_AES_256_CBC_SHA256");
    public static final getQualityHashCipher TLS_DH_anon_WITH_AES_128_CBC_SHA256 = Companion.RemoteActionCompatParcelizer("TLS_DH_anon_WITH_AES_128_CBC_SHA256");
    public static final getQualityHashCipher TLS_DH_anon_WITH_AES_256_CBC_SHA256 = Companion.RemoteActionCompatParcelizer("TLS_DH_anon_WITH_AES_256_CBC_SHA256");
    public static final getQualityHashCipher TLS_RSA_WITH_CAMELLIA_256_CBC_SHA = Companion.RemoteActionCompatParcelizer("TLS_RSA_WITH_CAMELLIA_256_CBC_SHA");
    public static final getQualityHashCipher TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA = Companion.RemoteActionCompatParcelizer("TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA");
    public static final getQualityHashCipher TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA = Companion.RemoteActionCompatParcelizer("TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA");
    public static final getQualityHashCipher TLS_PSK_WITH_RC4_128_SHA = Companion.RemoteActionCompatParcelizer("TLS_PSK_WITH_RC4_128_SHA");
    public static final getQualityHashCipher TLS_PSK_WITH_3DES_EDE_CBC_SHA = Companion.RemoteActionCompatParcelizer("TLS_PSK_WITH_3DES_EDE_CBC_SHA");
    public static final getQualityHashCipher TLS_PSK_WITH_AES_128_CBC_SHA = Companion.RemoteActionCompatParcelizer("TLS_PSK_WITH_AES_128_CBC_SHA");
    public static final getQualityHashCipher TLS_PSK_WITH_AES_256_CBC_SHA = Companion.RemoteActionCompatParcelizer("TLS_PSK_WITH_AES_256_CBC_SHA");
    public static final getQualityHashCipher TLS_RSA_WITH_SEED_CBC_SHA = Companion.RemoteActionCompatParcelizer("TLS_RSA_WITH_SEED_CBC_SHA");
    public static final getQualityHashCipher TLS_RSA_WITH_AES_128_GCM_SHA256 = Companion.RemoteActionCompatParcelizer("TLS_RSA_WITH_AES_128_GCM_SHA256");
    public static final getQualityHashCipher TLS_RSA_WITH_AES_256_GCM_SHA384 = Companion.RemoteActionCompatParcelizer("TLS_RSA_WITH_AES_256_GCM_SHA384");
    public static final getQualityHashCipher TLS_DHE_RSA_WITH_AES_128_GCM_SHA256 = Companion.RemoteActionCompatParcelizer("TLS_DHE_RSA_WITH_AES_128_GCM_SHA256");
    public static final getQualityHashCipher TLS_DHE_RSA_WITH_AES_256_GCM_SHA384 = Companion.RemoteActionCompatParcelizer("TLS_DHE_RSA_WITH_AES_256_GCM_SHA384");
    public static final getQualityHashCipher TLS_DHE_DSS_WITH_AES_128_GCM_SHA256 = Companion.RemoteActionCompatParcelizer("TLS_DHE_DSS_WITH_AES_128_GCM_SHA256");
    public static final getQualityHashCipher TLS_DHE_DSS_WITH_AES_256_GCM_SHA384 = Companion.RemoteActionCompatParcelizer("TLS_DHE_DSS_WITH_AES_256_GCM_SHA384");
    public static final getQualityHashCipher TLS_DH_anon_WITH_AES_128_GCM_SHA256 = Companion.RemoteActionCompatParcelizer("TLS_DH_anon_WITH_AES_128_GCM_SHA256");
    public static final getQualityHashCipher TLS_DH_anon_WITH_AES_256_GCM_SHA384 = Companion.RemoteActionCompatParcelizer("TLS_DH_anon_WITH_AES_256_GCM_SHA384");
    public static final getQualityHashCipher TLS_EMPTY_RENEGOTIATION_INFO_SCSV = Companion.RemoteActionCompatParcelizer("TLS_EMPTY_RENEGOTIATION_INFO_SCSV");
    public static final getQualityHashCipher TLS_FALLBACK_SCSV = Companion.RemoteActionCompatParcelizer("TLS_FALLBACK_SCSV");
    public static final getQualityHashCipher TLS_ECDH_ECDSA_WITH_NULL_SHA = Companion.RemoteActionCompatParcelizer("TLS_ECDH_ECDSA_WITH_NULL_SHA");
    public static final getQualityHashCipher TLS_ECDH_ECDSA_WITH_RC4_128_SHA = Companion.RemoteActionCompatParcelizer("TLS_ECDH_ECDSA_WITH_RC4_128_SHA");
    public static final getQualityHashCipher TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA = Companion.RemoteActionCompatParcelizer("TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA");
    public static final getQualityHashCipher TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA = Companion.RemoteActionCompatParcelizer("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA");
    public static final getQualityHashCipher TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA = Companion.RemoteActionCompatParcelizer("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA");
    public static final getQualityHashCipher TLS_ECDHE_ECDSA_WITH_NULL_SHA = Companion.RemoteActionCompatParcelizer("TLS_ECDHE_ECDSA_WITH_NULL_SHA");
    public static final getQualityHashCipher TLS_ECDHE_ECDSA_WITH_RC4_128_SHA = Companion.RemoteActionCompatParcelizer("TLS_ECDHE_ECDSA_WITH_RC4_128_SHA");
    public static final getQualityHashCipher TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA = Companion.RemoteActionCompatParcelizer("TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA");
    public static final getQualityHashCipher TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA = Companion.RemoteActionCompatParcelizer("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA");
    public static final getQualityHashCipher TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA = Companion.RemoteActionCompatParcelizer("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA");
    public static final getQualityHashCipher TLS_ECDH_RSA_WITH_NULL_SHA = Companion.RemoteActionCompatParcelizer("TLS_ECDH_RSA_WITH_NULL_SHA");
    public static final getQualityHashCipher TLS_ECDH_RSA_WITH_RC4_128_SHA = Companion.RemoteActionCompatParcelizer("TLS_ECDH_RSA_WITH_RC4_128_SHA");
    public static final getQualityHashCipher TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA = Companion.RemoteActionCompatParcelizer("TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA");
    public static final getQualityHashCipher TLS_ECDH_RSA_WITH_AES_128_CBC_SHA = Companion.RemoteActionCompatParcelizer("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA");
    public static final getQualityHashCipher TLS_ECDH_RSA_WITH_AES_256_CBC_SHA = Companion.RemoteActionCompatParcelizer("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA");
    public static final getQualityHashCipher TLS_ECDHE_RSA_WITH_NULL_SHA = Companion.RemoteActionCompatParcelizer("TLS_ECDHE_RSA_WITH_NULL_SHA");
    public static final getQualityHashCipher TLS_ECDHE_RSA_WITH_RC4_128_SHA = Companion.RemoteActionCompatParcelizer("TLS_ECDHE_RSA_WITH_RC4_128_SHA");
    public static final getQualityHashCipher TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA = Companion.RemoteActionCompatParcelizer("TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA");
    public static final getQualityHashCipher TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA = Companion.RemoteActionCompatParcelizer("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA");
    public static final getQualityHashCipher TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA = Companion.RemoteActionCompatParcelizer("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA");
    public static final getQualityHashCipher TLS_ECDH_anon_WITH_NULL_SHA = Companion.RemoteActionCompatParcelizer("TLS_ECDH_anon_WITH_NULL_SHA");
    public static final getQualityHashCipher TLS_ECDH_anon_WITH_RC4_128_SHA = Companion.RemoteActionCompatParcelizer("TLS_ECDH_anon_WITH_RC4_128_SHA");
    public static final getQualityHashCipher TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA = Companion.RemoteActionCompatParcelizer("TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA");
    public static final getQualityHashCipher TLS_ECDH_anon_WITH_AES_128_CBC_SHA = Companion.RemoteActionCompatParcelizer("TLS_ECDH_anon_WITH_AES_128_CBC_SHA");
    public static final getQualityHashCipher TLS_ECDH_anon_WITH_AES_256_CBC_SHA = Companion.RemoteActionCompatParcelizer("TLS_ECDH_anon_WITH_AES_256_CBC_SHA");
    public static final getQualityHashCipher TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256 = Companion.RemoteActionCompatParcelizer("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256");
    public static final getQualityHashCipher TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384 = Companion.RemoteActionCompatParcelizer("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384");
    public static final getQualityHashCipher TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256 = Companion.RemoteActionCompatParcelizer("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256");
    public static final getQualityHashCipher TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384 = Companion.RemoteActionCompatParcelizer("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384");
    public static final getQualityHashCipher TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256 = Companion.RemoteActionCompatParcelizer("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256");
    public static final getQualityHashCipher TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384 = Companion.RemoteActionCompatParcelizer("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384");
    public static final getQualityHashCipher TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256 = Companion.RemoteActionCompatParcelizer("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256");
    public static final getQualityHashCipher TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384 = Companion.RemoteActionCompatParcelizer("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384");
    public static final getQualityHashCipher TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256 = Companion.RemoteActionCompatParcelizer("TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256");
    public static final getQualityHashCipher TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384 = Companion.RemoteActionCompatParcelizer("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384");
    public static final getQualityHashCipher TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256 = Companion.RemoteActionCompatParcelizer("TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256");
    public static final getQualityHashCipher TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384 = Companion.RemoteActionCompatParcelizer("TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384");
    public static final getQualityHashCipher TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256 = Companion.RemoteActionCompatParcelizer("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256");
    public static final getQualityHashCipher TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384 = Companion.RemoteActionCompatParcelizer("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384");
    public static final getQualityHashCipher TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256 = Companion.RemoteActionCompatParcelizer("TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256");
    public static final getQualityHashCipher TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384 = Companion.RemoteActionCompatParcelizer("TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384");
    public static final getQualityHashCipher TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA = Companion.RemoteActionCompatParcelizer("TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA");
    public static final getQualityHashCipher TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA = Companion.RemoteActionCompatParcelizer("TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA");
    public static final getQualityHashCipher TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256 = Companion.RemoteActionCompatParcelizer("TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256");
    public static final getQualityHashCipher TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256 = Companion.RemoteActionCompatParcelizer("TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256");
    public static final getQualityHashCipher TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256 = Companion.RemoteActionCompatParcelizer("TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256");
    public static final getQualityHashCipher TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256 = Companion.RemoteActionCompatParcelizer("TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256");
    public static final getQualityHashCipher TLS_AES_128_GCM_SHA256 = Companion.RemoteActionCompatParcelizer("TLS_AES_128_GCM_SHA256");
    public static final getQualityHashCipher TLS_AES_256_GCM_SHA384 = Companion.RemoteActionCompatParcelizer("TLS_AES_256_GCM_SHA384");
    public static final getQualityHashCipher TLS_CHACHA20_POLY1305_SHA256 = Companion.RemoteActionCompatParcelizer("TLS_CHACHA20_POLY1305_SHA256");
    public static final getQualityHashCipher TLS_AES_128_CCM_SHA256 = Companion.RemoteActionCompatParcelizer("TLS_AES_128_CCM_SHA256");
    public static final getQualityHashCipher TLS_AES_128_CCM_8_SHA256 = Companion.RemoteActionCompatParcelizer("TLS_AES_128_CCM_8_SHA256");

    private getQualityHashCipher(String str) {
        this.javaName = str;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final String getJavaName() {
        return this.javaName;
    }

    public final String toString() {
        return this.javaName;
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b}\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0083\u0001\u001a\u00020\u00062\u0007\u0010\u0084\u0001\u001a\u00020\u0005H\u0007J\u001c\u0010\u0085\u0001\u001a\u00020\u00062\u0007\u0010\u0084\u0001\u001a\u00020\u00052\b\u0010\u0086\u0001\u001a\u00030\u0087\u0001H\u0002J\u0012\u0010\u0088\u0001\u001a\u00020\u00052\u0007\u0010\u0084\u0001\u001a\u00020\u0005H\u0002R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00050\bj\b\u0012\u0004\u0012\u00020\u0005`\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0010\u0010\f\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010$\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010%\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010&\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010'\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010(\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010)\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010*\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010+\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010,\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010-\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010.\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010/\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u00100\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u00101\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u00102\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u00103\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u00104\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u00105\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u00106\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u00107\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u00108\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u00109\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010:\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010;\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010<\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010=\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010>\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010?\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010@\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010A\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010B\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010C\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010D\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010E\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010F\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010G\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010H\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010I\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010J\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010K\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010L\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010M\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010N\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010O\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010P\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010Q\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010R\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010S\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010T\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010U\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010V\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010W\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010X\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010Y\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010Z\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010[\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\\\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010]\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010^\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010_\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010`\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010a\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010c\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010d\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010e\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010f\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010g\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010h\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010i\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010j\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010k\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010l\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010m\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010n\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010o\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010p\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010q\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010r\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010s\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010t\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010u\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010v\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010w\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010x\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010y\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010z\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010{\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010|\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010}\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010~\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u007f\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0080\u0001\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0081\u0001\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0082\u0001\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0089\u0001"}, d2 = {"Lokhttp3/CipherSuite$Companion;", "", "()V", "INSTANCES", "", "", "Lokhttp3/CipherSuite;", "ORDER_BY_NAME", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "getORDER_BY_NAME$okhttp", "()Ljava/util/Comparator;", "TLS_AES_128_CCM_8_SHA256", "TLS_AES_128_CCM_SHA256", "TLS_AES_128_GCM_SHA256", "TLS_AES_256_GCM_SHA384", "TLS_CHACHA20_POLY1305_SHA256", "TLS_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA", "TLS_DHE_DSS_WITH_3DES_EDE_CBC_SHA", "TLS_DHE_DSS_WITH_AES_128_CBC_SHA", "TLS_DHE_DSS_WITH_AES_128_CBC_SHA256", "TLS_DHE_DSS_WITH_AES_128_GCM_SHA256", "TLS_DHE_DSS_WITH_AES_256_CBC_SHA", "TLS_DHE_DSS_WITH_AES_256_CBC_SHA256", "TLS_DHE_DSS_WITH_AES_256_GCM_SHA384", "TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA", "TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA", "TLS_DHE_DSS_WITH_DES_CBC_SHA", "TLS_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA", "TLS_DHE_RSA_WITH_3DES_EDE_CBC_SHA", "TLS_DHE_RSA_WITH_AES_128_CBC_SHA", "TLS_DHE_RSA_WITH_AES_128_CBC_SHA256", "TLS_DHE_RSA_WITH_AES_128_GCM_SHA256", "TLS_DHE_RSA_WITH_AES_256_CBC_SHA", "TLS_DHE_RSA_WITH_AES_256_CBC_SHA256", "TLS_DHE_RSA_WITH_AES_256_GCM_SHA384", "TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA", "TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA", "TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256", "TLS_DHE_RSA_WITH_DES_CBC_SHA", "TLS_DH_anon_EXPORT_WITH_DES40_CBC_SHA", "TLS_DH_anon_EXPORT_WITH_RC4_40_MD5", "TLS_DH_anon_WITH_3DES_EDE_CBC_SHA", "TLS_DH_anon_WITH_AES_128_CBC_SHA", "TLS_DH_anon_WITH_AES_128_CBC_SHA256", "TLS_DH_anon_WITH_AES_128_GCM_SHA256", "TLS_DH_anon_WITH_AES_256_CBC_SHA", "TLS_DH_anon_WITH_AES_256_CBC_SHA256", "TLS_DH_anon_WITH_AES_256_GCM_SHA384", "TLS_DH_anon_WITH_DES_CBC_SHA", "TLS_DH_anon_WITH_RC4_128_MD5", "TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA", "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256", "TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA", "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384", "TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", "TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256", "TLS_ECDHE_ECDSA_WITH_NULL_SHA", "TLS_ECDHE_ECDSA_WITH_RC4_128_SHA", "TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA", "TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA", "TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256", "TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA", "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA", "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256", "TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA", "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384", "TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384", "TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256", "TLS_ECDHE_RSA_WITH_NULL_SHA", "TLS_ECDHE_RSA_WITH_RC4_128_SHA", "TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA", "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA", "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256", "TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256", "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA", "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384", "TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384", "TLS_ECDH_ECDSA_WITH_NULL_SHA", "TLS_ECDH_ECDSA_WITH_RC4_128_SHA", "TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA", "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA", "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256", "TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256", "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA", "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384", "TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384", "TLS_ECDH_RSA_WITH_NULL_SHA", "TLS_ECDH_RSA_WITH_RC4_128_SHA", "TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA", "TLS_ECDH_anon_WITH_AES_128_CBC_SHA", "TLS_ECDH_anon_WITH_AES_256_CBC_SHA", "TLS_ECDH_anon_WITH_NULL_SHA", "TLS_ECDH_anon_WITH_RC4_128_SHA", "TLS_EMPTY_RENEGOTIATION_INFO_SCSV", "TLS_FALLBACK_SCSV", "TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5", "TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA", "TLS_KRB5_EXPORT_WITH_RC4_40_MD5", "TLS_KRB5_EXPORT_WITH_RC4_40_SHA", "TLS_KRB5_WITH_3DES_EDE_CBC_MD5", "TLS_KRB5_WITH_3DES_EDE_CBC_SHA", "TLS_KRB5_WITH_DES_CBC_MD5", "TLS_KRB5_WITH_DES_CBC_SHA", "TLS_KRB5_WITH_RC4_128_MD5", "TLS_KRB5_WITH_RC4_128_SHA", "TLS_PSK_WITH_3DES_EDE_CBC_SHA", "TLS_PSK_WITH_AES_128_CBC_SHA", "TLS_PSK_WITH_AES_256_CBC_SHA", "TLS_PSK_WITH_RC4_128_SHA", "TLS_RSA_EXPORT_WITH_DES40_CBC_SHA", "TLS_RSA_EXPORT_WITH_RC4_40_MD5", "TLS_RSA_WITH_3DES_EDE_CBC_SHA", "TLS_RSA_WITH_AES_128_CBC_SHA", "TLS_RSA_WITH_AES_128_CBC_SHA256", "TLS_RSA_WITH_AES_128_GCM_SHA256", "TLS_RSA_WITH_AES_256_CBC_SHA", "TLS_RSA_WITH_AES_256_CBC_SHA256", "TLS_RSA_WITH_AES_256_GCM_SHA384", "TLS_RSA_WITH_CAMELLIA_128_CBC_SHA", "TLS_RSA_WITH_CAMELLIA_256_CBC_SHA", "TLS_RSA_WITH_DES_CBC_SHA", "TLS_RSA_WITH_NULL_MD5", "TLS_RSA_WITH_NULL_SHA", "TLS_RSA_WITH_NULL_SHA256", "TLS_RSA_WITH_RC4_128_MD5", "TLS_RSA_WITH_RC4_128_SHA", "TLS_RSA_WITH_SEED_CBC_SHA", "forJavaName", "javaName", "init", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "secondaryName", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static Comparator<String> read() {
            return getQualityHashCipher.ORDER_BY_NAME;
        }

        @getMagicModuleMeta
        public final getQualityHashCipher write(String str) {
            getQualityHashCipher getqualityhashcipher;
            synchronized (this) {
                toMagicModuleMetaRepoModel.write(str, "");
                getqualityhashcipher = (getQualityHashCipher) getQualityHashCipher.INSTANCES.get(str);
                if (getqualityhashcipher == null) {
                    getqualityhashcipher = (getQualityHashCipher) getQualityHashCipher.INSTANCES.get(IconCompatParcelizer(str));
                    if (getqualityhashcipher == null) {
                        getqualityhashcipher = new getQualityHashCipher(str, null);
                    }
                    getQualityHashCipher.INSTANCES.put(str, getqualityhashcipher);
                }
            }
            return getqualityhashcipher;
        }

        private static String IconCompatParcelizer(String str) {
            if (TestGroupLSModel.MediaBrowserCompatCustomActionResultReceiver(str, "TLS_")) {
                StringBuilder sb = new StringBuilder("SSL_");
                String strSubstring = str.substring(4);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strSubstring, "");
                sb.append(strSubstring);
                return sb.toString();
            }
            if (!TestGroupLSModel.MediaBrowserCompatCustomActionResultReceiver(str, "SSL_")) {
                return str;
            }
            StringBuilder sb2 = new StringBuilder("TLS_");
            String strSubstring2 = str.substring(4);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strSubstring2, "");
            sb2.append(strSubstring2);
            return sb2.toString();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static getQualityHashCipher RemoteActionCompatParcelizer(String str) {
            getQualityHashCipher getqualityhashcipher = new getQualityHashCipher(str, null);
            getQualityHashCipher.INSTANCES.put(str, getqualityhashcipher);
            return getqualityhashcipher;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public static final class read implements Comparator<String> {
        read() {
        }

        @Override // java.util.Comparator
        public final /* synthetic */ int compare(String str, String str2) {
            return IconCompatParcelizer(str, str2);
        }

        private static int IconCompatParcelizer(String str, String str2) {
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            int iMin = Math.min(str.length(), str2.length());
            for (int i = 4; i < iMin; i++) {
                char cCharAt = str.charAt(i);
                char cCharAt2 = str2.charAt(i);
                if (cCharAt != cCharAt2) {
                    return toMagicModuleMetaRepoModel.read((int) cCharAt, (int) cCharAt2) < 0 ? -1 : 1;
                }
            }
            int length = str.length();
            int length2 = str2.length();
            if (length != length2) {
                return length < length2 ? -1 : 1;
            }
            return 0;
        }
    }

    public /* synthetic */ getQualityHashCipher(String str, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(str);
    }
}
