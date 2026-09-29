package kotlin;

import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import kotlin.ApplicationData;
import kotlin.Metadata;
import kotlin.component33;

/* JADX INFO: loaded from: classes4.dex */
public abstract class CourseConfigSerializerWhenMappings<R> implements isKycAuditIncomplete<R>, component25 {
    private final component33.IconCompatParcelizer<List<Annotation>> AudioAttributesCompatParcelizer;
    private final component33.IconCompatParcelizer<List<component27>> IconCompatParcelizer;
    private final component33.IconCompatParcelizer<ArrayList<ApplicationData>> RemoteActionCompatParcelizer;
    private final component33.IconCompatParcelizer<component26> read;
    private final component33.IconCompatParcelizer<Object[]> write;

    public abstract getDefaultBottomTab<?> AudioAttributesImplApi21Parcelizer();

    public abstract getNavDrawerKey AudioAttributesImplApi26Parcelizer();

    public abstract getDefaultBottomTab<?> AudioAttributesImplBaseParcelizer();

    public abstract boolean MediaDescriptionCompat();

    public abstract getTestHeaderTitle RatingCompat();

    public CourseConfigSerializerWhenMappings() {
        component33.IconCompatParcelizer<List<Annotation>> iconCompatParcelizer = component33.read(new AnonymousClass3(this));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(iconCompatParcelizer, "");
        this.AudioAttributesCompatParcelizer = iconCompatParcelizer;
        component33.IconCompatParcelizer<ArrayList<ApplicationData>> iconCompatParcelizer2 = component33.read(new AnonymousClass2(this));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(iconCompatParcelizer2, "");
        this.RemoteActionCompatParcelizer = iconCompatParcelizer2;
        component33.IconCompatParcelizer<component26> iconCompatParcelizer3 = component33.read(new AnonymousClass5(this));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(iconCompatParcelizer3, "");
        this.read = iconCompatParcelizer3;
        component33.IconCompatParcelizer<List<component27>> iconCompatParcelizer4 = component33.read(new AnonymousClass4(this));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(iconCompatParcelizer4, "");
        this.IconCompatParcelizer = iconCompatParcelizer4;
        component33.IconCompatParcelizer<Object[]> iconCompatParcelizer5 = component33.read(new AnonymousClass1(this));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(iconCompatParcelizer5, "");
        this.write = iconCompatParcelizer5;
    }

    /* JADX INFO: renamed from: o.CourseConfigSerializerWhenMappings$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0002\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00020\u00010\u0001\"\u0006\b\u0000\u0010\u0000 \u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"R", "", "", "write", "()Ljava/util/List;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass3 extends MagicModuleUseCase implements getCreatedOnDateMs<List<? extends Annotation>> {
        private /* synthetic */ CourseConfigSerializerWhenMappings<R> IconCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final List<Annotation> invoke() {
            return getCourseStrings.RemoteActionCompatParcelizer((fromJSONArray) this.IconCompatParcelizer.RatingCompat());
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass3(CourseConfigSerializerWhenMappings<? extends R> courseConfigSerializerWhenMappings) {
            super(0);
            this.IconCompatParcelizer = courseConfigSerializerWhenMappings;
        }
    }

    @Override // kotlin.McqFaq
    public List<Annotation> MediaBrowserCompatItemReceiver() {
        List<Annotation> listInvoke = this.AudioAttributesCompatParcelizer.invoke();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(listInvoke, "");
        return listInvoke;
    }

