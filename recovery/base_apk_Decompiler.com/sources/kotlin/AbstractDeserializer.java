package kotlin;

import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin._deserializeFromObjectId;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00152\u00020\u0001:\u0004\u0017\u0011\u001f\u0015B)\b\u0000\u0012\u0016\u0010\u0005\u001a\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB=\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00030\u0002\u0012\u0014\b\u0002\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00030\u0002¢\u0006\u0004\b\b\u0010\rB)\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00030\u0002¢\u0006\u0004\b\b\u0010\u000eJ\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u000fH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u0017\u0010\u0018J1\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000f¢\u0006\u0004\b\u0015\u0010\u0019J%\u0010\u0011\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u001bJ)\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u000f¢\u0006\u0004\b\u0015\u0010\u001dJ+\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u001f\u0010\u001dJ)\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u000f¢\u0006\u0004\b!\u0010\u001dJ\u001d\u0010\u0017\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u000f¢\u0006\u0004\b\u0017\u0010\"J\u001a\u0010$\u001a\u00020\u001a2\b\u0010\u0005\u001a\u0004\u0018\u00010#H\u0096\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u000fH\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0006H\u0016¢\u0006\u0004\b(\u0010)J\u0015\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u0000¢\u0006\u0004\b\u001f\u0010*J1\u0010\u0011\u001a\u00020\u00002\"\u0010\u0005\u001a\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00030+¢\u0006\u0004\b\u0011\u0010,J7\u0010\u001f\u001a\u00020\u00002(\u0010\u0005\u001a$\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00030\u00020+¢\u0006\u0004\b\u001f\u0010,R*\u0010\u0017\u001a\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b!\u0010-\u001a\u0004\b!\u0010.R\u001a\u0010\u0011\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u0010)R(\u0010!\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u0003\u0018\u00010\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u001f\u0010-\u001a\u0004\b\u0011\u0010.R\u001d\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00030\u00028G¢\u0006\u0006\u001a\u0004\b\u0015\u0010.R(\u0010\u0015\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u0003\u0018\u00010\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0017\u0010-\u001a\u0004\b\u0017\u0010.R\u0014\u0010/\u001a\u00020\u000f8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010'"}, d2 = {"Lo/AbstractDeserializer;", "", "", "Lo/AbstractDeserializer$AudioAttributesCompatParcelizer;", "Lo/AbstractDeserializer$RemoteActionCompatParcelizer;", "p0", "", "p1", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "Lo/_findPropertyUnwrapper;", "Lo/_findCustomCollectionLikeDeserializer;", "p2", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "(Ljava/lang/String;Ljava/util/List;)V", "", "", "IconCompatParcelizer", "(I)C", "(II)Lo/AbstractDeserializer;", "Lo/findProperty;", "read", "(J)Lo/AbstractDeserializer;", "AudioAttributesCompatParcelizer", "(Lo/AbstractDeserializer;)Lo/AbstractDeserializer;", "(Ljava/lang/String;II)Ljava/util/List;", "", "(Ljava/lang/String;II)Z", "Lo/handleIgnoredProperty;", "(II)Ljava/util/List;", "Lo/handleUnknownVanilla;", "RemoteActionCompatParcelizer", "Lo/_deserializeFromObjectId;", "write", "(II)Z", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "(Lo/AbstractDeserializer;)Z", "Lkotlin/Function1;", "(Lo/getAnswerMap;)Lo/AbstractDeserializer;", "Ljava/util/List;", "()Ljava/util/List;", "MediaBrowserCompatCustomActionResultReceiver", "Ljava/lang/String;", "AudioAttributesImplApi26Parcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AbstractDeserializer implements CharSequence {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final List<AudioAttributesCompatParcelizer<_findCustomCollectionLikeDeserializer>> read;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final String IconCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final List<AudioAttributesCompatParcelizer<_findPropertyUnwrapper>> write;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final List<AudioAttributesCompatParcelizer<? extends RemoteActionCompatParcelizer>> AudioAttributesCompatParcelizer;
    private static final parseManyDecDigits<AbstractDeserializer, ?> IconCompatParcelizer = _findRemappedType.read();

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0007\u0002\u0003\u0004\u0005\u0006\u0007\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lo/AbstractDeserializer$RemoteActionCompatParcelizer;", "", "Lo/withAdditionalSerializers;", "Lo/_deserializeFromObjectId;", "Lo/_findCustomCollectionLikeDeserializer;", "Lo/_findPropertyUnwrapper;", "Lo/_handleByNameInclusion;", "Lo/handleIgnoredProperty;", "Lo/handleUnknownVanilla;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface RemoteActionCompatParcelizer {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractDeserializer(List<? extends AudioAttributesCompatParcelizer<? extends RemoteActionCompatParcelizer>> list, String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        this.AudioAttributesCompatParcelizer = list;
        this.IconCompatParcelizer = str;
        if (list != 0) {
            int size = list.size();
            arrayList = null;
            arrayList2 = null;
            for (int i = 0; i < size; i++) {
                AudioAttributesCompatParcelizer<_findPropertyUnwrapper> audioAttributesCompatParcelizer = (AudioAttributesCompatParcelizer) list.get(i);
                if (audioAttributesCompatParcelizer.IconCompatParcelizer() instanceof _findPropertyUnwrapper) {
                    arrayList = arrayList == null ? new ArrayList() : arrayList;
                    toMagicModuleMetaRepoModel.read(audioAttributesCompatParcelizer, "");
                    arrayList.add(audioAttributesCompatParcelizer);
                } else if (audioAttributesCompatParcelizer.IconCompatParcelizer() instanceof _findCustomCollectionLikeDeserializer) {
                    arrayList2 = arrayList2 == null ? new ArrayList() : arrayList2;
                    toMagicModuleMetaRepoModel.read(audioAttributesCompatParcelizer, "");
                    arrayList2.add(audioAttributesCompatParcelizer);
                }
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        this.write = arrayList;
        this.read = arrayList2;
        List listAudioAttributesCompatParcelizer = arrayList2 != null ? IntermediateLoginResponseBody.AudioAttributesCompatParcelizer((Iterable) arrayList2, new Comparator() { // from class: o.AbstractDeserializer.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return getConfigExpirySeconds.read(Integer.valueOf(((AudioAttributesCompatParcelizer) t).AudioAttributesImplBaseParcelizer()), Integer.valueOf(((AudioAttributesCompatParcelizer) t2).AudioAttributesImplBaseParcelizer()));
            }
        }) : null;
        List list2 = listAudioAttributesCompatParcelizer;
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        setExpandActivityOverflowButtonDrawable setexpandactivityoverflowbuttondrawableAudioAttributesCompatParcelizer = ActionBarOverlayLayoutLayoutParams.AudioAttributesCompatParcelizer(((AudioAttributesCompatParcelizer) IntermediateLoginResponseBody.RatingCompat(listAudioAttributesCompatParcelizer)).getAudioAttributesCompatParcelizer());
        int size2 = listAudioAttributesCompatParcelizer.size();
        for (int i2 = 1; i2 < size2; i2++) {
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizer2 = (AudioAttributesCompatParcelizer) listAudioAttributesCompatParcelizer.get(i2);
            while (true) {
                setExpandActivityOverflowButtonDrawable setexpandactivityoverflowbuttondrawable = setexpandactivityoverflowbuttondrawableAudioAttributesCompatParcelizer;
                if (setexpandactivityoverflowbuttondrawable.AudioAttributesCompatParcelizer == 0) {
                    break;
                }
                int iWrite = setexpandactivityoverflowbuttondrawableAudioAttributesCompatParcelizer.write();
                if (audioAttributesCompatParcelizer2.AudioAttributesImplBaseParcelizer() >= iWrite) {
                    setexpandactivityoverflowbuttondrawableAudioAttributesCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver(setexpandactivityoverflowbuttondrawable.AudioAttributesCompatParcelizer - 1);
                } else if (audioAttributesCompatParcelizer2.getAudioAttributesCompatParcelizer() > iWrite) {
                    StringBuilder sb = new StringBuilder("Paragraph overlap not allowed, end ");
                    sb.append(audioAttributesCompatParcelizer2.getAudioAttributesCompatParcelizer());
                    sb.append(" should be less than or equal to ");
                    sb.append(iWrite);
                    withStackTrace.read(sb.toString());
                }
            }
            setexpandactivityoverflowbuttondrawableAudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(audioAttributesCompatParcelizer2.getAudioAttributesCompatParcelizer());
        }
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return IconCompatParcelizer(i);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return RemoteActionCompatParcelizer();
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from getter */
    public final String getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final List<AudioAttributesCompatParcelizer<? extends RemoteActionCompatParcelizer>> write() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final List<AudioAttributesCompatParcelizer<_findPropertyUnwrapper>> IconCompatParcelizer() {
        return this.write;
    }

    public final List<AudioAttributesCompatParcelizer<_findPropertyUnwrapper>> read() {
        List<AudioAttributesCompatParcelizer<_findPropertyUnwrapper>> list = this.write;
        return list == null ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list;
    }

    public final List<AudioAttributesCompatParcelizer<_findCustomCollectionLikeDeserializer>> AudioAttributesCompatParcelizer() {
        return this.read;
    }

    public /* synthetic */ AbstractDeserializer(String str, List list, List list2, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(str, (i & 2) != 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list, (i & 4) != 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list2);
    }

    public AbstractDeserializer(String str, List<AudioAttributesCompatParcelizer<_findPropertyUnwrapper>> list, List<AudioAttributesCompatParcelizer<_findCustomCollectionLikeDeserializer>> list2) {
        this((List<? extends AudioAttributesCompatParcelizer<? extends RemoteActionCompatParcelizer>>) withAdditionalKeySerializers.read(list, list2), str);
    }

    public /* synthetic */ AbstractDeserializer(String str, List list, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(str, (List<? extends AudioAttributesCompatParcelizer<? extends RemoteActionCompatParcelizer>>) ((i & 2) != 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AbstractDeserializer(String str, List<? extends AudioAttributesCompatParcelizer<? extends RemoteActionCompatParcelizer>> list) {
        List<? extends AudioAttributesCompatParcelizer<? extends RemoteActionCompatParcelizer>> list2 = list;
        this(list2.isEmpty() ? null : list2, str);
    }

    public final int RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer.length();
    }

    public final char IconCompatParcelizer(int p0) {
        return this.IconCompatParcelizer.charAt(p0);
    }

    @Override // java.lang.CharSequence
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final AbstractDeserializer subSequence(int p0, int p1) {
        if (p0 > p1) {
            StringBuilder sb = new StringBuilder("start (");
            sb.append(p0);
            sb.append(") should be less or equal to end (");
            sb.append(p1);
            sb.append(')');
            withStackTrace.read(sb.toString());
        }
        if (p0 == 0 && p1 == this.IconCompatParcelizer.length()) {
            return this;
        }
        String strSubstring = this.IconCompatParcelizer.substring(p0, p1);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strSubstring, "");
        return new AbstractDeserializer((List<? extends AudioAttributesCompatParcelizer<? extends RemoteActionCompatParcelizer>>) withAdditionalKeySerializers.write(this.AudioAttributesCompatParcelizer, p0, p1), strSubstring);
    }

    public final AbstractDeserializer read(long p0) {
        return subSequence(findProperty.MediaBrowserCompatCustomActionResultReceiver(p0), findProperty.AudioAttributesImplApi26Parcelizer(p0));
    }

    public final AbstractDeserializer AudioAttributesCompatParcelizer(AbstractDeserializer p0) {
        IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(this);
        iconCompatParcelizer.RemoteActionCompatParcelizer(p0);
        return iconCompatParcelizer.RemoteActionCompatParcelizer();
    }

    public final List<AudioAttributesCompatParcelizer<String>> read(String p0, int p1, int p2) {
        List<AudioAttributesCompatParcelizer<? extends RemoteActionCompatParcelizer>> list = this.AudioAttributesCompatParcelizer;
        if (list == null) {
            return IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            AudioAttributesCompatParcelizer<? extends RemoteActionCompatParcelizer> audioAttributesCompatParcelizer = list.get(i);
            if ((audioAttributesCompatParcelizer.IconCompatParcelizer() instanceof _handleByNameInclusion) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) p0, (Object) audioAttributesCompatParcelizer.getRemoteActionCompatParcelizer()) && withAdditionalKeySerializers.RemoteActionCompatParcelizer(p1, p2, audioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer(), audioAttributesCompatParcelizer.getAudioAttributesCompatParcelizer())) {
                arrayList.add(_replaceProperty.read(audioAttributesCompatParcelizer));
            }
        }
        return arrayList;
    }

    public final boolean IconCompatParcelizer(String p0, int p1, int p2) {
        List<AudioAttributesCompatParcelizer<? extends RemoteActionCompatParcelizer>> list = this.AudioAttributesCompatParcelizer;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                AudioAttributesCompatParcelizer<? extends RemoteActionCompatParcelizer> audioAttributesCompatParcelizer = list.get(i);
                if ((audioAttributesCompatParcelizer.IconCompatParcelizer() instanceof _handleByNameInclusion) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) p0, (Object) audioAttributesCompatParcelizer.getRemoteActionCompatParcelizer()) && withAdditionalKeySerializers.RemoteActionCompatParcelizer(p1, p2, audioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer(), audioAttributesCompatParcelizer.getAudioAttributesCompatParcelizer())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final List<AudioAttributesCompatParcelizer<handleIgnoredProperty>> read(int p0, int p1) {
        ArrayList arrayListRemoteActionCompatParcelizer;
        List<AudioAttributesCompatParcelizer<? extends RemoteActionCompatParcelizer>> list = this.AudioAttributesCompatParcelizer;
        if (list == null) {
            arrayListRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        } else {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                AudioAttributesCompatParcelizer<? extends RemoteActionCompatParcelizer> audioAttributesCompatParcelizer = list.get(i);
                AudioAttributesCompatParcelizer<? extends RemoteActionCompatParcelizer> audioAttributesCompatParcelizer2 = audioAttributesCompatParcelizer;
                if ((audioAttributesCompatParcelizer2.IconCompatParcelizer() instanceof handleIgnoredProperty) && withAdditionalKeySerializers.RemoteActionCompatParcelizer(p0, p1, audioAttributesCompatParcelizer2.AudioAttributesImplBaseParcelizer(), audioAttributesCompatParcelizer2.getAudioAttributesCompatParcelizer())) {
                    arrayList.add(audioAttributesCompatParcelizer);
                }
            }
            arrayListRemoteActionCompatParcelizer = arrayList;
        }
        toMagicModuleMetaRepoModel.read(arrayListRemoteActionCompatParcelizer, "");
        return arrayListRemoteActionCompatParcelizer;
    }

    @getRenewGrpId
    public final List<AudioAttributesCompatParcelizer<handleUnknownVanilla>> RemoteActionCompatParcelizer(int p0, int p1) {
        ArrayList arrayListRemoteActionCompatParcelizer;
        List<AudioAttributesCompatParcelizer<? extends RemoteActionCompatParcelizer>> list = this.AudioAttributesCompatParcelizer;
        if (list == null) {
            arrayListRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        } else {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                AudioAttributesCompatParcelizer<? extends RemoteActionCompatParcelizer> audioAttributesCompatParcelizer = list.get(i);
                AudioAttributesCompatParcelizer<? extends RemoteActionCompatParcelizer> audioAttributesCompatParcelizer2 = audioAttributesCompatParcelizer;
                if ((audioAttributesCompatParcelizer2.IconCompatParcelizer() instanceof handleUnknownVanilla) && withAdditionalKeySerializers.RemoteActionCompatParcelizer(p0, p1, audioAttributesCompatParcelizer2.AudioAttributesImplBaseParcelizer(), audioAttributesCompatParcelizer2.getAudioAttributesCompatParcelizer())) {
                    arrayList.add(audioAttributesCompatParcelizer);
                }
            }
            arrayListRemoteActionCompatParcelizer = arrayList;
        }
        toMagicModuleMetaRepoModel.read(arrayListRemoteActionCompatParcelizer, "");
        return arrayListRemoteActionCompatParcelizer;
    }

    public final List<AudioAttributesCompatParcelizer<_deserializeFromObjectId>> write(int p0, int p1) {
        ArrayList arrayListRemoteActionCompatParcelizer;
        List<AudioAttributesCompatParcelizer<? extends RemoteActionCompatParcelizer>> list = this.AudioAttributesCompatParcelizer;
        if (list == null) {
            arrayListRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        } else {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                AudioAttributesCompatParcelizer<? extends RemoteActionCompatParcelizer> audioAttributesCompatParcelizer = list.get(i);
                AudioAttributesCompatParcelizer<? extends RemoteActionCompatParcelizer> audioAttributesCompatParcelizer2 = audioAttributesCompatParcelizer;
                if ((audioAttributesCompatParcelizer2.IconCompatParcelizer() instanceof _deserializeFromObjectId) && withAdditionalKeySerializers.RemoteActionCompatParcelizer(p0, p1, audioAttributesCompatParcelizer2.AudioAttributesImplBaseParcelizer(), audioAttributesCompatParcelizer2.getAudioAttributesCompatParcelizer())) {
                    arrayList.add(audioAttributesCompatParcelizer);
                }
            }
            arrayListRemoteActionCompatParcelizer = arrayList;
        }
        toMagicModuleMetaRepoModel.read(arrayListRemoteActionCompatParcelizer, "");
        return arrayListRemoteActionCompatParcelizer;
    }

    public final boolean AudioAttributesCompatParcelizer(int p0, int p1) {
        List<AudioAttributesCompatParcelizer<? extends RemoteActionCompatParcelizer>> list = this.AudioAttributesCompatParcelizer;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                AudioAttributesCompatParcelizer<? extends RemoteActionCompatParcelizer> audioAttributesCompatParcelizer = list.get(i);
                if ((audioAttributesCompatParcelizer.IconCompatParcelizer() instanceof _deserializeFromObjectId) && withAdditionalKeySerializers.RemoteActionCompatParcelizer(p0, p1, audioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer(), audioAttributesCompatParcelizer.getAudioAttributesCompatParcelizer())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof AbstractDeserializer)) {
            return false;
        }
        AbstractDeserializer abstractDeserializer = (AbstractDeserializer) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) abstractDeserializer.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, abstractDeserializer.AudioAttributesCompatParcelizer);
    }

    public final int hashCode() {
        int iHashCode = this.IconCompatParcelizer.hashCode();
        List<AudioAttributesCompatParcelizer<? extends RemoteActionCompatParcelizer>> list = this.AudioAttributesCompatParcelizer;
        return (iHashCode * 31) + (list != null ? list.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.IconCompatParcelizer;
    }

    public final boolean RemoteActionCompatParcelizer(AbstractDeserializer p0) {
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, p0.AudioAttributesCompatParcelizer);
    }

    public final AbstractDeserializer IconCompatParcelizer(getAnswerMap<? super AudioAttributesCompatParcelizer<? extends RemoteActionCompatParcelizer>, ? extends AudioAttributesCompatParcelizer<? extends RemoteActionCompatParcelizer>> p0) {
        IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(this);
        iconCompatParcelizer.AudioAttributesCompatParcelizer(p0);
        return iconCompatParcelizer.RemoteActionCompatParcelizer();
    }

    public final AbstractDeserializer RemoteActionCompatParcelizer(getAnswerMap<? super AudioAttributesCompatParcelizer<? extends RemoteActionCompatParcelizer>, ? extends List<? extends AudioAttributesCompatParcelizer<? extends RemoteActionCompatParcelizer>>> p0) {
        IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(this);
        iconCompatParcelizer.read(p0);
        return iconCompatParcelizer.RemoteActionCompatParcelizer();
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B'\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u000bJ\u0010\u0010\f\u001a\u00028\u0000HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ>\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\f\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ\u0010\u0010\u0016\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u001a\u001a\u00028\u00008\u0007¢\u0006\f\n\u0004\b\u000e\u0010\u0018\u001a\u0004\b\u0019\u0010\rR\u001a\u0010\u0010\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u000fR\u001a\u0010\u000e\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u001a\u0010\u000fR\u001a\u0010\f\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u001d\u001a\u0004\b\u001e\u0010\u0017"}, d2 = {"Lo/AbstractDeserializer$AudioAttributesCompatParcelizer;", "T", "", "p0", "", "p1", "p2", "", "p3", "<init>", "(Ljava/lang/Object;IILjava/lang/String;)V", "(Ljava/lang/Object;II)V", "RemoteActionCompatParcelizer", "()Ljava/lang/Object;", "AudioAttributesCompatParcelizer", "()I", "write", "(Ljava/lang/Object;IILjava/lang/String;)Lo/AbstractDeserializer$AudioAttributesCompatParcelizer;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "IconCompatParcelizer", "read", "I", "AudioAttributesImplBaseParcelizer", "Ljava/lang/String;", "AudioAttributesImplApi21Parcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AudioAttributesCompatParcelizer<T> {

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
        private final T read;

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
        private final int AudioAttributesCompatParcelizer;

        /* JADX INFO: renamed from: read, reason: from kotlin metadata */
        private final int write;

        /* JADX INFO: renamed from: write, reason: from kotlin metadata */
        private final String RemoteActionCompatParcelizer;

        public AudioAttributesCompatParcelizer(T t, int i, int i2, String str) {
            this.read = t;
            this.write = i;
            this.AudioAttributesCompatParcelizer = i2;
            this.RemoteActionCompatParcelizer = str;
            if (i <= i2) {
                return;
            }
            withStackTrace.read("Reversed range is not supported");
        }

        /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from getter */
        public final String getRemoteActionCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        public final int AudioAttributesImplBaseParcelizer() {
            return this.write;
        }

        public final T IconCompatParcelizer() {
            return this.read;
        }

        /* JADX INFO: renamed from: read, reason: from getter */
        public final int getAudioAttributesCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        public AudioAttributesCompatParcelizer(T t, int i, int i2) {
            this(t, i, i2, "");
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ AudioAttributesCompatParcelizer RemoteActionCompatParcelizer$default(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, Object obj, int i, int i2, String str, int i3, Object obj2) {
            if ((i3 & 1) != 0) {
                obj = audioAttributesCompatParcelizer.read;
            }
            if ((i3 & 2) != 0) {
                i = audioAttributesCompatParcelizer.write;
            }
            if ((i3 & 4) != 0) {
                i2 = audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer;
            }
            if ((i3 & 8) != 0) {
                str = audioAttributesCompatParcelizer.RemoteActionCompatParcelizer;
            }
            return audioAttributesCompatParcelizer.RemoteActionCompatParcelizer(obj, i, i2, str);
        }

        public final T RemoteActionCompatParcelizer() {
            return this.read;
        }

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
        public final int getWrite() {
            return this.write;
        }

        public final int write() {
            return this.AudioAttributesCompatParcelizer;
        }

        public final AudioAttributesCompatParcelizer<T> RemoteActionCompatParcelizer(T p0, int p1, int p2, String p3) {
            return new AudioAttributesCompatParcelizer<>(p0, p1, p2, p3);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof AudioAttributesCompatParcelizer)) {
                return false;
            }
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = (AudioAttributesCompatParcelizer) p0;
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.read, audioAttributesCompatParcelizer.read) && this.write == audioAttributesCompatParcelizer.write && this.AudioAttributesCompatParcelizer == audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) audioAttributesCompatParcelizer.RemoteActionCompatParcelizer);
        }

        public final int hashCode() {
            T t = this.read;
            return ((((((t == null ? 0 : t.hashCode()) * 31) + Integer.hashCode(this.write)) * 31) + Integer.hashCode(this.AudioAttributesCompatParcelizer)) * 31) + this.RemoteActionCompatParcelizer.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AudioAttributesCompatParcelizer(read=");
            sb.append(this.read);
            sb.append(", write=");
            sb.append(this.write);
            sb.append(", AudioAttributesCompatParcelizer=");
            sb.append(this.AudioAttributesCompatParcelizer);
            sb.append(", RemoteActionCompatParcelizer=");
            sb.append(this.RemoteActionCompatParcelizer);
            sb.append(')');
            return sb.toString();
        }
    }

    @Metadata(d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002UVB\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\u0005\u0010\tB\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\n¢\u0006\u0004\b\u0005\u0010\u000bJ\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0007\u001a\u00020\bJ\u0015\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u001bH\u0007¢\u0006\u0002\b\u0017J\u0012\u0010\u0017\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u001cH\u0016J\"\u0010\u0017\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0004H\u0016J\u0010\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0007\u001a\u00020\nJ\u001e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0007\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0004J\u001e\u0010\u001f\u001a\u00020\u00182\u0006\u0010 \u001a\u00020!2\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0004J\u001e\u0010\u001f\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0004J&\u0010#\u001a\u00020\u00182\u0006\u0010$\u001a\u00020\b2\u0006\u0010%\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0004J\u001e\u0010&\u001a\u00020\u00182\u0006\u0010'\u001a\u00020(2\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0004J \u0010)\u001a\u00020\u00182\u0006\u0010*\u001a\u00020+2\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0004H\u0007J\u001e\u0010,\u001a\u00020\u00182\u0006\u0010-\u001a\u00020.2\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0004J\u001e\u0010,\u001a\u00020\u00182\u0006\u0010/\u001a\u0002002\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0004J\u001e\u00101\u001a\u00020\u00182\u0006\u00102\u001a\u0002032\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0004J-\u00101\u001a\u00020\u00182\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u0002052\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0004¢\u0006\u0004\b6\u00107J\u000e\u00108\u001a\u00020\u00042\u0006\u0010 \u001a\u00020!J\u000e\u00108\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\"J\u000e\u00109\u001a\u00020\u00042\u0006\u00102\u001a\u000203JD\u0010<\u001a\u0002H=\"\b\b\u0000\u0010=*\u00020\u00112\b\b\u0002\u00104\u001a\u0002052\b\b\u0002\u00102\u001a\u0002032\u0017\u0010>\u001a\u0013\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u0002H=0?¢\u0006\u0002\b@¢\u0006\u0004\bA\u0010BJ>\u0010C\u001a\u0002H=\"\b\b\u0000\u0010=*\u00020\u0011*\u00020;2\n\b\u0002\u00102\u001a\u0004\u0018\u0001032\u0017\u0010>\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u0002H=0?¢\u0006\u0002\b@¢\u0006\u0002\u0010DJ\u0016\u0010E\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\b2\u0006\u0010%\u001a\u00020\bJ\u000e\u0010F\u001a\u00020\u00042\u0006\u0010'\u001a\u00020(J\u0010\u0010G\u001a\u00020\u00042\u0006\u0010*\u001a\u00020+H\u0007J\u000e\u0010H\u001a\u00020\u00042\u0006\u0010I\u001a\u00020JJ\u0006\u0010K\u001a\u00020\u0018J\u000e\u0010K\u001a\u00020\u00182\u0006\u0010L\u001a\u00020\u0004J\u0006\u0010M\u001a\u00020\nJ1\u0010N\u001a\u00020\u00182\"\u0010O\u001a\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00130P\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00130P0?H\u0000¢\u0006\u0002\bQJ7\u0010R\u001a\u00020\u00182(\u0010O\u001a$\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00130P\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00130P0S0?H\u0000¢\u0006\u0002\bTR\u0012\u0010\u0007\u001a\u00060\fj\u0002`\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00110\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0012\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00130\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0014\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010:\u001a\u00020;X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006W"}, d2 = {"Landroidx/compose/ui/text/AnnotatedString$Builder;", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "capacity", "", "<init>", "(I)V", "text", "", "(Ljava/lang/String;)V", "Landroidx/compose/ui/text/AnnotatedString;", "(Landroidx/compose/ui/text/AnnotatedString;)V", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "styleStack", "", "Landroidx/compose/ui/text/AnnotatedString$Builder$MutableRange;", "", "annotations", "Landroidx/compose/ui/text/AnnotatedString$Annotation;", SessionDescription.ATTR_LENGTH, "getLength", "()I", "append", "", "deprecated_append_returning_void", "char", "", "", TtmlNode.START, TtmlNode.END, "addStyle", TtmlNode.TAG_STYLE, "Landroidx/compose/ui/text/SpanStyle;", "Landroidx/compose/ui/text/ParagraphStyle;", "addStringAnnotation", "tag", "annotation", "addTtsAnnotation", "ttsAnnotation", "Landroidx/compose/ui/text/TtsAnnotation;", "addUrlAnnotation", "urlAnnotation", "Landroidx/compose/ui/text/UrlAnnotation;", "addLink", "url", "Landroidx/compose/ui/text/LinkAnnotation$Url;", "clickable", "Landroidx/compose/ui/text/LinkAnnotation$Clickable;", "addBullet", "bullet", "Landroidx/compose/ui/text/Bullet;", "indentation", "Landroidx/compose/ui/unit/TextUnit;", "addBullet-r9BaKPg", "(Landroidx/compose/ui/text/Bullet;JII)V", "pushStyle", "pushBullet", "bulletScope", "Landroidx/compose/ui/text/AnnotatedString$Builder$BulletScope;", "withBulletList", "R", "block", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "withBulletList-o2QH7mI", "(JLandroidx/compose/ui/text/Bullet;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "withBulletListItem", "(Landroidx/compose/ui/text/AnnotatedString$Builder$BulletScope;Landroidx/compose/ui/text/Bullet;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "pushStringAnnotation", "pushTtsAnnotation", "pushUrlAnnotation", "pushLink", "link", "Landroidx/compose/ui/text/LinkAnnotation;", "pop", "index", "toAnnotatedString", "mapAnnotations", "transform", "Landroidx/compose/ui/text/AnnotatedString$Range;", "mapAnnotations$ui_text", "flatMapAnnotations", "", "flatMapAnnotations$ui_text", "MutableRange", "BulletScope", "ui-text"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class IconCompatParcelizer implements Appendable {
        private final read IconCompatParcelizer;
        private final StringBuilder RemoteActionCompatParcelizer;
        private final List<AudioAttributesCompatParcelizer<? extends Object>> read;
        private final List<AudioAttributesCompatParcelizer<? extends RemoteActionCompatParcelizer>> write;

        public IconCompatParcelizer(int i) {
            this.RemoteActionCompatParcelizer = new StringBuilder(i);
            this.read = new ArrayList();
            this.write = new ArrayList();
            this.IconCompatParcelizer = new read(this);
        }

        public /* synthetic */ IconCompatParcelizer(int i, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this((i2 & 1) != 0 ? 16 : i);
        }

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0082\b\u0018\u0000 \u001c*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u001cB+\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0017\u001a\u00028\u00008\u0006¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0019\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\f\u0010\u0018R\u001c\u0010\f\u001a\u00020\u00048\u0006@\u0007X\u0086\u000e¢\u0006\f\n\u0004\b\u0017\u0010\u0018\"\u0004\b\u0015\u0010\u001aR\u0014\u0010\u0015\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001b"}, d2 = {"Lo/AbstractDeserializer$IconCompatParcelizer$AudioAttributesCompatParcelizer;", "T", "", "p0", "", "p1", "p2", "", "p3", "<init>", "(Ljava/lang/Object;IILjava/lang/String;)V", "Lo/AbstractDeserializer$AudioAttributesCompatParcelizer;", "write", "(I)Lo/AbstractDeserializer$AudioAttributesCompatParcelizer;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "RemoteActionCompatParcelizer", "Ljava/lang/Object;", "read", "I", "IconCompatParcelizer", "(I)V", "Ljava/lang/String;", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
        static final /* data */ class AudioAttributesCompatParcelizer<T> {

            /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);

            /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
            private final String RemoteActionCompatParcelizer;

            /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
            private final T read;

            /* JADX INFO: renamed from: read, reason: from kotlin metadata */
            private int write;

            /* JADX INFO: renamed from: write, reason: from kotlin metadata */
            private final int IconCompatParcelizer;

            public AudioAttributesCompatParcelizer(T t, int i, int i2, String str) {
                this.read = t;
                this.IconCompatParcelizer = i;
                this.write = i2;
                this.RemoteActionCompatParcelizer = str;
            }

            public final void RemoteActionCompatParcelizer(int i) {
                this.write = i;
            }

            public /* synthetic */ AudioAttributesCompatParcelizer(Object obj, int i, int i2, String str, int i3, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
                this(obj, i, (i3 & 4) != 0 ? Integer.MIN_VALUE : i2, (i3 & 8) != 0 ? "" : str);
            }

            public static /* synthetic */ AudioAttributesCompatParcelizer write$default(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, int i, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = Integer.MIN_VALUE;
                }
                return audioAttributesCompatParcelizer.write(i);
            }

            public final AudioAttributesCompatParcelizer<T> write(int p0) {
                int i = this.write;
                if (i != Integer.MIN_VALUE) {
                    p0 = i;
                }
                if (p0 == Integer.MIN_VALUE) {
                    withStackTrace.AudioAttributesCompatParcelizer("Item.end should be set first");
                }
                return new AudioAttributesCompatParcelizer<>(this.read, this.IconCompatParcelizer, p0, this.RemoteActionCompatParcelizer);
            }

            /* JADX INFO: renamed from: o.AbstractDeserializer$IconCompatParcelizer$AudioAttributesCompatParcelizer$AudioAttributesCompatParcelizer, reason: collision with other inner class name and from kotlin metadata */
            @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007\"\u0004\b\u0001\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lo/AbstractDeserializer$IconCompatParcelizer$AudioAttributesCompatParcelizer$AudioAttributesCompatParcelizer;", "", "<init>", "()V", "T", "Lo/AbstractDeserializer$AudioAttributesCompatParcelizer;", "p0", "Lo/AbstractDeserializer$IconCompatParcelizer$AudioAttributesCompatParcelizer;", "IconCompatParcelizer", "(Lo/AbstractDeserializer$AudioAttributesCompatParcelizer;)Lo/AbstractDeserializer$IconCompatParcelizer$AudioAttributesCompatParcelizer;"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public final <T> AudioAttributesCompatParcelizer<T> IconCompatParcelizer(AudioAttributesCompatParcelizer<T> p0) {
                    return new AudioAttributesCompatParcelizer<>(p0.IconCompatParcelizer(), p0.AudioAttributesImplBaseParcelizer(), p0.getAudioAttributesCompatParcelizer(), p0.getRemoteActionCompatParcelizer());
                }

                public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
                    this();
                }
            }

            public final boolean equals(Object p0) {
                if (this == p0) {
                    return true;
                }
                if (!(p0 instanceof AudioAttributesCompatParcelizer)) {
                    return false;
                }
                AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = (AudioAttributesCompatParcelizer) p0;
                return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.read, audioAttributesCompatParcelizer.read) && this.IconCompatParcelizer == audioAttributesCompatParcelizer.IconCompatParcelizer && this.write == audioAttributesCompatParcelizer.write && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) audioAttributesCompatParcelizer.RemoteActionCompatParcelizer);
            }

            public final int hashCode() {
                T t = this.read;
                return ((((((t == null ? 0 : t.hashCode()) * 31) + Integer.hashCode(this.IconCompatParcelizer)) * 31) + Integer.hashCode(this.write)) * 31) + this.RemoteActionCompatParcelizer.hashCode();
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("AudioAttributesCompatParcelizer(read=");
                sb.append(this.read);
                sb.append(", IconCompatParcelizer=");
                sb.append(this.IconCompatParcelizer);
                sb.append(", write=");
                sb.append(this.write);
                sb.append(", RemoteActionCompatParcelizer=");
                sb.append(this.RemoteActionCompatParcelizer);
                sb.append(')');
                return sb.toString();
            }
        }

        public IconCompatParcelizer(AbstractDeserializer abstractDeserializer) {
            this(0, 1, null);
            RemoteActionCompatParcelizer(abstractDeserializer);
        }

        public final int AudioAttributesCompatParcelizer() {
            return this.RemoteActionCompatParcelizer.length();
        }

        public final void RemoteActionCompatParcelizer(String str) {
            this.RemoteActionCompatParcelizer.append(str);
        }

        @Override // java.lang.Appendable
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final IconCompatParcelizer append(CharSequence charSequence) {
            if (charSequence instanceof AbstractDeserializer) {
                RemoteActionCompatParcelizer((AbstractDeserializer) charSequence);
                return this;
            }
            this.RemoteActionCompatParcelizer.append(charSequence);
            return this;
        }

        @Override // java.lang.Appendable
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final IconCompatParcelizer append(CharSequence charSequence, int i, int i2) {
            if (charSequence instanceof AbstractDeserializer) {
                IconCompatParcelizer((AbstractDeserializer) charSequence, i, i2);
                return this;
            }
            this.RemoteActionCompatParcelizer.append(charSequence, i, i2);
            return this;
        }

        @Override // java.lang.Appendable
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final IconCompatParcelizer append(char c) {
            this.RemoteActionCompatParcelizer.append(c);
            return this;
        }

        public final void RemoteActionCompatParcelizer(AbstractDeserializer abstractDeserializer) {
            int length = this.RemoteActionCompatParcelizer.length();
            this.RemoteActionCompatParcelizer.append(abstractDeserializer.getIconCompatParcelizer());
            List<AudioAttributesCompatParcelizer<? extends RemoteActionCompatParcelizer>> listWrite = abstractDeserializer.write();
            if (listWrite != null) {
                int size = listWrite.size();
                for (int i = 0; i < size; i++) {
                    AudioAttributesCompatParcelizer<? extends RemoteActionCompatParcelizer> audioAttributesCompatParcelizer = listWrite.get(i);
                    this.write.add(new AudioAttributesCompatParcelizer<>(audioAttributesCompatParcelizer.IconCompatParcelizer(), audioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer() + length, audioAttributesCompatParcelizer.getAudioAttributesCompatParcelizer() + length, audioAttributesCompatParcelizer.getRemoteActionCompatParcelizer()));
                }
            }
        }

        public final void IconCompatParcelizer(AbstractDeserializer abstractDeserializer, int i, int i2) {
            int length = this.RemoteActionCompatParcelizer.length();
            this.RemoteActionCompatParcelizer.append((CharSequence) abstractDeserializer.getIconCompatParcelizer(), i, i2);
            List listAudioAttributesCompatParcelizer$default = withAdditionalKeySerializers.AudioAttributesCompatParcelizer$default(abstractDeserializer, i, i2, null, 4, null);
            if (listAudioAttributesCompatParcelizer$default != null) {
                int size = listAudioAttributesCompatParcelizer$default.size();
                for (int i3 = 0; i3 < size; i3++) {
                    AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = (AudioAttributesCompatParcelizer) listAudioAttributesCompatParcelizer$default.get(i3);
                    List<AudioAttributesCompatParcelizer<? extends RemoteActionCompatParcelizer>> list = this.write;
                    Object objIconCompatParcelizer = audioAttributesCompatParcelizer.IconCompatParcelizer();
                    int iAudioAttributesImplBaseParcelizer = audioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer();
                    list.add(new AudioAttributesCompatParcelizer<>(objIconCompatParcelizer, iAudioAttributesImplBaseParcelizer + length, audioAttributesCompatParcelizer.getAudioAttributesCompatParcelizer() + length, audioAttributesCompatParcelizer.getRemoteActionCompatParcelizer()));
                }
            }
        }

        public final void RemoteActionCompatParcelizer(_findPropertyUnwrapper _findpropertyunwrapper, int i, int i2) {
            this.write.add(new AudioAttributesCompatParcelizer<>(_findpropertyunwrapper, i, i2, null, 8, null));
        }

        public final void RemoteActionCompatParcelizer(_deserializeFromObjectId.IconCompatParcelizer iconCompatParcelizer, int i, int i2) {
            this.write.add(new AudioAttributesCompatParcelizer<>(iconCompatParcelizer, i, i2, null, 8, null));
        }

        public final int read(_findPropertyUnwrapper _findpropertyunwrapper) {
            AudioAttributesCompatParcelizer<? extends RemoteActionCompatParcelizer> audioAttributesCompatParcelizer = new AudioAttributesCompatParcelizer<>(_findpropertyunwrapper, this.RemoteActionCompatParcelizer.length(), 0, null, 12, null);
            this.read.add(audioAttributesCompatParcelizer);
            this.write.add(audioAttributesCompatParcelizer);
            return this.read.size() - 1;
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\b\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R&\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n0\t8\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lo/AbstractDeserializer$IconCompatParcelizer$read;", "", "Lo/AbstractDeserializer$IconCompatParcelizer;", "p0", "<init>", "(Lo/AbstractDeserializer$IconCompatParcelizer;)V", "write", "Lo/AbstractDeserializer$IconCompatParcelizer;", "RemoteActionCompatParcelizer", "", "Lo/getSubscriptionExpiresOn;", "Lo/ReadableObjectIdReferring;", "Lo/withAdditionalSerializers;", "read", "Ljava/util/List;"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class read {

            /* JADX INFO: renamed from: read, reason: from kotlin metadata */
            private final List<Pair<ReadableObjectIdReferring, withAdditionalSerializers>> write = new ArrayList();

            /* JADX INFO: renamed from: write, reason: from kotlin metadata */
            private final IconCompatParcelizer RemoteActionCompatParcelizer;

            public read(IconCompatParcelizer iconCompatParcelizer) {
                this.RemoteActionCompatParcelizer = iconCompatParcelizer;
            }
        }

        public final int IconCompatParcelizer(String str, String str2) {
            AudioAttributesCompatParcelizer<? extends RemoteActionCompatParcelizer> audioAttributesCompatParcelizer = new AudioAttributesCompatParcelizer<>(_handleByNameInclusion.read(_handleByNameInclusion.RemoteActionCompatParcelizer(str2)), this.RemoteActionCompatParcelizer.length(), 0, str, 4, null);
            this.read.add(audioAttributesCompatParcelizer);
            this.write.add(audioAttributesCompatParcelizer);
            return this.read.size() - 1;
        }

        public final void write() {
            if (this.read.isEmpty()) {
                withStackTrace.AudioAttributesCompatParcelizer("Nothing to pop.");
            }
            this.read.remove(r0.size() - 1).RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer.length());
        }

        public final void read(int i) {
            if (i >= this.read.size()) {
                StringBuilder sb = new StringBuilder();
                sb.append(i);
                sb.append(" should be less than ");
                sb.append(this.read.size());
                withStackTrace.AudioAttributesCompatParcelizer(sb.toString());
            }
            while (this.read.size() - 1 >= i) {
                write();
            }
        }

        public final AbstractDeserializer RemoteActionCompatParcelizer() {
            String string = this.RemoteActionCompatParcelizer.toString();
            List<AudioAttributesCompatParcelizer<? extends RemoteActionCompatParcelizer>> list = this.write;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(list.get(i).write(this.RemoteActionCompatParcelizer.length()));
            }
            return new AbstractDeserializer(string, arrayList);
        }

        public final void AudioAttributesCompatParcelizer(getAnswerMap<? super AudioAttributesCompatParcelizer<? extends RemoteActionCompatParcelizer>, ? extends AudioAttributesCompatParcelizer<? extends RemoteActionCompatParcelizer>> getanswermap) {
            int size = this.write.size();
            for (int i = 0; i < size; i++) {
                this.write.set(i, AudioAttributesCompatParcelizer.INSTANCE.IconCompatParcelizer(getanswermap.invoke(AudioAttributesCompatParcelizer.write$default(this.write.get(i), 0, 1, null))));
            }
        }

        public final void read(getAnswerMap<? super AudioAttributesCompatParcelizer<? extends RemoteActionCompatParcelizer>, ? extends List<? extends AudioAttributesCompatParcelizer<? extends RemoteActionCompatParcelizer>>> getanswermap) {
            List<AudioAttributesCompatParcelizer<? extends RemoteActionCompatParcelizer>> list = this.write;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                List<? extends AudioAttributesCompatParcelizer<? extends RemoteActionCompatParcelizer>> listInvoke = getanswermap.invoke(AudioAttributesCompatParcelizer.write$default(list.get(i), 0, 1, null));
                ArrayList arrayList2 = new ArrayList(listInvoke.size());
                int size2 = listInvoke.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    arrayList2.add(AudioAttributesCompatParcelizer.INSTANCE.IconCompatParcelizer(listInvoke.get(i2)));
                }
                IntermediateLoginResponseBody.IconCompatParcelizer((Collection) arrayList, (Iterable) arrayList2);
            }
            this.write.clear();
            this.write.addAll(arrayList);
        }

        public IconCompatParcelizer() {
            this(0, 1, null);
        }
    }
}
