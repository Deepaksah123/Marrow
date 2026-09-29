package kotlin;

import com.marrow2.ui.payment.model.DeliveryAddressModel;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005"}, d2 = {"Lo/ImagesContract;", "", "<init>", "()V", "IconCompatParcelizer", "Lo/ImagesContract$IconCompatParcelizer;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class ImagesContract {

    public static final class IconCompatParcelizer extends ImagesContract {
        private final Double AudioAttributesCompatParcelizer;
        private final Integer IconCompatParcelizer;
        private final String MediaBrowserCompatCustomActionResultReceiver;
        private final DeliveryAddressModel RemoteActionCompatParcelizer;
        private final String read;
        private final String write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IconCompatParcelizer(String str, String str2, String str3, Integer num, Double d, DeliveryAddressModel deliveryAddressModel) {
            super(null);
            toMagicModuleMetaRepoModel.write(deliveryAddressModel, "");
            this.read = str;
            this.write = str2;
            this.MediaBrowserCompatCustomActionResultReceiver = str3;
            this.IconCompatParcelizer = num;
            this.AudioAttributesCompatParcelizer = d;
            this.RemoteActionCompatParcelizer = deliveryAddressModel;
        }

        public final String read() {
            return this.read;
        }

        public final String IconCompatParcelizer() {
            return this.write;
        }

        public final String AudioAttributesImplApi26Parcelizer() {
            return this.MediaBrowserCompatCustomActionResultReceiver;
        }

        public final Integer RemoteActionCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        public final Double write() {
            return this.AudioAttributesCompatParcelizer;
        }

        public final DeliveryAddressModel AudioAttributesCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }
    }

    private ImagesContract() {
    }

    public /* synthetic */ ImagesContract(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this();
    }
}
