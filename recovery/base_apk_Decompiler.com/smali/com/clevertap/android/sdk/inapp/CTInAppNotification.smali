###### Class com.clevertap.android.sdk.inapp.CTInAppNotification (com.clevertap.android.sdk.inapp.CTInAppNotification)
.class public final Lcom/clevertap/android/sdk/inapp/CTInAppNotification;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/clevertap/android/sdk/inapp/CTInAppNotification$read;,
        Lcom/clevertap/android/sdk/inapp/CTInAppNotification$AudioAttributesCompatParcelizer;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0008\n\n\u0002\u0010\t\n\u0002\u0008\u000f\n\u0002\u0010\u0006\n\u0002\u0008\u0004\n\u0002\u0010\u000c\n\u0002\u0008\u0006\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0019\u0008\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007B\u0011\u0008\u0012\u0012\u0006\u0010\u0003\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u0006\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0003\u001a\u00020\nH\u0000\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u001b\u0010\u0016\u001a\u0004\u0018\u00010\u00002\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0015H\u0000\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0019\u0010\u0018\u001a\u00020\r2\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0015H\u0000\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008\u001c\u0010\u001bJ-\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u001d2\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u001e2\n\u0010 \u001a\u0006\u0012\u0002\u0008\u00030\u001fH\u0002\u00a2\u0006\u0004\u0008\u001c\u0010!J\u0017\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u001dH\u0002\u00a2\u0006\u0004\u0008\u001a\u0010\"R(\u0010\u0013\u001a\u0004\u0018\u00010\u001e2\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u001e8\u0007@BX\u0086\u000e\u00a2\u0006\u000c\n\u0004\u0008#\u0010$\u001a\u0004\u0008%\u0010&R(\u0010\u001c\u001a\u0004\u0018\u00010\u001e2\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u001e8\u0007@BX\u0087\u000e\u00a2\u0006\u000c\n\u0004\u0008\'\u0010$\u001a\u0004\u0008\u0013\u0010&R(\u0010\u0016\u001a\u0004\u0018\u00010(2\u0008\u0010\u0003\u001a\u0004\u0018\u00010(8\u0007@BX\u0087\u000e\u00a2\u0006\u000c\n\u0004\u0008)\u0010*\u001a\u0004\u0008+\u0010,R$\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048\u0007@BX\u0087\u000e\u00a2\u0006\u000c\n\u0004\u0008-\u0010.\u001a\u0004\u0008/\u0010\u0011R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001a\u00100R\u0016\u00102\u001a\u00020\u00028\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0006\n\u0004\u00081\u00100R\u0011\u00105\u001a\u00020\u00028G\u00a2\u0006\u0006\u001a\u0004\u00083\u00104R\"\u00101\u001a\u0004\u0018\u00010\u001e2\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u001e8\u0006@BX\u0087\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010$R$\u00108\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n8\u0007@BX\u0087\u000e\u00a2\u0006\u000c\n\u0004\u00086\u00107\u001a\u0004\u0008#\u0010\u000cR\u001c\u0010<\u001a\u0008\u0012\u0004\u0012\u00020:098\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010;R\u0017\u0010?\u001a\u0008\u0012\u0004\u0012\u00020:0=8G\u00a2\u0006\u0006\u001a\u0004\u0008\u0018\u0010>R$\u0010%\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048\u0007@BX\u0087\u000e\u00a2\u0006\u000c\n\u0004\u0008@\u0010.\u001a\u0004\u0008A\u0010\u0011R$\u0010+\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048\u0007@BX\u0087\u000e\u00a2\u0006\u000c\n\u0004\u0008B\u0010.\u001a\u0004\u0008C\u0010\u0011R(\u0010F\u001a\u0004\u0018\u00010\u001e2\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u001e8\u0007@BX\u0087\u000e\u00a2\u0006\u000c\n\u0004\u0008D\u0010$\u001a\u0004\u0008E\u0010&R(\u0010\'\u001a\u0004\u0018\u00010\u001e2\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u001e8\u0007@BX\u0087\u000e\u00a2\u0006\u000c\n\u0004\u0008A\u0010$\u001a\u0004\u0008G\u0010&R$\u0010M\u001a\u00020H2\u0006\u0010\u0003\u001a\u00020H8\u0007@BX\u0087\u000e\u00a2\u0006\u000c\n\u0004\u0008I\u0010J\u001a\u0004\u0008K\u0010LR$\u0010#\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n8\u0007@BX\u0087\u000e\u00a2\u0006\u000c\n\u0004\u0008N\u00107\u001a\u0004\u0008-\u0010\u000cR$\u00103\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n8\u0007@BX\u0087\u000e\u00a2\u0006\u000c\n\u0004\u0008C\u00107\u001a\u0004\u0008O\u0010\u000cR$\u0010G\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048\u0007@BX\u0087\u000e\u00a2\u0006\u000c\n\u0004\u0008O\u0010.\u001a\u0004\u0008N\u0010\u0011R$\u0010P\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048\u0007@BX\u0087\u000e\u00a2\u0006\u000c\n\u0004\u0008M\u0010.\u001a\u0004\u0008<\u0010\u0011R$\u0010)\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048\u0007@BX\u0087\u000e\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010.\u001a\u0004\u0008D\u0010\u0011R(\u0010-\u001a\u0004\u0018\u00010\u00152\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u00158\u0001@BX\u0081\u000e\u00a2\u0006\u000c\n\u0004\u0008?\u0010Q\u001a\u0004\u00088\u0010RR(\u0010T\u001a\u0004\u0018\u00010\u001e2\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u001e8\u0001@BX\u0081\u000e\u00a2\u0006\u000c\n\u0004\u0008S\u0010$\u001a\u0004\u0008@\u0010&R$\u0010E\u001a\u00020\u001e2\u0006\u0010\u0003\u001a\u00020\u001e8\u0001@BX\u0081\u000e\u00a2\u0006\u000c\n\u0004\u00082\u0010$\u001a\u0004\u0008\u0016\u0010&R$\u0010K\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n8\u0001@BX\u0081\u000e\u00a2\u0006\u000c\n\u0004\u00088\u00107\u001a\u0004\u0008\u001c\u0010\u000cR(\u0010@\u001a\u0004\u0018\u00010\u00022\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0001@BX\u0081\u000e\u00a2\u0006\u000c\n\u0004\u0008%\u00100\u001a\u0004\u00081\u00104R(\u0010\u0010\u001a\u0004\u0018\u00010\u001e2\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u001e8\u0001@BX\u0081\u000e\u00a2\u0006\u000c\n\u0004\u0008+\u0010$\u001a\u0004\u00085\u0010&R$\u0010B\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048\u0001@BX\u0081\u000e\u00a2\u0006\u000c\n\u0004\u0008E\u0010.\u001a\u0004\u0008U\u0010\u0011R$\u0010W\u001a\u0004\u0018\u00010\u001e8\u0001@\u0001X\u0081\u000e\u00a2\u0006\u0012\n\u0004\u0008F\u0010$\u001a\u0004\u00082\u0010&\"\u0004\u0008\u0013\u0010VR$\u0010O\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n8\u0001@BX\u0081\u000e\u00a2\u0006\u000c\n\u0004\u0008G\u00107\u001a\u0004\u0008?\u0010\u000cR$\u0010A\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n8\u0001@BX\u0081\u000e\u00a2\u0006\u000c\n\u0004\u00083\u00107\u001a\u0004\u0008\'\u0010\u000cR$\u0010U\u001a\u00020X2\u0006\u0010\u0003\u001a\u00020X8\u0001@BX\u0081\u000e\u00a2\u0006\u000c\n\u0004\u00085\u0010Y\u001a\u0004\u0008\u001a\u0010ZR$\u0010[\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048\u0001@BX\u0081\u000e\u00a2\u0006\u000c\n\u0004\u0008T\u0010.\u001a\u0004\u00086\u0010\u0011R(\u0010/\u001a\u0004\u0018\u00010\u001e2\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u001e8\u0001@BX\u0081\u000e\u00a2\u0006\u000c\n\u0004\u0008P\u0010$\u001a\u0004\u0008F\u0010&R$\u00106\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048\u0001@BX\u0081\u000e\u00a2\u0006\u000c\n\u0004\u0008[\u0010.\u001a\u0004\u0008\\\u0010\u0011R$\u0010I\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048\u0001@BX\u0081\u000e\u00a2\u0006\u000c\n\u0004\u0008K\u0010.\u001a\u0004\u0008[\u0010\u0011R\u001c\u0010D\u001a\u0008\u0012\u0004\u0012\u00020\u0012098\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0006\n\u0004\u0008<\u0010;R\u001a\u0010N\u001a\u0008\u0012\u0004\u0012\u00020\u00120=8AX\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008P\u0010>R$\u0010\\\u001a\u00020\u001e2\u0006\u0010\u0003\u001a\u00020\u001e8\u0001@BX\u0081\u000e\u00a2\u0006\u000c\n\u0004\u0008U\u0010$\u001a\u0004\u0008M\u0010&R$\u0010C\u001a\u00020]2\u0006\u0010\u0003\u001a\u00020]8\u0001@BX\u0081\u000e\u00a2\u0006\u000c\n\u0004\u0008/\u0010^\u001a\u0004\u0008)\u0010_R$\u0010`\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048\u0001@BX\u0081\u000e\u00a2\u0006\u000c\n\u0004\u0008W\u0010.\u001a\u0004\u0008I\u0010\u0011R$\u0010a\u001a\u00020\u001e2\u0006\u0010\u0003\u001a\u00020\u001e8\u0001@BX\u0081\u000e\u00a2\u0006\u000c\n\u0004\u0008\\\u0010$\u001a\u0004\u0008T\u0010&R\u001e\u0010b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048\u0000@BX\u0081\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010.R$\u0010c\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n8\u0001@BX\u0081\u000e\u00a2\u0006\u000c\n\u0004\u0008a\u00107\u001a\u0004\u0008W\u0010\u000cR$\u0010S\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n8\u0001@BX\u0081\u000e\u00a2\u0006\u000c\n\u0004\u0008c\u00107\u001a\u0004\u0008B\u0010\u000c"
    }
    d2 = {
        "Lcom/clevertap/android/sdk/inapp/CTInAppNotification;",
        "Landroid/os/Parcelable;",
        "Lorg/json/JSONObject;",
        "p0",
        "",
        "p1",
        "<init>",
        "(Lorg/json/JSONObject;Z)V",
        "Landroid/os/Parcel;",
        "(Landroid/os/Parcel;)V",
        "",
        "describeContents",
        "()I",
        "",
        "writeToParcel",
        "(Landroid/os/Parcel;I)V",
        "onPrepareFromMediaId",
        "()Z",
        "Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia;",
        "RemoteActionCompatParcelizer",
        "(I)Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia;",
        "Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;",
        "write",
        "(Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;)Lcom/clevertap/android/sdk/inapp/CTInAppNotification;",
        "IconCompatParcelizer",
        "(Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;)V",
        "AudioAttributesCompatParcelizer",
        "(Lorg/json/JSONObject;)V",
        "read",
        "Landroid/os/Bundle;",
        "",
        "Lo/isHdPlaybackError;",
        "p2",
        "(Landroid/os/Bundle;Ljava/lang/String;Lo/isHdPlaybackError;)Z",
        "(Landroid/os/Bundle;)Z",
        "onCommand",
        "Ljava/lang/String;",
        "MediaDescriptionCompat",
        "()Ljava/lang/String;",
        "RatingCompat",
        "Lo/lambdaupdateStateAndInformListeners41;",
        "onPlayFromMediaId",
        "Lo/lambdaupdateStateAndInformListeners41;",
        "MediaBrowserCompatMediaItem",
        "()Lo/lambdaupdateStateAndInformListeners41;",
        "onFastForward",
        "Z",
        "onSeekTo",
        "Lorg/json/JSONObject;",
        "MediaBrowserCompatCustomActionResultReceiver",
        "AudioAttributesImplApi26Parcelizer",
        "onCustomAction",
        "()Lorg/json/JSONObject;",
        "AudioAttributesImplBaseParcelizer",
        "onPrepareFromUri",
        "I",
        "MediaBrowserCompatItemReceiver",
        "Ljava/util/ArrayList;",
        "Lcom/clevertap/android/sdk/inapp/CTInAppNotificationButton;",
        "Ljava/util/ArrayList;",
        "AudioAttributesImplApi21Parcelizer",
        "",
        "()Ljava/util/List;",
        "MediaBrowserCompatSearchResultReceiver",
        "onPlayFromSearch",
        "onRemoveQueueItem",
        "onPlayFromUri",
        "onSetRepeatMode",
        "onSetShuffleMode",
        "onPlay",
        "MediaMetadataCompat",
        "handleMediaPlayPauseIfPendingOnHandler",
        "",
        "onSetCaptioningEnabled",
        "J",
        "onMediaButtonEvent",
        "()J",
        "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver",
        "onSetPlaybackSpeed",
        "onPrepare",
        "onAddQueueItem",
        "Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;",
        "()Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;",
        "setSessionImpl",
        "onPause",
        "onRemoveQueueItemAt",
        "(Ljava/lang/String;)V",
        "onPrepareFromSearch",
        "",
        "D",
        "()D",
        "onRewind",
        "onSetRating",
        "",
        "C",
        "()C",
        "onSkipToPrevious",
        "onSkipToQueueItem",
        "onSkipToNext",
        "onStop"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/clevertap/android/sdk/inapp/CTInAppNotification;",
            ">;"
        }
    .end annotation