    /* JADX INFO: renamed from: o.CourseConfigSerializerWhenMappings$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00020\u00010\u0001\"\u0006\b\u0000\u0010\u0000 \u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"R", "Ljava/util/ArrayList;", "Lo/ApplicationData;", "write", "()Ljava/util/ArrayList;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass2 extends MagicModuleUseCase implements getCreatedOnDateMs<ArrayList<ApplicationData>> {
        private /* synthetic */ CourseConfigSerializerWhenMappings<R> write;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final ArrayList<ApplicationData> invoke() {
            int i;
            getTestHeaderTitle gettestheadertitleRatingCompat = this.write.RatingCompat();
            ArrayList<ApplicationData> arrayList = new ArrayList<>();
            int i2 = 0;
            if (this.write.MediaDescriptionCompat()) {
                i = 0;
            } else {
                CourseConfigV2TestTabItem courseConfigV2TestTabItemRemoteActionCompatParcelizer = getCourseStrings.RemoteActionCompatParcelizer((getVideoPageNotesTitle) gettestheadertitleRatingCompat);
                if (courseConfigV2TestTabItemRemoteActionCompatParcelizer != null) {
                    arrayList.add(new component23(this.write, 0, ApplicationData.IconCompatParcelizer.write, new C00242(courseConfigV2TestTabItemRemoteActionCompatParcelizer)));
                    i = 1;
                } else {
                    i = 0;
                }
                CourseConfigV2TestTabItem courseConfigV2TestTabItemMediaBrowserCompatCustomActionResultReceiver = gettestheadertitleRatingCompat.MediaBrowserCompatCustomActionResultReceiver();
                if (courseConfigV2TestTabItemMediaBrowserCompatCustomActionResultReceiver != null) {
                    arrayList.add(new component23(this.write, i, ApplicationData.IconCompatParcelizer.IconCompatParcelizer, new AnonymousClass5(courseConfigV2TestTabItemMediaBrowserCompatCustomActionResultReceiver)));
                    i++;
                }
            }
            int size = gettestheadertitleRatingCompat.aX_().size();
            while (i2 < size) {
                arrayList.add(new component23(this.write, i, ApplicationData.IconCompatParcelizer.RemoteActionCompatParcelizer, new AnonymousClass3(gettestheadertitleRatingCompat, i2)));
                i2++;
                i++;
            }
            if (this.write.MediaBrowserCompatMediaItem() && (gettestheadertitleRatingCompat instanceof setExpiredOn)) {
                ArrayList<ApplicationData> arrayList2 = arrayList;
                if (arrayList2.size() > 1) {
                    IntermediateLoginResponseBody.IconCompatParcelizer(arrayList2, new Comparator() { // from class: o.CourseConfigSerializerWhenMappings.2.4
                        @Override // java.util.Comparator
                        public final int compare(T t, T t2) {
                            return getConfigExpirySeconds.read(((ApplicationData) t).RemoteActionCompatParcelizer(), ((ApplicationData) t2).RemoteActionCompatParcelizer());
                        }
                    });
                }
            }
            arrayList.trimToSize();
            return arrayList;
        }

        /* JADX INFO: renamed from: o.CourseConfigSerializerWhenMappings$2$2, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0000 \u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"R", "Lo/CourseConfigV2SettingsItem;", "IconCompatParcelizer", "()Lo/CourseConfigV2SettingsItem;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        static final class C00242 extends MagicModuleUseCase implements getCreatedOnDateMs<CourseConfigV2SettingsItem> {
            private /* synthetic */ CourseConfigV2TestTabItem $AudioAttributesCompatParcelizer;

            @Override // kotlin.getCreatedOnDateMs
            /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public final CourseConfigV2SettingsItem invoke() {
                return this.$AudioAttributesCompatParcelizer;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00242(CourseConfigV2TestTabItem courseConfigV2TestTabItem) {
                super(0);
                this.$AudioAttributesCompatParcelizer = courseConfigV2TestTabItem;
            }
        }

        /* JADX INFO: renamed from: o.CourseConfigSerializerWhenMappings$2$5, reason: invalid class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0000 \u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"R", "Lo/CourseConfigV2SettingsItem;", "IconCompatParcelizer", "()Lo/CourseConfigV2SettingsItem;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        static final class AnonymousClass5 extends MagicModuleUseCase implements getCreatedOnDateMs<CourseConfigV2SettingsItem> {
            private /* synthetic */ CourseConfigV2TestTabItem $RemoteActionCompatParcelizer;

