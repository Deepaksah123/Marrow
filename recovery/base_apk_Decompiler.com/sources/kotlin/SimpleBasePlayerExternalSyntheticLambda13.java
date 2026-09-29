package kotlin;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0004\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\u00020\u0001B'\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\u0012\b\u0002\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\fJ\u0013\u0010\u000e\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0010\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00018\u0007¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R \u0010\u000e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0018R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0019R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0019R \u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0018R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u001a"}, d2 = {"Lo/SimpleBasePlayerExternalSyntheticLambda13;", "", "p0", "", "p1", "<init>", "(Ljava/lang/Object;Ljava/util/List;)V", "", "AudioAttributesCompatParcelizer", "()Ljava/lang/Number;", "", "MediaBrowserCompatItemReceiver", "()Ljava/lang/String;", "AudioAttributesImplApi26Parcelizer", "write", "()Ljava/util/List;", "RemoteActionCompatParcelizer", "", "IconCompatParcelizer", "()Z", "MediaBrowserCompatCustomActionResultReceiver", "Ljava/lang/Object;", "read", "()Ljava/lang/Object;", "Ljava/util/List;", "Ljava/lang/String;", "Ljava/lang/Number;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SimpleBasePlayerExternalSyntheticLambda13 {
    private List<? extends Object> AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private Number AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final Object RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private String IconCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private List<? extends Object> write;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private String read;

    private SimpleBasePlayerExternalSyntheticLambda13(Object obj, List<? extends Object> list) {
        ArrayList arrayList;
        this.RemoteActionCompatParcelizer = obj;
        this.write = list;
        if (obj instanceof String) {
            String str = (String) obj;
            this.IconCompatParcelizer = str;
            String lowerCase = TestGroupLSModel.AudioAttributesImplApi26Parcelizer((CharSequence) str).toString().toLowerCase(Locale.ROOT);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lowerCase, "");
            this.read = lowerCase;
            return;
        }
        if (obj instanceof Boolean) {
            Boolean bool = (Boolean) obj;
            this.IconCompatParcelizer = String.valueOf(bool.booleanValue());
            String lowerCase2 = TestGroupLSModel.AudioAttributesImplApi26Parcelizer((CharSequence) String.valueOf(bool.booleanValue())).toString().toLowerCase(Locale.ROOT);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lowerCase2, "");
            this.read = lowerCase2;
            return;
        }
        if (obj instanceof Number) {
            this.AudioAttributesImplApi26Parcelizer = (Number) obj;
            return;
        }
        if (obj instanceof List) {
            this.write = (List) obj;
            Iterable iterable = (Iterable) obj;
            ArrayList arrayList2 = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(iterable, 10));
            for (Object lowerCase3 : iterable) {
                if (lowerCase3 instanceof String) {
                    lowerCase3 = TestGroupLSModel.AudioAttributesImplApi26Parcelizer((CharSequence) lowerCase3).toString().toLowerCase(Locale.ROOT);
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lowerCase3, "");
                }
                arrayList2.add(lowerCase3);
            }
            this.AudioAttributesCompatParcelizer = arrayList2;
            return;
        }
        if (obj instanceof JSONArray) {
            List<? extends Object> listIconCompatParcelizer = lambdaonAudioSessionIdChanged54.IconCompatParcelizer((JSONArray) obj);
            this.write = listIconCompatParcelizer;
            if (listIconCompatParcelizer != null) {
                List<? extends Object> list2 = listIconCompatParcelizer;
                ArrayList arrayList3 = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list2, 10));
                for (Object lowerCase4 : list2) {
                    if (lowerCase4 instanceof String) {
                        lowerCase4 = TestGroupLSModel.AudioAttributesImplApi26Parcelizer((CharSequence) lowerCase4).toString().toLowerCase(Locale.ROOT);
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lowerCase4, "");
                    }
                    arrayList3.add(lowerCase4);
                }
                arrayList = arrayList3;
            } else {
                arrayList = null;
            }
            this.AudioAttributesCompatParcelizer = arrayList;
        }
    }

    public /* synthetic */ SimpleBasePlayerExternalSyntheticLambda13(Object obj, List list, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? null : obj, (i & 2) != 0 ? null : list);
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final Object getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final Number getAudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from getter */
    public final String getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from getter */
    public final String getRead() {
        return this.read;
    }

    public final List<?> write() {
        return this.write;
    }

    public final List<?> RemoteActionCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final boolean IconCompatParcelizer() {
        return this.write != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SimpleBasePlayerExternalSyntheticLambda13() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