.end field

.field public static final read:Lcom/clevertap/android/sdk/inapp/CTInAppNotification$read;


# instance fields
.field private AudioAttributesCompatParcelizer:Lorg/json/JSONObject;

.field private AudioAttributesImplApi21Parcelizer:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia;",
            ">;"
        }
    .end annotation
.end field

.field private AudioAttributesImplApi26Parcelizer:Ljava/lang/String;

.field private AudioAttributesImplBaseParcelizer:D

.field public IconCompatParcelizer:Ljava/lang/String;

.field private MediaBrowserCompatCustomActionResultReceiver:Lorg/json/JSONObject;

.field private MediaBrowserCompatItemReceiver:I

.field private MediaBrowserCompatMediaItem:Ljava/lang/String;

.field private MediaBrowserCompatSearchResultReceiver:Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;

.field private MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Z

.field private MediaDescriptionCompat:Lorg/json/JSONObject;

.field private MediaMetadataCompat:Ljava/lang/String;

.field private RatingCompat:Ljava/lang/String;

.field public RemoteActionCompatParcelizer:Z

.field private handleMediaPlayPauseIfPendingOnHandler:I

.field private onAddQueueItem:Ljava/lang/String;

.field private onCommand:Ljava/lang/String;

.field private onCustomAction:I

.field private onFastForward:Z

.field private onMediaButtonEvent:Z

.field private onPause:Z

.field private onPlay:Z

.field private onPlayFromMediaId:Lo/lambdaupdateStateAndInformListeners41;

.field private onPlayFromSearch:Z

.field private onPlayFromUri:Z

.field private onPrepare:Z

.field private onPrepareFromMediaId:Z

.field private onPrepareFromSearch:Z

.field private onPrepareFromUri:I

.field private onRemoveQueueItem:Ljava/lang/String;

.field private onRemoveQueueItemAt:Ljava/lang/String;

.field private onRewind:Z

.field private onSeekTo:C

.field private onSetCaptioningEnabled:J

.field private onSetPlaybackSpeed:I

.field private onSetRating:Ljava/lang/String;

.field private onSetRepeatMode:I

.field private onSetShuffleMode:Ljava/lang/String;

.field private onSkipToQueueItem:I

.field private onStop:I

.field private setSessionImpl:Ljava/lang/String;

