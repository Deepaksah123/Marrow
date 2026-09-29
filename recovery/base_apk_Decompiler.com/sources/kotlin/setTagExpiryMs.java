package kotlin;

import java.util.ArrayList;
import java.util.List;
import kotlin.setActiveRecallQbankId;

/* JADX INFO: loaded from: classes4.dex */
public final class setTagExpiryMs {
    public static final List<setActiveRecallQbankId.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver> write(setActiveRecallQbankId.RemoteActionCompatParcelizer remoteActionCompatParcelizer, setTagActive settagactive) {
        toMagicModuleMetaRepoModel.write(remoteActionCompatParcelizer, "");
        toMagicModuleMetaRepoModel.write(settagactive, "");
        List<setActiveRecallQbankId.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver> listOnPrepareFromMediaId = remoteActionCompatParcelizer.onPrepareFromMediaId();
        if (listOnPrepareFromMediaId.isEmpty()) {
            listOnPrepareFromMediaId = null;
        }
        if (listOnPrepareFromMediaId != null) {
            return listOnPrepareFromMediaId;
        }
        List<Integer> listOnPrepare = remoteActionCompatParcelizer.onPrepare();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(listOnPrepare, "");
        List<Integer> list = listOnPrepare;
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list, 10));
        for (Integer num : list) {
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(num, "");
            arrayList.add(settagactive.AudioAttributesCompatParcelizer(num.intValue()));
        }
        return arrayList;
    }

    public static final setActiveRecallQbankId.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver IconCompatParcelizer(setActiveRecallQbankId.RemoteActionCompatParcelizer remoteActionCompatParcelizer, setTagActive settagactive) {
        toMagicModuleMetaRepoModel.write(remoteActionCompatParcelizer, "");
        toMagicModuleMetaRepoModel.write(settagactive, "");
        if (remoteActionCompatParcelizer.onSetRating()) {
            return remoteActionCompatParcelizer.onCustomAction();
        }
        if (remoteActionCompatParcelizer.onSetPlaybackSpeed()) {
            return settagactive.AudioAttributesCompatParcelizer(remoteActionCompatParcelizer.onCommand());
        }
        return null;
    }

    public static final setActiveRecallQbankId.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver read(setActiveRecallQbankId.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.read readVar, setTagActive settagactive) {
        toMagicModuleMetaRepoModel.write(readVar, "");
        toMagicModuleMetaRepoModel.write(settagactive, "");
        if (readVar.AudioAttributesImplBaseParcelizer()) {
            return readVar.IconCompatParcelizer();
        }
        if (readVar.MediaDescriptionCompat()) {
            return settagactive.AudioAttributesCompatParcelizer(readVar.write());
        }
        return null;
    }

    public static final setActiveRecallQbankId.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver IconCompatParcelizer(setActiveRecallQbankId.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, setTagActive settagactive) {
        toMagicModuleMetaRepoModel.write(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, "");
        toMagicModuleMetaRepoModel.write(settagactive, "");
        if (mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.onPrepare()) {
            return mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.MediaDescriptionCompat();
        }
        if (mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.onPlayFromSearch()) {
            return settagactive.AudioAttributesCompatParcelizer(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.MediaBrowserCompatSearchResultReceiver());
        }
        return null;
    }

    public static final List<setActiveRecallQbankId.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver> IconCompatParcelizer(setActiveRecallQbankId.onCustomAction oncustomaction, setTagActive settagactive) {
        toMagicModuleMetaRepoModel.write(oncustomaction, "");
        toMagicModuleMetaRepoModel.write(settagactive, "");
        List<setActiveRecallQbankId.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver> listMediaBrowserCompatItemReceiver = oncustomaction.MediaBrowserCompatItemReceiver();
        if (listMediaBrowserCompatItemReceiver.isEmpty()) {
            listMediaBrowserCompatItemReceiver = null;
        }
        if (listMediaBrowserCompatItemReceiver != null) {
            return listMediaBrowserCompatItemReceiver;
        }
        List<Integer> listAudioAttributesImplBaseParcelizer = oncustomaction.AudioAttributesImplBaseParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(listAudioAttributesImplBaseParcelizer, "");
        List<Integer> list = listAudioAttributesImplBaseParcelizer;
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list, 10));
        for (Integer num : list) {
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(num, "");
            arrayList.add(settagactive.AudioAttributesCompatParcelizer(num.intValue()));
        }
        return arrayList;
    }

    public static final setActiveRecallQbankId.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver write(setActiveRecallQbankId.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer, setTagActive settagactive) {
        toMagicModuleMetaRepoModel.write(audioAttributesImplApi26Parcelizer, "");
        toMagicModuleMetaRepoModel.write(settagactive, "");
        if (audioAttributesImplApi26Parcelizer.onPlayFromSearch()) {
            setActiveRecallQbankId.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiverMediaMetadataCompat = audioAttributesImplApi26Parcelizer.MediaMetadataCompat();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiverMediaMetadataCompat, "");
            return mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiverMediaMetadataCompat;
        }
        if (audioAttributesImplApi26Parcelizer.onPlayFromUri()) {
            return settagactive.AudioAttributesCompatParcelizer(audioAttributesImplApi26Parcelizer.handleMediaPlayPauseIfPendingOnHandler());
        }
        throw new IllegalStateException("No returnType in ProtoBuf.Function".toString());
    }

    public static final boolean write(setActiveRecallQbankId.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer) {
        toMagicModuleMetaRepoModel.write(audioAttributesImplApi26Parcelizer, "");
        return audioAttributesImplApi26Parcelizer.onPlay() || audioAttributesImplApi26Parcelizer.onFastForward();
    }

    public static final setActiveRecallQbankId.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver RemoteActionCompatParcelizer(setActiveRecallQbankId.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer, setTagActive settagactive) {
        toMagicModuleMetaRepoModel.write(audioAttributesImplApi26Parcelizer, "");
        toMagicModuleMetaRepoModel.write(settagactive, "");
        if (audioAttributesImplApi26Parcelizer.onPlay()) {
            return audioAttributesImplApi26Parcelizer.MediaBrowserCompatSearchResultReceiver();
        }
        if (audioAttributesImplApi26Parcelizer.onFastForward()) {
            return settagactive.AudioAttributesCompatParcelizer(audioAttributesImplApi26Parcelizer.MediaBrowserCompatMediaItem());
        }
        return null;
    }

    public static final setActiveRecallQbankId.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver write(setActiveRecallQbankId.MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem, setTagActive settagactive) {
        toMagicModuleMetaRepoModel.write(mediaBrowserCompatMediaItem, "");
        toMagicModuleMetaRepoModel.write(settagactive, "");
        if (mediaBrowserCompatMediaItem.onPlayFromSearch()) {
            setActiveRecallQbankId.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiverMediaBrowserCompatMediaItem = mediaBrowserCompatMediaItem.MediaBrowserCompatMediaItem();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiverMediaBrowserCompatMediaItem, "");
            return mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiverMediaBrowserCompatMediaItem;
        }
        if (mediaBrowserCompatMediaItem.onPlayFromUri()) {
            return settagactive.AudioAttributesCompatParcelizer(mediaBrowserCompatMediaItem.onAddQueueItem());
        }
        throw new IllegalStateException("No returnType in ProtoBuf.Property".toString());
    }

    public static final boolean read(setActiveRecallQbankId.MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem) {
        toMagicModuleMetaRepoModel.write(mediaBrowserCompatMediaItem, "");
        return mediaBrowserCompatMediaItem.onPause() || mediaBrowserCompatMediaItem.onPlay();
    }

    public static final setActiveRecallQbankId.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver AudioAttributesCompatParcelizer(setActiveRecallQbankId.MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem, setTagActive settagactive) {
        toMagicModuleMetaRepoModel.write(mediaBrowserCompatMediaItem, "");
        toMagicModuleMetaRepoModel.write(settagactive, "");
        if (mediaBrowserCompatMediaItem.onPause()) {
            return mediaBrowserCompatMediaItem.MediaBrowserCompatSearchResultReceiver();
        }
        if (mediaBrowserCompatMediaItem.onPlay()) {
            return settagactive.AudioAttributesCompatParcelizer(mediaBrowserCompatMediaItem.MediaMetadataCompat());
        }
        return null;
    }

    public static final setActiveRecallQbankId.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver write(setActiveRecallQbankId.handleMediaPlayPauseIfPendingOnHandler handlemediaplaypauseifpendingonhandler, setTagActive settagactive) {
        toMagicModuleMetaRepoModel.write(handlemediaplaypauseifpendingonhandler, "");
        toMagicModuleMetaRepoModel.write(settagactive, "");
        if (handlemediaplaypauseifpendingonhandler.MediaMetadataCompat()) {
            setActiveRecallQbankId.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiverIconCompatParcelizer = handlemediaplaypauseifpendingonhandler.IconCompatParcelizer();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiverIconCompatParcelizer, "");
            return mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiverIconCompatParcelizer;
        }
        if (handlemediaplaypauseifpendingonhandler.handleMediaPlayPauseIfPendingOnHandler()) {
            return settagactive.AudioAttributesCompatParcelizer(handlemediaplaypauseifpendingonhandler.AudioAttributesImplBaseParcelizer());
        }
        throw new IllegalStateException("No type in ProtoBuf.ValueParameter".toString());
    }

    public static final setActiveRecallQbankId.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver RemoteActionCompatParcelizer(setActiveRecallQbankId.handleMediaPlayPauseIfPendingOnHandler handlemediaplaypauseifpendingonhandler, setTagActive settagactive) {
        toMagicModuleMetaRepoModel.write(handlemediaplaypauseifpendingonhandler, "");
        toMagicModuleMetaRepoModel.write(settagactive, "");
        if (handlemediaplaypauseifpendingonhandler.onCustomAction()) {
            return handlemediaplaypauseifpendingonhandler.MediaBrowserCompatItemReceiver();
        }
        if (handlemediaplaypauseifpendingonhandler.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()) {
            return settagactive.AudioAttributesCompatParcelizer(handlemediaplaypauseifpendingonhandler.MediaBrowserCompatMediaItem());
        }
        return null;
    }

    public static final setActiveRecallQbankId.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver read(setActiveRecallQbankId.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, setTagActive settagactive) {
        toMagicModuleMetaRepoModel.write(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, "");
        toMagicModuleMetaRepoModel.write(settagactive, "");
        if (mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.onPrepareFromSearch()) {
            return mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        }
        if (mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.onRemoveQueueItemAt()) {
            return settagactive.AudioAttributesCompatParcelizer(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.onCustomAction());
        }
        return null;
    }

    public static final setActiveRecallQbankId.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver RemoteActionCompatParcelizer(setActiveRecallQbankId.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, setTagActive settagactive) {
        toMagicModuleMetaRepoModel.write(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, "");
        toMagicModuleMetaRepoModel.write(settagactive, "");
        if (mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.onPlayFromMediaId()) {
            return mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.write();
        }
        if (mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.onFastForward()) {
            return settagactive.AudioAttributesCompatParcelizer(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.AudioAttributesCompatParcelizer());
        }
        return null;
    }

    public static final setActiveRecallQbankId.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver write(setActiveRecallQbankId.onCommand oncommand, setTagActive settagactive) {
        toMagicModuleMetaRepoModel.write(oncommand, "");
        toMagicModuleMetaRepoModel.write(settagactive, "");
        if (oncommand.onAddQueueItem()) {
            setActiveRecallQbankId.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiverMediaBrowserCompatMediaItem = oncommand.MediaBrowserCompatMediaItem();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiverMediaBrowserCompatMediaItem, "");
            return mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiverMediaBrowserCompatMediaItem;
        }
        if (oncommand.handleMediaPlayPauseIfPendingOnHandler()) {
            return settagactive.AudioAttributesCompatParcelizer(oncommand.MediaBrowserCompatSearchResultReceiver());
        }
        throw new IllegalStateException("No underlyingType in ProtoBuf.TypeAlias".toString());
    }

    public static final setActiveRecallQbankId.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver IconCompatParcelizer(setActiveRecallQbankId.onCommand oncommand, setTagActive settagactive) {
        toMagicModuleMetaRepoModel.write(oncommand, "");
        toMagicModuleMetaRepoModel.write(settagactive, "");
        if (oncommand.MediaDescriptionCompat()) {
            setActiveRecallQbankId.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiverIconCompatParcelizer = oncommand.IconCompatParcelizer();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiverIconCompatParcelizer, "");
            return mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiverIconCompatParcelizer;
        }
        if (oncommand.onCommand()) {
            return settagactive.AudioAttributesCompatParcelizer(oncommand.write());
        }
        throw new IllegalStateException("No expandedType in ProtoBuf.TypeAlias".toString());
    }

    public static final List<setActiveRecallQbankId.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver> read(setActiveRecallQbankId.RemoteActionCompatParcelizer remoteActionCompatParcelizer, setTagActive settagactive) {
        toMagicModuleMetaRepoModel.write(remoteActionCompatParcelizer, "");
        toMagicModuleMetaRepoModel.write(settagactive, "");
        List<setActiveRecallQbankId.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver> listMediaBrowserCompatItemReceiver = remoteActionCompatParcelizer.MediaBrowserCompatItemReceiver();
        if (listMediaBrowserCompatItemReceiver.isEmpty()) {
            listMediaBrowserCompatItemReceiver = null;
        }
        if (listMediaBrowserCompatItemReceiver != null) {
            return listMediaBrowserCompatItemReceiver;
        }
        List<Integer> listWrite = remoteActionCompatParcelizer.write();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(listWrite, "");
        List<Integer> list = listWrite;
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list, 10));
        for (Integer num : list) {
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(num, "");
            arrayList.add(settagactive.AudioAttributesCompatParcelizer(num.intValue()));
        }
        return arrayList;
    }

    public static final List<setActiveRecallQbankId.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver> AudioAttributesCompatParcelizer(setActiveRecallQbankId.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer, setTagActive settagactive) {
        toMagicModuleMetaRepoModel.write(audioAttributesImplApi26Parcelizer, "");
        toMagicModuleMetaRepoModel.write(settagactive, "");
        List<setActiveRecallQbankId.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver> listAudioAttributesCompatParcelizer = audioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer();
        if (listAudioAttributesCompatParcelizer.isEmpty()) {
            listAudioAttributesCompatParcelizer = null;
        }
        if (listAudioAttributesCompatParcelizer != null) {
            return listAudioAttributesCompatParcelizer;
        }
        List<Integer> listIconCompatParcelizer = audioAttributesImplApi26Parcelizer.IconCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(listIconCompatParcelizer, "");
        List<Integer> list = listIconCompatParcelizer;
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list, 10));
        for (Integer num : list) {
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(num, "");
            arrayList.add(settagactive.AudioAttributesCompatParcelizer(num.intValue()));
        }
        return arrayList;
    }

    public static final List<setActiveRecallQbankId.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver> RemoteActionCompatParcelizer(setActiveRecallQbankId.MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem, setTagActive settagactive) {
        toMagicModuleMetaRepoModel.write(mediaBrowserCompatMediaItem, "");
        toMagicModuleMetaRepoModel.write(settagactive, "");
        List<setActiveRecallQbankId.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver> listIconCompatParcelizer = mediaBrowserCompatMediaItem.IconCompatParcelizer();
        if (listIconCompatParcelizer.isEmpty()) {
            listIconCompatParcelizer = null;
        }
        if (listIconCompatParcelizer != null) {
            return listIconCompatParcelizer;
        }
        List<Integer> listWrite = mediaBrowserCompatMediaItem.write();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(listWrite, "");
        List<Integer> list = listWrite;
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list, 10));
        for (Integer num : list) {
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(num, "");
            arrayList.add(settagactive.AudioAttributesCompatParcelizer(num.intValue()));
        }
        return arrayList;
    }
}
