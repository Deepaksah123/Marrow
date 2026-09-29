package kotlin;

import android.graphics.Rect;
import androidx.core.view.WindowInsetsCompat;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a3\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0004\u0010\f\"\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\"\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Lo/JsonNode;", "Lo/isNull;", "p0", "", "AudioAttributesCompatParcelizer", "(Lo/JsonNode;Lo/isNull;)V", "Lo/wrapWithPath;", "Lo/intValue;", "p1", "", "p2", "p3", "(Lo/JsonNode;Lo/wrapWithPath;JII)V", "Lo/setExpandedActionViewsExclusive;", "Lo/isObject;", "IconCompatParcelizer", "Lo/setExpandedActionViewsExclusive;", "read", "", "RemoteActionCompatParcelizer", "[Lo/isObject;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class serialize {
    private static final setExpandedActionViewsExclusive<isObject> IconCompatParcelizer;
    private static final isObject[] RemoteActionCompatParcelizer;

    public static final void AudioAttributesCompatParcelizer(JsonNode jsonNode, isNull isnull) {
        long jWrite = jsonNode.write().write();
        AppCompatButton<Object, JsonNodeOverwriteMode> appCompatButtonRemoteActionCompatParcelizer = isnull.read().RemoteActionCompatParcelizer();
        int i = (int) (jWrite >> 32);
        int i2 = (int) jWrite;
        for (isObject isobject : RemoteActionCompatParcelizer) {
            JsonNodeOverwriteMode jsonNodeOverwriteModeAudioAttributesImplApi26Parcelizer = appCompatButtonRemoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer(isobject);
            toMagicModuleMetaRepoModel.write(jsonNodeOverwriteModeAudioAttributesImplApi26Parcelizer);
            JsonNodeOverwriteMode jsonNodeOverwriteMode = jsonNodeOverwriteModeAudioAttributesImplApi26Parcelizer;
            AudioAttributesCompatParcelizer(jsonNode, isobject.getRemoteActionCompatParcelizer(), jsonNodeOverwriteMode.getAudioAttributesImplBaseParcelizer(), i, i2);
            if (jsonNodeOverwriteMode.AudioAttributesImplApi21Parcelizer()) {
                AudioAttributesCompatParcelizer(jsonNode, jsonNodeOverwriteMode.getMediaBrowserCompatCustomActionResultReceiver(), jsonNodeOverwriteMode.getAudioAttributesImplApi26Parcelizer(), i, i2);
                AudioAttributesCompatParcelizer(jsonNode, jsonNodeOverwriteMode.getMediaBrowserCompatItemReceiver(), jsonNodeOverwriteMode.getRatingCompat(), i, i2);
            }
            AudioAttributesCompatParcelizer(jsonNode, isobject.getWrite(), jsonNodeOverwriteMode.getAudioAttributesImplApi21Parcelizer(), i, i2);
        }
        setDropDownBackgroundResource<InputAccessor<Rect>> setdropdownbackgroundresourceWrite = isnull.write();
        if (setdropdownbackgroundresourceWrite.AudioAttributesImplBaseParcelizer()) {
            List<wrapWithPath> listAudioAttributesCompatParcelizer = isnull.AudioAttributesCompatParcelizer();
            setDropDownBackgroundResource<InputAccessor<Rect>> setdropdownbackgroundresource = setdropdownbackgroundresourceWrite;
            Object[] objArr = setdropdownbackgroundresource.IconCompatParcelizer;
            int i3 = setdropdownbackgroundresource.RemoteActionCompatParcelizer;
            for (int i4 = 0; i4 < i3; i4++) {
                InputAccessor inputAccessor = (InputAccessor) objArr[i4];
                wrapWithPath wrapwithpath = listAudioAttributesCompatParcelizer.get(i4);
                Rect rect = (Rect) inputAccessor.getRemoteActionCompatParcelizer();
                jsonNode.RemoteActionCompatParcelizer(wrapwithpath.getWrite(), rect.left);
                jsonNode.RemoteActionCompatParcelizer(wrapwithpath.getAudioAttributesCompatParcelizer(), rect.top);
                jsonNode.RemoteActionCompatParcelizer(wrapwithpath.getIconCompatParcelizer(), rect.right);
                jsonNode.RemoteActionCompatParcelizer(wrapwithpath.getRead(), rect.bottom);
            }
        }
    }

    private static final void AudioAttributesCompatParcelizer(JsonNode jsonNode, wrapWithPath wrapwithpath, long j, int i, int i2) {
        if (intValue.write(j, isContainerNode.read())) {
            return;
        }
        jsonNode.RemoteActionCompatParcelizer(wrapwithpath.getWrite(), (int) ((j >>> 48) & 65535));
        jsonNode.RemoteActionCompatParcelizer(wrapwithpath.getAudioAttributesCompatParcelizer(), (int) ((j >>> 32) & 65535));
        jsonNode.RemoteActionCompatParcelizer(wrapwithpath.getIconCompatParcelizer(), i - ((int) ((j >>> 16) & 65535)));
        jsonNode.RemoteActionCompatParcelizer(wrapwithpath.getRead(), i2 - ((int) (j & 65535)));
    }

    static {
        setProvider setprovider = new setProvider(8);
        setprovider.write(WindowInsetsCompat.MediaBrowserCompatItemReceiver.MediaBrowserCompatCustomActionResultReceiver(), isObject.INSTANCE.AudioAttributesImplBaseParcelizer());
        setprovider.write(WindowInsetsCompat.MediaBrowserCompatItemReceiver.MediaBrowserCompatItemReceiver(), isObject.INSTANCE.write());
        setprovider.write(WindowInsetsCompat.MediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer(), isObject.INSTANCE.IconCompatParcelizer());
        setprovider.write(WindowInsetsCompat.MediaBrowserCompatItemReceiver.IconCompatParcelizer(), isObject.INSTANCE.AudioAttributesCompatParcelizer());
        setprovider.write(WindowInsetsCompat.MediaBrowserCompatItemReceiver.AudioAttributesImplApi26Parcelizer(), isObject.INSTANCE.MediaBrowserCompatItemReceiver());
        setprovider.write(WindowInsetsCompat.MediaBrowserCompatItemReceiver.write(), isObject.INSTANCE.read());
        setprovider.write(WindowInsetsCompat.MediaBrowserCompatItemReceiver.AudioAttributesImplApi21Parcelizer(), isObject.INSTANCE.AudioAttributesImplApi26Parcelizer());
        setprovider.write(WindowInsetsCompat.MediaBrowserCompatItemReceiver.read(), isObject.INSTANCE.RemoteActionCompatParcelizer());
        IconCompatParcelizer = setprovider;
        RemoteActionCompatParcelizer = new isObject[]{isObject.INSTANCE.AudioAttributesImplBaseParcelizer(), isObject.INSTANCE.write(), isObject.INSTANCE.IconCompatParcelizer(), isObject.INSTANCE.AudioAttributesImplApi26Parcelizer(), isObject.INSTANCE.MediaBrowserCompatItemReceiver(), isObject.INSTANCE.read(), isObject.INSTANCE.AudioAttributesCompatParcelizer(), isObject.INSTANCE.AudioAttributesImplApi21Parcelizer(), isObject.INSTANCE.RemoteActionCompatParcelizer()};
    }
}