.field private write:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/clevertap/android/sdk/inapp/CTInAppNotificationButton;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification$read;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/clevertap/android/sdk/inapp/CTInAppNotification$read;-><init>(Lo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V

    sput-object v0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->read:Lcom/clevertap/android/sdk/inapp/CTInAppNotification$read;

    .line 594
    new-instance v0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification$RemoteActionCompatParcelizer;

    invoke-direct {v0}, Lcom/clevertap/android/sdk/inapp/CTInAppNotification$RemoteActionCompatParcelizer;-><init>()V

    check-cast v0, Landroid/os/Parcelable$Creator;

    sput-object v0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .registers 8

    .line 165
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->write:Ljava/util/ArrayList;

    .line 87
    const-string v0, "#FFFFFF"

    iput-object v0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->AudioAttributesImplApi26Parcelizer:Ljava/lang/String;

    const-wide/high16 v0, -0x4010000000000000L    # -1.0

    .line 110
    iput-wide v0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->AudioAttributesImplBaseParcelizer:D

    .line 124
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->AudioAttributesImplApi21Parcelizer:Ljava/util/ArrayList;

    .line 129
    const-string v0, "#000000"

    iput-object v0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->onRemoveQueueItemAt:Ljava/lang/String;

    .line 138
    iput-object v0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->onSetRating:Ljava/lang/String;

    .line 166
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->onCommand:Ljava/lang/String;

    .line 167
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->RatingCompat:Ljava/lang/String;

    .line 168
    const-class v0, Lo/lambdaupdateStateAndInformListeners41;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readValue(Ljava/lang/ClassLoader;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lo/lambdaupdateStateAndInformListeners41;

    const/4 v2, 0x0

    if-eqz v1, :cond_3d

    check-cast v0, Lo/lambdaupdateStateAndInformListeners41;

    goto :goto_3e

    :cond_3d
    move-object v0, v2

    :goto_3e
    iput-object v0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->onPlayFromMediaId:Lo/lambdaupdateStateAndInformListeners41;

    .line 169
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->onAddQueueItem:Ljava/lang/String;

    .line 170
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    const/4 v1, 0x1

    const/4 v3, 0x0

    if-eqz v0, :cond_50

    move v0, v1

    goto :goto_51

    :cond_50
    move v0, v3

    :goto_51
    iput-boolean v0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->onFastForward:Z

    .line 171
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-eqz v0, :cond_5b

    move v0, v1

    goto :goto_5c

    :cond_5b
    move v0, v3

    :goto_5c
    iput-boolean v0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->onPrepareFromSearch:Z

    .line 172
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-eqz v0, :cond_66

    move v0, v1

    goto :goto_67

    :cond_66
    move v0, v3

    :goto_67
    iput-boolean v0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->onPlay:Z

    .line 173
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->onPrepareFromUri:I

    .line 174
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->onSetRepeatMode:I

    .line 175
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->onSetPlaybackSpeed:I

    .line 176
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    int-to-char v0, v0

    iput-char v0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->onSeekTo:C

    .line 177
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->handleMediaPlayPauseIfPendingOnHandler:I

    .line 178
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->onCustomAction:I

    .line 179
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->onSkipToQueueItem:I

    .line 180
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->onStop:I

    .line 181
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    const-string v4, "{}"

    if-nez v0, :cond_a3

    move-object v0, v4

    :cond_a3
    new-instance v5, Lorg/json/JSONObject;

    invoke-direct {v5, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    iput-object v5, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->MediaBrowserCompatCustomActionResultReceiver:Lorg/json/JSONObject;

    .line 182
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->MediaMetadataCompat:Ljava/lang/String;

    .line 183
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-nez v0, :cond_b8

    move-object v5, v2

    goto :goto_c4

    .line 186
    :cond_b8
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_bf

    move-object v0, v4

    :cond_bf
    new-instance v5, Lorg/json/JSONObject;

    invoke-direct {v5, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 183
    :goto_c4
    iput-object v5, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->MediaDescriptionCompat:Lorg/json/JSONObject;

    .line 188
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-nez v0, :cond_cd

    goto :goto_da

    .line 191
    :cond_cd
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_d4

    goto :goto_d5

    :cond_d4
    move-object v4, v0

    :goto_d5
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2, v4}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 188
    :goto_da
    iput-object v2, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->AudioAttributesCompatParcelizer:Lorg/json/JSONObject;

    .line 193
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->setSessionImpl:Ljava/lang/String;

    .line 194
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->onSetShuffleMode:Ljava/lang/String;

    .line 195
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_f0

    iget-object v0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->onSetRating:Ljava/lang/String;

    :cond_f0
    iput-object v0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->onSetRating:Ljava/lang/String;

    .line 196
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_fa

    iget-object v0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->AudioAttributesImplApi26Parcelizer:Ljava/lang/String;

    :cond_fa
    iput-object v0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->AudioAttributesImplApi26Parcelizer:Ljava/lang/String;

    .line 197
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->onRemoveQueueItem:Ljava/lang/String;

    .line 198
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_10a

    iget-object v0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->onRemoveQueueItemAt:Ljava/lang/String;

    :cond_10a
    iput-object v0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->onRemoveQueueItemAt:Ljava/lang/String;

    .line 201
    :try_start_10c
    sget-object v0, Lcom/clevertap/android/sdk/inapp/CTInAppNotificationButton;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->createTypedArrayList(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    move-result-object v0

    if-nez v0, :cond_119

    .line 202
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 200
    :cond_119
    iput-object v0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->write:Ljava/util/ArrayList;
    :try_end_11b
    .catchall {:try_start_10c .. :try_end_11b} :catchall_11b

    .line 208
    :catchall_11b
    :try_start_11b
    sget-object v0, Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->createTypedArrayList(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    move-result-object v0

    if-nez v0, :cond_128

    .line 209
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 207
    :cond_128
    iput-object v0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->AudioAttributesImplApi21Parcelizer:Ljava/util/ArrayList;
    :try_end_12a
    .catchall {:try_start_11b .. :try_end_12a} :catchall_12a

    .line 213
    :catchall_12a
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-eqz v0, :cond_132

    move v0, v1

    goto :goto_133

    :cond_132
    move v0, v3

    :goto_133
    iput-boolean v0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->onPause:Z

    .line 214
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->MediaBrowserCompatItemReceiver:I

    .line 215
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-eqz v0, :cond_143

    move v0, v1

    goto :goto_144

    :cond_143
    move v0, v3

    :goto_144
    iput-boolean v0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->onRewind:Z

    .line 216
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->MediaBrowserCompatMediaItem:Ljava/lang/String;

    .line 217
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-eqz v0, :cond_154

    move v0, v1

    goto :goto_155

    :cond_154
    move v0, v3

    :goto_155
    iput-boolean v0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->onMediaButtonEvent:Z

    .line 218
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-eqz v0, :cond_15f

    move v0, v1

    goto :goto_160

    :cond_15f
    move v0, v3

    :goto_160
    iput-boolean v0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->onPlayFromUri:Z

    .line 219
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-eqz v0, :cond_16a

    move v0, v1

    goto :goto_16b

    :cond_16a
    move v0, v3

    :goto_16b
    iput-boolean v0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->onPlayFromSearch:Z

    .line 220
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-eqz v0, :cond_175

    move v0, v1

    goto :goto_176

    :cond_175
    move v0, v3

    :goto_176
    iput-boolean v0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->onPrepare:Z

    .line 221
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-eqz v0, :cond_180

    move v0, v1

    goto :goto_181

    :cond_180
    move v0, v3

    :goto_181
    iput-boolean v0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Z

    .line 222
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->IconCompatParcelizer:Ljava/lang/String;

    .line 223
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v4

    iput-wide v4, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->onSetCaptioningEnabled:J

    .line 225
    const-class v0, Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;

    .line 224
    iput-object v0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->MediaBrowserCompatSearchResultReceiver:Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;

    .line 226
    invoke-virtual {p1}, Landroid/os/Parcel;->readDouble()D

    move-result-wide v4

    iput-wide v4, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->AudioAttributesImplBaseParcelizer:D

    .line 227
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result p1

    if-eqz p1, :cond_1aa

    goto :goto_1ab

    :cond_1aa
    move v1, v3

    :goto_1ab
    iput-boolean v1, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->onPrepareFromMediaId:Z

    return-void
.end method

.method public synthetic constructor <init>(Landroid/os/Parcel;Lo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V
    .registers 3

    .line 595
    invoke-direct {p0, p1}, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method public constructor <init>(Lorg/json/JSONObject;Z)V
    .registers 5

    const-string v0, ""

    invoke-static {p1, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    .line 150
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->write:Ljava/util/ArrayList;

    .line 87
    const-string v0, "#FFFFFF"

    iput-object v0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->AudioAttributesImplApi26Parcelizer:Ljava/lang/String;

    const-wide/high16 v0, -0x4010000000000000L    # -1.0

    .line 110
    iput-wide v0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->AudioAttributesImplBaseParcelizer:D

    .line 124
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->AudioAttributesImplApi21Parcelizer:Ljava/util/ArrayList;

    .line 129
    const-string v0, "#000000"

    iput-object v0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->onRemoveQueueItemAt:Ljava/lang/String;

    .line 138
    iput-object v0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->onSetRating:Ljava/lang/String;

    .line 151
    iput-boolean p2, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->RemoteActionCompatParcelizer:Z

    .line 152
    iput-object p1, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->MediaBrowserCompatCustomActionResultReceiver:Lorg/json/JSONObject;

    .line 154
    :try_start_28
    const-string p2, "type"

    invoke-static {p1, p2}, Lo/onSeekStarted;->write(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->setSessionImpl:Ljava/lang/String;

    if-eqz p2, :cond_3f

    .line 155
    const-string v0, "custom-html"

    invoke-static {p2, v0}, Lo/toMagicModuleMetaRepoModel;->RemoteActionCompatParcelizer(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_3b

    goto :goto_3f

    .line 158
    :cond_3b
    invoke-direct {p0, p1}, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->AudioAttributesCompatParcelizer(Lorg/json/JSONObject;)V

    return-void

    .line 156
    :cond_3f
    :goto_3f
    invoke-direct {p0, p1}, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->read(Lorg/json/JSONObject;)V
    :try_end_42
    .catch Lorg/json/JSONException; {:try_start_28 .. :try_end_42} :catch_43

    return-void

    :catch_43
    move-exception p1

    .line 161
    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "Invalid JSON: "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->MediaMetadataCompat:Ljava/lang/String;

    return-void
.end method

.method private final AudioAttributesCompatParcelizer(Lorg/json/JSONObject;)V
    .registers 12

    .line 341
    const-string v0, "hasPortrait"

    const-string v1, ""

    :try_start_4
    const-string v2, "ti"

    invoke-virtual {p1, v2, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->onCommand:Ljava/lang/String;

    .line 342
    const-string v2, "wzrk_id"

    invoke-virtual {p1, v2, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->RatingCompat:Ljava/lang/String;

    .line 343
    const-string v2, "type"

    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->setSessionImpl:Ljava/lang/String;

    .line 344
    const-string v2, "isLocalInApp"

    const/4 v3, 0x0

    invoke-virtual {p1, v2, v3}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v2

    iput-boolean v2, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->onPrepare:Z

    .line 345
    const-string v2, "fallbackToNotificationSettings"

    invoke-virtual {p1, v2, v3}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v2

    iput-boolean v2, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Z

    .line 348
    const-string v2, "efc"

    const/4 v4, -0x1

    invoke-virtual {p1, v2, v4}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v2

    const/4 v5, 0x1

    if-eq v2, v5, :cond_42

    .line 349
    const-string v2, "excludeGlobalFCaps"

    invoke-virtual {p1, v2, v4}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v2

    if-ne v2, v5, :cond_40

    goto :goto_42

    :cond_40
    move v2, v3

    goto :goto_43

    :cond_42
    :goto_42
    move v2, v5

    .line 348
    :goto_43
    iput-boolean v2, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->onFastForward:Z

    .line 350
    const-string v2, "tlc"

    invoke-virtual {p1, v2, v4}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v2

    iput v2, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->onSetRepeatMode:I

    .line 351
    const-string v2, "tdc"

    invoke-virtual {p1, v2, v4}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v2

    iput v2, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->onSetPlaybackSpeed:I

    .line 352
    const-string v2, "mdc"

    invoke-virtual {p1, v2, v4}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v2

    iput v2, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->onPrepareFromUri:I

    .line 353
    sget-object v2, Lo/lambdaupdateStateAndInformListeners41;->AudioAttributesCompatParcelizer:Lo/lambdaupdateStateAndInformListeners41$AudioAttributesCompatParcelizer;

    iget-object v2, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->setSessionImpl:Ljava/lang/String;

    invoke-static {v2}, Lo/lambdaupdateStateAndInformListeners41$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer(Ljava/lang/String;)Lo/lambdaupdateStateAndInformListeners41;

    move-result-object v2

    iput-object v2, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->onPlayFromMediaId:Lo/lambdaupdateStateAndInformListeners41;

    .line 354
    const-string v2, "tablet"

    invoke-virtual {p1, v2, v3}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v2

    iput-boolean v2, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->onRewind:Z

    .line 355
    const-string v2, "bg"

    iget-object v6, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->AudioAttributesImplApi26Parcelizer:Ljava/lang/String;

    invoke-virtual {p1, v2, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->AudioAttributesImplApi26Parcelizer:Ljava/lang/String;

    .line 356
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_88

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_86

    goto :goto_88

    :cond_86
    move v0, v3

    goto :goto_89

    :cond_88
    :goto_88
    move v0, v5

    :goto_89
    iput-boolean v0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->onPlayFromUri:Z

    .line 359
    const-string v0, "hasLandscape"

    invoke-virtual {p1, v0, v3}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->onPlayFromSearch:Z

    .line 360
    const-string v0, "wzrk_ttl"

    invoke-static {}, Lcom/clevertap/android/sdk/inapp/CTInAppNotification$read;->RemoteActionCompatParcelizer()J

    move-result-wide v6

    invoke-virtual {p1, v0, v6, v7}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    move-result-wide v6

    iput-wide v6, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->onSetCaptioningEnabled:J

    .line 362
    const-string v0, "title"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0
    :try_end_a5
    .catch Lorg/json/JSONException; {:try_start_4 .. :try_end_a5} :catch_1be

    .line 363
    const-string v2, "color"

    const-string v6, "text"

    if-eqz v0, :cond_b9

    .line 364
    :try_start_ab
    invoke-virtual {v0, v6, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    iput-object v7, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->onSetShuffleMode:Ljava/lang/String;

    .line 365
    iget-object v7, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->onSetRating:Ljava/lang/String;

    invoke-virtual {v0, v2, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->onSetRating:Ljava/lang/String;

    .line 368
    :cond_b9
    const-string v0, "message"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_cf

    .line 370
    invoke-virtual {v0, v6, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    iput-object v6, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->onRemoveQueueItem:Ljava/lang/String;

    .line 371
    iget-object v6, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->onRemoveQueueItemAt:Ljava/lang/String;

    invoke-virtual {v0, v2, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->onRemoveQueueItemAt:Ljava/lang/String;

    .line 374
    :cond_cf
    const-string v0, "close"

    invoke-virtual {p1, v0, v3}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->onPause:Z

    .line 376
    const-string v0, "media"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_ec

    .line 378
    sget-object v2, Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia;->write:Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia$write;

    invoke-static {v0, v5}, Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia$write;->IconCompatParcelizer(Lorg/json/JSONObject;I)Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia;

    move-result-object v0

    if-eqz v0, :cond_ec

    .line 380
    iget-object v2, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->AudioAttributesImplApi21Parcelizer:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 384
    :cond_ec
    const-string v0, "mediaLandscape"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_102

    .line 386
    sget-object v2, Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia;->write:Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia$write;

    const/4 v2, 0x2

    invoke-static {v0, v2}, Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia$write;->IconCompatParcelizer(Lorg/json/JSONObject;I)Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia;

    move-result-object v0

    if-eqz v0, :cond_102

    .line 388
    iget-object v2, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->AudioAttributesImplApi21Parcelizer:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 392
    :cond_102
    const-string v0, "buttons"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    if-eqz v0, :cond_129

    .line 394
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    move-result v2

    move v6, v3

    :goto_10f
    if-ge v6, v2, :cond_129

    .line 395
    invoke-virtual {v0, v6}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v7

    if-eqz v7, :cond_126

    .line 397
    iget-object v8, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->write:Ljava/util/ArrayList;

    new-instance v9, Lcom/clevertap/android/sdk/inapp/CTInAppNotificationButton;

    invoke-direct {v9, v7}, Lcom/clevertap/android/sdk/inapp/CTInAppNotificationButton;-><init>(Lorg/json/JSONObject;)V

    invoke-virtual {v8, v9}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 398
    iget v7, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->MediaBrowserCompatItemReceiver:I

    add-int/2addr v7, v5

    iput v7, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->MediaBrowserCompatItemReceiver:I

    :cond_126
    add-int/lit8 v6, v6, 0x1

    goto :goto_10f

    .line 403
    :cond_129
    const-string v0, "rfp"

    invoke-virtual {p1, v0, v3}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v0

    .line 402
    iput-boolean v0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->onPrepareFromMediaId:Z

    .line 404
    sget-object v0, Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;->CREATOR:Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData$CREATOR;

    invoke-static {p1}, Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData$CREATOR;->IconCompatParcelizer(Lorg/json/JSONObject;)Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;

    move-result-object p1

    iput-object p1, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->MediaBrowserCompatSearchResultReceiver:Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;

    .line 406
    iget-object p1, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->onPlayFromMediaId:Lo/lambdaupdateStateAndInformListeners41;

    if-nez p1, :cond_13e

    goto :goto_146

    :cond_13e
    sget-object v0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification$AudioAttributesCompatParcelizer;->write:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget v4, v0, p1

    :goto_146
    packed-switch v4, :pswitch_data_1d4

    return-void

    .line 422
    :pswitch_14a
    iget-object p1, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->AudioAttributesImplApi21Parcelizer:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_187

    .line 423
    iget-object p1, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->AudioAttributesImplApi21Parcelizer:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    invoke-static {p1, v1}, Lo/toMagicModuleMetaRepoModel;->AudioAttributesCompatParcelizer(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_15b
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1bd

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v1}, Lo/toMagicModuleMetaRepoModel;->AudioAttributesCompatParcelizer(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia;

    .line 424
    invoke-virtual {v0}, Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia;->AudioAttributesCompatParcelizer()Z

    move-result v2

    if-nez v2, :cond_182

    invoke-virtual {v0}, Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia;->read()Z

    move-result v2

    if-nez v2, :cond_182

    invoke-virtual {v0}, Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia;->AudioAttributesImplBaseParcelizer()Z

    move-result v2

    if-nez v2, :cond_182

    invoke-virtual {v0}, Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia;->AudioAttributesImplApi21Parcelizer()Z

    move-result v0

    if-nez v0, :cond_15b

    .line 425
    :cond_182
    const-string p1, "Wrong media type for template"

    iput-object p1, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->MediaMetadataCompat:Ljava/lang/String;

    return-void

    .line 430
    :cond_187
    const-string p1, "No media type for template"

    iput-object p1, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->MediaMetadataCompat:Ljava/lang/String;

    return-void

    .line 411
    :pswitch_18c
    iget-object p1, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->AudioAttributesImplApi21Parcelizer:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    invoke-static {p1, v1}, Lo/toMagicModuleMetaRepoModel;->AudioAttributesCompatParcelizer(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_195
    :goto_195
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1bd

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v1}, Lo/toMagicModuleMetaRepoModel;->AudioAttributesCompatParcelizer(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia;

    .line 412
    invoke-virtual {v0}, Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia;->AudioAttributesCompatParcelizer()Z

    move-result v2

    if-nez v2, :cond_1b6

    invoke-virtual {v0}, Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia;->read()Z

    move-result v2

    if-nez v2, :cond_1b6

    invoke-virtual {v0}, Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia;->AudioAttributesImplBaseParcelizer()Z

    move-result v2

    if-eqz v2, :cond_195

    .line 413
    :cond_1b6
    invoke-virtual {v0, v1}, Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia;->write(Ljava/lang/String;)V

    .line 414
    invoke-static {}, Lo/RendererWakeupListener;->MediaBrowserCompatItemReceiver()V
    :try_end_1bc
    .catch Lorg/json/JSONException; {:try_start_ab .. :try_end_1bc} :catch_1be

    goto :goto_195

    :cond_1bd
    return-void

    :catch_1be
    move-exception p1

    .line 439
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Invalid JSON: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->MediaMetadataCompat:Ljava/lang/String;

    return-void

    :pswitch_data_1d4
    .packed-switch 0x1
        :pswitch_18c
        :pswitch_18c
        :pswitch_18c
        :pswitch_18c
        :pswitch_14a
        :pswitch_14a
        :pswitch_14a
    .end packed-switch
.end method

.method private static AudioAttributesCompatParcelizer(Landroid/os/Bundle;)Z
    .registers 6

    .line 528
    const-string v0, "pos"

    const/4 v1, 0x0

    :try_start_3
    const-string v2, "w"

    invoke-virtual {p0, v2}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v2

    .line 529
    const-string v3, "d"

    invoke-virtual {p0, v3}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p0

    if-eqz v2, :cond_a8

    if-eqz p0, :cond_a8

    .line 535
    const-string v3, "xdp"

    const-class v4, Ljava/lang/Integer;

    invoke-static {v4}, Lo/toMagicModuleMetaDataUcModel;->write(Ljava/lang/Class;)Lo/isHdPlaybackError;

    move-result-object v4

    invoke-static {v2, v3, v4}, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->read(Landroid/os/Bundle;Ljava/lang/String;Lo/isHdPlaybackError;)Z

    move-result v3

    if-nez v3, :cond_30

    .line 536
    const-string v3, "xp"

    const-class v4, Ljava/lang/Integer;

    invoke-static {v4}, Lo/toMagicModuleMetaDataUcModel;->write(Ljava/lang/Class;)Lo/isHdPlaybackError;

    move-result-object v4

    invoke-static {v2, v3, v4}, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->read(Landroid/os/Bundle;Ljava/lang/String;Lo/isHdPlaybackError;)Z

    move-result v3

    if-nez v3, :cond_30

    return v1

    .line 542
    :cond_30
    const-string v3, "ydp"

    const-class v4, Ljava/lang/Integer;

    invoke-static {v4}, Lo/toMagicModuleMetaDataUcModel;->write(Ljava/lang/Class;)Lo/isHdPlaybackError;

    move-result-object v4

    invoke-static {v2, v3, v4}, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->read(Landroid/os/Bundle;Ljava/lang/String;Lo/isHdPlaybackError;)Z

    move-result v3

    if-nez v3, :cond_4d

    .line 543
    const-string v3, "yp"

    const-class v4, Ljava/lang/Integer;

    invoke-static {v4}, Lo/toMagicModuleMetaDataUcModel;->write(Ljava/lang/Class;)Lo/isHdPlaybackError;

    move-result-object v4

    invoke-static {v2, v3, v4}, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->read(Landroid/os/Bundle;Ljava/lang/String;Lo/isHdPlaybackError;)Z

    move-result v3

    if-nez v3, :cond_4d

    return v1

    .line 549
    :cond_4d
    const-string v3, "dk"

    sget-object v4, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    invoke-static {v4}, Lo/toMagicModuleMetaDataUcModel;->write(Ljava/lang/Class;)Lo/isHdPlaybackError;

    move-result-object v4

    invoke-static {v2, v3, v4}, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->read(Landroid/os/Bundle;Ljava/lang/String;Lo/isHdPlaybackError;)Z

    move-result v3

    if-nez v3, :cond_5c

    return v1

    .line 554
    :cond_5c
    const-string v3, "sc"

    sget-object v4, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    invoke-static {v4}, Lo/toMagicModuleMetaDataUcModel;->write(Ljava/lang/Class;)Lo/isHdPlaybackError;

    move-result-object v4

    invoke-static {v2, v3, v4}, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->read(Landroid/os/Bundle;Ljava/lang/String;Lo/isHdPlaybackError;)Z

    move-result v3

    if-nez v3, :cond_6b

    return v1

    .line 559
    :cond_6b
    const-string v3, "html"

    const-class v4, Ljava/lang/String;

    invoke-static {v4}, Lo/toMagicModuleMetaDataUcModel;->write(Ljava/lang/Class;)Lo/isHdPlaybackError;

    move-result-object v4

    invoke-static {p0, v3, v4}, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->read(Landroid/os/Bundle;Ljava/lang/String;Lo/isHdPlaybackError;)Z

    move-result p0

    if-nez p0, :cond_7a

    return v1

    .line 564
    :cond_7a
    const-class p0, Ljava/lang/String;

    invoke-static {p0}, Lo/toMagicModuleMetaDataUcModel;->write(Ljava/lang/Class;)Lo/isHdPlaybackError;

    move-result-object p0

    invoke-static {v2, v0, p0}, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->read(Landroid/os/Bundle;Ljava/lang/String;Lo/isHdPlaybackError;)Z

    move-result p0

    if-eqz p0, :cond_a8

    .line 565
    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;)V

    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result p0
    :try_end_91
    .catchall {:try_start_3 .. :try_end_91} :catchall_a9

    const/16 v0, 0x74

    if-eq p0, v0, :cond_a6

    const/16 v0, 0x72

    if-eq p0, v0, :cond_a6

    const/16 v0, 0x62

    if-eq p0, v0, :cond_a6

    const/16 v0, 0x6c

    if-eq p0, v0, :cond_a6

    const/16 v0, 0x63

    if-eq p0, v0, :cond_a6

    return v1

    :cond_a6
    const/4 p0, 0x1

    return p0

    :cond_a8
    return v1

    .line 582
    :catchall_a9
    invoke-static {}, Lo/RendererWakeupListener;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()V

    return v1
.end method

.method private IconCompatParcelizer(Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;)V
    .registers 2

    .line 335
    iput-object p1, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->MediaBrowserCompatSearchResultReceiver:Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;

    if-eqz p1, :cond_9

    .line 336
    iget-object p0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->MediaBrowserCompatCustomActionResultReceiver:Lorg/json/JSONObject;

    invoke-virtual {p1, p0}, Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;->write(Lorg/json/JSONObject;)V

    :cond_9
    return-void
.end method

.method private final read(Lorg/json/JSONObject;)V
    .registers 11

    .line 444
    const-string v0, "kv"

    const-string v1, ""

    sget-object v2, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->read:Lcom/clevertap/android/sdk/inapp/CTInAppNotification$read;

    invoke-static {v2, p1}, Lcom/clevertap/android/sdk/inapp/CTInAppNotification$read;->write(Lcom/clevertap/android/sdk/inapp/CTInAppNotification$read;Lorg/json/JSONObject;)Landroid/os/Bundle;

    move-result-object v2

    .line 445
    invoke-static {v2}, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->AudioAttributesCompatParcelizer(Landroid/os/Bundle;)Z

    move-result v2

    const-string v3, "Invalid JSON"

    if-nez v2, :cond_15

    .line 446
    iput-object v3, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->MediaMetadataCompat:Ljava/lang/String;

    return-void

    .line 450
    :cond_15
    :try_start_15
    const-string v2, "ti"

    invoke-virtual {p1, v2, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->onCommand:Ljava/lang/String;

    .line 451
    const-string v2, "wzrk_id"

    invoke-virtual {p1, v2, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->RatingCompat:Ljava/lang/String;

    .line 453
    const-string v2, "efc"

    const/4 v4, -0x1

    invoke-virtual {p1, v2, v4}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v2

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eq v2, v5, :cond_3a

    const-string v2, "excludeGlobalFCaps"

    invoke-virtual {p1, v2, v4}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v2

    if-ne v2, v5, :cond_39

    goto :goto_3a

    :cond_39
    move v5, v6

    .line 452
    :cond_3a
    :goto_3a
    iput-boolean v5, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->onFastForward:Z

    .line 456
    const-string v2, "tlc"

    invoke-virtual {p1, v2, v4}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v2

    iput v2, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->onSetRepeatMode:I

    .line 457
    const-string v2, "tdc"

    invoke-virtual {p1, v2, v4}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v2

    iput v2, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->onSetPlaybackSpeed:I

    .line 458
    const-string v2, "isJsEnabled"

    invoke-virtual {p1, v2, v6}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v2

    iput-boolean v2, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->onMediaButtonEvent:Z

    .line 459
    const-string v2, "wzrk_ttl"

    invoke-static {}, Lcom/clevertap/android/sdk/inapp/CTInAppNotification$read;->RemoteActionCompatParcelizer()J

    move-result-wide v7

    invoke-virtual {p1, v2, v7, v8}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    move-result-wide v7

    iput-wide v7, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->onSetCaptioningEnabled:J

    .line 461
    const-string v2, "rfp"

    invoke-virtual {p1, v2, v6}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v2

    .line 460
    iput-boolean v2, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->onPrepareFromMediaId:Z

    .line 463
    const-string v2, "d"

    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    if-eqz v2, :cond_154

    .line 465
    const-string v5, "html"

    invoke-virtual {v2, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    iput-object v5, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->onAddQueueItem:Ljava/lang/String;

    .line 466
    const-string v5, "url"

    invoke-virtual {v2, v5, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->MediaBrowserCompatMediaItem:Ljava/lang/String;

    .line 468
    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    if-eqz v1, :cond_8b

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    goto :goto_90

    .line 470
    :cond_8b
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 467
    :goto_90
    iput-object v0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->MediaDescriptionCompat:Lorg/json/JSONObject;

    .line 472
    const-string v0, "w"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    const-wide/high16 v0, -0x4010000000000000L    # -1.0

    if-eqz p1, :cond_f0

    .line 475
    const-string v2, "dk"

    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    move-result v2

    .line 474
    iput-boolean v2, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->onPlay:Z

    .line 476
    const-string v2, "sc"

    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    move-result v2

    iput-boolean v2, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->onPrepareFromSearch:Z

    .line 477
    const-string v2, "pos"

    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/String;->charAt(I)C

    move-result v2

    iput-char v2, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->onSeekTo:C

    .line 478
    const-string v2, "xdp"

    invoke-virtual {p1, v2, v6}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v2

    iput v2, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->onSkipToQueueItem:I

    .line 479
    const-string v2, "xp"

    invoke-virtual {p1, v2, v6}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v2

    iput v2, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->onStop:I

    .line 480
    const-string v2, "ydp"

    invoke-virtual {p1, v2, v6}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v2

    iput v2, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->handleMediaPlayPauseIfPendingOnHandler:I

    .line 481
    const-string v2, "yp"

    invoke-virtual {p1, v2, v6}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v2

    iput v2, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->onCustomAction:I

    .line 482
    const-string v2, "mdc"

    invoke-virtual {p1, v2, v4}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v2

    iput v2, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->onPrepareFromUri:I

    .line 483
    const-string v2, "aspectRatio"

    invoke-virtual {p1, v2, v0, v1}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;D)D

    move-result-wide v4

    iput-wide v4, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->AudioAttributesImplBaseParcelizer:D

    const-wide/16 v6, 0x0

    cmpg-double p1, v4, v6

    if-gtz p1, :cond_f0

    .line 487
    iput-wide v0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->AudioAttributesImplBaseParcelizer:D

    .line 491
    :cond_f0
    iget-object p1, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->onAddQueueItem:Ljava/lang/String;

    if-eqz p1, :cond_154

    .line 492
    iget-char p1, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->onSeekTo:C

    const/16 v2, 0x74

    const/16 v4, 0x1e

    const/16 v5, 0x64

    if-ne p1, v2, :cond_111

    .line 494
    iget-wide v6, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->AudioAttributesImplBaseParcelizer:D

    cmpg-double p1, v6, v0

    if-nez p1, :cond_10c

    iget p1, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->onStop:I

    if-ne p1, v5, :cond_154

    iget p1, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->onCustomAction:I

    if-gt p1, v4, :cond_154

    .line 495
    :cond_10c
    sget-object p1, Lo/lambdaupdateStateAndInformListeners41;->RatingCompat:Lo/lambdaupdateStateAndInformListeners41;

    iput-object p1, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->onPlayFromMediaId:Lo/lambdaupdateStateAndInformListeners41;

    return-void

    :cond_111
    const/16 v2, 0x62

    if-ne p1, v2, :cond_128

    .line 500
    iget-wide v6, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->AudioAttributesImplBaseParcelizer:D

    cmpg-double p1, v6, v0

    if-nez p1, :cond_123

    iget p1, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->onStop:I

    if-ne p1, v5, :cond_154

    iget p1, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->onCustomAction:I

    if-gt p1, v4, :cond_154

    .line 501
    :cond_123
    sget-object p1, Lo/lambdaupdateStateAndInformListeners41;->MediaBrowserCompatCustomActionResultReceiver:Lo/lambdaupdateStateAndInformListeners41;

    iput-object p1, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->onPlayFromMediaId:Lo/lambdaupdateStateAndInformListeners41;

    return-void

    :cond_128
    const/16 v0, 0x63

    if-ne p1, v0, :cond_154

    .line 506
    iget p1, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->onStop:I

    const/16 v0, 0x5a

    if-ne p1, v0, :cond_13d

    iget v1, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->onCustomAction:I

    const/16 v2, 0x55

    if-ne v1, v2, :cond_13d

    .line 507
    sget-object p1, Lo/lambdaupdateStateAndInformListeners41;->onCustomAction:Lo/lambdaupdateStateAndInformListeners41;

    iput-object p1, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->onPlayFromMediaId:Lo/lambdaupdateStateAndInformListeners41;

    return-void

    :cond_13d
    if-ne p1, v5, :cond_148

    .line 508
    iget v1, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->onCustomAction:I

    if-ne v1, v5, :cond_148

    .line 509
    sget-object p1, Lo/lambdaupdateStateAndInformListeners41;->RemoteActionCompatParcelizer:Lo/lambdaupdateStateAndInformListeners41;

    iput-object p1, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->onPlayFromMediaId:Lo/lambdaupdateStateAndInformListeners41;

    return-void

    :cond_148
    if-ne p1, v0, :cond_154

    .line 510
    iget p1, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->onCustomAction:I

    const/16 v0, 0x32

    if-ne p1, v0, :cond_154

    .line 511
    sget-object p1, Lo/lambdaupdateStateAndInformListeners41;->MediaMetadataCompat:Lo/lambdaupdateStateAndInformListeners41;

    iput-object p1, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->onPlayFromMediaId:Lo/lambdaupdateStateAndInformListeners41;
    :try_end_154
    .catch Lorg/json/JSONException; {:try_start_15 .. :try_end_154} :catch_155

    :cond_154
    return-void

    .line 518
    :catch_155
    iput-object v3, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->MediaMetadataCompat:Ljava/lang/String;

    return-void
.end method

.method private static read(Landroid/os/Bundle;Ljava/lang/String;Lo/isHdPlaybackError;)Z
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/os/Bundle;",
            "Ljava/lang/String;",
            "Lo/isHdPlaybackError<",
            "*>;)Z"
        }
    .end annotation

    .line 523
    invoke-virtual {p0, p1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_12

    invoke-virtual {p0, p1}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    invoke-interface {p2, p0}, Lo/isHdPlaybackError;->AudioAttributesCompatParcelizer(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_12

    const/4 p0, 0x1

    return p0

    :cond_12
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer()D
    .registers 3

    .line 110
    iget-wide v0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->AudioAttributesImplBaseParcelizer:D

    return-wide v0
.end method

.method public final AudioAttributesImplApi21Parcelizer()Z
    .registers 1

    .line 75
    iget-boolean p0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Z

    return p0
.end method

.method public final AudioAttributesImplApi26Parcelizer()Ljava/lang/String;
    .registers 1

    .line 102
    iget-object p0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->MediaMetadataCompat:Ljava/lang/String;

    return-object p0
.end method

.method public final AudioAttributesImplBaseParcelizer()Ljava/lang/String;
    .registers 1

    .line 96
    iget-object p0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->MediaBrowserCompatMediaItem:Ljava/lang/String;

    return-object p0
.end method

.method public final IconCompatParcelizer()Ljava/util/List;
    .registers 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/clevertap/android/sdk/inapp/CTInAppNotificationButton;",
            ">;"
        }
    .end annotation

    .line 49
    iget-object p0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->write:Ljava/util/ArrayList;

    check-cast p0, Ljava/util/List;

    return-object p0
.end method

.method public final MediaBrowserCompatCustomActionResultReceiver()Lorg/json/JSONObject;
    .registers 1

    .line 93
    iget-object p0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->MediaDescriptionCompat:Lorg/json/JSONObject;

    return-object p0
.end method

.method public final MediaBrowserCompatItemReceiver()Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;
    .registers 1

    .line 81
    iget-object p0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->MediaBrowserCompatSearchResultReceiver:Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;

    return-object p0
.end method

.method public final MediaBrowserCompatMediaItem()Lo/lambdaupdateStateAndInformListeners41;
    .registers 1

    .line 26
    iget-object p0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->onPlayFromMediaId:Lo/lambdaupdateStateAndInformListeners41;

    return-object p0
.end method

.method public final MediaBrowserCompatSearchResultReceiver()I
    .registers 1

    .line 104
    iget p0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->handleMediaPlayPauseIfPendingOnHandler:I

    return p0
.end method

.method public final MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()Ljava/lang/String;
    .registers 1

    .line 129
    iget-object p0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->onRemoveQueueItemAt:Ljava/lang/String;

    return-object p0
.end method

.method public final MediaDescriptionCompat()Ljava/lang/String;
    .registers 1

    .line 20
    iget-object p0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->onCommand:Ljava/lang/String;

    return-object p0
.end method

.method public final MediaMetadataCompat()Ljava/lang/String;
    .registers 1

    .line 115
    iget-object p0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->onAddQueueItem:Ljava/lang/String;

    return-object p0
.end method

.method public final RatingCompat()I
    .registers 1

    .line 107
    iget p0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->onCustomAction:I

    return p0
.end method

.method public final RemoteActionCompatParcelizer(I)Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia;
    .registers 5

    .line 294
    iget-object p0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->AudioAttributesImplApi21Parcelizer:Ljava/util/ArrayList;

    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const-string v0, ""

    invoke-static {p0, v0}, Lo/toMagicModuleMetaRepoModel;->AudioAttributesCompatParcelizer(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_b
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_21

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1, v0}, Lo/toMagicModuleMetaRepoModel;->AudioAttributesCompatParcelizer(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia;

    .line 295
    invoke-virtual {v1}, Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia;->IconCompatParcelizer()I

    move-result v2

    if-ne p1, v2, :cond_b

    return-object v1

    :cond_21
    const/4 p0, 0x0

    return-object p0
.end method

.method public final RemoteActionCompatParcelizer()Ljava/lang/String;
    .registers 1

    .line 23
    iget-object p0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->RatingCompat:Ljava/lang/String;

    return-object p0
.end method

.method public final RemoteActionCompatParcelizer(Ljava/lang/String;)V
    .registers 2

    .line 102
    iput-object p1, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->MediaMetadataCompat:Ljava/lang/String;

    return-void
.end method

.method public final describeContents()I
    .registers 1

    const/4 p0, 0x0

    return p0
.end method

.method public final handleMediaPlayPauseIfPendingOnHandler()Ljava/lang/String;
    .registers 1

    .line 60
    iget-object p0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->onRemoveQueueItem:Ljava/lang/String;

    return-object p0
.end method

.method public final onAddQueueItem()Ljava/util/List;
    .registers 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia;",
            ">;"
        }
    .end annotation

    .line 127
    iget-object p0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->AudioAttributesImplApi21Parcelizer:Ljava/util/ArrayList;

    check-cast p0, Ljava/util/List;

    return-object p0
.end method

.method public final onCommand()I
    .registers 1

    .line 43
    iget p0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->onPrepareFromUri:I

    return p0
.end method

.method public final onCustomAction()Lorg/json/JSONObject;
    .registers 1

    .line 38
    iget-object p0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->MediaBrowserCompatCustomActionResultReceiver:Lorg/json/JSONObject;

    invoke-static {p0}, Lo/PlayerPlaybackSuppressionReason;->AudioAttributesCompatParcelizer(Lorg/json/JSONObject;)Lorg/json/JSONObject;

    move-result-object p0

    return-object p0
.end method

.method public final onFastForward()I
    .registers 1

    .line 66
    iget p0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->onSetPlaybackSpeed:I

    return p0
.end method

.method public final onMediaButtonEvent()J
    .registers 3

    .line 63
    iget-wide v0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->onSetCaptioningEnabled:J

    return-wide v0
.end method

.method public final onPause()Ljava/lang/String;
    .registers 1

    .line 138
    iget-object p0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->onSetRating:Ljava/lang/String;

    return-object p0
.end method

.method public final onPlay()Ljava/lang/String;
    .registers 1

    .line 57
    iget-object p0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->onSetShuffleMode:Ljava/lang/String;

    return-object p0
.end method

.method public final onPlayFromMediaId()C
    .registers 1

    .line 132
    iget-char p0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->onSeekTo:C

    return p0
.end method

.method public final onPlayFromSearch()Ljava/lang/String;
    .registers 1

    .line 84
    iget-object p0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->setSessionImpl:Ljava/lang/String;

    return-object p0
.end method

.method public final onPlayFromUri()I
    .registers 1

    .line 147
    iget p0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->onStop:I

    return p0
.end method

.method public final onPrepare()I
    .registers 1

    .line 69
    iget p0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->onSetRepeatMode:I

    return p0
.end method

.method public final onPrepareFromMediaId()Z
    .registers 3

    .line 289
    iget-object v0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->AudioAttributesImplApi21Parcelizer:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_19

    iget-object p0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->AudioAttributesImplApi21Parcelizer:Ljava/util/ArrayList;

    invoke-virtual {p0, v1}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia;

    invoke-virtual {p0}, Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia;->MediaBrowserCompatCustomActionResultReceiver()Z

    move-result p0

    if-eqz p0, :cond_19

    const/4 p0, 0x1

    return p0

    :cond_19
    return v1
.end method

.method public final onPrepareFromSearch()I
    .registers 1

    .line 144
    iget p0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->onSkipToQueueItem:I

    return p0
.end method

.method public final onPrepareFromUri()Z
    .registers 1

    .line 112
    iget-boolean p0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->onPause:Z

    return p0
.end method

.method public final onRemoveQueueItem()Z
    .registers 1

    .line 51
    iget-boolean p0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->onPlayFromSearch:Z

    return p0
.end method

.method public final onRemoveQueueItemAt()Z
    .registers 1

    .line 99
    iget-boolean p0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->onPlay:Z

    return p0
.end method

.method public final onRewind()Z
    .registers 1

    .line 121
    iget-boolean p0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->onMediaButtonEvent:Z

    return p0
.end method

.method public final onSeekTo()Z
    .registers 1

    .line 29
    iget-boolean p0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->onFastForward:Z

    return p0
.end method

.method public final onSetCaptioningEnabled()Z
    .registers 1

    .line 135
    iget-boolean p0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->onPrepareFromSearch:Z

    return p0
.end method

.method public final onSetPlaybackSpeed()Z
    .registers 1

    .line 72
    iget-boolean p0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->onPrepare:Z

    return p0
.end method

.method public final onSetRating()Z
    .registers 1

    .line 118
    iget-boolean p0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->onRewind:Z

    return p0
.end method

.method public final onSetRepeatMode()Z
    .registers 1

    .line 54
    iget-boolean p0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->onPlayFromUri:Z

    return p0
.end method

.method public final onSetShuffleMode()Z
    .registers 1

    .line 78
    iget-boolean p0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->onPrepareFromMediaId:Z

    return p0
.end method

.method public final read()I
    .registers 1

    .line 90
    iget p0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->MediaBrowserCompatItemReceiver:I

    return p0
.end method

.method public final write(Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;)Lcom/clevertap/android/sdk/inapp/CTInAppNotification;
    .registers 8

    .line 305
    const-string v0, "wzrk_cgId"

    const-string v1, "wzrk_pivot"

    :try_start_4
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 306
    const-string v3, "ti"

    iget-object v4, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->onCommand:Ljava/lang/String;

    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 307
    const-string v3, "wzrk_id"

    iget-object v4, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->RatingCompat:Ljava/lang/String;

    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 308
    const-string v3, "type"

    sget-object v4, Lo/lambdaupdateStateAndInformListeners38;->write:Lo/lambdaupdateStateAndInformListeners38;

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 309
    const-string v3, "efc"

    const/4 v4, 0x1

    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 310
    const-string v3, "excludeGlobalFCaps"

    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 311
    const-string v3, "wzrk_ttl"

    iget-wide v4, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->onSetCaptioningEnabled:J

    invoke-virtual {v2, v3, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 312
    iget-object v3, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->MediaBrowserCompatCustomActionResultReceiver:Lorg/json/JSONObject;

    invoke-virtual {v3, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_45

    .line 314
    iget-object v3, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->MediaBrowserCompatCustomActionResultReceiver:Lorg/json/JSONObject;

    invoke-virtual {v3, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 313
    invoke-virtual {v2, v1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 319
    :cond_45
    iget-object v1, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->MediaBrowserCompatCustomActionResultReceiver:Lorg/json/JSONObject;

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_56

    .line 321
    iget-object v1, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->MediaBrowserCompatCustomActionResultReceiver:Lorg/json/JSONObject;

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 320
    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 326
    :cond_56
    new-instance v0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;

    iget-boolean p0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->RemoteActionCompatParcelizer:Z

    invoke-direct {v0, v2, p0}, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;-><init>(Lorg/json/JSONObject;Z)V

    .line 327
    invoke-direct {v0, p1}, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->IconCompatParcelizer(Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;)V
    :try_end_60
    .catch Lorg/json/JSONException; {:try_start_4 .. :try_end_60} :catch_61

    return-object v0

    :catch_61
    const/4 p0, 0x0

    return-object p0
.end method

.method public final write()Ljava/lang/String;
    .registers 1

    .line 87
    iget-object p0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->AudioAttributesImplApi26Parcelizer:Ljava/lang/String;

    return-object p0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .registers 6

    const-string v0, ""

    invoke-static {p1, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    .line 235
    iget-object v0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->onCommand:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 236
    iget-object v0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->RatingCompat:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 237
    iget-object v0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->onPlayFromMediaId:Lo/lambdaupdateStateAndInformListeners41;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeValue(Ljava/lang/Object;)V

    .line 238
    iget-object v0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->onAddQueueItem:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 239
    iget-boolean v0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->onFastForward:Z

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 240
    iget-boolean v0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->onPrepareFromSearch:Z

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 241
    iget-boolean v0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->onPlay:Z

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 242
    iget v0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->onPrepareFromUri:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 243
    iget v0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->onSetRepeatMode:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 244
    iget v0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->onSetPlaybackSpeed:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 245
    iget-char v0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->onSeekTo:C

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 246
    iget v0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->handleMediaPlayPauseIfPendingOnHandler:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 247
    iget v0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->onCustomAction:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 248
    iget v0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->onSkipToQueueItem:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 249
    iget v0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->onStop:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 250
    iget-object v0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->MediaBrowserCompatCustomActionResultReceiver:Lorg/json/JSONObject;

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 251
    iget-object v0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->MediaMetadataCompat:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 252
    iget-object v0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->MediaDescriptionCompat:Lorg/json/JSONObject;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_6b

    .line 253
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeByte(B)V

    goto :goto_77

    .line 255
    :cond_6b
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeByte(B)V

    .line 256
    iget-object v0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->MediaDescriptionCompat:Lorg/json/JSONObject;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 258
    :goto_77
    iget-object v0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->AudioAttributesCompatParcelizer:Lorg/json/JSONObject;

    if-nez v0, :cond_7f

    .line 259
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeByte(B)V

    goto :goto_8b

    .line 261
    :cond_7f
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeByte(B)V

    .line 262
    iget-object v0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->AudioAttributesCompatParcelizer:Lorg/json/JSONObject;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 264
    :goto_8b
    iget-object v0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->setSessionImpl:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 265
    iget-object v0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->onSetShuffleMode:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 266
    iget-object v0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->onSetRating:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 267
    iget-object v0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->AudioAttributesImplApi26Parcelizer:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 268
    iget-object v0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->onRemoveQueueItem:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 269
    iget-object v0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->onRemoveQueueItemAt:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 270
    iget-object v0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->write:Ljava/util/ArrayList;

    check-cast v0, Ljava/util/List;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeTypedList(Ljava/util/List;)V

    .line 271
    iget-object v0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->AudioAttributesImplApi21Parcelizer:Ljava/util/ArrayList;

    check-cast v0, Ljava/util/List;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeTypedList(Ljava/util/List;)V

    .line 272
    iget-boolean v0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->onPause:Z

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 273
    iget v0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->MediaBrowserCompatItemReceiver:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 274
    iget-boolean v0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->onRewind:Z

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 275
    iget-object v0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->MediaBrowserCompatMediaItem:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 276
    iget-boolean v0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->onMediaButtonEvent:Z

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 277
    iget-boolean v0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->onPlayFromUri:Z

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 278
    iget-boolean v0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->onPlayFromSearch:Z

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 279
    iget-boolean v0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->onPrepare:Z

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 280
    iget-boolean v0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Z

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 281
    iget-object v0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->IconCompatParcelizer:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 282
    iget-wide v0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->onSetCaptioningEnabled:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 283
    iget-object v0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->MediaBrowserCompatSearchResultReceiver:Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;

    check-cast v0, Landroid/os/Parcelable;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 284
    iget-wide v0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->AudioAttributesImplBaseParcelizer:D

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeDouble(D)V

    .line 285
    iget-boolean p0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;->onPrepareFromMediaId:Z

    int-to-byte p0, p0

    invoke-virtual {p1, p0}, Landroid/os/Parcel;->writeByte(B)V

    return-void
.end method

###### Class com.clevertap.android.sdk.inapp.CTInAppNotification.AudioAttributesCompatParcelizer (com.clevertap.android.sdk.inapp.CTInAppNotification$AudioAttributesCompatParcelizer)
.class public final synthetic Lcom/clevertap/android/sdk/inapp/CTInAppNotification$AudioAttributesCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/clevertap/android/sdk/inapp/CTInAppNotification;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1011
    name = "AudioAttributesCompatParcelizer"
.end annotation


# static fields
.field public static final synthetic write:[I


# direct methods
.method static constructor <clinit>()V
    .registers 3

    .line 1
    invoke-static {}, Lo/lambdaupdateStateAndInformListeners41;->values()[Lo/lambdaupdateStateAndInformListeners41;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    :try_start_7
    sget-object v1, Lo/lambdaupdateStateAndInformListeners41;->AudioAttributesImplBaseParcelizer:Lo/lambdaupdateStateAndInformListeners41;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_10
    .catch Ljava/lang/NoSuchFieldError; {:try_start_7 .. :try_end_10} :catch_10

    :catch_10
    :try_start_10
    sget-object v1, Lo/lambdaupdateStateAndInformListeners41;->MediaBrowserCompatMediaItem:Lo/lambdaupdateStateAndInformListeners41;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1
    :try_end_19
    .catch Ljava/lang/NoSuchFieldError; {:try_start_10 .. :try_end_19} :catch_19

    :catch_19
    :try_start_19
    sget-object v1, Lo/lambdaupdateStateAndInformListeners41;->IconCompatParcelizer:Lo/lambdaupdateStateAndInformListeners41;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x3

    aput v2, v0, v1
    :try_end_22
    .catch Ljava/lang/NoSuchFieldError; {:try_start_19 .. :try_end_22} :catch_22

    :catch_22
    :try_start_22
    sget-object v1, Lo/lambdaupdateStateAndInformListeners41;->MediaBrowserCompatItemReceiver:Lo/lambdaupdateStateAndInformListeners41;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x4

    aput v2, v0, v1
    :try_end_2b
    .catch Ljava/lang/NoSuchFieldError; {:try_start_22 .. :try_end_2b} :catch_2b

    :catch_2b
    :try_start_2b
    sget-object v1, Lo/lambdaupdateStateAndInformListeners41;->read:Lo/lambdaupdateStateAndInformListeners41;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x5

    aput v2, v0, v1
    :try_end_34
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2b .. :try_end_34} :catch_34

    :catch_34
    :try_start_34
    sget-object v1, Lo/lambdaupdateStateAndInformListeners41;->MediaBrowserCompatSearchResultReceiver:Lo/lambdaupdateStateAndInformListeners41;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x6

    aput v2, v0, v1
    :try_end_3d
    .catch Ljava/lang/NoSuchFieldError; {:try_start_34 .. :try_end_3d} :catch_3d

    :catch_3d
    :try_start_3d
    sget-object v1, Lo/lambdaupdateStateAndInformListeners41;->handleMediaPlayPauseIfPendingOnHandler:Lo/lambdaupdateStateAndInformListeners41;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x7

    aput v2, v0, v1
    :try_end_46
    .catch Ljava/lang/NoSuchFieldError; {:try_start_3d .. :try_end_46} :catch_46

    :catch_46
    sput-object v0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification$AudioAttributesCompatParcelizer;->write:[I

    return-void
.end method

###### Class com.clevertap.android.sdk.inapp.CTInAppNotification.RemoteActionCompatParcelizer (com.clevertap.android.sdk.inapp.CTInAppNotification$RemoteActionCompatParcelizer)
.class public final Lcom/clevertap/android/sdk/inapp/CTInAppNotification$RemoteActionCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/clevertap/android/sdk/inapp/CTInAppNotification;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/clevertap/android/sdk/inapp/CTInAppNotification;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .registers 1

    .line 594
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static AudioAttributesCompatParcelizer(Landroid/os/Parcel;)Lcom/clevertap/android/sdk/inapp/CTInAppNotification;
    .registers 3

    const-string v0, ""

    invoke-static {p0, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    .line 596
    new-instance v0, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/clevertap/android/sdk/inapp/CTInAppNotification;-><init>(Landroid/os/Parcel;Lo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V

    return-object v0
.end method

.method private static AudioAttributesCompatParcelizer(I)[Lcom/clevertap/android/sdk/inapp/CTInAppNotification;
    .registers 1

    .line 600
    new-array p0, p0, [Lcom/clevertap/android/sdk/inapp/CTInAppNotification;

    return-object p0
.end method


# virtual methods
.method public final synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .registers 2

    .line 594
    invoke-static {p1}, Lcom/clevertap/android/sdk/inapp/CTInAppNotification$RemoteActionCompatParcelizer;->AudioAttributesCompatParcelizer(Landroid/os/Parcel;)Lcom/clevertap/android/sdk/inapp/CTInAppNotification;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .registers 2

    .line 594
    invoke-static {p1}, Lcom/clevertap/android/sdk/inapp/CTInAppNotification$RemoteActionCompatParcelizer;->AudioAttributesCompatParcelizer(I)[Lcom/clevertap/android/sdk/inapp/CTInAppNotification;

    move-result-object p0

    return-object p0
.end method

###### Class com.clevertap.android.sdk.inapp.CTInAppNotification.Companion (com.clevertap.android.sdk.inapp.CTInAppNotification$read)
.class public final Lcom/clevertap/android/sdk/inapp/CTInAppNotification$read;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/clevertap/android/sdk/inapp/CTInAppNotification;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "read"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0008\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000bR\u0017\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c8\u0006\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000f"
    }
    d2 = {
        "Lcom/clevertap/android/sdk/inapp/CTInAppNotification$read;",
        "",
        "<init>",
        "()V",
        "",
        "RemoteActionCompatParcelizer",
        "()J",
        "Lorg/json/JSONObject;",
        "p0",
        "Landroid/os/Bundle;",
        "AudioAttributesCompatParcelizer",
        "(Lorg/json/JSONObject;)Landroid/os/Bundle;",
        "Landroid/os/Parcelable$Creator;",
        "Lcom/clevertap/android/sdk/inapp/CTInAppNotification;",
        "CREATOR",
        "Landroid/os/Parcelable$Creator;"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .registers 1

    .line 587
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V
    .registers 2

    .line 634
    invoke-direct {p0}, Lcom/clevertap/android/sdk/inapp/CTInAppNotification$read;-><init>()V

    return-void
.end method

.method private final AudioAttributesCompatParcelizer(Lorg/json/JSONObject;)Landroid/os/Bundle;
    .registers 8

    .line 609
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 610
    invoke-virtual {p1}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v1

    const-string v2, ""

    invoke-static {v1, v2}, Lo/toMagicModuleMetaRepoModel;->AudioAttributesCompatParcelizer(Ljava/lang/Object;Ljava/lang/String;)V

    .line 611
    :cond_e
    :goto_e
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_92

    .line 612
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3, v2}, Lo/toMagicModuleMetaRepoModel;->read(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Ljava/lang/String;

    .line 614
    :try_start_1d
    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4
    :try_end_21
    .catch Lorg/json/JSONException; {:try_start_1d .. :try_end_21} :catch_8d

    .line 615
    instance-of v5, v4, Ljava/lang/String;

    if-eqz v5, :cond_2b

    .line 616
    :try_start_25
    check-cast v4, Ljava/lang/String;

    invoke-virtual {v0, v3, v4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2a
    .catch Lorg/json/JSONException; {:try_start_25 .. :try_end_2a} :catch_8d

    goto :goto_e

    .line 617
    :cond_2b
    instance-of v5, v4, Ljava/lang/Character;

    if-eqz v5, :cond_39

    .line 618
    :try_start_2f
    check-cast v4, Ljava/lang/Character;

    invoke-virtual {v4}, Ljava/lang/Character;->charValue()C

    move-result v4

    invoke-virtual {v0, v3, v4}, Landroid/os/Bundle;->putChar(Ljava/lang/String;C)V
    :try_end_38
    .catch Lorg/json/JSONException; {:try_start_2f .. :try_end_38} :catch_8d

    goto :goto_e

    .line 619
    :cond_39
    instance-of v5, v4, Ljava/lang/Integer;

    if-eqz v5, :cond_47

    .line 620
    :try_start_3d
    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    invoke-virtual {v0, v3, v4}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
    :try_end_46
    .catch Lorg/json/JSONException; {:try_start_3d .. :try_end_46} :catch_8d

    goto :goto_e

    .line 621
    :cond_47
    instance-of v5, v4, Ljava/lang/Float;

    if-eqz v5, :cond_55

    .line 622
    :try_start_4b
    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    move-result v4

    invoke-virtual {v0, v3, v4}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V
    :try_end_54
    .catch Lorg/json/JSONException; {:try_start_4b .. :try_end_54} :catch_8d

    goto :goto_e

    .line 623
    :cond_55
    instance-of v5, v4, Ljava/lang/Double;

    if-eqz v5, :cond_63

    .line 624
    :try_start_59
    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v4

    invoke-virtual {v0, v3, v4, v5}, Landroid/os/Bundle;->putDouble(Ljava/lang/String;D)V
    :try_end_62
    .catch Lorg/json/JSONException; {:try_start_59 .. :try_end_62} :catch_8d

    goto :goto_e

    .line 625
    :cond_63
    instance-of v5, v4, Ljava/lang/Long;

    if-eqz v5, :cond_71

    .line 626
    :try_start_67
    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->longValue()J

    move-result-wide v4

    invoke-virtual {v0, v3, v4, v5}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V
    :try_end_70
    .catch Lorg/json/JSONException; {:try_start_67 .. :try_end_70} :catch_8d

    goto :goto_e

    .line 627
    :cond_71
    instance-of v5, v4, Ljava/lang/Boolean;

    if-eqz v5, :cond_7f

    .line 628
    :try_start_75
    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    invoke-virtual {v0, v3, v4}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V
    :try_end_7e
    .catch Lorg/json/JSONException; {:try_start_75 .. :try_end_7e} :catch_8d

    goto :goto_e

    .line 629
    :cond_7f
    instance-of v5, v4, Lorg/json/JSONObject;

    if-eqz v5, :cond_e

    .line 630
    :try_start_83
    check-cast v4, Lorg/json/JSONObject;

    invoke-direct {p0, v4}, Lcom/clevertap/android/sdk/inapp/CTInAppNotification$read;->AudioAttributesCompatParcelizer(Lorg/json/JSONObject;)Landroid/os/Bundle;

    move-result-object v4

    invoke-virtual {v0, v3, v4}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V
    :try_end_8c
    .catch Lorg/json/JSONException; {:try_start_83 .. :try_end_8c} :catch_8d

    goto :goto_e

    .line 633
    :catch_8d
    invoke-static {}, Lo/RendererWakeupListener;->MediaMetadataCompat()V

    goto/16 :goto_e

    :cond_92
    return-object v0
.end method

.method public static RemoteActionCompatParcelizer()J
    .registers 4

    .line 605
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const-wide/32 v2, 0xa4cb800

    add-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    div-long/2addr v0, v2

    return-wide v0
.end method

.method public static final synthetic write(Lcom/clevertap/android/sdk/inapp/CTInAppNotification$read;Lorg/json/JSONObject;)Landroid/os/Bundle;
    .registers 2

    .line 587
    invoke-direct {p0, p1}, Lcom/clevertap/android/sdk/inapp/CTInAppNotification$read;->AudioAttributesCompatParcelizer(Lorg/json/JSONObject;)Landroid/os/Bundle;

    move-result-object p0

    return-object p0
.end method
