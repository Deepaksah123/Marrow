package kotlin;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.getGroupDescription;
import kotlin.getMcqEncrypt;

/* JADX INFO: loaded from: classes4.dex */
public final class getMainCopy implements getPlanAddOns, newPair {
    private final int RemoteActionCompatParcelizer;
    private final LinkedHashSet<getLink> read;
    private getLink write;

    @Override // kotlin.getPlanAddOns
    public final boolean AudioAttributesImplApi26Parcelizer() {
        return false;
    }

    @Override // kotlin.getPlanAddOns
    public final getQuestionLimit RemoteActionCompatParcelizer() {
        return null;
    }

    public getMainCopy(Collection<? extends getLink> collection) {
        toMagicModuleMetaRepoModel.write(collection, "");
        collection.isEmpty();
        LinkedHashSet<getLink> linkedHashSet = new LinkedHashSet<>(collection);
        this.read = linkedHashSet;
        this.RemoteActionCompatParcelizer = linkedHashSet.hashCode();
    }

    private getMainCopy(Collection<? extends getLink> collection, getLink getlink) {
        this(collection);
        this.write = getlink;
    }

    @Override // kotlin.getPlanAddOns
    public final List<getBadgeText> AudioAttributesCompatParcelizer() {
        return IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
    }

    @Override // kotlin.getPlanAddOns
    public final Collection<getLink> aV_() {
        return this.read;
    }

    public final setTags IconCompatParcelizer() {
        getMcqEncrypt.RemoteActionCompatParcelizer remoteActionCompatParcelizer = getMcqEncrypt.IconCompatParcelizer;
        return getMcqEncrypt.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer("member scope for intersection type", this.read);
    }

    @Override // kotlin.getPlanAddOns
    public final getTestTabItems aU_() {
        getTestTabItems gettesttabitemsAU_ = this.read.iterator().next().AudioAttributesImplApi21Parcelizer().aU_();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(gettesttabitemsAU_, "");
        return gettesttabitemsAU_;
    }

    public final String toString() {
        return IconCompatParcelizer(this);
    }

    static final class read extends MagicModuleUseCase implements getAnswerMap<getLink, String> {
        public static final read AudioAttributesCompatParcelizer = new read();

        private static String read(getLink getlink) {
            toMagicModuleMetaRepoModel.write(getlink, "");
            return getlink.toString();
        }

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ String invoke(getLink getlink) {
            return read(getlink);
        }

        read() {
            super(1);
        }
    }

    private static /* synthetic */ String IconCompatParcelizer(getMainCopy getmaincopy) {
        return getmaincopy.AudioAttributesCompatParcelizer(read.AudioAttributesCompatParcelizer);
    }

    static final class IconCompatParcelizer extends MagicModuleUseCase implements getAnswerMap<getLink, CharSequence> {
        private /* synthetic */ getAnswerMap<getLink, Object> IconCompatParcelizer;

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public CharSequence invoke(getLink getlink) {
            getAnswerMap<getLink, Object> getanswermap = this.IconCompatParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getlink, "");
            return getanswermap.invoke(getlink).toString();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        IconCompatParcelizer(getAnswerMap<? super getLink, ? extends Object> getanswermap) {
            super(1);
            this.IconCompatParcelizer = getanswermap;
        }
    }

    public final String AudioAttributesCompatParcelizer(getAnswerMap<? super getLink, ? extends Object> getanswermap) {
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        return IntermediateLoginResponseBody.RemoteActionCompatParcelizer(IntermediateLoginResponseBody.AudioAttributesCompatParcelizer((Iterable) this.read, (Comparator) new RemoteActionCompatParcelizer(getanswermap)), " & ", "{", "}", 0, null, new IconCompatParcelizer(getanswermap), 24);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof getMainCopy) {
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.read, ((getMainCopy) obj).read);
        }
        return false;
    }

    public final getHref MediaBrowserCompatItemReceiver() {
        getGroupDescription.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = getGroupDescription.AudioAttributesCompatParcelizer;
        return AddOnMetaKt.write(getGroupDescription.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(), this, IntermediateLoginResponseBody.RemoteActionCompatParcelizer(), false, IconCompatParcelizer(), new AudioAttributesCompatParcelizer());
    }

    static final class AudioAttributesCompatParcelizer extends MagicModuleUseCase implements getAnswerMap<getCheapestPlan, getHref> {
        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public getHref invoke(getCheapestPlan getcheapestplan) {
            toMagicModuleMetaRepoModel.write(getcheapestplan, "");
            return getMainCopy.this.IconCompatParcelizer(getcheapestplan).MediaBrowserCompatItemReceiver();
        }

        AudioAttributesCompatParcelizer() {
            super(1);
        }
    }

    public final int hashCode() {
        return this.RemoteActionCompatParcelizer;
    }

    public final getMainCopy write(getLink getlink) {
        return new getMainCopy(this.read, getlink);
    }

    public final getLink AudioAttributesImplApi21Parcelizer() {
        return this.write;
    }

    public static final class RemoteActionCompatParcelizer<T> implements Comparator {
        private /* synthetic */ getAnswerMap read;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            getLink getlink = (getLink) t;
            getAnswerMap getanswermap = this.read;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getlink, "");
            String string = getanswermap.invoke(getlink).toString();
            getLink getlink2 = (getLink) t2;
            getAnswerMap getanswermap2 = this.read;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getlink2, "");
            return getConfigExpirySeconds.read(string, getanswermap2.invoke(getlink2).toString());
        }

        public RemoteActionCompatParcelizer(getAnswerMap getanswermap) {
            this.read = getanswermap;
        }
    }

    public final getMainCopy IconCompatParcelizer(getCheapestPlan getcheapestplan) {
        toMagicModuleMetaRepoModel.write(getcheapestplan, "");
        Collection<getLink> collectionAV_ = aV_();
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(collectionAV_, 10));
        Iterator<T> it = collectionAV_.iterator();
        boolean z = false;
        while (it.hasNext()) {
            arrayList.add(((getLink) it.next()).write(getcheapestplan));
            z = true;
        }
        ArrayList arrayList2 = arrayList;
        getMainCopy getmaincopyWrite = null;
        if (z) {
            getLink getlinkAudioAttributesImplApi21Parcelizer = AudioAttributesImplApi21Parcelizer();
            getmaincopyWrite = new getMainCopy(arrayList2).write(getlinkAudioAttributesImplApi21Parcelizer != null ? getlinkAudioAttributesImplApi21Parcelizer.write(getcheapestplan) : null);
        }
        return getmaincopyWrite == null ? this : getmaincopyWrite;
    }
}
