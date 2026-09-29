package kotlin;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.getOption5AnsweredCount;
import kotlin.setPlans;

/* JADX INFO: loaded from: classes4.dex */
public final class getAddOnPlans {
    public static final getAddOnPlans IconCompatParcelizer = new getAddOnPlans();

    private getAddOnPlans() {
    }

    public final getHref read(List<? extends getHref> list) {
        toMagicModuleMetaRepoModel.write(list, "");
        list.size();
        ArrayList arrayList = new ArrayList();
        for (getHref gethref : list) {
            if (gethref.AudioAttributesImplApi21Parcelizer() instanceof getMainCopy) {
                Collection<getLink> collectionAV_ = gethref.AudioAttributesImplApi21Parcelizer().aV_();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(collectionAV_, "");
                Collection<getLink> collection = collectionAV_;
                ArrayList arrayList2 = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(collection, 10));
                for (getLink getlink : collection) {
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getlink, "");
                    getHref gethrefRemoteActionCompatParcelizer = PearlSubjectInfo.RemoteActionCompatParcelizer(getlink);
                    if (gethref.ba_()) {
                        gethrefRemoteActionCompatParcelizer = gethrefRemoteActionCompatParcelizer.write(true);
                    }
                    arrayList2.add(gethrefRemoteActionCompatParcelizer);
                }
                arrayList.addAll(arrayList2);
            } else {
                arrayList.add(gethref);
            }
        }
        ArrayList<getHref> arrayList3 = arrayList;
        write writeVarAudioAttributesCompatParcelizer = write.read;
        Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            writeVarAudioAttributesCompatParcelizer = writeVarAudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer((PlanAddOnsCompanion) it.next());
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (getDefaultPlan getdefaultplanIconCompatParcelizer : arrayList3) {
            if (writeVarAudioAttributesCompatParcelizer == write.RemoteActionCompatParcelizer) {
                if (getdefaultplanIconCompatParcelizer instanceof getDefaultPlan) {
                    getdefaultplanIconCompatParcelizer = Meta.IconCompatParcelizer((getDefaultPlan) getdefaultplanIconCompatParcelizer);
                }
                getdefaultplanIconCompatParcelizer = Meta.read(getdefaultplanIconCompatParcelizer, false);
            }
            linkedHashSet.add(getdefaultplanIconCompatParcelizer);
        }
        LinkedHashSet linkedHashSet2 = linkedHashSet;
        List<? extends getHref> list2 = list;
        ArrayList arrayList4 = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list2, 10));
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList4.add(((getHref) it2.next()).bc_());
        }
        Iterator it3 = arrayList4.iterator();
        if (!it3.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        Object next = it3.next();
        while (it3.hasNext()) {
            next = ((getGroupDescription) next).AudioAttributesCompatParcelizer((getGroupDescription) it3.next());
        }
        return read(linkedHashSet2).read((getGroupDescription) next);
    }

    private final getHref read(Set<? extends getHref> set) {
        if (set.size() == 1) {
            return (getHref) IntermediateLoginResponseBody.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(set);
        }
        new read(set);
        Set<? extends getHref> set2 = set;
        Collection<getHref> collectionAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(set2, new AudioAttributesCompatParcelizer(this));
        collectionAudioAttributesCompatParcelizer.isEmpty();
        getOption5AnsweredCount.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = getOption5AnsweredCount.write;
        getHref gethrefRemoteActionCompatParcelizer = getOption5AnsweredCount.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(collectionAudioAttributesCompatParcelizer);
        if (gethrefRemoteActionCompatParcelizer != null) {
            return gethrefRemoteActionCompatParcelizer;
        }
        setPlans.RemoteActionCompatParcelizer remoteActionCompatParcelizer = setPlans.write;
        Collection<getHref> collectionAudioAttributesCompatParcelizer2 = AudioAttributesCompatParcelizer(collectionAudioAttributesCompatParcelizer, new RemoteActionCompatParcelizer(setPlans.RemoteActionCompatParcelizer.write()));
        collectionAudioAttributesCompatParcelizer2.isEmpty();
        return collectionAudioAttributesCompatParcelizer2.size() < 2 ? (getHref) IntermediateLoginResponseBody.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(collectionAudioAttributesCompatParcelizer2) : new getMainCopy(set2).MediaBrowserCompatItemReceiver();
    }

    static final class read extends MagicModuleUseCase implements getCreatedOnDateMs<String> {
        private /* synthetic */ Set<getHref> IconCompatParcelizer;

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public String invoke() {
            StringBuilder sb = new StringBuilder("This collections cannot be empty! input types: ");
            sb.append(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(this.IconCompatParcelizer, null, null, null, 0, null, null, 63));
            return sb.toString();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        read(Set<? extends getHref> set) {
            super(0);
            this.IconCompatParcelizer = set;
        }
    }

    final /* synthetic */ class AudioAttributesCompatParcelizer extends MagicModuleRepoModelsKt implements MagicModuleSubmissionRequestBody<getLink, getLink, Boolean> {
        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Boolean invoke(getLink getlink, getLink getlink2) {
            toMagicModuleMetaRepoModel.write(getlink, "");
            toMagicModuleMetaRepoModel.write(getlink2, "");
            return Boolean.valueOf(getAddOnPlans.AudioAttributesCompatParcelizer(getlink, getlink2));
        }

        @Override // kotlin.r8lambdawOOzi0yme1vxdgON3UOSQJBjUQA, kotlin.isKycAuditIncomplete
        public final String MediaBrowserCompatCustomActionResultReceiver() {
            return "isStrictSupertype";
        }

        @Override // kotlin.r8lambdawOOzi0yme1vxdgON3UOSQJBjUQA
        public final isAuthError MediaDescriptionCompat() {
            return toMagicModuleMetaDataUcModel.write(getAddOnPlans.class);
        }

        AudioAttributesCompatParcelizer(Object obj) {
            super(2, obj);
        }

        @Override // kotlin.r8lambdawOOzi0yme1vxdgON3UOSQJBjUQA
        public final String MediaBrowserCompatMediaItem() {
            return "isStrictSupertype(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z";
        }
    }

    final /* synthetic */ class RemoteActionCompatParcelizer extends MagicModuleRepoModelsKt implements MagicModuleSubmissionRequestBody<getLink, getLink, Boolean> {
        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Boolean invoke(getLink getlink, getLink getlink2) {
            toMagicModuleMetaRepoModel.write(getlink, "");
            toMagicModuleMetaRepoModel.write(getlink2, "");
            return Boolean.valueOf(((PlanGroupExternalSyntheticLambda0) this.AudioAttributesImplApi26Parcelizer).IconCompatParcelizer(getlink, getlink2));
        }

        @Override // kotlin.r8lambdawOOzi0yme1vxdgON3UOSQJBjUQA, kotlin.isKycAuditIncomplete
        public final String MediaBrowserCompatCustomActionResultReceiver() {
            return "equalTypes";
        }

        @Override // kotlin.r8lambdawOOzi0yme1vxdgON3UOSQJBjUQA
        public final isAuthError MediaDescriptionCompat() {
            return toMagicModuleMetaDataUcModel.write(PlanGroupExternalSyntheticLambda0.class);
        }

        RemoteActionCompatParcelizer(Object obj) {
            super(2, obj);
        }

        @Override // kotlin.r8lambdawOOzi0yme1vxdgON3UOSQJBjUQA
        public final String MediaBrowserCompatMediaItem() {
            return "equalTypes(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z";
        }
    }

    private static Collection<getHref> AudioAttributesCompatParcelizer(Collection<? extends getHref> collection, MagicModuleSubmissionRequestBody<? super getHref, ? super getHref, Boolean> magicModuleSubmissionRequestBody) {
        ArrayList arrayList = new ArrayList(collection);
        Iterator it = arrayList.iterator();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(it, "");
        while (it.hasNext()) {
            getHref gethref = (getHref) it.next();
            ArrayList arrayList2 = arrayList;
            if (!arrayList2.isEmpty()) {
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    getHref gethref2 = (getHref) it2.next();
                    if (gethref2 != gethref) {
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(gethref2, "");
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(gethref, "");
                        if (magicModuleSubmissionRequestBody.invoke(gethref2, gethref).booleanValue()) {
                            it.remove();
                            break;
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean AudioAttributesCompatParcelizer(getLink getlink, getLink getlink2) {
        setPlans.RemoteActionCompatParcelizer remoteActionCompatParcelizer = setPlans.write;
        PlanGroupExternalSyntheticLambda0 planGroupExternalSyntheticLambda0Write = setPlans.RemoteActionCompatParcelizer.write();
        return planGroupExternalSyntheticLambda0Write.read(getlink, getlink2) && !planGroupExternalSyntheticLambda0Write.read(getlink2, getlink);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    static final abstract class write {
        public static final write read = new read("START");
        public static final write write = new RemoteActionCompatParcelizer("ACCEPT_NULL");
        private static write AudioAttributesCompatParcelizer = new AudioAttributesCompatParcelizer("UNKNOWN");
        public static final write RemoteActionCompatParcelizer = new IconCompatParcelizer("NOT_NULL");
        private static final /* synthetic */ write[] IconCompatParcelizer = read();

        public abstract write AudioAttributesCompatParcelizer(PlanAddOnsCompanion planAddOnsCompanion);

        static final class read extends write {
            /* JADX WARN: Illegal instructions before constructor call */
            read(String str) {
                byte b = 0;
                super(str, b, b);
            }

            @Override // o.getAddOnPlans.write
            public final write AudioAttributesCompatParcelizer(PlanAddOnsCompanion planAddOnsCompanion) {
                toMagicModuleMetaRepoModel.write(planAddOnsCompanion, "");
                return read(planAddOnsCompanion);
            }
        }

        private write(String str, int i) {
        }

        static final class RemoteActionCompatParcelizer extends write {
            RemoteActionCompatParcelizer(String str) {
                super(str, 1, (byte) 0);
            }

            @Override // o.getAddOnPlans.write
            public final write AudioAttributesCompatParcelizer(PlanAddOnsCompanion planAddOnsCompanion) {
                toMagicModuleMetaRepoModel.write(planAddOnsCompanion, "");
                return read(planAddOnsCompanion);
            }
        }

        static final class AudioAttributesCompatParcelizer extends write {
            AudioAttributesCompatParcelizer(String str) {
                super(str, 2, (byte) 0);
            }

            @Override // o.getAddOnPlans.write
            public final write AudioAttributesCompatParcelizer(PlanAddOnsCompanion planAddOnsCompanion) {
                toMagicModuleMetaRepoModel.write(planAddOnsCompanion, "");
                write writeVar = read(planAddOnsCompanion);
                return writeVar == write.write ? this : writeVar;
            }
        }

        static final class IconCompatParcelizer extends write {
            IconCompatParcelizer(String str) {
                super(str, 3, (byte) 0);
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // o.getAddOnPlans.write
            /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public IconCompatParcelizer AudioAttributesCompatParcelizer(PlanAddOnsCompanion planAddOnsCompanion) {
                toMagicModuleMetaRepoModel.write(planAddOnsCompanion, "");
                return this;
            }
        }

        protected static write read(PlanAddOnsCompanion planAddOnsCompanion) {
            toMagicModuleMetaRepoModel.write(planAddOnsCompanion, "");
            if (planAddOnsCompanion.ba_()) {
                return write;
            }
            if ((planAddOnsCompanion instanceof setPearlNumber) && (((setPearlNumber) planAddOnsCompanion).AudioAttributesImplApi26Parcelizer() instanceof Plan)) {
                return RemoteActionCompatParcelizer;
            }
            if (planAddOnsCompanion instanceof Plan) {
                return AudioAttributesCompatParcelizer;
            }
            getPlanFeatureTitle getplanfeaturetitle = getPlanFeatureTitle.IconCompatParcelizer;
            return getPlanFeatureTitle.write(planAddOnsCompanion) ? RemoteActionCompatParcelizer : AudioAttributesCompatParcelizer;
        }

        private static final /* synthetic */ write[] read() {
            return new write[]{read, write, AudioAttributesCompatParcelizer, RemoteActionCompatParcelizer};
        }

        public /* synthetic */ write(String str, int i, byte b) {
            this(str, i);
        }

        public static write valueOf(String str) {
            return (write) Enum.valueOf(write.class, str);
        }

        public static write[] values() {
            return (write[]) IconCompatParcelizer.clone();
        }
    }
}
