package kotlin;

import com.marrow.data.api.models.response.payment.PayloadKt;
import com.marrow.data.models.user.NotesDispatchAddressRequestKt;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lo/readShort;", "", "<init>", "()V", "AudioAttributesCompatParcelizer", "IconCompatParcelizer", "Lo/readShort$AudioAttributesCompatParcelizer;", "Lo/readShort$IconCompatParcelizer;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class readShort {

    public static final class AudioAttributesCompatParcelizer extends readShort {
        private final String AudioAttributesCompatParcelizer;
        private final String AudioAttributesImplApi21Parcelizer;
        private final String AudioAttributesImplApi26Parcelizer;
        private final String AudioAttributesImplBaseParcelizer;
        private final String IconCompatParcelizer;
        private final String MediaBrowserCompatCustomActionResultReceiver;
        private final String MediaBrowserCompatItemReceiver;
        private final String MediaBrowserCompatMediaItem;
        private final String MediaBrowserCompatSearchResultReceiver;
        private final String MediaDescriptionCompat;
        private final String MediaMetadataCompat;
        private final String RatingCompat;
        private final String RemoteActionCompatParcelizer;
        private final String read;
        private final String write;

        public AudioAttributesCompatParcelizer(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
            super(null);
            this.IconCompatParcelizer = str;
            this.write = str2;
            this.read = str3;
            this.RatingCompat = str4;
            this.MediaDescriptionCompat = str5;
            this.AudioAttributesCompatParcelizer = str6;
            this.RemoteActionCompatParcelizer = str7;
            this.AudioAttributesImplBaseParcelizer = str8;
            this.MediaBrowserCompatCustomActionResultReceiver = str9;
            this.AudioAttributesImplApi26Parcelizer = str10;
            this.AudioAttributesImplApi21Parcelizer = str11;
            this.MediaBrowserCompatMediaItem = str12;
            this.MediaBrowserCompatItemReceiver = str13;
            this.MediaMetadataCompat = str14;
            this.MediaBrowserCompatSearchResultReceiver = str15;
        }

        public final String read() {
            return this.IconCompatParcelizer;
        }

        public final String RemoteActionCompatParcelizer() {
            return this.write;
        }

        public final String write() {
            return this.read;
        }

        public final String MediaBrowserCompatSearchResultReceiver() {
            return this.RatingCompat;
        }

        public final String MediaDescriptionCompat() {
            return this.MediaDescriptionCompat;
        }

        public final String AudioAttributesCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        public final String IconCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        public final String MediaBrowserCompatItemReceiver() {
            return this.AudioAttributesImplBaseParcelizer;
        }

        public final String AudioAttributesImplBaseParcelizer() {
            return this.MediaBrowserCompatCustomActionResultReceiver;
        }

        public final String AudioAttributesImplApi26Parcelizer() {
            return this.AudioAttributesImplApi26Parcelizer;
        }

        public final String MediaBrowserCompatCustomActionResultReceiver() {
            return this.AudioAttributesImplApi21Parcelizer;
        }

        public final String MediaBrowserCompatMediaItem() {
            return this.MediaBrowserCompatMediaItem;
        }

        public final String AudioAttributesImplApi21Parcelizer() {
            return this.MediaBrowserCompatItemReceiver;
        }

        public final String RatingCompat() {
            return this.MediaMetadataCompat;
        }

        public final String MediaMetadataCompat() {
            return this.MediaBrowserCompatSearchResultReceiver;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AudioAttributesCompatParcelizer)) {
                return false;
            }
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = (AudioAttributesCompatParcelizer) obj;
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) audioAttributesCompatParcelizer.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) audioAttributesCompatParcelizer.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) audioAttributesCompatParcelizer.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RatingCompat, (Object) audioAttributesCompatParcelizer.RatingCompat) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaDescriptionCompat, (Object) audioAttributesCompatParcelizer.MediaDescriptionCompat) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) audioAttributesCompatParcelizer.RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesImplBaseParcelizer, (Object) audioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaBrowserCompatCustomActionResultReceiver, (Object) audioAttributesCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesImplApi26Parcelizer, (Object) audioAttributesCompatParcelizer.AudioAttributesImplApi26Parcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesImplApi21Parcelizer, (Object) audioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaBrowserCompatMediaItem, (Object) audioAttributesCompatParcelizer.MediaBrowserCompatMediaItem) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaBrowserCompatItemReceiver, (Object) audioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaMetadataCompat, (Object) audioAttributesCompatParcelizer.MediaMetadataCompat) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaBrowserCompatSearchResultReceiver, (Object) audioAttributesCompatParcelizer.MediaBrowserCompatSearchResultReceiver);
        }

        public final int hashCode() {
            String str = this.IconCompatParcelizer;
            int iHashCode = str == null ? 0 : str.hashCode();
            String str2 = this.write;
            int iHashCode2 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.read;
            int iHashCode3 = str3 == null ? 0 : str3.hashCode();
            String str4 = this.RatingCompat;
            int iHashCode4 = str4 == null ? 0 : str4.hashCode();
            String str5 = this.MediaDescriptionCompat;
            int iHashCode5 = str5 == null ? 0 : str5.hashCode();
            String str6 = this.AudioAttributesCompatParcelizer;
            int iHashCode6 = str6 == null ? 0 : str6.hashCode();
            String str7 = this.RemoteActionCompatParcelizer;
            int iHashCode7 = str7 == null ? 0 : str7.hashCode();
            String str8 = this.AudioAttributesImplBaseParcelizer;
            int iHashCode8 = str8 == null ? 0 : str8.hashCode();
            String str9 = this.MediaBrowserCompatCustomActionResultReceiver;
            int iHashCode9 = str9 == null ? 0 : str9.hashCode();
            String str10 = this.AudioAttributesImplApi26Parcelizer;
            int iHashCode10 = str10 == null ? 0 : str10.hashCode();
            String str11 = this.AudioAttributesImplApi21Parcelizer;
            int iHashCode11 = str11 == null ? 0 : str11.hashCode();
            String str12 = this.MediaBrowserCompatMediaItem;
            int iHashCode12 = str12 == null ? 0 : str12.hashCode();
            String str13 = this.MediaBrowserCompatItemReceiver;
            int iHashCode13 = str13 == null ? 0 : str13.hashCode();
            String str14 = this.MediaMetadataCompat;
            int iHashCode14 = str14 == null ? 0 : str14.hashCode();
            String str15 = this.MediaBrowserCompatSearchResultReceiver;
            return (((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + (str15 != null ? str15.hashCode() : 0);
        }

        public final String toString() {
            String str = this.IconCompatParcelizer;
            String str2 = this.write;
            String str3 = this.read;
            String str4 = this.RatingCompat;
            String str5 = this.MediaDescriptionCompat;
            String str6 = this.AudioAttributesCompatParcelizer;
            String str7 = this.RemoteActionCompatParcelizer;
            String str8 = this.AudioAttributesImplBaseParcelizer;
            String str9 = this.MediaBrowserCompatCustomActionResultReceiver;
            String str10 = this.AudioAttributesImplApi26Parcelizer;
            String str11 = this.AudioAttributesImplApi21Parcelizer;
            String str12 = this.MediaBrowserCompatMediaItem;
            String str13 = this.MediaBrowserCompatItemReceiver;
            String str14 = this.MediaMetadataCompat;
            String str15 = this.MediaBrowserCompatSearchResultReceiver;
            StringBuilder sb = new StringBuilder("JusPaySdkPayloadParams(action=");
            sb.append(str);
            sb.append(", amount=");
            sb.append(str2);
            sb.append(", clientId=");
            sb.append(str3);
            sb.append(", merchantId=");
            sb.append(str4);
            sb.append(", environment=");
            sb.append(str5);
            sb.append(", clientAuthToken=");
            sb.append(str6);
            sb.append(", clientAuthTokenExpiry=");
            sb.append(str7);
            sb.append(", customerId=");
            sb.append(str8);
            sb.append(", currency=");
            sb.append(str9);
            sb.append(", customerPhone=");
            sb.append(str10);
            sb.append(", customerEmail=");
            sb.append(str11);
            sb.append(", orderId=");
            sb.append(str12);
            sb.append(", description=");
            sb.append(str13);
            sb.append(", requestId=");
            sb.append(str14);
            sb.append(", service=");
            sb.append(str15);
            sb.append(")");
            return sb.toString();
        }
    }

    private readShort() {
    }

    public /* synthetic */ readShort(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this();
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b=\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001BÇ\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0005HÆ\u0003J\t\u00100\u001a\u00020\u0005HÆ\u0003J\t\u00101\u001a\u00020\u0005HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\"J\t\u00106\u001a\u00020\u0005HÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0005HÆ\u0003JÚ\u0001\u0010@\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010AJ\u0013\u0010B\u001a\u00020C2\b\u0010D\u001a\u0004\u0018\u00010EHÖ\u0003J\t\u0010F\u001a\u00020\u0003HÖ\u0001J\t\u0010G\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001bR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001bR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001bR\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010#\u001a\u0004\b!\u0010\"R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001bR\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0019R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001bR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001bR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001bR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001bR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001bR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001bR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001bR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001b¨\u0006H"}, d2 = {"Lcom/marrow2/domain/payment/model/SdkPayloadParams$RazorpaySdkPayloadParams;", "Lcom/marrow2/domain/payment/model/SdkPayloadParams;", "amount", "", PayloadKt.KEY_JP_CURRENCY, "", "orderId", "email", NotesDispatchAddressRequestKt.KEY_CONTACT, "planId", "planTitle", "planDuration", "userId", "courseId", "name", "alternateContact", "addressLine1", "addressLine2", "addressLine3", NotesDispatchAddressRequestKt.KEY_CITY, NotesDispatchAddressRequestKt.KEY_STATE, "pinCode", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAmount", "()I", "getCurrency", "()Ljava/lang/String;", "getOrderId", "getEmail", "getContact", "getPlanId", "getPlanTitle", "getPlanDuration", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getUserId", "getCourseId", "getName", "getAlternateContact", "getAddressLine1", "getAddressLine2", "getAddressLine3", "getCity", "getState", "getPinCode", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/marrow2/domain/payment/model/SdkPayloadParams$RazorpaySdkPayloadParams;", "equals", "", "other", "", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class IconCompatParcelizer extends readShort {
        private final String AudioAttributesCompatParcelizer;
        private final String AudioAttributesImplApi21Parcelizer;
        private final String AudioAttributesImplApi26Parcelizer;
        private final String AudioAttributesImplBaseParcelizer;
        private final int IconCompatParcelizer;
        private final int MediaBrowserCompatCustomActionResultReceiver;
        private final String MediaBrowserCompatItemReceiver;
        private final String MediaBrowserCompatMediaItem;
        private final String MediaBrowserCompatSearchResultReceiver;
        private final String MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        private final String MediaDescriptionCompat;
        private final Integer MediaMetadataCompat;
        private final String RatingCompat;
        private final String RemoteActionCompatParcelizer;
        private final String handleMediaPlayPauseIfPendingOnHandler;
        private final String onCommand;
        private final String read;
        private final String write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private IconCompatParcelizer(int i, String str, String str2, String str3, String str4, String str5, String str6, Integer num, String str7, int i2, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            toMagicModuleMetaRepoModel.write(str3, "");
            toMagicModuleMetaRepoModel.write(str7, "");
            this.IconCompatParcelizer = i;
            this.AudioAttributesImplBaseParcelizer = str;
            this.MediaBrowserCompatSearchResultReceiver = str2;
            this.AudioAttributesImplApi21Parcelizer = str3;
            this.MediaBrowserCompatItemReceiver = str4;
            this.MediaBrowserCompatMediaItem = str5;
            this.handleMediaPlayPauseIfPendingOnHandler = str6;
            this.MediaMetadataCompat = num;
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = str7;
            this.MediaBrowserCompatCustomActionResultReceiver = i2;
            this.RatingCompat = str8;
            this.RemoteActionCompatParcelizer = str9;
            this.AudioAttributesCompatParcelizer = str10;
            this.read = str11;
            this.write = str12;
            this.AudioAttributesImplApi26Parcelizer = str13;
            this.onCommand = str14;
            this.MediaDescriptionCompat = str15;
        }

        public /* synthetic */ IconCompatParcelizer(int i, String str, String str2, String str3, String str4, String str5, String str6, Integer num, String str7, int i2, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, int i3, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this(i, str, str2, str3, (i3 & 16) != 0 ? null : str4, (i3 & 32) != 0 ? null : str5, (i3 & 64) != 0 ? null : str6, (i3 & 128) != 0 ? null : num, str7, i2, (i3 & 1024) != 0 ? null : str8, (i3 & 2048) != 0 ? null : str9, (i3 & 4096) != 0 ? null : str10, (i3 & 8192) != 0 ? null : str11, (i3 & 16384) != 0 ? null : str12, (32768 & i3) != 0 ? null : str13, (65536 & i3) != 0 ? null : str14, (i3 & 131072) != 0 ? null : str15);
        }

        /* JADX INFO: renamed from: read, reason: from getter */
        public final int getIconCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from getter */
        public final String getAudioAttributesImplBaseParcelizer() {
            return this.AudioAttributesImplBaseParcelizer;
        }

        /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from getter */
        public final String getMediaBrowserCompatSearchResultReceiver() {
            return this.MediaBrowserCompatSearchResultReceiver;
        }

        /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from getter */
        public final String getAudioAttributesImplApi21Parcelizer() {
            return this.AudioAttributesImplApi21Parcelizer;
        }

        /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from getter */
        public final String getMediaBrowserCompatItemReceiver() {
            return this.MediaBrowserCompatItemReceiver;
        }

        /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from getter */
        public final String getMediaBrowserCompatMediaItem() {
            return this.MediaBrowserCompatMediaItem;
        }

        /* JADX INFO: renamed from: MediaMetadataCompat, reason: from getter */
        public final String getHandleMediaPlayPauseIfPendingOnHandler() {
            return this.handleMediaPlayPauseIfPendingOnHandler;
        }

        /* JADX INFO: renamed from: onAddQueueItem, reason: from getter */
        public final String getMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
            return this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        }

        /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from getter */
        public final String getRatingCompat() {
            return this.RatingCompat;
        }

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
        public final String getRemoteActionCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        /* JADX INFO: renamed from: write, reason: from getter */
        public final String getAudioAttributesCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
        public final String getRead() {
            return this.read;
        }

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
        public final String getWrite() {
            return this.write;
        }

        /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from getter */
        public final String getAudioAttributesImplApi26Parcelizer() {
            return this.AudioAttributesImplApi26Parcelizer;
        }

        /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from getter */
        public final String getOnCommand() {
            return this.onCommand;
        }

        /* JADX INFO: renamed from: RatingCompat, reason: from getter */
        public final String getMediaDescriptionCompat() {
            return this.MediaDescriptionCompat;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static IconCompatParcelizer IconCompatParcelizer(int i, String str, String str2, String str3, String str4, String str5, String str6, Integer num, String str7, int i2, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            toMagicModuleMetaRepoModel.write(str3, "");
            toMagicModuleMetaRepoModel.write(str7, "");
            return new IconCompatParcelizer(i, str, str2, str3, str4, str5, str6, num, str7, i2, str8, str9, str10, str11, str12, str13, str14, str15);
        }

        public final boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof IconCompatParcelizer)) {
                return false;
            }
            IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) other;
            return this.IconCompatParcelizer == iconCompatParcelizer.IconCompatParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesImplBaseParcelizer, (Object) iconCompatParcelizer.AudioAttributesImplBaseParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaBrowserCompatSearchResultReceiver, (Object) iconCompatParcelizer.MediaBrowserCompatSearchResultReceiver) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesImplApi21Parcelizer, (Object) iconCompatParcelizer.AudioAttributesImplApi21Parcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaBrowserCompatItemReceiver, (Object) iconCompatParcelizer.MediaBrowserCompatItemReceiver) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaBrowserCompatMediaItem, (Object) iconCompatParcelizer.MediaBrowserCompatMediaItem) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.handleMediaPlayPauseIfPendingOnHandler, (Object) iconCompatParcelizer.handleMediaPlayPauseIfPendingOnHandler) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.MediaMetadataCompat, iconCompatParcelizer.MediaMetadataCompat) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, (Object) iconCompatParcelizer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) && this.MediaBrowserCompatCustomActionResultReceiver == iconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RatingCompat, (Object) iconCompatParcelizer.RatingCompat) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) iconCompatParcelizer.RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) iconCompatParcelizer.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) iconCompatParcelizer.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) iconCompatParcelizer.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesImplApi26Parcelizer, (Object) iconCompatParcelizer.AudioAttributesImplApi26Parcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.onCommand, (Object) iconCompatParcelizer.onCommand) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaDescriptionCompat, (Object) iconCompatParcelizer.MediaDescriptionCompat);
        }

        public final int hashCode() {
            int iHashCode = Integer.hashCode(this.IconCompatParcelizer);
            int iHashCode2 = this.AudioAttributesImplBaseParcelizer.hashCode();
            int iHashCode3 = this.MediaBrowserCompatSearchResultReceiver.hashCode();
            int iHashCode4 = this.AudioAttributesImplApi21Parcelizer.hashCode();
            String str = this.MediaBrowserCompatItemReceiver;
            int iHashCode5 = str == null ? 0 : str.hashCode();
            String str2 = this.MediaBrowserCompatMediaItem;
            int iHashCode6 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.handleMediaPlayPauseIfPendingOnHandler;
            int iHashCode7 = str3 == null ? 0 : str3.hashCode();
            Integer num = this.MediaMetadataCompat;
            int iHashCode8 = num == null ? 0 : num.hashCode();
            int iHashCode9 = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.hashCode();
            int iHashCode10 = Integer.hashCode(this.MediaBrowserCompatCustomActionResultReceiver);
            String str4 = this.RatingCompat;
            int iHashCode11 = str4 == null ? 0 : str4.hashCode();
            String str5 = this.RemoteActionCompatParcelizer;
            int iHashCode12 = str5 == null ? 0 : str5.hashCode();
            String str6 = this.AudioAttributesCompatParcelizer;
            int iHashCode13 = str6 == null ? 0 : str6.hashCode();
            String str7 = this.read;
            int iHashCode14 = str7 == null ? 0 : str7.hashCode();
            String str8 = this.write;
            int iHashCode15 = str8 == null ? 0 : str8.hashCode();
            String str9 = this.AudioAttributesImplApi26Parcelizer;
            int iHashCode16 = str9 == null ? 0 : str9.hashCode();
            String str10 = this.onCommand;
            int iHashCode17 = str10 == null ? 0 : str10.hashCode();
            String str11 = this.MediaDescriptionCompat;
            return (((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + (str11 != null ? str11.hashCode() : 0);
        }

        public final String toString() {
            int i = this.IconCompatParcelizer;
            String str = this.AudioAttributesImplBaseParcelizer;
            String str2 = this.MediaBrowserCompatSearchResultReceiver;
            String str3 = this.AudioAttributesImplApi21Parcelizer;
            String str4 = this.MediaBrowserCompatItemReceiver;
            String str5 = this.MediaBrowserCompatMediaItem;
            String str6 = this.handleMediaPlayPauseIfPendingOnHandler;
            Integer num = this.MediaMetadataCompat;
            String str7 = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
            int i2 = this.MediaBrowserCompatCustomActionResultReceiver;
            String str8 = this.RatingCompat;
            String str9 = this.RemoteActionCompatParcelizer;
            String str10 = this.AudioAttributesCompatParcelizer;
            String str11 = this.read;
            String str12 = this.write;
            String str13 = this.AudioAttributesImplApi26Parcelizer;
            String str14 = this.onCommand;
            String str15 = this.MediaDescriptionCompat;
            StringBuilder sb = new StringBuilder("RazorpaySdkPayloadParams(amount=");
            sb.append(i);
            sb.append(", currency=");
            sb.append(str);
            sb.append(", orderId=");
            sb.append(str2);
            sb.append(", email=");
            sb.append(str3);
            sb.append(", contact=");
            sb.append(str4);
            sb.append(", planId=");
            sb.append(str5);
            sb.append(", planTitle=");
            sb.append(str6);
            sb.append(", planDuration=");
            sb.append(num);
            sb.append(", userId=");
            sb.append(str7);
            sb.append(", courseId=");
            sb.append(i2);
            sb.append(", name=");
            sb.append(str8);
            sb.append(", alternateContact=");
            sb.append(str9);
            sb.append(", addressLine1=");
            sb.append(str10);
            sb.append(", addressLine2=");
            sb.append(str11);
            sb.append(", addressLine3=");
            sb.append(str12);
            sb.append(", city=");
            sb.append(str13);
            sb.append(", state=");
            sb.append(str14);
            sb.append(", pinCode=");
            sb.append(str15);
            sb.append(")");
            return sb.toString();
        }
    }
}
