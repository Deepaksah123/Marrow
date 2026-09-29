package kotlin;

import android.view.KeyEvent;
import java.util.Collection;
import java.util.List;
import kotlin.MagicModuleUseCaseImplWhenMappings;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0000\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001e\u001a\u00020\u0016*\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0013\u0010 \u001a\u00020\u0016*\u00020\u001dH\u0002¢\u0006\u0004\b \u0010!J\u0019\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010\u0003\u001a\u00020\"H\u0002¢\u0006\u0004\b$\u0010%J\u0015\u0010&\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\"¢\u0006\u0004\b&\u0010'J#\u0010\u001e\u001a\u00020\u00162\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u00160\u0015H\u0002¢\u0006\u0004\b\u001e\u0010)R\u0011\u0010$\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b*\u0010+R\u0011\u0010.\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b,\u0010-R\u0011\u0010&\u001a\u00020\u00068\u0006¢\u0006\u0006\n\u0004\b/\u00100R\u0011\u0010 \u001a\u00020\b8\u0006¢\u0006\u0006\n\u0004\b&\u00101R\u0011\u0010\u001e\u001a\u00020\b8\u0006¢\u0006\u0006\n\u0004\b2\u00101R\u0011\u0010,\u001a\u00020\u000b8\u0006¢\u0006\u0006\n\u0004\b3\u00104R\u0011\u00102\u001a\u00020\r8\u0006¢\u0006\u0006\n\u0004\b$\u00105R\u0013\u00103\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010*\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u00108R\u0014\u0010:\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u00109R \u0010<\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00160\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010>\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010="}, d2 = {"Lo/PagingPlaceholderKey;", "", "Lo/setImageDisplayMode;", "p0", "Lo/Typed3EpoxyController;", "p1", "Lo/hasValueTypeDeserializer;", "p2", "", "p3", "p4", "Lo/setFontAssetDelegate;", "p5", "Lo/SettableBeanProperty;", "p6", "Lo/setStateRestorationPolicy;", "p7", "Lo/getUseArtwork;", "p8", "Lo/setControllerHideOnTouch;", "p9", "Lkotlin/Function1;", "", "p10", "Lo/ResolvableDeserializer;", "p11", "<init>", "(Lo/setImageDisplayMode;Lo/Typed3EpoxyController;Lo/hasValueTypeDeserializer;ZZLo/setFontAssetDelegate;Lo/SettableBeanProperty;Lo/setStateRestorationPolicy;Lo/getUseArtwork;Lo/setControllerHideOnTouch;Lo/getAnswerMap;ILo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "", "Lo/findBeanDeserializer;", "IconCompatParcelizer", "(Ljava/util/List;)V", "RemoteActionCompatParcelizer", "(Lo/findBeanDeserializer;)V", "Lo/constructType;", "Lo/Deserializers;", "write", "(Landroid/view/KeyEvent;)Lo/Deserializers;", "AudioAttributesCompatParcelizer", "(Landroid/view/KeyEvent;)Z", "Lo/NoOpControllerHelper;", "(Lo/getAnswerMap;)V", "MediaBrowserCompatItemReceiver", "Lo/setImageDisplayMode;", "AudioAttributesImplApi26Parcelizer", "Lo/Typed3EpoxyController;", "read", "RatingCompat", "Lo/hasValueTypeDeserializer;", "Z", "AudioAttributesImplBaseParcelizer", "AudioAttributesImplApi21Parcelizer", "Lo/setFontAssetDelegate;", "Lo/SettableBeanProperty;", "MediaDescriptionCompat", "Lo/setStateRestorationPolicy;", "Lo/getUseArtwork;", "Lo/setControllerHideOnTouch;", "MediaBrowserCompatCustomActionResultReceiver", "Lo/getAnswerMap;", "MediaBrowserCompatMediaItem", "I", "MediaMetadataCompat"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PagingPlaceholderKey {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final boolean RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final setFontAssetDelegate AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final Typed3EpoxyController read;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final boolean IconCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final setControllerHideOnTouch MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final getAnswerMap<hasValueTypeDeserializer, getShowPopup> MediaBrowserCompatMediaItem;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final setImageDisplayMode write;

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private final setStateRestorationPolicy AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private final hasValueTypeDeserializer AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final getUseArtwork MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final int MediaMetadataCompat;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final SettableBeanProperty AudioAttributesImplBaseParcelizer;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] RemoteActionCompatParcelizer;

        static {
            int[] iArr = new int[setControllerAutoShow.values().length];
            try {
                iArr[setControllerAutoShow.AudioAttributesCompatParcelizer.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[setControllerAutoShow.onMediaButtonEvent.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[setControllerAutoShow.read.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[setControllerAutoShow.MediaBrowserCompatSearchResultReceiver.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[setControllerAutoShow.onPlayFromUri.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[setControllerAutoShow.onCommand.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[setControllerAutoShow.onPrepare.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[setControllerAutoShow.onPrepareFromSearch.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[setControllerAutoShow.onPause.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[setControllerAutoShow.MediaSessionCompatResultReceiverWrapper.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[setControllerAutoShow.RatingCompat.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[setControllerAutoShow.onPlayFromMediaId.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[setControllerAutoShow.onPlay.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[setControllerAutoShow.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[setControllerAutoShow.onCustomAction.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[setControllerAutoShow.onAddQueueItem.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[setControllerAutoShow.handleMediaPlayPauseIfPendingOnHandler.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[setControllerAutoShow.MediaMetadataCompat.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[setControllerAutoShow.MediaDescriptionCompat.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[setControllerAutoShow.AudioAttributesImplBaseParcelizer.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[setControllerAutoShow.AudioAttributesImplApi26Parcelizer.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[setControllerAutoShow.AudioAttributesImplApi21Parcelizer.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[setControllerAutoShow.MediaBrowserCompatItemReceiver.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[setControllerAutoShow.RemoteActionCompatParcelizer.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[setControllerAutoShow.MediaBrowserCompatCustomActionResultReceiver.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[setControllerAutoShow.onFastForward.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[setControllerAutoShow.MediaSessionCompatToken.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[setControllerAutoShow.onPrepareFromMediaId.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[setControllerAutoShow.onPrepareFromUri.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[setControllerAutoShow.setSessionImpl.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[setControllerAutoShow.onRemoveQueueItem.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[setControllerAutoShow.onSkipToQueueItem.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[setControllerAutoShow.onSkipToPrevious.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[setControllerAutoShow.onSetRepeatMode.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[setControllerAutoShow.onSetCaptioningEnabled.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[setControllerAutoShow.onSetPlaybackSpeed.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr[setControllerAutoShow.onSetRating.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr[setControllerAutoShow.onSetShuffleMode.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr[setControllerAutoShow.PlaybackStateCompat.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr[setControllerAutoShow.onRemoveQueueItemAt.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr[setControllerAutoShow.onStop.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr[setControllerAutoShow.onSkipToNext.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr[setControllerAutoShow.onSeekTo.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr[setControllerAutoShow.onRewind.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr[setControllerAutoShow.MediaBrowserCompatMediaItem.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr[setControllerAutoShow.MediaSessionCompatQueueItem.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr[setControllerAutoShow.onPlayFromSearch.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr[setControllerAutoShow.IconCompatParcelizer.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                iArr[setControllerAutoShow.write.ordinal()] = 49;
            } catch (NoSuchFieldError unused49) {
            }
            RemoteActionCompatParcelizer = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private PagingPlaceholderKey(setImageDisplayMode setimagedisplaymode, Typed3EpoxyController typed3EpoxyController, hasValueTypeDeserializer hasvaluetypedeserializer, boolean z, boolean z2, setFontAssetDelegate setfontassetdelegate, SettableBeanProperty settableBeanProperty, setStateRestorationPolicy setstaterestorationpolicy, getUseArtwork getuseartwork, setControllerHideOnTouch setcontrollerhideontouch, getAnswerMap<? super hasValueTypeDeserializer, getShowPopup> getanswermap, int i) {
        this.write = setimagedisplaymode;
        this.read = typed3EpoxyController;
        this.AudioAttributesCompatParcelizer = hasvaluetypedeserializer;
        this.RemoteActionCompatParcelizer = z;
        this.IconCompatParcelizer = z2;
        this.AudioAttributesImplApi26Parcelizer = setfontassetdelegate;
        this.AudioAttributesImplBaseParcelizer = settableBeanProperty;
        this.AudioAttributesImplApi21Parcelizer = setstaterestorationpolicy;
        this.MediaBrowserCompatItemReceiver = getuseartwork;
        this.MediaBrowserCompatCustomActionResultReceiver = setcontrollerhideontouch;
        this.MediaBrowserCompatMediaItem = getanswermap;
        this.MediaMetadataCompat = i;
    }

    public /* synthetic */ PagingPlaceholderKey(setImageDisplayMode setimagedisplaymode, Typed3EpoxyController typed3EpoxyController, hasValueTypeDeserializer hasvaluetypedeserializer, boolean z, boolean z2, setFontAssetDelegate setfontassetdelegate, SettableBeanProperty settableBeanProperty, setStateRestorationPolicy setstaterestorationpolicy, getUseArtwork getuseartwork, setControllerHideOnTouch setcontrollerhideontouch, getAnswerMap getanswermap, int i, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(setimagedisplaymode, typed3EpoxyController, (i2 & 4) != 0 ? new hasValueTypeDeserializer((String) null, 0L, (findProperty) null, 7, (MagicModuleRepositoryImplExternalSyntheticLambda0) null) : hasvaluetypedeserializer, (i2 & 8) != 0 ? true : z, (i2 & 16) != 0 ? false : z2, setfontassetdelegate, (i2 & 64) != 0 ? SettableBeanProperty.INSTANCE.RemoteActionCompatParcelizer() : settableBeanProperty, (i2 & 128) != 0 ? null : setstaterestorationpolicy, getuseartwork, (i2 & 512) != 0 ? setControllerVisibilityListener.RemoteActionCompatParcelizer() : setcontrollerhideontouch, (i2 & 1024) != 0 ? new getAnswerMap() { // from class: o.isLayoutSuppressed
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return PagingPlaceholderKey.write((hasValueTypeDeserializer) obj);
            }
        } : getanswermap, i, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(hasValueTypeDeserializer hasvaluetypedeserializer) {
        return getShowPopup.INSTANCE;
    }

    private final void IconCompatParcelizer(List<? extends findBeanDeserializer> list) {
        DeserializersBase write = this.write.getWrite();
        List<? extends findBeanDeserializer> listMediaBrowserCompatItemReceiver = IntermediateLoginResponseBody.MediaBrowserCompatItemReceiver((Collection) list);
        listMediaBrowserCompatItemReceiver.add(0, new findTreeNodeDeserializer());
        this.MediaBrowserCompatMediaItem.invoke(write.read(listMediaBrowserCompatItemReceiver));
    }

    private final void RemoteActionCompatParcelizer(findBeanDeserializer findbeandeserializer) {
        IconCompatParcelizer(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(findbeandeserializer));
    }

    private final Deserializers write(KeyEvent p0) {
        Integer num;
        if (setHasFixedSize.write(p0) && (num = this.MediaBrowserCompatItemReceiver.read(p0)) != null) {
            return new Deserializers(setUserDefaultStyle.write(new StringBuilder(), num.intValue()).toString(), 1);
        }
        return null;
    }

    public final boolean AudioAttributesCompatParcelizer(KeyEvent p0) {
        final setControllerAutoShow setcontrollerautoshowIconCompatParcelizer;
        Deserializers deserializersWrite = write(p0);
        if (deserializersWrite != null) {
            if (!this.RemoteActionCompatParcelizer) {
                return false;
            }
            RemoteActionCompatParcelizer(deserializersWrite);
            this.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer();
            return true;
        }
        if (!_throwNotASubtype.read(_throwSubtypeClassNotAllowed.RemoteActionCompatParcelizer(p0), _throwNotASubtype.INSTANCE.read()) || (setcontrollerautoshowIconCompatParcelizer = this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer(p0)) == null || (setcontrollerautoshowIconCompatParcelizer.getRemoteActionCompatParcelizer() && !this.RemoteActionCompatParcelizer)) {
            return false;
        }
        final MagicModuleUseCaseImplWhenMappings.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = new MagicModuleUseCaseImplWhenMappings.AudioAttributesCompatParcelizer();
        audioAttributesCompatParcelizer.IconCompatParcelizer = true;
        IconCompatParcelizer(new getAnswerMap() { // from class: o.GridLayoutManager
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return PagingPlaceholderKey.AudioAttributesCompatParcelizer(setcontrollerautoshowIconCompatParcelizer, this, audioAttributesCompatParcelizer, (NoOpControllerHelper) obj);
            }
        });
        setStateRestorationPolicy setstaterestorationpolicy = this.AudioAttributesImplApi21Parcelizer;
        if (setstaterestorationpolicy != null) {
            setstaterestorationpolicy.write();
        }
        return audioAttributesCompatParcelizer.IconCompatParcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(setControllerAutoShow setcontrollerautoshow, PagingPlaceholderKey pagingPlaceholderKey, MagicModuleUseCaseImplWhenMappings.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, NoOpControllerHelper noOpControllerHelper) {
        hasValueTypeDeserializer hasvaluetypedeserializerRemoteActionCompatParcelizer;
        hasValueTypeDeserializer hasvaluetypedeserializer;
        switch (WhenMappings.RemoteActionCompatParcelizer[setcontrollerautoshow.ordinal()]) {
            case 1:
                pagingPlaceholderKey.read.write(false);
                return getShowPopup.INSTANCE;
            case 2:
                pagingPlaceholderKey.read.onRemoveQueueItemAt();
                return getShowPopup.INSTANCE;
            case 3:
                pagingPlaceholderKey.read.MediaBrowserCompatItemReceiver();
                return getShowPopup.INSTANCE;
            case 4:
                noOpControllerHelper.AudioAttributesCompatParcelizer(new getAnswerMap() { // from class: o.ProfileInstallerInitializer
                    @Override // kotlin.getAnswerMap
                    public final Object invoke(Object obj) {
                        return PagingPlaceholderKey.AudioAttributesImplBaseParcelizer((NoOpControllerHelper) obj);
                    }
                });
                return getShowPopup.INSTANCE;
            case 5:
                noOpControllerHelper.read(new getAnswerMap() { // from class: o.setVerboseLoggingEnabled
                    @Override // kotlin.getAnswerMap
                    public final Object invoke(Object obj) {
                        return PagingPlaceholderKey.MediaBrowserCompatItemReceiver((NoOpControllerHelper) obj);
                    }
                });
                return getShowPopup.INSTANCE;
            case 6:
                noOpControllerHelper.handleMediaPlayPauseIfPendingOnHandler();
                return getShowPopup.INSTANCE;
            case 7:
                noOpControllerHelper.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
                return getShowPopup.INSTANCE;
            case 8:
                noOpControllerHelper.onAddQueueItem();
                return getShowPopup.INSTANCE;
            case 9:
                noOpControllerHelper.onCustomAction();
                return getShowPopup.INSTANCE;
            case 10:
                noOpControllerHelper.onPlayFromUri();
                return getShowPopup.INSTANCE;
            case 11:
                noOpControllerHelper.MediaBrowserCompatMediaItem();
                return getShowPopup.INSTANCE;
            case 12:
                noOpControllerHelper.onSeekTo();
                return getShowPopup.INSTANCE;
            case 13:
                noOpControllerHelper.onPrepareFromUri();
                return getShowPopup.INSTANCE;
            case 14:
                noOpControllerHelper.onPrepareFromSearch();
                return getShowPopup.INSTANCE;
            case 15:
                noOpControllerHelper.onFastForward();
                return getShowPopup.INSTANCE;
            case 16:
                noOpControllerHelper.onPause();
                return getShowPopup.INSTANCE;
            case 17:
                noOpControllerHelper.onPlayFromMediaId();
                return getShowPopup.INSTANCE;
            case 18:
                noOpControllerHelper.onPlay();
                return getShowPopup.INSTANCE;
            case 19:
                noOpControllerHelper.onMediaButtonEvent();
                return getShowPopup.INSTANCE;
            case 20:
                List<findBeanDeserializer> listWrite = noOpControllerHelper.write(new getAnswerMap() { // from class: o.LinearLayoutManager
                    @Override // kotlin.getAnswerMap
                    public final Object invoke(Object obj) {
                        return PagingPlaceholderKey.MediaBrowserCompatMediaItem((NoOpControllerHelper) obj);
                    }
                });
                if (listWrite != null) {
                    pagingPlaceholderKey.IconCompatParcelizer(listWrite);
                    getShowPopup getshowpopup = getShowPopup.INSTANCE;
                }
                return getShowPopup.INSTANCE;
            case 21:
                List<findBeanDeserializer> listWrite2 = noOpControllerHelper.write(new getAnswerMap() { // from class: o.LinearLayoutManagerSavedState
                    @Override // kotlin.getAnswerMap
                    public final Object invoke(Object obj) {
                        return PagingPlaceholderKey.RatingCompat((NoOpControllerHelper) obj);
                    }
                });
                if (listWrite2 != null) {
                    pagingPlaceholderKey.IconCompatParcelizer(listWrite2);
                    getShowPopup getshowpopup2 = getShowPopup.INSTANCE;
                }
                return getShowPopup.INSTANCE;
            case 22:
                List<findBeanDeserializer> listWrite3 = noOpControllerHelper.write(new getAnswerMap() { // from class: o.RecyclerView
                    @Override // kotlin.getAnswerMap
                    public final Object invoke(Object obj) {
                        return PagingPlaceholderKey.MediaDescriptionCompat((NoOpControllerHelper) obj);
                    }
                });
                if (listWrite3 != null) {
                    pagingPlaceholderKey.IconCompatParcelizer(listWrite3);
                    getShowPopup getshowpopup3 = getShowPopup.INSTANCE;
                }
                return getShowPopup.INSTANCE;
            case 23:
                List<findBeanDeserializer> listWrite4 = noOpControllerHelper.write(new getAnswerMap() { // from class: o.setDebugAssertionsEnabled
                    @Override // kotlin.getAnswerMap
                    public final Object invoke(Object obj) {
                        return PagingPlaceholderKey.MediaBrowserCompatSearchResultReceiver((NoOpControllerHelper) obj);
                    }
                });
                if (listWrite4 != null) {
                    pagingPlaceholderKey.IconCompatParcelizer(listWrite4);
                    getShowPopup getshowpopup4 = getShowPopup.INSTANCE;
                }
                return getShowPopup.INSTANCE;
            case 24:
                List<findBeanDeserializer> listWrite5 = noOpControllerHelper.write(new getAnswerMap() { // from class: o.setClipToPadding
                    @Override // kotlin.getAnswerMap
                    public final Object invoke(Object obj) {
                        return PagingPlaceholderKey.MediaMetadataCompat((NoOpControllerHelper) obj);
                    }
                });
                if (listWrite5 != null) {
                    pagingPlaceholderKey.IconCompatParcelizer(listWrite5);
                    getShowPopup getshowpopup5 = getShowPopup.INSTANCE;
                }
                return getShowPopup.INSTANCE;
            case 25:
                List<findBeanDeserializer> listWrite6 = noOpControllerHelper.write(new getAnswerMap() { // from class: o.setEdgeEffectFactory
                    @Override // kotlin.getAnswerMap
                    public final Object invoke(Object obj) {
                        return PagingPlaceholderKey.handleMediaPlayPauseIfPendingOnHandler((NoOpControllerHelper) obj);
                    }
                });
                if (listWrite6 != null) {
                    pagingPlaceholderKey.IconCompatParcelizer(listWrite6);
                    getShowPopup getshowpopup6 = getShowPopup.INSTANCE;
                }
                return getShowPopup.INSTANCE;
            case 26:
                if (!pagingPlaceholderKey.IconCompatParcelizer) {
                    pagingPlaceholderKey.RemoteActionCompatParcelizer(new Deserializers("\n", 1));
                } else {
                    audioAttributesCompatParcelizer.IconCompatParcelizer = pagingPlaceholderKey.write.MediaDescriptionCompat().invoke(ResolvableDeserializer.read(pagingPlaceholderKey.MediaMetadataCompat)).booleanValue();
                }
                getShowPopup getshowpopup7 = getShowPopup.INSTANCE;
                return getShowPopup.INSTANCE;
            case 27:
                if (!pagingPlaceholderKey.IconCompatParcelizer) {
                    pagingPlaceholderKey.RemoteActionCompatParcelizer(new Deserializers("\t", 1));
                } else {
                    audioAttributesCompatParcelizer.IconCompatParcelizer = false;
                }
                getShowPopup getshowpopup8 = getShowPopup.INSTANCE;
                return getShowPopup.INSTANCE;
            case 28:
                noOpControllerHelper.onPlayFromSearch();
                return getShowPopup.INSTANCE;
            case 29:
                noOpControllerHelper.MediaBrowserCompatSearchResultReceiver().onPrepare();
                return getShowPopup.INSTANCE;
            case 30:
                noOpControllerHelper.onCommand().onPrepare();
                return getShowPopup.INSTANCE;
            case 31:
                noOpControllerHelper.handleMediaPlayPauseIfPendingOnHandler().onPrepare();
                return getShowPopup.INSTANCE;
            case 32:
                noOpControllerHelper.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().onPrepare();
                return getShowPopup.INSTANCE;
            case 33:
                noOpControllerHelper.onAddQueueItem().onPrepare();
                return getShowPopup.INSTANCE;
            case 34:
                noOpControllerHelper.onCustomAction().onPrepare();
                return getShowPopup.INSTANCE;
            case 35:
                noOpControllerHelper.onPrepareFromSearch().onPrepare();
                return getShowPopup.INSTANCE;
            case 36:
                noOpControllerHelper.onFastForward().onPrepare();
                return getShowPopup.INSTANCE;
            case 37:
                noOpControllerHelper.onPause().onPrepare();
                return getShowPopup.INSTANCE;
            case 38:
                noOpControllerHelper.onPlayFromMediaId().onPrepare();
                return getShowPopup.INSTANCE;
            case 39:
                noOpControllerHelper.onPlayFromUri().onPrepare();
                return getShowPopup.INSTANCE;
            case 40:
                noOpControllerHelper.MediaBrowserCompatMediaItem().onPrepare();
                return getShowPopup.INSTANCE;
            case 41:
                noOpControllerHelper.onSeekTo().onPrepare();
                return getShowPopup.INSTANCE;
            case 42:
                noOpControllerHelper.onPrepareFromUri().onPrepare();
                return getShowPopup.INSTANCE;
            case 43:
                noOpControllerHelper.onPlay().onPrepare();
                return getShowPopup.INSTANCE;
            case 44:
                noOpControllerHelper.onMediaButtonEvent().onPrepare();
                return getShowPopup.INSTANCE;
            case 45:
                noOpControllerHelper.IconCompatParcelizer();
                return getShowPopup.INSTANCE;
            case 46:
                setStateRestorationPolicy setstaterestorationpolicy = pagingPlaceholderKey.AudioAttributesImplApi21Parcelizer;
                if (setstaterestorationpolicy != null) {
                    setstaterestorationpolicy.RemoteActionCompatParcelizer(noOpControllerHelper.onPrepareFromMediaId());
                }
                setStateRestorationPolicy setstaterestorationpolicy2 = pagingPlaceholderKey.AudioAttributesImplApi21Parcelizer;
                if (setstaterestorationpolicy2 != null && (hasvaluetypedeserializerRemoteActionCompatParcelizer = setstaterestorationpolicy2.RemoteActionCompatParcelizer()) != null) {
                    pagingPlaceholderKey.MediaBrowserCompatMediaItem.invoke(hasvaluetypedeserializerRemoteActionCompatParcelizer);
                    getShowPopup getshowpopup9 = getShowPopup.INSTANCE;
                }
                return getShowPopup.INSTANCE;
            case 47:
                setStateRestorationPolicy setstaterestorationpolicy3 = pagingPlaceholderKey.AudioAttributesImplApi21Parcelizer;
                if (setstaterestorationpolicy3 != null && (hasvaluetypedeserializer = setstaterestorationpolicy3.read()) != null) {
                    pagingPlaceholderKey.MediaBrowserCompatMediaItem.invoke(hasvaluetypedeserializer);
                    getShowPopup getshowpopup10 = getShowPopup.INSTANCE;
                }
                return getShowPopup.INSTANCE;
            case 48:
                setControllerShowTimeoutMs.write();
            case 49:
                getShowPopup getshowpopup11 = getShowPopup.INSTANCE;
                return getShowPopup.INSTANCE;
            default:
                throw new RenewEligibleCreator();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesImplBaseParcelizer(NoOpControllerHelper noOpControllerHelper) {
        noOpControllerHelper.MediaBrowserCompatSearchResultReceiver();
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaBrowserCompatItemReceiver(NoOpControllerHelper noOpControllerHelper) {
        noOpControllerHelper.onCommand();
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final findBeanDeserializer MediaBrowserCompatMediaItem(NoOpControllerHelper noOpControllerHelper) {
        int iAudioAttributesImplBaseParcelizer = noOpControllerHelper.AudioAttributesImplBaseParcelizer();
        if (iAudioAttributesImplBaseParcelizer == -1) {
            return null;
        }
        return new findArrayDeserializer(findProperty.read(noOpControllerHelper.getAudioAttributesImplApi26Parcelizer()) - iAudioAttributesImplBaseParcelizer, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final findBeanDeserializer RatingCompat(NoOpControllerHelper noOpControllerHelper) {
        int iWrite = noOpControllerHelper.write();
        if (iWrite != -1) {
            return new findArrayDeserializer(0, iWrite - findProperty.read(noOpControllerHelper.getAudioAttributesImplApi26Parcelizer()));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final findBeanDeserializer MediaDescriptionCompat(NoOpControllerHelper noOpControllerHelper) {
        findArrayDeserializer findarraydeserializer;
        Integer numMediaBrowserCompatItemReceiver = noOpControllerHelper.MediaBrowserCompatItemReceiver();
        if (numMediaBrowserCompatItemReceiver != null) {
            findarraydeserializer = new findArrayDeserializer(findProperty.read(noOpControllerHelper.getAudioAttributesImplApi26Parcelizer()) - numMediaBrowserCompatItemReceiver.intValue(), 0);
        } else {
            findarraydeserializer = null;
        }
        return findarraydeserializer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final findBeanDeserializer MediaBrowserCompatSearchResultReceiver(NoOpControllerHelper noOpControllerHelper) {
        Integer numMediaBrowserCompatCustomActionResultReceiver = noOpControllerHelper.MediaBrowserCompatCustomActionResultReceiver();
        return numMediaBrowserCompatCustomActionResultReceiver != null ? new findArrayDeserializer(0, numMediaBrowserCompatCustomActionResultReceiver.intValue() - findProperty.read(noOpControllerHelper.getAudioAttributesImplApi26Parcelizer())) : null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final findBeanDeserializer MediaMetadataCompat(NoOpControllerHelper noOpControllerHelper) {
        findArrayDeserializer findarraydeserializer;
        Integer num = noOpControllerHelper.read();
        if (num != null) {
            findarraydeserializer = new findArrayDeserializer(findProperty.read(noOpControllerHelper.getAudioAttributesImplApi26Parcelizer()) - num.intValue(), 0);
        } else {
            findarraydeserializer = null;
        }
        return findarraydeserializer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final findBeanDeserializer handleMediaPlayPauseIfPendingOnHandler(NoOpControllerHelper noOpControllerHelper) {
        Integer numRemoteActionCompatParcelizer = noOpControllerHelper.RemoteActionCompatParcelizer();
        return numRemoteActionCompatParcelizer != null ? new findArrayDeserializer(0, numRemoteActionCompatParcelizer.intValue() - findProperty.read(noOpControllerHelper.getAudioAttributesImplApi26Parcelizer())) : null;
    }

    private final void IconCompatParcelizer(getAnswerMap<? super NoOpControllerHelper, getShowPopup> p0) {
        NoOpControllerHelper noOpControllerHelper = new NoOpControllerHelper(this.AudioAttributesCompatParcelizer, this.AudioAttributesImplBaseParcelizer, this.write.AudioAttributesImplApi26Parcelizer(), this.AudioAttributesImplApi26Parcelizer);
        p0.invoke(noOpControllerHelper);
        if (findProperty.IconCompatParcelizer(noOpControllerHelper.getAudioAttributesImplApi26Parcelizer(), this.AudioAttributesCompatParcelizer.getAudioAttributesCompatParcelizer()) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(noOpControllerHelper.getAudioAttributesImplBaseParcelizer(), this.AudioAttributesCompatParcelizer.getRead())) {
            return;
        }
        this.MediaBrowserCompatMediaItem.invoke(noOpControllerHelper.onPrepareFromMediaId());
    }

    public /* synthetic */ PagingPlaceholderKey(setImageDisplayMode setimagedisplaymode, Typed3EpoxyController typed3EpoxyController, hasValueTypeDeserializer hasvaluetypedeserializer, boolean z, boolean z2, setFontAssetDelegate setfontassetdelegate, SettableBeanProperty settableBeanProperty, setStateRestorationPolicy setstaterestorationpolicy, getUseArtwork getuseartwork, setControllerHideOnTouch setcontrollerhideontouch, getAnswerMap getanswermap, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(setimagedisplaymode, typed3EpoxyController, hasvaluetypedeserializer, z, z2, setfontassetdelegate, settableBeanProperty, setstaterestorationpolicy, getuseartwork, setcontrollerhideontouch, getanswermap, i);
    }
}
