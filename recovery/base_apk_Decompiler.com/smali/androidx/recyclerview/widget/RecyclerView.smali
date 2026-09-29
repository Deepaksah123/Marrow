###### Class androidx.recyclerview.widget.RecyclerView (androidx.recyclerview.widget.RecyclerView)
.class public Landroidx/recyclerview/widget/RecyclerView;
.super Landroid/view/ViewGroup;
.source "SourceFile"

# interfaces
.implements Lo/_putValueHandleDups;
.implements Lo/addValue;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;,
        Landroidx/recyclerview/widget/RecyclerView$AudioAttributesCompatParcelizer;,
        Landroidx/recyclerview/widget/RecyclerView$read;,
        Landroidx/recyclerview/widget/RecyclerView$write;,
        Landroidx/recyclerview/widget/RecyclerView$RemoteActionCompatParcelizer;,
        Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer;,
        Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatCustomActionResultReceiver;,
        Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplBaseParcelizer;,
        Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;,
        Landroidx/recyclerview/widget/RecyclerView$LayoutParams;,
        Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi21Parcelizer;,
        Landroidx/recyclerview/widget/RecyclerView$RatingCompat;,
        Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatMediaItem;,
        Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatSearchResultReceiver;,
        Landroidx/recyclerview/widget/RecyclerView$MediaMetadataCompat;,
        Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;,
        Landroidx/recyclerview/widget/RecyclerView$onAddQueueItem;,
        Landroidx/recyclerview/widget/RecyclerView$onCommand;,
        Landroidx/recyclerview/widget/RecyclerView$SavedState;,
        Landroidx/recyclerview/widget/RecyclerView$onCustomAction;,
        Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;,
        Landroidx/recyclerview/widget/RecyclerView$handleMediaPlayPauseIfPendingOnHandler;,
        Landroidx/recyclerview/widget/RecyclerView$onPlayFromMediaId;,
        Landroidx/recyclerview/widget/RecyclerView$onFastForward;,
        Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;
    }
.end annotation


# static fields
.field static final AudioAttributesCompatParcelizer:Z

.field public static AudioAttributesImplApi26Parcelizer:Z = false

.field static AudioAttributesImplBaseParcelizer:Z = false

.field static final IconCompatParcelizer:Z

.field static final MediaBrowserCompatCustomActionResultReceiver:Landroid/view/animation/Interpolator;

.field private static final RemoteActionCompatParcelizer:F

.field private static final onSkipToNext:[Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field private static final onSkipToPrevious:[I

.field private static onStop:Landroidx/recyclerview/widget/RecyclerView$handleMediaPlayPauseIfPendingOnHandler;

.field static final read:Z

.field static final write:Z


# instance fields
.field AudioAttributesImplApi21Parcelizer:Lo/UIntKeyDeserializer;

.field public MediaBrowserCompatItemReceiver:Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;

.field MediaBrowserCompatMediaItem:Z

.field public MediaBrowserCompatSearchResultReceiver:Lo/TypesKt;

.field MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Z

.field MediaDescriptionCompat:Z

.field public MediaMetadataCompat:Lo/RegexDeserializer;

.field private MediaSessionCompatQueueItem:Landroidx/recyclerview/widget/RecyclerView$RemoteActionCompatParcelizer;

.field private MediaSessionCompatResultReceiverWrapper:I

.field private MediaSessionCompatToken:I

.field private ParcelableVolumeInfo:Landroidx/recyclerview/widget/RecyclerView$write;

.field private PlaybackStateCompat:Z

.field private PlaybackStateCompatCustomAction:Z

.field public RatingCompat:Z

.field private ResultReceiver:I

.field private _init_lambda2:I

.field private _init_lambda3:Ljava/lang/Runnable;

.field private _init_lambda4:I

.field private _init_lambda5:Z

.field private accessaddObserverForBackInvoker:I

.field private accessensureViewModelStore:Landroid/widget/EdgeEffect;

.field private accessgetReportFullyDrawnExecutorp:I

.field private final accessonBackPresseds1027565324:Landroidx/recyclerview/widget/RecyclerView$onCommand;

.field private final addContentView:F

.field private addMenuProvider:Landroidx/recyclerview/widget/RecyclerView$RatingCompat;

.field private final addObserverForBackInvoker:[I

.field private final addObserverForBackInvokerlambda7:I

.field private addOnConfigurationChangedListener:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatSearchResultReceiver;

.field private addOnContextAvailableListener:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatSearchResultReceiver;",
            ">;"
        }
    .end annotation
.end field

.field private addOnMultiWindowModeChangedListener:Landroid/widget/EdgeEffect;

.field private addOnNewIntentListener:F

.field private addOnPictureInPictureModeChangedListener:F

.field private addOnTrimMemoryListener:I

.field private addOnUserLeaveHintListener:Lo/rootObjectScope;

.field private final createFullyDrawnExecutor:I

.field private final ensureViewModelStore:[I

.field private final getActivityResultRegistry:[I

.field private getDefaultViewModelCreationExtras:I

.field private final getDefaultViewModelProviderFactory:Landroid/graphics/Rect;

.field private getFullyDrawnReporter:Landroid/widget/EdgeEffect;

.field private getLastCustomNonConfigurationInstance:I

.field private final getLifecycle:Lo/UIntSerializer$AudioAttributesCompatParcelizer;

.field private getOnBackPressedDispatcherannotations:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi21Parcelizer;",
            ">;"
        }
    .end annotation
.end field

.field private getSavedStateRegistry:Landroid/view/VelocityTracker;

.field private getSavedStateRegistryControllerannotations:Z

.field handleMediaPlayPauseIfPendingOnHandler:Z

.field private final menuHostHelperlambda0:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatMediaItem;",
            ">;"
        }
    .end annotation
.end field

.field onAddQueueItem:Lo/SingletonSupport;

.field onCommand:Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer;

.field onCustomAction:Z

.field onFastForward:Z

.field onMediaButtonEvent:Z

.field final onPause:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplBaseParcelizer;",
            ">;"
        }
    .end annotation
.end field

.field onPlay:Z

.field public onPlayFromMediaId:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

.field public onPlayFromSearch:Lo/SingletonSupport$read;

.field onPlayFromUri:Z

.field onPrepare:Z

.field onPrepareFromMediaId:Landroidx/recyclerview/widget/RecyclerView$SavedState;

.field final onPrepareFromSearch:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;",
            ">;"
        }
    .end annotation
.end field

.field public final onPrepareFromUri:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

.field final onRemoveQueueItem:[I

.field public final onRemoveQueueItemAt:Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;

.field final onRewind:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/recyclerview/widget/RecyclerView$onAddQueueItem;",
            ">;"
        }
    .end annotation
.end field

.field onSeekTo:Landroidx/recyclerview/widget/RecyclerView$onAddQueueItem;

.field final onSetCaptioningEnabled:Landroidx/recyclerview/widget/RecyclerView$onFastForward;

.field final onSetPlaybackSpeed:Landroid/graphics/Rect;

.field final onSetRating:Lo/UIntSerializer;

.field final onSetRepeatMode:Landroid/graphics/RectF;

.field final onSetShuffleMode:Ljava/lang/Runnable;

.field private onSkipToQueueItem:Landroid/widget/EdgeEffect;

.field private r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw:Z

.field private r8lambdaKUbBm7ckfqTc9QCgukC86fguu4:I

.field private r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM:I

.field private r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28:Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer$read;

.field private r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatMediaItem;

.field private r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0:I

.field private final setSessionImpl:Landroid/view/accessibility/AccessibilityManager;


# direct methods
.method static constructor <clinit>()V
    .registers 4

    const v0, 0x1010436

    .line 227
    filled-new-array {v0}, [I

    move-result-object v0

    sput-object v0, Landroidx/recyclerview/widget/RecyclerView;->onSkipToPrevious:[I

    const-wide v0, 0x3fe8f5c28f5c28f6L    # 0.78

    .line 235
    invoke-static {v0, v1}, Ljava/lang/Math;->log(D)D

    move-result-wide v0

    const-wide v2, 0x3feccccccccccccdL    # 0.9

    invoke-static {v2, v3}, Ljava/lang/Math;->log(D)D

    move-result-wide v2

    div-double/2addr v0, v2

    double-to-float v0, v0

    sput v0, Landroidx/recyclerview/widget/RecyclerView;->RemoteActionCompatParcelizer:F

    const/4 v0, 0x0

    .line 245
    sput-boolean v0, Landroidx/recyclerview/widget/RecyclerView;->write:Z

    const/4 v0, 0x1

    .line 252
    sput-boolean v0, Landroidx/recyclerview/widget/RecyclerView;->read:Z

    .line 254
    sput-boolean v0, Landroidx/recyclerview/widget/RecyclerView;->AudioAttributesCompatParcelizer:Z

    .line 260
    sput-boolean v0, Landroidx/recyclerview/widget/RecyclerView;->IconCompatParcelizer:Z

    .line 387
    const-class v0, Landroid/content/Context;

    const-class v1, Landroid/util/AttributeSet;

    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    sget-object v3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    filled-new-array {v0, v1, v2, v3}, [Ljava/lang/Class;

    move-result-object v0

    sput-object v0, Landroidx/recyclerview/widget/RecyclerView;->onSkipToNext:[Ljava/lang/Class;

    .line 660
    new-instance v0, Landroidx/recyclerview/widget/RecyclerView$2;

    invoke-direct {v0}, Landroidx/recyclerview/widget/RecyclerView$2;-><init>()V

    sput-object v0, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatCustomActionResultReceiver:Landroid/view/animation/Interpolator;

    .line 668
    new-instance v0, Landroidx/recyclerview/widget/RecyclerView$handleMediaPlayPauseIfPendingOnHandler;

    invoke-direct {v0}, Landroidx/recyclerview/widget/RecyclerView$handleMediaPlayPauseIfPendingOnHandler;-><init>()V

    sput-object v0, Landroidx/recyclerview/widget/RecyclerView;->onStop:Landroidx/recyclerview/widget/RecyclerView$handleMediaPlayPauseIfPendingOnHandler;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .registers 3

    const/4 v0, 0x0

    .line 735
    invoke-direct {p0, p1, v0}, Landroidx/recyclerview/widget/RecyclerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 4

    .line 739
    sget v0, Lo/accessgetTRUEcp$RemoteActionCompatParcelizer;->recyclerViewStyle:I

    invoke-direct {p0, p1, p2, v0}, Landroidx/recyclerview/widget/RecyclerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 19

    move-object v7, p0

    move-object/from16 v8, p1

    move-object/from16 v9, p2

    move/from16 v10, p3

    .line 743
    invoke-direct/range {p0 .. p3}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 419
    new-instance v0, Landroidx/recyclerview/widget/RecyclerView$onCommand;

    invoke-direct {v0, p0}, Landroidx/recyclerview/widget/RecyclerView$onCommand;-><init>(Landroidx/recyclerview/widget/RecyclerView;)V

    iput-object v0, v7, Landroidx/recyclerview/widget/RecyclerView;->accessonBackPresseds1027565324:Landroidx/recyclerview/widget/RecyclerView$onCommand;

    .line 421
    new-instance v0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;

    invoke-direct {v0, p0}, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;-><init>(Landroidx/recyclerview/widget/RecyclerView;)V

    iput-object v0, v7, Landroidx/recyclerview/widget/RecyclerView;->onRemoveQueueItemAt:Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;

    .line 438
    new-instance v0, Lo/UIntSerializer;

    invoke-direct {v0}, Lo/UIntSerializer;-><init>()V

    iput-object v0, v7, Landroidx/recyclerview/widget/RecyclerView;->onSetRating:Lo/UIntSerializer;

    .line 452
    new-instance v0, Landroidx/recyclerview/widget/RecyclerView$3;

    invoke-direct {v0, p0}, Landroidx/recyclerview/widget/RecyclerView$3;-><init>(Landroidx/recyclerview/widget/RecyclerView;)V

    iput-object v0, v7, Landroidx/recyclerview/widget/RecyclerView;->onSetShuffleMode:Ljava/lang/Runnable;

    .line 472
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, v7, Landroidx/recyclerview/widget/RecyclerView;->onSetPlaybackSpeed:Landroid/graphics/Rect;

    .line 473
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, v7, Landroidx/recyclerview/widget/RecyclerView;->getDefaultViewModelProviderFactory:Landroid/graphics/Rect;

    .line 474
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, v7, Landroidx/recyclerview/widget/RecyclerView;->onSetRepeatMode:Landroid/graphics/RectF;

    .line 481
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, v7, Landroidx/recyclerview/widget/RecyclerView;->onRewind:Ljava/util/List;

    .line 482
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, v7, Landroidx/recyclerview/widget/RecyclerView;->onPause:Ljava/util/ArrayList;

    .line 483
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, v7, Landroidx/recyclerview/widget/RecyclerView;->menuHostHelperlambda0:Ljava/util/ArrayList;

    const/4 v11, 0x0

    .line 499
    iput v11, v7, Landroidx/recyclerview/widget/RecyclerView;->r8lambdaKUbBm7ckfqTc9QCgukC86fguu4:I

    .line 529
    iput-boolean v11, v7, Landroidx/recyclerview/widget/RecyclerView;->RatingCompat:Z

    .line 538
    iput-boolean v11, v7, Landroidx/recyclerview/widget/RecyclerView;->PlaybackStateCompat:Z

    .line 548
    iput v11, v7, Landroidx/recyclerview/widget/RecyclerView;->_init_lambda4:I

    .line 557
    iput v11, v7, Landroidx/recyclerview/widget/RecyclerView;->MediaSessionCompatToken:I

    .line 559
    sget-object v0, Landroidx/recyclerview/widget/RecyclerView;->onStop:Landroidx/recyclerview/widget/RecyclerView$handleMediaPlayPauseIfPendingOnHandler;

    iput-object v0, v7, Landroidx/recyclerview/widget/RecyclerView;->MediaSessionCompatQueueItem:Landroidx/recyclerview/widget/RecyclerView$RemoteActionCompatParcelizer;

    .line 563
    new-instance v0, Lo/RegexDeserializerdeserializeoptions1;

    invoke-direct {v0}, Lo/RegexDeserializerdeserializeoptions1;-><init>()V

    iput-object v0, v7, Landroidx/recyclerview/widget/RecyclerView;->onCommand:Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer;

    .line 593
    iput v11, v7, Landroidx/recyclerview/widget/RecyclerView;->addOnTrimMemoryListener:I

    const/4 v12, -0x1

    .line 594
    iput v12, v7, Landroidx/recyclerview/widget/RecyclerView;->getDefaultViewModelCreationExtras:I

    const/4 v0, 0x1

    .line 606
    iput v0, v7, Landroidx/recyclerview/widget/RecyclerView;->addOnNewIntentListener:F

    .line 607
    iput v0, v7, Landroidx/recyclerview/widget/RecyclerView;->addOnPictureInPictureModeChangedListener:F

    const/4 v13, 0x1

    .line 609
    iput-boolean v13, v7, Landroidx/recyclerview/widget/RecyclerView;->getSavedStateRegistryControllerannotations:Z

    .line 611
    new-instance v0, Landroidx/recyclerview/widget/RecyclerView$onFastForward;

    invoke-direct {v0, p0}, Landroidx/recyclerview/widget/RecyclerView$onFastForward;-><init>(Landroidx/recyclerview/widget/RecyclerView;)V

    iput-object v0, v7, Landroidx/recyclerview/widget/RecyclerView;->onSetCaptioningEnabled:Landroidx/recyclerview/widget/RecyclerView$onFastForward;

    .line 615
    sget-boolean v0, Landroidx/recyclerview/widget/RecyclerView;->IconCompatParcelizer:Z

    if-eqz v0, :cond_84

    new-instance v0, Lo/SingletonSupport$read;

    invoke-direct {v0}, Lo/SingletonSupport$read;-><init>()V

    goto :goto_85

    :cond_84
    const/4 v0, 0x0

    :goto_85
    iput-object v0, v7, Landroidx/recyclerview/widget/RecyclerView;->onPlayFromSearch:Lo/SingletonSupport$read;

    .line 617
    new-instance v0, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    invoke-direct {v0}, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;-><init>()V

    iput-object v0, v7, Landroidx/recyclerview/widget/RecyclerView;->onPrepareFromUri:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    .line 623
    iput-boolean v11, v7, Landroidx/recyclerview/widget/RecyclerView;->onMediaButtonEvent:Z

    .line 624
    iput-boolean v11, v7, Landroidx/recyclerview/widget/RecyclerView;->onFastForward:Z

    .line 625
    new-instance v0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatCustomActionResultReceiver;

    invoke-direct {v0, p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatCustomActionResultReceiver;-><init>(Landroidx/recyclerview/widget/RecyclerView;)V

    iput-object v0, v7, Landroidx/recyclerview/widget/RecyclerView;->r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28:Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer$read;

    .line 627
    iput-boolean v11, v7, Landroidx/recyclerview/widget/RecyclerView;->onPlayFromUri:Z

    const/4 v0, 0x2

    .line 633
    new-array v1, v0, [I

    iput-object v1, v7, Landroidx/recyclerview/widget/RecyclerView;->addObserverForBackInvoker:[I

    .line 636
    new-array v1, v0, [I

    iput-object v1, v7, Landroidx/recyclerview/widget/RecyclerView;->getActivityResultRegistry:[I

    .line 637
    new-array v1, v0, [I

    iput-object v1, v7, Landroidx/recyclerview/widget/RecyclerView;->ensureViewModelStore:[I

    .line 640
    new-array v1, v0, [I

    iput-object v1, v7, Landroidx/recyclerview/widget/RecyclerView;->onRemoveQueueItem:[I

    .line 647
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, v7, Landroidx/recyclerview/widget/RecyclerView;->onPrepareFromSearch:Ljava/util/List;

    .line 650
    new-instance v1, Landroidx/recyclerview/widget/RecyclerView$5;

    invoke-direct {v1, p0}, Landroidx/recyclerview/widget/RecyclerView$5;-><init>(Landroidx/recyclerview/widget/RecyclerView;)V

    iput-object v1, v7, Landroidx/recyclerview/widget/RecyclerView;->_init_lambda3:Ljava/lang/Runnable;

    .line 690
    iput v11, v7, Landroidx/recyclerview/widget/RecyclerView;->_init_lambda2:I

    .line 691
    iput v11, v7, Landroidx/recyclerview/widget/RecyclerView;->r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0:I

    .line 696
    new-instance v1, Landroidx/recyclerview/widget/RecyclerView$4;

    invoke-direct {v1, p0}, Landroidx/recyclerview/widget/RecyclerView$4;-><init>(Landroidx/recyclerview/widget/RecyclerView;)V

    iput-object v1, v7, Landroidx/recyclerview/widget/RecyclerView;->getLifecycle:Lo/UIntSerializer$AudioAttributesCompatParcelizer;

    .line 744
    invoke-virtual {p0, v13}, Landroid/view/View;->setScrollContainer(Z)V

    .line 745
    invoke-virtual {p0, v13}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 747
    invoke-static/range {p1 .. p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object v1

    .line 748
    invoke-virtual {v1}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result v2

    iput v2, v7, Landroidx/recyclerview/widget/RecyclerView;->getLastCustomNonConfigurationInstance:I

    .line 750
    invoke-static {v1, v8}, Lo/getDeserializerForJavaNioFilePath;->AudioAttributesCompatParcelizer(Landroid/view/ViewConfiguration;Landroid/content/Context;)F

    move-result v2

    iput v2, v7, Landroidx/recyclerview/widget/RecyclerView;->addOnNewIntentListener:F

    .line 752
    invoke-static {v1, v8}, Lo/getDeserializerForJavaNioFilePath;->RemoteActionCompatParcelizer(Landroid/view/ViewConfiguration;Landroid/content/Context;)F

    move-result v2

    iput v2, v7, Landroidx/recyclerview/widget/RecyclerView;->addOnPictureInPictureModeChangedListener:F

    .line 753
    invoke-virtual {v1}, Landroid/view/ViewConfiguration;->getScaledMinimumFlingVelocity()I

    move-result v2

    iput v2, v7, Landroidx/recyclerview/widget/RecyclerView;->addObserverForBackInvokerlambda7:I

    .line 754
    invoke-virtual {v1}, Landroid/view/ViewConfiguration;->getScaledMaximumFlingVelocity()I

    move-result v1

    iput v1, v7, Landroidx/recyclerview/widget/RecyclerView;->createFullyDrawnExecutor:I

    .line 755
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    const/high16 v2, 0x43200000    # 160.0f

    mul-float/2addr v1, v2

    const v2, 0x43c10b3d

    mul-float/2addr v1, v2

    const v2, 0x3f570a3d    # 0.84f

    mul-float/2addr v1, v2

    .line 756
    iput v1, v7, Landroidx/recyclerview/widget/RecyclerView;->addContentView:F

    .line 760
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->getOverScrollMode()I

    move-result v1

    if-ne v1, v0, :cond_10c

    move v0, v13

    goto :goto_10d

    :cond_10c
    move v0, v11

    :goto_10d
    invoke-virtual {p0, v0}, Landroid/view/View;->setWillNotDraw(Z)V

    .line 762
    iget-object v0, v7, Landroidx/recyclerview/widget/RecyclerView;->onCommand:Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer;

    iget-object v1, v7, Landroidx/recyclerview/widget/RecyclerView;->r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28:Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer$read;

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer;->RemoteActionCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer$read;)V

    .line 763
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->onSkipToPrevious()V

    .line 764
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->onPrepareFromMediaId()V

    .line 765
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->onPlayFromUri()V

    .line 767
    invoke-static {p0}, Lo/InvalidTypeIdException;->MediaBrowserCompatItemReceiver(Landroid/view/View;)I

    move-result v0

    if-nez v0, :cond_129

    .line 769
    invoke-static {p0, v13}, Lo/InvalidTypeIdException;->AudioAttributesImplBaseParcelizer(Landroid/view/View;I)V

    .line 772
    :cond_129
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 773
    const-string v1, "accessibility"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/accessibility/AccessibilityManager;

    iput-object v0, v7, Landroidx/recyclerview/widget/RecyclerView;->setSessionImpl:Landroid/view/accessibility/AccessibilityManager;

    .line 774
    new-instance v0, Lo/UIntKeyDeserializer;

    invoke-direct {v0, p0}, Lo/UIntKeyDeserializer;-><init>(Landroidx/recyclerview/widget/RecyclerView;)V

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAccessibilityDelegateCompat(Lo/UIntKeyDeserializer;)V

    .line 776
    sget-object v0, Lo/accessgetTRUEcp$IconCompatParcelizer;->RecyclerView:[I

    invoke-virtual {v8, v9, v0, v10, v11}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v14

    .line 779
    sget-object v2, Lo/accessgetTRUEcp$IconCompatParcelizer;->RecyclerView:[I

    const/4 v6, 0x0

    move-object v0, p0

    move-object/from16 v1, p1

    move-object/from16 v3, p2

    move-object v4, v14

    move/from16 v5, p3

    invoke-static/range {v0 .. v6}, Lo/InvalidTypeIdException;->IconCompatParcelizer(Landroid/view/View;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;II)V

    .line 781
    sget v0, Lo/accessgetTRUEcp$IconCompatParcelizer;->RecyclerView_layoutManager:I

    invoke-virtual {v14, v0}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 782
    sget v1, Lo/accessgetTRUEcp$IconCompatParcelizer;->RecyclerView_android_descendantFocusability:I

    invoke-virtual {v14, v1, v12}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v1

    if-ne v1, v12, :cond_166

    const/high16 v1, 0x40000

    .line 785
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->setDescendantFocusability(I)V

    .line 787
    :cond_166
    sget v1, Lo/accessgetTRUEcp$IconCompatParcelizer;->RecyclerView_android_clipToPadding:I

    invoke-virtual {v14, v1, v13}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    iput-boolean v1, v7, Landroidx/recyclerview/widget/RecyclerView;->MediaDescriptionCompat:Z

    .line 788
    sget v1, Lo/accessgetTRUEcp$IconCompatParcelizer;->RecyclerView_fastScrollEnabled:I

    invoke-virtual {v14, v1, v11}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    iput-boolean v1, v7, Landroidx/recyclerview/widget/RecyclerView;->r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw:Z

    if-eqz v1, :cond_197

    .line 790
    sget v1, Lo/accessgetTRUEcp$IconCompatParcelizer;->RecyclerView_fastScrollVerticalThumbDrawable:I

    .line 791
    invoke-virtual {v14, v1}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    check-cast v1, Landroid/graphics/drawable/StateListDrawable;

    .line 792
    sget v2, Lo/accessgetTRUEcp$IconCompatParcelizer;->RecyclerView_fastScrollVerticalTrackDrawable:I

    .line 793
    invoke-virtual {v14, v2}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    .line 794
    sget v3, Lo/accessgetTRUEcp$IconCompatParcelizer;->RecyclerView_fastScrollHorizontalThumbDrawable:I

    .line 795
    invoke-virtual {v14, v3}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    check-cast v3, Landroid/graphics/drawable/StateListDrawable;

    .line 796
    sget v4, Lo/accessgetTRUEcp$IconCompatParcelizer;->RecyclerView_fastScrollHorizontalTrackDrawable:I

    .line 797
    invoke-virtual {v14, v4}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v4

    .line 798
    invoke-direct {p0, v1, v2, v3, v4}, Landroidx/recyclerview/widget/RecyclerView;->IconCompatParcelizer(Landroid/graphics/drawable/StateListDrawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/StateListDrawable;Landroid/graphics/drawable/Drawable;)V

    .line 801
    :cond_197
    invoke-virtual {v14}, Landroid/content/res/TypedArray;->recycle()V

    .line 804
    invoke-direct {p0, v8, v0, v9, v10}, Landroidx/recyclerview/widget/RecyclerView;->AudioAttributesCompatParcelizer(Landroid/content/Context;Ljava/lang/String;Landroid/util/AttributeSet;I)V

    .line 808
    sget-object v2, Landroidx/recyclerview/widget/RecyclerView;->onSkipToPrevious:[I

    invoke-virtual {v8, v9, v2, v10, v11}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v12

    const/4 v6, 0x0

    move-object v0, p0

    move-object/from16 v1, p1

    move-object/from16 v3, p2

    move-object v4, v12

    move/from16 v5, p3

    .line 810
    invoke-static/range {v0 .. v6}, Lo/InvalidTypeIdException;->IconCompatParcelizer(Landroid/view/View;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;II)V

    .line 812
    invoke-virtual {v12, v11, v13}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    .line 813
    invoke-virtual {v12}, Landroid/content/res/TypedArray;->recycle()V

    .line 816
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->setNestedScrollingEnabled(Z)V

    .line 817
    invoke-static {p0}, Lo/createPrimordial;->write(Landroid/view/View;)V

    return-void
.end method

.method private AudioAttributesCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;)J
    .registers 2

    .line 4873
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatItemReceiver:Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;->hasStableIds()Z

    move-result p0

    if-eqz p0, :cond_d

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->getItemId()J

    move-result-wide p0

    return-wide p0

    :cond_d
    iget p0, p1, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mPosition:I

    int-to-long p0, p0

    return-wide p0
.end method

.method static AudioAttributesCompatParcelizer(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView;
    .registers 5

    .line 6445
    instance-of v0, p0, Landroid/view/ViewGroup;

    const/4 v1, 0x0

    if-nez v0, :cond_6

    return-object v1

    .line 6448
    :cond_6
    instance-of v0, p0, Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v0, :cond_d

    .line 6449
    check-cast p0, Landroidx/recyclerview/widget/RecyclerView;

    return-object p0

    .line 6451
    :cond_d
    check-cast p0, Landroid/view/ViewGroup;

    .line 6452
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v2, 0x0

    :goto_14
    if-ge v2, v0, :cond_24

    .line 6454
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    .line 6455
    invoke-static {v3}, Landroidx/recyclerview/widget/RecyclerView;->AudioAttributesCompatParcelizer(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v3

    if-eqz v3, :cond_21

    return-object v3

    :cond_21
    add-int/lit8 v2, v2, 0x1

    goto :goto_14

    :cond_24
    return-object v1
.end method

.method private AudioAttributesCompatParcelizer(IILandroid/view/MotionEvent;)V
    .registers 15

    .line 1979
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPlayFromMediaId:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    if-nez v0, :cond_5

    return-void

    .line 1984
    :cond_5
    iget-boolean v1, p0, Landroidx/recyclerview/widget/RecyclerView;->onPlay:Z

    if-eqz v1, :cond_a

    return-void

    .line 1987
    :cond_a
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->onRemoveQueueItem:[I

    const/4 v2, 0x0

    aput v2, v1, v2

    const/4 v3, 0x1

    .line 1988
    aput v2, v1, v3

    .line 1989
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->AudioAttributesImplApi26Parcelizer()Z

    move-result v0

    .line 1990
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->onPlayFromMediaId:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->AudioAttributesImplApi21Parcelizer()Z

    move-result v1

    if-eqz v1, :cond_21

    or-int/lit8 v4, v0, 0x2

    goto :goto_22

    :cond_21
    move v4, v0

    :goto_22
    const/high16 v5, 0x40000000    # 2.0f

    if-nez p3, :cond_2d

    .line 2001
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v6

    int-to-float v6, v6

    div-float/2addr v6, v5

    goto :goto_31

    :cond_2d
    invoke-virtual {p3}, Landroid/view/MotionEvent;->getY()F

    move-result v6

    :goto_31
    if-nez p3, :cond_3a

    .line 2002
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v7

    int-to-float v7, v7

    div-float/2addr v7, v5

    goto :goto_3e

    :cond_3a
    invoke-virtual {p3}, Landroid/view/MotionEvent;->getX()F

    move-result v7

    .line 2003
    :goto_3e
    invoke-direct {p0, p1, v6}, Landroidx/recyclerview/widget/RecyclerView;->read(IF)I

    move-result v5

    sub-int/2addr p1, v5

    .line 2004
    invoke-direct {p0, p2, v7}, Landroidx/recyclerview/widget/RecyclerView;->write(IF)I

    move-result v5

    sub-int/2addr p2, v5

    .line 2005
    invoke-direct {p0, v4, v3}, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatMediaItem(II)Z

    if-eqz v0, :cond_4f

    move v6, p1

    goto :goto_50

    :cond_4f
    move v6, v2

    :goto_50
    if-eqz v1, :cond_54

    move v7, p2

    goto :goto_55

    :cond_54
    move v7, v2

    .line 2008
    :goto_55
    iget-object v8, p0, Landroidx/recyclerview/widget/RecyclerView;->onRemoveQueueItem:[I

    iget-object v9, p0, Landroidx/recyclerview/widget/RecyclerView;->getActivityResultRegistry:[I

    const/4 v10, 0x1

    move-object v5, p0

    .line 2006
    invoke-virtual/range {v5 .. v10}, Landroidx/recyclerview/widget/RecyclerView;->write(II[I[II)Z

    move-result v4

    if-eqz v4, :cond_69

    .line 2011
    iget-object v4, p0, Landroidx/recyclerview/widget/RecyclerView;->onRemoveQueueItem:[I

    aget v5, v4, v2

    sub-int/2addr p1, v5

    .line 2012
    aget v4, v4, v3

    sub-int/2addr p2, v4

    :cond_69
    if-eqz v0, :cond_6d

    move v0, p1

    goto :goto_6e

    :cond_6d
    move v0, v2

    :goto_6e
    if-eqz v1, :cond_71

    move v2, p2

    .line 2015
    :cond_71
    invoke-direct {p0, v0, v2, p3, v3}, Landroidx/recyclerview/widget/RecyclerView;->write(IILandroid/view/MotionEvent;I)Z

    .line 2019
    iget-object p3, p0, Landroidx/recyclerview/widget/RecyclerView;->onAddQueueItem:Lo/SingletonSupport;

    if-eqz p3, :cond_7f

    if-nez p1, :cond_7c

    if-eqz p2, :cond_7f

    .line 2020
    :cond_7c
    invoke-virtual {p3, p0, p1, p2}, Lo/SingletonSupport;->AudioAttributesCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView;II)V

    .line 2022
    :cond_7f
    invoke-virtual {p0, v3}, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatCustomActionResultReceiver(I)V

    return-void
.end method

.method private AudioAttributesCompatParcelizer(IILandroid/view/animation/Interpolator;)V
    .registers 10

    const/4 v3, 0x0

    const/high16 v4, -0x80000000

    const/4 v5, 0x0

    move-object v0, p0

    move v1, p1

    move v2, p2

    .line 2644
    invoke-virtual/range {v0 .. v5}, Landroidx/recyclerview/widget/RecyclerView;->write(IILandroid/view/animation/Interpolator;IZ)V

    return-void
.end method

.method private AudioAttributesCompatParcelizer(Landroid/content/Context;Ljava/lang/String;Landroid/util/AttributeSet;I)V
    .registers 11

    .line 876
    const-string v0, ": Could not instantiate the LayoutManager: "

    if-eqz p2, :cond_11b

    .line 877
    invoke-virtual {p2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p2

    .line 878
    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_11b

    .line 879
    invoke-static {p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->IconCompatParcelizer(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 882
    :try_start_12
    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    move-result v1

    if-eqz v1, :cond_21

    .line 884
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    goto :goto_25

    .line 886
    :cond_21
    invoke-virtual {p1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    :goto_25
    const/4 v2, 0x0

    .line 889
    invoke-static {p2, v2, v1}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v1

    .line 890
    const-class v3, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    invoke-virtual {v1, v3}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v1
    :try_end_30
    .catch Ljava/lang/ClassNotFoundException; {:try_start_12 .. :try_end_30} :catch_fc
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_12 .. :try_end_30} :catch_df
    .catch Ljava/lang/InstantiationException; {:try_start_12 .. :try_end_30} :catch_c2
    .catch Ljava/lang/IllegalAccessException; {:try_start_12 .. :try_end_30} :catch_a3
    .catch Ljava/lang/ClassCastException; {:try_start_12 .. :try_end_30} :catch_84

    const/4 v3, 0x1

    .line 894
    :try_start_31
    sget-object v4, Landroidx/recyclerview/widget/RecyclerView;->onSkipToNext:[Ljava/lang/Class;

    .line 895
    invoke-virtual {v1, v4}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v4

    const/4 v5, 0x4

    .line 896
    new-array v5, v5, [Ljava/lang/Object;

    aput-object p1, v5, v2

    aput-object p3, v5, v3

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 p4, 0x2

    aput-object p1, v5, p4

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 p4, 0x3

    aput-object p1, v5, p4
    :try_end_4c
    .catch Ljava/lang/NoSuchMethodException; {:try_start_31 .. :try_end_4c} :catch_4d
    .catch Ljava/lang/ClassNotFoundException; {:try_start_31 .. :try_end_4c} :catch_fc
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_31 .. :try_end_4c} :catch_df
    .catch Ljava/lang/InstantiationException; {:try_start_31 .. :try_end_4c} :catch_c2
    .catch Ljava/lang/IllegalAccessException; {:try_start_31 .. :try_end_4c} :catch_a3
    .catch Ljava/lang/ClassCastException; {:try_start_31 .. :try_end_4c} :catch_84

    goto :goto_55

    :catch_4d
    move-exception p1

    .line 899
    :try_start_4e
    new-array p4, v2, [Ljava/lang/Class;

    invoke-virtual {v1, p4}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v4
    :try_end_54
    .catch Ljava/lang/NoSuchMethodException; {:try_start_4e .. :try_end_54} :catch_62
    .catch Ljava/lang/ClassNotFoundException; {:try_start_4e .. :try_end_54} :catch_fc
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_4e .. :try_end_54} :catch_df
    .catch Ljava/lang/InstantiationException; {:try_start_4e .. :try_end_54} :catch_c2
    .catch Ljava/lang/IllegalAccessException; {:try_start_4e .. :try_end_54} :catch_a3
    .catch Ljava/lang/ClassCastException; {:try_start_4e .. :try_end_54} :catch_84

    const/4 v5, 0x0

    .line 906
    :goto_55
    :try_start_55
    invoke-virtual {v4, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 907
    invoke-virtual {v4, v5}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;)V

    return-void

    :catch_62
    move-exception p0

    .line 901
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 902
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {p3}, Landroid/util/AttributeSet;->getPositionDescription()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ": Error creating LayoutManager "

    invoke-virtual {p4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p4

    invoke-direct {p1, p4, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1
    :try_end_84
    .catch Ljava/lang/ClassNotFoundException; {:try_start_55 .. :try_end_84} :catch_fc
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_55 .. :try_end_84} :catch_df
    .catch Ljava/lang/InstantiationException; {:try_start_55 .. :try_end_84} :catch_c2
    .catch Ljava/lang/IllegalAccessException; {:try_start_55 .. :try_end_84} :catch_a3
    .catch Ljava/lang/ClassCastException; {:try_start_55 .. :try_end_84} :catch_84

    :catch_84
    move-exception p0

    .line 921
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {p3}, Landroid/util/AttributeSet;->getPositionDescription()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, ": Class is not a LayoutManager "

    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1

    :catch_a3
    move-exception p0

    .line 918
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {p3}, Landroid/util/AttributeSet;->getPositionDescription()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, ": Cannot access non-public constructor "

    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1

    :catch_c2
    move-exception p0

    .line 915
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {p3}, Landroid/util/AttributeSet;->getPositionDescription()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1

    :catch_df
    move-exception p0

    .line 912
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {p3}, Landroid/util/AttributeSet;->getPositionDescription()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1

    :catch_fc
    move-exception p0

    .line 909
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {p3}, Landroid/util/AttributeSet;->getPositionDescription()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, ": Unable to find LayoutManager "

    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1

    :cond_11b
    return-void
.end method

.method static synthetic AudioAttributesCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;)V
    .registers 2

    .line 217
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->detachViewFromParent(Landroid/view/View;)V

    return-void
.end method

.method private AudioAttributesCompatParcelizer(Landroid/view/MotionEvent;)Z
    .registers 4

    .line 3550
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatMediaItem;

    if-nez v0, :cond_11

    .line 3551
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    if-nez v0, :cond_c

    const/4 p0, 0x0

    return p0

    .line 3554
    :cond_c
    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->IconCompatParcelizer(Landroid/view/MotionEvent;)Z

    move-result p0

    return p0

    .line 3556
    :cond_11
    invoke-interface {v0, p1}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatMediaItem;->read(Landroid/view/MotionEvent;)V

    .line 3557
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result p1

    const/4 v0, 0x3

    const/4 v1, 0x1

    if-eq p1, v0, :cond_1e

    if-ne p1, v1, :cond_21

    :cond_1e
    const/4 p1, 0x0

    .line 3559
    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatMediaItem;

    :cond_21
    return v1
.end method

.method private AudioAttributesCompatParcelizer(Landroid/view/View;Landroid/view/View;I)Z
    .registers 9

    const/4 v0, 0x0

    if-eqz p2, :cond_11b

    if-eq p2, p0, :cond_11b

    if-eq p2, p1, :cond_11b

    .line 3262
    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/RecyclerView;->write(Landroid/view/View;)Landroid/view/View;

    move-result-object v1

    if-nez v1, :cond_e

    return v0

    :cond_e
    const/4 v1, 0x1

    if-nez p1, :cond_12

    return v1

    .line 3269
    :cond_12
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->write(Landroid/view/View;)Landroid/view/View;

    move-result-object v2

    if-nez v2, :cond_19

    return v1

    .line 3273
    :cond_19
    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView;->onSetPlaybackSpeed:Landroid/graphics/Rect;

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v3

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v4

    invoke-virtual {v2, v0, v0, v3, v4}, Landroid/graphics/Rect;->set(IIII)V

    .line 3274
    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView;->getDefaultViewModelProviderFactory:Landroid/graphics/Rect;

    invoke-virtual {p2}, Landroid/view/View;->getWidth()I

    move-result v3

    invoke-virtual {p2}, Landroid/view/View;->getHeight()I

    move-result v4

    invoke-virtual {v2, v0, v0, v3, v4}, Landroid/graphics/Rect;->set(IIII)V

    .line 3275
    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView;->onSetPlaybackSpeed:Landroid/graphics/Rect;

    invoke-virtual {p0, p1, v2}, Landroid/view/ViewGroup;->offsetDescendantRectToMyCoords(Landroid/view/View;Landroid/graphics/Rect;)V

    .line 3276
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->getDefaultViewModelProviderFactory:Landroid/graphics/Rect;

    invoke-virtual {p0, p2, p1}, Landroid/view/ViewGroup;->offsetDescendantRectToMyCoords(Landroid/view/View;Landroid/graphics/Rect;)V

    .line 3277
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->onPlayFromMediaId:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onPlayFromSearch()I

    move-result p1

    const/4 p2, -0x1

    if-ne p1, v1, :cond_48

    move p1, p2

    goto :goto_49

    :cond_48
    move p1, v1

    .line 3279
    :goto_49
    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView;->onSetPlaybackSpeed:Landroid/graphics/Rect;

    iget v2, v2, Landroid/graphics/Rect;->left:I

    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView;->getDefaultViewModelProviderFactory:Landroid/graphics/Rect;

    iget v3, v3, Landroid/graphics/Rect;->left:I

    if-lt v2, v3, :cond_5d

    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView;->onSetPlaybackSpeed:Landroid/graphics/Rect;

    iget v2, v2, Landroid/graphics/Rect;->right:I

    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView;->getDefaultViewModelProviderFactory:Landroid/graphics/Rect;

    iget v3, v3, Landroid/graphics/Rect;->left:I

    if-gt v2, v3, :cond_69

    :cond_5d
    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView;->onSetPlaybackSpeed:Landroid/graphics/Rect;

    iget v2, v2, Landroid/graphics/Rect;->right:I

    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView;->getDefaultViewModelProviderFactory:Landroid/graphics/Rect;

    iget v3, v3, Landroid/graphics/Rect;->right:I

    if-ge v2, v3, :cond_69

    move v2, v1

    goto :goto_8a

    .line 3283
    :cond_69
    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView;->onSetPlaybackSpeed:Landroid/graphics/Rect;

    iget v2, v2, Landroid/graphics/Rect;->right:I

    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView;->getDefaultViewModelProviderFactory:Landroid/graphics/Rect;

    iget v3, v3, Landroid/graphics/Rect;->right:I

    if-gt v2, v3, :cond_7d

    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView;->onSetPlaybackSpeed:Landroid/graphics/Rect;

    iget v2, v2, Landroid/graphics/Rect;->left:I

    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView;->getDefaultViewModelProviderFactory:Landroid/graphics/Rect;

    iget v3, v3, Landroid/graphics/Rect;->right:I

    if-lt v2, v3, :cond_89

    :cond_7d
    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView;->onSetPlaybackSpeed:Landroid/graphics/Rect;

    iget v2, v2, Landroid/graphics/Rect;->left:I

    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView;->getDefaultViewModelProviderFactory:Landroid/graphics/Rect;

    iget v3, v3, Landroid/graphics/Rect;->left:I

    if-le v2, v3, :cond_89

    move v2, p2

    goto :goto_8a

    :cond_89
    move v2, v0

    .line 3289
    :goto_8a
    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView;->onSetPlaybackSpeed:Landroid/graphics/Rect;

    iget v3, v3, Landroid/graphics/Rect;->top:I

    iget-object v4, p0, Landroidx/recyclerview/widget/RecyclerView;->getDefaultViewModelProviderFactory:Landroid/graphics/Rect;

    iget v4, v4, Landroid/graphics/Rect;->top:I

    if-lt v3, v4, :cond_9e

    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView;->onSetPlaybackSpeed:Landroid/graphics/Rect;

    iget v3, v3, Landroid/graphics/Rect;->bottom:I

    iget-object v4, p0, Landroidx/recyclerview/widget/RecyclerView;->getDefaultViewModelProviderFactory:Landroid/graphics/Rect;

    iget v4, v4, Landroid/graphics/Rect;->top:I

    if-gt v3, v4, :cond_aa

    :cond_9e
    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView;->onSetPlaybackSpeed:Landroid/graphics/Rect;

    iget v3, v3, Landroid/graphics/Rect;->bottom:I

    iget-object v4, p0, Landroidx/recyclerview/widget/RecyclerView;->getDefaultViewModelProviderFactory:Landroid/graphics/Rect;

    iget v4, v4, Landroid/graphics/Rect;->bottom:I

    if-ge v3, v4, :cond_aa

    move p2, v1

    goto :goto_c9

    .line 3293
    :cond_aa
    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView;->onSetPlaybackSpeed:Landroid/graphics/Rect;

    iget v3, v3, Landroid/graphics/Rect;->bottom:I

    iget-object v4, p0, Landroidx/recyclerview/widget/RecyclerView;->getDefaultViewModelProviderFactory:Landroid/graphics/Rect;

    iget v4, v4, Landroid/graphics/Rect;->bottom:I

    if-gt v3, v4, :cond_be

    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView;->onSetPlaybackSpeed:Landroid/graphics/Rect;

    iget v3, v3, Landroid/graphics/Rect;->top:I

    iget-object v4, p0, Landroidx/recyclerview/widget/RecyclerView;->getDefaultViewModelProviderFactory:Landroid/graphics/Rect;

    iget v4, v4, Landroid/graphics/Rect;->bottom:I

    if-lt v3, v4, :cond_c8

    :cond_be
    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView;->onSetPlaybackSpeed:Landroid/graphics/Rect;

    iget v3, v3, Landroid/graphics/Rect;->top:I

    iget-object v4, p0, Landroidx/recyclerview/widget/RecyclerView;->getDefaultViewModelProviderFactory:Landroid/graphics/Rect;

    iget v4, v4, Landroid/graphics/Rect;->top:I

    if-gt v3, v4, :cond_c9

    :cond_c8
    move p2, v0

    :cond_c9
    :goto_c9
    if-eq p3, v1, :cond_112

    const/4 v3, 0x2

    if-eq p3, v3, :cond_109

    const/16 p1, 0x11

    if-eq p3, p1, :cond_105

    const/16 p1, 0x21

    if-eq p3, p1, :cond_101

    const/16 p1, 0x42

    if-eq p3, p1, :cond_fd

    const/16 p1, 0x82

    if-ne p3, p1, :cond_e2

    if-lez p2, :cond_e1

    return v1

    :cond_e1
    return v0

    .line 3312
    :cond_e2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "Invalid direction: "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->write()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_fd
    if-lez v2, :cond_100

    return v1

    :cond_100
    return v0

    :cond_101
    if-gez p2, :cond_104

    return v1

    :cond_104
    return v0

    :cond_105
    if-gez v2, :cond_108

    return v1

    :cond_108
    return v0

    :cond_109
    if-gtz p2, :cond_111

    if-nez p2, :cond_110

    mul-int/2addr v2, p1

    if-gtz v2, :cond_111

    :cond_110
    return v0

    :cond_111
    return v1

    :cond_112
    if-ltz p2, :cond_11a

    if-nez p2, :cond_119

    mul-int/2addr v2, p1

    if-ltz v2, :cond_11a

    :cond_119
    return v0

    :cond_11a
    return v1

    :cond_11b
    return v0
.end method

.method private AudioAttributesCompatParcelizer(Landroid/view/accessibility/AccessibilityEvent;)Z
    .registers 4

    .line 4202
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatMediaItem()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1a

    if-eqz p1, :cond_e

    .line 4205
    invoke-static {p1}, Lo/findNameForRegularGetter;->IconCompatParcelizer(Landroid/view/accessibility/AccessibilityEvent;)I

    move-result p1

    goto :goto_f

    :cond_e
    move p1, v1

    :goto_f
    if-nez p1, :cond_12

    goto :goto_13

    :cond_12
    move v1, p1

    .line 4210
    :goto_13
    iget p1, p0, Landroidx/recyclerview/widget/RecyclerView;->MediaSessionCompatResultReceiverWrapper:I

    or-int/2addr p1, v1

    iput p1, p0, Landroidx/recyclerview/widget/RecyclerView;->MediaSessionCompatResultReceiverWrapper:I

    const/4 p0, 0x1

    return p0

    :cond_1a
    return v1
.end method

.method private AudioAttributesImplApi21Parcelizer(II)Z
    .registers 10

    .line 2729
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPlayFromMediaId:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    const/4 v1, 0x0

    if-nez v0, :cond_6

    return v1

    .line 2734
    :cond_6
    iget-boolean v2, p0, Landroidx/recyclerview/widget/RecyclerView;->onPlay:Z

    if-eqz v2, :cond_b

    return v1

    .line 2738
    :cond_b
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->AudioAttributesImplApi26Parcelizer()Z

    move-result v0

    .line 2739
    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView;->onPlayFromMediaId:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->AudioAttributesImplApi21Parcelizer()Z

    move-result v2

    if-eqz v0, :cond_1f

    .line 2741
    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    move-result v3

    iget v4, p0, Landroidx/recyclerview/widget/RecyclerView;->addObserverForBackInvokerlambda7:I

    if-ge v3, v4, :cond_20

    :cond_1f
    move p1, v1

    :cond_20
    if-eqz v2, :cond_2a

    .line 2744
    invoke-static {p2}, Ljava/lang/Math;->abs(I)I

    move-result v3

    iget v4, p0, Landroidx/recyclerview/widget/RecyclerView;->addObserverForBackInvokerlambda7:I

    if-ge v3, v4, :cond_2b

    :cond_2a
    move p2, v1

    :cond_2b
    if-nez p1, :cond_30

    if-nez p2, :cond_30

    return v1

    :cond_30
    const/4 v3, 0x0

    if-eqz p1, :cond_72

    .line 2757
    iget-object v4, p0, Landroidx/recyclerview/widget/RecyclerView;->accessensureViewModelStore:Landroid/widget/EdgeEffect;

    if-eqz v4, :cond_52

    invoke-static {v4}, Lo/memberMethods;->write(Landroid/widget/EdgeEffect;)F

    move-result v4

    cmpl-float v4, v4, v3

    if-eqz v4, :cond_52

    .line 2758
    iget-object v4, p0, Landroidx/recyclerview/widget/RecyclerView;->accessensureViewModelStore:Landroid/widget/EdgeEffect;

    neg-int v5, p1

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v6

    invoke-direct {p0, v4, v5, v6}, Landroidx/recyclerview/widget/RecyclerView;->write(Landroid/widget/EdgeEffect;II)Z

    move-result v4

    if-eqz v4, :cond_70

    .line 2759
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->accessensureViewModelStore:Landroid/widget/EdgeEffect;

    invoke-virtual {p1, v5}, Landroid/widget/EdgeEffect;->onAbsorb(I)V

    goto :goto_6f

    .line 2764
    :cond_52
    iget-object v4, p0, Landroidx/recyclerview/widget/RecyclerView;->addOnMultiWindowModeChangedListener:Landroid/widget/EdgeEffect;

    if-eqz v4, :cond_72

    invoke-static {v4}, Lo/memberMethods;->write(Landroid/widget/EdgeEffect;)F

    move-result v4

    cmpl-float v4, v4, v3

    if-eqz v4, :cond_72

    .line 2765
    iget-object v4, p0, Landroidx/recyclerview/widget/RecyclerView;->addOnMultiWindowModeChangedListener:Landroid/widget/EdgeEffect;

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v5

    invoke-direct {p0, v4, p1, v5}, Landroidx/recyclerview/widget/RecyclerView;->write(Landroid/widget/EdgeEffect;II)Z

    move-result v4

    if-eqz v4, :cond_70

    .line 2766
    iget-object v4, p0, Landroidx/recyclerview/widget/RecyclerView;->addOnMultiWindowModeChangedListener:Landroid/widget/EdgeEffect;

    invoke-virtual {v4, p1}, Landroid/widget/EdgeEffect;->onAbsorb(I)V

    :goto_6f
    move p1, v1

    :cond_70
    move v4, v1

    goto :goto_74

    :cond_72
    move v4, p1

    move p1, v1

    :goto_74
    if-eqz p2, :cond_b5

    .line 2774
    iget-object v5, p0, Landroidx/recyclerview/widget/RecyclerView;->getFullyDrawnReporter:Landroid/widget/EdgeEffect;

    if-eqz v5, :cond_95

    invoke-static {v5}, Lo/memberMethods;->write(Landroid/widget/EdgeEffect;)F

    move-result v5

    cmpl-float v5, v5, v3

    if-eqz v5, :cond_95

    .line 2775
    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView;->getFullyDrawnReporter:Landroid/widget/EdgeEffect;

    neg-int v5, p2

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v6

    invoke-direct {p0, v3, v5, v6}, Landroidx/recyclerview/widget/RecyclerView;->write(Landroid/widget/EdgeEffect;II)Z

    move-result v3

    if-eqz v3, :cond_b3

    .line 2776
    iget-object p2, p0, Landroidx/recyclerview/widget/RecyclerView;->getFullyDrawnReporter:Landroid/widget/EdgeEffect;

    invoke-virtual {p2, v5}, Landroid/widget/EdgeEffect;->onAbsorb(I)V

    goto :goto_b2

    .line 2781
    :cond_95
    iget-object v5, p0, Landroidx/recyclerview/widget/RecyclerView;->onSkipToQueueItem:Landroid/widget/EdgeEffect;

    if-eqz v5, :cond_b5

    invoke-static {v5}, Lo/memberMethods;->write(Landroid/widget/EdgeEffect;)F

    move-result v5

    cmpl-float v3, v5, v3

    if-eqz v3, :cond_b5

    .line 2782
    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView;->onSkipToQueueItem:Landroid/widget/EdgeEffect;

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v5

    invoke-direct {p0, v3, p2, v5}, Landroidx/recyclerview/widget/RecyclerView;->write(Landroid/widget/EdgeEffect;II)Z

    move-result v3

    if-eqz v3, :cond_b3

    .line 2783
    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView;->onSkipToQueueItem:Landroid/widget/EdgeEffect;

    invoke-virtual {v3, p2}, Landroid/widget/EdgeEffect;->onAbsorb(I)V

    :goto_b2
    move p2, v1

    :cond_b3
    move v3, v1

    goto :goto_b7

    :cond_b5
    move v3, p2

    move p2, v1

    :goto_b7
    if-nez p1, :cond_bb

    if-eqz p2, :cond_d6

    .line 2791
    :cond_bb
    iget v5, p0, Landroidx/recyclerview/widget/RecyclerView;->createFullyDrawnExecutor:I

    neg-int v6, v5

    invoke-static {p1, v5}, Ljava/lang/Math;->min(II)I

    move-result p1

    invoke-static {v6, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    .line 2792
    iget v5, p0, Landroidx/recyclerview/widget/RecyclerView;->createFullyDrawnExecutor:I

    neg-int v6, v5

    invoke-static {p2, v5}, Ljava/lang/Math;->min(II)I

    move-result p2

    invoke-static {v6, p2}, Ljava/lang/Math;->max(II)I

    move-result p2

    .line 2793
    iget-object v5, p0, Landroidx/recyclerview/widget/RecyclerView;->onSetCaptioningEnabled:Landroidx/recyclerview/widget/RecyclerView$onFastForward;

    invoke-virtual {v5, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$onFastForward;->RemoteActionCompatParcelizer(II)V

    :cond_d6
    const/4 v5, 0x1

    if-nez v4, :cond_e1

    if-nez v3, :cond_e1

    if-nez p1, :cond_e0

    if-nez p2, :cond_e0

    return v1

    :cond_e0
    return v5

    :cond_e1
    int-to-float p1, v4

    int-to-float p2, v3

    .line 2799
    invoke-virtual {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->dispatchNestedPreFling(FF)Z

    move-result v6

    if-nez v6, :cond_123

    if-nez v0, :cond_ef

    if-nez v2, :cond_ef

    move v6, v1

    goto :goto_f0

    :cond_ef
    move v6, v5

    .line 2801
    :goto_f0
    invoke-virtual {p0, p1, p2, v6}, Landroidx/recyclerview/widget/RecyclerView;->dispatchNestedFling(FFZ)Z

    .line 2803
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->addMenuProvider:Landroidx/recyclerview/widget/RecyclerView$RatingCompat;

    if-eqz p1, :cond_fe

    invoke-virtual {p1, v4, v3}, Landroidx/recyclerview/widget/RecyclerView$RatingCompat;->read(II)Z

    move-result p1

    if-eqz p1, :cond_fe

    return v5

    :cond_fe
    if-eqz v6, :cond_123

    if-eqz v2, :cond_104

    or-int/lit8 v0, v0, 0x2

    .line 2815
    :cond_104
    invoke-direct {p0, v0, v5}, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatMediaItem(II)Z

    .line 2817
    iget p1, p0, Landroidx/recyclerview/widget/RecyclerView;->createFullyDrawnExecutor:I

    neg-int p2, p1

    invoke-static {v4, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    invoke-static {p2, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    .line 2818
    iget p2, p0, Landroidx/recyclerview/widget/RecyclerView;->createFullyDrawnExecutor:I

    neg-int v0, p2

    invoke-static {v3, p2}, Ljava/lang/Math;->min(II)I

    move-result p2

    invoke-static {v0, p2}, Ljava/lang/Math;->max(II)I

    move-result p2

    .line 2819
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView;->onSetCaptioningEnabled:Landroidx/recyclerview/widget/RecyclerView$onFastForward;

    invoke-virtual {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$onFastForward;->RemoteActionCompatParcelizer(II)V

    return v5

    :cond_123
    return v1
.end method

.method public static AudioAttributesImplBaseParcelizer(Landroid/view/View;)I
    .registers 1

    .line 5364
    invoke-static {p0}, Landroidx/recyclerview/widget/RecyclerView;->IconCompatParcelizer(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;

    move-result-object p0

    if-eqz p0, :cond_b

    .line 5365
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->getLayoutPosition()I

    move-result p0

    return p0

    :cond_b
    const/4 p0, -0x1

    return p0
.end method

.method public static IconCompatParcelizer(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;
    .registers 1

    if-nez p0, :cond_4

    const/4 p0, 0x0

    return-object p0

    .line 5330
    :cond_4
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p0

    check-cast p0, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->AudioAttributesImplBaseParcelizer:Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;

    return-object p0
.end method

.method private static IconCompatParcelizer(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .registers 4

    const/4 v0, 0x0

    .line 929
    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v1, 0x2e

    if-ne v0, v1, :cond_1d

    .line 930
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 932
    :cond_1d
    const-string p0, "."

    invoke-virtual {p1, p0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p0

    if-eqz p0, :cond_26

    return-object p1

    .line 935
    :cond_26
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-class v0, Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0}, Ljava/lang/Class;->getPackage()Ljava/lang/Package;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Package;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private IconCompatParcelizer(Landroid/graphics/drawable/StateListDrawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/StateListDrawable;Landroid/graphics/drawable/Drawable;)V
    .registers 16

    if-eqz p1, :cond_2d

    if-eqz p2, :cond_2d

    if-eqz p3, :cond_2d

    if-eqz p4, :cond_2d

    .line 12420
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    .line 12421
    sget v1, Lo/accessgetTRUEcp$AudioAttributesCompatParcelizer;->fastscroll_default_thickness:I

    .line 12423
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v8

    sget v1, Lo/accessgetTRUEcp$AudioAttributesCompatParcelizer;->fastscroll_minimum_range:I

    .line 12424
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v9

    sget v1, Lo/accessgetTRUEcp$AudioAttributesCompatParcelizer;->fastscroll_margin:I

    .line 12425
    new-instance v2, Lo/SequenceDeserializer;

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v10

    move-object v3, p0

    move-object v4, p1

    move-object v5, p2

    move-object v6, p3

    move-object v7, p4

    invoke-direct/range {v2 .. v10}, Lo/SequenceDeserializer;-><init>(Landroidx/recyclerview/widget/RecyclerView;Landroid/graphics/drawable/StateListDrawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/StateListDrawable;Landroid/graphics/drawable/Drawable;III)V

    return-void

    .line 12415
    :cond_2d
    new-instance p1, Ljava/lang/StringBuilder;

    const-string p2, "Trying to set fast scroller without both required drawables."

    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 12417
    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->write()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p2, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method private IconCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;)V
    .registers 7

    .line 1571
    iget-object v0, p1, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->itemView:Landroid/view/View;

    .line 1572
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    const/4 v2, 0x1

    if-ne v1, p0, :cond_b

    move v1, v2

    goto :goto_c

    :cond_b
    const/4 v1, 0x0

    .line 1573
    :goto_c
    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView;->onRemoveQueueItemAt:Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatCustomActionResultReceiver(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->AudioAttributesCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;)V

    .line 1574
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->isTmpDetached()Z

    move-result p1

    if-eqz p1, :cond_26

    .line 1576
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatSearchResultReceiver:Lo/TypesKt;

    const/4 p1, -0x1

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    invoke-virtual {p0, v0, p1, v1, v2}, Lo/TypesKt;->AudioAttributesCompatParcelizer(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;Z)V

    return-void

    :cond_26
    if-nez v1, :cond_2e

    .line 1578
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatSearchResultReceiver:Lo/TypesKt;

    invoke-virtual {p0, v0}, Lo/TypesKt;->RemoteActionCompatParcelizer(Landroid/view/View;)V

    return-void

    .line 1580
    :cond_2e
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatSearchResultReceiver:Lo/TypesKt;

    invoke-virtual {p0, v0}, Lo/TypesKt;->AudioAttributesCompatParcelizer(Landroid/view/View;)V

    return-void
.end method

.method static synthetic IconCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView;II)V
    .registers 3

    .line 217
    invoke-virtual {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->setMeasuredDimension(II)V

    return-void
.end method

.method private IconCompatParcelizer([I)V
    .registers 10

    .line 4811
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatSearchResultReceiver:Lo/TypesKt;

    invoke-virtual {v0}, Lo/TypesKt;->read()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez v0, :cond_10

    const/4 p0, -0x1

    .line 4813
    aput p0, p1, v2

    .line 4814
    aput p0, p1, v1

    return-void

    :cond_10
    const v3, 0x7fffffff

    const/high16 v4, -0x80000000

    move v5, v2

    :goto_16
    if-ge v5, v0, :cond_36

    .line 4820
    iget-object v6, p0, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatSearchResultReceiver:Lo/TypesKt;

    invoke-virtual {v6, v5}, Lo/TypesKt;->read(I)Landroid/view/View;

    move-result-object v6

    invoke-static {v6}, Landroidx/recyclerview/widget/RecyclerView;->IconCompatParcelizer(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;

    move-result-object v6

    .line 4821
    invoke-virtual {v6}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->shouldIgnore()Z

    move-result v7

    if-eqz v7, :cond_29

    goto :goto_33

    .line 4824
    :cond_29
    invoke-virtual {v6}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->getLayoutPosition()I

    move-result v6

    if-ge v6, v3, :cond_30

    move v3, v6

    :cond_30
    if-le v6, v4, :cond_33

    move v4, v6

    :cond_33
    :goto_33
    add-int/lit8 v5, v5, 0x1

    goto :goto_16

    .line 4832
    :cond_36
    aput v3, p1, v2

    .line 4833
    aput v4, p1, v1

    return-void
.end method

.method private IconCompatParcelizer(Landroid/view/MotionEvent;)Z
    .registers 8

    .line 3579
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    .line 3580
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->menuHostHelperlambda0:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/AbstractCollection;->size()I

    move-result v1

    const/4 v2, 0x0

    move v3, v2

    :goto_c
    if-ge v3, v1, :cond_26

    .line 3582
    iget-object v4, p0, Landroidx/recyclerview/widget/RecyclerView;->menuHostHelperlambda0:Ljava/util/ArrayList;

    invoke-virtual {v4, v3}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatMediaItem;

    .line 3583
    invoke-interface {v4, p1}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatMediaItem;->IconCompatParcelizer(Landroid/view/MotionEvent;)Z

    move-result v5

    if-eqz v5, :cond_23

    const/4 v5, 0x3

    if-eq v0, v5, :cond_23

    .line 3584
    iput-object v4, p0, Landroidx/recyclerview/widget/RecyclerView;->r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatMediaItem;

    const/4 p0, 0x1

    return p0

    :cond_23
    add-int/lit8 v3, v3, 0x1

    goto :goto_c

    :cond_26
    return v2
.end method

.method static synthetic IconCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView;)Z
    .registers 1

    .line 217
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->awakenScrollBars()Z

    move-result p0

    return p0
.end method

.method private MediaBrowserCompatCustomActionResultReceiver(II)V
    .registers 4

    const/4 v0, 0x0

    .line 2625
    invoke-direct {p0, p1, p2, v0}, Landroidx/recyclerview/widget/RecyclerView;->AudioAttributesCompatParcelizer(IILandroid/view/animation/Interpolator;)V

    return-void
.end method

.method public static MediaBrowserCompatItemReceiver(Landroid/view/View;)I
    .registers 1

    .line 5349
    invoke-static {p0}, Landroidx/recyclerview/widget/RecyclerView;->IconCompatParcelizer(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;

    move-result-object p0

    if-eqz p0, :cond_b

    .line 5350
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->getAbsoluteAdapterPosition()I

    move-result p0

    return p0

    :cond_b
    const/4 p0, -0x1

    return p0
.end method

.method public static MediaBrowserCompatItemReceiver()J
    .registers 2

    .line 6492
    sget-boolean v0, Landroidx/recyclerview/widget/RecyclerView;->IconCompatParcelizer:Z

    if-eqz v0, :cond_9

    .line 6493
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    return-wide v0

    :cond_9
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method private MediaBrowserCompatItemReceiver(II)Z
    .registers 6

    .line 4837
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->addObserverForBackInvoker:[I

    invoke-direct {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->IconCompatParcelizer([I)V

    .line 4838
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView;->addObserverForBackInvoker:[I

    const/4 v0, 0x0

    aget v1, p0, v0

    const/4 v2, 0x1

    if-ne v1, p1, :cond_12

    aget p0, p0, v2

    if-ne p0, p2, :cond_12

    return v0

    :cond_12
    return v2
.end method

.method private MediaBrowserCompatMediaItem(I)F
    .registers 8

    .line 5716
    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    move-result p1

    int-to-float p1, p1

    const v0, 0x3eb33333    # 0.35f

    mul-float/2addr p1, v0

    iget v0, p0, Landroidx/recyclerview/widget/RecyclerView;->addContentView:F

    const v1, 0x3c75c28f    # 0.015f

    mul-float/2addr v0, v1

    div-float/2addr p1, v0

    float-to-double v2, p1

    invoke-static {v2, v3}, Ljava/lang/Math;->log(D)D

    move-result-wide v2

    .line 5717
    sget p1, Landroidx/recyclerview/widget/RecyclerView;->RemoteActionCompatParcelizer:F

    float-to-double v4, p1

    .line 5718
    iget p0, p0, Landroidx/recyclerview/widget/RecyclerView;->addContentView:F

    mul-float/2addr p0, v1

    float-to-double p0, p0

    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    sub-double v0, v4, v0

    div-double/2addr v4, v0

    mul-double/2addr v4, v2

    .line 5719
    invoke-static {v4, v5}, Ljava/lang/Math;->exp(D)D

    move-result-wide v0

    mul-double/2addr p0, v0

    double-to-float p0, p0

    return p0
.end method

.method private MediaBrowserCompatMediaItem(II)Z
    .registers 3

    .line 12447
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->onPause()Lo/rootObjectScope;

    move-result-object p0

    invoke-virtual {p0, p1, p2}, Lo/rootObjectScope;->read(II)Z

    move-result p0

    return p0
.end method

.method private MediaBrowserCompatSearchResultReceiver(I)Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;
    .registers 7

    .line 5439
    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->RatingCompat:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_6

    return-object v1

    .line 5442
    :cond_6
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatSearchResultReceiver:Lo/TypesKt;

    invoke-virtual {v0}, Lo/TypesKt;->RemoteActionCompatParcelizer()I

    move-result v0

    const/4 v2, 0x0

    :goto_d
    if-ge v2, v0, :cond_37

    .line 5446
    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatSearchResultReceiver:Lo/TypesKt;

    invoke-virtual {v3, v2}, Lo/TypesKt;->AudioAttributesCompatParcelizer(I)Landroid/view/View;

    move-result-object v3

    invoke-static {v3}, Landroidx/recyclerview/widget/RecyclerView;->IconCompatParcelizer(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;

    move-result-object v3

    if-eqz v3, :cond_34

    .line 5447
    invoke-virtual {v3}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->isRemoved()Z

    move-result v4

    if-nez v4, :cond_34

    .line 5448
    invoke-virtual {p0, v3}, Landroidx/recyclerview/widget/RecyclerView;->RemoteActionCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;)I

    move-result v4

    if-ne v4, p1, :cond_34

    .line 5449
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatSearchResultReceiver:Lo/TypesKt;

    iget-object v4, v3, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->itemView:Landroid/view/View;

    invoke-virtual {v1, v4}, Lo/TypesKt;->IconCompatParcelizer(Landroid/view/View;)Z

    move-result v1

    if-eqz v1, :cond_33

    move-object v1, v3

    goto :goto_34

    :cond_33
    return-object v3

    :cond_34
    :goto_34
    add-int/lit8 v2, v2, 0x1

    goto :goto_d

    :cond_37
    return-object v1
.end method

.method private MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()V
    .registers 2

    .line 3923
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->onRemoveQueueItem()V

    const/4 v0, 0x0

    .line 3924
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatItemReceiver(I)V

    return-void
.end method

.method private static MediaDescriptionCompat(Landroid/view/View;)I
    .registers 4

    .line 4509
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    move-result v0

    .line 4510
    :cond_4
    :goto_4
    invoke-virtual {p0}, Landroid/view/View;->isFocused()Z

    move-result v1

    if-nez v1, :cond_26

    instance-of v1, p0, Landroid/view/ViewGroup;

    if-eqz v1, :cond_26

    invoke-virtual {p0}, Landroid/view/View;->hasFocus()Z

    move-result v1

    if-eqz v1, :cond_26

    .line 4511
    check-cast p0, Landroid/view/ViewGroup;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getFocusedChild()Landroid/view/View;

    move-result-object p0

    .line 4512
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    move-result v1

    const/4 v2, -0x1

    if-eq v1, v2, :cond_4

    .line 4514
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    move-result v0

    goto :goto_4

    :cond_26
    return v0
.end method

.method private MediaMetadataCompat(I)V
    .registers 4

    .line 5725
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPlayFromMediaId:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    if-eqz v0, :cond_7

    .line 5726
    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaBrowserCompatItemReceiver(I)V

    .line 5734
    :cond_7
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->addOnConfigurationChangedListener:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatSearchResultReceiver;

    if-eqz v0, :cond_e

    .line 5735
    invoke-virtual {v0, p0, p1}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatSearchResultReceiver;->AudioAttributesCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView;I)V

    .line 5737
    :cond_e
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->addOnContextAvailableListener:Ljava/util/List;

    if-eqz v0, :cond_28

    .line 5738
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_18
    if-ltz v0, :cond_28

    .line 5739
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->addOnContextAvailableListener:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatSearchResultReceiver;

    invoke-virtual {v1, p0, p1}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatSearchResultReceiver;->AudioAttributesCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView;I)V

    add-int/lit8 v0, v0, -0x1

    goto :goto_18

    :cond_28
    return-void
.end method

.method private MediaSessionCompatQueueItem()V
    .registers 2

    const/4 v0, 0x1

    .line 4137
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->RemoteActionCompatParcelizer(Z)V

    return-void
.end method

.method private MediaSessionCompatResultReceiverWrapper()V
    .registers 6

    .line 5055
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatSearchResultReceiver:Lo/TypesKt;

    invoke-virtual {v0}, Lo/TypesKt;->RemoteActionCompatParcelizer()I

    move-result v0

    const/4 v1, 0x0

    :goto_7
    if-ge v1, v0, :cond_47

    .line 5057
    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatSearchResultReceiver:Lo/TypesKt;

    invoke-virtual {v2, v1}, Lo/TypesKt;->AudioAttributesCompatParcelizer(I)Landroid/view/View;

    move-result-object v2

    invoke-static {v2}, Landroidx/recyclerview/widget/RecyclerView;->IconCompatParcelizer(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;

    move-result-object v2

    .line 5058
    sget-boolean v3, Landroidx/recyclerview/widget/RecyclerView;->AudioAttributesImplApi26Parcelizer:Z

    if-eqz v3, :cond_3b

    iget v3, v2, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mPosition:I

    const/4 v4, -0x1

    if-ne v3, v4, :cond_3b

    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->isRemoved()Z

    move-result v3

    if-eqz v3, :cond_23

    goto :goto_3b

    .line 5059
    :cond_23
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "view holder cannot have position -1 unless it is removed"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 5060
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->write()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 5062
    :cond_3b
    :goto_3b
    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->shouldIgnore()Z

    move-result v3

    if-nez v3, :cond_44

    .line 5063
    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->saveOldPosition()V

    :cond_44
    add-int/lit8 v1, v1, 0x1

    goto :goto_7

    :cond_47
    return-void
.end method

.method private MediaSessionCompatToken()V
    .registers 5

    .line 4934
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatSearchResultReceiver:Lo/TypesKt;

    invoke-virtual {v0}, Lo/TypesKt;->RemoteActionCompatParcelizer()I

    move-result v0

    const/4 v1, 0x0

    :goto_7
    if-ge v1, v0, :cond_1b

    .line 4936
    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatSearchResultReceiver:Lo/TypesKt;

    invoke-virtual {v2, v1}, Lo/TypesKt;->AudioAttributesCompatParcelizer(I)Landroid/view/View;

    move-result-object v2

    .line 4937
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    check-cast v2, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    const/4 v3, 0x1

    iput-boolean v3, v2, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->AudioAttributesCompatParcelizer:Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_7

    .line 4939
    :cond_1b
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView;->onRemoveQueueItemAt:Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->AudioAttributesImplBaseParcelizer()V

    return-void
.end method

.method private ParcelableVolumeInfo()V
    .registers 8

    .line 6037
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatSearchResultReceiver:Lo/TypesKt;

    invoke-virtual {v0}, Lo/TypesKt;->read()I

    move-result v0

    const/4 v1, 0x0

    :goto_7
    if-ge v1, v0, :cond_41

    .line 6039
    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatSearchResultReceiver:Lo/TypesKt;

    invoke-virtual {v2, v1}, Lo/TypesKt;->read(I)Landroid/view/View;

    move-result-object v2

    .line 6040
    invoke-virtual {p0, v2}, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatCustomActionResultReceiver(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;

    move-result-object v3

    if-eqz v3, :cond_3e

    .line 6041
    iget-object v4, v3, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mShadowingHolder:Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;

    if-eqz v4, :cond_3e

    .line 6042
    iget-object v3, v3, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mShadowingHolder:Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;

    iget-object v3, v3, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->itemView:Landroid/view/View;

    .line 6043
    invoke-virtual {v2}, Landroid/view/View;->getLeft()I

    move-result v4

    .line 6044
    invoke-virtual {v2}, Landroid/view/View;->getTop()I

    move-result v2

    .line 6045
    invoke-virtual {v3}, Landroid/view/View;->getLeft()I

    move-result v5

    if-ne v4, v5, :cond_31

    invoke-virtual {v3}, Landroid/view/View;->getTop()I

    move-result v5

    if-eq v2, v5, :cond_3e

    .line 6047
    :cond_31
    invoke-virtual {v3}, Landroid/view/View;->getWidth()I

    move-result v5

    .line 6048
    invoke-virtual {v3}, Landroid/view/View;->getHeight()I

    move-result v6

    add-int/2addr v5, v4

    add-int/2addr v6, v2

    .line 6046
    invoke-virtual {v3, v4, v2, v5, v6}, Landroid/view/View;->layout(IIII)V

    :cond_3e
    add-int/lit8 v1, v1, 0x1

    goto :goto_7

    :cond_41
    return-void
.end method

.method private PlaybackStateCompat()V
    .registers 5

    .line 5218
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatSearchResultReceiver:Lo/TypesKt;

    invoke-virtual {v0}, Lo/TypesKt;->RemoteActionCompatParcelizer()I

    move-result v0

    const/4 v1, 0x0

    :goto_7
    if-ge v1, v0, :cond_22

    .line 5220
    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatSearchResultReceiver:Lo/TypesKt;

    invoke-virtual {v2, v1}, Lo/TypesKt;->AudioAttributesCompatParcelizer(I)Landroid/view/View;

    move-result-object v2

    invoke-static {v2}, Landroidx/recyclerview/widget/RecyclerView;->IconCompatParcelizer(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;

    move-result-object v2

    if-eqz v2, :cond_1f

    .line 5221
    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->shouldIgnore()Z

    move-result v3

    if-nez v3, :cond_1f

    const/4 v3, 0x6

    .line 5222
    invoke-virtual {v2, v3}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->addFlags(I)V

    :cond_1f
    add-int/lit8 v1, v1, 0x1

    goto :goto_7

    .line 5225
    :cond_22
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->MediaSessionCompatToken()V

    .line 5226
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView;->onRemoveQueueItemAt:Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->MediaBrowserCompatItemReceiver()V

    return-void
.end method

.method private RatingCompat(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;
    .registers 2

    .line 5321
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->write(Landroid/view/View;)Landroid/view/View;

    move-result-object p1

    if-nez p1, :cond_8

    const/4 p0, 0x0

    return-object p0

    .line 5322
    :cond_8
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatCustomActionResultReceiver(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;

    move-result-object p0

    return-object p0
.end method

.method private RemoteActionCompatParcelizer(FFFF)V
    .registers 10

    const/4 v0, 0x0

    cmpg-float v1, p2, v0

    const/high16 v2, 0x3f800000    # 1.0f

    if-gez v1, :cond_1f

    .line 2954
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->onSetRepeatMode()V

    .line 2955
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->accessensureViewModelStore:Landroid/widget/EdgeEffect;

    neg-float v3, p2

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v4

    int-to-float v4, v4

    div-float/2addr v3, v4

    .line 2956
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v4

    int-to-float v4, v4

    div-float/2addr p3, v4

    sub-float p3, v2, p3

    .line 2955
    invoke-static {v1, v3, p3}, Lo/memberMethods;->read(Landroid/widget/EdgeEffect;FF)F

    goto :goto_38

    :cond_1f
    cmpl-float v1, p2, v0

    if-lez v1, :cond_3a

    .line 2959
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->onStop()V

    .line 2960
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->addOnMultiWindowModeChangedListener:Landroid/widget/EdgeEffect;

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v3

    int-to-float v3, v3

    div-float v3, p2, v3

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v4

    int-to-float v4, v4

    div-float/2addr p3, v4

    invoke-static {v1, v3, p3}, Lo/memberMethods;->read(Landroid/widget/EdgeEffect;FF)F

    :goto_38
    const/4 p3, 0x1

    goto :goto_3b

    :cond_3a
    const/4 p3, 0x0

    :goto_3b
    cmpg-float v1, p4, v0

    if-gez v1, :cond_55

    .line 2965
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->onSkipToNext()V

    .line 2966
    iget-object p2, p0, Landroidx/recyclerview/widget/RecyclerView;->getFullyDrawnReporter:Landroid/widget/EdgeEffect;

    neg-float p3, p4

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result p4

    int-to-float p4, p4

    div-float/2addr p3, p4

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result p4

    int-to-float p4, p4

    div-float/2addr p1, p4

    invoke-static {p2, p3, p1}, Lo/memberMethods;->read(Landroid/widget/EdgeEffect;FF)F

    goto :goto_7a

    :cond_55
    cmpl-float v1, p4, v0

    if-lez v1, :cond_6f

    .line 2969
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->onSetShuffleMode()V

    .line 2970
    iget-object p2, p0, Landroidx/recyclerview/widget/RecyclerView;->onSkipToQueueItem:Landroid/widget/EdgeEffect;

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result p3

    int-to-float p3, p3

    div-float/2addr p4, p3

    .line 2971
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result p3

    int-to-float p3, p3

    div-float/2addr p1, p3

    sub-float/2addr v2, p1

    .line 2970
    invoke-static {p2, p4, v2}, Lo/memberMethods;->read(Landroid/widget/EdgeEffect;FF)F

    goto :goto_7a

    :cond_6f
    if-nez p3, :cond_7a

    cmpl-float p1, p2, v0

    if-nez p1, :cond_7a

    cmpl-float p1, p4, v0

    if-nez p1, :cond_7a

    return-void

    .line 2976
    :cond_7a
    :goto_7a
    invoke-static {p0}, Lo/InvalidTypeIdException;->onRemoveQueueItem(Landroid/view/View;)V

    return-void
.end method

.method static synthetic RemoteActionCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView;I)V
    .registers 2

    .line 217
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->detachViewFromParent(I)V

    return-void
.end method

.method static synthetic RemoteActionCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V
    .registers 4

    .line 217
    invoke-virtual {p0, p1, p2, p3}, Landroidx/recyclerview/widget/RecyclerView;->attachViewToParent(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method private ResultReceiver()V
    .registers 2

    const/4 v0, 0x0

    .line 2915
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatItemReceiver(I)V

    .line 2916
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->onRewind()V

    return-void
.end method

.method private onCommand()V
    .registers 8

    .line 4539
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPrepareFromUri:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->write(I)V

    .line 4540
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPrepareFromUri:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    invoke-direct {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->write(Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)V

    .line 4541
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPrepareFromUri:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    const/4 v2, 0x0

    iput-boolean v2, v0, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->MediaBrowserCompatItemReceiver:Z

    .line 4542
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw()V

    .line 4543
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onSetRating:Lo/UIntSerializer;

    invoke-virtual {v0}, Lo/UIntSerializer;->AudioAttributesCompatParcelizer()V

    .line 4544
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->MediaMetadataCompat()V

    .line 4545
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->onPrepare()V

    .line 4546
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->onRemoveQueueItemAt()V

    .line 4547
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPrepareFromUri:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    iget-boolean v3, v0, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->MediaBrowserCompatSearchResultReceiver:Z

    if-eqz v3, :cond_2b

    iget-boolean v3, p0, Landroidx/recyclerview/widget/RecyclerView;->onFastForward:Z

    if-nez v3, :cond_2c

    :cond_2b
    move v1, v2

    :cond_2c
    iput-boolean v1, v0, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Z

    .line 4548
    iput-boolean v2, p0, Landroidx/recyclerview/widget/RecyclerView;->onFastForward:Z

    iput-boolean v2, p0, Landroidx/recyclerview/widget/RecyclerView;->onMediaButtonEvent:Z

    .line 4549
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPrepareFromUri:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    iget-boolean v1, v0, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->MediaMetadataCompat:Z

    iput-boolean v1, v0, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->IconCompatParcelizer:Z

    .line 4550
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPrepareFromUri:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatItemReceiver:Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;

    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;->getItemCount()I

    move-result v1

    iput v1, v0, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->AudioAttributesImplApi26Parcelizer:I

    .line 4551
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->addObserverForBackInvoker:[I

    invoke-direct {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->IconCompatParcelizer([I)V

    .line 4553
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPrepareFromUri:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    iget-boolean v0, v0, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->MediaBrowserCompatSearchResultReceiver:Z

    if-eqz v0, :cond_ad

    .line 4555
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatSearchResultReceiver:Lo/TypesKt;

    invoke-virtual {v0}, Lo/TypesKt;->read()I

    move-result v0

    move v1, v2

    :goto_54
    if-ge v1, v0, :cond_ad

    .line 4557
    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatSearchResultReceiver:Lo/TypesKt;

    invoke-virtual {v3, v1}, Lo/TypesKt;->read(I)Landroid/view/View;

    move-result-object v3

    invoke-static {v3}, Landroidx/recyclerview/widget/RecyclerView;->IconCompatParcelizer(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;

    move-result-object v3

    .line 4558
    invoke-virtual {v3}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->shouldIgnore()Z

    move-result v4

    if-nez v4, :cond_aa

    invoke-virtual {v3}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->isInvalid()Z

    move-result v4

    if-eqz v4, :cond_74

    iget-object v4, p0, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatItemReceiver:Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;

    invoke-virtual {v4}, Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;->hasStableIds()Z

    move-result v4

    if-eqz v4, :cond_aa

    .line 4563
    :cond_74
    invoke-static {v3}, Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer;->RemoteActionCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;)I

    .line 4564
    invoke-virtual {v3}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->getUnmodifiedPayloads()Ljava/util/List;

    .line 4562
    invoke-static {v3}, Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer;->MediaBrowserCompatItemReceiver(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;)Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer$write;

    move-result-object v4

    .line 4565
    iget-object v5, p0, Landroidx/recyclerview/widget/RecyclerView;->onSetRating:Lo/UIntSerializer;

    invoke-virtual {v5, v3, v4}, Lo/UIntSerializer;->IconCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer$write;)V

    .line 4566
    iget-object v4, p0, Landroidx/recyclerview/widget/RecyclerView;->onPrepareFromUri:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    iget-boolean v4, v4, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Z

    if-eqz v4, :cond_aa

    invoke-virtual {v3}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->isUpdated()Z

    move-result v4

    if-eqz v4, :cond_aa

    invoke-virtual {v3}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->isRemoved()Z

    move-result v4

    if-nez v4, :cond_aa

    .line 4567
    invoke-virtual {v3}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->shouldIgnore()Z

    move-result v4

    if-nez v4, :cond_aa

    invoke-virtual {v3}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->isInvalid()Z

    move-result v4

    if-nez v4, :cond_aa

    .line 4568
    invoke-direct {p0, v3}, Landroidx/recyclerview/widget/RecyclerView;->AudioAttributesCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;)J

    move-result-wide v4

    .line 4576
    iget-object v6, p0, Landroidx/recyclerview/widget/RecyclerView;->onSetRating:Lo/UIntSerializer;

    invoke-virtual {v6, v4, v5, v3}, Lo/UIntSerializer;->write(JLandroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;)V

    :cond_aa
    add-int/lit8 v1, v1, 0x1

    goto :goto_54

    .line 4580
    :cond_ad
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPrepareFromUri:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    iget-boolean v0, v0, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->MediaMetadataCompat:Z

    if-eqz v0, :cond_10e

    .line 4587
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->MediaSessionCompatResultReceiverWrapper()V

    .line 4588
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPrepareFromUri:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    iget-boolean v0, v0, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->RatingCompat:Z

    .line 4589
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->onPrepareFromUri:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    iput-boolean v2, v1, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->RatingCompat:Z

    .line 4591
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->onPlayFromMediaId:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView;->onRemoveQueueItemAt:Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;

    iget-object v4, p0, Landroidx/recyclerview/widget/RecyclerView;->onPrepareFromUri:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    invoke-virtual {v1, v3, v4}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->write(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)V

    .line 4592
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->onPrepareFromUri:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    iput-boolean v0, v1, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->RatingCompat:Z

    move v0, v2

    .line 4594
    :goto_cc
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatSearchResultReceiver:Lo/TypesKt;

    invoke-virtual {v1}, Lo/TypesKt;->read()I

    move-result v1

    if-ge v0, v1, :cond_10a

    .line 4595
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatSearchResultReceiver:Lo/TypesKt;

    invoke-virtual {v1, v0}, Lo/TypesKt;->read(I)Landroid/view/View;

    move-result-object v1

    .line 4596
    invoke-static {v1}, Landroidx/recyclerview/widget/RecyclerView;->IconCompatParcelizer(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;

    move-result-object v1

    .line 4597
    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->shouldIgnore()Z

    move-result v3

    if-nez v3, :cond_107

    .line 4600
    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView;->onSetRating:Lo/UIntSerializer;

    invoke-virtual {v3, v1}, Lo/UIntSerializer;->write(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;)Z

    move-result v3

    if-nez v3, :cond_107

    .line 4601
    invoke-static {v1}, Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer;->RemoteActionCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;)I

    const/16 v3, 0x2000

    .line 4603
    invoke-virtual {v1, v3}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->hasAnyOfTheFlags(I)Z

    move-result v3

    .line 4608
    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->getUnmodifiedPayloads()Ljava/util/List;

    .line 4607
    invoke-static {v1}, Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer;->MediaBrowserCompatItemReceiver(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;)Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer$write;

    move-result-object v4

    if-eqz v3, :cond_102

    .line 4610
    invoke-virtual {p0, v1, v4}, Landroidx/recyclerview/widget/RecyclerView;->read(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer$write;)V

    goto :goto_107

    .line 4612
    :cond_102
    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView;->onSetRating:Lo/UIntSerializer;

    invoke-virtual {v3, v1, v4}, Lo/UIntSerializer;->RemoteActionCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer$write;)V

    :cond_107
    :goto_107
    add-int/lit8 v0, v0, 0x1

    goto :goto_cc

    .line 4617
    :cond_10a
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->onSetCaptioningEnabled()V

    goto :goto_111

    .line 4619
    :cond_10e
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->onSetCaptioningEnabled()V

    .line 4621
    :goto_111
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->MediaSessionCompatQueueItem()V

    .line 4622
    invoke-direct {p0, v2}, Landroidx/recyclerview/widget/RecyclerView;->read(Z)V

    .line 4623
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPrepareFromUri:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    const/4 v0, 0x2

    iput v0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->AudioAttributesImplApi21Parcelizer:I

    return-void
.end method

.method private onCustomAction()V
    .registers 4

    .line 4160
    iget v0, p0, Landroidx/recyclerview/widget/RecyclerView;->MediaSessionCompatResultReceiverWrapper:I

    const/4 v1, 0x0

    .line 4161
    iput v1, p0, Landroidx/recyclerview/widget/RecyclerView;->MediaSessionCompatResultReceiverWrapper:I

    if-eqz v0, :cond_1c

    .line 4162
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatSearchResultReceiver()Z

    move-result v1

    if-eqz v1, :cond_1c

    .line 4163
    invoke-static {}, Landroid/view/accessibility/AccessibilityEvent;->obtain()Landroid/view/accessibility/AccessibilityEvent;

    move-result-object v1

    const/16 v2, 0x800

    .line 4164
    invoke-virtual {v1, v2}, Landroid/view/accessibility/AccessibilityEvent;->setEventType(I)V

    .line 4165
    invoke-static {v1, v0}, Lo/findNameForRegularGetter;->read(Landroid/view/accessibility/AccessibilityEvent;I)V

    .line 4166
    invoke-virtual {p0, v1}, Landroid/view/View;->sendAccessibilityEventUnchecked(Landroid/view/accessibility/AccessibilityEvent;)V

    :cond_1c
    return-void
.end method

.method private onFastForward()V
    .registers 12

    .line 4661
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPrepareFromUri:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->write(I)V

    .line 4662
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw()V

    .line 4663
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->MediaMetadataCompat()V

    .line 4664
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPrepareFromUri:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    const/4 v1, 0x1

    iput v1, v0, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->AudioAttributesImplApi21Parcelizer:I

    .line 4665
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPrepareFromUri:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    iget-boolean v0, v0, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->MediaBrowserCompatSearchResultReceiver:Z

    if-eqz v0, :cond_84

    .line 4669
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatSearchResultReceiver:Lo/TypesKt;

    invoke-virtual {v0}, Lo/TypesKt;->read()I

    move-result v0

    sub-int/2addr v0, v1

    :goto_1e
    if-ltz v0, :cond_7d

    .line 4670
    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatSearchResultReceiver:Lo/TypesKt;

    invoke-virtual {v2, v0}, Lo/TypesKt;->read(I)Landroid/view/View;

    move-result-object v2

    invoke-static {v2}, Landroidx/recyclerview/widget/RecyclerView;->IconCompatParcelizer(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;

    move-result-object v5

    .line 4671
    invoke-virtual {v5}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->shouldIgnore()Z

    move-result v2

    if-nez v2, :cond_7a

    .line 4674
    invoke-direct {p0, v5}, Landroidx/recyclerview/widget/RecyclerView;->AudioAttributesCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;)J

    move-result-wide v2

    .line 4676
    invoke-static {v5}, Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer;->AudioAttributesImplApi21Parcelizer(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;)Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer$write;

    move-result-object v4

    .line 4677
    iget-object v6, p0, Landroidx/recyclerview/widget/RecyclerView;->onSetRating:Lo/UIntSerializer;

    invoke-virtual {v6, v2, v3}, Lo/UIntSerializer;->AudioAttributesCompatParcelizer(J)Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;

    move-result-object v6

    if-eqz v6, :cond_75

    .line 4678
    invoke-virtual {v6}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->shouldIgnore()Z

    move-result v7

    if-nez v7, :cond_75

    .line 4689
    iget-object v7, p0, Landroidx/recyclerview/widget/RecyclerView;->onSetRating:Lo/UIntSerializer;

    invoke-virtual {v7, v6}, Lo/UIntSerializer;->IconCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;)Z

    move-result v8

    .line 4691
    iget-object v7, p0, Landroidx/recyclerview/widget/RecyclerView;->onSetRating:Lo/UIntSerializer;

    invoke-virtual {v7, v5}, Lo/UIntSerializer;->IconCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;)Z

    move-result v9

    if-eqz v8, :cond_56

    if-eq v6, v5, :cond_75

    .line 4696
    :cond_56
    iget-object v7, p0, Landroidx/recyclerview/widget/RecyclerView;->onSetRating:Lo/UIntSerializer;

    invoke-virtual {v7, v6}, Lo/UIntSerializer;->MediaBrowserCompatItemReceiver(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;)Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer$write;

    move-result-object v7

    .line 4699
    iget-object v10, p0, Landroidx/recyclerview/widget/RecyclerView;->onSetRating:Lo/UIntSerializer;

    invoke-virtual {v10, v5, v4}, Lo/UIntSerializer;->AudioAttributesCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer$write;)V

    .line 4700
    iget-object v4, p0, Landroidx/recyclerview/widget/RecyclerView;->onSetRating:Lo/UIntSerializer;

    invoke-virtual {v4, v5}, Lo/UIntSerializer;->RemoteActionCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;)Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer$write;

    move-result-object v10

    if-nez v7, :cond_6d

    .line 4702
    invoke-direct {p0, v2, v3, v5, v6}, Landroidx/recyclerview/widget/RecyclerView;->read(JLandroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;)V

    goto :goto_7a

    :cond_6d
    move-object v3, p0

    move-object v4, v6

    move-object v6, v7

    move-object v7, v10

    .line 4704
    invoke-direct/range {v3 .. v9}, Landroidx/recyclerview/widget/RecyclerView;->write(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer$write;Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer$write;ZZ)V

    goto :goto_7a

    .line 4709
    :cond_75
    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView;->onSetRating:Lo/UIntSerializer;

    invoke-virtual {v2, v5, v4}, Lo/UIntSerializer;->AudioAttributesCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer$write;)V

    :cond_7a
    :goto_7a
    add-int/lit8 v0, v0, -0x1

    goto :goto_1e

    .line 4714
    :cond_7d
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onSetRating:Lo/UIntSerializer;

    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView;->getLifecycle:Lo/UIntSerializer$AudioAttributesCompatParcelizer;

    invoke-virtual {v0, v2}, Lo/UIntSerializer;->write(Lo/UIntSerializer$AudioAttributesCompatParcelizer;)V

    .line 4717
    :cond_84
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPlayFromMediaId:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView;->onRemoveQueueItemAt:Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;

    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->read(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;)V

    .line 4718
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPrepareFromUri:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    iget v2, v0, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->AudioAttributesImplApi26Parcelizer:I

    iput v2, v0, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->MediaBrowserCompatCustomActionResultReceiver:I

    const/4 v0, 0x0

    .line 4719
    iput-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->RatingCompat:Z

    .line 4720
    iput-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->PlaybackStateCompat:Z

    .line 4721
    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView;->onPrepareFromUri:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    iput-boolean v0, v2, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->MediaBrowserCompatSearchResultReceiver:Z

    .line 4723
    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView;->onPrepareFromUri:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    iput-boolean v0, v2, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->MediaMetadataCompat:Z

    .line 4724
    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView;->onPlayFromMediaId:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    iput-boolean v0, v2, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaBrowserCompatSearchResultReceiver:Z

    .line 4725
    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView;->onRemoveQueueItemAt:Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;

    iget-object v2, v2, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->read:Ljava/util/ArrayList;

    if-eqz v2, :cond_af

    .line 4726
    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView;->onRemoveQueueItemAt:Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;

    iget-object v2, v2, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->read:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/AbstractCollection;->clear()V

    .line 4728
    :cond_af
    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView;->onPlayFromMediaId:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    iget-boolean v2, v2, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaMetadataCompat:Z

    if-eqz v2, :cond_c2

    .line 4731
    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView;->onPlayFromMediaId:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    iput v0, v2, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->AudioAttributesImplApi26Parcelizer:I

    .line 4732
    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView;->onPlayFromMediaId:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    iput-boolean v0, v2, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaMetadataCompat:Z

    .line 4733
    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView;->onRemoveQueueItemAt:Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;

    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->RatingCompat()V

    .line 4736
    :cond_c2
    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView;->onPlayFromMediaId:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView;->onPrepareFromUri:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    invoke-virtual {v2, v3}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->write(Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)V

    .line 4737
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->MediaSessionCompatQueueItem()V

    .line 4738
    invoke-direct {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->read(Z)V

    .line 4739
    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView;->onSetRating:Lo/UIntSerializer;

    invoke-virtual {v2}, Lo/UIntSerializer;->AudioAttributesCompatParcelizer()V

    .line 4740
    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView;->addObserverForBackInvoker:[I

    aget v3, v2, v0

    aget v1, v2, v1

    invoke-direct {p0, v3, v1}, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatItemReceiver(II)Z

    move-result v1

    if-eqz v1, :cond_e3

    .line 4741
    invoke-virtual {p0, v0, v0}, Landroidx/recyclerview/widget/RecyclerView;->write(II)V

    .line 4743
    :cond_e3
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->onPlayFromSearch()V

    .line 4744
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->onPrepareFromUri()V

    return-void
.end method

.method private onMediaButtonEvent()V
    .registers 5

    .line 4631
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw()V

    .line 4632
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->MediaMetadataCompat()V

    .line 4633
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPrepareFromUri:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    const/4 v1, 0x6

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->write(I)V

    .line 4634
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->MediaMetadataCompat:Lo/RegexDeserializer;

    invoke-virtual {v0}, Lo/RegexDeserializer;->write()V

    .line 4635
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPrepareFromUri:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatItemReceiver:Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;

    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;->getItemCount()I

    move-result v1

    iput v1, v0, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->AudioAttributesImplApi26Parcelizer:I

    .line 4636
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPrepareFromUri:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    const/4 v1, 0x0

    iput v1, v0, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->AudioAttributesCompatParcelizer:I

    .line 4637
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPrepareFromMediaId:Landroidx/recyclerview/widget/RecyclerView$SavedState;

    if-eqz v0, :cond_3e

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatItemReceiver:Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;->canRestoreState()Z

    move-result v0

    if-eqz v0, :cond_3e

    .line 4638
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPrepareFromMediaId:Landroidx/recyclerview/widget/RecyclerView$SavedState;

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView$SavedState;->read:Landroid/os/Parcelable;

    if-eqz v0, :cond_3b

    .line 4639
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPlayFromMediaId:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView;->onPrepareFromMediaId:Landroidx/recyclerview/widget/RecyclerView$SavedState;

    iget-object v2, v2, Landroidx/recyclerview/widget/RecyclerView$SavedState;->read:Landroid/os/Parcelable;

    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->IconCompatParcelizer(Landroid/os/Parcelable;)V

    :cond_3b
    const/4 v0, 0x0

    .line 4641
    iput-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPrepareFromMediaId:Landroidx/recyclerview/widget/RecyclerView$SavedState;

    .line 4644
    :cond_3e
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPrepareFromUri:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    iput-boolean v1, v0, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->IconCompatParcelizer:Z

    .line 4645
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPlayFromMediaId:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView;->onRemoveQueueItemAt:Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;

    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView;->onPrepareFromUri:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    invoke-virtual {v0, v2, v3}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->write(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)V

    .line 4647
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPrepareFromUri:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    iput-boolean v1, v0, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->RatingCompat:Z

    .line 4650
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPrepareFromUri:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    iget-boolean v2, v0, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->MediaBrowserCompatSearchResultReceiver:Z

    if-eqz v2, :cond_5b

    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView;->onCommand:Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer;

    if-eqz v2, :cond_5b

    const/4 v2, 0x1

    goto :goto_5c

    :cond_5b
    move v2, v1

    :goto_5c
    iput-boolean v2, v0, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->MediaBrowserCompatSearchResultReceiver:Z

    .line 4651
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPrepareFromUri:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    const/4 v2, 0x4

    iput v2, v0, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->AudioAttributesImplApi21Parcelizer:I

    .line 4652
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->MediaSessionCompatQueueItem()V

    .line 4653
    invoke-direct {p0, v1}, Landroidx/recyclerview/widget/RecyclerView;->read(Z)V

    return-void
.end method

.method private onPause()Lo/rootObjectScope;
    .registers 2

    .line 14449
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->addOnUserLeaveHintListener:Lo/rootObjectScope;

    if-nez v0, :cond_b

    .line 14450
    new-instance v0, Lo/rootObjectScope;

    invoke-direct {v0, p0}, Lo/rootObjectScope;-><init>(Landroid/view/View;)V

    iput-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->addOnUserLeaveHintListener:Lo/rootObjectScope;

    .line 14452
    :cond_b
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView;->addOnUserLeaveHintListener:Lo/rootObjectScope;

    return-object p0
.end method

.method private onPlay()Z
    .registers 6

    .line 2115
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatSearchResultReceiver:Lo/TypesKt;

    invoke-virtual {v0}, Lo/TypesKt;->read()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_8
    if-ge v2, v0, :cond_27

    .line 2117
    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatSearchResultReceiver:Lo/TypesKt;

    invoke-virtual {v3, v2}, Lo/TypesKt;->read(I)Landroid/view/View;

    move-result-object v3

    invoke-static {v3}, Landroidx/recyclerview/widget/RecyclerView;->IconCompatParcelizer(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;

    move-result-object v3

    if-eqz v3, :cond_24

    .line 2118
    invoke-virtual {v3}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->shouldIgnore()Z

    move-result v4

    if-nez v4, :cond_24

    .line 2121
    invoke-virtual {v3}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->isUpdated()Z

    move-result v3

    if-eqz v3, :cond_24

    const/4 p0, 0x1

    return p0

    :cond_24
    add-int/lit8 v2, v2, 0x1

    goto :goto_8

    :cond_27
    return v1
.end method

.method private onPlayFromMediaId()Landroid/view/View;
    .registers 6

    .line 4408
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPrepareFromUri:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    iget v0, v0, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->read:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_c

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPrepareFromUri:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    iget v0, v0, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->read:I

    goto :goto_d

    :cond_c
    const/4 v0, 0x0

    .line 4411
    :goto_d
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->onPrepareFromUri:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->read()I

    move-result v1

    move v2, v0

    :goto_14
    if-ge v2, v1, :cond_2a

    .line 4413
    invoke-direct {p0, v2}, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatSearchResultReceiver(I)Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;

    move-result-object v3

    if-eqz v3, :cond_2a

    .line 4417
    iget-object v4, v3, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->itemView:Landroid/view/View;

    invoke-virtual {v4}, Landroid/view/View;->hasFocusable()Z

    move-result v4

    if-eqz v4, :cond_27

    .line 4418
    iget-object p0, v3, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->itemView:Landroid/view/View;

    return-object p0

    :cond_27
    add-int/lit8 v2, v2, 0x1

    goto :goto_14

    .line 4421
    :cond_2a
    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_30
    const/4 v1, 0x0

    if-ltz v0, :cond_48

    .line 4423
    invoke-direct {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatSearchResultReceiver(I)Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;

    move-result-object v2

    if-nez v2, :cond_3a

    return-object v1

    .line 4427
    :cond_3a
    iget-object v1, v2, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->itemView:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->hasFocusable()Z

    move-result v1

    if-eqz v1, :cond_45

    .line 4428
    iget-object p0, v2, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->itemView:Landroid/view/View;

    return-object p0

    :cond_45
    add-int/lit8 v0, v0, -0x1

    goto :goto_30

    :cond_48
    return-object v1
.end method

.method private onPlayFromSearch()V
    .registers 7

    .line 4435
    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->getSavedStateRegistryControllerannotations:Z

    if-eqz v0, :cond_95

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatItemReceiver:Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;

    if-eqz v0, :cond_95

    invoke-virtual {p0}, Landroid/view/View;->hasFocus()Z

    move-result v0

    if-eqz v0, :cond_95

    .line 4436
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getDescendantFocusability()I

    move-result v0

    const/high16 v1, 0x60000

    if-eq v0, v1, :cond_95

    .line 4437
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getDescendantFocusability()I

    move-result v0

    const/high16 v1, 0x20000

    if-ne v0, v1, :cond_24

    invoke-virtual {p0}, Landroid/view/View;->isFocused()Z

    move-result v0

    if-nez v0, :cond_95

    .line 4445
    :cond_24
    invoke-virtual {p0}, Landroid/view/View;->isFocused()Z

    move-result v0

    if-nez v0, :cond_36

    .line 4446
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getFocusedChild()Landroid/view/View;

    move-result-object v0

    .line 4466
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatSearchResultReceiver:Lo/TypesKt;

    invoke-virtual {v1, v0}, Lo/TypesKt;->IconCompatParcelizer(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_95

    .line 4476
    :cond_36
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPrepareFromUri:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    iget-wide v0, v0, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->RemoteActionCompatParcelizer:J

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    const/4 v1, 0x0

    if-eqz v0, :cond_52

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatItemReceiver:Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;->hasStableIds()Z

    move-result v0

    if-eqz v0, :cond_52

    .line 4477
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPrepareFromUri:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    iget-wide v4, v0, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->RemoteActionCompatParcelizer:J

    invoke-direct {p0, v4, v5}, Landroidx/recyclerview/widget/RecyclerView;->write(J)Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;

    move-result-object v0

    goto :goto_53

    :cond_52
    move-object v0, v1

    :goto_53
    if-eqz v0, :cond_6a

    .line 4480
    iget-object v4, p0, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatSearchResultReceiver:Lo/TypesKt;

    iget-object v5, v0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->itemView:Landroid/view/View;

    invoke-virtual {v4, v5}, Lo/TypesKt;->IconCompatParcelizer(Landroid/view/View;)Z

    move-result v4

    if-nez v4, :cond_6a

    iget-object v4, v0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->itemView:Landroid/view/View;

    .line 4481
    invoke-virtual {v4}, Landroid/view/View;->hasFocusable()Z

    move-result v4

    if-eqz v4, :cond_6a

    .line 4494
    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->itemView:Landroid/view/View;

    goto :goto_76

    .line 4482
    :cond_6a
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatSearchResultReceiver:Lo/TypesKt;

    invoke-virtual {v0}, Lo/TypesKt;->read()I

    move-result v0

    if-lez v0, :cond_76

    .line 4489
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->onPlayFromMediaId()Landroid/view/View;

    move-result-object v1

    :cond_76
    :goto_76
    if-eqz v1, :cond_95

    .line 4498
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPrepareFromUri:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    iget v0, v0, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->write:I

    int-to-long v4, v0

    cmp-long v0, v4, v2

    if-eqz v0, :cond_92

    .line 4499
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPrepareFromUri:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    iget p0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->write:I

    invoke-virtual {v1, p0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    if-eqz p0, :cond_92

    .line 4500
    invoke-virtual {p0}, Landroid/view/View;->isFocusable()Z

    move-result v0

    if-eqz v0, :cond_92

    move-object v1, p0

    .line 4504
    :cond_92
    invoke-virtual {v1}, Landroid/view/View;->requestFocus()Z

    :cond_95
    return-void
.end method

.method private onPlayFromUri()V
    .registers 2

    .line 839
    invoke-static {p0}, Lo/InvalidTypeIdException;->MediaMetadataCompat(Landroid/view/View;)I

    move-result v0

    if-nez v0, :cond_b

    const/16 v0, 0x8

    .line 840
    invoke-static {p0, v0}, Lo/InvalidTypeIdException;->MediaBrowserCompatCustomActionResultReceiver(Landroid/view/View;I)V

    :cond_b
    return-void
.end method

.method private onPrepare()V
    .registers 6

    .line 4266
    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->RatingCompat:Z

    if-eqz v0, :cond_12

    .line 4269
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->MediaMetadataCompat:Lo/RegexDeserializer;

    invoke-virtual {v0}, Lo/RegexDeserializer;->MediaBrowserCompatItemReceiver()V

    .line 4270
    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->PlaybackStateCompat:Z

    if-eqz v0, :cond_12

    .line 4271
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPlayFromMediaId:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->L_()V

    .line 4277
    :cond_12
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->onPrepareFromSearch()Z

    move-result v0

    if-eqz v0, :cond_1e

    .line 4278
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->MediaMetadataCompat:Lo/RegexDeserializer;

    invoke-virtual {v0}, Lo/RegexDeserializer;->RemoteActionCompatParcelizer()V

    goto :goto_23

    .line 4280
    :cond_1e
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->MediaMetadataCompat:Lo/RegexDeserializer;

    invoke-virtual {v0}, Lo/RegexDeserializer;->write()V

    .line 4282
    :goto_23
    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onMediaButtonEvent:Z

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez v0, :cond_2f

    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onFastForward:Z

    if-nez v0, :cond_2f

    move v0, v2

    goto :goto_30

    :cond_2f
    move v0, v1

    .line 4283
    :goto_30
    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView;->onPrepareFromUri:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    iget-boolean v4, p0, Landroidx/recyclerview/widget/RecyclerView;->onCustomAction:Z

    if-eqz v4, :cond_54

    iget-object v4, p0, Landroidx/recyclerview/widget/RecyclerView;->onCommand:Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer;

    if-eqz v4, :cond_54

    iget-boolean v4, p0, Landroidx/recyclerview/widget/RecyclerView;->RatingCompat:Z

    if-nez v4, :cond_46

    if-nez v0, :cond_46

    iget-object v4, p0, Landroidx/recyclerview/widget/RecyclerView;->onPlayFromMediaId:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    iget-boolean v4, v4, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaBrowserCompatSearchResultReceiver:Z

    if-eqz v4, :cond_54

    :cond_46
    iget-boolean v4, p0, Landroidx/recyclerview/widget/RecyclerView;->RatingCompat:Z

    if-eqz v4, :cond_52

    iget-object v4, p0, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatItemReceiver:Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;

    .line 4289
    invoke-virtual {v4}, Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;->hasStableIds()Z

    move-result v4

    if-eqz v4, :cond_54

    :cond_52
    move v4, v1

    goto :goto_55

    :cond_54
    move v4, v2

    :goto_55
    iput-boolean v4, v3, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->MediaBrowserCompatSearchResultReceiver:Z

    .line 4290
    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView;->onPrepareFromUri:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    iget-boolean v4, v3, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->MediaBrowserCompatSearchResultReceiver:Z

    if-eqz v4, :cond_6a

    if-eqz v0, :cond_6a

    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->RatingCompat:Z

    if-nez v0, :cond_6a

    .line 4293
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->onPrepareFromSearch()Z

    move-result p0

    if-eqz p0, :cond_6a

    goto :goto_6b

    :cond_6a
    move v1, v2

    :goto_6b
    iput-boolean v1, v3, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->MediaMetadataCompat:Z

    return-void
.end method

.method private onPrepareFromMediaId()V
    .registers 3

    .line 939
    new-instance v0, Lo/TypesKt;

    new-instance v1, Landroidx/recyclerview/widget/RecyclerView$1;

    invoke-direct {v1, p0}, Landroidx/recyclerview/widget/RecyclerView$1;-><init>(Landroidx/recyclerview/widget/RecyclerView;)V

    invoke-direct {v0, v1}, Lo/TypesKt;-><init>(Lo/TypesKt$IconCompatParcelizer;)V

    iput-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatSearchResultReceiver:Lo/TypesKt;

    return-void
.end method

.method private onPrepareFromSearch()Z
    .registers 2

    .line 4256
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onCommand:Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer;

    if-eqz v0, :cond_e

    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPlayFromMediaId:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->M_()Z

    move-result p0

    if-eqz p0, :cond_e

    const/4 p0, 0x1

    return p0

    :cond_e
    const/4 p0, 0x0

    return p0
.end method

.method private onPrepareFromUri()V
    .registers 4

    .line 4392
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPrepareFromUri:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    const-wide/16 v1, -0x1

    iput-wide v1, v0, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->RemoteActionCompatParcelizer:J

    .line 4393
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPrepareFromUri:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    const/4 v1, -0x1

    iput v1, v0, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->read:I

    .line 4394
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPrepareFromUri:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    iput v1, p0, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->write:I

    return-void
.end method

.method private onRemoveQueueItem()V
    .registers 2

    .line 3915
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->getSavedStateRegistry:Landroid/view/VelocityTracker;

    if-eqz v0, :cond_7

    .line 3916
    invoke-virtual {v0}, Landroid/view/VelocityTracker;->clear()V

    :cond_7
    const/4 v0, 0x0

    .line 3918
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatCustomActionResultReceiver(I)V

    .line 3919
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->onSeekTo()V

    return-void
.end method

.method private onRemoveQueueItemAt()V
    .registers 5

    .line 4372
    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->getSavedStateRegistryControllerannotations:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_14

    invoke-virtual {p0}, Landroid/view/View;->hasFocus()Z

    move-result v0

    if-eqz v0, :cond_14

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatItemReceiver:Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;

    if-eqz v0, :cond_14

    .line 4373
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getFocusedChild()Landroid/view/View;

    move-result-object v0

    goto :goto_15

    :cond_14
    move-object v0, v1

    :goto_15
    if-nez v0, :cond_18

    goto :goto_1c

    .line 4376
    :cond_18
    invoke-direct {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->RatingCompat(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;

    move-result-object v1

    :goto_1c
    if-nez v1, :cond_22

    .line 4378
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->onPrepareFromUri()V

    return-void

    .line 4380
    :cond_22
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPrepareFromUri:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatItemReceiver:Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;

    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;->hasStableIds()Z

    move-result v2

    if-eqz v2, :cond_31

    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->getItemId()J

    move-result-wide v2

    goto :goto_33

    :cond_31
    const-wide/16 v2, -0x1

    :goto_33
    iput-wide v2, v0, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->RemoteActionCompatParcelizer:J

    .line 4384
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPrepareFromUri:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    iget-boolean v2, p0, Landroidx/recyclerview/widget/RecyclerView;->RatingCompat:Z

    if-eqz v2, :cond_3d

    const/4 v2, -0x1

    goto :goto_4a

    .line 4385
    :cond_3d
    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->isRemoved()Z

    move-result v2

    if-eqz v2, :cond_46

    iget v2, v1, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mOldPosition:I

    goto :goto_4a

    .line 4386
    :cond_46
    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->getAbsoluteAdapterPosition()I

    move-result v2

    :goto_4a
    iput v2, v0, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->read:I

    .line 4387
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPrepareFromUri:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    iget-object v0, v1, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->itemView:Landroid/view/View;

    invoke-static {v0}, Landroidx/recyclerview/widget/RecyclerView;->MediaDescriptionCompat(Landroid/view/View;)I

    move-result v0

    iput v0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->write:I

    return-void
.end method

.method private onRewind()V
    .registers 2

    .line 2923
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onSetCaptioningEnabled:Landroidx/recyclerview/widget/RecyclerView$onFastForward;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$onFastForward;->read()V

    .line 2924
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPlayFromMediaId:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    if-eqz p0, :cond_c

    .line 2925
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onSkipToNext()V

    :cond_c
    return-void
.end method

.method private onSeekTo()V
    .registers 3

    .line 2982
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->accessensureViewModelStore:Landroid/widget/EdgeEffect;

    if-eqz v0, :cond_e

    .line 2983
    invoke-virtual {v0}, Landroid/widget/EdgeEffect;->onRelease()V

    .line 2984
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->accessensureViewModelStore:Landroid/widget/EdgeEffect;

    invoke-virtual {v0}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v0

    goto :goto_f

    :cond_e
    const/4 v0, 0x0

    .line 2986
    :goto_f
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->getFullyDrawnReporter:Landroid/widget/EdgeEffect;

    if-eqz v1, :cond_1d

    .line 2987
    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->onRelease()V

    .line 2988
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->getFullyDrawnReporter:Landroid/widget/EdgeEffect;

    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v1

    or-int/2addr v0, v1

    .line 2990
    :cond_1d
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->addOnMultiWindowModeChangedListener:Landroid/widget/EdgeEffect;

    if-eqz v1, :cond_2b

    .line 2991
    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->onRelease()V

    .line 2992
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->addOnMultiWindowModeChangedListener:Landroid/widget/EdgeEffect;

    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v1

    or-int/2addr v0, v1

    .line 2994
    :cond_2b
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->onSkipToQueueItem:Landroid/widget/EdgeEffect;

    if-eqz v1, :cond_39

    .line 2995
    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->onRelease()V

    .line 2996
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->onSkipToQueueItem:Landroid/widget/EdgeEffect;

    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v1

    or-int/2addr v0, v1

    :cond_39
    if-eqz v0, :cond_3e

    .line 2999
    invoke-static {p0}, Lo/InvalidTypeIdException;->onRemoveQueueItem(Landroid/view/View;)V

    :cond_3e
    return-void
.end method

.method private onSetCaptioningEnabled()V
    .registers 5

    .line 5069
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatSearchResultReceiver:Lo/TypesKt;

    invoke-virtual {v0}, Lo/TypesKt;->RemoteActionCompatParcelizer()I

    move-result v0

    const/4 v1, 0x0

    :goto_7
    if-ge v1, v0, :cond_1f

    .line 5071
    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatSearchResultReceiver:Lo/TypesKt;

    invoke-virtual {v2, v1}, Lo/TypesKt;->AudioAttributesCompatParcelizer(I)Landroid/view/View;

    move-result-object v2

    invoke-static {v2}, Landroidx/recyclerview/widget/RecyclerView;->IconCompatParcelizer(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;

    move-result-object v2

    .line 5072
    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->shouldIgnore()Z

    move-result v3

    if-nez v3, :cond_1c

    .line 5073
    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->clearOldPosition()V

    :cond_1c
    add-int/lit8 v1, v1, 0x1

    goto :goto_7

    .line 5076
    :cond_1f
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView;->onRemoveQueueItemAt:Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->IconCompatParcelizer()V

    return-void
.end method

.method private onSetPlaybackSpeed()V
    .registers 6

    .line 12384
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPrepareFromSearch:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_8
    if-ltz v0, :cond_2f

    .line 12385
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->onPrepareFromSearch:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;

    .line 12386
    iget-object v2, v1, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->itemView:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    if-ne v2, p0, :cond_2c

    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->shouldIgnore()Z

    move-result v2

    if-nez v2, :cond_2c

    .line 12389
    iget v2, v1, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mPendingAccessibilityState:I

    const/4 v3, -0x1

    if-eq v2, v3, :cond_2c

    .line 12392
    iget-object v4, v1, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->itemView:Landroid/view/View;

    invoke-static {v4, v2}, Lo/InvalidTypeIdException;->AudioAttributesImplBaseParcelizer(Landroid/view/View;I)V

    .line 12393
    iput v3, v1, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mPendingAccessibilityState:I

    :cond_2c
    add-int/lit8 v0, v0, -0x1

    goto :goto_8

    .line 12397
    :cond_2f
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPrepareFromSearch:Ljava/util/List;

    invoke-interface {p0}, Ljava/util/List;->clear()V

    return-void
.end method

.method private onSetRating()V
    .registers 5

    .line 4322
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatItemReceiver:Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;

    if-nez v0, :cond_5

    return-void

    .line 4327
    :cond_5
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPlayFromMediaId:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    if-nez v0, :cond_a

    return-void

    .line 4332
    :cond_a
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPrepareFromUri:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    const/4 v1, 0x0

    iput-boolean v1, v0, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->MediaBrowserCompatItemReceiver:Z

    .line 4338
    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->_init_lambda5:Z

    const/4 v2, 0x1

    if-eqz v0, :cond_26

    iget v0, p0, Landroidx/recyclerview/widget/RecyclerView;->_init_lambda2:I

    .line 4339
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v3

    if-ne v0, v3, :cond_24

    iget v0, p0, Landroidx/recyclerview/widget/RecyclerView;->r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0:I

    .line 4340
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v3

    if-eq v0, v3, :cond_26

    :cond_24
    move v0, v2

    goto :goto_27

    :cond_26
    move v0, v1

    .line 4341
    :goto_27
    iput v1, p0, Landroidx/recyclerview/widget/RecyclerView;->_init_lambda2:I

    .line 4342
    iput v1, p0, Landroidx/recyclerview/widget/RecyclerView;->r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0:I

    .line 4343
    iput-boolean v1, p0, Landroidx/recyclerview/widget/RecyclerView;->_init_lambda5:Z

    .line 4345
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->onPrepareFromUri:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    iget v1, v1, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->AudioAttributesImplApi21Parcelizer:I

    if-ne v1, v2, :cond_37

    .line 4346
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->onCommand()V

    goto :goto_5f

    .line 4349
    :cond_37
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->MediaMetadataCompat:Lo/RegexDeserializer;

    invoke-virtual {v1}, Lo/RegexDeserializer;->AudioAttributesCompatParcelizer()Z

    move-result v1

    if-nez v1, :cond_5f

    if-nez v0, :cond_5f

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPlayFromMediaId:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    .line 4351
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onPrepare()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v1

    if-ne v0, v1, :cond_5f

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPlayFromMediaId:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    .line 4352
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onMediaButtonEvent()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v1

    if-ne v0, v1, :cond_5f

    .line 4365
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPlayFromMediaId:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    invoke-virtual {v0, p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->IconCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView;)V

    goto :goto_67

    .line 4361
    :cond_5f
    :goto_5f
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPlayFromMediaId:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    invoke-virtual {v0, p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->IconCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 4362
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->onMediaButtonEvent()V

    .line 4367
    :goto_67
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->onFastForward()V

    return-void
.end method

.method private onSetRepeatMode()V
    .registers 7

    .line 3057
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->accessensureViewModelStore:Landroid/widget/EdgeEffect;

    if-eqz v0, :cond_5

    return-void

    .line 3060
    :cond_5
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->MediaSessionCompatQueueItem:Landroidx/recyclerview/widget/RecyclerView$RemoteActionCompatParcelizer;

    invoke-virtual {v0, p0}, Landroidx/recyclerview/widget/RecyclerView$RemoteActionCompatParcelizer;->RemoteActionCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView;)Landroid/widget/EdgeEffect;

    move-result-object v0

    iput-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->accessensureViewModelStore:Landroid/widget/EdgeEffect;

    .line 3061
    iget-boolean v1, p0, Landroidx/recyclerview/widget/RecyclerView;->MediaDescriptionCompat:Z

    if-eqz v1, :cond_31

    .line 3062
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v3

    .line 3063
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v4

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v5

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result p0

    sub-int/2addr v1, v2

    sub-int/2addr v1, v3

    sub-int/2addr v4, v5

    sub-int/2addr v4, p0

    .line 3062
    invoke-virtual {v0, v1, v4}, Landroid/widget/EdgeEffect;->setSize(II)V

    return-void

    .line 3065
    :cond_31
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result p0

    invoke-virtual {v0, v1, p0}, Landroid/widget/EdgeEffect;->setSize(II)V

    return-void
.end method

.method private onSetShuffleMode()V
    .registers 7

    .line 3097
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onSkipToQueueItem:Landroid/widget/EdgeEffect;

    if-eqz v0, :cond_5

    return-void

    .line 3100
    :cond_5
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->MediaSessionCompatQueueItem:Landroidx/recyclerview/widget/RecyclerView$RemoteActionCompatParcelizer;

    invoke-virtual {v0, p0}, Landroidx/recyclerview/widget/RecyclerView$RemoteActionCompatParcelizer;->RemoteActionCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView;)Landroid/widget/EdgeEffect;

    move-result-object v0

    iput-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onSkipToQueueItem:Landroid/widget/EdgeEffect;

    .line 3101
    iget-boolean v1, p0, Landroidx/recyclerview/widget/RecyclerView;->MediaDescriptionCompat:Z

    if-eqz v1, :cond_31

    .line 3102
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v3

    .line 3103
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v4

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v5

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result p0

    sub-int/2addr v1, v2

    sub-int/2addr v1, v3

    sub-int/2addr v4, v5

    sub-int/2addr v4, p0

    .line 3102
    invoke-virtual {v0, v1, v4}, Landroid/widget/EdgeEffect;->setSize(II)V

    return-void

    .line 3105
    :cond_31
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result p0

    invoke-virtual {v0, v1, p0}, Landroid/widget/EdgeEffect;->setSize(II)V

    return-void
.end method

.method private onSkipToNext()V
    .registers 7

    .line 3083
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->getFullyDrawnReporter:Landroid/widget/EdgeEffect;

    if-eqz v0, :cond_5

    return-void

    .line 3086
    :cond_5
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->MediaSessionCompatQueueItem:Landroidx/recyclerview/widget/RecyclerView$RemoteActionCompatParcelizer;

    invoke-virtual {v0, p0}, Landroidx/recyclerview/widget/RecyclerView$RemoteActionCompatParcelizer;->RemoteActionCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView;)Landroid/widget/EdgeEffect;

    move-result-object v0

    iput-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->getFullyDrawnReporter:Landroid/widget/EdgeEffect;

    .line 3087
    iget-boolean v1, p0, Landroidx/recyclerview/widget/RecyclerView;->MediaDescriptionCompat:Z

    if-eqz v1, :cond_31

    .line 3088
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v3

    .line 3089
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v4

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v5

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result p0

    sub-int/2addr v1, v2

    sub-int/2addr v1, v3

    sub-int/2addr v4, v5

    sub-int/2addr v4, p0

    .line 3088
    invoke-virtual {v0, v1, v4}, Landroid/widget/EdgeEffect;->setSize(II)V

    return-void

    .line 3091
    :cond_31
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result p0

    invoke-virtual {v0, v1, p0}, Landroid/widget/EdgeEffect;->setSize(II)V

    return-void
.end method

.method private onSkipToPrevious()V
    .registers 3

    .line 1073
    new-instance v0, Lo/RegexDeserializer;

    new-instance v1, Landroidx/recyclerview/widget/RecyclerView$8;

    invoke-direct {v1, p0}, Landroidx/recyclerview/widget/RecyclerView$8;-><init>(Landroidx/recyclerview/widget/RecyclerView;)V

    invoke-direct {v0, v1}, Lo/RegexDeserializer;-><init>(Lo/RegexDeserializer$read;)V

    iput-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->MediaMetadataCompat:Lo/RegexDeserializer;

    return-void
.end method

.method private onSkipToQueueItem()I
    .registers 1

    .line 1763
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPause:Ljava/util/ArrayList;

    invoke-virtual {p0}, Ljava/util/AbstractCollection;->size()I

    move-result p0

    return p0
.end method

.method private onStop()V
    .registers 7

    .line 3070
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->addOnMultiWindowModeChangedListener:Landroid/widget/EdgeEffect;

    if-eqz v0, :cond_5

    return-void

    .line 3073
    :cond_5
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->MediaSessionCompatQueueItem:Landroidx/recyclerview/widget/RecyclerView$RemoteActionCompatParcelizer;

    invoke-virtual {v0, p0}, Landroidx/recyclerview/widget/RecyclerView$RemoteActionCompatParcelizer;->RemoteActionCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView;)Landroid/widget/EdgeEffect;

    move-result-object v0

    iput-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->addOnMultiWindowModeChangedListener:Landroid/widget/EdgeEffect;

    .line 3074
    iget-boolean v1, p0, Landroidx/recyclerview/widget/RecyclerView;->MediaDescriptionCompat:Z

    if-eqz v1, :cond_31

    .line 3075
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v3

    .line 3076
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v4

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v5

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result p0

    sub-int/2addr v1, v2

    sub-int/2addr v1, v3

    sub-int/2addr v4, v5

    sub-int/2addr v4, p0

    .line 3075
    invoke-virtual {v0, v1, v4}, Landroid/widget/EdgeEffect;->setSize(II)V

    return-void

    .line 3078
    :cond_31
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result p0

    invoke-virtual {v0, v1, p0}, Landroid/widget/EdgeEffect;->setSize(II)V

    return-void
.end method

.method private r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw()V
    .registers 3

    .line 2426
    iget v0, p0, Landroidx/recyclerview/widget/RecyclerView;->r8lambdaKUbBm7ckfqTc9QCgukC86fguu4:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, p0, Landroidx/recyclerview/widget/RecyclerView;->r8lambdaKUbBm7ckfqTc9QCgukC86fguu4:I

    if-ne v0, v1, :cond_f

    .line 2427
    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPlay:Z

    if-nez v0, :cond_f

    const/4 v0, 0x0

    .line 2428
    iput-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPrepare:Z

    :cond_f
    return-void
.end method

.method private read(IF)I
    .registers 6

    .line 2201
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v0

    int-to-float v0, v0

    div-float/2addr p2, v0

    int-to-float p1, p1

    .line 2202
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v0

    int-to-float v0, v0

    div-float/2addr p1, v0

    .line 2203
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->accessensureViewModelStore:Landroid/widget/EdgeEffect;

    const/4 v1, 0x0

    if-eqz v0, :cond_46

    invoke-static {v0}, Lo/memberMethods;->write(Landroid/widget/EdgeEffect;)F

    move-result v0

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_46

    const/4 v0, -0x1

    .line 2204
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->canScrollHorizontally(I)Z

    move-result v0

    if-eqz v0, :cond_27

    .line 2205
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->accessensureViewModelStore:Landroid/widget/EdgeEffect;

    invoke-virtual {p1}, Landroid/widget/EdgeEffect;->onRelease()V

    goto :goto_42

    .line 2207
    :cond_27
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->accessensureViewModelStore:Landroid/widget/EdgeEffect;

    neg-float p1, p1

    const/high16 v2, 0x3f800000    # 1.0f

    sub-float/2addr v2, p2

    invoke-static {v0, p1, v2}, Lo/memberMethods;->read(Landroid/widget/EdgeEffect;FF)F

    move-result p1

    neg-float p1, p1

    .line 2209
    iget-object p2, p0, Landroidx/recyclerview/widget/RecyclerView;->accessensureViewModelStore:Landroid/widget/EdgeEffect;

    invoke-static {p2}, Lo/memberMethods;->write(Landroid/widget/EdgeEffect;)F

    move-result p2

    cmpl-float p2, p2, v1

    if-nez p2, :cond_41

    .line 2210
    iget-object p2, p0, Landroidx/recyclerview/widget/RecyclerView;->accessensureViewModelStore:Landroid/widget/EdgeEffect;

    invoke-virtual {p2}, Landroid/widget/EdgeEffect;->onRelease()V

    :cond_41
    move v1, p1

    .line 2213
    :goto_42
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    goto :goto_78

    .line 2214
    :cond_46
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->addOnMultiWindowModeChangedListener:Landroid/widget/EdgeEffect;

    if-eqz v0, :cond_78

    invoke-static {v0}, Lo/memberMethods;->write(Landroid/widget/EdgeEffect;)F

    move-result v0

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_78

    const/4 v0, 0x1

    .line 2215
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->canScrollHorizontally(I)Z

    move-result v0

    if-eqz v0, :cond_5f

    .line 2216
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->addOnMultiWindowModeChangedListener:Landroid/widget/EdgeEffect;

    invoke-virtual {p1}, Landroid/widget/EdgeEffect;->onRelease()V

    goto :goto_75

    .line 2218
    :cond_5f
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->addOnMultiWindowModeChangedListener:Landroid/widget/EdgeEffect;

    invoke-static {v0, p1, p2}, Lo/memberMethods;->read(Landroid/widget/EdgeEffect;FF)F

    move-result p1

    .line 2219
    iget-object p2, p0, Landroidx/recyclerview/widget/RecyclerView;->addOnMultiWindowModeChangedListener:Landroid/widget/EdgeEffect;

    invoke-static {p2}, Lo/memberMethods;->write(Landroid/widget/EdgeEffect;)F

    move-result p2

    cmpl-float p2, p2, v1

    if-nez p2, :cond_74

    .line 2220
    iget-object p2, p0, Landroidx/recyclerview/widget/RecyclerView;->addOnMultiWindowModeChangedListener:Landroid/widget/EdgeEffect;

    invoke-virtual {p2}, Landroid/widget/EdgeEffect;->onRelease()V

    :cond_74
    move v1, p1

    .line 2223
    :goto_75
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 2225
    :cond_78
    :goto_78
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result p0

    int-to-float p0, p0

    mul-float/2addr v1, p0

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result p0

    return p0
.end method

.method private read(JLandroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;)V
    .registers 10

    .line 4765
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatSearchResultReceiver:Lo/TypesKt;

    invoke-virtual {v0}, Lo/TypesKt;->read()I

    move-result v0

    const/4 v1, 0x0

    :goto_7
    if-ge v1, v0, :cond_6e

    .line 4767
    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatSearchResultReceiver:Lo/TypesKt;

    invoke-virtual {v2, v1}, Lo/TypesKt;->read(I)Landroid/view/View;

    move-result-object v2

    .line 4768
    invoke-static {v2}, Landroidx/recyclerview/widget/RecyclerView;->IconCompatParcelizer(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;

    move-result-object v2

    if-eq v2, p3, :cond_6b

    .line 4772
    invoke-direct {p0, v2}, Landroidx/recyclerview/widget/RecyclerView;->AudioAttributesCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;)J

    move-result-wide v3

    cmp-long v3, v3, p1

    if-nez v3, :cond_6b

    .line 4774
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatItemReceiver:Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;

    const-string p2, " \n View Holder 2:"

    if-eqz p1, :cond_4a

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;->hasStableIds()Z

    move-result p1

    if-eqz p1, :cond_4a

    .line 4775
    new-instance p1, Ljava/lang/StringBuilder;

    const-string p4, "Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:"

    invoke-direct {p1, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 4778
    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->write()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p2, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 4780
    :cond_4a
    new-instance p1, Ljava/lang/StringBuilder;

    const-string p4, "Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:"

    invoke-direct {p1, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 4784
    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->write()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p2, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_6b
    add-int/lit8 v1, v1, 0x1

    goto :goto_7

    .line 4789
    :cond_6e
    invoke-static {p4}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    invoke-static {p3}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 4791
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->write()Ljava/lang/String;

    return-void
.end method

.method static read(Landroid/view/View;Landroid/graphics/Rect;)V
    .registers 13

    .line 5611
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    .line 5612
    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->RemoteActionCompatParcelizer:Landroid/graphics/Rect;

    .line 5613
    invoke-virtual {p0}, Landroid/view/View;->getLeft()I

    move-result v2

    iget v3, v1, Landroid/graphics/Rect;->left:I

    iget v4, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 5614
    invoke-virtual {p0}, Landroid/view/View;->getTop()I

    move-result v5

    iget v6, v1, Landroid/graphics/Rect;->top:I

    iget v7, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 5615
    invoke-virtual {p0}, Landroid/view/View;->getRight()I

    move-result v8

    iget v9, v1, Landroid/graphics/Rect;->right:I

    iget v10, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 5616
    invoke-virtual {p0}, Landroid/view/View;->getBottom()I

    move-result p0

    iget v1, v1, Landroid/graphics/Rect;->bottom:I

    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    sub-int/2addr v2, v3

    sub-int/2addr v2, v4

    sub-int/2addr v5, v6

    sub-int/2addr v5, v7

    add-int/2addr v8, v9

    add-int/2addr v8, v10

    add-int/2addr p0, v1

    add-int/2addr p0, v0

    .line 5613
    invoke-virtual {p1, v2, v5, v8, p0}, Landroid/graphics/Rect;->set(IIII)V

    return-void
.end method

.method private read(Landroid/view/View;Landroid/view/View;)V
    .registers 14

    if-eqz p2, :cond_4

    move-object v0, p2

    goto :goto_5

    :cond_4
    move-object v0, p1

    .line 3335
    :goto_5
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->onSetPlaybackSpeed:Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v2

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v3

    const/4 v4, 0x0

    invoke-virtual {v1, v4, v4, v2, v3}, Landroid/graphics/Rect;->set(IIII)V

    .line 3340
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    .line 3341
    instance-of v1, v0, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    if-eqz v1, :cond_47

    .line 3343
    check-cast v0, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    .line 3344
    iget-boolean v1, v0, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->AudioAttributesCompatParcelizer:Z

    if-nez v1, :cond_47

    .line 3345
    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->RemoteActionCompatParcelizer:Landroid/graphics/Rect;

    .line 3346
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->onSetPlaybackSpeed:Landroid/graphics/Rect;

    iget v2, v1, Landroid/graphics/Rect;->left:I

    iget v3, v0, Landroid/graphics/Rect;->left:I

    sub-int/2addr v2, v3

    iput v2, v1, Landroid/graphics/Rect;->left:I

    .line 3347
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->onSetPlaybackSpeed:Landroid/graphics/Rect;

    iget v2, v1, Landroid/graphics/Rect;->right:I

    iget v3, v0, Landroid/graphics/Rect;->right:I

    add-int/2addr v2, v3

    iput v2, v1, Landroid/graphics/Rect;->right:I

    .line 3348
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->onSetPlaybackSpeed:Landroid/graphics/Rect;

    iget v2, v1, Landroid/graphics/Rect;->top:I

    iget v3, v0, Landroid/graphics/Rect;->top:I

    sub-int/2addr v2, v3

    iput v2, v1, Landroid/graphics/Rect;->top:I

    .line 3349
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->onSetPlaybackSpeed:Landroid/graphics/Rect;

    iget v2, v1, Landroid/graphics/Rect;->bottom:I

    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    add-int/2addr v2, v0

    iput v2, v1, Landroid/graphics/Rect;->bottom:I

    :cond_47
    if-eqz p2, :cond_53

    .line 3354
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onSetPlaybackSpeed:Landroid/graphics/Rect;

    invoke-virtual {p0, p2, v0}, Landroid/view/ViewGroup;->offsetDescendantRectToMyCoords(Landroid/view/View;Landroid/graphics/Rect;)V

    .line 3355
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onSetPlaybackSpeed:Landroid/graphics/Rect;

    invoke-virtual {p0, p1, v0}, Landroid/view/ViewGroup;->offsetRectIntoDescendantCoords(Landroid/view/View;Landroid/graphics/Rect;)V

    .line 3357
    :cond_53
    iget-object v5, p0, Landroidx/recyclerview/widget/RecyclerView;->onPlayFromMediaId:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    iget-object v8, p0, Landroidx/recyclerview/widget/RecyclerView;->onSetPlaybackSpeed:Landroid/graphics/Rect;

    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onCustomAction:Z

    const/4 v1, 0x1

    if-nez p2, :cond_5e

    move v10, v1

    goto :goto_5f

    :cond_5e
    move v10, v4

    :goto_5f
    xor-int/lit8 v9, v0, 0x1

    move-object v6, p0

    move-object v7, p1

    invoke-virtual/range {v5 .. v10}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->IconCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;Landroid/graphics/Rect;ZZ)Z

    return-void
.end method

.method private read(Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplBaseParcelizer;)V
    .registers 4

    .line 1708
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPlayFromMediaId:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    if-eqz v0, :cond_9

    .line 1709
    const-string v1, "Cannot add item decoration during a scroll  or layout"

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->IconCompatParcelizer(Ljava/lang/String;)V

    .line 1712
    :cond_9
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPause:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_15

    const/4 v0, 0x0

    .line 1713
    invoke-virtual {p0, v0}, Landroid/view/View;->setWillNotDraw(Z)V

    .line 1716
    :cond_15
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPause:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 1720
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->MediaSessionCompatToken()V

    .line 1721
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method private read(Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;ZZ)V
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer<",
            "*>;ZZ)V"
        }
    .end annotation

    .line 1303
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatItemReceiver:Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;

    if-eqz v0, :cond_e

    .line 1304
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->accessonBackPresseds1027565324:Landroidx/recyclerview/widget/RecyclerView$onCommand;

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;->unregisterAdapterDataObserver(Landroidx/recyclerview/widget/RecyclerView$read;)V

    .line 1305
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatItemReceiver:Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;

    invoke-virtual {v0, p0}, Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;->onDetachedFromRecyclerView(Landroidx/recyclerview/widget/RecyclerView;)V

    :cond_e
    if-eqz p2, :cond_12

    if-eqz p3, :cond_15

    .line 1308
    :cond_12
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->onAddQueueItem()V

    .line 1310
    :cond_15
    iget-object p3, p0, Landroidx/recyclerview/widget/RecyclerView;->MediaMetadataCompat:Lo/RegexDeserializer;

    invoke-virtual {p3}, Lo/RegexDeserializer;->MediaBrowserCompatItemReceiver()V

    .line 1311
    iget-object p3, p0, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatItemReceiver:Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;

    .line 1312
    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatItemReceiver:Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;

    if-eqz p1, :cond_28

    .line 1314
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->accessonBackPresseds1027565324:Landroidx/recyclerview/widget/RecyclerView$onCommand;

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;->registerAdapterDataObserver(Landroidx/recyclerview/widget/RecyclerView$read;)V

    .line 1315
    invoke-virtual {p1, p0}, Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;->onAttachedToRecyclerView(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 1317
    :cond_28
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->onPlayFromMediaId:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    if-eqz p1, :cond_31

    .line 1318
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatItemReceiver:Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;

    invoke-virtual {p1, p3, v0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->IconCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;)V

    .line 1320
    :cond_31
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->onRemoveQueueItemAt:Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatItemReceiver:Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;

    invoke-virtual {p1, p3, v0, p2}, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->RemoteActionCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;Z)V

    .line 1321
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPrepareFromUri:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->RatingCompat:Z

    return-void
.end method

.method static read(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;)V
    .registers 4

    .line 6467
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mNestedRecyclerView:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_22

    .line 6468
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mNestedRecyclerView:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    :goto_c
    const/4 v1, 0x0

    if-eqz v0, :cond_20

    .line 6470
    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->itemView:Landroid/view/View;

    if-eq v0, v2, :cond_22

    .line 6474
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    .line 6475
    instance-of v2, v0, Landroid/view/View;

    if-eqz v2, :cond_1e

    .line 6476
    check-cast v0, Landroid/view/View;

    goto :goto_c

    :cond_1e
    move-object v0, v1

    goto :goto_c

    .line 6481
    :cond_20
    iput-object v1, p0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mNestedRecyclerView:Ljava/lang/ref/WeakReference;

    :cond_22
    return-void
.end method

.method private read(Z)V
    .registers 5

    .line 2443
    iget v0, p0, Landroidx/recyclerview/widget/RecyclerView;->r8lambdaKUbBm7ckfqTc9QCgukC86fguu4:I

    const/4 v1, 0x1

    if-gtz v0, :cond_24

    .line 2445
    sget-boolean v0, Landroidx/recyclerview/widget/RecyclerView;->AudioAttributesImplApi26Parcelizer:Z

    if-nez v0, :cond_c

    .line 2450
    iput v1, p0, Landroidx/recyclerview/widget/RecyclerView;->r8lambdaKUbBm7ckfqTc9QCgukC86fguu4:I

    goto :goto_24

    .line 2446
    :cond_c
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "stopInterceptRequestLayout was called more times than startInterceptRequestLayout."

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2448
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->write()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_24
    :goto_24
    const/4 v0, 0x0

    if-nez p1, :cond_2d

    .line 2452
    iget-boolean v2, p0, Landroidx/recyclerview/widget/RecyclerView;->onPlay:Z

    if-nez v2, :cond_2d

    .line 2461
    iput-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPrepare:Z

    .line 2463
    :cond_2d
    iget v2, p0, Landroidx/recyclerview/widget/RecyclerView;->r8lambdaKUbBm7ckfqTc9QCgukC86fguu4:I

    if-ne v2, v1, :cond_4c

    if-eqz p1, :cond_46

    .line 2465
    iget-boolean p1, p0, Landroidx/recyclerview/widget/RecyclerView;->onPrepare:Z

    if-eqz p1, :cond_46

    iget-boolean p1, p0, Landroidx/recyclerview/widget/RecyclerView;->onPlay:Z

    if-nez p1, :cond_46

    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->onPlayFromMediaId:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    if-eqz p1, :cond_46

    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatItemReceiver:Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;

    if-eqz p1, :cond_46

    .line 2467
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->onSetRating()V

    .line 2469
    :cond_46
    iget-boolean p1, p0, Landroidx/recyclerview/widget/RecyclerView;->onPlay:Z

    if-nez p1, :cond_4c

    .line 2470
    iput-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPrepare:Z

    .line 2473
    :cond_4c
    iget p1, p0, Landroidx/recyclerview/widget/RecyclerView;->r8lambdaKUbBm7ckfqTc9QCgukC86fguu4:I

    sub-int/2addr p1, v1

    iput p1, p0, Landroidx/recyclerview/widget/RecyclerView;->r8lambdaKUbBm7ckfqTc9QCgukC86fguu4:I

    return-void
.end method

.method private read(Landroid/view/MotionEvent;)Z
    .registers 9

    .line 3716
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->accessensureViewModelStore:Landroid/widget/EdgeEffect;

    const/high16 v1, 0x3f800000    # 1.0f

    const/4 v2, -0x1

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v0, :cond_2a

    invoke-static {v0}, Lo/memberMethods;->write(Landroid/widget/EdgeEffect;)F

    move-result v0

    cmpl-float v0, v0, v4

    if-eqz v0, :cond_2a

    .line 3717
    invoke-virtual {p0, v2}, Landroidx/recyclerview/widget/RecyclerView;->canScrollHorizontally(I)Z

    move-result v0

    if-nez v0, :cond_2a

    .line 3718
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->accessensureViewModelStore:Landroid/widget/EdgeEffect;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v5

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v6

    int-to-float v6, v6

    div-float/2addr v5, v6

    sub-float v5, v1, v5

    invoke-static {v0, v4, v5}, Lo/memberMethods;->read(Landroid/widget/EdgeEffect;FF)F

    move v0, v3

    goto :goto_2b

    :cond_2a
    const/4 v0, 0x0

    .line 3721
    :goto_2b
    iget-object v5, p0, Landroidx/recyclerview/widget/RecyclerView;->addOnMultiWindowModeChangedListener:Landroid/widget/EdgeEffect;

    if-eqz v5, :cond_4d

    invoke-static {v5}, Lo/memberMethods;->write(Landroid/widget/EdgeEffect;)F

    move-result v5

    cmpl-float v5, v5, v4

    if-eqz v5, :cond_4d

    .line 3722
    invoke-virtual {p0, v3}, Landroidx/recyclerview/widget/RecyclerView;->canScrollHorizontally(I)Z

    move-result v5

    if-nez v5, :cond_4d

    .line 3723
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->addOnMultiWindowModeChangedListener:Landroid/widget/EdgeEffect;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v5

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v6

    int-to-float v6, v6

    div-float/2addr v5, v6

    invoke-static {v0, v4, v5}, Lo/memberMethods;->read(Landroid/widget/EdgeEffect;FF)F

    move v0, v3

    .line 3726
    :cond_4d
    iget-object v5, p0, Landroidx/recyclerview/widget/RecyclerView;->getFullyDrawnReporter:Landroid/widget/EdgeEffect;

    if-eqz v5, :cond_6f

    invoke-static {v5}, Lo/memberMethods;->write(Landroid/widget/EdgeEffect;)F

    move-result v5

    cmpl-float v5, v5, v4

    if-eqz v5, :cond_6f

    .line 3727
    invoke-virtual {p0, v2}, Landroidx/recyclerview/widget/RecyclerView;->canScrollVertically(I)Z

    move-result v2

    if-nez v2, :cond_6f

    .line 3728
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->getFullyDrawnReporter:Landroid/widget/EdgeEffect;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v5

    int-to-float v5, v5

    div-float/2addr v2, v5

    invoke-static {v0, v4, v2}, Lo/memberMethods;->read(Landroid/widget/EdgeEffect;FF)F

    move v0, v3

    .line 3731
    :cond_6f
    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView;->onSkipToQueueItem:Landroid/widget/EdgeEffect;

    if-eqz v2, :cond_92

    invoke-static {v2}, Lo/memberMethods;->write(Landroid/widget/EdgeEffect;)F

    move-result v2

    cmpl-float v2, v2, v4

    if-eqz v2, :cond_92

    .line 3732
    invoke-virtual {p0, v3}, Landroidx/recyclerview/widget/RecyclerView;->canScrollVertically(I)Z

    move-result v2

    if-nez v2, :cond_92

    .line 3733
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onSkipToQueueItem:Landroid/widget/EdgeEffect;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result p1

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result p0

    int-to-float p0, p0

    div-float/2addr p1, p0

    sub-float/2addr v1, p1

    invoke-static {v0, v4, v1}, Lo/memberMethods;->read(Landroid/widget/EdgeEffect;FF)F

    return v3

    :cond_92
    return v0
.end method

.method public static setDebugAssertionsEnabled(Z)V
    .registers 1

    .line 403
    sput-boolean p0, Landroidx/recyclerview/widget/RecyclerView;->AudioAttributesImplApi26Parcelizer:Z

    return-void
.end method

.method private setSessionImpl()V
    .registers 2

    const/4 v0, 0x0

    .line 3110
    iput-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onSkipToQueueItem:Landroid/widget/EdgeEffect;

    iput-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->getFullyDrawnReporter:Landroid/widget/EdgeEffect;

    iput-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->addOnMultiWindowModeChangedListener:Landroid/widget/EdgeEffect;

    iput-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->accessensureViewModelStore:Landroid/widget/EdgeEffect;

    return-void
.end method

.method public static setVerboseLoggingEnabled(Z)V
    .registers 1

    .line 416
    sput-boolean p0, Landroidx/recyclerview/widget/RecyclerView;->AudioAttributesImplBaseParcelizer:Z

    return-void
.end method

.method private write(IF)I
    .registers 6

    .line 2241
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v0

    int-to-float v0, v0

    div-float/2addr p2, v0

    int-to-float p1, p1

    .line 2242
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v0

    int-to-float v0, v0

    div-float/2addr p1, v0

    .line 2243
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->getFullyDrawnReporter:Landroid/widget/EdgeEffect;

    const/4 v1, 0x0

    if-eqz v0, :cond_43

    invoke-static {v0}, Lo/memberMethods;->write(Landroid/widget/EdgeEffect;)F

    move-result v0

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_43

    const/4 v0, -0x1

    .line 2244
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->canScrollVertically(I)Z

    move-result v0

    if-eqz v0, :cond_27

    .line 2245
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->getFullyDrawnReporter:Landroid/widget/EdgeEffect;

    invoke-virtual {p1}, Landroid/widget/EdgeEffect;->onRelease()V

    goto :goto_3f

    .line 2247
    :cond_27
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->getFullyDrawnReporter:Landroid/widget/EdgeEffect;

    neg-float p1, p1

    invoke-static {v0, p1, p2}, Lo/memberMethods;->read(Landroid/widget/EdgeEffect;FF)F

    move-result p1

    neg-float p1, p1

    .line 2248
    iget-object p2, p0, Landroidx/recyclerview/widget/RecyclerView;->getFullyDrawnReporter:Landroid/widget/EdgeEffect;

    invoke-static {p2}, Lo/memberMethods;->write(Landroid/widget/EdgeEffect;)F

    move-result p2

    cmpl-float p2, p2, v1

    if-nez p2, :cond_3e

    .line 2249
    iget-object p2, p0, Landroidx/recyclerview/widget/RecyclerView;->getFullyDrawnReporter:Landroid/widget/EdgeEffect;

    invoke-virtual {p2}, Landroid/widget/EdgeEffect;->onRelease()V

    :cond_3e
    move v1, p1

    .line 2252
    :goto_3f
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    goto :goto_78

    .line 2253
    :cond_43
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onSkipToQueueItem:Landroid/widget/EdgeEffect;

    if-eqz v0, :cond_78

    invoke-static {v0}, Lo/memberMethods;->write(Landroid/widget/EdgeEffect;)F

    move-result v0

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_78

    const/4 v0, 0x1

    .line 2254
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->canScrollVertically(I)Z

    move-result v0

    if-eqz v0, :cond_5c

    .line 2255
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->onSkipToQueueItem:Landroid/widget/EdgeEffect;

    invoke-virtual {p1}, Landroid/widget/EdgeEffect;->onRelease()V

    goto :goto_75

    .line 2257
    :cond_5c
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onSkipToQueueItem:Landroid/widget/EdgeEffect;

    const/high16 v2, 0x3f800000    # 1.0f

    sub-float/2addr v2, p2

    invoke-static {v0, p1, v2}, Lo/memberMethods;->read(Landroid/widget/EdgeEffect;FF)F

    move-result p1

    .line 2259
    iget-object p2, p0, Landroidx/recyclerview/widget/RecyclerView;->onSkipToQueueItem:Landroid/widget/EdgeEffect;

    invoke-static {p2}, Lo/memberMethods;->write(Landroid/widget/EdgeEffect;)F

    move-result p2

    cmpl-float p2, p2, v1

    if-nez p2, :cond_74

    .line 2260
    iget-object p2, p0, Landroidx/recyclerview/widget/RecyclerView;->onSkipToQueueItem:Landroid/widget/EdgeEffect;

    invoke-virtual {p2}, Landroid/widget/EdgeEffect;->onRelease()V

    :cond_74
    move v1, p1

    .line 2263
    :goto_75
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 2265
    :cond_78
    :goto_78
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result p0

    int-to-float p0, p0

    mul-float/2addr v1, p0

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result p0

    return p0
.end method

.method private static write(ILandroid/widget/EdgeEffect;Landroid/widget/EdgeEffect;I)I
    .registers 8

    const/high16 v0, 0x3f000000    # 0.5f

    const/4 v1, 0x0

    const/high16 v2, 0x40800000    # 4.0f

    if-lez p0, :cond_29

    if-eqz p1, :cond_29

    .line 2889
    invoke-static {p1}, Lo/memberMethods;->write(Landroid/widget/EdgeEffect;)F

    move-result v3

    cmpl-float v3, v3, v1

    if-eqz v3, :cond_29

    neg-int p2, p0

    int-to-float p2, p2

    mul-float/2addr p2, v2

    int-to-float v1, p3

    div-float/2addr p2, v1

    neg-int p3, p3

    int-to-float p3, p3

    div-float/2addr p3, v2

    .line 2892
    invoke-static {p1, p2, v0}, Lo/memberMethods;->read(Landroid/widget/EdgeEffect;FF)F

    move-result p2

    mul-float/2addr p3, p2

    .line 2891
    invoke-static {p3}, Ljava/lang/Math;->round(F)I

    move-result p2

    if-eq p2, p0, :cond_27

    .line 2894
    invoke-virtual {p1}, Landroid/widget/EdgeEffect;->finish()V

    :cond_27
    sub-int/2addr p0, p2

    return p0

    :cond_29
    if-gez p0, :cond_49

    if-eqz p2, :cond_49

    .line 2898
    invoke-static {p2}, Lo/memberMethods;->write(Landroid/widget/EdgeEffect;)F

    move-result p1

    cmpl-float p1, p1, v1

    if-eqz p1, :cond_49

    int-to-float p1, p0

    int-to-float p3, p3

    mul-float/2addr p1, v2

    div-float/2addr p1, p3

    div-float/2addr p3, v2

    .line 2901
    invoke-static {p2, p1, v0}, Lo/memberMethods;->read(Landroid/widget/EdgeEffect;FF)F

    move-result p1

    mul-float/2addr p3, p1

    .line 2900
    invoke-static {p3}, Ljava/lang/Math;->round(F)I

    move-result p1

    if-eq p1, p0, :cond_48

    .line 2903
    invoke-virtual {p2}, Landroid/widget/EdgeEffect;->finish()V

    :cond_48
    sub-int/2addr p0, p1

    :cond_49
    return p0
.end method

.method private write(J)Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;
    .registers 9

    .line 5501
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatItemReceiver:Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;

    const/4 v1, 0x0

    if-eqz v0, :cond_3f

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;->hasStableIds()Z

    move-result v0

    if-nez v0, :cond_c

    goto :goto_3f

    .line 5504
    :cond_c
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatSearchResultReceiver:Lo/TypesKt;

    invoke-virtual {v0}, Lo/TypesKt;->RemoteActionCompatParcelizer()I

    move-result v0

    const/4 v2, 0x0

    :goto_13
    if-ge v2, v0, :cond_3f

    .line 5507
    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatSearchResultReceiver:Lo/TypesKt;

    invoke-virtual {v3, v2}, Lo/TypesKt;->AudioAttributesCompatParcelizer(I)Landroid/view/View;

    move-result-object v3

    invoke-static {v3}, Landroidx/recyclerview/widget/RecyclerView;->IconCompatParcelizer(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;

    move-result-object v3

    if-eqz v3, :cond_3c

    .line 5508
    invoke-virtual {v3}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->isRemoved()Z

    move-result v4

    if-nez v4, :cond_3c

    invoke-virtual {v3}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->getItemId()J

    move-result-wide v4

    cmp-long v4, v4, p1

    if-nez v4, :cond_3c

    .line 5509
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatSearchResultReceiver:Lo/TypesKt;

    iget-object v4, v3, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->itemView:Landroid/view/View;

    invoke-virtual {v1, v4}, Lo/TypesKt;->IconCompatParcelizer(Landroid/view/View;)Z

    move-result v1

    if-eqz v1, :cond_3b

    move-object v1, v3

    goto :goto_3c

    :cond_3b
    return-object v3

    :cond_3c
    :goto_3c
    add-int/lit8 v2, v2, 0x1

    goto :goto_13

    :cond_3f
    :goto_3f
    return-object v1
.end method

.method private write(Landroid/view/MotionEvent;)V
    .registers 5

    .line 3928
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    move-result v0

    .line 3929
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v1

    iget v2, p0, Landroidx/recyclerview/widget/RecyclerView;->getDefaultViewModelCreationExtras:I

    if-ne v1, v2, :cond_2d

    if-nez v0, :cond_10

    const/4 v0, 0x1

    goto :goto_11

    :cond_10
    const/4 v0, 0x0

    .line 3932
    :goto_11
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v1

    iput v1, p0, Landroidx/recyclerview/widget/RecyclerView;->getDefaultViewModelCreationExtras:I

    .line 3933
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getX(I)F

    move-result v1

    const/high16 v2, 0x3f000000    # 0.5f

    add-float/2addr v1, v2

    float-to-int v1, v1

    iput v1, p0, Landroidx/recyclerview/widget/RecyclerView;->accessaddObserverForBackInvoker:I

    iput v1, p0, Landroidx/recyclerview/widget/RecyclerView;->ResultReceiver:I

    .line 3934
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getY(I)F

    move-result p1

    add-float/2addr p1, v2

    float-to-int p1, p1

    iput p1, p0, Landroidx/recyclerview/widget/RecyclerView;->accessgetReportFullyDrawnExecutorp:I

    iput p1, p0, Landroidx/recyclerview/widget/RecyclerView;->r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM:I

    :cond_2d
    return-void
.end method

.method private write(Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)V
    .registers 4

    .line 4521
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->RatingCompat()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_22

    .line 4522
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView;->onSetCaptioningEnabled:Landroidx/recyclerview/widget/RecyclerView$onFastForward;

    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$onFastForward;->AudioAttributesCompatParcelizer:Landroid/widget/OverScroller;

    .line 4523
    invoke-virtual {p0}, Landroid/widget/OverScroller;->getFinalX()I

    move-result v0

    invoke-virtual {p0}, Landroid/widget/OverScroller;->getCurrX()I

    move-result v1

    sub-int/2addr v0, v1

    iput v0, p1, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->AudioAttributesImplBaseParcelizer:I

    .line 4524
    invoke-virtual {p0}, Landroid/widget/OverScroller;->getFinalY()I

    move-result v0

    invoke-virtual {p0}, Landroid/widget/OverScroller;->getCurrY()I

    move-result p0

    sub-int/2addr v0, p0

    iput v0, p1, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->MediaBrowserCompatMediaItem:I

    return-void

    :cond_22
    const/4 p0, 0x0

    .line 4526
    iput p0, p1, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->AudioAttributesImplBaseParcelizer:I

    .line 4527
    iput p0, p1, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->MediaBrowserCompatMediaItem:I

    return-void
.end method

.method private write(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer$write;Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer$write;ZZ)V
    .registers 8

    const/4 v0, 0x0

    .line 4896
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->setIsRecyclable(Z)V

    if-eqz p5, :cond_9

    .line 4898
    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->IconCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;)V

    :cond_9
    if-eq p1, p2, :cond_1f

    if-eqz p6, :cond_10

    .line 4902
    invoke-direct {p0, p2}, Landroidx/recyclerview/widget/RecyclerView;->IconCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;)V

    .line 4904
    :cond_10
    iput-object p2, p1, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mShadowedHolder:Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;

    .line 4906
    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->IconCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;)V

    .line 4907
    iget-object p5, p0, Landroidx/recyclerview/widget/RecyclerView;->onRemoveQueueItemAt:Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;

    invoke-virtual {p5, p1}, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->AudioAttributesCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;)V

    .line 4908
    invoke-virtual {p2, v0}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->setIsRecyclable(Z)V

    .line 4909
    iput-object p1, p2, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mShadowingHolder:Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;

    .line 4911
    :cond_1f
    iget-object p5, p0, Landroidx/recyclerview/widget/RecyclerView;->onCommand:Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer;

    invoke-virtual {p5, p1, p2, p3, p4}, Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer;->write(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer$write;Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer$write;)Z

    move-result p1

    if-eqz p1, :cond_2a

    .line 4912
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->handleMediaPlayPauseIfPendingOnHandler()V

    :cond_2a
    return-void
.end method

.method static synthetic write(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V
    .registers 4

    .line 217
    invoke-virtual {p0, p1, p2, p3}, Landroidx/recyclerview/widget/RecyclerView;->attachViewToParent(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method private write(IILandroid/view/MotionEvent;I)Z
    .registers 23

    move-object/from16 v8, p0

    move/from16 v9, p1

    move/from16 v10, p2

    move-object/from16 v11, p3

    .line 2145
    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/RecyclerView;->read()V

    .line 2146
    iget-object v0, v8, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatItemReceiver:Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;

    const/4 v12, 0x1

    const/4 v13, 0x0

    if-eqz v0, :cond_2b

    .line 2147
    iget-object v0, v8, Landroidx/recyclerview/widget/RecyclerView;->onRemoveQueueItem:[I

    aput v13, v0, v13

    .line 2148
    aput v13, v0, v12

    .line 2149
    invoke-virtual {v8, v9, v10, v0}, Landroidx/recyclerview/widget/RecyclerView;->AudioAttributesCompatParcelizer(II[I)V

    .line 2150
    iget-object v0, v8, Landroidx/recyclerview/widget/RecyclerView;->onRemoveQueueItem:[I

    aget v1, v0, v13

    .line 2151
    aget v0, v0, v12

    sub-int v2, v9, v1

    sub-int v3, v10, v0

    move v14, v0

    move v15, v1

    move/from16 v16, v2

    move/from16 v17, v3

    goto :goto_31

    :cond_2b
    move v14, v13

    move v15, v14

    move/from16 v16, v15

    move/from16 v17, v16

    .line 2155
    :goto_31
    iget-object v0, v8, Landroidx/recyclerview/widget/RecyclerView;->onPause:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3c

    .line 2156
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->invalidate()V

    .line 2159
    :cond_3c
    iget-object v7, v8, Landroidx/recyclerview/widget/RecyclerView;->onRemoveQueueItem:[I

    aput v13, v7, v13

    .line 2160
    aput v13, v7, v12

    .line 2161
    iget-object v5, v8, Landroidx/recyclerview/widget/RecyclerView;->getActivityResultRegistry:[I

    move-object/from16 v0, p0

    move v1, v15

    move v2, v14

    move/from16 v3, v16

    move/from16 v4, v17

    move/from16 v6, p4

    invoke-virtual/range {v0 .. v7}, Landroidx/recyclerview/widget/RecyclerView;->write(IIII[II[I)V

    .line 2163
    iget-object v0, v8, Landroidx/recyclerview/widget/RecyclerView;->onRemoveQueueItem:[I

    aget v1, v0, v13

    .line 2164
    aget v0, v0, v12

    if-nez v1, :cond_5d

    if-nez v0, :cond_5d

    move v2, v13

    goto :goto_5e

    :cond_5d
    move v2, v12

    .line 2168
    :goto_5e
    iget v3, v8, Landroidx/recyclerview/widget/RecyclerView;->accessaddObserverForBackInvoker:I

    iget-object v4, v8, Landroidx/recyclerview/widget/RecyclerView;->getActivityResultRegistry:[I

    aget v5, v4, v13

    sub-int/2addr v3, v5

    iput v3, v8, Landroidx/recyclerview/widget/RecyclerView;->accessaddObserverForBackInvoker:I

    .line 2169
    iget v3, v8, Landroidx/recyclerview/widget/RecyclerView;->accessgetReportFullyDrawnExecutorp:I

    aget v4, v4, v12

    sub-int/2addr v3, v4

    iput v3, v8, Landroidx/recyclerview/widget/RecyclerView;->accessgetReportFullyDrawnExecutorp:I

    .line 2170
    iget-object v3, v8, Landroidx/recyclerview/widget/RecyclerView;->ensureViewModelStore:[I

    aget v6, v3, v13

    add-int/2addr v6, v5

    aput v6, v3, v13

    .line 2171
    aget v5, v3, v12

    add-int/2addr v5, v4

    aput v5, v3, v12

    .line 2173
    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/RecyclerView;->getOverScrollMode()I

    move-result v3

    const/4 v4, 0x2

    if-eq v3, v4, :cond_9f

    if-eqz v11, :cond_9c

    const/16 v3, 0x2002

    .line 2174
    invoke-static {v11, v3}, Lo/emptyList;->IconCompatParcelizer(Landroid/view/MotionEvent;I)Z

    move-result v3

    if-nez v3, :cond_9c

    .line 2175
    invoke-virtual/range {p3 .. p3}, Landroid/view/MotionEvent;->getX()F

    move-result v3

    sub-int v1, v16, v1

    int-to-float v1, v1

    invoke-virtual/range {p3 .. p3}, Landroid/view/MotionEvent;->getY()F

    move-result v4

    sub-int v0, v17, v0

    int-to-float v0, v0

    invoke-direct {v8, v3, v1, v4, v0}, Landroidx/recyclerview/widget/RecyclerView;->RemoteActionCompatParcelizer(FFFF)V

    .line 2177
    :cond_9c
    invoke-virtual/range {p0 .. p2}, Landroidx/recyclerview/widget/RecyclerView;->RemoteActionCompatParcelizer(II)V

    :cond_9f
    if-nez v15, :cond_a3

    if-eqz v14, :cond_a6

    .line 2180
    :cond_a3
    invoke-virtual {v8, v15, v14}, Landroidx/recyclerview/widget/RecyclerView;->write(II)V

    .line 2182
    :cond_a6
    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/RecyclerView;->awakenScrollBars()Z

    move-result v0

    if-nez v0, :cond_af

    .line 2183
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->invalidate()V

    :cond_af
    if-nez v2, :cond_b6

    if-nez v15, :cond_b6

    if-nez v14, :cond_b6

    return v13

    :cond_b6
    return v12
.end method

.method private write(Landroid/widget/EdgeEffect;II)Z
    .registers 5

    const/4 v0, 0x1

    if-lez p2, :cond_4

    return v0

    .line 2841
    :cond_4
    invoke-static {p1}, Lo/memberMethods;->write(Landroid/widget/EdgeEffect;)F

    move-result p1

    int-to-float p3, p3

    neg-int p2, p2

    .line 2844
    invoke-direct {p0, p2}, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatMediaItem(I)F

    move-result p0

    mul-float/2addr p1, p3

    cmpg-float p0, p0, p1

    if-gez p0, :cond_14

    return v0

    :cond_14
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer()Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplBaseParcelizer;
    .registers 4

    .line 1749
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->onSkipToQueueItem()I

    move-result v0

    if-lez v0, :cond_10

    .line 1754
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPause:Ljava/util/ArrayList;

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplBaseParcelizer;

    return-object p0

    .line 1751
    :cond_10
    new-instance p0, Ljava/lang/IndexOutOfBoundsException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "0 is an invalid index for size "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public final AudioAttributesCompatParcelizer(I)V
    .registers 5

    .line 5593
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatSearchResultReceiver:Lo/TypesKt;

    invoke-virtual {v0}, Lo/TypesKt;->read()I

    move-result v0

    const/4 v1, 0x0

    :goto_7
    if-ge v1, v0, :cond_15

    .line 5595
    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatSearchResultReceiver:Lo/TypesKt;

    invoke-virtual {v2, v1}, Lo/TypesKt;->read(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2, p1}, Landroid/view/View;->offsetLeftAndRight(I)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_7

    :cond_15
    return-void
.end method

.method final AudioAttributesCompatParcelizer(II)V
    .registers 5

    if-gez p1, :cond_14

    .line 3028
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->onSetRepeatMode()V

    .line 3029
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->accessensureViewModelStore:Landroid/widget/EdgeEffect;

    invoke-virtual {v0}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v0

    if-eqz v0, :cond_26

    .line 3030
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->accessensureViewModelStore:Landroid/widget/EdgeEffect;

    neg-int v1, p1

    invoke-virtual {v0, v1}, Landroid/widget/EdgeEffect;->onAbsorb(I)V

    goto :goto_26

    :cond_14
    if-lez p1, :cond_26

    .line 3033
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->onStop()V

    .line 3034
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->addOnMultiWindowModeChangedListener:Landroid/widget/EdgeEffect;

    invoke-virtual {v0}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v0

    if-eqz v0, :cond_26

    .line 3035
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->addOnMultiWindowModeChangedListener:Landroid/widget/EdgeEffect;

    invoke-virtual {v0, p1}, Landroid/widget/EdgeEffect;->onAbsorb(I)V

    :cond_26
    :goto_26
    if-gez p2, :cond_3a

    .line 3040
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->onSkipToNext()V

    .line 3041
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->getFullyDrawnReporter:Landroid/widget/EdgeEffect;

    invoke-virtual {v0}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v0

    if-eqz v0, :cond_4c

    .line 3042
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->getFullyDrawnReporter:Landroid/widget/EdgeEffect;

    neg-int v1, p2

    invoke-virtual {v0, v1}, Landroid/widget/EdgeEffect;->onAbsorb(I)V

    goto :goto_4c

    :cond_3a
    if-lez p2, :cond_4c

    .line 3045
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->onSetShuffleMode()V

    .line 3046
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onSkipToQueueItem:Landroid/widget/EdgeEffect;

    invoke-virtual {v0}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v0

    if-eqz v0, :cond_4c

    .line 3047
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onSkipToQueueItem:Landroid/widget/EdgeEffect;

    invoke-virtual {v0, p2}, Landroid/widget/EdgeEffect;->onAbsorb(I)V

    :cond_4c
    :goto_4c
    if-nez p1, :cond_51

    if-nez p2, :cond_51

    return-void

    .line 3052
    :cond_51
    invoke-static {p0}, Lo/InvalidTypeIdException;->onRemoveQueueItem(Landroid/view/View;)V

    return-void
.end method

.method final AudioAttributesCompatParcelizer(II[I)V
    .registers 8

    .line 2038
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw()V

    .line 2039
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->MediaMetadataCompat()V

    .line 2041
    const-string v0, "RV Scroll"

    invoke-static {v0}, Lo/constructDelegatingKeyDeserializer;->read(Ljava/lang/String;)V

    .line 2042
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPrepareFromUri:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    invoke-direct {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->write(Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)V

    const/4 v0, 0x0

    if-eqz p1, :cond_1e

    .line 2047
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->onPlayFromMediaId:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView;->onRemoveQueueItemAt:Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;

    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView;->onPrepareFromUri:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    invoke-virtual {v1, p1, v2, v3}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->read(ILandroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)I

    move-result p1

    goto :goto_1f

    :cond_1e
    move p1, v0

    :goto_1f
    if-eqz p2, :cond_2c

    .line 2050
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->onPlayFromMediaId:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView;->onRemoveQueueItemAt:Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;

    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView;->onPrepareFromUri:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    invoke-virtual {v1, p2, v2, v3}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->RemoteActionCompatParcelizer(ILandroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)I

    move-result p2

    goto :goto_2d

    :cond_2c
    move p2, v0

    .line 2053
    :goto_2d
    invoke-static {}, Lo/constructDelegatingKeyDeserializer;->RemoteActionCompatParcelizer()V

    .line 2054
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->ParcelableVolumeInfo()V

    .line 2056
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->MediaSessionCompatQueueItem()V

    .line 2057
    invoke-direct {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->read(Z)V

    if-eqz p3, :cond_40

    .line 2060
    aput p1, p3, v0

    const/4 p0, 0x1

    .line 2061
    aput p2, p3, p0

    :cond_40
    return-void
.end method

.method public final AudioAttributesCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplBaseParcelizer;)V
    .registers 2

    .line 1737
    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->read(Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplBaseParcelizer;)V

    return-void
.end method

.method public final AudioAttributesCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatMediaItem;)V
    .registers 2

    .line 3510
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView;->menuHostHelperlambda0:Ljava/util/ArrayList;

    invoke-virtual {p0, p1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method final AudioAttributesCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer$write;Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer$write;)V
    .registers 5

    .line 4886
    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->IconCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;)V

    const/4 v0, 0x0

    .line 4887
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->setIsRecyclable(Z)V

    .line 4888
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onCommand:Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer;

    invoke-virtual {v0, p1, p2, p3}, Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer;->RemoteActionCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer$write;Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer$write;)Z

    move-result p1

    if-eqz p1, :cond_12

    .line 4889
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->handleMediaPlayPauseIfPendingOnHandler()V

    :cond_12
    return-void
.end method

.method final AudioAttributesImplApi21Parcelizer(Landroid/view/View;)Landroid/graphics/Rect;
    .registers 10

    .line 5620
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    .line 5621
    iget-boolean v1, v0, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->AudioAttributesCompatParcelizer:Z

    if-nez v1, :cond_d

    .line 5622
    iget-object p0, v0, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->RemoteActionCompatParcelizer:Landroid/graphics/Rect;

    return-object p0

    .line 5625
    :cond_d
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->onPrepareFromUri:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->write()Z

    move-result v1

    if-eqz v1, :cond_24

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->P_()Z

    move-result v1

    if-nez v1, :cond_21

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->R_()Z

    move-result v1

    if-eqz v1, :cond_24

    .line 5627
    :cond_21
    iget-object p0, v0, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->RemoteActionCompatParcelizer:Landroid/graphics/Rect;

    return-object p0

    .line 5629
    :cond_24
    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->RemoteActionCompatParcelizer:Landroid/graphics/Rect;

    const/4 v2, 0x0

    .line 5630
    invoke-virtual {v1, v2, v2, v2, v2}, Landroid/graphics/Rect;->set(IIII)V

    .line 5631
    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView;->onPause:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/AbstractCollection;->size()I

    move-result v3

    move v4, v2

    :goto_31
    if-ge v4, v3, :cond_6e

    .line 5633
    iget-object v5, p0, Landroidx/recyclerview/widget/RecyclerView;->onSetPlaybackSpeed:Landroid/graphics/Rect;

    invoke-virtual {v5, v2, v2, v2, v2}, Landroid/graphics/Rect;->set(IIII)V

    .line 5634
    iget-object v5, p0, Landroidx/recyclerview/widget/RecyclerView;->onPause:Ljava/util/ArrayList;

    invoke-virtual {v5, v4}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplBaseParcelizer;

    iget-object v6, p0, Landroidx/recyclerview/widget/RecyclerView;->onSetPlaybackSpeed:Landroid/graphics/Rect;

    iget-object v7, p0, Landroidx/recyclerview/widget/RecyclerView;->onPrepareFromUri:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    invoke-virtual {v5, v6, p1, p0, v7}, Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplBaseParcelizer;->IconCompatParcelizer(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)V

    .line 5635
    iget v5, v1, Landroid/graphics/Rect;->left:I

    iget-object v6, p0, Landroidx/recyclerview/widget/RecyclerView;->onSetPlaybackSpeed:Landroid/graphics/Rect;

    iget v6, v6, Landroid/graphics/Rect;->left:I

    add-int/2addr v5, v6

    iput v5, v1, Landroid/graphics/Rect;->left:I

    .line 5636
    iget v5, v1, Landroid/graphics/Rect;->top:I

    iget-object v6, p0, Landroidx/recyclerview/widget/RecyclerView;->onSetPlaybackSpeed:Landroid/graphics/Rect;

    iget v6, v6, Landroid/graphics/Rect;->top:I

    add-int/2addr v5, v6

    iput v5, v1, Landroid/graphics/Rect;->top:I

    .line 5637
    iget v5, v1, Landroid/graphics/Rect;->right:I

    iget-object v6, p0, Landroidx/recyclerview/widget/RecyclerView;->onSetPlaybackSpeed:Landroid/graphics/Rect;

    iget v6, v6, Landroid/graphics/Rect;->right:I

    add-int/2addr v5, v6

    iput v5, v1, Landroid/graphics/Rect;->right:I

    .line 5638
    iget v5, v1, Landroid/graphics/Rect;->bottom:I

    iget-object v6, p0, Landroidx/recyclerview/widget/RecyclerView;->onSetPlaybackSpeed:Landroid/graphics/Rect;

    iget v6, v6, Landroid/graphics/Rect;->bottom:I

    add-int/2addr v5, v6

    iput v5, v1, Landroid/graphics/Rect;->bottom:I

    add-int/lit8 v4, v4, 0x1

    goto :goto_31

    .line 5640
    :cond_6e
    iput-boolean v2, v0, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->AudioAttributesCompatParcelizer:Z

    return-object v1
.end method

.method public final AudioAttributesImplApi21Parcelizer()Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;
    .registers 1

    .line 1615
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPlayFromMediaId:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    return-object p0
.end method

.method public final AudioAttributesImplApi21Parcelizer(I)V
    .registers 3

    .line 1881
    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPlay:Z

    if-eqz v0, :cond_5

    return-void

    .line 1884
    :cond_5
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->ResultReceiver()V

    .line 1885
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPlayFromMediaId:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    if-nez v0, :cond_d

    return-void

    .line 1890
    :cond_d
    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->read(I)V

    .line 1891
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->awakenScrollBars()Z

    return-void
.end method

.method public final AudioAttributesImplApi26Parcelizer()I
    .registers 1

    .line 2935
    iget p0, p0, Landroidx/recyclerview/widget/RecyclerView;->addObserverForBackInvokerlambda7:I

    return p0
.end method

.method public final AudioAttributesImplApi26Parcelizer(I)V
    .registers 5

    .line 5555
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatSearchResultReceiver:Lo/TypesKt;

    invoke-virtual {v0}, Lo/TypesKt;->read()I

    move-result v0

    const/4 v1, 0x0

    :goto_7
    if-ge v1, v0, :cond_15

    .line 5557
    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatSearchResultReceiver:Lo/TypesKt;

    invoke-virtual {v2, v1}, Lo/TypesKt;->read(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2, p1}, Landroid/view/View;->offsetTopAndBottom(I)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_7

    :cond_15
    return-void
.end method

.method public final AudioAttributesImplApi26Parcelizer(II)V
    .registers 3

    .line 2613
    invoke-direct {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatCustomActionResultReceiver(II)V

    return-void
.end method

.method public AudioAttributesImplApi26Parcelizer(Landroid/view/View;)V
    .registers 2

    return-void
.end method

.method public final AudioAttributesImplBaseParcelizer()Landroidx/recyclerview/widget/RecyclerView$MediaMetadataCompat;
    .registers 1

    .line 1628
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView;->onRemoveQueueItemAt:Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->RemoteActionCompatParcelizer()Landroidx/recyclerview/widget/RecyclerView$MediaMetadataCompat;

    move-result-object p0

    return-object p0
.end method

.method public final AudioAttributesImplBaseParcelizer(I)V
    .registers 3

    .line 1922
    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPlay:Z

    if-eqz v0, :cond_5

    return-void

    .line 1925
    :cond_5
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPlayFromMediaId:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    if-nez v0, :cond_a

    return-void

    .line 1930
    :cond_a
    invoke-virtual {v0, p0, p1}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->AudioAttributesCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView;I)V

    return-void
.end method

.method final AudioAttributesImplBaseParcelizer(II)V
    .registers 12

    .line 5080
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatSearchResultReceiver:Lo/TypesKt;

    invoke-virtual {v0}, Lo/TypesKt;->RemoteActionCompatParcelizer()I

    move-result v0

    const/4 v1, 0x1

    if-ge p1, p2, :cond_d

    const/4 v2, -0x1

    move v3, p1

    move v4, p2

    goto :goto_10

    :cond_d
    move v4, p1

    move v3, p2

    move v2, v1

    :goto_10
    const/4 v5, 0x0

    move v6, v5

    :goto_12
    if-ge v6, v0, :cond_43

    .line 5093
    iget-object v7, p0, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatSearchResultReceiver:Lo/TypesKt;

    invoke-virtual {v7, v6}, Lo/TypesKt;->AudioAttributesCompatParcelizer(I)Landroid/view/View;

    move-result-object v7

    invoke-static {v7}, Landroidx/recyclerview/widget/RecyclerView;->IconCompatParcelizer(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;

    move-result-object v7

    if-eqz v7, :cond_40

    .line 5094
    iget v8, v7, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mPosition:I

    if-lt v8, v3, :cond_40

    iget v8, v7, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mPosition:I

    if-gt v8, v4, :cond_40

    .line 5097
    sget-boolean v8, Landroidx/recyclerview/widget/RecyclerView;->AudioAttributesImplBaseParcelizer:Z

    if-eqz v8, :cond_2f

    .line 5098
    invoke-static {v7}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 5101
    :cond_2f
    iget v8, v7, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mPosition:I

    if-ne v8, p1, :cond_39

    sub-int v8, p2, p1

    .line 5102
    invoke-virtual {v7, v8, v5}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->offsetPosition(IZ)V

    goto :goto_3c

    .line 5104
    :cond_39
    invoke-virtual {v7, v2, v5}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->offsetPosition(IZ)V

    .line 5107
    :goto_3c
    iget-object v7, p0, Landroidx/recyclerview/widget/RecyclerView;->onPrepareFromUri:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    iput-boolean v1, v7, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->RatingCompat:Z

    :cond_40
    add-int/lit8 v6, v6, 0x1

    goto :goto_12

    .line 5109
    :cond_43
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onRemoveQueueItemAt:Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;

    invoke-virtual {v0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->IconCompatParcelizer(II)V

    .line 5110
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public final IconCompatParcelizer()Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;
    .registers 1

    .line 1332
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatItemReceiver:Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;

    return-object p0
.end method

.method public final IconCompatParcelizer(I)Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;
    .registers 3

    const/4 v0, 0x0

    .line 5417
    invoke-virtual {p0, p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->write(IZ)Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;

    move-result-object p0

    return-object p0
.end method

.method final IconCompatParcelizer(II)V
    .registers 6

    .line 4092
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v1

    .line 4093
    invoke-static {p0}, Lo/InvalidTypeIdException;->MediaBrowserCompatSearchResultReceiver(Landroid/view/View;)I

    move-result v2

    add-int/2addr v0, v1

    .line 4091
    invoke-static {p1, v0, v2}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->a_(III)I

    move-result p1

    .line 4095
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v1

    .line 4096
    invoke-static {p0}, Lo/InvalidTypeIdException;->RatingCompat(Landroid/view/View;)I

    move-result v2

    add-int/2addr v0, v1

    .line 4094
    invoke-static {p2, v0, v2}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->a_(III)I

    move-result p2

    .line 4098
    invoke-virtual {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->setMeasuredDimension(II)V

    return-void
.end method

.method final IconCompatParcelizer(IILjava/lang/Object;)V
    .registers 10

    .line 5167
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatSearchResultReceiver:Lo/TypesKt;

    invoke-virtual {v0}, Lo/TypesKt;->RemoteActionCompatParcelizer()I

    move-result v0

    const/4 v1, 0x0

    :goto_7
    if-ge v1, v0, :cond_38

    .line 5171
    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatSearchResultReceiver:Lo/TypesKt;

    invoke-virtual {v2, v1}, Lo/TypesKt;->AudioAttributesCompatParcelizer(I)Landroid/view/View;

    move-result-object v2

    .line 5172
    invoke-static {v2}, Landroidx/recyclerview/widget/RecyclerView;->IconCompatParcelizer(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;

    move-result-object v3

    if-eqz v3, :cond_35

    .line 5173
    invoke-virtual {v3}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->shouldIgnore()Z

    move-result v4

    if-nez v4, :cond_35

    .line 5176
    iget v4, v3, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mPosition:I

    if-lt v4, p1, :cond_35

    iget v4, v3, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mPosition:I

    add-int v5, p1, p2

    if-ge v4, v5, :cond_35

    const/4 v4, 0x2

    .line 5179
    invoke-virtual {v3, v4}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->addFlags(I)V

    .line 5180
    invoke-virtual {v3, p3}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->addChangePayload(Ljava/lang/Object;)V

    .line 5182
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    check-cast v2, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    const/4 v3, 0x1

    iput-boolean v3, v2, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->AudioAttributesCompatParcelizer:Z

    :cond_35
    add-int/lit8 v1, v1, 0x1

    goto :goto_7

    .line 5185
    :cond_38
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView;->onRemoveQueueItemAt:Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;

    invoke-virtual {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->RemoteActionCompatParcelizer(II)V

    return-void
.end method

.method public IconCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;Z)V
    .registers 4

    const/4 v0, 0x0

    .line 1248
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutFrozen(Z)V

    const/4 v0, 0x1

    .line 1249
    invoke-direct {p0, p1, v0, p2}, Landroidx/recyclerview/widget/RecyclerView;->read(Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;ZZ)V

    .line 1250
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->IconCompatParcelizer(Z)V

    .line 1251
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method final IconCompatParcelizer(Z)V
    .registers 3

    .line 5208
    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->PlaybackStateCompat:Z

    or-int/2addr p1, v0

    iput-boolean p1, p0, Landroidx/recyclerview/widget/RecyclerView;->PlaybackStateCompat:Z

    const/4 p1, 0x1

    .line 5209
    iput-boolean p1, p0, Landroidx/recyclerview/widget/RecyclerView;->RatingCompat:Z

    .line 5210
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->PlaybackStateCompat()V

    return-void
.end method

.method public final MediaBrowserCompatCustomActionResultReceiver()Landroidx/recyclerview/widget/RecyclerView$RatingCompat;
    .registers 1

    .line 1509
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView;->addMenuProvider:Landroidx/recyclerview/widget/RecyclerView$RatingCompat;

    return-object p0
.end method

.method public final MediaBrowserCompatCustomActionResultReceiver(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;
    .registers 5

    .line 5283
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eqz v0, :cond_25

    if-ne v0, p0, :cond_9

    goto :goto_25

    .line 5285
    :cond_9
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "View "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " is not a direct child of "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 5288
    :cond_25
    :goto_25
    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->IconCompatParcelizer(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;

    move-result-object p0

    return-object p0
.end method

.method public final MediaBrowserCompatCustomActionResultReceiver(I)V
    .registers 2

    .line 12457
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->onPause()Lo/rootObjectScope;

    move-result-object p0

    invoke-virtual {p0, p1}, Lo/rootObjectScope;->AudioAttributesCompatParcelizer(I)V

    return-void
.end method

.method final MediaBrowserCompatItemReceiver(I)V
    .registers 3

    .line 1679
    iget v0, p0, Landroidx/recyclerview/widget/RecyclerView;->addOnTrimMemoryListener:I

    if-ne p1, v0, :cond_5

    return-void

    .line 1686
    :cond_5
    iput p1, p0, Landroidx/recyclerview/widget/RecyclerView;->addOnTrimMemoryListener:I

    const/4 v0, 0x2

    if-eq p1, v0, :cond_d

    .line 1688
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->onRewind()V

    .line 1690
    :cond_d
    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->MediaMetadataCompat(I)V

    return-void
.end method

.method public final MediaBrowserCompatMediaItem()Z
    .registers 1

    .line 4190
    iget p0, p0, Landroidx/recyclerview/widget/RecyclerView;->_init_lambda4:I

    if-lez p0, :cond_6

    const/4 p0, 0x1

    return p0

    :cond_6
    const/4 p0, 0x0

    return p0
.end method

.method final MediaBrowserCompatMediaItem(Landroid/view/View;)Z
    .registers 5

    .line 1592
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw()V

    .line 1593
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatSearchResultReceiver:Lo/TypesKt;

    invoke-virtual {v0, p1}, Lo/TypesKt;->AudioAttributesImplApi26Parcelizer(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_23

    .line 1595
    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->IconCompatParcelizer(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;

    move-result-object v1

    .line 1596
    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView;->onRemoveQueueItemAt:Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;

    invoke-virtual {v2, v1}, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->AudioAttributesCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;)V

    .line 1597
    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView;->onRemoveQueueItemAt:Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;

    invoke-virtual {v2, v1}, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->read(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;)V

    .line 1598
    sget-boolean v1, Landroidx/recyclerview/widget/RecyclerView;->AudioAttributesImplBaseParcelizer:Z

    if-eqz v1, :cond_23

    .line 1599
    invoke-static {p1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    :cond_23
    xor-int/lit8 p1, v0, 0x1

    .line 1603
    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->read(Z)V

    return v0
.end method

.method public MediaBrowserCompatSearchResultReceiver(Landroid/view/View;)V
    .registers 2

    return-void
.end method

.method final MediaBrowserCompatSearchResultReceiver()Z
    .registers 1

    .line 4156
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView;->setSessionImpl:Landroid/view/accessibility/AccessibilityManager;

    if-eqz p0, :cond_c

    invoke-virtual {p0}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    move-result p0

    if-eqz p0, :cond_c

    const/4 p0, 0x1

    return p0

    :cond_c
    const/4 p0, 0x0

    return p0
.end method

.method public final MediaDescriptionCompat()Z
    .registers 2

    .line 5758
    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onCustomAction:Z

    if-eqz v0, :cond_12

    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->RatingCompat:Z

    if-nez v0, :cond_12

    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView;->MediaMetadataCompat:Lo/RegexDeserializer;

    .line 5759
    invoke-virtual {p0}, Lo/RegexDeserializer;->read()Z

    move-result p0

    if-nez p0, :cond_12

    const/4 p0, 0x0

    return p0

    :cond_12
    const/4 p0, 0x1

    return p0
.end method

.method public final MediaMetadataCompat()V
    .registers 2

    .line 4133
    iget v0, p0, Landroidx/recyclerview/widget/RecyclerView;->_init_lambda4:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Landroidx/recyclerview/widget/RecyclerView;->_init_lambda4:I

    return-void
.end method

.method public final RatingCompat()I
    .registers 1

    .line 1675
    iget p0, p0, Landroidx/recyclerview/widget/RecyclerView;->addOnTrimMemoryListener:I

    return p0
.end method

.method final RemoteActionCompatParcelizer(I)I
    .registers 4

    .line 2858
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->accessensureViewModelStore:Landroid/widget/EdgeEffect;

    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->addOnMultiWindowModeChangedListener:Landroid/widget/EdgeEffect;

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result p0

    invoke-static {p1, v0, v1, p0}, Landroidx/recyclerview/widget/RecyclerView;->write(ILandroid/widget/EdgeEffect;Landroid/widget/EdgeEffect;I)I

    move-result p0

    return p0
.end method

.method final RemoteActionCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;)I
    .registers 3

    const/16 v0, 0x20c

    .line 12401
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->hasAnyOfTheFlags(I)Z

    move-result v0

    if-nez v0, :cond_17

    .line 12403
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->isBound()Z

    move-result v0

    if-eqz v0, :cond_17

    .line 12406
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView;->MediaMetadataCompat:Lo/RegexDeserializer;

    iget p1, p1, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mPosition:I

    invoke-virtual {p0, p1}, Lo/RegexDeserializer;->IconCompatParcelizer(I)I

    move-result p0

    return p0

    :cond_17
    const/4 p0, -0x1

    return p0
.end method

.method public final RemoteActionCompatParcelizer()Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer;
    .registers 1

    .line 4241
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView;->onCommand:Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer;

    return-object p0
.end method

.method final RemoteActionCompatParcelizer(II)V
    .registers 5

    .line 3005
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->accessensureViewModelStore:Landroid/widget/EdgeEffect;

    if-eqz v0, :cond_18

    invoke-virtual {v0}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v0

    if-nez v0, :cond_18

    if-lez p1, :cond_18

    .line 3006
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->accessensureViewModelStore:Landroid/widget/EdgeEffect;

    invoke-virtual {v0}, Landroid/widget/EdgeEffect;->onRelease()V

    .line 3007
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->accessensureViewModelStore:Landroid/widget/EdgeEffect;

    invoke-virtual {v0}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v0

    goto :goto_19

    :cond_18
    const/4 v0, 0x0

    .line 3009
    :goto_19
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->addOnMultiWindowModeChangedListener:Landroid/widget/EdgeEffect;

    if-eqz v1, :cond_31

    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v1

    if-nez v1, :cond_31

    if-gez p1, :cond_31

    .line 3010
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->addOnMultiWindowModeChangedListener:Landroid/widget/EdgeEffect;

    invoke-virtual {p1}, Landroid/widget/EdgeEffect;->onRelease()V

    .line 3011
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->addOnMultiWindowModeChangedListener:Landroid/widget/EdgeEffect;

    invoke-virtual {p1}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result p1

    or-int/2addr v0, p1

    .line 3013
    :cond_31
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->getFullyDrawnReporter:Landroid/widget/EdgeEffect;

    if-eqz p1, :cond_49

    invoke-virtual {p1}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result p1

    if-nez p1, :cond_49

    if-lez p2, :cond_49

    .line 3014
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->getFullyDrawnReporter:Landroid/widget/EdgeEffect;

    invoke-virtual {p1}, Landroid/widget/EdgeEffect;->onRelease()V

    .line 3015
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->getFullyDrawnReporter:Landroid/widget/EdgeEffect;

    invoke-virtual {p1}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result p1

    or-int/2addr v0, p1

    .line 3017
    :cond_49
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->onSkipToQueueItem:Landroid/widget/EdgeEffect;

    if-eqz p1, :cond_61

    invoke-virtual {p1}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result p1

    if-nez p1, :cond_61

    if-gez p2, :cond_61

    .line 3018
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->onSkipToQueueItem:Landroid/widget/EdgeEffect;

    invoke-virtual {p1}, Landroid/widget/EdgeEffect;->onRelease()V

    .line 3019
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->onSkipToQueueItem:Landroid/widget/EdgeEffect;

    invoke-virtual {p1}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result p1

    or-int/2addr v0, p1

    :cond_61
    if-eqz v0, :cond_66

    .line 3022
    invoke-static {p0}, Lo/InvalidTypeIdException;->onRemoveQueueItem(Landroid/view/View;)V

    :cond_66
    return-void
.end method

.method final RemoteActionCompatParcelizer(Landroid/view/View;)V
    .registers 4

    .line 8359
    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->IconCompatParcelizer(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;

    move-result-object v0

    .line 8360
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatSearchResultReceiver(Landroid/view/View;)V

    .line 8361
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatItemReceiver:Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;

    if-eqz v1, :cond_10

    if-eqz v0, :cond_10

    .line 8362
    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;->onViewDetachedFromWindow(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;)V

    .line 8364
    :cond_10
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->getOnBackPressedDispatcherannotations:Ljava/util/List;

    if-eqz v0, :cond_2a

    .line 8365
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_1a
    if-ltz v0, :cond_2a

    .line 8367
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->getOnBackPressedDispatcherannotations:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi21Parcelizer;

    invoke-interface {v1, p1}, Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi21Parcelizer;->read(Landroid/view/View;)V

    add-int/lit8 v0, v0, -0x1

    goto :goto_1a

    :cond_2a
    return-void
.end method

.method public final RemoteActionCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplBaseParcelizer;)V
    .registers 4

    .line 1790
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPlayFromMediaId:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    if-eqz v0, :cond_9

    .line 1791
    const-string v1, "Cannot remove item decoration during a scroll  or layout"

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->IconCompatParcelizer(Ljava/lang/String;)V

    .line 1794
    :cond_9
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPause:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/AbstractCollection;->remove(Ljava/lang/Object;)Z

    .line 1795
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->onPause:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_23

    .line 1796
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->getOverScrollMode()I

    move-result p1

    const/4 v0, 0x2

    if-ne p1, v0, :cond_1f

    const/4 p1, 0x1

    goto :goto_20

    :cond_1f
    const/4 p1, 0x0

    :goto_20
    invoke-virtual {p0, p1}, Landroid/view/View;->setWillNotDraw(Z)V

    .line 1798
    :cond_23
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->MediaSessionCompatToken()V

    .line 1799
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public final RemoteActionCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatSearchResultReceiver;)V
    .registers 3

    .line 1845
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->addOnContextAvailableListener:Ljava/util/List;

    if-nez v0, :cond_b

    .line 1846
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->addOnContextAvailableListener:Ljava/util/List;

    .line 1848
    :cond_b
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView;->addOnContextAvailableListener:Ljava/util/List;

    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method final RemoteActionCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer$write;Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer$write;)V
    .registers 5

    const/4 v0, 0x0

    .line 4878
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->setIsRecyclable(Z)V

    .line 4879
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onCommand:Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer;

    invoke-virtual {v0, p1, p2, p3}, Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer;->IconCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer$write;Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer$write;)Z

    move-result p1

    if-eqz p1, :cond_f

    .line 4880
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->handleMediaPlayPauseIfPendingOnHandler()V

    :cond_f
    return-void
.end method

.method public final RemoteActionCompatParcelizer(Z)V
    .registers 4

    .line 4141
    iget v0, p0, Landroidx/recyclerview/widget/RecyclerView;->_init_lambda4:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Landroidx/recyclerview/widget/RecyclerView;->_init_lambda4:I

    if-gtz v0, :cond_32

    .line 4143
    sget-boolean v1, Landroidx/recyclerview/widget/RecyclerView;->AudioAttributesImplApi26Parcelizer:Z

    if-eqz v1, :cond_27

    if-ltz v0, :cond_f

    goto :goto_27

    .line 4144
    :cond_f
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "layout or scroll counter cannot go below zero.Some calls are not matching"

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 4145
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->write()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_27
    :goto_27
    const/4 v0, 0x0

    .line 4147
    iput v0, p0, Landroidx/recyclerview/widget/RecyclerView;->_init_lambda4:I

    if-eqz p1, :cond_32

    .line 4149
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->onCustomAction()V

    .line 4150
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->onSetPlaybackSpeed()V

    :cond_32
    return-void
.end method

.method public addFocusables(Ljava/util/ArrayList;II)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Landroid/view/View;",
            ">;II)V"
        }
    .end annotation

    .line 3369
    invoke-super {p0, p1, p2, p3}, Landroid/view/ViewGroup;->addFocusables(Ljava/util/ArrayList;II)V

    return-void
.end method

.method protected checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z
    .registers 3

    .line 5015
    instance-of v0, p1, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    if-eqz v0, :cond_10

    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPlayFromMediaId:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    check-cast p1, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->RemoteActionCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$LayoutParams;)Z

    move-result p0

    if-eqz p0, :cond_10

    const/4 p0, 0x1

    return p0

    :cond_10
    const/4 p0, 0x0

    return p0
.end method

.method public computeHorizontalScrollExtent()I
    .registers 3

    .line 2313
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPlayFromMediaId:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    const/4 v1, 0x0

    if-nez v0, :cond_6

    return v1

    .line 2316
    :cond_6
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->AudioAttributesImplApi26Parcelizer()Z

    move-result v0

    if-eqz v0, :cond_15

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPlayFromMediaId:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPrepareFromUri:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    invoke-virtual {v0, p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaBrowserCompatItemReceiver(Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)I

    move-result p0

    return p0

    :cond_15
    return v1
.end method

.method public computeHorizontalScrollOffset()I
    .registers 3

    .line 2288
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPlayFromMediaId:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    const/4 v1, 0x0

    if-nez v0, :cond_6

    return v1

    .line 2291
    :cond_6
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->AudioAttributesImplApi26Parcelizer()Z

    move-result v0

    if-eqz v0, :cond_15

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPlayFromMediaId:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPrepareFromUri:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    invoke-virtual {v0, p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->AudioAttributesCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)I

    move-result p0

    return p0

    :cond_15
    return v1
.end method

.method public computeHorizontalScrollRange()I
    .registers 3

    .line 2336
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPlayFromMediaId:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    const/4 v1, 0x0

    if-nez v0, :cond_6

    return v1

    .line 2339
    :cond_6
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->AudioAttributesImplApi26Parcelizer()Z

    move-result v0

    if-eqz v0, :cond_15

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPlayFromMediaId:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPrepareFromUri:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    invoke-virtual {v0, p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->IconCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)I

    move-result p0

    return p0

    :cond_15
    return v1
.end method

.method public computeVerticalScrollExtent()I
    .registers 3

    .line 2385
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPlayFromMediaId:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    const/4 v1, 0x0

    if-nez v0, :cond_6

    return v1

    .line 2388
    :cond_6
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->AudioAttributesImplApi21Parcelizer()Z

    move-result v0

    if-eqz v0, :cond_15

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPlayFromMediaId:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPrepareFromUri:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    invoke-virtual {v0, p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->AudioAttributesImplBaseParcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)I

    move-result p0

    return p0

    :cond_15
    return v1
.end method

.method public computeVerticalScrollOffset()I
    .registers 3

    .line 2361
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPlayFromMediaId:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    const/4 v1, 0x0

    if-nez v0, :cond_6

    return v1

    .line 2364
    :cond_6
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->AudioAttributesImplApi21Parcelizer()Z

    move-result v0

    if-eqz v0, :cond_15

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPlayFromMediaId:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPrepareFromUri:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    invoke-virtual {v0, p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->RemoteActionCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)I

    move-result p0

    return p0

    :cond_15
    return v1
.end method

.method public computeVerticalScrollRange()I
    .registers 3

    .line 2408
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPlayFromMediaId:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    const/4 v1, 0x0

    if-nez v0, :cond_6

    return v1

    .line 2411
    :cond_6
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->AudioAttributesImplApi21Parcelizer()Z

    move-result v0

    if-eqz v0, :cond_15

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPlayFromMediaId:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPrepareFromUri:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    invoke-virtual {v0, p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->read(Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)I

    move-result p0

    return p0

    :cond_15
    return v1
.end method

.method public dispatchNestedFling(FFZ)Z
    .registers 4

    .line 12505
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->onPause()Lo/rootObjectScope;

    move-result-object p0

    invoke-virtual {p0, p1, p2, p3}, Lo/rootObjectScope;->AudioAttributesCompatParcelizer(FFZ)Z

    move-result p0

    return p0
.end method

.method public dispatchNestedPreFling(FF)Z
    .registers 3

    .line 12510
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->onPause()Lo/rootObjectScope;

    move-result-object p0

    invoke-virtual {p0, p1, p2}, Lo/rootObjectScope;->RemoteActionCompatParcelizer(FF)Z

    move-result p0

    return p0
.end method

.method public dispatchNestedPreScroll(II[I[I)Z
    .registers 5

    .line 12493
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->onPause()Lo/rootObjectScope;

    move-result-object p0

    invoke-virtual {p0, p1, p2, p3, p4}, Lo/rootObjectScope;->write(II[I[I)Z

    move-result p0

    return p0
.end method

.method public dispatchNestedScroll(IIII[I)Z
    .registers 12

    .line 12473
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->onPause()Lo/rootObjectScope;

    move-result-object v0

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, Lo/rootObjectScope;->RemoteActionCompatParcelizer(IIII[I)Z

    move-result p0

    return p0
.end method

.method public dispatchPopulateAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)Z
    .registers 2

    .line 4226
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->onPopulateAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V

    const/4 p0, 0x1

    return p0
.end method

.method protected dispatchRestoreInstanceState(Landroid/util/SparseArray;)V
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/util/SparseArray<",
            "Landroid/os/Parcelable;",
            ">;)V"
        }
    .end annotation

    .line 1558
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->dispatchThawSelfOnly(Landroid/util/SparseArray;)V

    return-void
.end method

.method protected dispatchSaveInstanceState(Landroid/util/SparseArray;)V
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/util/SparseArray<",
            "Landroid/os/Parcelable;",
            ">;)V"
        }
    .end annotation

    .line 1550
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->dispatchFreezeSelfOnly(Landroid/util/SparseArray;)V

    return-void
.end method

.method public draw(Landroid/graphics/Canvas;)V
    .registers 9

    .line 4944
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->draw(Landroid/graphics/Canvas;)V

    .line 4946
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPause:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_b
    if-ge v2, v0, :cond_1d

    .line 4948
    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView;->onPause:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplBaseParcelizer;

    iget-object v4, p0, Landroidx/recyclerview/widget/RecyclerView;->onPrepareFromUri:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    invoke-virtual {v3, p1, p0, v4}, Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplBaseParcelizer;->AudioAttributesCompatParcelizer(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_b

    .line 4953
    :cond_1d
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->accessensureViewModelStore:Landroid/widget/EdgeEffect;

    const/4 v2, 0x1

    if-eqz v0, :cond_57

    invoke-virtual {v0}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v0

    if-nez v0, :cond_57

    .line 4954
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v0

    .line 4955
    iget-boolean v3, p0, Landroidx/recyclerview/widget/RecyclerView;->MediaDescriptionCompat:Z

    if-eqz v3, :cond_35

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v3

    goto :goto_36

    :cond_35
    move v3, v1

    :goto_36
    const/high16 v4, 0x43870000    # 270.0f

    .line 4956
    invoke-virtual {p1, v4}, Landroid/graphics/Canvas;->rotate(F)V

    .line 4957
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v4

    neg-int v4, v4

    add-int/2addr v4, v3

    int-to-float v3, v4

    const/4 v4, 0x0

    invoke-virtual {p1, v3, v4}, Landroid/graphics/Canvas;->translate(FF)V

    .line 4958
    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView;->accessensureViewModelStore:Landroid/widget/EdgeEffect;

    if-eqz v3, :cond_52

    invoke-virtual {v3, p1}, Landroid/widget/EdgeEffect;->draw(Landroid/graphics/Canvas;)Z

    move-result v3

    if-eqz v3, :cond_52

    move v3, v2

    goto :goto_53

    :cond_52
    move v3, v1

    .line 4959
    :goto_53
    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->restoreToCount(I)V

    goto :goto_58

    :cond_57
    move v3, v1

    .line 4961
    :goto_58
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->getFullyDrawnReporter:Landroid/widget/EdgeEffect;

    if-eqz v0, :cond_88

    invoke-virtual {v0}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v0

    if-nez v0, :cond_88

    .line 4962
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v0

    .line 4963
    iget-boolean v4, p0, Landroidx/recyclerview/widget/RecyclerView;->MediaDescriptionCompat:Z

    if-eqz v4, :cond_77

    .line 4964
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v4

    int-to-float v4, v4

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v5

    int-to-float v5, v5

    invoke-virtual {p1, v4, v5}, Landroid/graphics/Canvas;->translate(FF)V

    .line 4966
    :cond_77
    iget-object v4, p0, Landroidx/recyclerview/widget/RecyclerView;->getFullyDrawnReporter:Landroid/widget/EdgeEffect;

    if-eqz v4, :cond_83

    invoke-virtual {v4, p1}, Landroid/widget/EdgeEffect;->draw(Landroid/graphics/Canvas;)Z

    move-result v4

    if-eqz v4, :cond_83

    move v4, v2

    goto :goto_84

    :cond_83
    move v4, v1

    :goto_84
    or-int/2addr v3, v4

    .line 4967
    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 4969
    :cond_88
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->addOnMultiWindowModeChangedListener:Landroid/widget/EdgeEffect;

    if-eqz v0, :cond_c0

    invoke-virtual {v0}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v0

    if-nez v0, :cond_c0

    .line 4970
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v0

    .line 4971
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v4

    .line 4972
    iget-boolean v5, p0, Landroidx/recyclerview/widget/RecyclerView;->MediaDescriptionCompat:Z

    if-eqz v5, :cond_a3

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v5

    goto :goto_a4

    :cond_a3
    move v5, v1

    :goto_a4
    const/high16 v6, 0x42b40000    # 90.0f

    .line 4973
    invoke-virtual {p1, v6}, Landroid/graphics/Canvas;->rotate(F)V

    int-to-float v5, v5

    neg-int v4, v4

    int-to-float v4, v4

    .line 4974
    invoke-virtual {p1, v5, v4}, Landroid/graphics/Canvas;->translate(FF)V

    .line 4975
    iget-object v4, p0, Landroidx/recyclerview/widget/RecyclerView;->addOnMultiWindowModeChangedListener:Landroid/widget/EdgeEffect;

    if-eqz v4, :cond_bb

    invoke-virtual {v4, p1}, Landroid/widget/EdgeEffect;->draw(Landroid/graphics/Canvas;)Z

    move-result v4

    if-eqz v4, :cond_bb

    move v4, v2

    goto :goto_bc

    :cond_bb
    move v4, v1

    :goto_bc
    or-int/2addr v3, v4

    .line 4976
    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 4978
    :cond_c0
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onSkipToQueueItem:Landroid/widget/EdgeEffect;

    if-eqz v0, :cond_10f

    invoke-virtual {v0}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v0

    if-nez v0, :cond_10f

    .line 4979
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v0

    const/high16 v4, 0x43340000    # 180.0f

    .line 4980
    invoke-virtual {p1, v4}, Landroid/graphics/Canvas;->rotate(F)V

    .line 4981
    iget-boolean v4, p0, Landroidx/recyclerview/widget/RecyclerView;->MediaDescriptionCompat:Z

    if-eqz v4, :cond_f1

    .line 4982
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v4

    neg-int v4, v4

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v5

    add-int/2addr v4, v5

    int-to-float v4, v4

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v5

    neg-int v5, v5

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v6

    add-int/2addr v5, v6

    int-to-float v5, v5

    invoke-virtual {p1, v4, v5}, Landroid/graphics/Canvas;->translate(FF)V

    goto :goto_100

    .line 4984
    :cond_f1
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v4

    neg-int v4, v4

    int-to-float v4, v4

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v5

    neg-int v5, v5

    int-to-float v5, v5

    invoke-virtual {p1, v4, v5}, Landroid/graphics/Canvas;->translate(FF)V

    .line 4986
    :goto_100
    iget-object v4, p0, Landroidx/recyclerview/widget/RecyclerView;->onSkipToQueueItem:Landroid/widget/EdgeEffect;

    if-eqz v4, :cond_10b

    invoke-virtual {v4, p1}, Landroid/widget/EdgeEffect;->draw(Landroid/graphics/Canvas;)Z

    move-result v4

    if-eqz v4, :cond_10b

    move v1, v2

    :cond_10b
    or-int/2addr v3, v1

    .line 4987
    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->restoreToCount(I)V

    :cond_10f
    if-nez v3, :cond_126

    .line 4993
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->onCommand:Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer;

    if-eqz p1, :cond_126

    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->onPause:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/AbstractCollection;->size()I

    move-result p1

    if-lez p1, :cond_126

    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->onCommand:Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer;

    .line 4994
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer;->IconCompatParcelizer()Z

    move-result p1

    if-eqz p1, :cond_126

    goto :goto_128

    :cond_126
    if-eqz v3, :cond_12b

    .line 4999
    :goto_128
    invoke-static {p0}, Lo/InvalidTypeIdException;->onRemoveQueueItem(Landroid/view/View;)V

    :cond_12b
    return-void
.end method

.method public drawChild(Landroid/graphics/Canvas;Landroid/view/View;J)Z
    .registers 5

    .line 5545
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/ViewGroup;->drawChild(Landroid/graphics/Canvas;Landroid/view/View;J)Z

    move-result p0

    return p0
.end method

.method public focusSearch(Landroid/view/View;I)Landroid/view/View;
    .registers 9

    .line 3172
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPlayFromMediaId:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    .line 3176
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatItemReceiver:Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_16

    if-eqz v0, :cond_16

    .line 3177
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatMediaItem()Z

    move-result v0

    if-nez v0, :cond_16

    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPlay:Z

    if-nez v0, :cond_16

    move v0, v2

    goto :goto_17

    :cond_16
    move v0, v3

    .line 3179
    :goto_17
    invoke-static {}, Landroid/view/FocusFinder;->getInstance()Landroid/view/FocusFinder;

    move-result-object v1

    const/4 v4, 0x0

    if-eqz v0, :cond_83

    const/4 v5, 0x2

    if-eq p2, v5, :cond_23

    if-ne p2, v2, :cond_83

    .line 3185
    :cond_23
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPlayFromMediaId:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->AudioAttributesImplApi21Parcelizer()Z

    move-result v0

    if-eqz v0, :cond_3a

    if-ne p2, v5, :cond_30

    const/16 v0, 0x82

    goto :goto_32

    :cond_30
    const/16 v0, 0x21

    .line 3188
    :goto_32
    invoke-virtual {v1, p0, p1, v0}, Landroid/view/FocusFinder;->findNextFocus(Landroid/view/ViewGroup;Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_3a

    move v0, v2

    goto :goto_3b

    :cond_3a
    move v0, v3

    :goto_3b
    if-nez v0, :cond_63

    .line 3195
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPlayFromMediaId:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->AudioAttributesImplApi26Parcelizer()Z

    move-result v0

    if-eqz v0, :cond_7e

    .line 3196
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPlayFromMediaId:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onPlayFromSearch()I

    move-result v0

    if-ne v0, v2, :cond_4f

    move v0, v2

    goto :goto_50

    :cond_4f
    move v0, v3

    :goto_50
    if-ne p2, v5, :cond_53

    goto :goto_54

    :cond_53
    move v2, v3

    :goto_54
    xor-int/2addr v0, v2

    if-eqz v0, :cond_5a

    const/16 v0, 0x42

    goto :goto_5c

    :cond_5a
    const/16 v0, 0x11

    .line 3199
    :goto_5c
    invoke-virtual {v1, p0, p1, v0}, Landroid/view/FocusFinder;->findNextFocus(Landroid/view/ViewGroup;Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_7e

    goto :goto_65

    :cond_63
    if-eqz v0, :cond_7e

    .line 3207
    :goto_65
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->read()V

    .line 3208
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->write(Landroid/view/View;)Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_6f

    return-object v4

    .line 3213
    :cond_6f
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw()V

    .line 3214
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPlayFromMediaId:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView;->onRemoveQueueItemAt:Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;

    iget-object v5, p0, Landroidx/recyclerview/widget/RecyclerView;->onPrepareFromUri:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    invoke-virtual {v0, p1, p2, v2, v5}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->AudioAttributesCompatParcelizer(Landroid/view/View;ILandroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)Landroid/view/View;

    .line 3215
    invoke-direct {p0, v3}, Landroidx/recyclerview/widget/RecyclerView;->read(Z)V

    .line 3217
    :cond_7e
    invoke-virtual {v1, p0, p1, p2}, Landroid/view/FocusFinder;->findNextFocus(Landroid/view/ViewGroup;Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    goto :goto_a7

    .line 3219
    :cond_83
    invoke-virtual {v1, p0, p1, p2}, Landroid/view/FocusFinder;->findNextFocus(Landroid/view/ViewGroup;Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    if-nez v1, :cond_a6

    if-eqz v0, :cond_a6

    .line 3221
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->read()V

    .line 3222
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->write(Landroid/view/View;)Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_95

    return-object v4

    .line 3227
    :cond_95
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw()V

    .line 3228
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPlayFromMediaId:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->onRemoveQueueItemAt:Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;

    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView;->onPrepareFromUri:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    invoke-virtual {v0, p1, p2, v1, v2}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->AudioAttributesCompatParcelizer(Landroid/view/View;ILandroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)Landroid/view/View;

    move-result-object v0

    .line 3229
    invoke-direct {p0, v3}, Landroidx/recyclerview/widget/RecyclerView;->read(Z)V

    goto :goto_a7

    :cond_a6
    move-object v0, v1

    :goto_a7
    if-eqz v0, :cond_be

    .line 3232
    invoke-virtual {v0}, Landroid/view/View;->hasFocusable()Z

    move-result v1

    if-nez v1, :cond_be

    .line 3233
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getFocusedChild()Landroid/view/View;

    move-result-object v1

    if-nez v1, :cond_ba

    .line 3236
    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->focusSearch(Landroid/view/View;I)Landroid/view/View;

    move-result-object p0

    return-object p0

    .line 3242
    :cond_ba
    invoke-direct {p0, v0, v4}, Landroidx/recyclerview/widget/RecyclerView;->read(Landroid/view/View;Landroid/view/View;)V

    return-object p1

    .line 3245
    :cond_be
    invoke-direct {p0, p1, v0, p2}, Landroidx/recyclerview/widget/RecyclerView;->AudioAttributesCompatParcelizer(Landroid/view/View;Landroid/view/View;I)Z

    move-result v1

    if-eqz v1, :cond_c5

    return-object v0

    .line 3246
    :cond_c5
    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->focusSearch(Landroid/view/View;I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method protected generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    .registers 4

    .line 5020
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPlayFromMediaId:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    if-eqz v0, :cond_9

    .line 5023
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->read()Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    move-result-object p0

    return-object p0

    .line 5021
    :cond_9
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "RecyclerView has no LayoutManager"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->write()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams;
    .registers 4

    .line 5028
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPlayFromMediaId:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    if-eqz v0, :cond_d

    .line 5031
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p0

    invoke-virtual {v0, p0, p1}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->AudioAttributesCompatParcelizer(Landroid/content/Context;Landroid/util/AttributeSet;)Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    move-result-object p0

    return-object p0

    .line 5029
    :cond_d
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "RecyclerView has no LayoutManager"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->write()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method protected generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;
    .registers 4

    .line 5036
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPlayFromMediaId:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    if-eqz v0, :cond_9

    .line 5039
    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->read(Landroid/view/ViewGroup$LayoutParams;)Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    move-result-object p0

    return-object p0

    .line 5037
    :cond_9
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "RecyclerView has no LayoutManager"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->write()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public getAccessibilityClassName()Ljava/lang/CharSequence;
    .registers 1

    .line 868
    const-string p0, "androidx.recyclerview.widget.RecyclerView"

    return-object p0
.end method

.method public getBaseline()I
    .registers 2

    .line 1387
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPlayFromMediaId:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    if-eqz v0, :cond_9

    .line 1388
    invoke-static {}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onCustomAction()I

    move-result p0

    return p0

    .line 1390
    :cond_9
    invoke-super {p0}, Landroid/view/ViewGroup;->getBaseline()I

    move-result p0

    return p0
.end method

.method protected getChildDrawingOrder(II)I
    .registers 4

    .line 14420
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->ParcelableVolumeInfo:Landroidx/recyclerview/widget/RecyclerView$write;

    if-nez v0, :cond_9

    .line 14421
    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->getChildDrawingOrder(II)I

    move-result p0

    return p0

    .line 14423
    :cond_9
    invoke-interface {v0}, Landroidx/recyclerview/widget/RecyclerView$write;->RemoteActionCompatParcelizer()I

    move-result p0

    return p0
.end method

.method public getClipToPadding()Z
    .registers 1

    .line 1203
    iget-boolean p0, p0, Landroidx/recyclerview/widget/RecyclerView;->MediaDescriptionCompat:Z

    return p0
.end method

.method final handleMediaPlayPauseIfPendingOnHandler()V
    .registers 2

    .line 4249
    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPlayFromUri:Z

    if-nez v0, :cond_10

    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->handleMediaPlayPauseIfPendingOnHandler:Z

    if-eqz v0, :cond_10

    .line 4250
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->_init_lambda3:Ljava/lang/Runnable;

    invoke-static {p0, v0}, Lo/InvalidTypeIdException;->AudioAttributesCompatParcelizer(Landroid/view/View;Ljava/lang/Runnable;)V

    const/4 v0, 0x1

    .line 4251
    iput-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPlayFromUri:Z

    :cond_10
    return-void
.end method

.method public hasNestedScrollingParent()Z
    .registers 1

    .line 12462
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->onPause()Lo/rootObjectScope;

    move-result-object p0

    invoke-virtual {p0}, Lo/rootObjectScope;->write()Z

    move-result p0

    return p0
.end method

.method public isAttachedToWindow()Z
    .registers 1

    .line 3450
    iget-boolean p0, p0, Landroidx/recyclerview/widget/RecyclerView;->handleMediaPlayPauseIfPendingOnHandler:Z

    return p0
.end method

.method public final isLayoutSuppressed()Z
    .registers 1

    .line 2531
    iget-boolean p0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPlay:Z

    return p0
.end method

.method public isNestedScrollingEnabled()Z
    .registers 1

    .line 12437
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->onPause()Lo/rootObjectScope;

    move-result-object p0

    invoke-virtual {p0}, Lo/rootObjectScope;->read()Z

    move-result p0

    return p0
.end method

.method public final onAddQueueItem()V
    .registers 3

    .line 1276
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onCommand:Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer;

    if-eqz v0, :cond_7

    .line 1277
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer;->write()V

    .line 1283
    :cond_7
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPlayFromMediaId:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    if-eqz v0, :cond_17

    .line 1284
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->onRemoveQueueItemAt:Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->RemoteActionCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;)V

    .line 1285
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPlayFromMediaId:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->onRemoveQueueItemAt:Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->read(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;)V

    .line 1288
    :cond_17
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView;->onRemoveQueueItemAt:Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->write()V

    return-void
.end method

.method public onAttachedToWindow()V
    .registers 5

    .line 3385
    invoke-super {p0}, Landroid/view/ViewGroup;->onAttachedToWindow()V

    const/4 v0, 0x0

    .line 3386
    iput v0, p0, Landroidx/recyclerview/widget/RecyclerView;->_init_lambda4:I

    const/4 v1, 0x1

    .line 3387
    iput-boolean v1, p0, Landroidx/recyclerview/widget/RecyclerView;->handleMediaPlayPauseIfPendingOnHandler:Z

    .line 3388
    iget-boolean v2, p0, Landroidx/recyclerview/widget/RecyclerView;->onCustomAction:Z

    if-eqz v2, :cond_13

    invoke-virtual {p0}, Landroid/view/View;->isLayoutRequested()Z

    move-result v2

    if-eqz v2, :cond_14

    :cond_13
    move v1, v0

    :cond_14
    iput-boolean v1, p0, Landroidx/recyclerview/widget/RecyclerView;->onCustomAction:Z

    .line 3390
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->onRemoveQueueItemAt:Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;

    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->AudioAttributesImplApi26Parcelizer()V

    .line 3392
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->onPlayFromMediaId:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    if-eqz v1, :cond_22

    .line 3393
    invoke-virtual {v1, p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->RemoteActionCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 3395
    :cond_22
    iput-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPlayFromUri:Z

    .line 3397
    sget-boolean v0, Landroidx/recyclerview/widget/RecyclerView;->IconCompatParcelizer:Z

    if-eqz v0, :cond_68

    .line 3399
    sget-object v0, Lo/SingletonSupport;->AudioAttributesCompatParcelizer:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/SingletonSupport;

    iput-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onAddQueueItem:Lo/SingletonSupport;

    if-nez v0, :cond_63

    .line 3401
    new-instance v0, Lo/SingletonSupport;

    invoke-direct {v0}, Lo/SingletonSupport;-><init>()V

    iput-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onAddQueueItem:Lo/SingletonSupport;

    .line 3405
    invoke-static {p0}, Lo/InvalidTypeIdException;->AudioAttributesImplApi26Parcelizer(Landroid/view/View;)Landroid/view/Display;

    move-result-object v0

    .line 3407
    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    move-result v1

    if-nez v1, :cond_51

    if-eqz v0, :cond_51

    .line 3408
    invoke-virtual {v0}, Landroid/view/Display;->getRefreshRate()F

    move-result v0

    const/high16 v1, 0x41f00000    # 30.0f

    cmpl-float v1, v0, v1

    if-gez v1, :cond_53

    :cond_51
    const/high16 v0, 0x42700000    # 60.0f

    .line 3413
    :cond_53
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->onAddQueueItem:Lo/SingletonSupport;

    const v2, 0x4e6e6b28    # 1.0E9f

    div-float/2addr v2, v0

    float-to-long v2, v2

    iput-wide v2, v1, Lo/SingletonSupport;->read:J

    .line 3414
    sget-object v0, Lo/SingletonSupport;->AudioAttributesCompatParcelizer:Ljava/lang/ThreadLocal;

    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->onAddQueueItem:Lo/SingletonSupport;

    invoke-virtual {v0, v1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 3416
    :cond_63
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onAddQueueItem:Lo/SingletonSupport;

    invoke-virtual {v0, p0}, Lo/SingletonSupport;->RemoteActionCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView;)V

    :cond_68
    return-void
.end method

.method public onDetachedFromWindow()V
    .registers 3

    .line 3422
    invoke-super {p0}, Landroid/view/ViewGroup;->onDetachedFromWindow()V

    .line 3423
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onCommand:Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer;

    if-eqz v0, :cond_a

    .line 3424
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer;->write()V

    .line 3426
    :cond_a
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->ResultReceiver()V

    const/4 v0, 0x0

    .line 3427
    iput-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->handleMediaPlayPauseIfPendingOnHandler:Z

    .line 3428
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPlayFromMediaId:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    if-eqz v0, :cond_19

    .line 3429
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->onRemoveQueueItemAt:Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;

    invoke-virtual {v0, p0, v1}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->RemoteActionCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;)V

    .line 3431
    :cond_19
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPrepareFromSearch:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 3432
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->_init_lambda3:Ljava/lang/Runnable;

    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 3433
    invoke-static {}, Lo/UIntSerializer;->IconCompatParcelizer()V

    .line 3434
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onRemoveQueueItemAt:Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->MediaBrowserCompatCustomActionResultReceiver()V

    .line 3436
    invoke-static {p0}, Lo/createPrimordial;->write(Landroid/view/ViewGroup;)V

    .line 3438
    sget-boolean v0, Landroidx/recyclerview/widget/RecyclerView;->IconCompatParcelizer:Z

    if-eqz v0, :cond_3c

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onAddQueueItem:Lo/SingletonSupport;

    if-eqz v0, :cond_3c

    .line 3440
    invoke-virtual {v0, p0}, Lo/SingletonSupport;->AudioAttributesCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView;)V

    const/4 v0, 0x0

    .line 3441
    iput-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onAddQueueItem:Lo/SingletonSupport;

    :cond_3c
    return-void
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .registers 6

    .line 5005
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onDraw(Landroid/graphics/Canvas;)V

    .line 5007
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPause:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_a
    if-ge v1, v0, :cond_1c

    .line 5009
    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView;->onPause:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplBaseParcelizer;

    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView;->onPrepareFromUri:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    invoke-virtual {v2, p1, p0, v3}, Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplBaseParcelizer;->IconCompatParcelizer(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_a

    :cond_1c
    return-void
.end method

.method public onGenericMotionEvent(Landroid/view/MotionEvent;)Z
    .registers 7

    .line 3940
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPlayFromMediaId:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    const/4 v1, 0x0

    if-nez v0, :cond_6

    return v1

    .line 3943
    :cond_6
    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPlay:Z

    if-eqz v0, :cond_b

    return v1

    .line 3946
    :cond_b
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/16 v2, 0x8

    if-ne v0, v2, :cond_75

    .line 3948
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getSource()I

    move-result v0

    and-int/lit8 v0, v0, 0x2

    const/4 v2, 0x0

    if-eqz v0, :cond_3c

    .line 3949
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPlayFromMediaId:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->AudioAttributesImplApi21Parcelizer()Z

    move-result v0

    if-eqz v0, :cond_2c

    const/16 v0, 0x9

    .line 3952
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getAxisValue(I)F

    move-result v0

    neg-float v0, v0

    goto :goto_2d

    :cond_2c
    move v0, v2

    .line 3956
    :goto_2d
    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView;->onPlayFromMediaId:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    invoke-virtual {v3}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->AudioAttributesImplApi26Parcelizer()Z

    move-result v3

    if-eqz v3, :cond_54

    const/16 v3, 0xa

    .line 3957
    invoke-virtual {p1, v3}, Landroid/view/MotionEvent;->getAxisValue(I)F

    move-result v3

    goto :goto_62

    .line 3961
    :cond_3c
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getSource()I

    move-result v0

    const/high16 v3, 0x400000

    and-int/2addr v0, v3

    if-eqz v0, :cond_60

    const/16 v0, 0x1a

    .line 3962
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getAxisValue(I)F

    move-result v3

    .line 3963
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPlayFromMediaId:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->AudioAttributesImplApi21Parcelizer()Z

    move-result v0

    if-eqz v0, :cond_56

    neg-float v0, v3

    :cond_54
    move v3, v2

    goto :goto_62

    .line 3968
    :cond_56
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPlayFromMediaId:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->AudioAttributesImplApi26Parcelizer()Z

    move-result v0

    if-eqz v0, :cond_60

    move v0, v2

    goto :goto_62

    :cond_60
    move v0, v2

    move v3, v0

    :goto_62
    cmpl-float v4, v0, v2

    if-nez v4, :cond_6a

    cmpl-float v2, v3, v2

    if-eqz v2, :cond_75

    .line 3981
    :cond_6a
    iget v2, p0, Landroidx/recyclerview/widget/RecyclerView;->addOnNewIntentListener:F

    mul-float/2addr v3, v2

    float-to-int v2, v3

    iget v3, p0, Landroidx/recyclerview/widget/RecyclerView;->addOnPictureInPictureModeChangedListener:F

    mul-float/2addr v0, v3

    float-to-int v0, v0

    invoke-direct {p0, v2, v0, p1}, Landroidx/recyclerview/widget/RecyclerView;->AudioAttributesCompatParcelizer(IILandroid/view/MotionEvent;)V

    :cond_75
    return v1
.end method

.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .registers 10

    .line 3593
    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPlay:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_6

    return v1

    :cond_6
    const/4 v0, 0x0

    .line 3601
    iput-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatMediaItem;

    .line 3602
    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->IconCompatParcelizer(Landroid/view/MotionEvent;)Z

    move-result v0

    const/4 v2, 0x1

    if-eqz v0, :cond_14

    .line 3603
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()V

    return v2

    .line 3607
    :cond_14
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPlayFromMediaId:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    if-nez v0, :cond_19

    return v1

    .line 3611
    :cond_19
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->AudioAttributesImplApi26Parcelizer()Z

    move-result v0

    .line 3612
    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView;->onPlayFromMediaId:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    invoke-virtual {v3}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->AudioAttributesImplApi21Parcelizer()Z

    move-result v3

    .line 3614
    iget-object v4, p0, Landroidx/recyclerview/widget/RecyclerView;->getSavedStateRegistry:Landroid/view/VelocityTracker;

    if-nez v4, :cond_2d

    .line 3615
    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    move-result-object v4

    iput-object v4, p0, Landroidx/recyclerview/widget/RecyclerView;->getSavedStateRegistry:Landroid/view/VelocityTracker;

    .line 3617
    :cond_2d
    iget-object v4, p0, Landroidx/recyclerview/widget/RecyclerView;->getSavedStateRegistry:Landroid/view/VelocityTracker;

    invoke-virtual {v4, p1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 3619
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v4

    .line 3620
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    move-result v5

    const/4 v6, 0x2

    const/high16 v7, 0x3f000000    # 0.5f

    if-eqz v4, :cond_be

    if-eq v4, v2, :cond_b5

    if-eq v4, v6, :cond_72

    const/4 v0, 0x3

    if-eq v4, v0, :cond_6d

    const/4 v0, 0x5

    if-eq v4, v0, :cond_51

    const/4 v0, 0x6

    if-ne v4, v0, :cond_102

    .line 3686
    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->write(Landroid/view/MotionEvent;)V

    goto/16 :goto_102

    .line 3651
    :cond_51
    invoke-virtual {p1, v5}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v0

    iput v0, p0, Landroidx/recyclerview/widget/RecyclerView;->getDefaultViewModelCreationExtras:I

    .line 3652
    invoke-virtual {p1, v5}, Landroid/view/MotionEvent;->getX(I)F

    move-result v0

    add-float/2addr v0, v7

    float-to-int v0, v0

    iput v0, p0, Landroidx/recyclerview/widget/RecyclerView;->accessaddObserverForBackInvoker:I

    iput v0, p0, Landroidx/recyclerview/widget/RecyclerView;->ResultReceiver:I

    .line 3653
    invoke-virtual {p1, v5}, Landroid/view/MotionEvent;->getY(I)F

    move-result p1

    add-float/2addr p1, v7

    float-to-int p1, p1

    iput p1, p0, Landroidx/recyclerview/widget/RecyclerView;->accessgetReportFullyDrawnExecutorp:I

    iput p1, p0, Landroidx/recyclerview/widget/RecyclerView;->r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM:I

    goto/16 :goto_102

    .line 3697
    :cond_6d
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()V

    goto/16 :goto_102

    .line 3657
    :cond_72
    iget v4, p0, Landroidx/recyclerview/widget/RecyclerView;->getDefaultViewModelCreationExtras:I

    invoke-virtual {p1, v4}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v4

    if-gez v4, :cond_7b

    return v1

    .line 3664
    :cond_7b
    invoke-virtual {p1, v4}, Landroid/view/MotionEvent;->getX(I)F

    move-result v5

    add-float/2addr v5, v7

    float-to-int v5, v5

    .line 3665
    invoke-virtual {p1, v4}, Landroid/view/MotionEvent;->getY(I)F

    move-result p1

    add-float/2addr p1, v7

    float-to-int p1, p1

    .line 3666
    iget v4, p0, Landroidx/recyclerview/widget/RecyclerView;->addOnTrimMemoryListener:I

    if-eq v4, v2, :cond_102

    .line 3667
    iget v4, p0, Landroidx/recyclerview/widget/RecyclerView;->ResultReceiver:I

    .line 3668
    iget v6, p0, Landroidx/recyclerview/widget/RecyclerView;->r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM:I

    if-eqz v0, :cond_9f

    sub-int v0, v5, v4

    .line 3670
    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v0

    iget v4, p0, Landroidx/recyclerview/widget/RecyclerView;->getLastCustomNonConfigurationInstance:I

    if-le v0, v4, :cond_9f

    .line 3671
    iput v5, p0, Landroidx/recyclerview/widget/RecyclerView;->accessaddObserverForBackInvoker:I

    move v0, v2

    goto :goto_a0

    :cond_9f
    move v0, v1

    :goto_a0
    if-eqz v3, :cond_af

    sub-int v3, p1, v6

    .line 3674
    invoke-static {v3}, Ljava/lang/Math;->abs(I)I

    move-result v3

    iget v4, p0, Landroidx/recyclerview/widget/RecyclerView;->getLastCustomNonConfigurationInstance:I

    if-le v3, v4, :cond_af

    .line 3675
    iput p1, p0, Landroidx/recyclerview/widget/RecyclerView;->accessgetReportFullyDrawnExecutorp:I

    goto :goto_b1

    :cond_af
    if-eqz v0, :cond_102

    .line 3679
    :goto_b1
    invoke-virtual {p0, v2}, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatItemReceiver(I)V

    goto :goto_102

    .line 3691
    :cond_b5
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->getSavedStateRegistry:Landroid/view/VelocityTracker;

    invoke-virtual {p1}, Landroid/view/VelocityTracker;->clear()V

    .line 3692
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatCustomActionResultReceiver(I)V

    goto :goto_102

    .line 3624
    :cond_be
    iget-boolean v4, p0, Landroidx/recyclerview/widget/RecyclerView;->PlaybackStateCompatCustomAction:Z

    if-eqz v4, :cond_c4

    .line 3625
    iput-boolean v1, p0, Landroidx/recyclerview/widget/RecyclerView;->PlaybackStateCompatCustomAction:Z

    .line 3627
    :cond_c4
    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v4

    iput v4, p0, Landroidx/recyclerview/widget/RecyclerView;->getDefaultViewModelCreationExtras:I

    .line 3628
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v4

    add-float/2addr v4, v7

    float-to-int v4, v4

    iput v4, p0, Landroidx/recyclerview/widget/RecyclerView;->accessaddObserverForBackInvoker:I

    iput v4, p0, Landroidx/recyclerview/widget/RecyclerView;->ResultReceiver:I

    .line 3629
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v4

    add-float/2addr v4, v7

    float-to-int v4, v4

    iput v4, p0, Landroidx/recyclerview/widget/RecyclerView;->accessgetReportFullyDrawnExecutorp:I

    iput v4, p0, Landroidx/recyclerview/widget/RecyclerView;->r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM:I

    .line 3631
    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->read(Landroid/view/MotionEvent;)Z

    move-result p1

    if-nez p1, :cond_e8

    iget p1, p0, Landroidx/recyclerview/widget/RecyclerView;->addOnTrimMemoryListener:I

    if-ne p1, v6, :cond_f5

    .line 3632
    :cond_e8
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    invoke-interface {p1, v2}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 3633
    invoke-virtual {p0, v2}, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatItemReceiver(I)V

    .line 3634
    invoke-virtual {p0, v2}, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatCustomActionResultReceiver(I)V

    .line 3638
    :cond_f5
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->ensureViewModelStore:[I

    aput v1, p1, v2

    aput v1, p1, v1

    if-eqz v3, :cond_ff

    or-int/lit8 v0, v0, 0x2

    .line 3647
    :cond_ff
    invoke-direct {p0, v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatMediaItem(II)Z

    .line 3700
    :cond_102
    :goto_102
    iget p0, p0, Landroidx/recyclerview/widget/RecyclerView;->addOnTrimMemoryListener:I

    if-ne p0, v2, :cond_107

    return v2

    :cond_107
    return v1
.end method

.method protected onLayout(ZIIII)V
    .registers 6

    .line 4918
    const-string p1, "RV OnLayout"

    invoke-static {p1}, Lo/constructDelegatingKeyDeserializer;->read(Ljava/lang/String;)V

    .line 4919
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->onSetRating()V

    .line 4920
    invoke-static {}, Lo/constructDelegatingKeyDeserializer;->RemoteActionCompatParcelizer()V

    const/4 p1, 0x1

    .line 4921
    iput-boolean p1, p0, Landroidx/recyclerview/widget/RecyclerView;->onCustomAction:Z

    return-void
.end method

.method public onMeasure(II)V
    .registers 8

    .line 3990
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPlayFromMediaId:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    if-nez v0, :cond_8

    .line 3991
    invoke-virtual {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->IconCompatParcelizer(II)V

    return-void

    .line 3994
    :cond_8
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->RatingCompat()Z

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_7c

    .line 3995
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    .line 3996
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v3

    .line 4005
    iget-object v4, p0, Landroidx/recyclerview/widget/RecyclerView;->onPlayFromMediaId:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    invoke-virtual {v4, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->write(II)V

    const/high16 v4, 0x40000000    # 2.0f

    if-ne v0, v4, :cond_24

    if-ne v3, v4, :cond_24

    move v2, v1

    .line 4009
    :cond_24
    iput-boolean v2, p0, Landroidx/recyclerview/widget/RecyclerView;->_init_lambda5:Z

    if-nez v2, :cond_7b

    .line 4011
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatItemReceiver:Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;

    if-eqz v0, :cond_7b

    .line 4015
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPrepareFromUri:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    iget v0, v0, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->AudioAttributesImplApi21Parcelizer:I

    if-ne v0, v1, :cond_35

    .line 4016
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->onCommand()V

    .line 4020
    :cond_35
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPlayFromMediaId:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    invoke-virtual {v0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->IconCompatParcelizer(II)V

    .line 4021
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPrepareFromUri:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    iput-boolean v1, v0, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->MediaBrowserCompatItemReceiver:Z

    .line 4022
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->onMediaButtonEvent()V

    .line 4025
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPlayFromMediaId:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    invoke-virtual {v0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->AudioAttributesCompatParcelizer(II)V

    .line 4029
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPlayFromMediaId:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->handleMediaPlayPauseIfPendingOnHandler()Z

    move-result v0

    if-eqz v0, :cond_6f

    .line 4030
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPlayFromMediaId:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    .line 4031
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v2

    invoke-static {v2, v4}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v2

    .line 4032
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v3

    invoke-static {v3, v4}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v3

    .line 4030
    invoke-virtual {v0, v2, v3}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->IconCompatParcelizer(II)V

    .line 4033
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPrepareFromUri:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    iput-boolean v1, v0, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->MediaBrowserCompatItemReceiver:Z

    .line 4034
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->onMediaButtonEvent()V

    .line 4036
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPlayFromMediaId:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    invoke-virtual {v0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->AudioAttributesCompatParcelizer(II)V

    .line 4039
    :cond_6f
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result p1

    iput p1, p0, Landroidx/recyclerview/widget/RecyclerView;->_init_lambda2:I

    .line 4040
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result p1

    iput p1, p0, Landroidx/recyclerview/widget/RecyclerView;->r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0:I

    :cond_7b
    return-void

    .line 4042
    :cond_7c
    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Z

    if-eqz v0, :cond_86

    .line 4043
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPlayFromMediaId:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    invoke-virtual {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->write(II)V

    return-void

    .line 4047
    :cond_86
    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatMediaItem:Z

    if-eqz v0, :cond_b0

    .line 4048
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw()V

    .line 4049
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->MediaMetadataCompat()V

    .line 4050
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->onPrepare()V

    .line 4051
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->MediaSessionCompatQueueItem()V

    .line 4053
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPrepareFromUri:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    iget-boolean v0, v0, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->MediaMetadataCompat:Z

    if-eqz v0, :cond_a1

    .line 4054
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPrepareFromUri:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    iput-boolean v1, v0, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->IconCompatParcelizer:Z

    goto :goto_aa

    .line 4057
    :cond_a1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->MediaMetadataCompat:Lo/RegexDeserializer;

    invoke-virtual {v0}, Lo/RegexDeserializer;->write()V

    .line 4058
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPrepareFromUri:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    iput-boolean v2, v0, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->IconCompatParcelizer:Z

    .line 4060
    :goto_aa
    iput-boolean v2, p0, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatMediaItem:Z

    .line 4061
    invoke-direct {p0, v2}, Landroidx/recyclerview/widget/RecyclerView;->read(Z)V

    goto :goto_c2

    .line 4062
    :cond_b0
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPrepareFromUri:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    iget-boolean v0, v0, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->MediaMetadataCompat:Z

    if-eqz v0, :cond_c2

    .line 4068
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result p1

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->setMeasuredDimension(II)V

    return-void

    .line 4072
    :cond_c2
    :goto_c2
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatItemReceiver:Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;

    if-eqz v0, :cond_cf

    .line 4073
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->onPrepareFromUri:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;->getItemCount()I

    move-result v0

    iput v0, v1, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->AudioAttributesImplApi26Parcelizer:I

    goto :goto_d3

    .line 4075
    :cond_cf
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPrepareFromUri:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    iput v2, v0, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->AudioAttributesImplApi26Parcelizer:I

    .line 4077
    :goto_d3
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw()V

    .line 4078
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPlayFromMediaId:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    invoke-virtual {v0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->write(II)V

    .line 4079
    invoke-direct {p0, v2}, Landroidx/recyclerview/widget/RecyclerView;->read(Z)V

    .line 4080
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPrepareFromUri:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    iput-boolean v2, p0, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->IconCompatParcelizer:Z

    return-void
.end method

.method protected onRequestFocusInDescendants(ILandroid/graphics/Rect;)Z
    .registers 4

    .line 3375
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatMediaItem()Z

    move-result v0

    if-eqz v0, :cond_8

    const/4 p0, 0x0

    return p0

    .line 3380
    :cond_8
    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->onRequestFocusInDescendants(ILandroid/graphics/Rect;)Z

    move-result p0

    return p0
.end method

.method protected onRestoreInstanceState(Landroid/os/Parcelable;)V
    .registers 3

    .line 1528
    instance-of v0, p1, Landroidx/recyclerview/widget/RecyclerView$SavedState;

    if-nez v0, :cond_8

    .line 1529
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    return-void

    .line 1533
    :cond_8
    check-cast p1, Landroidx/recyclerview/widget/RecyclerView$SavedState;

    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->onPrepareFromMediaId:Landroidx/recyclerview/widget/RecyclerView$SavedState;

    .line 1534
    invoke-virtual {p1}, Landroidx/customview/view/AbsSavedState;->read()Landroid/os/Parcelable;

    move-result-object p1

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 1542
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method protected onSaveInstanceState()Landroid/os/Parcelable;
    .registers 3

    .line 1514
    new-instance v0, Landroidx/recyclerview/widget/RecyclerView$SavedState;

    invoke-super {p0}, Landroid/view/ViewGroup;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v1

    invoke-direct {v0, v1}, Landroidx/recyclerview/widget/RecyclerView$SavedState;-><init>(Landroid/os/Parcelable;)V

    .line 1515
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->onPrepareFromMediaId:Landroidx/recyclerview/widget/RecyclerView$SavedState;

    if-eqz v1, :cond_11

    .line 1516
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView$SavedState;->write(Landroidx/recyclerview/widget/RecyclerView$SavedState;)V

    return-object v0

    .line 1517
    :cond_11
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPlayFromMediaId:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    if-eqz p0, :cond_1c

    .line 1518
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onAddQueueItem()Landroid/os/Parcelable;

    move-result-object p0

    iput-object p0, v0, Landroidx/recyclerview/widget/RecyclerView$SavedState;->read:Landroid/os/Parcelable;

    return-object v0

    :cond_1c
    const/4 p0, 0x0

    .line 1520
    iput-object p0, v0, Landroidx/recyclerview/widget/RecyclerView$SavedState;->read:Landroid/os/Parcelable;

    return-object v0
.end method

.method protected onSizeChanged(IIII)V
    .registers 5

    .line 4103
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/ViewGroup;->onSizeChanged(IIII)V

    if-ne p1, p3, :cond_8

    if-ne p2, p4, :cond_8

    return-void

    .line 4105
    :cond_8
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->setSessionImpl()V

    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .registers 19

    move-object/from16 v6, p0

    move-object/from16 v7, p1

    .line 3751
    iget-boolean v0, v6, Landroidx/recyclerview/widget/RecyclerView;->onPlay:Z

    const/4 v8, 0x0

    if-nez v0, :cond_1ce

    iget-boolean v0, v6, Landroidx/recyclerview/widget/RecyclerView;->PlaybackStateCompatCustomAction:Z

    if-nez v0, :cond_1ce

    .line 3754
    invoke-direct/range {p0 .. p1}, Landroidx/recyclerview/widget/RecyclerView;->AudioAttributesCompatParcelizer(Landroid/view/MotionEvent;)Z

    move-result v0

    const/4 v9, 0x1

    if-eqz v0, :cond_18

    .line 3755
    invoke-direct/range {p0 .. p0}, Landroidx/recyclerview/widget/RecyclerView;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()V

    return v9

    .line 3759
    :cond_18
    iget-object v0, v6, Landroidx/recyclerview/widget/RecyclerView;->onPlayFromMediaId:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    if-nez v0, :cond_1d

    return v8

    .line 3763
    :cond_1d
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->AudioAttributesImplApi26Parcelizer()Z

    move-result v10

    .line 3764
    iget-object v0, v6, Landroidx/recyclerview/widget/RecyclerView;->onPlayFromMediaId:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->AudioAttributesImplApi21Parcelizer()Z

    move-result v11

    .line 3766
    iget-object v0, v6, Landroidx/recyclerview/widget/RecyclerView;->getSavedStateRegistry:Landroid/view/VelocityTracker;

    if-nez v0, :cond_31

    .line 3767
    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    move-result-object v0

    iput-object v0, v6, Landroidx/recyclerview/widget/RecyclerView;->getSavedStateRegistry:Landroid/view/VelocityTracker;

    .line 3771
    :cond_31
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    .line 3772
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getActionIndex()I

    move-result v1

    if-nez v0, :cond_41

    .line 3775
    iget-object v2, v6, Landroidx/recyclerview/widget/RecyclerView;->ensureViewModelStore:[I

    aput v8, v2, v9

    aput v8, v2, v8

    .line 3777
    :cond_41
    invoke-static/range {p1 .. p1}, Landroid/view/MotionEvent;->obtain(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    move-result-object v12

    .line 3778
    iget-object v2, v6, Landroidx/recyclerview/widget/RecyclerView;->ensureViewModelStore:[I

    aget v3, v2, v8

    int-to-float v3, v3

    aget v2, v2, v9

    int-to-float v2, v2

    invoke-virtual {v12, v3, v2}, Landroid/view/MotionEvent;->offsetLocation(FF)V

    const/high16 v2, 0x3f000000    # 0.5f

    if-eqz v0, :cond_1a4

    if-eq v0, v9, :cond_163

    const/4 v3, 0x2

    if-eq v0, v3, :cond_88

    const/4 v3, 0x3

    if-eq v0, v3, :cond_83

    const/4 v3, 0x5

    if-eq v0, v3, :cond_67

    const/4 v1, 0x6

    if-ne v0, v1, :cond_1c5

    .line 3881
    invoke-direct/range {p0 .. p1}, Landroidx/recyclerview/widget/RecyclerView;->write(Landroid/view/MotionEvent;)V

    goto/16 :goto_1c5

    .line 3798
    :cond_67
    invoke-virtual {v7, v1}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v0

    iput v0, v6, Landroidx/recyclerview/widget/RecyclerView;->getDefaultViewModelCreationExtras:I

    .line 3799
    invoke-virtual {v7, v1}, Landroid/view/MotionEvent;->getX(I)F

    move-result v0

    add-float/2addr v0, v2

    float-to-int v0, v0

    iput v0, v6, Landroidx/recyclerview/widget/RecyclerView;->accessaddObserverForBackInvoker:I

    iput v0, v6, Landroidx/recyclerview/widget/RecyclerView;->ResultReceiver:I

    .line 3800
    invoke-virtual {v7, v1}, Landroid/view/MotionEvent;->getY(I)F

    move-result v0

    add-float/2addr v0, v2

    float-to-int v0, v0

    iput v0, v6, Landroidx/recyclerview/widget/RecyclerView;->accessgetReportFullyDrawnExecutorp:I

    iput v0, v6, Landroidx/recyclerview/widget/RecyclerView;->r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM:I

    goto/16 :goto_1c5

    .line 3901
    :cond_83
    invoke-direct/range {p0 .. p0}, Landroidx/recyclerview/widget/RecyclerView;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()V

    goto/16 :goto_1c5

    .line 3805
    :cond_88
    iget v0, v6, Landroidx/recyclerview/widget/RecyclerView;->getDefaultViewModelCreationExtras:I

    invoke-virtual {v7, v0}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v0

    if-gez v0, :cond_91

    return v8

    .line 3812
    :cond_91
    invoke-virtual {v7, v0}, Landroid/view/MotionEvent;->getX(I)F

    move-result v1

    add-float/2addr v1, v2

    float-to-int v13, v1

    .line 3813
    invoke-virtual {v7, v0}, Landroid/view/MotionEvent;->getY(I)F

    move-result v0

    add-float/2addr v0, v2

    float-to-int v14, v0

    .line 3814
    iget v0, v6, Landroidx/recyclerview/widget/RecyclerView;->accessaddObserverForBackInvoker:I

    sub-int/2addr v0, v13

    .line 3815
    iget v1, v6, Landroidx/recyclerview/widget/RecyclerView;->accessgetReportFullyDrawnExecutorp:I

    sub-int/2addr v1, v14

    .line 3817
    iget v2, v6, Landroidx/recyclerview/widget/RecyclerView;->addOnTrimMemoryListener:I

    if-eq v2, v9, :cond_da

    if-eqz v10, :cond_be

    if-lez v0, :cond_b3

    .line 3821
    iget v2, v6, Landroidx/recyclerview/widget/RecyclerView;->getLastCustomNonConfigurationInstance:I

    sub-int/2addr v0, v2

    invoke-static {v8, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    goto :goto_ba

    .line 3823
    :cond_b3
    iget v2, v6, Landroidx/recyclerview/widget/RecyclerView;->getLastCustomNonConfigurationInstance:I

    add-int/2addr v0, v2

    invoke-static {v8, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    :goto_ba
    if-eqz v0, :cond_be

    move v2, v9

    goto :goto_bf

    :cond_be
    move v2, v8

    :goto_bf
    if-eqz v11, :cond_d5

    if-lez v1, :cond_cb

    .line 3831
    iget v3, v6, Landroidx/recyclerview/widget/RecyclerView;->getLastCustomNonConfigurationInstance:I

    sub-int/2addr v1, v3

    invoke-static {v8, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    goto :goto_d2

    .line 3833
    :cond_cb
    iget v3, v6, Landroidx/recyclerview/widget/RecyclerView;->getLastCustomNonConfigurationInstance:I

    add-int/2addr v1, v3

    invoke-static {v8, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    :goto_d2
    if-eqz v1, :cond_d5

    move v2, v9

    :cond_d5
    if-eqz v2, :cond_da

    .line 3840
    invoke-virtual {v6, v9}, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatItemReceiver(I)V

    .line 3844
    :cond_da
    iget v2, v6, Landroidx/recyclerview/widget/RecyclerView;->addOnTrimMemoryListener:I

    if-ne v2, v9, :cond_1c5

    .line 3845
    iget-object v2, v6, Landroidx/recyclerview/widget/RecyclerView;->onRemoveQueueItem:[I

    aput v8, v2, v8

    .line 3846
    aput v8, v2, v9

    .line 3847
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getY()F

    move-result v2

    invoke-direct {v6, v0, v2}, Landroidx/recyclerview/widget/RecyclerView;->read(IF)I

    move-result v2

    sub-int v15, v0, v2

    .line 3848
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    invoke-direct {v6, v1, v0}, Landroidx/recyclerview/widget/RecyclerView;->write(IF)I

    move-result v0

    sub-int v16, v1, v0

    if-eqz v10, :cond_fc

    move v1, v15

    goto :goto_fd

    :cond_fc
    move v1, v8

    :goto_fd
    if-eqz v11, :cond_102

    move/from16 v2, v16

    goto :goto_103

    :cond_102
    move v2, v8

    .line 3852
    :goto_103
    iget-object v3, v6, Landroidx/recyclerview/widget/RecyclerView;->onRemoveQueueItem:[I

    iget-object v4, v6, Landroidx/recyclerview/widget/RecyclerView;->getActivityResultRegistry:[I

    const/4 v5, 0x0

    move-object/from16 v0, p0

    .line 3850
    invoke-virtual/range {v0 .. v5}, Landroidx/recyclerview/widget/RecyclerView;->write(II[I[II)Z

    move-result v0

    if-eqz v0, :cond_132

    .line 3855
    iget-object v0, v6, Landroidx/recyclerview/widget/RecyclerView;->onRemoveQueueItem:[I

    aget v1, v0, v8

    sub-int/2addr v15, v1

    .line 3856
    aget v0, v0, v9

    sub-int v16, v16, v0

    .line 3858
    iget-object v0, v6, Landroidx/recyclerview/widget/RecyclerView;->ensureViewModelStore:[I

    aget v1, v0, v8

    iget-object v2, v6, Landroidx/recyclerview/widget/RecyclerView;->getActivityResultRegistry:[I

    aget v3, v2, v8

    add-int/2addr v1, v3

    aput v1, v0, v8

    .line 3859
    aget v1, v0, v9

    aget v2, v2, v9

    add-int/2addr v1, v2

    aput v1, v0, v9

    .line 3861
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    invoke-interface {v0, v9}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    :cond_132
    move/from16 v0, v16

    .line 3864
    iget-object v1, v6, Landroidx/recyclerview/widget/RecyclerView;->getActivityResultRegistry:[I

    aget v2, v1, v8

    sub-int/2addr v13, v2

    iput v13, v6, Landroidx/recyclerview/widget/RecyclerView;->accessaddObserverForBackInvoker:I

    .line 3865
    aget v1, v1, v9

    sub-int/2addr v14, v1

    iput v14, v6, Landroidx/recyclerview/widget/RecyclerView;->accessgetReportFullyDrawnExecutorp:I

    if-eqz v10, :cond_144

    move v1, v15

    goto :goto_145

    :cond_144
    move v1, v8

    :goto_145
    if-eqz v11, :cond_149

    move v2, v0

    goto :goto_14a

    :cond_149
    move v2, v8

    .line 3867
    :goto_14a
    invoke-direct {v6, v1, v2, v7, v8}, Landroidx/recyclerview/widget/RecyclerView;->write(IILandroid/view/MotionEvent;I)Z

    move-result v1

    if-eqz v1, :cond_157

    .line 3871
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    invoke-interface {v1, v9}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 3873
    :cond_157
    iget-object v1, v6, Landroidx/recyclerview/widget/RecyclerView;->onAddQueueItem:Lo/SingletonSupport;

    if-eqz v1, :cond_1c5

    if-nez v15, :cond_15f

    if-eqz v0, :cond_1c5

    .line 3874
    :cond_15f
    invoke-virtual {v1, v6, v15, v0}, Lo/SingletonSupport;->AudioAttributesCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView;II)V

    goto :goto_1c5

    .line 3886
    :cond_163
    iget-object v0, v6, Landroidx/recyclerview/widget/RecyclerView;->getSavedStateRegistry:Landroid/view/VelocityTracker;

    invoke-virtual {v0, v12}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 3888
    iget-object v0, v6, Landroidx/recyclerview/widget/RecyclerView;->getSavedStateRegistry:Landroid/view/VelocityTracker;

    iget v1, v6, Landroidx/recyclerview/widget/RecyclerView;->createFullyDrawnExecutor:I

    int-to-float v1, v1

    const/16 v2, 0x3e8

    invoke-virtual {v0, v2, v1}, Landroid/view/VelocityTracker;->computeCurrentVelocity(IF)V

    const/4 v0, 0x0

    if-eqz v10, :cond_17f

    .line 3890
    iget-object v1, v6, Landroidx/recyclerview/widget/RecyclerView;->getSavedStateRegistry:Landroid/view/VelocityTracker;

    iget v2, v6, Landroidx/recyclerview/widget/RecyclerView;->getDefaultViewModelCreationExtras:I

    invoke-virtual {v1, v2}, Landroid/view/VelocityTracker;->getXVelocity(I)F

    move-result v1

    neg-float v1, v1

    goto :goto_180

    :cond_17f
    move v1, v0

    :goto_180
    if-eqz v11, :cond_18c

    .line 3892
    iget-object v2, v6, Landroidx/recyclerview/widget/RecyclerView;->getSavedStateRegistry:Landroid/view/VelocityTracker;

    iget v3, v6, Landroidx/recyclerview/widget/RecyclerView;->getDefaultViewModelCreationExtras:I

    invoke-virtual {v2, v3}, Landroid/view/VelocityTracker;->getYVelocity(I)F

    move-result v2

    neg-float v2, v2

    goto :goto_18d

    :cond_18c
    move v2, v0

    :goto_18d
    cmpl-float v3, v1, v0

    if-nez v3, :cond_195

    cmpl-float v0, v2, v0

    if-eqz v0, :cond_19d

    :cond_195
    float-to-int v0, v1

    float-to-int v1, v2

    .line 3893
    invoke-direct {v6, v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->AudioAttributesImplApi21Parcelizer(II)Z

    move-result v0

    if-nez v0, :cond_1a0

    .line 3894
    :cond_19d
    invoke-virtual {v6, v8}, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatItemReceiver(I)V

    .line 3896
    :cond_1a0
    invoke-direct/range {p0 .. p0}, Landroidx/recyclerview/widget/RecyclerView;->onRemoveQueueItem()V

    goto :goto_1ca

    .line 3782
    :cond_1a4
    invoke-virtual {v7, v8}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v0

    iput v0, v6, Landroidx/recyclerview/widget/RecyclerView;->getDefaultViewModelCreationExtras:I

    .line 3783
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    add-float/2addr v0, v2

    float-to-int v0, v0

    iput v0, v6, Landroidx/recyclerview/widget/RecyclerView;->accessaddObserverForBackInvoker:I

    iput v0, v6, Landroidx/recyclerview/widget/RecyclerView;->ResultReceiver:I

    .line 3784
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    add-float/2addr v0, v2

    float-to-int v0, v0

    iput v0, v6, Landroidx/recyclerview/widget/RecyclerView;->accessgetReportFullyDrawnExecutorp:I

    iput v0, v6, Landroidx/recyclerview/widget/RecyclerView;->r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM:I

    if-eqz v11, :cond_1c2

    or-int/lit8 v10, v10, 0x2

    .line 3793
    :cond_1c2
    invoke-direct {v6, v10, v8}, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatMediaItem(II)Z

    .line 3907
    :cond_1c5
    :goto_1c5
    iget-object v0, v6, Landroidx/recyclerview/widget/RecyclerView;->getSavedStateRegistry:Landroid/view/VelocityTracker;

    invoke-virtual {v0, v12}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 3909
    :goto_1ca
    invoke-virtual {v12}, Landroid/view/MotionEvent;->recycle()V

    return v9

    :cond_1ce
    return v8
.end method

.method final read(I)I
    .registers 4

    .line 2870
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->getFullyDrawnReporter:Landroid/widget/EdgeEffect;

    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->onSkipToQueueItem:Landroid/widget/EdgeEffect;

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result p0

    invoke-static {p1, v0, v1, p0}, Landroidx/recyclerview/widget/RecyclerView;->write(ILandroid/widget/EdgeEffect;Landroid/widget/EdgeEffect;I)I

    move-result p0

    return p0
.end method

.method final read()V
    .registers 4

    .line 2074
    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onCustomAction:Z

    const-string v1, "RV FullInvalidate"

    if-eqz v0, :cond_65

    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->RatingCompat:Z

    if-nez v0, :cond_65

    .line 2080
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->MediaMetadataCompat:Lo/RegexDeserializer;

    invoke-virtual {v0}, Lo/RegexDeserializer;->read()Z

    move-result v0

    if-eqz v0, :cond_64

    .line 2086
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->MediaMetadataCompat:Lo/RegexDeserializer;

    const/4 v2, 0x4

    invoke-virtual {v0, v2}, Lo/RegexDeserializer;->read(I)Z

    move-result v0

    if-eqz v0, :cond_53

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->MediaMetadataCompat:Lo/RegexDeserializer;

    const/16 v2, 0xb

    .line 2087
    invoke-virtual {v0, v2}, Lo/RegexDeserializer;->read(I)Z

    move-result v0

    if-nez v0, :cond_53

    .line 2089
    const-string v0, "RV PartialInvalidate"

    invoke-static {v0}, Lo/constructDelegatingKeyDeserializer;->read(Ljava/lang/String;)V

    .line 2090
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw()V

    .line 2091
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->MediaMetadataCompat()V

    .line 2092
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->MediaMetadataCompat:Lo/RegexDeserializer;

    invoke-virtual {v0}, Lo/RegexDeserializer;->RemoteActionCompatParcelizer()V

    .line 2093
    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPrepare:Z

    if-nez v0, :cond_48

    .line 2094
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->onPlay()Z

    move-result v0

    if-eqz v0, :cond_43

    .line 2095
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->onSetRating()V

    goto :goto_48

    .line 2098
    :cond_43
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->MediaMetadataCompat:Lo/RegexDeserializer;

    invoke-virtual {v0}, Lo/RegexDeserializer;->IconCompatParcelizer()V

    :cond_48
    :goto_48
    const/4 v0, 0x1

    .line 2101
    invoke-direct {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->read(Z)V

    .line 2102
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->MediaSessionCompatQueueItem()V

    .line 2103
    invoke-static {}, Lo/constructDelegatingKeyDeserializer;->RemoteActionCompatParcelizer()V

    return-void

    .line 2104
    :cond_53
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->MediaMetadataCompat:Lo/RegexDeserializer;

    invoke-virtual {v0}, Lo/RegexDeserializer;->read()Z

    move-result v0

    if-eqz v0, :cond_64

    .line 2105
    invoke-static {v1}, Lo/constructDelegatingKeyDeserializer;->read(Ljava/lang/String;)V

    .line 2106
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->onSetRating()V

    .line 2107
    invoke-static {}, Lo/constructDelegatingKeyDeserializer;->RemoteActionCompatParcelizer()V

    :cond_64
    return-void

    .line 2075
    :cond_65
    invoke-static {v1}, Lo/constructDelegatingKeyDeserializer;->read(Ljava/lang/String;)V

    .line 2076
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->onSetRating()V

    .line 2077
    invoke-static {}, Lo/constructDelegatingKeyDeserializer;->RemoteActionCompatParcelizer()V

    return-void
.end method

.method final read(II)V
    .registers 8

    .line 5114
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatSearchResultReceiver:Lo/TypesKt;

    invoke-virtual {v0}, Lo/TypesKt;->RemoteActionCompatParcelizer()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_8
    if-ge v2, v0, :cond_34

    .line 5116
    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatSearchResultReceiver:Lo/TypesKt;

    invoke-virtual {v3, v2}, Lo/TypesKt;->AudioAttributesCompatParcelizer(I)Landroid/view/View;

    move-result-object v3

    invoke-static {v3}, Landroidx/recyclerview/widget/RecyclerView;->IconCompatParcelizer(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;

    move-result-object v3

    if-eqz v3, :cond_31

    .line 5117
    invoke-virtual {v3}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->shouldIgnore()Z

    move-result v4

    if-nez v4, :cond_31

    iget v4, v3, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mPosition:I

    if-lt v4, p1, :cond_31

    .line 5118
    sget-boolean v4, Landroidx/recyclerview/widget/RecyclerView;->AudioAttributesImplBaseParcelizer:Z

    if-eqz v4, :cond_29

    .line 5119
    invoke-static {v3}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    iget v4, v3, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mPosition:I

    .line 5122
    :cond_29
    invoke-virtual {v3, p2, v1}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->offsetPosition(IZ)V

    .line 5123
    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView;->onPrepareFromUri:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    const/4 v4, 0x1

    iput-boolean v4, v3, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->RatingCompat:Z

    :cond_31
    add-int/lit8 v2, v2, 0x1

    goto :goto_8

    .line 5126
    :cond_34
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onRemoveQueueItemAt:Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;

    invoke-virtual {v0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->AudioAttributesCompatParcelizer(II)V

    .line 5127
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method final read(IIZ)V
    .registers 10

    .line 5133
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatSearchResultReceiver:Lo/TypesKt;

    invoke-virtual {v0}, Lo/TypesKt;->RemoteActionCompatParcelizer()I

    move-result v0

    const/4 v1, 0x0

    :goto_7
    if-ge v1, v0, :cond_4c

    .line 5135
    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatSearchResultReceiver:Lo/TypesKt;

    invoke-virtual {v2, v1}, Lo/TypesKt;->AudioAttributesCompatParcelizer(I)Landroid/view/View;

    move-result-object v2

    invoke-static {v2}, Landroidx/recyclerview/widget/RecyclerView;->IconCompatParcelizer(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;

    move-result-object v2

    if-eqz v2, :cond_49

    .line 5136
    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->shouldIgnore()Z

    move-result v3

    if-nez v3, :cond_49

    .line 5137
    iget v3, v2, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mPosition:I

    add-int v4, p1, p2

    const/4 v5, 0x1

    if-lt v3, v4, :cond_34

    .line 5138
    sget-boolean v3, Landroidx/recyclerview/widget/RecyclerView;->AudioAttributesImplBaseParcelizer:Z

    if-eqz v3, :cond_2b

    .line 5139
    invoke-static {v2}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    iget v3, v2, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mPosition:I

    :cond_2b
    neg-int v3, p2

    .line 5143
    invoke-virtual {v2, v3, p3}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->offsetPosition(IZ)V

    .line 5144
    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView;->onPrepareFromUri:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    iput-boolean v5, v2, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->RatingCompat:Z

    goto :goto_49

    .line 5145
    :cond_34
    iget v3, v2, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mPosition:I

    if-lt v3, p1, :cond_49

    .line 5146
    sget-boolean v3, Landroidx/recyclerview/widget/RecyclerView;->AudioAttributesImplBaseParcelizer:Z

    if-eqz v3, :cond_3f

    .line 5147
    invoke-static {v2}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_3f
    neg-int v3, p2

    add-int/lit8 v4, p1, -0x1

    .line 5150
    invoke-virtual {v2, v4, v3, p3}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->flagRemovedAndOffsetPosition(IIZ)V

    .line 5152
    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView;->onPrepareFromUri:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    iput-boolean v5, v2, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->RatingCompat:Z

    :cond_49
    :goto_49
    add-int/lit8 v1, v1, 0x1

    goto :goto_7

    .line 5156
    :cond_4c
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onRemoveQueueItemAt:Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;

    invoke-virtual {v0, p1, p2, p3}, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->read(IIZ)V

    .line 5157
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method final read(Landroid/view/View;)V
    .registers 4

    .line 8374
    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->IconCompatParcelizer(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;

    move-result-object v0

    .line 8375
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->AudioAttributesImplApi26Parcelizer(Landroid/view/View;)V

    .line 8376
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatItemReceiver:Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;

    if-eqz v1, :cond_10

    if-eqz v0, :cond_10

    .line 8377
    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;->onViewAttachedToWindow(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;)V

    .line 8379
    :cond_10
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->getOnBackPressedDispatcherannotations:Ljava/util/List;

    if-eqz v0, :cond_2a

    .line 8380
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_1a
    if-ltz v0, :cond_2a

    .line 8382
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->getOnBackPressedDispatcherannotations:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi21Parcelizer;

    invoke-interface {v1, p1}, Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi21Parcelizer;->RemoteActionCompatParcelizer(Landroid/view/View;)V

    add-int/lit8 v0, v0, -0x1

    goto :goto_1a

    :cond_2a
    return-void
.end method

.method public final read(Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi21Parcelizer;)V
    .registers 3

    .line 1407
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->getOnBackPressedDispatcherannotations:Ljava/util/List;

    if-nez v0, :cond_b

    .line 1408
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->getOnBackPressedDispatcherannotations:Ljava/util/List;

    .line 1410
    :cond_b
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView;->getOnBackPressedDispatcherannotations:Ljava/util/List;

    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method final read(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer$write;)V
    .registers 6

    const/4 v0, 0x0

    const/16 v1, 0x2000

    .line 4801
    invoke-virtual {p1, v0, v1}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->setFlags(II)V

    .line 4802
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPrepareFromUri:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    iget-boolean v0, v0, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Z

    if-eqz v0, :cond_27

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->isUpdated()Z

    move-result v0

    if-eqz v0, :cond_27

    .line 4803
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->isRemoved()Z

    move-result v0

    if-nez v0, :cond_27

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->shouldIgnore()Z

    move-result v0

    if-nez v0, :cond_27

    .line 4804
    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->AudioAttributesCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;)J

    move-result-wide v0

    .line 4805
    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView;->onSetRating:Lo/UIntSerializer;

    invoke-virtual {v2, v0, v1, p1}, Lo/UIntSerializer;->write(JLandroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;)V

    .line 4807
    :cond_27
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView;->onSetRating:Lo/UIntSerializer;

    invoke-virtual {p0, p1, p2}, Lo/UIntSerializer;->IconCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer$write;)V

    return-void
.end method

.method final read(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;I)Z
    .registers 4

    .line 12374
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatMediaItem()Z

    move-result v0

    if-eqz v0, :cond_f

    .line 12375
    iput p2, p1, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mPendingAccessibilityState:I

    .line 12376
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPrepareFromSearch:Ljava/util/List;

    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/4 p0, 0x0

    return p0

    .line 12379
    :cond_f
    iget-object p0, p1, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->itemView:Landroid/view/View;

    invoke-static {p0, p2}, Lo/InvalidTypeIdException;->AudioAttributesImplBaseParcelizer(Landroid/view/View;I)V

    const/4 p0, 0x1

    return p0
.end method

.method protected removeDetachedView(Landroid/view/View;Z)V
    .registers 5

    .line 4844
    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->IconCompatParcelizer(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;

    move-result-object v0

    if-eqz v0, :cond_32

    .line 4846
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->isTmpDetached()Z

    move-result v1

    if-eqz v1, :cond_10

    .line 4847
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->clearTmpDetachFlag()V

    goto :goto_36

    .line 4848
    :cond_10
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->shouldIgnore()Z

    move-result v1

    if-eqz v1, :cond_17

    goto :goto_36

    .line 4849
    :cond_17
    new-instance p1, Ljava/lang/StringBuilder;

    const-string p2, "Called removeDetachedView with a view which is not flagged as tmp detached."

    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 4850
    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->write()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p2, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 4853
    :cond_32
    sget-boolean v0, Landroidx/recyclerview/widget/RecyclerView;->AudioAttributesImplApi26Parcelizer:Z

    if-nez v0, :cond_40

    .line 4862
    :goto_36
    invoke-virtual {p1}, Landroid/view/View;->clearAnimation()V

    .line 4864
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->RemoteActionCompatParcelizer(Landroid/view/View;)V

    .line 4865
    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->removeDetachedView(Landroid/view/View;Z)V

    return-void

    .line 4854
    :cond_40
    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "No ViewHolder found for child: "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 4855
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->write()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public requestChildFocus(Landroid/view/View;Landroid/view/View;)V
    .registers 4

    .line 3317
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPlayFromMediaId:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    invoke-virtual {v0, p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->write(Landroidx/recyclerview/widget/RecyclerView;)Z

    move-result v0

    if-nez v0, :cond_d

    if-eqz p2, :cond_d

    .line 3318
    invoke-direct {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->read(Landroid/view/View;Landroid/view/View;)V

    .line 3320
    :cond_d
    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->requestChildFocus(Landroid/view/View;Landroid/view/View;)V

    return-void
.end method

.method public requestChildRectangleOnScreen(Landroid/view/View;Landroid/graphics/Rect;Z)Z
    .registers 5

    .line 3363
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPlayFromMediaId:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    invoke-virtual {v0, p0, p1, p2, p3}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->IconCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;Landroid/graphics/Rect;Z)Z

    move-result p0

    return p0
.end method

.method public requestDisallowInterceptTouchEvent(Z)V
    .registers 5

    .line 3741
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->menuHostHelperlambda0:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_7
    if-ge v1, v0, :cond_14

    .line 3743
    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView;->menuHostHelperlambda0:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatMediaItem;

    add-int/lit8 v1, v1, 0x1

    goto :goto_7

    .line 3746
    :cond_14
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->requestDisallowInterceptTouchEvent(Z)V

    return-void
.end method

.method public requestLayout()V
    .registers 2

    .line 4926
    iget v0, p0, Landroidx/recyclerview/widget/RecyclerView;->r8lambdaKUbBm7ckfqTc9QCgukC86fguu4:I

    if-nez v0, :cond_c

    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPlay:Z

    if-nez v0, :cond_c

    .line 4927
    invoke-super {p0}, Landroid/view/ViewGroup;->requestLayout()V

    return-void

    :cond_c
    const/4 v0, 0x1

    .line 4929
    iput-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPrepare:Z

    return-void
.end method

.method public scrollBy(II)V
    .registers 6

    .line 1941
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPlayFromMediaId:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    if-nez v0, :cond_5

    return-void

    .line 1946
    :cond_5
    iget-boolean v1, p0, Landroidx/recyclerview/widget/RecyclerView;->onPlay:Z

    if-nez v1, :cond_23

    .line 1949
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->AudioAttributesImplApi26Parcelizer()Z

    move-result v0

    .line 1950
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->onPlayFromMediaId:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->AudioAttributesImplApi21Parcelizer()Z

    move-result v1

    if-nez v0, :cond_18

    if-nez v1, :cond_18

    goto :goto_23

    :cond_18
    const/4 v2, 0x0

    if-nez v0, :cond_1c

    move p1, v2

    :cond_1c
    if-nez v1, :cond_1f

    move p2, v2

    :cond_1f
    const/4 v0, 0x0

    .line 1952
    invoke-direct {p0, p1, p2, v0, v2}, Landroidx/recyclerview/widget/RecyclerView;->write(IILandroid/view/MotionEvent;I)Z

    :cond_23
    :goto_23
    return-void
.end method

.method public scrollTo(II)V
    .registers 3

    return-void
.end method

.method public sendAccessibilityEventUnchecked(Landroid/view/accessibility/AccessibilityEvent;)V
    .registers 3

    .line 4218
    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->AudioAttributesCompatParcelizer(Landroid/view/accessibility/AccessibilityEvent;)Z

    move-result v0

    if-eqz v0, :cond_7

    return-void

    .line 4221
    :cond_7
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->sendAccessibilityEventUnchecked(Landroid/view/accessibility/AccessibilityEvent;)V

    return-void
.end method

.method public setAccessibilityDelegateCompat(Lo/UIntKeyDeserializer;)V
    .registers 2

    .line 862
    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->AudioAttributesImplApi21Parcelizer:Lo/UIntKeyDeserializer;

    .line 863
    invoke-static {p0, p1}, Lo/InvalidTypeIdException;->AudioAttributesCompatParcelizer(Landroid/view/View;Lo/deserializeUsingCustom;)V

    return-void
.end method

.method public setAdapter(Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;)V
    .registers 4

    const/4 v0, 0x0

    .line 1265
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutFrozen(Z)V

    const/4 v1, 0x1

    .line 1266
    invoke-direct {p0, p1, v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->read(Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;ZZ)V

    .line 1267
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->IconCompatParcelizer(Z)V

    .line 1268
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public setChildDrawingOrderCallback(Landroidx/recyclerview/widget/RecyclerView$write;)V
    .registers 3

    .line 1816
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->ParcelableVolumeInfo:Landroidx/recyclerview/widget/RecyclerView$write;

    if-ne p1, v0, :cond_5

    return-void

    .line 1819
    :cond_5
    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->ParcelableVolumeInfo:Landroidx/recyclerview/widget/RecyclerView$write;

    if-eqz p1, :cond_b

    const/4 p1, 0x1

    goto :goto_c

    :cond_b
    const/4 p1, 0x0

    .line 1820
    :goto_c
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->setChildrenDrawingOrderEnabled(Z)V

    return-void
.end method

.method public setClipToPadding(Z)V
    .registers 3

    .line 1180
    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->MediaDescriptionCompat:Z

    if-eq p1, v0, :cond_7

    .line 1181
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->setSessionImpl()V

    .line 1183
    :cond_7
    iput-boolean p1, p0, Landroidx/recyclerview/widget/RecyclerView;->MediaDescriptionCompat:Z

    .line 1184
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    .line 1185
    iget-boolean p1, p0, Landroidx/recyclerview/widget/RecyclerView;->onCustomAction:Z

    if-eqz p1, :cond_13

    .line 1186
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    :cond_13
    return-void
.end method

.method public setEdgeEffectFactory(Landroidx/recyclerview/widget/RecyclerView$RemoteActionCompatParcelizer;)V
    .registers 2

    .line 3124
    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->MediaSessionCompatQueueItem:Landroidx/recyclerview/widget/RecyclerView$RemoteActionCompatParcelizer;

    .line 3125
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->setSessionImpl()V

    return-void
.end method

.method public setHasFixedSize(Z)V
    .registers 2

    .line 1167
    iput-boolean p1, p0, Landroidx/recyclerview/widget/RecyclerView;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Z

    return-void
.end method

.method public setItemAnimator(Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer;)V
    .registers 4

    .line 4122
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onCommand:Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer;

    if-eqz v0, :cond_d

    .line 4123
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer;->write()V

    .line 4124
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onCommand:Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer;->RemoteActionCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer$read;)V

    .line 4126
    :cond_d
    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->onCommand:Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer;

    if-eqz p1, :cond_16

    .line 4128
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView;->r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28:Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer$read;

    invoke-virtual {p1, p0}, Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer;->RemoteActionCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer$read;)V

    :cond_16
    return-void
.end method

.method public setItemViewCacheSize(I)V
    .registers 2

    .line 1665
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView;->onRemoveQueueItemAt:Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->write(I)V

    return-void
.end method

.method public setLayoutFrozen(Z)V
    .registers 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 2559
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->suppressLayout(Z)V

    return-void
.end method

.method public setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;)V
    .registers 4

    .line 1449
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPlayFromMediaId:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    if-ne p1, v0, :cond_5

    return-void

    .line 1452
    :cond_5
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->ResultReceiver()V

    .line 1455
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPlayFromMediaId:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    if-eqz v0, :cond_3a

    .line 1457
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onCommand:Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer;

    if-eqz v0, :cond_13

    .line 1458
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer;->write()V

    .line 1460
    :cond_13
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPlayFromMediaId:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->onRemoveQueueItemAt:Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->RemoteActionCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;)V

    .line 1461
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPlayFromMediaId:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->onRemoveQueueItemAt:Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->read(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;)V

    .line 1462
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onRemoveQueueItemAt:Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->write()V

    .line 1464
    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->handleMediaPlayPauseIfPendingOnHandler:Z

    if-eqz v0, :cond_31

    .line 1465
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPlayFromMediaId:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->onRemoveQueueItemAt:Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;

    invoke-virtual {v0, p0, v1}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->RemoteActionCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;)V

    .line 1467
    :cond_31
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPlayFromMediaId:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->read(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 1468
    iput-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->onPlayFromMediaId:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    goto :goto_3f

    .line 1470
    :cond_3a
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onRemoveQueueItemAt:Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->write()V

    .line 1473
    :goto_3f
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatSearchResultReceiver:Lo/TypesKt;

    invoke-virtual {v0}, Lo/TypesKt;->AudioAttributesCompatParcelizer()V

    .line 1474
    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->onPlayFromMediaId:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    if-eqz p1, :cond_7d

    .line 1476
    iget-object v0, p1, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaBrowserCompatMediaItem:Landroidx/recyclerview/widget/RecyclerView;

    if-nez v0, :cond_5b

    .line 1481
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->onPlayFromMediaId:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    invoke-virtual {p1, p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->read(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 1482
    iget-boolean p1, p0, Landroidx/recyclerview/widget/RecyclerView;->handleMediaPlayPauseIfPendingOnHandler:Z

    if-eqz p1, :cond_7d

    .line 1483
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->onPlayFromMediaId:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    invoke-virtual {p1, p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->RemoteActionCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView;)V

    goto :goto_7d

    .line 1477
    :cond_5b
    new-instance p0, Ljava/lang/StringBuilder;

    const-string v0, "LayoutManager "

    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " is already attached to a RecyclerView:"

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaBrowserCompatMediaItem:Landroidx/recyclerview/widget/RecyclerView;

    .line 1479
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->write()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1486
    :cond_7d
    :goto_7d
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->onRemoveQueueItemAt:Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->RatingCompat()V

    .line 1487
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public setLayoutTransition(Landroid/animation/LayoutTransition;)V
    .registers 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    if-nez p1, :cond_7

    const/4 p1, 0x0

    .line 2598
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->setLayoutTransition(Landroid/animation/LayoutTransition;)V

    return-void

    .line 2600
    :cond_7
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public setNestedScrollingEnabled(Z)V
    .registers 2

    .line 12432
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->onPause()Lo/rootObjectScope;

    move-result-object p0

    invoke-virtual {p0, p1}, Lo/rootObjectScope;->write(Z)V

    return-void
.end method

.method public setOnFlingListener(Landroidx/recyclerview/widget/RecyclerView$RatingCompat;)V
    .registers 2

    .line 1499
    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->addMenuProvider:Landroidx/recyclerview/widget/RecyclerView$RatingCompat;

    return-void
.end method

.method public setOnScrollListener(Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatSearchResultReceiver;)V
    .registers 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1832
    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->addOnConfigurationChangedListener:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatSearchResultReceiver;

    return-void
.end method

.method public setPreserveFocusAfterLayout(Z)V
    .registers 2

    .line 5273
    iput-boolean p1, p0, Landroidx/recyclerview/widget/RecyclerView;->getSavedStateRegistryControllerannotations:Z

    return-void
.end method

.method public setRecycledViewPool(Landroidx/recyclerview/widget/RecyclerView$MediaMetadataCompat;)V
    .registers 2

    .line 1640
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView;->onRemoveQueueItemAt:Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->AudioAttributesCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaMetadataCompat;)V

    return-void
.end method

.method public setRecyclerListener(Landroidx/recyclerview/widget/RecyclerView$onAddQueueItem;)V
    .registers 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1349
    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->onSeekTo:Landroidx/recyclerview/widget/RecyclerView$onAddQueueItem;

    return-void
.end method

.method public setScrollingTouchSlop(I)V
    .registers 4

    .line 1216
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object v0

    if-eqz p1, :cond_15

    const/4 v1, 0x1

    if-eq p1, v1, :cond_e

    goto :goto_15

    .line 1227
    :cond_e
    invoke-virtual {v0}, Landroid/view/ViewConfiguration;->getScaledPagingTouchSlop()I

    move-result p1

    iput p1, p0, Landroidx/recyclerview/widget/RecyclerView;->getLastCustomNonConfigurationInstance:I

    return-void

    .line 1223
    :cond_15
    :goto_15
    invoke-virtual {v0}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result p1

    iput p1, p0, Landroidx/recyclerview/widget/RecyclerView;->getLastCustomNonConfigurationInstance:I

    return-void
.end method

.method public setViewCacheExtension(Landroidx/recyclerview/widget/RecyclerView$onPlayFromMediaId;)V
    .registers 2

    .line 1650
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView;->onRemoveQueueItemAt:Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->read(Landroidx/recyclerview/widget/RecyclerView$onPlayFromMediaId;)V

    return-void
.end method

.method public startNestedScroll(I)Z
    .registers 2

    .line 12442
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->onPause()Lo/rootObjectScope;

    move-result-object p0

    invoke-virtual {p0, p1}, Lo/rootObjectScope;->write(I)Z

    move-result p0

    return p0
.end method

.method public stopNestedScroll()V
    .registers 1

    .line 12452
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->onPause()Lo/rootObjectScope;

    move-result-object p0

    invoke-virtual {p0}, Lo/rootObjectScope;->IconCompatParcelizer()V

    return-void
.end method

.method public final suppressLayout(Z)V
    .registers 11

    .line 2503
    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPlay:Z

    if-eq p1, v0, :cond_38

    .line 2504
    const-string v0, "Do not suppressLayout in layout or scroll"

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->write(Ljava/lang/String;)V

    if-nez p1, :cond_20

    const/4 p1, 0x0

    .line 2506
    iput-boolean p1, p0, Landroidx/recyclerview/widget/RecyclerView;->onPlay:Z

    .line 2507
    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPrepare:Z

    if-eqz v0, :cond_1d

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPlayFromMediaId:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    if-eqz v0, :cond_1d

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatItemReceiver:Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;

    if-eqz v0, :cond_1d

    .line 2508
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 2510
    :cond_1d
    iput-boolean p1, p0, Landroidx/recyclerview/widget/RecyclerView;->onPrepare:Z

    return-void

    .line 2512
    :cond_20
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v3

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-wide v1, v3

    .line 2513
    invoke-static/range {v1 .. v8}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;

    move-result-object p1

    .line 2515
    invoke-virtual {p0, p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    const/4 p1, 0x1

    .line 2516
    iput-boolean p1, p0, Landroidx/recyclerview/widget/RecyclerView;->onPlay:Z

    .line 2517
    iput-boolean p1, p0, Landroidx/recyclerview/widget/RecyclerView;->PlaybackStateCompatCustomAction:Z

    .line 2518
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->ResultReceiver()V

    :cond_38
    return-void
.end method

.method public final write(Landroid/view/View;)Landroid/view/View;
    .registers 4

    .line 5304
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    :goto_4
    if-eqz v0, :cond_14

    if-eq v0, p0, :cond_14

    .line 5305
    instance-of v1, v0, Landroid/view/View;

    if-eqz v1, :cond_14

    .line 5306
    move-object p1, v0

    check-cast p1, Landroid/view/View;

    .line 5307
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    goto :goto_4

    :cond_14
    if-ne v0, p0, :cond_17

    return-object p1

    :cond_17
    const/4 p0, 0x0

    return-object p0
.end method

.method final write(IZ)Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;
    .registers 8

    .line 5461
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatSearchResultReceiver:Lo/TypesKt;

    invoke-virtual {v0}, Lo/TypesKt;->RemoteActionCompatParcelizer()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_8
    if-ge v2, v0, :cond_3a

    .line 5464
    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatSearchResultReceiver:Lo/TypesKt;

    invoke-virtual {v3, v2}, Lo/TypesKt;->AudioAttributesCompatParcelizer(I)Landroid/view/View;

    move-result-object v3

    invoke-static {v3}, Landroidx/recyclerview/widget/RecyclerView;->IconCompatParcelizer(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;

    move-result-object v3

    if-eqz v3, :cond_37

    .line 5465
    invoke-virtual {v3}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->isRemoved()Z

    move-result v4

    if-nez v4, :cond_37

    if-eqz p2, :cond_23

    .line 5467
    iget v4, v3, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mPosition:I

    if-eq v4, p1, :cond_2a

    goto :goto_37

    .line 5470
    :cond_23
    invoke-virtual {v3}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->getLayoutPosition()I

    move-result v4

    if-eq v4, p1, :cond_2a

    goto :goto_37

    .line 5473
    :cond_2a
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatSearchResultReceiver:Lo/TypesKt;

    iget-object v4, v3, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->itemView:Landroid/view/View;

    invoke-virtual {v1, v4}, Lo/TypesKt;->IconCompatParcelizer(Landroid/view/View;)Z

    move-result v1

    if-eqz v1, :cond_36

    move-object v1, v3

    goto :goto_37

    :cond_36
    return-object v3

    :cond_37
    :goto_37
    add-int/lit8 v2, v2, 0x1

    goto :goto_8

    :cond_3a
    return-object v1
.end method

.method final write()Ljava/lang/String;
    .registers 3

    .line 825
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, " "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-super {p0}, Landroid/view/ViewGroup;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", adapter:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatItemReceiver:Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", layout:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->onPlayFromMediaId:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", context:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 828
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method final write(I)V
    .registers 3

    .line 1895
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPlayFromMediaId:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    if-nez v0, :cond_5

    return-void

    :cond_5
    const/4 v0, 0x2

    .line 1901
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatItemReceiver(I)V

    .line 1902
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPlayFromMediaId:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->read(I)V

    .line 1903
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->awakenScrollBars()Z

    return-void
.end method

.method final write(II)V
    .registers 7

    .line 5669
    iget v0, p0, Landroidx/recyclerview/widget/RecyclerView;->MediaSessionCompatToken:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Landroidx/recyclerview/widget/RecyclerView;->MediaSessionCompatToken:I

    .line 5674
    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    move-result v0

    .line 5675
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result v1

    sub-int v2, v0, p1

    sub-int v3, v1, p2

    .line 5676
    invoke-virtual {p0, v0, v1, v2, v3}, Landroidx/recyclerview/widget/RecyclerView;->onScrollChanged(IIII)V

    .line 5683
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->addOnConfigurationChangedListener:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatSearchResultReceiver;

    if-eqz v0, :cond_1c

    .line 5684
    invoke-virtual {v0, p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatSearchResultReceiver;->RemoteActionCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView;II)V

    .line 5686
    :cond_1c
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->addOnContextAvailableListener:Ljava/util/List;

    if-eqz v0, :cond_36

    .line 5687
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_26
    if-ltz v0, :cond_36

    .line 5688
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->addOnContextAvailableListener:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatSearchResultReceiver;

    invoke-virtual {v1, p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatSearchResultReceiver;->RemoteActionCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView;II)V

    add-int/lit8 v0, v0, -0x1

    goto :goto_26

    .line 5691
    :cond_36
    iget p1, p0, Landroidx/recyclerview/widget/RecyclerView;->MediaSessionCompatToken:I

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Landroidx/recyclerview/widget/RecyclerView;->MediaSessionCompatToken:I

    return-void
.end method

.method public final write(IIII[II[I)V
    .registers 16

    .line 12487
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->onPause()Lo/rootObjectScope;

    move-result-object v0

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move-object v5, p5

    move v6, p6

    move-object v7, p7

    invoke-virtual/range {v0 .. v7}, Lo/rootObjectScope;->IconCompatParcelizer(IIII[II[I)V

    return-void
.end method

.method final write(IILandroid/view/animation/Interpolator;IZ)V
    .registers 7

    .line 2682
    iget-object p4, p0, Landroidx/recyclerview/widget/RecyclerView;->onPlayFromMediaId:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    if-nez p4, :cond_5

    return-void

    .line 2687
    :cond_5
    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPlay:Z

    if-nez v0, :cond_33

    .line 2690
    invoke-virtual {p4}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->AudioAttributesImplApi26Parcelizer()Z

    move-result p4

    const/4 v0, 0x0

    if-nez p4, :cond_11

    move p1, v0

    .line 2693
    :cond_11
    iget-object p4, p0, Landroidx/recyclerview/widget/RecyclerView;->onPlayFromMediaId:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    invoke-virtual {p4}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->AudioAttributesImplApi21Parcelizer()Z

    move-result p4

    if-nez p4, :cond_1a

    move p2, v0

    :cond_1a
    if-nez p1, :cond_1f

    if-nez p2, :cond_1f

    goto :goto_33

    :cond_1f
    if-eqz p5, :cond_2c

    const/4 p4, 0x1

    if-eqz p1, :cond_25

    move v0, p4

    :cond_25
    if-eqz p2, :cond_29

    or-int/lit8 v0, v0, 0x2

    .line 2707
    :cond_29
    invoke-direct {p0, v0, p4}, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatMediaItem(II)Z

    .line 2709
    :cond_2c
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView;->onSetCaptioningEnabled:Landroidx/recyclerview/widget/RecyclerView$onFastForward;

    const/high16 p4, -0x80000000

    invoke-virtual {p0, p1, p2, p4, p3}, Landroidx/recyclerview/widget/RecyclerView$onFastForward;->RemoteActionCompatParcelizer(IIILandroid/view/animation/Interpolator;)V

    :cond_33
    :goto_33
    return-void
.end method

.method public final write(Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi21Parcelizer;)V
    .registers 2

    .line 1420
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView;->getOnBackPressedDispatcherannotations:Ljava/util/List;

    if-nez p0, :cond_5

    return-void

    .line 1423
    :cond_5
    invoke-interface {p0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public final write(Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatMediaItem;)V
    .registers 3

    .line 3519
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->menuHostHelperlambda0:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/AbstractCollection;->remove(Ljava/lang/Object;)Z

    .line 3520
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatMediaItem;

    if-ne v0, p1, :cond_c

    const/4 p1, 0x0

    .line 3521
    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatMediaItem;

    :cond_c
    return-void
.end method

.method public final write(Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatSearchResultReceiver;)V
    .registers 2

    .line 1857
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView;->addOnContextAvailableListener:Ljava/util/List;

    if-eqz p0, :cond_7

    .line 1858
    invoke-interface {p0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    :cond_7
    return-void
.end method

.method final write(Ljava/lang/String;)V
    .registers 3

    .line 3479
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatMediaItem()Z

    move-result v0

    if-eqz v0, :cond_26

    if-nez p1, :cond_20

    .line 3481
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "Cannot call this method while RecyclerView is computing a layout or scrolling"

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 3482
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->write()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 3484
    :cond_20
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 3486
    :cond_26
    iget p1, p0, Landroidx/recyclerview/widget/RecyclerView;->MediaSessionCompatToken:I

    if-lez p1, :cond_41

    .line 3487
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, ""

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 3492
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->write()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    :cond_41
    return-void
.end method

.method public final write(II[I[II)Z
    .registers 12

    .line 12499
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->onPause()Lo/rootObjectScope;

    move-result-object v0

    move v1, p1

    move v2, p2

    move-object v3, p3

    move-object v4, p4

    move v5, p5

    invoke-virtual/range {v0 .. v5}, Lo/rootObjectScope;->write(II[I[II)Z

    move-result p0

    return p0
.end method

.method final write(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;)Z
    .registers 3

    .line 5189
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView;->onCommand:Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer;

    if-eqz p0, :cond_10

    .line 5190
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->getUnmodifiedPayloads()Ljava/util/List;

    move-result-object v0

    .line 5189
    invoke-virtual {p0, p1, v0}, Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer;->IconCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;Ljava/util/List;)Z

    move-result p0

    if-nez p0, :cond_10

    const/4 p0, 0x0

    return p0

    :cond_10
    const/4 p0, 0x1

    return p0
.end method

###### Class androidx.recyclerview.widget.RecyclerView.AnonymousClass1 (androidx.recyclerview.widget.RecyclerView$1)
.class final Landroidx/recyclerview/widget/RecyclerView$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/TypesKt$IconCompatParcelizer;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/recyclerview/widget/RecyclerView;->onPrepareFromMediaId()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic AudioAttributesCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;


# direct methods
.method constructor <init>(Landroidx/recyclerview/widget/RecyclerView;)V
    .registers 2

    .line 939
    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView$1;->AudioAttributesCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer()I
    .registers 1

    .line 942
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$1;->AudioAttributesCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result p0

    return p0
.end method

.method public final AudioAttributesCompatParcelizer(I)V
    .registers 4

    .line 1032
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$1;->IconCompatParcelizer(I)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_43

    .line 1034
    invoke-static {v0}, Landroidx/recyclerview/widget/RecyclerView;->IconCompatParcelizer(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;

    move-result-object v0

    if-eqz v0, :cond_47

    .line 1036
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->isTmpDetached()Z

    move-result v1

    if-eqz v1, :cond_36

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->shouldIgnore()Z

    move-result v1

    if-eqz v1, :cond_19

    goto :goto_36

    .line 1037
    :cond_19
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v1, "called detach on an already detached child "

    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$1;->AudioAttributesCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    .line 1038
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->write()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1040
    :cond_36
    :goto_36
    sget-boolean v1, Landroidx/recyclerview/widget/RecyclerView;->AudioAttributesImplBaseParcelizer:Z

    if-eqz v1, :cond_3d

    .line 1041
    invoke-static {v0}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_3d
    const/16 v1, 0x100

    .line 1043
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->addFlags(I)V

    goto :goto_47

    .line 1046
    :cond_43
    sget-boolean v0, Landroidx/recyclerview/widget/RecyclerView;->AudioAttributesImplApi26Parcelizer:Z

    if-nez v0, :cond_4d

    .line 1051
    :cond_47
    :goto_47
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$1;->AudioAttributesCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    invoke-static {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->RemoteActionCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView;I)V

    return-void

    .line 1047
    :cond_4d
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "No view at offset "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$1;->AudioAttributesCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    .line 1048
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->write()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final AudioAttributesCompatParcelizer(Landroid/view/View;)V
    .registers 2

    .line 1056
    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->IconCompatParcelizer(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;

    move-result-object p1

    if-eqz p1, :cond_b

    .line 1058
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$1;->AudioAttributesCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1, p0}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->onEnteredHiddenState(Landroidx/recyclerview/widget/RecyclerView;)V

    :cond_b
    return-void
.end method

.method public final AudioAttributesCompatParcelizer(Landroid/view/View;I)V
    .registers 4

    .line 950
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$1;->AudioAttributesCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    .line 954
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$1;->AudioAttributesCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->read(Landroid/view/View;)V

    return-void
.end method

.method public final IconCompatParcelizer(I)Landroid/view/View;
    .registers 2

    .line 984
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$1;->AudioAttributesCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public final IconCompatParcelizer(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V
    .registers 6

    .line 1010
    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->IconCompatParcelizer(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;

    move-result-object v0

    if-eqz v0, :cond_3b

    .line 1012
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->isTmpDetached()Z

    move-result v1

    if-nez v1, :cond_30

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->shouldIgnore()Z

    move-result v1

    if-eqz v1, :cond_13

    goto :goto_30

    .line 1013
    :cond_13
    new-instance p1, Ljava/lang/StringBuilder;

    const-string p2, "Called attach on a child which is not detached: "

    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$1;->AudioAttributesCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    .line 1014
    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->write()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p2, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 1016
    :cond_30
    :goto_30
    sget-boolean v1, Landroidx/recyclerview/widget/RecyclerView;->AudioAttributesImplBaseParcelizer:Z

    if-eqz v1, :cond_37

    .line 1017
    invoke-static {v0}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 1019
    :cond_37
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->clearTmpDetachFlag()V

    goto :goto_3f

    .line 1021
    :cond_3b
    sget-boolean v0, Landroidx/recyclerview/widget/RecyclerView;->AudioAttributesImplApi26Parcelizer:Z

    if-nez v0, :cond_45

    .line 1027
    :goto_3f
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$1;->AudioAttributesCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    invoke-static {p0, p1, p2, p3}, Landroidx/recyclerview/widget/RecyclerView;->write(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    return-void

    .line 1022
    :cond_45
    new-instance p3, Ljava/lang/StringBuilder;

    const-string v0, "No ViewHolder found for child: "

    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ", index: "

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$1;->AudioAttributesCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    .line 1024
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->write()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final RemoteActionCompatParcelizer(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;
    .registers 2

    .line 1004
    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->IconCompatParcelizer(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;

    move-result-object p0

    return-object p0
.end method

.method public final RemoteActionCompatParcelizer()V
    .registers 5

    .line 989
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$1;->AudioAttributesCompatParcelizer()I

    move-result v0

    const/4 v1, 0x0

    :goto_5
    if-ge v1, v0, :cond_16

    .line 991
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView$1;->IconCompatParcelizer(I)Landroid/view/View;

    move-result-object v2

    .line 992
    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView$1;->AudioAttributesCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v3, v2}, Landroidx/recyclerview/widget/RecyclerView;->RemoteActionCompatParcelizer(Landroid/view/View;)V

    .line 997
    invoke-virtual {v2}, Landroid/view/View;->clearAnimation()V

    add-int/lit8 v1, v1, 0x1

    goto :goto_5

    .line 999
    :cond_16
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$1;->AudioAttributesCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->removeAllViews()V

    return-void
.end method

.method public final read(Landroid/view/View;)I
    .registers 2

    .line 959
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$1;->AudioAttributesCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result p0

    return p0
.end method

.method public final write(I)V
    .registers 4

    .line 964
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$1;->AudioAttributesCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_10

    .line 966
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView$1;->AudioAttributesCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/RecyclerView;->RemoteActionCompatParcelizer(Landroid/view/View;)V

    .line 971
    invoke-virtual {v0}, Landroid/view/View;->clearAnimation()V

    .line 976
    :cond_10
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$1;->AudioAttributesCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->removeViewAt(I)V

    return-void
.end method

.method public final write(Landroid/view/View;)V
    .registers 2

    .line 1064
    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->IconCompatParcelizer(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;

    move-result-object p1

    if-eqz p1, :cond_b

    .line 1066
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$1;->AudioAttributesCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1, p0}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->onLeftHiddenState(Landroidx/recyclerview/widget/RecyclerView;)V

    :cond_b
    return-void
.end method

###### Class androidx.recyclerview.widget.RecyclerView.AnonymousClass2 (androidx.recyclerview.widget.RecyclerView$2)
.class final Landroidx/recyclerview/widget/RecyclerView$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/animation/Interpolator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/recyclerview/widget/RecyclerView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .registers 1

    .line 660
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getInterpolation(F)F
    .registers 3

    const/high16 p0, 0x3f800000    # 1.0f

    sub-float/2addr p1, p0

    mul-float v0, p1, p1

    mul-float/2addr v0, p1

    mul-float/2addr v0, p1

    mul-float/2addr v0, p1

    add-float/2addr v0, p0

    return v0
.end method

###### Class androidx.recyclerview.widget.RecyclerView.AnonymousClass3 (androidx.recyclerview.widget.RecyclerView$3)
.class final Landroidx/recyclerview/widget/RecyclerView$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/recyclerview/widget/RecyclerView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic IconCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;


# direct methods
.method constructor <init>(Landroidx/recyclerview/widget/RecyclerView;)V
    .registers 2

    .line 452
    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView$3;->IconCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 2

    .line 455
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$3;->IconCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    iget-boolean v0, v0, Landroidx/recyclerview/widget/RecyclerView;->onCustomAction:Z

    if-eqz v0, :cond_2b

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$3;->IconCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/view/View;->isLayoutRequested()Z

    move-result v0

    if-nez v0, :cond_2b

    .line 459
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$3;->IconCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    iget-boolean v0, v0, Landroidx/recyclerview/widget/RecyclerView;->handleMediaPlayPauseIfPendingOnHandler:Z

    if-nez v0, :cond_1a

    .line 460
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$3;->IconCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void

    .line 464
    :cond_1a
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$3;->IconCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    iget-boolean v0, v0, Landroidx/recyclerview/widget/RecyclerView;->onPlay:Z

    if-eqz v0, :cond_26

    .line 465
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$3;->IconCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPrepare:Z

    return-void

    .line 468
    :cond_26
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$3;->IconCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->read()V

    :cond_2b
    return-void
.end method

###### Class androidx.recyclerview.widget.RecyclerView.AnonymousClass4 (androidx.recyclerview.widget.RecyclerView$4)
.class final Landroidx/recyclerview/widget/RecyclerView$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/UIntSerializer$AudioAttributesCompatParcelizer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/recyclerview/widget/RecyclerView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic read:Landroidx/recyclerview/widget/RecyclerView;


# direct methods
.method constructor <init>(Landroidx/recyclerview/widget/RecyclerView;)V
    .registers 2

    .line 697
    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView$4;->read:Landroidx/recyclerview/widget/RecyclerView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer$write;Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer$write;)V
    .registers 5

    const/4 v0, 0x0

    .line 714
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->setIsRecyclable(Z)V

    .line 715
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$4;->read:Landroidx/recyclerview/widget/RecyclerView;

    iget-boolean v0, v0, Landroidx/recyclerview/widget/RecyclerView;->RatingCompat:Z

    if-eqz v0, :cond_1a

    .line 719
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$4;->read:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->onCommand:Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer;

    invoke-virtual {v0, p1, p1, p2, p3}, Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer;->write(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer$write;Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer$write;)Z

    move-result p1

    if-eqz p1, :cond_29

    .line 721
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$4;->read:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->handleMediaPlayPauseIfPendingOnHandler()V

    return-void

    .line 723
    :cond_1a
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$4;->read:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->onCommand:Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer;

    invoke-virtual {v0, p1, p2, p3}, Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer;->write(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer$write;Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer$write;)Z

    move-result p1

    if-eqz p1, :cond_29

    .line 724
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$4;->read:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->handleMediaPlayPauseIfPendingOnHandler()V

    :cond_29
    return-void
.end method

.method public final RemoteActionCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer$write;Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer$write;)V
    .registers 5

    .line 701
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$4;->read:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->onRemoveQueueItemAt:Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->AudioAttributesCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;)V

    .line 702
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$4;->read:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p0, p1, p2, p3}, Landroidx/recyclerview/widget/RecyclerView;->AudioAttributesCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer$write;Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer$write;)V

    return-void
.end method

.method public final read(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer$write;Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer$write;)V
    .registers 4

    .line 708
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$4;->read:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p0, p1, p2, p3}, Landroidx/recyclerview/widget/RecyclerView;->RemoteActionCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer$write;Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer$write;)V

    return-void
.end method

.method public final write(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;)V
    .registers 3

    .line 730
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$4;->read:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->onPlayFromMediaId:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->itemView:Landroid/view/View;

    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$4;->read:Landroidx/recyclerview/widget/RecyclerView;

    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView;->onRemoveQueueItemAt:Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;

    invoke-virtual {v0, p1, p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->AudioAttributesCompatParcelizer(Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;)V

    return-void
.end method

###### Class androidx.recyclerview.widget.RecyclerView.AnonymousClass5 (androidx.recyclerview.widget.RecyclerView$5)
.class final Landroidx/recyclerview/widget/RecyclerView$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/recyclerview/widget/RecyclerView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic read:Landroidx/recyclerview/widget/RecyclerView;


# direct methods
.method constructor <init>(Landroidx/recyclerview/widget/RecyclerView;)V
    .registers 2

    .line 650
    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView$5;->read:Landroidx/recyclerview/widget/RecyclerView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 2

    .line 653
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$5;->read:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->onCommand:Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer;

    if-eqz v0, :cond_d

    .line 654
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$5;->read:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->onCommand:Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer;->RemoteActionCompatParcelizer()V

    .line 656
    :cond_d
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$5;->read:Landroidx/recyclerview/widget/RecyclerView;

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPlayFromUri:Z

    return-void
.end method

###### Class androidx.recyclerview.widget.RecyclerView.AnonymousClass7 (androidx.recyclerview.widget.RecyclerView$7)
.class final synthetic Landroidx/recyclerview/widget/RecyclerView$7;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/recyclerview/widget/RecyclerView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1008
    name = null
.end annotation


# static fields
.field static final synthetic AudioAttributesCompatParcelizer:[I


# direct methods
.method static constructor <clinit>()V
    .registers 3

    .line 8323
    invoke-static {}, Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer$read;->values()[Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer$read;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Landroidx/recyclerview/widget/RecyclerView$7;->AudioAttributesCompatParcelizer:[I

    :try_start_9
    sget-object v1, Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer$read;->IconCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer$read;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_12
    .catch Ljava/lang/NoSuchFieldError; {:try_start_9 .. :try_end_12} :catch_12

    :catch_12
    :try_start_12
    sget-object v0, Landroidx/recyclerview/widget/RecyclerView$7;->AudioAttributesCompatParcelizer:[I

    sget-object v1, Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer$read;->RemoteActionCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer$read;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1
    :try_end_1d
    .catch Ljava/lang/NoSuchFieldError; {:try_start_12 .. :try_end_1d} :catch_1d

    :catch_1d
    return-void
.end method

###### Class androidx.recyclerview.widget.RecyclerView.AnonymousClass8 (androidx.recyclerview.widget.RecyclerView$8)
.class final Landroidx/recyclerview/widget/RecyclerView$8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/RegexDeserializer$read;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/recyclerview/widget/RecyclerView;->onSkipToPrevious()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic AudioAttributesCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;


# direct methods
.method constructor <init>(Landroidx/recyclerview/widget/RecyclerView;)V
    .registers 2

    .line 1073
    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView$8;->AudioAttributesCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private IconCompatParcelizer(Lo/RegexDeserializer$IconCompatParcelizer;)V
    .registers 5

    .line 1118
    iget v0, p1, Lo/RegexDeserializer$IconCompatParcelizer;->read:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3c

    const/4 v2, 0x2

    if-eq v0, v2, :cond_2e

    const/4 v2, 0x4

    if-eq v0, v2, :cond_1e

    const/16 v2, 0x8

    if-eq v0, v2, :cond_10

    return-void

    .line 1130
    :cond_10
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$8;->AudioAttributesCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->onPlayFromMediaId:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$8;->AudioAttributesCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    iget v2, p1, Lo/RegexDeserializer$IconCompatParcelizer;->RemoteActionCompatParcelizer:I

    iget p1, p1, Lo/RegexDeserializer$IconCompatParcelizer;->write:I

    invoke-virtual {v0, p0, v2, p1, v1}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->IconCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView;III)V

    return-void

    .line 1126
    :cond_1e
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$8;->AudioAttributesCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->onPlayFromMediaId:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$8;->AudioAttributesCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    iget v1, p1, Lo/RegexDeserializer$IconCompatParcelizer;->RemoteActionCompatParcelizer:I

    iget v2, p1, Lo/RegexDeserializer$IconCompatParcelizer;->write:I

    iget-object p1, p1, Lo/RegexDeserializer$IconCompatParcelizer;->AudioAttributesCompatParcelizer:Ljava/lang/Object;

    invoke-virtual {v0, p0, v1, v2, p1}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->write(Landroidx/recyclerview/widget/RecyclerView;IILjava/lang/Object;)V

    return-void

    .line 1123
    :cond_2e
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$8;->AudioAttributesCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->onPlayFromMediaId:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$8;->AudioAttributesCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    iget v1, p1, Lo/RegexDeserializer$IconCompatParcelizer;->RemoteActionCompatParcelizer:I

    iget p1, p1, Lo/RegexDeserializer$IconCompatParcelizer;->write:I

    invoke-virtual {v0, p0, v1, p1}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->AudioAttributesCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView;II)V

    return-void

    .line 1120
    :cond_3c
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$8;->AudioAttributesCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->onPlayFromMediaId:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$8;->AudioAttributesCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    iget v1, p1, Lo/RegexDeserializer$IconCompatParcelizer;->RemoteActionCompatParcelizer:I

    iget p1, p1, Lo/RegexDeserializer$IconCompatParcelizer;->write:I

    invoke-virtual {v0, p0, v1, p1}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->RemoteActionCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView;II)V

    return-void
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer(II)V
    .registers 5

    .line 1101
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$8;->AudioAttributesCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, p2, v1}, Landroidx/recyclerview/widget/RecyclerView;->read(IIZ)V

    .line 1102
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$8;->AudioAttributesCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/recyclerview/widget/RecyclerView;->onMediaButtonEvent:Z

    return-void
.end method

.method public final RemoteActionCompatParcelizer(I)Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;
    .registers 4

    .line 1076
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$8;->AudioAttributesCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1}, Landroidx/recyclerview/widget/RecyclerView;->write(IZ)Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;

    move-result-object p1

    const/4 v0, 0x0

    if-nez p1, :cond_b

    return-object v0

    .line 1082
    :cond_b
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$8;->AudioAttributesCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatSearchResultReceiver:Lo/TypesKt;

    iget-object v1, p1, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->itemView:Landroid/view/View;

    invoke-virtual {p0, v1}, Lo/TypesKt;->IconCompatParcelizer(Landroid/view/View;)Z

    move-result p0

    if-eqz p0, :cond_1a

    .line 1083
    sget-boolean p0, Landroidx/recyclerview/widget/RecyclerView;->AudioAttributesImplBaseParcelizer:Z

    return-object v0

    :cond_1a
    return-object p1
.end method

.method public final RemoteActionCompatParcelizer(II)V
    .registers 5

    .line 1093
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$8;->AudioAttributesCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    const/4 v1, 0x1

    invoke-virtual {v0, p1, p2, v1}, Landroidx/recyclerview/widget/RecyclerView;->read(IIZ)V

    .line 1094
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView$8;->AudioAttributesCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    iput-boolean v1, p1, Landroidx/recyclerview/widget/RecyclerView;->onMediaButtonEvent:Z

    .line 1095
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$8;->AudioAttributesCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPrepareFromUri:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    iget p1, p0, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->AudioAttributesCompatParcelizer:I

    add-int/2addr p1, p2

    iput p1, p0, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->AudioAttributesCompatParcelizer:I

    return-void
.end method

.method public final RemoteActionCompatParcelizer(IILjava/lang/Object;)V
    .registers 5

    .line 1108
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$8;->AudioAttributesCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, p1, p2, p3}, Landroidx/recyclerview/widget/RecyclerView;->IconCompatParcelizer(IILjava/lang/Object;)V

    .line 1109
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$8;->AudioAttributesCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/recyclerview/widget/RecyclerView;->onFastForward:Z

    return-void
.end method

.method public final RemoteActionCompatParcelizer(Lo/RegexDeserializer$IconCompatParcelizer;)V
    .registers 2

    .line 1137
    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$8;->IconCompatParcelizer(Lo/RegexDeserializer$IconCompatParcelizer;)V

    return-void
.end method

.method public final read(II)V
    .registers 4

    .line 1142
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$8;->AudioAttributesCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->read(II)V

    .line 1143
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$8;->AudioAttributesCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/recyclerview/widget/RecyclerView;->onMediaButtonEvent:Z

    return-void
.end method

.method public final read(Lo/RegexDeserializer$IconCompatParcelizer;)V
    .registers 2

    .line 1114
    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$8;->IconCompatParcelizer(Lo/RegexDeserializer$IconCompatParcelizer;)V

    return-void
.end method

.method public final write(II)V
    .registers 4

    .line 1148
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$8;->AudioAttributesCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->AudioAttributesImplBaseParcelizer(II)V

    .line 1150
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$8;->AudioAttributesCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/recyclerview/widget/RecyclerView;->onMediaButtonEvent:Z

    return-void
.end method

###### Class androidx.recyclerview.widget.RecyclerView.AudioAttributesCompatParcelizer (androidx.recyclerview.widget.RecyclerView$AudioAttributesCompatParcelizer)
.class Landroidx/recyclerview/widget/RecyclerView$AudioAttributesCompatParcelizer;
.super Landroid/database/Observable;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/recyclerview/widget/RecyclerView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "AudioAttributesCompatParcelizer"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/database/Observable<",
        "Landroidx/recyclerview/widget/RecyclerView$read;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .registers 1

    .line 13187
    invoke-direct {p0}, Landroid/database/Observable;-><init>()V

    return-void
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer()V
    .registers 3

    .line 13203
    iget-object v0, p0, Landroid/database/Observable;->mObservers:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_8
    if-ltz v0, :cond_18

    .line 13204
    iget-object v1, p0, Landroid/database/Observable;->mObservers:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/recyclerview/widget/RecyclerView$read;

    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView$read;->IconCompatParcelizer()V

    add-int/lit8 v0, v0, -0x1

    goto :goto_8

    :cond_18
    return-void
.end method

.method public final IconCompatParcelizer(II)V
    .registers 5

    .line 13228
    iget-object v0, p0, Landroid/database/Observable;->mObservers:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_8
    if-ltz v0, :cond_18

    .line 13229
    iget-object v1, p0, Landroid/database/Observable;->mObservers:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/recyclerview/widget/RecyclerView$read;

    invoke-virtual {v1, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$read;->AudioAttributesCompatParcelizer(II)V

    add-int/lit8 v0, v0, -0x1

    goto :goto_8

    :cond_18
    return-void
.end method

.method public final RemoteActionCompatParcelizer()V
    .registers 3

    .line 13197
    iget-object v0, p0, Landroid/database/Observable;->mObservers:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_8
    if-ltz v0, :cond_18

    .line 13198
    iget-object v1, p0, Landroid/database/Observable;->mObservers:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/recyclerview/widget/RecyclerView$read;

    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView$read;->read()V

    add-int/lit8 v0, v0, -0x1

    goto :goto_8

    :cond_18
    return-void
.end method

.method public final RemoteActionCompatParcelizer(II)V
    .registers 5

    .line 13238
    iget-object v0, p0, Landroid/database/Observable;->mObservers:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_8
    if-ltz v0, :cond_18

    .line 13239
    iget-object v1, p0, Landroid/database/Observable;->mObservers:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/recyclerview/widget/RecyclerView$read;

    invoke-virtual {v1, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$read;->read(II)V

    add-int/lit8 v0, v0, -0x1

    goto :goto_8

    :cond_18
    return-void
.end method

.method public final RemoteActionCompatParcelizer(IILjava/lang/Object;)V
    .registers 6

    .line 13218
    iget-object v0, p0, Landroid/database/Observable;->mObservers:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_8
    if-ltz v0, :cond_18

    .line 13219
    iget-object v1, p0, Landroid/database/Observable;->mObservers:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/recyclerview/widget/RecyclerView$read;

    invoke-virtual {v1, p1, p2, p3}, Landroidx/recyclerview/widget/RecyclerView$read;->AudioAttributesCompatParcelizer(IILjava/lang/Object;)V

    add-int/lit8 v0, v0, -0x1

    goto :goto_8

    :cond_18
    return-void
.end method

.method public final read(II)V
    .registers 5

    .line 13244
    iget-object v0, p0, Landroid/database/Observable;->mObservers:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_8
    if-ltz v0, :cond_18

    .line 13245
    iget-object v1, p0, Landroid/database/Observable;->mObservers:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/recyclerview/widget/RecyclerView$read;

    invoke-virtual {v1, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$read;->RemoteActionCompatParcelizer(II)V

    add-int/lit8 v0, v0, -0x1

    goto :goto_8

    :cond_18
    return-void
.end method

.method public final write(II)V
    .registers 4

    const/4 v0, 0x0

    .line 13209
    invoke-virtual {p0, p1, p2, v0}, Landroidx/recyclerview/widget/RecyclerView$AudioAttributesCompatParcelizer;->RemoteActionCompatParcelizer(IILjava/lang/Object;)V

    return-void
.end method

.method public final write()Z
    .registers 1

    .line 13189
    iget-object p0, p0, Landroid/database/Observable;->mObservers:Ljava/util/ArrayList;

    invoke-virtual {p0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    return p0
.end method

###### Class androidx.recyclerview.widget.RecyclerView.AudioAttributesImplApi21Parcelizer (androidx.recyclerview.widget.RecyclerView$AudioAttributesImplApi21Parcelizer)
.class public interface abstract Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi21Parcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/recyclerview/widget/RecyclerView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "AudioAttributesImplApi21Parcelizer"
.end annotation


# virtual methods
.method public abstract RemoteActionCompatParcelizer(Landroid/view/View;)V
.end method

.method public abstract read(Landroid/view/View;)V
.end method

###### Class androidx.recyclerview.widget.RecyclerView.AudioAttributesImplApi26Parcelizer (androidx.recyclerview.widget.RecyclerView$AudioAttributesImplApi26Parcelizer)
.class public abstract Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/recyclerview/widget/RecyclerView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "AudioAttributesImplApi26Parcelizer"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer$AudioAttributesCompatParcelizer;,
        Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer$read;,
        Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer$write;
    }
.end annotation


# instance fields
.field private AudioAttributesCompatParcelizer:J

.field private IconCompatParcelizer:J

.field private MediaBrowserCompatCustomActionResultReceiver:J

.field private RemoteActionCompatParcelizer:J

.field private read:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer$AudioAttributesCompatParcelizer;",
            ">;"
        }
    .end annotation
.end field

.field private write:Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer$read;


# direct methods
.method public constructor <init>()V
    .registers 3

    .line 13684
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 13747
    iput-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer;->write:Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer$read;

    .line 13748
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer;->read:Ljava/util/ArrayList;

    const-wide/16 v0, 0x78

    .line 13751
    iput-wide v0, p0, Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer;->AudioAttributesCompatParcelizer:J

    .line 13752
    iput-wide v0, p0, Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer;->MediaBrowserCompatCustomActionResultReceiver:J

    const-wide/16 v0, 0xfa

    .line 13753
    iput-wide v0, p0, Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer;->RemoteActionCompatParcelizer:J

    .line 13754
    iput-wide v0, p0, Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer;->IconCompatParcelizer:J

    return-void
.end method

.method private static AudioAttributesCompatParcelizer()Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer$write;
    .registers 1

    .line 14313
    new-instance v0, Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer$write;

    invoke-direct {v0}, Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer$write;-><init>()V

    return-object v0
.end method

.method public static AudioAttributesImplApi21Parcelizer(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;)Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer$write;
    .registers 2

    .line 13903
    invoke-static {}, Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer;->AudioAttributesCompatParcelizer()Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer$write;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer$write;->read(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;)Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer$write;

    move-result-object p0

    return-object p0
.end method

.method public static MediaBrowserCompatItemReceiver(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;)Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer$write;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;",
            ")",
            "Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer$write;"
        }
    .end annotation

    .line 13875
    invoke-static {}, Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer;->AudioAttributesCompatParcelizer()Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer$write;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer$write;->read(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;)Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer$write;

    move-result-object p0

    return-object p0
.end method

.method static RemoteActionCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;)I
    .registers 5

    .line 14071
    iget v0, p0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mFlags:I

    and-int/lit8 v1, v0, 0xe

    .line 14072
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->isInvalid()Z

    move-result v2

    const/4 v3, 0x4

    if-eqz v2, :cond_c

    return v3

    :cond_c
    and-int/2addr v0, v3

    if-nez v0, :cond_21

    .line 14076
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->getOldPosition()I

    move-result v0

    .line 14077
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->getAbsoluteAdapterPosition()I

    move-result p0

    const/4 v2, -0x1

    if-eq v0, v2, :cond_21

    if-eq p0, v2, :cond_21

    if-eq v0, p0, :cond_21

    or-int/lit16 p0, v1, 0x800

    return p0

    :cond_21
    return v1
.end method


# virtual methods
.method public final AudioAttributesImplApi21Parcelizer()J
    .registers 3

    .line 13816
    iget-wide v0, p0, Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer;->IconCompatParcelizer:J

    return-wide v0
.end method

.method public final AudioAttributesImplApi26Parcelizer()J
    .registers 3

    .line 13780
    iget-wide v0, p0, Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer;->AudioAttributesCompatParcelizer:J

    return-wide v0
.end method

.method public final AudioAttributesImplApi26Parcelizer(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;)V
    .registers 2

    .line 14156
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer;->write:Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer$read;

    if-eqz p0, :cond_7

    .line 14157
    invoke-interface {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer$read;->IconCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;)V

    :cond_7
    return-void
.end method

.method public final AudioAttributesImplBaseParcelizer()J
    .registers 3

    .line 13798
    iget-wide v0, p0, Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer;->MediaBrowserCompatCustomActionResultReceiver:J

    return-wide v0
.end method

.method public AudioAttributesImplBaseParcelizer(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;)Z
    .registers 2

    const/4 p0, 0x1

    return p0
.end method

.method public abstract IconCompatParcelizer()Z
.end method

.method public abstract IconCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer$write;Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer$write;)Z
.end method

.method public IconCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;Ljava/util/List;)Z
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;)Z"
        }
    .end annotation

    .line 14287
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer;->AudioAttributesImplBaseParcelizer(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;)Z

    move-result p0

    return p0
.end method

.method public final MediaBrowserCompatItemReceiver()J
    .registers 3

    .line 13762
    iget-wide v0, p0, Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer;->RemoteActionCompatParcelizer:J

    return-wide v0
.end method

.method public abstract RemoteActionCompatParcelizer()V
.end method

.method final RemoteActionCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer$read;)V
    .registers 2

    .line 13837
    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer;->write:Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer$read;

    return-void
.end method

.method public abstract RemoteActionCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer$write;Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer$write;)Z
.end method

.method public final read()V
    .registers 4

    .line 14295
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer;->read:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_7
    if-ge v1, v0, :cond_14

    .line 14297
    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer;->read:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer$AudioAttributesCompatParcelizer;

    add-int/lit8 v1, v1, 0x1

    goto :goto_7

    .line 14299
    :cond_14
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer;->read:Ljava/util/ArrayList;

    invoke-virtual {p0}, Ljava/util/AbstractCollection;->clear()V

    return-void
.end method

.method public abstract write()V
.end method

.method public abstract write(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;)V
.end method

.method public abstract write(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer$write;Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer$write;)Z
.end method

.method public abstract write(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer$write;Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer$write;)Z
.end method

###### Class androidx.recyclerview.widget.RecyclerView.AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer (androidx.recyclerview.widget.RecyclerView$AudioAttributesImplApi26Parcelizer$AudioAttributesCompatParcelizer)
.class public interface abstract Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer$AudioAttributesCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "AudioAttributesCompatParcelizer"
.end annotation

###### Class androidx.recyclerview.widget.RecyclerView.AudioAttributesImplApi26Parcelizer.read (androidx.recyclerview.widget.RecyclerView$AudioAttributesImplApi26Parcelizer$read)
.class interface abstract Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer$read;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x608
    name = "read"
.end annotation


# virtual methods
.method public abstract IconCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;)V
.end method

###### Class androidx.recyclerview.widget.RecyclerView.AudioAttributesImplApi26Parcelizer.write (androidx.recyclerview.widget.RecyclerView$AudioAttributesImplApi26Parcelizer$write)
.class public final Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer$write;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "write"
.end annotation


# instance fields
.field private AudioAttributesCompatParcelizer:I

.field private IconCompatParcelizer:I

.field public RemoteActionCompatParcelizer:I

.field public read:I


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 14380
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private IconCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;)Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer$write;
    .registers 3

    .line 14408
    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->itemView:Landroid/view/View;

    .line 14409
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    move-result v0

    iput v0, p0, Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer$write;->RemoteActionCompatParcelizer:I

    .line 14410
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result v0

    iput v0, p0, Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer$write;->read:I

    .line 14411
    invoke-virtual {p1}, Landroid/view/View;->getRight()I

    move-result v0

    iput v0, p0, Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer$write;->IconCompatParcelizer:I

    .line 14412
    invoke-virtual {p1}, Landroid/view/View;->getBottom()I

    move-result p1

    iput p1, p0, Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer$write;->AudioAttributesCompatParcelizer:I

    return-object p0
.end method


# virtual methods
.method public final read(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;)Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer$write;
    .registers 2

    .line 14392
    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer$write;->IconCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;)Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer$write;

    move-result-object p0

    return-object p0
.end method

###### Class androidx.recyclerview.widget.RecyclerView.AudioAttributesImplBaseParcelizer (androidx.recyclerview.widget.RecyclerView$AudioAttributesImplBaseParcelizer)
.class public abstract Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplBaseParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/recyclerview/widget/RecyclerView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "AudioAttributesImplBaseParcelizer"
.end annotation


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 11515
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static RemoteActionCompatParcelizer(Landroid/graphics/Rect;)V
    .registers 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v0, 0x0

    .line 11564
    invoke-virtual {p0, v0, v0, v0, v0}, Landroid/graphics/Rect;->set(IIII)V

    return-void
.end method


# virtual methods
.method public AudioAttributesCompatParcelizer(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)V
    .registers 4

    return-void
.end method

.method public IconCompatParcelizer(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)V
    .registers 4

    return-void
.end method

.method public IconCompatParcelizer(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)V
    .registers 5

    .line 11589
    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p0

    check-cast p0, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->O_()I

    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplBaseParcelizer;->RemoteActionCompatParcelizer(Landroid/graphics/Rect;)V

    return-void
.end method

###### Class androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer (androidx.recyclerview.widget.RecyclerView$IconCompatParcelizer)
.class public abstract Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/recyclerview/widget/RecyclerView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "IconCompatParcelizer"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer$read;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<VH:",
        "Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private mHasStableIds:Z

.field private final mObservable:Landroidx/recyclerview/widget/RecyclerView$AudioAttributesCompatParcelizer;

.field private mStateRestorationPolicy:Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer$read;


# direct methods
.method public constructor <init>()V
    .registers 2

    .line 7666
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7667
    new-instance v0, Landroidx/recyclerview/widget/RecyclerView$AudioAttributesCompatParcelizer;

    invoke-direct {v0}, Landroidx/recyclerview/widget/RecyclerView$AudioAttributesCompatParcelizer;-><init>()V

    iput-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;->mObservable:Landroidx/recyclerview/widget/RecyclerView$AudioAttributesCompatParcelizer;

    const/4 v0, 0x0

    .line 7668
    iput-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;->mHasStableIds:Z

    .line 7669
    sget-object v0, Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer$read;->AudioAttributesCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer$read;

    iput-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;->mStateRestorationPolicy:Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer$read;

    return-void
.end method


# virtual methods
.method public final bindViewHolder(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;I)V
    .registers 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TVH;I)V"
        }
    .end annotation

    .line 7818
    iget-object v0, p1, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mBindingAdapter:Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;

    const/4 v1, 0x1

    if-nez v0, :cond_7

    move v0, v1

    goto :goto_8

    :cond_7
    const/4 v0, 0x0

    :goto_8
    if-eqz v0, :cond_22

    .line 7820
    iput p2, p1, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mPosition:I

    .line 7821
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;->hasStableIds()Z

    move-result v2

    if-eqz v2, :cond_18

    .line 7822
    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;->getItemId(I)J

    move-result-wide v2

    iput-wide v2, p1, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mItemId:J

    :cond_18
    const/16 v2, 0x207

    .line 7824
    invoke-virtual {p1, v1, v2}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->setFlags(II)V

    .line 7827
    const-string v2, "RV OnBindView"

    invoke-static {v2}, Lo/constructDelegatingKeyDeserializer;->read(Ljava/lang/String;)V

    .line 7829
    :cond_22
    iput-object p0, p1, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mBindingAdapter:Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;

    .line 7830
    sget-boolean v2, Landroidx/recyclerview/widget/RecyclerView;->AudioAttributesImplApi26Parcelizer:Z

    if-eqz v2, :cond_8c

    .line 7831
    iget-object v2, p1, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->itemView:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    if-nez v2, :cond_6b

    iget-object v2, p1, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->itemView:Landroid/view/View;

    .line 7832
    invoke-static {v2}, Lo/InvalidTypeIdException;->onPlayFromSearch(Landroid/view/View;)Z

    move-result v2

    .line 7833
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->isTmpDetached()Z

    move-result v3

    if-ne v2, v3, :cond_3d

    goto :goto_6b

    .line 7834
    :cond_3d
    new-instance p0, Ljava/lang/StringBuilder;

    const-string p2, "Temp-detached state out of sync with reality. holder.isTmpDetached(): "

    invoke-direct {p0, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 7835
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->isTmpDetached()Z

    move-result p2

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string p2, ", attached to window: "

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p2, p1, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->itemView:Landroid/view/View;

    .line 7837
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-static {p2}, Lo/InvalidTypeIdException;->onPlayFromSearch(Landroid/view/View;)Z

    move-result p2

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string p2, ", holder: "

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 7840
    :cond_6b
    :goto_6b
    iget-object v2, p1, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->itemView:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    if-nez v2, :cond_8c

    iget-object v2, p1, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->itemView:Landroid/view/View;

    .line 7841
    invoke-static {v2}, Lo/InvalidTypeIdException;->onPlayFromSearch(Landroid/view/View;)Z

    move-result v2

    if-nez v2, :cond_7c

    goto :goto_8c

    .line 7842
    :cond_7c
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p2, "Attempting to bind attached holder with no parent (AKA temp detached): "

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 7847
    :cond_8c
    :goto_8c
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->getUnmodifiedPayloads()Ljava/util/List;

    move-result-object v2

    invoke-virtual {p0, p1, p2, v2}, Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;->onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;ILjava/util/List;)V

    if-eqz v0, :cond_a9

    .line 7849
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->clearPayload()V

    .line 7850
    iget-object p0, p1, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->itemView:Landroid/view/View;

    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p0

    .line 7851
    instance-of p1, p0, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    if-eqz p1, :cond_a6

    .line 7852
    check-cast p0, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    iput-boolean v1, p0, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->AudioAttributesCompatParcelizer:Z

    .line 7854
    :cond_a6
    invoke-static {}, Lo/constructDelegatingKeyDeserializer;->RemoteActionCompatParcelizer()V

    :cond_a9
    return-void
.end method

.method canRestoreState()Z
    .registers 4

    .line 8323
    sget-object v0, Landroidx/recyclerview/widget/RecyclerView$7;->AudioAttributesCompatParcelizer:[I

    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;->mStateRestorationPolicy:Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer$read;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_18

    const/4 v2, 0x2

    if-eq v0, v2, :cond_11

    return v1

    .line 8327
    :cond_11
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;->getItemCount()I

    move-result p0

    if-lez p0, :cond_18

    return v1

    :cond_18
    const/4 p0, 0x0

    return p0
.end method

.method public final createViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/ViewGroup;",
            "I)TVH;"
        }
    .end annotation

    .line 7787
    :try_start_0
    const-string v0, "RV CreateView"

    invoke-static {v0}, Lo/constructDelegatingKeyDeserializer;->read(Ljava/lang/String;)V

    .line 7788
    invoke-virtual {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;->onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;

    move-result-object p0

    .line 7789
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->itemView:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    if-nez p1, :cond_17

    .line 7794
    iput p2, p0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mItemViewType:I
    :try_end_13
    .catchall {:try_start_0 .. :try_end_13} :catchall_1f

    .line 7797
    invoke-static {}, Lo/constructDelegatingKeyDeserializer;->RemoteActionCompatParcelizer()V

    return-object p0

    .line 7790
    :cond_17
    :try_start_17
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "ViewHolder views must not be attached when created. Ensure that you are not passing \'true\' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_1f
    .catchall {:try_start_17 .. :try_end_1f} :catchall_1f

    :catchall_1f
    move-exception p0

    .line 7797
    invoke-static {}, Lo/constructDelegatingKeyDeserializer;->RemoteActionCompatParcelizer()V

    .line 7798
    throw p0
.end method

.method public findRelativeAdapterPositionIn(Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;I)I
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer<",
            "+",
            "Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;",
            ">;",
            "Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;",
            "I)I"
        }
    .end annotation

    if-ne p1, p0, :cond_3

    return p3

    :cond_3
    const/4 p0, -0x1

    return p0
.end method

.method public abstract getItemCount()I
.end method

.method public getItemId(I)J
    .registers 2

    const-wide/16 p0, -0x1

    return-wide p0
.end method

.method public getItemViewType(I)I
    .registers 2

    const/4 p0, 0x0

    return p0
.end method

.method public final getStateRestorationPolicy()Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer$read;
    .registers 1

    .line 8312
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;->mStateRestorationPolicy:Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer$read;

    return-object p0
.end method

.method public final hasObservers()Z
    .registers 1

    .line 8009
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;->mObservable:Landroidx/recyclerview/widget/RecyclerView$AudioAttributesCompatParcelizer;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$AudioAttributesCompatParcelizer;->write()Z

    move-result p0

    return p0
.end method

.method public final hasStableIds()Z
    .registers 1

    .line 7917
    iget-boolean p0, p0, Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;->mHasStableIds:Z

    return p0
.end method

.method public final notifyDataSetChanged()V
    .registers 1

    .line 8094
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;->mObservable:Landroidx/recyclerview/widget/RecyclerView$AudioAttributesCompatParcelizer;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$AudioAttributesCompatParcelizer;->RemoteActionCompatParcelizer()V

    return-void
.end method

.method public final notifyItemChanged(I)V
    .registers 3

    .line 8109
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;->mObservable:Landroidx/recyclerview/widget/RecyclerView$AudioAttributesCompatParcelizer;

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Landroidx/recyclerview/widget/RecyclerView$AudioAttributesCompatParcelizer;->write(II)V

    return-void
.end method

.method public final notifyItemChanged(ILjava/lang/Object;)V
    .registers 4

    .line 8136
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;->mObservable:Landroidx/recyclerview/widget/RecyclerView$AudioAttributesCompatParcelizer;

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0, p2}, Landroidx/recyclerview/widget/RecyclerView$AudioAttributesCompatParcelizer;->RemoteActionCompatParcelizer(IILjava/lang/Object;)V

    return-void
.end method

.method public final notifyItemInserted(I)V
    .registers 3

    .line 8199
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;->mObservable:Landroidx/recyclerview/widget/RecyclerView$AudioAttributesCompatParcelizer;

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Landroidx/recyclerview/widget/RecyclerView$AudioAttributesCompatParcelizer;->IconCompatParcelizer(II)V

    return-void
.end method

.method public final notifyItemMoved(II)V
    .registers 3

    .line 8214
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;->mObservable:Landroidx/recyclerview/widget/RecyclerView$AudioAttributesCompatParcelizer;

    invoke-virtual {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$AudioAttributesCompatParcelizer;->read(II)V

    return-void
.end method

.method public final notifyItemRangeChanged(II)V
    .registers 3

    .line 8153
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;->mObservable:Landroidx/recyclerview/widget/RecyclerView$AudioAttributesCompatParcelizer;

    invoke-virtual {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$AudioAttributesCompatParcelizer;->write(II)V

    return-void
.end method

.method public final notifyItemRangeChanged(IILjava/lang/Object;)V
    .registers 4

    .line 8183
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;->mObservable:Landroidx/recyclerview/widget/RecyclerView$AudioAttributesCompatParcelizer;

    invoke-virtual {p0, p1, p2, p3}, Landroidx/recyclerview/widget/RecyclerView$AudioAttributesCompatParcelizer;->RemoteActionCompatParcelizer(IILjava/lang/Object;)V

    return-void
.end method

.method public final notifyItemRangeInserted(II)V
    .registers 3

    .line 8232
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;->mObservable:Landroidx/recyclerview/widget/RecyclerView$AudioAttributesCompatParcelizer;

    invoke-virtual {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$AudioAttributesCompatParcelizer;->IconCompatParcelizer(II)V

    return-void
.end method

.method public final notifyItemRangeRemoved(II)V
    .registers 3

    .line 8265
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;->mObservable:Landroidx/recyclerview/widget/RecyclerView$AudioAttributesCompatParcelizer;

    invoke-virtual {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$AudioAttributesCompatParcelizer;->RemoteActionCompatParcelizer(II)V

    return-void
.end method

.method public final notifyItemRemoved(I)V
    .registers 3

    .line 8248
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;->mObservable:Landroidx/recyclerview/widget/RecyclerView$AudioAttributesCompatParcelizer;

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Landroidx/recyclerview/widget/RecyclerView$AudioAttributesCompatParcelizer;->RemoteActionCompatParcelizer(II)V

    return-void
.end method

.method public onAttachedToRecyclerView(Landroidx/recyclerview/widget/RecyclerView;)V
    .registers 2

    return-void
.end method

.method public abstract onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;I)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TVH;I)V"
        }
    .end annotation
.end method

.method public onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;ILjava/util/List;)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TVH;I",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 7747
    invoke-virtual {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;->onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;I)V

    return-void
.end method

.method public abstract onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/ViewGroup;",
            "I)TVH;"
        }
    .end annotation
.end method

.method public onDetachedFromRecyclerView(Landroidx/recyclerview/widget/RecyclerView;)V
    .registers 2

    return-void
.end method

.method public onFailedToRecycleView(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;)Z
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TVH;)Z"
        }
    .end annotation

    const/4 p0, 0x0

    return p0
.end method

.method public onViewAttachedToWindow(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;)V
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TVH;)V"
        }
    .end annotation

    return-void
.end method

.method public onViewDetachedFromWindow(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;)V
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TVH;)V"
        }
    .end annotation

    return-void
.end method

.method public onViewRecycled(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;)V
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TVH;)V"
        }
    .end annotation

    return-void
.end method

.method public registerAdapterDataObserver(Landroidx/recyclerview/widget/RecyclerView$read;)V
    .registers 2

    .line 8028
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;->mObservable:Landroidx/recyclerview/widget/RecyclerView$AudioAttributesCompatParcelizer;

    invoke-virtual {p0, p1}, Landroid/database/Observable;->registerObserver(Ljava/lang/Object;)V

    return-void
.end method

.method public setHasStableIds(Z)V
    .registers 3

    .line 7883
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;->hasObservers()Z

    move-result v0

    if-nez v0, :cond_9

    .line 7887
    iput-boolean p1, p0, Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;->mHasStableIds:Z

    return-void

    .line 7884
    :cond_9
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Cannot change whether this adapter has stable IDs while the adapter has registered observers."

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public setStateRestorationPolicy(Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer$read;)V
    .registers 2

    .line 8299
    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;->mStateRestorationPolicy:Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer$read;

    .line 8300
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;->mObservable:Landroidx/recyclerview/widget/RecyclerView$AudioAttributesCompatParcelizer;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer()V

    return-void
.end method

.method public unregisterAdapterDataObserver(Landroidx/recyclerview/widget/RecyclerView$read;)V
    .registers 2

    .line 8041
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;->mObservable:Landroidx/recyclerview/widget/RecyclerView$AudioAttributesCompatParcelizer;

    invoke-virtual {p0, p1}, Landroid/database/Observable;->unregisterObserver(Ljava/lang/Object;)V

    return-void
.end method

###### Class androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer.read (androidx.recyclerview.widget.RecyclerView$IconCompatParcelizer$read)
.class public final enum Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer$read;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "read"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer$read;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum AudioAttributesCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer$read;

.field public static final enum IconCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer$read;

.field public static final enum RemoteActionCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer$read;

.field private static final synthetic read:[Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer$read;


# direct methods
.method static constructor <clinit>()V
    .registers 5

    .line 8342
    new-instance v0, Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer$read;

    const-string v1, "ALLOW"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer$read;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer$read;->AudioAttributesCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer$read;

    .line 8347
    new-instance v1, Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer$read;

    const-string v2, "PREVENT_WHEN_EMPTY"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer$read;-><init>(Ljava/lang/String;I)V

    sput-object v1, Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer$read;->RemoteActionCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer$read;

    .line 8353
    new-instance v2, Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer$read;

    const-string v3, "PREVENT"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer$read;-><init>(Ljava/lang/String;I)V

    sput-object v2, Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer$read;->IconCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer$read;

    .line 8337
    filled-new-array {v0, v1, v2}, [Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer$read;

    move-result-object v0

    sput-object v0, Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer$read;->read:[Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer$read;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 8337
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer$read;
    .registers 2

    .line 8337
    const-class v0, Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer$read;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer$read;

    return-object p0
.end method

.method public static values()[Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer$read;
    .registers 1

    .line 8337
    sget-object v0, Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer$read;->read:[Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer$read;

    invoke-virtual {v0}, [Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer$read;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer$read;

    return-object v0
.end method

###### Class androidx.recyclerview.widget.RecyclerView.LayoutParams (androidx.recyclerview.widget.RecyclerView$LayoutParams)
.class public Landroidx/recyclerview/widget/RecyclerView$LayoutParams;
.super Landroid/view/ViewGroup$MarginLayoutParams;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/recyclerview/widget/RecyclerView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "LayoutParams"
.end annotation


# instance fields
.field AudioAttributesCompatParcelizer:Z

.field AudioAttributesImplBaseParcelizer:Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;

.field final RemoteActionCompatParcelizer:Landroid/graphics/Rect;

.field write:Z


# direct methods
.method public constructor <init>(II)V
    .registers 3

    .line 12533
    invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(II)V

    .line 12521
    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->RemoteActionCompatParcelizer:Landroid/graphics/Rect;

    const/4 p1, 0x1

    .line 12522
    iput-boolean p1, p0, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->AudioAttributesCompatParcelizer:Z

    const/4 p1, 0x0

    .line 12526
    iput-boolean p1, p0, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->write:Z

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 3

    .line 12529
    invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 12521
    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->RemoteActionCompatParcelizer:Landroid/graphics/Rect;

    const/4 p1, 0x1

    .line 12522
    iput-boolean p1, p0, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->AudioAttributesCompatParcelizer:Z

    const/4 p1, 0x0

    .line 12526
    iput-boolean p1, p0, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->write:Z

    return-void
.end method

.method public constructor <init>(Landroid/view/ViewGroup$LayoutParams;)V
    .registers 2

    .line 12541
    invoke-direct {p0, p1}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    .line 12521
    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->RemoteActionCompatParcelizer:Landroid/graphics/Rect;

    const/4 p1, 0x1

    .line 12522
    iput-boolean p1, p0, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->AudioAttributesCompatParcelizer:Z

    const/4 p1, 0x0

    .line 12526
    iput-boolean p1, p0, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->write:Z

    return-void
.end method

.method public constructor <init>(Landroid/view/ViewGroup$MarginLayoutParams;)V
    .registers 2

    .line 12537
    invoke-direct {p0, p1}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V

    .line 12521
    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->RemoteActionCompatParcelizer:Landroid/graphics/Rect;

    const/4 p1, 0x1

    .line 12522
    iput-boolean p1, p0, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->AudioAttributesCompatParcelizer:Z

    const/4 p1, 0x0

    .line 12526
    iput-boolean p1, p0, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->write:Z

    return-void
.end method

.method public constructor <init>(Landroidx/recyclerview/widget/RecyclerView$LayoutParams;)V
    .registers 2

    .line 12545
    invoke-direct {p0, p1}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    .line 12521
    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->RemoteActionCompatParcelizer:Landroid/graphics/Rect;

    const/4 p1, 0x1

    .line 12522
    iput-boolean p1, p0, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->AudioAttributesCompatParcelizer:Z

    const/4 p1, 0x0

    .line 12526
    iput-boolean p1, p0, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->write:Z

    return-void
.end method


# virtual methods
.method public final N_()I
    .registers 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 12616
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->AudioAttributesImplBaseParcelizer:Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->getBindingAdapterPosition()I

    move-result p0

    return p0
.end method

.method public final O_()I
    .registers 1

    .line 12605
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->AudioAttributesImplBaseParcelizer:Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->getLayoutPosition()I

    move-result p0

    return p0
.end method

.method public final P_()Z
    .registers 1

    .line 12587
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->AudioAttributesImplBaseParcelizer:Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->isUpdated()Z

    move-result p0

    return p0
.end method

.method public final Q_()Z
    .registers 1

    .line 12576
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->AudioAttributesImplBaseParcelizer:Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->isRemoved()Z

    move-result p0

    return p0
.end method

.method public final R_()Z
    .registers 1

    .line 12565
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->AudioAttributesImplBaseParcelizer:Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->isInvalid()Z

    move-result p0

    return p0
.end method

###### Class androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatCustomActionResultReceiver (androidx.recyclerview.widget.RecyclerView$MediaBrowserCompatCustomActionResultReceiver)
.class final Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatCustomActionResultReceiver;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer$read;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/recyclerview/widget/RecyclerView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "MediaBrowserCompatCustomActionResultReceiver"
.end annotation


# instance fields
.field final synthetic AudioAttributesCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;


# direct methods
.method constructor <init>(Landroidx/recyclerview/widget/RecyclerView;)V
    .registers 2

    .line 13642
    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatCustomActionResultReceiver;->AudioAttributesCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final IconCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;)V
    .registers 4

    const/4 v0, 0x1

    .line 13647
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->setIsRecyclable(Z)V

    .line 13648
    iget-object v0, p1, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mShadowedHolder:Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;

    const/4 v1, 0x0

    if-eqz v0, :cond_f

    iget-object v0, p1, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mShadowingHolder:Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;

    if-nez v0, :cond_f

    .line 13649
    iput-object v1, p1, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mShadowedHolder:Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;

    .line 13653
    :cond_f
    iput-object v1, p1, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mShadowingHolder:Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;

    .line 13654
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->shouldBeKeptAsChild()Z

    move-result v0

    if-nez v0, :cond_2f

    .line 13655
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatCustomActionResultReceiver;->AudioAttributesCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v1, p1, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->itemView:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatMediaItem(Landroid/view/View;)Z

    move-result v0

    if-nez v0, :cond_2f

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->isTmpDetached()Z

    move-result v0

    if-eqz v0, :cond_2f

    .line 13656
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatCustomActionResultReceiver;->AudioAttributesCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->itemView:Landroid/view/View;

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->removeDetachedView(Landroid/view/View;Z)V

    :cond_2f
    return-void
.end method

###### Class androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver (androidx.recyclerview.widget.RecyclerView$MediaBrowserCompatItemReceiver)
.class public abstract Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/recyclerview/widget/RecyclerView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "MediaBrowserCompatItemReceiver"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver$RemoteActionCompatParcelizer;,
        Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver$write;
    }
.end annotation


# instance fields
.field private AudioAttributesCompatParcelizer:I

.field private AudioAttributesImplApi21Parcelizer:Z

.field public AudioAttributesImplApi26Parcelizer:I

.field AudioAttributesImplBaseParcelizer:Lo/ULongDeserializer;

.field private IconCompatParcelizer:Z

.field private MediaBrowserCompatCustomActionResultReceiver:Z

.field private MediaBrowserCompatItemReceiver:Z

.field MediaBrowserCompatMediaItem:Landroidx/recyclerview/widget/RecyclerView;

.field MediaBrowserCompatSearchResultReceiver:Z

.field private MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:I

.field MediaDescriptionCompat:Landroidx/recyclerview/widget/RecyclerView$onCustomAction;

.field public MediaMetadataCompat:Z

.field RatingCompat:Lo/ULongDeserializer;

.field private RemoteActionCompatParcelizer:Lo/TypesKt;

.field private final handleMediaPlayPauseIfPendingOnHandler:Lo/ULongDeserializer$IconCompatParcelizer;

.field private onAddQueueItem:I

.field private final read:Lo/ULongDeserializer$IconCompatParcelizer;

.field private write:I


# direct methods
.method public constructor <init>()V
    .registers 4

    .line 8402
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8410
    new-instance v0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver$5;

    invoke-direct {v0, p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver$5;-><init>(Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;)V

    iput-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->read:Lo/ULongDeserializer$IconCompatParcelizer;

    .line 8446
    new-instance v1, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver$1;

    invoke-direct {v1, p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver$1;-><init>(Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;)V

    iput-object v1, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->handleMediaPlayPauseIfPendingOnHandler:Lo/ULongDeserializer$IconCompatParcelizer;

    .line 8487
    new-instance v2, Lo/ULongDeserializer;

    invoke-direct {v2, v0}, Lo/ULongDeserializer;-><init>(Lo/ULongDeserializer$IconCompatParcelizer;)V

    iput-object v2, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->AudioAttributesImplBaseParcelizer:Lo/ULongDeserializer;

    .line 8488
    new-instance v0, Lo/ULongDeserializer;

    invoke-direct {v0, v1}, Lo/ULongDeserializer;-><init>(Lo/ULongDeserializer$IconCompatParcelizer;)V

    iput-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->RatingCompat:Lo/ULongDeserializer;

    const/4 v0, 0x0

    .line 8493
    iput-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaBrowserCompatSearchResultReceiver:Z

    .line 8495
    iput-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaBrowserCompatItemReceiver:Z

    .line 8501
    iput-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->IconCompatParcelizer:Z

    const/4 v0, 0x1

    .line 8507
    iput-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->AudioAttributesImplApi21Parcelizer:Z

    .line 8509
    iput-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaBrowserCompatCustomActionResultReceiver:Z

    return-void
.end method

.method private AudioAttributesCompatParcelizer(I)V
    .registers 3

    .line 9467
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaBrowserCompatCustomActionResultReceiver(I)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_b

    .line 9469
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->RemoteActionCompatParcelizer:Lo/TypesKt;

    invoke-virtual {p0, p1}, Lo/TypesKt;->IconCompatParcelizer(I)V

    :cond_b
    return-void
.end method

.method public static AudioAttributesImplApi21Parcelizer(Landroid/view/View;)I
    .registers 2

    .line 10506
    invoke-virtual {p0}, Landroid/view/View;->getBottom()I

    move-result v0

    invoke-static {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->AudioAttributesImplApi26Parcelizer(Landroid/view/View;)I

    move-result p0

    add-int/2addr v0, p0

    return v0
.end method

.method public static AudioAttributesImplApi26Parcelizer(Landroid/view/View;)I
    .registers 1

    .line 10562
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p0

    check-cast p0, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->RemoteActionCompatParcelizer:Landroid/graphics/Rect;

    iget p0, p0, Landroid/graphics/Rect;->bottom:I

    return p0
.end method

.method public static AudioAttributesImplBaseParcelizer(Landroid/view/View;)I
    .registers 3

    .line 10323
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->RemoteActionCompatParcelizer:Landroid/graphics/Rect;

    .line 10324
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result p0

    iget v1, v0, Landroid/graphics/Rect;->left:I

    add-int/2addr p0, v1

    iget v0, v0, Landroid/graphics/Rect;->right:I

    add-int/2addr p0, v0

    return p0
.end method

.method private IconCompatParcelizer(I)V
    .registers 2

    .line 9619
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->RemoteActionCompatParcelizer:Lo/TypesKt;

    invoke-virtual {p0, p1}, Lo/TypesKt;->write(I)V

    return-void
.end method

.method private IconCompatParcelizer(Landroid/view/View;I)V
    .registers 4

    .line 9653
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    invoke-direct {p0, p1, p2, v0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->RemoteActionCompatParcelizer(Landroid/view/View;ILandroidx/recyclerview/widget/RecyclerView$LayoutParams;)V

    return-void
.end method

.method private IconCompatParcelizer(Landroid/view/View;IZ)V
    .registers 8

    .line 9392
    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->IconCompatParcelizer(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;

    move-result-object v0

    if-nez p3, :cond_14

    .line 9393
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->isRemoved()Z

    move-result p3

    if-nez p3, :cond_14

    .line 9402
    iget-object p3, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaBrowserCompatMediaItem:Landroidx/recyclerview/widget/RecyclerView;

    iget-object p3, p3, Landroidx/recyclerview/widget/RecyclerView;->onSetRating:Lo/UIntSerializer;

    invoke-virtual {p3, v0}, Lo/UIntSerializer;->AudioAttributesImplApi26Parcelizer(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;)V

    goto :goto_1b

    .line 9395
    :cond_14
    iget-object p3, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaBrowserCompatMediaItem:Landroidx/recyclerview/widget/RecyclerView;

    iget-object p3, p3, Landroidx/recyclerview/widget/RecyclerView;->onSetRating:Lo/UIntSerializer;

    invoke-virtual {p3, v0}, Lo/UIntSerializer;->read(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;)V

    .line 9404
    :goto_1b
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p3

    check-cast p3, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    .line 9405
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->wasReturnedFromScrap()Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_8c

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->isScrap()Z

    move-result v1

    if-nez v1, :cond_8c

    .line 9415
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaBrowserCompatMediaItem:Landroidx/recyclerview/widget/RecyclerView;

    if-ne v1, v3, :cond_74

    .line 9417
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->RemoteActionCompatParcelizer:Lo/TypesKt;

    invoke-virtual {v1, p1}, Lo/TypesKt;->read(Landroid/view/View;)I

    move-result v1

    const/4 v3, -0x1

    if-ne p2, v3, :cond_45

    .line 9419
    iget-object p2, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->RemoteActionCompatParcelizer:Lo/TypesKt;

    invoke-virtual {p2}, Lo/TypesKt;->read()I

    move-result p2

    :cond_45
    if-eq v1, v3, :cond_51

    if-eq v1, p2, :cond_a2

    .line 9427
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaBrowserCompatMediaItem:Landroidx/recyclerview/widget/RecyclerView;

    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPlayFromMediaId:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    invoke-direct {p0, v1, p2}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->read(II)V

    goto :goto_a2

    .line 9422
    :cond_51
    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "Added View has RecyclerView as parent but view is not a real child. Unfiltered index:"

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object p3, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaBrowserCompatMediaItem:Landroidx/recyclerview/widget/RecyclerView;

    .line 9424
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p3, p1}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaBrowserCompatMediaItem:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->write()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 9430
    :cond_74
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->RemoteActionCompatParcelizer:Lo/TypesKt;

    invoke-virtual {v1, p1, p2, v2}, Lo/TypesKt;->AudioAttributesCompatParcelizer(Landroid/view/View;IZ)V

    const/4 p2, 0x1

    .line 9431
    iput-boolean p2, p3, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->AudioAttributesCompatParcelizer:Z

    .line 9432
    iget-object p2, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaDescriptionCompat:Landroidx/recyclerview/widget/RecyclerView$onCustomAction;

    if-eqz p2, :cond_a2

    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView$onCustomAction;->MediaBrowserCompatCustomActionResultReceiver()Z

    move-result p2

    if-eqz p2, :cond_a2

    .line 9433
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaDescriptionCompat:Landroidx/recyclerview/widget/RecyclerView$onCustomAction;

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$onCustomAction;->write(Landroid/view/View;)V

    goto :goto_a2

    .line 9406
    :cond_8c
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->isScrap()Z

    move-result v1

    if-eqz v1, :cond_96

    .line 9407
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->unScrap()V

    goto :goto_99

    .line 9409
    :cond_96
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->clearReturnedFromScrapFlag()V

    .line 9411
    :goto_99
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->RemoteActionCompatParcelizer:Lo/TypesKt;

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    invoke-virtual {p0, p1, p2, v1, v2}, Lo/TypesKt;->AudioAttributesCompatParcelizer(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;Z)V

    .line 9436
    :cond_a2
    :goto_a2
    iget-boolean p0, p3, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->write:Z

    if-eqz p0, :cond_b6

    .line 9437
    sget-boolean p0, Landroidx/recyclerview/widget/RecyclerView;->AudioAttributesImplBaseParcelizer:Z

    if-eqz p0, :cond_af

    .line 9438
    iget-object p0, p3, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->AudioAttributesImplBaseParcelizer:Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;

    invoke-static {p0}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 9440
    :cond_af
    iget-object p0, v0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->itemView:Landroid/view/View;

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 9441
    iput-boolean v2, p3, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->write:Z

    :cond_b6
    return-void
.end method

.method private IconCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;ILandroid/view/View;)V
    .registers 6

    .line 10027
    invoke-static {p3}, Landroidx/recyclerview/widget/RecyclerView;->IconCompatParcelizer(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;

    move-result-object v0

    .line 10028
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->shouldIgnore()Z

    move-result v1

    if-eqz v1, :cond_12

    .line 10029
    sget-boolean p0, Landroidx/recyclerview/widget/RecyclerView;->AudioAttributesImplBaseParcelizer:Z

    if-eqz p0, :cond_11

    .line 10030
    invoke-static {v0}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_11
    return-void

    .line 10034
    :cond_12
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->isInvalid()Z

    move-result v1

    if-eqz v1, :cond_2f

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->isRemoved()Z

    move-result v1

    if-nez v1, :cond_2f

    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaBrowserCompatMediaItem:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v1, v1, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatItemReceiver:Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;

    .line 10035
    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;->hasStableIds()Z

    move-result v1

    if-nez v1, :cond_2f

    .line 10036
    invoke-direct {p0, p2}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->AudioAttributesCompatParcelizer(I)V

    .line 10037
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->read(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;)V

    return-void

    .line 10039
    :cond_2f
    invoke-direct {p0, p2}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->RemoteActionCompatParcelizer(I)V

    .line 10040
    invoke-virtual {p1, p3}, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->RemoteActionCompatParcelizer(Landroid/view/View;)V

    .line 10041
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaBrowserCompatMediaItem:Landroidx/recyclerview/widget/RecyclerView;

    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView;->onSetRating:Lo/UIntSerializer;

    invoke-virtual {p0, v0}, Lo/UIntSerializer;->AudioAttributesCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;)V

    return-void
.end method

.method private IconCompatParcelizer(Landroid/view/View;Landroid/graphics/Rect;)[I
    .registers 14

    .line 10656
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->getPaddingLeft()I

    move-result v0

    .line 10657
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->getPaddingTop()I

    move-result v1

    .line 10658
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onPrepare()I

    move-result v2

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->getPaddingRight()I

    move-result v3

    .line 10659
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onMediaButtonEvent()I

    move-result v4

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->getPaddingBottom()I

    move-result v5

    .line 10660
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    move-result v6

    iget v7, p2, Landroid/graphics/Rect;->left:I

    add-int/2addr v6, v7

    invoke-virtual {p1}, Landroid/view/View;->getScrollX()I

    move-result v7

    sub-int/2addr v6, v7

    .line 10661
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result v7

    iget v8, p2, Landroid/graphics/Rect;->top:I

    add-int/2addr v7, v8

    invoke-virtual {p1}, Landroid/view/View;->getScrollY()I

    move-result p1

    sub-int/2addr v7, p1

    .line 10662
    invoke-virtual {p2}, Landroid/graphics/Rect;->width()I

    move-result p1

    .line 10663
    invoke-virtual {p2}, Landroid/graphics/Rect;->height()I

    move-result p2

    sub-int v0, v6, v0

    const/4 v8, 0x0

    .line 10665
    invoke-static {v8, v0}, Ljava/lang/Math;->min(II)I

    move-result v9

    sub-int v1, v7, v1

    .line 10666
    invoke-static {v8, v1}, Ljava/lang/Math;->min(II)I

    move-result v10

    add-int/2addr p1, v6

    sub-int/2addr v2, v3

    sub-int/2addr p1, v2

    .line 10667
    invoke-static {v8, p1}, Ljava/lang/Math;->max(II)I

    move-result v2

    add-int/2addr p2, v7

    sub-int/2addr v4, v5

    sub-int/2addr p2, v4

    .line 10668
    invoke-static {v8, p2}, Ljava/lang/Math;->max(II)I

    move-result p2

    .line 10674
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onPlayFromSearch()I

    move-result p0

    const/4 v3, 0x1

    if-ne p0, v3, :cond_63

    if-eqz v2, :cond_5e

    move v9, v2

    goto :goto_69

    .line 10676
    :cond_5e
    invoke-static {v9, p1}, Ljava/lang/Math;->max(II)I

    move-result v9

    goto :goto_69

    :cond_63
    if-nez v9, :cond_69

    .line 10679
    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    move-result v9

    :cond_69
    :goto_69
    if-nez v10, :cond_6f

    .line 10685
    invoke-static {v1, p2}, Ljava/lang/Math;->min(II)I

    move-result v10

    .line 10687
    :cond_6f
    filled-new-array {v9, v10}, [I

    move-result-object p0

    return-object p0
.end method

.method public static MediaBrowserCompatCustomActionResultReceiver(Landroid/view/View;)I
    .registers 3

    .line 10336
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->RemoteActionCompatParcelizer:Landroid/graphics/Rect;

    .line 10337
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result p0

    iget v1, v0, Landroid/graphics/Rect;->top:I

    add-int/2addr p0, v1

    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    add-int/2addr p0, v0

    return p0
.end method

.method public static MediaBrowserCompatItemReceiver(Landroid/view/View;)I
    .registers 2

    .line 10470
    invoke-virtual {p0}, Landroid/view/View;->getLeft()I

    move-result v0

    invoke-static {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaBrowserCompatSearchResultReceiver(Landroid/view/View;)I

    move-result p0

    sub-int/2addr v0, p0

    return v0
.end method

.method private MediaBrowserCompatItemReceiver(Landroidx/recyclerview/widget/RecyclerView;)Z
    .registers 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 10819
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onSetRepeatMode()Z

    move-result p0

    if-nez p0, :cond_e

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatMediaItem()Z

    move-result p0

    if-nez p0, :cond_e

    const/4 p0, 0x0

    return p0

    :cond_e
    const/4 p0, 0x1

    return p0
.end method

.method public static MediaBrowserCompatMediaItem(Landroid/view/View;)I
    .registers 1

    .line 9513
    invoke-static {p0}, Landroidx/recyclerview/widget/RecyclerView;->IconCompatParcelizer(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;

    move-result-object p0

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->getItemViewType()I

    move-result p0

    return p0
.end method

.method public static MediaBrowserCompatSearchResultReceiver(Landroid/view/View;)I
    .registers 1

    .line 10577
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p0

    check-cast p0, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->RemoteActionCompatParcelizer:Landroid/graphics/Rect;

    iget p0, p0, Landroid/graphics/Rect;->left:I

    return p0
.end method

.method public static MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(Landroid/view/View;)I
    .registers 1

    .line 10547
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p0

    check-cast p0, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->RemoteActionCompatParcelizer:Landroid/graphics/Rect;

    iget p0, p0, Landroid/graphics/Rect;->top:I

    return p0
.end method

.method public static MediaDescriptionCompat(Landroid/view/View;)I
    .registers 1

    .line 9503
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p0

    check-cast p0, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->O_()I

    move-result p0

    return p0
.end method

.method public static MediaMetadataCompat(Landroid/view/View;)I
    .registers 2

    .line 10494
    invoke-virtual {p0}, Landroid/view/View;->getRight()I

    move-result v0

    invoke-static {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->handleMediaPlayPauseIfPendingOnHandler(Landroid/view/View;)I

    move-result p0

    add-int/2addr v0, p0

    return v0
.end method

.method public static RatingCompat(Landroid/view/View;)I
    .registers 2

    .line 10482
    invoke-virtual {p0}, Landroid/view/View;->getTop()I

    move-result v0

    invoke-static {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(Landroid/view/View;)I

    move-result p0

    sub-int/2addr v0, p0

    return v0
.end method

.method private RemoteActionCompatParcelizer(I)V
    .registers 2

    .line 9612
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaBrowserCompatCustomActionResultReceiver(I)Landroid/view/View;

    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->IconCompatParcelizer(I)V

    return-void
.end method

.method public static RemoteActionCompatParcelizer(Landroid/view/View;IIII)V
    .registers 8

    .line 10405
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    .line 10406
    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->RemoteActionCompatParcelizer:Landroid/graphics/Rect;

    .line 10407
    iget v2, v1, Landroid/graphics/Rect;->left:I

    add-int/2addr p1, v2

    iget v2, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    add-int/2addr p1, v2

    iget v2, v1, Landroid/graphics/Rect;->top:I

    add-int/2addr p2, v2

    iget v2, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    add-int/2addr p2, v2

    iget v2, v1, Landroid/graphics/Rect;->right:I

    sub-int/2addr p3, v2

    iget v2, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    sub-int/2addr p3, v2

    iget v1, v1, Landroid/graphics/Rect;->bottom:I

    sub-int/2addr p4, v1

    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    sub-int/2addr p4, v0

    invoke-virtual {p0, p1, p2, p3, p4}, Landroid/view/View;->layout(IIII)V

    return-void
.end method

.method private RemoteActionCompatParcelizer(Landroid/view/View;ILandroidx/recyclerview/widget/RecyclerView$LayoutParams;)V
    .registers 6

    .line 9632
    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->IconCompatParcelizer(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;

    move-result-object v0

    .line 9633
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->isRemoved()Z

    move-result v1

    if-eqz v1, :cond_12

    .line 9634
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaBrowserCompatMediaItem:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v1, v1, Landroidx/recyclerview/widget/RecyclerView;->onSetRating:Lo/UIntSerializer;

    invoke-virtual {v1, v0}, Lo/UIntSerializer;->read(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;)V

    goto :goto_19

    .line 9636
    :cond_12
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaBrowserCompatMediaItem:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v1, v1, Landroidx/recyclerview/widget/RecyclerView;->onSetRating:Lo/UIntSerializer;

    invoke-virtual {v1, v0}, Lo/UIntSerializer;->AudioAttributesImplApi26Parcelizer(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;)V

    .line 9638
    :goto_19
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->RemoteActionCompatParcelizer:Lo/TypesKt;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->isRemoved()Z

    move-result v0

    invoke-virtual {p0, p1, p2, p3, v0}, Lo/TypesKt;->AudioAttributesCompatParcelizer(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;Z)V

    return-void
.end method

.method private static RemoteActionCompatParcelizer(III)Z
    .registers 6

    .line 10166
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    .line 10167
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    const/4 v1, 0x0

    if-lez p2, :cond_e

    if-eq p0, p2, :cond_e

    return v1

    :cond_e
    const/high16 p2, -0x80000000

    const/4 v2, 0x1

    if-eq v0, p2, :cond_1f

    if-eqz v0, :cond_1e

    const/high16 p2, 0x40000000    # 2.0f

    if-eq v0, p2, :cond_1a

    return v1

    :cond_1a
    if-ne p1, p0, :cond_1d

    return v2

    :cond_1d
    return v1

    :cond_1e
    return v2

    :cond_1f
    if-lt p1, p0, :cond_22

    return v2

    :cond_22
    return v1
.end method

.method public static a_(III)I
    .registers 5

    .line 8695
    invoke-static {p0}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    .line 8696
    invoke-static {p0}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p0

    const/high16 v1, -0x80000000

    if-eq v0, v1, :cond_15

    const/high16 v1, 0x40000000    # 2.0f

    if-eq v0, v1, :cond_14

    .line 8704
    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    move-result p0

    :cond_14
    return p0

    .line 8701
    :cond_15
    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    move-result p1

    invoke-static {p0, p1}, Ljava/lang/Math;->min(II)I

    move-result p0

    return p0
.end method

.method public static handleMediaPlayPauseIfPendingOnHandler(Landroid/view/View;)I
    .registers 1

    .line 10592
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p0

    check-cast p0, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->RemoteActionCompatParcelizer:Landroid/graphics/Rect;

    iget p0, p0, Landroid/graphics/Rect;->right:I

    return p0
.end method

.method public static onCustomAction()I
    .registers 1

    const/4 v0, -0x1

    return v0
.end method

.method public static onMediaButtonEvent(Landroid/view/View;)V
    .registers 2

    .line 10005
    invoke-static {p0}, Landroidx/recyclerview/widget/RecyclerView;->IconCompatParcelizer(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;

    move-result-object p0

    .line 10006
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->stopIgnoring()V

    .line 10007
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->resetInternal()V

    const/4 v0, 0x4

    .line 10008
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->addFlags(I)V

    return-void
.end method

.method public static read(Landroid/content/Context;Landroid/util/AttributeSet;II)Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver$write;
    .registers 6

    .line 11445
    new-instance v0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver$write;

    invoke-direct {v0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver$write;-><init>()V

    .line 11446
    sget-object v1, Lo/accessgetTRUEcp$IconCompatParcelizer;->RecyclerView:[I

    invoke-virtual {p0, p1, v1, p2, p3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p0

    .line 11448
    sget p1, Lo/accessgetTRUEcp$IconCompatParcelizer;->RecyclerView_android_orientation:I

    const/4 p2, 0x1

    invoke-virtual {p0, p1, p2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p1

    iput p1, v0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver$write;->write:I

    .line 11450
    sget p1, Lo/accessgetTRUEcp$IconCompatParcelizer;->RecyclerView_spanCount:I

    invoke-virtual {p0, p1, p2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p1

    iput p1, v0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver$write;->AudioAttributesCompatParcelizer:I

    .line 11451
    sget p1, Lo/accessgetTRUEcp$IconCompatParcelizer;->RecyclerView_reverseLayout:I

    const/4 p2, 0x0

    invoke-virtual {p0, p1, p2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p1

    iput-boolean p1, v0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver$write;->RemoteActionCompatParcelizer:Z

    .line 11452
    sget p1, Lo/accessgetTRUEcp$IconCompatParcelizer;->RecyclerView_stackFromEnd:I

    invoke-virtual {p0, p1, p2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p1

    iput-boolean p1, v0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver$write;->IconCompatParcelizer:Z

    .line 11453
    invoke-virtual {p0}, Landroid/content/res/TypedArray;->recycle()V

    return-object v0
.end method

.method private read(II)V
    .registers 4

    .line 9684
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaBrowserCompatCustomActionResultReceiver(I)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_d

    .line 9689
    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->RemoteActionCompatParcelizer(I)V

    .line 9690
    invoke-direct {p0, v0, p2}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->IconCompatParcelizer(Landroid/view/View;I)V

    return-void

    .line 9686
    :cond_d
    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "Cannot move a child from non-existing index:"

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaBrowserCompatMediaItem:Landroidx/recyclerview/widget/RecyclerView;

    .line 9687
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private read(Landroid/view/accessibility/AccessibilityEvent;)V
    .registers 5

    .line 11226
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaBrowserCompatMediaItem:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v0, :cond_3c

    if-eqz p1, :cond_3c

    const/4 v1, 0x1

    .line 11229
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->canScrollVertically(I)Z

    move-result v0

    if-nez v0, :cond_28

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaBrowserCompatMediaItem:Landroidx/recyclerview/widget/RecyclerView;

    const/4 v2, -0x1

    .line 11230
    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/RecyclerView;->canScrollVertically(I)Z

    move-result v0

    if-nez v0, :cond_28

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaBrowserCompatMediaItem:Landroidx/recyclerview/widget/RecyclerView;

    .line 11231
    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/RecyclerView;->canScrollHorizontally(I)Z

    move-result v0

    if-nez v0, :cond_28

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaBrowserCompatMediaItem:Landroidx/recyclerview/widget/RecyclerView;

    .line 11232
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->canScrollHorizontally(I)Z

    move-result v0

    if-eqz v0, :cond_27

    goto :goto_28

    :cond_27
    const/4 v1, 0x0

    .line 11229
    :cond_28
    :goto_28
    invoke-virtual {p1, v1}, Landroid/view/accessibility/AccessibilityEvent;->setScrollable(Z)V

    .line 11234
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaBrowserCompatMediaItem:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatItemReceiver:Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;

    if-eqz v0, :cond_3c

    .line 11235
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaBrowserCompatMediaItem:Landroidx/recyclerview/widget/RecyclerView;

    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatItemReceiver:Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;->getItemCount()I

    move-result p0

    invoke-virtual {p1, p0}, Landroid/view/accessibility/AccessibilityEvent;->setItemCount(I)V

    :cond_3c
    return-void
.end method

.method public static write(IIIIZ)I
    .registers 8

    sub-int/2addr p0, p2

    const/4 p2, 0x0

    .line 10270
    invoke-static {p2, p0}, Ljava/lang/Math;->max(II)I

    move-result p0

    const/4 v0, -0x1

    const/high16 v1, -0x80000000

    const/high16 v2, 0x40000000    # 2.0f

    if-eqz p4, :cond_18

    if-gez p3, :cond_1a

    if-ne p3, v0, :cond_2d

    if-eq p1, v1, :cond_1e

    if-eqz p1, :cond_2d

    if-eq p1, v2, :cond_1e

    goto :goto_2d

    :cond_18
    if-ltz p3, :cond_1c

    :cond_1a
    move p1, v2

    goto :goto_2f

    :cond_1c
    if-ne p3, v0, :cond_20

    :cond_1e
    move p3, p0

    goto :goto_2f

    :cond_20
    const/4 p4, -0x2

    if-ne p3, p4, :cond_2d

    if-eq p1, v1, :cond_2a

    if-eq p1, v2, :cond_2a

    move p3, p0

    move p1, p2

    goto :goto_2f

    :cond_2a
    move p3, p0

    move p1, v1

    goto :goto_2f

    :cond_2d
    :goto_2d
    move p1, p2

    move p3, p1

    .line 10311
    :goto_2f
    invoke-static {p3, p1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p0

    return p0
.end method

.method private write(Landroidx/recyclerview/widget/RecyclerView;II)Z
    .registers 12

    .line 10794
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getFocusedChild()Landroid/view/View;

    move-result-object p1

    const/4 v0, 0x0

    if-nez p1, :cond_8

    return v0

    .line 10798
    :cond_8
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->getPaddingLeft()I

    move-result v1

    .line 10799
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->getPaddingTop()I

    move-result v2

    .line 10800
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onPrepare()I

    move-result v3

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->getPaddingRight()I

    move-result v4

    .line 10801
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onMediaButtonEvent()I

    move-result v5

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->getPaddingBottom()I

    move-result v6

    .line 10802
    iget-object v7, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaBrowserCompatMediaItem:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v7, v7, Landroidx/recyclerview/widget/RecyclerView;->onSetPlaybackSpeed:Landroid/graphics/Rect;

    .line 10803
    invoke-virtual {p0, p1, v7}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->read(Landroid/view/View;Landroid/graphics/Rect;)V

    .line 10805
    iget p0, v7, Landroid/graphics/Rect;->left:I

    sub-int/2addr p0, p2

    sub-int/2addr v3, v4

    if-ge p0, v3, :cond_3f

    iget p0, v7, Landroid/graphics/Rect;->right:I

    sub-int/2addr p0, p2

    if-le p0, v1, :cond_3f

    iget p0, v7, Landroid/graphics/Rect;->top:I

    sub-int/2addr p0, p3

    sub-int/2addr v5, v6

    if-ge p0, v5, :cond_3f

    iget p0, v7, Landroid/graphics/Rect;->bottom:I

    sub-int/2addr p0, p3

    if-le p0, v2, :cond_3f

    const/4 p0, 0x1

    return p0

    :cond_3f
    return v0
.end method


# virtual methods
.method public AudioAttributesCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)I
    .registers 2

    const/4 p0, 0x0

    return p0
.end method

.method public AudioAttributesCompatParcelizer(Landroid/view/View;ILandroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)Landroid/view/View;
    .registers 5

    const/4 p0, 0x0

    return-object p0
.end method

.method public AudioAttributesCompatParcelizer(Landroid/content/Context;Landroid/util/AttributeSet;)Landroidx/recyclerview/widget/RecyclerView$LayoutParams;
    .registers 3

    .line 9189
    new-instance p0, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    invoke-direct {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-object p0
.end method

.method final AudioAttributesCompatParcelizer(II)V
    .registers 11

    .line 8605
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onPlay()I

    move-result v0

    if-nez v0, :cond_c

    .line 8607
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaBrowserCompatMediaItem:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->IconCompatParcelizer(II)V

    return-void

    :cond_c
    const v1, 0x7fffffff

    const/high16 v2, -0x80000000

    const/4 v3, 0x0

    move v4, v2

    move v5, v3

    move v2, v1

    move v3, v4

    :goto_16
    if-ge v5, v0, :cond_3e

    .line 8616
    invoke-virtual {p0, v5}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaBrowserCompatCustomActionResultReceiver(I)Landroid/view/View;

    move-result-object v6

    .line 8617
    iget-object v7, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaBrowserCompatMediaItem:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v7, v7, Landroidx/recyclerview/widget/RecyclerView;->onSetPlaybackSpeed:Landroid/graphics/Rect;

    .line 8618
    invoke-virtual {p0, v6, v7}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->read(Landroid/view/View;Landroid/graphics/Rect;)V

    .line 8619
    iget v6, v7, Landroid/graphics/Rect;->left:I

    if-ge v6, v1, :cond_29

    .line 8620
    iget v1, v7, Landroid/graphics/Rect;->left:I

    .line 8622
    :cond_29
    iget v6, v7, Landroid/graphics/Rect;->right:I

    if-le v6, v3, :cond_2f

    .line 8623
    iget v3, v7, Landroid/graphics/Rect;->right:I

    .line 8625
    :cond_2f
    iget v6, v7, Landroid/graphics/Rect;->top:I

    if-ge v6, v2, :cond_35

    .line 8626
    iget v2, v7, Landroid/graphics/Rect;->top:I

    .line 8628
    :cond_35
    iget v6, v7, Landroid/graphics/Rect;->bottom:I

    if-le v6, v4, :cond_3b

    .line 8629
    iget v4, v7, Landroid/graphics/Rect;->bottom:I

    :cond_3b
    add-int/lit8 v5, v5, 0x1

    goto :goto_16

    .line 8632
    :cond_3e
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaBrowserCompatMediaItem:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->onSetPlaybackSpeed:Landroid/graphics/Rect;

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/graphics/Rect;->set(IIII)V

    .line 8633
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaBrowserCompatMediaItem:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->onSetPlaybackSpeed:Landroid/graphics/Rect;

    invoke-virtual {p0, v0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->IconCompatParcelizer(Landroid/graphics/Rect;II)V

    return-void
.end method

.method public AudioAttributesCompatParcelizer(IILandroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver$RemoteActionCompatParcelizer;)V
    .registers 5

    return-void
.end method

.method public AudioAttributesCompatParcelizer(ILandroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver$RemoteActionCompatParcelizer;)V
    .registers 3

    return-void
.end method

.method public final AudioAttributesCompatParcelizer(Landroid/view/View;)V
    .registers 3

    const/4 v0, -0x1

    .line 9375
    invoke-virtual {p0, p1, v0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->read(Landroid/view/View;I)V

    return-void
.end method

.method public final AudioAttributesCompatParcelizer(Landroid/view/View;I)V
    .registers 4

    const/4 v0, 0x1

    .line 9363
    invoke-direct {p0, p1, p2, v0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->IconCompatParcelizer(Landroid/view/View;IZ)V

    return-void
.end method

.method public final AudioAttributesCompatParcelizer(Landroid/view/View;Landroid/graphics/Rect;)V
    .registers 3

    .line 10527
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaBrowserCompatMediaItem:Landroidx/recyclerview/widget/RecyclerView;

    if-nez p0, :cond_9

    const/4 p0, 0x0

    .line 10528
    invoke-virtual {p2, p0, p0, p0, p0}, Landroid/graphics/Rect;->set(IIII)V

    return-void

    .line 10531
    :cond_9
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->AudioAttributesImplApi21Parcelizer(Landroid/view/View;)Landroid/graphics/Rect;

    move-result-object p0

    .line 10532
    invoke-virtual {p2, p0}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    return-void
.end method

.method public final AudioAttributesCompatParcelizer(Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;)V
    .registers 3

    .line 9728
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onPlayFromMediaId(Landroid/view/View;)V

    .line 9729
    invoke-virtual {p2, p1}, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->write(Landroid/view/View;)V

    return-void
.end method

.method public AudioAttributesCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView;)V
    .registers 2

    return-void
.end method

.method public AudioAttributesCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView;I)V
    .registers 3

    return-void
.end method

.method public AudioAttributesCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView;II)V
    .registers 4

    return-void
.end method

.method public final AudioAttributesCompatParcelizer(Lo/hasSuperClassStartingWith;)V
    .registers 4

    .line 11161
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaBrowserCompatMediaItem:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->onRemoveQueueItemAt:Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;

    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaBrowserCompatMediaItem:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v1, v1, Landroidx/recyclerview/widget/RecyclerView;->onPrepareFromUri:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    invoke-virtual {p0, v0, v1, p1}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->IconCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;Lo/hasSuperClassStartingWith;)V

    return-void
.end method

.method public final AudioAttributesCompatParcelizer(ILandroid/os/Bundle;)Z
    .registers 5

    .line 11350
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaBrowserCompatMediaItem:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->onRemoveQueueItemAt:Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;

    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaBrowserCompatMediaItem:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v1, v1, Landroidx/recyclerview/widget/RecyclerView;->onPrepareFromUri:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    invoke-virtual {p0, v0, v1, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->write(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;ILandroid/os/Bundle;)Z

    move-result p0

    return p0
.end method

.method public final AudioAttributesCompatParcelizer(Ljava/lang/Runnable;)Z
    .registers 2

    .line 8978
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaBrowserCompatMediaItem:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz p0, :cond_9

    .line 8979
    invoke-virtual {p0, p1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    move-result p0

    return p0

    :cond_9
    const/4 p0, 0x0

    return p0
.end method

.method public AudioAttributesImplApi21Parcelizer()Z
    .registers 1

    const/4 p0, 0x0

    return p0
.end method

.method public AudioAttributesImplApi26Parcelizer(I)V
    .registers 2

    .line 9962
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaBrowserCompatMediaItem:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz p0, :cond_7

    .line 9963
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->AudioAttributesImplApi26Parcelizer(I)V

    :cond_7
    return-void
.end method

.method public AudioAttributesImplApi26Parcelizer()Z
    .registers 1

    const/4 p0, 0x0

    return p0
.end method

.method public AudioAttributesImplBaseParcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)I
    .registers 2

    const/4 p0, 0x0

    return p0
.end method

.method public AudioAttributesImplBaseParcelizer(I)V
    .registers 2

    .line 9950
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaBrowserCompatMediaItem:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz p0, :cond_7

    .line 9951
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->AudioAttributesCompatParcelizer(I)V

    :cond_7
    return-void
.end method

.method public IconCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)I
    .registers 2

    const/4 p0, 0x0

    return p0
.end method

.method public IconCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)I
    .registers 3

    const/4 p0, -0x1

    return p0
.end method

.method final IconCompatParcelizer(II)V
    .registers 4

    .line 8578
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v0

    iput v0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onAddQueueItem:I

    .line 8579
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result p1

    iput p1, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:I

    const/4 v0, 0x0

    if-nez p1, :cond_15

    .line 8580
    sget-boolean p1, Landroidx/recyclerview/widget/RecyclerView;->read:Z

    if-nez p1, :cond_15

    .line 8581
    iput v0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onAddQueueItem:I

    .line 8584
    :cond_15
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    iput p1, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->write:I

    .line 8585
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result p1

    iput p1, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->AudioAttributesCompatParcelizer:I

    if-nez p1, :cond_29

    .line 8586
    sget-boolean p1, Landroidx/recyclerview/widget/RecyclerView;->read:Z

    if-nez p1, :cond_29

    .line 8587
    iput v0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->write:I

    :cond_29
    return-void
.end method

.method public final IconCompatParcelizer(ILandroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;)V
    .registers 4

    .line 9739
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaBrowserCompatCustomActionResultReceiver(I)Landroid/view/View;

    move-result-object v0

    .line 9740
    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->AudioAttributesCompatParcelizer(I)V

    .line 9741
    invoke-virtual {p2, v0}, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->write(Landroid/view/View;)V

    return-void
.end method

.method public IconCompatParcelizer(Landroid/graphics/Rect;II)V
    .registers 9

    .line 8656
    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    move-result v0

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->getPaddingLeft()I

    move-result v1

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->getPaddingRight()I

    move-result v2

    .line 8657
    invoke-virtual {p1}, Landroid/graphics/Rect;->height()I

    move-result p1

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->getPaddingTop()I

    move-result v3

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->getPaddingBottom()I

    move-result v4

    add-int/2addr v0, v1

    add-int/2addr v0, v2

    .line 8658
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onPlayFromUri()I

    move-result v1

    invoke-static {p2, v0, v1}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->a_(III)I

    move-result p2

    add-int/2addr p1, v3

    add-int/2addr p1, v4

    .line 8659
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onPrepareFromSearch()I

    move-result v0

    invoke-static {p3, p1, v0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->a_(III)I

    move-result p1

    .line 8660
    invoke-virtual {p0, p2, p1}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->RemoteActionCompatParcelizer(II)V

    return-void
.end method

.method public IconCompatParcelizer(Landroid/os/Parcelable;)V
    .registers 2

    return-void
.end method

.method public final IconCompatParcelizer(Landroid/view/View;Lo/hasSuperClassStartingWith;)V
    .registers 5

    .line 11241
    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->IconCompatParcelizer(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;

    move-result-object v0

    if-eqz v0, :cond_21

    .line 11243
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->isRemoved()Z

    move-result v1

    if-nez v1, :cond_21

    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->RemoteActionCompatParcelizer:Lo/TypesKt;

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->itemView:Landroid/view/View;

    invoke-virtual {v1, v0}, Lo/TypesKt;->IconCompatParcelizer(Landroid/view/View;)Z

    move-result v0

    if-nez v0, :cond_21

    .line 11244
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaBrowserCompatMediaItem:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->onRemoveQueueItemAt:Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;

    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaBrowserCompatMediaItem:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v1, v1, Landroidx/recyclerview/widget/RecyclerView;->onPrepareFromUri:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    invoke-virtual {p0, v0, v1, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->IconCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;Landroid/view/View;Lo/hasSuperClassStartingWith;)V

    :cond_21
    return-void
.end method

.method public IconCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;)V
    .registers 3

    return-void
.end method

.method public IconCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;Landroid/view/View;Lo/hasSuperClassStartingWith;)V
    .registers 5

    return-void
.end method

.method public IconCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;Lo/hasSuperClassStartingWith;)V
    .registers 7

    .line 11191
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaBrowserCompatMediaItem:Landroidx/recyclerview/widget/RecyclerView;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->canScrollVertically(I)Z

    move-result v0

    const/4 v2, 0x1

    if-nez v0, :cond_12

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaBrowserCompatMediaItem:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->canScrollHorizontally(I)Z

    move-result v0

    if-eqz v0, :cond_1a

    :cond_12
    const/16 v0, 0x2000

    .line 11192
    invoke-virtual {p3, v0}, Lo/hasSuperClassStartingWith;->AudioAttributesCompatParcelizer(I)V

    .line 11193
    invoke-virtual {p3, v2}, Lo/hasSuperClassStartingWith;->handleMediaPlayPauseIfPendingOnHandler(Z)V

    .line 11195
    :cond_1a
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaBrowserCompatMediaItem:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/RecyclerView;->canScrollVertically(I)Z

    move-result v0

    if-nez v0, :cond_2a

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaBrowserCompatMediaItem:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/RecyclerView;->canScrollHorizontally(I)Z

    move-result v0

    if-eqz v0, :cond_32

    :cond_2a
    const/16 v0, 0x1000

    .line 11196
    invoke-virtual {p3, v0}, Lo/hasSuperClassStartingWith;->AudioAttributesCompatParcelizer(I)V

    .line 11197
    invoke-virtual {p3, v2}, Lo/hasSuperClassStartingWith;->handleMediaPlayPauseIfPendingOnHandler(Z)V

    .line 11201
    :cond_32
    invoke-virtual {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->RemoteActionCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)I

    move-result v0

    .line 11202
    invoke-virtual {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->IconCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)I

    move-result p0

    const/4 p1, 0x0

    .line 11201
    invoke-static {v0, p0, p1, p1}, Lo/hasSuperClassStartingWith$RemoteActionCompatParcelizer;->AudioAttributesCompatParcelizer(IIZI)Lo/hasSuperClassStartingWith$RemoteActionCompatParcelizer;

    move-result-object p0

    .line 11205
    invoke-virtual {p3, p0}, Lo/hasSuperClassStartingWith;->RemoteActionCompatParcelizer(Ljava/lang/Object;)V

    return-void
.end method

.method final IconCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView;)V
    .registers 4

    .line 11459
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v0

    const/high16 v1, 0x40000000    # 2.0f

    invoke-static {v0, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    .line 11460
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result p1

    invoke-static {p1, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p1

    .line 11458
    invoke-virtual {p0, v0, p1}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->IconCompatParcelizer(II)V

    return-void
.end method

.method public IconCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView;II)V
    .registers 4

    return-void
.end method

.method public IconCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView;III)V
    .registers 5

    return-void
.end method

.method public IconCompatParcelizer(Ljava/lang/String;)V
    .registers 2

    .line 8717
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaBrowserCompatMediaItem:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz p0, :cond_7

    .line 8718
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->write(Ljava/lang/String;)V

    :cond_7
    return-void
.end method

.method final IconCompatParcelizer(Landroid/view/View;IILandroidx/recyclerview/widget/RecyclerView$LayoutParams;)Z
    .registers 6

    .line 10120
    iget-boolean p0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->AudioAttributesImplApi21Parcelizer:Z

    if-eqz p0, :cond_1e

    .line 10121
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    move-result p0

    iget v0, p4, Landroid/view/ViewGroup$LayoutParams;->width:I

    invoke-static {p0, p2, v0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->RemoteActionCompatParcelizer(III)Z

    move-result p0

    if-eqz p0, :cond_1e

    .line 10122
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    move-result p0

    iget p1, p4, Landroid/view/ViewGroup$LayoutParams;->height:I

    invoke-static {p0, p3, p1}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->RemoteActionCompatParcelizer(III)Z

    move-result p0

    if-eqz p0, :cond_1e

    const/4 p0, 0x0

    return p0

    :cond_1e
    const/4 p0, 0x1

    return p0
.end method

.method public final IconCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;Landroid/graphics/Rect;Z)Z
    .registers 11

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    .line 10708
    invoke-virtual/range {v0 .. v5}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->IconCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;Landroid/graphics/Rect;ZZ)Z

    move-result p0

    return p0
.end method

.method public IconCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;Landroid/graphics/Rect;ZZ)Z
    .registers 8

    .line 10729
    invoke-direct {p0, p2, p3}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->IconCompatParcelizer(Landroid/view/View;Landroid/graphics/Rect;)[I

    move-result-object p2

    const/4 p3, 0x0

    .line 10731
    aget v0, p2, p3

    const/4 v1, 0x1

    .line 10732
    aget p2, p2, v1

    if-eqz p5, :cond_12

    .line 10733
    invoke-direct {p0, p1, v0, p2}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->write(Landroidx/recyclerview/widget/RecyclerView;II)Z

    move-result p0

    if-eqz p0, :cond_16

    :cond_12
    if-nez v0, :cond_17

    if-nez p2, :cond_17

    :cond_16
    return p3

    :cond_17
    if-eqz p4, :cond_1d

    .line 10736
    invoke-virtual {p1, v0, p2}, Landroid/view/View;->scrollBy(II)V

    goto :goto_20

    .line 10738
    :cond_1d
    invoke-virtual {p1, v0, p2}, Landroidx/recyclerview/widget/RecyclerView;->AudioAttributesImplApi26Parcelizer(II)V

    :goto_20
    return v1
.end method

.method public L_()V
    .registers 1

    return-void
.end method

.method public M_()Z
    .registers 1

    const/4 p0, 0x0

    return p0
.end method

.method public final MediaBrowserCompatCustomActionResultReceiver(I)Landroid/view/View;
    .registers 2

    .line 9762
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->RemoteActionCompatParcelizer:Lo/TypesKt;

    if-eqz p0, :cond_9

    invoke-virtual {p0, p1}, Lo/TypesKt;->read(I)Landroid/view/View;

    move-result-object p0

    return-object p0

    :cond_9
    const/4 p0, 0x0

    return-object p0
.end method

.method public MediaBrowserCompatItemReceiver(Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)I
    .registers 2

    const/4 p0, 0x0

    return p0
.end method

.method public MediaBrowserCompatItemReceiver(I)V
    .registers 2

    return-void
.end method

.method public RatingCompat()Z
    .registers 1

    .line 8808
    iget-boolean p0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->IconCompatParcelizer:Z

    return p0
.end method

.method public RemoteActionCompatParcelizer(ILandroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)I
    .registers 4

    const/4 p0, 0x0

    return p0
.end method

.method public RemoteActionCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)I
    .registers 2

    const/4 p0, 0x0

    return p0
.end method

.method public RemoteActionCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)I
    .registers 3

    const/4 p0, -0x1

    return p0
.end method

.method public final RemoteActionCompatParcelizer(II)V
    .registers 3

    .line 11069
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaBrowserCompatMediaItem:Landroidx/recyclerview/widget/RecyclerView;

    invoke-static {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->IconCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView;II)V

    return-void
.end method

.method public final RemoteActionCompatParcelizer(Landroid/view/View;)V
    .registers 3

    const/4 v0, -0x1

    .line 9344
    invoke-virtual {p0, p1, v0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->AudioAttributesCompatParcelizer(Landroid/view/View;I)V

    return-void
.end method

.method public RemoteActionCompatParcelizer(Landroid/view/accessibility/AccessibilityEvent;)V
    .registers 3

    .line 11210
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaBrowserCompatMediaItem:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->onRemoveQueueItemAt:Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaBrowserCompatMediaItem:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->onPrepareFromUri:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->read(Landroid/view/accessibility/AccessibilityEvent;)V

    return-void
.end method

.method public final RemoteActionCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;)V
    .registers 4

    .line 11151
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onPlay()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_6
    if-ltz v0, :cond_1c

    .line 11152
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaBrowserCompatCustomActionResultReceiver(I)Landroid/view/View;

    move-result-object v1

    .line 11153
    invoke-static {v1}, Landroidx/recyclerview/widget/RecyclerView;->IconCompatParcelizer(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->shouldIgnore()Z

    move-result v1

    if-nez v1, :cond_19

    .line 11154
    invoke-virtual {p0, v0, p1}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->IconCompatParcelizer(ILandroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;)V

    :cond_19
    add-int/lit8 v0, v0, -0x1

    goto :goto_6

    :cond_1c
    return-void
.end method

.method public final RemoteActionCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$onCustomAction;)V
    .registers 3

    .line 9289
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaDescriptionCompat:Landroidx/recyclerview/widget/RecyclerView$onCustomAction;

    if-eqz v0, :cond_11

    if-eq p1, v0, :cond_11

    .line 9290
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$onCustomAction;->MediaBrowserCompatCustomActionResultReceiver()Z

    move-result v0

    if-eqz v0, :cond_11

    .line 9291
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaDescriptionCompat:Landroidx/recyclerview/widget/RecyclerView$onCustomAction;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$onCustomAction;->MediaBrowserCompatItemReceiver()V

    .line 9293
    :cond_11
    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaDescriptionCompat:Landroidx/recyclerview/widget/RecyclerView$onCustomAction;

    .line 9294
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaBrowserCompatMediaItem:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1, v0, p0}, Landroidx/recyclerview/widget/RecyclerView$onCustomAction;->AudioAttributesCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;)V

    return-void
.end method

.method final RemoteActionCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView;)V
    .registers 3

    const/4 v0, 0x1

    .line 8930
    iput-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaBrowserCompatItemReceiver:Z

    .line 8931
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->AudioAttributesCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView;)V

    return-void
.end method

.method public RemoteActionCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView;II)V
    .registers 4

    return-void
.end method

.method final RemoteActionCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;)V
    .registers 4

    const/4 v0, 0x0

    .line 8935
    iput-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaBrowserCompatItemReceiver:Z

    .line 8936
    invoke-virtual {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->read(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;)V

    return-void
.end method

.method public RemoteActionCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$LayoutParams;)Z
    .registers 2

    if-eqz p1, :cond_4

    const/4 p0, 0x1

    return p0

    :cond_4
    const/4 p0, 0x0

    return p0
.end method

.method public final a_(Landroid/view/View;)V
    .registers 3

    .line 9590
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->RemoteActionCompatParcelizer:Lo/TypesKt;

    invoke-virtual {v0, p1}, Lo/TypesKt;->read(Landroid/view/View;)I

    move-result p1

    if-ltz p1, :cond_b

    .line 9592
    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->IconCompatParcelizer(I)V

    :cond_b
    return-void
.end method

.method public getPaddingBottom()I
    .registers 1

    .line 9866
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaBrowserCompatMediaItem:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz p0, :cond_9

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result p0

    return p0

    :cond_9
    const/4 p0, 0x0

    return p0
.end method

.method public getPaddingEnd()I
    .registers 1

    .line 9886
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaBrowserCompatMediaItem:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz p0, :cond_9

    invoke-static {p0}, Lo/InvalidTypeIdException;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(Landroid/view/View;)I

    move-result p0

    return p0

    :cond_9
    const/4 p0, 0x0

    return p0
.end method

.method public getPaddingLeft()I
    .registers 1

    .line 9836
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaBrowserCompatMediaItem:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz p0, :cond_9

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result p0

    return p0

    :cond_9
    const/4 p0, 0x0

    return p0
.end method

.method public getPaddingRight()I
    .registers 1

    .line 9856
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaBrowserCompatMediaItem:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz p0, :cond_9

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result p0

    return p0

    :cond_9
    const/4 p0, 0x0

    return p0
.end method

.method public getPaddingStart()I
    .registers 1

    .line 9876
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaBrowserCompatMediaItem:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz p0, :cond_9

    invoke-static {p0}, Lo/InvalidTypeIdException;->onCommand(Landroid/view/View;)I

    move-result p0

    return p0

    :cond_9
    const/4 p0, 0x0

    return p0
.end method

.method public getPaddingTop()I
    .registers 1

    .line 9846
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaBrowserCompatMediaItem:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz p0, :cond_9

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result p0

    return p0

    :cond_9
    const/4 p0, 0x0

    return p0
.end method

.method handleMediaPlayPauseIfPendingOnHandler()Z
    .registers 1

    const/4 p0, 0x0

    return p0
.end method

.method public onAddQueueItem()Landroid/os/Parcelable;
    .registers 1

    const/4 p0, 0x0

    return-object p0
.end method

.method public final onAddQueueItem(Landroid/view/View;)Z
    .registers 4

    .line 10773
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->AudioAttributesImplBaseParcelizer:Lo/ULongDeserializer;

    invoke-virtual {v0, p1}, Lo/ULongDeserializer;->write(Landroid/view/View;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_13

    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->RatingCompat:Lo/ULongDeserializer;

    .line 10775
    invoke-virtual {p0, p1}, Lo/ULongDeserializer;->write(Landroid/view/View;)Z

    move-result p0

    if-eqz p0, :cond_13

    move p0, v1

    goto :goto_14

    :cond_13
    const/4 p0, 0x0

    :goto_14
    xor-int/2addr p0, v1

    return p0
.end method

.method public onCommand(Landroid/view/View;)V
    .registers 15

    .line 10195
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    .line 10197
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaBrowserCompatMediaItem:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v1, p1}, Landroidx/recyclerview/widget/RecyclerView;->AudioAttributesImplApi21Parcelizer(Landroid/view/View;)Landroid/graphics/Rect;

    move-result-object v1

    .line 10198
    iget v2, v1, Landroid/graphics/Rect;->left:I

    iget v3, v1, Landroid/graphics/Rect;->right:I

    .line 10199
    iget v4, v1, Landroid/graphics/Rect;->top:I

    iget v1, v1, Landroid/graphics/Rect;->bottom:I

    .line 10201
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onPrepare()I

    move-result v5

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onSeekTo()I

    move-result v6

    .line 10202
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->getPaddingLeft()I

    move-result v7

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->getPaddingRight()I

    move-result v8

    iget v9, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    iget v10, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    iget v11, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 10204
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->AudioAttributesImplApi26Parcelizer()Z

    move-result v12

    add-int/2addr v7, v8

    add-int/2addr v7, v9

    add-int/2addr v7, v10

    add-int/2addr v2, v3

    add-int/2addr v7, v2

    .line 10201
    invoke-static {v5, v6, v7, v11, v12}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->write(IIIIZ)I

    move-result v2

    .line 10205
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onMediaButtonEvent()I

    move-result v3

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onFastForward()I

    move-result v5

    .line 10206
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->getPaddingTop()I

    move-result v6

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->getPaddingBottom()I

    move-result v7

    iget v8, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iget v9, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    iget v10, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 10208
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->AudioAttributesImplApi21Parcelizer()Z

    move-result v11

    add-int/2addr v6, v7

    add-int/2addr v6, v8

    add-int/2addr v6, v9

    add-int/2addr v4, v1

    add-int/2addr v6, v4

    .line 10205
    invoke-static {v3, v5, v6, v10, v11}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->write(IIIIZ)I

    move-result v1

    .line 10209
    invoke-virtual {p0, p1, v2, v1, v0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->read(Landroid/view/View;IILandroidx/recyclerview/widget/RecyclerView$LayoutParams;)Z

    move-result p0

    if-eqz p0, :cond_63

    .line 10210
    invoke-virtual {p1, v2, v1}, Landroid/view/View;->measure(II)V

    :cond_63
    return-void
.end method

.method public final onCustomAction(Landroid/view/View;)V
    .registers 4

    .line 9984
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaBrowserCompatMediaItem:Landroidx/recyclerview/widget/RecyclerView;

    if-ne v0, v1, :cond_20

    invoke-virtual {v1, p1}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_20

    .line 9990
    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->IconCompatParcelizer(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;

    move-result-object p1

    const/16 v0, 0x80

    .line 9991
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->addFlags(I)V

    .line 9992
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaBrowserCompatMediaItem:Landroidx/recyclerview/widget/RecyclerView;

    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView;->onSetRating:Lo/UIntSerializer;

    invoke-virtual {p0, p1}, Lo/UIntSerializer;->MediaBrowserCompatCustomActionResultReceiver(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;)V

    return-void

    .line 9987
    :cond_20
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "View should be fully attached to be ignored"

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaBrowserCompatMediaItem:Landroidx/recyclerview/widget/RecyclerView;

    .line 9988
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->write()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final onFastForward()I
    .registers 1

    .line 9794
    iget p0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->AudioAttributesCompatParcelizer:I

    return p0
.end method

.method public final onMediaButtonEvent()I
    .registers 1

    .line 9826
    iget p0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->write:I

    return p0
.end method

.method public final onPause()Z
    .registers 1

    .line 9043
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaBrowserCompatMediaItem:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz p0, :cond_a

    iget-boolean p0, p0, Landroidx/recyclerview/widget/RecyclerView;->MediaDescriptionCompat:Z

    if-eqz p0, :cond_a

    const/4 p0, 0x1

    return p0

    :cond_a
    const/4 p0, 0x0

    return p0
.end method

.method public final onPlay()I
    .registers 1

    .line 9751
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->RemoteActionCompatParcelizer:Lo/TypesKt;

    if-eqz p0, :cond_9

    invoke-virtual {p0}, Lo/TypesKt;->read()I

    move-result p0

    return p0

    :cond_9
    const/4 p0, 0x0

    return p0
.end method

.method public final onPlayFromMediaId()Landroid/view/View;
    .registers 3

    .line 9916
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaBrowserCompatMediaItem:Landroidx/recyclerview/widget/RecyclerView;

    const/4 v1, 0x0

    if-nez v0, :cond_6

    return-object v1

    .line 9919
    :cond_6
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getFocusedChild()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_15

    .line 9920
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->RemoteActionCompatParcelizer:Lo/TypesKt;

    invoke-virtual {p0, v0}, Lo/TypesKt;->IconCompatParcelizer(Landroid/view/View;)Z

    move-result p0

    if-nez p0, :cond_15

    return-object v0

    :cond_15
    return-object v1
.end method

.method public final onPlayFromMediaId(Landroid/view/View;)V
    .registers 2

    .line 9455
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->RemoteActionCompatParcelizer:Lo/TypesKt;

    invoke-virtual {p0, p1}, Lo/TypesKt;->write(Landroid/view/View;)V

    return-void
.end method

.method public final onPlayFromSearch()I
    .registers 1

    .line 9313
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaBrowserCompatMediaItem:Landroidx/recyclerview/widget/RecyclerView;

    invoke-static {p0}, Lo/InvalidTypeIdException;->MediaBrowserCompatMediaItem(Landroid/view/View;)I

    move-result p0

    return p0
.end method

.method public final onPlayFromUri()I
    .registers 1

    .line 11077
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaBrowserCompatMediaItem:Landroidx/recyclerview/widget/RecyclerView;

    invoke-static {p0}, Lo/InvalidTypeIdException;->MediaBrowserCompatSearchResultReceiver(Landroid/view/View;)I

    move-result p0

    return p0
.end method

.method public final onPrepare()I
    .registers 1

    .line 9810
    iget p0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onAddQueueItem:I

    return p0
.end method

.method public final onPrepareFromMediaId()I
    .registers 1

    .line 9939
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaBrowserCompatMediaItem:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz p0, :cond_9

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->IconCompatParcelizer()Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;

    move-result-object p0

    goto :goto_a

    :cond_9
    const/4 p0, 0x0

    :goto_a
    if-eqz p0, :cond_11

    .line 9940
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;->getItemCount()I

    move-result p0

    return p0

    :cond_11
    const/4 p0, 0x0

    return p0
.end method

.method public final onPrepareFromSearch()I
    .registers 1

    .line 11085
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaBrowserCompatMediaItem:Landroidx/recyclerview/widget/RecyclerView;

    invoke-static {p0}, Lo/InvalidTypeIdException;->RatingCompat(Landroid/view/View;)I

    move-result p0

    return p0
.end method

.method public final onPrepareFromUri()Z
    .registers 1

    .line 8873
    iget-boolean p0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaBrowserCompatCustomActionResultReceiver:Z

    return p0
.end method

.method public final onRemoveQueueItem()Z
    .registers 1

    .line 8947
    iget-boolean p0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaBrowserCompatItemReceiver:Z

    return p0
.end method

.method final onRemoveQueueItemAt()Z
    .registers 6

    .line 11479
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onPlay()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_6
    if-ge v2, v0, :cond_1d

    .line 11481
    invoke-virtual {p0, v2}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaBrowserCompatCustomActionResultReceiver(I)Landroid/view/View;

    move-result-object v3

    .line 11482
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    .line 11483
    iget v4, v3, Landroid/view/ViewGroup$LayoutParams;->width:I

    if-gez v4, :cond_1a

    iget v3, v3, Landroid/view/ViewGroup$LayoutParams;->height:I

    if-gez v3, :cond_1a

    const/4 p0, 0x1

    return p0

    :cond_1a
    add-int/lit8 v2, v2, 0x1

    goto :goto_6

    :cond_1d
    return v1
.end method

.method public final onRewind()Z
    .registers 1

    .line 10151
    iget-boolean p0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->AudioAttributesImplApi21Parcelizer:Z

    return p0
.end method

.method public final onSeekTo()I
    .registers 1

    .line 9778
    iget p0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:I

    return p0
.end method

.method public final onSetCaptioningEnabled()Z
    .registers 2

    .line 11408
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaBrowserCompatMediaItem:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->onRemoveQueueItemAt:Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;

    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaBrowserCompatMediaItem:Landroidx/recyclerview/widget/RecyclerView;

    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPrepareFromUri:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    const/4 p0, 0x0

    return p0
.end method

.method public final onSetPlaybackSpeed()V
    .registers 3

    .line 9479
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onPlay()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_6
    if-ltz v0, :cond_10

    .line 9481
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->RemoteActionCompatParcelizer:Lo/TypesKt;

    invoke-virtual {v1, v0}, Lo/TypesKt;->IconCompatParcelizer(I)V

    add-int/lit8 v0, v0, -0x1

    goto :goto_6

    :cond_10
    return-void
.end method

.method public final onSetRating()V
    .registers 1

    .line 8667
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaBrowserCompatMediaItem:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz p0, :cond_7

    .line 8668
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    :cond_7
    return-void
.end method

.method public final onSetRepeatMode()Z
    .registers 1

    .line 9301
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaDescriptionCompat:Landroidx/recyclerview/widget/RecyclerView$onCustomAction;

    if-eqz p0, :cond_c

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$onCustomAction;->MediaBrowserCompatCustomActionResultReceiver()Z

    move-result p0

    if-eqz p0, :cond_c

    const/4 p0, 0x1

    return p0

    :cond_c
    const/4 p0, 0x0

    return p0
.end method

.method public final onSetShuffleMode()V
    .registers 2

    const/4 v0, 0x1

    .line 11278
    iput-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaBrowserCompatSearchResultReceiver:Z

    return-void
.end method

.method final onSkipToNext()V
    .registers 1

    .line 11119
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaDescriptionCompat:Landroidx/recyclerview/widget/RecyclerView$onCustomAction;

    if-eqz p0, :cond_7

    .line 11120
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$onCustomAction;->MediaBrowserCompatItemReceiver()V

    :cond_7
    return-void
.end method

.method public read(ILandroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)I
    .registers 4

    const/4 p0, 0x0

    return p0
.end method

.method public read(Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)I
    .registers 2

    const/4 p0, 0x0

    return p0
.end method

.method public abstract read()Landroidx/recyclerview/widget/RecyclerView$LayoutParams;
.end method

.method public read(Landroid/view/ViewGroup$LayoutParams;)Landroidx/recyclerview/widget/RecyclerView$LayoutParams;
    .registers 2

    .line 9164
    instance-of p0, p1, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    if-eqz p0, :cond_c

    .line 9165
    new-instance p0, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    check-cast p1, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;-><init>(Landroidx/recyclerview/widget/RecyclerView$LayoutParams;)V

    return-object p0

    .line 9166
    :cond_c
    instance-of p0, p1, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz p0, :cond_18

    .line 9167
    new-instance p0, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    check-cast p1, Landroid/view/ViewGroup$MarginLayoutParams;

    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V

    return-object p0

    .line 9169
    :cond_18
    new-instance p0, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    return-object p0
.end method

.method public read(I)V
    .registers 2

    .line 9256
    sget-boolean p0, Landroidx/recyclerview/widget/RecyclerView;->AudioAttributesImplBaseParcelizer:Z

    return-void
.end method

.method public final read(Landroid/view/View;)V
    .registers 3

    const/4 v0, -0x1

    .line 9664
    invoke-direct {p0, p1, v0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->IconCompatParcelizer(Landroid/view/View;I)V

    return-void
.end method

.method public final read(Landroid/view/View;I)V
    .registers 4

    const/4 v0, 0x0

    .line 9388
    invoke-direct {p0, p1, p2, v0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->IconCompatParcelizer(Landroid/view/View;IZ)V

    return-void
.end method

.method public read(Landroid/view/View;Landroid/graphics/Rect;)V
    .registers 3

    .line 10458
    invoke-static {p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->read(Landroid/view/View;Landroid/graphics/Rect;)V

    return-void
.end method

.method final read(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;)V
    .registers 8

    .line 10055
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->AudioAttributesCompatParcelizer()I

    move-result v0

    add-int/lit8 v1, v0, -0x1

    :goto_6
    if-ltz v1, :cond_3c

    .line 10058
    invoke-virtual {p1, v1}, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->IconCompatParcelizer(I)Landroid/view/View;

    move-result-object v2

    .line 10059
    invoke-static {v2}, Landroidx/recyclerview/widget/RecyclerView;->IconCompatParcelizer(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;

    move-result-object v3

    .line 10060
    invoke-virtual {v3}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->shouldIgnore()Z

    move-result v4

    if-nez v4, :cond_39

    const/4 v4, 0x0

    .line 10068
    invoke-virtual {v3, v4}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->setIsRecyclable(Z)V

    .line 10069
    invoke-virtual {v3}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->isTmpDetached()Z

    move-result v5

    if-eqz v5, :cond_25

    .line 10070
    iget-object v5, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaBrowserCompatMediaItem:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v5, v2, v4}, Landroidx/recyclerview/widget/RecyclerView;->removeDetachedView(Landroid/view/View;Z)V

    .line 10072
    :cond_25
    iget-object v4, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaBrowserCompatMediaItem:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v4, v4, Landroidx/recyclerview/widget/RecyclerView;->onCommand:Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer;

    if-eqz v4, :cond_32

    .line 10073
    iget-object v4, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaBrowserCompatMediaItem:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v4, v4, Landroidx/recyclerview/widget/RecyclerView;->onCommand:Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer;

    invoke-virtual {v4, v3}, Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer;->write(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;)V

    :cond_32
    const/4 v4, 0x1

    .line 10075
    invoke-virtual {v3, v4}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->setIsRecyclable(Z)V

    .line 10076
    invoke-virtual {p1, v2}, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->read(Landroid/view/View;)V

    :cond_39
    add-int/lit8 v1, v1, -0x1

    goto :goto_6

    .line 10078
    :cond_3c
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->read()V

    if-lez v0, :cond_46

    .line 10080
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaBrowserCompatMediaItem:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    :cond_46
    return-void
.end method

.method final read(Landroidx/recyclerview/widget/RecyclerView$onCustomAction;)V
    .registers 3

    .line 11125
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaDescriptionCompat:Landroidx/recyclerview/widget/RecyclerView$onCustomAction;

    if-ne v0, p1, :cond_7

    const/4 p1, 0x0

    .line 11126
    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaDescriptionCompat:Landroidx/recyclerview/widget/RecyclerView$onCustomAction;

    :cond_7
    return-void
.end method

.method final read(Landroidx/recyclerview/widget/RecyclerView;)V
    .registers 3

    if-nez p1, :cond_d

    const/4 p1, 0x0

    .line 8563
    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaBrowserCompatMediaItem:Landroidx/recyclerview/widget/RecyclerView;

    .line 8564
    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->RemoteActionCompatParcelizer:Lo/TypesKt;

    const/4 p1, 0x0

    .line 8565
    iput p1, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onAddQueueItem:I

    .line 8566
    iput p1, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->write:I

    goto :goto_1f

    .line 8568
    :cond_d
    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaBrowserCompatMediaItem:Landroidx/recyclerview/widget/RecyclerView;

    .line 8569
    iget-object v0, p1, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatSearchResultReceiver:Lo/TypesKt;

    iput-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->RemoteActionCompatParcelizer:Lo/TypesKt;

    .line 8570
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v0

    iput v0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onAddQueueItem:I

    .line 8571
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result p1

    iput p1, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->write:I

    :goto_1f
    const/high16 p1, 0x40000000    # 2.0f

    .line 8573
    iput p1, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:I

    .line 8574
    iput p1, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->AudioAttributesCompatParcelizer:I

    return-void
.end method

.method public read(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;)V
    .registers 3

    return-void
.end method

.method final read(Landroid/view/View;IILandroidx/recyclerview/widget/RecyclerView$LayoutParams;)Z
    .registers 6

    .line 10135
    invoke-virtual {p1}, Landroid/view/View;->isLayoutRequested()Z

    move-result v0

    if-nez v0, :cond_24

    iget-boolean p0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->AudioAttributesImplApi21Parcelizer:Z

    if-eqz p0, :cond_24

    .line 10137
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result p0

    iget v0, p4, Landroid/view/ViewGroup$LayoutParams;->width:I

    invoke-static {p0, p2, v0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->RemoteActionCompatParcelizer(III)Z

    move-result p0

    if-eqz p0, :cond_24

    .line 10138
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result p0

    iget p1, p4, Landroid/view/ViewGroup$LayoutParams;->height:I

    invoke-static {p0, p3, p1}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->RemoteActionCompatParcelizer(III)Z

    move-result p0

    if-eqz p0, :cond_24

    const/4 p0, 0x0

    return p0

    :cond_24
    const/4 p0, 0x1

    return p0
.end method

.method public write(I)Landroid/view/View;
    .registers 7

    .line 9559
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onPlay()I

    move-result v0

    const/4 v1, 0x0

    :goto_5
    if-ge v1, v0, :cond_31

    .line 9561
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaBrowserCompatCustomActionResultReceiver(I)Landroid/view/View;

    move-result-object v2

    .line 9562
    invoke-static {v2}, Landroidx/recyclerview/widget/RecyclerView;->IconCompatParcelizer(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;

    move-result-object v3

    if-eqz v3, :cond_2e

    .line 9566
    invoke-virtual {v3}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->getLayoutPosition()I

    move-result v4

    if-ne v4, p1, :cond_2e

    invoke-virtual {v3}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->shouldIgnore()Z

    move-result v4

    if-nez v4, :cond_2e

    iget-object v4, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaBrowserCompatMediaItem:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v4, v4, Landroidx/recyclerview/widget/RecyclerView;->onPrepareFromUri:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    .line 9567
    invoke-virtual {v4}, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->write()Z

    move-result v4

    if-nez v4, :cond_2d

    invoke-virtual {v3}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->isRemoved()Z

    move-result v3

    if-nez v3, :cond_2e

    :cond_2d
    return-object v2

    :cond_2e
    add-int/lit8 v1, v1, 0x1

    goto :goto_5

    :cond_31
    const/4 p0, 0x0

    return-object p0
.end method

.method public final write(Landroid/view/View;)Landroid/view/View;
    .registers 4

    .line 9531
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaBrowserCompatMediaItem:Landroidx/recyclerview/widget/RecyclerView;

    const/4 v1, 0x0

    if-nez v0, :cond_6

    return-object v1

    .line 9534
    :cond_6
    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView;->write(Landroid/view/View;)Landroid/view/View;

    move-result-object p1

    if-nez p1, :cond_d

    return-object v1

    .line 9538
    :cond_d
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->RemoteActionCompatParcelizer:Lo/TypesKt;

    invoke-virtual {p0, p1}, Lo/TypesKt;->IconCompatParcelizer(Landroid/view/View;)Z

    move-result p0

    if-eqz p0, :cond_16

    return-object v1

    :cond_16
    return-object p1
.end method

.method public final write(II)V
    .registers 3

    .line 11058
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaBrowserCompatMediaItem:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->IconCompatParcelizer(II)V

    return-void
.end method

.method public final write(Landroid/view/View;Landroid/graphics/Rect;)V
    .registers 9

    .line 10426
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->RemoteActionCompatParcelizer:Landroid/graphics/Rect;

    .line 10427
    iget v1, v0, Landroid/graphics/Rect;->left:I

    neg-int v1, v1

    iget v2, v0, Landroid/graphics/Rect;->top:I

    neg-int v2, v2

    .line 10428
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v3

    iget v4, v0, Landroid/graphics/Rect;->right:I

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v5

    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    add-int/2addr v3, v4

    add-int/2addr v5, v0

    .line 10427
    invoke-virtual {p2, v1, v2, v3, v5}, Landroid/graphics/Rect;->set(IIII)V

    .line 10433
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaBrowserCompatMediaItem:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v0, :cond_5c

    .line 10434
    invoke-virtual {p1}, Landroid/view/View;->getMatrix()Landroid/graphics/Matrix;

    move-result-object v0

    if-eqz v0, :cond_5c

    .line 10435
    invoke-virtual {v0}, Landroid/graphics/Matrix;->isIdentity()Z

    move-result v1

    if-nez v1, :cond_5c

    .line 10436
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaBrowserCompatMediaItem:Landroidx/recyclerview/widget/RecyclerView;

    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView;->onSetRepeatMode:Landroid/graphics/RectF;

    .line 10437
    invoke-virtual {p0, p2}, Landroid/graphics/RectF;->set(Landroid/graphics/Rect;)V

    .line 10438
    invoke-virtual {v0, p0}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    .line 10439
    iget v0, p0, Landroid/graphics/RectF;->left:F

    float-to-double v0, v0

    .line 10440
    invoke-static {v0, v1}, Ljava/lang/Math;->floor(D)D

    move-result-wide v0

    double-to-int v0, v0

    iget v1, p0, Landroid/graphics/RectF;->top:F

    float-to-double v1, v1

    .line 10441
    invoke-static {v1, v2}, Ljava/lang/Math;->floor(D)D

    move-result-wide v1

    double-to-int v1, v1

    iget v2, p0, Landroid/graphics/RectF;->right:F

    float-to-double v2, v2

    .line 10442
    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v2

    double-to-int v2, v2

    iget p0, p0, Landroid/graphics/RectF;->bottom:F

    float-to-double v3, p0

    .line 10443
    invoke-static {v3, v4}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v3

    double-to-int p0, v3

    .line 10439
    invoke-virtual {p2, v0, v1, v2, p0}, Landroid/graphics/Rect;->set(IIII)V

    .line 10447
    :cond_5c
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    move-result p0

    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result p1

    invoke-virtual {p2, p0, p1}, Landroid/graphics/Rect;->offset(II)V

    return-void
.end method

.method public write(Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)V
    .registers 2

    return-void
.end method

.method public final write(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;)V
    .registers 4

    .line 10019
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onPlay()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_6
    if-ltz v0, :cond_12

    .line 10021
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaBrowserCompatCustomActionResultReceiver(I)Landroid/view/View;

    move-result-object v1

    .line 10022
    invoke-direct {p0, p1, v0, v1}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->IconCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;ILandroid/view/View;)V

    add-int/lit8 v0, v0, -0x1

    goto :goto_6

    :cond_12
    return-void
.end method

.method public write(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)V
    .registers 3

    return-void
.end method

.method public write(Landroidx/recyclerview/widget/RecyclerView;IILjava/lang/Object;)V
    .registers 5

    .line 10928
    invoke-virtual {p0, p1, p2, p3}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->IconCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView;II)V

    return-void
.end method

.method public write(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;ILandroid/os/Bundle;)Z
    .registers 13

    .line 11366
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaBrowserCompatMediaItem:Landroidx/recyclerview/widget/RecyclerView;

    const/4 p2, 0x0

    if-nez p1, :cond_6

    return p2

    .line 11370
    :cond_6
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onMediaButtonEvent()I

    move-result p1

    .line 11371
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onPrepare()I

    move-result p4

    .line 11372
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 11375
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaBrowserCompatMediaItem:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView;->getMatrix()Landroid/graphics/Matrix;

    move-result-object v1

    invoke-virtual {v1}, Landroid/graphics/Matrix;->isIdentity()Z

    move-result v1

    if-eqz v1, :cond_2f

    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaBrowserCompatMediaItem:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v1, v0}, Landroid/view/View;->getGlobalVisibleRect(Landroid/graphics/Rect;)Z

    move-result v1

    if-eqz v1, :cond_2f

    .line 11377
    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result p1

    .line 11378
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result p4

    :cond_2f
    const/16 v0, 0x1000

    const/4 v1, 0x1

    if-eq p3, v0, :cond_65

    const/16 v0, 0x2000

    if-eq p3, v0, :cond_3b

    move v3, p2

    move v4, v3

    goto :goto_91

    .line 11382
    :cond_3b
    iget-object p3, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaBrowserCompatMediaItem:Landroidx/recyclerview/widget/RecyclerView;

    const/4 v0, -0x1

    invoke-virtual {p3, v0}, Landroidx/recyclerview/widget/RecyclerView;->canScrollVertically(I)Z

    move-result p3

    if-eqz p3, :cond_50

    .line 11383
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->getPaddingTop()I

    move-result p3

    sub-int/2addr p1, p3

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->getPaddingBottom()I

    move-result p3

    sub-int/2addr p1, p3

    neg-int p1, p1

    goto :goto_51

    :cond_50
    move p1, p2

    .line 11385
    :goto_51
    iget-object p3, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaBrowserCompatMediaItem:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p3, v0}, Landroidx/recyclerview/widget/RecyclerView;->canScrollHorizontally(I)Z

    move-result p3

    if-eqz p3, :cond_8f

    .line 11386
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->getPaddingLeft()I

    move-result p3

    sub-int/2addr p4, p3

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->getPaddingRight()I

    move-result p3

    sub-int/2addr p4, p3

    neg-int p3, p4

    goto :goto_8c

    .line 11390
    :cond_65
    iget-object p3, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaBrowserCompatMediaItem:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p3, v1}, Landroidx/recyclerview/widget/RecyclerView;->canScrollVertically(I)Z

    move-result p3

    if-eqz p3, :cond_78

    .line 11391
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->getPaddingTop()I

    move-result p3

    sub-int/2addr p1, p3

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->getPaddingBottom()I

    move-result p3

    sub-int/2addr p1, p3

    goto :goto_79

    :cond_78
    move p1, p2

    .line 11393
    :goto_79
    iget-object p3, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaBrowserCompatMediaItem:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p3, v1}, Landroidx/recyclerview/widget/RecyclerView;->canScrollHorizontally(I)Z

    move-result p3

    if-eqz p3, :cond_8f

    .line 11394
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->getPaddingLeft()I

    move-result p3

    sub-int/2addr p4, p3

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->getPaddingRight()I

    move-result p3

    sub-int p3, p4, p3

    :goto_8c
    move v4, p1

    move v3, p3

    goto :goto_91

    :cond_8f
    move v4, p1

    move v3, p2

    :goto_91
    if-nez v4, :cond_96

    if-nez v3, :cond_96

    return p2

    .line 11401
    :cond_96
    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaBrowserCompatMediaItem:Landroidx/recyclerview/widget/RecyclerView;

    const/4 v5, 0x0

    const/high16 v6, -0x80000000

    const/4 v7, 0x1

    invoke-virtual/range {v2 .. v7}, Landroidx/recyclerview/widget/RecyclerView;->write(IILandroid/view/animation/Interpolator;IZ)V

    return v1
.end method

.method public final write(Landroidx/recyclerview/widget/RecyclerView;)Z
    .registers 2

    .line 10841
    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaBrowserCompatItemReceiver(Landroidx/recyclerview/widget/RecyclerView;)Z

    move-result p0

    return p0
.end method

###### Class androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver.AnonymousClass1 (androidx.recyclerview.widget.RecyclerView$MediaBrowserCompatItemReceiver$1)
.class final Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/ULongDeserializer$IconCompatParcelizer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic write:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;


# direct methods
.method constructor <init>(Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;)V
    .registers 2

    .line 8447
    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver$1;->write:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer()I
    .registers 1

    .line 8455
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver$1;->write:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->getPaddingTop()I

    move-result p0

    return p0
.end method

.method public final AudioAttributesCompatParcelizer(Landroid/view/View;)I
    .registers 2

    .line 8474
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p0

    check-cast p0, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    .line 8475
    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->AudioAttributesImplApi21Parcelizer(Landroid/view/View;)I

    move-result p1

    iget p0, p0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    add-int/2addr p1, p0

    return p1
.end method

.method public final IconCompatParcelizer(I)Landroid/view/View;
    .registers 2

    .line 8450
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver$1;->write:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaBrowserCompatCustomActionResultReceiver(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public final read(Landroid/view/View;)I
    .registers 2

    .line 8467
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p0

    check-cast p0, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    .line 8468
    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->RatingCompat(Landroid/view/View;)I

    move-result p1

    iget p0, p0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    sub-int/2addr p1, p0

    return p1
.end method

.method public final write()I
    .registers 2

    .line 8460
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver$1;->write:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onMediaButtonEvent()I

    move-result v0

    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver$1;->write:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    .line 8461
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->getPaddingBottom()I

    move-result p0

    sub-int/2addr v0, p0

    return v0
.end method

###### Class androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver.AnonymousClass5 (androidx.recyclerview.widget.RecyclerView$MediaBrowserCompatItemReceiver$5)
.class final Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/ULongDeserializer$IconCompatParcelizer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic RemoteActionCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;


# direct methods
.method constructor <init>(Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;)V
    .registers 2

    .line 8411
    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver$5;->RemoteActionCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer()I
    .registers 1

    .line 8419
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver$5;->RemoteActionCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->getPaddingLeft()I

    move-result p0

    return p0
.end method

.method public final AudioAttributesCompatParcelizer(Landroid/view/View;)I
    .registers 2

    .line 8437
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p0

    check-cast p0, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    .line 8438
    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaMetadataCompat(Landroid/view/View;)I

    move-result p1

    iget p0, p0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    add-int/2addr p1, p0

    return p1
.end method

.method public final IconCompatParcelizer(I)Landroid/view/View;
    .registers 2

    .line 8414
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver$5;->RemoteActionCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaBrowserCompatCustomActionResultReceiver(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public final read(Landroid/view/View;)I
    .registers 2

    .line 8430
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p0

    check-cast p0, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    .line 8431
    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaBrowserCompatItemReceiver(Landroid/view/View;)I

    move-result p1

    iget p0, p0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    sub-int/2addr p1, p0

    return p1
.end method

.method public final write()I
    .registers 2

    .line 8424
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver$5;->RemoteActionCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onPrepare()I

    move-result v0

    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver$5;->RemoteActionCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->getPaddingRight()I

    move-result p0

    sub-int/2addr v0, p0

    return v0
.end method

###### Class androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer (androidx.recyclerview.widget.RecyclerView$MediaBrowserCompatItemReceiver$RemoteActionCompatParcelizer)
.class public interface abstract Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver$RemoteActionCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "RemoteActionCompatParcelizer"
.end annotation


# virtual methods
.method public abstract read(II)V
.end method

###### Class androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver.write (androidx.recyclerview.widget.RecyclerView$MediaBrowserCompatItemReceiver$write)
.class public final Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver$write;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "write"
.end annotation


# instance fields
.field public AudioAttributesCompatParcelizer:I

.field public IconCompatParcelizer:Z

.field public RemoteActionCompatParcelizer:Z

.field public write:I


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 11493
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

###### Class androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatMediaItem (androidx.recyclerview.widget.RecyclerView$MediaBrowserCompatMediaItem)
.class public interface abstract Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatMediaItem;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/recyclerview/widget/RecyclerView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "MediaBrowserCompatMediaItem"
.end annotation


# virtual methods
.method public abstract IconCompatParcelizer(Landroid/view/MotionEvent;)Z
.end method

.method public abstract read(Landroid/view/MotionEvent;)V
.end method

###### Class androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatSearchResultReceiver (androidx.recyclerview.widget.RecyclerView$MediaBrowserCompatSearchResultReceiver)
.class public abstract Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatSearchResultReceiver;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/recyclerview/widget/RecyclerView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "MediaBrowserCompatSearchResultReceiver"
.end annotation


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 11677
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public AudioAttributesCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView;I)V
    .registers 3

    return-void
.end method

.method public RemoteActionCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView;II)V
    .registers 4

    return-void
.end method

###### Class androidx.recyclerview.widget.RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver (androidx.recyclerview.widget.RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver)
.class public final Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/recyclerview/widget/RecyclerView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver"
.end annotation


# instance fields
.field AudioAttributesCompatParcelizer:I

.field AudioAttributesImplApi21Parcelizer:I

.field AudioAttributesImplApi26Parcelizer:I

.field AudioAttributesImplBaseParcelizer:I

.field IconCompatParcelizer:Z

.field MediaBrowserCompatCustomActionResultReceiver:I

.field MediaBrowserCompatItemReceiver:Z

.field MediaBrowserCompatMediaItem:I

.field MediaBrowserCompatSearchResultReceiver:Z

.field MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Z

.field MediaDescriptionCompat:I

.field MediaMetadataCompat:Z

.field RatingCompat:Z

.field RemoteActionCompatParcelizer:J

.field private handleMediaPlayPauseIfPendingOnHandler:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field read:I

.field write:I


# direct methods
.method public constructor <init>()V
    .registers 3

    .line 13315
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 13330
    iput v0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->MediaDescriptionCompat:I

    const/4 v0, 0x0

    .line 13341
    iput v0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->MediaBrowserCompatCustomActionResultReceiver:I

    .line 13347
    iput v0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->AudioAttributesCompatParcelizer:I

    const/4 v1, 0x1

    .line 13360
    iput v1, p0, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->AudioAttributesImplApi21Parcelizer:I

    .line 13366
    iput v0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->AudioAttributesImplApi26Parcelizer:I

    .line 13368
    iput-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->RatingCompat:Z

    .line 13375
    iput-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->IconCompatParcelizer:Z

    .line 13377
    iput-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Z

    .line 13379
    iput-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->MediaBrowserCompatItemReceiver:Z

    .line 13385
    iput-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->MediaBrowserCompatSearchResultReceiver:Z

    .line 13387
    iput-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->MediaMetadataCompat:Z

    return-void
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer()Z
    .registers 1

    .line 13455
    iget-boolean p0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->MediaMetadataCompat:Z

    return p0
.end method

.method public final IconCompatParcelizer()Z
    .registers 2

    .line 13532
    iget p0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->MediaDescriptionCompat:I

    const/4 v0, -0x1

    if-eq p0, v0, :cond_7

    const/4 p0, 0x1

    return p0

    :cond_7
    const/4 p0, 0x0

    return p0
.end method

.method public final RemoteActionCompatParcelizer()I
    .registers 1

    .line 13522
    iget p0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->MediaDescriptionCompat:I

    return p0
.end method

.method public final RemoteActionCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;)V
    .registers 3

    const/4 v0, 0x1

    .line 13413
    iput v0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->AudioAttributesImplApi21Parcelizer:I

    .line 13414
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;->getItemCount()I

    move-result p1

    iput p1, p0, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->AudioAttributesImplApi26Parcelizer:I

    const/4 p1, 0x0

    .line 13415
    iput-boolean p1, p0, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->IconCompatParcelizer:Z

    .line 13416
    iput-boolean p1, p0, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Z

    .line 13417
    iput-boolean p1, p0, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->MediaBrowserCompatItemReceiver:Z

    return-void
.end method

.method public final read()I
    .registers 2

    .line 13568
    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->IconCompatParcelizer:Z

    if-eqz v0, :cond_a

    .line 13569
    iget v0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->MediaBrowserCompatCustomActionResultReceiver:I

    iget p0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->AudioAttributesCompatParcelizer:I

    sub-int/2addr v0, p0

    return v0

    .line 13570
    :cond_a
    iget p0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->AudioAttributesImplApi26Parcelizer:I

    return p0
.end method

.method public final toString()Ljava/lang/String;
    .registers 3

    .line 13597
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "State{mTargetPosition="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->MediaDescriptionCompat:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mData="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->handleMediaPlayPauseIfPendingOnHandler:Landroid/util/SparseArray;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mItemCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->AudioAttributesImplApi26Parcelizer:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mIsMeasuring="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->MediaBrowserCompatItemReceiver:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", mPreviousLayoutItemCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->MediaBrowserCompatCustomActionResultReceiver:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mDeletedInvisibleItemCountSincePreviousLayout="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->AudioAttributesCompatParcelizer:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mStructureChanged="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->RatingCompat:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", mInPreLayout="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->IconCompatParcelizer:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", mRunSimpleAnimations="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->MediaBrowserCompatSearchResultReceiver:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", mRunPredictiveAnimations="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean p0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->MediaMetadataCompat:Z

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const/16 p0, 0x7d

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method final write(I)V
    .registers 4

    .line 13321
    iget v0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->AudioAttributesImplApi21Parcelizer:I

    and-int/2addr v0, p1

    if-eqz v0, :cond_6

    return-void

    .line 13322
    :cond_6
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Layout state should be one of "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 13323
    invoke-static {p1}, Ljava/lang/Integer;->toBinaryString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " but it is "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->AudioAttributesImplApi21Parcelizer:I

    .line 13324
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-static {p0}, Ljava/lang/Integer;->toBinaryString(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final write()Z
    .registers 1

    .line 13444
    iget-boolean p0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->IconCompatParcelizer:Z

    return p0
.end method

###### Class androidx.recyclerview.widget.RecyclerView.MediaDescriptionCompat (androidx.recyclerview.widget.RecyclerView$MediaDescriptionCompat)
.class public final Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/recyclerview/widget/RecyclerView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "MediaDescriptionCompat"
.end annotation


# instance fields
.field final AudioAttributesCompatParcelizer:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;",
            ">;"
        }
    .end annotation
.end field

.field private AudioAttributesImplApi21Parcelizer:I

.field private AudioAttributesImplApi26Parcelizer:Landroidx/recyclerview/widget/RecyclerView$onPlayFromMediaId;

.field private AudioAttributesImplBaseParcelizer:I

.field private IconCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView$MediaMetadataCompat;

.field private final MediaBrowserCompatItemReceiver:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic RemoteActionCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

.field read:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;",
            ">;"
        }
    .end annotation
.end field

.field final write:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/recyclerview/widget/RecyclerView;)V
    .registers 3

    .line 6512
    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->RemoteActionCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6513
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->write:Ljava/util/ArrayList;

    const/4 v0, 0x0

    .line 6514
    iput-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->read:Ljava/util/ArrayList;

    .line 6516
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->AudioAttributesCompatParcelizer:Ljava/util/ArrayList;

    .line 6519
    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->MediaBrowserCompatItemReceiver:Ljava/util/List;

    const/4 p1, 0x2

    .line 6521
    iput p1, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->AudioAttributesImplBaseParcelizer:I

    .line 6522
    iput p1, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->AudioAttributesImplApi21Parcelizer:I

    return-void
.end method

.method private AudioAttributesCompatParcelizer(IZ)Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;
    .registers 8

    .line 7297
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->write:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_8
    if-ge v2, v0, :cond_3b

    .line 7301
    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->write:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;

    .line 7302
    invoke-virtual {v3}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->wasReturnedFromScrap()Z

    move-result v4

    if-nez v4, :cond_38

    invoke-virtual {v3}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->getLayoutPosition()I

    move-result v4

    if-ne v4, p1, :cond_38

    .line 7303
    invoke-virtual {v3}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->isInvalid()Z

    move-result v4

    if-nez v4, :cond_38

    iget-object v4, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->RemoteActionCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v4, v4, Landroidx/recyclerview/widget/RecyclerView;->onPrepareFromUri:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    iget-boolean v4, v4, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->IconCompatParcelizer:Z

    if-nez v4, :cond_32

    invoke-virtual {v3}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->isRemoved()Z

    move-result v4

    if-nez v4, :cond_38

    :cond_32
    const/16 p0, 0x20

    .line 7304
    invoke-virtual {v3, p0}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->addFlags(I)V

    return-object v3

    :cond_38
    add-int/lit8 v2, v2, 0x1

    goto :goto_8

    :cond_3b
    if-nez p2, :cond_8a

    .line 7310
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->RemoteActionCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatSearchResultReceiver:Lo/TypesKt;

    invoke-virtual {v0, p1}, Lo/TypesKt;->RemoteActionCompatParcelizer(I)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_8a

    .line 7314
    invoke-static {v0}, Landroidx/recyclerview/widget/RecyclerView;->IconCompatParcelizer(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;

    move-result-object p1

    .line 7315
    iget-object p2, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->RemoteActionCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    iget-object p2, p2, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatSearchResultReceiver:Lo/TypesKt;

    invoke-virtual {p2, v0}, Lo/TypesKt;->AudioAttributesImplApi21Parcelizer(Landroid/view/View;)V

    .line 7316
    iget-object p2, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->RemoteActionCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    iget-object p2, p2, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatSearchResultReceiver:Lo/TypesKt;

    invoke-virtual {p2, v0}, Lo/TypesKt;->read(Landroid/view/View;)I

    move-result p2

    const/4 v1, -0x1

    if-eq p2, v1, :cond_6d

    .line 7321
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->RemoteActionCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v1, v1, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatSearchResultReceiver:Lo/TypesKt;

    invoke-virtual {v1, p2}, Lo/TypesKt;->write(I)V

    .line 7322
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->RemoteActionCompatParcelizer(Landroid/view/View;)V

    const/16 p0, 0x2020

    .line 7323
    invoke-virtual {p1, p0}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->addFlags(I)V

    return-object p1

    .line 7318
    :cond_6d
    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "layout index should not be -1 after unhiding a view:"

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->RemoteActionCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    .line 7319
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->write()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 7330
    :cond_8a
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->AudioAttributesCompatParcelizer:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    :goto_90
    if-ge v1, v0, :cond_be

    .line 7332
    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->AudioAttributesCompatParcelizer:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;

    .line 7335
    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->isInvalid()Z

    move-result v3

    if-nez v3, :cond_bb

    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->getLayoutPosition()I

    move-result v3

    if-ne v3, p1, :cond_bb

    .line 7336
    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->isAttachedToTransitionOverlay()Z

    move-result v3

    if-nez v3, :cond_bb

    if-nez p2, :cond_b3

    .line 7338
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->AudioAttributesCompatParcelizer:Ljava/util/ArrayList;

    invoke-virtual {p0, v1}, Ljava/util/AbstractList;->remove(I)Ljava/lang/Object;

    .line 7340
    :cond_b3
    sget-boolean p0, Landroidx/recyclerview/widget/RecyclerView;->AudioAttributesImplBaseParcelizer:Z

    if-eqz p0, :cond_ba

    .line 7341
    invoke-static {v2}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_ba
    return-object v2

    :cond_bb
    add-int/lit8 v1, v1, 0x1

    goto :goto_90

    :cond_be
    const/4 p0, 0x0

    return-object p0
.end method

.method private AudioAttributesImplBaseParcelizer(I)Landroid/view/View;
    .registers 5

    const/4 v0, 0x0

    const-wide v1, 0x7fffffffffffffffL

    .line 6757
    invoke-virtual {p0, p1, v0, v1, v2}, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->read(IZJ)Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;

    move-result-object p0

    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->itemView:Landroid/view/View;

    return-object p0
.end method

.method private IconCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;)Z
    .registers 7

    .line 6581
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->isRemoved()Z

    move-result v0

    if-eqz v0, :cond_38

    .line 6582
    sget-boolean p1, Landroidx/recyclerview/widget/RecyclerView;->AudioAttributesImplApi26Parcelizer:Z

    if-eqz p1, :cond_2f

    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->RemoteActionCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView;->onPrepareFromUri:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->write()Z

    move-result p1

    if-eqz p1, :cond_15

    goto :goto_2f

    .line 6583
    :cond_15
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "should not receive a removed view unless it is pre layout"

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->RemoteActionCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    .line 6584
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->write()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 6586
    :cond_2f
    :goto_2f
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->RemoteActionCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPrepareFromUri:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->write()Z

    move-result p0

    return p0

    .line 6588
    :cond_38
    iget v0, p1, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mPosition:I

    if-ltz v0, :cond_84

    iget v0, p1, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mPosition:I

    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->RemoteActionCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v1, v1, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatItemReceiver:Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;

    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;->getItemCount()I

    move-result v1

    if-ge v0, v1, :cond_84

    .line 6592
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->RemoteActionCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->onPrepareFromUri:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->write()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_64

    .line 6594
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->RemoteActionCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatItemReceiver:Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;

    iget v2, p1, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mPosition:I

    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;->getItemViewType(I)I

    move-result v0

    .line 6595
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->getItemViewType()I

    move-result v2

    if-eq v0, v2, :cond_64

    return v1

    .line 6599
    :cond_64
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->RemoteActionCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatItemReceiver:Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;->hasStableIds()Z

    move-result v0

    const/4 v2, 0x1

    if-eqz v0, :cond_83

    .line 6600
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->getItemId()J

    move-result-wide v3

    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->RemoteActionCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatItemReceiver:Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;

    iget p1, p1, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mPosition:I

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;->getItemId(I)J

    move-result-wide p0

    cmp-long p0, v3, p0

    if-nez p0, :cond_82

    return v2

    :cond_82
    return v1

    :cond_83
    return v2

    .line 6589
    :cond_84
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Inconsistency detected. Invalid view holder adapter position"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->RemoteActionCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    .line 6590
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->write()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private IconCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;IIJ)Z
    .registers 16

    const/4 v0, 0x0

    .line 6619
    iput-object v0, p1, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mBindingAdapter:Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;

    .line 6620
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->RemoteActionCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    iput-object v0, p1, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mOwnerRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    .line 6621
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->getItemViewType()I

    move-result v2

    .line 6622
    invoke-static {}, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatItemReceiver()J

    move-result-wide v7

    const-wide v0, 0x7fffffffffffffffL

    cmp-long v0, p4, v0

    const/4 v9, 0x0

    if-eqz v0, :cond_24

    .line 6623
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->IconCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView$MediaMetadataCompat;

    move-wide v3, v7

    move-wide v5, p4

    .line 6624
    invoke-virtual/range {v1 .. v6}, Landroidx/recyclerview/widget/RecyclerView$MediaMetadataCompat;->read(IJJ)Z

    move-result p4

    if-nez p4, :cond_24

    return v9

    .line 6640
    :cond_24
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->isTmpDetached()Z

    move-result p4

    const/4 p5, 0x1

    if-eqz p4, :cond_3f

    .line 6641
    iget-object p4, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->RemoteActionCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, p1, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->itemView:Landroid/view/View;

    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->RemoteActionCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    iget-object v2, p1, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->itemView:Landroid/view/View;

    .line 6642
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    .line 6641
    invoke-static {p4, v0, v1, v2}, Landroidx/recyclerview/widget/RecyclerView;->RemoteActionCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    move v9, p5

    .line 6646
    :cond_3f
    iget-object p4, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->RemoteActionCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    iget-object p4, p4, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatItemReceiver:Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;

    invoke-virtual {p4, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;->bindViewHolder(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;I)V

    if-eqz v9, :cond_4f

    .line 6649
    iget-object p2, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->RemoteActionCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    iget-object p4, p1, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->itemView:Landroid/view/View;

    invoke-static {p2, p4}, Landroidx/recyclerview/widget/RecyclerView;->AudioAttributesCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;)V

    .line 6652
    :cond_4f
    invoke-static {}, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatItemReceiver()J

    move-result-wide v0

    .line 6653
    iget-object p2, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->IconCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView$MediaMetadataCompat;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->getItemViewType()I

    move-result p4

    sub-long/2addr v0, v7

    invoke-virtual {p2, p4, v0, v1}, Landroidx/recyclerview/widget/RecyclerView$MediaMetadataCompat;->write(IJ)V

    .line 6654
    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->write(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;)V

    .line 6655
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->RemoteActionCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPrepareFromUri:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->write()Z

    move-result p0

    if-eqz p0, :cond_6c

    .line 6656
    iput p3, p1, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mPreLayoutPosition:I

    :cond_6c
    return p5
.end method

.method private MediaBrowserCompatCustomActionResultReceiver(I)V
    .registers 4

    .line 7050
    sget-boolean v0, Landroidx/recyclerview/widget/RecyclerView;->AudioAttributesImplBaseParcelizer:Z

    .line 7053
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->AudioAttributesCompatParcelizer:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;

    .line 7054
    sget-boolean v1, Landroidx/recyclerview/widget/RecyclerView;->AudioAttributesImplBaseParcelizer:Z

    if-eqz v1, :cond_11

    .line 7055
    invoke-static {v0}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_11
    const/4 v1, 0x1

    .line 7057
    invoke-virtual {p0, v0, v1}, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->IconCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;Z)V

    .line 7058
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->AudioAttributesCompatParcelizer:Ljava/util/ArrayList;

    invoke-virtual {p0, p1}, Ljava/util/AbstractList;->remove(I)Ljava/lang/Object;

    return-void
.end method

.method private MediaDescriptionCompat()V
    .registers 2

    .line 7028
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->AudioAttributesCompatParcelizer:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_8
    if-ltz v0, :cond_10

    .line 7030
    invoke-direct {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->MediaBrowserCompatCustomActionResultReceiver(I)V

    add-int/lit8 v0, v0, -0x1

    goto :goto_8

    .line 7032
    :cond_10
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->AudioAttributesCompatParcelizer:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->clear()V

    .line 7033
    sget-boolean v0, Landroidx/recyclerview/widget/RecyclerView;->IconCompatParcelizer:Z

    if-eqz v0, :cond_20

    .line 7034
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->RemoteActionCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPlayFromSearch:Lo/SingletonSupport$read;

    invoke-virtual {p0}, Lo/SingletonSupport$read;->RemoteActionCompatParcelizer()V

    :cond_20
    return-void
.end method

.method private MediaMetadataCompat()V
    .registers 2

    .line 7521
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->IconCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView$MediaMetadataCompat;

    if-eqz v0, :cond_1b

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->RemoteActionCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatItemReceiver:Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;

    if-eqz v0, :cond_1b

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->RemoteActionCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    .line 7523
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->isAttachedToWindow()Z

    move-result v0

    if-eqz v0, :cond_1b

    .line 7524
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->IconCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView$MediaMetadataCompat;

    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->RemoteActionCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatItemReceiver:Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;

    invoke-virtual {v0, p0}, Landroidx/recyclerview/widget/RecyclerView$MediaMetadataCompat;->IconCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;)V

    :cond_1b
    return-void
.end method

.method private RemoteActionCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;Z)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer<",
            "*>;Z)V"
        }
    .end annotation

    .line 7533
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->IconCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView$MediaMetadataCompat;

    if-eqz p0, :cond_7

    .line 7534
    invoke-virtual {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$MediaMetadataCompat;->IconCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;Z)V

    :cond_7
    return-void
.end method

.method private RemoteActionCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;)V
    .registers 5

    .line 7406
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->RemoteActionCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->onSeekTo:Landroidx/recyclerview/widget/RecyclerView$onAddQueueItem;

    if-eqz v0, :cond_a

    .line 7407
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->RemoteActionCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->onSeekTo:Landroidx/recyclerview/widget/RecyclerView$onAddQueueItem;

    .line 7410
    :cond_a
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->RemoteActionCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->onRewind:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_13
    if-ge v1, v0, :cond_22

    .line 7412
    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->RemoteActionCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v2, v2, Landroidx/recyclerview/widget/RecyclerView;->onRewind:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/recyclerview/widget/RecyclerView$onAddQueueItem;

    add-int/lit8 v1, v1, 0x1

    goto :goto_13

    .line 7414
    :cond_22
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->RemoteActionCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatItemReceiver:Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;

    if-eqz v0, :cond_2f

    .line 7415
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->RemoteActionCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatItemReceiver:Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;->onViewRecycled(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;)V

    .line 7417
    :cond_2f
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->RemoteActionCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->onPrepareFromUri:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    if-eqz v0, :cond_3c

    .line 7418
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->RemoteActionCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView;->onSetRating:Lo/UIntSerializer;

    invoke-virtual {p0, p1}, Lo/UIntSerializer;->MediaBrowserCompatCustomActionResultReceiver(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;)V

    .line 7420
    :cond_3c
    sget-boolean p0, Landroidx/recyclerview/widget/RecyclerView;->AudioAttributesImplBaseParcelizer:Z

    if-eqz p0, :cond_43

    invoke-static {p1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_43
    return-void
.end method

.method private read(I)Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;
    .registers 10

    .line 7261
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->read:Ljava/util/ArrayList;

    if-eqz v0, :cond_70

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    if-eqz v0, :cond_70

    const/4 v1, 0x0

    move v2, v1

    :goto_c
    const/16 v3, 0x20

    if-ge v2, v0, :cond_2b

    .line 7266
    iget-object v4, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->read:Ljava/util/ArrayList;

    invoke-virtual {v4, v2}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;

    .line 7267
    invoke-virtual {v4}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->wasReturnedFromScrap()Z

    move-result v5

    if-nez v5, :cond_28

    invoke-virtual {v4}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->getLayoutPosition()I

    move-result v5

    if-ne v5, p1, :cond_28

    .line 7268
    invoke-virtual {v4, v3}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->addFlags(I)V

    return-object v4

    :cond_28
    add-int/lit8 v2, v2, 0x1

    goto :goto_c

    .line 7273
    :cond_2b
    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->RemoteActionCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v2, v2, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatItemReceiver:Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;

    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;->hasStableIds()Z

    move-result v2

    if-eqz v2, :cond_70

    .line 7274
    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->RemoteActionCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v2, v2, Landroidx/recyclerview/widget/RecyclerView;->MediaMetadataCompat:Lo/RegexDeserializer;

    invoke-virtual {v2, p1}, Lo/RegexDeserializer;->write(I)I

    move-result p1

    if-lez p1, :cond_70

    .line 7275
    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->RemoteActionCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v2, v2, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatItemReceiver:Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;

    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;->getItemCount()I

    move-result v2

    if-ge p1, v2, :cond_70

    .line 7276
    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->RemoteActionCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v2, v2, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatItemReceiver:Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;

    invoke-virtual {v2, p1}, Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;->getItemId(I)J

    move-result-wide v4

    :goto_51
    if-ge v1, v0, :cond_70

    .line 7278
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->read:Ljava/util/ArrayList;

    invoke-virtual {p1, v1}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;

    .line 7279
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->wasReturnedFromScrap()Z

    move-result v2

    if-nez v2, :cond_6d

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->getItemId()J

    move-result-wide v6

    cmp-long v2, v6, v4

    if-nez v2, :cond_6d

    .line 7280
    invoke-virtual {p1, v3}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->addFlags(I)V

    return-object p1

    :cond_6d
    add-int/lit8 v1, v1, 0x1

    goto :goto_51

    :cond_70
    const/4 p0, 0x0

    return-object p0
.end method

.method private read(JIZ)Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;
    .registers 10

    .line 7352
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->write:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_8
    if-ltz v0, :cond_59

    .line 7354
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->write:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;

    .line 7355
    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->getItemId()J

    move-result-wide v2

    cmp-long v2, v2, p1

    if-nez v2, :cond_56

    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->wasReturnedFromScrap()Z

    move-result v2

    if-nez v2, :cond_56

    .line 7356
    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->getItemViewType()I

    move-result v2

    if-ne p3, v2, :cond_42

    const/16 p1, 0x20

    .line 7357
    invoke-virtual {v1, p1}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->addFlags(I)V

    .line 7358
    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->isRemoved()Z

    move-result p1

    if-eqz p1, :cond_41

    .line 7367
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->RemoteActionCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPrepareFromUri:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->write()Z

    move-result p0

    if-nez p0, :cond_41

    const/4 p0, 0x2

    const/16 p1, 0xe

    .line 7368
    invoke-virtual {v1, p0, p1}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->setFlags(II)V

    :cond_41
    return-object v1

    :cond_42
    if-nez p4, :cond_56

    .line 7377
    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->write:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/AbstractList;->remove(I)Ljava/lang/Object;

    .line 7378
    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->RemoteActionCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v3, v1, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->itemView:Landroid/view/View;

    const/4 v4, 0x0

    invoke-virtual {v2, v3, v4}, Landroidx/recyclerview/widget/RecyclerView;->removeDetachedView(Landroid/view/View;Z)V

    .line 7379
    iget-object v1, v1, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->itemView:Landroid/view/View;

    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->read(Landroid/view/View;)V

    :cond_56
    add-int/lit8 v0, v0, -0x1

    goto :goto_8

    .line 7385
    :cond_59
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->AudioAttributesCompatParcelizer:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_61
    const/4 v1, 0x0

    if-ltz v0, :cond_91

    .line 7387
    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->AudioAttributesCompatParcelizer:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;

    .line 7388
    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->getItemId()J

    move-result-wide v3

    cmp-long v3, v3, p1

    if-nez v3, :cond_8e

    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->isAttachedToTransitionOverlay()Z

    move-result v3

    if-nez v3, :cond_8e

    .line 7389
    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->getItemViewType()I

    move-result v3

    if-ne p3, v3, :cond_88

    if-nez p4, :cond_87

    .line 7391
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->AudioAttributesCompatParcelizer:Ljava/util/ArrayList;

    invoke-virtual {p0, v0}, Ljava/util/AbstractList;->remove(I)Ljava/lang/Object;

    :cond_87
    return-object v2

    :cond_88
    if-nez p4, :cond_8e

    .line 7395
    invoke-direct {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->MediaBrowserCompatCustomActionResultReceiver(I)V

    return-object v1

    :cond_8e
    add-int/lit8 v0, v0, -0x1

    goto :goto_61

    :cond_91
    return-object v1
.end method

.method private write(Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer<",
            "*>;)V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 7529
    invoke-direct {p0, p1, v0}, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->RemoteActionCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;Z)V

    return-void
.end method

.method private write(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;)V
    .registers 3

    .line 6937
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->RemoteActionCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatSearchResultReceiver()Z

    move-result v0

    if-eqz v0, :cond_2f

    .line 6938
    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->itemView:Landroid/view/View;

    .line 6939
    invoke-static {p1}, Lo/InvalidTypeIdException;->MediaBrowserCompatItemReceiver(Landroid/view/View;)I

    move-result v0

    if-nez v0, :cond_14

    const/4 v0, 0x1

    .line 6941
    invoke-static {p1, v0}, Lo/InvalidTypeIdException;->AudioAttributesImplBaseParcelizer(Landroid/view/View;I)V

    .line 6944
    :cond_14
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->RemoteActionCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->AudioAttributesImplApi21Parcelizer:Lo/UIntKeyDeserializer;

    if-eqz v0, :cond_2f

    .line 6947
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->RemoteActionCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView;->AudioAttributesImplApi21Parcelizer:Lo/UIntKeyDeserializer;

    invoke-virtual {p0}, Lo/UIntKeyDeserializer;->IconCompatParcelizer()Lo/deserializeUsingCustom;

    move-result-object p0

    .line 6948
    instance-of v0, p0, Lo/UIntKeyDeserializer$write;

    if-eqz v0, :cond_2c

    .line 6951
    move-object v0, p0

    check-cast v0, Lo/UIntKeyDeserializer$write;

    .line 6952
    invoke-virtual {v0, p1}, Lo/UIntKeyDeserializer$write;->AudioAttributesCompatParcelizer(Landroid/view/View;)V

    .line 6954
    :cond_2c
    invoke-static {p1, p0}, Lo/InvalidTypeIdException;->AudioAttributesCompatParcelizer(Landroid/view/View;Lo/deserializeUsingCustom;)V

    :cond_2f
    return-void
.end method


# virtual methods
.method final AudioAttributesCompatParcelizer()I
    .registers 1

    .line 7244
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->write:Ljava/util/ArrayList;

    invoke-virtual {p0}, Ljava/util/AbstractCollection;->size()I

    move-result p0

    return p0
.end method

.method public final AudioAttributesCompatParcelizer(I)I
    .registers 4

    if-ltz p1, :cond_20

    .line 6727
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->RemoteActionCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->onPrepareFromUri:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->read()I

    move-result v0

    if-ge p1, v0, :cond_20

    .line 6731
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->RemoteActionCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->onPrepareFromUri:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->write()Z

    move-result v0

    if-nez v0, :cond_17

    return p1

    .line 6734
    :cond_17
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->RemoteActionCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView;->MediaMetadataCompat:Lo/RegexDeserializer;

    invoke-virtual {p0, p1}, Lo/RegexDeserializer;->write(I)I

    move-result p0

    return p0

    .line 6728
    :cond_20
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "invalid position "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ". State item count is "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->RemoteActionCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView;->onPrepareFromUri:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    .line 6729
    new-instance v1, Ljava/lang/IndexOutOfBoundsException;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->read()I

    move-result p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->RemoteActionCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->write()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v1, p0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method final AudioAttributesCompatParcelizer(II)V
    .registers 8

    .line 7462
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->AudioAttributesCompatParcelizer:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_8
    if-ge v2, v0, :cond_27

    .line 7464
    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->AudioAttributesCompatParcelizer:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;

    if-eqz v3, :cond_24

    .line 7465
    iget v4, v3, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mPosition:I

    if-lt v4, p1, :cond_24

    .line 7466
    sget-boolean v4, Landroidx/recyclerview/widget/RecyclerView;->AudioAttributesImplBaseParcelizer:Z

    if-eqz v4, :cond_21

    .line 7467
    invoke-static {v3}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    iget v4, v3, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mPosition:I

    .line 7471
    :cond_21
    invoke-virtual {v3, p2, v1}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->offsetPosition(IZ)V

    :cond_24
    add-int/lit8 v2, v2, 0x1

    goto :goto_8

    :cond_27
    return-void
.end method

.method final AudioAttributesCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaMetadataCompat;)V
    .registers 3

    .line 7509
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->RemoteActionCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatItemReceiver:Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;

    invoke-direct {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->write(Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;)V

    .line 7510
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->IconCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView$MediaMetadataCompat;

    if-eqz v0, :cond_e

    .line 7511
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$MediaMetadataCompat;->RemoteActionCompatParcelizer()V

    .line 7513
    :cond_e
    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->IconCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView$MediaMetadataCompat;

    if-eqz p1, :cond_1f

    .line 7514
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->RemoteActionCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->IconCompatParcelizer()Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;

    move-result-object p1

    if-eqz p1, :cond_1f

    .line 7515
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->IconCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView$MediaMetadataCompat;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$MediaMetadataCompat;->write()V

    .line 7517
    :cond_1f
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->MediaMetadataCompat()V

    return-void
.end method

.method final AudioAttributesCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;)V
    .registers 3

    .line 7233
    iget-boolean v0, p1, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mInChangeScrap:Z

    if-eqz v0, :cond_a

    .line 7234
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->read:Ljava/util/ArrayList;

    invoke-virtual {p0, p1}, Ljava/util/AbstractCollection;->remove(Ljava/lang/Object;)Z

    goto :goto_f

    .line 7236
    :cond_a
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->write:Ljava/util/ArrayList;

    invoke-virtual {p0, p1}, Ljava/util/AbstractCollection;->remove(Ljava/lang/Object;)Z

    :goto_f
    const/4 p0, 0x0

    .line 7238
    iput-object p0, p1, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mScrapContainer:Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;

    const/4 p0, 0x0

    .line 7239
    iput-boolean p0, p1, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mInChangeScrap:Z

    .line 7240
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->clearReturnedFromScrapFlag()V

    return-void
.end method

.method public final AudioAttributesImplApi21Parcelizer()Ljava/util/List;
    .registers 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;",
            ">;"
        }
    .end annotation

    .line 6567
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->MediaBrowserCompatItemReceiver:Ljava/util/List;

    return-object p0
.end method

.method final AudioAttributesImplApi26Parcelizer()V
    .registers 1

    .line 7539
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->MediaMetadataCompat()V

    return-void
.end method

.method final AudioAttributesImplBaseParcelizer()V
    .registers 5

    .line 7611
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->AudioAttributesCompatParcelizer:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_7
    if-ge v1, v0, :cond_21

    .line 7613
    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->AudioAttributesCompatParcelizer:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;

    .line 7614
    iget-object v2, v2, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->itemView:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    check-cast v2, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    if-eqz v2, :cond_1e

    const/4 v3, 0x1

    .line 7616
    iput-boolean v3, v2, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->AudioAttributesCompatParcelizer:Z

    :cond_1e
    add-int/lit8 v1, v1, 0x1

    goto :goto_7

    :cond_21
    return-void
.end method

.method final IconCompatParcelizer(I)Landroid/view/View;
    .registers 2

    .line 7248
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->write:Ljava/util/ArrayList;

    invoke-virtual {p0, p1}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;

    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->itemView:Landroid/view/View;

    return-object p0
.end method

.method final IconCompatParcelizer()V
    .registers 5

    .line 7593
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->AudioAttributesCompatParcelizer:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_8
    if-ge v2, v0, :cond_18

    .line 7595
    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->AudioAttributesCompatParcelizer:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;

    .line 7596
    invoke-virtual {v3}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->clearOldPosition()V

    add-int/lit8 v2, v2, 0x1

    goto :goto_8

    .line 7598
    :cond_18
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->write:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    move v2, v1

    :goto_1f
    if-ge v2, v0, :cond_2f

    .line 7600
    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->write:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;

    invoke-virtual {v3}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->clearOldPosition()V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1f

    .line 7602
    :cond_2f
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->read:Ljava/util/ArrayList;

    if-eqz v0, :cond_47

    .line 7603
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    :goto_37
    if-ge v1, v0, :cond_47

    .line 7605
    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->read:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;

    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->clearOldPosition()V

    add-int/lit8 v1, v1, 0x1

    goto :goto_37

    :cond_47
    return-void
.end method

.method final IconCompatParcelizer(II)V
    .registers 11

    if-ge p1, p2, :cond_6

    const/4 v0, -0x1

    move v1, p1

    move v2, p2

    goto :goto_9

    :cond_6
    const/4 v0, 0x1

    move v2, p1

    move v1, p2

    .line 7443
    :goto_9
    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->AudioAttributesCompatParcelizer:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/AbstractCollection;->size()I

    move-result v3

    const/4 v4, 0x0

    move v5, v4

    :goto_11
    if-ge v5, v3, :cond_3c

    .line 7445
    iget-object v6, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->AudioAttributesCompatParcelizer:Ljava/util/ArrayList;

    invoke-virtual {v6, v5}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;

    if-eqz v6, :cond_39

    .line 7446
    iget v7, v6, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mPosition:I

    if-lt v7, v1, :cond_39

    iget v7, v6, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mPosition:I

    if-gt v7, v2, :cond_39

    .line 7449
    iget v7, v6, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mPosition:I

    if-ne v7, p1, :cond_2f

    sub-int v7, p2, p1

    .line 7450
    invoke-virtual {v6, v7, v4}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->offsetPosition(IZ)V

    goto :goto_32

    .line 7452
    :cond_2f
    invoke-virtual {v6, v0, v4}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->offsetPosition(IZ)V

    .line 7454
    :goto_32
    sget-boolean v7, Landroidx/recyclerview/widget/RecyclerView;->AudioAttributesImplBaseParcelizer:Z

    if-eqz v7, :cond_39

    .line 7455
    invoke-static {v6}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_39
    add-int/lit8 v5, v5, 0x1

    goto :goto_11

    :cond_3c
    return-void
.end method

.method public final IconCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;Z)V
    .registers 7

    .line 7163
    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->read(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;)V

    .line 7164
    iget-object v0, p1, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->itemView:Landroid/view/View;

    .line 7165
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->RemoteActionCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v1, v1, Landroidx/recyclerview/widget/RecyclerView;->AudioAttributesImplApi21Parcelizer:Lo/UIntKeyDeserializer;

    const/4 v2, 0x0

    if-eqz v1, :cond_23

    .line 7166
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->RemoteActionCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v1, v1, Landroidx/recyclerview/widget/RecyclerView;->AudioAttributesImplApi21Parcelizer:Lo/UIntKeyDeserializer;

    invoke-virtual {v1}, Lo/UIntKeyDeserializer;->IconCompatParcelizer()Lo/deserializeUsingCustom;

    move-result-object v1

    .line 7168
    instance-of v3, v1, Lo/UIntKeyDeserializer$write;

    if-eqz v3, :cond_1f

    .line 7169
    check-cast v1, Lo/UIntKeyDeserializer$write;

    .line 7171
    invoke-virtual {v1, v0}, Lo/UIntKeyDeserializer$write;->IconCompatParcelizer(Landroid/view/View;)Lo/deserializeUsingCustom;

    move-result-object v1

    goto :goto_20

    :cond_1f
    move-object v1, v2

    .line 7174
    :goto_20
    invoke-static {v0, v1}, Lo/InvalidTypeIdException;->AudioAttributesCompatParcelizer(Landroid/view/View;Lo/deserializeUsingCustom;)V

    :cond_23
    if-eqz p2, :cond_28

    .line 7177
    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->RemoteActionCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;)V

    .line 7179
    :cond_28
    iput-object v2, p1, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mBindingAdapter:Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;

    .line 7180
    iput-object v2, p1, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mOwnerRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    .line 7181
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->RemoteActionCompatParcelizer()Landroidx/recyclerview/widget/RecyclerView$MediaMetadataCompat;

    move-result-object p0

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$MediaMetadataCompat;->AudioAttributesCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;)V

    return-void
.end method

.method final MediaBrowserCompatCustomActionResultReceiver()V
    .registers 3

    const/4 v0, 0x0

    .line 7543
    :goto_1
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->AudioAttributesCompatParcelizer:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/AbstractCollection;->size()I

    move-result v1

    if-ge v0, v1, :cond_19

    .line 7544
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->AudioAttributesCompatParcelizer:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;

    iget-object v1, v1, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->itemView:Landroid/view/View;

    invoke-static {v1}, Lo/createPrimordial;->AudioAttributesCompatParcelizer(Landroid/view/View;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 7546
    :cond_19
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->RemoteActionCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatItemReceiver:Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;

    invoke-direct {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->write(Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;)V

    return-void
.end method

.method final MediaBrowserCompatItemReceiver()V
    .registers 5

    .line 7577
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->AudioAttributesCompatParcelizer:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_7
    if-ge v1, v0, :cond_1e

    .line 7579
    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->AudioAttributesCompatParcelizer:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;

    if-eqz v2, :cond_1b

    const/4 v3, 0x6

    .line 7581
    invoke-virtual {v2, v3}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->addFlags(I)V

    const/4 v3, 0x0

    .line 7582
    invoke-virtual {v2, v3}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->addChangePayload(Ljava/lang/Object;)V

    :cond_1b
    add-int/lit8 v1, v1, 0x1

    goto :goto_7

    .line 7586
    :cond_1e
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->RemoteActionCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatItemReceiver:Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;

    if-eqz v0, :cond_2f

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->RemoteActionCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatItemReceiver:Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;->hasStableIds()Z

    move-result v0

    if-eqz v0, :cond_2f

    return-void

    .line 7588
    :cond_2f
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->MediaDescriptionCompat()V

    return-void
.end method

.method public final RatingCompat()V
    .registers 4

    .line 6550
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->RemoteActionCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->onPlayFromMediaId:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    if-eqz v0, :cond_d

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->RemoteActionCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->onPlayFromMediaId:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    iget v0, v0, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->AudioAttributesImplApi26Parcelizer:I

    goto :goto_e

    :cond_d
    const/4 v0, 0x0

    .line 6551
    :goto_e
    iget v1, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->AudioAttributesImplBaseParcelizer:I

    add-int/2addr v1, v0

    iput v1, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->AudioAttributesImplApi21Parcelizer:I

    .line 6554
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->AudioAttributesCompatParcelizer:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_1b
    if-ltz v0, :cond_2d

    .line 6555
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->AudioAttributesCompatParcelizer:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/AbstractCollection;->size()I

    move-result v1

    iget v2, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->AudioAttributesImplApi21Parcelizer:I

    if-le v1, v2, :cond_2d

    .line 6556
    invoke-direct {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->MediaBrowserCompatCustomActionResultReceiver(I)V

    add-int/lit8 v0, v0, -0x1

    goto :goto_1b

    :cond_2d
    return-void
.end method

.method public final RemoteActionCompatParcelizer(I)Landroid/view/View;
    .registers 2

    .line 6753
    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->AudioAttributesImplBaseParcelizer(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method final RemoteActionCompatParcelizer()Landroidx/recyclerview/widget/RecyclerView$MediaMetadataCompat;
    .registers 2

    .line 7550
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->IconCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView$MediaMetadataCompat;

    if-nez v0, :cond_e

    .line 7551
    new-instance v0, Landroidx/recyclerview/widget/RecyclerView$MediaMetadataCompat;

    invoke-direct {v0}, Landroidx/recyclerview/widget/RecyclerView$MediaMetadataCompat;-><init>()V

    iput-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->IconCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView$MediaMetadataCompat;

    .line 7552
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->MediaMetadataCompat()V

    .line 7554
    :cond_e
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->IconCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView$MediaMetadataCompat;

    return-object p0
.end method

.method final RemoteActionCompatParcelizer(II)V
    .registers 7

    .line 7559
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->AudioAttributesCompatParcelizer:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_8
    if-ltz v0, :cond_26

    .line 7561
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->AudioAttributesCompatParcelizer:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;

    if-eqz v1, :cond_23

    .line 7566
    iget v2, v1, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mPosition:I

    if-lt v2, p1, :cond_23

    add-int v3, p2, p1

    if-ge v2, v3, :cond_23

    const/4 v2, 0x2

    .line 7568
    invoke-virtual {v1, v2}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->addFlags(I)V

    .line 7569
    invoke-direct {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->MediaBrowserCompatCustomActionResultReceiver(I)V

    :cond_23
    add-int/lit8 v0, v0, -0x1

    goto :goto_8

    :cond_26
    return-void
.end method

.method final RemoteActionCompatParcelizer(Landroid/view/View;)V
    .registers 3

    .line 7207
    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->IconCompatParcelizer(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;

    move-result-object p1

    const/16 v0, 0xc

    .line 7208
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->hasAnyOfTheFlags(I)Z

    move-result v0

    if-nez v0, :cond_2f

    .line 7209
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->isUpdated()Z

    move-result v0

    if-eqz v0, :cond_2f

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->RemoteActionCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView;->write(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;)Z

    move-result v0

    if-nez v0, :cond_2f

    .line 7218
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->read:Ljava/util/ArrayList;

    if-nez v0, :cond_25

    .line 7219
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->read:Ljava/util/ArrayList;

    :cond_25
    const/4 v0, 0x1

    .line 7221
    invoke-virtual {p1, p0, v0}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->setScrapContainer(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Z)V

    .line 7222
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->read:Ljava/util/ArrayList;

    invoke-virtual {p0, p1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    return-void

    .line 7210
    :cond_2f
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->isInvalid()Z

    move-result v0

    if-eqz v0, :cond_60

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->isRemoved()Z

    move-result v0

    if-nez v0, :cond_60

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->RemoteActionCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatItemReceiver:Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;->hasStableIds()Z

    move-result v0

    if-eqz v0, :cond_46

    goto :goto_60

    .line 7211
    :cond_46
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool."

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->RemoteActionCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    .line 7213
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->write()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_60
    :goto_60
    const/4 v0, 0x0

    .line 7215
    invoke-virtual {p1, p0, v0}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->setScrapContainer(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Z)V

    .line 7216
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->write:Ljava/util/ArrayList;

    invoke-virtual {p0, p1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method final RemoteActionCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;Z)V
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer<",
            "*>;",
            "Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer<",
            "*>;Z)V"
        }
    .end annotation

    .line 7425
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->write()V

    const/4 v0, 0x1

    .line 7426
    invoke-direct {p0, p1, v0}, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->RemoteActionCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;Z)V

    .line 7427
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->RemoteActionCompatParcelizer()Landroidx/recyclerview/widget/RecyclerView$MediaMetadataCompat;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Landroidx/recyclerview/widget/RecyclerView$MediaMetadataCompat;->IconCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;Z)V

    .line 7429
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->MediaMetadataCompat()V

    return-void
.end method

.method public final read(IZJ)Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;
    .registers 22

    move-object/from16 v6, p0

    move/from16 v3, p1

    if-ltz v3, :cond_242

    .line 6780
    iget-object v0, v6, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->RemoteActionCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->onPrepareFromUri:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->read()I

    move-result v0

    if-ge v3, v0, :cond_242

    .line 6788
    iget-object v0, v6, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->RemoteActionCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->onPrepareFromUri:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->write()Z

    move-result v0

    const/4 v1, 0x0

    const/4 v7, 0x1

    const/4 v8, 0x0

    if-eqz v0, :cond_25

    .line 6789
    invoke-direct/range {p0 .. p1}, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->read(I)Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;

    move-result-object v0

    if-eqz v0, :cond_26

    move v2, v7

    goto :goto_27

    :cond_25
    move-object v0, v1

    :cond_26
    move v2, v8

    :goto_27
    if-nez v0, :cond_59

    .line 6794
    invoke-direct {v6, v3, v8}, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->AudioAttributesCompatParcelizer(IZ)Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;

    move-result-object v0

    if-eqz v0, :cond_59

    .line 6796
    invoke-direct {v6, v0}, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->IconCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;)Z

    move-result v4

    if-nez v4, :cond_58

    const/4 v4, 0x4

    .line 6801
    invoke-virtual {v0, v4}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->addFlags(I)V

    .line 6802
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->isScrap()Z

    move-result v4

    if-eqz v4, :cond_4a

    .line 6803
    iget-object v4, v6, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->RemoteActionCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v5, v0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->itemView:Landroid/view/View;

    invoke-virtual {v4, v5, v8}, Landroidx/recyclerview/widget/RecyclerView;->removeDetachedView(Landroid/view/View;Z)V

    .line 6804
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->unScrap()V

    goto :goto_53

    .line 6805
    :cond_4a
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->wasReturnedFromScrap()Z

    move-result v4

    if-eqz v4, :cond_53

    .line 6806
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->clearReturnedFromScrapFlag()V

    .line 6808
    :cond_53
    :goto_53
    invoke-virtual {v6, v0}, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->read(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;)V

    move-object v0, v1

    goto :goto_59

    :cond_58
    move v2, v7

    :cond_59
    :goto_59
    if-nez v0, :cond_16f

    .line 6817
    iget-object v4, v6, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->RemoteActionCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v4, v4, Landroidx/recyclerview/widget/RecyclerView;->MediaMetadataCompat:Lo/RegexDeserializer;

    invoke-virtual {v4, v3}, Lo/RegexDeserializer;->write(I)I

    move-result v4

    if-ltz v4, :cond_13a

    .line 6818
    iget-object v5, v6, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->RemoteActionCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v5, v5, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatItemReceiver:Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;

    invoke-virtual {v5}, Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;->getItemCount()I

    move-result v5

    if-ge v4, v5, :cond_13a

    .line 6824
    iget-object v5, v6, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->RemoteActionCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v5, v5, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatItemReceiver:Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;

    invoke-virtual {v5, v4}, Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;->getItemViewType(I)I

    move-result v5

    .line 6826
    iget-object v9, v6, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->RemoteActionCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v9, v9, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatItemReceiver:Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;

    invoke-virtual {v9}, Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;->hasStableIds()Z

    move-result v9

    if-eqz v9, :cond_92

    .line 6827
    iget-object v0, v6, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->RemoteActionCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatItemReceiver:Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;

    invoke-virtual {v0, v4}, Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;->getItemId(I)J

    move-result-wide v9

    invoke-direct {v6, v9, v10, v5, v8}, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->read(JIZ)Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;

    move-result-object v0

    if-eqz v0, :cond_92

    .line 6831
    iput v4, v0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mPosition:I

    move v2, v7

    :cond_92
    if-nez v0, :cond_e1

    .line 6835
    iget-object v4, v6, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->AudioAttributesImplApi26Parcelizer:Landroidx/recyclerview/widget/RecyclerView$onPlayFromMediaId;

    if-eqz v4, :cond_e1

    .line 6839
    invoke-virtual {v4}, Landroidx/recyclerview/widget/RecyclerView$onPlayFromMediaId;->AudioAttributesCompatParcelizer()Landroid/view/View;

    move-result-object v4

    if-eqz v4, :cond_e1

    .line 6841
    iget-object v0, v6, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->RemoteActionCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, v4}, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatCustomActionResultReceiver(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;

    move-result-object v0

    if-eqz v0, :cond_c7

    .line 6846
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->shouldIgnore()Z

    move-result v4

    if-nez v4, :cond_ad

    goto :goto_e1

    .line 6847
    :cond_ad
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "getViewForPositionAndType returned a view that is ignored. You must call stopIgnoring before returning this view."

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, v6, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->RemoteActionCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    .line 6849
    new-instance v2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView;->write()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 6843
    :cond_c7
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "getViewForPositionAndType returned a view which does not have a ViewHolder"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, v6, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->RemoteActionCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    .line 6845
    new-instance v2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView;->write()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_e1
    :goto_e1
    if-nez v0, :cond_f4

    .line 6854
    sget-boolean v0, Landroidx/recyclerview/widget/RecyclerView;->AudioAttributesImplBaseParcelizer:Z

    .line 6858
    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->RemoteActionCompatParcelizer()Landroidx/recyclerview/widget/RecyclerView$MediaMetadataCompat;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroidx/recyclerview/widget/RecyclerView$MediaMetadataCompat;->IconCompatParcelizer(I)Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;

    move-result-object v0

    if-eqz v0, :cond_f4

    .line 6860
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->resetInternal()V

    .line 6861
    sget-boolean v4, Landroidx/recyclerview/widget/RecyclerView;->write:Z

    :cond_f4
    if-nez v0, :cond_16f

    .line 6867
    invoke-static {}, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatItemReceiver()J

    move-result-wide v15

    const-wide v9, 0x7fffffffffffffffL

    cmp-long v0, p3, v9

    if-eqz v0, :cond_110

    .line 6868
    iget-object v9, v6, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->IconCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView$MediaMetadataCompat;

    move v10, v5

    move-wide v11, v15

    move-wide/from16 v13, p3

    .line 6869
    invoke-virtual/range {v9 .. v14}, Landroidx/recyclerview/widget/RecyclerView$MediaMetadataCompat;->write(IJJ)Z

    move-result v0

    if-nez v0, :cond_110

    return-object v1

    .line 6873
    :cond_110
    iget-object v0, v6, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->RemoteActionCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatItemReceiver:Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;

    iget-object v1, v6, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->RemoteActionCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, v1, v5}, Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;->createViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;

    move-result-object v0

    .line 6874
    sget-boolean v1, Landroidx/recyclerview/widget/RecyclerView;->IconCompatParcelizer:Z

    if-eqz v1, :cond_12d

    .line 6876
    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->itemView:Landroid/view/View;

    invoke-static {v1}, Landroidx/recyclerview/widget/RecyclerView;->AudioAttributesCompatParcelizer(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v1

    if-eqz v1, :cond_12d

    .line 6878
    new-instance v4, Ljava/lang/ref/WeakReference;

    invoke-direct {v4, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v4, v0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mNestedRecyclerView:Ljava/lang/ref/WeakReference;

    .line 6882
    :cond_12d
    invoke-static {}, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatItemReceiver()J

    move-result-wide v9

    .line 6883
    iget-object v1, v6, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->IconCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView$MediaMetadataCompat;

    sub-long/2addr v9, v15

    invoke-virtual {v1, v5, v9, v10}, Landroidx/recyclerview/widget/RecyclerView$MediaMetadataCompat;->IconCompatParcelizer(IJ)V

    .line 6884
    sget-boolean v1, Landroidx/recyclerview/widget/RecyclerView;->AudioAttributesImplBaseParcelizer:Z

    goto :goto_16f

    .line 6819
    :cond_13a
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Inconsistency detected. Invalid item position "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "(offset:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ").state:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, v6, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->RemoteActionCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v1, v1, Landroidx/recyclerview/widget/RecyclerView;->onPrepareFromUri:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    .line 6821
    new-instance v2, Ljava/lang/IndexOutOfBoundsException;

    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->read()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    iget-object v1, v6, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->RemoteActionCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView;->write()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_16f
    :goto_16f
    move-object v9, v0

    move v10, v2

    if-eqz v10, :cond_1a7

    .line 6893
    iget-object v0, v6, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->RemoteActionCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->onPrepareFromUri:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->write()Z

    move-result v0

    if-nez v0, :cond_1a7

    const/16 v0, 0x2000

    .line 6894
    invoke-virtual {v9, v0}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->hasAnyOfTheFlags(I)Z

    move-result v1

    if-eqz v1, :cond_1a7

    .line 6895
    invoke-virtual {v9, v8, v0}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->setFlags(II)V

    .line 6896
    iget-object v0, v6, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->RemoteActionCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->onPrepareFromUri:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    iget-boolean v0, v0, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->MediaBrowserCompatSearchResultReceiver:Z

    if-eqz v0, :cond_1a7

    .line 6898
    invoke-static {v9}, Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer;->RemoteActionCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;)I

    .line 6900
    iget-object v0, v6, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->RemoteActionCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->onCommand:Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer;

    iget-object v0, v6, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->RemoteActionCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->onPrepareFromUri:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    .line 6901
    invoke-virtual {v9}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->getUnmodifiedPayloads()Ljava/util/List;

    .line 6900
    invoke-static {v9}, Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer;->MediaBrowserCompatItemReceiver(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;)Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer$write;

    move-result-object v0

    .line 6902
    iget-object v1, v6, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->RemoteActionCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v1, v9, v0}, Landroidx/recyclerview/widget/RecyclerView;->read(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer$write;)V

    .line 6907
    :cond_1a7
    iget-object v0, v6, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->RemoteActionCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->onPrepareFromUri:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->write()Z

    move-result v0

    if-eqz v0, :cond_1ba

    invoke-virtual {v9}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->isBound()Z

    move-result v0

    if-eqz v0, :cond_1ba

    .line 6909
    iput v3, v9, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mPreLayoutPosition:I

    goto :goto_1cc

    .line 6910
    :cond_1ba
    invoke-virtual {v9}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->isBound()Z

    move-result v0

    if-eqz v0, :cond_1ce

    invoke-virtual {v9}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->needsUpdate()Z

    move-result v0

    if-nez v0, :cond_1ce

    invoke-virtual {v9}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->isInvalid()Z

    move-result v0

    if-nez v0, :cond_1ce

    :goto_1cc
    move v0, v8

    goto :goto_209

    .line 6911
    :cond_1ce
    sget-boolean v0, Landroidx/recyclerview/widget/RecyclerView;->AudioAttributesImplApi26Parcelizer:Z

    if-eqz v0, :cond_1f6

    invoke-virtual {v9}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->isRemoved()Z

    move-result v0

    if-nez v0, :cond_1d9

    goto :goto_1f6

    .line 6912
    :cond_1d9
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Removed holder should be bound and it should come here only in pre-layout. Holder: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    iget-object v1, v6, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->RemoteActionCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    .line 6914
    new-instance v2, Ljava/lang/IllegalStateException;

    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView;->write()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 6916
    :cond_1f6
    :goto_1f6
    iget-object v0, v6, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->RemoteActionCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->MediaMetadataCompat:Lo/RegexDeserializer;

    invoke-virtual {v0, v3}, Lo/RegexDeserializer;->write(I)I

    move-result v2

    move-object/from16 v0, p0

    move-object v1, v9

    move/from16 v3, p1

    move-wide/from16 v4, p3

    .line 6917
    invoke-direct/range {v0 .. v5}, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->IconCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;IIJ)Z

    move-result v0

    .line 6920
    :goto_209
    iget-object v1, v9, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->itemView:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    if-nez v1, :cond_21f

    .line 6923
    iget-object v1, v6, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->RemoteActionCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView;->generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    .line 6924
    iget-object v2, v9, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->itemView:Landroid/view/View;

    invoke-virtual {v2, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_237

    .line 6925
    :cond_21f
    iget-object v2, v6, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->RemoteActionCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v2, v1}, Landroidx/recyclerview/widget/RecyclerView;->checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z

    move-result v2

    if-nez v2, :cond_235

    .line 6926
    iget-object v2, v6, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->RemoteActionCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v2, v1}, Landroidx/recyclerview/widget/RecyclerView;->generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    .line 6927
    iget-object v2, v9, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->itemView:Landroid/view/View;

    invoke-virtual {v2, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_237

    .line 6929
    :cond_235
    check-cast v1, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    .line 6931
    :goto_237
    iput-object v9, v1, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->AudioAttributesImplBaseParcelizer:Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;

    if-eqz v10, :cond_23e

    if-eqz v0, :cond_23e

    goto :goto_23f

    :cond_23e
    move v7, v8

    .line 6932
    :goto_23f
    iput-boolean v7, v1, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->write:Z

    return-object v9

    .line 6781
    :cond_242
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Invalid item position "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "). Item count:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, v6, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->RemoteActionCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v1, v1, Landroidx/recyclerview/widget/RecyclerView;->onPrepareFromUri:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    .line 6782
    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->read()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    iget-object v1, v6, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->RemoteActionCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    .line 6783
    new-instance v2, Ljava/lang/IndexOutOfBoundsException;

    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView;->write()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v2
.end method

.method final read()V
    .registers 2

    .line 7252
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->write:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->clear()V

    .line 7253
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->read:Ljava/util/ArrayList;

    if-eqz p0, :cond_c

    .line 7254
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->clear()V

    :cond_c
    return-void
.end method

.method final read(IIZ)V
    .registers 8

    .line 7484
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->AudioAttributesCompatParcelizer:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_8
    if-ltz v0, :cond_37

    .line 7486
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->AudioAttributesCompatParcelizer:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;

    if-eqz v1, :cond_34

    .line 7488
    iget v2, v1, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mPosition:I

    add-int v3, p1, p2

    if-lt v2, v3, :cond_28

    .line 7489
    sget-boolean v2, Landroidx/recyclerview/widget/RecyclerView;->AudioAttributesImplBaseParcelizer:Z

    if-eqz v2, :cond_23

    .line 7490
    invoke-static {v1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    iget v2, v1, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mPosition:I

    :cond_23
    neg-int v2, p2

    .line 7494
    invoke-virtual {v1, v2, p3}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->offsetPosition(IZ)V

    goto :goto_34

    .line 7495
    :cond_28
    iget v2, v1, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mPosition:I

    if-lt v2, p1, :cond_34

    const/16 v2, 0x8

    .line 7497
    invoke-virtual {v1, v2}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->addFlags(I)V

    .line 7498
    invoke-direct {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->MediaBrowserCompatCustomActionResultReceiver(I)V

    :cond_34
    :goto_34
    add-int/lit8 v0, v0, -0x1

    goto :goto_8

    :cond_37
    return-void
.end method

.method final read(Landroid/view/View;)V
    .registers 3

    .line 7190
    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->IconCompatParcelizer(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;

    move-result-object p1

    const/4 v0, 0x0

    .line 7191
    iput-object v0, p1, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mScrapContainer:Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;

    const/4 v0, 0x0

    .line 7192
    iput-boolean v0, p1, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mInChangeScrap:Z

    .line 7193
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->clearReturnedFromScrapFlag()V

    .line 7194
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->read(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;)V

    return-void
.end method

.method final read(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;)V
    .registers 8

    .line 7067
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->isScrap()Z

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez v0, :cond_119

    iget-object v0, p1, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->itemView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-nez v0, :cond_119

    .line 7074
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->isTmpDetached()Z

    move-result v0

    if-nez v0, :cond_fc

    .line 7080
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->shouldIgnore()Z

    move-result v0

    if-nez v0, :cond_e2

    .line 7086
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->doesTransientStatePreventRecycling()Z

    move-result v0

    .line 7087
    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->RemoteActionCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v3, v3, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatItemReceiver:Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;

    if-eqz v3, :cond_34

    if-eqz v0, :cond_34

    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->RemoteActionCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v3, v3, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatItemReceiver:Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;

    .line 7089
    invoke-virtual {v3, p1}, Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;->onFailedToRecycleView(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;)Z

    move-result v3

    if-eqz v3, :cond_34

    move v3, v1

    goto :goto_35

    :cond_34
    move v3, v2

    .line 7092
    :goto_35
    sget-boolean v4, Landroidx/recyclerview/widget/RecyclerView;->AudioAttributesImplApi26Parcelizer:Z

    if-eqz v4, :cond_5f

    iget-object v4, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->AudioAttributesCompatParcelizer:Ljava/util/ArrayList;

    invoke-virtual {v4, p1}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_42

    goto :goto_5f

    .line 7093
    :cond_42
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "cached view received recycle internal? "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->RemoteActionCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    .line 7094
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->write()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5f
    :goto_5f
    if-nez v3, :cond_72

    .line 7096
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->isRecyclable()Z

    move-result v3

    if-nez v3, :cond_72

    .line 7138
    sget-boolean v1, Landroidx/recyclerview/widget/RecyclerView;->AudioAttributesImplBaseParcelizer:Z

    if-eqz v1, :cond_70

    .line 7139
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->RemoteActionCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    .line 7141
    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView;->write()Ljava/lang/String;

    :cond_70
    move v3, v2

    goto :goto_c9

    .line 7097
    :cond_72
    iget v3, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->AudioAttributesImplApi21Parcelizer:I

    if-lez v3, :cond_c2

    const/16 v3, 0x20e

    .line 7098
    invoke-virtual {p1, v3}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->hasAnyOfTheFlags(I)Z

    move-result v3

    if-nez v3, :cond_c2

    .line 7103
    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->AudioAttributesCompatParcelizer:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/AbstractCollection;->size()I

    move-result v3

    .line 7104
    iget v4, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->AudioAttributesImplApi21Parcelizer:I

    if-lt v3, v4, :cond_8f

    if-lez v3, :cond_8f

    .line 7105
    invoke-direct {p0, v2}, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->MediaBrowserCompatCustomActionResultReceiver(I)V

    add-int/lit8 v3, v3, -0x1

    .line 7110
    :cond_8f
    sget-boolean v4, Landroidx/recyclerview/widget/RecyclerView;->IconCompatParcelizer:Z

    if-eqz v4, :cond_bb

    if-lez v3, :cond_bb

    iget-object v4, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->RemoteActionCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v4, v4, Landroidx/recyclerview/widget/RecyclerView;->onPlayFromSearch:Lo/SingletonSupport$read;

    iget v5, p1, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mPosition:I

    .line 7112
    invoke-virtual {v4, v5}, Lo/SingletonSupport$read;->write(I)Z

    move-result v4

    if-nez v4, :cond_bb

    :goto_a1
    add-int/lit8 v3, v3, -0x1

    if-ltz v3, :cond_ba

    .line 7116
    iget-object v4, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->AudioAttributesCompatParcelizer:Ljava/util/ArrayList;

    invoke-virtual {v4, v3}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;

    iget v4, v4, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mPosition:I

    .line 7117
    iget-object v5, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->RemoteActionCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v5, v5, Landroidx/recyclerview/widget/RecyclerView;->onPlayFromSearch:Lo/SingletonSupport$read;

    invoke-virtual {v5, v4}, Lo/SingletonSupport$read;->write(I)Z

    move-result v4

    if-eqz v4, :cond_ba

    goto :goto_a1

    :cond_ba
    add-int/2addr v3, v1

    .line 7124
    :cond_bb
    iget-object v4, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->AudioAttributesCompatParcelizer:Ljava/util/ArrayList;

    invoke-virtual {v4, v3, p1}, Ljava/util/AbstractList;->add(ILjava/lang/Object;)V

    move v3, v1

    goto :goto_c3

    :cond_c2
    move v3, v2

    :goto_c3
    if-nez v3, :cond_c9

    .line 7128
    invoke-virtual {p0, p1, v1}, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->IconCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;Z)V

    goto :goto_ca

    :cond_c9
    :goto_c9
    move v1, v2

    .line 7146
    :goto_ca
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->RemoteActionCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView;->onSetRating:Lo/UIntSerializer;

    invoke-virtual {p0, p1}, Lo/UIntSerializer;->MediaBrowserCompatCustomActionResultReceiver(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;)V

    if-nez v3, :cond_e1

    if-nez v1, :cond_e1

    if-eqz v0, :cond_e1

    .line 7148
    iget-object p0, p1, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->itemView:Landroid/view/View;

    invoke-static {p0}, Lo/createPrimordial;->AudioAttributesCompatParcelizer(Landroid/view/View;)V

    const/4 p0, 0x0

    .line 7149
    iput-object p0, p1, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mBindingAdapter:Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;

    .line 7150
    iput-object p0, p1, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mOwnerRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    :cond_e1
    return-void

    .line 7081
    :cond_e2
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle."

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->RemoteActionCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    .line 7083
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->write()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 7075
    :cond_fc
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Tmp detached view should be removed from RecyclerView before it can be recycled: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->RemoteActionCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    .line 7077
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->write()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 7068
    :cond_119
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v3, "Scrapped or attached views may not be recycled. isScrap:"

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 7070
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->isScrap()Z

    move-result v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v3, " isAttached:"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->itemView:Landroid/view/View;

    .line 7071
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    if-eqz p1, :cond_135

    goto :goto_136

    :cond_135
    move v1, v2

    :goto_136
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->RemoteActionCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->write()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method final read(Landroidx/recyclerview/widget/RecyclerView$onPlayFromMediaId;)V
    .registers 2

    .line 7505
    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->AudioAttributesImplApi26Parcelizer:Landroidx/recyclerview/widget/RecyclerView$onPlayFromMediaId;

    return-void
.end method

.method public final write()V
    .registers 2

    .line 6535
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->write:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->clear()V

    .line 6536
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->MediaDescriptionCompat()V

    return-void
.end method

.method public final write(I)V
    .registers 2

    .line 6545
    iput p1, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->AudioAttributesImplBaseParcelizer:I

    .line 6546
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->RatingCompat()V

    return-void
.end method

.method public final write(Landroid/view/View;)V
    .registers 5

    .line 6998
    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->IconCompatParcelizer(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;

    move-result-object v0

    .line 6999
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->isTmpDetached()Z

    move-result v1

    if-eqz v1, :cond_10

    .line 7000
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->RemoteActionCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    const/4 v2, 0x0

    invoke-virtual {v1, p1, v2}, Landroidx/recyclerview/widget/RecyclerView;->removeDetachedView(Landroid/view/View;Z)V

    .line 7002
    :cond_10
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->isScrap()Z

    move-result p1

    if-eqz p1, :cond_1a

    .line 7003
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->unScrap()V

    goto :goto_23

    .line 7004
    :cond_1a
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->wasReturnedFromScrap()Z

    move-result p1

    if-eqz p1, :cond_23

    .line 7005
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->clearReturnedFromScrapFlag()V

    .line 7007
    :cond_23
    :goto_23
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->read(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;)V

    .line 7022
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->RemoteActionCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView;->onCommand:Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer;

    if-eqz p1, :cond_39

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->isRecyclable()Z

    move-result p1

    if-nez p1, :cond_39

    .line 7023
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->RemoteActionCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView;->onCommand:Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer;

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer;->write(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;)V

    :cond_39
    return-void
.end method

.method public final write(Landroid/view/View;I)V
    .registers 9

    .line 6677
    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->IconCompatParcelizer(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;

    move-result-object p1

    if-eqz p1, :cond_9a

    .line 6683
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->RemoteActionCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->MediaMetadataCompat:Lo/RegexDeserializer;

    invoke-virtual {v0, p2}, Lo/RegexDeserializer;->write(I)I

    move-result v2

    if-ltz v2, :cond_65

    .line 6684
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->RemoteActionCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatItemReceiver:Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;->getItemCount()I

    move-result v0

    if-ge v2, v0, :cond_65

    const-wide v4, 0x7fffffffffffffffL

    move-object v0, p0

    move-object v1, p1

    move v3, p2

    .line 6689
    invoke-direct/range {v0 .. v5}, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->IconCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;IIJ)Z

    .line 6691
    iget-object p2, p1, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->itemView:Landroid/view/View;

    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p2

    if-nez p2, :cond_3b

    .line 6694
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->RemoteActionCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p0

    check-cast p0, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    .line 6695
    iget-object p2, p1, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->itemView:Landroid/view/View;

    invoke-virtual {p2, p0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_54

    .line 6696
    :cond_3b
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->RemoteActionCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, p2}, Landroidx/recyclerview/widget/RecyclerView;->checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z

    move-result v0

    if-nez v0, :cond_51

    .line 6697
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->RemoteActionCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/RecyclerView;->generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;

    move-result-object p0

    check-cast p0, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    .line 6698
    iget-object p2, p1, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->itemView:Landroid/view/View;

    invoke-virtual {p2, p0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_54

    .line 6700
    :cond_51
    move-object p0, p2

    check-cast p0, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    :goto_54
    const/4 p2, 0x1

    .line 6703
    iput-boolean p2, p0, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->AudioAttributesCompatParcelizer:Z

    .line 6704
    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->AudioAttributesImplBaseParcelizer:Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;

    .line 6705
    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->itemView:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    if-eqz p1, :cond_62

    const/4 p2, 0x0

    :cond_62
    iput-boolean p2, p0, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->write:Z

    return-void

    .line 6685
    :cond_65
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "Inconsistency detected. Invalid item position "

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, "(offset:"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, ").state:"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p2, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->RemoteActionCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    iget-object p2, p2, Landroidx/recyclerview/widget/RecyclerView;->onPrepareFromUri:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    .line 6687
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->read()I

    move-result p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->RemoteActionCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->write()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 6679
    :cond_9a
    new-instance p1, Ljava/lang/StringBuilder;

    const-string p2, "The view does not have a ViewHolder. You cannot pass arbitrary views to this method, they should be created by the Adapter"

    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->RemoteActionCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    .line 6681
    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->write()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p2, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

###### Class androidx.recyclerview.widget.RecyclerView.MediaMetadataCompat (androidx.recyclerview.widget.RecyclerView$MediaMetadataCompat)
.class public Landroidx/recyclerview/widget/RecyclerView$MediaMetadataCompat;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/recyclerview/widget/RecyclerView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "MediaMetadataCompat"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/recyclerview/widget/RecyclerView$MediaMetadataCompat$write;
    }
.end annotation


# instance fields
.field private RemoteActionCompatParcelizer:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer<",
            "*>;>;"
        }
    .end annotation
.end field

.field private read:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Landroidx/recyclerview/widget/RecyclerView$MediaMetadataCompat$write;",
            ">;"
        }
    .end annotation
.end field

.field private write:I


# direct methods
.method public constructor <init>()V
    .registers 2

    .line 6186
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6210
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaMetadataCompat;->read:Landroid/util/SparseArray;

    const/4 v0, 0x0

    .line 6230
    iput v0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaMetadataCompat;->write:I

    .line 6237
    new-instance v0, Ljava/util/IdentityHashMap;

    invoke-direct {v0}, Ljava/util/IdentityHashMap;-><init>()V

    .line 6238
    invoke-static {v0}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaMetadataCompat;->RemoteActionCompatParcelizer:Ljava/util/Set;

    return-void
.end method

.method private RemoteActionCompatParcelizer(I)Landroidx/recyclerview/widget/RecyclerView$MediaMetadataCompat$write;
    .registers 3

    .line 6431
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaMetadataCompat;->read:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView$MediaMetadataCompat$write;

    if-nez v0, :cond_14

    .line 6433
    new-instance v0, Landroidx/recyclerview/widget/RecyclerView$MediaMetadataCompat$write;

    invoke-direct {v0}, Landroidx/recyclerview/widget/RecyclerView$MediaMetadataCompat$write;-><init>()V

    .line 6434
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaMetadataCompat;->read:Landroid/util/SparseArray;

    invoke-virtual {p0, p1, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    :cond_14
    return-object v0
.end method

.method private static write(JJ)J
    .registers 8

    const-wide/16 v0, 0x0

    cmp-long v0, p0, v0

    if-nez v0, :cond_7

    return-wide p2

    :cond_7
    const-wide/16 v0, 0x4

    .line 6338
    div-long/2addr p0, v0

    const-wide/16 v2, 0x3

    mul-long/2addr p0, v2

    div-long/2addr p2, v0

    add-long/2addr p0, p2

    return-wide p0
.end method


# virtual methods
.method public AudioAttributesCompatParcelizer()V
    .registers 5

    const/4 v0, 0x0

    .line 6244
    :goto_1
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView$MediaMetadataCompat;->read:Landroid/util/SparseArray;

    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    move-result v1

    if-ge v0, v1, :cond_31

    .line 6245
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView$MediaMetadataCompat;->read:Landroid/util/SparseArray;

    invoke-virtual {v1, v0}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/recyclerview/widget/RecyclerView$MediaMetadataCompat$write;

    .line 6246
    iget-object v2, v1, Landroidx/recyclerview/widget/RecyclerView$MediaMetadataCompat$write;->write:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_17
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_29

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;

    .line 6247
    iget-object v3, v3, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->itemView:Landroid/view/View;

    invoke-static {v3}, Lo/createPrimordial;->AudioAttributesCompatParcelizer(Landroid/view/View;)V

    goto :goto_17

    .line 6249
    :cond_29
    iget-object v1, v1, Landroidx/recyclerview/widget/RecyclerView$MediaMetadataCompat$write;->write:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/AbstractCollection;->clear()V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_31
    return-void
.end method

.method public AudioAttributesCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;)V
    .registers 4

    .line 6321
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->getItemViewType()I

    move-result v0

    .line 6322
    invoke-direct {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$MediaMetadataCompat;->RemoteActionCompatParcelizer(I)Landroidx/recyclerview/widget/RecyclerView$MediaMetadataCompat$write;

    move-result-object v1

    iget-object v1, v1, Landroidx/recyclerview/widget/RecyclerView$MediaMetadataCompat$write;->write:Ljava/util/ArrayList;

    .line 6323
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaMetadataCompat;->read:Landroid/util/SparseArray;

    invoke-virtual {p0, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroidx/recyclerview/widget/RecyclerView$MediaMetadataCompat$write;

    iget p0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaMetadataCompat$write;->AudioAttributesCompatParcelizer:I

    invoke-virtual {v1}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    if-gt p0, v0, :cond_20

    .line 6324
    iget-object p0, p1, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->itemView:Landroid/view/View;

    invoke-static {p0}, Lo/createPrimordial;->AudioAttributesCompatParcelizer(Landroid/view/View;)V

    return-void

    .line 6327
    :cond_20
    sget-boolean p0, Landroidx/recyclerview/widget/RecyclerView;->AudioAttributesImplApi26Parcelizer:Z

    if-eqz p0, :cond_33

    invoke-virtual {v1, p1}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_2b

    goto :goto_33

    .line 6328
    :cond_2b
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "this scrap item already exists"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 6330
    :cond_33
    :goto_33
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->resetInternal()V

    .line 6331
    invoke-virtual {v1, p1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public IconCompatParcelizer(I)Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;
    .registers 3

    .line 6285
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaMetadataCompat;->read:Landroid/util/SparseArray;

    invoke-virtual {p0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroidx/recyclerview/widget/RecyclerView$MediaMetadataCompat$write;

    if-eqz p0, :cond_32

    .line 6286
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView$MediaMetadataCompat$write;->write:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_32

    .line 6287
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaMetadataCompat$write;->write:Ljava/util/ArrayList;

    .line 6288
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->size()I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    :goto_1a
    if-ltz p1, :cond_32

    .line 6289
    invoke-virtual {p0, p1}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->isAttachedToTransitionOverlay()Z

    move-result v0

    if-nez v0, :cond_2f

    .line 6290
    invoke-virtual {p0, p1}, Ljava/util/AbstractList;->remove(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;

    return-object p0

    :cond_2f
    add-int/lit8 p1, p1, -0x1

    goto :goto_1a

    :cond_32
    const/4 p0, 0x0

    return-object p0
.end method

.method final IconCompatParcelizer(IJ)V
    .registers 6

    .line 6342
    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$MediaMetadataCompat;->RemoteActionCompatParcelizer(I)Landroidx/recyclerview/widget/RecyclerView$MediaMetadataCompat$write;

    move-result-object p0

    .line 6343
    iget-wide v0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaMetadataCompat$write;->IconCompatParcelizer:J

    invoke-static {v0, v1, p2, p3}, Landroidx/recyclerview/widget/RecyclerView$MediaMetadataCompat;->write(JJ)J

    move-result-wide p1

    iput-wide p1, p0, Landroidx/recyclerview/widget/RecyclerView$MediaMetadataCompat$write;->IconCompatParcelizer:J

    return-void
.end method

.method final IconCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;)V
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer<",
            "*>;)V"
        }
    .end annotation

    .line 6379
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaMetadataCompat;->RemoteActionCompatParcelizer:Ljava/util/Set;

    invoke-interface {p0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method final IconCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;Z)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer<",
            "*>;",
            "Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer<",
            "*>;Z)V"
        }
    .end annotation

    if-eqz p1, :cond_5

    .line 6420
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaMetadataCompat;->RemoteActionCompatParcelizer()V

    :cond_5
    if-nez p3, :cond_e

    .line 6422
    iget p1, p0, Landroidx/recyclerview/widget/RecyclerView$MediaMetadataCompat;->write:I

    if-nez p1, :cond_e

    .line 6423
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaMetadataCompat;->AudioAttributesCompatParcelizer()V

    :cond_e
    if-eqz p2, :cond_13

    .line 6426
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaMetadataCompat;->write()V

    :cond_13
    return-void
.end method

.method final IconCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;Z)V
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer<",
            "*>;Z)V"
        }
    .end annotation

    .line 6393
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaMetadataCompat;->RemoteActionCompatParcelizer:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 6394
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView$MediaMetadataCompat;->RemoteActionCompatParcelizer:Ljava/util/Set;

    invoke-interface {p1}, Ljava/util/Set;->size()I

    move-result p1

    if-nez p1, :cond_3f

    if-nez p2, :cond_3f

    const/4 p1, 0x0

    move p2, p1

    .line 6395
    :goto_11
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaMetadataCompat;->read:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result v0

    if-ge p2, v0, :cond_3f

    .line 6396
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaMetadataCompat;->read:Landroid/util/SparseArray;

    invoke-virtual {v0, p2}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView$MediaMetadataCompat$write;

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView$MediaMetadataCompat$write;->write:Ljava/util/ArrayList;

    move v1, p1

    .line 6397
    :goto_28
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v2

    if-ge v1, v2, :cond_3c

    .line 6399
    invoke-virtual {v0, v1}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;

    iget-object v2, v2, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->itemView:Landroid/view/View;

    .line 6398
    invoke-static {v2}, Lo/createPrimordial;->AudioAttributesCompatParcelizer(Landroid/view/View;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_28

    :cond_3c
    add-int/lit8 p2, p2, 0x1

    goto :goto_11

    :cond_3f
    return-void
.end method

.method final RemoteActionCompatParcelizer()V
    .registers 2

    .line 6368
    iget v0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaMetadataCompat;->write:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaMetadataCompat;->write:I

    return-void
.end method

.method final read(IJJ)Z
    .registers 8

    .line 6359
    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$MediaMetadataCompat;->RemoteActionCompatParcelizer(I)Landroidx/recyclerview/widget/RecyclerView$MediaMetadataCompat$write;

    move-result-object p0

    iget-wide p0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaMetadataCompat$write;->read:J

    const-wide/16 v0, 0x0

    cmp-long v0, p0, v0

    if-eqz v0, :cond_13

    add-long/2addr p2, p0

    cmp-long p0, p2, p4

    if-ltz p0, :cond_13

    const/4 p0, 0x0

    return p0

    :cond_13
    const/4 p0, 0x1

    return p0
.end method

.method final write()V
    .registers 2

    .line 6364
    iget v0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaMetadataCompat;->write:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaMetadataCompat;->write:I

    return-void
.end method

.method final write(IJ)V
    .registers 6

    .line 6348
    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$MediaMetadataCompat;->RemoteActionCompatParcelizer(I)Landroidx/recyclerview/widget/RecyclerView$MediaMetadataCompat$write;

    move-result-object p0

    .line 6349
    iget-wide v0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaMetadataCompat$write;->read:J

    invoke-static {v0, v1, p2, p3}, Landroidx/recyclerview/widget/RecyclerView$MediaMetadataCompat;->write(JJ)J

    move-result-wide p1

    iput-wide p1, p0, Landroidx/recyclerview/widget/RecyclerView$MediaMetadataCompat$write;->read:J

    return-void
.end method

.method final write(IJJ)Z
    .registers 8

    .line 6354
    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$MediaMetadataCompat;->RemoteActionCompatParcelizer(I)Landroidx/recyclerview/widget/RecyclerView$MediaMetadataCompat$write;

    move-result-object p0

    iget-wide p0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaMetadataCompat$write;->IconCompatParcelizer:J

    const-wide/16 v0, 0x0

    cmp-long v0, p0, v0

    if-eqz v0, :cond_13

    add-long/2addr p2, p0

    cmp-long p0, p2, p4

    if-ltz p0, :cond_13

    const/4 p0, 0x0

    return p0

    :cond_13
    const/4 p0, 0x1

    return p0
.end method

###### Class androidx.recyclerview.widget.RecyclerView.MediaMetadataCompat.write (androidx.recyclerview.widget.RecyclerView$MediaMetadataCompat$write)
.class final Landroidx/recyclerview/widget/RecyclerView$MediaMetadataCompat$write;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/recyclerview/widget/RecyclerView$MediaMetadataCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "write"
.end annotation


# instance fields
.field AudioAttributesCompatParcelizer:I

.field IconCompatParcelizer:J

.field read:J

.field final write:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>()V
    .registers 3

    .line 6203
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6204
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaMetadataCompat$write;->write:Ljava/util/ArrayList;

    const/4 v0, 0x5

    .line 6205
    iput v0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaMetadataCompat$write;->AudioAttributesCompatParcelizer:I

    const-wide/16 v0, 0x0

    .line 6206
    iput-wide v0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaMetadataCompat$write;->IconCompatParcelizer:J

    .line 6207
    iput-wide v0, p0, Landroidx/recyclerview/widget/RecyclerView$MediaMetadataCompat$write;->read:J

    return-void
.end method

###### Class androidx.recyclerview.widget.RecyclerView.RatingCompat (androidx.recyclerview.widget.RecyclerView$RatingCompat)
.class public abstract Landroidx/recyclerview/widget/RecyclerView$RatingCompat;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/recyclerview/widget/RecyclerView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "RatingCompat"
.end annotation


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 13620
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract read(II)Z
.end method

###### Class androidx.recyclerview.widget.RecyclerView.RemoteActionCompatParcelizer (androidx.recyclerview.widget.RecyclerView$RemoteActionCompatParcelizer)
.class public Landroidx/recyclerview/widget/RecyclerView$RemoteActionCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/recyclerview/widget/RecyclerView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "RemoteActionCompatParcelizer"
.end annotation


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 6130
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method protected RemoteActionCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView;)Landroid/widget/EdgeEffect;
    .registers 2

    .line 6163
    new-instance p0, Landroid/widget/EdgeEffect;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-direct {p0, p1}, Landroid/widget/EdgeEffect;-><init>(Landroid/content/Context;)V

    return-object p0
.end method

###### Class androidx.recyclerview.widget.RecyclerView.SavedState (androidx.recyclerview.widget.RecyclerView$SavedState)
.class public Landroidx/recyclerview/widget/RecyclerView$SavedState;
.super Landroidx/customview/view/AbsSavedState;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/recyclerview/widget/RecyclerView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "SavedState"
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Landroidx/recyclerview/widget/RecyclerView$SavedState;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field read:Landroid/os/Parcelable;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 13287
    new-instance v0, Landroidx/recyclerview/widget/RecyclerView$SavedState$3;

    invoke-direct {v0}, Landroidx/recyclerview/widget/RecyclerView$SavedState$3;-><init>()V

    sput-object v0, Landroidx/recyclerview/widget/RecyclerView$SavedState;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V
    .registers 3

    .line 13265
    invoke-direct {p0, p1, p2}, Landroidx/customview/view/AbsSavedState;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    if-nez p2, :cond_b

    .line 13267
    const-class p2, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    invoke-virtual {p2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object p2

    .line 13266
    :cond_b
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object p1

    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView$SavedState;->read:Landroid/os/Parcelable;

    return-void
.end method

.method constructor <init>(Landroid/os/Parcelable;)V
    .registers 2

    .line 13274
    invoke-direct {p0, p1}, Landroidx/customview/view/AbsSavedState;-><init>(Landroid/os/Parcelable;)V

    return-void
.end method


# virtual methods
.method final write(Landroidx/recyclerview/widget/RecyclerView$SavedState;)V
    .registers 2

    .line 13284
    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView$SavedState;->read:Landroid/os/Parcelable;

    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView$SavedState;->read:Landroid/os/Parcelable;

    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .registers 3

    .line 13279
    invoke-super {p0, p1, p2}, Landroidx/customview/view/AbsSavedState;->writeToParcel(Landroid/os/Parcel;I)V

    .line 13280
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$SavedState;->read:Landroid/os/Parcelable;

    const/4 p2, 0x0

    invoke-virtual {p1, p0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    return-void
.end method

###### Class androidx.recyclerview.widget.RecyclerView.SavedState.AnonymousClass3 (androidx.recyclerview.widget.RecyclerView$SavedState$3)
.class final Landroidx/recyclerview/widget/RecyclerView$SavedState$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$ClassLoaderCreator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/recyclerview/widget/RecyclerView$SavedState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$ClassLoaderCreator<",
        "Landroidx/recyclerview/widget/RecyclerView$SavedState;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .registers 1

    .line 13287
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static AudioAttributesCompatParcelizer(Landroid/os/Parcel;)Landroidx/recyclerview/widget/RecyclerView$SavedState;
    .registers 3

    .line 13295
    new-instance v0, Landroidx/recyclerview/widget/RecyclerView$SavedState;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Landroidx/recyclerview/widget/RecyclerView$SavedState;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0
.end method

.method private static AudioAttributesCompatParcelizer(I)[Landroidx/recyclerview/widget/RecyclerView$SavedState;
    .registers 1

    .line 13300
    new-array p0, p0, [Landroidx/recyclerview/widget/RecyclerView$SavedState;

    return-object p0
.end method

.method private static RemoteActionCompatParcelizer(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Landroidx/recyclerview/widget/RecyclerView$SavedState;
    .registers 3

    .line 13290
    new-instance v0, Landroidx/recyclerview/widget/RecyclerView$SavedState;

    invoke-direct {v0, p0, p1}, Landroidx/recyclerview/widget/RecyclerView$SavedState;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0
.end method


# virtual methods
.method public final synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .registers 2

    .line 13287
    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView$SavedState$3;->AudioAttributesCompatParcelizer(Landroid/os/Parcel;)Landroidx/recyclerview/widget/RecyclerView$SavedState;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic createFromParcel(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Ljava/lang/Object;
    .registers 3

    .line 13287
    invoke-static {p1, p2}, Landroidx/recyclerview/widget/RecyclerView$SavedState$3;->RemoteActionCompatParcelizer(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Landroidx/recyclerview/widget/RecyclerView$SavedState;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .registers 2

    .line 13287
    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView$SavedState$3;->AudioAttributesCompatParcelizer(I)[Landroidx/recyclerview/widget/RecyclerView$SavedState;

    move-result-object p0

    return-object p0
.end method

###### Class androidx.recyclerview.widget.RecyclerView.handleMediaPlayPauseIfPendingOnHandler (androidx.recyclerview.widget.RecyclerView$handleMediaPlayPauseIfPendingOnHandler)
.class final Landroidx/recyclerview/widget/RecyclerView$handleMediaPlayPauseIfPendingOnHandler;
.super Landroidx/recyclerview/widget/RecyclerView$RemoteActionCompatParcelizer;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/recyclerview/widget/RecyclerView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "handleMediaPlayPauseIfPendingOnHandler"
.end annotation


# direct methods
.method constructor <init>()V
    .registers 1

    .line 6170
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$RemoteActionCompatParcelizer;-><init>()V

    return-void
.end method


# virtual methods
.method protected final RemoteActionCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView;)Landroid/widget/EdgeEffect;
    .registers 2

    .line 6174
    new-instance p0, Landroid/widget/EdgeEffect;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-direct {p0, p1}, Landroid/widget/EdgeEffect;-><init>(Landroid/content/Context;)V

    return-object p0
.end method

###### Class androidx.recyclerview.widget.RecyclerView.onAddQueueItem (androidx.recyclerview.widget.RecyclerView$onAddQueueItem)
.class public interface abstract Landroidx/recyclerview/widget/RecyclerView$onAddQueueItem;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/recyclerview/widget/RecyclerView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "onAddQueueItem"
.end annotation

###### Class androidx.recyclerview.widget.RecyclerView.onCommand (androidx.recyclerview.widget.RecyclerView$onCommand)
.class final Landroidx/recyclerview/widget/RecyclerView$onCommand;
.super Landroidx/recyclerview/widget/RecyclerView$read;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/recyclerview/widget/RecyclerView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "onCommand"
.end annotation


# instance fields
.field final synthetic read:Landroidx/recyclerview/widget/RecyclerView;


# direct methods
.method constructor <init>(Landroidx/recyclerview/widget/RecyclerView;)V
    .registers 2

    .line 6055
    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView$onCommand;->read:Landroidx/recyclerview/widget/RecyclerView;

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$read;-><init>()V

    return-void
.end method

.method private write()V
    .registers 3

    .line 6102
    sget-boolean v0, Landroidx/recyclerview/widget/RecyclerView;->AudioAttributesCompatParcelizer:Z

    if-eqz v0, :cond_18

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$onCommand;->read:Landroidx/recyclerview/widget/RecyclerView;

    iget-boolean v0, v0, Landroidx/recyclerview/widget/RecyclerView;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Z

    if-eqz v0, :cond_18

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$onCommand;->read:Landroidx/recyclerview/widget/RecyclerView;

    iget-boolean v0, v0, Landroidx/recyclerview/widget/RecyclerView;->handleMediaPlayPauseIfPendingOnHandler:Z

    if-eqz v0, :cond_18

    .line 6103
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$onCommand;->read:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->onSetShuffleMode:Ljava/lang/Runnable;

    invoke-static {p0, v0}, Lo/InvalidTypeIdException;->AudioAttributesCompatParcelizer(Landroid/view/View;Ljava/lang/Runnable;)V

    return-void

    .line 6105
    :cond_18
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$onCommand;->read:Landroidx/recyclerview/widget/RecyclerView;

    const/4 v1, 0x1

    iput-boolean v1, v0, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatMediaItem:Z

    .line 6106
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$onCommand;->read:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer(II)V
    .registers 5

    .line 6079
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$onCommand;->read:Landroidx/recyclerview/widget/RecyclerView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->write(Ljava/lang/String;)V

    .line 6080
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$onCommand;->read:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->MediaMetadataCompat:Lo/RegexDeserializer;

    invoke-virtual {v0, p1, p2}, Lo/RegexDeserializer;->IconCompatParcelizer(II)Z

    move-result p1

    if-eqz p1, :cond_13

    .line 6081
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$onCommand;->write()V

    :cond_13
    return-void
.end method

.method public final AudioAttributesCompatParcelizer(IILjava/lang/Object;)V
    .registers 6

    .line 6071
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$onCommand;->read:Landroidx/recyclerview/widget/RecyclerView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->write(Ljava/lang/String;)V

    .line 6072
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$onCommand;->read:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->MediaMetadataCompat:Lo/RegexDeserializer;

    invoke-virtual {v0, p1, p2, p3}, Lo/RegexDeserializer;->IconCompatParcelizer(IILjava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_13

    .line 6073
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$onCommand;->write()V

    :cond_13
    return-void
.end method

.method public final IconCompatParcelizer()V
    .registers 2

    .line 6112
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$onCommand;->read:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->onPrepareFromMediaId:Landroidx/recyclerview/widget/RecyclerView$SavedState;

    if-eqz v0, :cond_17

    .line 6118
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$onCommand;->read:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatItemReceiver:Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;

    if-eqz v0, :cond_17

    .line 6119
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;->canRestoreState()Z

    move-result v0

    if-eqz v0, :cond_17

    .line 6120
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$onCommand;->read:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    :cond_17
    return-void
.end method

.method public final RemoteActionCompatParcelizer(II)V
    .registers 5

    .line 6095
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$onCommand;->read:Landroidx/recyclerview/widget/RecyclerView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->write(Ljava/lang/String;)V

    .line 6096
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$onCommand;->read:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->MediaMetadataCompat:Lo/RegexDeserializer;

    const/4 v1, 0x1

    invoke-virtual {v0, p1, p2, v1}, Lo/RegexDeserializer;->read(III)Z

    move-result p1

    if-eqz p1, :cond_14

    .line 6097
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$onCommand;->write()V

    :cond_14
    return-void
.end method

.method public final read()V
    .registers 3

    .line 6060
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$onCommand;->read:Landroidx/recyclerview/widget/RecyclerView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->write(Ljava/lang/String;)V

    .line 6061
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$onCommand;->read:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->onPrepareFromUri:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    const/4 v1, 0x1

    iput-boolean v1, v0, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->RatingCompat:Z

    .line 6063
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$onCommand;->read:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->IconCompatParcelizer(Z)V

    .line 6064
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$onCommand;->read:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->MediaMetadataCompat:Lo/RegexDeserializer;

    invoke-virtual {v0}, Lo/RegexDeserializer;->read()Z

    move-result v0

    if-nez v0, :cond_21

    .line 6065
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$onCommand;->read:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    :cond_21
    return-void
.end method

.method public final read(II)V
    .registers 5

    .line 6087
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$onCommand;->read:Landroidx/recyclerview/widget/RecyclerView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->write(Ljava/lang/String;)V

    .line 6088
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$onCommand;->read:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->MediaMetadataCompat:Lo/RegexDeserializer;

    invoke-virtual {v0, p1, p2}, Lo/RegexDeserializer;->write(II)Z

    move-result p1

    if-eqz p1, :cond_13

    .line 6089
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$onCommand;->write()V

    :cond_13
    return-void
.end method

###### Class androidx.recyclerview.widget.RecyclerView.onCustomAction (androidx.recyclerview.widget.RecyclerView$onCustomAction)
.class public abstract Landroidx/recyclerview/widget/RecyclerView$onCustomAction;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/recyclerview/widget/RecyclerView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "onCustomAction"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/recyclerview/widget/RecyclerView$onCustomAction$write;,
        Landroidx/recyclerview/widget/RecyclerView$onCustomAction$RemoteActionCompatParcelizer;
    }
.end annotation


# instance fields
.field private AudioAttributesCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

.field private AudioAttributesImplBaseParcelizer:I

.field private IconCompatParcelizer:Z

.field private MediaBrowserCompatCustomActionResultReceiver:Z

.field private MediaBrowserCompatItemReceiver:Landroid/view/View;

.field private RemoteActionCompatParcelizer:Z

.field private final read:Landroidx/recyclerview/widget/RecyclerView$onCustomAction$write;

.field private write:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;


# direct methods
.method public constructor <init>()V
    .registers 2

    .line 12718
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 12702
    iput v0, p0, Landroidx/recyclerview/widget/RecyclerView$onCustomAction;->AudioAttributesImplBaseParcelizer:I

    .line 12719
    new-instance v0, Landroidx/recyclerview/widget/RecyclerView$onCustomAction$write;

    invoke-direct {v0}, Landroidx/recyclerview/widget/RecyclerView$onCustomAction$write;-><init>()V

    iput-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$onCustomAction;->read:Landroidx/recyclerview/widget/RecyclerView$onCustomAction$write;

    return-void
.end method

.method private AudioAttributesCompatParcelizer(Landroid/view/View;)I
    .registers 2

    .line 12899
    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->AudioAttributesImplBaseParcelizer(Landroid/view/View;)I

    move-result p0

    return p0
.end method

.method protected static IconCompatParcelizer(Landroid/graphics/PointF;)V
    .registers 4

    .line 12940
    iget v0, p0, Landroid/graphics/PointF;->x:F

    iget v1, p0, Landroid/graphics/PointF;->x:F

    mul-float/2addr v0, v1

    iget v1, p0, Landroid/graphics/PointF;->y:F

    iget v2, p0, Landroid/graphics/PointF;->y:F

    mul-float/2addr v1, v2

    add-float/2addr v0, v1

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    double-to-float v0, v0

    .line 12942
    iget v1, p0, Landroid/graphics/PointF;->x:F

    div-float/2addr v1, v0

    iput v1, p0, Landroid/graphics/PointF;->x:F

    .line 12943
    iget v1, p0, Landroid/graphics/PointF;->y:F

    div-float/2addr v1, v0

    iput v1, p0, Landroid/graphics/PointF;->y:F

    return-void
.end method

.method private write(I)Landroid/view/View;
    .registers 2

    .line 12913
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$onCustomAction;->AudioAttributesCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPlayFromMediaId:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->write(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method protected abstract AudioAttributesCompatParcelizer()V
.end method

.method final AudioAttributesCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;)V
    .registers 4

    .line 12737
    iget-object v0, p1, Landroidx/recyclerview/widget/RecyclerView;->onSetCaptioningEnabled:Landroidx/recyclerview/widget/RecyclerView$onFastForward;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$onFastForward;->read()V

    .line 12739
    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView$onCustomAction;->MediaBrowserCompatCustomActionResultReceiver:Z

    if-eqz v0, :cond_17

    .line 12740
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 12741
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 12746
    :cond_17
    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView$onCustomAction;->AudioAttributesCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    .line 12747
    iput-object p2, p0, Landroidx/recyclerview/widget/RecyclerView$onCustomAction;->write:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    .line 12748
    iget p2, p0, Landroidx/recyclerview/widget/RecyclerView$onCustomAction;->AudioAttributesImplBaseParcelizer:I

    const/4 v0, -0x1

    if-eq p2, v0, :cond_3f

    .line 12751
    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView;->onPrepareFromUri:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    iget p2, p0, Landroidx/recyclerview/widget/RecyclerView$onCustomAction;->AudioAttributesImplBaseParcelizer:I

    iput p2, p1, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->MediaDescriptionCompat:I

    const/4 p1, 0x1

    .line 12752
    iput-boolean p1, p0, Landroidx/recyclerview/widget/RecyclerView$onCustomAction;->IconCompatParcelizer:Z

    .line 12753
    iput-boolean p1, p0, Landroidx/recyclerview/widget/RecyclerView$onCustomAction;->RemoteActionCompatParcelizer:Z

    .line 12754
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$onCustomAction;->write()I

    move-result p2

    invoke-direct {p0, p2}, Landroidx/recyclerview/widget/RecyclerView$onCustomAction;->write(I)Landroid/view/View;

    move-result-object p2

    iput-object p2, p0, Landroidx/recyclerview/widget/RecyclerView$onCustomAction;->MediaBrowserCompatItemReceiver:Landroid/view/View;

    .line 12756
    iget-object p2, p0, Landroidx/recyclerview/widget/RecyclerView$onCustomAction;->AudioAttributesCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    iget-object p2, p2, Landroidx/recyclerview/widget/RecyclerView;->onSetCaptioningEnabled:Landroidx/recyclerview/widget/RecyclerView$onFastForward;

    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView$onFastForward;->AudioAttributesCompatParcelizer()V

    .line 12758
    iput-boolean p1, p0, Landroidx/recyclerview/widget/RecyclerView$onCustomAction;->MediaBrowserCompatCustomActionResultReceiver:Z

    return-void

    .line 12749
    :cond_3f
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Invalid target position"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method protected abstract IconCompatParcelizer(IILandroidx/recyclerview/widget/RecyclerView$onCustomAction$write;)V
.end method

.method protected abstract IconCompatParcelizer(Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView$onCustomAction$write;)V
.end method

.method public final IconCompatParcelizer()Z
    .registers 1

    .line 12826
    iget-boolean p0, p0, Landroidx/recyclerview/widget/RecyclerView$onCustomAction;->RemoteActionCompatParcelizer:Z

    return p0
.end method

.method public final MediaBrowserCompatCustomActionResultReceiver()Z
    .registers 1

    .line 12834
    iget-boolean p0, p0, Landroidx/recyclerview/widget/RecyclerView$onCustomAction;->IconCompatParcelizer:Z

    return p0
.end method

.method protected final MediaBrowserCompatItemReceiver()V
    .registers 4

    .line 12802
    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView$onCustomAction;->IconCompatParcelizer:Z

    if-nez v0, :cond_5

    return-void

    :cond_5
    const/4 v0, 0x0

    .line 12805
    iput-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView$onCustomAction;->IconCompatParcelizer:Z

    .line 12806
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$onCustomAction;->AudioAttributesCompatParcelizer()V

    .line 12807
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView$onCustomAction;->AudioAttributesCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v1, v1, Landroidx/recyclerview/widget/RecyclerView;->onPrepareFromUri:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    const/4 v2, -0x1

    iput v2, v1, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->MediaDescriptionCompat:I

    const/4 v1, 0x0

    .line 12808
    iput-object v1, p0, Landroidx/recyclerview/widget/RecyclerView$onCustomAction;->MediaBrowserCompatItemReceiver:Landroid/view/View;

    .line 12809
    iput v2, p0, Landroidx/recyclerview/widget/RecyclerView$onCustomAction;->AudioAttributesImplBaseParcelizer:I

    .line 12810
    iput-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView$onCustomAction;->RemoteActionCompatParcelizer:Z

    .line 12812
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$onCustomAction;->write:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    invoke-virtual {v0, p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->read(Landroidx/recyclerview/widget/RecyclerView$onCustomAction;)V

    .line 12814
    iput-object v1, p0, Landroidx/recyclerview/widget/RecyclerView$onCustomAction;->write:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    .line 12815
    iput-object v1, p0, Landroidx/recyclerview/widget/RecyclerView$onCustomAction;->AudioAttributesCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    return-void
.end method

.method public final RemoteActionCompatParcelizer()I
    .registers 1

    .line 12906
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$onCustomAction;->AudioAttributesCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView;->onPlayFromMediaId:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onPlay()I

    move-result p0

    return p0
.end method

.method public final RemoteActionCompatParcelizer(I)V
    .registers 2

    .line 12762
    iput p1, p0, Landroidx/recyclerview/widget/RecyclerView$onCustomAction;->AudioAttributesImplBaseParcelizer:I

    return-void
.end method

.method final RemoteActionCompatParcelizer(II)V
    .registers 8

    .line 12848
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$onCustomAction;->AudioAttributesCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    .line 12849
    iget v1, p0, Landroidx/recyclerview/widget/RecyclerView$onCustomAction;->AudioAttributesImplBaseParcelizer:I

    const/4 v2, -0x1

    if-eq v1, v2, :cond_9

    if-nez v0, :cond_c

    .line 12850
    :cond_9
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$onCustomAction;->MediaBrowserCompatItemReceiver()V

    .line 12858
    :cond_c
    iget-boolean v1, p0, Landroidx/recyclerview/widget/RecyclerView$onCustomAction;->RemoteActionCompatParcelizer:Z

    const/4 v2, 0x0

    if-eqz v1, :cond_3f

    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView$onCustomAction;->MediaBrowserCompatItemReceiver:Landroid/view/View;

    if-nez v1, :cond_3f

    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView$onCustomAction;->write:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    if-eqz v1, :cond_3f

    .line 12859
    iget v1, p0, Landroidx/recyclerview/widget/RecyclerView$onCustomAction;->AudioAttributesImplBaseParcelizer:I

    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView$onCustomAction;->read(I)Landroid/graphics/PointF;

    move-result-object v1

    if-eqz v1, :cond_3f

    .line 12860
    iget v3, v1, Landroid/graphics/PointF;->x:F

    const/4 v4, 0x0

    cmpl-float v3, v3, v4

    if-nez v3, :cond_2e

    iget v3, v1, Landroid/graphics/PointF;->y:F

    cmpl-float v3, v3, v4

    if-eqz v3, :cond_3f

    .line 12861
    :cond_2e
    iget v3, v1, Landroid/graphics/PointF;->x:F

    .line 12862
    invoke-static {v3}, Ljava/lang/Math;->signum(F)F

    move-result v3

    float-to-int v3, v3

    iget v1, v1, Landroid/graphics/PointF;->y:F

    .line 12863
    invoke-static {v1}, Ljava/lang/Math;->signum(F)F

    move-result v1

    float-to-int v1, v1

    .line 12861
    invoke-virtual {v0, v3, v1, v2}, Landroidx/recyclerview/widget/RecyclerView;->AudioAttributesCompatParcelizer(II[I)V

    :cond_3f
    const/4 v1, 0x0

    .line 12868
    iput-boolean v1, p0, Landroidx/recyclerview/widget/RecyclerView$onCustomAction;->RemoteActionCompatParcelizer:Z

    .line 12870
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView$onCustomAction;->MediaBrowserCompatItemReceiver:Landroid/view/View;

    if-eqz v1, :cond_62

    .line 12872
    invoke-direct {p0, v1}, Landroidx/recyclerview/widget/RecyclerView$onCustomAction;->AudioAttributesCompatParcelizer(Landroid/view/View;)I

    move-result v1

    iget v3, p0, Landroidx/recyclerview/widget/RecyclerView$onCustomAction;->AudioAttributesImplBaseParcelizer:I

    if-ne v1, v3, :cond_60

    .line 12873
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView$onCustomAction;->MediaBrowserCompatItemReceiver:Landroid/view/View;

    iget-object v2, v0, Landroidx/recyclerview/widget/RecyclerView;->onPrepareFromUri:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView$onCustomAction;->read:Landroidx/recyclerview/widget/RecyclerView$onCustomAction$write;

    invoke-virtual {p0, v1, v2}, Landroidx/recyclerview/widget/RecyclerView$onCustomAction;->IconCompatParcelizer(Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView$onCustomAction$write;)V

    .line 12874
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView$onCustomAction;->read:Landroidx/recyclerview/widget/RecyclerView$onCustomAction$write;

    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/RecyclerView$onCustomAction$write;->write(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 12875
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$onCustomAction;->MediaBrowserCompatItemReceiver()V

    goto :goto_62

    .line 12878
    :cond_60
    iput-object v2, p0, Landroidx/recyclerview/widget/RecyclerView$onCustomAction;->MediaBrowserCompatItemReceiver:Landroid/view/View;

    .line 12881
    :cond_62
    :goto_62
    iget-boolean v1, p0, Landroidx/recyclerview/widget/RecyclerView$onCustomAction;->IconCompatParcelizer:Z

    if-eqz v1, :cond_86

    .line 12882
    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->onPrepareFromUri:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView$onCustomAction;->read:Landroidx/recyclerview/widget/RecyclerView$onCustomAction$write;

    invoke-virtual {p0, p1, p2, v1}, Landroidx/recyclerview/widget/RecyclerView$onCustomAction;->IconCompatParcelizer(IILandroidx/recyclerview/widget/RecyclerView$onCustomAction$write;)V

    .line 12883
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView$onCustomAction;->read:Landroidx/recyclerview/widget/RecyclerView$onCustomAction$write;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$onCustomAction$write;->write()Z

    move-result p1

    .line 12884
    iget-object p2, p0, Landroidx/recyclerview/widget/RecyclerView$onCustomAction;->read:Landroidx/recyclerview/widget/RecyclerView$onCustomAction$write;

    invoke-virtual {p2, v0}, Landroidx/recyclerview/widget/RecyclerView$onCustomAction$write;->write(Landroidx/recyclerview/widget/RecyclerView;)V

    if-eqz p1, :cond_86

    .line 12887
    iget-boolean p1, p0, Landroidx/recyclerview/widget/RecyclerView$onCustomAction;->IconCompatParcelizer:Z

    if-eqz p1, :cond_86

    const/4 p1, 0x1

    .line 12888
    iput-boolean p1, p0, Landroidx/recyclerview/widget/RecyclerView$onCustomAction;->RemoteActionCompatParcelizer:Z

    .line 12889
    iget-object p0, v0, Landroidx/recyclerview/widget/RecyclerView;->onSetCaptioningEnabled:Landroidx/recyclerview/widget/RecyclerView$onFastForward;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$onFastForward;->AudioAttributesCompatParcelizer()V

    :cond_86
    return-void
.end method

.method public read(I)Landroid/graphics/PointF;
    .registers 3

    .line 12776
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$onCustomAction;->read()Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    move-result-object p0

    .line 12777
    instance-of v0, p0, Landroidx/recyclerview/widget/RecyclerView$onCustomAction$RemoteActionCompatParcelizer;

    if-eqz v0, :cond_f

    .line 12778
    check-cast p0, Landroidx/recyclerview/widget/RecyclerView$onCustomAction$RemoteActionCompatParcelizer;

    .line 12779
    invoke-interface {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$onCustomAction$RemoteActionCompatParcelizer;->RemoteActionCompatParcelizer(I)Landroid/graphics/PointF;

    move-result-object p0

    return-object p0

    .line 12782
    :cond_f
    const-class p0, Landroidx/recyclerview/widget/RecyclerView$onCustomAction$RemoteActionCompatParcelizer;

    const/4 p0, 0x0

    return-object p0
.end method

.method public final read()Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;
    .registers 1

    .line 12792
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$onCustomAction;->write:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    return-object p0
.end method

.method public final write()I
    .registers 1

    .line 12844
    iget p0, p0, Landroidx/recyclerview/widget/RecyclerView$onCustomAction;->AudioAttributesImplBaseParcelizer:I

    return p0
.end method

.method protected final write(Landroid/view/View;)V
    .registers 4

    .line 12926
    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$onCustomAction;->AudioAttributesCompatParcelizer(Landroid/view/View;)I

    move-result v0

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$onCustomAction;->write()I

    move-result v1

    if-ne v0, v1, :cond_e

    .line 12927
    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView$onCustomAction;->MediaBrowserCompatItemReceiver:Landroid/view/View;

    .line 12928
    sget-boolean p0, Landroidx/recyclerview/widget/RecyclerView;->AudioAttributesImplBaseParcelizer:Z

    :cond_e
    return-void
.end method

###### Class androidx.recyclerview.widget.RecyclerView.onCustomAction.RemoteActionCompatParcelizer (androidx.recyclerview.widget.RecyclerView$onCustomAction$RemoteActionCompatParcelizer)
.class public interface abstract Landroidx/recyclerview/widget/RecyclerView$onCustomAction$RemoteActionCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/recyclerview/widget/RecyclerView$onCustomAction;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "RemoteActionCompatParcelizer"
.end annotation


# virtual methods
.method public abstract RemoteActionCompatParcelizer(I)Landroid/graphics/PointF;
.end method

###### Class androidx.recyclerview.widget.RecyclerView.onCustomAction.write (androidx.recyclerview.widget.RecyclerView$onCustomAction$write)
.class public final Landroidx/recyclerview/widget/RecyclerView$onCustomAction$write;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/recyclerview/widget/RecyclerView$onCustomAction;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "write"
.end annotation


# instance fields
.field private AudioAttributesCompatParcelizer:I

.field private AudioAttributesImplApi26Parcelizer:Landroid/view/animation/Interpolator;

.field private IconCompatParcelizer:I

.field private MediaBrowserCompatItemReceiver:I

.field private RemoteActionCompatParcelizer:Z

.field private read:I

.field private write:I


# direct methods
.method public constructor <init>()V
    .registers 2

    const/4 v0, 0x0

    .line 13014
    invoke-direct {p0, v0, v0}, Landroidx/recyclerview/widget/RecyclerView$onCustomAction$write;-><init>(II)V

    return-void
.end method

.method private constructor <init>(II)V
    .registers 3

    .line 13034
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, -0x1

    .line 12999
    iput p1, p0, Landroidx/recyclerview/widget/RecyclerView$onCustomAction$write;->MediaBrowserCompatItemReceiver:I

    const/4 p1, 0x0

    .line 13003
    iput-boolean p1, p0, Landroidx/recyclerview/widget/RecyclerView$onCustomAction$write;->RemoteActionCompatParcelizer:Z

    .line 13007
    iput p1, p0, Landroidx/recyclerview/widget/RecyclerView$onCustomAction$write;->AudioAttributesCompatParcelizer:I

    .line 13035
    iput p1, p0, Landroidx/recyclerview/widget/RecyclerView$onCustomAction$write;->IconCompatParcelizer:I

    .line 13036
    iput p1, p0, Landroidx/recyclerview/widget/RecyclerView$onCustomAction$write;->read:I

    const/high16 p1, -0x80000000

    .line 13037
    iput p1, p0, Landroidx/recyclerview/widget/RecyclerView$onCustomAction$write;->write:I

    const/4 p1, 0x0

    .line 13038
    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView$onCustomAction$write;->AudioAttributesImplApi26Parcelizer:Landroid/view/animation/Interpolator;

    return-void
.end method

.method private RemoteActionCompatParcelizer()V
    .registers 2

    .line 13089
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$onCustomAction$write;->AudioAttributesImplApi26Parcelizer:Landroid/view/animation/Interpolator;

    if-eqz v0, :cond_11

    iget v0, p0, Landroidx/recyclerview/widget/RecyclerView$onCustomAction$write;->write:I

    if-lez v0, :cond_9

    goto :goto_11

    .line 13090
    :cond_9
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "If you provide an interpolator, you must set a positive duration"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 13092
    :cond_11
    :goto_11
    iget p0, p0, Landroidx/recyclerview/widget/RecyclerView$onCustomAction$write;->write:I

    if-lez p0, :cond_16

    return-void

    .line 13093
    :cond_16
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "Scroll duration must be a positive number"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final IconCompatParcelizer(IIILandroid/view/animation/Interpolator;)V
    .registers 5

    .line 13154
    iput p1, p0, Landroidx/recyclerview/widget/RecyclerView$onCustomAction$write;->IconCompatParcelizer:I

    .line 13155
    iput p2, p0, Landroidx/recyclerview/widget/RecyclerView$onCustomAction$write;->read:I

    .line 13156
    iput p3, p0, Landroidx/recyclerview/widget/RecyclerView$onCustomAction$write;->write:I

    .line 13157
    iput-object p4, p0, Landroidx/recyclerview/widget/RecyclerView$onCustomAction$write;->AudioAttributesImplApi26Parcelizer:Landroid/view/animation/Interpolator;

    const/4 p1, 0x1

    .line 13158
    iput-boolean p1, p0, Landroidx/recyclerview/widget/RecyclerView$onCustomAction$write;->RemoteActionCompatParcelizer:Z

    return-void
.end method

.method public final read(I)V
    .registers 2

    .line 13057
    iput p1, p0, Landroidx/recyclerview/widget/RecyclerView$onCustomAction$write;->MediaBrowserCompatItemReceiver:I

    return-void
.end method

.method final write(Landroidx/recyclerview/widget/RecyclerView;)V
    .registers 7

    .line 13065
    iget v0, p0, Landroidx/recyclerview/widget/RecyclerView$onCustomAction$write;->MediaBrowserCompatItemReceiver:I

    const/4 v1, 0x0

    if-ltz v0, :cond_e

    const/4 v2, -0x1

    .line 13067
    iput v2, p0, Landroidx/recyclerview/widget/RecyclerView$onCustomAction$write;->MediaBrowserCompatItemReceiver:I

    .line 13068
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->write(I)V

    .line 13069
    iput-boolean v1, p0, Landroidx/recyclerview/widget/RecyclerView$onCustomAction$write;->RemoteActionCompatParcelizer:Z

    return-void

    .line 13072
    :cond_e
    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView$onCustomAction$write;->RemoteActionCompatParcelizer:Z

    if-eqz v0, :cond_2b

    .line 13073
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$onCustomAction$write;->RemoteActionCompatParcelizer()V

    .line 13074
    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView;->onSetCaptioningEnabled:Landroidx/recyclerview/widget/RecyclerView$onFastForward;

    iget v0, p0, Landroidx/recyclerview/widget/RecyclerView$onCustomAction$write;->IconCompatParcelizer:I

    iget v2, p0, Landroidx/recyclerview/widget/RecyclerView$onCustomAction$write;->read:I

    iget v3, p0, Landroidx/recyclerview/widget/RecyclerView$onCustomAction$write;->write:I

    iget-object v4, p0, Landroidx/recyclerview/widget/RecyclerView$onCustomAction$write;->AudioAttributesImplApi26Parcelizer:Landroid/view/animation/Interpolator;

    invoke-virtual {p1, v0, v2, v3, v4}, Landroidx/recyclerview/widget/RecyclerView$onFastForward;->RemoteActionCompatParcelizer(IIILandroid/view/animation/Interpolator;)V

    .line 13075
    iget p1, p0, Landroidx/recyclerview/widget/RecyclerView$onCustomAction$write;->AudioAttributesCompatParcelizer:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Landroidx/recyclerview/widget/RecyclerView$onCustomAction$write;->AudioAttributesCompatParcelizer:I

    .line 13082
    iput-boolean v1, p0, Landroidx/recyclerview/widget/RecyclerView$onCustomAction$write;->RemoteActionCompatParcelizer:Z

    return-void

    .line 13084
    :cond_2b
    iput v1, p0, Landroidx/recyclerview/widget/RecyclerView$onCustomAction$write;->AudioAttributesCompatParcelizer:I

    return-void
.end method

.method final write()Z
    .registers 1

    .line 13061
    iget p0, p0, Landroidx/recyclerview/widget/RecyclerView$onCustomAction$write;->MediaBrowserCompatItemReceiver:I

    if-ltz p0, :cond_6

    const/4 p0, 0x1

    return p0

    :cond_6
    const/4 p0, 0x0

    return p0
.end method

###### Class androidx.recyclerview.widget.RecyclerView.onFastForward (androidx.recyclerview.widget.RecyclerView$onFastForward)
.class final Landroidx/recyclerview/widget/RecyclerView$onFastForward;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/recyclerview/widget/RecyclerView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "onFastForward"
.end annotation


# instance fields
.field AudioAttributesCompatParcelizer:Landroid/widget/OverScroller;

.field private AudioAttributesImplBaseParcelizer:I

.field final synthetic IconCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

.field private MediaBrowserCompatItemReceiver:Z

.field private RemoteActionCompatParcelizer:Landroid/view/animation/Interpolator;

.field private read:I

.field private write:Z


# direct methods
.method constructor <init>(Landroidx/recyclerview/widget/RecyclerView;)V
    .registers 4

    .line 5775
    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView$onFastForward;->IconCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5767
    sget-object v0, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatCustomActionResultReceiver:Landroid/view/animation/Interpolator;

    iput-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$onFastForward;->RemoteActionCompatParcelizer:Landroid/view/animation/Interpolator;

    const/4 v0, 0x0

    .line 5770
    iput-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView$onFastForward;->write:Z

    .line 5773
    iput-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView$onFastForward;->MediaBrowserCompatItemReceiver:Z

    .line 5776
    new-instance v0, Landroid/widget/OverScroller;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    sget-object v1, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatCustomActionResultReceiver:Landroid/view/animation/Interpolator;

    invoke-direct {v0, p1, v1}, Landroid/widget/OverScroller;-><init>(Landroid/content/Context;Landroid/view/animation/Interpolator;)V

    iput-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$onFastForward;->AudioAttributesCompatParcelizer:Landroid/widget/OverScroller;

    return-void
.end method

.method private AudioAttributesCompatParcelizer(II)I
    .registers 4

    .line 6017
    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    move-result p1

    .line 6018
    invoke-static {p2}, Ljava/lang/Math;->abs(I)I

    move-result p2

    if-le p1, p2, :cond_c

    const/4 v0, 0x1

    goto :goto_d

    :cond_c
    const/4 v0, 0x0

    .line 6020
    :goto_d
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$onFastForward;->IconCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v0, :cond_16

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result p0

    goto :goto_1a

    :cond_16
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result p0

    :goto_1a
    if-eqz v0, :cond_1d

    goto :goto_1e

    :cond_1d
    move p1, p2

    :goto_1e
    int-to-float p1, p1

    int-to-float p0, p0

    div-float/2addr p1, p0

    const/high16 p0, 0x3f800000    # 1.0f

    add-float/2addr p1, p0

    const/high16 p0, 0x43960000    # 300.0f

    mul-float/2addr p1, p0

    float-to-int p0, p1

    const/16 p1, 0x7d0

    .line 6025
    invoke-static {p0, p1}, Ljava/lang/Math;->min(II)I

    move-result p0

    return p0
.end method

.method private RemoteActionCompatParcelizer()V
    .registers 2

    .line 5944
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$onFastForward;->IconCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, p0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 5945
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$onFastForward;->IconCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    invoke-static {v0, p0}, Lo/InvalidTypeIdException;->AudioAttributesCompatParcelizer(Landroid/view/View;Ljava/lang/Runnable;)V

    return-void
.end method


# virtual methods
.method final AudioAttributesCompatParcelizer()V
    .registers 2

    .line 5936
    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView$onFastForward;->write:Z

    if-eqz v0, :cond_8

    const/4 v0, 0x1

    .line 5937
    iput-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView$onFastForward;->MediaBrowserCompatItemReceiver:Z

    return-void

    .line 5939
    :cond_8
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$onFastForward;->RemoteActionCompatParcelizer()V

    return-void
.end method

.method public final RemoteActionCompatParcelizer(II)V
    .registers 15

    .line 5949
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$onFastForward;->IconCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatItemReceiver(I)V

    const/4 v0, 0x0

    .line 5950
    iput v0, p0, Landroidx/recyclerview/widget/RecyclerView$onFastForward;->AudioAttributesImplBaseParcelizer:I

    iput v0, p0, Landroidx/recyclerview/widget/RecyclerView$onFastForward;->read:I

    .line 5954
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$onFastForward;->RemoteActionCompatParcelizer:Landroid/view/animation/Interpolator;

    sget-object v1, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatCustomActionResultReceiver:Landroid/view/animation/Interpolator;

    if-eq v0, v1, :cond_24

    .line 5955
    sget-object v0, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatCustomActionResultReceiver:Landroid/view/animation/Interpolator;

    iput-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$onFastForward;->RemoteActionCompatParcelizer:Landroid/view/animation/Interpolator;

    .line 5956
    new-instance v0, Landroid/widget/OverScroller;

    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView$onFastForward;->IconCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget-object v2, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatCustomActionResultReceiver:Landroid/view/animation/Interpolator;

    invoke-direct {v0, v1, v2}, Landroid/widget/OverScroller;-><init>(Landroid/content/Context;Landroid/view/animation/Interpolator;)V

    iput-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$onFastForward;->AudioAttributesCompatParcelizer:Landroid/widget/OverScroller;

    .line 5958
    :cond_24
    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView$onFastForward;->AudioAttributesCompatParcelizer:Landroid/widget/OverScroller;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/high16 v8, -0x80000000

    const v9, 0x7fffffff

    const/high16 v10, -0x80000000

    const v11, 0x7fffffff

    move v6, p1

    move v7, p2

    invoke-virtual/range {v3 .. v11}, Landroid/widget/OverScroller;->fling(IIIIIIII)V

    .line 5960
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$onFastForward;->AudioAttributesCompatParcelizer()V

    return-void
.end method

.method public final RemoteActionCompatParcelizer(IIILandroid/view/animation/Interpolator;)V
    .registers 11

    const/high16 v0, -0x80000000

    if-ne p3, v0, :cond_8

    .line 5980
    invoke-direct {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$onFastForward;->AudioAttributesCompatParcelizer(II)I

    move-result p3

    :cond_8
    move v5, p3

    if-nez p4, :cond_d

    .line 5983
    sget-object p4, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatCustomActionResultReceiver:Landroid/view/animation/Interpolator;

    .line 5988
    :cond_d
    iget-object p3, p0, Landroidx/recyclerview/widget/RecyclerView$onFastForward;->RemoteActionCompatParcelizer:Landroid/view/animation/Interpolator;

    if-eq p3, p4, :cond_20

    .line 5989
    iput-object p4, p0, Landroidx/recyclerview/widget/RecyclerView$onFastForward;->RemoteActionCompatParcelizer:Landroid/view/animation/Interpolator;

    .line 5990
    new-instance p3, Landroid/widget/OverScroller;

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$onFastForward;->IconCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p3, v0, p4}, Landroid/widget/OverScroller;-><init>(Landroid/content/Context;Landroid/view/animation/Interpolator;)V

    iput-object p3, p0, Landroidx/recyclerview/widget/RecyclerView$onFastForward;->AudioAttributesCompatParcelizer:Landroid/widget/OverScroller;

    :cond_20
    const/4 p3, 0x0

    .line 5994
    iput p3, p0, Landroidx/recyclerview/widget/RecyclerView$onFastForward;->AudioAttributesImplBaseParcelizer:I

    iput p3, p0, Landroidx/recyclerview/widget/RecyclerView$onFastForward;->read:I

    .line 5997
    iget-object p3, p0, Landroidx/recyclerview/widget/RecyclerView$onFastForward;->IconCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    const/4 p4, 0x2

    invoke-virtual {p3, p4}, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatItemReceiver(I)V

    .line 5998
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$onFastForward;->AudioAttributesCompatParcelizer:Landroid/widget/OverScroller;

    const/4 v1, 0x0

    const/4 v2, 0x0

    move v3, p1

    move v4, p2

    invoke-virtual/range {v0 .. v5}, Landroid/widget/OverScroller;->startScroll(IIIII)V

    .line 6007
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$onFastForward;->AudioAttributesCompatParcelizer()V

    return-void
.end method

.method public final read()V
    .registers 2

    .line 6029
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$onFastForward;->IconCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, p0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 6030
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$onFastForward;->AudioAttributesCompatParcelizer:Landroid/widget/OverScroller;

    invoke-virtual {p0}, Landroid/widget/OverScroller;->abortAnimation()V

    return-void
.end method

.method public final run()V
    .registers 20

    move-object/from16 v0, p0

    .line 5781
    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView$onFastForward;->IconCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v1, v1, Landroidx/recyclerview/widget/RecyclerView;->onPlayFromMediaId:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    if-nez v1, :cond_c

    .line 5782
    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/RecyclerView$onFastForward;->read()V

    return-void

    :cond_c
    const/4 v1, 0x0

    .line 5786
    iput-boolean v1, v0, Landroidx/recyclerview/widget/RecyclerView$onFastForward;->MediaBrowserCompatItemReceiver:Z

    const/4 v2, 0x1

    .line 5787
    iput-boolean v2, v0, Landroidx/recyclerview/widget/RecyclerView$onFastForward;->write:Z

    .line 5789
    iget-object v3, v0, Landroidx/recyclerview/widget/RecyclerView$onFastForward;->IconCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v3}, Landroidx/recyclerview/widget/RecyclerView;->read()V

    .line 5801
    iget-object v3, v0, Landroidx/recyclerview/widget/RecyclerView$onFastForward;->AudioAttributesCompatParcelizer:Landroid/widget/OverScroller;

    .line 5802
    invoke-virtual {v3}, Landroid/widget/OverScroller;->computeScrollOffset()Z

    move-result v4

    if-eqz v4, :cond_197

    .line 5803
    invoke-virtual {v3}, Landroid/widget/OverScroller;->getCurrX()I

    move-result v4

    .line 5804
    invoke-virtual {v3}, Landroid/widget/OverScroller;->getCurrY()I

    move-result v5

    .line 5805
    iget v6, v0, Landroidx/recyclerview/widget/RecyclerView$onFastForward;->read:I

    .line 5806
    iget v7, v0, Landroidx/recyclerview/widget/RecyclerView$onFastForward;->AudioAttributesImplBaseParcelizer:I

    .line 5807
    iput v4, v0, Landroidx/recyclerview/widget/RecyclerView$onFastForward;->read:I

    .line 5808
    iput v5, v0, Landroidx/recyclerview/widget/RecyclerView$onFastForward;->AudioAttributesImplBaseParcelizer:I

    .line 5810
    iget-object v8, v0, Landroidx/recyclerview/widget/RecyclerView$onFastForward;->IconCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    sub-int/2addr v4, v6

    invoke-virtual {v8, v4}, Landroidx/recyclerview/widget/RecyclerView;->RemoteActionCompatParcelizer(I)I

    move-result v4

    .line 5811
    iget-object v6, v0, Landroidx/recyclerview/widget/RecyclerView$onFastForward;->IconCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    sub-int/2addr v5, v7

    invoke-virtual {v6, v5}, Landroidx/recyclerview/widget/RecyclerView;->read(I)I

    move-result v5

    .line 5817
    iget-object v6, v0, Landroidx/recyclerview/widget/RecyclerView$onFastForward;->IconCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v6, v6, Landroidx/recyclerview/widget/RecyclerView;->onRemoveQueueItem:[I

    aput v1, v6, v1

    .line 5818
    iget-object v6, v0, Landroidx/recyclerview/widget/RecyclerView$onFastForward;->IconCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v6, v6, Landroidx/recyclerview/widget/RecyclerView;->onRemoveQueueItem:[I

    aput v1, v6, v2

    .line 5819
    iget-object v9, v0, Landroidx/recyclerview/widget/RecyclerView$onFastForward;->IconCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v12, v9, Landroidx/recyclerview/widget/RecyclerView;->onRemoveQueueItem:[I

    const/4 v13, 0x0

    const/4 v14, 0x1

    move v10, v4

    move v11, v5

    invoke-virtual/range {v9 .. v14}, Landroidx/recyclerview/widget/RecyclerView;->write(II[I[II)Z

    move-result v6

    if-eqz v6, :cond_65

    .line 5821
    iget-object v6, v0, Landroidx/recyclerview/widget/RecyclerView$onFastForward;->IconCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v6, v6, Landroidx/recyclerview/widget/RecyclerView;->onRemoveQueueItem:[I

    aget v6, v6, v1

    sub-int/2addr v4, v6

    .line 5822
    iget-object v6, v0, Landroidx/recyclerview/widget/RecyclerView$onFastForward;->IconCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v6, v6, Landroidx/recyclerview/widget/RecyclerView;->onRemoveQueueItem:[I

    aget v6, v6, v2

    sub-int/2addr v5, v6

    .line 5827
    :cond_65
    iget-object v6, v0, Landroidx/recyclerview/widget/RecyclerView$onFastForward;->IconCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v6}, Landroidx/recyclerview/widget/RecyclerView;->getOverScrollMode()I

    move-result v6

    const/4 v7, 0x2

    if-eq v6, v7, :cond_73

    .line 5828
    iget-object v6, v0, Landroidx/recyclerview/widget/RecyclerView$onFastForward;->IconCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v6, v4, v5}, Landroidx/recyclerview/widget/RecyclerView;->RemoteActionCompatParcelizer(II)V

    .line 5832
    :cond_73
    iget-object v6, v0, Landroidx/recyclerview/widget/RecyclerView$onFastForward;->IconCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v6, v6, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatItemReceiver:Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;

    if-eqz v6, :cond_ca

    .line 5833
    iget-object v6, v0, Landroidx/recyclerview/widget/RecyclerView$onFastForward;->IconCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v6, v6, Landroidx/recyclerview/widget/RecyclerView;->onRemoveQueueItem:[I

    aput v1, v6, v1

    .line 5834
    iget-object v6, v0, Landroidx/recyclerview/widget/RecyclerView$onFastForward;->IconCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v6, v6, Landroidx/recyclerview/widget/RecyclerView;->onRemoveQueueItem:[I

    aput v1, v6, v2

    .line 5835
    iget-object v6, v0, Landroidx/recyclerview/widget/RecyclerView$onFastForward;->IconCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v8, v6, Landroidx/recyclerview/widget/RecyclerView;->onRemoveQueueItem:[I

    invoke-virtual {v6, v4, v5, v8}, Landroidx/recyclerview/widget/RecyclerView;->AudioAttributesCompatParcelizer(II[I)V

    .line 5836
    iget-object v6, v0, Landroidx/recyclerview/widget/RecyclerView$onFastForward;->IconCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v6, v6, Landroidx/recyclerview/widget/RecyclerView;->onRemoveQueueItem:[I

    aget v6, v6, v1

    .line 5837
    iget-object v8, v0, Landroidx/recyclerview/widget/RecyclerView$onFastForward;->IconCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v8, v8, Landroidx/recyclerview/widget/RecyclerView;->onRemoveQueueItem:[I

    aget v8, v8, v2

    sub-int/2addr v4, v6

    sub-int/2addr v5, v8

    .line 5843
    iget-object v9, v0, Landroidx/recyclerview/widget/RecyclerView$onFastForward;->IconCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v9, v9, Landroidx/recyclerview/widget/RecyclerView;->onPlayFromMediaId:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    iget-object v9, v9, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaDescriptionCompat:Landroidx/recyclerview/widget/RecyclerView$onCustomAction;

    if-eqz v9, :cond_cc

    .line 5844
    invoke-virtual {v9}, Landroidx/recyclerview/widget/RecyclerView$onCustomAction;->IconCompatParcelizer()Z

    move-result v10

    if-nez v10, :cond_cc

    .line 5845
    invoke-virtual {v9}, Landroidx/recyclerview/widget/RecyclerView$onCustomAction;->MediaBrowserCompatCustomActionResultReceiver()Z

    move-result v10

    if-eqz v10, :cond_cc

    .line 5846
    iget-object v10, v0, Landroidx/recyclerview/widget/RecyclerView$onFastForward;->IconCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v10, v10, Landroidx/recyclerview/widget/RecyclerView;->onPrepareFromUri:Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    invoke-virtual {v10}, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->read()I

    move-result v10

    if-nez v10, :cond_bc

    .line 5848
    invoke-virtual {v9}, Landroidx/recyclerview/widget/RecyclerView$onCustomAction;->MediaBrowserCompatItemReceiver()V

    goto :goto_cc

    .line 5849
    :cond_bc
    invoke-virtual {v9}, Landroidx/recyclerview/widget/RecyclerView$onCustomAction;->write()I

    move-result v11

    if-lt v11, v10, :cond_c6

    sub-int/2addr v10, v2

    .line 5850
    invoke-virtual {v9, v10}, Landroidx/recyclerview/widget/RecyclerView$onCustomAction;->RemoteActionCompatParcelizer(I)V

    .line 5853
    :cond_c6
    invoke-virtual {v9, v6, v8}, Landroidx/recyclerview/widget/RecyclerView$onCustomAction;->RemoteActionCompatParcelizer(II)V

    goto :goto_cc

    :cond_ca
    move v6, v1

    move v8, v6

    .line 5858
    :cond_cc
    :goto_cc
    iget-object v9, v0, Landroidx/recyclerview/widget/RecyclerView$onFastForward;->IconCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v9, v9, Landroidx/recyclerview/widget/RecyclerView;->onPause:Ljava/util/ArrayList;

    invoke-virtual {v9}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v9

    if-nez v9, :cond_db

    .line 5859
    iget-object v9, v0, Landroidx/recyclerview/widget/RecyclerView$onFastForward;->IconCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v9}, Landroid/view/View;->invalidate()V

    .line 5863
    :cond_db
    iget-object v9, v0, Landroidx/recyclerview/widget/RecyclerView$onFastForward;->IconCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v9, v9, Landroidx/recyclerview/widget/RecyclerView;->onRemoveQueueItem:[I

    aput v1, v9, v1

    .line 5864
    iget-object v9, v0, Landroidx/recyclerview/widget/RecyclerView$onFastForward;->IconCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v9, v9, Landroidx/recyclerview/widget/RecyclerView;->onRemoveQueueItem:[I

    aput v1, v9, v2

    .line 5865
    iget-object v11, v0, Landroidx/recyclerview/widget/RecyclerView$onFastForward;->IconCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    const/16 v16, 0x0

    const/16 v17, 0x1

    iget-object v9, v11, Landroidx/recyclerview/widget/RecyclerView;->onRemoveQueueItem:[I

    move v12, v6

    move v13, v8

    move v14, v4

    move v15, v5

    move-object/from16 v18, v9

    invoke-virtual/range {v11 .. v18}, Landroidx/recyclerview/widget/RecyclerView;->write(IIII[II[I)V

    .line 5867
    iget-object v9, v0, Landroidx/recyclerview/widget/RecyclerView$onFastForward;->IconCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v9, v9, Landroidx/recyclerview/widget/RecyclerView;->onRemoveQueueItem:[I

    aget v9, v9, v1

    sub-int/2addr v4, v9

    .line 5868
    iget-object v9, v0, Landroidx/recyclerview/widget/RecyclerView$onFastForward;->IconCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v9, v9, Landroidx/recyclerview/widget/RecyclerView;->onRemoveQueueItem:[I

    aget v9, v9, v2

    sub-int/2addr v5, v9

    if-nez v6, :cond_10a

    if-eqz v8, :cond_10f

    .line 5871
    :cond_10a
    iget-object v9, v0, Landroidx/recyclerview/widget/RecyclerView$onFastForward;->IconCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v9, v6, v8}, Landroidx/recyclerview/widget/RecyclerView;->write(II)V

    .line 5874
    :cond_10f
    iget-object v9, v0, Landroidx/recyclerview/widget/RecyclerView$onFastForward;->IconCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    invoke-static {v9}, Landroidx/recyclerview/widget/RecyclerView;->IconCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView;)Z

    move-result v9

    if-nez v9, :cond_11c

    .line 5875
    iget-object v9, v0, Landroidx/recyclerview/widget/RecyclerView$onFastForward;->IconCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v9}, Landroid/view/View;->invalidate()V

    .line 5883
    :cond_11c
    invoke-virtual {v3}, Landroid/widget/OverScroller;->getCurrX()I

    move-result v9

    invoke-virtual {v3}, Landroid/widget/OverScroller;->getFinalX()I

    move-result v10

    if-ne v9, v10, :cond_128

    move v9, v2

    goto :goto_129

    :cond_128
    move v9, v1

    .line 5884
    :goto_129
    invoke-virtual {v3}, Landroid/widget/OverScroller;->getCurrY()I

    move-result v10

    invoke-virtual {v3}, Landroid/widget/OverScroller;->getFinalY()I

    move-result v11

    if-ne v10, v11, :cond_135

    move v10, v2

    goto :goto_136

    :cond_135
    move v10, v1

    .line 5885
    :goto_136
    invoke-virtual {v3}, Landroid/widget/OverScroller;->isFinished()Z

    move-result v11

    if-nez v11, :cond_146

    if-nez v9, :cond_140

    if-eqz v4, :cond_144

    :cond_140
    if-nez v10, :cond_146

    if-nez v5, :cond_146

    :cond_144
    move v9, v1

    goto :goto_147

    :cond_146
    move v9, v2

    .line 5892
    :goto_147
    iget-object v10, v0, Landroidx/recyclerview/widget/RecyclerView$onFastForward;->IconCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v10, v10, Landroidx/recyclerview/widget/RecyclerView;->onPlayFromMediaId:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    iget-object v10, v10, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaDescriptionCompat:Landroidx/recyclerview/widget/RecyclerView$onCustomAction;

    if-eqz v10, :cond_155

    .line 5894
    invoke-virtual {v10}, Landroidx/recyclerview/widget/RecyclerView$onCustomAction;->IconCompatParcelizer()Z

    move-result v10

    if-nez v10, :cond_185

    :cond_155
    if-eqz v9, :cond_185

    .line 5900
    iget-object v6, v0, Landroidx/recyclerview/widget/RecyclerView$onFastForward;->IconCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v6}, Landroidx/recyclerview/widget/RecyclerView;->getOverScrollMode()I

    move-result v6

    if-eq v6, v7, :cond_179

    .line 5901
    invoke-virtual {v3}, Landroid/widget/OverScroller;->getCurrVelocity()F

    move-result v3

    float-to-int v3, v3

    if-gez v4, :cond_168

    neg-int v4, v3

    goto :goto_16d

    :cond_168
    if-lez v4, :cond_16c

    move v4, v3

    goto :goto_16d

    :cond_16c
    move v4, v1

    :goto_16d
    if-gez v5, :cond_171

    neg-int v3, v3

    goto :goto_174

    :cond_171
    if-gtz v5, :cond_174

    move v3, v1

    .line 5904
    :cond_174
    :goto_174
    iget-object v5, v0, Landroidx/recyclerview/widget/RecyclerView$onFastForward;->IconCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v5, v4, v3}, Landroidx/recyclerview/widget/RecyclerView;->AudioAttributesCompatParcelizer(II)V

    .line 5907
    :cond_179
    sget-boolean v3, Landroidx/recyclerview/widget/RecyclerView;->IconCompatParcelizer:Z

    if-eqz v3, :cond_197

    .line 5908
    iget-object v3, v0, Landroidx/recyclerview/widget/RecyclerView$onFastForward;->IconCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v3, v3, Landroidx/recyclerview/widget/RecyclerView;->onPlayFromSearch:Lo/SingletonSupport$read;

    invoke-virtual {v3}, Lo/SingletonSupport$read;->RemoteActionCompatParcelizer()V

    goto :goto_197

    .line 5913
    :cond_185
    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/RecyclerView$onFastForward;->AudioAttributesCompatParcelizer()V

    .line 5914
    iget-object v3, v0, Landroidx/recyclerview/widget/RecyclerView$onFastForward;->IconCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v3, v3, Landroidx/recyclerview/widget/RecyclerView;->onAddQueueItem:Lo/SingletonSupport;

    if-eqz v3, :cond_197

    .line 5915
    iget-object v3, v0, Landroidx/recyclerview/widget/RecyclerView$onFastForward;->IconCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v3, v3, Landroidx/recyclerview/widget/RecyclerView;->onAddQueueItem:Lo/SingletonSupport;

    iget-object v4, v0, Landroidx/recyclerview/widget/RecyclerView$onFastForward;->IconCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v3, v4, v6, v8}, Lo/SingletonSupport;->AudioAttributesCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView;II)V

    .line 5920
    :cond_197
    :goto_197
    iget-object v3, v0, Landroidx/recyclerview/widget/RecyclerView$onFastForward;->IconCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v3, v3, Landroidx/recyclerview/widget/RecyclerView;->onPlayFromMediaId:Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;

    iget-object v3, v3, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaDescriptionCompat:Landroidx/recyclerview/widget/RecyclerView$onCustomAction;

    if-eqz v3, :cond_1a8

    .line 5922
    invoke-virtual {v3}, Landroidx/recyclerview/widget/RecyclerView$onCustomAction;->IconCompatParcelizer()Z

    move-result v4

    if-eqz v4, :cond_1a8

    .line 5923
    invoke-virtual {v3, v1, v1}, Landroidx/recyclerview/widget/RecyclerView$onCustomAction;->RemoteActionCompatParcelizer(II)V

    .line 5926
    :cond_1a8
    iput-boolean v1, v0, Landroidx/recyclerview/widget/RecyclerView$onFastForward;->write:Z

    .line 5927
    iget-boolean v3, v0, Landroidx/recyclerview/widget/RecyclerView$onFastForward;->MediaBrowserCompatItemReceiver:Z

    if-eqz v3, :cond_1b2

    .line 5928
    invoke-direct/range {p0 .. p0}, Landroidx/recyclerview/widget/RecyclerView$onFastForward;->RemoteActionCompatParcelizer()V

    return-void

    .line 5930
    :cond_1b2
    iget-object v3, v0, Landroidx/recyclerview/widget/RecyclerView$onFastForward;->IconCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v3, v1}, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatItemReceiver(I)V

    .line 5931
    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView$onFastForward;->IconCompatParcelizer:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/RecyclerView;->MediaBrowserCompatCustomActionResultReceiver(I)V

    return-void
.end method

###### Class androidx.recyclerview.widget.RecyclerView.onMediaButtonEvent (androidx.recyclerview.widget.RecyclerView$onMediaButtonEvent)
.class public abstract Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/recyclerview/widget/RecyclerView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "onMediaButtonEvent"
.end annotation


# static fields
.field static final FLAG_ADAPTER_FULLUPDATE:I = 0x400

.field static final FLAG_ADAPTER_POSITION_UNKNOWN:I = 0x200

.field static final FLAG_APPEARED_IN_PRE_LAYOUT:I = 0x1000

.field static final FLAG_BOUNCED_FROM_HIDDEN_LIST:I = 0x2000

.field static final FLAG_BOUND:I = 0x1

.field static final FLAG_IGNORE:I = 0x80

.field static final FLAG_INVALID:I = 0x4

.field static final FLAG_MOVED:I = 0x800

.field static final FLAG_NOT_RECYCLABLE:I = 0x10

.field static final FLAG_REMOVED:I = 0x8

.field static final FLAG_RETURNED_FROM_SCRAP:I = 0x20

.field static final FLAG_TMP_DETACHED:I = 0x100

.field static final FLAG_UPDATE:I = 0x2

.field private static final FULLUPDATE_PAYLOADS:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field static final PENDING_ACCESSIBILITY_STATE_NOT_SET:I = -0x1


# instance fields
.field public final itemView:Landroid/view/View;

.field mBindingAdapter:Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer<",
            "+",
            "Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;",
            ">;"
        }
    .end annotation
.end field

.field mFlags:I

.field mInChangeScrap:Z

.field private mIsRecyclableCount:I

.field mItemId:J

.field mItemViewType:I

.field public mNestedRecyclerView:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroidx/recyclerview/widget/RecyclerView;",
            ">;"
        }
    .end annotation
.end field

.field mOldPosition:I

.field mOwnerRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

.field mPayloads:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field mPendingAccessibilityState:I

.field public mPosition:I

.field mPreLayoutPosition:I

.field mScrapContainer:Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;

.field mShadowedHolder:Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;

.field mShadowingHolder:Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;

.field mUnmodifiedPayloads:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private mWasImportantForAccessibilityBeforeHidden:I


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 11868
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    sput-object v0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->FULLUPDATE_PAYLOADS:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Landroid/view/View;)V
    .registers 5

    .line 11898
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 11762
    iput v0, p0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mPosition:I

    .line 11763
    iput v0, p0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mOldPosition:I

    const-wide/16 v1, -0x1

    .line 11764
    iput-wide v1, p0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mItemId:J

    .line 11765
    iput v0, p0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mItemViewType:I

    .line 11766
    iput v0, p0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mPreLayoutPosition:I

    const/4 v1, 0x0

    .line 11769
    iput-object v1, p0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mShadowedHolder:Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;

    .line 11771
    iput-object v1, p0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mShadowingHolder:Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;

    .line 11870
    iput-object v1, p0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mPayloads:Ljava/util/List;

    .line 11871
    iput-object v1, p0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mUnmodifiedPayloads:Ljava/util/List;

    const/4 v2, 0x0

    .line 11873
    iput v2, p0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mIsRecyclableCount:I

    .line 11877
    iput-object v1, p0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mScrapContainer:Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;

    .line 11879
    iput-boolean v2, p0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mInChangeScrap:Z

    .line 11883
    iput v2, p0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mWasImportantForAccessibilityBeforeHidden:I

    .line 11886
    iput v0, p0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mPendingAccessibilityState:I

    if-eqz p1, :cond_29

    .line 11902
    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->itemView:Landroid/view/View;

    return-void

    .line 11900
    :cond_29
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "itemView may not be null"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private createPayloadsIfNeeded()V
    .registers 2

    .line 12210
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mPayloads:Ljava/util/List;

    if-nez v0, :cond_11

    .line 12211
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mPayloads:Ljava/util/List;

    .line 12212
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mUnmodifiedPayloads:Ljava/util/List;

    :cond_11
    return-void
.end method


# virtual methods
.method addChangePayload(Ljava/lang/Object;)V
    .registers 4

    const/16 v0, 0x400

    if-nez p1, :cond_8

    .line 12202
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->addFlags(I)V

    return-void

    .line 12203
    :cond_8
    iget v1, p0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mFlags:I

    and-int/2addr v0, v1

    if-nez v0, :cond_15

    .line 12204
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->createPayloadsIfNeeded()V

    .line 12205
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mPayloads:Ljava/util/List;

    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_15
    return-void
.end method

.method addFlags(I)V
    .registers 3

    .line 12197
    iget v0, p0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mFlags:I

    or-int/2addr p1, v0

    iput p1, p0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mFlags:I

    return-void
.end method

.method clearOldPosition()V
    .registers 2

    const/4 v0, -0x1

    .line 11928
    iput v0, p0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mOldPosition:I

    .line 11929
    iput v0, p0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mPreLayoutPosition:I

    return-void
.end method

.method clearPayload()V
    .registers 2

    .line 12217
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mPayloads:Ljava/util/List;

    if-eqz v0, :cond_7

    .line 12218
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 12220
    :cond_7
    iget v0, p0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mFlags:I

    and-int/lit16 v0, v0, -0x401

    iput v0, p0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mFlags:I

    return-void
.end method

.method clearReturnedFromScrapFlag()V
    .registers 2

    .line 12144
    iget v0, p0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mFlags:I

    and-int/lit8 v0, v0, -0x21

    iput v0, p0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mFlags:I

    return-void
.end method

.method clearTmpDetachFlag()V
    .registers 2

    .line 12148
    iget v0, p0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mFlags:I

    and-int/lit16 v0, v0, -0x101

    iput v0, p0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mFlags:I

    return-void
.end method

.method doesTransientStatePreventRecycling()Z
    .registers 2

    .line 12360
    iget v0, p0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mFlags:I

    and-int/lit8 v0, v0, 0x10

    if-nez v0, :cond_10

    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->itemView:Landroid/view/View;

    invoke-static {p0}, Lo/InvalidTypeIdException;->onPrepare(Landroid/view/View;)Z

    move-result p0

    if-eqz p0, :cond_10

    const/4 p0, 0x1

    return p0

    :cond_10
    const/4 p0, 0x0

    return p0
.end method

.method flagRemovedAndOffsetPosition(IIZ)V
    .registers 5

    const/16 v0, 0x8

    .line 11906
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->addFlags(I)V

    .line 11907
    invoke-virtual {p0, p2, p3}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->offsetPosition(IZ)V

    .line 11908
    iput p1, p0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mPosition:I

    return-void
.end method

.method public final getAbsoluteAdapterPosition()I
    .registers 2

    .line 12081
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mOwnerRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    if-nez v0, :cond_6

    const/4 p0, -0x1

    return p0

    .line 12084
    :cond_6
    invoke-virtual {v0, p0}, Landroidx/recyclerview/widget/RecyclerView;->RemoteActionCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;)I

    move-result p0

    return p0
.end method

.method public final getAdapterPosition()I
    .registers 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 11993
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->getBindingAdapterPosition()I

    move-result p0

    return p0
.end method

.method public final getBindingAdapter()Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;
    .registers 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer<",
            "+",
            "Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;",
            ">;"
        }
    .end annotation

    .line 12096
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mBindingAdapter:Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;

    return-object p0
.end method

.method public final getBindingAdapterPosition()I
    .registers 4

    .line 12028
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mBindingAdapter:Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;

    const/4 v1, -0x1

    if-nez v0, :cond_6

    return v1

    .line 12031
    :cond_6
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mOwnerRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    if-nez v0, :cond_b

    return v1

    .line 12035
    :cond_b
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->IconCompatParcelizer()Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;

    move-result-object v0

    if-nez v0, :cond_12

    return v1

    .line 12039
    :cond_12
    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mOwnerRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v2, p0}, Landroidx/recyclerview/widget/RecyclerView;->RemoteActionCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;)I

    move-result v2

    if-ne v2, v1, :cond_1b

    return v1

    .line 12043
    :cond_1b
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mBindingAdapter:Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;

    invoke-virtual {v0, v1, p0, v2}, Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;->findRelativeAdapterPositionIn(Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;I)I

    move-result p0

    return p0
.end method

.method public final getItemId()J
    .registers 3

    .line 12121
    iget-wide v0, p0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mItemId:J

    return-wide v0
.end method

.method public final getItemViewType()I
    .registers 1

    .line 12128
    iget p0, p0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mItemViewType:I

    return p0
.end method

.method public final getLayoutPosition()I
    .registers 3

    .line 11980
    iget v0, p0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mPreLayoutPosition:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_8

    iget p0, p0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mPosition:I

    return p0

    :cond_8
    return v0
.end method

.method public final getOldPosition()I
    .registers 1

    .line 12111
    iget p0, p0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mOldPosition:I

    return p0
.end method

.method public final getPosition()I
    .registers 3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 11953
    iget v0, p0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mPreLayoutPosition:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_8

    iget p0, p0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mPosition:I

    return p0

    :cond_8
    return v0
.end method

.method getUnmodifiedPayloads()Ljava/util/List;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 12224
    iget v0, p0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mFlags:I

    and-int/lit16 v0, v0, 0x400

    if-nez v0, :cond_16

    .line 12225
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mPayloads:Ljava/util/List;

    if-eqz v0, :cond_13

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-eqz v0, :cond_13

    .line 12230
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mUnmodifiedPayloads:Ljava/util/List;

    return-object p0

    .line 12227
    :cond_13
    sget-object p0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->FULLUPDATE_PAYLOADS:Ljava/util/List;

    return-object p0

    .line 12233
    :cond_16
    sget-object p0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->FULLUPDATE_PAYLOADS:Ljava/util/List;

    return-object p0
.end method

.method hasAnyOfTheFlags(I)Z
    .registers 2

    .line 12177
    iget p0, p0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mFlags:I

    and-int/2addr p0, p1

    if-eqz p0, :cond_7

    const/4 p0, 0x1

    return p0

    :cond_7
    const/4 p0, 0x0

    return p0
.end method

.method isAdapterPositionUnknown()Z
    .registers 2

    .line 12189
    iget v0, p0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mFlags:I

    and-int/lit16 v0, v0, 0x200

    if-nez v0, :cond_e

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->isInvalid()Z

    move-result p0

    if-nez p0, :cond_e

    const/4 p0, 0x0

    return p0

    :cond_e
    const/4 p0, 0x1

    return p0
.end method

.method isAttachedToTransitionOverlay()Z
    .registers 2

    .line 12185
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->itemView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eqz v0, :cond_14

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->itemView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mOwnerRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    if-eq v0, p0, :cond_14

    const/4 p0, 0x1

    return p0

    :cond_14
    const/4 p0, 0x0

    return p0
.end method

.method public isBound()Z
    .registers 2

    .line 12169
    iget p0, p0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mFlags:I

    const/4 v0, 0x1

    and-int/2addr p0, v0

    if-eqz p0, :cond_7

    return v0

    :cond_7
    const/4 p0, 0x0

    return p0
.end method

.method public isInvalid()Z
    .registers 1

    .line 12161
    iget p0, p0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mFlags:I

    and-int/lit8 p0, p0, 0x4

    if-eqz p0, :cond_8

    const/4 p0, 0x1

    return p0

    :cond_8
    const/4 p0, 0x0

    return p0
.end method

.method public final isRecyclable()Z
    .registers 2

    .line 12343
    iget v0, p0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mFlags:I

    and-int/lit8 v0, v0, 0x10

    if-nez v0, :cond_10

    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->itemView:Landroid/view/View;

    .line 12344
    invoke-static {p0}, Lo/InvalidTypeIdException;->onPrepare(Landroid/view/View;)Z

    move-result p0

    if-nez p0, :cond_10

    const/4 p0, 0x1

    return p0

    :cond_10
    const/4 p0, 0x0

    return p0
.end method

.method public isRemoved()Z
    .registers 1

    .line 12173
    iget p0, p0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mFlags:I

    and-int/lit8 p0, p0, 0x8

    if-eqz p0, :cond_8

    const/4 p0, 0x1

    return p0

    :cond_8
    const/4 p0, 0x0

    return p0
.end method

.method isScrap()Z
    .registers 1

    .line 12132
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mScrapContainer:Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;

    if-eqz p0, :cond_6

    const/4 p0, 0x1

    return p0

    :cond_6
    const/4 p0, 0x0

    return p0
.end method

.method isTmpDetached()Z
    .registers 1

    .line 12181
    iget p0, p0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mFlags:I

    and-int/lit16 p0, p0, 0x100

    if-eqz p0, :cond_8

    const/4 p0, 0x1

    return p0

    :cond_8
    const/4 p0, 0x0

    return p0
.end method

.method isUpdated()Z
    .registers 1

    .line 12364
    iget p0, p0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mFlags:I

    and-int/lit8 p0, p0, 0x2

    if-eqz p0, :cond_8

    const/4 p0, 0x1

    return p0

    :cond_8
    const/4 p0, 0x0

    return p0
.end method

.method needsUpdate()Z
    .registers 1

    .line 12165
    iget p0, p0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mFlags:I

    and-int/lit8 p0, p0, 0x2

    if-eqz p0, :cond_8

    const/4 p0, 0x1

    return p0

    :cond_8
    const/4 p0, 0x0

    return p0
.end method

.method offsetPosition(IZ)V
    .registers 5

    .line 11912
    iget v0, p0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mOldPosition:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_9

    .line 11913
    iget v0, p0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mPosition:I

    iput v0, p0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mOldPosition:I

    .line 11915
    :cond_9
    iget v0, p0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mPreLayoutPosition:I

    if-ne v0, v1, :cond_11

    .line 11916
    iget v0, p0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mPosition:I

    iput v0, p0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mPreLayoutPosition:I

    :cond_11
    if-eqz p2, :cond_18

    .line 11919
    iget p2, p0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mPreLayoutPosition:I

    add-int/2addr p2, p1

    iput p2, p0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mPreLayoutPosition:I

    .line 11921
    :cond_18
    iget p2, p0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mPosition:I

    add-int/2addr p2, p1

    iput p2, p0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mPosition:I

    .line 11922
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->itemView:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    if-eqz p1, :cond_30

    .line 11923
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->itemView:Landroid/view/View;

    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p0

    check-cast p0, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->AudioAttributesCompatParcelizer:Z

    :cond_30
    return-void
.end method

.method onEnteredHiddenState(Landroidx/recyclerview/widget/RecyclerView;)V
    .registers 4

    .line 12262
    iget v0, p0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mPendingAccessibilityState:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_8

    .line 12263
    iput v0, p0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mWasImportantForAccessibilityBeforeHidden:I

    goto :goto_10

    .line 12265
    :cond_8
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->itemView:Landroid/view/View;

    .line 12266
    invoke-static {v0}, Lo/InvalidTypeIdException;->MediaBrowserCompatItemReceiver(Landroid/view/View;)I

    move-result v0

    iput v0, p0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mWasImportantForAccessibilityBeforeHidden:I

    :goto_10
    const/4 v0, 0x4

    .line 12268
    invoke-virtual {p1, p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->read(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;I)Z

    return-void
.end method

.method onLeftHiddenState(Landroidx/recyclerview/widget/RecyclerView;)V
    .registers 3

    .line 12276
    iget v0, p0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mWasImportantForAccessibilityBeforeHidden:I

    invoke-virtual {p1, p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->read(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;I)Z

    const/4 p1, 0x0

    .line 12278
    iput p1, p0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mWasImportantForAccessibilityBeforeHidden:I

    return-void
.end method

.method resetInternal()V
    .registers 5

    .line 12238
    sget-boolean v0, Landroidx/recyclerview/widget/RecyclerView;->AudioAttributesImplApi26Parcelizer:Z

    if-eqz v0, :cond_24

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->isTmpDetached()Z

    move-result v0

    if-nez v0, :cond_b

    goto :goto_24

    .line 12239
    :cond_b
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Attempting to reset temp-detached ViewHolder: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, ". ViewHolders should be fully detached before resetting."

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_24
    :goto_24
    const/4 v0, 0x0

    .line 12243
    iput v0, p0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mFlags:I

    const/4 v1, -0x1

    .line 12244
    iput v1, p0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mPosition:I

    .line 12245
    iput v1, p0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mOldPosition:I

    const-wide/16 v2, -0x1

    .line 12246
    iput-wide v2, p0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mItemId:J

    .line 12247
    iput v1, p0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mPreLayoutPosition:I

    .line 12248
    iput v0, p0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mIsRecyclableCount:I

    const/4 v2, 0x0

    .line 12249
    iput-object v2, p0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mShadowedHolder:Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;

    .line 12250
    iput-object v2, p0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mShadowingHolder:Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;

    .line 12251
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->clearPayload()V

    .line 12252
    iput v0, p0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mWasImportantForAccessibilityBeforeHidden:I

    .line 12253
    iput v1, p0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mPendingAccessibilityState:I

    .line 12254
    invoke-static {p0}, Landroidx/recyclerview/widget/RecyclerView;->read(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;)V

    return-void
.end method

.method saveOldPosition()V
    .registers 3

    .line 11933
    iget v0, p0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mOldPosition:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_9

    .line 11934
    iget v0, p0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mPosition:I

    iput v0, p0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mOldPosition:I

    :cond_9
    return-void
.end method

.method setFlags(II)V
    .registers 4

    and-int/2addr p1, p2

    .line 12193
    iget v0, p0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mFlags:I

    not-int p2, p2

    and-int/2addr p2, v0

    or-int/2addr p1, p2

    iput p1, p0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mFlags:I

    return-void
.end method

.method public final setIsRecyclable(Z)V
    .registers 4

    .line 12319
    iget v0, p0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mIsRecyclableCount:I

    const/4 v1, 0x1

    if-eqz p1, :cond_8

    add-int/lit8 v0, v0, -0x1

    goto :goto_9

    :cond_8
    add-int/2addr v0, v1

    :goto_9
    iput v0, p0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mIsRecyclableCount:I

    if-gez v0, :cond_28

    const/4 p1, 0x0

    .line 12321
    iput p1, p0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mIsRecyclableCount:I

    .line 12322
    sget-boolean p1, Landroidx/recyclerview/widget/RecyclerView;->AudioAttributesImplApi26Parcelizer:Z

    if-nez p1, :cond_18

    .line 12326
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    goto :goto_3d

    .line 12323
    :cond_18
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for "

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_28
    if-nez p1, :cond_33

    if-ne v0, v1, :cond_33

    .line 12329
    iget p1, p0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mFlags:I

    or-int/lit8 p1, p1, 0x10

    iput p1, p0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mFlags:I

    goto :goto_3d

    :cond_33
    if-eqz p1, :cond_3d

    if-nez v0, :cond_3d

    .line 12331
    iget p1, p0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mFlags:I

    and-int/lit8 p1, p1, -0x11

    iput p1, p0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mFlags:I

    .line 12333
    :cond_3d
    :goto_3d
    sget-boolean p1, Landroidx/recyclerview/widget/RecyclerView;->AudioAttributesImplBaseParcelizer:Z

    if-eqz p1, :cond_44

    .line 12334
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    :cond_44
    return-void
.end method

.method setScrapContainer(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Z)V
    .registers 3

    .line 12156
    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mScrapContainer:Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;

    .line 12157
    iput-boolean p2, p0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mInChangeScrap:Z

    return-void
.end method

.method shouldBeKeptAsChild()Z
    .registers 1

    .line 12352
    iget p0, p0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mFlags:I

    and-int/lit8 p0, p0, 0x10

    if-eqz p0, :cond_8

    const/4 p0, 0x1

    return p0

    :cond_8
    const/4 p0, 0x0

    return p0
.end method

.method public shouldIgnore()Z
    .registers 1

    .line 11939
    iget p0, p0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mFlags:I

    and-int/lit16 p0, p0, 0x80

    if-eqz p0, :cond_8

    const/4 p0, 0x1

    return p0

    :cond_8
    const/4 p0, 0x0

    return p0
.end method

.method stopIgnoring()V
    .registers 2

    .line 12152
    iget v0, p0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mFlags:I

    and-int/lit16 v0, v0, -0x81

    iput v0, p0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mFlags:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .registers 5

    .line 12284
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->isAnonymousClass()Z

    move-result v0

    if-eqz v0, :cond_d

    const-string v0, "ViewHolder"

    goto :goto_15

    :cond_d
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    .line 12285
    :goto_15
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "{"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12286
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " position="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mPosition:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " id="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, p0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mItemId:J

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, ", oldPos="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mOldPosition:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", pLpos:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mPreLayoutPosition:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 12288
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->isScrap()Z

    move-result v1

    if-eqz v1, :cond_75

    .line 12289
    const-string v1, " scrap "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12290
    iget-boolean v1, p0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mInChangeScrap:Z

    if-eqz v1, :cond_70

    const-string v1, "[changeScrap]"

    goto :goto_72

    :cond_70
    const-string v1, "[attachedScrap]"

    :goto_72
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12292
    :cond_75
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->isInvalid()Z

    move-result v1

    if-eqz v1, :cond_80

    const-string v1, " invalid"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12293
    :cond_80
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->isBound()Z

    move-result v1

    if-nez v1, :cond_8b

    const-string v1, " unbound"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12294
    :cond_8b
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->needsUpdate()Z

    move-result v1

    if-eqz v1, :cond_96

    const-string v1, " update"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12295
    :cond_96
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->isRemoved()Z

    move-result v1

    if-eqz v1, :cond_a1

    const-string v1, " removed"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12296
    :cond_a1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->shouldIgnore()Z

    move-result v1

    if-eqz v1, :cond_ac

    const-string v1, " ignored"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12297
    :cond_ac
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->isTmpDetached()Z

    move-result v1

    if-eqz v1, :cond_b7

    const-string v1, " tmpDetached"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12298
    :cond_b7
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->isRecyclable()Z

    move-result v1

    if-nez v1, :cond_d5

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, " not recyclable("

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mIsRecyclableCount:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ")"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12299
    :cond_d5
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->isAdapterPositionUnknown()Z

    move-result v1

    if-eqz v1, :cond_e0

    const-string v1, " undefined adapter position"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12301
    :cond_e0
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->itemView:Landroid/view/View;

    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p0

    if-nez p0, :cond_ed

    const-string p0, " no parent"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12302
    :cond_ed
    const-string p0, "}"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12303
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method unScrap()V
    .registers 2

    .line 12136
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mScrapContainer:Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;

    invoke-virtual {v0, p0}, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->AudioAttributesCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;)V

    return-void
.end method

.method wasReturnedFromScrap()Z
    .registers 1

    .line 12140
    iget p0, p0, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->mFlags:I

    and-int/lit8 p0, p0, 0x20

    if-eqz p0, :cond_8

    const/4 p0, 0x1

    return p0

    :cond_8
    const/4 p0, 0x0

    return p0
.end method

###### Class androidx.recyclerview.widget.RecyclerView.onPlayFromMediaId (androidx.recyclerview.widget.RecyclerView$onPlayFromMediaId)
.class public abstract Landroidx/recyclerview/widget/RecyclerView$onPlayFromMediaId;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/recyclerview/widget/RecyclerView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "onPlayFromMediaId"
.end annotation


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 7635
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract AudioAttributesCompatParcelizer()Landroid/view/View;
.end method

###### Class androidx.recyclerview.widget.RecyclerView.read (androidx.recyclerview.widget.RecyclerView$read)
.class public abstract Landroidx/recyclerview/widget/RecyclerView$read;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/recyclerview/widget/RecyclerView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "read"
.end annotation


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 12651
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public AudioAttributesCompatParcelizer(II)V
    .registers 3

    return-void
.end method

.method public AudioAttributesCompatParcelizer(IILjava/lang/Object;)V
    .registers 4

    .line 12663
    invoke-virtual {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$read;->IconCompatParcelizer(II)V

    return-void
.end method

.method public IconCompatParcelizer()V
    .registers 1

    return-void
.end method

.method public IconCompatParcelizer(II)V
    .registers 3

    return-void
.end method

.method public RemoteActionCompatParcelizer(II)V
    .registers 3

    return-void
.end method

.method public read()V
    .registers 1

    return-void
.end method

.method public read(II)V
    .registers 3

    return-void
.end method

###### Class androidx.recyclerview.widget.RecyclerView.write (androidx.recyclerview.widget.RecyclerView$write)
.class public interface abstract Landroidx/recyclerview/widget/RecyclerView$write;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/recyclerview/widget/RecyclerView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "write"
.end annotation


# virtual methods
.method public abstract RemoteActionCompatParcelizer()I
.end method
