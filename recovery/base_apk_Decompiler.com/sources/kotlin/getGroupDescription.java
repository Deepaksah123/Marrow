package kotlin;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class getGroupDescription extends getVideoLessonId<getIndividualPlan<?>, getIndividualPlan<?>> implements Iterable<getIndividualPlan<?>> {
    public static final AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer = new AudioAttributesCompatParcelizer(0);
    private static final getGroupDescription RemoteActionCompatParcelizer = new getGroupDescription((List<? extends getIndividualPlan<?>>) IntermediateLoginResponseBody.RemoteActionCompatParcelizer());

    private getGroupDescription(List<? extends getIndividualPlan<?>> list) {
        for (getIndividualPlan<?> getindividualplan : list) {
            AudioAttributesCompatParcelizer(getindividualplan.RemoteActionCompatParcelizer(), getindividualplan);
        }
    }

    public static final class AudioAttributesCompatParcelizer extends SubjectCompletionInfo<getIndividualPlan<?>, getIndividualPlan<?>> {
        private AudioAttributesCompatParcelizer() {
        }

        @Override // kotlin.SubjectCompletionInfo
        public final int write(ConcurrentHashMap<String, Integer> concurrentHashMap, String str, getAnswerMap<? super String, Integer> getanswermap) {
            int iIntValue;
            toMagicModuleMetaRepoModel.write(concurrentHashMap, "");
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(getanswermap, "");
            Integer num = concurrentHashMap.get(str);
            if (num != null) {
                return num.intValue();
            }
            synchronized (concurrentHashMap) {
                Integer num2 = concurrentHashMap.get(str);
                if (num2 == null) {
                    Integer numInvoke = getanswermap.invoke(str);
                    concurrentHashMap.putIfAbsent(str, Integer.valueOf(numInvoke.intValue()));
                    num2 = numInvoke;
                }
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(num2, "");
                iIntValue = num2.intValue();
            }
            return iIntValue;
        }

        public static getGroupDescription RemoteActionCompatParcelizer() {
            return getGroupDescription.RemoteActionCompatParcelizer;
        }

        public static getGroupDescription write(List<? extends getIndividualPlan<?>> list) {
            toMagicModuleMetaRepoModel.write(list, "");
            if (list.isEmpty()) {
                return RemoteActionCompatParcelizer();
            }
            return new getGroupDescription(list, (byte) 0);
        }

        public /* synthetic */ AudioAttributesCompatParcelizer(byte b) {
            this();
        }
    }

    private getGroupDescription(getIndividualPlan<?> getindividualplan) {
        this((List<? extends getIndividualPlan<?>>) IntermediateLoginResponseBody.RemoteActionCompatParcelizer(getindividualplan));
    }

    private boolean read(getIndividualPlan<?> getindividualplan) {
        toMagicModuleMetaRepoModel.write(getindividualplan, "");
        return IconCompatParcelizer().AudioAttributesCompatParcelizer(AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer((isHdPlaybackError) getindividualplan.RemoteActionCompatParcelizer())) != null;
    }

    public final getGroupDescription RemoteActionCompatParcelizer(getIndividualPlan<?> getindividualplan) {
        toMagicModuleMetaRepoModel.write(getindividualplan, "");
        return read(getindividualplan) ? this : write() ? new getGroupDescription(getindividualplan) : AudioAttributesCompatParcelizer.write((List<? extends getIndividualPlan<?>>) IntermediateLoginResponseBody.read((Collection<? extends getIndividualPlan<?>>) IntermediateLoginResponseBody.onPlay(this), getindividualplan));
    }

    public final getGroupDescription AudioAttributesCompatParcelizer(getIndividualPlan<?> getindividualplan) {
        toMagicModuleMetaRepoModel.write(getindividualplan, "");
        if (write()) {
            return this;
        }
        setSearchTimes<getIndividualPlan<?>> setsearchtimesIconCompatParcelizer = IconCompatParcelizer();
        ArrayList arrayList = new ArrayList();
        for (getIndividualPlan<?> getindividualplan2 : setsearchtimesIconCompatParcelizer) {
            if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getindividualplan2, getindividualplan)) {
                arrayList.add(getindividualplan2);
            }
        }
        ArrayList arrayList2 = arrayList;
        return arrayList2.size() == IconCompatParcelizer().RemoteActionCompatParcelizer() ? this : AudioAttributesCompatParcelizer.write(arrayList2);
    }

    @Override // kotlin.Subject
    public final SubjectCompletionInfo<getIndividualPlan<?>, getIndividualPlan<?>> RemoteActionCompatParcelizer() {
        return AudioAttributesCompatParcelizer;
    }

    public final getGroupDescription AudioAttributesCompatParcelizer(getGroupDescription getgroupdescription) {
        getIndividualPlan getindividualplanRemoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.write(getgroupdescription, "");
        if (write() && getgroupdescription.write()) {
            return this;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = AudioAttributesCompatParcelizer.read().iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            getIndividualPlan<?> getindividualplanAudioAttributesCompatParcelizer = IconCompatParcelizer().AudioAttributesCompatParcelizer(iIntValue);
            getIndividualPlan<?> getindividualplanAudioAttributesCompatParcelizer2 = getgroupdescription.IconCompatParcelizer().AudioAttributesCompatParcelizer(iIntValue);
            if (getindividualplanAudioAttributesCompatParcelizer == null) {
                getindividualplanRemoteActionCompatParcelizer = getindividualplanAudioAttributesCompatParcelizer2 != null ? getindividualplanAudioAttributesCompatParcelizer2.RemoteActionCompatParcelizer(getindividualplanAudioAttributesCompatParcelizer) : null;
            } else {
                getindividualplanRemoteActionCompatParcelizer = getindividualplanAudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(getindividualplanAudioAttributesCompatParcelizer2);
            }
            SubjectGroupTypeConstant.write(arrayList, getindividualplanRemoteActionCompatParcelizer);
        }
        return AudioAttributesCompatParcelizer.write(arrayList);
    }

    public final getGroupDescription IconCompatParcelizer(getGroupDescription getgroupdescription) {
        getIndividualPlan getindividualplanAudioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.write(getgroupdescription, "");
        if (write() && getgroupdescription.write()) {
            return this;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = AudioAttributesCompatParcelizer.read().iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            getIndividualPlan<?> getindividualplanAudioAttributesCompatParcelizer2 = IconCompatParcelizer().AudioAttributesCompatParcelizer(iIntValue);
            getIndividualPlan<?> getindividualplanAudioAttributesCompatParcelizer3 = getgroupdescription.IconCompatParcelizer().AudioAttributesCompatParcelizer(iIntValue);
            if (getindividualplanAudioAttributesCompatParcelizer2 == null) {
                getindividualplanAudioAttributesCompatParcelizer = getindividualplanAudioAttributesCompatParcelizer3 != null ? getindividualplanAudioAttributesCompatParcelizer3.AudioAttributesCompatParcelizer(getindividualplanAudioAttributesCompatParcelizer2) : null;
            } else {
                getindividualplanAudioAttributesCompatParcelizer = getindividualplanAudioAttributesCompatParcelizer2.AudioAttributesCompatParcelizer(getindividualplanAudioAttributesCompatParcelizer3);
            }
            SubjectGroupTypeConstant.write(arrayList, getindividualplanAudioAttributesCompatParcelizer);
        }
        return AudioAttributesCompatParcelizer.write(arrayList);
    }

    public /* synthetic */ getGroupDescription(List list, byte b) {
        this((List<? extends getIndividualPlan<?>>) list);
    }
}
