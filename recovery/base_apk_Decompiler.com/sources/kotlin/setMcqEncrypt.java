package kotlin;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.getMcqContentBody;
import kotlin.setTags;

/* JADX INFO: loaded from: classes4.dex */
public final class setMcqEncrypt implements setTags {
    private final RenewEligible AudioAttributesCompatParcelizer;
    private final setTags AudioAttributesImplBaseParcelizer;
    private final RenewEligible IconCompatParcelizer;
    private Map<getVariant, getVariant> RemoteActionCompatParcelizer;
    private final setDesriptionList write;

    static final class IconCompatParcelizer extends MagicModuleUseCase implements getCreatedOnDateMs<setDesriptionList> {
        private /* synthetic */ setDesriptionList AudioAttributesCompatParcelizer;

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public setDesriptionList invoke() {
            return this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer().AudioAttributesImplBaseParcelizer();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IconCompatParcelizer(setDesriptionList setdesriptionlist) {
            super(0);
            this.AudioAttributesCompatParcelizer = setdesriptionlist;
        }
    }

    public setMcqEncrypt(setTags settags, setDesriptionList setdesriptionlist) {
        toMagicModuleMetaRepoModel.write(settags, "");
        toMagicModuleMetaRepoModel.write(setdesriptionlist, "");
        this.AudioAttributesImplBaseParcelizer = settags;
        this.AudioAttributesCompatParcelizer = getRenewExpiresOn.RemoteActionCompatParcelizer(new IconCompatParcelizer(setdesriptionlist));
        isVideoPlanCtype isvideoplanctypeAudioAttributesCompatParcelizer = setdesriptionlist.AudioAttributesCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(isvideoplanctypeAudioAttributesCompatParcelizer, "");
        this.write = getMcqUpdateStatusannotations.write(isvideoplanctypeAudioAttributesCompatParcelizer, true).AudioAttributesImplBaseParcelizer();
        this.IconCompatParcelizer = getRenewExpiresOn.RemoteActionCompatParcelizer(new write());
    }

    @Override // kotlin.getMcqContentBody
    public final void RemoteActionCompatParcelizer(getRelatedLessonId getrelatedlessonid, getTimeStamp gettimestamp) {
        setTags.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(this, getrelatedlessonid, gettimestamp);
    }

    static final class write extends MagicModuleUseCase implements getCreatedOnDateMs<Collection<? extends getVariant>> {
        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Collection<getVariant> invoke() {
            setMcqEncrypt setmcqencrypt = setMcqEncrypt.this;
            return setmcqencrypt.write(getMcqContentBody.IconCompatParcelizer.RemoteActionCompatParcelizer(setmcqencrypt.AudioAttributesImplBaseParcelizer, null, null, 3));
        }

        write() {
            super(0);
        }
    }

    private final Collection<getVariant> write() {
        return (Collection) this.IconCompatParcelizer.RemoteActionCompatParcelizer();
    }

    private final <D extends getVariant> D AudioAttributesCompatParcelizer(D d) {
        if (this.write.read()) {
            return d;
        }
        if (this.RemoteActionCompatParcelizer == null) {
            this.RemoteActionCompatParcelizer = new HashMap();
        }
        Map<getVariant, getVariant> map = this.RemoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.write(map);
        CourseConfigV2NavDrawerItemAboutUs courseConfigV2NavDrawerItemAboutUs = map.get(d);
        if (courseConfigV2NavDrawerItemAboutUs == null) {
            if (!(d instanceof CourseConfigV2VideoItem)) {
                throw new IllegalStateException("Unknown descriptor in scope: ".concat(String.valueOf(d)).toString());
            }
            CourseConfigV2NavDrawerItemAboutUs courseConfigV2NavDrawerItemAboutUsWrite = ((CourseConfigV2VideoItem) d).write(this.write);
            if (courseConfigV2NavDrawerItemAboutUsWrite == null) {
                StringBuilder sb = new StringBuilder("We expect that no conflict should happen while substitution is guaranteed to generate invariant projection, but ");
                sb.append(d);
                sb.append(" substitution fails");
                throw new AssertionError(sb.toString());
            }
            courseConfigV2NavDrawerItemAboutUs = courseConfigV2NavDrawerItemAboutUsWrite;
            map.put(d, courseConfigV2NavDrawerItemAboutUs);
        }
        D d2 = (D) courseConfigV2NavDrawerItemAboutUs;
        toMagicModuleMetaRepoModel.read(d2, "");
        return d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final <D extends getVariant> Collection<D> write(Collection<? extends D> collection) {
        if (this.write.read() || collection.isEmpty()) {
            return collection;
        }
        LinkedHashSet linkedHashSetWrite = SubjectGroupTypeConstant.write(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            linkedHashSetWrite.add(AudioAttributesCompatParcelizer((getVariant) it.next()));
        }
        return linkedHashSetWrite;
    }

    @Override // kotlin.setTags
    public final Collection<? extends CourseConfigV2SettingsItems> IconCompatParcelizer(getRelatedLessonId getrelatedlessonid, getTimeStamp gettimestamp) {
        toMagicModuleMetaRepoModel.write(getrelatedlessonid, "");
        toMagicModuleMetaRepoModel.write(gettimestamp, "");
        return write(this.AudioAttributesImplBaseParcelizer.IconCompatParcelizer(getrelatedlessonid, gettimestamp));
    }

    @Override // kotlin.getMcqContentBody
    public final getQuestionLimit AudioAttributesCompatParcelizer(getRelatedLessonId getrelatedlessonid, getTimeStamp gettimestamp) {
        toMagicModuleMetaRepoModel.write(getrelatedlessonid, "");
        toMagicModuleMetaRepoModel.write(gettimestamp, "");
        getQuestionLimit getquestionlimitAudioAttributesCompatParcelizer = this.AudioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer(getrelatedlessonid, gettimestamp);
        if (getquestionlimitAudioAttributesCompatParcelizer != null) {
            return (getQuestionLimit) AudioAttributesCompatParcelizer(getquestionlimitAudioAttributesCompatParcelizer);
        }
        return null;
    }

    @Override // kotlin.setTags, kotlin.getMcqContentBody
    public final Collection<? extends CourseConfigV2SupportItem> read(getRelatedLessonId getrelatedlessonid, getTimeStamp gettimestamp) {
        toMagicModuleMetaRepoModel.write(getrelatedlessonid, "");
        toMagicModuleMetaRepoModel.write(gettimestamp, "");
        return write(this.AudioAttributesImplBaseParcelizer.read(getrelatedlessonid, gettimestamp));
    }

    @Override // kotlin.getMcqContentBody
    public final Collection<getVariant> read(setOption6AnsweredCount setoption6answeredcount, getAnswerMap<? super getRelatedLessonId, Boolean> getanswermap) {
        toMagicModuleMetaRepoModel.write(setoption6answeredcount, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        return write();
    }

    @Override // kotlin.setTags
    public final Set<getRelatedLessonId> aY_() {
        return this.AudioAttributesImplBaseParcelizer.aY_();
    }

    @Override // kotlin.setTags
    public final Set<getRelatedLessonId> AudioAttributesCompatParcelizer() {
        return this.AudioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer();
    }

    @Override // kotlin.setTags
    public final Set<getRelatedLessonId> aW_() {
        return this.AudioAttributesImplBaseParcelizer.aW_();
    }
}
