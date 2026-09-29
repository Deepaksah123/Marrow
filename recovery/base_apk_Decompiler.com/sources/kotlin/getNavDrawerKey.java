package kotlin;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.component33;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u0000 \u000f2\u00020\u0001:\u0003\u000f\f\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\f\u001a\u00020\u000b2\u0010\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000e2\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0011\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000e2\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u0010J'\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u0013J\u001d\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\f\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\u0017J\u001d\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u001c2\u0006\u0010\u0006\u001a\u00020\u001bH&¢\u0006\u0004\b\u0015\u0010\u001dJ\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0006\u001a\u00020\u001eH&¢\u0006\u0004\b\u0011\u0010\u001fJ)\u0010\f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\"0\u001c2\u0006\u0010\u0006\u001a\u00020 2\u0006\u0010\b\u001a\u00020!H\u0004¢\u0006\u0004\b\f\u0010#J\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u001c2\u0006\u0010\u0006\u001a\u00020\u001bH&¢\u0006\u0004\b\u0019\u0010\u001dJ!\u0010\u0015\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050$2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0015\u0010%J\u001b\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010&J+\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u001e2\u0006\u0010\n\u001a\u00020\u001eH\u0002¢\u0006\u0004\b\u000f\u0010'JG\u0010\u0019\u001a\u0004\u0018\u00010\u0012*\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0010\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050(2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010)\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0019\u0010*J/\u0010\u000f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000e*\u0006\u0012\u0002\b\u00030\u00052\u0010\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050$H\u0002¢\u0006\u0004\b\u000f\u0010+J?\u0010\f\u001a\u0004\u0018\u00010\u0012*\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0010\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050(2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0002¢\u0006\u0004\b\f\u0010,R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020-0\u001c8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010.R\u0018\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u00058UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b/\u00100"}, d2 = {"Lo/getNavDrawerKey;", "Lo/downloadMagicModuleDetaillambda1;", "<init>", "()V", "", "Ljava/lang/Class;", "p0", "", "p1", "", "p2", "", "AudioAttributesCompatParcelizer", "(Ljava/util/List;Ljava/lang/String;Z)V", "Ljava/lang/reflect/Constructor;", "read", "(Ljava/lang/String;)Ljava/lang/reflect/Constructor;", "RemoteActionCompatParcelizer", "Ljava/lang/reflect/Method;", "(Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/reflect/Method;", "Lo/CourseConfigV2NavDrawerItemRateUs;", "write", "(Ljava/lang/String;Ljava/lang/String;)Lo/CourseConfigV2NavDrawerItemRateUs;", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/reflect/Method;", "Lo/CourseConfigV2SettingsItems;", "IconCompatParcelizer", "(Ljava/lang/String;Ljava/lang/String;)Lo/CourseConfigV2SettingsItems;", "Lo/getRelatedLessonId;", "", "(Lo/getRelatedLessonId;)Ljava/util/Collection;", "", "(I)Lo/CourseConfigV2SettingsItems;", "Lo/setTags;", "Lo/getNavDrawerKey$RemoteActionCompatParcelizer;", "Lo/CourseConfigSerializerWhenMappings;", "(Lo/setTags;Lo/getNavDrawerKey$RemoteActionCompatParcelizer;)Ljava/util/Collection;", "", "(Ljava/lang/String;)Ljava/util/List;", "(Ljava/lang/String;)Ljava/lang/Class;", "(Ljava/lang/String;II)Ljava/lang/Class;", "", "p3", "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;Ljava/lang/Class;Z)Ljava/lang/reflect/Method;", "(Ljava/lang/Class;Ljava/util/List;)Ljava/lang/reflect/Constructor;", "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Method;", "Lo/CourseConfigV2GtAnalyticsCard;", "()Ljava/util/Collection;", "onCommand", "()Ljava/lang/Class;"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class getNavDrawerKey implements downloadMagicModuleDetaillambda1 {

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Class<?> write = Class.forName("o.MagicModuleRepositoryImplExternalSyntheticLambda0");
    private static final newYearNameItem AudioAttributesCompatParcelizer = new newYearNameItem("<v#(\\d+)>");

    public abstract Collection<CourseConfigV2GtAnalyticsCard> AudioAttributesCompatParcelizer();

    public abstract Collection<CourseConfigV2SettingsItems> IconCompatParcelizer(getRelatedLessonId p0);

    public abstract CourseConfigV2SettingsItems RemoteActionCompatParcelizer(int p0);

    public abstract Collection<CourseConfigV2NavDrawerItemRateUs> write(getRelatedLessonId p0);

    public abstract class AudioAttributesCompatParcelizer {
        private static /* synthetic */ isResolutionNotSupported<Object>[] write = {toMagicModuleMetaDataUcModel.write(new downloadMagicModuleMetalambda0(toMagicModuleMetaDataUcModel.write(AudioAttributesCompatParcelizer.class), "moduleData", "getModuleData()Lorg/jetbrains/kotlin/descriptors/runtime/components/RuntimeModuleData;"))};
        private final component33.IconCompatParcelizer IconCompatParcelizer;

        public AudioAttributesCompatParcelizer() {
            this.IconCompatParcelizer = component33.read(new AnonymousClass2(getNavDrawerKey.this));
        }

        /* JADX INFO: renamed from: o.getNavDrawerKey$AudioAttributesCompatParcelizer$2, reason: invalid class name */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0006*\u00020\u00000\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lo/setImagesInfo;", "RemoteActionCompatParcelizer", "()Lo/setImagesInfo;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        static final class AnonymousClass2 extends MagicModuleUseCase implements getCreatedOnDateMs<setImagesInfo> {
            private /* synthetic */ getNavDrawerKey write;

            @Override // kotlin.getCreatedOnDateMs
            /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public final setImagesInfo invoke() {
                return component30.AudioAttributesCompatParcelizer(this.write.RemoteActionCompatParcelizer());
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(getNavDrawerKey getnavdrawerkey) {
                super(0);
                this.write = getnavdrawerkey;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final setImagesInfo MediaBrowserCompatMediaItem() {
            component33.IconCompatParcelizer iconCompatParcelizer = this.IconCompatParcelizer;
            isResolutionNotSupported<Object> isresolutionnotsupported = write[0];
            T tWrite = iconCompatParcelizer.write();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(tWrite, "");
            return (setImagesInfo) tWrite;
        }
    }

    protected Class<?> onCommand() {
        Class<?> clsMediaBrowserCompatCustomActionResultReceiver = getFinalImageUrl.MediaBrowserCompatCustomActionResultReceiver(RemoteActionCompatParcelizer());
        return clsMediaBrowserCompatCustomActionResultReceiver == null ? RemoteActionCompatParcelizer() : clsMediaBrowserCompatCustomActionResultReceiver;
    }

    public static final class write extends ContentResetResponseBookmark {
        write(getNavDrawerKey getnavdrawerkey) {
            super(getnavdrawerkey);
        }

        @Override // kotlin.getSerializable, kotlin.CourseConfigV2NavDrawerItemAddVideo
        public final /* synthetic */ Object IconCompatParcelizer(CourseConfigV2GtAnalyticsCard courseConfigV2GtAnalyticsCard, Object obj) {
            return read(courseConfigV2GtAnalyticsCard, (getShowPopup) obj);
        }

        private static CourseConfigSerializerWhenMappings<?> read(CourseConfigV2GtAnalyticsCard courseConfigV2GtAnalyticsCard, getShowPopup getshowpopup) {
            toMagicModuleMetaRepoModel.write(courseConfigV2GtAnalyticsCard, "");
            toMagicModuleMetaRepoModel.write(getshowpopup, "");
            throw new IllegalStateException("No constructors should appear here: ".concat(String.valueOf(courseConfigV2GtAnalyticsCard)));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final java.util.Collection<kotlin.CourseConfigSerializerWhenMappings<?>> AudioAttributesCompatParcelizer(kotlin.setTags r7, o.getNavDrawerKey.RemoteActionCompatParcelizer r8) {
        /*
            r6 = this;
            java.lang.String r0 = ""
            kotlin.toMagicModuleMetaRepoModel.write(r7, r0)
            kotlin.toMagicModuleMetaRepoModel.write(r8, r0)
            o.getNavDrawerKey$write r0 = new o.getNavDrawerKey$write
            r0.<init>(r6)
            o.getMcqContentBody r7 = (kotlin.getMcqContentBody) r7
            r6 = 3
            r1 = 0
            java.util.Collection r6 = o.getMcqContentBody.IconCompatParcelizer.RemoteActionCompatParcelizer(r7, r1, r1, r6)
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Collection r7 = (java.util.Collection) r7
            java.util.Iterator r6 = r6.iterator()
        L22:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L5a
            java.lang.Object r2 = r6.next()
            o.getVariant r2 = (kotlin.getVariant) r2
            boolean r3 = r2 instanceof kotlin.getTestHeaderTitle
            if (r3 == 0) goto L53
            r3 = r2
            o.getTestHeaderTitle r3 = (kotlin.getTestHeaderTitle) r3
            o.CourseConfigV2NavDrawerItemFreeExtension r4 = r3.onCustomAction()
            o.CourseConfigV2NavDrawerItemFreeExtension r5 = kotlin.CourseConfigV2NavDrawerItemFaq.MediaBrowserCompatItemReceiver
            boolean r4 = kotlin.toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(r4, r5)
            if (r4 != 0) goto L53
            boolean r3 = r8.IconCompatParcelizer(r3)
            if (r3 == 0) goto L53
            r3 = r0
            o.CourseConfigV2NavDrawerItemAddVideo r3 = (kotlin.CourseConfigV2NavDrawerItemAddVideo) r3
            o.getShowPopup r4 = kotlin.getShowPopup.INSTANCE
            java.lang.Object r2 = r2.AudioAttributesCompatParcelizer(r3, r4)
            o.CourseConfigSerializerWhenMappings r2 = (kotlin.CourseConfigSerializerWhenMappings) r2
            goto L54
        L53:
            r2 = r1
        L54:
            if (r2 == 0) goto L22
            r7.add(r2)
            goto L22
        L5a:
            java.util.List r7 = (java.util.List) r7
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.List r6 = kotlin.IntermediateLoginResponseBody.onPlay(r7)
            java.util.Collection r6 = (java.util.Collection) r6
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getNavDrawerKey.AudioAttributesCompatParcelizer(o.setTags, o.getNavDrawerKey$RemoteActionCompatParcelizer):java.util.Collection");
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0084\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n"}, d2 = {"Lo/getNavDrawerKey$RemoteActionCompatParcelizer;", "", "<init>", "(Ljava/lang/String;I)V", "Lo/getTestHeaderTitle;", "p0", "", "IconCompatParcelizer", "(Lo/getTestHeaderTitle;)Z", "AudioAttributesCompatParcelizer", "RemoteActionCompatParcelizer"}, k = 1, mv = {1, 8, 0}, xi = 48)
    protected enum RemoteActionCompatParcelizer {
        DECLARED,
        INHERITED;

        public final boolean IconCompatParcelizer(getTestHeaderTitle p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return p0.handleMediaPlayPauseIfPendingOnHandler().AudioAttributesCompatParcelizer() == (this == DECLARED);
        }
    }

    public final CourseConfigV2SettingsItems IconCompatParcelizer(String p0, String p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        newPrevYearTestContainer newprevyeartestcontainerRemoteActionCompatParcelizer = AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(p1);
        if (newprevyeartestcontainerRemoteActionCompatParcelizer != null) {
            String str = newprevyeartestcontainerRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer().IconCompatParcelizer().write().get(1);
            CourseConfigV2SettingsItems courseConfigV2SettingsItemsRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(Integer.parseInt(str));
            if (courseConfigV2SettingsItemsRemoteActionCompatParcelizer != null) {
                return courseConfigV2SettingsItemsRemoteActionCompatParcelizer;
            }
            StringBuilder sb = new StringBuilder("Local property #");
            sb.append(str);
            sb.append(" not found in ");
            sb.append(RemoteActionCompatParcelizer());
            throw new component28(sb.toString());
        }
        getRelatedLessonId getrelatedlessonidRemoteActionCompatParcelizer = getRelatedLessonId.RemoteActionCompatParcelizer(p0);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getrelatedlessonidRemoteActionCompatParcelizer, "");
        Collection<CourseConfigV2SettingsItems> collectionIconCompatParcelizer = IconCompatParcelizer(getrelatedlessonidRemoteActionCompatParcelizer);
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionIconCompatParcelizer) {
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) component32.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer((CourseConfigV2SettingsItems) obj).IconCompatParcelizer(), (Object) p1)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = arrayList;
        if (arrayList2.isEmpty()) {
            StringBuilder sb2 = new StringBuilder("Property '");
            sb2.append(p0);
            sb2.append("' (JVM signature: ");
            sb2.append(p1);
            sb2.append(") not resolved in ");
            sb2.append(this);
            throw new component28(sb2.toString());
        }
        if (arrayList2.size() == 1) {
            return (CourseConfigV2SettingsItems) IntermediateLoginResponseBody.onCommand((List) arrayList2);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : arrayList2) {
            CourseConfigV2NavDrawerItemFreeExtension courseConfigV2NavDrawerItemFreeExtensionOnCustomAction = ((CourseConfigV2SettingsItems) obj2).onCustomAction();
            Object obj3 = linkedHashMap.get(courseConfigV2NavDrawerItemFreeExtensionOnCustomAction);
            if (obj3 == null) {
                obj3 = (List) new ArrayList();
                linkedHashMap.put(courseConfigV2NavDrawerItemFreeExtensionOnCustomAction, obj3);
            }
            ((List) obj3).add(obj2);
        }
        Collection collectionValues = VideoTimelineResponseBody.AudioAttributesCompatParcelizer((Map) linkedHashMap, (Comparator) new getSettingsKey(IconCompatParcelizer.read)).values();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(collectionValues, "");
        List list = (List) IntermediateLoginResponseBody.MediaDescriptionCompat(collectionValues);
        if (list.size() == 1) {
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(list, "");
            return (CourseConfigV2SettingsItems) IntermediateLoginResponseBody.RatingCompat(list);
        }
        getRelatedLessonId getrelatedlessonidRemoteActionCompatParcelizer2 = getRelatedLessonId.RemoteActionCompatParcelizer(p0);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getrelatedlessonidRemoteActionCompatParcelizer2, "");
        String strRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer(IconCompatParcelizer(getrelatedlessonidRemoteActionCompatParcelizer2), "\n", null, null, 0, null, AnonymousClass2.AudioAttributesCompatParcelizer, 30);
        StringBuilder sb3 = new StringBuilder("Property '");
        sb3.append(p0);
        sb3.append("' (JVM signature: ");
        sb3.append(p1);
        sb3.append(") not resolved in ");
        sb3.append(this);
        sb3.append(':');
        sb3.append(strRemoteActionCompatParcelizer.length() == 0 ? " no members found" : "\n".concat(String.valueOf(strRemoteActionCompatParcelizer)));
        throw new component28(sb3.toString());
    }

    static final class IconCompatParcelizer extends MagicModuleUseCase implements MagicModuleSubmissionRequestBody<CourseConfigV2NavDrawerItemFreeExtension, CourseConfigV2NavDrawerItemFreeExtension, Integer> {
        public static final IconCompatParcelizer read = new IconCompatParcelizer();

        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final /* synthetic */ Integer invoke(CourseConfigV2NavDrawerItemFreeExtension courseConfigV2NavDrawerItemFreeExtension, CourseConfigV2NavDrawerItemFreeExtension courseConfigV2NavDrawerItemFreeExtension2) {
            return read(courseConfigV2NavDrawerItemFreeExtension, courseConfigV2NavDrawerItemFreeExtension2);
        }

        private static Integer read(CourseConfigV2NavDrawerItemFreeExtension courseConfigV2NavDrawerItemFreeExtension, CourseConfigV2NavDrawerItemFreeExtension courseConfigV2NavDrawerItemFreeExtension2) {
            Integer numIconCompatParcelizer = CourseConfigV2NavDrawerItemFaq.IconCompatParcelizer(courseConfigV2NavDrawerItemFreeExtension, courseConfigV2NavDrawerItemFreeExtension2);
            return Integer.valueOf(numIconCompatParcelizer == null ? 0 : numIconCompatParcelizer.intValue());
        }

        IconCompatParcelizer() {
            super(2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int write(MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, Object obj, Object obj2) {
        toMagicModuleMetaRepoModel.write(magicModuleSubmissionRequestBody, "");
        return ((Number) magicModuleSubmissionRequestBody.invoke(obj, obj2)).intValue();
    }

    /* JADX INFO: renamed from: o.getNavDrawerKey$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/CourseConfigV2SettingsItems;", "p0", "", "AudioAttributesCompatParcelizer", "(Lo/CourseConfigV2SettingsItems;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass2 extends MagicModuleUseCase implements getAnswerMap<CourseConfigV2SettingsItems, CharSequence> {
        public static final AnonymousClass2 AudioAttributesCompatParcelizer = new AnonymousClass2();

        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(CourseConfigV2SettingsItems courseConfigV2SettingsItems) {
            toMagicModuleMetaRepoModel.write(courseConfigV2SettingsItems, "");
            StringBuilder sb = new StringBuilder();
            sb.append(setGuessed.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(courseConfigV2SettingsItems));
            sb.append(" | ");
            sb.append(component32.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(courseConfigV2SettingsItems).IconCompatParcelizer());
            return sb.toString();
        }

        AnonymousClass2() {
            super(1);
        }
    }

    public final CourseConfigV2NavDrawerItemRateUs write(String p0, String p1) {
        List listWrite;
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) p0, (Object) "<init>")) {
            listWrite = IntermediateLoginResponseBody.onPlay(AudioAttributesCompatParcelizer());
        } else {
            getRelatedLessonId getrelatedlessonidRemoteActionCompatParcelizer = getRelatedLessonId.RemoteActionCompatParcelizer(p0);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getrelatedlessonidRemoteActionCompatParcelizer, "");
            listWrite = write(getrelatedlessonidRemoteActionCompatParcelizer);
        }
        Collection<CourseConfigV2NavDrawerItemRateUs> collection = listWrite;
        ArrayList arrayList = new ArrayList();
        for (Object obj : collection) {
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) component32.AudioAttributesCompatParcelizer.IconCompatParcelizer((CourseConfigV2NavDrawerItemRateUs) obj).IconCompatParcelizer(), (Object) p1)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = arrayList;
        if (arrayList2.size() != 1) {
            String strRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer(collection, "\n", null, null, 0, null, AnonymousClass4.IconCompatParcelizer, 30);
            StringBuilder sb = new StringBuilder("Function '");
            sb.append(p0);
            sb.append("' (JVM signature: ");
            sb.append(p1);
            sb.append(") not resolved in ");
            sb.append(this);
            sb.append(':');
            sb.append(strRemoteActionCompatParcelizer.length() == 0 ? " no members found" : "\n".concat(String.valueOf(strRemoteActionCompatParcelizer)));
            throw new component28(sb.toString());
        }
        return (CourseConfigV2NavDrawerItemRateUs) IntermediateLoginResponseBody.onCommand((List) arrayList2);
    }

    /* JADX INFO: renamed from: o.getNavDrawerKey$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/CourseConfigV2NavDrawerItemRateUs;", "p0", "", "RemoteActionCompatParcelizer", "(Lo/CourseConfigV2NavDrawerItemRateUs;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass4 extends MagicModuleUseCase implements getAnswerMap<CourseConfigV2NavDrawerItemRateUs, CharSequence> {
        public static final AnonymousClass4 IconCompatParcelizer = new AnonymousClass4();

        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(CourseConfigV2NavDrawerItemRateUs courseConfigV2NavDrawerItemRateUs) {
            toMagicModuleMetaRepoModel.write(courseConfigV2NavDrawerItemRateUs, "");
            StringBuilder sb = new StringBuilder();
            sb.append(setGuessed.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(courseConfigV2NavDrawerItemRateUs));
            sb.append(" | ");
            sb.append(component32.AudioAttributesCompatParcelizer.IconCompatParcelizer(courseConfigV2NavDrawerItemRateUs).IconCompatParcelizer());
            return sb.toString();
        }

        AnonymousClass4() {
            super(1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.reflect.Method IconCompatParcelizer(java.lang.Class<?> r14, java.lang.String r15, java.lang.Class<?>[] r16, java.lang.Class<?> r17, boolean r18) {
        /*
            r13 = this;
            r6 = r16
            r7 = 0
            if (r18 == 0) goto L7
            r6[r7] = r14
        L7:
            java.lang.reflect.Method r0 = AudioAttributesCompatParcelizer(r14, r15, r16, r17)
            if (r0 == 0) goto Le
            return r0
        Le:
            java.lang.Class r1 = r14.getSuperclass()
            if (r1 == 0) goto L23
            r0 = r13
            r2 = r15
            r3 = r16
            r4 = r17
            r5 = r18
            java.lang.reflect.Method r0 = r0.IconCompatParcelizer(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L23
            return r0
        L23:
            java.lang.Class[] r8 = r14.getInterfaces()
            java.lang.String r9 = ""
            kotlin.toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(r8, r9)
            int r10 = r8.length
            r11 = r7
        L2e:
            if (r11 >= r10) goto L78
            r12 = r8[r11]
            kotlin.toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(r12, r9)
            r0 = r13
            r1 = r12
            r2 = r15
            r3 = r16
            r4 = r17
            r5 = r18
            java.lang.reflect.Method r0 = r0.IconCompatParcelizer(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L45
            return r0
        L45:
            if (r18 == 0) goto L72
            java.lang.ClassLoader r0 = kotlin.getFinalImageUrl.read(r12)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r12.getName()
            r1.append(r2)
            java.lang.String r2 = "$DefaultImpls"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.Class r0 = kotlin.getMsInterimHtmlEndTime.write(r0, r1)
            if (r0 == 0) goto L72
            r6[r7] = r12
            r1 = r15
            r2 = r17
            java.lang.reflect.Method r0 = AudioAttributesCompatParcelizer(r0, r15, r6, r2)
            if (r0 == 0) goto L75
            return r0
        L72:
            r1 = r15
            r2 = r17
        L75:
            int r11 = r11 + 1
            goto L2e
        L78:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getNavDrawerKey.IconCompatParcelizer(java.lang.Class, java.lang.String, java.lang.Class[], java.lang.Class, boolean):java.lang.reflect.Method");
    }

    private static Method AudioAttributesCompatParcelizer(Class<?> cls, String str, Class<?>[] clsArr, Class<?> cls2) {
        Method method;
        try {
            Method declaredMethod = cls.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(declaredMethod.getReturnType(), cls2)) {
                return declaredMethod;
            }
            Method[] declaredMethods = cls.getDeclaredMethods();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(declaredMethods, "");
            Method[] methodArr = declaredMethods;
            int length = methodArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    method = null;
                    break;
                }
                method = methodArr[i];
                Method method2 = method;
                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) method2.getName(), (Object) str) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(method2.getReturnType(), cls2) && Arrays.equals(method2.getParameterTypes(), clsArr)) {
                    break;
                }
                i++;
            }
            return method;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    private static Constructor<?> read(Class<?> cls, List<? extends Class<?>> list) {
        try {
            Class[] clsArr = (Class[]) list.toArray(new Class[0]);
            return cls.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public final Method AudioAttributesCompatParcelizer(String p0, String p1) {
        Method methodIconCompatParcelizer;
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) p0, (Object) "<init>")) {
            return null;
        }
        Class<?>[] clsArr = (Class[]) write(p1).toArray(new Class[0]);
        Class<?> clsAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(p1);
        Method methodIconCompatParcelizer2 = IconCompatParcelizer(onCommand(), p0, clsArr, clsAudioAttributesCompatParcelizer, false);
        if (methodIconCompatParcelizer2 != null) {
            return methodIconCompatParcelizer2;
        }
        if (!onCommand().isInterface() || (methodIconCompatParcelizer = IconCompatParcelizer(Object.class, p0, clsArr, clsAudioAttributesCompatParcelizer, false)) == null) {
            return null;
        }
        return methodIconCompatParcelizer;
    }

    public final Method RemoteActionCompatParcelizer(String p0, String p1, boolean p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) p0, (Object) "<init>")) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (p2) {
            arrayList.add(RemoteActionCompatParcelizer());
        }
        AudioAttributesCompatParcelizer(arrayList, p1, false);
        Class<?> clsOnCommand = onCommand();
        StringBuilder sb = new StringBuilder();
        sb.append(p0);
        sb.append("$default");
        return IconCompatParcelizer(clsOnCommand, sb.toString(), (Class[]) arrayList.toArray(new Class[0]), AudioAttributesCompatParcelizer(p1), p2);
    }

    public final Constructor<?> read(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return read(RemoteActionCompatParcelizer(), write(p0));
    }

    public final Constructor<?> RemoteActionCompatParcelizer(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        Class<?> clsRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        ArrayList arrayList = new ArrayList();
        AudioAttributesCompatParcelizer(arrayList, p0, true);
        getShowPopup getshowpopup = getShowPopup.INSTANCE;
        return read(clsRemoteActionCompatParcelizer, arrayList);
    }

    private final void AudioAttributesCompatParcelizer(List<Class<?>> p0, String p1, boolean p2) {
        List<Class<?>> listWrite = write(p1);
        p0.addAll(listWrite);
        int size = (listWrite.size() + 31) / 32;
        for (int i = 0; i < size; i++) {
            Class<?> cls = Integer.TYPE;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(cls, "");
            p0.add(cls);
        }
        if (p2) {
            Class<?> cls2 = write;
            p0.remove(cls2);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(cls2, "");
            p0.add(cls2);
            return;
        }
        p0.add(Object.class);
    }

    private final List<Class<?>> write(String p0) {
        int iIconCompatParcelizer;
        ArrayList arrayList = new ArrayList();
        int i = 1;
        while (p0.charAt(i) != ')') {
            int i2 = i;
            while (p0.charAt(i2) == '[') {
                i2++;
            }
            char cCharAt = p0.charAt(i2);
            if (TestGroupLSModel.RemoteActionCompatParcelizer("VZCBSIFJD", cCharAt, false)) {
                iIconCompatParcelizer = i2 + 1;
            } else if (cCharAt == 'L') {
                iIconCompatParcelizer = TestGroupLSModel.IconCompatParcelizer((CharSequence) p0, ';', i, false, 4) + 1;
            } else {
                throw new component28("Unknown type prefix in the method signature: ".concat(String.valueOf(p0)));
            }
            arrayList.add(read(p0, i, iIconCompatParcelizer));
            i = iIconCompatParcelizer;
        }
        return arrayList;
    }

    private final Class<?> read(String p0, int p1, int p2) throws ClassNotFoundException {
        char cCharAt = p0.charAt(p1);
        if (cCharAt == 'L') {
            ClassLoader classLoader = getFinalImageUrl.read(RemoteActionCompatParcelizer());
            String strSubstring = p0.substring(p1 + 1, p2 - 1);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strSubstring, "");
            Class<?> clsLoadClass = classLoader.loadClass(TestGroupLSModel.AudioAttributesCompatParcelizer(strSubstring, '/', '.', false));
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(clsLoadClass, "");
            return clsLoadClass;
        }
        if (cCharAt == '[') {
            return getCourseStrings.IconCompatParcelizer(read(p0, p1 + 1, p2));
        }
        if (cCharAt == 'V') {
            Class<?> cls = Void.TYPE;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(cls, "");
            return cls;
        }
        if (cCharAt == 'Z') {
            return Boolean.TYPE;
        }
        if (cCharAt == 'C') {
            return Character.TYPE;
        }
        if (cCharAt == 'B') {
            return Byte.TYPE;
        }
        if (cCharAt == 'S') {
            return Short.TYPE;
        }
        if (cCharAt == 'I') {
            return Integer.TYPE;
        }
        if (cCharAt == 'F') {
            return Float.TYPE;
        }
        if (cCharAt == 'J') {
            return Long.TYPE;
        }
        if (cCharAt == 'D') {
            return Double.TYPE;
        }
        throw new component28("Unknown type prefix in the method signature: ".concat(String.valueOf(p0)));
    }

    private final Class<?> AudioAttributesCompatParcelizer(String p0) {
        return read(p0, TestGroupLSModel.IconCompatParcelizer((CharSequence) p0, ')', 0, false, 6) + 1, p0.length());
    }

    /* JADX INFO: renamed from: o.getNavDrawerKey$read, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0007\u001a\u000e\u0012\u0002\b\u0003*\u0006\u0012\u0002\b\u00030\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001a\u0010\t\u001a\u00020\b8\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0005\u0010\u000b"}, d2 = {"Lo/getNavDrawerKey$read;", "", "<init>", "()V", "Ljava/lang/Class;", "write", "Ljava/lang/Class;", "read", "Lo/newYearNameItem;", "AudioAttributesCompatParcelizer", "Lo/newYearNameItem;", "()Lo/newYearNameItem;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static newYearNameItem write() {
            return getNavDrawerKey.AudioAttributesCompatParcelizer;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
