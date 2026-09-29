package kotlin;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.getSubject;

/* JADX INFO: loaded from: classes4.dex */
public abstract class TestSubModel<TAnnotation> {
    public abstract Iterable<TAnnotation> AudioAttributesCompatParcelizer();

    public abstract Preference AudioAttributesCompatParcelizer(Preference preference);

    public abstract boolean AudioAttributesImplApi26Parcelizer();

    public abstract getFilterText AudioAttributesImplBaseParcelizer();

    public abstract setSectionName IconCompatParcelizer();

    public abstract boolean IconCompatParcelizer(Preference preference);

    public abstract boolean MediaBrowserCompatCustomActionResultReceiver();

    public abstract boolean MediaBrowserCompatItemReceiver();

    public abstract VideoInfoJsonParser RemoteActionCompatParcelizer();

    public abstract getSlidesCount RemoteActionCompatParcelizer(Preference preference);

    public abstract boolean RemoteActionCompatParcelizer(TAnnotation tannotation, Preference preference);

    public abstract Iterable<TAnnotation> read(Preference preference);

    public abstract VideoInfo<TAnnotation> read();

    public abstract boolean read(Preference preference, Preference preference2);

    public abstract boolean write();

    public abstract boolean write(getValueBoolean getvalueboolean);

    private final VideoSubModel AudioAttributesImplBaseParcelizer(Preference preference) {
        getFilterText getfiltertextAudioAttributesImplBaseParcelizer = AudioAttributesImplBaseParcelizer();
        if (getfiltertextAudioAttributesImplBaseParcelizer.MediaBrowserCompatItemReceiver(getfiltertextAudioAttributesImplBaseParcelizer.onAddQueueItem(preference))) {
            return VideoSubModel.NULLABLE;
        }
        if (getfiltertextAudioAttributesImplBaseParcelizer.MediaBrowserCompatItemReceiver(getfiltertextAudioAttributesImplBaseParcelizer.handleMediaPlayPauseIfPendingOnHandler(preference))) {
            return null;
        }
        return VideoSubModel.NOT_NULL;
    }

    private final getSubject MediaBrowserCompatItemReceiver(Preference preference) {
        VideoSubModel videoSubModelAudioAttributesImplBaseParcelizer;
        VideoSubModel videoSubModelAudioAttributesImplBaseParcelizer2 = AudioAttributesImplBaseParcelizer(preference);
        HomeVideoModel homeVideoModel = null;
        if (videoSubModelAudioAttributesImplBaseParcelizer2 == null) {
            Preference preferenceAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(preference);
            videoSubModelAudioAttributesImplBaseParcelizer = preferenceAudioAttributesCompatParcelizer != null ? AudioAttributesImplBaseParcelizer(preferenceAudioAttributesCompatParcelizer) : null;
        } else {
            videoSubModelAudioAttributesImplBaseParcelizer = videoSubModelAudioAttributesImplBaseParcelizer2;
        }
        getFilterText getfiltertextAudioAttributesImplBaseParcelizer = AudioAttributesImplBaseParcelizer();
        CourseConfigV2AnnouncementBanner courseConfigV2AnnouncementBanner = CourseConfigV2AnnouncementBanner.write;
        if (CourseConfigV2AnnouncementBanner.AudioAttributesCompatParcelizer(RemoteActionCompatParcelizer(getfiltertextAudioAttributesImplBaseParcelizer.onAddQueueItem(preference)))) {
            homeVideoModel = HomeVideoModel.READ_ONLY;
        } else {
            CourseConfigV2AnnouncementBanner courseConfigV2AnnouncementBanner2 = CourseConfigV2AnnouncementBanner.write;
            if (CourseConfigV2AnnouncementBanner.RemoteActionCompatParcelizer(RemoteActionCompatParcelizer(getfiltertextAudioAttributesImplBaseParcelizer.handleMediaPlayPauseIfPendingOnHandler(preference)))) {
                homeVideoModel = HomeVideoModel.MUTABLE;
            }
        }
        return new getSubject(videoSubModelAudioAttributesImplBaseParcelizer, homeVideoModel, AudioAttributesImplBaseParcelizer().MediaBrowserCompatCustomActionResultReceiver(preference) || write(preference), videoSubModelAudioAttributesImplBaseParcelizer != videoSubModelAudioAttributesImplBaseParcelizer2);
    }

