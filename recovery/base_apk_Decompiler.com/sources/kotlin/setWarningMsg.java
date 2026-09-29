package kotlin;

import java.util.Collection;
import java.util.List;
import kotlin.getQuote;
import kotlin.getTestHeaderTitle;
import kotlin.getVideoPageNotesTitle;

/* JADX INFO: loaded from: classes4.dex */
public class setWarningMsg extends getRootSubjectId implements setExpiredOn {
    private final boolean AudioAttributesCompatParcelizer;
    private getLink RemoteActionCompatParcelizer;
    private final Pair<getVideoPageNotesTitle.RemoteActionCompatParcelizer<?>, ?> read;

    @Override // kotlin.ContentBody, kotlin.getVideoPageNotesTitle
    public final boolean MediaBrowserCompatSearchResultReceiver() {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected setWarningMsg(getVariant getvariant, getQuote getquote, CourseConfigV2NavDrawerItems courseConfigV2NavDrawerItems, CourseConfigV2NavDrawerItemFreeExtension courseConfigV2NavDrawerItemFreeExtension, boolean z, getRelatedLessonId getrelatedlessonid, getIntroDurationSeconds getintrodurationseconds, CourseConfigV2SettingsItems courseConfigV2SettingsItems, getTestHeaderTitle.RemoteActionCompatParcelizer remoteActionCompatParcelizer, boolean z2, Pair<getVideoPageNotesTitle.RemoteActionCompatParcelizer<?>, ?> pair) {
        super(getvariant, courseConfigV2SettingsItems, getquote, courseConfigV2NavDrawerItems, courseConfigV2NavDrawerItemFreeExtension, z, getrelatedlessonid, remoteActionCompatParcelizer, getintrodurationseconds, false, false, false, false, false, false);
        if (getvariant == null) {
            RemoteActionCompatParcelizer(0);
        }
        if (getquote == null) {
            RemoteActionCompatParcelizer(1);
        }
        if (courseConfigV2NavDrawerItems == null) {
            RemoteActionCompatParcelizer(2);
        }
        if (courseConfigV2NavDrawerItemFreeExtension == null) {
            RemoteActionCompatParcelizer(3);
        }
        if (getrelatedlessonid == null) {
            RemoteActionCompatParcelizer(4);
        }
        if (getintrodurationseconds == null) {
            RemoteActionCompatParcelizer(5);
        }
        if (remoteActionCompatParcelizer == null) {
            RemoteActionCompatParcelizer(6);
        }
        this.RemoteActionCompatParcelizer = null;
        this.AudioAttributesCompatParcelizer = z2;
        this.read = pair;
    }

    public static setWarningMsg RemoteActionCompatParcelizer(getVariant getvariant, getQuote getquote, CourseConfigV2NavDrawerItems courseConfigV2NavDrawerItems, CourseConfigV2NavDrawerItemFreeExtension courseConfigV2NavDrawerItemFreeExtension, boolean z, getRelatedLessonId getrelatedlessonid, getIntroDurationSeconds getintrodurationseconds, boolean z2) {
        if (getvariant == null) {
            RemoteActionCompatParcelizer(7);
        }
        if (getquote == null) {
            RemoteActionCompatParcelizer(8);
        }
        if (courseConfigV2NavDrawerItems == null) {
            RemoteActionCompatParcelizer(9);
        }
        if (courseConfigV2NavDrawerItemFreeExtension == null) {
            RemoteActionCompatParcelizer(10);
        }
        if (getrelatedlessonid == null) {
            RemoteActionCompatParcelizer(11);
        }
        if (getintrodurationseconds == null) {
            RemoteActionCompatParcelizer(12);
        }
        return new setWarningMsg(getvariant, getquote, courseConfigV2NavDrawerItems, courseConfigV2NavDrawerItemFreeExtension, z, getrelatedlessonid, getintrodurationseconds, null, getTestHeaderTitle.RemoteActionCompatParcelizer.DECLARATION, z2, null);
    }

    @Override // kotlin.getRootSubjectId
    public final getRootSubjectId IconCompatParcelizer(getVariant getvariant, CourseConfigV2NavDrawerItems courseConfigV2NavDrawerItems, CourseConfigV2NavDrawerItemFreeExtension courseConfigV2NavDrawerItemFreeExtension, CourseConfigV2SettingsItems courseConfigV2SettingsItems, getTestHeaderTitle.RemoteActionCompatParcelizer remoteActionCompatParcelizer, getRelatedLessonId getrelatedlessonid, getIntroDurationSeconds getintrodurationseconds) {
        if (getvariant == null) {
            RemoteActionCompatParcelizer(13);
        }
        if (courseConfigV2NavDrawerItems == null) {
            RemoteActionCompatParcelizer(14);
        }
        if (courseConfigV2NavDrawerItemFreeExtension == null) {
            RemoteActionCompatParcelizer(15);
        }
        if (remoteActionCompatParcelizer == null) {
            RemoteActionCompatParcelizer(16);
        }
        if (getrelatedlessonid == null) {
            RemoteActionCompatParcelizer(17);
        }
        if (getintrodurationseconds == null) {
            RemoteActionCompatParcelizer(18);
        }
        return new setWarningMsg(getvariant, RemoteActionCompatParcelizer(), courseConfigV2NavDrawerItems, courseConfigV2NavDrawerItemFreeExtension, onRewind(), getrelatedlessonid, getintrodurationseconds, courseConfigV2SettingsItems, remoteActionCompatParcelizer, this.AudioAttributesCompatParcelizer, this.read);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.setExpiredOn
    public final setExpiredOn AudioAttributesCompatParcelizer(getLink getlink, List<getLink> list, getLink getlink2, Pair<getVideoPageNotesTitle.RemoteActionCompatParcelizer<?>, ?> pair) {
        SchemaKt schemaKt;
        getSchemaId getschemaid;
        if (getlink2 == null) {
            RemoteActionCompatParcelizer(20);
        }
        CourseConfigV2TestTabItem courseConfigV2TestTabItemAudioAttributesCompatParcelizer = null;
        CourseConfigV2SettingsItems courseConfigV2SettingsItemsOnAddQueueItem = onAddQueueItem() == this ? null : onAddQueueItem();
        setWarningMsg setwarningmsg = new setWarningMsg(AudioAttributesImplApi21Parcelizer(), RemoteActionCompatParcelizer(), MediaBrowserCompatMediaItem(), onCustomAction(), onRewind(), aQ_(), RatingCompat(), courseConfigV2SettingsItemsOnAddQueueItem, handleMediaPlayPauseIfPendingOnHandler(), this.AudioAttributesCompatParcelizer, pair);
        SchemaKt schemaKtOnPlayFromMediaId = onPlayFromMediaId();
        if (schemaKtOnPlayFromMediaId != null) {
            schemaKt = new SchemaKt(setwarningmsg, schemaKtOnPlayFromMediaId.RemoteActionCompatParcelizer(), schemaKtOnPlayFromMediaId.MediaBrowserCompatMediaItem(), schemaKtOnPlayFromMediaId.onCustomAction(), schemaKtOnPlayFromMediaId.onPlay(), schemaKtOnPlayFromMediaId.onMediaButtonEvent(), schemaKtOnPlayFromMediaId.AudioAttributesCompatParcelizer(), handleMediaPlayPauseIfPendingOnHandler(), courseConfigV2SettingsItemsOnAddQueueItem == null ? null : courseConfigV2SettingsItemsOnAddQueueItem.onPlayFromMediaId(), schemaKtOnPlayFromMediaId.RatingCompat());
            schemaKt.IconCompatParcelizer(schemaKtOnPlayFromMediaId.onPlayFromSearch());
            schemaKt.write(getlink2);
        } else {
            schemaKt = null;
        }
        getAppSettings getappsettingsOnPlayFromSearch = onPlayFromSearch();
        if (getappsettingsOnPlayFromSearch != null) {
            getschemaid = new getSchemaId(setwarningmsg, getappsettingsOnPlayFromSearch.RemoteActionCompatParcelizer(), getappsettingsOnPlayFromSearch.MediaBrowserCompatMediaItem(), getappsettingsOnPlayFromSearch.onCustomAction(), getappsettingsOnPlayFromSearch.onPlay(), getappsettingsOnPlayFromSearch.onMediaButtonEvent(), getappsettingsOnPlayFromSearch.AudioAttributesCompatParcelizer(), handleMediaPlayPauseIfPendingOnHandler(), courseConfigV2SettingsItemsOnAddQueueItem == null ? null : courseConfigV2SettingsItemsOnAddQueueItem.onPlayFromSearch(), getappsettingsOnPlayFromSearch.RatingCompat());
            getschemaid.IconCompatParcelizer(getschemaid.onPlayFromSearch());
            getschemaid.IconCompatParcelizer(getappsettingsOnPlayFromSearch.aX_().get(0));
        } else {
            getschemaid = null;
        }
        setwarningmsg.write(schemaKt, getschemaid, MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(), onFastForward());
        setwarningmsg.AudioAttributesCompatParcelizer(onRemoveQueueItem());
        if (this.write != null) {
            setwarningmsg.AudioAttributesCompatParcelizer(((getFirstNonEmptyBody) this).IconCompatParcelizer, this.write);
        }
        setwarningmsg.write((Collection<? extends getTestHeaderTitle>) AudioAttributesImplApi26Parcelizer());
        if (getlink != null) {
            getQuote.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = getQuote.IconCompatParcelizer;
            courseConfigV2TestTabItemAudioAttributesCompatParcelizer = getOption2.AudioAttributesCompatParcelizer(this, getlink, getQuote.AudioAttributesCompatParcelizer.read());
        }
        setwarningmsg.write(getlink2, MediaDescriptionCompat(), write(), courseConfigV2TestTabItemAudioAttributesCompatParcelizer, IntermediateLoginResponseBody.RemoteActionCompatParcelizer());
        return setwarningmsg;
    }

    @Override // kotlin.getRootSubjectId, kotlin.ContentBody, kotlin.Editor
    public final boolean onPlayFromUri() {
        getLink getlinkOnPrepareFromMediaId = onPrepareFromMediaId();
        if (this.AudioAttributesCompatParcelizer && getAckKey.AudioAttributesCompatParcelizer(getlinkOnPrepareFromMediaId)) {
            return !isInternModule.write(getlinkOnPrepareFromMediaId) || getTestTabItems.MediaBrowserCompatMediaItem(getlinkOnPrepareFromMediaId);
        }
        return false;
    }

    @Override // kotlin.getRootSubjectId
    public final void write(getLink getlink) {
        if (getlink == null) {
            RemoteActionCompatParcelizer(22);
        }
        this.RemoteActionCompatParcelizer = getlink;
    }

    @Override // kotlin.getRootSubjectId, kotlin.ContentBody, kotlin.getVideoPageNotesTitle
    public final <V> V IconCompatParcelizer(getVideoPageNotesTitle.RemoteActionCompatParcelizer<V> remoteActionCompatParcelizer) {
        Pair<getVideoPageNotesTitle.RemoteActionCompatParcelizer<?>, ?> pair = this.read;
        if (pair == null || !pair.write().equals(remoteActionCompatParcelizer)) {
            return null;
        }
        return (V) this.read.IconCompatParcelizer();
    }

    private static /* synthetic */ void RemoteActionCompatParcelizer(int i) {
        String str = i != 21 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i != 21 ? 3 : 2];
        switch (i) {
            case 1:
            case 8:
                objArr[0] = "annotations";
                break;
            case 2:
            case 9:
                objArr[0] = "modality";
                break;
            case 3:
            case 10:
                objArr[0] = "visibility";
                break;
            case 4:
            case 11:
                objArr[0] = "name";
                break;
            case 5:
            case 12:
            case 18:
                objArr[0] = "source";
                break;
            case 6:
            case 16:
                objArr[0] = "kind";
                break;
            case 7:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 13:
                objArr[0] = "newOwner";
                break;
            case 14:
                objArr[0] = "newModality";
                break;
            case 15:
                objArr[0] = "newVisibility";
                break;
            case 17:
                objArr[0] = "newName";
                break;
            case 19:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
            case 21:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
                break;
            case 22:
                objArr[0] = "inType";
                break;
        }
        if (i != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "create";
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 19:
            case 20:
                objArr[2] = "enhance";
                break;
            case 21:
                break;
            case 22:
                objArr[2] = "setInType";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i == 21) {
            throw new IllegalStateException(str2);
        }
    }
}
