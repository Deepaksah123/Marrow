###### Class androidx.constraintlayout.motion.widget.MotionLayout (androidx.constraintlayout.motion.widget.MotionLayout)
.class public Landroidx/constraintlayout/motion/widget/MotionLayout;
.super Landroidx/constraintlayout/widget/ConstraintLayout;
.source "SourceFile"

# interfaces
.implements Lo/resetAsObject;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesCompatParcelizer;,
        Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;,
        Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;,
        Landroidx/constraintlayout/motion/widget/MotionLayout$write;,
        Landroidx/constraintlayout/motion/widget/MotionLayout$read;,
        Landroidx/constraintlayout/motion/widget/MotionLayout$MediaBrowserCompatCustomActionResultReceiver;,
        Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi26Parcelizer;,
        Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi21Parcelizer;
    }
.end annotation


# static fields
.field public static RemoteActionCompatParcelizer:Z = false


# instance fields
.field public AudioAttributesCompatParcelizer:I

.field AudioAttributesImplApi21Parcelizer:F

.field protected AudioAttributesImplApi26Parcelizer:Z

.field public AudioAttributesImplBaseParcelizer:F

.field IconCompatParcelizer:I

.field MediaBrowserCompatCustomActionResultReceiver:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Landroid/view/View;",
            "Lo/handleSingleElementUnwrapped;",
            ">;"
        }
    .end annotation
.end field

.field MediaBrowserCompatItemReceiver:I

.field MediaBrowserCompatMediaItem:I

.field MediaBrowserCompatSearchResultReceiver:I

.field MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:I

.field public MediaDescriptionCompat:Lo/PrimitiveArrayDeserializersFloatDeser;

.field MediaMetadataCompat:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Landroid/view/View;",
            "Lo/_parseDouble;",
            ">;"
        }
    .end annotation
.end field

.field private MediaSessionCompatQueueItem:I

.field private MediaSessionCompatResultReceiverWrapper:I

.field private MediaSessionCompatToken:I

.field private ParcelableVolumeInfo:I

.field private PlaybackStateCompat:F

.field private PlaybackStateCompatCustomAction:Z

.field RatingCompat:I

.field private ResultReceiver:I

.field private _init_lambda2:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroidx/constraintlayout/motion/widget/MotionHelper;",
            ">;"
        }
    .end annotation
.end field

.field private _init_lambda3:I

.field private _init_lambda4:F

.field private _init_lambda5:Landroid/view/View;

.field private accessaddObserverForBackInvoker:Landroid/view/animation/Interpolator;

.field private accessensureViewModelStore:I

.field private accessgetReportFullyDrawnExecutorp:[I

.field private accessonBackPresseds1027565324:Landroidx/constraintlayout/motion/widget/MotionLayout$MediaBrowserCompatCustomActionResultReceiver;

.field private addContentView:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private addMenuProvider:Z

.field private addObserverForBackInvoker:F

.field private addObserverForBackInvokerlambda7:F

.field private addOnConfigurationChangedListener:Z

.field private addOnContextAvailableListener:J

.field private addOnMultiWindowModeChangedListener:F

.field private addOnNewIntentListener:Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi26Parcelizer;

.field private addOnPictureInPictureModeChangedListener:Ljava/util/concurrent/CopyOnWriteArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArrayList<",
            "Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi26Parcelizer;",
            ">;"
        }
    .end annotation
.end field

.field private addOnTrimMemoryListener:Z

.field private createFullyDrawnExecutor:Lo/NumberDeserializersIntegerDeserializer;

.field private ensureViewModelStore:J

.field private getActivityResultRegistry:Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi21Parcelizer;

.field private getOnBackPressedDispatcherannotations:F

.field private getSavedStateRegistryControllerannotations:Landroid/graphics/Rect;

.field private menuHostHelperlambda0:F

.field onCustomAction:F

.field private onFastForward:Z

.field private onMediaButtonEvent:J

.field private onPause:F

.field private onPlay:I

.field private onPlayFromMediaId:F

.field private onPlayFromSearch:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroidx/constraintlayout/motion/widget/MotionHelper;",
            ">;"
        }
    .end annotation
.end field

.field private onPlayFromUri:Landroid/graphics/RectF;

.field private onPrepare:Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;

.field private onPrepareFromMediaId:Z

.field private onPrepareFromSearch:Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesCompatParcelizer;

.field private onPrepareFromUri:I

.field private onRemoveQueueItem:Z

.field private onRemoveQueueItemAt:Z

.field private onRewind:Z

.field private onSeekTo:I

.field private onSetCaptioningEnabled:Z

.field private onSetPlaybackSpeed:Z

.field private onSetRating:Z

.field private onSetRepeatMode:Landroid/view/animation/Interpolator;

.field private onSetShuffleMode:Landroid/graphics/Matrix;

.field private onSkipToNext:F

.field private onSkipToPrevious:J

.field private onSkipToQueueItem:Lo/FromStringDeserializer;

.field private onStop:I

.field private r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw:Ljava/lang/Runnable;

.field private r8lambdaKUbBm7ckfqTc9QCgukC86fguu4:Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;

.field private r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM:I

.field private r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28:I

.field private r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8:I

.field private r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroidx/constraintlayout/motion/widget/MotionHelper;",
            ">;"
        }
    .end annotation
.end field

.field public read:I

.field private setSessionImpl:Z

.field write:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 7

    .line 1118
    invoke-direct {p0, p1}, Landroidx/constraintlayout/widget/ConstraintLayout;-><init>(Landroid/content/Context;)V

    const/4 p1, 0x0

    .line 1014
    iput-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->accessaddObserverForBackInvoker:Landroid/view/animation/Interpolator;

    const/4 v0, 0x0

    .line 1015
    iput v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->AudioAttributesImplBaseParcelizer:F

    const/4 v1, -0x1

    .line 1016
    iput v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onPlay:I

    .line 1017
    iput v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->AudioAttributesCompatParcelizer:I

    .line 1018
    iput v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onPrepareFromUri:I

    const/4 v1, 0x0

    .line 1019
    iput v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaSessionCompatQueueItem:I

    .line 1020
    iput v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onStop:I

    const/4 v2, 0x1

    .line 1021
    iput-boolean v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onSetRating:Z

    .line 1023
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    iput-object v3, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaBrowserCompatCustomActionResultReceiver:Ljava/util/HashMap;

    const-wide/16 v3, 0x0

    .line 1025
    iput-wide v3, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onMediaButtonEvent:J

    const/high16 v3, 0x3f800000    # 1.0f

    .line 1026
    iput v3, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->menuHostHelperlambda0:F

    .line 1027
    iput v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->addOnMultiWindowModeChangedListener:F

    .line 1028
    iput v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onCustomAction:F

    .line 1030
    iput v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->getOnBackPressedDispatcherannotations:F

    .line 1032
    iput-boolean v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onRemoveQueueItem:Z

    .line 1033
    iput-boolean v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onSetCaptioningEnabled:Z

    .line 1040
    iput v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->read:I

    .line 1044
    iput-boolean v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->addMenuProvider:Z

    .line 1045
    new-instance v3, Lo/NumberDeserializersIntegerDeserializer;

    invoke-direct {v3}, Lo/NumberDeserializersIntegerDeserializer;-><init>()V

    iput-object v3, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->createFullyDrawnExecutor:Lo/NumberDeserializersIntegerDeserializer;

    .line 1046
    new-instance v3, Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesCompatParcelizer;

    invoke-direct {v3, p0}, Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesCompatParcelizer;-><init>(Landroidx/constraintlayout/motion/widget/MotionLayout;)V

    iput-object v3, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onPrepareFromSearch:Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesCompatParcelizer;

    .line 1050
    iput-boolean v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onFastForward:Z

    .line 1057
    iput-boolean v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->addOnTrimMemoryListener:Z

    .line 1062
    iput-boolean v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->setSessionImpl:Z

    .line 1064
    iput-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->_init_lambda2:Ljava/util/ArrayList;

    .line 1065
    iput-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0:Ljava/util/ArrayList;

    .line 1066
    iput-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onPlayFromSearch:Ljava/util/ArrayList;

    .line 1067
    iput-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->addOnPictureInPictureModeChangedListener:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 1068
    iput v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onSeekTo:I

    const-wide/16 v2, -0x1

    .line 1069
    iput-wide v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onSkipToPrevious:J

    .line 1070
    iput v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onSkipToNext:F

    .line 1071
    iput v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->ParcelableVolumeInfo:I

    .line 1072
    iput v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->PlaybackStateCompat:F

    .line 1073
    iput-boolean v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onSetPlaybackSpeed:Z

    .line 1080
    iput-boolean v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->AudioAttributesImplApi26Parcelizer:Z

    .line 1088
    new-instance v0, Lo/FromStringDeserializer;

    invoke-direct {v0}, Lo/FromStringDeserializer;-><init>()V

    iput-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onSkipToQueueItem:Lo/FromStringDeserializer;

    .line 1089
    iput-boolean v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onRewind:Z

    .line 1091
    iput-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw:Ljava/lang/Runnable;

    .line 1092
    iput-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->accessgetReportFullyDrawnExecutorp:[I

    .line 1093
    iput v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->accessensureViewModelStore:I

    .line 1094
    iput-boolean v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onRemoveQueueItemAt:Z

    .line 1095
    iput v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->RatingCompat:I

    .line 1096
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaMetadataCompat:Ljava/util/HashMap;

    .line 1100
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->getSavedStateRegistryControllerannotations:Landroid/graphics/Rect;

    .line 1101
    iput-boolean v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onPrepareFromMediaId:Z

    .line 1114
    sget-object v0, Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi21Parcelizer;->IconCompatParcelizer:Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi21Parcelizer;

    iput-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->getActivityResultRegistry:Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi21Parcelizer;

    .line 2877
    new-instance v0, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;

    invoke-direct {v0, p0}, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;-><init>(Landroidx/constraintlayout/motion/widget/MotionLayout;)V

    iput-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->r8lambdaKUbBm7ckfqTc9QCgukC86fguu4:Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;

    .line 3786
    iput-boolean v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->PlaybackStateCompatCustomAction:Z

    .line 4005
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onPlayFromUri:Landroid/graphics/RectF;

    .line 4006
    iput-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->_init_lambda5:Landroid/view/View;

    .line 4007
    iput-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onSetShuffleMode:Landroid/graphics/Matrix;

    .line 4415
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->addContentView:Ljava/util/ArrayList;

    .line 1119
    invoke-direct {p0, p1}, Landroidx/constraintlayout/motion/widget/MotionLayout;->AudioAttributesCompatParcelizer(Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 8

    .line 1123
    invoke-direct {p0, p1, p2}, Landroidx/constraintlayout/widget/ConstraintLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p1, 0x0

    .line 1014
    iput-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->accessaddObserverForBackInvoker:Landroid/view/animation/Interpolator;

    const/4 v0, 0x0

    .line 1015
    iput v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->AudioAttributesImplBaseParcelizer:F

    const/4 v1, -0x1

    .line 1016
    iput v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onPlay:I

    .line 1017
    iput v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->AudioAttributesCompatParcelizer:I

    .line 1018
    iput v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onPrepareFromUri:I

    const/4 v1, 0x0

    .line 1019
    iput v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaSessionCompatQueueItem:I

    .line 1020
    iput v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onStop:I

    const/4 v2, 0x1

    .line 1021
    iput-boolean v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onSetRating:Z

    .line 1023
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    iput-object v3, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaBrowserCompatCustomActionResultReceiver:Ljava/util/HashMap;

    const-wide/16 v3, 0x0

    .line 1025
    iput-wide v3, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onMediaButtonEvent:J

    const/high16 v3, 0x3f800000    # 1.0f

    .line 1026
    iput v3, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->menuHostHelperlambda0:F

    .line 1027
    iput v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->addOnMultiWindowModeChangedListener:F

    .line 1028
    iput v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onCustomAction:F

    .line 1030
    iput v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->getOnBackPressedDispatcherannotations:F

    .line 1032
    iput-boolean v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onRemoveQueueItem:Z

    .line 1033
    iput-boolean v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onSetCaptioningEnabled:Z

    .line 1040
    iput v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->read:I

    .line 1044
    iput-boolean v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->addMenuProvider:Z

    .line 1045
    new-instance v3, Lo/NumberDeserializersIntegerDeserializer;

    invoke-direct {v3}, Lo/NumberDeserializersIntegerDeserializer;-><init>()V

    iput-object v3, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->createFullyDrawnExecutor:Lo/NumberDeserializersIntegerDeserializer;

    .line 1046
    new-instance v3, Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesCompatParcelizer;

    invoke-direct {v3, p0}, Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesCompatParcelizer;-><init>(Landroidx/constraintlayout/motion/widget/MotionLayout;)V

    iput-object v3, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onPrepareFromSearch:Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesCompatParcelizer;

    .line 1050
    iput-boolean v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onFastForward:Z

    .line 1057
    iput-boolean v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->addOnTrimMemoryListener:Z

    .line 1062
    iput-boolean v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->setSessionImpl:Z

    .line 1064
    iput-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->_init_lambda2:Ljava/util/ArrayList;

    .line 1065
    iput-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0:Ljava/util/ArrayList;

    .line 1066
    iput-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onPlayFromSearch:Ljava/util/ArrayList;

    .line 1067
    iput-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->addOnPictureInPictureModeChangedListener:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 1068
    iput v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onSeekTo:I

    const-wide/16 v2, -0x1

    .line 1069
    iput-wide v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onSkipToPrevious:J

    .line 1070
    iput v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onSkipToNext:F

    .line 1071
    iput v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->ParcelableVolumeInfo:I

    .line 1072
    iput v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->PlaybackStateCompat:F

    .line 1073
    iput-boolean v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onSetPlaybackSpeed:Z

    .line 1080
    iput-boolean v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->AudioAttributesImplApi26Parcelizer:Z

    .line 1088
    new-instance v0, Lo/FromStringDeserializer;

    invoke-direct {v0}, Lo/FromStringDeserializer;-><init>()V

    iput-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onSkipToQueueItem:Lo/FromStringDeserializer;

    .line 1089
    iput-boolean v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onRewind:Z

    .line 1091
    iput-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw:Ljava/lang/Runnable;

    .line 1092
    iput-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->accessgetReportFullyDrawnExecutorp:[I

    .line 1093
    iput v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->accessensureViewModelStore:I

    .line 1094
    iput-boolean v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onRemoveQueueItemAt:Z

    .line 1095
    iput v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->RatingCompat:I

    .line 1096
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaMetadataCompat:Ljava/util/HashMap;

    .line 1100
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->getSavedStateRegistryControllerannotations:Landroid/graphics/Rect;

    .line 1101
    iput-boolean v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onPrepareFromMediaId:Z

    .line 1114
    sget-object v0, Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi21Parcelizer;->IconCompatParcelizer:Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi21Parcelizer;

    iput-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->getActivityResultRegistry:Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi21Parcelizer;

    .line 2877
    new-instance v0, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;

    invoke-direct {v0, p0}, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;-><init>(Landroidx/constraintlayout/motion/widget/MotionLayout;)V

    iput-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->r8lambdaKUbBm7ckfqTc9QCgukC86fguu4:Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;

    .line 3786
    iput-boolean v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->PlaybackStateCompatCustomAction:Z

    .line 4005
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onPlayFromUri:Landroid/graphics/RectF;

    .line 4006
    iput-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->_init_lambda5:Landroid/view/View;

    .line 4007
    iput-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onSetShuffleMode:Landroid/graphics/Matrix;

    .line 4415
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->addContentView:Ljava/util/ArrayList;

    .line 1124
    invoke-direct {p0, p2}, Landroidx/constraintlayout/motion/widget/MotionLayout;->AudioAttributesCompatParcelizer(Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 8

    .line 1128
    invoke-direct {p0, p1, p2, p3}, Landroidx/constraintlayout/widget/ConstraintLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p1, 0x0

    .line 1014
    iput-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->accessaddObserverForBackInvoker:Landroid/view/animation/Interpolator;

    const/4 p3, 0x0

    .line 1015
    iput p3, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->AudioAttributesImplBaseParcelizer:F

    const/4 v0, -0x1

    .line 1016
    iput v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onPlay:I

    .line 1017
    iput v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->AudioAttributesCompatParcelizer:I

    .line 1018
    iput v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onPrepareFromUri:I

    const/4 v0, 0x0

    .line 1019
    iput v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaSessionCompatQueueItem:I

    .line 1020
    iput v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onStop:I

    const/4 v1, 0x1

    .line 1021
    iput-boolean v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onSetRating:Z

    .line 1023
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    iput-object v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaBrowserCompatCustomActionResultReceiver:Ljava/util/HashMap;

    const-wide/16 v2, 0x0

    .line 1025
    iput-wide v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onMediaButtonEvent:J

    const/high16 v2, 0x3f800000    # 1.0f

    .line 1026
    iput v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->menuHostHelperlambda0:F

    .line 1027
    iput p3, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->addOnMultiWindowModeChangedListener:F

    .line 1028
    iput p3, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onCustomAction:F

    .line 1030
    iput p3, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->getOnBackPressedDispatcherannotations:F

    .line 1032
    iput-boolean v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onRemoveQueueItem:Z

    .line 1033
    iput-boolean v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onSetCaptioningEnabled:Z

    .line 1040
    iput v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->read:I

    .line 1044
    iput-boolean v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->addMenuProvider:Z

    .line 1045
    new-instance v2, Lo/NumberDeserializersIntegerDeserializer;

    invoke-direct {v2}, Lo/NumberDeserializersIntegerDeserializer;-><init>()V

    iput-object v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->createFullyDrawnExecutor:Lo/NumberDeserializersIntegerDeserializer;

    .line 1046
    new-instance v2, Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesCompatParcelizer;

    invoke-direct {v2, p0}, Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesCompatParcelizer;-><init>(Landroidx/constraintlayout/motion/widget/MotionLayout;)V

    iput-object v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onPrepareFromSearch:Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesCompatParcelizer;

    .line 1050
    iput-boolean v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onFastForward:Z

    .line 1057
    iput-boolean v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->addOnTrimMemoryListener:Z

    .line 1062
    iput-boolean v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->setSessionImpl:Z

    .line 1064
    iput-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->_init_lambda2:Ljava/util/ArrayList;

    .line 1065
    iput-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0:Ljava/util/ArrayList;

    .line 1066
    iput-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onPlayFromSearch:Ljava/util/ArrayList;

    .line 1067
    iput-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->addOnPictureInPictureModeChangedListener:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 1068
    iput v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onSeekTo:I

    const-wide/16 v1, -0x1

    .line 1069
    iput-wide v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onSkipToPrevious:J

    .line 1070
    iput p3, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onSkipToNext:F

    .line 1071
    iput v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->ParcelableVolumeInfo:I

    .line 1072
    iput p3, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->PlaybackStateCompat:F

    .line 1073
    iput-boolean v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onSetPlaybackSpeed:Z

    .line 1080
    iput-boolean v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->AudioAttributesImplApi26Parcelizer:Z

    .line 1088
    new-instance p3, Lo/FromStringDeserializer;

    invoke-direct {p3}, Lo/FromStringDeserializer;-><init>()V

    iput-object p3, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onSkipToQueueItem:Lo/FromStringDeserializer;

    .line 1089
    iput-boolean v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onRewind:Z

    .line 1091
    iput-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw:Ljava/lang/Runnable;

    .line 1092
    iput-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->accessgetReportFullyDrawnExecutorp:[I

    .line 1093
    iput v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->accessensureViewModelStore:I

    .line 1094
    iput-boolean v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onRemoveQueueItemAt:Z

    .line 1095
    iput v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->RatingCompat:I

    .line 1096
    new-instance p3, Ljava/util/HashMap;

    invoke-direct {p3}, Ljava/util/HashMap;-><init>()V

    iput-object p3, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaMetadataCompat:Ljava/util/HashMap;

    .line 1100
    new-instance p3, Landroid/graphics/Rect;

    invoke-direct {p3}, Landroid/graphics/Rect;-><init>()V

    iput-object p3, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->getSavedStateRegistryControllerannotations:Landroid/graphics/Rect;

    .line 1101
    iput-boolean v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onPrepareFromMediaId:Z

    .line 1114
    sget-object p3, Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi21Parcelizer;->IconCompatParcelizer:Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi21Parcelizer;

    iput-object p3, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->getActivityResultRegistry:Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi21Parcelizer;

    .line 2877
    new-instance p3, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;

    invoke-direct {p3, p0}, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;-><init>(Landroidx/constraintlayout/motion/widget/MotionLayout;)V

    iput-object p3, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->r8lambdaKUbBm7ckfqTc9QCgukC86fguu4:Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;

    .line 3786
    iput-boolean v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->PlaybackStateCompatCustomAction:Z

    .line 4005
    new-instance p3, Landroid/graphics/RectF;

    invoke-direct {p3}, Landroid/graphics/RectF;-><init>()V

    iput-object p3, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onPlayFromUri:Landroid/graphics/RectF;

    .line 4006
    iput-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->_init_lambda5:Landroid/view/View;

    .line 4007
    iput-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onSetShuffleMode:Landroid/graphics/Matrix;

    .line 4415
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->addContentView:Ljava/util/ArrayList;

    .line 1129
    invoke-direct {p0, p2}, Landroidx/constraintlayout/motion/widget/MotionLayout;->AudioAttributesCompatParcelizer(Landroid/util/AttributeSet;)V

    return-void
.end method

.method private AudioAttributesCompatParcelizer(F)V
    .registers 6

    .line 2086
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaDescriptionCompat:Lo/PrimitiveArrayDeserializersFloatDeser;

    if-eqz v0, :cond_4a

    .line 2090
    iget v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onCustomAction:F

    iget v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->addOnMultiWindowModeChangedListener:F

    cmpl-float v1, v1, v2

    if-eqz v1, :cond_12

    iget-boolean v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->addOnConfigurationChangedListener:Z

    if-eqz v1, :cond_12

    .line 2093
    iput v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onCustomAction:F

    .line 2096
    :cond_12
    iget v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onCustomAction:F

    cmpl-float v2, v1, p1

    if-nez v2, :cond_19

    goto :goto_4a

    :cond_19
    const/4 v2, 0x0

    .line 2099
    iput-boolean v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->addMenuProvider:Z

    .line 2101
    iput p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->getOnBackPressedDispatcherannotations:F

    .line 2102
    invoke-virtual {v0}, Lo/PrimitiveArrayDeserializersFloatDeser;->write()I

    move-result p1

    int-to-float p1, p1

    const/high16 v0, 0x447a0000    # 1000.0f

    div-float/2addr p1, v0

    iput p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->menuHostHelperlambda0:F

    .line 2103
    iget p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->getOnBackPressedDispatcherannotations:F

    invoke-virtual {p0, p1}, Landroidx/constraintlayout/motion/widget/MotionLayout;->setProgress(F)V

    const/4 p1, 0x0

    .line 2104
    iput-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onSetRepeatMode:Landroid/view/animation/Interpolator;

    .line 2105
    iget-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaDescriptionCompat:Lo/PrimitiveArrayDeserializersFloatDeser;

    invoke-virtual {p1}, Lo/PrimitiveArrayDeserializersFloatDeser;->AudioAttributesImplBaseParcelizer()Landroid/view/animation/Interpolator;

    move-result-object p1

    iput-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->accessaddObserverForBackInvoker:Landroid/view/animation/Interpolator;

    .line 2106
    iput-boolean v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->addOnConfigurationChangedListener:Z

    .line 2107
    invoke-static {}, Landroidx/constraintlayout/motion/widget/MotionLayout;->onPause()J

    move-result-wide v2

    iput-wide v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onMediaButtonEvent:J

    const/4 p1, 0x1

    .line 2108
    iput-boolean p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onRemoveQueueItem:Z

    .line 2109
    iput v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->addOnMultiWindowModeChangedListener:F

    .line 2113
    iput v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onCustomAction:F

    .line 2114
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    :cond_4a
    :goto_4a
    return-void
.end method

.method private AudioAttributesCompatParcelizer(Landroid/util/AttributeSet;)V
    .registers 11

    .line 3829
    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    move-result v0

    sput-boolean v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->RemoteActionCompatParcelizer:Z

    const/4 v0, -0x1

    if-eqz p1, :cond_80

    .line 3831
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget-object v2, Lo/_isBlank$read;->MotionLayout:[I

    .line 3832
    invoke-virtual {v1, p1, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 3833
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->getIndexCount()I

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    move v5, v2

    move v4, v3

    :goto_1b
    if-ge v4, v1, :cond_78

    .line 3837
    invoke-virtual {p1, v4}, Landroid/content/res/TypedArray;->getIndex(I)I

    move-result v6

    .line 3838
    sget v7, Lo/_isBlank$read;->MotionLayout_layoutDescription:I

    if-ne v6, v7, :cond_35

    .line 3839
    invoke-virtual {p1, v6, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v6

    .line 3840
    new-instance v7, Lo/PrimitiveArrayDeserializersFloatDeser;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v8

    invoke-direct {v7, v8, p0, v6}, Lo/PrimitiveArrayDeserializersFloatDeser;-><init>(Landroid/content/Context;Landroidx/constraintlayout/motion/widget/MotionLayout;I)V

    iput-object v7, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaDescriptionCompat:Lo/PrimitiveArrayDeserializersFloatDeser;

    goto :goto_75

    .line 3841
    :cond_35
    sget v7, Lo/_isBlank$read;->MotionLayout_currentState:I

    if-ne v6, v7, :cond_40

    .line 3842
    invoke-virtual {p1, v6, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v6

    iput v6, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->AudioAttributesCompatParcelizer:I

    goto :goto_75

    .line 3843
    :cond_40
    sget v7, Lo/_isBlank$read;->MotionLayout_motionProgress:I

    if-ne v6, v7, :cond_4e

    const/4 v7, 0x0

    .line 3844
    invoke-virtual {p1, v6, v7}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v6

    iput v6, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->getOnBackPressedDispatcherannotations:F

    .line 3845
    iput-boolean v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onRemoveQueueItem:Z

    goto :goto_75

    .line 3846
    :cond_4e
    sget v7, Lo/_isBlank$read;->MotionLayout_applyMotionScene:I

    if-ne v6, v7, :cond_57

    .line 3847
    invoke-virtual {p1, v6, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v5

    goto :goto_75

    .line 3848
    :cond_57
    sget v7, Lo/_isBlank$read;->MotionLayout_showPaths:I

    if-ne v6, v7, :cond_6b

    .line 3849
    iget v7, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->read:I

    if-nez v7, :cond_75

    .line 3850
    invoke-virtual {p1, v6, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v6

    if-eqz v6, :cond_67

    const/4 v6, 0x2

    goto :goto_68

    :cond_67
    move v6, v3

    :goto_68
    iput v6, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->read:I

    goto :goto_75

    .line 3852
    :cond_6b
    sget v7, Lo/_isBlank$read;->MotionLayout_motionDebug:I

    if-ne v6, v7, :cond_75

    .line 3853
    invoke-virtual {p1, v6, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v6

    iput v6, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->read:I

    :cond_75
    :goto_75
    add-int/lit8 v4, v4, 0x1

    goto :goto_1b

    .line 3856
    :cond_78
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    if-nez v5, :cond_80

    const/4 p1, 0x0

    .line 3861
    iput-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaDescriptionCompat:Lo/PrimitiveArrayDeserializersFloatDeser;

    .line 3864
    :cond_80
    iget p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->read:I

    if-eqz p1, :cond_87

    .line 3865
    invoke-direct {p0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->onCustomAction()V

    .line 3867
    :cond_87
    iget p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->AudioAttributesCompatParcelizer:I

    if-ne p1, v0, :cond_a5

    iget-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaDescriptionCompat:Lo/PrimitiveArrayDeserializersFloatDeser;

    if-eqz p1, :cond_a5

    .line 3869
    invoke-virtual {p1}, Lo/PrimitiveArrayDeserializersFloatDeser;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()I

    move-result p1

    iput p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->AudioAttributesCompatParcelizer:I

    .line 3870
    iget-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaDescriptionCompat:Lo/PrimitiveArrayDeserializersFloatDeser;

    invoke-virtual {p1}, Lo/PrimitiveArrayDeserializersFloatDeser;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()I

    move-result p1

    iput p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onPlay:I

    .line 3874
    iget-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaDescriptionCompat:Lo/PrimitiveArrayDeserializersFloatDeser;

    invoke-virtual {p1}, Lo/PrimitiveArrayDeserializersFloatDeser;->AudioAttributesImplApi21Parcelizer()I

    move-result p1

    iput p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onPrepareFromUri:I

    :cond_a5
    return-void
.end method

.method static synthetic AudioAttributesCompatParcelizer(Landroidx/constraintlayout/motion/widget/MotionLayout;)V
    .registers 1

    .line 995
    invoke-direct {p0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->onPlayFromMediaId()V

    return-void
.end method

.method static synthetic AudioAttributesCompatParcelizer(Landroidx/constraintlayout/motion/widget/MotionLayout;IIIIZZ)V
    .registers 7

    .line 995
    invoke-virtual/range {p0 .. p6}, Landroidx/constraintlayout/widget/ConstraintLayout;->IconCompatParcelizer(IIIIZZ)V

    return-void
.end method

.method static synthetic AudioAttributesCompatParcelizer(Landroidx/constraintlayout/motion/widget/MotionLayout;Lo/_long;III)V
    .registers 5

    .line 995
    invoke-virtual {p0, p1, p2, p3, p4}, Landroidx/constraintlayout/widget/ConstraintLayout;->read(Lo/_long;III)V

    return-void
.end method

.method private static AudioAttributesCompatParcelizer(Lo/PrimitiveArrayDeserializersFloatDeser$AudioAttributesCompatParcelizer;)V
    .registers 1

    .line 3976
    invoke-virtual {p0}, Lo/PrimitiveArrayDeserializersFloatDeser$AudioAttributesCompatParcelizer;->read()I

    invoke-virtual {p0}, Lo/PrimitiveArrayDeserializersFloatDeser$AudioAttributesCompatParcelizer;->write()I

    return-void
.end method

.method private AudioAttributesCompatParcelizer(FFLandroid/view/View;Landroid/view/MotionEvent;)Z
    .registers 12

    .line 4048
    instance-of v0, p3, Landroid/view/ViewGroup;

    const/4 v1, 0x1

    if-eqz v0, :cond_36

    .line 4049
    move-object v0, p3

    check-cast v0, Landroid/view/ViewGroup;

    .line 4050
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v2

    sub-int/2addr v2, v1

    :goto_d
    if-ltz v2, :cond_36

    .line 4052
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    .line 4053
    invoke-virtual {v3}, Landroid/view/View;->getLeft()I

    move-result v4

    int-to-float v4, v4

    add-float/2addr v4, p1

    invoke-virtual {p3}, Landroid/view/View;->getScrollX()I

    move-result v5

    int-to-float v5, v5

    sub-float/2addr v4, v5

    invoke-virtual {v3}, Landroid/view/View;->getTop()I

    move-result v5

    int-to-float v5, v5

    add-float/2addr v5, p2

    invoke-virtual {p3}, Landroid/view/View;->getScrollY()I

    move-result v6

    int-to-float v6, v6

    sub-float/2addr v5, v6

    invoke-direct {p0, v4, v5, v3, p4}, Landroidx/constraintlayout/motion/widget/MotionLayout;->AudioAttributesCompatParcelizer(FFLandroid/view/View;Landroid/view/MotionEvent;)Z

    move-result v3

    if-eqz v3, :cond_33

    move v0, v1

    goto :goto_37

    :cond_33
    add-int/lit8 v2, v2, -0x1

    goto :goto_d

    :cond_36
    const/4 v0, 0x0

    :goto_37
    if-nez v0, :cond_75

    .line 4061
    iget-object v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onPlayFromUri:Landroid/graphics/RectF;

    invoke-virtual {p3}, Landroid/view/View;->getRight()I

    move-result v3

    int-to-float v3, v3

    add-float/2addr v3, p1

    invoke-virtual {p3}, Landroid/view/View;->getLeft()I

    move-result v4

    int-to-float v4, v4

    sub-float/2addr v3, v4

    invoke-virtual {p3}, Landroid/view/View;->getBottom()I

    move-result v4

    int-to-float v4, v4

    add-float/2addr v4, p2

    invoke-virtual {p3}, Landroid/view/View;->getTop()I

    move-result v5

    int-to-float v5, v5

    sub-float/2addr v4, v5

    invoke-virtual {v2, p1, p2, v3, v4}, Landroid/graphics/RectF;->set(FFFF)V

    .line 4063
    invoke-virtual {p4}, Landroid/view/MotionEvent;->getAction()I

    move-result v2

    if-nez v2, :cond_6c

    iget-object v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onPlayFromUri:Landroid/graphics/RectF;

    invoke-virtual {p4}, Landroid/view/MotionEvent;->getX()F

    move-result v3

    invoke-virtual {p4}, Landroid/view/MotionEvent;->getY()F

    move-result v4

    invoke-virtual {v2, v3, v4}, Landroid/graphics/RectF;->contains(FF)Z

    move-result v2

    if-eqz v2, :cond_75

    :cond_6c
    neg-float p1, p1

    neg-float p2, p2

    .line 4064
    invoke-direct {p0, p3, p4, p1, p2}, Landroidx/constraintlayout/motion/widget/MotionLayout;->RemoteActionCompatParcelizer(Landroid/view/View;Landroid/view/MotionEvent;FF)Z

    move-result p0

    if-eqz p0, :cond_75

    return v1

    :cond_75
    return v0
.end method

.method static synthetic AudioAttributesImplApi21Parcelizer(Landroidx/constraintlayout/motion/widget/MotionLayout;)Z
    .registers 1

    .line 995
    iget-boolean p0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onRemoveQueueItemAt:Z

    return p0
.end method

.method static synthetic AudioAttributesImplApi26Parcelizer(Landroidx/constraintlayout/motion/widget/MotionLayout;)I
    .registers 1

    .line 995
    iget p0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28:I

    return p0
.end method

.method public static AudioAttributesImplApi26Parcelizer()Landroidx/constraintlayout/motion/widget/MotionLayout$write;
    .registers 1

    .line 1147
    invoke-static {}, Landroidx/constraintlayout/motion/widget/MotionLayout$read;->IconCompatParcelizer()Landroidx/constraintlayout/motion/widget/MotionLayout$read;

    move-result-object v0

    return-object v0
.end method

.method private AudioAttributesImplApi26Parcelizer(I)V
    .registers 3

    const/4 v0, -0x1

    .line 2205
    invoke-direct {p0, p1, v0, v0, v0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->IconCompatParcelizer(IIII)V

    return-void
.end method

.method static synthetic AudioAttributesImplBaseParcelizer(Landroidx/constraintlayout/motion/widget/MotionLayout;)Lo/_long;
    .registers 1

    .line 995
    iget-object p0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->onAddQueueItem:Lo/_long;

    return-object p0
.end method

.method static synthetic IconCompatParcelizer(Landroidx/constraintlayout/motion/widget/MotionLayout;)I
    .registers 1

    .line 995
    iget p0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaSessionCompatQueueItem:I

    return p0
.end method

.method private IconCompatParcelizer(Lo/JdkDeserializers;)Landroid/graphics/Rect;
    .registers 5

    .line 2870
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->getSavedStateRegistryControllerannotations:Landroid/graphics/Rect;

    invoke-virtual {p1}, Lo/JdkDeserializers;->onSetRepeatMode()I

    move-result v1

    iput v1, v0, Landroid/graphics/Rect;->top:I

    .line 2871
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->getSavedStateRegistryControllerannotations:Landroid/graphics/Rect;

    invoke-virtual {p1}, Lo/JdkDeserializers;->onSetRating()I

    move-result v1

    iput v1, v0, Landroid/graphics/Rect;->left:I

    .line 2872
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->getSavedStateRegistryControllerannotations:Landroid/graphics/Rect;

    invoke-virtual {p1}, Lo/JdkDeserializers;->onSetShuffleMode()I

    move-result v1

    iget-object v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->getSavedStateRegistryControllerannotations:Landroid/graphics/Rect;

    iget v2, v2, Landroid/graphics/Rect;->left:I

    add-int/2addr v1, v2

    iput v1, v0, Landroid/graphics/Rect;->right:I

    .line 2873
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->getSavedStateRegistryControllerannotations:Landroid/graphics/Rect;

    invoke-virtual {p1}, Lo/JdkDeserializers;->onAddQueueItem()I

    move-result p1

    iget-object v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->getSavedStateRegistryControllerannotations:Landroid/graphics/Rect;

    iget v1, v1, Landroid/graphics/Rect;->top:I

    add-int/2addr p1, v1

    iput p1, v0, Landroid/graphics/Rect;->bottom:I

    .line 2874
    iget-object p0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->getSavedStateRegistryControllerannotations:Landroid/graphics/Rect;

    return-object p0
.end method

.method private IconCompatParcelizer(IIII)V
    .registers 13

    .line 2295
    iget-object p2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaDescriptionCompat:Lo/PrimitiveArrayDeserializersFloatDeser;

    const/4 p3, -0x1

    if-eqz p2, :cond_18

    iget-object p2, p2, Lo/PrimitiveArrayDeserializersFloatDeser;->read:Lo/_convertIfNonNull;

    if-eqz p2, :cond_18

    .line 2296
    iget-object p2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaDescriptionCompat:Lo/PrimitiveArrayDeserializersFloatDeser;

    iget-object p2, p2, Lo/PrimitiveArrayDeserializersFloatDeser;->read:Lo/_convertIfNonNull;

    iget v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->AudioAttributesCompatParcelizer:I

    const/high16 v1, -0x40800000    # -1.0f

    invoke-virtual {p2, v0, p1, v1, v1}, Lo/_convertIfNonNull;->RemoteActionCompatParcelizer(IIFF)I

    move-result p2

    if-eq p2, p3, :cond_18

    move p1, p2

    .line 2307
    :cond_18
    iget p2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->AudioAttributesCompatParcelizer:I

    if-eq p2, p1, :cond_1bf

    .line 2310
    iget v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onPlay:I

    const/high16 v1, 0x447a0000    # 1000.0f

    const/4 v2, 0x0

    if-ne v0, p1, :cond_2d

    .line 2311
    invoke-direct {p0, v2}, Landroidx/constraintlayout/motion/widget/MotionLayout;->AudioAttributesCompatParcelizer(F)V

    if-lez p4, :cond_1bf

    int-to-float p1, p4

    div-float/2addr p1, v1

    .line 2313
    iput p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->menuHostHelperlambda0:F

    return-void

    .line 2317
    :cond_2d
    iget v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onPrepareFromUri:I

    const/high16 v3, 0x3f800000    # 1.0f

    if-ne v0, p1, :cond_3d

    .line 2318
    invoke-direct {p0, v3}, Landroidx/constraintlayout/motion/widget/MotionLayout;->AudioAttributesCompatParcelizer(F)V

    if-lez p4, :cond_1bf

    int-to-float p1, p4

    div-float/2addr p1, v1

    .line 2320
    iput p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->menuHostHelperlambda0:F

    return-void

    .line 2324
    :cond_3d
    iput p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onPrepareFromUri:I

    if-eq p2, p3, :cond_54

    .line 2333
    invoke-virtual {p0, p2, p1}, Landroidx/constraintlayout/motion/widget/MotionLayout;->setTransition(II)V

    .line 2335
    invoke-direct {p0, v3}, Landroidx/constraintlayout/motion/widget/MotionLayout;->AudioAttributesCompatParcelizer(F)V

    .line 2337
    iput v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onCustomAction:F

    .line 2338
    invoke-virtual {p0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaMetadataCompat()V

    if-lez p4, :cond_1bf

    int-to-float p1, p4

    div-float/2addr p1, v1

    .line 2340
    iput p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->menuHostHelperlambda0:F

    goto/16 :goto_1bf

    :cond_54
    const/4 p2, 0x0

    .line 2350
    iput-boolean p2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->addMenuProvider:Z

    .line 2351
    iput v3, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->getOnBackPressedDispatcherannotations:F

    .line 2352
    iput v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->addOnMultiWindowModeChangedListener:F

    .line 2353
    iput v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onCustomAction:F

    .line 2354
    invoke-static {}, Landroidx/constraintlayout/motion/widget/MotionLayout;->onPause()J

    move-result-wide v4

    iput-wide v4, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->addOnContextAvailableListener:J

    .line 2355
    invoke-static {}, Landroidx/constraintlayout/motion/widget/MotionLayout;->onPause()J

    move-result-wide v4

    iput-wide v4, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onMediaButtonEvent:J

    .line 2356
    iput-boolean p2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->addOnConfigurationChangedListener:Z

    const/4 v0, 0x0

    .line 2357
    iput-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onSetRepeatMode:Landroid/view/animation/Interpolator;

    if-ne p4, p3, :cond_7a

    .line 2359
    iget-object v4, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaDescriptionCompat:Lo/PrimitiveArrayDeserializersFloatDeser;

    invoke-virtual {v4}, Lo/PrimitiveArrayDeserializersFloatDeser;->write()I

    move-result v4

    int-to-float v4, v4

    div-float/2addr v4, v1

    iput v4, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->menuHostHelperlambda0:F

    .line 2361
    :cond_7a
    iput p3, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onPlay:I

    .line 2362
    iget-object v4, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaDescriptionCompat:Lo/PrimitiveArrayDeserializersFloatDeser;

    iget v5, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onPrepareFromUri:I

    invoke-virtual {v4, p3, v5}, Lo/PrimitiveArrayDeserializersFloatDeser;->RemoteActionCompatParcelizer(II)V

    .line 2363
    new-instance p3, Landroid/util/SparseArray;

    invoke-direct {p3}, Landroid/util/SparseArray;-><init>()V

    if-nez p4, :cond_95

    .line 2365
    iget-object p4, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaDescriptionCompat:Lo/PrimitiveArrayDeserializersFloatDeser;

    invoke-virtual {p4}, Lo/PrimitiveArrayDeserializersFloatDeser;->write()I

    move-result p4

    int-to-float p4, p4

    div-float/2addr p4, v1

    iput p4, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->menuHostHelperlambda0:F

    goto :goto_9b

    :cond_95
    if-lez p4, :cond_9b

    int-to-float p4, p4

    div-float/2addr p4, v1

    .line 2367
    iput p4, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->menuHostHelperlambda0:F

    .line 2370
    :cond_9b
    :goto_9b
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result p4

    .line 2372
    iget-object v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaBrowserCompatCustomActionResultReceiver:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/AbstractMap;->clear()V

    move v1, p2

    :goto_a5
    if-ge v1, p4, :cond_c7

    .line 2374
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    .line 2375
    new-instance v5, Lo/handleSingleElementUnwrapped;

    invoke-direct {v5, v4}, Lo/handleSingleElementUnwrapped;-><init>(Landroid/view/View;)V

    .line 2376
    iget-object v6, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaBrowserCompatCustomActionResultReceiver:Ljava/util/HashMap;

    invoke-virtual {v6, v4, v5}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2377
    invoke-virtual {v4}, Landroid/view/View;->getId()I

    move-result v5

    iget-object v6, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaBrowserCompatCustomActionResultReceiver:Ljava/util/HashMap;

    invoke-virtual {v6, v4}, Ljava/util/AbstractMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lo/handleSingleElementUnwrapped;

    invoke-virtual {p3, v5, v4}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_a5

    :cond_c7
    const/4 p3, 0x1

    .line 2379
    iput-boolean p3, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onRemoveQueueItem:Z

    .line 2381
    iget-object v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->r8lambdaKUbBm7ckfqTc9QCgukC86fguu4:Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;

    iget-object v4, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->onAddQueueItem:Lo/_long;

    iget-object v4, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaDescriptionCompat:Lo/PrimitiveArrayDeserializersFloatDeser;

    invoke-virtual {v4, p1}, Lo/PrimitiveArrayDeserializersFloatDeser;->RemoteActionCompatParcelizer(I)Lo/ReferenceTypeDeserializer;

    move-result-object p1

    invoke-virtual {v1, v0, p1}, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->read(Lo/ReferenceTypeDeserializer;Lo/ReferenceTypeDeserializer;)V

    .line 2382
    invoke-direct {p0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->onPlay()V

    .line 2383
    iget-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->r8lambdaKUbBm7ckfqTc9QCgukC86fguu4:Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;

    invoke-virtual {p1}, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->AudioAttributesCompatParcelizer()V

    .line 2384
    invoke-direct {p0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->onAddQueueItem()V

    .line 2385
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result p1

    .line 2386
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v0

    .line 2389
    iget-object v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onPlayFromSearch:Ljava/util/ArrayList;

    if-eqz v1, :cond_13a

    move v1, p2

    :goto_ef
    if-ge v1, p4, :cond_107

    .line 2391
    iget-object v4, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaBrowserCompatCustomActionResultReceiver:Ljava/util/HashMap;

    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/util/AbstractMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lo/handleSingleElementUnwrapped;

    if-eqz v4, :cond_104

    .line 2395
    iget-object v5, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaDescriptionCompat:Lo/PrimitiveArrayDeserializersFloatDeser;

    invoke-virtual {v5, v4}, Lo/PrimitiveArrayDeserializersFloatDeser;->write(Lo/handleSingleElementUnwrapped;)V

    :cond_104
    add-int/lit8 v1, v1, 0x1

    goto :goto_ef

    .line 2398
    :cond_107
    iget-object v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onPlayFromSearch:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_10d
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_11f

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/constraintlayout/motion/widget/MotionHelper;

    .line 2399
    iget-object v5, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaBrowserCompatCustomActionResultReceiver:Ljava/util/HashMap;

    invoke-virtual {v4, p0, v5}, Landroidx/constraintlayout/motion/widget/MotionHelper;->read(Landroidx/constraintlayout/motion/widget/MotionLayout;Ljava/util/HashMap;)V

    goto :goto_10d

    :cond_11f
    move v1, p2

    :goto_120
    if-ge v1, p4, :cond_15a

    .line 2402
    iget-object v4, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaBrowserCompatCustomActionResultReceiver:Ljava/util/HashMap;

    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/util/AbstractMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lo/handleSingleElementUnwrapped;

    if-eqz v4, :cond_137

    .line 2406
    invoke-static {}, Landroidx/constraintlayout/motion/widget/MotionLayout;->onPause()J

    move-result-wide v5

    invoke-virtual {v4, p1, v0, v5, v6}, Lo/handleSingleElementUnwrapped;->RemoteActionCompatParcelizer(IIJ)V

    :cond_137
    add-int/lit8 v1, v1, 0x1

    goto :goto_120

    :cond_13a
    move v1, p2

    :goto_13b
    if-ge v1, p4, :cond_15a

    .line 2410
    iget-object v4, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaBrowserCompatCustomActionResultReceiver:Ljava/util/HashMap;

    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/util/AbstractMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lo/handleSingleElementUnwrapped;

    if-eqz v4, :cond_157

    .line 2414
    iget-object v5, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaDescriptionCompat:Lo/PrimitiveArrayDeserializersFloatDeser;

    invoke-virtual {v5, v4}, Lo/PrimitiveArrayDeserializersFloatDeser;->write(Lo/handleSingleElementUnwrapped;)V

    .line 2415
    invoke-static {}, Landroidx/constraintlayout/motion/widget/MotionLayout;->onPause()J

    move-result-wide v5

    invoke-virtual {v4, p1, v0, v5, v6}, Lo/handleSingleElementUnwrapped;->RemoteActionCompatParcelizer(IIJ)V

    :cond_157
    add-int/lit8 v1, v1, 0x1

    goto :goto_13b

    .line 2419
    :cond_15a
    iget-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaDescriptionCompat:Lo/PrimitiveArrayDeserializersFloatDeser;

    invoke-virtual {p1}, Lo/PrimitiveArrayDeserializersFloatDeser;->onCustomAction()F

    move-result p1

    cmpl-float v0, p1, v2

    if-eqz v0, :cond_1b6

    const v0, 0x7f7fffff    # Float.MAX_VALUE

    const v1, -0x800001

    move v4, p2

    :goto_16b
    if-ge v4, p4, :cond_18d

    .line 2423
    iget-object v5, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaBrowserCompatCustomActionResultReceiver:Ljava/util/HashMap;

    invoke-virtual {p0, v4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/util/AbstractMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lo/handleSingleElementUnwrapped;

    .line 2424
    invoke-virtual {v5}, Lo/handleSingleElementUnwrapped;->IconCompatParcelizer()F

    move-result v6

    .line 2425
    invoke-virtual {v5}, Lo/handleSingleElementUnwrapped;->AudioAttributesImplApi21Parcelizer()F

    move-result v5

    add-float/2addr v5, v6

    .line 2426
    invoke-static {v0, v5}, Ljava/lang/Math;->min(FF)F

    move-result v0

    .line 2427
    invoke-static {v1, v5}, Ljava/lang/Math;->max(FF)F

    move-result v1

    add-int/lit8 v4, v4, 0x1

    goto :goto_16b

    :cond_18d
    :goto_18d
    if-ge p2, p4, :cond_1b6

    .line 2431
    iget-object v4, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaBrowserCompatCustomActionResultReceiver:Ljava/util/HashMap;

    invoke-virtual {p0, p2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/util/AbstractMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lo/handleSingleElementUnwrapped;

    .line 2432
    invoke-virtual {v4}, Lo/handleSingleElementUnwrapped;->IconCompatParcelizer()F

    move-result v5

    .line 2433
    invoke-virtual {v4}, Lo/handleSingleElementUnwrapped;->AudioAttributesImplApi21Parcelizer()F

    move-result v6

    sub-float v7, v3, p1

    div-float v7, v3, v7

    .line 2434
    iput v7, v4, Lo/handleSingleElementUnwrapped;->AudioAttributesCompatParcelizer:F

    add-float/2addr v5, v6

    sub-float/2addr v5, v0

    mul-float/2addr v5, p1

    sub-float v6, v1, v0

    div-float/2addr v5, v6

    sub-float v5, p1, v5

    .line 2435
    iput v5, v4, Lo/handleSingleElementUnwrapped;->write:F

    add-int/lit8 p2, p2, 0x1

    goto :goto_18d

    .line 2439
    :cond_1b6
    iput v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->addOnMultiWindowModeChangedListener:F

    .line 2440
    iput v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onCustomAction:F

    .line 2441
    iput-boolean p3, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onRemoveQueueItem:Z

    .line 2443
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    :cond_1bf
    :goto_1bf
    return-void
.end method

.method static synthetic IconCompatParcelizer(Landroidx/constraintlayout/motion/widget/MotionLayout;Lo/_long;III)V
    .registers 5

    .line 995
    invoke-virtual {p0, p1, p2, p3, p4}, Landroidx/constraintlayout/widget/ConstraintLayout;->read(Lo/_long;III)V

    return-void
.end method

.method static synthetic MediaBrowserCompatCustomActionResultReceiver(Landroidx/constraintlayout/motion/widget/MotionLayout;)I
    .registers 1

    .line 995
    iget p0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->_init_lambda3:I

    return p0
.end method

.method static synthetic MediaBrowserCompatItemReceiver(Landroidx/constraintlayout/motion/widget/MotionLayout;)Lo/_long;
    .registers 1

    .line 995
    iget-object p0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->onAddQueueItem:Lo/_long;

    return-object p0
.end method

.method static synthetic MediaBrowserCompatSearchResultReceiver(Landroidx/constraintlayout/motion/widget/MotionLayout;)Lo/_long;
    .registers 1

    .line 995
    iget-object p0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->onAddQueueItem:Lo/_long;

    return-object p0
.end method

.method private MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()V
    .registers 5

    .line 4387
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->addOnNewIntentListener:Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi26Parcelizer;

    if-nez v0, :cond_e

    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->addOnPictureInPictureModeChangedListener:Ljava/util/concurrent/CopyOnWriteArrayList;

    if-eqz v0, :cond_50

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_50

    .line 4388
    :cond_e
    iget v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->PlaybackStateCompat:F

    iget v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->addOnMultiWindowModeChangedListener:F

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_50

    .line 4389
    iget v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->ParcelableVolumeInfo:I

    const/4 v1, 0x1

    const/4 v2, -0x1

    if-eq v0, v2, :cond_33

    .line 4393
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->addOnPictureInPictureModeChangedListener:Ljava/util/concurrent/CopyOnWriteArrayList;

    if-eqz v0, :cond_31

    .line 4394
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_24
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_31

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi26Parcelizer;

    goto :goto_24

    .line 4398
    :cond_31
    iput-boolean v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onSetPlaybackSpeed:Z

    .line 4400
    :cond_33
    iput v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->ParcelableVolumeInfo:I

    .line 4401
    iget v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->addOnMultiWindowModeChangedListener:F

    iput v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->PlaybackStateCompat:F

    .line 4405
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->addOnPictureInPictureModeChangedListener:Ljava/util/concurrent/CopyOnWriteArrayList;

    if-eqz v0, :cond_4e

    .line 4406
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_41
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4e

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi26Parcelizer;

    goto :goto_41

    .line 4410
    :cond_4e
    iput-boolean v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onSetPlaybackSpeed:Z

    :cond_50
    return-void
.end method

.method static synthetic MediaDescriptionCompat(Landroidx/constraintlayout/motion/widget/MotionLayout;)Z
    .registers 1

    .line 995
    invoke-virtual {p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->handleMediaPlayPauseIfPendingOnHandler()Z

    move-result p0

    return p0
.end method

.method static synthetic MediaMetadataCompat(Landroidx/constraintlayout/motion/widget/MotionLayout;)Lo/_long;
    .registers 1

    .line 995
    iget-object p0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->onAddQueueItem:Lo/_long;

    return-object p0
.end method

.method static synthetic RatingCompat(Landroidx/constraintlayout/motion/widget/MotionLayout;)Z
    .registers 1

    .line 995
    invoke-virtual {p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->handleMediaPlayPauseIfPendingOnHandler()Z

    move-result p0

    return p0
.end method

.method static synthetic RemoteActionCompatParcelizer(Landroidx/constraintlayout/motion/widget/MotionLayout;)Landroidx/constraintlayout/motion/widget/MotionLayout$MediaBrowserCompatCustomActionResultReceiver;
    .registers 1

    .line 995
    iget-object p0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->accessonBackPresseds1027565324:Landroidx/constraintlayout/motion/widget/MotionLayout$MediaBrowserCompatCustomActionResultReceiver;

    return-object p0
.end method

.method static synthetic RemoteActionCompatParcelizer(Landroidx/constraintlayout/motion/widget/MotionLayout;Lo/_long;III)V
    .registers 5

    .line 995
    invoke-virtual {p0, p1, p2, p3, p4}, Landroidx/constraintlayout/widget/ConstraintLayout;->read(Lo/_long;III)V

    return-void
.end method

.method private RemoteActionCompatParcelizer(Landroid/view/View;Landroid/view/MotionEvent;FF)Z
    .registers 7

    .line 4010
    invoke-virtual {p1}, Landroid/view/View;->getMatrix()Landroid/graphics/Matrix;

    move-result-object v0

    .line 4012
    invoke-virtual {v0}, Landroid/graphics/Matrix;->isIdentity()Z

    move-result v1

    if-eqz v1, :cond_17

    .line 4013
    invoke-virtual {p2, p3, p4}, Landroid/view/MotionEvent;->offsetLocation(FF)V

    .line 4014
    invoke-virtual {p1, p2}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p0

    neg-float p1, p3

    neg-float p3, p4

    .line 4015
    invoke-virtual {p2, p1, p3}, Landroid/view/MotionEvent;->offsetLocation(FF)V

    return p0

    .line 4020
    :cond_17
    invoke-static {p2}, Landroid/view/MotionEvent;->obtain(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    move-result-object p2

    .line 4022
    invoke-virtual {p2, p3, p4}, Landroid/view/MotionEvent;->offsetLocation(FF)V

    .line 4024
    iget-object p3, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onSetShuffleMode:Landroid/graphics/Matrix;

    if-nez p3, :cond_29

    .line 4025
    new-instance p3, Landroid/graphics/Matrix;

    invoke-direct {p3}, Landroid/graphics/Matrix;-><init>()V

    iput-object p3, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onSetShuffleMode:Landroid/graphics/Matrix;

    .line 4027
    :cond_29
    iget-object p3, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onSetShuffleMode:Landroid/graphics/Matrix;

    invoke-virtual {v0, p3}, Landroid/graphics/Matrix;->invert(Landroid/graphics/Matrix;)Z

    .line 4028
    iget-object p0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onSetShuffleMode:Landroid/graphics/Matrix;

    invoke-virtual {p2, p0}, Landroid/view/MotionEvent;->transform(Landroid/graphics/Matrix;)V

    .line 4030
    invoke-virtual {p1, p2}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p0

    .line 4032
    invoke-virtual {p2}, Landroid/view/MotionEvent;->recycle()V

    return p0
.end method

.method private onAddQueueItem()V
    .registers 5

    .line 2118
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_5
    if-ge v1, v0, :cond_1b

    .line 2120
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 2121
    iget-object v3, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaBrowserCompatCustomActionResultReceiver:Ljava/util/HashMap;

    invoke-virtual {v3, v2}, Ljava/util/AbstractMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lo/handleSingleElementUnwrapped;

    if-eqz v3, :cond_18

    .line 2125
    invoke-virtual {v3, v2}, Lo/handleSingleElementUnwrapped;->IconCompatParcelizer(Landroid/view/View;)V

    :cond_18
    add-int/lit8 v1, v1, 0x1

    goto :goto_5

    :cond_1b
    return-void
.end method

.method private onCommand()V
    .registers 12

    .line 3533
    iget v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->getOnBackPressedDispatcherannotations:F

    iget v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onCustomAction:F

    sub-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->signum(F)F

    move-result v0

    .line 3534
    invoke-static {}, Landroidx/constraintlayout/motion/widget/MotionLayout;->onPause()J

    move-result-wide v1

    .line 3537
    iget-object v3, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onSetRepeatMode:Landroid/view/animation/Interpolator;

    instance-of v4, v3, Lo/NumberDeserializersIntegerDeserializer;

    const v5, 0x3089705f    # 1.0E-9f

    const/4 v6, 0x0

    if-nez v4, :cond_22

    .line 3538
    iget-wide v7, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->addOnContextAvailableListener:J

    sub-long v7, v1, v7

    long-to-float v4, v7

    mul-float/2addr v4, v0

    mul-float/2addr v4, v5

    iget v7, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->menuHostHelperlambda0:F

    div-float/2addr v4, v7

    goto :goto_23

    :cond_22
    move v4, v6

    .line 3540
    :goto_23
    iget v7, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onCustomAction:F

    add-float/2addr v7, v4

    .line 3543
    iget-boolean v4, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->addOnConfigurationChangedListener:Z

    if-eqz v4, :cond_2c

    .line 3544
    iget v7, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->getOnBackPressedDispatcherannotations:F

    :cond_2c
    cmpl-float v4, v0, v6

    const/4 v8, 0x0

    if-lez v4, :cond_37

    .line 3547
    iget v9, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->getOnBackPressedDispatcherannotations:F

    cmpl-float v9, v7, v9

    if-gez v9, :cond_41

    :cond_37
    cmpg-float v9, v0, v6

    if-gtz v9, :cond_45

    iget v9, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->getOnBackPressedDispatcherannotations:F

    cmpg-float v9, v7, v9

    if-gtz v9, :cond_45

    .line 3549
    :cond_41
    iget v7, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->getOnBackPressedDispatcherannotations:F

    const/4 v9, 0x1

    goto :goto_46

    :cond_45
    move v9, v8

    :goto_46
    if-eqz v3, :cond_5c

    if-nez v9, :cond_5c

    .line 3553
    iget-boolean v9, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->addMenuProvider:Z

    if-eqz v9, :cond_58

    .line 3554
    iget-wide v9, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onMediaButtonEvent:J

    sub-long/2addr v1, v9

    long-to-float v1, v1

    mul-float/2addr v1, v5

    .line 3555
    invoke-interface {v3, v1}, Landroid/view/animation/Interpolator;->getInterpolation(F)F

    move-result v7

    goto :goto_5c

    .line 3557
    :cond_58
    invoke-interface {v3, v7}, Landroid/view/animation/Interpolator;->getInterpolation(F)F

    move-result v7

    :cond_5c
    :goto_5c
    if-lez v4, :cond_64

    .line 3560
    iget v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->getOnBackPressedDispatcherannotations:F

    cmpl-float v1, v7, v1

    if-gez v1, :cond_6e

    :cond_64
    cmpg-float v0, v0, v6

    if-gtz v0, :cond_70

    iget v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->getOnBackPressedDispatcherannotations:F

    cmpg-float v0, v7, v0

    if-gtz v0, :cond_70

    .line 3562
    :cond_6e
    iget v7, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->getOnBackPressedDispatcherannotations:F

    .line 3564
    :cond_70
    iput v7, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->AudioAttributesImplApi21Parcelizer:F

    .line 3565
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    .line 3566
    invoke-static {}, Landroidx/constraintlayout/motion/widget/MotionLayout;->onPause()J

    move-result-wide v9

    .line 3567
    iget-object v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->accessaddObserverForBackInvoker:Landroid/view/animation/Interpolator;

    if-eqz v1, :cond_82

    invoke-interface {v1, v7}, Landroid/view/animation/Interpolator;->getInterpolation(F)F

    move-result v7

    :cond_82
    :goto_82
    if-ge v8, v0, :cond_9c

    .line 3569
    invoke-virtual {p0, v8}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 3570
    iget-object v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaBrowserCompatCustomActionResultReceiver:Ljava/util/HashMap;

    invoke-virtual {v1, v2}, Ljava/util/AbstractMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/handleSingleElementUnwrapped;

    if-eqz v1, :cond_99

    .line 3572
    iget-object v6, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onSkipToQueueItem:Lo/FromStringDeserializer;

    move v3, v7

    move-wide v4, v9

    invoke-virtual/range {v1 .. v6}, Lo/handleSingleElementUnwrapped;->write(Landroid/view/View;FJLo/FromStringDeserializer;)Z

    :cond_99
    add-int/lit8 v8, v8, 0x1

    goto :goto_82

    .line 3575
    :cond_9c
    iget-boolean v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->AudioAttributesImplApi26Parcelizer:Z

    if-eqz v0, :cond_a3

    .line 3576
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    :cond_a3
    return-void
.end method

.method private onCustomAction()V
    .registers 7

    .line 3901
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaDescriptionCompat:Lo/PrimitiveArrayDeserializersFloatDeser;

    if-nez v0, :cond_5

    return-void

    .line 3906
    :cond_5
    invoke-virtual {v0}, Lo/PrimitiveArrayDeserializersFloatDeser;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()I

    move-result v0

    iget-object v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaDescriptionCompat:Lo/PrimitiveArrayDeserializersFloatDeser;

    invoke-virtual {v1}, Lo/PrimitiveArrayDeserializersFloatDeser;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()I

    move-result v2

    invoke-virtual {v1, v2}, Lo/PrimitiveArrayDeserializersFloatDeser;->RemoteActionCompatParcelizer(I)Lo/ReferenceTypeDeserializer;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Landroidx/constraintlayout/motion/widget/MotionLayout;->write(ILo/ReferenceTypeDeserializer;)V

    .line 3907
    new-instance v0, Landroid/util/SparseIntArray;

    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    .line 3908
    new-instance v1, Landroid/util/SparseIntArray;

    invoke-direct {v1}, Landroid/util/SparseIntArray;-><init>()V

    .line 3909
    iget-object v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaDescriptionCompat:Lo/PrimitiveArrayDeserializersFloatDeser;

    invoke-virtual {v2}, Lo/PrimitiveArrayDeserializersFloatDeser;->IconCompatParcelizer()Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2a
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_6a

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lo/PrimitiveArrayDeserializersFloatDeser$AudioAttributesCompatParcelizer;

    .line 3910
    iget-object v4, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaDescriptionCompat:Lo/PrimitiveArrayDeserializersFloatDeser;

    iget-object v4, v4, Lo/PrimitiveArrayDeserializersFloatDeser;->write:Lo/PrimitiveArrayDeserializersFloatDeser$AudioAttributesCompatParcelizer;

    .line 3913
    invoke-static {v3}, Landroidx/constraintlayout/motion/widget/MotionLayout;->AudioAttributesCompatParcelizer(Lo/PrimitiveArrayDeserializersFloatDeser$AudioAttributesCompatParcelizer;)V

    .line 3914
    invoke-virtual {v3}, Lo/PrimitiveArrayDeserializersFloatDeser$AudioAttributesCompatParcelizer;->read()I

    move-result v4

    .line 3915
    invoke-virtual {v3}, Lo/PrimitiveArrayDeserializersFloatDeser$AudioAttributesCompatParcelizer;->write()I

    move-result v3

    .line 3916
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v5

    invoke-static {v5, v4}, Lo/NumberDeserializersShortDeserializer;->IconCompatParcelizer(Landroid/content/Context;I)Ljava/lang/String;

    .line 3917
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v5

    invoke-static {v5, v3}, Lo/NumberDeserializersShortDeserializer;->IconCompatParcelizer(Landroid/content/Context;I)Ljava/lang/String;

    .line 3918
    invoke-virtual {v0, v4}, Landroid/util/SparseIntArray;->get(I)I

    .line 3923
    invoke-virtual {v1, v3}, Landroid/util/SparseIntArray;->get(I)I

    .line 3928
    invoke-virtual {v0, v4, v3}, Landroid/util/SparseIntArray;->put(II)V

    .line 3929
    invoke-virtual {v1, v3, v4}, Landroid/util/SparseIntArray;->put(II)V

    .line 3930
    iget-object v5, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaDescriptionCompat:Lo/PrimitiveArrayDeserializersFloatDeser;

    invoke-virtual {v5, v4}, Lo/PrimitiveArrayDeserializersFloatDeser;->RemoteActionCompatParcelizer(I)Lo/ReferenceTypeDeserializer;

    .line 3934
    iget-object v4, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaDescriptionCompat:Lo/PrimitiveArrayDeserializersFloatDeser;

    invoke-virtual {v4, v3}, Lo/PrimitiveArrayDeserializersFloatDeser;->RemoteActionCompatParcelizer(I)Lo/ReferenceTypeDeserializer;

    goto :goto_2a

    :cond_6a
    return-void
.end method

.method private onFastForward()V
    .registers 6

    .line 4446
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->addOnNewIntentListener:Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi26Parcelizer;

    if-nez v0, :cond_f

    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->addOnPictureInPictureModeChangedListener:Ljava/util/concurrent/CopyOnWriteArrayList;

    if-eqz v0, :cond_e

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_f

    :cond_e
    return-void

    :cond_f
    const/4 v0, 0x0

    .line 4449
    iput-boolean v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onSetPlaybackSpeed:Z

    .line 4450
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->addContentView:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_18
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4b

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    .line 4451
    iget-object v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->addOnNewIntentListener:Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi26Parcelizer;

    if-eqz v2, :cond_2f

    .line 4452
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v3

    invoke-interface {v2, v3}, Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi26Parcelizer;->read(I)V

    .line 4454
    :cond_2f
    iget-object v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->addOnPictureInPictureModeChangedListener:Ljava/util/concurrent/CopyOnWriteArrayList;

    if-eqz v2, :cond_18

    .line 4455
    invoke-virtual {v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_37
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_18

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi26Parcelizer;

    .line 4456
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v4

    invoke-interface {v3, v4}, Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi26Parcelizer;->read(I)V

    goto :goto_37

    .line 4460
    :cond_4b
    iget-object p0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->addContentView:Ljava/util/ArrayList;

    invoke-virtual {p0}, Ljava/util/AbstractCollection;->clear()V

    return-void
.end method

.method private onMediaButtonEvent()V
    .registers 4

    .line 4421
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->addOnNewIntentListener:Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi26Parcelizer;

    if-nez v0, :cond_e

    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->addOnPictureInPictureModeChangedListener:Ljava/util/concurrent/CopyOnWriteArrayList;

    if-eqz v0, :cond_42

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_42

    .line 4422
    :cond_e
    iget v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->ParcelableVolumeInfo:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_42

    .line 4423
    iget v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->AudioAttributesCompatParcelizer:I

    iput v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->ParcelableVolumeInfo:I

    .line 4425
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->addContentView:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_32

    .line 4426
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->addContentView:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    invoke-virtual {v0, v2}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    goto :goto_33

    :cond_32
    move v0, v1

    .line 4428
    :goto_33
    iget v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->AudioAttributesCompatParcelizer:I

    if-eq v0, v2, :cond_42

    if-eq v2, v1, :cond_42

    .line 4429
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->addContentView:Ljava/util/ArrayList;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 4433
    :cond_42
    invoke-direct {p0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->onFastForward()V

    .line 4434
    iget-object p0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw:Ljava/lang/Runnable;

    if-eqz p0, :cond_4c

    .line 4435
    invoke-interface {p0}, Ljava/lang/Runnable;->run()V

    :cond_4c
    return-void
.end method

.method private static onPause()J
    .registers 2

    .line 1138
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    return-wide v0
.end method

.method private onPlay()V
    .registers 2

    .line 4603
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->r8lambdaKUbBm7ckfqTc9QCgukC86fguu4:Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;

    invoke-virtual {v0}, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->read()V

    .line 4604
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method private onPlayFromMediaId()V
    .registers 13

    .line 1765
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    .line 1767
    iget-object v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->r8lambdaKUbBm7ckfqTc9QCgukC86fguu4:Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;

    invoke-virtual {v1}, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->AudioAttributesCompatParcelizer()V

    const/4 v1, 0x1

    .line 1768
    iput-boolean v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onRemoveQueueItem:Z

    .line 1769
    new-instance v2, Landroid/util/SparseArray;

    invoke-direct {v2}, Landroid/util/SparseArray;-><init>()V

    const/4 v3, 0x0

    move v4, v3

    :goto_13
    if-ge v4, v0, :cond_2b

    .line 1771
    invoke-virtual {p0, v4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v5

    .line 1772
    invoke-virtual {v5}, Landroid/view/View;->getId()I

    move-result v6

    iget-object v7, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaBrowserCompatCustomActionResultReceiver:Ljava/util/HashMap;

    invoke-virtual {v7, v5}, Ljava/util/AbstractMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lo/handleSingleElementUnwrapped;

    invoke-virtual {v2, v6, v5}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_13

    .line 1774
    :cond_2b
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v2

    .line 1775
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v4

    .line 1776
    iget-object v5, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaDescriptionCompat:Lo/PrimitiveArrayDeserializersFloatDeser;

    invoke-virtual {v5}, Lo/PrimitiveArrayDeserializersFloatDeser;->RemoteActionCompatParcelizer()I

    move-result v5

    const/4 v6, -0x1

    if-eq v5, v6, :cond_53

    move v7, v3

    :goto_3d
    if-ge v7, v0, :cond_53

    .line 1779
    iget-object v8, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaBrowserCompatCustomActionResultReceiver:Ljava/util/HashMap;

    invoke-virtual {p0, v7}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/util/AbstractMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lo/handleSingleElementUnwrapped;

    if-eqz v8, :cond_50

    .line 1781
    invoke-virtual {v8, v5}, Lo/handleSingleElementUnwrapped;->read(I)V

    :cond_50
    add-int/lit8 v7, v7, 0x1

    goto :goto_3d

    .line 1786
    :cond_53
    new-instance v5, Landroid/util/SparseBooleanArray;

    invoke-direct {v5}, Landroid/util/SparseBooleanArray;-><init>()V

    .line 1787
    iget-object v7, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaBrowserCompatCustomActionResultReceiver:Ljava/util/HashMap;

    invoke-virtual {v7}, Ljava/util/AbstractMap;->size()I

    move-result v7

    new-array v7, v7, [I

    move v8, v3

    move v9, v8

    :goto_62
    if-ge v8, v0, :cond_88

    .line 1790
    invoke-virtual {p0, v8}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v10

    .line 1791
    iget-object v11, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaBrowserCompatCustomActionResultReceiver:Ljava/util/HashMap;

    invoke-virtual {v11, v10}, Ljava/util/AbstractMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lo/handleSingleElementUnwrapped;

    .line 1792
    invoke-virtual {v10}, Lo/handleSingleElementUnwrapped;->AudioAttributesCompatParcelizer()I

    move-result v11

    if-eq v11, v6, :cond_85

    .line 1793
    invoke-virtual {v10}, Lo/handleSingleElementUnwrapped;->AudioAttributesCompatParcelizer()I

    move-result v11

    invoke-virtual {v5, v11, v1}, Landroid/util/SparseBooleanArray;->put(IZ)V

    .line 1794
    invoke-virtual {v10}, Lo/handleSingleElementUnwrapped;->AudioAttributesCompatParcelizer()I

    move-result v10

    aput v10, v7, v9

    add-int/lit8 v9, v9, 0x1

    :cond_85
    add-int/lit8 v8, v8, 0x1

    goto :goto_62

    .line 1797
    :cond_88
    iget-object v6, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onPlayFromSearch:Ljava/util/ArrayList;

    if-eqz v6, :cond_dc

    move v6, v3

    :goto_8d
    if-ge v6, v9, :cond_a7

    .line 1799
    iget-object v8, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaBrowserCompatCustomActionResultReceiver:Ljava/util/HashMap;

    aget v10, v7, v6

    invoke-virtual {p0, v10}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v10

    invoke-virtual {v8, v10}, Ljava/util/AbstractMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lo/handleSingleElementUnwrapped;

    if-eqz v8, :cond_a4

    .line 1803
    iget-object v10, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaDescriptionCompat:Lo/PrimitiveArrayDeserializersFloatDeser;

    invoke-virtual {v10, v8}, Lo/PrimitiveArrayDeserializersFloatDeser;->write(Lo/handleSingleElementUnwrapped;)V

    :cond_a4
    add-int/lit8 v6, v6, 0x1

    goto :goto_8d

    .line 1806
    :cond_a7
    iget-object v6, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onPlayFromSearch:Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_ad
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_bf

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroidx/constraintlayout/motion/widget/MotionHelper;

    .line 1807
    iget-object v10, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaBrowserCompatCustomActionResultReceiver:Ljava/util/HashMap;

    invoke-virtual {v8, p0, v10}, Landroidx/constraintlayout/motion/widget/MotionHelper;->read(Landroidx/constraintlayout/motion/widget/MotionLayout;Ljava/util/HashMap;)V

    goto :goto_ad

    :cond_bf
    move v6, v3

    :goto_c0
    if-ge v6, v9, :cond_fe

    .line 1810
    iget-object v8, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaBrowserCompatCustomActionResultReceiver:Ljava/util/HashMap;

    aget v10, v7, v6

    invoke-virtual {p0, v10}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v10

    invoke-virtual {v8, v10}, Ljava/util/AbstractMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lo/handleSingleElementUnwrapped;

    if-eqz v8, :cond_d9

    .line 1814
    invoke-static {}, Landroidx/constraintlayout/motion/widget/MotionLayout;->onPause()J

    move-result-wide v10

    invoke-virtual {v8, v2, v4, v10, v11}, Lo/handleSingleElementUnwrapped;->RemoteActionCompatParcelizer(IIJ)V

    :cond_d9
    add-int/lit8 v6, v6, 0x1

    goto :goto_c0

    :cond_dc
    move v6, v3

    :goto_dd
    if-ge v6, v9, :cond_fe

    .line 1819
    iget-object v8, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaBrowserCompatCustomActionResultReceiver:Ljava/util/HashMap;

    aget v10, v7, v6

    invoke-virtual {p0, v10}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v10

    invoke-virtual {v8, v10}, Ljava/util/AbstractMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lo/handleSingleElementUnwrapped;

    if-eqz v8, :cond_fb

    .line 1823
    iget-object v10, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaDescriptionCompat:Lo/PrimitiveArrayDeserializersFloatDeser;

    invoke-virtual {v10, v8}, Lo/PrimitiveArrayDeserializersFloatDeser;->write(Lo/handleSingleElementUnwrapped;)V

    .line 1824
    invoke-static {}, Landroidx/constraintlayout/motion/widget/MotionLayout;->onPause()J

    move-result-wide v10

    invoke-virtual {v8, v2, v4, v10, v11}, Lo/handleSingleElementUnwrapped;->RemoteActionCompatParcelizer(IIJ)V

    :cond_fb
    add-int/lit8 v6, v6, 0x1

    goto :goto_dd

    :cond_fe
    move v6, v3

    :goto_ff
    if-ge v6, v0, :cond_128

    .line 1830
    invoke-virtual {p0, v6}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v7

    .line 1831
    iget-object v8, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaBrowserCompatCustomActionResultReceiver:Ljava/util/HashMap;

    invoke-virtual {v8, v7}, Ljava/util/AbstractMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lo/handleSingleElementUnwrapped;

    .line 1832
    invoke-virtual {v7}, Landroid/view/View;->getId()I

    move-result v7

    invoke-virtual {v5, v7}, Landroid/util/SparseBooleanArray;->get(I)Z

    move-result v7

    if-nez v7, :cond_125

    if-eqz v8, :cond_125

    .line 1837
    iget-object v7, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaDescriptionCompat:Lo/PrimitiveArrayDeserializersFloatDeser;

    invoke-virtual {v7, v8}, Lo/PrimitiveArrayDeserializersFloatDeser;->write(Lo/handleSingleElementUnwrapped;)V

    .line 1838
    invoke-static {}, Landroidx/constraintlayout/motion/widget/MotionLayout;->onPause()J

    move-result-wide v9

    invoke-virtual {v8, v2, v4, v9, v10}, Lo/handleSingleElementUnwrapped;->RemoteActionCompatParcelizer(IIJ)V

    :cond_125
    add-int/lit8 v6, v6, 0x1

    goto :goto_ff

    .line 1842
    :cond_128
    iget-object v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaDescriptionCompat:Lo/PrimitiveArrayDeserializersFloatDeser;

    invoke-virtual {v2}, Lo/PrimitiveArrayDeserializersFloatDeser;->onCustomAction()F

    move-result v2

    const/4 v4, 0x0

    cmpl-float v4, v2, v4

    if-eqz v4, :cond_206

    float-to-double v4, v2

    const-wide/16 v6, 0x0

    cmpg-double v4, v4, v6

    if-gez v4, :cond_13b

    goto :goto_13c

    :cond_13b
    move v1, v3

    .line 1846
    :goto_13c
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    move-result v2

    const v4, 0x7f7fffff    # Float.MAX_VALUE

    const v5, -0x800001

    move v6, v3

    move v8, v4

    move v7, v5

    :goto_149
    const/high16 v9, 0x3f800000    # 1.0f

    if-ge v6, v0, :cond_1d9

    .line 1849
    iget-object v10, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaBrowserCompatCustomActionResultReceiver:Ljava/util/HashMap;

    invoke-virtual {p0, v6}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v11

    invoke-virtual {v10, v11}, Ljava/util/AbstractMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lo/handleSingleElementUnwrapped;

    .line 1850
    iget v11, v10, Lo/handleSingleElementUnwrapped;->read:F

    invoke-static {v11}, Ljava/lang/Float;->isNaN(F)Z

    move-result v11

    if-nez v11, :cond_1c0

    move v6, v3

    :goto_162
    if-ge v6, v0, :cond_187

    .line 1865
    iget-object v7, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaBrowserCompatCustomActionResultReceiver:Ljava/util/HashMap;

    invoke-virtual {p0, v6}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/util/AbstractMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lo/handleSingleElementUnwrapped;

    .line 1866
    iget v8, v7, Lo/handleSingleElementUnwrapped;->read:F

    invoke-static {v8}, Ljava/lang/Float;->isNaN(F)Z

    move-result v8

    if-nez v8, :cond_184

    .line 1867
    iget v8, v7, Lo/handleSingleElementUnwrapped;->read:F

    invoke-static {v4, v8}, Ljava/lang/Math;->min(FF)F

    move-result v4

    .line 1868
    iget v7, v7, Lo/handleSingleElementUnwrapped;->read:F

    invoke-static {v5, v7}, Ljava/lang/Math;->max(FF)F

    move-result v5

    :cond_184
    add-int/lit8 v6, v6, 0x1

    goto :goto_162

    :cond_187
    :goto_187
    if-ge v3, v0, :cond_206

    .line 1872
    iget-object v6, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaBrowserCompatCustomActionResultReceiver:Ljava/util/HashMap;

    invoke-virtual {p0, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/util/AbstractMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lo/handleSingleElementUnwrapped;

    .line 1873
    iget v7, v6, Lo/handleSingleElementUnwrapped;->read:F

    invoke-static {v7}, Ljava/lang/Float;->isNaN(F)Z

    move-result v7

    if-nez v7, :cond_1bd

    sub-float v7, v9, v2

    div-float v7, v9, v7

    .line 1875
    iput v7, v6, Lo/handleSingleElementUnwrapped;->AudioAttributesCompatParcelizer:F

    if-eqz v1, :cond_1b2

    .line 1877
    iget v7, v6, Lo/handleSingleElementUnwrapped;->read:F

    sub-float v7, v5, v7

    sub-float v8, v5, v4

    div-float/2addr v7, v8

    mul-float/2addr v7, v2

    sub-float v7, v2, v7

    iput v7, v6, Lo/handleSingleElementUnwrapped;->write:F

    goto :goto_1bd

    .line 1879
    :cond_1b2
    iget v7, v6, Lo/handleSingleElementUnwrapped;->read:F

    sub-float/2addr v7, v4

    mul-float/2addr v7, v2

    sub-float v8, v5, v4

    div-float/2addr v7, v8

    sub-float v7, v2, v7

    iput v7, v6, Lo/handleSingleElementUnwrapped;->write:F

    :cond_1bd
    :goto_1bd
    add-int/lit8 v3, v3, 0x1

    goto :goto_187

    .line 1854
    :cond_1c0
    invoke-virtual {v10}, Lo/handleSingleElementUnwrapped;->IconCompatParcelizer()F

    move-result v9

    .line 1855
    invoke-virtual {v10}, Lo/handleSingleElementUnwrapped;->AudioAttributesImplApi21Parcelizer()F

    move-result v10

    if-eqz v1, :cond_1cc

    sub-float/2addr v10, v9

    goto :goto_1cd

    :cond_1cc
    add-float/2addr v10, v9

    .line 1857
    :goto_1cd
    invoke-static {v8, v10}, Ljava/lang/Math;->min(FF)F

    move-result v8

    .line 1858
    invoke-static {v7, v10}, Ljava/lang/Math;->max(FF)F

    move-result v7

    add-int/lit8 v6, v6, 0x1

    goto/16 :goto_149

    :cond_1d9
    :goto_1d9
    if-ge v3, v0, :cond_206

    .line 1885
    iget-object v4, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaBrowserCompatCustomActionResultReceiver:Ljava/util/HashMap;

    invoke-virtual {p0, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/util/AbstractMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lo/handleSingleElementUnwrapped;

    .line 1886
    invoke-virtual {v4}, Lo/handleSingleElementUnwrapped;->IconCompatParcelizer()F

    move-result v5

    .line 1887
    invoke-virtual {v4}, Lo/handleSingleElementUnwrapped;->AudioAttributesImplApi21Parcelizer()F

    move-result v6

    if-eqz v1, :cond_1f3

    sub-float/2addr v6, v5

    goto :goto_1f4

    :cond_1f3
    add-float/2addr v6, v5

    :goto_1f4
    sub-float v5, v9, v2

    div-float v5, v9, v5

    .line 1889
    iput v5, v4, Lo/handleSingleElementUnwrapped;->AudioAttributesCompatParcelizer:F

    sub-float/2addr v6, v8

    mul-float/2addr v6, v2

    sub-float v5, v7, v8

    div-float/2addr v6, v5

    sub-float v5, v2, v6

    .line 1890
    iput v5, v4, Lo/handleSingleElementUnwrapped;->write:F

    add-int/lit8 v3, v3, 0x1

    goto :goto_1d9

    :cond_206
    return-void
.end method

.method private onPrepareFromMediaId()V
    .registers 5

    .line 4671
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->r8lambdaKUbBm7ckfqTc9QCgukC86fguu4:Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;

    iget-object v1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->onAddQueueItem:Lo/_long;

    iget-object v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaDescriptionCompat:Lo/PrimitiveArrayDeserializersFloatDeser;

    iget v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onPlay:I

    invoke-virtual {v1, v2}, Lo/PrimitiveArrayDeserializersFloatDeser;->RemoteActionCompatParcelizer(I)Lo/ReferenceTypeDeserializer;

    move-result-object v1

    iget-object v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaDescriptionCompat:Lo/PrimitiveArrayDeserializersFloatDeser;

    iget v3, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onPrepareFromUri:I

    invoke-virtual {v2, v3}, Lo/PrimitiveArrayDeserializersFloatDeser;->RemoteActionCompatParcelizer(I)Lo/ReferenceTypeDeserializer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->read(Lo/ReferenceTypeDeserializer;Lo/ReferenceTypeDeserializer;)V

    .line 4672
    invoke-direct {p0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->onPlay()V

    return-void
.end method

.method static synthetic read(Landroidx/constraintlayout/motion/widget/MotionLayout;)I
    .registers 1

    .line 995
    iget p0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onPrepareFromUri:I

    return p0
.end method

.method static synthetic read(Landroidx/constraintlayout/motion/widget/MotionLayout;Landroid/view/View;Lo/JdkDeserializers;Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;Landroid/util/SparseArray;)V
    .registers 11

    const/4 v1, 0x0

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    .line 995
    invoke-virtual/range {v0 .. v5}, Landroidx/constraintlayout/widget/ConstraintLayout;->RemoteActionCompatParcelizer(ZLandroid/view/View;Lo/JdkDeserializers;Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;Landroid/util/SparseArray;)V

    return-void
.end method

.method static synthetic read(Landroidx/constraintlayout/motion/widget/MotionLayout;Lo/_long;III)V
    .registers 5

    .line 995
    invoke-virtual {p0, p1, p2, p3, p4}, Landroidx/constraintlayout/widget/ConstraintLayout;->read(Lo/_long;III)V

    return-void
.end method

.method static synthetic write(Landroidx/constraintlayout/motion/widget/MotionLayout;)I
    .registers 1

    .line 995
    iget p0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onStop:I

    return p0
.end method

.method static synthetic write(Landroidx/constraintlayout/motion/widget/MotionLayout;Lo/JdkDeserializers;)Landroid/graphics/Rect;
    .registers 2

    .line 995
    invoke-direct {p0, p1}, Landroidx/constraintlayout/motion/widget/MotionLayout;->IconCompatParcelizer(Lo/JdkDeserializers;)Landroid/graphics/Rect;

    move-result-object p0

    return-object p0
.end method

.method private write(ILo/ReferenceTypeDeserializer;)V
    .registers 8

    .line 3941
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Lo/NumberDeserializersShortDeserializer;->IconCompatParcelizer(Landroid/content/Context;I)Ljava/lang/String;

    .line 3942
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result p1

    const/4 v0, 0x0

    move v1, v0

    :goto_d
    if-ge v1, p1, :cond_2d

    .line 3944
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 3945
    invoke-virtual {v2}, Landroid/view/View;->getId()I

    move-result v3

    const/4 v4, -0x1

    if-ne v3, v4, :cond_21

    .line 3948
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 3950
    :cond_21
    invoke-virtual {p2, v3}, Lo/ReferenceTypeDeserializer;->RemoteActionCompatParcelizer(I)Lo/ReferenceTypeDeserializer$write;

    move-result-object v3

    if-nez v3, :cond_2a

    .line 3952
    invoke-static {v2}, Lo/NumberDeserializersShortDeserializer;->write(Landroid/view/View;)Ljava/lang/String;

    :cond_2a
    add-int/lit8 v1, v1, 0x1

    goto :goto_d

    .line 3955
    :cond_2d
    invoke-virtual {p2}, Lo/ReferenceTypeDeserializer;->AudioAttributesCompatParcelizer()[I

    move-result-object p1

    .line 3956
    :goto_31
    array-length v1, p1

    if-ge v0, v1, :cond_4b

    .line 3957
    aget v1, p1, v0

    .line 3958
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2, v1}, Lo/NumberDeserializersShortDeserializer;->IconCompatParcelizer(Landroid/content/Context;I)Ljava/lang/String;

    .line 3959
    aget v2, p1, v0

    invoke-virtual {p0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 3962
    invoke-virtual {p2, v1}, Lo/ReferenceTypeDeserializer;->AudioAttributesCompatParcelizer(I)I

    .line 3965
    invoke-virtual {p2, v1}, Lo/ReferenceTypeDeserializer;->MediaBrowserCompatCustomActionResultReceiver(I)I

    add-int/lit8 v0, v0, 0x1

    goto :goto_31

    :cond_4b
    return-void
.end method

.method static synthetic write(Landroidx/constraintlayout/motion/widget/MotionLayout;Lo/_long;III)V
    .registers 5

    .line 995
    invoke-virtual {p0, p1, p2, p3, p4}, Landroidx/constraintlayout/widget/ConstraintLayout;->read(Lo/_long;III)V

    return-void
.end method

.method private static write(FFF)Z
    .registers 8

    const/4 v0, 0x0

    cmpl-float v1, p0, v0

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/high16 v4, 0x40000000    # 2.0f

    if-lez v1, :cond_19

    div-float v0, p0, p2

    mul-float/2addr p0, v0

    mul-float/2addr p2, v0

    mul-float/2addr p2, v0

    div-float/2addr p2, v4

    sub-float/2addr p0, p2

    add-float/2addr p1, p0

    const/high16 p0, 0x3f800000    # 1.0f

    cmpl-float p0, p1, p0

    if-lez p0, :cond_18

    return v2

    :cond_18
    return v3

    :cond_19
    neg-float v1, p0

    div-float/2addr v1, p2

    mul-float/2addr p0, v1

    mul-float/2addr p2, v1

    mul-float/2addr p2, v1

    div-float/2addr p2, v4

    add-float/2addr p0, p2

    add-float/2addr p1, p0

    cmpg-float p0, p1, v0

    if-gez p0, :cond_26

    return v2

    :cond_26
    return v3
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer()F
    .registers 1

    .line 4230
    iget p0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onCustomAction:F

    return p0
.end method

.method public final AudioAttributesCompatParcelizer(I)Lo/handleSingleElementUnwrapped;
    .registers 3

    .line 1104
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaBrowserCompatCustomActionResultReceiver:Ljava/util/HashMap;

    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/util/AbstractMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lo/handleSingleElementUnwrapped;

    return-object p0
.end method

.method public AudioAttributesCompatParcelizer(Landroid/view/View;IIIII)V
    .registers 7

    return-void
.end method

.method public final AudioAttributesImplApi21Parcelizer()Z
    .registers 1

    .line 4797
    iget-boolean p0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onSetRating:Z

    return p0
.end method

.method public final AudioAttributesImplBaseParcelizer()F
    .registers 1

    .line 2452
    iget p0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->AudioAttributesImplBaseParcelizer:F

    return p0
.end method

.method public final IconCompatParcelizer()I
    .registers 1

    .line 4703
    iget p0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onPrepareFromUri:I

    return p0
.end method

.method public final IconCompatParcelizer(I)V
    .registers 3

    .line 2167
    invoke-virtual {p0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->isAttachedToWindow()Z

    move-result v0

    if-nez v0, :cond_17

    .line 2168
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->accessonBackPresseds1027565324:Landroidx/constraintlayout/motion/widget/MotionLayout$MediaBrowserCompatCustomActionResultReceiver;

    if-nez v0, :cond_11

    .line 2169
    new-instance v0, Landroidx/constraintlayout/motion/widget/MotionLayout$MediaBrowserCompatCustomActionResultReceiver;

    invoke-direct {v0, p0}, Landroidx/constraintlayout/motion/widget/MotionLayout$MediaBrowserCompatCustomActionResultReceiver;-><init>(Landroidx/constraintlayout/motion/widget/MotionLayout;)V

    iput-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->accessonBackPresseds1027565324:Landroidx/constraintlayout/motion/widget/MotionLayout$MediaBrowserCompatCustomActionResultReceiver;

    .line 2171
    :cond_11
    iget-object p0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->accessonBackPresseds1027565324:Landroidx/constraintlayout/motion/widget/MotionLayout$MediaBrowserCompatCustomActionResultReceiver;

    invoke-virtual {p0, p1}, Landroidx/constraintlayout/motion/widget/MotionLayout$MediaBrowserCompatCustomActionResultReceiver;->read(I)V

    return-void

    .line 2174
    :cond_17
    invoke-direct {p0, p1}, Landroidx/constraintlayout/motion/widget/MotionLayout;->AudioAttributesImplApi26Parcelizer(I)V

    return-void
.end method

.method public final IconCompatParcelizer(IFF)V
    .registers 15

    .line 1915
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaDescriptionCompat:Lo/PrimitiveArrayDeserializersFloatDeser;

    if-eqz v0, :cond_f0

    .line 1918
    iget v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onCustomAction:F

    cmpl-float v0, v0, p2

    if-nez v0, :cond_c

    goto/16 :goto_f0

    :cond_c
    const/4 v0, 0x1

    .line 1922
    iput-boolean v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->addMenuProvider:Z

    .line 1923
    invoke-static {}, Landroidx/constraintlayout/motion/widget/MotionLayout;->onPause()J

    move-result-wide v1

    iput-wide v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onMediaButtonEvent:J

    .line 1924
    iget-object v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaDescriptionCompat:Lo/PrimitiveArrayDeserializersFloatDeser;

    invoke-virtual {v1}, Lo/PrimitiveArrayDeserializersFloatDeser;->write()I

    move-result v1

    int-to-float v1, v1

    const/high16 v2, 0x447a0000    # 1000.0f

    div-float/2addr v1, v2

    iput v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->menuHostHelperlambda0:F

    .line 1926
    iput p2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->getOnBackPressedDispatcherannotations:F

    .line 1927
    iput-boolean v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onRemoveQueueItem:Z

    const/4 v1, 0x6

    const/4 v2, 0x7

    const/4 v3, 0x0

    const/4 v4, 0x2

    if-eqz p1, :cond_87

    if-eq p1, v0, :cond_87

    if-eq p1, v4, :cond_87

    const/4 v5, 0x4

    if-eq p1, v5, :cond_75

    const/4 v5, 0x5

    if-eq p1, v5, :cond_3a

    if-eq p1, v1, :cond_87

    if-ne p1, v2, :cond_e4

    goto :goto_87

    .line 1966
    :cond_3a
    iget p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onCustomAction:F

    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaDescriptionCompat:Lo/PrimitiveArrayDeserializersFloatDeser;

    invoke-virtual {v0}, Lo/PrimitiveArrayDeserializersFloatDeser;->AudioAttributesImplApi26Parcelizer()F

    move-result v0

    invoke-static {p3, p1, v0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->write(FFF)Z

    move-result p1

    if-eqz p1, :cond_5b

    .line 1967
    iget-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onPrepareFromSearch:Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesCompatParcelizer;

    iget p2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onCustomAction:F

    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaDescriptionCompat:Lo/PrimitiveArrayDeserializersFloatDeser;

    invoke-virtual {v0}, Lo/PrimitiveArrayDeserializersFloatDeser;->AudioAttributesImplApi26Parcelizer()F

    move-result v0

    invoke-virtual {p1, p3, p2, v0}, Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesCompatParcelizer;->RemoteActionCompatParcelizer(FFF)V

    .line 1968
    iget-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onPrepareFromSearch:Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesCompatParcelizer;

    iput-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onSetRepeatMode:Landroid/view/animation/Interpolator;

    goto/16 :goto_e4

    .line 1970
    :cond_5b
    iget-object v4, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->createFullyDrawnExecutor:Lo/NumberDeserializersIntegerDeserializer;

    iget v5, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onCustomAction:F

    iget v8, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->menuHostHelperlambda0:F

    iget-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaDescriptionCompat:Lo/PrimitiveArrayDeserializersFloatDeser;

    .line 1971
    invoke-virtual {p1}, Lo/PrimitiveArrayDeserializersFloatDeser;->AudioAttributesImplApi26Parcelizer()F

    move-result v9

    iget-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaDescriptionCompat:Lo/PrimitiveArrayDeserializersFloatDeser;

    invoke-virtual {p1}, Lo/PrimitiveArrayDeserializersFloatDeser;->MediaBrowserCompatCustomActionResultReceiver()F

    move-result v10

    move v6, p2

    move v7, p3

    .line 1970
    invoke-virtual/range {v4 .. v10}, Lo/NumberDeserializersIntegerDeserializer;->RemoteActionCompatParcelizer(FFFFFF)V

    .line 1972
    iput v3, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->AudioAttributesImplBaseParcelizer:F

    goto :goto_da

    .line 1961
    :cond_75
    iget-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onPrepareFromSearch:Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesCompatParcelizer;

    iget p2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onCustomAction:F

    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaDescriptionCompat:Lo/PrimitiveArrayDeserializersFloatDeser;

    invoke-virtual {v0}, Lo/PrimitiveArrayDeserializersFloatDeser;->AudioAttributesImplApi26Parcelizer()F

    move-result v0

    invoke-virtual {p1, p3, p2, v0}, Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesCompatParcelizer;->RemoteActionCompatParcelizer(FFF)V

    .line 1962
    iget-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onPrepareFromSearch:Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesCompatParcelizer;

    iput-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onSetRepeatMode:Landroid/view/animation/Interpolator;

    goto :goto_e4

    :cond_87
    :goto_87
    if-eq p1, v0, :cond_92

    if-eq p1, v2, :cond_92

    if-eq p1, v4, :cond_8f

    if-ne p1, v1, :cond_93

    :cond_8f
    const/high16 p2, 0x3f800000    # 1.0f

    goto :goto_93

    :cond_92
    move p2, v3

    .line 1941
    :cond_93
    :goto_93
    iget-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaDescriptionCompat:Lo/PrimitiveArrayDeserializersFloatDeser;

    invoke-virtual {p1}, Lo/PrimitiveArrayDeserializersFloatDeser;->AudioAttributesCompatParcelizer()I

    move-result p1

    if-nez p1, :cond_b3

    .line 1942
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->createFullyDrawnExecutor:Lo/NumberDeserializersIntegerDeserializer;

    iget v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onCustomAction:F

    iget v4, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->menuHostHelperlambda0:F

    iget-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaDescriptionCompat:Lo/PrimitiveArrayDeserializersFloatDeser;

    .line 1943
    invoke-virtual {p1}, Lo/PrimitiveArrayDeserializersFloatDeser;->AudioAttributesImplApi26Parcelizer()F

    move-result v5

    iget-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaDescriptionCompat:Lo/PrimitiveArrayDeserializersFloatDeser;

    invoke-virtual {p1}, Lo/PrimitiveArrayDeserializersFloatDeser;->MediaBrowserCompatCustomActionResultReceiver()F

    move-result v6

    move v2, p2

    move v3, p3

    .line 1942
    invoke-virtual/range {v0 .. v6}, Lo/NumberDeserializersIntegerDeserializer;->RemoteActionCompatParcelizer(FFFFFF)V

    goto :goto_da

    .line 1945
    :cond_b3
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->createFullyDrawnExecutor:Lo/NumberDeserializersIntegerDeserializer;

    iget v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onCustomAction:F

    iget-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaDescriptionCompat:Lo/PrimitiveArrayDeserializersFloatDeser;

    .line 1946
    invoke-virtual {p1}, Lo/PrimitiveArrayDeserializersFloatDeser;->MediaDescriptionCompat()F

    move-result v4

    iget-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaDescriptionCompat:Lo/PrimitiveArrayDeserializersFloatDeser;

    invoke-virtual {p1}, Lo/PrimitiveArrayDeserializersFloatDeser;->MediaBrowserCompatMediaItem()F

    move-result v5

    iget-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaDescriptionCompat:Lo/PrimitiveArrayDeserializersFloatDeser;

    invoke-virtual {p1}, Lo/PrimitiveArrayDeserializersFloatDeser;->MediaBrowserCompatSearchResultReceiver()F

    move-result v6

    iget-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaDescriptionCompat:Lo/PrimitiveArrayDeserializersFloatDeser;

    .line 1947
    invoke-virtual {p1}, Lo/PrimitiveArrayDeserializersFloatDeser;->MediaMetadataCompat()F

    move-result v7

    iget-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaDescriptionCompat:Lo/PrimitiveArrayDeserializersFloatDeser;

    invoke-virtual {p1}, Lo/PrimitiveArrayDeserializersFloatDeser;->RatingCompat()I

    move-result v8

    move v2, p2

    move v3, p3

    .line 1945
    invoke-virtual/range {v0 .. v8}, Lo/NumberDeserializersIntegerDeserializer;->IconCompatParcelizer(FFFFFFFI)V

    .line 1950
    :goto_da
    iget p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->AudioAttributesCompatParcelizer:I

    .line 1951
    iput p2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->getOnBackPressedDispatcherannotations:F

    .line 1952
    iput p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->AudioAttributesCompatParcelizer:I

    .line 1953
    iget-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->createFullyDrawnExecutor:Lo/NumberDeserializersIntegerDeserializer;

    iput-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onSetRepeatMode:Landroid/view/animation/Interpolator;

    :cond_e4
    :goto_e4
    const/4 p1, 0x0

    .line 1982
    iput-boolean p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->addOnConfigurationChangedListener:Z

    .line 1983
    invoke-static {}, Landroidx/constraintlayout/motion/widget/MotionLayout;->onPause()J

    move-result-wide p1

    iput-wide p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onMediaButtonEvent:J

    .line 1984
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    :cond_f0
    :goto_f0
    return-void
.end method

.method public final IconCompatParcelizer(II)V
    .registers 4

    .line 2186
    invoke-virtual {p0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->isAttachedToWindow()Z

    move-result v0

    if-nez v0, :cond_17

    .line 2187
    iget-object p2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->accessonBackPresseds1027565324:Landroidx/constraintlayout/motion/widget/MotionLayout$MediaBrowserCompatCustomActionResultReceiver;

    if-nez p2, :cond_11

    .line 2188
    new-instance p2, Landroidx/constraintlayout/motion/widget/MotionLayout$MediaBrowserCompatCustomActionResultReceiver;

    invoke-direct {p2, p0}, Landroidx/constraintlayout/motion/widget/MotionLayout$MediaBrowserCompatCustomActionResultReceiver;-><init>(Landroidx/constraintlayout/motion/widget/MotionLayout;)V

    iput-object p2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->accessonBackPresseds1027565324:Landroidx/constraintlayout/motion/widget/MotionLayout$MediaBrowserCompatCustomActionResultReceiver;

    .line 2190
    :cond_11
    iget-object p0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->accessonBackPresseds1027565324:Landroidx/constraintlayout/motion/widget/MotionLayout$MediaBrowserCompatCustomActionResultReceiver;

    invoke-virtual {p0, p1}, Landroidx/constraintlayout/motion/widget/MotionLayout$MediaBrowserCompatCustomActionResultReceiver;->read(I)V

    return-void

    :cond_17
    const/4 v0, -0x1

    .line 2193
    invoke-direct {p0, p1, v0, v0, p2}, Landroidx/constraintlayout/motion/widget/MotionLayout;->IconCompatParcelizer(IIII)V

    return-void
.end method

.method public final IconCompatParcelizer(ILo/ReferenceTypeDeserializer;)V
    .registers 4

    .line 4614
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaDescriptionCompat:Lo/PrimitiveArrayDeserializersFloatDeser;

    if-eqz v0, :cond_7

    .line 4615
    invoke-virtual {v0, p1, p2}, Lo/PrimitiveArrayDeserializersFloatDeser;->read(ILo/ReferenceTypeDeserializer;)V

    .line 4617
    :cond_7
    invoke-direct {p0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->onPrepareFromMediaId()V

    .line 4618
    iget v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->AudioAttributesCompatParcelizer:I

    if-ne v0, p1, :cond_11

    .line 4619
    invoke-virtual {p2, p0}, Lo/ReferenceTypeDeserializer;->write(Landroidx/constraintlayout/widget/ConstraintLayout;)V

    :cond_11
    return-void
.end method

.method public final varargs IconCompatParcelizer(I[Landroid/view/View;)V
    .registers 3

    .line 4819
    iget-object p0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaDescriptionCompat:Lo/PrimitiveArrayDeserializersFloatDeser;

    if-eqz p0, :cond_7

    .line 4820
    invoke-virtual {p0, p1, p2}, Lo/PrimitiveArrayDeserializersFloatDeser;->read(I[Landroid/view/View;)V

    :cond_7
    return-void
.end method

.method public final IconCompatParcelizer(Landroid/view/View;FF[FI)V
    .registers 14

    .line 2465
    iget v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->AudioAttributesImplBaseParcelizer:F

    .line 2466
    iget v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onCustomAction:F

    .line 2467
    iget-object v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onSetRepeatMode:Landroid/view/animation/Interpolator;

    if-eqz v2, :cond_2a

    .line 2469
    iget v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->getOnBackPressedDispatcherannotations:F

    sub-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->signum(F)F

    move-result v0

    .line 2470
    iget-object v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onSetRepeatMode:Landroid/view/animation/Interpolator;

    iget v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onCustomAction:F

    const v3, 0x3727c5ac    # 1.0E-5f

    add-float/2addr v2, v3

    invoke-interface {v1, v2}, Landroid/view/animation/Interpolator;->getInterpolation(F)F

    move-result v1

    .line 2471
    iget-object v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onSetRepeatMode:Landroid/view/animation/Interpolator;

    iget v4, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onCustomAction:F

    invoke-interface {v2, v4}, Landroid/view/animation/Interpolator;->getInterpolation(F)F

    move-result v2

    sub-float/2addr v1, v2

    div-float/2addr v1, v3

    mul-float/2addr v0, v1

    .line 2474
    iget v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->menuHostHelperlambda0:F

    div-float/2addr v0, v1

    goto :goto_2b

    :cond_2a
    move v2, v1

    .line 2477
    :goto_2b
    iget-object v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onSetRepeatMode:Landroid/view/animation/Interpolator;

    instance-of v3, v1, Lo/PrimitiveArrayDeserializersBooleanDeser;

    if-eqz v3, :cond_37

    .line 2478
    check-cast v1, Lo/PrimitiveArrayDeserializersBooleanDeser;

    invoke-virtual {v1}, Lo/PrimitiveArrayDeserializersBooleanDeser;->AudioAttributesCompatParcelizer()F

    move-result v0

    .line 2482
    :cond_37
    iget-object p0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaBrowserCompatCustomActionResultReceiver:Ljava/util/HashMap;

    invoke-virtual {p0, p1}, Ljava/util/AbstractMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    move-object v1, p0

    check-cast v1, Lo/handleSingleElementUnwrapped;

    and-int/lit8 p0, p5, 0x1

    if-nez p0, :cond_53

    .line 2485
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v3

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v4

    move v5, p2

    move v6, p3

    move-object v7, p4

    .line 2484
    invoke-virtual/range {v1 .. v7}, Lo/handleSingleElementUnwrapped;->read(FIIFF[F)V

    goto :goto_56

    .line 2488
    :cond_53
    invoke-virtual {v1, v2, p2, p3, p4}, Lo/handleSingleElementUnwrapped;->write(FFF[F)V

    :goto_56
    const/4 p0, 0x2

    if-ge p5, p0, :cond_65

    const/4 p0, 0x0

    .line 2491
    aget p1, p4, p0

    mul-float/2addr p1, v0

    aput p1, p4, p0

    const/4 p0, 0x1

    .line 2492
    aget p1, p4, p0

    mul-float/2addr p1, v0

    aput p1, p4, p0

    :cond_65
    return-void
.end method

.method public final IconCompatParcelizer(Ljava/lang/Runnable;)V
    .registers 3

    const/high16 v0, 0x3f800000    # 1.0f

    .line 2156
    invoke-direct {p0, v0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->AudioAttributesCompatParcelizer(F)V

    .line 2157
    iput-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw:Ljava/lang/Runnable;

    return-void
.end method

.method public final IconCompatParcelizer(Z)V
    .registers 6

    .line 3581
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_5
    if-ge v1, v0, :cond_1b

    .line 3583
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 3584
    iget-object v3, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaBrowserCompatCustomActionResultReceiver:Ljava/util/HashMap;

    invoke-virtual {v3, v2}, Ljava/util/AbstractMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo/handleSingleElementUnwrapped;

    if-eqz v2, :cond_18

    .line 3586
    invoke-virtual {v2, p1}, Lo/handleSingleElementUnwrapped;->write(Z)V

    :cond_18
    add-int/lit8 v1, v1, 0x1

    goto :goto_5

    :cond_1b
    return-void
.end method

.method public final IconCompatParcelizer(ILo/handleSingleElementUnwrapped;)Z
    .registers 3

    .line 4860
    iget-object p0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaDescriptionCompat:Lo/PrimitiveArrayDeserializersFloatDeser;

    if-eqz p0, :cond_9

    .line 4861
    invoke-virtual {p0, p1, p2}, Lo/PrimitiveArrayDeserializersFloatDeser;->RemoteActionCompatParcelizer(ILo/handleSingleElementUnwrapped;)Z

    move-result p0

    return p0

    :cond_9
    const/4 p0, 0x0

    return p0
.end method

.method public IconCompatParcelizer(Landroid/view/View;Landroid/view/View;II)Z
    .registers 5

    .line 2968
    iget-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaDescriptionCompat:Lo/PrimitiveArrayDeserializersFloatDeser;

    if-eqz p1, :cond_24

    iget-object p1, p1, Lo/PrimitiveArrayDeserializersFloatDeser;->write:Lo/PrimitiveArrayDeserializersFloatDeser$AudioAttributesCompatParcelizer;

    if-eqz p1, :cond_24

    iget-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaDescriptionCompat:Lo/PrimitiveArrayDeserializersFloatDeser;

    iget-object p1, p1, Lo/PrimitiveArrayDeserializersFloatDeser;->write:Lo/PrimitiveArrayDeserializersFloatDeser$AudioAttributesCompatParcelizer;

    .line 2970
    invoke-virtual {p1}, Lo/PrimitiveArrayDeserializersFloatDeser$AudioAttributesCompatParcelizer;->RemoteActionCompatParcelizer()Lo/PrimitiveArrayDeserializersShortDeser;

    move-result-object p1

    if-eqz p1, :cond_24

    iget-object p0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaDescriptionCompat:Lo/PrimitiveArrayDeserializersFloatDeser;

    iget-object p0, p0, Lo/PrimitiveArrayDeserializersFloatDeser;->write:Lo/PrimitiveArrayDeserializersFloatDeser$AudioAttributesCompatParcelizer;

    .line 2971
    invoke-virtual {p0}, Lo/PrimitiveArrayDeserializersFloatDeser$AudioAttributesCompatParcelizer;->RemoteActionCompatParcelizer()Lo/PrimitiveArrayDeserializersShortDeser;

    move-result-object p0

    invoke-virtual {p0}, Lo/PrimitiveArrayDeserializersShortDeser;->IconCompatParcelizer()I

    move-result p0

    and-int/lit8 p0, p0, 0x2

    if-nez p0, :cond_24

    const/4 p0, 0x1

    return p0

    :cond_24
    const/4 p0, 0x0

    return p0
.end method

.method public final MediaBrowserCompatCustomActionResultReceiver()V
    .registers 3

    .line 4200
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaDescriptionCompat:Lo/PrimitiveArrayDeserializersFloatDeser;

    if-eqz v0, :cond_27

    .line 4203
    iget v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->AudioAttributesCompatParcelizer:I

    invoke-virtual {v0, p0, v1}, Lo/PrimitiveArrayDeserializersFloatDeser;->AudioAttributesCompatParcelizer(Landroidx/constraintlayout/motion/widget/MotionLayout;I)Z

    move-result v0

    if-eqz v0, :cond_10

    .line 4204
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void

    .line 4207
    :cond_10
    iget v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->AudioAttributesCompatParcelizer:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1a

    .line 4208
    iget-object v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaDescriptionCompat:Lo/PrimitiveArrayDeserializersFloatDeser;

    invoke-virtual {v1, p0, v0}, Lo/PrimitiveArrayDeserializersFloatDeser;->write(Landroidx/constraintlayout/motion/widget/MotionLayout;I)V

    .line 4210
    :cond_1a
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaDescriptionCompat:Lo/PrimitiveArrayDeserializersFloatDeser;

    invoke-virtual {v0}, Lo/PrimitiveArrayDeserializersFloatDeser;->onCommand()Z

    move-result v0

    if-eqz v0, :cond_27

    .line 4211
    iget-object p0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaDescriptionCompat:Lo/PrimitiveArrayDeserializersFloatDeser;

    invoke-virtual {p0}, Lo/PrimitiveArrayDeserializersFloatDeser;->onAddQueueItem()V

    :cond_27
    return-void
.end method

.method public final MediaBrowserCompatItemReceiver()I
    .registers 1

    .line 4694
    iget p0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onPlay:I

    return p0
.end method

.method public final MediaBrowserCompatSearchResultReceiver()V
    .registers 2

    const/4 v0, 0x0

    .line 2135
    invoke-direct {p0, v0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->AudioAttributesCompatParcelizer(F)V

    return-void
.end method

.method public final MediaMetadataCompat()V
    .registers 2

    const/high16 v0, 0x3f800000    # 1.0f

    .line 2144
    invoke-direct {p0, v0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->AudioAttributesCompatParcelizer(F)V

    const/4 v0, 0x0

    .line 2145
    iput-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw:Ljava/lang/Runnable;

    return-void
.end method

.method public final RemoteActionCompatParcelizer(I)Lo/ReferenceTypeDeserializer;
    .registers 2

    .line 4564
    iget-object p0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaDescriptionCompat:Lo/PrimitiveArrayDeserializersFloatDeser;

    if-nez p0, :cond_6

    const/4 p0, 0x0

    return-object p0

    .line 4567
    :cond_6
    invoke-virtual {p0, p1}, Lo/PrimitiveArrayDeserializersFloatDeser;->RemoteActionCompatParcelizer(I)Lo/ReferenceTypeDeserializer;

    move-result-object p0

    return-object p0
.end method

.method public RemoteActionCompatParcelizer(Landroid/view/View;I)V
    .registers 4

    .line 2995
    iget-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaDescriptionCompat:Lo/PrimitiveArrayDeserializersFloatDeser;

    if-eqz p1, :cond_14

    iget p2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->_init_lambda4:F

    const/4 v0, 0x0

    cmpl-float v0, p2, v0

    if-eqz v0, :cond_14

    .line 2998
    iget v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->addObserverForBackInvoker:F

    div-float/2addr v0, p2

    iget p0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->addObserverForBackInvokerlambda7:F

    div-float/2addr p0, p2

    invoke-virtual {p1, v0, p0}, Lo/PrimitiveArrayDeserializersFloatDeser;->write(FF)V

    :cond_14
    return-void
.end method

.method public RemoteActionCompatParcelizer(Landroid/view/View;II[II)V
    .registers 16

    .line 3020
    iget-object p5, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaDescriptionCompat:Lo/PrimitiveArrayDeserializersFloatDeser;

    if-eqz p5, :cond_bc

    .line 3025
    iget-object v0, p5, Lo/PrimitiveArrayDeserializersFloatDeser;->write:Lo/PrimitiveArrayDeserializersFloatDeser$AudioAttributesCompatParcelizer;

    if-eqz v0, :cond_bc

    .line 3026
    invoke-virtual {v0}, Lo/PrimitiveArrayDeserializersFloatDeser$AudioAttributesCompatParcelizer;->AudioAttributesImplBaseParcelizer()Z

    move-result v1

    if-eqz v1, :cond_bc

    .line 3030
    invoke-virtual {v0}, Lo/PrimitiveArrayDeserializersFloatDeser$AudioAttributesCompatParcelizer;->AudioAttributesImplBaseParcelizer()Z

    move-result v1

    const/4 v2, -0x1

    if-eqz v1, :cond_27

    .line 3031
    invoke-virtual {v0}, Lo/PrimitiveArrayDeserializersFloatDeser$AudioAttributesCompatParcelizer;->RemoteActionCompatParcelizer()Lo/PrimitiveArrayDeserializersShortDeser;

    move-result-object v1

    if-eqz v1, :cond_27

    .line 3033
    invoke-virtual {v1}, Lo/PrimitiveArrayDeserializersShortDeser;->MediaBrowserCompatMediaItem()I

    move-result v1

    if-eq v1, v2, :cond_27

    .line 3034
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v3

    if-ne v3, v1, :cond_bc

    .line 3040
    :cond_27
    invoke-virtual {p5}, Lo/PrimitiveArrayDeserializersFloatDeser;->MediaBrowserCompatItemReceiver()Z

    move-result v1

    const/high16 v3, 0x3f800000    # 1.0f

    const/4 v4, 0x0

    if-eqz v1, :cond_4f

    .line 3042
    invoke-virtual {v0}, Lo/PrimitiveArrayDeserializersFloatDeser$AudioAttributesCompatParcelizer;->RemoteActionCompatParcelizer()Lo/PrimitiveArrayDeserializersShortDeser;

    move-result-object v1

    if-eqz v1, :cond_3f

    .line 3045
    invoke-virtual {v1}, Lo/PrimitiveArrayDeserializersShortDeser;->IconCompatParcelizer()I

    move-result v1

    and-int/lit8 v1, v1, 0x4

    if-eqz v1, :cond_3f

    move v2, p3

    .line 3049
    :cond_3f
    iget v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->addOnMultiWindowModeChangedListener:F

    cmpl-float v5, v1, v3

    if-eqz v5, :cond_49

    cmpl-float v1, v1, v4

    if-nez v1, :cond_4f

    :cond_49
    invoke-virtual {p1, v2}, Landroid/view/View;->canScrollVertically(I)Z

    move-result v1

    if-nez v1, :cond_bc

    .line 3055
    :cond_4f
    invoke-virtual {v0}, Lo/PrimitiveArrayDeserializersFloatDeser$AudioAttributesCompatParcelizer;->RemoteActionCompatParcelizer()Lo/PrimitiveArrayDeserializersShortDeser;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v5, 0x1

    if-eqz v1, :cond_86

    invoke-virtual {v0}, Lo/PrimitiveArrayDeserializersFloatDeser$AudioAttributesCompatParcelizer;->RemoteActionCompatParcelizer()Lo/PrimitiveArrayDeserializersShortDeser;

    move-result-object v0

    invoke-virtual {v0}, Lo/PrimitiveArrayDeserializersShortDeser;->IconCompatParcelizer()I

    move-result v0

    and-int/2addr v0, v5

    if-eqz v0, :cond_86

    int-to-float v0, p2

    int-to-float v1, p3

    .line 3056
    invoke-virtual {p5, v0, v1}, Lo/PrimitiveArrayDeserializersFloatDeser;->AudioAttributesCompatParcelizer(FF)F

    move-result v0

    .line 3057
    iget v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onCustomAction:F

    cmpg-float v6, v1, v4

    if-gtz v6, :cond_72

    cmpg-float v6, v0, v4

    if-ltz v6, :cond_7a

    :cond_72
    cmpl-float v1, v1, v3

    if-ltz v1, :cond_86

    cmpl-float v0, v0, v4

    if-lez v0, :cond_86

    .line 3060
    :cond_7a
    invoke-virtual {p1, v2}, Landroid/view/View;->setNestedScrollingEnabled(Z)V

    .line 3062
    new-instance p0, Landroidx/constraintlayout/motion/widget/MotionLayout$4;

    invoke-direct {p0, p1}, Landroidx/constraintlayout/motion/widget/MotionLayout$4;-><init>(Landroid/view/View;)V

    invoke-virtual {p1, p0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void

    .line 3076
    :cond_86
    iget p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->addOnMultiWindowModeChangedListener:F

    .line 3077
    invoke-static {}, Landroidx/constraintlayout/motion/widget/MotionLayout;->onPause()J

    move-result-wide v0

    int-to-float v3, p2

    .line 3078
    iput v3, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->addObserverForBackInvoker:F

    int-to-float v4, p3

    .line 3079
    iput v4, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->addObserverForBackInvokerlambda7:F

    .line 3080
    iget-wide v6, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->ensureViewModelStore:J

    sub-long v6, v0, v6

    long-to-double v6, v6

    const-wide v8, 0x3e112e0be826d695L    # 1.0E-9

    mul-double/2addr v6, v8

    double-to-float v6, v6

    iput v6, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->_init_lambda4:F

    .line 3081
    iput-wide v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->ensureViewModelStore:J

    .line 3085
    invoke-virtual {p5, v3, v4}, Lo/PrimitiveArrayDeserializersFloatDeser;->RemoteActionCompatParcelizer(FF)V

    .line 3086
    iget p5, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->addOnMultiWindowModeChangedListener:F

    cmpl-float p1, p1, p5

    if-eqz p1, :cond_af

    .line 3087
    aput p2, p4, v2

    .line 3088
    aput p3, p4, v5

    .line 3090
    :cond_af
    invoke-virtual {p0, v2}, Landroidx/constraintlayout/motion/widget/MotionLayout;->RemoteActionCompatParcelizer(Z)V

    .line 3091
    aget p1, p4, v2

    if-nez p1, :cond_ba

    aget p1, p4, v5

    if-eqz p1, :cond_bc

    .line 3092
    :cond_ba
    iput-boolean v5, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->addOnTrimMemoryListener:Z

    :cond_bc
    return-void
.end method

.method public final RemoteActionCompatParcelizer(Lo/PrimitiveArrayDeserializersFloatDeser$AudioAttributesCompatParcelizer;)V
    .registers 5

    .line 1418
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaDescriptionCompat:Lo/PrimitiveArrayDeserializersFloatDeser;

    invoke-virtual {v0, p1}, Lo/PrimitiveArrayDeserializersFloatDeser;->IconCompatParcelizer(Lo/PrimitiveArrayDeserializersFloatDeser$AudioAttributesCompatParcelizer;)V

    .line 1419
    sget-object v0, Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi21Parcelizer;->RemoteActionCompatParcelizer:Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi21Parcelizer;

    invoke-virtual {p0, v0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->write(Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi21Parcelizer;)V

    .line 1420
    iget v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->AudioAttributesCompatParcelizer:I

    iget-object v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaDescriptionCompat:Lo/PrimitiveArrayDeserializersFloatDeser;

    invoke-virtual {v1}, Lo/PrimitiveArrayDeserializersFloatDeser;->AudioAttributesImplApi21Parcelizer()I

    move-result v1

    if-ne v0, v1, :cond_1d

    const/high16 v0, 0x3f800000    # 1.0f

    .line 1421
    iput v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onCustomAction:F

    .line 1422
    iput v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->addOnMultiWindowModeChangedListener:F

    .line 1423
    iput v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->getOnBackPressedDispatcherannotations:F

    goto :goto_24

    :cond_1d
    const/4 v0, 0x0

    .line 1425
    iput v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onCustomAction:F

    .line 1426
    iput v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->addOnMultiWindowModeChangedListener:F

    .line 1427
    iput v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->getOnBackPressedDispatcherannotations:F

    :goto_24
    const/4 v0, 0x1

    .line 1429
    invoke-virtual {p1, v0}, Lo/PrimitiveArrayDeserializersFloatDeser$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer(I)Z

    move-result p1

    if-eqz p1, :cond_2e

    const-wide/16 v0, -0x1

    goto :goto_32

    :cond_2e
    invoke-static {}, Landroidx/constraintlayout/motion/widget/MotionLayout;->onPause()J

    move-result-wide v0

    :goto_32
    iput-wide v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->addOnContextAvailableListener:J

    .line 1434
    iget-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaDescriptionCompat:Lo/PrimitiveArrayDeserializersFloatDeser;

    invoke-virtual {p1}, Lo/PrimitiveArrayDeserializersFloatDeser;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()I

    move-result p1

    .line 1435
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaDescriptionCompat:Lo/PrimitiveArrayDeserializersFloatDeser;

    invoke-virtual {v0}, Lo/PrimitiveArrayDeserializersFloatDeser;->AudioAttributesImplApi21Parcelizer()I

    move-result v0

    .line 1436
    iget v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onPlay:I

    if-ne p1, v1, :cond_49

    iget v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onPrepareFromUri:I

    if-ne v0, v1, :cond_49

    return-void

    .line 1439
    :cond_49
    iput p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onPlay:I

    .line 1440
    iput v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onPrepareFromUri:I

    .line 1441
    iget-object v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaDescriptionCompat:Lo/PrimitiveArrayDeserializersFloatDeser;

    invoke-virtual {v1, p1, v0}, Lo/PrimitiveArrayDeserializersFloatDeser;->RemoteActionCompatParcelizer(II)V

    .line 1447
    iget-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->r8lambdaKUbBm7ckfqTc9QCgukC86fguu4:Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;

    iget-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->onAddQueueItem:Lo/_long;

    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaDescriptionCompat:Lo/PrimitiveArrayDeserializersFloatDeser;

    iget v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onPlay:I

    invoke-virtual {v0, v1}, Lo/PrimitiveArrayDeserializersFloatDeser;->RemoteActionCompatParcelizer(I)Lo/ReferenceTypeDeserializer;

    move-result-object v0

    iget-object v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaDescriptionCompat:Lo/PrimitiveArrayDeserializersFloatDeser;

    iget v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onPrepareFromUri:I

    invoke-virtual {v1, v2}, Lo/PrimitiveArrayDeserializersFloatDeser;->RemoteActionCompatParcelizer(I)Lo/ReferenceTypeDeserializer;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->read(Lo/ReferenceTypeDeserializer;Lo/ReferenceTypeDeserializer;)V

    .line 1448
    iget-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->r8lambdaKUbBm7ckfqTc9QCgukC86fguu4:Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;

    iget v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onPlay:I

    iget v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onPrepareFromUri:I

    invoke-virtual {p1, v0, v1}, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->write(II)V

    .line 1449
    iget-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->r8lambdaKUbBm7ckfqTc9QCgukC86fguu4:Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;

    invoke-virtual {p1}, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->read()V

    .line 1451
    invoke-direct {p0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->onPlay()V

    return-void
.end method

.method public final RemoteActionCompatParcelizer(Z)V
    .registers 24

    move-object/from16 v0, p0

    .line 3593
    iget-wide v1, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->addOnContextAvailableListener:J

    const-wide/16 v3, -0x1

    cmp-long v1, v1, v3

    if-nez v1, :cond_10

    .line 3594
    invoke-static {}, Landroidx/constraintlayout/motion/widget/MotionLayout;->onPause()J

    move-result-wide v1

    iput-wide v1, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->addOnContextAvailableListener:J

    .line 3596
    :cond_10
    iget v1, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onCustomAction:F

    const/4 v2, 0x0

    cmpl-float v3, v1, v2

    const/4 v4, -0x1

    const/high16 v5, 0x3f800000    # 1.0f

    if-lez v3, :cond_20

    cmpg-float v3, v1, v5

    if-gez v3, :cond_20

    .line 3597
    iput v4, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->AudioAttributesCompatParcelizer:I

    .line 3601
    :cond_20
    iget-boolean v3, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->setSessionImpl:Z

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-nez v3, :cond_32

    iget-boolean v3, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onRemoveQueueItem:Z

    if-eqz v3, :cond_23d

    if-nez p1, :cond_32

    iget v3, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->getOnBackPressedDispatcherannotations:F

    cmpl-float v3, v3, v1

    if-eqz v3, :cond_23d

    .line 3602
    :cond_32
    iget v3, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->getOnBackPressedDispatcherannotations:F

    sub-float/2addr v3, v1

    invoke-static {v3}, Ljava/lang/Math;->signum(F)F

    move-result v1

    .line 3603
    invoke-static {}, Landroidx/constraintlayout/motion/widget/MotionLayout;->onPause()J

    move-result-wide v8

    .line 3606
    iget-object v3, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onSetRepeatMode:Landroid/view/animation/Interpolator;

    instance-of v10, v3, Lo/PrimitiveArrayDeserializersBooleanDeser;

    const v11, 0x3089705f    # 1.0E-9f

    if-nez v10, :cond_51

    .line 3607
    iget-wide v12, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->addOnContextAvailableListener:J

    sub-long v12, v8, v12

    long-to-float v10, v12

    mul-float/2addr v10, v1

    mul-float/2addr v10, v11

    iget v12, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->menuHostHelperlambda0:F

    div-float/2addr v10, v12

    goto :goto_52

    :cond_51
    move v10, v2

    .line 3609
    :goto_52
    iget v12, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onCustomAction:F

    add-float/2addr v12, v10

    .line 3612
    iget-boolean v13, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->addOnConfigurationChangedListener:Z

    if-eqz v13, :cond_5b

    .line 3613
    iget v12, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->getOnBackPressedDispatcherannotations:F

    :cond_5b
    cmpl-float v13, v1, v2

    if-lez v13, :cond_65

    .line 3616
    iget v14, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->getOnBackPressedDispatcherannotations:F

    cmpl-float v14, v12, v14

    if-gez v14, :cond_6f

    :cond_65
    cmpg-float v14, v1, v2

    if-gtz v14, :cond_75

    iget v14, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->getOnBackPressedDispatcherannotations:F

    cmpg-float v14, v12, v14

    if-gtz v14, :cond_75

    .line 3618
    :cond_6f
    iget v12, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->getOnBackPressedDispatcherannotations:F

    .line 3619
    iput-boolean v7, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onRemoveQueueItem:Z

    move v14, v6

    goto :goto_76

    :cond_75
    move v14, v7

    .line 3625
    :goto_76
    iput v12, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onCustomAction:F

    .line 3626
    iput v12, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->addOnMultiWindowModeChangedListener:F

    .line 3627
    iput-wide v8, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->addOnContextAvailableListener:J

    const v15, 0x3727c5ac    # 1.0E-5f

    if-eqz v3, :cond_101

    if-nez v14, :cond_101

    .line 3633
    iget-boolean v14, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->addMenuProvider:Z

    if-eqz v14, :cond_e2

    .line 3634
    iget-wide v4, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onMediaButtonEvent:J

    sub-long v4, v8, v4

    long-to-float v4, v4

    mul-float/2addr v4, v11

    .line 3635
    invoke-interface {v3, v4}, Landroid/view/animation/Interpolator;->getInterpolation(F)F

    move-result v3

    .line 3636
    iget-object v4, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onSetRepeatMode:Landroid/view/animation/Interpolator;

    iget-object v5, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->createFullyDrawnExecutor:Lo/NumberDeserializersIntegerDeserializer;

    const/4 v10, 0x2

    if-ne v4, v5, :cond_a2

    .line 3637
    invoke-virtual {v5}, Lo/NumberDeserializersIntegerDeserializer;->read()Z

    move-result v4

    if-eqz v4, :cond_a0

    move v4, v10

    goto :goto_a3

    :cond_a0
    move v4, v6

    goto :goto_a3

    :cond_a2
    move v4, v7

    .line 3644
    :goto_a3
    iput v3, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onCustomAction:F

    .line 3646
    iput-wide v8, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->addOnContextAvailableListener:J

    .line 3647
    iget-object v5, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onSetRepeatMode:Landroid/view/animation/Interpolator;

    instance-of v8, v5, Lo/PrimitiveArrayDeserializersBooleanDeser;

    if-eqz v8, :cond_105

    .line 3648
    check-cast v5, Lo/PrimitiveArrayDeserializersBooleanDeser;

    invoke-virtual {v5}, Lo/PrimitiveArrayDeserializersBooleanDeser;->AudioAttributesCompatParcelizer()F

    move-result v5

    .line 3649
    iput v5, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->AudioAttributesImplBaseParcelizer:F

    .line 3650
    invoke-static {v5}, Ljava/lang/Math;->abs(F)F

    move-result v8

    iget v9, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->menuHostHelperlambda0:F

    mul-float/2addr v8, v9

    cmpg-float v8, v8, v15

    if-gtz v8, :cond_c4

    if-ne v4, v10, :cond_c4

    .line 3651
    iput-boolean v7, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onRemoveQueueItem:Z

    :cond_c4
    cmpl-float v8, v5, v2

    if-lez v8, :cond_d4

    const/high16 v8, 0x3f800000    # 1.0f

    cmpl-float v9, v3, v8

    if-ltz v9, :cond_d4

    .line 3654
    iput v8, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onCustomAction:F

    .line 3655
    iput-boolean v7, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onRemoveQueueItem:Z

    const/high16 v3, 0x3f800000    # 1.0f

    :cond_d4
    cmpg-float v5, v5, v2

    if-gez v5, :cond_105

    cmpg-float v5, v3, v2

    if-gtz v5, :cond_105

    .line 3658
    iput v2, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onCustomAction:F

    .line 3659
    iput-boolean v7, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onRemoveQueueItem:Z

    move v3, v2

    goto :goto_105

    .line 3666
    :cond_e2
    invoke-interface {v3, v12}, Landroid/view/animation/Interpolator;->getInterpolation(F)F

    move-result v3

    .line 3667
    iget-object v4, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onSetRepeatMode:Landroid/view/animation/Interpolator;

    instance-of v5, v4, Lo/PrimitiveArrayDeserializersBooleanDeser;

    if-eqz v5, :cond_f5

    .line 3668
    check-cast v4, Lo/PrimitiveArrayDeserializersBooleanDeser;

    invoke-virtual {v4}, Lo/PrimitiveArrayDeserializersBooleanDeser;->AudioAttributesCompatParcelizer()F

    move-result v4

    iput v4, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->AudioAttributesImplBaseParcelizer:F

    goto :goto_ff

    :cond_f5
    add-float/2addr v12, v10

    .line 3670
    invoke-interface {v4, v12}, Landroid/view/animation/Interpolator;->getInterpolation(F)F

    move-result v4

    sub-float/2addr v4, v3

    mul-float/2addr v4, v1

    div-float/2addr v4, v10

    .line 3671
    iput v4, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->AudioAttributesImplBaseParcelizer:F

    :goto_ff
    move v12, v3

    goto :goto_103

    .line 3676
    :cond_101
    iput v10, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->AudioAttributesImplBaseParcelizer:F

    :goto_103
    move v4, v7

    move v3, v12

    .line 3678
    :cond_105
    :goto_105
    iget v5, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->AudioAttributesImplBaseParcelizer:F

    invoke-static {v5}, Ljava/lang/Math;->abs(F)F

    move-result v5

    cmpl-float v5, v5, v15

    if-lez v5, :cond_114

    .line 3679
    sget-object v5, Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi21Parcelizer;->read:Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi21Parcelizer;

    invoke-virtual {v0, v5}, Landroidx/constraintlayout/motion/widget/MotionLayout;->write(Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi21Parcelizer;)V

    :cond_114
    if-eq v4, v6, :cond_13d

    if-lez v13, :cond_11e

    .line 3683
    iget v4, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->getOnBackPressedDispatcherannotations:F

    cmpl-float v4, v3, v4

    if-gez v4, :cond_128

    :cond_11e
    cmpg-float v4, v1, v2

    if-gtz v4, :cond_12c

    iget v4, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->getOnBackPressedDispatcherannotations:F

    cmpg-float v4, v3, v4

    if-gtz v4, :cond_12c

    .line 3685
    :cond_128
    iget v3, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->getOnBackPressedDispatcherannotations:F

    .line 3686
    iput-boolean v7, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onRemoveQueueItem:Z

    :cond_12c
    const/high16 v4, 0x3f800000    # 1.0f

    cmpl-float v5, v3, v4

    if-gez v5, :cond_136

    cmpg-float v4, v3, v2

    if-gtz v4, :cond_13d

    .line 3690
    :cond_136
    iput-boolean v7, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onRemoveQueueItem:Z

    .line 3691
    sget-object v4, Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi21Parcelizer;->write:Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi21Parcelizer;

    invoke-virtual {v0, v4}, Landroidx/constraintlayout/motion/widget/MotionLayout;->write(Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi21Parcelizer;)V

    .line 3695
    :cond_13d
    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v4

    .line 3696
    iput-boolean v7, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->setSessionImpl:Z

    .line 3697
    invoke-static {}, Landroidx/constraintlayout/motion/widget/MotionLayout;->onPause()J

    move-result-wide v8

    .line 3701
    iput v3, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->AudioAttributesImplApi21Parcelizer:F

    .line 3702
    iget-object v5, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->accessaddObserverForBackInvoker:Landroid/view/animation/Interpolator;

    if-nez v5, :cond_14f

    move v5, v3

    goto :goto_153

    :cond_14f
    invoke-interface {v5, v3}, Landroid/view/animation/Interpolator;->getInterpolation(F)F

    move-result v5

    .line 3703
    :goto_153
    iget-object v10, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->accessaddObserverForBackInvoker:Landroid/view/animation/Interpolator;

    if-eqz v10, :cond_16b

    .line 3704
    iget v11, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->menuHostHelperlambda0:F

    div-float v11, v1, v11

    add-float/2addr v11, v3

    invoke-interface {v10, v11}, Landroid/view/animation/Interpolator;->getInterpolation(F)F

    move-result v10

    iput v10, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->AudioAttributesImplBaseParcelizer:F

    .line 3705
    iget-object v11, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->accessaddObserverForBackInvoker:Landroid/view/animation/Interpolator;

    invoke-interface {v11, v3}, Landroid/view/animation/Interpolator;->getInterpolation(F)F

    move-result v11

    sub-float/2addr v10, v11

    iput v10, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->AudioAttributesImplBaseParcelizer:F

    :cond_16b
    move v10, v7

    :goto_16c
    if-ge v10, v4, :cond_194

    .line 3708
    invoke-virtual {v0, v10}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v11

    .line 3709
    iget-object v12, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaBrowserCompatCustomActionResultReceiver:Ljava/util/HashMap;

    invoke-virtual {v12, v11}, Ljava/util/AbstractMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    move-object/from16 v16, v12

    check-cast v16, Lo/handleSingleElementUnwrapped;

    if-eqz v16, :cond_191

    .line 3711
    iget-boolean v12, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->setSessionImpl:Z

    iget-object v15, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onSkipToQueueItem:Lo/FromStringDeserializer;

    move-object/from16 v17, v11

    move/from16 v18, v5

    move-wide/from16 v19, v8

    move-object/from16 v21, v15

    invoke-virtual/range {v16 .. v21}, Lo/handleSingleElementUnwrapped;->write(Landroid/view/View;FJLo/FromStringDeserializer;)Z

    move-result v11

    or-int/2addr v11, v12

    iput-boolean v11, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->setSessionImpl:Z

    :cond_191
    add-int/lit8 v10, v10, 0x1

    goto :goto_16c

    :cond_194
    if-lez v13, :cond_19c

    .line 3719
    iget v4, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->getOnBackPressedDispatcherannotations:F

    cmpl-float v4, v3, v4

    if-gez v4, :cond_1a6

    :cond_19c
    cmpg-float v4, v1, v2

    if-gtz v4, :cond_1a8

    iget v4, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->getOnBackPressedDispatcherannotations:F

    cmpg-float v4, v3, v4

    if-gtz v4, :cond_1a8

    :cond_1a6
    move v4, v6

    goto :goto_1a9

    :cond_1a8
    move v4, v7

    .line 3721
    :goto_1a9
    iget-boolean v5, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->setSessionImpl:Z

    if-nez v5, :cond_1b8

    iget-boolean v5, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onRemoveQueueItem:Z

    if-nez v5, :cond_1b8

    if-eqz v4, :cond_1b8

    .line 3722
    sget-object v5, Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi21Parcelizer;->write:Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi21Parcelizer;

    invoke-virtual {v0, v5}, Landroidx/constraintlayout/motion/widget/MotionLayout;->write(Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi21Parcelizer;)V

    .line 3724
    :cond_1b8
    iget-boolean v5, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->AudioAttributesImplApi26Parcelizer:Z

    if-eqz v5, :cond_1bf

    .line 3725
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->requestLayout()V

    :cond_1bf
    xor-int/2addr v4, v6

    .line 3728
    iget-boolean v5, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->setSessionImpl:Z

    or-int/2addr v4, v5

    iput-boolean v4, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->setSessionImpl:Z

    cmpg-float v4, v3, v2

    if-gtz v4, :cond_1e3

    .line 3731
    iget v4, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onPlay:I

    const/4 v5, -0x1

    if-eq v4, v5, :cond_1e3

    .line 3732
    iget v5, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->AudioAttributesCompatParcelizer:I

    if-eq v5, v4, :cond_1e3

    .line 3734
    iput v4, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->AudioAttributesCompatParcelizer:I

    .line 3735
    iget-object v5, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaDescriptionCompat:Lo/PrimitiveArrayDeserializersFloatDeser;

    invoke-virtual {v5, v4}, Lo/PrimitiveArrayDeserializersFloatDeser;->RemoteActionCompatParcelizer(I)Lo/ReferenceTypeDeserializer;

    move-result-object v4

    .line 3736
    invoke-virtual {v4, v0}, Lo/ReferenceTypeDeserializer;->IconCompatParcelizer(Landroidx/constraintlayout/widget/ConstraintLayout;)V

    .line 3737
    sget-object v4, Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi21Parcelizer;->write:Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi21Parcelizer;

    invoke-virtual {v0, v4}, Landroidx/constraintlayout/motion/widget/MotionLayout;->write(Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi21Parcelizer;)V

    move v7, v6

    :cond_1e3
    float-to-double v4, v3

    const-wide/high16 v8, 0x3ff0000000000000L    # 1.0

    cmpl-double v4, v4, v8

    if-ltz v4, :cond_201

    .line 3745
    iget v4, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->AudioAttributesCompatParcelizer:I

    iget v5, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onPrepareFromUri:I

    if-eq v4, v5, :cond_201

    .line 3747
    iput v5, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->AudioAttributesCompatParcelizer:I

    .line 3748
    iget-object v4, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaDescriptionCompat:Lo/PrimitiveArrayDeserializersFloatDeser;

    invoke-virtual {v4, v5}, Lo/PrimitiveArrayDeserializersFloatDeser;->RemoteActionCompatParcelizer(I)Lo/ReferenceTypeDeserializer;

    move-result-object v4

    .line 3749
    invoke-virtual {v4, v0}, Lo/ReferenceTypeDeserializer;->IconCompatParcelizer(Landroidx/constraintlayout/widget/ConstraintLayout;)V

    .line 3750
    sget-object v4, Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi21Parcelizer;->write:Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi21Parcelizer;

    invoke-virtual {v0, v4}, Landroidx/constraintlayout/motion/widget/MotionLayout;->write(Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi21Parcelizer;)V

    move v7, v6

    .line 3754
    :cond_201
    iget-boolean v4, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->setSessionImpl:Z

    if-nez v4, :cond_21f

    iget-boolean v4, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onRemoveQueueItem:Z

    if-nez v4, :cond_21f

    if-lez v13, :cond_211

    const/high16 v4, 0x3f800000    # 1.0f

    cmpl-float v5, v3, v4

    if-eqz v5, :cond_219

    :cond_211
    cmpg-float v4, v1, v2

    if-gez v4, :cond_222

    cmpl-float v4, v3, v2

    if-nez v4, :cond_222

    .line 3758
    :cond_219
    sget-object v4, Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi21Parcelizer;->write:Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi21Parcelizer;

    invoke-virtual {v0, v4}, Landroidx/constraintlayout/motion/widget/MotionLayout;->write(Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi21Parcelizer;)V

    goto :goto_222

    .line 3755
    :cond_21f
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->invalidate()V

    .line 3761
    :cond_222
    :goto_222
    iget-boolean v4, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->setSessionImpl:Z

    if-nez v4, :cond_23d

    iget-boolean v4, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onRemoveQueueItem:Z

    if-nez v4, :cond_23d

    if-lez v13, :cond_232

    const/high16 v4, 0x3f800000    # 1.0f

    cmpl-float v5, v3, v4

    if-eqz v5, :cond_23a

    :cond_232
    cmpg-float v1, v1, v2

    if-gez v1, :cond_23d

    cmpl-float v1, v3, v2

    if-nez v1, :cond_23d

    .line 3762
    :cond_23a
    invoke-virtual/range {p0 .. p0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaBrowserCompatCustomActionResultReceiver()V

    .line 3765
    :cond_23d
    iget v1, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onCustomAction:F

    const/high16 v3, 0x3f800000    # 1.0f

    cmpl-float v3, v1, v3

    if-ltz v3, :cond_251

    .line 3766
    iget v1, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->AudioAttributesCompatParcelizer:I

    iget v2, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onPrepareFromUri:I

    if-eq v1, v2, :cond_24c

    goto :goto_24d

    :cond_24c
    move v6, v7

    .line 3769
    :goto_24d
    iput v2, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->AudioAttributesCompatParcelizer:I

    :goto_24f
    move v7, v6

    goto :goto_260

    :cond_251
    cmpg-float v1, v1, v2

    if-gtz v1, :cond_260

    .line 3771
    iget v1, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->AudioAttributesCompatParcelizer:I

    iget v2, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onPlay:I

    if-eq v1, v2, :cond_25c

    goto :goto_25d

    :cond_25c
    move v6, v7

    .line 3774
    :goto_25d
    iput v2, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->AudioAttributesCompatParcelizer:I

    goto :goto_24f

    .line 3777
    :cond_260
    :goto_260
    iget-boolean v1, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->PlaybackStateCompatCustomAction:Z

    or-int/2addr v1, v7

    iput-boolean v1, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->PlaybackStateCompatCustomAction:Z

    if-eqz v7, :cond_26e

    .line 3779
    iget-boolean v1, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onRewind:Z

    if-nez v1, :cond_26e

    .line 3780
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->requestLayout()V

    .line 3783
    :cond_26e
    iget v1, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onCustomAction:F

    iput v1, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->addOnMultiWindowModeChangedListener:F

    return-void
.end method

.method public final RemoteActionCompatParcelizer()[I
    .registers 1

    .line 4547
    iget-object p0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaDescriptionCompat:Lo/PrimitiveArrayDeserializersFloatDeser;

    if-nez p0, :cond_6

    const/4 p0, 0x0

    return-object p0

    .line 4550
    :cond_6
    invoke-virtual {p0}, Lo/PrimitiveArrayDeserializersFloatDeser;->read()[I

    move-result-object p0

    return-object p0
.end method

.method public dispatchDraw(Landroid/graphics/Canvas;)V
    .registers 11

    .line 3467
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onPlayFromSearch:Ljava/util/ArrayList;

    if-eqz v0, :cond_15

    .line 3468
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_15

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/constraintlayout/motion/widget/MotionHelper;

    goto :goto_8

    :cond_15
    const/4 v0, 0x0

    .line 3472
    invoke-virtual {p0, v0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->RemoteActionCompatParcelizer(Z)V

    .line 3473
    iget-object v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaDescriptionCompat:Lo/PrimitiveArrayDeserializersFloatDeser;

    if-eqz v1, :cond_28

    iget-object v1, v1, Lo/PrimitiveArrayDeserializersFloatDeser;->RemoteActionCompatParcelizer:Lo/constructValue;

    if-eqz v1, :cond_28

    .line 3474
    iget-object v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaDescriptionCompat:Lo/PrimitiveArrayDeserializersFloatDeser;

    iget-object v1, v1, Lo/PrimitiveArrayDeserializersFloatDeser;->RemoteActionCompatParcelizer:Lo/constructValue;

    invoke-virtual {v1}, Lo/constructValue;->read()V

    .line 3481
    :cond_28
    invoke-super {p0, p1}, Landroidx/constraintlayout/widget/ConstraintLayout;->dispatchDraw(Landroid/graphics/Canvas;)V

    .line 3482
    iget-object v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaDescriptionCompat:Lo/PrimitiveArrayDeserializersFloatDeser;

    if-eqz v1, :cond_126

    .line 3488
    iget v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->read:I

    const/4 v2, 0x1

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_f3

    .line 3489
    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    move-result v1

    if-nez v1, :cond_f3

    .line 3490
    iget v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onSeekTo:I

    add-int/2addr v1, v2

    iput v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onSeekTo:I

    .line 3491
    invoke-static {}, Landroidx/constraintlayout/motion/widget/MotionLayout;->onPause()J

    move-result-wide v3

    .line 3492
    iget-wide v5, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onSkipToPrevious:J

    const-wide/16 v7, -0x1

    cmp-long v1, v5, v7

    if-eqz v1, :cond_68

    sub-long v5, v3, v5

    const-wide/32 v7, 0xbebc200

    cmp-long v1, v5, v7

    if-lez v1, :cond_6a

    .line 3495
    iget v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onSeekTo:I

    int-to-float v1, v1

    long-to-float v5, v5

    const v6, 0x3089705f    # 1.0E-9f

    mul-float/2addr v5, v6

    div-float/2addr v1, v5

    const/high16 v5, 0x42c80000    # 100.0f

    mul-float/2addr v1, v5

    float-to-int v1, v1

    int-to-float v1, v1

    div-float/2addr v1, v5

    .line 3496
    iput v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onSkipToNext:F

    .line 3497
    iput v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onSeekTo:I

    .line 3501
    :cond_68
    iput-wide v3, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onSkipToPrevious:J

    .line 3503
    :cond_6a
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    const/high16 v1, 0x42280000    # 42.0f

    .line 3504
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 3505
    invoke-virtual {p0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->AudioAttributesCompatParcelizer()F

    move-result v1

    const/high16 v3, 0x447a0000    # 1000.0f

    mul-float/2addr v1, v3

    float-to-int v1, v1

    int-to-float v1, v1

    const/high16 v3, 0x41200000    # 10.0f

    div-float/2addr v1, v3

    .line 3506
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    iget v5, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onSkipToNext:F

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v5, " fps "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v5, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onPlay:I

    invoke-static {p0, v5}, Lo/NumberDeserializersShortDeserializer;->write(Landroidx/constraintlayout/motion/widget/MotionLayout;I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, " -> "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    .line 3507
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v4, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onPrepareFromUri:I

    invoke-static {p0, v4}, Lo/NumberDeserializersShortDeserializer;->write(Landroidx/constraintlayout/motion/widget/MotionLayout;I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " (progress: "

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, " ) state="

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3508
    iget v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->AudioAttributesCompatParcelizer:I

    const/4 v4, -0x1

    if-ne v1, v4, :cond_c7

    const-string v1, "undefined"

    goto :goto_cb

    :cond_c7
    invoke-static {p0, v1}, Lo/NumberDeserializersShortDeserializer;->write(Landroidx/constraintlayout/motion/widget/MotionLayout;I)Ljava/lang/String;

    move-result-object v1

    :goto_cb
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    const/high16 v4, -0x1000000

    .line 3509
    invoke-virtual {v0, v4}, Landroid/graphics/Paint;->setColor(I)V

    .line 3510
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v4

    add-int/lit8 v4, v4, -0x1d

    int-to-float v4, v4

    const/high16 v5, 0x41300000    # 11.0f

    invoke-virtual {p1, v1, v5, v4, v0}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    const v4, -0x77ff78

    .line 3511
    invoke-virtual {v0, v4}, Landroid/graphics/Paint;->setColor(I)V

    .line 3512
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v4

    add-int/lit8 v4, v4, -0x1e

    int-to-float v4, v4

    invoke-virtual {p1, v1, v3, v4, v0}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 3516
    :cond_f3
    iget v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->read:I

    if-le v0, v2, :cond_111

    .line 3517
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onPrepare:Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;

    if-nez v0, :cond_102

    .line 3518
    new-instance v0, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;

    invoke-direct {v0, p0}, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;-><init>(Landroidx/constraintlayout/motion/widget/MotionLayout;)V

    iput-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onPrepare:Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;

    .line 3520
    :cond_102
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onPrepare:Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;

    iget-object v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaBrowserCompatCustomActionResultReceiver:Ljava/util/HashMap;

    iget-object v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaDescriptionCompat:Lo/PrimitiveArrayDeserializersFloatDeser;

    invoke-virtual {v2}, Lo/PrimitiveArrayDeserializersFloatDeser;->write()I

    move-result v2

    iget v3, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->read:I

    invoke-virtual {v0, p1, v1, v2, v3}, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->read(Landroid/graphics/Canvas;Ljava/util/HashMap;II)V

    .line 3522
    :cond_111
    iget-object p0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onPlayFromSearch:Ljava/util/ArrayList;

    if-eqz p0, :cond_126

    .line 3523
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_119
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_126

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/constraintlayout/motion/widget/MotionHelper;

    goto :goto_119

    :cond_126
    return-void
.end method

.method public isAttachedToWindow()Z
    .registers 1

    .line 1532
    invoke-super {p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->isAttachedToWindow()Z

    move-result p0

    return p0
.end method

.method protected onAttachedToWindow()V
    .registers 4

    .line 4145
    invoke-super {p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->onAttachedToWindow()V

    .line 4147
    invoke-virtual {p0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->getDisplay()Landroid/view/Display;

    move-result-object v0

    if-eqz v0, :cond_f

    .line 4149
    invoke-virtual {v0}, Landroid/view/Display;->getRotation()I

    move-result v0

    iput v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8:I

    .line 4152
    :cond_f
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaDescriptionCompat:Lo/PrimitiveArrayDeserializersFloatDeser;

    if-eqz v0, :cond_3f

    iget v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->AudioAttributesCompatParcelizer:I

    const/4 v2, -0x1

    if-eq v1, v2, :cond_3f

    .line 4153
    invoke-virtual {v0, v1}, Lo/PrimitiveArrayDeserializersFloatDeser;->RemoteActionCompatParcelizer(I)Lo/ReferenceTypeDeserializer;

    move-result-object v0

    .line 4154
    iget-object v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaDescriptionCompat:Lo/PrimitiveArrayDeserializersFloatDeser;

    invoke-virtual {v1, p0}, Lo/PrimitiveArrayDeserializersFloatDeser;->IconCompatParcelizer(Landroidx/constraintlayout/motion/widget/MotionLayout;)V

    .line 4155
    iget-object v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onPlayFromSearch:Ljava/util/ArrayList;

    if-eqz v1, :cond_36

    .line 4156
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_29
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_36

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/constraintlayout/motion/widget/MotionHelper;

    goto :goto_29

    :cond_36
    if-eqz v0, :cond_3b

    .line 4161
    invoke-virtual {v0, p0}, Lo/ReferenceTypeDeserializer;->write(Landroidx/constraintlayout/widget/ConstraintLayout;)V

    .line 4163
    :cond_3b
    iget v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->AudioAttributesCompatParcelizer:I

    iput v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onPlay:I

    .line 4165
    :cond_3f
    invoke-virtual {p0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaBrowserCompatCustomActionResultReceiver()V

    .line 4166
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->accessonBackPresseds1027565324:Landroidx/constraintlayout/motion/widget/MotionLayout$MediaBrowserCompatCustomActionResultReceiver;

    if-eqz v0, :cond_57

    .line 4167
    iget-boolean v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onPrepareFromMediaId:Z

    if-eqz v1, :cond_53

    .line 4168
    new-instance v0, Landroidx/constraintlayout/motion/widget/MotionLayout$2;

    invoke-direct {v0, p0}, Landroidx/constraintlayout/motion/widget/MotionLayout$2;-><init>(Landroidx/constraintlayout/motion/widget/MotionLayout;)V

    invoke-virtual {p0, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void

    .line 4175
    :cond_53
    invoke-virtual {v0}, Landroidx/constraintlayout/motion/widget/MotionLayout$MediaBrowserCompatCustomActionResultReceiver;->RemoteActionCompatParcelizer()V

    return-void

    .line 4178
    :cond_57
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaDescriptionCompat:Lo/PrimitiveArrayDeserializersFloatDeser;

    if-eqz v0, :cond_77

    iget-object v0, v0, Lo/PrimitiveArrayDeserializersFloatDeser;->write:Lo/PrimitiveArrayDeserializersFloatDeser$AudioAttributesCompatParcelizer;

    if-eqz v0, :cond_77

    .line 4179
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaDescriptionCompat:Lo/PrimitiveArrayDeserializersFloatDeser;

    iget-object v0, v0, Lo/PrimitiveArrayDeserializersFloatDeser;->write:Lo/PrimitiveArrayDeserializersFloatDeser$AudioAttributesCompatParcelizer;

    invoke-virtual {v0}, Lo/PrimitiveArrayDeserializersFloatDeser$AudioAttributesCompatParcelizer;->IconCompatParcelizer()I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_77

    .line 4180
    invoke-virtual {p0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaMetadataCompat()V

    .line 4181
    sget-object v0, Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi21Parcelizer;->RemoteActionCompatParcelizer:Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi21Parcelizer;

    invoke-virtual {p0, v0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->write(Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi21Parcelizer;)V

    .line 4182
    sget-object v0, Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi21Parcelizer;->read:Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi21Parcelizer;

    invoke-virtual {p0, v0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->write(Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi21Parcelizer;)V

    :cond_77
    return-void
.end method

.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .registers 8

    .line 4081
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaDescriptionCompat:Lo/PrimitiveArrayDeserializersFloatDeser;

    const/4 v1, 0x0

    if-eqz v0, :cond_ab

    iget-boolean v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onSetRating:Z

    if-eqz v2, :cond_ab

    .line 4085
    iget-object v0, v0, Lo/PrimitiveArrayDeserializersFloatDeser;->RemoteActionCompatParcelizer:Lo/constructValue;

    if-eqz v0, :cond_14

    .line 4086
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaDescriptionCompat:Lo/PrimitiveArrayDeserializersFloatDeser;

    iget-object v0, v0, Lo/PrimitiveArrayDeserializersFloatDeser;->RemoteActionCompatParcelizer:Lo/constructValue;

    invoke-virtual {v0, p1}, Lo/constructValue;->IconCompatParcelizer(Landroid/view/MotionEvent;)V

    .line 4088
    :cond_14
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaDescriptionCompat:Lo/PrimitiveArrayDeserializersFloatDeser;

    iget-object v0, v0, Lo/PrimitiveArrayDeserializersFloatDeser;->write:Lo/PrimitiveArrayDeserializersFloatDeser$AudioAttributesCompatParcelizer;

    if-eqz v0, :cond_ab

    .line 4089
    invoke-virtual {v0}, Lo/PrimitiveArrayDeserializersFloatDeser$AudioAttributesCompatParcelizer;->AudioAttributesImplBaseParcelizer()Z

    move-result v2

    if-eqz v2, :cond_ab

    .line 4090
    invoke-virtual {v0}, Lo/PrimitiveArrayDeserializersFloatDeser$AudioAttributesCompatParcelizer;->RemoteActionCompatParcelizer()Lo/PrimitiveArrayDeserializersShortDeser;

    move-result-object v0

    if-eqz v0, :cond_ab

    .line 4092
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v2

    if-nez v2, :cond_46

    .line 4093
    new-instance v2, Landroid/graphics/RectF;

    invoke-direct {v2}, Landroid/graphics/RectF;-><init>()V

    invoke-virtual {v0, p0, v2}, Lo/PrimitiveArrayDeserializersShortDeser;->AudioAttributesCompatParcelizer(Landroid/view/ViewGroup;Landroid/graphics/RectF;)Landroid/graphics/RectF;

    move-result-object v2

    if-eqz v2, :cond_46

    .line 4095
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v3

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v4

    invoke-virtual {v2, v3, v4}, Landroid/graphics/RectF;->contains(FF)Z

    move-result v2

    if-nez v2, :cond_46

    return v1

    .line 4099
    :cond_46
    invoke-virtual {v0}, Lo/PrimitiveArrayDeserializersShortDeser;->MediaBrowserCompatMediaItem()I

    move-result v0

    const/4 v2, -0x1

    if-eq v0, v2, :cond_ab

    .line 4101
    iget-object v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->_init_lambda5:Landroid/view/View;

    if-eqz v2, :cond_57

    invoke-virtual {v2}, Landroid/view/View;->getId()I

    move-result v2

    if-eq v2, v0, :cond_5d

    .line 4102
    :cond_57
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->_init_lambda5:Landroid/view/View;

    .line 4104
    :cond_5d
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->_init_lambda5:Landroid/view/View;

    if-eqz v0, :cond_ab

    .line 4105
    iget-object v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onPlayFromUri:Landroid/graphics/RectF;

    invoke-virtual {v0}, Landroid/view/View;->getLeft()I

    move-result v0

    int-to-float v0, v0

    iget-object v3, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->_init_lambda5:Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->getTop()I

    move-result v3

    int-to-float v3, v3

    iget-object v4, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->_init_lambda5:Landroid/view/View;

    invoke-virtual {v4}, Landroid/view/View;->getRight()I

    move-result v4

    int-to-float v4, v4

    iget-object v5, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->_init_lambda5:Landroid/view/View;

    invoke-virtual {v5}, Landroid/view/View;->getBottom()I

    move-result v5

    int-to-float v5, v5

    invoke-virtual {v2, v0, v3, v4, v5}, Landroid/graphics/RectF;->set(FFFF)V

    .line 4106
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onPlayFromUri:Landroid/graphics/RectF;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v3

    invoke-virtual {v0, v2, v3}, Landroid/graphics/RectF;->contains(FF)Z

    move-result v0

    if-eqz v0, :cond_ab

    .line 4109
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->_init_lambda5:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLeft()I

    move-result v0

    int-to-float v0, v0

    iget-object v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->_init_lambda5:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getTop()I

    move-result v2

    int-to-float v2, v2

    iget-object v3, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->_init_lambda5:Landroid/view/View;

    invoke-direct {p0, v0, v2, v3, p1}, Landroidx/constraintlayout/motion/widget/MotionLayout;->AudioAttributesCompatParcelizer(FFLandroid/view/View;Landroid/view/MotionEvent;)Z

    move-result v0

    if-nez v0, :cond_ab

    .line 4111
    invoke-virtual {p0, p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p0

    return p0

    :cond_ab
    return v1
.end method

.method public onLayout(ZIIII)V
    .registers 9

    const/4 v0, 0x1

    .line 3790
    iput-boolean v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onRewind:Z

    const/4 v1, 0x0

    .line 3795
    :try_start_4
    iget-object v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaDescriptionCompat:Lo/PrimitiveArrayDeserializersFloatDeser;

    if-nez v2, :cond_e

    .line 3796
    invoke-super/range {p0 .. p5}, Landroidx/constraintlayout/widget/ConstraintLayout;->onLayout(ZIIII)V
    :try_end_b
    .catchall {:try_start_4 .. :try_end_b} :catchall_29

    .line 3814
    iput-boolean v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onRewind:Z

    return-void

    :cond_e
    sub-int/2addr p4, p2

    sub-int/2addr p5, p3

    .line 3801
    :try_start_10
    iget p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaSessionCompatResultReceiverWrapper:I

    if-ne p1, p4, :cond_18

    iget p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaSessionCompatToken:I

    if-eq p1, p5, :cond_1e

    .line 3802
    :cond_18
    invoke-direct {p0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->onPlay()V

    .line 3803
    invoke-virtual {p0, v0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->RemoteActionCompatParcelizer(Z)V

    .line 3809
    :cond_1e
    iput p4, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaSessionCompatResultReceiverWrapper:I

    .line 3810
    iput p5, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaSessionCompatToken:I

    .line 3811
    iput p4, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM:I

    .line 3812
    iput p5, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->ResultReceiver:I
    :try_end_26
    .catchall {:try_start_10 .. :try_end_26} :catchall_29

    .line 3814
    iput-boolean v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onRewind:Z

    return-void

    :catchall_29
    move-exception p1

    iput-boolean v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onRewind:Z

    .line 3815
    throw p1
.end method

.method public onMeasure(II)V
    .registers 10

    .line 2913
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaDescriptionCompat:Lo/PrimitiveArrayDeserializersFloatDeser;

    if-nez v0, :cond_8

    .line 2914
    invoke-super {p0, p1, p2}, Landroidx/constraintlayout/widget/ConstraintLayout;->onMeasure(II)V

    return-void

    .line 2917
    :cond_8
    iget v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaSessionCompatQueueItem:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ne v0, p1, :cond_14

    iget v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onStop:I

    if-ne v0, p2, :cond_14

    move v0, v1

    goto :goto_15

    :cond_14
    move v0, v2

    .line 2918
    :goto_15
    iget-boolean v3, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->PlaybackStateCompatCustomAction:Z

    if-eqz v3, :cond_22

    .line 2919
    iput-boolean v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->PlaybackStateCompatCustomAction:Z

    .line 2920
    invoke-virtual {p0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaBrowserCompatCustomActionResultReceiver()V

    .line 2921
    invoke-direct {p0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->onFastForward()V

    move v0, v2

    .line 2925
    :cond_22
    iget-boolean v3, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->onCommand:Z

    if-eqz v3, :cond_27

    move v0, v2

    .line 2929
    :cond_27
    iput p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaSessionCompatQueueItem:I

    .line 2930
    iput p2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onStop:I

    .line 2932
    iget-object v3, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaDescriptionCompat:Lo/PrimitiveArrayDeserializersFloatDeser;

    invoke-virtual {v3}, Lo/PrimitiveArrayDeserializersFloatDeser;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()I

    move-result v3

    .line 2933
    iget-object v4, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaDescriptionCompat:Lo/PrimitiveArrayDeserializersFloatDeser;

    invoke-virtual {v4}, Lo/PrimitiveArrayDeserializersFloatDeser;->AudioAttributesImplApi21Parcelizer()I

    move-result v4

    if-nez v0, :cond_41

    .line 2935
    iget-object v5, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->r8lambdaKUbBm7ckfqTc9QCgukC86fguu4:Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;

    invoke-virtual {v5, v3, v4}, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->RemoteActionCompatParcelizer(II)Z

    move-result v5

    if-eqz v5, :cond_67

    :cond_41
    iget v5, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onPlay:I

    const/4 v6, -0x1

    if-eq v5, v6, :cond_67

    .line 2936
    invoke-super {p0, p1, p2}, Landroidx/constraintlayout/widget/ConstraintLayout;->onMeasure(II)V

    .line 2937
    iget-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->r8lambdaKUbBm7ckfqTc9QCgukC86fguu4:Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;

    iget-object p2, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->onAddQueueItem:Lo/_long;

    iget-object p2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaDescriptionCompat:Lo/PrimitiveArrayDeserializersFloatDeser;

    invoke-virtual {p2, v3}, Lo/PrimitiveArrayDeserializersFloatDeser;->RemoteActionCompatParcelizer(I)Lo/ReferenceTypeDeserializer;

    move-result-object p2

    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaDescriptionCompat:Lo/PrimitiveArrayDeserializersFloatDeser;

    invoke-virtual {v0, v4}, Lo/PrimitiveArrayDeserializersFloatDeser;->RemoteActionCompatParcelizer(I)Lo/ReferenceTypeDeserializer;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->read(Lo/ReferenceTypeDeserializer;Lo/ReferenceTypeDeserializer;)V

    .line 2938
    iget-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->r8lambdaKUbBm7ckfqTc9QCgukC86fguu4:Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;

    invoke-virtual {p1}, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->read()V

    .line 2939
    iget-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->r8lambdaKUbBm7ckfqTc9QCgukC86fguu4:Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;

    invoke-virtual {p1, v3, v4}, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->write(II)V

    goto :goto_6d

    :cond_67
    if-eqz v0, :cond_6c

    .line 2942
    invoke-super {p0, p1, p2}, Landroidx/constraintlayout/widget/ConstraintLayout;->onMeasure(II)V

    :cond_6c
    move v1, v2

    .line 2945
    :goto_6d
    iget-boolean p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->AudioAttributesImplApi26Parcelizer:Z

    if-nez p1, :cond_73

    if-eqz v1, :cond_c2

    .line 2946
    :cond_73
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result p1

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result p2

    .line 2947
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v1

    .line 2948
    iget-object v2, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->onAddQueueItem:Lo/_long;

    invoke-virtual {v2}, Lo/JdkDeserializers;->onSetShuffleMode()I

    move-result v2

    add-int/2addr v0, v1

    add-int/2addr v2, v0

    .line 2949
    iget-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->onAddQueueItem:Lo/_long;

    invoke-virtual {v0}, Lo/JdkDeserializers;->onAddQueueItem()I

    move-result v0

    add-int/2addr p1, p2

    add-int/2addr v0, p1

    .line 2950
    iget p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:I

    const/high16 p2, -0x80000000

    if-eq p1, p2, :cond_9b

    if-nez p1, :cond_aa

    .line 2951
    :cond_9b
    iget p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaBrowserCompatSearchResultReceiver:I

    int-to-float v1, p1

    iget v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->AudioAttributesImplApi21Parcelizer:F

    iget v3, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->write:I

    sub-int/2addr v3, p1

    int-to-float p1, v3

    mul-float/2addr v2, p1

    add-float/2addr v1, v2

    float-to-int v2, v1

    .line 2952
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 2954
    :cond_aa
    iget p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaBrowserCompatItemReceiver:I

    if-eq p1, p2, :cond_b0

    if-nez p1, :cond_bf

    .line 2955
    :cond_b0
    iget p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaBrowserCompatMediaItem:I

    int-to-float p2, p1

    iget v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->AudioAttributesImplApi21Parcelizer:F

    iget v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->IconCompatParcelizer:I

    sub-int/2addr v1, p1

    int-to-float p1, v1

    mul-float/2addr v0, p1

    add-float/2addr p2, v0

    float-to-int v0, p2

    .line 2956
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 2958
    :cond_bf
    invoke-virtual {p0, v2, v0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->setMeasuredDimension(II)V

    .line 2960
    :cond_c2
    invoke-direct {p0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->onCommand()V

    return-void
.end method

.method public onNestedFling(Landroid/view/View;FFZ)Z
    .registers 5

    const/4 p0, 0x0

    return p0
.end method

.method public onNestedPreFling(Landroid/view/View;FF)Z
    .registers 4

    const/4 p0, 0x0

    return p0
.end method

.method public onRtlPropertiesChanged(I)V
    .registers 2

    .line 4190
    iget-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaDescriptionCompat:Lo/PrimitiveArrayDeserializersFloatDeser;

    if-eqz p1, :cond_b

    .line 4191
    invoke-virtual {p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->handleMediaPlayPauseIfPendingOnHandler()Z

    move-result p0

    invoke-virtual {p1, p0}, Lo/PrimitiveArrayDeserializersFloatDeser;->AudioAttributesCompatParcelizer(Z)V

    :cond_b
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .registers 4

    .line 4126
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaDescriptionCompat:Lo/PrimitiveArrayDeserializersFloatDeser;

    if-eqz v0, :cond_42

    iget-boolean v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onSetRating:Z

    if-eqz v1, :cond_42

    invoke-virtual {v0}, Lo/PrimitiveArrayDeserializersFloatDeser;->onCommand()Z

    move-result v0

    if-eqz v0, :cond_42

    .line 4127
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaDescriptionCompat:Lo/PrimitiveArrayDeserializersFloatDeser;

    iget-object v0, v0, Lo/PrimitiveArrayDeserializersFloatDeser;->write:Lo/PrimitiveArrayDeserializersFloatDeser$AudioAttributesCompatParcelizer;

    if-eqz v0, :cond_1f

    .line 4128
    invoke-virtual {v0}, Lo/PrimitiveArrayDeserializersFloatDeser$AudioAttributesCompatParcelizer;->AudioAttributesImplBaseParcelizer()Z

    move-result v0

    if-nez v0, :cond_1f

    .line 4129
    invoke-super {p0, p1}, Landroidx/constraintlayout/widget/ConstraintLayout;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p0

    return p0

    .line 4131
    :cond_1f
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaDescriptionCompat:Lo/PrimitiveArrayDeserializersFloatDeser;

    invoke-virtual {p0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->write()I

    move-result v1

    invoke-virtual {v0, p1, v1, p0}, Lo/PrimitiveArrayDeserializersFloatDeser;->AudioAttributesCompatParcelizer(Landroid/view/MotionEvent;ILandroidx/constraintlayout/motion/widget/MotionLayout;)V

    .line 4132
    iget-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaDescriptionCompat:Lo/PrimitiveArrayDeserializersFloatDeser;

    iget-object p1, p1, Lo/PrimitiveArrayDeserializersFloatDeser;->write:Lo/PrimitiveArrayDeserializersFloatDeser$AudioAttributesCompatParcelizer;

    const/4 v0, 0x4

    invoke-virtual {p1, v0}, Lo/PrimitiveArrayDeserializersFloatDeser$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer(I)Z

    move-result p1

    if-eqz p1, :cond_40

    .line 4133
    iget-object p0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaDescriptionCompat:Lo/PrimitiveArrayDeserializersFloatDeser;

    iget-object p0, p0, Lo/PrimitiveArrayDeserializersFloatDeser;->write:Lo/PrimitiveArrayDeserializersFloatDeser$AudioAttributesCompatParcelizer;

    invoke-virtual {p0}, Lo/PrimitiveArrayDeserializersFloatDeser$AudioAttributesCompatParcelizer;->RemoteActionCompatParcelizer()Lo/PrimitiveArrayDeserializersShortDeser;

    move-result-object p0

    invoke-virtual {p0}, Lo/PrimitiveArrayDeserializersShortDeser;->MediaMetadataCompat()Z

    move-result p0

    return p0

    :cond_40
    const/4 p0, 0x1

    return p0

    .line 4140
    :cond_42
    invoke-super {p0, p1}, Landroidx/constraintlayout/widget/ConstraintLayout;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p0

    return p0
.end method

.method public onViewAdded(Landroid/view/View;)V
    .registers 3

    .line 4478
    invoke-super {p0, p1}, Landroidx/constraintlayout/widget/ConstraintLayout;->onViewAdded(Landroid/view/View;)V

    .line 4479
    instance-of v0, p1, Landroidx/constraintlayout/motion/widget/MotionHelper;

    if-eqz v0, :cond_5b

    .line 4480
    check-cast p1, Landroidx/constraintlayout/motion/widget/MotionHelper;

    .line 4481
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->addOnPictureInPictureModeChangedListener:Ljava/util/concurrent/CopyOnWriteArrayList;

    if-nez v0, :cond_14

    .line 4482
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->addOnPictureInPictureModeChangedListener:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 4484
    :cond_14
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->addOnPictureInPictureModeChangedListener:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 4486
    invoke-virtual {p1}, Landroidx/constraintlayout/motion/widget/MotionHelper;->RemoteActionCompatParcelizer()Z

    move-result v0

    if-eqz v0, :cond_2f

    .line 4487
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->_init_lambda2:Ljava/util/ArrayList;

    if-nez v0, :cond_2a

    .line 4488
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->_init_lambda2:Ljava/util/ArrayList;

    .line 4490
    :cond_2a
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->_init_lambda2:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 4492
    :cond_2f
    invoke-virtual {p1}, Landroidx/constraintlayout/motion/widget/MotionHelper;->read()Z

    move-result v0

    if-eqz v0, :cond_45

    .line 4493
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0:Ljava/util/ArrayList;

    if-nez v0, :cond_40

    .line 4494
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0:Ljava/util/ArrayList;

    .line 4496
    :cond_40
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 4498
    :cond_45
    invoke-virtual {p1}, Landroidx/constraintlayout/motion/widget/MotionHelper;->IconCompatParcelizer()Z

    move-result v0

    if-eqz v0, :cond_5b

    .line 4499
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onPlayFromSearch:Ljava/util/ArrayList;

    if-nez v0, :cond_56

    .line 4500
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onPlayFromSearch:Ljava/util/ArrayList;

    .line 4502
    :cond_56
    iget-object p0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onPlayFromSearch:Ljava/util/ArrayList;

    invoke-virtual {p0, p1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    :cond_5b
    return-void
.end method

.method public onViewRemoved(Landroid/view/View;)V
    .registers 3

    .line 4512
    invoke-super {p0, p1}, Landroidx/constraintlayout/widget/ConstraintLayout;->onViewRemoved(Landroid/view/View;)V

    .line 4513
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->_init_lambda2:Ljava/util/ArrayList;

    if-eqz v0, :cond_a

    .line 4514
    invoke-virtual {v0, p1}, Ljava/util/AbstractCollection;->remove(Ljava/lang/Object;)Z

    .line 4516
    :cond_a
    iget-object p0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0:Ljava/util/ArrayList;

    if-eqz p0, :cond_11

    .line 4517
    invoke-virtual {p0, p1}, Ljava/util/AbstractCollection;->remove(Ljava/lang/Object;)Z

    :cond_11
    return-void
.end method

.method public final read()V
    .registers 2

    .line 4379
    iget-object p0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->addOnPictureInPictureModeChangedListener:Ljava/util/concurrent/CopyOnWriteArrayList;

    if-eqz p0, :cond_15

    .line 4380
    invoke-virtual {p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_8
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_15

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi26Parcelizer;

    goto :goto_8

    :cond_15
    return-void
.end method

.method public final read(I)V
    .registers 2

    const/4 p1, 0x0

    .line 3825
    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->handleMediaPlayPauseIfPendingOnHandler:Lo/StdDelegatingDeserializer;

    return-void
.end method

.method public read(Landroid/view/View;IIIII[I)V
    .registers 8

    .line 3003
    iget-boolean p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->addOnTrimMemoryListener:Z

    const/4 p6, 0x0

    if-nez p1, :cond_9

    if-nez p2, :cond_9

    if-eqz p3, :cond_14

    .line 3004
    :cond_9
    aget p1, p7, p6

    add-int/2addr p1, p4

    aput p1, p7, p6

    const/4 p1, 0x1

    .line 3005
    aget p2, p7, p1

    add-int/2addr p2, p5

    aput p2, p7, p1

    .line 3007
    :cond_14
    iput-boolean p6, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->addOnTrimMemoryListener:Z

    return-void
.end method

.method public read(Landroid/view/View;Landroid/view/View;II)V
    .registers 5

    .line 2982
    invoke-static {}, Landroidx/constraintlayout/motion/widget/MotionLayout;->onPause()J

    move-result-wide p1

    iput-wide p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->ensureViewModelStore:J

    const/4 p1, 0x0

    .line 2983
    iput p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->_init_lambda4:F

    .line 2984
    iput p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->addObserverForBackInvoker:F

    .line 2985
    iput p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->addObserverForBackInvokerlambda7:F

    return-void
.end method

.method public requestLayout()V
    .registers 5

    .line 2881
    iget-boolean v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->AudioAttributesImplApi26Parcelizer:Z

    if-nez v0, :cond_38

    .line 2882
    iget v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->AudioAttributesCompatParcelizer:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_38

    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaDescriptionCompat:Lo/PrimitiveArrayDeserializersFloatDeser;

    if-eqz v0, :cond_38

    iget-object v0, v0, Lo/PrimitiveArrayDeserializersFloatDeser;->write:Lo/PrimitiveArrayDeserializersFloatDeser$AudioAttributesCompatParcelizer;

    if-eqz v0, :cond_38

    .line 2884
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaDescriptionCompat:Lo/PrimitiveArrayDeserializersFloatDeser;

    iget-object v0, v0, Lo/PrimitiveArrayDeserializersFloatDeser;->write:Lo/PrimitiveArrayDeserializersFloatDeser$AudioAttributesCompatParcelizer;

    invoke-virtual {v0}, Lo/PrimitiveArrayDeserializersFloatDeser$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer()I

    move-result v0

    if-eqz v0, :cond_37

    const/4 v1, 0x2

    if-ne v0, v1, :cond_38

    .line 2888
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_23
    if-ge v1, v0, :cond_37

    .line 2890
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 2891
    iget-object v3, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaBrowserCompatCustomActionResultReceiver:Ljava/util/HashMap;

    invoke-virtual {v3, v2}, Ljava/util/AbstractMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo/handleSingleElementUnwrapped;

    .line 2892
    invoke-virtual {v2}, Lo/handleSingleElementUnwrapped;->AudioAttributesImplApi26Parcelizer()V

    add-int/lit8 v1, v1, 0x1

    goto :goto_23

    :cond_37
    return-void

    .line 2898
    :cond_38
    invoke-super {p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->requestLayout()V

    return-void
.end method

.method public setDebugMode(I)V
    .registers 2

    .line 3988
    iput p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->read:I

    .line 3989
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setDelayedApplicationOfInitialState(Z)V
    .registers 2

    .line 4879
    iput-boolean p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onPrepareFromMediaId:Z

    return-void
.end method

.method public setInteractionEnabled(Z)V
    .registers 2

    .line 4784
    iput-boolean p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onSetRating:Z

    return-void
.end method

.method public setInterpolatedProgress(F)V
    .registers 3

    .line 1564
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaDescriptionCompat:Lo/PrimitiveArrayDeserializersFloatDeser;

    if-eqz v0, :cond_19

    .line 1565
    sget-object v0, Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi21Parcelizer;->read:Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi21Parcelizer;

    invoke-virtual {p0, v0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->write(Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi21Parcelizer;)V

    .line 1566
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaDescriptionCompat:Lo/PrimitiveArrayDeserializersFloatDeser;

    invoke-virtual {v0}, Lo/PrimitiveArrayDeserializersFloatDeser;->AudioAttributesImplBaseParcelizer()Landroid/view/animation/Interpolator;

    move-result-object v0

    if-eqz v0, :cond_19

    .line 1568
    invoke-interface {v0, p1}, Landroid/view/animation/Interpolator;->getInterpolation(F)F

    move-result p1

    invoke-virtual {p0, p1}, Landroidx/constraintlayout/motion/widget/MotionLayout;->setProgress(F)V

    return-void

    .line 1572
    :cond_19
    invoke-virtual {p0, p1}, Landroidx/constraintlayout/motion/widget/MotionLayout;->setProgress(F)V

    return-void
.end method

.method public setOnHide(F)V
    .registers 5

    .line 4532
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0:Ljava/util/ArrayList;

    if-eqz v0, :cond_19

    .line 4533
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_9
    if-ge v1, v0, :cond_19

    .line 4535
    iget-object v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/constraintlayout/motion/widget/MotionHelper;

    .line 4536
    invoke-virtual {v2, p1}, Landroidx/constraintlayout/motion/widget/MotionHelper;->setProgress(F)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_9

    :cond_19
    return-void
.end method

.method public setOnShow(F)V
    .registers 5

    .line 4522
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->_init_lambda2:Ljava/util/ArrayList;

    if-eqz v0, :cond_19

    .line 4523
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_9
    if-ge v1, v0, :cond_19

    .line 4525
    iget-object v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->_init_lambda2:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/constraintlayout/motion/widget/MotionHelper;

    .line 4526
    invoke-virtual {v2, p1}, Landroidx/constraintlayout/motion/widget/MotionHelper;->setProgress(F)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_9

    :cond_19
    return-void
.end method

.method public setProgress(F)V
    .registers 5

    const/4 v0, 0x0

    cmpg-float v1, p1, v0

    .line 1709
    invoke-virtual {p0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->isAttachedToWindow()Z

    move-result v2

    if-nez v2, :cond_1a

    .line 1710
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->accessonBackPresseds1027565324:Landroidx/constraintlayout/motion/widget/MotionLayout$MediaBrowserCompatCustomActionResultReceiver;

    if-nez v0, :cond_14

    .line 1711
    new-instance v0, Landroidx/constraintlayout/motion/widget/MotionLayout$MediaBrowserCompatCustomActionResultReceiver;

    invoke-direct {v0, p0}, Landroidx/constraintlayout/motion/widget/MotionLayout$MediaBrowserCompatCustomActionResultReceiver;-><init>(Landroidx/constraintlayout/motion/widget/MotionLayout;)V

    iput-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->accessonBackPresseds1027565324:Landroidx/constraintlayout/motion/widget/MotionLayout$MediaBrowserCompatCustomActionResultReceiver;

    .line 1713
    :cond_14
    iget-object p0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->accessonBackPresseds1027565324:Landroidx/constraintlayout/motion/widget/MotionLayout$MediaBrowserCompatCustomActionResultReceiver;

    invoke-virtual {p0, p1}, Landroidx/constraintlayout/motion/widget/MotionLayout$MediaBrowserCompatCustomActionResultReceiver;->AudioAttributesCompatParcelizer(F)V

    return-void

    :cond_1a
    const/high16 v2, 0x3f800000    # 1.0f

    if-gtz v1, :cond_3f

    .line 1724
    iget v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onCustomAction:F

    cmpl-float v1, v1, v2

    if-nez v1, :cond_2f

    iget v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->AudioAttributesCompatParcelizer:I

    iget v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onPrepareFromUri:I

    if-ne v1, v2, :cond_2f

    .line 1725
    sget-object v1, Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi21Parcelizer;->read:Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi21Parcelizer;

    invoke-virtual {p0, v1}, Landroidx/constraintlayout/motion/widget/MotionLayout;->write(Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi21Parcelizer;)V

    .line 1728
    :cond_2f
    iget v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onPlay:I

    iput v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->AudioAttributesCompatParcelizer:I

    .line 1729
    iget v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onCustomAction:F

    cmpl-float v0, v1, v0

    if-nez v0, :cond_6c

    .line 1730
    sget-object v0, Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi21Parcelizer;->write:Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi21Parcelizer;

    invoke-virtual {p0, v0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->write(Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi21Parcelizer;)V

    goto :goto_6c

    :cond_3f
    cmpl-float v1, p1, v2

    if-ltz v1, :cond_64

    .line 1733
    iget v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onCustomAction:F

    cmpl-float v0, v1, v0

    if-nez v0, :cond_54

    iget v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->AudioAttributesCompatParcelizer:I

    iget v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onPlay:I

    if-ne v0, v1, :cond_54

    .line 1734
    sget-object v0, Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi21Parcelizer;->read:Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi21Parcelizer;

    invoke-virtual {p0, v0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->write(Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi21Parcelizer;)V

    .line 1737
    :cond_54
    iget v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onPrepareFromUri:I

    iput v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->AudioAttributesCompatParcelizer:I

    .line 1738
    iget v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onCustomAction:F

    cmpl-float v0, v0, v2

    if-nez v0, :cond_6c

    .line 1739
    sget-object v0, Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi21Parcelizer;->write:Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi21Parcelizer;

    invoke-virtual {p0, v0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->write(Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi21Parcelizer;)V

    goto :goto_6c

    :cond_64
    const/4 v0, -0x1

    .line 1742
    iput v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->AudioAttributesCompatParcelizer:I

    .line 1743
    sget-object v0, Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi21Parcelizer;->read:Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi21Parcelizer;

    invoke-virtual {p0, v0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->write(Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi21Parcelizer;)V

    .line 1746
    :cond_6c
    :goto_6c
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaDescriptionCompat:Lo/PrimitiveArrayDeserializersFloatDeser;

    if-nez v0, :cond_71

    return-void

    :cond_71
    const/4 v0, 0x1

    .line 1750
    iput-boolean v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->addOnConfigurationChangedListener:Z

    .line 1751
    iput p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->getOnBackPressedDispatcherannotations:F

    .line 1752
    iput p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->addOnMultiWindowModeChangedListener:F

    const-wide/16 v1, -0x1

    .line 1753
    iput-wide v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->addOnContextAvailableListener:J

    .line 1754
    iput-wide v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onMediaButtonEvent:J

    const/4 p1, 0x0

    .line 1755
    iput-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onSetRepeatMode:Landroid/view/animation/Interpolator;

    .line 1757
    iput-boolean v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onRemoveQueueItem:Z

    .line 1758
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setProgress(FF)V
    .registers 5

    .line 1582
    invoke-virtual {p0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->isAttachedToWindow()Z

    move-result v0

    if-nez v0, :cond_1c

    .line 1583
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->accessonBackPresseds1027565324:Landroidx/constraintlayout/motion/widget/MotionLayout$MediaBrowserCompatCustomActionResultReceiver;

    if-nez v0, :cond_11

    .line 1584
    new-instance v0, Landroidx/constraintlayout/motion/widget/MotionLayout$MediaBrowserCompatCustomActionResultReceiver;

    invoke-direct {v0, p0}, Landroidx/constraintlayout/motion/widget/MotionLayout$MediaBrowserCompatCustomActionResultReceiver;-><init>(Landroidx/constraintlayout/motion/widget/MotionLayout;)V

    iput-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->accessonBackPresseds1027565324:Landroidx/constraintlayout/motion/widget/MotionLayout$MediaBrowserCompatCustomActionResultReceiver;

    .line 1586
    :cond_11
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->accessonBackPresseds1027565324:Landroidx/constraintlayout/motion/widget/MotionLayout$MediaBrowserCompatCustomActionResultReceiver;

    invoke-virtual {v0, p1}, Landroidx/constraintlayout/motion/widget/MotionLayout$MediaBrowserCompatCustomActionResultReceiver;->AudioAttributesCompatParcelizer(F)V

    .line 1587
    iget-object p0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->accessonBackPresseds1027565324:Landroidx/constraintlayout/motion/widget/MotionLayout$MediaBrowserCompatCustomActionResultReceiver;

    invoke-virtual {p0, p2}, Landroidx/constraintlayout/motion/widget/MotionLayout$MediaBrowserCompatCustomActionResultReceiver;->read(F)V

    return-void

    .line 1590
    :cond_1c
    invoke-virtual {p0, p1}, Landroidx/constraintlayout/motion/widget/MotionLayout;->setProgress(F)V

    .line 1591
    sget-object v0, Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi21Parcelizer;->read:Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi21Parcelizer;

    invoke-virtual {p0, v0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->write(Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi21Parcelizer;)V

    .line 1592
    iput p2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->AudioAttributesImplBaseParcelizer:F

    const/4 v0, 0x0

    cmpl-float p2, p2, v0

    const/high16 v1, 0x3f800000    # 1.0f

    if-eqz p2, :cond_34

    if-lez p2, :cond_30

    move v0, v1

    .line 1594
    :cond_30
    invoke-direct {p0, v0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->AudioAttributesCompatParcelizer(F)V

    return-void

    :cond_34
    cmpl-float p2, p1, v0

    if-eqz p2, :cond_46

    cmpl-float p2, p1, v1

    if-eqz p2, :cond_46

    const/high16 p2, 0x3f000000    # 0.5f

    cmpl-float p1, p1, p2

    if-lez p1, :cond_43

    move v0, v1

    .line 1596
    :cond_43
    invoke-direct {p0, v0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->AudioAttributesCompatParcelizer(F)V

    :cond_46
    return-void
.end method

.method public setScene(Lo/PrimitiveArrayDeserializersFloatDeser;)V
    .registers 3

    .line 3885
    iput-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaDescriptionCompat:Lo/PrimitiveArrayDeserializersFloatDeser;

    .line 3886
    invoke-virtual {p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->handleMediaPlayPauseIfPendingOnHandler()Z

    move-result v0

    invoke-virtual {p1, v0}, Lo/PrimitiveArrayDeserializersFloatDeser;->AudioAttributesCompatParcelizer(Z)V

    .line 3887
    invoke-direct {p0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->onPlay()V

    return-void
.end method

.method public setState(III)V
    .registers 5

    .line 1547
    sget-object v0, Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi21Parcelizer;->RemoteActionCompatParcelizer:Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi21Parcelizer;

    invoke-virtual {p0, v0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->write(Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi21Parcelizer;)V

    .line 1548
    iput p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->AudioAttributesCompatParcelizer:I

    const/4 v0, -0x1

    .line 1549
    iput v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onPlay:I

    .line 1550
    iput v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onPrepareFromUri:I

    .line 1551
    iget-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->handleMediaPlayPauseIfPendingOnHandler:Lo/StdDelegatingDeserializer;

    if-eqz v0, :cond_18

    .line 1552
    iget-object p0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->handleMediaPlayPauseIfPendingOnHandler:Lo/StdDelegatingDeserializer;

    int-to-float p2, p2

    int-to-float p3, p3

    invoke-virtual {p0, p1, p2, p3}, Lo/StdDelegatingDeserializer;->IconCompatParcelizer(IFF)V

    return-void

    .line 1553
    :cond_18
    iget-object p2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaDescriptionCompat:Lo/PrimitiveArrayDeserializersFloatDeser;

    if-eqz p2, :cond_23

    .line 1554
    invoke-virtual {p2, p1}, Lo/PrimitiveArrayDeserializersFloatDeser;->RemoteActionCompatParcelizer(I)Lo/ReferenceTypeDeserializer;

    move-result-object p1

    invoke-virtual {p1, p0}, Lo/ReferenceTypeDeserializer;->write(Landroidx/constraintlayout/widget/ConstraintLayout;)V

    :cond_23
    return-void
.end method

.method public setTransition(I)V
    .registers 8

    .line 1362
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaDescriptionCompat:Lo/PrimitiveArrayDeserializersFloatDeser;

    if-eqz v0, :cond_ac

    .line 1363
    invoke-virtual {p0, p1}, Landroidx/constraintlayout/motion/widget/MotionLayout;->write(I)Lo/PrimitiveArrayDeserializersFloatDeser$AudioAttributesCompatParcelizer;

    move-result-object p1

    .line 1365
    invoke-virtual {p1}, Lo/PrimitiveArrayDeserializersFloatDeser$AudioAttributesCompatParcelizer;->read()I

    move-result v0

    iput v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onPlay:I

    .line 1366
    invoke-virtual {p1}, Lo/PrimitiveArrayDeserializersFloatDeser$AudioAttributesCompatParcelizer;->write()I

    move-result v0

    iput v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onPrepareFromUri:I

    .line 1368
    invoke-virtual {p0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->isAttachedToWindow()Z

    move-result v0

    if-nez v0, :cond_34

    .line 1369
    iget-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->accessonBackPresseds1027565324:Landroidx/constraintlayout/motion/widget/MotionLayout$MediaBrowserCompatCustomActionResultReceiver;

    if-nez p1, :cond_25

    .line 1370
    new-instance p1, Landroidx/constraintlayout/motion/widget/MotionLayout$MediaBrowserCompatCustomActionResultReceiver;

    invoke-direct {p1, p0}, Landroidx/constraintlayout/motion/widget/MotionLayout$MediaBrowserCompatCustomActionResultReceiver;-><init>(Landroidx/constraintlayout/motion/widget/MotionLayout;)V

    iput-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->accessonBackPresseds1027565324:Landroidx/constraintlayout/motion/widget/MotionLayout$MediaBrowserCompatCustomActionResultReceiver;

    .line 1372
    :cond_25
    iget-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->accessonBackPresseds1027565324:Landroidx/constraintlayout/motion/widget/MotionLayout$MediaBrowserCompatCustomActionResultReceiver;

    iget v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onPlay:I

    invoke-virtual {p1, v0}, Landroidx/constraintlayout/motion/widget/MotionLayout$MediaBrowserCompatCustomActionResultReceiver;->AudioAttributesCompatParcelizer(I)V

    .line 1373
    iget-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->accessonBackPresseds1027565324:Landroidx/constraintlayout/motion/widget/MotionLayout$MediaBrowserCompatCustomActionResultReceiver;

    iget p0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onPrepareFromUri:I

    invoke-virtual {p1, p0}, Landroidx/constraintlayout/motion/widget/MotionLayout$MediaBrowserCompatCustomActionResultReceiver;->read(I)V

    return-void

    .line 1385
    :cond_34
    iget v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->AudioAttributesCompatParcelizer:I

    iget v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onPlay:I

    const/high16 v2, 0x3f800000    # 1.0f

    const/4 v3, 0x0

    if-ne v0, v1, :cond_3f

    move v0, v3

    goto :goto_47

    .line 1387
    :cond_3f
    iget v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onPrepareFromUri:I

    if-ne v0, v1, :cond_45

    move v0, v2

    goto :goto_47

    :cond_45
    const/high16 v0, 0x7fc00000    # Float.NaN

    .line 1390
    :goto_47
    iget-object v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaDescriptionCompat:Lo/PrimitiveArrayDeserializersFloatDeser;

    invoke-virtual {v1, p1}, Lo/PrimitiveArrayDeserializersFloatDeser;->IconCompatParcelizer(Lo/PrimitiveArrayDeserializersFloatDeser$AudioAttributesCompatParcelizer;)V

    .line 1391
    iget-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->r8lambdaKUbBm7ckfqTc9QCgukC86fguu4:Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;

    iget-object v1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->onAddQueueItem:Lo/_long;

    iget-object v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaDescriptionCompat:Lo/PrimitiveArrayDeserializersFloatDeser;

    iget v4, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onPlay:I

    invoke-virtual {v1, v4}, Lo/PrimitiveArrayDeserializersFloatDeser;->RemoteActionCompatParcelizer(I)Lo/ReferenceTypeDeserializer;

    move-result-object v1

    iget-object v4, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaDescriptionCompat:Lo/PrimitiveArrayDeserializersFloatDeser;

    iget v5, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onPrepareFromUri:I

    invoke-virtual {v4, v5}, Lo/PrimitiveArrayDeserializersFloatDeser;->RemoteActionCompatParcelizer(I)Lo/ReferenceTypeDeserializer;

    move-result-object v4

    invoke-virtual {p1, v1, v4}, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->read(Lo/ReferenceTypeDeserializer;Lo/ReferenceTypeDeserializer;)V

    .line 1392
    invoke-direct {p0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->onPlay()V

    .line 1394
    iget p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onCustomAction:F

    cmpl-float p1, p1, v0

    if-eqz p1, :cond_93

    cmpl-float p1, v0, v3

    if-nez p1, :cond_80

    const/4 p1, 0x1

    .line 1398
    invoke-virtual {p0, p1}, Landroidx/constraintlayout/motion/widget/MotionLayout;->IconCompatParcelizer(Z)V

    .line 1399
    iget-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaDescriptionCompat:Lo/PrimitiveArrayDeserializersFloatDeser;

    iget v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onPlay:I

    invoke-virtual {p1, v1}, Lo/PrimitiveArrayDeserializersFloatDeser;->RemoteActionCompatParcelizer(I)Lo/ReferenceTypeDeserializer;

    move-result-object p1

    invoke-virtual {p1, p0}, Lo/ReferenceTypeDeserializer;->write(Landroidx/constraintlayout/widget/ConstraintLayout;)V

    goto :goto_93

    :cond_80
    cmpl-float p1, v0, v2

    if-nez p1, :cond_93

    const/4 p1, 0x0

    .line 1401
    invoke-virtual {p0, p1}, Landroidx/constraintlayout/motion/widget/MotionLayout;->IconCompatParcelizer(Z)V

    .line 1402
    iget-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaDescriptionCompat:Lo/PrimitiveArrayDeserializersFloatDeser;

    iget v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onPrepareFromUri:I

    invoke-virtual {p1, v1}, Lo/PrimitiveArrayDeserializersFloatDeser;->RemoteActionCompatParcelizer(I)Lo/ReferenceTypeDeserializer;

    move-result-object p1

    invoke-virtual {p1, p0}, Lo/ReferenceTypeDeserializer;->write(Landroidx/constraintlayout/widget/ConstraintLayout;)V

    .line 1406
    :cond_93
    :goto_93
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result p1

    if-nez p1, :cond_9a

    move v3, v0

    :cond_9a
    iput v3, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onCustomAction:F

    .line 1408
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result p1

    if-eqz p1, :cond_a9

    .line 1409
    invoke-static {}, Lo/NumberDeserializersShortDeserializer;->RemoteActionCompatParcelizer()Ljava/lang/String;

    .line 1410
    invoke-virtual {p0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaBrowserCompatSearchResultReceiver()V

    return-void

    .line 1412
    :cond_a9
    invoke-virtual {p0, v0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->setProgress(F)V

    :cond_ac
    return-void
.end method

.method public setTransition(II)V
    .registers 5

    .line 1330
    invoke-virtual {p0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->isAttachedToWindow()Z

    move-result v0

    if-nez v0, :cond_1c

    .line 1331
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->accessonBackPresseds1027565324:Landroidx/constraintlayout/motion/widget/MotionLayout$MediaBrowserCompatCustomActionResultReceiver;

    if-nez v0, :cond_11

    .line 1332
    new-instance v0, Landroidx/constraintlayout/motion/widget/MotionLayout$MediaBrowserCompatCustomActionResultReceiver;

    invoke-direct {v0, p0}, Landroidx/constraintlayout/motion/widget/MotionLayout$MediaBrowserCompatCustomActionResultReceiver;-><init>(Landroidx/constraintlayout/motion/widget/MotionLayout;)V

    iput-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->accessonBackPresseds1027565324:Landroidx/constraintlayout/motion/widget/MotionLayout$MediaBrowserCompatCustomActionResultReceiver;

    .line 1334
    :cond_11
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->accessonBackPresseds1027565324:Landroidx/constraintlayout/motion/widget/MotionLayout$MediaBrowserCompatCustomActionResultReceiver;

    invoke-virtual {v0, p1}, Landroidx/constraintlayout/motion/widget/MotionLayout$MediaBrowserCompatCustomActionResultReceiver;->AudioAttributesCompatParcelizer(I)V

    .line 1335
    iget-object p0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->accessonBackPresseds1027565324:Landroidx/constraintlayout/motion/widget/MotionLayout$MediaBrowserCompatCustomActionResultReceiver;

    invoke-virtual {p0, p2}, Landroidx/constraintlayout/motion/widget/MotionLayout$MediaBrowserCompatCustomActionResultReceiver;->read(I)V

    return-void

    .line 1339
    :cond_1c
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaDescriptionCompat:Lo/PrimitiveArrayDeserializersFloatDeser;

    if-eqz v0, :cond_43

    .line 1340
    iput p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onPlay:I

    .line 1341
    iput p2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onPrepareFromUri:I

    .line 1347
    invoke-virtual {v0, p1, p2}, Lo/PrimitiveArrayDeserializersFloatDeser;->RemoteActionCompatParcelizer(II)V

    .line 1348
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->r8lambdaKUbBm7ckfqTc9QCgukC86fguu4:Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;

    iget-object v1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->onAddQueueItem:Lo/_long;

    iget-object v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaDescriptionCompat:Lo/PrimitiveArrayDeserializersFloatDeser;

    invoke-virtual {v1, p1}, Lo/PrimitiveArrayDeserializersFloatDeser;->RemoteActionCompatParcelizer(I)Lo/ReferenceTypeDeserializer;

    move-result-object p1

    iget-object v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaDescriptionCompat:Lo/PrimitiveArrayDeserializersFloatDeser;

    invoke-virtual {v1, p2}, Lo/PrimitiveArrayDeserializersFloatDeser;->RemoteActionCompatParcelizer(I)Lo/ReferenceTypeDeserializer;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->read(Lo/ReferenceTypeDeserializer;Lo/ReferenceTypeDeserializer;)V

    .line 1349
    invoke-direct {p0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->onPlay()V

    const/4 p1, 0x0

    .line 1350
    iput p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onCustomAction:F

    .line 1351
    invoke-virtual {p0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaBrowserCompatSearchResultReceiver()V

    :cond_43
    return-void
.end method

.method public setTransitionDuration(I)V
    .registers 2

    .line 4722
    iget-object p0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaDescriptionCompat:Lo/PrimitiveArrayDeserializersFloatDeser;

    if-nez p0, :cond_5

    return-void

    .line 4726
    :cond_5
    invoke-virtual {p0, p1}, Lo/PrimitiveArrayDeserializersFloatDeser;->IconCompatParcelizer(I)V

    return-void
.end method

.method public setTransitionListener(Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi26Parcelizer;)V
    .registers 2

    .line 4290
    iput-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->addOnNewIntentListener:Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi26Parcelizer;

    return-void
.end method

.method public setTransitionState(Landroid/os/Bundle;)V
    .registers 3

    .line 1680
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->accessonBackPresseds1027565324:Landroidx/constraintlayout/motion/widget/MotionLayout$MediaBrowserCompatCustomActionResultReceiver;

    if-nez v0, :cond_b

    .line 1681
    new-instance v0, Landroidx/constraintlayout/motion/widget/MotionLayout$MediaBrowserCompatCustomActionResultReceiver;

    invoke-direct {v0, p0}, Landroidx/constraintlayout/motion/widget/MotionLayout$MediaBrowserCompatCustomActionResultReceiver;-><init>(Landroidx/constraintlayout/motion/widget/MotionLayout;)V

    iput-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->accessonBackPresseds1027565324:Landroidx/constraintlayout/motion/widget/MotionLayout$MediaBrowserCompatCustomActionResultReceiver;

    .line 1683
    :cond_b
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->accessonBackPresseds1027565324:Landroidx/constraintlayout/motion/widget/MotionLayout$MediaBrowserCompatCustomActionResultReceiver;

    invoke-virtual {v0, p1}, Landroidx/constraintlayout/motion/widget/MotionLayout$MediaBrowserCompatCustomActionResultReceiver;->IconCompatParcelizer(Landroid/os/Bundle;)V

    .line 1684
    invoke-virtual {p0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->isAttachedToWindow()Z

    move-result p1

    if-eqz p1, :cond_1b

    .line 1685
    iget-object p0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->accessonBackPresseds1027565324:Landroidx/constraintlayout/motion/widget/MotionLayout$MediaBrowserCompatCustomActionResultReceiver;

    invoke-virtual {p0}, Landroidx/constraintlayout/motion/widget/MotionLayout$MediaBrowserCompatCustomActionResultReceiver;->RemoteActionCompatParcelizer()V

    :cond_1b
    return-void
.end method

.method public toString()Ljava/lang/String;
    .registers 4

    .line 2903
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 2904
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onPlay:I

    invoke-static {v0, v2}, Lo/NumberDeserializersShortDeserializer;->IconCompatParcelizer(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "->"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onPrepareFromUri:I

    .line 2905
    invoke-static {v0, v2}, Lo/NumberDeserializersShortDeserializer;->IconCompatParcelizer(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " (pos:"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onCustomAction:F

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v0, " Dpos/Dt:"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->AudioAttributesImplBaseParcelizer:F

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public final write()I
    .registers 1

    .line 4221
    iget p0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->AudioAttributesCompatParcelizer:I

    return p0
.end method

.method public final write(I)Lo/PrimitiveArrayDeserializersFloatDeser$AudioAttributesCompatParcelizer;
    .registers 2

    .line 4736
    iget-object p0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaDescriptionCompat:Lo/PrimitiveArrayDeserializersFloatDeser;

    invoke-virtual {p0, p1}, Lo/PrimitiveArrayDeserializersFloatDeser;->write(I)Lo/PrimitiveArrayDeserializersFloatDeser$AudioAttributesCompatParcelizer;

    move-result-object p0

    return-object p0
.end method

.method public final write(IFFF[F)V
    .registers 8

    .line 4248
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaBrowserCompatCustomActionResultReceiver:Ljava/util/HashMap;

    invoke-virtual {p0, p1}, Landroidx/constraintlayout/widget/ConstraintLayout;->MediaBrowserCompatItemReceiver(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/AbstractMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/handleSingleElementUnwrapped;

    if-eqz v0, :cond_1a

    .line 4253
    invoke-virtual {v0, p2, p3, p4, p5}, Lo/handleSingleElementUnwrapped;->write(FFF[F)V

    .line 4254
    invoke-virtual {v1}, Landroid/view/View;->getY()F

    move-result p1

    .line 4262
    iput p2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onPause:F

    .line 4263
    iput p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onPlayFromMediaId:F

    return-void

    :cond_1a
    if-eqz v1, :cond_27

    .line 4266
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    :cond_27
    return-void
.end method

.method public final write(Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi21Parcelizer;)V
    .registers 4

    .line 1199
    sget-object v0, Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi21Parcelizer;->write:Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi21Parcelizer;

    if-ne p1, v0, :cond_9

    iget v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->AudioAttributesCompatParcelizer:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_3f

    .line 1202
    :cond_9
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->getActivityResultRegistry:Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi21Parcelizer;

    .line 1203
    iput-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->getActivityResultRegistry:Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi21Parcelizer;

    .line 1205
    sget-object v1, Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi21Parcelizer;->read:Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi21Parcelizer;

    if-ne v0, v1, :cond_18

    sget-object v1, Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi21Parcelizer;->read:Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi21Parcelizer;

    if-ne p1, v1, :cond_18

    .line 1206
    invoke-direct {p0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()V

    .line 1208
    :cond_18
    sget-object v1, Landroidx/constraintlayout/motion/widget/MotionLayout$3;->read:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_31

    const/4 v1, 0x2

    if-eq v0, v1, :cond_31

    const/4 v1, 0x3

    if-ne v0, v1, :cond_3f

    .line 1219
    sget-object v0, Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi21Parcelizer;->write:Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi21Parcelizer;

    if-ne p1, v0, :cond_3f

    .line 1220
    invoke-direct {p0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->onMediaButtonEvent()V

    return-void

    .line 1211
    :cond_31
    sget-object v0, Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi21Parcelizer;->read:Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi21Parcelizer;

    if-ne p1, v0, :cond_38

    .line 1212
    invoke-direct {p0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()V

    .line 1214
    :cond_38
    sget-object v0, Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi21Parcelizer;->write:Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi21Parcelizer;

    if-ne p1, v0, :cond_3f

    .line 1215
    invoke-direct {p0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->onMediaButtonEvent()V

    :cond_3f
    return-void
.end method

###### Class androidx.constraintlayout.motion.widget.MotionLayout.AnonymousClass2 (androidx.constraintlayout.motion.widget.MotionLayout$2)
.class final Landroidx/constraintlayout/motion/widget/MotionLayout$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/constraintlayout/motion/widget/MotionLayout;->onAttachedToWindow()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic read:Landroidx/constraintlayout/motion/widget/MotionLayout;


# direct methods
.method constructor <init>(Landroidx/constraintlayout/motion/widget/MotionLayout;)V
    .registers 2

    .line 4168
    iput-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$2;->read:Landroidx/constraintlayout/motion/widget/MotionLayout;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 1

    .line 4171
    iget-object p0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$2;->read:Landroidx/constraintlayout/motion/widget/MotionLayout;

    invoke-static {p0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->RemoteActionCompatParcelizer(Landroidx/constraintlayout/motion/widget/MotionLayout;)Landroidx/constraintlayout/motion/widget/MotionLayout$MediaBrowserCompatCustomActionResultReceiver;

    move-result-object p0

    invoke-virtual {p0}, Landroidx/constraintlayout/motion/widget/MotionLayout$MediaBrowserCompatCustomActionResultReceiver;->RemoteActionCompatParcelizer()V

    return-void
.end method

###### Class androidx.constraintlayout.motion.widget.MotionLayout.AnonymousClass3 (androidx.constraintlayout.motion.widget.MotionLayout$3)
.class final synthetic Landroidx/constraintlayout/motion/widget/MotionLayout$3;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/constraintlayout/motion/widget/MotionLayout;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1008
    name = null
.end annotation


# static fields
.field static final synthetic read:[I


# direct methods
.method static constructor <clinit>()V
    .registers 3

    .line 1208
    invoke-static {}, Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi21Parcelizer;->values()[Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi21Parcelizer;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Landroidx/constraintlayout/motion/widget/MotionLayout$3;->read:[I

    :try_start_9
    sget-object v1, Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi21Parcelizer;->IconCompatParcelizer:Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi21Parcelizer;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_12
    .catch Ljava/lang/NoSuchFieldError; {:try_start_9 .. :try_end_12} :catch_12

    :catch_12
    :try_start_12
    sget-object v0, Landroidx/constraintlayout/motion/widget/MotionLayout$3;->read:[I

    sget-object v1, Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi21Parcelizer;->RemoteActionCompatParcelizer:Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi21Parcelizer;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1
    :try_end_1d
    .catch Ljava/lang/NoSuchFieldError; {:try_start_12 .. :try_end_1d} :catch_1d

    :catch_1d
    :try_start_1d
    sget-object v0, Landroidx/constraintlayout/motion/widget/MotionLayout$3;->read:[I

    sget-object v1, Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi21Parcelizer;->read:Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi21Parcelizer;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x3

    aput v2, v0, v1
    :try_end_28
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1d .. :try_end_28} :catch_28

    :catch_28
    :try_start_28
    sget-object v0, Landroidx/constraintlayout/motion/widget/MotionLayout$3;->read:[I

    sget-object v1, Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi21Parcelizer;->write:Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi21Parcelizer;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x4

    aput v2, v0, v1
    :try_end_33
    .catch Ljava/lang/NoSuchFieldError; {:try_start_28 .. :try_end_33} :catch_33

    :catch_33
    return-void
.end method

###### Class androidx.constraintlayout.motion.widget.MotionLayout.AnonymousClass4 (androidx.constraintlayout.motion.widget.MotionLayout$4)
.class final Landroidx/constraintlayout/motion/widget/MotionLayout$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/constraintlayout/motion/widget/MotionLayout;->RemoteActionCompatParcelizer(Landroid/view/View;II[II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic RemoteActionCompatParcelizer:Landroid/view/View;


# direct methods
.method constructor <init>(Landroid/view/View;)V
    .registers 2

    .line 3062
    iput-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$4;->RemoteActionCompatParcelizer:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 2

    .line 3065
    iget-object p0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$4;->RemoteActionCompatParcelizer:Landroid/view/View;

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Landroid/view/View;->setNestedScrollingEnabled(Z)V

    return-void
.end method

###### Class androidx.constraintlayout.motion.widget.MotionLayout.AudioAttributesCompatParcelizer (androidx.constraintlayout.motion.widget.MotionLayout$AudioAttributesCompatParcelizer)
.class final Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesCompatParcelizer;
.super Lo/PrimitiveArrayDeserializersBooleanDeser;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/constraintlayout/motion/widget/MotionLayout;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "AudioAttributesCompatParcelizer"
.end annotation


# instance fields
.field private AudioAttributesCompatParcelizer:F

.field private IconCompatParcelizer:F

.field private RemoteActionCompatParcelizer:F

.field final synthetic write:Landroidx/constraintlayout/motion/widget/MotionLayout;


# direct methods
.method constructor <init>(Landroidx/constraintlayout/motion/widget/MotionLayout;)V
    .registers 2

    .line 2042
    iput-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesCompatParcelizer;->write:Landroidx/constraintlayout/motion/widget/MotionLayout;

    invoke-direct {p0}, Lo/PrimitiveArrayDeserializersBooleanDeser;-><init>()V

    const/4 p1, 0x0

    .line 2043
    iput p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesCompatParcelizer;->RemoteActionCompatParcelizer:F

    .line 2044
    iput p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesCompatParcelizer;->IconCompatParcelizer:F

    return-void
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer()F
    .registers 1

    .line 2075
    iget-object p0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesCompatParcelizer;->write:Landroidx/constraintlayout/motion/widget/MotionLayout;

    iget p0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->AudioAttributesImplBaseParcelizer:F

    return p0
.end method

.method public final RemoteActionCompatParcelizer(FFF)V
    .registers 4

    .line 2048
    iput p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesCompatParcelizer;->RemoteActionCompatParcelizer:F

    .line 2049
    iput p2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesCompatParcelizer;->IconCompatParcelizer:F

    .line 2050
    iput p3, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer:F

    return-void
.end method

.method public final getInterpolation(F)F
    .registers 7

    .line 2055
    iget v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesCompatParcelizer;->RemoteActionCompatParcelizer:F

    const/4 v1, 0x0

    cmpl-float v1, v0, v1

    const/high16 v2, 0x40000000    # 2.0f

    if-lez v1, :cond_24

    .line 2056
    iget v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer:F

    div-float v3, v0, v1

    cmpg-float v4, v3, p1

    if-gez v4, :cond_12

    move p1, v3

    .line 2059
    :cond_12
    iget-object v3, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesCompatParcelizer;->write:Landroidx/constraintlayout/motion/widget/MotionLayout;

    mul-float/2addr v1, p1

    sub-float/2addr v0, v1

    iput v0, v3, Landroidx/constraintlayout/motion/widget/MotionLayout;->AudioAttributesImplBaseParcelizer:F

    .line 2060
    iget v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesCompatParcelizer;->RemoteActionCompatParcelizer:F

    mul-float/2addr v0, p1

    iget v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer:F

    mul-float/2addr v1, p1

    mul-float/2addr v1, p1

    div-float/2addr v1, v2

    sub-float/2addr v0, v1

    .line 2061
    iget p0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesCompatParcelizer;->IconCompatParcelizer:F

    goto :goto_3e

    :cond_24
    neg-float v1, v0

    .line 2064
    iget v3, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer:F

    div-float/2addr v1, v3

    cmpg-float v4, v1, p1

    if-gez v4, :cond_2d

    move p1, v1

    .line 2067
    :cond_2d
    iget-object v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesCompatParcelizer;->write:Landroidx/constraintlayout/motion/widget/MotionLayout;

    mul-float/2addr v3, p1

    add-float/2addr v0, v3

    iput v0, v1, Landroidx/constraintlayout/motion/widget/MotionLayout;->AudioAttributesImplBaseParcelizer:F

    .line 2068
    iget v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesCompatParcelizer;->RemoteActionCompatParcelizer:F

    mul-float/2addr v0, p1

    iget v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer:F

    mul-float/2addr v1, p1

    mul-float/2addr v1, p1

    div-float/2addr v1, v2

    add-float/2addr v0, v1

    .line 2069
    iget p0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesCompatParcelizer;->IconCompatParcelizer:F

    :goto_3e
    add-float/2addr v0, p0

    return v0
.end method

###### Class androidx.constraintlayout.motion.widget.MotionLayout.AudioAttributesImplApi21Parcelizer (androidx.constraintlayout.motion.widget.MotionLayout$AudioAttributesImplApi21Parcelizer)
.class public final enum Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi21Parcelizer;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/constraintlayout/motion/widget/MotionLayout;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "AudioAttributesImplApi21Parcelizer"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi21Parcelizer;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic AudioAttributesCompatParcelizer:[Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi21Parcelizer;

.field public static final enum IconCompatParcelizer:Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi21Parcelizer;

.field public static final enum RemoteActionCompatParcelizer:Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi21Parcelizer;

.field public static final enum read:Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi21Parcelizer;

.field public static final enum write:Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi21Parcelizer;


# direct methods
.method static constructor <clinit>()V
    .registers 3

    .line 1108
    new-instance v0, Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi21Parcelizer;

    const-string v1, "UNDEFINED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi21Parcelizer;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi21Parcelizer;->IconCompatParcelizer:Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi21Parcelizer;

    .line 1109
    new-instance v0, Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi21Parcelizer;

    const-string v1, "SETUP"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi21Parcelizer;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi21Parcelizer;->RemoteActionCompatParcelizer:Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi21Parcelizer;

    .line 1110
    new-instance v0, Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi21Parcelizer;

    const-string v1, "MOVING"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi21Parcelizer;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi21Parcelizer;->read:Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi21Parcelizer;

    .line 1111
    new-instance v0, Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi21Parcelizer;

    const-string v1, "FINISHED"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi21Parcelizer;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi21Parcelizer;->write:Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi21Parcelizer;

    .line 1107
    invoke-static {}, Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi21Parcelizer;->RemoteActionCompatParcelizer()[Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi21Parcelizer;

    move-result-object v0

    sput-object v0, Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi21Parcelizer;->AudioAttributesCompatParcelizer:[Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi21Parcelizer;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1107
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method private static synthetic RemoteActionCompatParcelizer()[Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi21Parcelizer;
    .registers 4

    .line 1107
    sget-object v0, Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi21Parcelizer;->IconCompatParcelizer:Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi21Parcelizer;

    sget-object v1, Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi21Parcelizer;->RemoteActionCompatParcelizer:Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi21Parcelizer;

    sget-object v2, Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi21Parcelizer;->read:Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi21Parcelizer;

    sget-object v3, Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi21Parcelizer;->write:Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi21Parcelizer;

    filled-new-array {v0, v1, v2, v3}, [Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi21Parcelizer;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi21Parcelizer;
    .registers 2

    .line 1107
    const-class v0, Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi21Parcelizer;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi21Parcelizer;

    return-object p0
.end method

.method public static values()[Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi21Parcelizer;
    .registers 1

    .line 1107
    sget-object v0, Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi21Parcelizer;->AudioAttributesCompatParcelizer:[Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi21Parcelizer;

    invoke-virtual {v0}, [Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi21Parcelizer;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi21Parcelizer;

    return-object v0
.end method

###### Class androidx.constraintlayout.motion.widget.MotionLayout.AudioAttributesImplApi26Parcelizer (androidx.constraintlayout.motion.widget.MotionLayout$AudioAttributesImplApi26Parcelizer)
.class public interface abstract Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi26Parcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/constraintlayout/motion/widget/MotionLayout;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "AudioAttributesImplApi26Parcelizer"
.end annotation


# virtual methods
.method public abstract read(I)V
.end method

###### Class androidx.constraintlayout.motion.widget.MotionLayout.IconCompatParcelizer (androidx.constraintlayout.motion.widget.MotionLayout$IconCompatParcelizer)
.class final Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/constraintlayout/motion/widget/MotionLayout;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "IconCompatParcelizer"
.end annotation


# instance fields
.field private AudioAttributesCompatParcelizer:I

.field private AudioAttributesImplApi26Parcelizer:Lo/ReferenceTypeDeserializer;

.field final synthetic IconCompatParcelizer:Landroidx/constraintlayout/motion/widget/MotionLayout;

.field private MediaBrowserCompatCustomActionResultReceiver:I

.field private RemoteActionCompatParcelizer:Lo/_long;

.field private read:Lo/ReferenceTypeDeserializer;

.field private write:Lo/_long;


# direct methods
.method constructor <init>(Landroidx/constraintlayout/motion/widget/MotionLayout;)V
    .registers 2

    .line 2499
    iput-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->IconCompatParcelizer:Landroidx/constraintlayout/motion/widget/MotionLayout;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2500
    new-instance p1, Lo/_long;

    invoke-direct {p1}, Lo/_long;-><init>()V

    iput-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->write:Lo/_long;

    .line 2501
    new-instance p1, Lo/_long;

    invoke-direct {p1}, Lo/_long;-><init>()V

    iput-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->RemoteActionCompatParcelizer:Lo/_long;

    const/4 p1, 0x0

    .line 2502
    iput-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->AudioAttributesImplApi26Parcelizer:Lo/ReferenceTypeDeserializer;

    .line 2503
    iput-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->read:Lo/ReferenceTypeDeserializer;

    return-void
.end method

.method private IconCompatParcelizer(II)V
    .registers 8

    .line 2783
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->IconCompatParcelizer:Landroidx/constraintlayout/motion/widget/MotionLayout;

    invoke-virtual {v0}, Landroidx/constraintlayout/widget/ConstraintLayout;->RatingCompat()I

    move-result v0

    .line 2785
    iget-object v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->IconCompatParcelizer:Landroidx/constraintlayout/motion/widget/MotionLayout;

    iget v1, v1, Landroidx/constraintlayout/motion/widget/MotionLayout;->AudioAttributesCompatParcelizer:I

    iget-object v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->IconCompatParcelizer:Landroidx/constraintlayout/motion/widget/MotionLayout;

    invoke-virtual {v2}, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaBrowserCompatItemReceiver()I

    move-result v2

    if-ne v1, v2, :cond_49

    .line 2786
    iget-object v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->IconCompatParcelizer:Landroidx/constraintlayout/motion/widget/MotionLayout;

    iget-object v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->RemoteActionCompatParcelizer:Lo/_long;

    .line 2787
    iget-object v3, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->read:Lo/ReferenceTypeDeserializer;

    if-eqz v3, :cond_20

    iget v3, v3, Lo/ReferenceTypeDeserializer;->RemoteActionCompatParcelizer:I

    if-eqz v3, :cond_20

    move v3, p2

    goto :goto_21

    :cond_20
    move v3, p1

    .line 2788
    :goto_21
    iget-object v4, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->read:Lo/ReferenceTypeDeserializer;

    if-eqz v4, :cond_2b

    iget v4, v4, Lo/ReferenceTypeDeserializer;->RemoteActionCompatParcelizer:I

    if-eqz v4, :cond_2b

    move v4, p1

    goto :goto_2c

    :cond_2b
    move v4, p2

    .line 2786
    :goto_2c
    invoke-static {v1, v2, v0, v3, v4}, Landroidx/constraintlayout/motion/widget/MotionLayout;->RemoteActionCompatParcelizer(Landroidx/constraintlayout/motion/widget/MotionLayout;Lo/_long;III)V

    .line 2789
    iget-object v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->AudioAttributesImplApi26Parcelizer:Lo/ReferenceTypeDeserializer;

    if-eqz v1, :cond_48

    .line 2790
    iget-object v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->IconCompatParcelizer:Landroidx/constraintlayout/motion/widget/MotionLayout;

    iget-object v3, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->write:Lo/_long;

    .line 2791
    iget v1, v1, Lo/ReferenceTypeDeserializer;->RemoteActionCompatParcelizer:I

    if-nez v1, :cond_3d

    move v1, p1

    goto :goto_3e

    :cond_3d
    move v1, p2

    .line 2792
    :goto_3e
    iget-object p0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->AudioAttributesImplApi26Parcelizer:Lo/ReferenceTypeDeserializer;

    iget p0, p0, Lo/ReferenceTypeDeserializer;->RemoteActionCompatParcelizer:I

    if-nez p0, :cond_45

    move p1, p2

    .line 2790
    :cond_45
    invoke-static {v2, v3, v0, v1, p1}, Landroidx/constraintlayout/motion/widget/MotionLayout;->read(Landroidx/constraintlayout/motion/widget/MotionLayout;Lo/_long;III)V

    :cond_48
    return-void

    .line 2795
    :cond_49
    iget-object v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->AudioAttributesImplApi26Parcelizer:Lo/ReferenceTypeDeserializer;

    if-eqz v1, :cond_64

    .line 2796
    iget-object v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->IconCompatParcelizer:Landroidx/constraintlayout/motion/widget/MotionLayout;

    iget-object v3, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->write:Lo/_long;

    .line 2797
    iget v1, v1, Lo/ReferenceTypeDeserializer;->RemoteActionCompatParcelizer:I

    if-nez v1, :cond_57

    move v1, p1

    goto :goto_58

    :cond_57
    move v1, p2

    .line 2798
    :goto_58
    iget-object v4, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->AudioAttributesImplApi26Parcelizer:Lo/ReferenceTypeDeserializer;

    iget v4, v4, Lo/ReferenceTypeDeserializer;->RemoteActionCompatParcelizer:I

    if-nez v4, :cond_60

    move v4, p2

    goto :goto_61

    :cond_60
    move v4, p1

    .line 2796
    :goto_61
    invoke-static {v2, v3, v0, v1, v4}, Landroidx/constraintlayout/motion/widget/MotionLayout;->IconCompatParcelizer(Landroidx/constraintlayout/motion/widget/MotionLayout;Lo/_long;III)V

    .line 2800
    :cond_64
    iget-object v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->IconCompatParcelizer:Landroidx/constraintlayout/motion/widget/MotionLayout;

    iget-object v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->RemoteActionCompatParcelizer:Lo/_long;

    .line 2801
    iget-object v3, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->read:Lo/ReferenceTypeDeserializer;

    if-eqz v3, :cond_72

    iget v3, v3, Lo/ReferenceTypeDeserializer;->RemoteActionCompatParcelizer:I

    if-eqz v3, :cond_72

    move v3, p2

    goto :goto_73

    :cond_72
    move v3, p1

    .line 2802
    :goto_73
    iget-object p0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->read:Lo/ReferenceTypeDeserializer;

    if-eqz p0, :cond_7b

    iget p0, p0, Lo/ReferenceTypeDeserializer;->RemoteActionCompatParcelizer:I

    if-nez p0, :cond_7c

    :cond_7b
    move p1, p2

    .line 2800
    :cond_7c
    invoke-static {v1, v2, v0, v3, p1}, Landroidx/constraintlayout/motion/widget/MotionLayout;->write(Landroidx/constraintlayout/motion/widget/MotionLayout;Lo/_long;III)V

    return-void
.end method

.method private IconCompatParcelizer(Lo/_long;Lo/ReferenceTypeDeserializer;)V
    .registers 11

    .line 2596
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    .line 2597
    new-instance v1, Landroidx/constraintlayout/widget/Constraints$LayoutParams;

    invoke-direct {v1}, Landroidx/constraintlayout/widget/Constraints$LayoutParams;-><init>()V

    .line 2599
    invoke-virtual {v0}, Landroid/util/SparseArray;->clear()V

    const/4 v2, 0x0

    .line 2600
    invoke-virtual {v0, v2, p1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 2601
    iget-object v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->IconCompatParcelizer:Landroidx/constraintlayout/motion/widget/MotionLayout;

    invoke-virtual {v2}, Landroid/view/View;->getId()I

    move-result v2

    invoke-virtual {v0, v2, p1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    if-eqz p2, :cond_41

    .line 2602
    iget v2, p2, Lo/ReferenceTypeDeserializer;->RemoteActionCompatParcelizer:I

    if-eqz v2, :cond_41

    .line 2603
    iget-object v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->IconCompatParcelizer:Landroidx/constraintlayout/motion/widget/MotionLayout;

    iget-object v3, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->RemoteActionCompatParcelizer:Lo/_long;

    invoke-virtual {v2}, Landroidx/constraintlayout/widget/ConstraintLayout;->RatingCompat()I

    move-result v4

    iget-object v5, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->IconCompatParcelizer:Landroidx/constraintlayout/motion/widget/MotionLayout;

    .line 2604
    invoke-virtual {v5}, Landroid/view/View;->getHeight()I

    move-result v5

    const/high16 v6, 0x40000000    # 2.0f

    invoke-static {v5, v6}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v5

    iget-object v7, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->IconCompatParcelizer:Landroidx/constraintlayout/motion/widget/MotionLayout;

    .line 2605
    invoke-virtual {v7}, Landroid/view/View;->getWidth()I

    move-result v7

    invoke-static {v7, v6}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v6

    .line 2603
    invoke-static {v2, v3, v4, v5, v6}, Landroidx/constraintlayout/motion/widget/MotionLayout;->AudioAttributesCompatParcelizer(Landroidx/constraintlayout/motion/widget/MotionLayout;Lo/_long;III)V

    .line 2608
    :cond_41
    invoke-virtual {p1}, Lo/_isStdKeyDeser;->accessgetReportFullyDrawnExecutorp()Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_49
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_66

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lo/JdkDeserializers;

    .line 2609
    invoke-virtual {v3}, Lo/JdkDeserializers;->r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM()V

    .line 2610
    invoke-virtual {v3}, Lo/JdkDeserializers;->RatingCompat()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/view/View;

    .line 2611
    invoke-virtual {v4}, Landroid/view/View;->getId()I

    move-result v4

    invoke-virtual {v0, v4, v3}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    goto :goto_49

    .line 2614
    :cond_66
    invoke-virtual {p1}, Lo/_isStdKeyDeser;->accessgetReportFullyDrawnExecutorp()Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_6e
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_de

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lo/JdkDeserializers;

    .line 2615
    invoke-virtual {v3}, Lo/JdkDeserializers;->RatingCompat()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/view/View;

    .line 2616
    invoke-virtual {v4}, Landroid/view/View;->getId()I

    move-result v5

    invoke-virtual {p2, v5, v1}, Lo/ReferenceTypeDeserializer;->write(ILandroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;)V

    .line 2618
    invoke-virtual {v4}, Landroid/view/View;->getId()I

    move-result v5

    invoke-virtual {p2, v5}, Lo/ReferenceTypeDeserializer;->MediaBrowserCompatCustomActionResultReceiver(I)I

    move-result v5

    invoke-virtual {v3, v5}, Lo/JdkDeserializers;->onFastForward(I)V

    .line 2619
    invoke-virtual {v4}, Landroid/view/View;->getId()I

    move-result v5

    invoke-virtual {p2, v5}, Lo/ReferenceTypeDeserializer;->AudioAttributesCompatParcelizer(I)I

    move-result v5

    invoke-virtual {v3, v5}, Lo/JdkDeserializers;->MediaMetadataCompat(I)V

    .line 2620
    instance-of v5, v4, Landroidx/constraintlayout/widget/ConstraintHelper;

    if-eqz v5, :cond_b1

    .line 2621
    move-object v5, v4

    check-cast v5, Landroidx/constraintlayout/widget/ConstraintHelper;

    invoke-virtual {p2, v5, v3, v1, v0}, Lo/ReferenceTypeDeserializer;->read(Landroidx/constraintlayout/widget/ConstraintHelper;Lo/JdkDeserializers;Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;Landroid/util/SparseArray;)V

    .line 2622
    instance-of v5, v4, Landroidx/constraintlayout/widget/Barrier;

    if-eqz v5, :cond_b1

    .line 2623
    move-object v5, v4

    check-cast v5, Landroidx/constraintlayout/widget/Barrier;

    invoke-virtual {v5}, Landroidx/constraintlayout/widget/ConstraintHelper;->MediaBrowserCompatCustomActionResultReceiver()V

    .line 2634
    :cond_b1
    iget-object v5, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->IconCompatParcelizer:Landroidx/constraintlayout/motion/widget/MotionLayout;

    invoke-virtual {v5}, Landroidx/constraintlayout/motion/widget/MotionLayout;->getLayoutDirection()I

    move-result v5

    invoke-virtual {v1, v5}, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;->resolveLayoutDirection(I)V

    .line 2638
    iget-object v5, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->IconCompatParcelizer:Landroidx/constraintlayout/motion/widget/MotionLayout;

    invoke-static {v5, v4, v3, v1, v0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->read(Landroidx/constraintlayout/motion/widget/MotionLayout;Landroid/view/View;Lo/JdkDeserializers;Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;Landroid/util/SparseArray;)V

    .line 2639
    invoke-virtual {v4}, Landroid/view/View;->getId()I

    move-result v5

    invoke-virtual {p2, v5}, Lo/ReferenceTypeDeserializer;->AudioAttributesImplApi21Parcelizer(I)I

    move-result v5

    const/4 v6, 0x1

    if-ne v5, v6, :cond_d2

    .line 2640
    invoke-virtual {v4}, Landroid/view/View;->getVisibility()I

    move-result v4

    invoke-virtual {v3, v4}, Lo/JdkDeserializers;->onAddQueueItem(I)V

    goto :goto_6e

    .line 2642
    :cond_d2
    invoke-virtual {v4}, Landroid/view/View;->getId()I

    move-result v4

    invoke-virtual {p2, v4}, Lo/ReferenceTypeDeserializer;->read(I)I

    move-result v4

    invoke-virtual {v3, v4}, Lo/JdkDeserializers;->onAddQueueItem(I)V

    goto :goto_6e

    .line 2645
    :cond_de
    invoke-virtual {p1}, Lo/_isStdKeyDeser;->accessgetReportFullyDrawnExecutorp()Ljava/util/ArrayList;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_e6
    :goto_e6
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_107

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lo/JdkDeserializers;

    .line 2646
    instance-of p2, p1, Lo/_readAndBindStringKeyMap;

    if-eqz p2, :cond_e6

    .line 2647
    invoke-virtual {p1}, Lo/JdkDeserializers;->RatingCompat()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroidx/constraintlayout/widget/ConstraintHelper;

    .line 2648
    check-cast p1, Lo/JsonNodeDeserializer;

    .line 2649
    invoke-virtual {p2, p1, v0}, Landroidx/constraintlayout/widget/ConstraintHelper;->IconCompatParcelizer(Lo/JsonNodeDeserializer;Landroid/util/SparseArray;)V

    .line 2650
    check-cast p1, Lo/_readAndBindStringKeyMap;

    .line 2651
    invoke-virtual {p1}, Lo/_readAndBindStringKeyMap;->write()V

    goto :goto_e6

    :cond_107
    return-void
.end method

.method private static RemoteActionCompatParcelizer(Lo/_long;Landroid/view/View;)Lo/JdkDeserializers;
    .registers 6

    .line 2657
    invoke-virtual {p0}, Lo/JdkDeserializers;->RatingCompat()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, p1, :cond_7

    return-object p0

    .line 2660
    :cond_7
    invoke-virtual {p0}, Lo/_isStdKeyDeser;->accessgetReportFullyDrawnExecutorp()Ljava/util/ArrayList;

    move-result-object p0

    .line 2661
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_10
    if-ge v1, v0, :cond_22

    .line 2663
    invoke-virtual {p0, v1}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo/JdkDeserializers;

    .line 2664
    invoke-virtual {v2}, Lo/JdkDeserializers;->RatingCompat()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, p1, :cond_1f

    return-object v2

    :cond_1f
    add-int/lit8 v1, v1, 0x1

    goto :goto_10

    :cond_22
    const/4 p0, 0x0

    return-object p0
.end method

.method private static RemoteActionCompatParcelizer(Lo/_long;Lo/_long;)V
    .registers 6

    .line 2508
    invoke-virtual {p0}, Lo/_isStdKeyDeser;->accessgetReportFullyDrawnExecutorp()Ljava/util/ArrayList;

    move-result-object v0

    .line 2509
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 2510
    invoke-virtual {v1, p0, p1}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2511
    invoke-virtual {p1}, Lo/_isStdKeyDeser;->accessgetReportFullyDrawnExecutorp()Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/AbstractCollection;->clear()V

    .line 2512
    invoke-virtual {p1, p0, v1}, Lo/JdkDeserializers;->AudioAttributesCompatParcelizer(Lo/JdkDeserializers;Ljava/util/HashMap;)V

    .line 2513
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_1a
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_64

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo/JdkDeserializers;

    .line 2515
    instance-of v3, v2, Lo/_deSerializeBCP47Locale;

    if-eqz v3, :cond_30

    .line 2516
    new-instance v3, Lo/_deSerializeBCP47Locale;

    invoke-direct {v3}, Lo/_deSerializeBCP47Locale;-><init>()V

    goto :goto_5d

    .line 2517
    :cond_30
    instance-of v3, v2, Lo/_deserializeUsingCreator;

    if-eqz v3, :cond_3a

    .line 2518
    new-instance v3, Lo/_deserializeUsingCreator;

    invoke-direct {v3}, Lo/_deserializeUsingCreator;-><init>()V

    goto :goto_5d

    .line 2519
    :cond_3a
    instance-of v3, v2, Lo/JsonNodeDeserializerObjectDeserializer;

    if-eqz v3, :cond_44

    .line 2520
    new-instance v3, Lo/JsonNodeDeserializerObjectDeserializer;

    invoke-direct {v3}, Lo/JsonNodeDeserializerObjectDeserializer;-><init>()V

    goto :goto_5d

    .line 2521
    :cond_44
    instance-of v3, v2, Lo/_readAndUpdateStringKeyMap;

    if-eqz v3, :cond_4e

    .line 2522
    new-instance v3, Lo/_readAndUpdateStringKeyMap;

    invoke-direct {v3}, Lo/_readAndUpdateStringKeyMap;-><init>()V

    goto :goto_5d

    .line 2523
    :cond_4e
    instance-of v3, v2, Lo/JsonNodeDeserializer;

    if-eqz v3, :cond_58

    .line 2524
    new-instance v3, Lo/JsonNodeDeserializerArrayDeserializer;

    invoke-direct {v3}, Lo/JsonNodeDeserializerArrayDeserializer;-><init>()V

    goto :goto_5d

    .line 2526
    :cond_58
    new-instance v3, Lo/JdkDeserializers;

    invoke-direct {v3}, Lo/JdkDeserializers;-><init>()V

    .line 2528
    :goto_5d
    invoke-virtual {p1, v3}, Lo/_isStdKeyDeser;->RemoteActionCompatParcelizer(Lo/JdkDeserializers;)V

    .line 2529
    invoke-virtual {v1, v2, v3}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1a

    .line 2531
    :cond_64
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_68
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_7e

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lo/JdkDeserializers;

    .line 2532
    invoke-virtual {v1, p1}, Ljava/util/AbstractMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/JdkDeserializers;

    invoke-virtual {v0, p1, v1}, Lo/JdkDeserializers;->AudioAttributesCompatParcelizer(Lo/JdkDeserializers;Ljava/util/HashMap;)V

    goto :goto_68

    :cond_7e
    return-void
.end method

.method private read(II)V
    .registers 16

    .line 2730
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    .line 2731
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v1

    .line 2733
    iget-object v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->IconCompatParcelizer:Landroidx/constraintlayout/motion/widget/MotionLayout;

    iput v0, v2, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:I

    .line 2734
    iget-object v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->IconCompatParcelizer:Landroidx/constraintlayout/motion/widget/MotionLayout;

    iput v1, v2, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaBrowserCompatItemReceiver:I

    .line 2735
    iget-object v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->IconCompatParcelizer:Landroidx/constraintlayout/motion/widget/MotionLayout;

    invoke-virtual {v2}, Landroidx/constraintlayout/widget/ConstraintLayout;->RatingCompat()I

    .line 2737
    invoke-direct {p0, p1, p2}, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->IconCompatParcelizer(II)V

    .line 2745
    iget-object v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->IconCompatParcelizer:Landroidx/constraintlayout/motion/widget/MotionLayout;

    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    instance-of v2, v2, Landroidx/constraintlayout/motion/widget/MotionLayout;

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_2a

    const/high16 v2, 0x40000000    # 2.0f

    if-ne v0, v2, :cond_2a

    if-eq v1, v2, :cond_6e

    .line 2749
    :cond_2a
    invoke-direct {p0, p1, p2}, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->IconCompatParcelizer(II)V

    .line 2751
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->IconCompatParcelizer:Landroidx/constraintlayout/motion/widget/MotionLayout;

    iget-object v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->write:Lo/_long;

    invoke-virtual {v1}, Lo/JdkDeserializers;->onSetShuffleMode()I

    move-result v1

    iput v1, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaBrowserCompatSearchResultReceiver:I

    .line 2752
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->IconCompatParcelizer:Landroidx/constraintlayout/motion/widget/MotionLayout;

    iget-object v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->write:Lo/_long;

    invoke-virtual {v1}, Lo/JdkDeserializers;->onAddQueueItem()I

    move-result v1

    iput v1, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaBrowserCompatMediaItem:I

    .line 2753
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->IconCompatParcelizer:Landroidx/constraintlayout/motion/widget/MotionLayout;

    iget-object v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->RemoteActionCompatParcelizer:Lo/_long;

    invoke-virtual {v1}, Lo/JdkDeserializers;->onSetShuffleMode()I

    move-result v1

    iput v1, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->write:I

    .line 2754
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->IconCompatParcelizer:Landroidx/constraintlayout/motion/widget/MotionLayout;

    iget-object v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->RemoteActionCompatParcelizer:Lo/_long;

    invoke-virtual {v1}, Lo/JdkDeserializers;->onAddQueueItem()I

    move-result v1

    iput v1, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->IconCompatParcelizer:I

    .line 2755
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->IconCompatParcelizer:Landroidx/constraintlayout/motion/widget/MotionLayout;

    iget v1, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaBrowserCompatSearchResultReceiver:I

    iget-object v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->IconCompatParcelizer:Landroidx/constraintlayout/motion/widget/MotionLayout;

    iget v2, v2, Landroidx/constraintlayout/motion/widget/MotionLayout;->write:I

    if-ne v1, v2, :cond_6b

    iget-object v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->IconCompatParcelizer:Landroidx/constraintlayout/motion/widget/MotionLayout;

    iget v1, v1, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaBrowserCompatMediaItem:I

    iget-object v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->IconCompatParcelizer:Landroidx/constraintlayout/motion/widget/MotionLayout;

    iget v2, v2, Landroidx/constraintlayout/motion/widget/MotionLayout;->IconCompatParcelizer:I

    if-ne v1, v2, :cond_6b

    move v1, v3

    goto :goto_6c

    :cond_6b
    move v1, v4

    :goto_6c
    iput-boolean v1, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->AudioAttributesImplApi26Parcelizer:Z

    .line 2759
    :cond_6e
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->IconCompatParcelizer:Landroidx/constraintlayout/motion/widget/MotionLayout;

    iget v0, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaBrowserCompatSearchResultReceiver:I

    .line 2760
    iget-object v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->IconCompatParcelizer:Landroidx/constraintlayout/motion/widget/MotionLayout;

    iget v1, v1, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaBrowserCompatMediaItem:I

    .line 2761
    iget-object v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->IconCompatParcelizer:Landroidx/constraintlayout/motion/widget/MotionLayout;

    iget v2, v2, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:I

    const/high16 v5, -0x80000000

    if-eq v2, v5, :cond_84

    iget-object v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->IconCompatParcelizer:Landroidx/constraintlayout/motion/widget/MotionLayout;

    iget v2, v2, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:I

    if-nez v2, :cond_9a

    .line 2762
    :cond_84
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->IconCompatParcelizer:Landroidx/constraintlayout/motion/widget/MotionLayout;

    iget v0, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaBrowserCompatSearchResultReceiver:I

    int-to-float v0, v0

    iget-object v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->IconCompatParcelizer:Landroidx/constraintlayout/motion/widget/MotionLayout;

    iget v2, v2, Landroidx/constraintlayout/motion/widget/MotionLayout;->AudioAttributesImplApi21Parcelizer:F

    iget-object v6, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->IconCompatParcelizer:Landroidx/constraintlayout/motion/widget/MotionLayout;

    iget v6, v6, Landroidx/constraintlayout/motion/widget/MotionLayout;->write:I

    iget-object v7, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->IconCompatParcelizer:Landroidx/constraintlayout/motion/widget/MotionLayout;

    iget v7, v7, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaBrowserCompatSearchResultReceiver:I

    sub-int/2addr v6, v7

    int-to-float v6, v6

    mul-float/2addr v2, v6

    add-float/2addr v0, v2

    float-to-int v0, v0

    :cond_9a
    move v9, v0

    .line 2764
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->IconCompatParcelizer:Landroidx/constraintlayout/motion/widget/MotionLayout;

    iget v0, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaBrowserCompatItemReceiver:I

    if-eq v0, v5, :cond_a7

    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->IconCompatParcelizer:Landroidx/constraintlayout/motion/widget/MotionLayout;

    iget v0, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaBrowserCompatItemReceiver:I

    if-nez v0, :cond_bd

    .line 2765
    :cond_a7
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->IconCompatParcelizer:Landroidx/constraintlayout/motion/widget/MotionLayout;

    iget v0, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaBrowserCompatMediaItem:I

    int-to-float v0, v0

    iget-object v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->IconCompatParcelizer:Landroidx/constraintlayout/motion/widget/MotionLayout;

    iget v1, v1, Landroidx/constraintlayout/motion/widget/MotionLayout;->AudioAttributesImplApi21Parcelizer:F

    iget-object v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->IconCompatParcelizer:Landroidx/constraintlayout/motion/widget/MotionLayout;

    iget v2, v2, Landroidx/constraintlayout/motion/widget/MotionLayout;->IconCompatParcelizer:I

    iget-object v5, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->IconCompatParcelizer:Landroidx/constraintlayout/motion/widget/MotionLayout;

    iget v5, v5, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaBrowserCompatMediaItem:I

    sub-int/2addr v2, v5

    int-to-float v2, v2

    mul-float/2addr v1, v2

    add-float/2addr v0, v1

    float-to-int v1, v0

    :cond_bd
    move v10, v1

    .line 2768
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->write:Lo/_long;

    invoke-virtual {v0}, Lo/_long;->accessensureViewModelStore()Z

    move-result v0

    if-nez v0, :cond_d0

    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->RemoteActionCompatParcelizer:Lo/_long;

    .line 2769
    invoke-virtual {v0}, Lo/_long;->accessensureViewModelStore()Z

    move-result v0

    if-nez v0, :cond_d0

    move v11, v3

    goto :goto_d1

    :cond_d0
    move v11, v4

    .line 2770
    :goto_d1
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->write:Lo/_long;

    invoke-virtual {v0}, Lo/_long;->r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28()Z

    move-result v0

    if-nez v0, :cond_e3

    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->RemoteActionCompatParcelizer:Lo/_long;

    .line 2771
    invoke-virtual {v0}, Lo/_long;->r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28()Z

    move-result v0

    if-nez v0, :cond_e3

    move v12, v3

    goto :goto_e4

    :cond_e3
    move v12, v4

    .line 2772
    :goto_e4
    iget-object v6, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->IconCompatParcelizer:Landroidx/constraintlayout/motion/widget/MotionLayout;

    move v7, p1

    move v8, p2

    invoke-static/range {v6 .. v12}, Landroidx/constraintlayout/motion/widget/MotionLayout;->AudioAttributesCompatParcelizer(Landroidx/constraintlayout/motion/widget/MotionLayout;IIIIZZ)V

    return-void
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer()V
    .registers 14

    .line 2807
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->IconCompatParcelizer:Landroidx/constraintlayout/motion/widget/MotionLayout;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    .line 2808
    iget-object v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->IconCompatParcelizer:Landroidx/constraintlayout/motion/widget/MotionLayout;

    iget-object v1, v1, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaBrowserCompatCustomActionResultReceiver:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/AbstractMap;->clear()V

    .line 2809
    new-instance v1, Landroid/util/SparseArray;

    invoke-direct {v1}, Landroid/util/SparseArray;-><init>()V

    .line 2810
    new-array v2, v0, [I

    const/4 v3, 0x0

    move v4, v3

    :goto_16
    if-ge v4, v0, :cond_36

    .line 2812
    iget-object v5, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->IconCompatParcelizer:Landroidx/constraintlayout/motion/widget/MotionLayout;

    invoke-virtual {v5, v4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v5

    .line 2813
    new-instance v6, Lo/handleSingleElementUnwrapped;

    invoke-direct {v6, v5}, Lo/handleSingleElementUnwrapped;-><init>(Landroid/view/View;)V

    .line 2814
    invoke-virtual {v5}, Landroid/view/View;->getId()I

    move-result v7

    aput v7, v2, v4

    invoke-virtual {v1, v7, v6}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 2815
    iget-object v7, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->IconCompatParcelizer:Landroidx/constraintlayout/motion/widget/MotionLayout;

    iget-object v7, v7, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaBrowserCompatCustomActionResultReceiver:Ljava/util/HashMap;

    invoke-virtual {v7, v5, v6}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v4, v4, 0x1

    goto :goto_16

    :cond_36
    move v4, v3

    :goto_37
    if-ge v4, v0, :cond_e8

    .line 2818
    iget-object v5, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->IconCompatParcelizer:Landroidx/constraintlayout/motion/widget/MotionLayout;

    invoke-virtual {v5, v4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v5

    .line 2819
    iget-object v6, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->IconCompatParcelizer:Landroidx/constraintlayout/motion/widget/MotionLayout;

    iget-object v6, v6, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaBrowserCompatCustomActionResultReceiver:Ljava/util/HashMap;

    invoke-virtual {v6, v5}, Ljava/util/AbstractMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    move-object v12, v6

    check-cast v12, Lo/handleSingleElementUnwrapped;

    if-eqz v12, :cond_e4

    .line 2823
    iget-object v6, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->AudioAttributesImplApi26Parcelizer:Lo/ReferenceTypeDeserializer;

    if-eqz v6, :cond_84

    .line 2824
    iget-object v6, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->write:Lo/_long;

    invoke-static {v6, v5}, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->RemoteActionCompatParcelizer(Lo/_long;Landroid/view/View;)Lo/JdkDeserializers;

    move-result-object v6

    if-eqz v6, :cond_70

    .line 2826
    iget-object v7, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->IconCompatParcelizer:Landroidx/constraintlayout/motion/widget/MotionLayout;

    invoke-static {v7, v6}, Landroidx/constraintlayout/motion/widget/MotionLayout;->write(Landroidx/constraintlayout/motion/widget/MotionLayout;Lo/JdkDeserializers;)Landroid/graphics/Rect;

    move-result-object v6

    iget-object v7, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->AudioAttributesImplApi26Parcelizer:Lo/ReferenceTypeDeserializer;

    iget-object v8, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->IconCompatParcelizer:Landroidx/constraintlayout/motion/widget/MotionLayout;

    invoke-virtual {v8}, Landroid/view/View;->getWidth()I

    move-result v8

    iget-object v9, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->IconCompatParcelizer:Landroidx/constraintlayout/motion/widget/MotionLayout;

    invoke-virtual {v9}, Landroid/view/View;->getHeight()I

    move-result v9

    invoke-virtual {v12, v6, v7, v8, v9}, Lo/handleSingleElementUnwrapped;->read(Landroid/graphics/Rect;Lo/ReferenceTypeDeserializer;II)V

    goto :goto_ad

    .line 2828
    :cond_70
    iget-object v6, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->IconCompatParcelizer:Landroidx/constraintlayout/motion/widget/MotionLayout;

    iget v6, v6, Landroidx/constraintlayout/motion/widget/MotionLayout;->read:I

    if-eqz v6, :cond_ad

    .line 2829
    invoke-static {}, Lo/NumberDeserializersShortDeserializer;->RemoteActionCompatParcelizer()Ljava/lang/String;

    invoke-static {v5}, Lo/NumberDeserializersShortDeserializer;->write(Landroid/view/View;)Ljava/lang/String;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    goto :goto_ad

    .line 2833
    :cond_84
    iget-object v6, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->IconCompatParcelizer:Landroidx/constraintlayout/motion/widget/MotionLayout;

    invoke-static {v6}, Landroidx/constraintlayout/motion/widget/MotionLayout;->AudioAttributesImplApi21Parcelizer(Landroidx/constraintlayout/motion/widget/MotionLayout;)Z

    move-result v6

    if-eqz v6, :cond_ad

    .line 2834
    iget-object v6, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->IconCompatParcelizer:Landroidx/constraintlayout/motion/widget/MotionLayout;

    iget-object v6, v6, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaMetadataCompat:Ljava/util/HashMap;

    invoke-virtual {v6, v5}, Ljava/util/AbstractMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    move-object v7, v6

    check-cast v7, Lo/_parseDouble;

    iget-object v6, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->IconCompatParcelizer:Landroidx/constraintlayout/motion/widget/MotionLayout;

    iget v6, v6, Landroidx/constraintlayout/motion/widget/MotionLayout;->RatingCompat:I

    iget-object v6, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->IconCompatParcelizer:Landroidx/constraintlayout/motion/widget/MotionLayout;

    .line 2835
    invoke-static {v6}, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaBrowserCompatCustomActionResultReceiver(Landroidx/constraintlayout/motion/widget/MotionLayout;)I

    move-result v10

    iget-object v6, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->IconCompatParcelizer:Landroidx/constraintlayout/motion/widget/MotionLayout;

    invoke-static {v6}, Landroidx/constraintlayout/motion/widget/MotionLayout;->AudioAttributesImplApi26Parcelizer(Landroidx/constraintlayout/motion/widget/MotionLayout;)I

    move-result v11

    const/4 v9, 0x0

    move-object v6, v12

    move-object v8, v5

    .line 2834
    invoke-virtual/range {v6 .. v11}, Lo/handleSingleElementUnwrapped;->IconCompatParcelizer(Lo/_parseDouble;Landroid/view/View;III)V

    .line 2838
    :cond_ad
    :goto_ad
    iget-object v6, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->read:Lo/ReferenceTypeDeserializer;

    if-eqz v6, :cond_e4

    .line 2839
    iget-object v6, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->RemoteActionCompatParcelizer:Lo/_long;

    invoke-static {v6, v5}, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->RemoteActionCompatParcelizer(Lo/_long;Landroid/view/View;)Lo/JdkDeserializers;

    move-result-object v6

    if-eqz v6, :cond_d1

    .line 2841
    iget-object v5, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->IconCompatParcelizer:Landroidx/constraintlayout/motion/widget/MotionLayout;

    invoke-static {v5, v6}, Landroidx/constraintlayout/motion/widget/MotionLayout;->write(Landroidx/constraintlayout/motion/widget/MotionLayout;Lo/JdkDeserializers;)Landroid/graphics/Rect;

    move-result-object v5

    iget-object v6, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->read:Lo/ReferenceTypeDeserializer;

    iget-object v7, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->IconCompatParcelizer:Landroidx/constraintlayout/motion/widget/MotionLayout;

    invoke-virtual {v7}, Landroid/view/View;->getWidth()I

    move-result v7

    iget-object v8, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->IconCompatParcelizer:Landroidx/constraintlayout/motion/widget/MotionLayout;

    invoke-virtual {v8}, Landroid/view/View;->getHeight()I

    move-result v8

    invoke-virtual {v12, v5, v6, v7, v8}, Lo/handleSingleElementUnwrapped;->AudioAttributesCompatParcelizer(Landroid/graphics/Rect;Lo/ReferenceTypeDeserializer;II)V

    goto :goto_e4

    .line 2843
    :cond_d1
    iget-object v6, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->IconCompatParcelizer:Landroidx/constraintlayout/motion/widget/MotionLayout;

    iget v6, v6, Landroidx/constraintlayout/motion/widget/MotionLayout;->read:I

    if-eqz v6, :cond_e4

    .line 2844
    invoke-static {}, Lo/NumberDeserializersShortDeserializer;->RemoteActionCompatParcelizer()Ljava/lang/String;

    invoke-static {v5}, Lo/NumberDeserializersShortDeserializer;->write(Landroid/view/View;)Ljava/lang/String;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    :cond_e4
    :goto_e4
    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_37

    :cond_e8
    :goto_e8
    if-ge v3, v0, :cond_105

    .line 2851
    aget p0, v2, v3

    invoke-virtual {v1, p0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lo/handleSingleElementUnwrapped;

    .line 2852
    invoke-virtual {p0}, Lo/handleSingleElementUnwrapped;->AudioAttributesCompatParcelizer()I

    move-result v4

    const/4 v5, -0x1

    if-eq v4, v5, :cond_102

    .line 2854
    invoke-virtual {v1, v4}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lo/handleSingleElementUnwrapped;

    invoke-virtual {p0, v4}, Lo/handleSingleElementUnwrapped;->IconCompatParcelizer(Lo/handleSingleElementUnwrapped;)V

    :cond_102
    add-int/lit8 v3, v3, 0x1

    goto :goto_e8

    :cond_105
    return-void
.end method

.method public final RemoteActionCompatParcelizer(II)Z
    .registers 4

    .line 2865
    iget v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->MediaBrowserCompatCustomActionResultReceiver:I

    if-ne p1, v0, :cond_a

    iget p0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->AudioAttributesCompatParcelizer:I

    if-ne p2, p0, :cond_a

    const/4 p0, 0x0

    return p0

    :cond_a
    const/4 p0, 0x1

    return p0
.end method

.method public final read()V
    .registers 3

    .line 2725
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->IconCompatParcelizer:Landroidx/constraintlayout/motion/widget/MotionLayout;

    invoke-static {v0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->IconCompatParcelizer(Landroidx/constraintlayout/motion/widget/MotionLayout;)I

    move-result v0

    iget-object v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->IconCompatParcelizer:Landroidx/constraintlayout/motion/widget/MotionLayout;

    invoke-static {v1}, Landroidx/constraintlayout/motion/widget/MotionLayout;->write(Landroidx/constraintlayout/motion/widget/MotionLayout;)I

    move-result v1

    invoke-direct {p0, v0, v1}, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->read(II)V

    .line 2726
    iget-object p0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->IconCompatParcelizer:Landroidx/constraintlayout/motion/widget/MotionLayout;

    invoke-static {p0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->AudioAttributesCompatParcelizer(Landroidx/constraintlayout/motion/widget/MotionLayout;)V

    return-void
.end method

.method final read(Lo/ReferenceTypeDeserializer;Lo/ReferenceTypeDeserializer;)V
    .registers 7

    .line 2537
    iput-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->AudioAttributesImplApi26Parcelizer:Lo/ReferenceTypeDeserializer;

    .line 2538
    iput-object p2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->read:Lo/ReferenceTypeDeserializer;

    .line 2539
    new-instance v0, Lo/_long;

    invoke-direct {v0}, Lo/_long;-><init>()V

    iput-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->write:Lo/_long;

    .line 2540
    new-instance v0, Lo/_long;

    invoke-direct {v0}, Lo/_long;-><init>()V

    iput-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->RemoteActionCompatParcelizer:Lo/_long;

    .line 2541
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->write:Lo/_long;

    iget-object v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->IconCompatParcelizer:Landroidx/constraintlayout/motion/widget/MotionLayout;

    invoke-static {v1}, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaBrowserCompatItemReceiver(Landroidx/constraintlayout/motion/widget/MotionLayout;)Lo/_long;

    move-result-object v1

    invoke-virtual {v1}, Lo/_long;->IconCompatParcelizer()Lo/_readAndBind$write;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/_long;->write(Lo/_readAndBind$write;)V

    .line 2542
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->RemoteActionCompatParcelizer:Lo/_long;

    iget-object v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->IconCompatParcelizer:Landroidx/constraintlayout/motion/widget/MotionLayout;

    invoke-static {v1}, Landroidx/constraintlayout/motion/widget/MotionLayout;->AudioAttributesImplBaseParcelizer(Landroidx/constraintlayout/motion/widget/MotionLayout;)Lo/_long;

    move-result-object v1

    invoke-virtual {v1}, Lo/_long;->IconCompatParcelizer()Lo/_readAndBind$write;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/_long;->write(Lo/_readAndBind$write;)V

    .line 2543
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->write:Lo/_long;

    invoke-virtual {v0}, Lo/_isStdKeyDeser;->ensureViewModelStore()V

    .line 2544
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->RemoteActionCompatParcelizer:Lo/_long;

    invoke-virtual {v0}, Lo/_isStdKeyDeser;->ensureViewModelStore()V

    .line 2545
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->IconCompatParcelizer:Landroidx/constraintlayout/motion/widget/MotionLayout;

    invoke-static {v0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaMetadataCompat(Landroidx/constraintlayout/motion/widget/MotionLayout;)Lo/_long;

    move-result-object v0

    iget-object v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->write:Lo/_long;

    invoke-static {v0, v1}, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->RemoteActionCompatParcelizer(Lo/_long;Lo/_long;)V

    .line 2546
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->IconCompatParcelizer:Landroidx/constraintlayout/motion/widget/MotionLayout;

    invoke-static {v0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaBrowserCompatSearchResultReceiver(Landroidx/constraintlayout/motion/widget/MotionLayout;)Lo/_long;

    move-result-object v0

    iget-object v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->RemoteActionCompatParcelizer:Lo/_long;

    invoke-static {v0, v1}, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->RemoteActionCompatParcelizer(Lo/_long;Lo/_long;)V

    .line 2547
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->IconCompatParcelizer:Landroidx/constraintlayout/motion/widget/MotionLayout;

    iget v0, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->onCustomAction:F

    float-to-double v0, v0

    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    cmpl-double v0, v0, v2

    if-lez v0, :cond_68

    if-eqz p1, :cond_62

    .line 2549
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->write:Lo/_long;

    invoke-direct {p0, v0, p1}, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->IconCompatParcelizer(Lo/_long;Lo/ReferenceTypeDeserializer;)V

    .line 2551
    :cond_62
    iget-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->RemoteActionCompatParcelizer:Lo/_long;

    invoke-direct {p0, p1, p2}, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->IconCompatParcelizer(Lo/_long;Lo/ReferenceTypeDeserializer;)V

    goto :goto_74

    .line 2553
    :cond_68
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->RemoteActionCompatParcelizer:Lo/_long;

    invoke-direct {p0, v0, p2}, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->IconCompatParcelizer(Lo/_long;Lo/ReferenceTypeDeserializer;)V

    if-eqz p1, :cond_74

    .line 2555
    iget-object p2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->write:Lo/_long;

    invoke-direct {p0, p2, p1}, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->IconCompatParcelizer(Lo/_long;Lo/ReferenceTypeDeserializer;)V

    .line 2562
    :cond_74
    :goto_74
    iget-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->write:Lo/_long;

    iget-object p2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->IconCompatParcelizer:Landroidx/constraintlayout/motion/widget/MotionLayout;

    invoke-static {p2}, Landroidx/constraintlayout/motion/widget/MotionLayout;->RatingCompat(Landroidx/constraintlayout/motion/widget/MotionLayout;)Z

    move-result p2

    invoke-virtual {p1, p2}, Lo/_long;->write(Z)V

    .line 2563
    iget-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->write:Lo/_long;

    invoke-virtual {p1}, Lo/_long;->accessaddObserverForBackInvoker()V

    .line 2573
    iget-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->RemoteActionCompatParcelizer:Lo/_long;

    iget-object p2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->IconCompatParcelizer:Landroidx/constraintlayout/motion/widget/MotionLayout;

    invoke-static {p2}, Landroidx/constraintlayout/motion/widget/MotionLayout;->MediaDescriptionCompat(Landroidx/constraintlayout/motion/widget/MotionLayout;)Z

    move-result p2

    invoke-virtual {p1, p2}, Lo/_long;->write(Z)V

    .line 2574
    iget-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->RemoteActionCompatParcelizer:Lo/_long;

    invoke-virtual {p1}, Lo/_long;->accessaddObserverForBackInvoker()V

    .line 2582
    iget-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->IconCompatParcelizer:Landroidx/constraintlayout/motion/widget/MotionLayout;

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    if-eqz p1, :cond_c1

    .line 2584
    iget p2, p1, Landroid/view/ViewGroup$LayoutParams;->width:I

    const/4 v0, -0x2

    if-ne p2, v0, :cond_af

    .line 2585
    iget-object p2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->write:Lo/_long;

    sget-object v1, Lo/JdkDeserializers$IconCompatParcelizer;->write:Lo/JdkDeserializers$IconCompatParcelizer;

    invoke-virtual {p2, v1}, Lo/JdkDeserializers;->AudioAttributesCompatParcelizer(Lo/JdkDeserializers$IconCompatParcelizer;)V

    .line 2586
    iget-object p2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->RemoteActionCompatParcelizer:Lo/_long;

    sget-object v1, Lo/JdkDeserializers$IconCompatParcelizer;->write:Lo/JdkDeserializers$IconCompatParcelizer;

    invoke-virtual {p2, v1}, Lo/JdkDeserializers;->AudioAttributesCompatParcelizer(Lo/JdkDeserializers$IconCompatParcelizer;)V

    .line 2588
    :cond_af
    iget p1, p1, Landroid/view/ViewGroup$LayoutParams;->height:I

    if-ne p1, v0, :cond_c1

    .line 2589
    iget-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->write:Lo/_long;

    sget-object p2, Lo/JdkDeserializers$IconCompatParcelizer;->write:Lo/JdkDeserializers$IconCompatParcelizer;

    invoke-virtual {p1, p2}, Lo/JdkDeserializers;->write(Lo/JdkDeserializers$IconCompatParcelizer;)V

    .line 2590
    iget-object p0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->RemoteActionCompatParcelizer:Lo/_long;

    sget-object p1, Lo/JdkDeserializers$IconCompatParcelizer;->write:Lo/JdkDeserializers$IconCompatParcelizer;

    invoke-virtual {p0, p1}, Lo/JdkDeserializers;->write(Lo/JdkDeserializers$IconCompatParcelizer;)V

    :cond_c1
    return-void
.end method

.method public final write(II)V
    .registers 3

    .line 2860
    iput p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->MediaBrowserCompatCustomActionResultReceiver:I

    .line 2861
    iput p2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$IconCompatParcelizer;->AudioAttributesCompatParcelizer:I

    return-void
.end method

###### Class androidx.constraintlayout.motion.widget.MotionLayout.MediaBrowserCompatCustomActionResultReceiver (androidx.constraintlayout.motion.widget.MotionLayout$MediaBrowserCompatCustomActionResultReceiver)
.class final Landroidx/constraintlayout/motion/widget/MotionLayout$MediaBrowserCompatCustomActionResultReceiver;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/constraintlayout/motion/widget/MotionLayout;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "MediaBrowserCompatCustomActionResultReceiver"
.end annotation


# instance fields
.field final AudioAttributesCompatParcelizer:Ljava/lang/String;

.field private AudioAttributesImplApi21Parcelizer:F

.field private AudioAttributesImplApi26Parcelizer:I

.field final synthetic IconCompatParcelizer:Landroidx/constraintlayout/motion/widget/MotionLayout;

.field private MediaBrowserCompatCustomActionResultReceiver:F

.field private MediaBrowserCompatItemReceiver:I

.field final RemoteActionCompatParcelizer:Ljava/lang/String;

.field final read:Ljava/lang/String;

.field final write:Ljava/lang/String;


# direct methods
.method constructor <init>(Landroidx/constraintlayout/motion/widget/MotionLayout;)V
    .registers 2

    .line 1601
    iput-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$MediaBrowserCompatCustomActionResultReceiver;->IconCompatParcelizer:Landroidx/constraintlayout/motion/widget/MotionLayout;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 p1, 0x7fc00000    # Float.NaN

    .line 1602
    iput p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$MediaBrowserCompatCustomActionResultReceiver;->AudioAttributesImplApi21Parcelizer:F

    .line 1603
    iput p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$MediaBrowserCompatCustomActionResultReceiver;->MediaBrowserCompatCustomActionResultReceiver:F

    const/4 p1, -0x1

    .line 1604
    iput p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$MediaBrowserCompatCustomActionResultReceiver;->AudioAttributesImplApi26Parcelizer:I

    .line 1605
    iput p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$MediaBrowserCompatCustomActionResultReceiver;->MediaBrowserCompatItemReceiver:I

    .line 1606
    const-string p1, "motion.progress"

    iput-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$MediaBrowserCompatCustomActionResultReceiver;->RemoteActionCompatParcelizer:Ljava/lang/String;

    .line 1607
    const-string p1, "motion.velocity"

    iput-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$MediaBrowserCompatCustomActionResultReceiver;->read:Ljava/lang/String;

    .line 1608
    const-string p1, "motion.StartState"

    iput-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$MediaBrowserCompatCustomActionResultReceiver;->write:Ljava/lang/String;

    .line 1609
    const-string p1, "motion.EndState"

    iput-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$MediaBrowserCompatCustomActionResultReceiver;->AudioAttributesCompatParcelizer:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer(F)V
    .registers 2

    .line 1653
    iput p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$MediaBrowserCompatCustomActionResultReceiver;->AudioAttributesImplApi21Parcelizer:F

    return-void
.end method

.method public final AudioAttributesCompatParcelizer(I)V
    .registers 2

    .line 1665
    iput p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$MediaBrowserCompatCustomActionResultReceiver;->AudioAttributesImplApi26Parcelizer:I

    return-void
.end method

.method public final IconCompatParcelizer(Landroid/os/Bundle;)V
    .registers 3

    .line 1646
    const-string v0, "motion.progress"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;)F

    move-result v0

    iput v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$MediaBrowserCompatCustomActionResultReceiver;->AudioAttributesImplApi21Parcelizer:F

    .line 1647
    const-string v0, "motion.velocity"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;)F

    move-result v0

    iput v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$MediaBrowserCompatCustomActionResultReceiver;->MediaBrowserCompatCustomActionResultReceiver:F

    .line 1648
    const-string v0, "motion.StartState"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$MediaBrowserCompatCustomActionResultReceiver;->AudioAttributesImplApi26Parcelizer:I

    .line 1649
    const-string v0, "motion.EndState"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result p1

    iput p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$MediaBrowserCompatCustomActionResultReceiver;->MediaBrowserCompatItemReceiver:I

    return-void
.end method

.method final RemoteActionCompatParcelizer()V
    .registers 5

    .line 1612
    iget v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$MediaBrowserCompatCustomActionResultReceiver;->AudioAttributesImplApi26Parcelizer:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_9

    iget v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$MediaBrowserCompatCustomActionResultReceiver;->MediaBrowserCompatItemReceiver:I

    if-eq v2, v1, :cond_29

    :cond_9
    if-ne v0, v1, :cond_13

    .line 1614
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$MediaBrowserCompatCustomActionResultReceiver;->IconCompatParcelizer:Landroidx/constraintlayout/motion/widget/MotionLayout;

    iget v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$MediaBrowserCompatCustomActionResultReceiver;->MediaBrowserCompatItemReceiver:I

    invoke-virtual {v0, v2}, Landroidx/constraintlayout/motion/widget/MotionLayout;->IconCompatParcelizer(I)V

    goto :goto_22

    .line 1615
    :cond_13
    iget v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$MediaBrowserCompatCustomActionResultReceiver;->MediaBrowserCompatItemReceiver:I

    if-ne v2, v1, :cond_1d

    .line 1616
    iget-object v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$MediaBrowserCompatCustomActionResultReceiver;->IconCompatParcelizer:Landroidx/constraintlayout/motion/widget/MotionLayout;

    invoke-virtual {v2, v0, v1, v1}, Landroidx/constraintlayout/widget/ConstraintLayout;->setState(III)V

    goto :goto_22

    .line 1618
    :cond_1d
    iget-object v3, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$MediaBrowserCompatCustomActionResultReceiver;->IconCompatParcelizer:Landroidx/constraintlayout/motion/widget/MotionLayout;

    invoke-virtual {v3, v0, v2}, Landroidx/constraintlayout/motion/widget/MotionLayout;->setTransition(II)V

    .line 1620
    :goto_22
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$MediaBrowserCompatCustomActionResultReceiver;->IconCompatParcelizer:Landroidx/constraintlayout/motion/widget/MotionLayout;

    sget-object v2, Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi21Parcelizer;->RemoteActionCompatParcelizer:Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi21Parcelizer;

    invoke-virtual {v0, v2}, Landroidx/constraintlayout/motion/widget/MotionLayout;->write(Landroidx/constraintlayout/motion/widget/MotionLayout$AudioAttributesImplApi21Parcelizer;)V

    .line 1622
    :cond_29
    iget v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$MediaBrowserCompatCustomActionResultReceiver;->MediaBrowserCompatCustomActionResultReceiver:F

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-eqz v0, :cond_42

    .line 1623
    iget v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$MediaBrowserCompatCustomActionResultReceiver;->AudioAttributesImplApi21Parcelizer:F

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-eqz v0, :cond_3a

    return-void

    .line 1626
    :cond_3a
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$MediaBrowserCompatCustomActionResultReceiver;->IconCompatParcelizer:Landroidx/constraintlayout/motion/widget/MotionLayout;

    iget p0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$MediaBrowserCompatCustomActionResultReceiver;->AudioAttributesImplApi21Parcelizer:F

    invoke-virtual {v0, p0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->setProgress(F)V

    return-void

    .line 1629
    :cond_42
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$MediaBrowserCompatCustomActionResultReceiver;->IconCompatParcelizer:Landroidx/constraintlayout/motion/widget/MotionLayout;

    iget v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$MediaBrowserCompatCustomActionResultReceiver;->AudioAttributesImplApi21Parcelizer:F

    iget v3, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$MediaBrowserCompatCustomActionResultReceiver;->MediaBrowserCompatCustomActionResultReceiver:F

    invoke-virtual {v0, v2, v3}, Landroidx/constraintlayout/motion/widget/MotionLayout;->setProgress(FF)V

    const/high16 v0, 0x7fc00000    # Float.NaN

    .line 1630
    iput v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$MediaBrowserCompatCustomActionResultReceiver;->AudioAttributesImplApi21Parcelizer:F

    .line 1631
    iput v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$MediaBrowserCompatCustomActionResultReceiver;->MediaBrowserCompatCustomActionResultReceiver:F

    .line 1632
    iput v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$MediaBrowserCompatCustomActionResultReceiver;->AudioAttributesImplApi26Parcelizer:I

    .line 1633
    iput v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$MediaBrowserCompatCustomActionResultReceiver;->MediaBrowserCompatItemReceiver:I

    return-void
.end method

.method public final read(F)V
    .registers 2

    .line 1661
    iput p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$MediaBrowserCompatCustomActionResultReceiver;->MediaBrowserCompatCustomActionResultReceiver:F

    return-void
.end method

.method public final read(I)V
    .registers 2

    .line 1657
    iput p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$MediaBrowserCompatCustomActionResultReceiver;->MediaBrowserCompatItemReceiver:I

    return-void
.end method

###### Class androidx.constraintlayout.motion.widget.MotionLayout.RemoteActionCompatParcelizer (androidx.constraintlayout.motion.widget.MotionLayout$RemoteActionCompatParcelizer)
.class final Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/constraintlayout/motion/widget/MotionLayout;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "RemoteActionCompatParcelizer"
.end annotation


# instance fields
.field final AudioAttributesCompatParcelizer:I

.field private AudioAttributesImplApi21Parcelizer:Landroid/graphics/Rect;

.field private AudioAttributesImplApi26Parcelizer:I

.field private AudioAttributesImplBaseParcelizer:Landroid/graphics/DashPathEffect;

.field final IconCompatParcelizer:I

.field final synthetic MediaBrowserCompatCustomActionResultReceiver:Landroidx/constraintlayout/motion/widget/MotionLayout;

.field private MediaBrowserCompatItemReceiver:Landroid/graphics/Paint;

.field private MediaBrowserCompatMediaItem:Landroid/graphics/Paint;

.field private MediaBrowserCompatSearchResultReceiver:Landroid/graphics/Paint;

.field private MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:I

.field private MediaDescriptionCompat:[F

.field private MediaMetadataCompat:Landroid/graphics/Paint;

.field private RatingCompat:Landroid/graphics/Path;

.field final RemoteActionCompatParcelizer:I

.field private handleMediaPlayPauseIfPendingOnHandler:[F

.field private onAddQueueItem:[I

.field private onCommand:Z

.field private onCustomAction:[F

.field private onPause:Landroid/graphics/Paint;

.field final read:I

.field final write:I


# direct methods
.method public constructor <init>(Landroidx/constraintlayout/motion/widget/MotionLayout;)V
    .registers 8

    .line 3133
    iput-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->MediaBrowserCompatCustomActionResultReceiver:Landroidx/constraintlayout/motion/widget/MotionLayout;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, -0x55cd

    .line 3122
    iput v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->AudioAttributesCompatParcelizer:I

    const v1, -0x1f8a66

    .line 3123
    iput v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->write:I

    const v2, -0xcc5600

    .line 3124
    iput v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->read:I

    const/high16 v3, 0x77000000

    .line 3125
    iput v3, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->IconCompatParcelizer:I

    const/16 v3, 0xa

    .line 3126
    iput v3, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->RemoteActionCompatParcelizer:I

    .line 3129
    new-instance v3, Landroid/graphics/Rect;

    invoke-direct {v3}, Landroid/graphics/Rect;-><init>()V

    iput-object v3, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->AudioAttributesImplApi21Parcelizer:Landroid/graphics/Rect;

    const/4 v3, 0x0

    .line 3130
    iput-boolean v3, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->onCommand:Z

    const/4 v3, 0x1

    .line 3131
    iput v3, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:I

    .line 3134
    new-instance v4, Landroid/graphics/Paint;

    invoke-direct {v4}, Landroid/graphics/Paint;-><init>()V

    iput-object v4, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->MediaBrowserCompatMediaItem:Landroid/graphics/Paint;

    .line 3135
    invoke-virtual {v4, v3}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 3136
    iget-object v4, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->MediaBrowserCompatMediaItem:Landroid/graphics/Paint;

    invoke-virtual {v4, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 3137
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->MediaBrowserCompatMediaItem:Landroid/graphics/Paint;

    const/high16 v4, 0x40000000    # 2.0f

    invoke-virtual {v0, v4}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 3138
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->MediaBrowserCompatMediaItem:Landroid/graphics/Paint;

    sget-object v5, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v5}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 3140
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->MediaBrowserCompatSearchResultReceiver:Landroid/graphics/Paint;

    .line 3141
    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 3142
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->MediaBrowserCompatSearchResultReceiver:Landroid/graphics/Paint;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 3143
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->MediaBrowserCompatSearchResultReceiver:Landroid/graphics/Paint;

    invoke-virtual {v0, v4}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 3144
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->MediaBrowserCompatSearchResultReceiver:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 3146
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->MediaMetadataCompat:Landroid/graphics/Paint;

    .line 3147
    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 3148
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->MediaMetadataCompat:Landroid/graphics/Paint;

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 3149
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->MediaMetadataCompat:Landroid/graphics/Paint;

    invoke-virtual {v0, v4}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 3150
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->MediaMetadataCompat:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 3152
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->onPause:Landroid/graphics/Paint;

    .line 3153
    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 3154
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->onPause:Landroid/graphics/Paint;

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 3155
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->onPause:Landroid/graphics/Paint;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p1

    iget p1, p1, Landroid/util/DisplayMetrics;->density:F

    const/high16 v1, 0x41400000    # 12.0f

    mul-float/2addr p1, v1

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setTextSize(F)V

    const/16 p1, 0x8

    .line 3156
    new-array p1, p1, [F

    iput-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->handleMediaPlayPauseIfPendingOnHandler:[F

    .line 3157
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    iput-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->MediaBrowserCompatItemReceiver:Landroid/graphics/Paint;

    .line 3158
    invoke-virtual {p1, v3}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    const/4 p1, 0x2

    .line 3159
    new-array p1, p1, [F

    fill-array-data p1, :array_d0

    new-instance v0, Landroid/graphics/DashPathEffect;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Landroid/graphics/DashPathEffect;-><init>([FF)V

    iput-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->AudioAttributesImplBaseParcelizer:Landroid/graphics/DashPathEffect;

    .line 3160
    iget-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->MediaMetadataCompat:Landroid/graphics/Paint;

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    const/16 p1, 0x64

    .line 3161
    new-array p1, p1, [F

    iput-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->MediaDescriptionCompat:[F

    const/16 p1, 0x32

    .line 3162
    new-array p1, p1, [I

    iput-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->onAddQueueItem:[I

    return-void

    :array_d0
    .array-data 4
        0x40800000    # 4.0f
        0x41000000    # 8.0f
    .end array-data
.end method

.method private AudioAttributesCompatParcelizer(Landroid/graphics/Canvas;FF)V
    .registers 22

    move-object/from16 v0, p0

    move-object/from16 v7, p1

    .line 3372
    iget-object v1, v0, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->onCustomAction:[F

    const/4 v2, 0x0

    aget v2, v1, v2

    const/4 v3, 0x1

    .line 3373
    aget v8, v1, v3

    .line 3374
    array-length v4, v1

    add-int/lit8 v4, v4, -0x2

    aget v4, v1, v4

    .line 3375
    array-length v5, v1

    sub-int/2addr v5, v3

    aget v9, v1, v5

    .line 3376
    invoke-static {v2, v4}, Ljava/lang/Math;->min(FF)F

    move-result v1

    .line 3377
    invoke-static {v8, v9}, Ljava/lang/Math;->max(FF)F

    move-result v10

    .line 3378
    invoke-static {v2, v4}, Ljava/lang/Math;->min(FF)F

    move-result v3

    sub-float v3, p2, v3

    .line 3379
    invoke-static {v8, v9}, Ljava/lang/Math;->max(FF)F

    move-result v5

    sub-float v11, v5, p3

    .line 3381
    new-instance v5, Ljava/lang/StringBuilder;

    const-string v12, ""

    invoke-direct {v5, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/high16 v13, 0x42c80000    # 100.0f

    mul-float v6, v3, v13

    sub-float v14, v4, v2

    invoke-static {v14}, Ljava/lang/Math;->abs(F)F

    move-result v14

    div-float/2addr v6, v14

    float-to-double v14, v6

    const-wide/high16 v16, 0x3fe0000000000000L    # 0.5

    add-double v14, v14, v16

    double-to-int v6, v14

    int-to-float v6, v6

    div-float/2addr v6, v13

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    .line 3382
    iget-object v6, v0, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->onPause:Landroid/graphics/Paint;

    invoke-direct {v0, v5, v6}, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->write(Ljava/lang/String;Landroid/graphics/Paint;)V

    const/high16 v14, 0x40000000    # 2.0f

    div-float/2addr v3, v14

    .line 3383
    iget-object v6, v0, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->AudioAttributesImplApi21Parcelizer:Landroid/graphics/Rect;

    invoke-virtual {v6}, Landroid/graphics/Rect;->width()I

    move-result v6

    div-int/lit8 v6, v6, 0x2

    int-to-float v6, v6

    sub-float/2addr v3, v6

    add-float/2addr v3, v1

    const/high16 v1, 0x41a00000    # 20.0f

    sub-float v1, p3, v1

    .line 3384
    iget-object v6, v0, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->onPause:Landroid/graphics/Paint;

    invoke-virtual {v7, v5, v3, v1, v6}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 3386
    invoke-static {v2, v4}, Ljava/lang/Math;->min(FF)F

    move-result v4

    iget-object v6, v0, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->MediaMetadataCompat:Landroid/graphics/Paint;

    move-object/from16 v1, p1

    move/from16 v2, p2

    move/from16 v3, p3

    move/from16 v5, p3

    .line 3385
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 3389
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    mul-float v2, v11, v13

    sub-float v3, v9, v8

    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    move-result v3

    div-float/2addr v2, v3

    float-to-double v2, v2

    add-double v2, v2, v16

    double-to-int v2, v2

    int-to-float v2, v2

    div-float/2addr v2, v13

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    .line 3390
    iget-object v2, v0, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->onPause:Landroid/graphics/Paint;

    invoke-direct {v0, v1, v2}, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->write(Ljava/lang/String;Landroid/graphics/Paint;)V

    div-float/2addr v11, v14

    .line 3391
    iget-object v2, v0, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->AudioAttributesImplApi21Parcelizer:Landroid/graphics/Rect;

    invoke-virtual {v2}, Landroid/graphics/Rect;->height()I

    move-result v2

    div-int/lit8 v2, v2, 0x2

    int-to-float v2, v2

    const/high16 v3, 0x40a00000    # 5.0f

    add-float v3, p2, v3

    sub-float/2addr v11, v2

    sub-float/2addr v10, v11

    .line 3392
    iget-object v2, v0, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->onPause:Landroid/graphics/Paint;

    invoke-virtual {v7, v1, v3, v10, v2}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 3394
    invoke-static {v8, v9}, Ljava/lang/Math;->max(FF)F

    move-result v4

    iget-object v5, v0, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->MediaMetadataCompat:Landroid/graphics/Paint;

    move-object/from16 v0, p1

    move/from16 v1, p2

    move/from16 v2, p3

    move/from16 v3, p2

    .line 3393
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    return-void
.end method

.method private AudioAttributesCompatParcelizer(Landroid/graphics/Canvas;IILo/handleSingleElementUnwrapped;)V
    .registers 21

    move-object/from16 v6, p0

    move-object/from16 v7, p1

    move/from16 v8, p2

    move-object/from16 v9, p4

    .line 3248
    iget-object v0, v9, Lo/handleSingleElementUnwrapped;->IconCompatParcelizer:Landroid/view/View;

    if-eqz v0, :cond_1b

    .line 3249
    iget-object v0, v9, Lo/handleSingleElementUnwrapped;->IconCompatParcelizer:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v0

    .line 3250
    iget-object v1, v9, Lo/handleSingleElementUnwrapped;->IconCompatParcelizer:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    move-result v1

    move v11, v0

    move v12, v1

    goto :goto_1d

    :cond_1b
    const/4 v11, 0x0

    const/4 v12, 0x0

    :goto_1d
    const/4 v13, 0x1

    move v14, v13

    :goto_1f
    add-int/lit8 v0, p3, -0x1

    const/4 v15, 0x2

    if-ge v14, v0, :cond_b7

    const/4 v0, 0x4

    if-ne v8, v0, :cond_2f

    .line 3253
    iget-object v1, v6, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->onAddQueueItem:[I

    add-int/lit8 v2, v14, -0x1

    aget v1, v1, v2

    if-eqz v1, :cond_b2

    .line 3258
    :cond_2f
    iget-object v1, v6, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->MediaDescriptionCompat:[F

    shl-int/lit8 v2, v14, 0x1

    aget v5, v1, v2

    add-int/2addr v2, v13

    .line 3259
    aget v4, v1, v2

    .line 3260
    iget-object v1, v6, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->RatingCompat:Landroid/graphics/Path;

    invoke-virtual {v1}, Landroid/graphics/Path;->reset()V

    .line 3261
    iget-object v1, v6, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->RatingCompat:Landroid/graphics/Path;

    const/high16 v2, 0x41200000    # 10.0f

    add-float v3, v4, v2

    invoke-virtual {v1, v5, v3}, Landroid/graphics/Path;->moveTo(FF)V

    .line 3262
    iget-object v1, v6, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->RatingCompat:Landroid/graphics/Path;

    add-float v3, v5, v2

    invoke-virtual {v1, v3, v4}, Landroid/graphics/Path;->lineTo(FF)V

    .line 3263
    iget-object v1, v6, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->RatingCompat:Landroid/graphics/Path;

    sub-float v3, v4, v2

    invoke-virtual {v1, v5, v3}, Landroid/graphics/Path;->lineTo(FF)V

    .line 3264
    iget-object v1, v6, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->RatingCompat:Landroid/graphics/Path;

    sub-float v2, v5, v2

    invoke-virtual {v1, v2, v4}, Landroid/graphics/Path;->lineTo(FF)V

    .line 3265
    iget-object v1, v6, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->RatingCompat:Landroid/graphics/Path;

    invoke-virtual {v1}, Landroid/graphics/Path;->close()V

    add-int/lit8 v1, v14, -0x1

    .line 3267
    invoke-virtual {v9, v1}, Lo/handleSingleElementUnwrapped;->AudioAttributesCompatParcelizer(I)Lo/PrimitiveArrayDeserializersLongDeser;

    if-ne v8, v0, :cond_90

    .line 3272
    iget-object v0, v6, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->onAddQueueItem:[I

    aget v0, v0, v1

    if-ne v0, v13, :cond_73

    .line 3273
    invoke-direct {v6, v7, v5, v4}, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->read(Landroid/graphics/Canvas;FF)V

    :cond_70
    :goto_70
    move v10, v4

    move v13, v5

    goto :goto_88

    :cond_73
    if-nez v0, :cond_79

    .line 3275
    invoke-direct {v6, v7, v5, v4}, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->AudioAttributesCompatParcelizer(Landroid/graphics/Canvas;FF)V

    goto :goto_70

    :cond_79
    if-ne v0, v15, :cond_70

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v5

    move v3, v4

    move v10, v4

    move v4, v11

    move v13, v5

    move v5, v12

    .line 3277
    invoke-direct/range {v0 .. v5}, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->RemoteActionCompatParcelizer(Landroid/graphics/Canvas;FFII)V

    .line 3280
    :goto_88
    iget-object v0, v6, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->RatingCompat:Landroid/graphics/Path;

    iget-object v1, v6, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->MediaBrowserCompatItemReceiver:Landroid/graphics/Paint;

    invoke-virtual {v7, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    goto :goto_92

    :cond_90
    move v10, v4

    move v13, v5

    :goto_92
    if-ne v8, v15, :cond_97

    .line 3283
    invoke-direct {v6, v7, v13, v10}, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->read(Landroid/graphics/Canvas;FF)V

    :cond_97
    const/4 v0, 0x3

    if-ne v8, v0, :cond_9d

    .line 3286
    invoke-direct {v6, v7, v13, v10}, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->AudioAttributesCompatParcelizer(Landroid/graphics/Canvas;FF)V

    :cond_9d
    const/4 v0, 0x6

    if-ne v8, v0, :cond_ab

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v13

    move v3, v10

    move v4, v11

    move v5, v12

    .line 3289
    invoke-direct/range {v0 .. v5}, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->RemoteActionCompatParcelizer(Landroid/graphics/Canvas;FFII)V

    .line 3294
    :cond_ab
    iget-object v0, v6, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->RatingCompat:Landroid/graphics/Path;

    iget-object v1, v6, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->MediaBrowserCompatItemReceiver:Landroid/graphics/Paint;

    invoke-virtual {v7, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    :cond_b2
    add-int/lit8 v14, v14, 0x1

    const/4 v13, 0x1

    goto/16 :goto_1f

    .line 3297
    :cond_b7
    iget-object v0, v6, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->onCustomAction:[F

    array-length v1, v0

    const/4 v2, 0x1

    if-le v1, v2, :cond_d8

    const/4 v1, 0x0

    .line 3299
    aget v1, v0, v1

    aget v0, v0, v2

    iget-object v3, v6, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->MediaBrowserCompatSearchResultReceiver:Landroid/graphics/Paint;

    const/high16 v4, 0x41000000    # 8.0f

    invoke-virtual {v7, v1, v0, v4, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 3300
    iget-object v0, v6, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->onCustomAction:[F

    array-length v1, v0

    sub-int/2addr v1, v15

    aget v1, v0, v1

    array-length v3, v0

    sub-int/2addr v3, v2

    aget v0, v0, v3

    iget-object v2, v6, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->MediaBrowserCompatSearchResultReceiver:Landroid/graphics/Paint;

    invoke-virtual {v7, v1, v0, v4, v2}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    :cond_d8
    return-void
.end method

.method private IconCompatParcelizer(Landroid/graphics/Canvas;)V
    .registers 3

    .line 3242
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->onCustomAction:[F

    iget-object p0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->MediaBrowserCompatMediaItem:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, p0}, Landroid/graphics/Canvas;->drawLines([FLandroid/graphics/Paint;)V

    return-void
.end method

.method private RemoteActionCompatParcelizer(Landroid/graphics/Canvas;)V
    .registers 10

    .line 3311
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->onCustomAction:[F

    const/4 v1, 0x0

    aget v3, v0, v1

    const/4 v1, 0x1

    aget v4, v0, v1

    array-length v2, v0

    add-int/lit8 v2, v2, -0x2

    aget v5, v0, v2

    array-length v2, v0

    sub-int/2addr v2, v1

    aget v6, v0, v2

    iget-object v7, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->MediaMetadataCompat:Landroid/graphics/Paint;

    move-object v2, p1

    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    return-void
.end method

.method private RemoteActionCompatParcelizer(Landroid/graphics/Canvas;FFII)V
    .registers 21

    move-object v0, p0

    move-object/from16 v7, p1

    .line 3407
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v8, ""

    invoke-direct {v1, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    div-int/lit8 v2, p4, 0x2

    int-to-float v2, v2

    sub-float v2, p2, v2

    const/high16 v9, 0x42c80000    # 100.0f

    mul-float/2addr v2, v9

    iget-object v3, v0, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->MediaBrowserCompatCustomActionResultReceiver:Landroidx/constraintlayout/motion/widget/MotionLayout;

    invoke-virtual {v3}, Landroid/view/View;->getWidth()I

    move-result v3

    sub-int v3, v3, p4

    int-to-float v3, v3

    div-float/2addr v2, v3

    float-to-double v2, v2

    const-wide/high16 v10, 0x3fe0000000000000L    # 0.5

    add-double/2addr v2, v10

    double-to-int v2, v2

    int-to-float v2, v2

    div-float/2addr v2, v9

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    .line 3408
    iget-object v2, v0, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->onPause:Landroid/graphics/Paint;

    invoke-direct {p0, v1, v2}, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->write(Ljava/lang/String;Landroid/graphics/Paint;)V

    const/high16 v12, 0x40000000    # 2.0f

    div-float v2, p2, v12

    .line 3409
    iget-object v3, v0, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->AudioAttributesImplApi21Parcelizer:Landroid/graphics/Rect;

    invoke-virtual {v3}, Landroid/graphics/Rect;->width()I

    move-result v3

    div-int/lit8 v3, v3, 0x2

    int-to-float v3, v3

    sub-float/2addr v2, v3

    const/4 v13, 0x0

    add-float/2addr v2, v13

    const/high16 v3, 0x41a00000    # 20.0f

    sub-float v3, p3, v3

    .line 3410
    iget-object v4, v0, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->onPause:Landroid/graphics/Paint;

    invoke-virtual {v7, v1, v2, v3, v4}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    const/high16 v14, 0x3f800000    # 1.0f

    .line 3412
    invoke-static {v13, v14}, Ljava/lang/Math;->min(FF)F

    move-result v4

    iget-object v6, v0, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->MediaMetadataCompat:Landroid/graphics/Paint;

    move-object/from16 v1, p1

    move/from16 v2, p2

    move/from16 v3, p3

    move/from16 v5, p3

    .line 3411
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 3415
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    div-int/lit8 v2, p5, 0x2

    int-to-float v2, v2

    sub-float v2, p3, v2

    mul-float/2addr v2, v9

    iget-object v3, v0, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->MediaBrowserCompatCustomActionResultReceiver:Landroidx/constraintlayout/motion/widget/MotionLayout;

    invoke-virtual {v3}, Landroid/view/View;->getHeight()I

    move-result v3

    sub-int v3, v3, p5

    int-to-float v3, v3

    div-float/2addr v2, v3

    float-to-double v2, v2

    add-double/2addr v2, v10

    double-to-int v2, v2

    int-to-float v2, v2

    div-float/2addr v2, v9

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    .line 3416
    iget-object v2, v0, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->onPause:Landroid/graphics/Paint;

    invoke-direct {p0, v1, v2}, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->write(Ljava/lang/String;Landroid/graphics/Paint;)V

    div-float v2, p3, v12

    .line 3417
    iget-object v3, v0, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->AudioAttributesImplApi21Parcelizer:Landroid/graphics/Rect;

    invoke-virtual {v3}, Landroid/graphics/Rect;->height()I

    move-result v3

    div-int/lit8 v3, v3, 0x2

    int-to-float v3, v3

    const/high16 v4, 0x40a00000    # 5.0f

    add-float v4, p2, v4

    sub-float/2addr v2, v3

    sub-float v2, v13, v2

    .line 3418
    iget-object v3, v0, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->onPause:Landroid/graphics/Paint;

    invoke-virtual {v7, v1, v4, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 3420
    invoke-static {v13, v14}, Ljava/lang/Math;->max(FF)F

    move-result v4

    iget-object v5, v0, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->MediaMetadataCompat:Landroid/graphics/Paint;

    move-object/from16 v0, p1

    move/from16 v1, p2

    move/from16 v2, p3

    move/from16 v3, p2

    .line 3419
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    return-void
.end method

.method private RemoteActionCompatParcelizer(Landroid/graphics/Canvas;IILo/handleSingleElementUnwrapped;)V
    .registers 6

    const/4 v0, 0x4

    if-ne p2, v0, :cond_6

    .line 3229
    invoke-direct {p0, p1}, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->read(Landroid/graphics/Canvas;)V

    :cond_6
    const/4 v0, 0x2

    if-ne p2, v0, :cond_c

    .line 3232
    invoke-direct {p0, p1}, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->RemoteActionCompatParcelizer(Landroid/graphics/Canvas;)V

    :cond_c
    const/4 v0, 0x3

    if-ne p2, v0, :cond_12

    .line 3235
    invoke-direct {p0, p1}, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->write(Landroid/graphics/Canvas;)V

    .line 3237
    :cond_12
    invoke-direct {p0, p1}, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->IconCompatParcelizer(Landroid/graphics/Canvas;)V

    .line 3238
    invoke-direct {p0, p1, p2, p3, p4}, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->AudioAttributesCompatParcelizer(Landroid/graphics/Canvas;IILo/handleSingleElementUnwrapped;)V

    return-void
.end method

.method private RemoteActionCompatParcelizer(Landroid/graphics/Canvas;Lo/handleSingleElementUnwrapped;)V
    .registers 9

    .line 3424
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->RatingCompat:Landroid/graphics/Path;

    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    const/4 v0, 0x0

    move v1, v0

    :goto_7
    const/16 v2, 0x32

    if-gt v1, v2, :cond_4f

    int-to-float v2, v1

    const/high16 v3, 0x42480000    # 50.0f

    div-float/2addr v2, v3

    .line 3428
    iget-object v3, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->handleMediaPlayPauseIfPendingOnHandler:[F

    invoke-virtual {p2, v2, v3}, Lo/handleSingleElementUnwrapped;->IconCompatParcelizer(F[F)V

    .line 3429
    iget-object v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->RatingCompat:Landroid/graphics/Path;

    iget-object v3, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->handleMediaPlayPauseIfPendingOnHandler:[F

    aget v4, v3, v0

    const/4 v5, 0x1

    aget v3, v3, v5

    invoke-virtual {v2, v4, v3}, Landroid/graphics/Path;->moveTo(FF)V

    .line 3430
    iget-object v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->RatingCompat:Landroid/graphics/Path;

    iget-object v3, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->handleMediaPlayPauseIfPendingOnHandler:[F

    const/4 v4, 0x2

    aget v4, v3, v4

    const/4 v5, 0x3

    aget v3, v3, v5

    invoke-virtual {v2, v4, v3}, Landroid/graphics/Path;->lineTo(FF)V

    .line 3431
    iget-object v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->RatingCompat:Landroid/graphics/Path;

    iget-object v3, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->handleMediaPlayPauseIfPendingOnHandler:[F

    const/4 v4, 0x4

    aget v4, v3, v4

    const/4 v5, 0x5

    aget v3, v3, v5

    invoke-virtual {v2, v4, v3}, Landroid/graphics/Path;->lineTo(FF)V

    .line 3432
    iget-object v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->RatingCompat:Landroid/graphics/Path;

    iget-object v3, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->handleMediaPlayPauseIfPendingOnHandler:[F

    const/4 v4, 0x6

    aget v4, v3, v4

    const/4 v5, 0x7

    aget v3, v3, v5

    invoke-virtual {v2, v4, v3}, Landroid/graphics/Path;->lineTo(FF)V

    .line 3433
    iget-object v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->RatingCompat:Landroid/graphics/Path;

    invoke-virtual {v2}, Landroid/graphics/Path;->close()V

    add-int/lit8 v1, v1, 0x1

    goto :goto_7

    .line 3435
    :cond_4f
    iget-object p2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->MediaBrowserCompatMediaItem:Landroid/graphics/Paint;

    const/high16 v0, 0x44000000    # 512.0f

    invoke-virtual {p2, v0}, Landroid/graphics/Paint;->setColor(I)V

    const/high16 p2, 0x40000000    # 2.0f

    .line 3436
    invoke-virtual {p1, p2, p2}, Landroid/graphics/Canvas;->translate(FF)V

    .line 3437
    iget-object p2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->RatingCompat:Landroid/graphics/Path;

    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->MediaBrowserCompatMediaItem:Landroid/graphics/Paint;

    invoke-virtual {p1, p2, v0}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    const/high16 p2, -0x40000000    # -2.0f

    .line 3439
    invoke-virtual {p1, p2, p2}, Landroid/graphics/Canvas;->translate(FF)V

    .line 3440
    iget-object p2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->MediaBrowserCompatMediaItem:Landroid/graphics/Paint;

    const/high16 v0, -0x10000

    invoke-virtual {p2, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 3441
    iget-object p2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->RatingCompat:Landroid/graphics/Path;

    iget-object p0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->MediaBrowserCompatMediaItem:Landroid/graphics/Paint;

    invoke-virtual {p1, p2, p0}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    return-void
.end method

.method private read(Landroid/graphics/Canvas;)V
    .registers 7

    const/4 v0, 0x0

    move v1, v0

    move v2, v1

    .line 3318
    :goto_3
    iget v3, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->AudioAttributesImplApi26Parcelizer:I

    if-ge v0, v3, :cond_15

    .line 3319
    iget-object v3, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->onAddQueueItem:[I

    aget v3, v3, v0

    const/4 v4, 0x1

    if-ne v3, v4, :cond_f

    move v1, v4

    :cond_f
    if-nez v3, :cond_12

    move v2, v4

    :cond_12
    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    :cond_15
    if-eqz v1, :cond_1a

    .line 3327
    invoke-direct {p0, p1}, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->RemoteActionCompatParcelizer(Landroid/graphics/Canvas;)V

    :cond_1a
    if-eqz v2, :cond_1f

    .line 3330
    invoke-direct {p0, p1}, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->write(Landroid/graphics/Canvas;)V

    :cond_1f
    return-void
.end method

.method private read(Landroid/graphics/Canvas;FF)V
    .registers 16

    .line 3335
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->onCustomAction:[F

    const/4 v1, 0x0

    aget v1, v0, v1

    const/4 v2, 0x1

    .line 3336
    aget v3, v0, v2

    .line 3337
    array-length v4, v0

    add-int/lit8 v4, v4, -0x2

    aget v4, v0, v4

    .line 3338
    array-length v5, v0

    sub-int/2addr v5, v2

    aget v0, v0, v5

    sub-float v2, v1, v4

    float-to-double v5, v2

    sub-float v2, v3, v0

    float-to-double v7, v2

    .line 3339
    invoke-static {v5, v6, v7, v8}, Ljava/lang/Math;->hypot(DD)D

    move-result-wide v5

    double-to-float v2, v5

    sub-float/2addr v4, v1

    sub-float/2addr v0, v3

    sub-float v5, p2, v1

    mul-float/2addr v5, v4

    sub-float v6, p3, v3

    mul-float/2addr v6, v0

    add-float/2addr v5, v6

    mul-float v6, v2, v2

    div-float/2addr v5, v6

    mul-float/2addr v4, v5

    add-float v9, v1, v4

    mul-float/2addr v5, v0

    add-float v10, v3, v5

    .line 3344
    new-instance v5, Landroid/graphics/Path;

    invoke-direct {v5}, Landroid/graphics/Path;-><init>()V

    .line 3345
    invoke-virtual {v5, p2, p3}, Landroid/graphics/Path;->moveTo(FF)V

    .line 3346
    invoke-virtual {v5, v9, v10}, Landroid/graphics/Path;->lineTo(FF)V

    sub-float v0, v9, p2

    float-to-double v0, v0

    sub-float v3, v10, p3

    float-to-double v3, v3

    .line 3347
    invoke-static {v0, v1, v3, v4}, Ljava/lang/Math;->hypot(DD)D

    move-result-wide v0

    double-to-float v0, v0

    .line 3348
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, ""

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/high16 v3, 0x42c80000    # 100.0f

    mul-float v4, v0, v3

    div-float/2addr v4, v2

    float-to-int v2, v4

    int-to-float v2, v2

    div-float/2addr v2, v3

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    .line 3349
    iget-object v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->onPause:Landroid/graphics/Paint;

    invoke-direct {p0, v4, v1}, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->write(Ljava/lang/String;Landroid/graphics/Paint;)V

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    .line 3350
    iget-object v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->AudioAttributesImplApi21Parcelizer:Landroid/graphics/Rect;

    invoke-virtual {v1}, Landroid/graphics/Rect;->width()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    int-to-float v1, v1

    sub-float v6, v0, v1

    const/high16 v7, -0x3e600000    # -20.0f

    .line 3351
    iget-object v8, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->onPause:Landroid/graphics/Paint;

    move-object v3, p1

    invoke-virtual/range {v3 .. v8}, Landroid/graphics/Canvas;->drawTextOnPath(Ljava/lang/String;Landroid/graphics/Path;FFLandroid/graphics/Paint;)V

    .line 3352
    iget-object v11, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->MediaMetadataCompat:Landroid/graphics/Paint;

    move-object v6, p1

    move v7, p2

    move v8, p3

    invoke-virtual/range {v6 .. v11}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    return-void
.end method

.method private write(Landroid/graphics/Canvas;)V
    .registers 20

    move-object/from16 v0, p0

    .line 3360
    iget-object v1, v0, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->onCustomAction:[F

    const/4 v2, 0x0

    aget v2, v1, v2

    const/4 v3, 0x1

    .line 3361
    aget v4, v1, v3

    .line 3362
    array-length v5, v1

    add-int/lit8 v5, v5, -0x2

    aget v5, v1, v5

    .line 3363
    array-length v6, v1

    sub-int/2addr v6, v3

    aget v1, v1, v6

    .line 3365
    invoke-static {v2, v5}, Ljava/lang/Math;->min(FF)F

    move-result v7

    invoke-static {v4, v1}, Ljava/lang/Math;->max(FF)F

    move-result v8

    .line 3366
    invoke-static {v2, v5}, Ljava/lang/Math;->max(FF)F

    move-result v9

    invoke-static {v4, v1}, Ljava/lang/Math;->max(FF)F

    move-result v10

    iget-object v11, v0, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->MediaMetadataCompat:Landroid/graphics/Paint;

    move-object/from16 v6, p1

    .line 3365
    invoke-virtual/range {v6 .. v11}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 3367
    invoke-static {v2, v5}, Ljava/lang/Math;->min(FF)F

    move-result v13

    invoke-static {v4, v1}, Ljava/lang/Math;->min(FF)F

    move-result v14

    .line 3368
    invoke-static {v2, v5}, Ljava/lang/Math;->min(FF)F

    move-result v15

    invoke-static {v4, v1}, Ljava/lang/Math;->max(FF)F

    move-result v16

    iget-object v0, v0, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->MediaMetadataCompat:Landroid/graphics/Paint;

    move-object/from16 v12, p1

    move-object/from16 v17, v0

    .line 3367
    invoke-virtual/range {v12 .. v17}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    return-void
.end method

.method private write(Ljava/lang/String;Landroid/graphics/Paint;)V
    .registers 5

    .line 3356
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    iget-object p0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->AudioAttributesImplApi21Parcelizer:Landroid/graphics/Rect;

    const/4 v1, 0x0

    invoke-virtual {p2, p1, v1, v0, p0}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    return-void
.end method


# virtual methods
.method public final read(Landroid/graphics/Canvas;Ljava/util/HashMap;II)V
    .registers 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/Canvas;",
            "Ljava/util/HashMap<",
            "Landroid/view/View;",
            "Lo/handleSingleElementUnwrapped;",
            ">;II)V"
        }
    .end annotation

    if-eqz p2, :cond_102

    .line 3175
    invoke-virtual {p2}, Ljava/util/AbstractMap;->size()I

    move-result v0

    if-eqz v0, :cond_102

    .line 3178
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 3179
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->MediaBrowserCompatCustomActionResultReceiver:Landroidx/constraintlayout/motion/widget/MotionLayout;

    invoke-virtual {v0}, Landroid/view/View;->isInEditMode()Z

    move-result v0

    if-nez v0, :cond_66

    and-int/lit8 v0, p4, 0x1

    const/4 v1, 0x2

    if-ne v0, v1, :cond_66

    .line 3180
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->MediaBrowserCompatCustomActionResultReceiver:Landroidx/constraintlayout/motion/widget/MotionLayout;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    iget-object v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->MediaBrowserCompatCustomActionResultReceiver:Landroidx/constraintlayout/motion/widget/MotionLayout;

    invoke-static {v2}, Landroidx/constraintlayout/motion/widget/MotionLayout;->read(Landroidx/constraintlayout/motion/widget/MotionLayout;)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->MediaBrowserCompatCustomActionResultReceiver:Landroidx/constraintlayout/motion/widget/MotionLayout;

    invoke-virtual {v1}, Landroidx/constraintlayout/motion/widget/MotionLayout;->AudioAttributesCompatParcelizer()F

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    .line 3181
    iget-object v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->MediaBrowserCompatCustomActionResultReceiver:Landroidx/constraintlayout/motion/widget/MotionLayout;

    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    move-result v1

    add-int/lit8 v1, v1, -0x1e

    int-to-float v1, v1

    iget-object v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->onPause:Landroid/graphics/Paint;

    const/high16 v3, 0x41200000    # 10.0f

    invoke-virtual {p1, v0, v3, v1, v2}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 3182
    iget-object v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->MediaBrowserCompatCustomActionResultReceiver:Landroidx/constraintlayout/motion/widget/MotionLayout;

    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    move-result v1

    add-int/lit8 v1, v1, -0x1d

    int-to-float v1, v1

    iget-object v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->MediaBrowserCompatMediaItem:Landroid/graphics/Paint;

    const/high16 v3, 0x41300000    # 11.0f

    invoke-virtual {p1, v0, v3, v1, v2}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 3184
    :cond_66
    invoke-virtual {p2}, Ljava/util/AbstractMap;->values()Ljava/util/Collection;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_6e
    :goto_6e
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_ff

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/handleSingleElementUnwrapped;

    .line 3185
    invoke-virtual {v0}, Lo/handleSingleElementUnwrapped;->RemoteActionCompatParcelizer()I

    move-result v1

    if-lez p4, :cond_83

    if-nez v1, :cond_83

    const/4 v1, 0x1

    :cond_83
    if-eqz v1, :cond_6e

    .line 3193
    iget-object v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->MediaDescriptionCompat:[F

    iget-object v3, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->onAddQueueItem:[I

    invoke-virtual {v0, v2, v3}, Lo/handleSingleElementUnwrapped;->RemoteActionCompatParcelizer([F[I)I

    move-result v2

    iput v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->AudioAttributesImplApi26Parcelizer:I

    if-lez v1, :cond_6e

    .line 3197
    div-int/lit8 v2, p3, 0x10

    .line 3198
    iget-object v3, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->onCustomAction:[F

    if-eqz v3, :cond_9c

    array-length v3, v3

    shl-int/lit8 v4, v2, 0x1

    if-eq v3, v4, :cond_a9

    :cond_9c
    shl-int/lit8 v3, v2, 0x1

    .line 3199
    new-array v3, v3, [F

    iput-object v3, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->onCustomAction:[F

    .line 3200
    new-instance v3, Landroid/graphics/Path;

    invoke-direct {v3}, Landroid/graphics/Path;-><init>()V

    iput-object v3, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->RatingCompat:Landroid/graphics/Path;

    .line 3203
    :cond_a9
    iget v3, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:I

    int-to-float v3, v3

    invoke-virtual {p1, v3, v3}, Landroid/graphics/Canvas;->translate(FF)V

    .line 3205
    iget-object v3, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->MediaBrowserCompatMediaItem:Landroid/graphics/Paint;

    const/high16 v4, 0x77000000

    invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setColor(I)V

    .line 3206
    iget-object v3, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->MediaBrowserCompatItemReceiver:Landroid/graphics/Paint;

    invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setColor(I)V

    .line 3207
    iget-object v3, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->MediaBrowserCompatSearchResultReceiver:Landroid/graphics/Paint;

    invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setColor(I)V

    .line 3208
    iget-object v3, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->MediaMetadataCompat:Landroid/graphics/Paint;

    invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setColor(I)V

    .line 3209
    iget-object v3, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->onCustomAction:[F

    invoke-virtual {v0, v3, v2}, Lo/handleSingleElementUnwrapped;->AudioAttributesCompatParcelizer([FI)V

    .line 3210
    iget v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->AudioAttributesImplApi26Parcelizer:I

    invoke-direct {p0, p1, v1, v2, v0}, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->RemoteActionCompatParcelizer(Landroid/graphics/Canvas;IILo/handleSingleElementUnwrapped;)V

    .line 3211
    iget-object v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->MediaBrowserCompatMediaItem:Landroid/graphics/Paint;

    const/16 v3, -0x55cd

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 3212
    iget-object v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->MediaBrowserCompatSearchResultReceiver:Landroid/graphics/Paint;

    const v3, -0x1f8a66

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 3213
    iget-object v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->MediaBrowserCompatItemReceiver:Landroid/graphics/Paint;

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 3214
    iget-object v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->MediaMetadataCompat:Landroid/graphics/Paint;

    const v3, -0xcc5600

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 3216
    iget v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:I

    neg-int v2, v2

    int-to-float v2, v2

    invoke-virtual {p1, v2, v2}, Landroid/graphics/Canvas;->translate(FF)V

    .line 3217
    iget v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->AudioAttributesImplApi26Parcelizer:I

    invoke-direct {p0, p1, v1, v2, v0}, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->RemoteActionCompatParcelizer(Landroid/graphics/Canvas;IILo/handleSingleElementUnwrapped;)V

    const/4 v2, 0x5

    if-ne v1, v2, :cond_6e

    .line 3219
    invoke-direct {p0, p1, v0}, Landroidx/constraintlayout/motion/widget/MotionLayout$RemoteActionCompatParcelizer;->RemoteActionCompatParcelizer(Landroid/graphics/Canvas;Lo/handleSingleElementUnwrapped;)V

    goto/16 :goto_6e

    .line 3224
    :cond_ff
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    :cond_102
    return-void
.end method

###### Class androidx.constraintlayout.motion.widget.MotionLayout.read (androidx.constraintlayout.motion.widget.MotionLayout$read)
.class final Landroidx/constraintlayout/motion/widget/MotionLayout$read;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/constraintlayout/motion/widget/MotionLayout$write;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/constraintlayout/motion/widget/MotionLayout;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "read"
.end annotation


# static fields
.field private static IconCompatParcelizer:Landroidx/constraintlayout/motion/widget/MotionLayout$read;


# instance fields
.field private AudioAttributesCompatParcelizer:Landroid/view/VelocityTracker;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 1230
    new-instance v0, Landroidx/constraintlayout/motion/widget/MotionLayout$read;

    invoke-direct {v0}, Landroidx/constraintlayout/motion/widget/MotionLayout$read;-><init>()V

    sput-object v0, Landroidx/constraintlayout/motion/widget/MotionLayout$read;->IconCompatParcelizer:Landroidx/constraintlayout/motion/widget/MotionLayout$read;

    return-void
.end method

.method private constructor <init>()V
    .registers 1

    .line 1228
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static IconCompatParcelizer()Landroidx/constraintlayout/motion/widget/MotionLayout$read;
    .registers 2

    .line 1233
    sget-object v0, Landroidx/constraintlayout/motion/widget/MotionLayout$read;->IconCompatParcelizer:Landroidx/constraintlayout/motion/widget/MotionLayout$read;

    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    move-result-object v1

    iput-object v1, v0, Landroidx/constraintlayout/motion/widget/MotionLayout$read;->AudioAttributesCompatParcelizer:Landroid/view/VelocityTracker;

    .line 1234
    sget-object v0, Landroidx/constraintlayout/motion/widget/MotionLayout$read;->IconCompatParcelizer:Landroidx/constraintlayout/motion/widget/MotionLayout$read;

    return-object v0
.end method


# virtual methods
.method public final RemoteActionCompatParcelizer()F
    .registers 1

    .line 1283
    iget-object p0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$read;->AudioAttributesCompatParcelizer:Landroid/view/VelocityTracker;

    if-eqz p0, :cond_9

    .line 1284
    invoke-virtual {p0}, Landroid/view/VelocityTracker;->getYVelocity()F

    move-result p0

    return p0

    :cond_9
    const/4 p0, 0x0

    return p0
.end method

.method public final RemoteActionCompatParcelizer(I)V
    .registers 2

    .line 1261
    iget-object p0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$read;->AudioAttributesCompatParcelizer:Landroid/view/VelocityTracker;

    if-eqz p0, :cond_7

    .line 1262
    invoke-virtual {p0, p1}, Landroid/view/VelocityTracker;->computeCurrentVelocity(I)V

    :cond_7
    return-void
.end method

.method public final RemoteActionCompatParcelizer(Landroid/view/MotionEvent;)V
    .registers 2

    .line 1254
    iget-object p0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$read;->AudioAttributesCompatParcelizer:Landroid/view/VelocityTracker;

    if-eqz p0, :cond_7

    .line 1255
    invoke-virtual {p0, p1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    :cond_7
    return-void
.end method

.method public final read()F
    .registers 1

    .line 1275
    iget-object p0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$read;->AudioAttributesCompatParcelizer:Landroid/view/VelocityTracker;

    if-eqz p0, :cond_9

    .line 1276
    invoke-virtual {p0}, Landroid/view/VelocityTracker;->getXVelocity()F

    move-result p0

    return p0

    :cond_9
    const/4 p0, 0x0

    return p0
.end method

.method public final write()V
    .registers 2

    .line 1239
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$read;->AudioAttributesCompatParcelizer:Landroid/view/VelocityTracker;

    if-eqz v0, :cond_a

    .line 1240
    invoke-virtual {v0}, Landroid/view/VelocityTracker;->recycle()V

    const/4 v0, 0x0

    .line 1241
    iput-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$read;->AudioAttributesCompatParcelizer:Landroid/view/VelocityTracker;

    :cond_a
    return-void
.end method

###### Class androidx.constraintlayout.motion.widget.MotionLayout.write (androidx.constraintlayout.motion.widget.MotionLayout$write)
.class public interface abstract Landroidx/constraintlayout/motion/widget/MotionLayout$write;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/constraintlayout/motion/widget/MotionLayout;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "write"
.end annotation


# virtual methods
.method public abstract RemoteActionCompatParcelizer()F
.end method

.method public abstract RemoteActionCompatParcelizer(I)V
.end method

.method public abstract RemoteActionCompatParcelizer(Landroid/view/MotionEvent;)V
.end method

.method public abstract read()F
.end method

.method public abstract write()V
.end method