    private final getSubject write(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        List listRemoteActionCompatParcelizer;
        setSectionName setsectionnameIconCompatParcelizer;
        setDurationText setdurationtextRemoteActionCompatParcelizer;
        setDurationText setdurationtextAudioAttributesCompatParcelizer;
        Preference preference;
        isPermanent ispermanentOnCustomAction;
        if (audioAttributesCompatParcelizer.read() == null) {
            getFilterText getfiltertextAudioAttributesImplBaseParcelizer = AudioAttributesImplBaseParcelizer();
            getValueBoolean getvaluebooleanAudioAttributesCompatParcelizer = audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer();
            if ((getvaluebooleanAudioAttributesCompatParcelizer != null ? getfiltertextAudioAttributesImplBaseParcelizer.write(getvaluebooleanAudioAttributesCompatParcelizer) : null) == getItemTitle.IN) {
                getSubject.write writeVar = getSubject.AudioAttributesCompatParcelizer;
                return getSubject.write.AudioAttributesCompatParcelizer();
            }
        }
        boolean z = false;
        boolean z2 = audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer() == null;
        Preference preference2 = audioAttributesCompatParcelizer.read();
        if (preference2 == null || (listRemoteActionCompatParcelizer = read(preference2)) == null) {
            listRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }
        getFilterText getfiltertextAudioAttributesImplBaseParcelizer2 = AudioAttributesImplBaseParcelizer();
        Preference preference3 = audioAttributesCompatParcelizer.read();
        getValueBoolean getvaluebooleanIconCompatParcelizer = (preference3 == null || (ispermanentOnCustomAction = getfiltertextAudioAttributesImplBaseParcelizer2.onCustomAction(preference3)) == null) ? null : getfiltertextAudioAttributesImplBaseParcelizer2.IconCompatParcelizer(ispermanentOnCustomAction);
        boolean z3 = IconCompatParcelizer() == setSectionName.TYPE_PARAMETER_BOUNDS;
        if (z2) {
            if (!z3 && MediaBrowserCompatCustomActionResultReceiver() && (preference = audioAttributesCompatParcelizer.read()) != null && IconCompatParcelizer(preference)) {
                Iterable<TAnnotation> iterableAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
                ArrayList arrayList = new ArrayList();
                for (TAnnotation tannotation : iterableAudioAttributesCompatParcelizer) {
                    if (!read().write(tannotation)) {
                        arrayList.add(tannotation);
                    }
                }
                listRemoteActionCompatParcelizer = IntermediateLoginResponseBody.AudioAttributesCompatParcelizer((Collection) arrayList, (Iterable) listRemoteActionCompatParcelizer);
            } else {
                listRemoteActionCompatParcelizer = IntermediateLoginResponseBody.read((Iterable) AudioAttributesCompatParcelizer(), (Iterable) listRemoteActionCompatParcelizer);
            }
        }
        HomeVideoModel homeVideoModelIconCompatParcelizer = read().IconCompatParcelizer((Iterable) listRemoteActionCompatParcelizer);
        setDurationText setdurationtextAudioAttributesCompatParcelizer2 = read().AudioAttributesCompatParcelizer(listRemoteActionCompatParcelizer, new IconCompatParcelizer(this, audioAttributesCompatParcelizer));
        if (setdurationtextAudioAttributesCompatParcelizer2 != null) {
            VideoSubModel videoSubModelAudioAttributesCompatParcelizer = setdurationtextAudioAttributesCompatParcelizer2.AudioAttributesCompatParcelizer();
            if (setdurationtextAudioAttributesCompatParcelizer2.AudioAttributesCompatParcelizer() == VideoSubModel.NOT_NULL && getvaluebooleanIconCompatParcelizer != null) {
                z = true;
            }
            return new getSubject(videoSubModelAudioAttributesCompatParcelizer, homeVideoModelIconCompatParcelizer, z, setdurationtextAudioAttributesCompatParcelizer2.write());
        }
        if (z2 || z3) {
            setsectionnameIconCompatParcelizer = IconCompatParcelizer();
        } else {
            setsectionnameIconCompatParcelizer = setSectionName.TYPE_USE;
        }
        VideoInfoJsonParser videoInfoJsonParserWrite = audioAttributesCompatParcelizer.write();
        NestfputmTitle nestfputmTitleRemoteActionCompatParcelizer = videoInfoJsonParserWrite != null ? videoInfoJsonParserWrite.RemoteActionCompatParcelizer(setsectionnameIconCompatParcelizer) : null;
        setDurationText setdurationtextAudioAttributesCompatParcelizer3 = getvaluebooleanIconCompatParcelizer != null ? AudioAttributesCompatParcelizer(getvaluebooleanIconCompatParcelizer) : null;
        if (setdurationtextAudioAttributesCompatParcelizer3 == null || (setdurationtextRemoteActionCompatParcelizer = setDurationText.AudioAttributesCompatParcelizer(setdurationtextAudioAttributesCompatParcelizer3, VideoSubModel.NOT_NULL, false, 2)) == null) {
            setdurationtextRemoteActionCompatParcelizer = nestfputmTitleRemoteActionCompatParcelizer != null ? nestfputmTitleRemoteActionCompatParcelizer.RemoteActionCompatParcelizer() : null;
        }
        boolean z4 = (setdurationtextAudioAttributesCompatParcelizer3 != null ? setdurationtextAudioAttributesCompatParcelizer3.AudioAttributesCompatParcelizer() : null) == VideoSubModel.NOT_NULL || !(getvaluebooleanIconCompatParcelizer == null || nestfputmTitleRemoteActionCompatParcelizer == null || !nestfputmTitleRemoteActionCompatParcelizer.IconCompatParcelizer());
        getValueBoolean getvaluebooleanAudioAttributesCompatParcelizer2 = audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer();
        if (getvaluebooleanAudioAttributesCompatParcelizer2 == null || (setdurationtextAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(getvaluebooleanAudioAttributesCompatParcelizer2)) == null) {
            setdurationtextAudioAttributesCompatParcelizer = null;
        } else if (setdurationtextAudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer() == VideoSubModel.NULLABLE) {
            setdurationtextAudioAttributesCompatParcelizer = setDurationText.AudioAttributesCompatParcelizer(setdurationtextAudioAttributesCompatParcelizer, VideoSubModel.FORCE_FLEXIBILITY, false, 2);
        }
        setDurationText setdurationtextIconCompatParcelizer = IconCompatParcelizer(setdurationtextAudioAttributesCompatParcelizer, setdurationtextRemoteActionCompatParcelizer);
        VideoSubModel videoSubModelAudioAttributesCompatParcelizer2 = setdurationtextIconCompatParcelizer != null ? setdurationtextIconCompatParcelizer.AudioAttributesCompatParcelizer() : null;
        if (setdurationtextIconCompatParcelizer != null && setdurationtextIconCompatParcelizer.write()) {
            z = true;
        }
        return new getSubject(videoSubModelAudioAttributesCompatParcelizer2, homeVideoModelIconCompatParcelizer, z4, z);
    }

