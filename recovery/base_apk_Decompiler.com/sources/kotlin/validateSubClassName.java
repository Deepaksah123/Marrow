package kotlin;

import android.os.Bundle;
import com.google.android.exoplayer2.PlaybackException;

/* JADX INFO: loaded from: classes2.dex */
public class validateSubClassName extends Exception {
    public final int IconCompatParcelizer;
    public final Bundle read;
    public final long write;

    private static String read(int i) {
        if (i == -100) {
            return "ERROR_CODE_DISCONNECTED";
        }
        if (i == -6) {
            return "ERROR_CODE_NOT_SUPPORTED";
        }
        if (i == -4) {
            return "ERROR_CODE_PERMISSION_DENIED";
        }
        if (i == -3) {
            return "ERROR_CODE_BAD_VALUE";
        }
        if (i == -2) {
            return "ERROR_CODE_INVALID_STATE";
        }
        if (i == 7000) {
            return "ERROR_CODE_VIDEO_FRAME_PROCESSOR_INIT_FAILED";
        }
        if (i != 7001) {
            switch (i) {
                case -110:
                    return "ERROR_CODE_CONTENT_ALREADY_PLAYING";
                case -109:
                    return "ERROR_CODE_END_OF_PLAYLIST";
                case -108:
                    return "ERROR_CODE_SETUP_REQUIRED";
                case -107:
                    return "ERROR_CODE_SKIP_LIMIT_REACHED";
                case -106:
                    return "ERROR_CODE_NOT_AVAILABLE_IN_REGION";
                case -105:
                    return "ERROR_CODE_PARENTAL_CONTROL_RESTRICTED";
                case -104:
                    return "ERROR_CODE_CONCURRENT_STREAM_LIMIT";
                case -103:
                    return "ERROR_CODE_PREMIUM_ACCOUNT_REQUIRED";
                case -102:
                    return "ERROR_CODE_AUTHENTICATION_EXPIRED";
                default:
                    switch (i) {
                        case 1000:
                            return "ERROR_CODE_UNSPECIFIED";
                        case 1001:
                            return "ERROR_CODE_REMOTE_ERROR";
                        case 1002:
                            return "ERROR_CODE_BEHIND_LIVE_WINDOW";
                        case 1003:
                            return "ERROR_CODE_TIMEOUT";
                        case 1004:
                            return "ERROR_CODE_FAILED_RUNTIME_CHECK";
                        default:
                            switch (i) {
                                case 2000:
                                    return "ERROR_CODE_IO_UNSPECIFIED";
                                case PlaybackException.ERROR_CODE_IO_NETWORK_CONNECTION_FAILED /* 2001 */:
                                    return "ERROR_CODE_IO_NETWORK_CONNECTION_FAILED";
                                case PlaybackException.ERROR_CODE_IO_NETWORK_CONNECTION_TIMEOUT /* 2002 */:
                                    return "ERROR_CODE_IO_NETWORK_CONNECTION_TIMEOUT";
                                case PlaybackException.ERROR_CODE_IO_INVALID_HTTP_CONTENT_TYPE /* 2003 */:
                                    return "ERROR_CODE_IO_INVALID_HTTP_CONTENT_TYPE";
                                case PlaybackException.ERROR_CODE_IO_BAD_HTTP_STATUS /* 2004 */:
                                    return "ERROR_CODE_IO_BAD_HTTP_STATUS";
                                case PlaybackException.ERROR_CODE_IO_FILE_NOT_FOUND /* 2005 */:
                                    return "ERROR_CODE_IO_FILE_NOT_FOUND";
                                case PlaybackException.ERROR_CODE_IO_NO_PERMISSION /* 2006 */:
                                    return "ERROR_CODE_IO_NO_PERMISSION";
                                case PlaybackException.ERROR_CODE_IO_CLEARTEXT_NOT_PERMITTED /* 2007 */:
                                    return "ERROR_CODE_IO_CLEARTEXT_NOT_PERMITTED";
                                case 2008:
                                    return "ERROR_CODE_IO_READ_POSITION_OUT_OF_RANGE";
                                default:
                                    switch (i) {
                                        case 3001:
                                            return "ERROR_CODE_PARSING_CONTAINER_MALFORMED";
                                        case 3002:
                                            return "ERROR_CODE_PARSING_MANIFEST_MALFORMED";
                                        case 3003:
                                            return "ERROR_CODE_PARSING_CONTAINER_UNSUPPORTED";
                                        case 3004:
                                            return "ERROR_CODE_PARSING_MANIFEST_UNSUPPORTED";
                                        default:
                                            switch (i) {
                                                case PlaybackException.ERROR_CODE_DECODER_INIT_FAILED /* 4001 */:
                                                    return "ERROR_CODE_DECODER_INIT_FAILED";
                                                case PlaybackException.ERROR_CODE_DECODER_QUERY_FAILED /* 4002 */:
                                                    return "ERROR_CODE_DECODER_QUERY_FAILED";
                                                case PlaybackException.ERROR_CODE_DECODING_FAILED /* 4003 */:
                                                    return "ERROR_CODE_DECODING_FAILED";
                                                case PlaybackException.ERROR_CODE_DECODING_FORMAT_EXCEEDS_CAPABILITIES /* 4004 */:
                                                    return "ERROR_CODE_DECODING_FORMAT_EXCEEDS_CAPABILITIES";
                                                case PlaybackException.ERROR_CODE_DECODING_FORMAT_UNSUPPORTED /* 4005 */:
                                                    return "ERROR_CODE_DECODING_FORMAT_UNSUPPORTED";
                                                case 4006:
                                                    return "ERROR_CODE_DECODING_RESOURCES_RECLAIMED";
                                                default:
                                                    switch (i) {
                                                        case PlaybackException.ERROR_CODE_AUDIO_TRACK_INIT_FAILED /* 5001 */:
                                                            return "ERROR_CODE_AUDIO_TRACK_INIT_FAILED";
                                                        case PlaybackException.ERROR_CODE_AUDIO_TRACK_WRITE_FAILED /* 5002 */:
                                                            return "ERROR_CODE_AUDIO_TRACK_WRITE_FAILED";
                                                        case 5003:
                                                            return "ERROR_CODE_AUDIO_TRACK_OFFLOAD_WRITE_FAILED";
                                                        case 5004:
                                                            return "ERROR_CODE_AUDIO_TRACK_OFFLOAD_INIT_FAILED";
                                                        default:
                                                            switch (i) {
                                                                case PlaybackException.ERROR_CODE_DRM_UNSPECIFIED /* 6000 */:
                                                                    return "ERROR_CODE_DRM_UNSPECIFIED";
                                                                case PlaybackException.ERROR_CODE_DRM_SCHEME_UNSUPPORTED /* 6001 */:
                                                                    return "ERROR_CODE_DRM_SCHEME_UNSUPPORTED";
                                                                case PlaybackException.ERROR_CODE_DRM_PROVISIONING_FAILED /* 6002 */:
                                                                    return "ERROR_CODE_DRM_PROVISIONING_FAILED";
                                                                case PlaybackException.ERROR_CODE_DRM_CONTENT_ERROR /* 6003 */:
                                                                    return "ERROR_CODE_DRM_CONTENT_ERROR";
                                                                case PlaybackException.ERROR_CODE_DRM_LICENSE_ACQUISITION_FAILED /* 6004 */:
                                                                    return "ERROR_CODE_DRM_LICENSE_ACQUISITION_FAILED";
                                                                case PlaybackException.ERROR_CODE_DRM_DISALLOWED_OPERATION /* 6005 */:
                                                                    return "ERROR_CODE_DRM_DISALLOWED_OPERATION";
                                                                case PlaybackException.ERROR_CODE_DRM_SYSTEM_ERROR /* 6006 */:
                                                                    return "ERROR_CODE_DRM_SYSTEM_ERROR";
                                                                case PlaybackException.ERROR_CODE_DRM_DEVICE_REVOKED /* 6007 */:
                                                                    return "ERROR_CODE_DRM_DEVICE_REVOKED";
                                                                case PlaybackException.ERROR_CODE_DRM_LICENSE_EXPIRED /* 6008 */:
                                                                    return "ERROR_CODE_DRM_LICENSE_EXPIRED";
                                                                default:
                                                                    if (i >= 1000000) {
                                                                        return "custom error code";
                                                                    }
                                                                    return "invalid error code";
                                                            }
                                                    }
                                            }
                                    }
                            }
                    }
            }
        }
        return "ERROR_CODE_VIDEO_FRAME_PROCESSING_FAILED";
    }

    public final String RemoteActionCompatParcelizer() {
        return read(this.IconCompatParcelizer);
    }

    public validateSubClassName(String str, Throwable th, int i, Bundle bundle, long j) {
        super(str, th);
        this.IconCompatParcelizer = i;
        this.read = bundle;
        this.write = j;
    }

    static {
        LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(0);
        LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(1);
        LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(2);
        LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(3);
        LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(4);
        LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(5);
    }
}
