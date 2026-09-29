package kotlin;

import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.getZenArea;

/* JADX INFO: loaded from: classes4.dex */
public abstract class VideoInfo<TAnnotation> {
    private static final Map<String, setSectionName> AudioAttributesCompatParcelizer;
    private final ConcurrentHashMap<Object, TAnnotation> RemoteActionCompatParcelizer;
    private final getMediaId write;

    protected abstract getNotesCount IconCompatParcelizer(TAnnotation tannotation);

    protected abstract Iterable<TAnnotation> RemoteActionCompatParcelizer(TAnnotation tannotation);

    protected abstract Object read(TAnnotation tannotation);

    protected abstract Iterable<String> write(TAnnotation tannotation, boolean z);

    public VideoInfo(getMediaId getmediaid) {
        toMagicModuleMetaRepoModel.write(getmediaid, "");
        this.write = getmediaid;
        this.RemoteActionCompatParcelizer = new ConcurrentHashMap<>();
    }

    private final TAnnotation IconCompatParcelizer(TAnnotation tannotation, getNotesCount getnotescount) {
        for (TAnnotation tannotation2 : RemoteActionCompatParcelizer(tannotation)) {
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(IconCompatParcelizer(tannotation2), getnotescount)) {
                return tannotation2;
            }
        }
        return null;
    }

    private final boolean AudioAttributesCompatParcelizer(TAnnotation tannotation, getNotesCount getnotescount) {
        Iterable<TAnnotation> iterableRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(tannotation);
        if ((iterableRemoteActionCompatParcelizer instanceof Collection) && ((Collection) iterableRemoteActionCompatParcelizer).isEmpty()) {
            return false;
        }
        Iterator<TAnnotation> it = iterableRemoteActionCompatParcelizer.iterator();
        while (it.hasNext()) {
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(IconCompatParcelizer(it.next()), getnotescount)) {
                return true;
            }
        }
        return false;
    }

    private TAnnotation MediaDescriptionCompat(TAnnotation tannotation) {
        TAnnotation tannotationMediaDescriptionCompat;
        toMagicModuleMetaRepoModel.write(tannotation, "");
        if (this.write.AudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer()) {
            return null;
        }
        if (IntermediateLoginResponseBody.AudioAttributesCompatParcelizer(setBodyContents.IconCompatParcelizer(), IconCompatParcelizer(tannotation)) || AudioAttributesCompatParcelizer(tannotation, setBodyContents.AudioAttributesImplApi26Parcelizer())) {
            return tannotation;
        }
        if (!AudioAttributesCompatParcelizer(tannotation, setBodyContents.AudioAttributesImplBaseParcelizer())) {
            return null;
        }
        ConcurrentHashMap<Object, TAnnotation> concurrentHashMap = this.RemoteActionCompatParcelizer;
        Object obj = read(tannotation);
        TAnnotation tannotation2 = concurrentHashMap.get(obj);
        if (tannotation2 != null) {
            return tannotation2;
        }
        Iterator<TAnnotation> it = RemoteActionCompatParcelizer(tannotation).iterator();
        while (true) {
            if (!it.hasNext()) {
                tannotationMediaDescriptionCompat = null;
                break;
            }
            tannotationMediaDescriptionCompat = MediaDescriptionCompat(it.next());
            if (tannotationMediaDescriptionCompat != null) {
                break;
            }
        }
        if (tannotationMediaDescriptionCompat == null) {
            return null;
        }
        TAnnotation tannotationPutIfAbsent = concurrentHashMap.putIfAbsent(obj, tannotationMediaDescriptionCompat);
        return tannotationPutIfAbsent == null ? tannotationMediaDescriptionCompat : tannotationPutIfAbsent;
    }

    private final NestfputmTitle AudioAttributesImplApi21Parcelizer(TAnnotation tannotation) {
        NestfputmTitle nestfputmTitle;
        if (this.write.read() || (nestfputmTitle = setBodyContents.read().get(IconCompatParcelizer(tannotation))) == null) {
            return null;
        }
        getExamDurationSeconds getexamdurationsecondsMediaBrowserCompatItemReceiver = MediaBrowserCompatItemReceiver(tannotation);
        if (getexamdurationsecondsMediaBrowserCompatItemReceiver == getExamDurationSeconds.IGNORE) {
            getexamdurationsecondsMediaBrowserCompatItemReceiver = null;
        }
        if (getexamdurationsecondsMediaBrowserCompatItemReceiver == null) {
            return null;
        }
        return NestfputmTitle.read(setDurationText.AudioAttributesCompatParcelizer(nestfputmTitle.RemoteActionCompatParcelizer(), null, getexamdurationsecondsMediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer(), 1), nestfputmTitle.IconCompatParcelizer, nestfputmTitle.write);
    }

    private final getExamDurationSeconds MediaBrowserCompatItemReceiver(TAnnotation tannotation) {
        getNotesCount getnotescountIconCompatParcelizer = IconCompatParcelizer(tannotation);
        if (getnotescountIconCompatParcelizer != null && setBodyContents.RemoteActionCompatParcelizer().containsKey(getnotescountIconCompatParcelizer)) {
            return this.write.RemoteActionCompatParcelizer().invoke(getnotescountIconCompatParcelizer);
        }
        return MediaBrowserCompatCustomActionResultReceiver(tannotation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static Set<setSectionName> IconCompatParcelizer(Set<? extends setSectionName> set) {
        return set.contains(setSectionName.TYPE_USE) ? getKycMessage.RemoteActionCompatParcelizer(getKycMessage.IconCompatParcelizer((Set<? extends setSectionName>) getOrderDetails.handleMediaPlayPauseIfPendingOnHandler(setSectionName.values()), setSectionName.TYPE_PARAMETER_BOUNDS), set) : set;
    }

    private final Pair<TAnnotation, Set<setSectionName>> AudioAttributesImplApi26Parcelizer(TAnnotation tannotation) {
        TAnnotation tannotationIconCompatParcelizer;
        TAnnotation next;
        if (this.write.AudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer() || (tannotationIconCompatParcelizer = IconCompatParcelizer(tannotation, setBodyContents.AudioAttributesCompatParcelizer())) == null) {
            return null;
        }
        Iterator<TAnnotation> it = RemoteActionCompatParcelizer(tannotation).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (MediaDescriptionCompat(next) != null) {
                break;
            }
        }
        if (next == null) {
            return null;
        }
        Iterable<String> iterableWrite = write(tannotationIconCompatParcelizer, true);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<String> it2 = iterableWrite.iterator();
        while (it2.hasNext()) {
            setSectionName setsectionname = AudioAttributesCompatParcelizer.get(it2.next());
            if (setsectionname != null) {
                linkedHashSet.add(setsectionname);
            }
        }
        return new Pair<>(next, IconCompatParcelizer((Set<? extends setSectionName>) linkedHashSet));
    }

    public final boolean write(TAnnotation tannotation) {
        toMagicModuleMetaRepoModel.write(tannotation, "");
        TAnnotation tannotationIconCompatParcelizer = IconCompatParcelizer(tannotation, getZenArea.RemoteActionCompatParcelizer.setSessionImpl);
        if (tannotationIconCompatParcelizer == null) {
            return false;
        }
        Iterable<String> iterableWrite = write(tannotationIconCompatParcelizer, false);
        if ((iterableWrite instanceof Collection) && ((Collection) iterableWrite).isEmpty()) {
            return false;
        }
        Iterator<String> it = iterableWrite.iterator();
        while (it.hasNext()) {
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) it.next(), (Object) FeaturedCard.MediaBrowserCompatCustomActionResultReceiver.name())) {
                return true;
            }
        }
        return false;
    }

    private final getExamDurationSeconds MediaBrowserCompatCustomActionResultReceiver(TAnnotation tannotation) {
        getExamDurationSeconds getexamdurationsecondsAudioAttributesImplBaseParcelizer = AudioAttributesImplBaseParcelizer(tannotation);
        return getexamdurationsecondsAudioAttributesImplBaseParcelizer != null ? getexamdurationsecondsAudioAttributesImplBaseParcelizer : this.write.AudioAttributesCompatParcelizer().RemoteActionCompatParcelizer();
    }

    private final getExamDurationSeconds AudioAttributesImplBaseParcelizer(TAnnotation tannotation) {
        Iterable<String> iterableWrite;
        String str;
        getExamDurationSeconds getexamdurationseconds = this.write.AudioAttributesCompatParcelizer().read().get(IconCompatParcelizer(tannotation));
        if (getexamdurationseconds != null) {
            return getexamdurationseconds;
        }
        TAnnotation tannotationIconCompatParcelizer = IconCompatParcelizer(tannotation, setBodyContents.write());
        if (tannotationIconCompatParcelizer == null || (iterableWrite = write(tannotationIconCompatParcelizer, false)) == null || (str = (String) IntermediateLoginResponseBody.MediaMetadataCompat(iterableWrite)) == null) {
            return null;
        }
        getExamDurationSeconds getexamdurationsecondsIconCompatParcelizer = this.write.AudioAttributesCompatParcelizer().IconCompatParcelizer();
        if (getexamdurationsecondsIconCompatParcelizer != null) {
            return getexamdurationsecondsIconCompatParcelizer;
        }
        int iHashCode = str.hashCode();
        if (iHashCode != -2137067054) {
            if (iHashCode != -1838656823) {
                if (iHashCode == 2656902 && str.equals("WARN")) {
                    return getExamDurationSeconds.WARN;
                }
            } else if (str.equals("STRICT")) {
                return getExamDurationSeconds.STRICT;
            }
        } else if (str.equals("IGNORE")) {
            return getExamDurationSeconds.IGNORE;
        }
        return null;
    }

    private final setDurationText read(TAnnotation tannotation, getAnswerMap<? super TAnnotation, Boolean> getanswermap) {
        setDurationText setdurationtextIconCompatParcelizer;
        setDurationText setdurationtextIconCompatParcelizer2 = IconCompatParcelizer(tannotation, getanswermap.invoke(tannotation).booleanValue());
        if (setdurationtextIconCompatParcelizer2 != null) {
            return setdurationtextIconCompatParcelizer2;
        }
        TAnnotation tannotationMediaDescriptionCompat = MediaDescriptionCompat(tannotation);
        if (tannotationMediaDescriptionCompat == null) {
            return null;
        }
        getExamDurationSeconds getexamdurationsecondsMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver(tannotation);
        if (getexamdurationsecondsMediaBrowserCompatCustomActionResultReceiver.write() || (setdurationtextIconCompatParcelizer = IconCompatParcelizer(tannotationMediaDescriptionCompat, getanswermap.invoke(tannotationMediaDescriptionCompat).booleanValue())) == null) {
            return null;
        }
        return setDurationText.AudioAttributesCompatParcelizer(setdurationtextIconCompatParcelizer, null, getexamdurationsecondsMediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer(), 1);
    }

    private final NestfputmTitle AudioAttributesCompatParcelizer(TAnnotation tannotation) {
        setDurationText setdurationtext;
        NestfputmTitle nestfputmTitleAudioAttributesImplApi21Parcelizer = AudioAttributesImplApi21Parcelizer(tannotation);
        if (nestfputmTitleAudioAttributesImplApi21Parcelizer != null) {
            return nestfputmTitleAudioAttributesImplApi21Parcelizer;
        }
        Pair<TAnnotation, Set<setSectionName>> pairAudioAttributesImplApi26Parcelizer = AudioAttributesImplApi26Parcelizer(tannotation);
        if (pairAudioAttributesImplApi26Parcelizer == null) {
            return null;
        }
        TAnnotation tannotationRemoteActionCompatParcelizer = pairAudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer();
        Set<setSectionName> set = pairAudioAttributesImplApi26Parcelizer.read();
        getExamDurationSeconds getexamdurationsecondsAudioAttributesImplBaseParcelizer = AudioAttributesImplBaseParcelizer(tannotation);
        if (getexamdurationsecondsAudioAttributesImplBaseParcelizer == null) {
            getexamdurationsecondsAudioAttributesImplBaseParcelizer = MediaBrowserCompatCustomActionResultReceiver(tannotationRemoteActionCompatParcelizer);
        }
        if (getexamdurationsecondsAudioAttributesImplBaseParcelizer.write() || (setdurationtext = read(tannotationRemoteActionCompatParcelizer, RemoteActionCompatParcelizer.IconCompatParcelizer)) == null) {
            return null;
        }
        return new NestfputmTitle(setDurationText.AudioAttributesCompatParcelizer(setdurationtext, null, getexamdurationsecondsAudioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer(), 1), set);
    }

    static final class RemoteActionCompatParcelizer extends MagicModuleUseCase implements getAnswerMap<TAnnotation, Boolean> {
        public static final RemoteActionCompatParcelizer IconCompatParcelizer = new RemoteActionCompatParcelizer();

        private static Boolean write(TAnnotation tannotation) {
            toMagicModuleMetaRepoModel.write(tannotation, "");
            return Boolean.FALSE;
        }

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ Boolean invoke(Object obj) {
            return write(obj);
        }

        RemoteActionCompatParcelizer() {
            super(1);
        }
    }

    public final VideoInfoJsonParser IconCompatParcelizer(VideoInfoJsonParser videoInfoJsonParser, Iterable<? extends TAnnotation> iterable) {
        EnumMap<setSectionName, NestfputmTitle> enumMapWrite;
        toMagicModuleMetaRepoModel.write(iterable, "");
        if (!this.write.read()) {
            ArrayList arrayList = new ArrayList();
            Iterator<? extends TAnnotation> it = iterable.iterator();
            while (it.hasNext()) {
                NestfputmTitle nestfputmTitleAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(it.next());
                if (nestfputmTitleAudioAttributesCompatParcelizer != null) {
                    arrayList.add(nestfputmTitleAudioAttributesCompatParcelizer);
                }
            }
            ArrayList<NestfputmTitle> arrayList2 = arrayList;
            if (!arrayList2.isEmpty()) {
                EnumMap enumMap = (videoInfoJsonParser == null || (enumMapWrite = videoInfoJsonParser.write()) == null) ? new EnumMap(setSectionName.class) : new EnumMap((EnumMap) enumMapWrite);
                boolean z = false;
                for (NestfputmTitle nestfputmTitle : arrayList2) {
                    Iterator<setSectionName> it2 = nestfputmTitle.read().iterator();
                    while (it2.hasNext()) {
                        enumMap.put(it2.next(), nestfputmTitle);
                        z = true;
                    }
                }
                if (z) {
                    return new VideoInfoJsonParser(enumMap);
                }
            }
        }
        return videoInfoJsonParser;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008e, code lost:
    
        if (r5.equals("ALWAYS") != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a2, code lost:
    
        if (r5.equals("NEVER") == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ab, code lost:
    
        if (r5.equals("MAYBE") != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ad, code lost:
    
        r5 = kotlin.VideoSubModel.NULLABLE;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final kotlin.setDurationText IconCompatParcelizer(TAnnotation r6, boolean r7) {
        /*
            Method dump skipped, instruction units count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.VideoInfo.IconCompatParcelizer(java.lang.Object, boolean):o.setDurationText");
    }

    static final class read {
        private read() {
        }

        public /* synthetic */ read(byte b) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        new read(0 == true ? 1 : 0);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (setSectionName setsectionname : setSectionName.values()) {
            String strIconCompatParcelizer = setsectionname.IconCompatParcelizer();
            if (linkedHashMap.get(strIconCompatParcelizer) == null) {
                linkedHashMap.put(strIconCompatParcelizer, setsectionname);
            }
        }
        AudioAttributesCompatParcelizer = linkedHashMap;
    }

    public final setDurationText AudioAttributesCompatParcelizer(Iterable<? extends TAnnotation> iterable, getAnswerMap<? super TAnnotation, Boolean> getanswermap) {
        toMagicModuleMetaRepoModel.write(iterable, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        Iterator<? extends TAnnotation> it = iterable.iterator();
        setDurationText setdurationtext = null;
        while (it.hasNext()) {
            setDurationText setdurationtext2 = read(it.next(), getanswermap);
            if (setdurationtext != null) {
                if (setdurationtext2 != null && !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(setdurationtext2, setdurationtext) && (!setdurationtext2.write() || setdurationtext.write())) {
                    if (setdurationtext2.write() || !setdurationtext.write()) {
                        return null;
                    }
                }
            }
            setdurationtext = setdurationtext2;
        }
        return setdurationtext;
    }

    public final HomeVideoModel IconCompatParcelizer(Iterable<? extends TAnnotation> iterable) {
        HomeVideoModel homeVideoModel;
        toMagicModuleMetaRepoModel.write(iterable, "");
        Iterator<? extends TAnnotation> it = iterable.iterator();
        HomeVideoModel homeVideoModel2 = null;
        while (it.hasNext()) {
            getNotesCount getnotescountIconCompatParcelizer = IconCompatParcelizer(it.next());
            if (CustomModule.handleMediaPlayPauseIfPendingOnHandler().contains(getnotescountIconCompatParcelizer)) {
                homeVideoModel = HomeVideoModel.READ_ONLY;
            } else if (CustomModule.MediaDescriptionCompat().contains(getnotescountIconCompatParcelizer)) {
                homeVideoModel = HomeVideoModel.MUTABLE;
            } else {
                continue;
            }
            if (homeVideoModel2 != null && homeVideoModel2 != homeVideoModel) {
                return null;
            }
            homeVideoModel2 = homeVideoModel;
        }
        return homeVideoModel2;
    }
}