    static final class IconCompatParcelizer extends MagicModuleUseCase implements getAnswerMap<TAnnotation, Boolean> {
        private /* synthetic */ TestSubModel<TAnnotation> IconCompatParcelizer;
        private /* synthetic */ AudioAttributesCompatParcelizer RemoteActionCompatParcelizer;

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Boolean invoke(TAnnotation tannotation) {
            toMagicModuleMetaRepoModel.write(tannotation, "");
            return Boolean.valueOf(this.IconCompatParcelizer.RemoteActionCompatParcelizer(tannotation, this.RemoteActionCompatParcelizer.read()));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IconCompatParcelizer(TestSubModel<TAnnotation> testSubModel, AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
            super(1);
            this.IconCompatParcelizer = testSubModel;
            this.RemoteActionCompatParcelizer = audioAttributesCompatParcelizer;
        }
    }

    private static setDurationText IconCompatParcelizer(setDurationText setdurationtext, setDurationText setdurationtext2) {
        return (setdurationtext == null || (setdurationtext2 != null && ((setdurationtext.write() && !setdurationtext2.write()) || ((setdurationtext.write() || !setdurationtext2.write()) && (setdurationtext.AudioAttributesCompatParcelizer().compareTo(setdurationtext2.AudioAttributesCompatParcelizer()) < 0 || setdurationtext.AudioAttributesCompatParcelizer().compareTo(setdurationtext2.AudioAttributesCompatParcelizer()) <= 0))))) ? setdurationtext2 : setdurationtext;
    }

