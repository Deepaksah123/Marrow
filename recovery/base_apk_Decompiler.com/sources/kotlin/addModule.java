package kotlin;

import android.os.Trace;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a5\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00010\u0007H\u0000¢\u0006\u0004\b\u000b\u0010\f\"\u0018\u0010\u0002\u001a\u00020\u0001*\u00020\u00008AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0003\"\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lo/valueInstantiatorInstance;", "", "RemoteActionCompatParcelizer", "(Lo/valueInstantiatorInstance;)Z", "Lo/typeIdResolverInstance;", "", "p0", "Lkotlin/Function1;", "p1", "Lo/setExpandedActionViewsExclusive;", "Lo/JsonNodeFeature;", "write", "(Lo/typeIdResolverInstance;ILo/getAnswerMap;)Lo/setExpandedActionViewsExclusive;", "Lo/WritableTypeIdInclusion;", "IconCompatParcelizer", "Lo/WritableTypeIdInclusion;", "read"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class addModule {
    private static final WritableTypeIdInclusion IconCompatParcelizer = new WritableTypeIdInclusion(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 10.0f, 10.0f);

    public static final boolean RemoteActionCompatParcelizer(valueInstantiatorInstance valueinstantiatorinstance) {
        if (write(valueinstantiatorinstance)) {
            return false;
        }
        return valueinstantiatorinstance.getWrite().getRead() || valueinstantiatorinstance.getWrite().IconCompatParcelizer();
    }

    public static final boolean write(valueInstantiatorInstance valueinstantiatorinstance) {
        return valueinstantiatorinstance.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() || valueinstantiatorinstance.getWrite().read(_this.INSTANCE.MediaBrowserCompatSearchResultReceiver()) || valueinstantiatorinstance.getWrite().read(_this.INSTANCE.onAddQueueItem());
    }

    private static final void AudioAttributesCompatParcelizer(compileString compilestring, valueInstantiatorInstance valueinstantiatorinstance, int i, setProvider<JsonNodeFeature> setprovider, getAnswerMap<? super valueInstantiatorInstance, Boolean> getanswermap, valueInstantiatorInstance valueinstantiatorinstance2, compileString compilestring2) {
        WritableTypeIdInclusion writableTypeIdInclusionIconCompatParcelizer;
        isEnumImplType isenumimpltypeMediaBrowserCompatCustomActionResultReceiver;
        boolean z = (valueinstantiatorinstance2.getIconCompatParcelizer().MediaDescriptionCompat() && valueinstantiatorinstance2.getIconCompatParcelizer().AudioAttributesImplApi26Parcelizer()) ? false : true;
        if (!compilestring.IconCompatParcelizer() || valueinstantiatorinstance2.getAudioAttributesImplApi21Parcelizer() == valueinstantiatorinstance.getAudioAttributesImplApi21Parcelizer()) {
            if (!z || valueinstantiatorinstance2.getRead()) {
                appendReferring appendreferringAudioAttributesCompatParcelizer = ReadableObjectId.AudioAttributesCompatParcelizer(valueinstantiatorinstance2.RatingCompat());
                compilestring2.read(appendreferringAudioAttributesCompatParcelizer);
                int audioAttributesImplApi21Parcelizer = valueinstantiatorinstance2.getAudioAttributesImplApi21Parcelizer() == valueinstantiatorinstance.getAudioAttributesImplApi21Parcelizer() ? i : valueinstantiatorinstance2.getAudioAttributesImplApi21Parcelizer();
                if (compilestring2.write(compilestring)) {
                    setprovider.write(audioAttributesImplApi21Parcelizer, new JsonNodeFeature(valueinstantiatorinstance2, compilestring2.AudioAttributesCompatParcelizer()));
                    List<valueInstantiatorInstance> listMediaBrowserCompatSearchResultReceiver = valueinstantiatorinstance2.MediaBrowserCompatSearchResultReceiver();
                    for (int size = listMediaBrowserCompatSearchResultReceiver.size() - 1; size >= 0; size--) {
                        if (!getanswermap.invoke(listMediaBrowserCompatSearchResultReceiver.get(size)).booleanValue()) {
                            AudioAttributesCompatParcelizer(compilestring, valueinstantiatorinstance, i, setprovider, getanswermap, listMediaBrowserCompatSearchResultReceiver.get(size), compilestring2);
                        }
                    }
                    if (RemoteActionCompatParcelizer(valueinstantiatorinstance2)) {
                        compilestring.write(appendreferringAudioAttributesCompatParcelizer);
                        return;
                    }
                    return;
                }
                if (!valueinstantiatorinstance2.getRead()) {
                    if (audioAttributesImplApi21Parcelizer == i) {
                        setprovider.write(audioAttributesImplApi21Parcelizer, new JsonNodeFeature(valueinstantiatorinstance2, compilestring2.AudioAttributesCompatParcelizer()));
                        return;
                    }
                    return;
                }
                valueInstantiatorInstance valueinstantiatorinstanceMediaBrowserCompatMediaItem = valueinstantiatorinstance2.MediaBrowserCompatMediaItem();
                if (valueinstantiatorinstanceMediaBrowserCompatMediaItem != null && (isenumimpltypeMediaBrowserCompatCustomActionResultReceiver = valueinstantiatorinstanceMediaBrowserCompatMediaItem.MediaBrowserCompatCustomActionResultReceiver()) != null && isenumimpltypeMediaBrowserCompatCustomActionResultReceiver.MediaDescriptionCompat()) {
                    writableTypeIdInclusionIconCompatParcelizer = valueinstantiatorinstanceMediaBrowserCompatMediaItem.IconCompatParcelizer();
                } else {
                    writableTypeIdInclusionIconCompatParcelizer = IconCompatParcelizer;
                }
                setprovider.write(audioAttributesImplApi21Parcelizer, new JsonNodeFeature(valueinstantiatorinstance2, ReadableObjectId.AudioAttributesCompatParcelizer(writableTypeIdInclusionIconCompatParcelizer)));
            }
        }
    }

    public static final setExpandedActionViewsExclusive<JsonNodeFeature> write(typeIdResolverInstance typeidresolverinstance, int i, getAnswerMap<? super valueInstantiatorInstance, Boolean> getanswermap) {
        Trace.beginSection("getAllUncoveredSemanticsNodesToIntObjectMap");
        try {
            valueInstantiatorInstance valueinstantiatorinstance = typeidresolverinstance.read();
            if (valueinstantiatorinstance.getIconCompatParcelizer().MediaDescriptionCompat() && valueinstantiatorinstance.getIconCompatParcelizer().AudioAttributesImplApi26Parcelizer()) {
                setProvider setprovider = new setProvider(48);
                compileString compilestringIconCompatParcelizer = getDefaultTyper.IconCompatParcelizer();
                compilestringIconCompatParcelizer.read(ReadableObjectId.AudioAttributesCompatParcelizer(valueinstantiatorinstance.IconCompatParcelizer()));
                AudioAttributesCompatParcelizer(compilestringIconCompatParcelizer, valueinstantiatorinstance, i, setprovider, getanswermap, valueinstantiatorinstance, getDefaultTyper.IconCompatParcelizer());
                return setprovider;
            }
            return ActionMenuView.IconCompatParcelizer();
        } finally {
            Trace.endSection();
        }
    }
}
