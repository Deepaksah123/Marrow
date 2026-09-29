package kotlin;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.setActiveRecallQbankId;

/* JADX INFO: loaded from: classes4.dex */
public final class getMcqIndex {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T extends TaxPercentInfoCompanion> CourseConfigV2ZenAreaItem<T> AudioAttributesCompatParcelizer(setActiveRecallQbankId.RemoteActionCompatParcelizer remoteActionCompatParcelizer, setRatingCount setratingcount, setTagActive settagactive, getAnswerMap<? super setActiveRecallQbankId.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, ? extends T> getanswermap, getAnswerMap<? super getRelatedLessonId, ? extends T> getanswermap2) {
        T tInvoke;
        ArrayList arrayListOnMediaButtonEvent;
        toMagicModuleMetaRepoModel.write(remoteActionCompatParcelizer, "");
        toMagicModuleMetaRepoModel.write(setratingcount, "");
        toMagicModuleMetaRepoModel.write(settagactive, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        toMagicModuleMetaRepoModel.write(getanswermap2, "");
        if (remoteActionCompatParcelizer.handleMediaPlayPauseIfPendingOnHandler() > 0) {
            List<Integer> listOnAddQueueItem = remoteActionCompatParcelizer.onAddQueueItem();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(listOnAddQueueItem, "");
            List<Integer> list = listOnAddQueueItem;
            ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list, 10));
            for (Integer num : list) {
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(num, "");
                arrayList.add(FilterItemRecordCreator.read(setratingcount, num.intValue()));
            }
            ArrayList arrayList2 = arrayList;
            Pair pairWrite = setAction.write(Integer.valueOf(remoteActionCompatParcelizer.onPlay()), Integer.valueOf(remoteActionCompatParcelizer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()));
            if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(pairWrite, setAction.write(Integer.valueOf(arrayList2.size()), 0))) {
                if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(pairWrite, setAction.write(0, Integer.valueOf(arrayList2.size())))) {
                    StringBuilder sb = new StringBuilder("class ");
                    sb.append(FilterItemRecordCreator.read(setratingcount, remoteActionCompatParcelizer.MediaMetadataCompat()));
                    sb.append(" has illegal multi-field value class representation");
                    throw new IllegalStateException(sb.toString().toString());
                }
                arrayListOnMediaButtonEvent = remoteActionCompatParcelizer.onMediaButtonEvent();
            } else {
                List<Integer> listOnPlayFromMediaId = remoteActionCompatParcelizer.onPlayFromMediaId();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(listOnPlayFromMediaId, "");
                List<Integer> list2 = listOnPlayFromMediaId;
                ArrayList arrayList3 = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list2, 10));
                for (Integer num2 : list2) {
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(num2, "");
                    arrayList3.add(settagactive.AudioAttributesCompatParcelizer(num2.intValue()));
                }
                arrayListOnMediaButtonEvent = arrayList3;
            }
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(arrayListOnMediaButtonEvent, "");
            List<setActiveRecallQbankId.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver> list3 = arrayListOnMediaButtonEvent;
            ArrayList arrayList4 = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list3, 10));
            Iterator<T> it = list3.iterator();
            while (it.hasNext()) {
                arrayList4.add(getanswermap.invoke(it.next()));
            }
            return new getMiddleSection(IntermediateLoginResponseBody.AudioAttributesImplApi26Parcelizer(arrayList2, arrayList4));
        }
        if (!remoteActionCompatParcelizer.onSetCaptioningEnabled()) {
            return null;
        }
        getRelatedLessonId getrelatedlessonid = FilterItemRecordCreator.read(setratingcount, remoteActionCompatParcelizer.MediaBrowserCompatSearchResultReceiver());
        setActiveRecallQbankId.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiverIconCompatParcelizer = setTagExpiryMs.IconCompatParcelizer(remoteActionCompatParcelizer, settagactive);
        if ((mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiverIconCompatParcelizer == null || (tInvoke = getanswermap.invoke(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiverIconCompatParcelizer)) == null) && (tInvoke = getanswermap2.invoke(getrelatedlessonid)) == null) {
            StringBuilder sb2 = new StringBuilder("cannot determine underlying type for value class ");
            sb2.append(FilterItemRecordCreator.read(setratingcount, remoteActionCompatParcelizer.MediaMetadataCompat()));
            sb2.append(" with property ");
            sb2.append(getrelatedlessonid);
            throw new IllegalStateException(sb2.toString().toString());
        }
        return new CourseConfigV2NavDrawerItemMarrowNotes(getrelatedlessonid, tInvoke);
    }
}