    private final setDurationText AudioAttributesCompatParcelizer(getValueBoolean getvalueboolean) {
        ArrayList arrayList;
        VideoSubModel videoSubModel;
        getFilterText getfiltertextAudioAttributesImplBaseParcelizer = AudioAttributesImplBaseParcelizer();
        if (!write(getvalueboolean)) {
            return null;
        }
        List<Preference> listAudioAttributesCompatParcelizer = getfiltertextAudioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer(getvalueboolean);
        List<Preference> list = listAudioAttributesCompatParcelizer;
        boolean z = list instanceof Collection;
        if (!z || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (!getfiltertextAudioAttributesImplBaseParcelizer.MediaBrowserCompatSearchResultReceiver((Preference) it.next())) {
                    if (!z || !list.isEmpty()) {
                        Iterator<T> it2 = list.iterator();
                        while (it2.hasNext()) {
                            if (AudioAttributesImplBaseParcelizer((Preference) it2.next()) != null) {
                                arrayList = listAudioAttributesCompatParcelizer;
                                break;
                            }
                        }
                    }
                    if (!z || !list.isEmpty()) {
                        Iterator<T> it3 = list.iterator();
                        while (it3.hasNext()) {
                            if (AudioAttributesCompatParcelizer((Preference) it3.next()) != null) {
                                ArrayList arrayList2 = new ArrayList();
                                Iterator<T> it4 = list.iterator();
                                while (it4.hasNext()) {
                                    Preference preferenceAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer((Preference) it4.next());
                                    if (preferenceAudioAttributesCompatParcelizer != null) {
                                        arrayList2.add(preferenceAudioAttributesCompatParcelizer);
                                    }
                                }
                                arrayList = arrayList2;
                                List<Preference> list2 = arrayList;
                                if ((list2 instanceof Collection) && list2.isEmpty()) {
                                    videoSubModel = VideoSubModel.NULLABLE;
                                } else {
                                    Iterator<T> it5 = list2.iterator();
                                    while (it5.hasNext()) {
                                        if (!getfiltertextAudioAttributesImplBaseParcelizer.RatingCompat((Preference) it5.next())) {
                                            videoSubModel = VideoSubModel.NOT_NULL;
                                            break;
                                        }
                                    }
                                    videoSubModel = VideoSubModel.NULLABLE;
                                }
                                return new setDurationText(videoSubModel, arrayList != listAudioAttributesCompatParcelizer);
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    public final getAnswerMap<Integer, getSubject> IconCompatParcelizer(Preference preference, Iterable<? extends Preference> iterable, VideoSubModelCompanion videoSubModelCompanion, boolean z) {
        int size;
        Preference preference2;
        toMagicModuleMetaRepoModel.write(preference, "");
        toMagicModuleMetaRepoModel.write(iterable, "");
        List<AudioAttributesCompatParcelizer> listAudioAttributesImplApi21Parcelizer = AudioAttributesImplApi21Parcelizer(preference);
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(iterable, 10));
        Iterator<? extends Preference> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(AudioAttributesImplApi21Parcelizer(it.next()));
        }
        ArrayList arrayList2 = arrayList;
        if (!AudioAttributesImplApi26Parcelizer() || ((iterable instanceof Collection) && ((Collection) iterable).isEmpty())) {
            size = listAudioAttributesImplApi21Parcelizer.size();
        } else {
            Iterator<? extends Preference> it2 = iterable.iterator();
            while (it2.hasNext()) {
                if (!read(preference, it2.next())) {
                    size = 1;
                    break;
                }
            }
            size = listAudioAttributesImplApi21Parcelizer.size();
        }
        getSubject[] getsubjectArr = new getSubject[size];
        int i = 0;
        while (i < size) {
            getSubject getsubjectWrite = write(listAudioAttributesImplApi21Parcelizer.get(i));
            ArrayList arrayList3 = new ArrayList();
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = (AudioAttributesCompatParcelizer) IntermediateLoginResponseBody.read((List) it3.next(), i);
                getSubject getsubjectMediaBrowserCompatItemReceiver = (audioAttributesCompatParcelizer == null || (preference2 = audioAttributesCompatParcelizer.read()) == null) ? null : MediaBrowserCompatItemReceiver(preference2);
                if (getsubjectMediaBrowserCompatItemReceiver != null) {
                    arrayList3.add(getsubjectMediaBrowserCompatItemReceiver);
                }
            }
            getsubjectArr[i] = LessonIndex.AudioAttributesCompatParcelizer(getsubjectWrite, arrayList3, i == 0 && AudioAttributesImplApi26Parcelizer(), i == 0 && write(), z);
            i++;
        }
        return new read(videoSubModelCompanion, getsubjectArr);
    }

    static final class read extends MagicModuleUseCase implements getAnswerMap<Integer, getSubject> {
        private /* synthetic */ VideoSubModelCompanion IconCompatParcelizer;
        private /* synthetic */ getSubject[] RemoteActionCompatParcelizer;

        private getSubject AudioAttributesCompatParcelizer(int i) {
            Map<Integer, getSubject> mapIconCompatParcelizer;
            getSubject getsubject;
            VideoSubModelCompanion videoSubModelCompanion = this.IconCompatParcelizer;
            if (videoSubModelCompanion != null && (mapIconCompatParcelizer = videoSubModelCompanion.IconCompatParcelizer()) != null && (getsubject = mapIconCompatParcelizer.get(Integer.valueOf(i))) != null) {
                return getsubject;
            }
            getSubject[] getsubjectArr = this.RemoteActionCompatParcelizer;
            if (i >= 0 && i <= getOrderDetails.MediaDescriptionCompat(getsubjectArr)) {
                return getsubjectArr[i];
            }
            getSubject.write writeVar = getSubject.AudioAttributesCompatParcelizer;
            return getSubject.write.AudioAttributesCompatParcelizer();
        }

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getSubject invoke(Integer num) {
            return AudioAttributesCompatParcelizer(num.intValue());
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        read(VideoSubModelCompanion videoSubModelCompanion, getSubject[] getsubjectArr) {
            super(1);
            this.IconCompatParcelizer = videoSubModelCompanion;
            this.RemoteActionCompatParcelizer = getsubjectArr;
        }
    }

    private final <T> void RemoteActionCompatParcelizer(T t, List<T> list, getAnswerMap<? super T, ? extends Iterable<? extends T>> getanswermap) {
        list.add(t);
        Iterable<? extends T> iterableInvoke = getanswermap.invoke(t);
        if (iterableInvoke != null) {
            Iterator<? extends T> it = iterableInvoke.iterator();
            while (it.hasNext()) {
                RemoteActionCompatParcelizer(it.next(), list, getanswermap);
            }
        }
    }

    private final <T> List<T> read(T t, getAnswerMap<? super T, ? extends Iterable<? extends T>> getanswermap) {
        ArrayList arrayList = new ArrayList(1);
        RemoteActionCompatParcelizer(t, arrayList, getanswermap);
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final VideoInfoJsonParser RemoteActionCompatParcelizer(Preference preference, VideoInfoJsonParser videoInfoJsonParser) {
        return read().IconCompatParcelizer(videoInfoJsonParser, read(preference));
    }

    private final List<AudioAttributesCompatParcelizer> AudioAttributesImplApi21Parcelizer(Preference preference) {
        return read(new AudioAttributesCompatParcelizer(preference, RemoteActionCompatParcelizer(preference, RemoteActionCompatParcelizer()), null), new RemoteActionCompatParcelizer(this, AudioAttributesImplBaseParcelizer()));
    }

    static final class RemoteActionCompatParcelizer extends MagicModuleUseCase implements getAnswerMap<AudioAttributesCompatParcelizer, Iterable<? extends AudioAttributesCompatParcelizer>> {
        private /* synthetic */ TestSubModel<TAnnotation> AudioAttributesCompatParcelizer;
        private /* synthetic */ getFilterText RemoteActionCompatParcelizer;

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Iterable<AudioAttributesCompatParcelizer> invoke(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
            isPermanent ispermanentOnCustomAction;
            List<getValueBoolean> list;
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizer2;
            TaxInfo taxInfoWrite;
            toMagicModuleMetaRepoModel.write(audioAttributesCompatParcelizer, "");
            ArrayList arrayList = null;
            if (this.AudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver()) {
                Preference preference = audioAttributesCompatParcelizer.read();
                if (((preference == null || (taxInfoWrite = this.RemoteActionCompatParcelizer.write(preference)) == null) ? null : this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(taxInfoWrite)) != null) {
                    return null;
                }
            }
            Preference preference2 = audioAttributesCompatParcelizer.read();
            if (preference2 != null && (ispermanentOnCustomAction = this.RemoteActionCompatParcelizer.onCustomAction(preference2)) != null && (list = this.RemoteActionCompatParcelizer.read(ispermanentOnCustomAction)) != null) {
                List<getValueBoolean> list2 = list;
                List<setPermanent> listAudioAttributesCompatParcelizer = this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(audioAttributesCompatParcelizer.read());
                getFilterText getfiltertext = this.RemoteActionCompatParcelizer;
                TestSubModel<TAnnotation> testSubModel = this.AudioAttributesCompatParcelizer;
                Iterator<T> it = list2.iterator();
                Iterator<T> it2 = listAudioAttributesCompatParcelizer.iterator();
                ArrayList arrayList2 = new ArrayList(Math.min(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list2, 10), IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) listAudioAttributesCompatParcelizer, 10)));
                while (it.hasNext() && it2.hasNext()) {
                    Object next = it.next();
                    setPermanent setpermanent = (setPermanent) it2.next();
                    getValueBoolean getvalueboolean = (getValueBoolean) next;
                    if (getfiltertext.write(setpermanent)) {
                        audioAttributesCompatParcelizer2 = new AudioAttributesCompatParcelizer(null, audioAttributesCompatParcelizer.write(), getvalueboolean);
                    } else {
                        Preference preferenceIconCompatParcelizer = getfiltertext.IconCompatParcelizer(setpermanent);
                        audioAttributesCompatParcelizer2 = new AudioAttributesCompatParcelizer(preferenceIconCompatParcelizer, testSubModel.RemoteActionCompatParcelizer(preferenceIconCompatParcelizer, audioAttributesCompatParcelizer.write()), getvalueboolean);
                    }
                    arrayList2.add(audioAttributesCompatParcelizer2);
                }
                arrayList = arrayList2;
            }
            return arrayList;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        RemoteActionCompatParcelizer(TestSubModel<TAnnotation> testSubModel, getFilterText getfiltertext) {
            super(1);
            this.AudioAttributesCompatParcelizer = testSubModel;
            this.RemoteActionCompatParcelizer = getfiltertext;
        }
    }

    static final class AudioAttributesCompatParcelizer {
        private final VideoInfoJsonParser RemoteActionCompatParcelizer;
        private final Preference read;
        private final getValueBoolean write;

        public AudioAttributesCompatParcelizer(Preference preference, VideoInfoJsonParser videoInfoJsonParser, getValueBoolean getvalueboolean) {
            this.read = preference;
            this.RemoteActionCompatParcelizer = videoInfoJsonParser;
            this.write = getvalueboolean;
        }

        public final Preference read() {
            return this.read;
        }

        public final VideoInfoJsonParser write() {
            return this.RemoteActionCompatParcelizer;
        }

        public final getValueBoolean AudioAttributesCompatParcelizer() {
            return this.write;
        }
    }

    public boolean write(Preference preference) {
        toMagicModuleMetaRepoModel.write(preference, "");
        return false;
    }
}
