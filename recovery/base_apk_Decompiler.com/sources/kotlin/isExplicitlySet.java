package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\u001a5\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u0019\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00000\n*\u00020\u0000H\u0002¢\u0006\u0004\b\u000b\u0010\f\"6\u0010\u0013\u001a \b\u0001\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\r*\u00020\u00008AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\"\u0018\u0010\b\u001a\u00020\u0014*\u00020\u00008CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0015"}, d2 = {"Lo/valueInstantiatorInstance;", "p0", "", "p1", "Lkotlin/Function1;", "Lo/DatatypeFeatures;", "", "p2", "read", "(Lo/valueInstantiatorInstance;ILo/getAnswerMap;)V", "", "AudioAttributesCompatParcelizer", "(Lo/valueInstantiatorInstance;)Ljava/util/List;", "Lkotlin/Function2;", "Lo/getReferencedType;", "Lo/SampleVideos;", "", "RemoteActionCompatParcelizer", "(Lo/valueInstantiatorInstance;)Lo/MagicModuleSubmissionRequestBody;", "IconCompatParcelizer", "", "(Lo/valueInstantiatorInstance;)Z"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class isExplicitlySet {
    static /* synthetic */ void read$default(valueInstantiatorInstance valueinstantiatorinstance, int i, getAnswerMap getanswermap, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        read(valueinstantiatorinstance, i, getanswermap);
    }

    public static final MagicModuleSubmissionRequestBody<getReferencedType, SampleVideos<? super getReferencedType>, Object> RemoteActionCompatParcelizer(valueInstantiatorInstance valueinstantiatorinstance) {
        return (MagicModuleSubmissionRequestBody) withDeserializerModifier.read(valueinstantiatorinstance.getWrite(), withAbstractTypeResolver.INSTANCE.onPlay());
    }

    private static final boolean read(valueInstantiatorInstance valueinstantiatorinstance) {
        MagicModuleSubmissionRequestBody<getReferencedType, SampleVideos<? super getReferencedType>, Object> magicModuleSubmissionRequestBodyRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(valueinstantiatorinstance);
        withAdditionalKeyDeserializers withadditionalkeydeserializers = (withAdditionalKeyDeserializers) withDeserializerModifier.read(valueinstantiatorinstance.getWrite(), _this.INSTANCE.onSkipToPrevious());
        return (magicModuleSubmissionRequestBodyRemoteActionCompatParcelizer == null || withadditionalkeydeserializers == null || withadditionalkeydeserializers.IconCompatParcelizer().invoke().floatValue() <= BitmapDescriptorFactory.HUE_RED) ? false : true;
    }

    private static final List<valueInstantiatorInstance> AudioAttributesCompatParcelizer(valueInstantiatorInstance valueinstantiatorinstance) {
        return valueinstantiatorinstance.RemoteActionCompatParcelizer(false, false, false);
    }

    private static final void read(valueInstantiatorInstance valueinstantiatorinstance, int i, getAnswerMap<? super DatatypeFeatures, getShowPopup> getanswermap) {
        valueInstantiatorInstance valueinstantiatorinstance2;
        UTF32Reader uTF32Reader = new UTF32Reader(new valueInstantiatorInstance[16], 0);
        List<valueInstantiatorInstance> listAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(valueinstantiatorinstance);
        while (true) {
            uTF32Reader.write(uTF32Reader.getAudioAttributesCompatParcelizer(), listAudioAttributesCompatParcelizer);
            while (uTF32Reader.getAudioAttributesCompatParcelizer() != 0) {
                valueinstantiatorinstance2 = (valueInstantiatorInstance) uTF32Reader.RemoteActionCompatParcelizer(uTF32Reader.getAudioAttributesCompatParcelizer() - 1);
                if (!addModule.write(valueinstantiatorinstance2) && !valueinstantiatorinstance2.getWrite().read(_this.INSTANCE.MediaBrowserCompatItemReceiver())) {
                    _bindAndClose _bindandcloseAudioAttributesCompatParcelizer = valueinstantiatorinstance2.AudioAttributesCompatParcelizer();
                    if (_bindandcloseAudioAttributesCompatParcelizer != null) {
                        isAbstract isabstractOnFastForward = _bindandcloseAudioAttributesCompatParcelizer.onFastForward();
                        appendReferring appendreferringAudioAttributesCompatParcelizer = ReadableObjectId.AudioAttributesCompatParcelizer(hasRawClass.AudioAttributesCompatParcelizer$default(isabstractOnFastForward, false, 1, null));
                        if (appendreferringAudioAttributesCompatParcelizer.RatingCompat()) {
                            continue;
                        } else {
                            if (!read(valueinstantiatorinstance2)) {
                                break;
                            }
                            int i2 = 1 + i;
                            getanswermap.invoke(new DatatypeFeatures(valueinstantiatorinstance2, i2, appendreferringAudioAttributesCompatParcelizer, isabstractOnFastForward));
                            read(valueinstantiatorinstance2, i2, getanswermap);
                        }
                    } else {
                        reportWrongTokenException.write("Expected semantics node to have a coordinator.");
                        throw new PlanDetailsCreator();
                    }
                }
            }
            return;
            listAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(valueinstantiatorinstance2);
        }
    }
}