            @Override // kotlin.getCreatedOnDateMs
            /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public final CourseConfigV2SettingsItem invoke() {
                return this.$RemoteActionCompatParcelizer;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass5(CourseConfigV2TestTabItem courseConfigV2TestTabItem) {
                super(0);
                this.$RemoteActionCompatParcelizer = courseConfigV2TestTabItem;
            }
        }

        /* JADX INFO: renamed from: o.CourseConfigSerializerWhenMappings$2$3, reason: invalid class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0000 \u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"R", "Lo/CourseConfigV2SettingsItem;", "write", "()Lo/CourseConfigV2SettingsItem;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        static final class AnonymousClass3 extends MagicModuleUseCase implements getCreatedOnDateMs<CourseConfigV2SettingsItem> {
            private /* synthetic */ getTestHeaderTitle $IconCompatParcelizer;
            private /* synthetic */ int $read;

            @Override // kotlin.getCreatedOnDateMs
            /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
            public final CourseConfigV2SettingsItem invoke() {
                getMeta getmeta = this.$IconCompatParcelizer.aX_().get(this.$read);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getmeta, "");
                return getmeta;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(getTestHeaderTitle gettestheadertitle, int i) {
                super(0);
                this.$IconCompatParcelizer = gettestheadertitle;
                this.$read = i;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(CourseConfigSerializerWhenMappings<? extends R> courseConfigSerializerWhenMappings) {
            super(0);
            this.write = courseConfigSerializerWhenMappings;
        }
    }

    @Override // kotlin.isKycAuditIncomplete
    public List<ApplicationData> MediaBrowserCompatSearchResultReceiver() {
        ArrayList<ApplicationData> arrayListInvoke = this.RemoteActionCompatParcelizer.invoke();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(arrayListInvoke, "");
        return arrayListInvoke;
    }

    /* JADX INFO: renamed from: o.CourseConfigSerializerWhenMappings$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0006*\u00020\u00010\u0001\"\u0006\b\u0000\u0010\u0000 \u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"R", "Lo/component26;", "AudioAttributesCompatParcelizer", "()Lo/component26;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass5 extends MagicModuleUseCase implements getCreatedOnDateMs<component26> {
        private /* synthetic */ CourseConfigSerializerWhenMappings<R> read;

        /* JADX INFO: renamed from: o.CourseConfigSerializerWhenMappings$5$5, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0000 \u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"R", "Ljava/lang/reflect/Type;", "IconCompatParcelizer", "()Ljava/lang/reflect/Type;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        static final class C00255 extends MagicModuleUseCase implements getCreatedOnDateMs<Type> {
            private /* synthetic */ CourseConfigSerializerWhenMappings<R> read;

            @Override // kotlin.getCreatedOnDateMs
            /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public final Type invoke() {
                Type typeIconCompatParcelizer = this.read.IconCompatParcelizer();
                return typeIconCompatParcelizer == null ? this.read.AudioAttributesImplBaseParcelizer().getWrite() : typeIconCompatParcelizer;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C00255(CourseConfigSerializerWhenMappings<? extends R> courseConfigSerializerWhenMappings) {
                super(0);
                this.read = courseConfigSerializerWhenMappings;
            }
        }

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final component26 invoke() {
            getLink getlinkAudioAttributesImplBaseParcelizer = this.read.RatingCompat().AudioAttributesImplBaseParcelizer();
            toMagicModuleMetaRepoModel.write(getlinkAudioAttributesImplBaseParcelizer);
            return new component26(getlinkAudioAttributesImplBaseParcelizer, new C00255(this.read));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass5(CourseConfigSerializerWhenMappings<? extends R> courseConfigSerializerWhenMappings) {
            super(0);
            this.read = courseConfigSerializerWhenMappings;
        }
    }

