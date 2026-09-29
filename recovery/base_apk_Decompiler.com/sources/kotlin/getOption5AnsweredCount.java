package kotlin;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.getGroupDescription;

/* JADX INFO: loaded from: classes4.dex */
public final class getOption5AnsweredCount implements getPlanAddOns {
    public static final AudioAttributesCompatParcelizer write = new AudioAttributesCompatParcelizer(0);
    private final getHref AudioAttributesCompatParcelizer;
    private final long AudioAttributesImplApi21Parcelizer;
    private final RenewEligible IconCompatParcelizer;
    private final Set<getLink> RemoteActionCompatParcelizer;
    private final getTopSection read;

    @Override // kotlin.getPlanAddOns
    public final boolean AudioAttributesImplApi26Parcelizer() {
        return false;
    }

    @Override // kotlin.getPlanAddOns
    public final getQuestionLimit RemoteActionCompatParcelizer() {
        return null;
    }

    public static final class AudioAttributesCompatParcelizer {

        enum read {
            COMMON_SUPER_TYPE,
            INTERSECTION_TYPE
        }

        public final /* synthetic */ class write {
            public static final /* synthetic */ int[] AudioAttributesCompatParcelizer;

            static {
                int[] iArr = new int[read.values().length];
                try {
                    iArr[read.COMMON_SUPER_TYPE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[read.INTERSECTION_TYPE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                AudioAttributesCompatParcelizer = iArr;
            }
        }

        private AudioAttributesCompatParcelizer() {
        }

        public static getHref RemoteActionCompatParcelizer(Collection<? extends getHref> collection) {
            toMagicModuleMetaRepoModel.write(collection, "");
            return IconCompatParcelizer(collection, read.INTERSECTION_TYPE);
        }

        private static getHref IconCompatParcelizer(Collection<? extends getHref> collection, read readVar) {
            if (collection.isEmpty()) {
                return null;
            }
            Iterator<T> it = collection.iterator();
            if (!it.hasNext()) {
                throw new UnsupportedOperationException("Empty collection can't be reduced.");
            }
            Object next = it.next();
            while (it.hasNext()) {
                getHref gethref = (getHref) it.next();
                AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = getOption5AnsweredCount.write;
                next = read((getHref) next, gethref, readVar);
            }
            return (getHref) next;
        }

        private static getHref read(getHref gethref, getHref gethref2, read readVar) {
            if (gethref == null || gethref2 == null) {
                return null;
            }
            getPlanAddOns getplanaddonsAudioAttributesImplApi21Parcelizer = gethref.AudioAttributesImplApi21Parcelizer();
            getPlanAddOns getplanaddonsAudioAttributesImplApi21Parcelizer2 = gethref2.AudioAttributesImplApi21Parcelizer();
            boolean z = getplanaddonsAudioAttributesImplApi21Parcelizer instanceof getOption5AnsweredCount;
            if (z && (getplanaddonsAudioAttributesImplApi21Parcelizer2 instanceof getOption5AnsweredCount)) {
                return AudioAttributesCompatParcelizer((getOption5AnsweredCount) getplanaddonsAudioAttributesImplApi21Parcelizer, (getOption5AnsweredCount) getplanaddonsAudioAttributesImplApi21Parcelizer2, readVar);
            }
            if (z) {
                return IconCompatParcelizer((getOption5AnsweredCount) getplanaddonsAudioAttributesImplApi21Parcelizer, gethref2);
            }
            if (getplanaddonsAudioAttributesImplApi21Parcelizer2 instanceof getOption5AnsweredCount) {
                return IconCompatParcelizer((getOption5AnsweredCount) getplanaddonsAudioAttributesImplApi21Parcelizer2, gethref);
            }
            return null;
        }

        private static getHref AudioAttributesCompatParcelizer(getOption5AnsweredCount getoption5answeredcount, getOption5AnsweredCount getoption5answeredcount2, read readVar) {
            Set setAudioAttributesCompatParcelizer;
            int i = write.AudioAttributesCompatParcelizer[readVar.ordinal()];
            if (i == 1) {
                setAudioAttributesCompatParcelizer = IntermediateLoginResponseBody.AudioAttributesCompatParcelizer((Iterable) getoption5answeredcount.IconCompatParcelizer(), (Iterable) getoption5answeredcount2.IconCompatParcelizer());
            } else {
                if (i != 2) {
                    throw new RenewEligibleCreator();
                }
                setAudioAttributesCompatParcelizer = IntermediateLoginResponseBody.write((Iterable) getoption5answeredcount.IconCompatParcelizer(), (Iterable) getoption5answeredcount2.IconCompatParcelizer());
            }
            getOption5AnsweredCount getoption5answeredcount3 = new getOption5AnsweredCount(getoption5answeredcount.AudioAttributesImplApi21Parcelizer, getoption5answeredcount.read, setAudioAttributesCompatParcelizer, (byte) 0);
            getGroupDescription.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = getGroupDescription.AudioAttributesCompatParcelizer;
            return AddOnMetaKt.AudioAttributesCompatParcelizer(getGroupDescription.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(), getoption5answeredcount3);
        }

        private static getHref IconCompatParcelizer(getOption5AnsweredCount getoption5answeredcount, getHref gethref) {
            if (getoption5answeredcount.IconCompatParcelizer().contains(gethref)) {
                return gethref;
            }
            return null;
        }

        public /* synthetic */ AudioAttributesCompatParcelizer(byte b) {
            this();
        }
    }

    public final Set<getLink> IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private getOption5AnsweredCount(long j, getTopSection gettopsection, Set<? extends getLink> set) {
        getGroupDescription.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = getGroupDescription.AudioAttributesCompatParcelizer;
        this.AudioAttributesCompatParcelizer = AddOnMetaKt.AudioAttributesCompatParcelizer(getGroupDescription.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(), this);
        this.IconCompatParcelizer = getRenewExpiresOn.RemoteActionCompatParcelizer(new IconCompatParcelizer());
        this.AudioAttributesImplApi21Parcelizer = j;
        this.read = gettopsection;
        this.RemoteActionCompatParcelizer = set;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean AudioAttributesImplBaseParcelizer() {
        Collection<getLink> collection = getTags.read(this.read);
        if ((collection instanceof Collection) && collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (this.RemoteActionCompatParcelizer.contains((getLink) it.next())) {
                return false;
            }
        }
        return true;
    }

    static final class IconCompatParcelizer extends MagicModuleUseCase implements getCreatedOnDateMs<List<getHref>> {
        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public List<getHref> invoke() {
            getHref gethrefAP_ = getOption5AnsweredCount.this.aU_().MediaMetadataCompat().aP_();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(gethrefAP_, "");
            List<getHref> listWrite = IntermediateLoginResponseBody.write(setMinPrice.AudioAttributesCompatParcelizer(gethrefAP_, IntermediateLoginResponseBody.RemoteActionCompatParcelizer(new isIndividualPlan(getTotalSubject.IN_VARIANCE, getOption5AnsweredCount.this.AudioAttributesCompatParcelizer)), null, 2));
            if (!getOption5AnsweredCount.this.AudioAttributesImplBaseParcelizer()) {
                listWrite.add(getOption5AnsweredCount.this.aU_().onFastForward());
            }
            return listWrite;
        }

        IconCompatParcelizer() {
            super(0);
        }
    }

    private final List<getLink> AudioAttributesImplApi21Parcelizer() {
        return (List) this.IconCompatParcelizer.RemoteActionCompatParcelizer();
    }

    @Override // kotlin.getPlanAddOns
    public final List<getBadgeText> AudioAttributesCompatParcelizer() {
        return IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
    }

    @Override // kotlin.getPlanAddOns
    public final Collection<getLink> aV_() {
        return AudioAttributesImplApi21Parcelizer();
    }

    @Override // kotlin.getPlanAddOns
    public final getTestTabItems aU_() {
        return this.read.write();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntegerLiteralType");
        sb.append(MediaBrowserCompatCustomActionResultReceiver());
        return sb.toString();
    }

    static final class write extends MagicModuleUseCase implements getAnswerMap<getLink, CharSequence> {
        public static final write IconCompatParcelizer = new write();

        private static CharSequence read(getLink getlink) {
            toMagicModuleMetaRepoModel.write(getlink, "");
            return getlink.toString();
        }

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ CharSequence invoke(getLink getlink) {
            return read(getlink);
        }

        write() {
            super(1);
        }
    }

    private final String MediaBrowserCompatCustomActionResultReceiver() {
        StringBuilder sb = new StringBuilder("[");
        sb.append(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, ",", null, null, 0, null, write.IconCompatParcelizer, 30));
        sb.append(']');
        return sb.toString();
    }

    public /* synthetic */ getOption5AnsweredCount(long j, getTopSection gettopsection, Set set, byte b) {
        this(j, gettopsection, set);
    }
}