    @Override // kotlin.isKycAuditIncomplete
    public deleteOfflineDownloadedFiles MediaMetadataCompat() {
        component26 component26VarInvoke = this.read.invoke();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(component26VarInvoke, "");
        return component26VarInvoke;
    }

    /* JADX INFO: renamed from: o.CourseConfigSerializerWhenMappings$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00020\u00010\u0001\"\u0006\b\u0000\u0010\u0000 \u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"R", "", "Lo/component27;", "read", "()Ljava/util/List;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass4 extends MagicModuleUseCase implements getCreatedOnDateMs<List<? extends component27>> {
        private /* synthetic */ CourseConfigSerializerWhenMappings<R> IconCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final List<component27> invoke() {
            List<getBadgeText> listMediaDescriptionCompat = this.IconCompatParcelizer.RatingCompat().MediaDescriptionCompat();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(listMediaDescriptionCompat, "");
            List<getBadgeText> list = listMediaDescriptionCompat;
            CourseConfigSerializerWhenMappings<R> courseConfigSerializerWhenMappings = this.IconCompatParcelizer;
            ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list, 10));
            for (getBadgeText getbadgetext : list) {
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getbadgetext, "");
                arrayList.add(new component27(courseConfigSerializerWhenMappings, getbadgetext));
            }
            return arrayList;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass4(CourseConfigSerializerWhenMappings<? extends R> courseConfigSerializerWhenMappings) {
            super(0);
            this.IconCompatParcelizer = courseConfigSerializerWhenMappings;
        }
    }

    protected final boolean MediaBrowserCompatMediaItem() {
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) MediaBrowserCompatCustomActionResultReceiver(), (Object) "<init>") && AudioAttributesImplApi26Parcelizer().RemoteActionCompatParcelizer().isAnnotation();
    }

    @Override // kotlin.isKycAuditIncomplete
    public R RemoteActionCompatParcelizer(Object... objArr) throws onEnvironmentVariableUpdate {
        toMagicModuleMetaRepoModel.write(objArr, "");
        try {
            return (R) AudioAttributesImplBaseParcelizer().RemoteActionCompatParcelizer(objArr);
        } catch (IllegalAccessException e) {
            throw new onEnvironmentVariableUpdate(e);
        }
    }

    @Override // kotlin.isKycAuditIncomplete
    public R AudioAttributesCompatParcelizer(Map<ApplicationData, ? extends Object> map) {
        toMagicModuleMetaRepoModel.write(map, "");
        return MediaBrowserCompatMediaItem() ? IconCompatParcelizer(map) : write(map);
    }

    /* JADX INFO: renamed from: o.CourseConfigSerializerWhenMappings$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0003\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00010\u0001\"\u0006\b\u0000\u0010\u0000 \u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"R", "", "", "AudioAttributesCompatParcelizer", "()[Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass1 extends MagicModuleUseCase implements getCreatedOnDateMs<Object[]> {
        private /* synthetic */ CourseConfigSerializerWhenMappings<R> write;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Object[] invoke() {
            int size = this.write.MediaBrowserCompatSearchResultReceiver().size() + (this.write.handleMediaPlayPauseIfPendingOnHandler() ? 1 : 0);
            int size2 = (this.write.MediaBrowserCompatSearchResultReceiver().size() + 31) / 32;
            Object[] objArr = new Object[size + size2 + 1];
            for (ApplicationData applicationData : this.write.MediaBrowserCompatSearchResultReceiver()) {
                if (applicationData.AudioAttributesCompatParcelizer() && !getCourseStrings.read(applicationData.read())) {
                    objArr[applicationData.write()] = getCourseStrings.IconCompatParcelizer(requireLoggedUser.read(applicationData.read()));
                } else if (applicationData.AudioAttributesImplApi21Parcelizer()) {
                    objArr[applicationData.write()] = CourseConfigSerializerWhenMappings.RemoteActionCompatParcelizer(applicationData.read());
                }
            }
            for (int i = 0; i < size2; i++) {
                objArr[size + i] = 0;
            }
            return objArr;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(CourseConfigSerializerWhenMappings<? extends R> courseConfigSerializerWhenMappings) {
            super(0);
            this.write = courseConfigSerializerWhenMappings;
        }
    }

    private final Object[] AudioAttributesCompatParcelizer() {
        return (Object[]) this.write.invoke().clone();
    }

    private R write(Map<ApplicationData, ? extends Object> map) throws onEnvironmentVariableUpdate {
        toMagicModuleMetaRepoModel.write(map, "");
        List<ApplicationData> listMediaBrowserCompatSearchResultReceiver = MediaBrowserCompatSearchResultReceiver();
        boolean z = false;
        if (listMediaBrowserCompatSearchResultReceiver.isEmpty()) {
            try {
                return (R) AudioAttributesImplBaseParcelizer().RemoteActionCompatParcelizer(handleMediaPlayPauseIfPendingOnHandler() ? new SampleVideos[]{null} : new SampleVideos[0]);
            } catch (IllegalAccessException e) {
                throw new onEnvironmentVariableUpdate(e);
            }
        }
        int size = listMediaBrowserCompatSearchResultReceiver.size() + (handleMediaPlayPauseIfPendingOnHandler() ? 1 : 0);
        Object[] objArrAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
        if (handleMediaPlayPauseIfPendingOnHandler()) {
            objArrAudioAttributesCompatParcelizer[listMediaBrowserCompatSearchResultReceiver.size()] = null;
        }
        int i = 0;
        for (ApplicationData applicationData : listMediaBrowserCompatSearchResultReceiver) {
            if (map.containsKey(applicationData)) {
                objArrAudioAttributesCompatParcelizer[applicationData.write()] = map.get(applicationData);
            } else if (applicationData.AudioAttributesCompatParcelizer()) {
                int i2 = (i / 32) + size;
                Object obj = objArrAudioAttributesCompatParcelizer[i2];
                toMagicModuleMetaRepoModel.read(obj, "");
                objArrAudioAttributesCompatParcelizer[i2] = Integer.valueOf(((Integer) obj).intValue() | (1 << (i % 32)));
                z = true;
            } else if (!applicationData.AudioAttributesImplApi21Parcelizer()) {
                throw new IllegalArgumentException("No argument provided for a required parameter: ".concat(String.valueOf(applicationData)));
            }
            if (applicationData.IconCompatParcelizer() == ApplicationData.IconCompatParcelizer.RemoteActionCompatParcelizer) {
                i++;
            }
        }
        if (!z) {
            try {
                getDefaultBottomTab<?> getdefaultbottomtabAudioAttributesImplBaseParcelizer = AudioAttributesImplBaseParcelizer();
                Object[] objArrCopyOf = Arrays.copyOf(objArrAudioAttributesCompatParcelizer, size);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(objArrCopyOf, "");
                return (R) getdefaultbottomtabAudioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer(objArrCopyOf);
            } catch (IllegalAccessException e2) {
                throw new onEnvironmentVariableUpdate(e2);
            }
        }
        getDefaultBottomTab<?> getdefaultbottomtabAudioAttributesImplApi21Parcelizer = AudioAttributesImplApi21Parcelizer();
        if (getdefaultbottomtabAudioAttributesImplApi21Parcelizer == null) {
            StringBuilder sb = new StringBuilder("This callable does not support a default call: ");
            sb.append(RatingCompat());
            throw new component28(sb.toString());
        }
        try {
            return (R) getdefaultbottomtabAudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer(objArrAudioAttributesCompatParcelizer);
        } catch (IllegalAccessException e3) {
            throw new onEnvironmentVariableUpdate(e3);
        }
    }

    private final R IconCompatParcelizer(Map<ApplicationData, ? extends Object> map) throws onEnvironmentVariableUpdate {
        Object objRemoteActionCompatParcelizer;
        List<ApplicationData> listMediaBrowserCompatSearchResultReceiver = MediaBrowserCompatSearchResultReceiver();
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) listMediaBrowserCompatSearchResultReceiver, 10));
        for (ApplicationData applicationData : listMediaBrowserCompatSearchResultReceiver) {
            if (map.containsKey(applicationData)) {
                objRemoteActionCompatParcelizer = map.get(applicationData);
                if (objRemoteActionCompatParcelizer == null) {
                    StringBuilder sb = new StringBuilder("Annotation argument value cannot be null (");
                    sb.append(applicationData);
                    sb.append(')');
                    throw new IllegalArgumentException(sb.toString());
                }
            } else if (applicationData.AudioAttributesCompatParcelizer()) {
                objRemoteActionCompatParcelizer = null;
            } else {
                if (!applicationData.AudioAttributesImplApi21Parcelizer()) {
                    throw new IllegalArgumentException("No argument provided for a required parameter: ".concat(String.valueOf(applicationData)));
                }
                objRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(applicationData.read());
            }
            arrayList.add(objRemoteActionCompatParcelizer);
        }
        ArrayList arrayList2 = arrayList;
        getDefaultBottomTab<?> getdefaultbottomtabAudioAttributesImplApi21Parcelizer = AudioAttributesImplApi21Parcelizer();
        if (getdefaultbottomtabAudioAttributesImplApi21Parcelizer == null) {
            StringBuilder sb2 = new StringBuilder("This callable does not support a default call: ");
            sb2.append(RatingCompat());
            throw new component28(sb2.toString());
        }
        try {
            return (R) getdefaultbottomtabAudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer(arrayList2.toArray(new Object[0]));
        } catch (IllegalAccessException e) {
            throw new onEnvironmentVariableUpdate(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object RemoteActionCompatParcelizer(deleteOfflineDownloadedFiles deleteofflinedownloadedfiles) {
        Class clsIconCompatParcelizer = MagicModuleFeedbackRequestBody.IconCompatParcelizer(promptContactVerificationFlow.read(deleteofflinedownloadedfiles));
        if (clsIconCompatParcelizer.isArray()) {
            Object objNewInstance = Array.newInstance(clsIconCompatParcelizer.getComponentType(), 0);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(objNewInstance, "");
            return objNewInstance;
        }
        StringBuilder sb = new StringBuilder("Cannot instantiate the default empty array of type ");
        sb.append(clsIconCompatParcelizer.getSimpleName());
        sb.append(", because it is not an array type");
        throw new component28(sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Type IconCompatParcelizer() {
        Type[] lowerBounds;
        if (handleMediaPlayPauseIfPendingOnHandler()) {
            Object objMediaMetadataCompat = IntermediateLoginResponseBody.MediaMetadataCompat((List<? extends Object>) AudioAttributesImplBaseParcelizer().IconCompatParcelizer());
            ParameterizedType parameterizedType = objMediaMetadataCompat instanceof ParameterizedType ? (ParameterizedType) objMediaMetadataCompat : null;
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(parameterizedType != null ? parameterizedType.getRawType() : null, SampleVideos.class)) {
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(actualTypeArguments, "");
                Object objMediaBrowserCompatSearchResultReceiver = getOrderDetails.MediaBrowserCompatSearchResultReceiver(actualTypeArguments);
                WildcardType wildcardType = objMediaBrowserCompatSearchResultReceiver instanceof WildcardType ? (WildcardType) objMediaBrowserCompatSearchResultReceiver : null;
                if (wildcardType != null && (lowerBounds = wildcardType.getLowerBounds()) != null) {
                    return (Type) getOrderDetails.AudioAttributesImplApi21Parcelizer(lowerBounds);
                }
            }
        }
        return null;
    }
}
