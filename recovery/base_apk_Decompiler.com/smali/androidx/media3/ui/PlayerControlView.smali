###### Class androidx.media3.ui.PlayerControlView (androidx.media3.ui.PlayerControlView)
.class public Landroidx/media3/ui/PlayerControlView;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/media3/ui/PlayerControlView$write;,
        Landroidx/media3/ui/PlayerControlView$read;,
        Landroidx/media3/ui/PlayerControlView$AudioAttributesCompatParcelizer;,
        Landroidx/media3/ui/PlayerControlView$IconCompatParcelizer;,
        Landroidx/media3/ui/PlayerControlView$RemoteActionCompatParcelizer;,
        Landroidx/media3/ui/PlayerControlView$MediaBrowserCompatItemReceiver;,
        Landroidx/media3/ui/PlayerControlView$AudioAttributesImplApi21Parcelizer;,
        Landroidx/media3/ui/PlayerControlView$MediaBrowserCompatCustomActionResultReceiver;,
        Landroidx/media3/ui/PlayerControlView$AudioAttributesImplBaseParcelizer;,
        Landroidx/media3/ui/PlayerControlView$AudioAttributesImplApi26Parcelizer;,
        Landroidx/media3/ui/PlayerControlView$MediaMetadataCompat;,
        Landroidx/media3/ui/PlayerControlView$MediaBrowserCompatSearchResultReceiver;
    }
.end annotation


# static fields
.field private static final IconCompatParcelizer:[F


# instance fields
.field private AudioAttributesCompatParcelizer:[J

.field private final AudioAttributesImplApi21Parcelizer:Landroid/widget/TextView;

.field private final AudioAttributesImplApi26Parcelizer:Lo/containsValue;

.field private AudioAttributesImplBaseParcelizer:J

.field private final MediaBrowserCompatCustomActionResultReceiver:F

.field private final MediaBrowserCompatItemReceiver:Landroidx/media3/ui/PlayerControlView$read;

.field private MediaBrowserCompatMediaItem:[Z

.field private final MediaBrowserCompatSearchResultReceiver:Landroid/view/View;

.field private final MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Ljava/util/Formatter;

.field private final MediaDescriptionCompat:Landroid/widget/TextView;

.field private final MediaMetadataCompat:Ljava/lang/StringBuilder;

.field private MediaSessionCompatQueueItem:I

.field private final MediaSessionCompatResultReceiverWrapper:Landroid/view/View;

.field private final MediaSessionCompatToken:Landroid/content/res/Resources;

.field private final ParcelableVolumeInfo:Landroid/widget/ImageView;

.field private final PlaybackStateCompat:Landroid/widget/TextView;

.field private final PlaybackStateCompatCustomAction:Landroid/widget/PopupWindow;

.field private RatingCompat:[J

.field private final RemoteActionCompatParcelizer:Landroid/view/View;

.field private ResultReceiver:Z

.field private final _init_lambda2:I

.field private _init_lambda3:I

.field private final _init_lambda4:Landroid/graphics/drawable/Drawable;

.field private final _init_lambda5:Ljava/lang/String;

.field private final accessaddObserverForBackInvoker:Landroid/widget/ImageView;

.field private final accessensureViewModelStore:Landroid/graphics/drawable/Drawable;

.field private final accessgetReportFullyDrawnExecutorp:Ljava/lang/String;

.field private final accessonBackPresseds1027565324:Landroidx/media3/ui/PlayerControlView$AudioAttributesImplBaseParcelizer;

.field private final addContentView:Ljava/lang/Runnable;

.field private final addMenuProvider:Lo/PrivateMaxEntriesMapRemovalTask;

.field private final addObserverForBackInvoker:Ljava/lang/String;

.field private final addObserverForBackInvokerlambda7:Landroid/graphics/drawable/Drawable;

.field private final addOnNewIntentListener:Lo/PolymorphicTypeValidator$IconCompatParcelizer;

.field private final addOnPictureInPictureModeChangedListener:Landroid/widget/ImageView;

.field private final createFullyDrawnExecutor:Ljava/lang/String;

.field private final ensureViewModelStore:Landroid/graphics/drawable/Drawable;

.field private final getOnBackPressedDispatcherannotations:Ljava/util/concurrent/CopyOnWriteArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArrayList<",
            "Landroidx/media3/ui/PlayerControlView$MediaBrowserCompatSearchResultReceiver;",
            ">;"
        }
    .end annotation
.end field

.field private final getSavedStateRegistryControllerannotations:Lo/PrivateMaxEntriesMapUpdateTask;

.field private final handleMediaPlayPauseIfPendingOnHandler:Landroid/graphics/drawable/Drawable;

.field private menuHostHelperlambda0:I

.field private final onAddQueueItem:Landroid/widget/ImageView;

.field private final onCommand:Ljava/lang/String;

.field private final onCustomAction:Ljava/lang/String;

.field private onFastForward:Z

.field private onMediaButtonEvent:Z

.field private onPause:Z

.field private final onPlay:Landroid/widget/ImageView;

.field private final onPlayFromMediaId:Landroid/graphics/drawable/Drawable;

.field private final onPlayFromSearch:Lo/PolymorphicTypeValidator$AudioAttributesCompatParcelizer;

.field private final onPlayFromUri:Landroid/widget/ImageView;

.field private onPrepare:Z

.field private onPrepareFromMediaId:Landroidx/media3/ui/PlayerControlView$AudioAttributesCompatParcelizer;

.field private final onPrepareFromSearch:Landroid/graphics/drawable/Drawable;

.field private final onPrepareFromUri:Landroid/graphics/drawable/Drawable;

.field private final onRemoveQueueItem:Landroidx/media3/ui/PlayerControlView$IconCompatParcelizer;

.field private onRemoveQueueItemAt:[Z

.field private final onRewind:Landroid/widget/ImageView;

.field private final onSeekTo:Landroid/view/View;

.field private onSetCaptioningEnabled:Landroidx/media3/ui/PlayerControlView$RemoteActionCompatParcelizer;

.field private final onSetPlaybackSpeed:Landroid/widget/TextView;

.field private onSetRating:Lo/isUnsafeBaseType;

.field private final onSetRepeatMode:Ljava/lang/String;

.field private final onSetShuffleMode:Landroid/widget/ImageView;

.field private final onSkipToNext:Landroid/graphics/drawable/Drawable;

.field private final onSkipToPrevious:Ljava/lang/String;

.field private final onSkipToQueueItem:Landroid/graphics/drawable/Drawable;

.field private final onStop:Landroid/graphics/drawable/Drawable;

.field private final r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw:Landroidx/media3/ui/PlayerControlView$AudioAttributesImplApi21Parcelizer;

.field private final r8lambdaKUbBm7ckfqTc9QCgukC86fguu4:Landroid/view/View;

.field private final r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM:Landroidx/recyclerview/widget/RecyclerView;

.field private r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28:Z

.field private final r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8:Landroid/widget/ImageView;

.field private r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0:Z

.field private final read:Landroidx/media3/ui/PlayerControlView$write;

.field private final setSessionImpl:Ljava/lang/String;

.field private final write:F


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 292
    const-string v0, "media3.ui"

    invoke-static {v0}, Lo/isSafeSubType;->AudioAttributesCompatParcelizer(Ljava/lang/String;)V

    const/4 v0, 0x7

    .line 358
    new-array v0, v0, [F

    fill-array-data v0, :array_e

    sput-object v0, Landroidx/media3/ui/PlayerControlView;->IconCompatParcelizer:[F

    return-void

    :array_e
    .array-data 4
        0x3e800000    # 0.25f
        0x3f000000    # 0.5f
        0x3f400000    # 0.75f
        0x3f800000    # 1.0f
        0x3fa00000    # 1.25f
        0x3fc00000    # 1.5f
        0x40000000    # 2.0f
    .end array-data
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .registers 3

    const/4 v0, 0x0

    .line 454
    invoke-direct {p0, p1, v0}, Landroidx/media3/ui/PlayerControlView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 4

    const/4 v0, 0x0

    .line 458
    invoke-direct {p0, p1, p2, v0}, Landroidx/media3/ui/PlayerControlView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 4

    .line 462
    invoke-direct {p0, p1, p2, p3, p2}, Landroidx/media3/ui/PlayerControlView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;ILandroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;ILandroid/util/AttributeSet;)V
    .registers 48

    move-object/from16 v0, p0

    move-object/from16 v7, p1

    move-object/from16 v5, p4

    .line 479
    invoke-direct/range {p0 .. p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 480
    sget v1, Lo/maximumCapacity$AudioAttributesImplApi21Parcelizer;->exo_player_control_view:I

    .line 481
    sget v2, Lo/maximumCapacity$write;->exo_styled_controls_play:I

    .line 482
    sget v3, Lo/maximumCapacity$write;->exo_styled_controls_pause:I

    .line 483
    sget v4, Lo/maximumCapacity$write;->exo_styled_controls_next:I

    .line 484
    sget v6, Lo/maximumCapacity$write;->exo_styled_controls_simple_fastforward:I

    .line 485
    sget v8, Lo/maximumCapacity$write;->exo_styled_controls_previous:I

    .line 486
    sget v9, Lo/maximumCapacity$write;->exo_styled_controls_simple_rewind:I

    .line 487
    sget v10, Lo/maximumCapacity$write;->exo_styled_controls_fullscreen_exit:I

    .line 488
    sget v11, Lo/maximumCapacity$write;->exo_styled_controls_fullscreen_enter:I

    .line 489
    sget v12, Lo/maximumCapacity$write;->exo_styled_controls_repeat_off:I

    .line 490
    sget v13, Lo/maximumCapacity$write;->exo_styled_controls_repeat_one:I

    .line 491
    sget v14, Lo/maximumCapacity$write;->exo_styled_controls_repeat_all:I

    .line 492
    sget v15, Lo/maximumCapacity$write;->exo_styled_controls_shuffle_on:I

    .line 493
    sget v7, Lo/maximumCapacity$write;->exo_styled_controls_shuffle_off:I

    move/from16 p2, v7

    .line 494
    sget v7, Lo/maximumCapacity$write;->exo_styled_controls_subtitle_on:I

    move/from16 v16, v7

    .line 495
    sget v7, Lo/maximumCapacity$write;->exo_styled_controls_subtitle_off:I

    move/from16 v17, v7

    .line 496
    sget v7, Lo/maximumCapacity$write;->exo_styled_controls_vr:I

    move/from16 v18, v7

    const/4 v7, 0x1

    .line 498
    iput-boolean v7, v0, Landroidx/media3/ui/PlayerControlView;->r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28:Z

    const/16 v7, 0x1388

    .line 499
    iput v7, v0, Landroidx/media3/ui/PlayerControlView;->_init_lambda3:I

    const/4 v7, 0x0

    .line 500
    iput v7, v0, Landroidx/media3/ui/PlayerControlView;->MediaSessionCompatQueueItem:I

    const/16 v7, 0xc8

    .line 501
    iput v7, v0, Landroidx/media3/ui/PlayerControlView;->menuHostHelperlambda0:I

    if-eqz v5, :cond_16a

    .line 514
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v7

    sget-object v0, Lo/maximumCapacity$MediaDescriptionCompat;->PlayerControlView:[I

    move/from16 v20, v14

    move/from16 v19, v15

    const/4 v14, 0x0

    move/from16 v15, p3

    .line 515
    invoke-virtual {v7, v5, v0, v15, v14}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v7

    .line 518
    :try_start_54
    sget v0, Lo/maximumCapacity$MediaDescriptionCompat;->PlayerControlView_controller_layout_id:I

    .line 519
    invoke-virtual {v7, v0, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v1

    .line 520
    sget v0, Lo/maximumCapacity$MediaDescriptionCompat;->PlayerControlView_play_icon:I

    .line 521
    invoke-virtual {v7, v0, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v2

    .line 522
    sget v0, Lo/maximumCapacity$MediaDescriptionCompat;->PlayerControlView_pause_icon:I

    .line 523
    invoke-virtual {v7, v0, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v3

    .line 524
    sget v0, Lo/maximumCapacity$MediaDescriptionCompat;->PlayerControlView_next_icon:I

    .line 525
    invoke-virtual {v7, v0, v4}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v4

    .line 526
    sget v0, Lo/maximumCapacity$MediaDescriptionCompat;->PlayerControlView_fastforward_icon:I

    .line 527
    invoke-virtual {v7, v0, v6}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v6

    .line 529
    sget v0, Lo/maximumCapacity$MediaDescriptionCompat;->PlayerControlView_previous_icon:I

    .line 530
    invoke-virtual {v7, v0, v8}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v8

    .line 531
    sget v0, Lo/maximumCapacity$MediaDescriptionCompat;->PlayerControlView_rewind_icon:I

    .line 532
    invoke-virtual {v7, v0, v9}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v9

    .line 533
    sget v0, Lo/maximumCapacity$MediaDescriptionCompat;->PlayerControlView_fullscreen_exit_icon:I

    .line 534
    invoke-virtual {v7, v0, v10}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v10

    .line 536
    sget v0, Lo/maximumCapacity$MediaDescriptionCompat;->PlayerControlView_fullscreen_enter_icon:I

    .line 537
    invoke-virtual {v7, v0, v11}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v11

    .line 539
    sget v0, Lo/maximumCapacity$MediaDescriptionCompat;->PlayerControlView_repeat_off_icon:I

    .line 540
    invoke-virtual {v7, v0, v12}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v12

    .line 541
    sget v0, Lo/maximumCapacity$MediaDescriptionCompat;->PlayerControlView_repeat_one_icon:I

    .line 542
    invoke-virtual {v7, v0, v13}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v13

    .line 543
    sget v0, Lo/maximumCapacity$MediaDescriptionCompat;->PlayerControlView_repeat_all_icon:I

    move/from16 v14, v20

    .line 544
    invoke-virtual {v7, v0, v14}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v14

    .line 545
    sget v0, Lo/maximumCapacity$MediaDescriptionCompat;->PlayerControlView_shuffle_on_icon:I

    move/from16 v15, v19

    .line 546
    invoke-virtual {v7, v0, v15}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v15

    .line 547
    sget v0, Lo/maximumCapacity$MediaDescriptionCompat;->PlayerControlView_shuffle_off_icon:I

    move/from16 p3, v1

    move/from16 v1, p2

    .line 548
    invoke-virtual {v7, v0, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0

    .line 550
    sget v1, Lo/maximumCapacity$MediaDescriptionCompat;->PlayerControlView_subtitle_on_icon:I

    move/from16 p2, v0

    move/from16 v0, v16

    .line 551
    invoke-virtual {v7, v1, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0

    .line 553
    sget v1, Lo/maximumCapacity$MediaDescriptionCompat;->PlayerControlView_subtitle_off_icon:I

    move/from16 v16, v0

    move/from16 v0, v17

    .line 554
    invoke-virtual {v7, v1, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0

    .line 556
    sget v1, Lo/maximumCapacity$MediaDescriptionCompat;->PlayerControlView_vr_icon:I

    move/from16 v17, v0

    move/from16 v0, v18

    invoke-virtual {v7, v1, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0

    .line 557
    sget v1, Lo/maximumCapacity$MediaDescriptionCompat;->PlayerControlView_show_timeout:I

    move/from16 v19, v0

    move/from16 v18, v4

    move-object/from16 v4, p0

    iget v0, v4, Landroidx/media3/ui/PlayerControlView;->_init_lambda3:I

    invoke-virtual {v7, v1, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    iput v0, v4, Landroidx/media3/ui/PlayerControlView;->_init_lambda3:I

    .line 558
    iget v0, v4, Landroidx/media3/ui/PlayerControlView;->MediaSessionCompatQueueItem:I

    invoke-static {v7, v0}, Landroidx/media3/ui/PlayerControlView;->write(Landroid/content/res/TypedArray;I)I

    move-result v0

    iput v0, v4, Landroidx/media3/ui/PlayerControlView;->MediaSessionCompatQueueItem:I

    .line 559
    sget v0, Lo/maximumCapacity$MediaDescriptionCompat;->PlayerControlView_show_rewind_button:I

    const/4 v1, 0x1

    .line 560
    invoke-virtual {v7, v0, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    move/from16 v20, v0

    .line 561
    sget v0, Lo/maximumCapacity$MediaDescriptionCompat;->PlayerControlView_show_fastforward_button:I

    .line 562
    invoke-virtual {v7, v0, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    move/from16 v21, v0

    .line 564
    sget v0, Lo/maximumCapacity$MediaDescriptionCompat;->PlayerControlView_show_previous_button:I

    .line 565
    invoke-virtual {v7, v0, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    move/from16 v22, v0

    .line 566
    sget v0, Lo/maximumCapacity$MediaDescriptionCompat;->PlayerControlView_show_next_button:I

    .line 567
    invoke-virtual {v7, v0, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    .line 568
    sget v1, Lo/maximumCapacity$MediaDescriptionCompat;->PlayerControlView_show_shuffle_button:I

    move/from16 v23, v0

    const/4 v0, 0x0

    .line 569
    invoke-virtual {v7, v1, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    move/from16 v24, v1

    .line 570
    sget v1, Lo/maximumCapacity$MediaDescriptionCompat;->PlayerControlView_show_subtitle_button:I

    .line 571
    invoke-virtual {v7, v1, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    move/from16 v25, v1

    .line 572
    sget v1, Lo/maximumCapacity$MediaDescriptionCompat;->PlayerControlView_show_vr_button:I

    invoke-virtual {v7, v1, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    .line 573
    sget v0, Lo/maximumCapacity$MediaDescriptionCompat;->PlayerControlView_time_bar_min_update_interval:I

    move/from16 v26, v1

    iget v1, v4, Landroidx/media3/ui/PlayerControlView;->menuHostHelperlambda0:I

    .line 574
    invoke-virtual {v7, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    .line 573
    invoke-virtual {v4, v0}, Landroidx/media3/ui/PlayerControlView;->setTimeBarMinUpdateInterval(I)V

    .line 577
    sget v0, Lo/maximumCapacity$MediaDescriptionCompat;->PlayerControlView_animation_enabled:I

    const/4 v1, 0x1

    .line 578
    invoke-virtual {v7, v0, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0
    :try_end_132
    .catchall {:try_start_54 .. :try_end_132} :catchall_165

    .line 580
    invoke-virtual {v7}, Landroid/content/res/TypedArray;->recycle()V

    move/from16 v1, p3

    move/from16 v37, v0

    move/from16 v27, v9

    move/from16 v28, v10

    move/from16 v29, v11

    move/from16 v30, v12

    move/from16 v31, v13

    move/from16 v32, v14

    move/from16 v36, v15

    move/from16 v12, v18

    move/from16 v14, v19

    move/from16 v7, v20

    move/from16 v9, v22

    move/from16 v0, v23

    move/from16 v33, v24

    move/from16 v34, v25

    move/from16 v35, v26

    move/from16 v15, p2

    move v10, v2

    move v11, v3

    move v13, v6

    move/from16 p2, v8

    move/from16 v6, v16

    move/from16 v3, v17

    move/from16 v8, v21

    goto :goto_1a0

    :catchall_165
    move-exception v0

    invoke-virtual {v7}, Landroid/content/res/TypedArray;->recycle()V

    .line 581
    throw v0

    :cond_16a
    move v7, v1

    move/from16 v1, p2

    move/from16 v42, v4

    move-object v4, v0

    move/from16 v0, v18

    move/from16 v18, v17

    move/from16 v17, v16

    move/from16 v16, v42

    move/from16 p2, v8

    move/from16 v27, v9

    move/from16 v28, v10

    move/from16 v29, v11

    move/from16 v30, v12

    move/from16 v31, v13

    move/from16 v32, v14

    move/from16 v36, v15

    move/from16 v12, v16

    const/4 v8, 0x1

    const/4 v9, 0x1

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v37, 0x1

    move v14, v0

    move v15, v1

    move v10, v2

    move v11, v3

    move v13, v6

    move v1, v7

    move/from16 v6, v17

    move/from16 v3, v18

    const/4 v0, 0x1

    const/4 v7, 0x1

    .line 584
    :goto_1a0
    invoke-static/range {p1 .. p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v2

    invoke-virtual {v2, v1, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    const/high16 v1, 0x40000

    .line 585
    invoke-virtual {v4, v1}, Landroid/view/ViewGroup;->setDescendantFocusability(I)V

    .line 587
    new-instance v2, Landroidx/media3/ui/PlayerControlView$read;

    const/4 v1, 0x0

    invoke-direct {v2, v4, v1}, Landroidx/media3/ui/PlayerControlView$read;-><init>(Landroidx/media3/ui/PlayerControlView;B)V

    iput-object v2, v4, Landroidx/media3/ui/PlayerControlView;->MediaBrowserCompatItemReceiver:Landroidx/media3/ui/PlayerControlView$read;

    .line 588
    new-instance v1, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v1, v4, Landroidx/media3/ui/PlayerControlView;->getOnBackPressedDispatcherannotations:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 589
    new-instance v1, Lo/PolymorphicTypeValidator$AudioAttributesCompatParcelizer;

    invoke-direct {v1}, Lo/PolymorphicTypeValidator$AudioAttributesCompatParcelizer;-><init>()V

    iput-object v1, v4, Landroidx/media3/ui/PlayerControlView;->onPlayFromSearch:Lo/PolymorphicTypeValidator$AudioAttributesCompatParcelizer;

    .line 590
    new-instance v1, Lo/PolymorphicTypeValidator$IconCompatParcelizer;

    invoke-direct {v1}, Lo/PolymorphicTypeValidator$IconCompatParcelizer;-><init>()V

    iput-object v1, v4, Landroidx/media3/ui/PlayerControlView;->addOnNewIntentListener:Lo/PolymorphicTypeValidator$IconCompatParcelizer;

    .line 591
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iput-object v1, v4, Landroidx/media3/ui/PlayerControlView;->MediaMetadataCompat:Ljava/lang/StringBuilder;

    move/from16 p3, v3

    .line 592
    new-instance v3, Ljava/util/Formatter;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v5

    invoke-direct {v3, v1, v5}, Ljava/util/Formatter;-><init>(Ljava/lang/Appendable;Ljava/util/Locale;)V

    iput-object v3, v4, Landroidx/media3/ui/PlayerControlView;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Ljava/util/Formatter;

    const/4 v1, 0x0

    .line 593
    new-array v3, v1, [J

    iput-object v3, v4, Landroidx/media3/ui/PlayerControlView;->AudioAttributesCompatParcelizer:[J

    .line 594
    new-array v3, v1, [Z

    iput-object v3, v4, Landroidx/media3/ui/PlayerControlView;->onRemoveQueueItemAt:[Z

    .line 595
    new-array v3, v1, [J

    iput-object v3, v4, Landroidx/media3/ui/PlayerControlView;->RatingCompat:[J

    .line 596
    new-array v3, v1, [Z

    iput-object v3, v4, Landroidx/media3/ui/PlayerControlView;->MediaBrowserCompatMediaItem:[Z

    .line 597
    new-instance v1, Lo/readBufferIndex;

    invoke-direct {v1, v4}, Lo/readBufferIndex;-><init>(Landroidx/media3/ui/PlayerControlView;)V

    iput-object v1, v4, Landroidx/media3/ui/PlayerControlView;->addContentView:Ljava/lang/Runnable;

    .line 599
    sget v1, Lo/maximumCapacity$AudioAttributesImplBaseParcelizer;->exo_duration:I

    invoke-virtual {v4, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, v4, Landroidx/media3/ui/PlayerControlView;->AudioAttributesImplApi21Parcelizer:Landroid/widget/TextView;

    .line 600
    sget v1, Lo/maximumCapacity$AudioAttributesImplBaseParcelizer;->exo_position:I

    invoke-virtual {v4, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, v4, Landroidx/media3/ui/PlayerControlView;->onSetPlaybackSpeed:Landroid/widget/TextView;

    .line 602
    sget v1, Lo/maximumCapacity$AudioAttributesImplBaseParcelizer;->exo_subtitle:I

    invoke-virtual {v4, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Landroid/widget/ImageView;

    iput-object v5, v4, Landroidx/media3/ui/PlayerControlView;->accessaddObserverForBackInvoker:Landroid/widget/ImageView;

    if-eqz v5, :cond_219

    .line 604
    invoke-virtual {v5, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 607
    :cond_219
    sget v1, Lo/maximumCapacity$AudioAttributesImplBaseParcelizer;->exo_fullscreen:I

    invoke-virtual {v4, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    iput-object v1, v4, Landroidx/media3/ui/PlayerControlView;->onAddQueueItem:Landroid/widget/ImageView;

    .line 608
    new-instance v3, Lo/afterWrite;

    invoke-direct {v3, v4}, Lo/afterWrite;-><init>(Landroidx/media3/ui/PlayerControlView;)V

    invoke-static {v1, v3}, Landroidx/media3/ui/PlayerControlView;->write(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 609
    sget v1, Lo/maximumCapacity$AudioAttributesImplBaseParcelizer;->exo_minimal_fullscreen:I

    invoke-virtual {v4, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    iput-object v1, v4, Landroidx/media3/ui/PlayerControlView;->onPlay:Landroid/widget/ImageView;

    .line 610
    new-instance v3, Lo/afterWrite;

    invoke-direct {v3, v4}, Lo/afterWrite;-><init>(Landroidx/media3/ui/PlayerControlView;)V

    invoke-static {v1, v3}, Landroidx/media3/ui/PlayerControlView;->write(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 612
    sget v1, Lo/maximumCapacity$AudioAttributesImplBaseParcelizer;->exo_settings:I

    invoke-virtual {v4, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    iput-object v1, v4, Landroidx/media3/ui/PlayerControlView;->r8lambdaKUbBm7ckfqTc9QCgukC86fguu4:Landroid/view/View;

    if-eqz v1, :cond_24a

    .line 614
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 617
    :cond_24a
    sget v1, Lo/maximumCapacity$AudioAttributesImplBaseParcelizer;->exo_playback_speed:I

    invoke-virtual {v4, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    iput-object v1, v4, Landroidx/media3/ui/PlayerControlView;->onSeekTo:Landroid/view/View;

    if-eqz v1, :cond_257

    .line 619
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 622
    :cond_257
    sget v1, Lo/maximumCapacity$AudioAttributesImplBaseParcelizer;->exo_audio_track:I

    invoke-virtual {v4, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    iput-object v1, v4, Landroidx/media3/ui/PlayerControlView;->RemoteActionCompatParcelizer:Landroid/view/View;

    if-eqz v1, :cond_264

    .line 624
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 627
    :cond_264
    sget v1, Lo/maximumCapacity$AudioAttributesImplBaseParcelizer;->exo_progress:I

    invoke-virtual {v4, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lo/PrivateMaxEntriesMapRemovalTask;

    .line 628
    sget v3, Lo/maximumCapacity$AudioAttributesImplBaseParcelizer;->exo_progress_placeholder:I

    invoke-virtual {v4, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    move/from16 v16, v0

    if-eqz v1, :cond_285

    .line 630
    iput-object v1, v4, Landroidx/media3/ui/PlayerControlView;->addMenuProvider:Lo/PrivateMaxEntriesMapRemovalTask;

    move/from16 v39, p2

    move/from16 v40, p3

    move-object/from16 v38, v2

    move-object v0, v4

    move-object/from16 v41, v5

    move/from16 v18, v9

    move v9, v6

    goto :goto_2de

    :cond_285
    if-eqz v3, :cond_2cf

    .line 634
    sget v17, Lo/maximumCapacity$MediaBrowserCompatSearchResultReceiver;->ExoStyledControls_TimeBar:I

    new-instance v1, Landroidx/media3/ui/DefaultTimeBar;

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object/from16 v20, v1

    move/from16 v39, p2

    move-object/from16 v38, v2

    move-object/from16 v2, p1

    move/from16 v40, p3

    move-object/from16 p2, v3

    move-object/from16 v3, v18

    move-object v0, v4

    move/from16 v4, v19

    move-object/from16 v41, v5

    move-object/from16 v5, p4

    move/from16 v18, v9

    move v9, v6

    move/from16 v6, v17

    invoke-direct/range {v1 .. v6}, Landroidx/media3/ui/DefaultTimeBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;ILandroid/util/AttributeSet;I)V

    .line 636
    sget v1, Lo/maximumCapacity$AudioAttributesImplBaseParcelizer;->exo_progress:I

    move-object/from16 v2, v20

    invoke-virtual {v2, v1}, Landroid/view/View;->setId(I)V

    .line 637
    invoke-virtual/range {p2 .. p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    invoke-virtual {v2, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 638
    invoke-virtual/range {p2 .. p2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    check-cast v1, Landroid/view/ViewGroup;

    move-object/from16 v3, p2

    .line 639
    invoke-virtual {v1, v3}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result v4

    .line 640
    invoke-virtual {v1, v3}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 641
    invoke-virtual {v1, v2, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    .line 642
    iput-object v2, v0, Landroidx/media3/ui/PlayerControlView;->addMenuProvider:Lo/PrivateMaxEntriesMapRemovalTask;

    goto :goto_2de

    :cond_2cf
    move/from16 v39, p2

    move/from16 v40, p3

    move-object/from16 v38, v2

    move-object v0, v4

    move-object/from16 v41, v5

    move/from16 v18, v9

    const/4 v1, 0x0

    move v9, v6

    .line 644
    iput-object v1, v0, Landroidx/media3/ui/PlayerControlView;->addMenuProvider:Lo/PrivateMaxEntriesMapRemovalTask;

    .line 646
    :goto_2de
    iget-object v1, v0, Landroidx/media3/ui/PlayerControlView;->addMenuProvider:Lo/PrivateMaxEntriesMapRemovalTask;

    move-object/from16 v2, v38

    if-eqz v1, :cond_2e7

    .line 647
    invoke-interface {v1, v2}, Lo/PrivateMaxEntriesMapRemovalTask;->read(Lo/PrivateMaxEntriesMapRemovalTask$write;)V

    .line 650
    :cond_2e7
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    iput-object v1, v0, Landroidx/media3/ui/PlayerControlView;->MediaSessionCompatToken:Landroid/content/res/Resources;

    .line 651
    sget v3, Lo/maximumCapacity$AudioAttributesImplBaseParcelizer;->exo_play_pause:I

    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/ImageView;

    iput-object v3, v0, Landroidx/media3/ui/PlayerControlView;->onRewind:Landroid/widget/ImageView;

    if-eqz v3, :cond_2fc

    .line 653
    invoke-virtual {v3, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 655
    :cond_2fc
    sget v3, Lo/maximumCapacity$AudioAttributesImplBaseParcelizer;->exo_prev:I

    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/ImageView;

    iput-object v3, v0, Landroidx/media3/ui/PlayerControlView;->onSetShuffleMode:Landroid/widget/ImageView;

    move-object/from16 v4, p1

    if-eqz v3, :cond_316

    move/from16 v5, v39

    .line 657
    invoke-static {v4, v1, v5}, Lo/LaissezFaireSubTypeValidator;->read(Landroid/content/Context;Landroid/content/res/Resources;I)Landroid/graphics/drawable/Drawable;

    move-result-object v5

    invoke-virtual {v3, v5}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 658
    invoke-virtual {v3, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 660
    :cond_316
    sget v5, Lo/maximumCapacity$AudioAttributesImplBaseParcelizer;->exo_next:I

    invoke-virtual {v0, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/ImageView;

    iput-object v5, v0, Landroidx/media3/ui/PlayerControlView;->onPlayFromUri:Landroid/widget/ImageView;

    if-eqz v5, :cond_32c

    .line 662
    invoke-static {v4, v1, v12}, Lo/LaissezFaireSubTypeValidator;->read(Landroid/content/Context;Landroid/content/res/Resources;I)Landroid/graphics/drawable/Drawable;

    move-result-object v6

    invoke-virtual {v5, v6}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 663
    invoke-virtual {v5, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 665
    :cond_32c
    sget v6, Lo/maximumCapacity$AudioAttributesCompatParcelizer;->roboto_medium_numbers:I

    invoke-static {v4, v6}, Lo/_parseDoublePrimitive;->IconCompatParcelizer(Landroid/content/Context;I)Landroid/graphics/Typeface;

    move-result-object v6

    .line 666
    sget v12, Lo/maximumCapacity$AudioAttributesImplBaseParcelizer;->exo_rew:I

    invoke-virtual {v0, v12}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v12

    check-cast v12, Landroid/widget/ImageView;

    move-object/from16 p2, v5

    .line 667
    sget v5, Lo/maximumCapacity$AudioAttributesImplBaseParcelizer;->exo_rew_with_amount:I

    invoke-virtual {v0, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/TextView;

    if-eqz v12, :cond_357

    move-object/from16 p4, v3

    move/from16 v3, v27

    .line 670
    invoke-static {v4, v1, v3}, Lo/LaissezFaireSubTypeValidator;->read(Landroid/content/Context;Landroid/content/res/Resources;I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    invoke-virtual {v12, v3}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 671
    iput-object v12, v0, Landroidx/media3/ui/PlayerControlView;->MediaSessionCompatResultReceiverWrapper:Landroid/view/View;

    const/4 v3, 0x0

    .line 672
    iput-object v3, v0, Landroidx/media3/ui/PlayerControlView;->PlaybackStateCompat:Landroid/widget/TextView;

    goto :goto_368

    :cond_357
    move-object/from16 p4, v3

    const/4 v3, 0x0

    if-eqz v5, :cond_364

    .line 675
    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 676
    iput-object v5, v0, Landroidx/media3/ui/PlayerControlView;->PlaybackStateCompat:Landroid/widget/TextView;

    .line 677
    iput-object v5, v0, Landroidx/media3/ui/PlayerControlView;->MediaSessionCompatResultReceiverWrapper:Landroid/view/View;

    goto :goto_368

    .line 679
    :cond_364
    iput-object v3, v0, Landroidx/media3/ui/PlayerControlView;->PlaybackStateCompat:Landroid/widget/TextView;

    .line 680
    iput-object v3, v0, Landroidx/media3/ui/PlayerControlView;->MediaSessionCompatResultReceiverWrapper:Landroid/view/View;

    .line 682
    :goto_368
    iget-object v3, v0, Landroidx/media3/ui/PlayerControlView;->MediaSessionCompatResultReceiverWrapper:Landroid/view/View;

    if-eqz v3, :cond_36f

    .line 683
    invoke-virtual {v3, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 685
    :cond_36f
    sget v3, Lo/maximumCapacity$AudioAttributesImplBaseParcelizer;->exo_ffwd:I

    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/ImageView;

    .line 686
    sget v5, Lo/maximumCapacity$AudioAttributesImplBaseParcelizer;->exo_ffwd_with_amount:I

    invoke-virtual {v0, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/TextView;

    if-eqz v3, :cond_38e

    .line 689
    invoke-static {v4, v1, v13}, Lo/LaissezFaireSubTypeValidator;->read(Landroid/content/Context;Landroid/content/res/Resources;I)Landroid/graphics/drawable/Drawable;

    move-result-object v5

    invoke-virtual {v3, v5}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 690
    iput-object v3, v0, Landroidx/media3/ui/PlayerControlView;->MediaBrowserCompatSearchResultReceiver:Landroid/view/View;

    const/4 v3, 0x0

    .line 691
    iput-object v3, v0, Landroidx/media3/ui/PlayerControlView;->MediaDescriptionCompat:Landroid/widget/TextView;

    goto :goto_39d

    :cond_38e
    const/4 v3, 0x0

    if-eqz v5, :cond_399

    .line 694
    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 695
    iput-object v5, v0, Landroidx/media3/ui/PlayerControlView;->MediaDescriptionCompat:Landroid/widget/TextView;

    .line 696
    iput-object v5, v0, Landroidx/media3/ui/PlayerControlView;->MediaBrowserCompatSearchResultReceiver:Landroid/view/View;

    goto :goto_39d

    .line 698
    :cond_399
    iput-object v3, v0, Landroidx/media3/ui/PlayerControlView;->MediaDescriptionCompat:Landroid/widget/TextView;

    .line 699
    iput-object v3, v0, Landroidx/media3/ui/PlayerControlView;->MediaBrowserCompatSearchResultReceiver:Landroid/view/View;

    .line 701
    :goto_39d
    iget-object v3, v0, Landroidx/media3/ui/PlayerControlView;->MediaBrowserCompatSearchResultReceiver:Landroid/view/View;

    if-eqz v3, :cond_3a4

    .line 702
    invoke-virtual {v3, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 704
    :cond_3a4
    sget v3, Lo/maximumCapacity$AudioAttributesImplBaseParcelizer;->exo_repeat_toggle:I

    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/ImageView;

    iput-object v3, v0, Landroidx/media3/ui/PlayerControlView;->ParcelableVolumeInfo:Landroid/widget/ImageView;

    if-eqz v3, :cond_3b3

    .line 706
    invoke-virtual {v3, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 708
    :cond_3b3
    sget v5, Lo/maximumCapacity$AudioAttributesImplBaseParcelizer;->exo_shuffle:I

    invoke-virtual {v0, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/ImageView;

    iput-object v5, v0, Landroidx/media3/ui/PlayerControlView;->r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8:Landroid/widget/ImageView;

    if-eqz v5, :cond_3c2

    .line 710
    invoke-virtual {v5, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 713
    :cond_3c2
    sget v6, Lo/maximumCapacity$MediaBrowserCompatItemReceiver;->exo_media_button_opacity_percentage_enabled:I

    .line 714
    invoke-virtual {v1, v6}, Landroid/content/res/Resources;->getInteger(I)I

    move-result v6

    int-to-float v6, v6

    const/high16 v12, 0x42c80000    # 100.0f

    div-float/2addr v6, v12

    iput v6, v0, Landroidx/media3/ui/PlayerControlView;->MediaBrowserCompatCustomActionResultReceiver:F

    .line 715
    sget v6, Lo/maximumCapacity$MediaBrowserCompatItemReceiver;->exo_media_button_opacity_percentage_disabled:I

    .line 716
    invoke-virtual {v1, v6}, Landroid/content/res/Resources;->getInteger(I)I

    move-result v6

    int-to-float v6, v6

    div-float/2addr v6, v12

    iput v6, v0, Landroidx/media3/ui/PlayerControlView;->write:F

    .line 718
    sget v6, Lo/maximumCapacity$AudioAttributesImplBaseParcelizer;->exo_vr:I

    invoke-virtual {v0, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/ImageView;

    iput-object v6, v0, Landroidx/media3/ui/PlayerControlView;->addOnPictureInPictureModeChangedListener:Landroid/widget/ImageView;

    if-eqz v6, :cond_3ef

    .line 720
    invoke-static {v4, v1, v14}, Lo/LaissezFaireSubTypeValidator;->read(Landroid/content/Context;Landroid/content/res/Resources;I)Landroid/graphics/drawable/Drawable;

    move-result-object v12

    invoke-virtual {v6, v12}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    const/4 v12, 0x0

    .line 721
    invoke-direct {v0, v12, v6}, Landroidx/media3/ui/PlayerControlView;->AudioAttributesCompatParcelizer(ZLandroid/view/View;)V

    .line 724
    :cond_3ef
    new-instance v12, Lo/containsValue;

    invoke-direct {v12, v0}, Lo/containsValue;-><init>(Landroidx/media3/ui/PlayerControlView;)V

    iput-object v12, v0, Landroidx/media3/ui/PlayerControlView;->AudioAttributesImplApi26Parcelizer:Lo/containsValue;

    move/from16 v13, v37

    .line 725
    invoke-virtual {v12, v13}, Lo/containsValue;->write(Z)V

    .line 729
    sget v13, Lo/maximumCapacity$MediaBrowserCompatCustomActionResultReceiver;->exo_controls_playback_speed:I

    .line 730
    invoke-virtual {v1, v13}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v13

    .line 731
    sget v14, Lo/maximumCapacity$write;->exo_styled_controls_speed:I

    .line 732
    invoke-static {v4, v1, v14}, Lo/LaissezFaireSubTypeValidator;->read(Landroid/content/Context;Landroid/content/res/Resources;I)Landroid/graphics/drawable/Drawable;

    move-result-object v14

    move-object/from16 v17, v3

    .line 733
    sget v3, Lo/maximumCapacity$MediaBrowserCompatCustomActionResultReceiver;->exo_track_selection_title_audio:I

    .line 734
    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    filled-new-array {v13, v3}, [Ljava/lang/String;

    move-result-object v3

    .line 735
    sget v13, Lo/maximumCapacity$write;->exo_styled_controls_audiotrack:I

    .line 736
    invoke-static {v4, v1, v13}, Lo/LaissezFaireSubTypeValidator;->read(Landroid/content/Context;Landroid/content/res/Resources;I)Landroid/graphics/drawable/Drawable;

    move-result-object v13

    filled-new-array {v14, v13}, [Landroid/graphics/drawable/Drawable;

    move-result-object v13

    .line 737
    new-instance v14, Landroidx/media3/ui/PlayerControlView$AudioAttributesImplApi21Parcelizer;

    invoke-direct {v14, v0, v3, v13}, Landroidx/media3/ui/PlayerControlView$AudioAttributesImplApi21Parcelizer;-><init>(Landroidx/media3/ui/PlayerControlView;[Ljava/lang/String;[Landroid/graphics/drawable/Drawable;)V

    iput-object v14, v0, Landroidx/media3/ui/PlayerControlView;->r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw:Landroidx/media3/ui/PlayerControlView$AudioAttributesImplApi21Parcelizer;

    .line 738
    sget v3, Lo/maximumCapacity$RemoteActionCompatParcelizer;->exo_settings_offset:I

    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v3

    iput v3, v0, Landroidx/media3/ui/PlayerControlView;->_init_lambda2:I

    .line 741
    invoke-static/range {p1 .. p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v3

    sget v13, Lo/maximumCapacity$AudioAttributesImplApi21Parcelizer;->exo_styled_settings_list:I

    move-object/from16 v19, v6

    const/4 v6, 0x0

    .line 742
    invoke-virtual {v3, v13, v6}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroidx/recyclerview/widget/RecyclerView;

    iput-object v3, v0, Landroidx/media3/ui/PlayerControlView;->r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM:Landroidx/recyclerview/widget/RecyclerView;

    .line 743
    invoke-virtual {v3, v14}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;)V

    .line 744
    new-instance v6, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    invoke-direct {v6}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>()V

    invoke-virtual {v3, v6}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;)V

    .line 745
    new-instance v6, Landroid/widget/PopupWindow;

    const/4 v13, -0x2

    const/4 v14, 0x1

    invoke-direct {v6, v3, v13, v13, v14}, Landroid/widget/PopupWindow;-><init>(Landroid/view/View;IIZ)V

    iput-object v6, v0, Landroidx/media3/ui/PlayerControlView;->PlaybackStateCompatCustomAction:Landroid/widget/PopupWindow;

    .line 747
    sget v3, Lo/LaissezFaireSubTypeValidator;->MediaBrowserCompatCustomActionResultReceiver:I

    const/16 v13, 0x17

    if-ge v3, v13, :cond_463

    .line 750
    new-instance v3, Landroid/graphics/drawable/ColorDrawable;

    const/4 v13, 0x0

    invoke-direct {v3, v13}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {v6, v3}, Landroid/widget/PopupWindow;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 752
    :cond_463
    invoke-virtual {v6, v2}, Landroid/widget/PopupWindow;->setOnDismissListener(Landroid/widget/PopupWindow$OnDismissListener;)V

    .line 753
    iput-boolean v14, v0, Landroidx/media3/ui/PlayerControlView;->onPrepare:Z

    .line 755
    new-instance v2, Lo/checkArgument;

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-direct {v2, v3}, Lo/checkArgument;-><init>(Landroid/content/res/Resources;)V

    iput-object v2, v0, Landroidx/media3/ui/PlayerControlView;->getSavedStateRegistryControllerannotations:Lo/PrivateMaxEntriesMapUpdateTask;

    .line 756
    invoke-static {v4, v1, v9}, Lo/LaissezFaireSubTypeValidator;->read(Landroid/content/Context;Landroid/content/res/Resources;I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    iput-object v2, v0, Landroidx/media3/ui/PlayerControlView;->addObserverForBackInvokerlambda7:Landroid/graphics/drawable/Drawable;

    move/from16 v2, v40

    .line 757
    invoke-static {v4, v1, v2}, Lo/LaissezFaireSubTypeValidator;->read(Landroid/content/Context;Landroid/content/res/Resources;I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    iput-object v2, v0, Landroidx/media3/ui/PlayerControlView;->ensureViewModelStore:Landroid/graphics/drawable/Drawable;

    .line 758
    sget v2, Lo/maximumCapacity$MediaBrowserCompatCustomActionResultReceiver;->exo_controls_cc_enabled_description:I

    .line 759
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Landroidx/media3/ui/PlayerControlView;->addObserverForBackInvoker:Ljava/lang/String;

    .line 760
    sget v2, Lo/maximumCapacity$MediaBrowserCompatCustomActionResultReceiver;->exo_controls_cc_disabled_description:I

    .line 761
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Landroidx/media3/ui/PlayerControlView;->createFullyDrawnExecutor:Ljava/lang/String;

    .line 762
    new-instance v2, Landroidx/media3/ui/PlayerControlView$AudioAttributesImplBaseParcelizer;

    const/4 v3, 0x0

    invoke-direct {v2, v0, v3}, Landroidx/media3/ui/PlayerControlView$AudioAttributesImplBaseParcelizer;-><init>(Landroidx/media3/ui/PlayerControlView;B)V

    iput-object v2, v0, Landroidx/media3/ui/PlayerControlView;->accessonBackPresseds1027565324:Landroidx/media3/ui/PlayerControlView$AudioAttributesImplBaseParcelizer;

    .line 763
    new-instance v2, Landroidx/media3/ui/PlayerControlView$write;

    invoke-direct {v2, v0, v3}, Landroidx/media3/ui/PlayerControlView$write;-><init>(Landroidx/media3/ui/PlayerControlView;B)V

    iput-object v2, v0, Landroidx/media3/ui/PlayerControlView;->read:Landroidx/media3/ui/PlayerControlView$write;

    .line 764
    sget v2, Lo/maximumCapacity$IconCompatParcelizer;->exo_controls_playback_speeds:I

    .line 766
    new-instance v6, Landroidx/media3/ui/PlayerControlView$IconCompatParcelizer;

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object v2

    sget-object v9, Landroidx/media3/ui/PlayerControlView;->IconCompatParcelizer:[F

    invoke-direct {v6, v0, v2, v9}, Landroidx/media3/ui/PlayerControlView$IconCompatParcelizer;-><init>(Landroidx/media3/ui/PlayerControlView;[Ljava/lang/String;[F)V

    iput-object v6, v0, Landroidx/media3/ui/PlayerControlView;->onRemoveQueueItem:Landroidx/media3/ui/PlayerControlView$IconCompatParcelizer;

    .line 768
    invoke-static {v4, v1, v10}, Lo/LaissezFaireSubTypeValidator;->read(Landroid/content/Context;Landroid/content/res/Resources;I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    iput-object v2, v0, Landroidx/media3/ui/PlayerControlView;->onPrepareFromUri:Landroid/graphics/drawable/Drawable;

    .line 769
    invoke-static {v4, v1, v11}, Lo/LaissezFaireSubTypeValidator;->read(Landroid/content/Context;Landroid/content/res/Resources;I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    iput-object v2, v0, Landroidx/media3/ui/PlayerControlView;->onPrepareFromSearch:Landroid/graphics/drawable/Drawable;

    move/from16 v10, v28

    .line 770
    invoke-static {v4, v1, v10}, Lo/LaissezFaireSubTypeValidator;->read(Landroid/content/Context;Landroid/content/res/Resources;I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    iput-object v2, v0, Landroidx/media3/ui/PlayerControlView;->onPlayFromMediaId:Landroid/graphics/drawable/Drawable;

    move/from16 v11, v29

    .line 771
    invoke-static {v4, v1, v11}, Lo/LaissezFaireSubTypeValidator;->read(Landroid/content/Context;Landroid/content/res/Resources;I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    iput-object v2, v0, Landroidx/media3/ui/PlayerControlView;->handleMediaPlayPauseIfPendingOnHandler:Landroid/graphics/drawable/Drawable;

    move/from16 v2, v30

    .line 772
    invoke-static {v4, v1, v2}, Lo/LaissezFaireSubTypeValidator;->read(Landroid/content/Context;Landroid/content/res/Resources;I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    iput-object v2, v0, Landroidx/media3/ui/PlayerControlView;->onStop:Landroid/graphics/drawable/Drawable;

    move/from16 v13, v31

    .line 773
    invoke-static {v4, v1, v13}, Lo/LaissezFaireSubTypeValidator;->read(Landroid/content/Context;Landroid/content/res/Resources;I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    iput-object v2, v0, Landroidx/media3/ui/PlayerControlView;->onSkipToQueueItem:Landroid/graphics/drawable/Drawable;

    move/from16 v14, v32

    .line 774
    invoke-static {v4, v1, v14}, Lo/LaissezFaireSubTypeValidator;->read(Landroid/content/Context;Landroid/content/res/Resources;I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    iput-object v2, v0, Landroidx/media3/ui/PlayerControlView;->onSkipToNext:Landroid/graphics/drawable/Drawable;

    move/from16 v2, v36

    .line 775
    invoke-static {v4, v1, v2}, Lo/LaissezFaireSubTypeValidator;->read(Landroid/content/Context;Landroid/content/res/Resources;I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    iput-object v2, v0, Landroidx/media3/ui/PlayerControlView;->accessensureViewModelStore:Landroid/graphics/drawable/Drawable;

    .line 776
    invoke-static {v4, v1, v15}, Lo/LaissezFaireSubTypeValidator;->read(Landroid/content/Context;Landroid/content/res/Resources;I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    iput-object v2, v0, Landroidx/media3/ui/PlayerControlView;->_init_lambda4:Landroid/graphics/drawable/Drawable;

    .line 777
    sget v2, Lo/maximumCapacity$MediaBrowserCompatCustomActionResultReceiver;->exo_controls_fullscreen_exit_description:I

    .line 778
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Landroidx/media3/ui/PlayerControlView;->onCustomAction:Ljava/lang/String;

    .line 779
    sget v2, Lo/maximumCapacity$MediaBrowserCompatCustomActionResultReceiver;->exo_controls_fullscreen_enter_description:I

    .line 780
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Landroidx/media3/ui/PlayerControlView;->onCommand:Ljava/lang/String;

    .line 781
    sget v2, Lo/maximumCapacity$MediaBrowserCompatCustomActionResultReceiver;->exo_controls_repeat_off_description:I

    .line 782
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Landroidx/media3/ui/PlayerControlView;->setSessionImpl:Ljava/lang/String;

    .line 783
    sget v2, Lo/maximumCapacity$MediaBrowserCompatCustomActionResultReceiver;->exo_controls_repeat_one_description:I

    .line 784
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Landroidx/media3/ui/PlayerControlView;->onSkipToPrevious:Ljava/lang/String;

    .line 785
    sget v2, Lo/maximumCapacity$MediaBrowserCompatCustomActionResultReceiver;->exo_controls_repeat_all_description:I

    .line 786
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Landroidx/media3/ui/PlayerControlView;->onSetRepeatMode:Ljava/lang/String;

    .line 787
    sget v2, Lo/maximumCapacity$MediaBrowserCompatCustomActionResultReceiver;->exo_controls_shuffle_on_description:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Landroidx/media3/ui/PlayerControlView;->accessgetReportFullyDrawnExecutorp:Ljava/lang/String;

    .line 788
    sget v2, Lo/maximumCapacity$MediaBrowserCompatCustomActionResultReceiver;->exo_controls_shuffle_off_description:I

    .line 789
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Landroidx/media3/ui/PlayerControlView;->_init_lambda5:Ljava/lang/String;

    .line 792
    sget v1, Lo/maximumCapacity$AudioAttributesImplBaseParcelizer;->exo_bottom_bar:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/view/ViewGroup;

    const/4 v2, 0x1

    .line 793
    invoke-virtual {v12, v1, v2}, Lo/containsValue;->RemoteActionCompatParcelizer(Landroid/view/View;Z)V

    .line 794
    iget-object v1, v0, Landroidx/media3/ui/PlayerControlView;->MediaBrowserCompatSearchResultReceiver:Landroid/view/View;

    invoke-virtual {v12, v1, v8}, Lo/containsValue;->RemoteActionCompatParcelizer(Landroid/view/View;Z)V

    .line 795
    iget-object v1, v0, Landroidx/media3/ui/PlayerControlView;->MediaSessionCompatResultReceiverWrapper:Landroid/view/View;

    invoke-virtual {v12, v1, v7}, Lo/containsValue;->RemoteActionCompatParcelizer(Landroid/view/View;Z)V

    move-object/from16 v1, p4

    move/from16 v4, v18

    .line 796
    invoke-virtual {v12, v1, v4}, Lo/containsValue;->RemoteActionCompatParcelizer(Landroid/view/View;Z)V

    move-object/from16 v1, p2

    move/from16 v4, v16

    .line 797
    invoke-virtual {v12, v1, v4}, Lo/containsValue;->RemoteActionCompatParcelizer(Landroid/view/View;Z)V

    move/from16 v1, v33

    .line 798
    invoke-virtual {v12, v5, v1}, Lo/containsValue;->RemoteActionCompatParcelizer(Landroid/view/View;Z)V

    move/from16 v4, v34

    move-object/from16 v1, v41

    .line 799
    invoke-virtual {v12, v1, v4}, Lo/containsValue;->RemoteActionCompatParcelizer(Landroid/view/View;Z)V

    move-object/from16 v6, v19

    move/from16 v1, v35

    .line 800
    invoke-virtual {v12, v6, v1}, Lo/containsValue;->RemoteActionCompatParcelizer(Landroid/view/View;Z)V

    .line 801
    iget v1, v0, Landroidx/media3/ui/PlayerControlView;->MediaSessionCompatQueueItem:I

    if-eqz v1, :cond_566

    move v7, v2

    goto :goto_567

    :cond_566
    move v7, v3

    :goto_567
    move-object/from16 v3, v17

    invoke-virtual {v12, v3, v7}, Lo/containsValue;->RemoteActionCompatParcelizer(Landroid/view/View;Z)V

    .line 803
    new-instance v1, Lo/applyRead;

    invoke-direct {v1, v0}, Lo/applyRead;-><init>(Landroidx/media3/ui/PlayerControlView;)V

    invoke-virtual {v0, v1}, Landroidx/media3/ui/PlayerControlView;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    return-void
.end method

.method private AudioAttributesCompatParcelizer(Lo/collectAndResolveSubtypesByTypeId;I)Lo/initExtraTracks;
    .registers 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo/collectAndResolveSubtypesByTypeId;",
            "I)",
            "Lo/initExtraTracks<",
            "Landroidx/media3/ui/PlayerControlView$AudioAttributesImplApi26Parcelizer;",
            ">;"
        }
    .end annotation

    .line 1338
    new-instance v0, Lo/initExtraTracks$IconCompatParcelizer;

    invoke-direct {v0}, Lo/initExtraTracks$IconCompatParcelizer;-><init>()V

    .line 1339
    invoke-virtual {p1}, Lo/collectAndResolveSubtypesByTypeId;->IconCompatParcelizer()Lo/initExtraTracks;

    move-result-object v1

    const/4 v2, 0x0

    move v3, v2

    .line 1340
    :goto_b
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v4

    if-ge v3, v4, :cond_46

    .line 1341
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lo/collectAndResolveSubtypesByTypeId$write;

    .line 1342
    invoke-virtual {v4}, Lo/collectAndResolveSubtypesByTypeId$write;->AudioAttributesCompatParcelizer()I

    move-result v5

    if-ne v5, p2, :cond_43

    move v5, v2

    .line 1345
    :goto_1e
    iget v6, v4, Lo/collectAndResolveSubtypesByTypeId$write;->IconCompatParcelizer:I

    if-ge v5, v6, :cond_43

    .line 1346
    invoke-virtual {v4, v5}, Lo/collectAndResolveSubtypesByTypeId$write;->write(I)Z

    move-result v6

    if-eqz v6, :cond_40

    .line 1349
    invoke-virtual {v4, v5}, Lo/collectAndResolveSubtypesByTypeId$write;->RemoteActionCompatParcelizer(I)Lo/format;

    move-result-object v6

    .line 1350
    iget v7, v6, Lo/format;->onRewind:I

    and-int/lit8 v7, v7, 0x2

    if-nez v7, :cond_40

    .line 1353
    iget-object v7, p0, Landroidx/media3/ui/PlayerControlView;->getSavedStateRegistryControllerannotations:Lo/PrivateMaxEntriesMapUpdateTask;

    invoke-interface {v7, v6}, Lo/PrivateMaxEntriesMapUpdateTask;->write(Lo/format;)Ljava/lang/String;

    move-result-object v6

    .line 1354
    new-instance v7, Landroidx/media3/ui/PlayerControlView$AudioAttributesImplApi26Parcelizer;

    invoke-direct {v7, p1, v3, v5, v6}, Landroidx/media3/ui/PlayerControlView$AudioAttributesImplApi26Parcelizer;-><init>(Lo/collectAndResolveSubtypesByTypeId;IILjava/lang/String;)V

    invoke-virtual {v0, v7}, Lo/initExtraTracks$IconCompatParcelizer;->write(Ljava/lang/Object;)Lo/initExtraTracks$IconCompatParcelizer;

    :cond_40
    add-int/lit8 v5, v5, 0x1

    goto :goto_1e

    :cond_43
    add-int/lit8 v3, v3, 0x1

    goto :goto_b

    .line 1357
    :cond_46
    invoke-virtual {v0}, Lo/initExtraTracks$IconCompatParcelizer;->IconCompatParcelizer()Lo/initExtraTracks;

    move-result-object p0

    return-object p0
.end method

.method private AudioAttributesCompatParcelizer(F)V
    .registers 4

    .line 1529
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView;->onSetRating:Lo/isUnsafeBaseType;

    if-eqz v0, :cond_19

    const/16 v1, 0xd

    invoke-interface {v0, v1}, Lo/isUnsafeBaseType;->write(I)Z

    move-result v0

    if-eqz v0, :cond_19

    .line 1532
    iget-object p0, p0, Landroidx/media3/ui/PlayerControlView;->onSetRating:Lo/isUnsafeBaseType;

    invoke-interface {p0}, Lo/isUnsafeBaseType;->onRemoveQueueItemAt()Lo/DefaultBaseTypeLimitingValidatorUnsafeBaseTypes;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/DefaultBaseTypeLimitingValidatorUnsafeBaseTypes;->RemoteActionCompatParcelizer(F)Lo/DefaultBaseTypeLimitingValidatorUnsafeBaseTypes;

    move-result-object p1

    invoke-interface {p0, p1}, Lo/isUnsafeBaseType;->AudioAttributesCompatParcelizer(Lo/DefaultBaseTypeLimitingValidatorUnsafeBaseTypes;)V

    :cond_19
    return-void
.end method

.method public static synthetic AudioAttributesCompatParcelizer(Landroidx/media3/ui/PlayerControlView;)V
    .registers 1

    .line 1788
    invoke-direct {p0}, Landroidx/media3/ui/PlayerControlView;->onCommand()V

    return-void
.end method

.method private AudioAttributesCompatParcelizer(ZLandroid/view/View;)V
    .registers 3

    if-nez p2, :cond_3

    return-void

    .line 1545
    :cond_3
    invoke-virtual {p2, p1}, Landroid/view/View;->setEnabled(Z)V

    if-eqz p1, :cond_b

    .line 1546
    iget p0, p0, Landroidx/media3/ui/PlayerControlView;->MediaBrowserCompatCustomActionResultReceiver:F

    goto :goto_d

    :cond_b
    iget p0, p0, Landroidx/media3/ui/PlayerControlView;->write:F

    :goto_d
    invoke-virtual {p2, p0}, Landroid/view/View;->setAlpha(F)V

    return-void
.end method

.method static synthetic AudioAttributesImplApi21Parcelizer(Landroidx/media3/ui/PlayerControlView;)Lo/containsValue;
    .registers 1

    .line 289
    iget-object p0, p0, Landroidx/media3/ui/PlayerControlView;->AudioAttributesImplApi26Parcelizer:Lo/containsValue;

    return-object p0
.end method

.method static synthetic AudioAttributesImplApi26Parcelizer(Landroidx/media3/ui/PlayerControlView;)Lo/isUnsafeBaseType;
    .registers 1

    .line 289
    iget-object p0, p0, Landroidx/media3/ui/PlayerControlView;->onSetRating:Lo/isUnsafeBaseType;

    return-object p0
.end method

.method static synthetic AudioAttributesImplBaseParcelizer(Landroidx/media3/ui/PlayerControlView;)Ljava/util/Formatter;
    .registers 1

    .line 289
    iget-object p0, p0, Landroidx/media3/ui/PlayerControlView;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Ljava/util/Formatter;

    return-object p0
.end method

.method private IconCompatParcelizer(I)V
    .registers 3

    if-nez p1, :cond_10

    .line 1605
    iget-object p1, p0, Landroidx/media3/ui/PlayerControlView;->onRemoveQueueItem:Landroidx/media3/ui/PlayerControlView$IconCompatParcelizer;

    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView;->r8lambdaKUbBm7ckfqTc9QCgukC86fguu4:Landroid/view/View;

    invoke-static {v0}, Lo/buildTypeSerializer;->IconCompatParcelizer(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    invoke-direct {p0, p1, v0}, Landroidx/media3/ui/PlayerControlView;->IconCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;Landroid/view/View;)V

    return-void

    :cond_10
    const/4 v0, 0x1

    if-ne p1, v0, :cond_21

    .line 1607
    iget-object p1, p0, Landroidx/media3/ui/PlayerControlView;->read:Landroidx/media3/ui/PlayerControlView$write;

    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView;->r8lambdaKUbBm7ckfqTc9QCgukC86fguu4:Landroid/view/View;

    invoke-static {v0}, Lo/buildTypeSerializer;->IconCompatParcelizer(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    invoke-direct {p0, p1, v0}, Landroidx/media3/ui/PlayerControlView;->IconCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;Landroid/view/View;)V

    return-void

    .line 1609
    :cond_21
    iget-object p0, p0, Landroidx/media3/ui/PlayerControlView;->PlaybackStateCompatCustomAction:Landroid/widget/PopupWindow;

    invoke-virtual {p0}, Landroid/widget/PopupWindow;->dismiss()V

    return-void
.end method

.method public static synthetic IconCompatParcelizer(Landroidx/media3/ui/PlayerControlView;)V
    .registers 1

    .line 1787
    invoke-direct {p0}, Landroidx/media3/ui/PlayerControlView;->MediaDescriptionCompat()V

    return-void
.end method

.method static synthetic IconCompatParcelizer(Landroidx/media3/ui/PlayerControlView;F)V
    .registers 2

    .line 289
    invoke-direct {p0, p1}, Landroidx/media3/ui/PlayerControlView;->AudioAttributesCompatParcelizer(F)V

    return-void
.end method

.method private IconCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;Landroid/view/View;)V
    .registers 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer<",
            "*>;",
            "Landroid/view/View;",
            ")V"
        }
    .end annotation

    .line 1514
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView;->r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;)V

    .line 1516
    invoke-direct {p0}, Landroidx/media3/ui/PlayerControlView;->onPlay()V

    const/4 p1, 0x0

    .line 1518
    iput-boolean p1, p0, Landroidx/media3/ui/PlayerControlView;->onPrepare:Z

    .line 1519
    iget-object p1, p0, Landroidx/media3/ui/PlayerControlView;->PlaybackStateCompatCustomAction:Landroid/widget/PopupWindow;

    invoke-virtual {p1}, Landroid/widget/PopupWindow;->dismiss()V

    const/4 p1, 0x1

    .line 1520
    iput-boolean p1, p0, Landroidx/media3/ui/PlayerControlView;->onPrepare:Z

    .line 1522
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result p1

    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView;->PlaybackStateCompatCustomAction:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->getWidth()I

    move-result v0

    iget v1, p0, Landroidx/media3/ui/PlayerControlView;->_init_lambda2:I

    .line 1523
    iget-object v2, p0, Landroidx/media3/ui/PlayerControlView;->PlaybackStateCompatCustomAction:Landroid/widget/PopupWindow;

    invoke-virtual {v2}, Landroid/widget/PopupWindow;->getHeight()I

    move-result v2

    neg-int v2, v2

    iget v3, p0, Landroidx/media3/ui/PlayerControlView;->_init_lambda2:I

    .line 1525
    iget-object p0, p0, Landroidx/media3/ui/PlayerControlView;->PlaybackStateCompatCustomAction:Landroid/widget/PopupWindow;

    sub-int/2addr p1, v0

    sub-int/2addr p1, v1

    sub-int/2addr v2, v3

    invoke-virtual {p0, p2, p1, v2}, Landroid/widget/PopupWindow;->showAsDropDown(Landroid/view/View;II)V

    return-void
.end method

.method private IconCompatParcelizer(Lo/isUnsafeBaseType;J)V
    .registers 10

    .line 1550
    iget-boolean v0, p0, Landroidx/media3/ui/PlayerControlView;->onFastForward:Z

    if-eqz v0, :cond_39

    const/16 v0, 0x11

    .line 1551
    invoke-interface {p1, v0}, Lo/isUnsafeBaseType;->write(I)Z

    move-result v0

    if-eqz v0, :cond_43

    const/16 v0, 0xa

    .line 1552
    invoke-interface {p1, v0}, Lo/isUnsafeBaseType;->write(I)Z

    move-result v0

    if-eqz v0, :cond_43

    .line 1553
    invoke-interface {p1}, Lo/isUnsafeBaseType;->onPrepare()Lo/PolymorphicTypeValidator;

    move-result-object v0

    .line 1554
    invoke-virtual {v0}, Lo/PolymorphicTypeValidator;->AudioAttributesCompatParcelizer()I

    move-result v1

    const/4 v2, 0x0

    .line 1557
    :goto_1d
    iget-object v3, p0, Landroidx/media3/ui/PlayerControlView;->addOnNewIntentListener:Lo/PolymorphicTypeValidator$IconCompatParcelizer;

    invoke-virtual {v0, v2, v3}, Lo/PolymorphicTypeValidator;->RemoteActionCompatParcelizer(ILo/PolymorphicTypeValidator$IconCompatParcelizer;)Lo/PolymorphicTypeValidator$IconCompatParcelizer;

    move-result-object v3

    invoke-virtual {v3}, Lo/PolymorphicTypeValidator$IconCompatParcelizer;->write()J

    move-result-wide v3

    cmp-long v5, p2, v3

    if-ltz v5, :cond_35

    add-int/lit8 v5, v1, -0x1

    if-ne v2, v5, :cond_31

    move-wide p2, v3

    goto :goto_35

    :cond_31
    sub-long/2addr p2, v3

    add-int/lit8 v2, v2, 0x1

    goto :goto_1d

    .line 1568
    :cond_35
    :goto_35
    invoke-interface {p1, v2, p2, p3}, Lo/isUnsafeBaseType;->IconCompatParcelizer(IJ)V

    goto :goto_43

    :cond_39
    const/4 v0, 0x5

    .line 1570
    invoke-interface {p1, v0}, Lo/isUnsafeBaseType;->write(I)Z

    move-result v0

    if-eqz v0, :cond_43

    .line 1571
    invoke-interface {p1, p2, p3}, Lo/isUnsafeBaseType;->AudioAttributesCompatParcelizer(J)V

    .line 1573
    :cond_43
    :goto_43
    invoke-direct {p0}, Landroidx/media3/ui/PlayerControlView;->onCommand()V

    return-void
.end method

.method private MediaBrowserCompatCustomActionResultReceiver()V
    .registers 4

    .line 1320
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView;->accessonBackPresseds1027565324:Landroidx/media3/ui/PlayerControlView$AudioAttributesImplBaseParcelizer;

    invoke-virtual {v0}, Landroidx/media3/ui/PlayerControlView$AudioAttributesImplBaseParcelizer;->AudioAttributesCompatParcelizer()V

    .line 1321
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView;->read:Landroidx/media3/ui/PlayerControlView$write;

    invoke-virtual {v0}, Landroidx/media3/ui/PlayerControlView$write;->AudioAttributesCompatParcelizer()V

    .line 1322
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView;->onSetRating:Lo/isUnsafeBaseType;

    if-eqz v0, :cond_4e

    const/16 v1, 0x1e

    .line 1323
    invoke-interface {v0, v1}, Lo/isUnsafeBaseType;->write(I)Z

    move-result v0

    if-eqz v0, :cond_4e

    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView;->onSetRating:Lo/isUnsafeBaseType;

    const/16 v1, 0x1d

    .line 1324
    invoke-interface {v0, v1}, Lo/isUnsafeBaseType;->write(I)Z

    move-result v0

    if-eqz v0, :cond_4e

    .line 1327
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView;->onSetRating:Lo/isUnsafeBaseType;

    invoke-interface {v0}, Lo/isUnsafeBaseType;->onPrepareFromSearch()Lo/collectAndResolveSubtypesByTypeId;

    move-result-object v0

    .line 1328
    iget-object v1, p0, Landroidx/media3/ui/PlayerControlView;->read:Landroidx/media3/ui/PlayerControlView$write;

    const/4 v2, 0x1

    invoke-direct {p0, v0, v2}, Landroidx/media3/ui/PlayerControlView;->AudioAttributesCompatParcelizer(Lo/collectAndResolveSubtypesByTypeId;I)Lo/initExtraTracks;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroidx/media3/ui/PlayerControlView$write;->read(Ljava/util/List;)V

    .line 1329
    iget-object v1, p0, Landroidx/media3/ui/PlayerControlView;->AudioAttributesImplApi26Parcelizer:Lo/containsValue;

    iget-object v2, p0, Landroidx/media3/ui/PlayerControlView;->accessaddObserverForBackInvoker:Landroid/widget/ImageView;

    invoke-virtual {v1, v2}, Lo/containsValue;->write(Landroid/view/View;)Z

    move-result v1

    if-eqz v1, :cond_45

    .line 1330
    iget-object v1, p0, Landroidx/media3/ui/PlayerControlView;->accessonBackPresseds1027565324:Landroidx/media3/ui/PlayerControlView$AudioAttributesImplBaseParcelizer;

    const/4 v2, 0x3

    invoke-direct {p0, v0, v2}, Landroidx/media3/ui/PlayerControlView;->AudioAttributesCompatParcelizer(Lo/collectAndResolveSubtypesByTypeId;I)Lo/initExtraTracks;

    move-result-object p0

    invoke-virtual {v1, p0}, Landroidx/media3/ui/PlayerControlView$AudioAttributesImplBaseParcelizer;->AudioAttributesCompatParcelizer(Ljava/util/List;)V

    return-void

    .line 1332
    :cond_45
    iget-object p0, p0, Landroidx/media3/ui/PlayerControlView;->accessonBackPresseds1027565324:Landroidx/media3/ui/PlayerControlView$AudioAttributesImplBaseParcelizer;

    invoke-static {}, Lo/initExtraTracks;->AudioAttributesImplApi26Parcelizer()Lo/initExtraTracks;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroidx/media3/ui/PlayerControlView$AudioAttributesImplBaseParcelizer;->AudioAttributesCompatParcelizer(Ljava/util/List;)V

    :cond_4e
    return-void
.end method

.method static synthetic MediaBrowserCompatCustomActionResultReceiver(Landroidx/media3/ui/PlayerControlView;)Z
    .registers 1

    .line 289
    iget-boolean p0, p0, Landroidx/media3/ui/PlayerControlView;->onPrepare:Z

    return p0
.end method

.method static synthetic MediaBrowserCompatItemReceiver(Landroidx/media3/ui/PlayerControlView;)Landroid/widget/ImageView;
    .registers 1

    .line 289
    iget-object p0, p0, Landroidx/media3/ui/PlayerControlView;->onPlayFromUri:Landroid/widget/ImageView;

    return-object p0
.end method

.method private MediaBrowserCompatMediaItem()Z
    .registers 4

    .line 1720
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView;->onSetRating:Lo/isUnsafeBaseType;

    if-eqz v0, :cond_22

    const/4 v1, 0x1

    .line 1721
    invoke-interface {v0, v1}, Lo/isUnsafeBaseType;->write(I)Z

    move-result v0

    if-eqz v0, :cond_22

    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView;->onSetRating:Lo/isUnsafeBaseType;

    const/16 v2, 0x11

    .line 1722
    invoke-interface {v0, v2}, Lo/isUnsafeBaseType;->write(I)Z

    move-result v0

    if-eqz v0, :cond_21

    iget-object p0, p0, Landroidx/media3/ui/PlayerControlView;->onSetRating:Lo/isUnsafeBaseType;

    .line 1723
    invoke-interface {p0}, Lo/isUnsafeBaseType;->onPrepare()Lo/PolymorphicTypeValidator;

    move-result-object p0

    invoke-virtual {p0}, Lo/PolymorphicTypeValidator;->RemoteActionCompatParcelizer()Z

    move-result p0

    if-nez p0, :cond_22

    :cond_21
    return v1

    :cond_22
    const/4 p0, 0x0

    return p0
.end method

.method static synthetic MediaBrowserCompatMediaItem(Landroidx/media3/ui/PlayerControlView;)Z
    .registers 1

    .line 289
    iget-boolean p0, p0, Landroidx/media3/ui/PlayerControlView;->r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28:Z

    return p0
.end method

.method static synthetic MediaBrowserCompatSearchResultReceiver(Landroidx/media3/ui/PlayerControlView;)Landroid/widget/ImageView;
    .registers 1

    .line 289
    iget-object p0, p0, Landroidx/media3/ui/PlayerControlView;->onRewind:Landroid/widget/ImageView;

    return-object p0
.end method

.method private MediaBrowserCompatSearchResultReceiver()V
    .registers 7

    .line 1186
    invoke-virtual {p0}, Landroidx/media3/ui/PlayerControlView;->read()Z

    move-result v0

    if-eqz v0, :cond_68

    iget-boolean v0, p0, Landroidx/media3/ui/PlayerControlView;->onMediaButtonEvent:Z

    if-eqz v0, :cond_68

    .line 1190
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView;->onSetRating:Lo/isUnsafeBaseType;

    if-eqz v0, :cond_3e

    .line 1198
    iget-boolean v1, p0, Landroidx/media3/ui/PlayerControlView;->r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0:Z

    if-eqz v1, :cond_21

    iget-object v1, p0, Landroidx/media3/ui/PlayerControlView;->addOnNewIntentListener:Lo/PolymorphicTypeValidator$IconCompatParcelizer;

    invoke-static {v0, v1}, Landroidx/media3/ui/PlayerControlView;->RemoteActionCompatParcelizer(Lo/isUnsafeBaseType;Lo/PolymorphicTypeValidator$IconCompatParcelizer;)Z

    move-result v1

    if-eqz v1, :cond_21

    const/16 v1, 0xa

    .line 1199
    invoke-interface {v0, v1}, Lo/isUnsafeBaseType;->write(I)Z

    move-result v1

    goto :goto_26

    :cond_21
    const/4 v1, 0x5

    .line 1200
    invoke-interface {v0, v1}, Lo/isUnsafeBaseType;->write(I)Z

    move-result v1

    :goto_26
    const/4 v2, 0x7

    .line 1201
    invoke-interface {v0, v2}, Lo/isUnsafeBaseType;->write(I)Z

    move-result v2

    const/16 v3, 0xb

    .line 1202
    invoke-interface {v0, v3}, Lo/isUnsafeBaseType;->write(I)Z

    move-result v3

    const/16 v4, 0xc

    .line 1203
    invoke-interface {v0, v4}, Lo/isUnsafeBaseType;->write(I)Z

    move-result v4

    const/16 v5, 0x9

    .line 1204
    invoke-interface {v0, v5}, Lo/isUnsafeBaseType;->write(I)Z

    move-result v0

    goto :goto_43

    :cond_3e
    const/4 v1, 0x0

    move v0, v1

    move v2, v0

    move v3, v2

    move v4, v3

    :goto_43
    if-eqz v3, :cond_48

    .line 1208
    invoke-direct {p0}, Landroidx/media3/ui/PlayerControlView;->handleMediaPlayPauseIfPendingOnHandler()V

    :cond_48
    if-eqz v4, :cond_4d

    .line 1211
    invoke-direct {p0}, Landroidx/media3/ui/PlayerControlView;->RatingCompat()V

    .line 1214
    :cond_4d
    iget-object v5, p0, Landroidx/media3/ui/PlayerControlView;->onSetShuffleMode:Landroid/widget/ImageView;

    invoke-direct {p0, v2, v5}, Landroidx/media3/ui/PlayerControlView;->AudioAttributesCompatParcelizer(ZLandroid/view/View;)V

    .line 1215
    iget-object v2, p0, Landroidx/media3/ui/PlayerControlView;->MediaSessionCompatResultReceiverWrapper:Landroid/view/View;

    invoke-direct {p0, v3, v2}, Landroidx/media3/ui/PlayerControlView;->AudioAttributesCompatParcelizer(ZLandroid/view/View;)V

    .line 1216
    iget-object v2, p0, Landroidx/media3/ui/PlayerControlView;->MediaBrowserCompatSearchResultReceiver:Landroid/view/View;

    invoke-direct {p0, v4, v2}, Landroidx/media3/ui/PlayerControlView;->AudioAttributesCompatParcelizer(ZLandroid/view/View;)V

    .line 1217
    iget-object v2, p0, Landroidx/media3/ui/PlayerControlView;->onPlayFromUri:Landroid/widget/ImageView;

    invoke-direct {p0, v0, v2}, Landroidx/media3/ui/PlayerControlView;->AudioAttributesCompatParcelizer(ZLandroid/view/View;)V

    .line 1218
    iget-object p0, p0, Landroidx/media3/ui/PlayerControlView;->addMenuProvider:Lo/PrivateMaxEntriesMapRemovalTask;

    if-eqz p0, :cond_68

    .line 1219
    invoke-interface {p0, v1}, Lo/PrivateMaxEntriesMapRemovalTask;->setEnabled(Z)V

    :cond_68
    return-void
.end method

.method static synthetic MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(Landroidx/media3/ui/PlayerControlView;)Landroidx/media3/ui/PlayerControlView$AudioAttributesImplApi21Parcelizer;
    .registers 1

    .line 289
    iget-object p0, p0, Landroidx/media3/ui/PlayerControlView;->r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw:Landroidx/media3/ui/PlayerControlView$AudioAttributesImplApi21Parcelizer;

    return-object p0
.end method

.method private MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()V
    .registers 4

    .line 1254
    invoke-virtual {p0}, Landroidx/media3/ui/PlayerControlView;->read()Z

    move-result v0

    if-eqz v0, :cond_74

    iget-boolean v0, p0, Landroidx/media3/ui/PlayerControlView;->onMediaButtonEvent:Z

    if-eqz v0, :cond_74

    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView;->ParcelableVolumeInfo:Landroid/widget/ImageView;

    if-eqz v0, :cond_74

    .line 1258
    iget v1, p0, Landroidx/media3/ui/PlayerControlView;->MediaSessionCompatQueueItem:I

    const/4 v2, 0x0

    if-nez v1, :cond_17

    .line 1259
    invoke-direct {p0, v2, v0}, Landroidx/media3/ui/PlayerControlView;->AudioAttributesCompatParcelizer(ZLandroid/view/View;)V

    return-void

    .line 1263
    :cond_17
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView;->onSetRating:Lo/isUnsafeBaseType;

    if-eqz v0, :cond_61

    const/16 v1, 0xf

    .line 1264
    invoke-interface {v0, v1}, Lo/isUnsafeBaseType;->write(I)Z

    move-result v1

    if-eqz v1, :cond_61

    .line 1271
    iget-object v1, p0, Landroidx/media3/ui/PlayerControlView;->ParcelableVolumeInfo:Landroid/widget/ImageView;

    const/4 v2, 0x1

    invoke-direct {p0, v2, v1}, Landroidx/media3/ui/PlayerControlView;->AudioAttributesCompatParcelizer(ZLandroid/view/View;)V

    .line 1272
    invoke-interface {v0}, Lo/isUnsafeBaseType;->onSetShuffleMode()I

    move-result v0

    if-eqz v0, :cond_52

    if-eq v0, v2, :cond_43

    const/4 v1, 0x2

    if-ne v0, v1, :cond_74

    .line 1282
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView;->ParcelableVolumeInfo:Landroid/widget/ImageView;

    iget-object v1, p0, Landroidx/media3/ui/PlayerControlView;->onSkipToNext:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 1283
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView;->ParcelableVolumeInfo:Landroid/widget/ImageView;

    iget-object p0, p0, Landroidx/media3/ui/PlayerControlView;->onSetRepeatMode:Ljava/lang/String;

    invoke-virtual {v0, p0}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    return-void

    .line 1278
    :cond_43
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView;->ParcelableVolumeInfo:Landroid/widget/ImageView;

    iget-object v1, p0, Landroidx/media3/ui/PlayerControlView;->onSkipToQueueItem:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 1279
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView;->ParcelableVolumeInfo:Landroid/widget/ImageView;

    iget-object p0, p0, Landroidx/media3/ui/PlayerControlView;->onSkipToPrevious:Ljava/lang/String;

    invoke-virtual {v0, p0}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    return-void

    .line 1274
    :cond_52
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView;->ParcelableVolumeInfo:Landroid/widget/ImageView;

    iget-object v1, p0, Landroidx/media3/ui/PlayerControlView;->onStop:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 1275
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView;->ParcelableVolumeInfo:Landroid/widget/ImageView;

    iget-object p0, p0, Landroidx/media3/ui/PlayerControlView;->setSessionImpl:Ljava/lang/String;

    invoke-virtual {v0, p0}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    return-void

    .line 1265
    :cond_61
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView;->ParcelableVolumeInfo:Landroid/widget/ImageView;

    invoke-direct {p0, v2, v0}, Landroidx/media3/ui/PlayerControlView;->AudioAttributesCompatParcelizer(ZLandroid/view/View;)V

    .line 1266
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView;->ParcelableVolumeInfo:Landroid/widget/ImageView;

    iget-object v1, p0, Landroidx/media3/ui/PlayerControlView;->onStop:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 1267
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView;->ParcelableVolumeInfo:Landroid/widget/ImageView;

    iget-object p0, p0, Landroidx/media3/ui/PlayerControlView;->setSessionImpl:Ljava/lang/String;

    invoke-virtual {v0, p0}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    :cond_74
    return-void
.end method

.method static synthetic MediaDescriptionCompat(Landroidx/media3/ui/PlayerControlView;)Landroid/widget/ImageView;
    .registers 1

    .line 289
    iget-object p0, p0, Landroidx/media3/ui/PlayerControlView;->onSetShuffleMode:Landroid/widget/ImageView;

    return-object p0
.end method

.method private MediaDescriptionCompat()V
    .registers 3

    .line 1577
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView;->onPrepareFromMediaId:Landroidx/media3/ui/PlayerControlView$AudioAttributesCompatParcelizer;

    if-eqz v0, :cond_1d

    .line 1581
    iget-boolean v0, p0, Landroidx/media3/ui/PlayerControlView;->onPause:Z

    xor-int/lit8 v0, v0, 0x1

    iput-boolean v0, p0, Landroidx/media3/ui/PlayerControlView;->onPause:Z

    .line 1582
    iget-object v1, p0, Landroidx/media3/ui/PlayerControlView;->onAddQueueItem:Landroid/widget/ImageView;

    invoke-direct {p0, v1, v0}, Landroidx/media3/ui/PlayerControlView;->write(Landroid/widget/ImageView;Z)V

    .line 1583
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView;->onPlay:Landroid/widget/ImageView;

    iget-boolean v1, p0, Landroidx/media3/ui/PlayerControlView;->onPause:Z

    invoke-direct {p0, v0, v1}, Landroidx/media3/ui/PlayerControlView;->write(Landroid/widget/ImageView;Z)V

    .line 1584
    iget-object p0, p0, Landroidx/media3/ui/PlayerControlView;->onPrepareFromMediaId:Landroidx/media3/ui/PlayerControlView$AudioAttributesCompatParcelizer;

    if-eqz p0, :cond_1d

    .line 1585
    invoke-interface {p0}, Landroidx/media3/ui/PlayerControlView$AudioAttributesCompatParcelizer;->read()V

    :cond_1d
    return-void
.end method

.method static synthetic MediaMetadataCompat(Landroidx/media3/ui/PlayerControlView;)Landroid/view/View;
    .registers 1

    .line 289
    iget-object p0, p0, Landroidx/media3/ui/PlayerControlView;->MediaSessionCompatResultReceiverWrapper:Landroid/view/View;

    return-object p0
.end method

.method private MediaMetadataCompat()V
    .registers 4

    .line 1166
    invoke-virtual {p0}, Landroidx/media3/ui/PlayerControlView;->read()Z

    move-result v0

    if-eqz v0, :cond_3d

    iget-boolean v0, p0, Landroidx/media3/ui/PlayerControlView;->onMediaButtonEvent:Z

    if-eqz v0, :cond_3d

    .line 1169
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView;->onRewind:Landroid/widget/ImageView;

    if-eqz v0, :cond_3d

    .line 1170
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView;->onSetRating:Lo/isUnsafeBaseType;

    iget-boolean v1, p0, Landroidx/media3/ui/PlayerControlView;->r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28:Z

    invoke-static {v0, v1}, Lo/LaissezFaireSubTypeValidator;->RemoteActionCompatParcelizer(Lo/isUnsafeBaseType;Z)Z

    move-result v0

    if-eqz v0, :cond_1b

    .line 1171
    iget-object v1, p0, Landroidx/media3/ui/PlayerControlView;->onPrepareFromUri:Landroid/graphics/drawable/Drawable;

    goto :goto_1d

    :cond_1b
    iget-object v1, p0, Landroidx/media3/ui/PlayerControlView;->onPrepareFromSearch:Landroid/graphics/drawable/Drawable;

    :goto_1d
    if-eqz v0, :cond_22

    .line 1175
    sget v0, Lo/maximumCapacity$MediaBrowserCompatCustomActionResultReceiver;->exo_controls_play_description:I

    goto :goto_24

    .line 1176
    :cond_22
    sget v0, Lo/maximumCapacity$MediaBrowserCompatCustomActionResultReceiver;->exo_controls_pause_description:I

    .line 1177
    :goto_24
    iget-object v2, p0, Landroidx/media3/ui/PlayerControlView;->onRewind:Landroid/widget/ImageView;

    invoke-virtual {v2, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 1178
    iget-object v1, p0, Landroidx/media3/ui/PlayerControlView;->onRewind:Landroid/widget/ImageView;

    iget-object v2, p0, Landroidx/media3/ui/PlayerControlView;->MediaSessionCompatToken:Landroid/content/res/Resources;

    invoke-virtual {v2, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 1180
    invoke-direct {p0}, Landroidx/media3/ui/PlayerControlView;->MediaBrowserCompatMediaItem()Z

    move-result v0

    .line 1181
    iget-object v1, p0, Landroidx/media3/ui/PlayerControlView;->onRewind:Landroid/widget/ImageView;

    invoke-direct {p0, v0, v1}, Landroidx/media3/ui/PlayerControlView;->AudioAttributesCompatParcelizer(ZLandroid/view/View;)V

    :cond_3d
    return-void
.end method

.method static synthetic RatingCompat(Landroidx/media3/ui/PlayerControlView;)Landroid/view/View;
    .registers 1

    .line 289
    iget-object p0, p0, Landroidx/media3/ui/PlayerControlView;->MediaBrowserCompatSearchResultReceiver:Landroid/view/View;

    return-object p0
.end method

.method private RatingCompat()V
    .registers 5

    .line 1239
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView;->onSetRating:Lo/isUnsafeBaseType;

    if-eqz v0, :cond_9

    invoke-interface {v0}, Lo/isUnsafeBaseType;->onSetRepeatMode()J

    move-result-wide v0

    goto :goto_b

    :cond_9
    const-wide/16 v0, 0x3a98

    :goto_b
    const-wide/16 v2, 0x3e8

    .line 1240
    div-long/2addr v0, v2

    long-to-int v0, v0

    .line 1241
    iget-object v1, p0, Landroidx/media3/ui/PlayerControlView;->MediaDescriptionCompat:Landroid/widget/TextView;

    if-eqz v1, :cond_1a

    .line 1242
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1244
    :cond_1a
    iget-object v1, p0, Landroidx/media3/ui/PlayerControlView;->MediaBrowserCompatSearchResultReceiver:Landroid/view/View;

    if-eqz v1, :cond_31

    .line 1245
    iget-object p0, p0, Landroidx/media3/ui/PlayerControlView;->MediaSessionCompatToken:Landroid/content/res/Resources;

    sget v2, Lo/maximumCapacity$AudioAttributesImplApi26Parcelizer;->exo_controls_fastforward_by_amount_description:I

    .line 1249
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    .line 1246
    invoke-virtual {p0, v2, v0, v3}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    .line 1245
    invoke-virtual {v1, p0}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    :cond_31
    return-void
.end method

.method private static RemoteActionCompatParcelizer(Landroid/view/View;Z)V
    .registers 2

    if-nez p0, :cond_3

    return-void

    :cond_3
    if-eqz p1, :cond_a

    const/4 p1, 0x0

    .line 1776
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    return-void

    :cond_a
    const/16 p1, 0x8

    .line 1778
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method static synthetic RemoteActionCompatParcelizer(Landroidx/media3/ui/PlayerControlView;)V
    .registers 1

    .line 289
    invoke-direct {p0}, Landroidx/media3/ui/PlayerControlView;->onMediaButtonEvent()V

    return-void
.end method

.method static synthetic RemoteActionCompatParcelizer(Landroidx/media3/ui/PlayerControlView;Lo/isUnsafeBaseType;J)V
    .registers 4

    .line 289
    invoke-direct {p0, p1, p2, p3}, Landroidx/media3/ui/PlayerControlView;->IconCompatParcelizer(Lo/isUnsafeBaseType;J)V

    return-void
.end method

.method private static RemoteActionCompatParcelizer(I)Z
    .registers 2

    const/16 v0, 0x5a

    if-eq p0, v0, :cond_22

    const/16 v0, 0x59

    if-eq p0, v0, :cond_22

    const/16 v0, 0x55

    if-eq p0, v0, :cond_22

    const/16 v0, 0x4f

    if-eq p0, v0, :cond_22

    const/16 v0, 0x7e

    if-eq p0, v0, :cond_22

    const/16 v0, 0x7f

    if-eq p0, v0, :cond_22

    const/16 v0, 0x57

    if-eq p0, v0, :cond_22

    const/16 v0, 0x58

    if-eq p0, v0, :cond_22

    const/4 p0, 0x0

    return p0

    :cond_22
    const/4 p0, 0x1

    return p0
.end method

.method private static RemoteActionCompatParcelizer(Lo/isUnsafeBaseType;Lo/PolymorphicTypeValidator$IconCompatParcelizer;)Z
    .registers 10

    const/16 v0, 0x11

    .line 1746
    invoke-interface {p0, v0}, Lo/isUnsafeBaseType;->write(I)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_a

    return v1

    .line 1749
    :cond_a
    invoke-interface {p0}, Lo/isUnsafeBaseType;->onPrepare()Lo/PolymorphicTypeValidator;

    move-result-object p0

    .line 1750
    invoke-virtual {p0}, Lo/PolymorphicTypeValidator;->AudioAttributesCompatParcelizer()I

    move-result v0

    const/4 v2, 0x1

    if-le v0, v2, :cond_30

    const/16 v3, 0x64

    if-gt v0, v3, :cond_30

    move v3, v1

    :goto_1a
    if-ge v3, v0, :cond_2f

    .line 1755
    invoke-virtual {p0, v3, p1}, Lo/PolymorphicTypeValidator;->RemoteActionCompatParcelizer(ILo/PolymorphicTypeValidator$IconCompatParcelizer;)Lo/PolymorphicTypeValidator$IconCompatParcelizer;

    move-result-object v4

    iget-wide v4, v4, Lo/PolymorphicTypeValidator$IconCompatParcelizer;->IconCompatParcelizer:J

    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, v4, v6

    if-nez v4, :cond_2c

    return v1

    :cond_2c
    add-int/lit8 v3, v3, 0x1

    goto :goto_1a

    :cond_2f
    return v2

    :cond_30
    return v1
.end method

.method static synthetic handleMediaPlayPauseIfPendingOnHandler(Landroidx/media3/ui/PlayerControlView;)Landroid/widget/ImageView;
    .registers 1

    .line 289
    iget-object p0, p0, Landroidx/media3/ui/PlayerControlView;->ParcelableVolumeInfo:Landroid/widget/ImageView;

    return-object p0
.end method

.method private handleMediaPlayPauseIfPendingOnHandler()V
    .registers 5

    .line 1225
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView;->onSetRating:Lo/isUnsafeBaseType;

    if-eqz v0, :cond_9

    invoke-interface {v0}, Lo/isUnsafeBaseType;->onSetCaptioningEnabled()J

    move-result-wide v0

    goto :goto_b

    :cond_9
    const-wide/16 v0, 0x1388

    :goto_b
    const-wide/16 v2, 0x3e8

    .line 1226
    div-long/2addr v0, v2

    long-to-int v0, v0

    .line 1227
    iget-object v1, p0, Landroidx/media3/ui/PlayerControlView;->PlaybackStateCompat:Landroid/widget/TextView;

    if-eqz v1, :cond_1a

    .line 1228
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1230
    :cond_1a
    iget-object v1, p0, Landroidx/media3/ui/PlayerControlView;->MediaSessionCompatResultReceiverWrapper:Landroid/view/View;

    if-eqz v1, :cond_31

    .line 1231
    iget-object p0, p0, Landroidx/media3/ui/PlayerControlView;->MediaSessionCompatToken:Landroid/content/res/Resources;

    sget v2, Lo/maximumCapacity$AudioAttributesImplApi26Parcelizer;->exo_controls_rewind_by_amount_description:I

    .line 1233
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    .line 1232
    invoke-virtual {p0, v2, v0, v3}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    .line 1231
    invoke-virtual {v1, p0}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    :cond_31
    return-void
.end method

.method static synthetic onAddQueueItem(Landroidx/media3/ui/PlayerControlView;)I
    .registers 1

    .line 289
    iget p0, p0, Landroidx/media3/ui/PlayerControlView;->MediaSessionCompatQueueItem:I

    return p0
.end method

.method private onAddQueueItem()V
    .registers 3

    .line 1496
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView;->r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw:Landroidx/media3/ui/PlayerControlView$AudioAttributesImplApi21Parcelizer;

    invoke-virtual {v0}, Landroidx/media3/ui/PlayerControlView$AudioAttributesImplApi21Parcelizer;->read()Z

    move-result v0

    iget-object v1, p0, Landroidx/media3/ui/PlayerControlView;->r8lambdaKUbBm7ckfqTc9QCgukC86fguu4:Landroid/view/View;

    invoke-direct {p0, v0, v1}, Landroidx/media3/ui/PlayerControlView;->AudioAttributesCompatParcelizer(ZLandroid/view/View;)V

    return-void
.end method

.method static synthetic onCommand(Landroidx/media3/ui/PlayerControlView;)Landroid/view/View;
    .registers 1

    .line 289
    iget-object p0, p0, Landroidx/media3/ui/PlayerControlView;->r8lambdaKUbBm7ckfqTc9QCgukC86fguu4:Landroid/view/View;

    return-object p0
.end method

.method private onCommand()V
    .registers 14

    .line 1440
    invoke-virtual {p0}, Landroidx/media3/ui/PlayerControlView;->read()Z

    move-result v0

    if-eqz v0, :cond_98

    iget-boolean v0, p0, Landroidx/media3/ui/PlayerControlView;->onMediaButtonEvent:Z

    if-eqz v0, :cond_98

    .line 1443
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView;->onSetRating:Lo/isUnsafeBaseType;

    if-eqz v0, :cond_25

    const/16 v1, 0x10

    .line 1446
    invoke-interface {v0, v1}, Lo/isUnsafeBaseType;->write(I)Z

    move-result v1

    if-eqz v1, :cond_25

    .line 1447
    iget-wide v1, p0, Landroidx/media3/ui/PlayerControlView;->AudioAttributesImplBaseParcelizer:J

    invoke-interface {v0}, Lo/isUnsafeBaseType;->onAddQueueItem()J

    move-result-wide v3

    add-long/2addr v1, v3

    .line 1448
    iget-wide v3, p0, Landroidx/media3/ui/PlayerControlView;->AudioAttributesImplBaseParcelizer:J

    invoke-interface {v0}, Lo/isUnsafeBaseType;->onCustomAction()J

    move-result-wide v5

    add-long/2addr v3, v5

    goto :goto_28

    :cond_25
    const-wide/16 v1, 0x0

    move-wide v3, v1

    .line 1450
    :goto_28
    iget-object v5, p0, Landroidx/media3/ui/PlayerControlView;->onSetPlaybackSpeed:Landroid/widget/TextView;

    if-eqz v5, :cond_3b

    iget-boolean v6, p0, Landroidx/media3/ui/PlayerControlView;->ResultReceiver:Z

    if-nez v6, :cond_3b

    .line 1451
    iget-object v6, p0, Landroidx/media3/ui/PlayerControlView;->MediaMetadataCompat:Ljava/lang/StringBuilder;

    iget-object v7, p0, Landroidx/media3/ui/PlayerControlView;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Ljava/util/Formatter;

    invoke-static {v6, v7, v1, v2}, Lo/LaissezFaireSubTypeValidator;->read(Ljava/lang/StringBuilder;Ljava/util/Formatter;J)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1453
    :cond_3b
    iget-object v5, p0, Landroidx/media3/ui/PlayerControlView;->addMenuProvider:Lo/PrivateMaxEntriesMapRemovalTask;

    if-eqz v5, :cond_47

    .line 1454
    invoke-interface {v5, v1, v2}, Lo/PrivateMaxEntriesMapRemovalTask;->setPosition(J)V

    .line 1455
    iget-object v5, p0, Landroidx/media3/ui/PlayerControlView;->addMenuProvider:Lo/PrivateMaxEntriesMapRemovalTask;

    invoke-interface {v5, v3, v4}, Lo/PrivateMaxEntriesMapRemovalTask;->setBufferedPosition(J)V

    .line 1462
    :cond_47
    iget-object v3, p0, Landroidx/media3/ui/PlayerControlView;->addContentView:Ljava/lang/Runnable;

    invoke-virtual {p0, v3}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    const/4 v3, 0x1

    if-nez v0, :cond_51

    move v4, v3

    goto :goto_55

    .line 1463
    :cond_51
    invoke-interface {v0}, Lo/isUnsafeBaseType;->onRewind()I

    move-result v4

    :goto_55
    const-wide/16 v5, 0x3e8

    if-eqz v0, :cond_8e

    .line 1464
    invoke-interface {v0}, Lo/isUnsafeBaseType;->AudioAttributesImplBaseParcelizer()Z

    move-result v7

    if-eqz v7, :cond_8e

    .line 1466
    iget-object v3, p0, Landroidx/media3/ui/PlayerControlView;->addMenuProvider:Lo/PrivateMaxEntriesMapRemovalTask;

    if-eqz v3, :cond_68

    invoke-interface {v3}, Lo/PrivateMaxEntriesMapRemovalTask;->write()J

    move-result-wide v3

    goto :goto_69

    :cond_68
    move-wide v3, v5

    .line 1470
    :goto_69
    rem-long/2addr v1, v5

    sub-long v1, v5, v1

    invoke-static {v3, v4, v1, v2}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v1

    .line 1473
    invoke-interface {v0}, Lo/isUnsafeBaseType;->onRemoveQueueItemAt()Lo/DefaultBaseTypeLimitingValidatorUnsafeBaseTypes;

    move-result-object v0

    iget v0, v0, Lo/DefaultBaseTypeLimitingValidatorUnsafeBaseTypes;->AudioAttributesCompatParcelizer:F

    const/4 v3, 0x0

    cmpl-float v3, v0, v3

    if-lez v3, :cond_7e

    long-to-float v1, v1

    div-float/2addr v1, v0

    float-to-long v5, v1

    :cond_7e
    move-wide v7, v5

    .line 1478
    iget v0, p0, Landroidx/media3/ui/PlayerControlView;->menuHostHelperlambda0:I

    int-to-long v9, v0

    const-wide/16 v11, 0x3e8

    invoke-static/range {v7 .. v12}, Lo/LaissezFaireSubTypeValidator;->read(JJJ)J

    move-result-wide v0

    .line 1479
    iget-object v2, p0, Landroidx/media3/ui/PlayerControlView;->addContentView:Ljava/lang/Runnable;

    invoke-virtual {p0, v2, v0, v1}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void

    :cond_8e
    const/4 v0, 0x4

    if-eq v4, v0, :cond_98

    if-eq v4, v3, :cond_98

    .line 1481
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView;->addContentView:Ljava/lang/Runnable;

    invoke-virtual {p0, v0, v5, v6}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_98
    return-void
.end method

.method static synthetic onCustomAction(Landroidx/media3/ui/PlayerControlView;)Landroid/widget/ImageView;
    .registers 1

    .line 289
    iget-object p0, p0, Landroidx/media3/ui/PlayerControlView;->r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8:Landroid/widget/ImageView;

    return-object p0
.end method

.method private onCustomAction()V
    .registers 4

    .line 1486
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView;->onSetRating:Lo/isUnsafeBaseType;

    if-nez v0, :cond_5

    return-void

    .line 1489
    :cond_5
    iget-object v1, p0, Landroidx/media3/ui/PlayerControlView;->onRemoveQueueItem:Landroidx/media3/ui/PlayerControlView$IconCompatParcelizer;

    invoke-interface {v0}, Lo/isUnsafeBaseType;->onRemoveQueueItemAt()Lo/DefaultBaseTypeLimitingValidatorUnsafeBaseTypes;

    move-result-object v0

    iget v0, v0, Lo/DefaultBaseTypeLimitingValidatorUnsafeBaseTypes;->AudioAttributesCompatParcelizer:F

    invoke-virtual {v1, v0}, Landroidx/media3/ui/PlayerControlView$IconCompatParcelizer;->write(F)V

    .line 1490
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView;->r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw:Landroidx/media3/ui/PlayerControlView$AudioAttributesImplApi21Parcelizer;

    iget-object v1, p0, Landroidx/media3/ui/PlayerControlView;->onRemoveQueueItem:Landroidx/media3/ui/PlayerControlView$IconCompatParcelizer;

    .line 1491
    invoke-virtual {v1}, Landroidx/media3/ui/PlayerControlView$IconCompatParcelizer;->AudioAttributesCompatParcelizer()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    .line 1490
    invoke-virtual {v0, v2, v1}, Landroidx/media3/ui/PlayerControlView$AudioAttributesImplApi21Parcelizer;->IconCompatParcelizer(ILjava/lang/String;)V

    .line 1492
    invoke-direct {p0}, Landroidx/media3/ui/PlayerControlView;->onAddQueueItem()V

    return-void
.end method

.method static synthetic onFastForward(Landroidx/media3/ui/PlayerControlView;)Landroidx/media3/ui/PlayerControlView$write;
    .registers 1

    .line 289
    iget-object p0, p0, Landroidx/media3/ui/PlayerControlView;->read:Landroidx/media3/ui/PlayerControlView$write;

    return-object p0
.end method

.method private onFastForward()V
    .registers 4

    .line 1291
    invoke-virtual {p0}, Landroidx/media3/ui/PlayerControlView;->read()Z

    move-result v0

    if-eqz v0, :cond_63

    iget-boolean v0, p0, Landroidx/media3/ui/PlayerControlView;->onMediaButtonEvent:Z

    if-eqz v0, :cond_63

    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView;->r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8:Landroid/widget/ImageView;

    if-eqz v0, :cond_63

    .line 1295
    iget-object v1, p0, Landroidx/media3/ui/PlayerControlView;->onSetRating:Lo/isUnsafeBaseType;

    .line 1296
    iget-object v2, p0, Landroidx/media3/ui/PlayerControlView;->AudioAttributesImplApi26Parcelizer:Lo/containsValue;

    invoke-virtual {v2, v0}, Lo/containsValue;->write(Landroid/view/View;)Z

    move-result v0

    const/4 v2, 0x0

    if-nez v0, :cond_1f

    .line 1297
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView;->r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8:Landroid/widget/ImageView;

    invoke-direct {p0, v2, v0}, Landroidx/media3/ui/PlayerControlView;->AudioAttributesCompatParcelizer(ZLandroid/view/View;)V

    return-void

    :cond_1f
    if-eqz v1, :cond_50

    const/16 v0, 0xe

    .line 1298
    invoke-interface {v1, v0}, Lo/isUnsafeBaseType;->write(I)Z

    move-result v0

    if-eqz v0, :cond_50

    const/4 v0, 0x1

    .line 1303
    iget-object v2, p0, Landroidx/media3/ui/PlayerControlView;->r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8:Landroid/widget/ImageView;

    invoke-direct {p0, v0, v2}, Landroidx/media3/ui/PlayerControlView;->AudioAttributesCompatParcelizer(ZLandroid/view/View;)V

    .line 1304
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView;->r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8:Landroid/widget/ImageView;

    .line 1305
    invoke-interface {v1}, Lo/isUnsafeBaseType;->onSetPlaybackSpeed()Z

    move-result v2

    if-eqz v2, :cond_3a

    iget-object v2, p0, Landroidx/media3/ui/PlayerControlView;->accessensureViewModelStore:Landroid/graphics/drawable/Drawable;

    goto :goto_3c

    :cond_3a
    iget-object v2, p0, Landroidx/media3/ui/PlayerControlView;->_init_lambda4:Landroid/graphics/drawable/Drawable;

    .line 1304
    :goto_3c
    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 1306
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView;->r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8:Landroid/widget/ImageView;

    .line 1307
    invoke-interface {v1}, Lo/isUnsafeBaseType;->onSetPlaybackSpeed()Z

    move-result v1

    if-eqz v1, :cond_4a

    .line 1308
    iget-object p0, p0, Landroidx/media3/ui/PlayerControlView;->accessgetReportFullyDrawnExecutorp:Ljava/lang/String;

    goto :goto_4c

    .line 1309
    :cond_4a
    iget-object p0, p0, Landroidx/media3/ui/PlayerControlView;->_init_lambda5:Ljava/lang/String;

    .line 1306
    :goto_4c
    invoke-virtual {v0, p0}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    return-void

    .line 1299
    :cond_50
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView;->r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8:Landroid/widget/ImageView;

    invoke-direct {p0, v2, v0}, Landroidx/media3/ui/PlayerControlView;->AudioAttributesCompatParcelizer(ZLandroid/view/View;)V

    .line 1300
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView;->r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8:Landroid/widget/ImageView;

    iget-object v1, p0, Landroidx/media3/ui/PlayerControlView;->_init_lambda4:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 1301
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView;->r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8:Landroid/widget/ImageView;

    iget-object p0, p0, Landroidx/media3/ui/PlayerControlView;->_init_lambda5:Ljava/lang/String;

    invoke-virtual {v0, p0}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    :cond_63
    return-void
.end method

.method static synthetic onMediaButtonEvent(Landroidx/media3/ui/PlayerControlView;)Landroid/view/View;
    .registers 1

    .line 289
    iget-object p0, p0, Landroidx/media3/ui/PlayerControlView;->RemoteActionCompatParcelizer:Landroid/view/View;

    return-object p0
.end method

.method private onMediaButtonEvent()V
    .registers 3

    .line 1314
    invoke-direct {p0}, Landroidx/media3/ui/PlayerControlView;->MediaBrowserCompatCustomActionResultReceiver()V

    .line 1315
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView;->accessonBackPresseds1027565324:Landroidx/media3/ui/PlayerControlView$AudioAttributesImplBaseParcelizer;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;->getItemCount()I

    move-result v0

    if-lez v0, :cond_d

    const/4 v0, 0x1

    goto :goto_e

    :cond_d
    const/4 v0, 0x0

    :goto_e
    iget-object v1, p0, Landroidx/media3/ui/PlayerControlView;->accessaddObserverForBackInvoker:Landroid/widget/ImageView;

    invoke-direct {p0, v0, v1}, Landroidx/media3/ui/PlayerControlView;->AudioAttributesCompatParcelizer(ZLandroid/view/View;)V

    .line 1316
    invoke-direct {p0}, Landroidx/media3/ui/PlayerControlView;->onAddQueueItem()V

    return-void
.end method

.method static synthetic onPause(Landroidx/media3/ui/PlayerControlView;)V
    .registers 1

    .line 289
    invoke-direct {p0}, Landroidx/media3/ui/PlayerControlView;->MediaMetadataCompat()V

    return-void
.end method

.method static synthetic onPlay(Landroidx/media3/ui/PlayerControlView;)Landroidx/media3/ui/PlayerControlView$IconCompatParcelizer;
    .registers 1

    .line 289
    iget-object p0, p0, Landroidx/media3/ui/PlayerControlView;->onRemoveQueueItem:Landroidx/media3/ui/PlayerControlView$IconCompatParcelizer;

    return-object p0
.end method

.method private onPlay()V
    .registers 4

    .line 1500
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView;->r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM:Landroidx/recyclerview/widget/RecyclerView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, v1}, Landroid/view/View;->measure(II)V

    .line 1502
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v0

    iget v1, p0, Landroidx/media3/ui/PlayerControlView;->_init_lambda2:I

    .line 1503
    iget-object v2, p0, Landroidx/media3/ui/PlayerControlView;->r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v2}, Landroid/view/View;->getMeasuredWidth()I

    move-result v2

    shl-int/lit8 v1, v1, 0x1

    sub-int/2addr v0, v1

    .line 1504
    invoke-static {v2, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    .line 1505
    iget-object v1, p0, Landroidx/media3/ui/PlayerControlView;->PlaybackStateCompatCustomAction:Landroid/widget/PopupWindow;

    invoke-virtual {v1, v0}, Landroid/widget/PopupWindow;->setWidth(I)V

    .line 1507
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v0

    iget v1, p0, Landroidx/media3/ui/PlayerControlView;->_init_lambda2:I

    .line 1508
    iget-object v2, p0, Landroidx/media3/ui/PlayerControlView;->r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v2}, Landroid/view/View;->getMeasuredHeight()I

    move-result v2

    shl-int/lit8 v1, v1, 0x1

    sub-int/2addr v0, v1

    .line 1509
    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    move-result v0

    .line 1510
    iget-object p0, p0, Landroidx/media3/ui/PlayerControlView;->PlaybackStateCompatCustomAction:Landroid/widget/PopupWindow;

    invoke-virtual {p0, v0}, Landroid/widget/PopupWindow;->setHeight(I)V

    return-void
.end method

.method static synthetic onPlayFromMediaId(Landroidx/media3/ui/PlayerControlView;)Landroid/view/View;
    .registers 1

    .line 289
    iget-object p0, p0, Landroidx/media3/ui/PlayerControlView;->onSeekTo:Landroid/view/View;

    return-object p0
.end method

.method private onPlayFromMediaId()V
    .registers 22

    move-object/from16 v0, p0

    .line 1361
    iget-object v1, v0, Landroidx/media3/ui/PlayerControlView;->onSetRating:Lo/isUnsafeBaseType;

    if-nez v1, :cond_7

    return-void

    .line 1365
    :cond_7
    iget-boolean v2, v0, Landroidx/media3/ui/PlayerControlView;->r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0:Z

    const/4 v4, 0x1

    if-eqz v2, :cond_16

    iget-object v2, v0, Landroidx/media3/ui/PlayerControlView;->addOnNewIntentListener:Lo/PolymorphicTypeValidator$IconCompatParcelizer;

    invoke-static {v1, v2}, Landroidx/media3/ui/PlayerControlView;->RemoteActionCompatParcelizer(Lo/isUnsafeBaseType;Lo/PolymorphicTypeValidator$IconCompatParcelizer;)Z

    move-result v2

    if-eqz v2, :cond_16

    move v2, v4

    goto :goto_17

    :cond_16
    const/4 v2, 0x0

    :goto_17
    iput-boolean v2, v0, Landroidx/media3/ui/PlayerControlView;->onFastForward:Z

    const-wide/16 v5, 0x0

    .line 1366
    iput-wide v5, v0, Landroidx/media3/ui/PlayerControlView;->AudioAttributesImplBaseParcelizer:J

    const/16 v2, 0x11

    .line 1370
    invoke-interface {v1, v2}, Lo/isUnsafeBaseType;->write(I)Z

    move-result v2

    if-eqz v2, :cond_2a

    .line 1371
    invoke-interface {v1}, Lo/isUnsafeBaseType;->onPrepare()Lo/PolymorphicTypeValidator;

    move-result-object v2

    goto :goto_2c

    .line 1372
    :cond_2a
    sget-object v2, Lo/PolymorphicTypeValidator;->RemoteActionCompatParcelizer:Lo/PolymorphicTypeValidator;

    .line 1373
    :goto_2c
    invoke-virtual {v2}, Lo/PolymorphicTypeValidator;->RemoteActionCompatParcelizer()Z

    move-result v7

    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    if-nez v7, :cond_104

    .line 1374
    invoke-interface {v1}, Lo/isUnsafeBaseType;->onMediaButtonEvent()I

    move-result v1

    .line 1375
    iget-boolean v7, v0, Landroidx/media3/ui/PlayerControlView;->onFastForward:Z

    if-eqz v7, :cond_41

    const/4 v10, 0x0

    goto :goto_42

    :cond_41
    move v10, v1

    :goto_42
    if-eqz v7, :cond_4a

    .line 1376
    invoke-virtual {v2}, Lo/PolymorphicTypeValidator;->AudioAttributesCompatParcelizer()I

    move-result v7

    sub-int/2addr v7, v4

    goto :goto_4b

    :cond_4a
    move v7, v1

    :goto_4b
    move-wide v11, v5

    const/4 v13, 0x0

    :goto_4d
    if-gt v10, v7, :cond_102

    if-ne v10, v1, :cond_57

    .line 1379
    invoke-static {v11, v12}, Lo/LaissezFaireSubTypeValidator;->AudioAttributesCompatParcelizer(J)J

    move-result-wide v14

    iput-wide v14, v0, Landroidx/media3/ui/PlayerControlView;->AudioAttributesImplBaseParcelizer:J

    .line 1381
    :cond_57
    iget-object v14, v0, Landroidx/media3/ui/PlayerControlView;->addOnNewIntentListener:Lo/PolymorphicTypeValidator$IconCompatParcelizer;

    invoke-virtual {v2, v10, v14}, Lo/PolymorphicTypeValidator;->RemoteActionCompatParcelizer(ILo/PolymorphicTypeValidator$IconCompatParcelizer;)Lo/PolymorphicTypeValidator$IconCompatParcelizer;

    .line 1382
    iget-object v14, v0, Landroidx/media3/ui/PlayerControlView;->addOnNewIntentListener:Lo/PolymorphicTypeValidator$IconCompatParcelizer;

    iget-wide v14, v14, Lo/PolymorphicTypeValidator$IconCompatParcelizer;->IconCompatParcelizer:J

    cmp-long v14, v14, v8

    if-nez v14, :cond_6c

    .line 1383
    iget-boolean v1, v0, Landroidx/media3/ui/PlayerControlView;->onFastForward:Z

    xor-int/2addr v1, v4

    invoke-static {v1}, Lo/buildTypeSerializer;->write(Z)V

    goto/16 :goto_102

    .line 1386
    :cond_6c
    iget-object v14, v0, Landroidx/media3/ui/PlayerControlView;->addOnNewIntentListener:Lo/PolymorphicTypeValidator$IconCompatParcelizer;

    iget v14, v14, Lo/PolymorphicTypeValidator$IconCompatParcelizer;->RemoteActionCompatParcelizer:I

    :goto_70
    iget-object v15, v0, Landroidx/media3/ui/PlayerControlView;->addOnNewIntentListener:Lo/PolymorphicTypeValidator$IconCompatParcelizer;

    iget v15, v15, Lo/PolymorphicTypeValidator$IconCompatParcelizer;->AudioAttributesImplBaseParcelizer:I

    if-gt v14, v15, :cond_f5

    .line 1387
    iget-object v15, v0, Landroidx/media3/ui/PlayerControlView;->onPlayFromSearch:Lo/PolymorphicTypeValidator$AudioAttributesCompatParcelizer;

    invoke-virtual {v2, v14, v15}, Lo/PolymorphicTypeValidator;->AudioAttributesCompatParcelizer(ILo/PolymorphicTypeValidator$AudioAttributesCompatParcelizer;)Lo/PolymorphicTypeValidator$AudioAttributesCompatParcelizer;

    .line 1388
    iget-object v15, v0, Landroidx/media3/ui/PlayerControlView;->onPlayFromSearch:Lo/PolymorphicTypeValidator$AudioAttributesCompatParcelizer;

    invoke-virtual {v15}, Lo/PolymorphicTypeValidator$AudioAttributesCompatParcelizer;->AudioAttributesImplBaseParcelizer()I

    move-result v15

    .line 1389
    iget-object v3, v0, Landroidx/media3/ui/PlayerControlView;->onPlayFromSearch:Lo/PolymorphicTypeValidator$AudioAttributesCompatParcelizer;

    invoke-virtual {v3}, Lo/PolymorphicTypeValidator$AudioAttributesCompatParcelizer;->write()I

    move-result v3

    :goto_87
    if-ge v15, v3, :cond_ee

    .line 1391
    iget-object v4, v0, Landroidx/media3/ui/PlayerControlView;->onPlayFromSearch:Lo/PolymorphicTypeValidator$AudioAttributesCompatParcelizer;

    invoke-virtual {v4, v15}, Lo/PolymorphicTypeValidator$AudioAttributesCompatParcelizer;->write(I)J

    move-result-wide v17

    const-wide/high16 v19, -0x8000000000000000L

    cmp-long v4, v17, v19

    if-nez v4, :cond_a4

    .line 1393
    iget-object v4, v0, Landroidx/media3/ui/PlayerControlView;->onPlayFromSearch:Lo/PolymorphicTypeValidator$AudioAttributesCompatParcelizer;

    iget-wide v5, v4, Lo/PolymorphicTypeValidator$AudioAttributesCompatParcelizer;->read:J

    cmp-long v4, v5, v8

    if-nez v4, :cond_9e

    goto :goto_e7

    .line 1397
    :cond_9e
    iget-object v4, v0, Landroidx/media3/ui/PlayerControlView;->onPlayFromSearch:Lo/PolymorphicTypeValidator$AudioAttributesCompatParcelizer;

    iget-wide v4, v4, Lo/PolymorphicTypeValidator$AudioAttributesCompatParcelizer;->read:J

    move-wide/from16 v17, v4

    .line 1399
    :cond_a4
    iget-object v4, v0, Landroidx/media3/ui/PlayerControlView;->onPlayFromSearch:Lo/PolymorphicTypeValidator$AudioAttributesCompatParcelizer;

    invoke-virtual {v4}, Lo/PolymorphicTypeValidator$AudioAttributesCompatParcelizer;->IconCompatParcelizer()J

    move-result-wide v4

    add-long v17, v17, v4

    const-wide/16 v4, 0x0

    cmp-long v6, v17, v4

    if-ltz v6, :cond_e7

    .line 1401
    iget-object v6, v0, Landroidx/media3/ui/PlayerControlView;->AudioAttributesCompatParcelizer:[J

    array-length v4, v6

    if-ne v13, v4, :cond_cf

    .line 1402
    array-length v4, v6

    if-nez v4, :cond_bd

    const/4 v4, 0x1

    const/4 v5, 0x1

    goto :goto_c0

    :cond_bd
    array-length v4, v6

    const/4 v5, 0x1

    shl-int/2addr v4, v5

    .line 1403
    :goto_c0
    invoke-static {v6, v4}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object v6

    iput-object v6, v0, Landroidx/media3/ui/PlayerControlView;->AudioAttributesCompatParcelizer:[J

    .line 1404
    iget-object v6, v0, Landroidx/media3/ui/PlayerControlView;->onRemoveQueueItemAt:[Z

    invoke-static {v6, v4}, Ljava/util/Arrays;->copyOf([ZI)[Z

    move-result-object v4

    iput-object v4, v0, Landroidx/media3/ui/PlayerControlView;->onRemoveQueueItemAt:[Z

    goto :goto_d0

    :cond_cf
    const/4 v5, 0x1

    .line 1406
    :goto_d0
    iget-object v4, v0, Landroidx/media3/ui/PlayerControlView;->AudioAttributesCompatParcelizer:[J

    add-long v17, v17, v11

    invoke-static/range {v17 .. v18}, Lo/LaissezFaireSubTypeValidator;->AudioAttributesCompatParcelizer(J)J

    move-result-wide v16

    aput-wide v16, v4, v13

    .line 1407
    iget-object v4, v0, Landroidx/media3/ui/PlayerControlView;->onRemoveQueueItemAt:[Z

    iget-object v6, v0, Landroidx/media3/ui/PlayerControlView;->onPlayFromSearch:Lo/PolymorphicTypeValidator$AudioAttributesCompatParcelizer;

    invoke-virtual {v6, v15}, Lo/PolymorphicTypeValidator$AudioAttributesCompatParcelizer;->IconCompatParcelizer(I)Z

    move-result v6

    aput-boolean v6, v4, v13

    add-int/lit8 v13, v13, 0x1

    goto :goto_e8

    :cond_e7
    :goto_e7
    const/4 v5, 0x1

    :goto_e8
    add-int/lit8 v15, v15, 0x1

    move v4, v5

    const-wide/16 v5, 0x0

    goto :goto_87

    :cond_ee
    move v5, v4

    add-int/lit8 v14, v14, 0x1

    const-wide/16 v5, 0x0

    goto/16 :goto_70

    :cond_f5
    move v5, v4

    .line 1412
    iget-object v3, v0, Landroidx/media3/ui/PlayerControlView;->addOnNewIntentListener:Lo/PolymorphicTypeValidator$IconCompatParcelizer;

    iget-wide v3, v3, Lo/PolymorphicTypeValidator$IconCompatParcelizer;->IconCompatParcelizer:J

    add-long/2addr v11, v3

    add-int/lit8 v10, v10, 0x1

    move v4, v5

    const-wide/16 v5, 0x0

    goto/16 :goto_4d

    :cond_102
    :goto_102
    move-wide v5, v11

    goto :goto_11c

    :cond_104
    const/16 v2, 0x10

    .line 1414
    invoke-interface {v1, v2}, Lo/isUnsafeBaseType;->write(I)Z

    move-result v2

    if-eqz v2, :cond_119

    .line 1415
    invoke-interface {v1}, Lo/isUnsafeBaseType;->RemoteActionCompatParcelizer()J

    move-result-wide v1

    cmp-long v3, v1, v8

    if-eqz v3, :cond_119

    .line 1417
    invoke-static {v1, v2}, Lo/LaissezFaireSubTypeValidator;->IconCompatParcelizer(J)J

    move-result-wide v5

    goto :goto_11b

    :cond_119
    const-wide/16 v5, 0x0

    :goto_11b
    const/4 v13, 0x0

    .line 1420
    :goto_11c
    invoke-static {v5, v6}, Lo/LaissezFaireSubTypeValidator;->AudioAttributesCompatParcelizer(J)J

    move-result-wide v1

    .line 1421
    iget-object v3, v0, Landroidx/media3/ui/PlayerControlView;->AudioAttributesImplApi21Parcelizer:Landroid/widget/TextView;

    if-eqz v3, :cond_12f

    .line 1422
    iget-object v4, v0, Landroidx/media3/ui/PlayerControlView;->MediaMetadataCompat:Ljava/lang/StringBuilder;

    iget-object v5, v0, Landroidx/media3/ui/PlayerControlView;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Ljava/util/Formatter;

    invoke-static {v4, v5, v1, v2}, Lo/LaissezFaireSubTypeValidator;->read(Ljava/lang/StringBuilder;Ljava/util/Formatter;J)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1424
    :cond_12f
    iget-object v3, v0, Landroidx/media3/ui/PlayerControlView;->addMenuProvider:Lo/PrivateMaxEntriesMapRemovalTask;

    if-eqz v3, :cond_166

    .line 1425
    invoke-interface {v3, v1, v2}, Lo/PrivateMaxEntriesMapRemovalTask;->setDuration(J)V

    .line 1426
    iget-object v1, v0, Landroidx/media3/ui/PlayerControlView;->RatingCompat:[J

    array-length v1, v1

    add-int v2, v13, v1

    .line 1428
    iget-object v3, v0, Landroidx/media3/ui/PlayerControlView;->AudioAttributesCompatParcelizer:[J

    array-length v4, v3

    if-le v2, v4, :cond_14e

    .line 1429
    invoke-static {v3, v2}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object v3

    iput-object v3, v0, Landroidx/media3/ui/PlayerControlView;->AudioAttributesCompatParcelizer:[J

    .line 1430
    iget-object v3, v0, Landroidx/media3/ui/PlayerControlView;->onRemoveQueueItemAt:[Z

    invoke-static {v3, v2}, Ljava/util/Arrays;->copyOf([ZI)[Z

    move-result-object v3

    iput-object v3, v0, Landroidx/media3/ui/PlayerControlView;->onRemoveQueueItemAt:[Z

    .line 1432
    :cond_14e
    iget-object v3, v0, Landroidx/media3/ui/PlayerControlView;->RatingCompat:[J

    iget-object v4, v0, Landroidx/media3/ui/PlayerControlView;->AudioAttributesCompatParcelizer:[J

    const/4 v5, 0x0

    invoke-static {v3, v5, v4, v13, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1433
    iget-object v3, v0, Landroidx/media3/ui/PlayerControlView;->MediaBrowserCompatMediaItem:[Z

    iget-object v4, v0, Landroidx/media3/ui/PlayerControlView;->onRemoveQueueItemAt:[Z

    invoke-static {v3, v5, v4, v13, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1434
    iget-object v1, v0, Landroidx/media3/ui/PlayerControlView;->addMenuProvider:Lo/PrivateMaxEntriesMapRemovalTask;

    iget-object v3, v0, Landroidx/media3/ui/PlayerControlView;->AudioAttributesCompatParcelizer:[J

    iget-object v4, v0, Landroidx/media3/ui/PlayerControlView;->onRemoveQueueItemAt:[Z

    invoke-interface {v1, v3, v4, v2}, Lo/PrivateMaxEntriesMapRemovalTask;->setAdGroupTimesMs([J[ZI)V

    .line 1436
    :cond_166
    invoke-direct/range {p0 .. p0}, Landroidx/media3/ui/PlayerControlView;->onCommand()V

    return-void
.end method

.method static synthetic onPlayFromSearch(Landroidx/media3/ui/PlayerControlView;)Landroid/graphics/drawable/Drawable;
    .registers 1

    .line 289
    iget-object p0, p0, Landroidx/media3/ui/PlayerControlView;->addObserverForBackInvokerlambda7:Landroid/graphics/drawable/Drawable;

    return-object p0
.end method

.method static synthetic onPlayFromUri(Landroidx/media3/ui/PlayerControlView;)V
    .registers 1

    .line 289
    invoke-direct {p0}, Landroidx/media3/ui/PlayerControlView;->onCommand()V

    return-void
.end method

.method static synthetic onPrepare(Landroidx/media3/ui/PlayerControlView;)Landroidx/media3/ui/PlayerControlView$AudioAttributesImplBaseParcelizer;
    .registers 1

    .line 289
    iget-object p0, p0, Landroidx/media3/ui/PlayerControlView;->accessonBackPresseds1027565324:Landroidx/media3/ui/PlayerControlView$AudioAttributesImplBaseParcelizer;

    return-object p0
.end method

.method static synthetic onPrepareFromMediaId(Landroidx/media3/ui/PlayerControlView;)Landroid/widget/ImageView;
    .registers 1

    .line 289
    iget-object p0, p0, Landroidx/media3/ui/PlayerControlView;->accessaddObserverForBackInvoker:Landroid/widget/ImageView;

    return-object p0
.end method

.method static synthetic onPrepareFromSearch(Landroidx/media3/ui/PlayerControlView;)Landroid/widget/PopupWindow;
    .registers 1

    .line 289
    iget-object p0, p0, Landroidx/media3/ui/PlayerControlView;->PlaybackStateCompatCustomAction:Landroid/widget/PopupWindow;

    return-object p0
.end method

.method static synthetic onPrepareFromUri(Landroidx/media3/ui/PlayerControlView;)Landroid/graphics/drawable/Drawable;
    .registers 1

    .line 289
    iget-object p0, p0, Landroidx/media3/ui/PlayerControlView;->ensureViewModelStore:Landroid/graphics/drawable/Drawable;

    return-object p0
.end method

.method static synthetic onRemoveQueueItem(Landroidx/media3/ui/PlayerControlView;)Ljava/lang/String;
    .registers 1

    .line 289
    iget-object p0, p0, Landroidx/media3/ui/PlayerControlView;->createFullyDrawnExecutor:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic onRemoveQueueItemAt(Landroidx/media3/ui/PlayerControlView;)Ljava/lang/String;
    .registers 1

    .line 289
    iget-object p0, p0, Landroidx/media3/ui/PlayerControlView;->addObserverForBackInvoker:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic onRewind(Landroidx/media3/ui/PlayerControlView;)V
    .registers 1

    .line 289
    invoke-direct {p0}, Landroidx/media3/ui/PlayerControlView;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()V

    return-void
.end method

.method static synthetic onSeekTo(Landroidx/media3/ui/PlayerControlView;)V
    .registers 1

    .line 289
    invoke-direct {p0}, Landroidx/media3/ui/PlayerControlView;->onFastForward()V

    return-void
.end method

.method static synthetic onSetCaptioningEnabled(Landroidx/media3/ui/PlayerControlView;)V
    .registers 1

    .line 289
    invoke-direct {p0}, Landroidx/media3/ui/PlayerControlView;->onCustomAction()V

    return-void
.end method

.method static synthetic onSetPlaybackSpeed(Landroidx/media3/ui/PlayerControlView;)V
    .registers 1

    .line 289
    invoke-direct {p0}, Landroidx/media3/ui/PlayerControlView;->onPlayFromMediaId()V

    return-void
.end method

.method static synthetic onSetRepeatMode(Landroidx/media3/ui/PlayerControlView;)V
    .registers 1

    .line 289
    invoke-direct {p0}, Landroidx/media3/ui/PlayerControlView;->MediaBrowserCompatSearchResultReceiver()V

    return-void
.end method

.method static synthetic read(Landroidx/media3/ui/PlayerControlView;)Landroid/widget/TextView;
    .registers 1

    .line 289
    iget-object p0, p0, Landroidx/media3/ui/PlayerControlView;->onSetPlaybackSpeed:Landroid/widget/TextView;

    return-object p0
.end method

.method private read(Landroid/view/View;IIIIIIII)V
    .registers 16

    sub-int/2addr p4, p2

    sub-int/2addr p8, p6

    if-ne p4, p8, :cond_8

    sub-int/2addr p5, p3

    sub-int/2addr p9, p7

    if-eq p5, p9, :cond_35

    .line 1711
    :cond_8
    iget-object p2, p0, Landroidx/media3/ui/PlayerControlView;->PlaybackStateCompatCustomAction:Landroid/widget/PopupWindow;

    invoke-virtual {p2}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result p2

    if-eqz p2, :cond_35

    .line 1712
    invoke-direct {p0}, Landroidx/media3/ui/PlayerControlView;->onPlay()V

    .line 1713
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result p2

    iget-object p3, p0, Landroidx/media3/ui/PlayerControlView;->PlaybackStateCompatCustomAction:Landroid/widget/PopupWindow;

    invoke-virtual {p3}, Landroid/widget/PopupWindow;->getWidth()I

    move-result p3

    iget p4, p0, Landroidx/media3/ui/PlayerControlView;->_init_lambda2:I

    .line 1714
    iget-object p5, p0, Landroidx/media3/ui/PlayerControlView;->PlaybackStateCompatCustomAction:Landroid/widget/PopupWindow;

    invoke-virtual {p5}, Landroid/widget/PopupWindow;->getHeight()I

    move-result p5

    neg-int p5, p5

    iget p6, p0, Landroidx/media3/ui/PlayerControlView;->_init_lambda2:I

    .line 1715
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView;->PlaybackStateCompatCustomAction:Landroid/widget/PopupWindow;

    sub-int/2addr p2, p3

    sub-int v2, p2, p4

    sub-int v3, p5, p6

    const/4 v4, -0x1

    const/4 v5, -0x1

    move-object v1, p1

    invoke-virtual/range {v0 .. v5}, Landroid/widget/PopupWindow;->update(Landroid/view/View;IIII)V

    :cond_35
    return-void
.end method

.method static synthetic read(Landroidx/media3/ui/PlayerControlView;Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;Landroid/view/View;)V
    .registers 3

    .line 289
    invoke-direct {p0, p1, p2}, Landroidx/media3/ui/PlayerControlView;->IconCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;Landroid/view/View;)V

    return-void
.end method

.method private static write(Landroid/content/res/TypedArray;I)I
    .registers 3

    .line 1785
    sget v0, Lo/maximumCapacity$MediaDescriptionCompat;->PlayerControlView_repeat_toggle_modes:I

    invoke-virtual {p0, v0, p1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p0

    return p0
.end method

.method static synthetic write(Landroidx/media3/ui/PlayerControlView;)Ljava/lang/StringBuilder;
    .registers 1

    .line 289
    iget-object p0, p0, Landroidx/media3/ui/PlayerControlView;->MediaMetadataCompat:Ljava/lang/StringBuilder;

    return-object p0
.end method

.method private static write(Landroid/view/View;Landroid/view/View$OnClickListener;)V
    .registers 3

    if-nez p0, :cond_3

    return-void

    :cond_3
    const/16 v0, 0x8

    .line 1766
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    .line 1767
    invoke-virtual {p0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method private write(Landroid/widget/ImageView;Z)V
    .registers 3

    if-nez p1, :cond_3

    return-void

    :cond_3
    if-eqz p2, :cond_10

    .line 1595
    iget-object p2, p0, Landroidx/media3/ui/PlayerControlView;->onPlayFromMediaId:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 1596
    iget-object p0, p0, Landroidx/media3/ui/PlayerControlView;->onCustomAction:Ljava/lang/String;

    invoke-virtual {p1, p0}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    return-void

    .line 1598
    :cond_10
    iget-object p2, p0, Landroidx/media3/ui/PlayerControlView;->handleMediaPlayPauseIfPendingOnHandler:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 1599
    iget-object p0, p0, Landroidx/media3/ui/PlayerControlView;->onCommand:Ljava/lang/String;

    invoke-virtual {p1, p0}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    return-void
.end method

.method static synthetic write(Landroidx/media3/ui/PlayerControlView;I)V
    .registers 2

    .line 289
    invoke-direct {p0, p1}, Landroidx/media3/ui/PlayerControlView;->IconCompatParcelizer(I)V

    return-void
.end method

.method public static synthetic write(Landroidx/media3/ui/PlayerControlView;Landroid/view/View;IIIIIIII)V
    .registers 10

    .line 1786
    invoke-direct/range {p0 .. p9}, Landroidx/media3/ui/PlayerControlView;->read(Landroid/view/View;IIIIIIII)V

    return-void
.end method

.method static synthetic write(Landroidx/media3/ui/PlayerControlView;Z)Z
    .registers 2

    .line 289
    iput-boolean p1, p0, Landroidx/media3/ui/PlayerControlView;->ResultReceiver:Z

    return p1
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer()I
    .registers 1

    .line 969
    iget p0, p0, Landroidx/media3/ui/PlayerControlView;->_init_lambda3:I

    return p0
.end method

.method public final AudioAttributesImplApi21Parcelizer()V
    .registers 3

    .line 1150
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView;->getOnBackPressedDispatcherannotations:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_19

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/media3/ui/PlayerControlView$MediaBrowserCompatSearchResultReceiver;

    .line 1151
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    invoke-interface {v1}, Landroidx/media3/ui/PlayerControlView$MediaBrowserCompatSearchResultReceiver;->RemoteActionCompatParcelizer()V

    goto :goto_6

    :cond_19
    return-void
.end method

.method public final AudioAttributesImplApi26Parcelizer()V
    .registers 1

    .line 1125
    iget-object p0, p0, Landroidx/media3/ui/PlayerControlView;->AudioAttributesImplApi26Parcelizer:Lo/containsValue;

    invoke-virtual {p0}, Lo/containsValue;->AudioAttributesImplApi21Parcelizer()V

    return-void
.end method

.method public final AudioAttributesImplBaseParcelizer()V
    .registers 1

    .line 1536
    iget-object p0, p0, Landroidx/media3/ui/PlayerControlView;->onRewind:Landroid/widget/ImageView;

    if-eqz p0, :cond_7

    .line 1537
    invoke-virtual {p0}, Landroid/view/View;->requestFocus()Z

    :cond_7
    return-void
.end method

.method public final IconCompatParcelizer()Z
    .registers 1

    .line 1140
    iget-object p0, p0, Landroidx/media3/ui/PlayerControlView;->AudioAttributesImplApi26Parcelizer:Lo/containsValue;

    invoke-virtual {p0}, Lo/containsValue;->RemoteActionCompatParcelizer()Z

    move-result p0

    return p0
.end method

.method public final MediaBrowserCompatItemReceiver()V
    .registers 1

    .line 1156
    invoke-direct {p0}, Landroidx/media3/ui/PlayerControlView;->MediaMetadataCompat()V

    .line 1157
    invoke-direct {p0}, Landroidx/media3/ui/PlayerControlView;->MediaBrowserCompatSearchResultReceiver()V

    .line 1158
    invoke-direct {p0}, Landroidx/media3/ui/PlayerControlView;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()V

    .line 1159
    invoke-direct {p0}, Landroidx/media3/ui/PlayerControlView;->onFastForward()V

    .line 1160
    invoke-direct {p0}, Landroidx/media3/ui/PlayerControlView;->onMediaButtonEvent()V

    .line 1161
    invoke-direct {p0}, Landroidx/media3/ui/PlayerControlView;->onCustomAction()V

    .line 1162
    invoke-direct {p0}, Landroidx/media3/ui/PlayerControlView;->onPlayFromMediaId()V

    return-void
.end method

.method public final RemoteActionCompatParcelizer()V
    .registers 1

    .line 1130
    iget-object p0, p0, Landroidx/media3/ui/PlayerControlView;->AudioAttributesImplApi26Parcelizer:Lo/containsValue;

    invoke-virtual {p0}, Lo/containsValue;->IconCompatParcelizer()V

    return-void
.end method

.method public final RemoteActionCompatParcelizer(Landroidx/media3/ui/PlayerControlView$MediaBrowserCompatSearchResultReceiver;)V
    .registers 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 909
    iget-object p0, p0, Landroidx/media3/ui/PlayerControlView;->getOnBackPressedDispatcherannotations:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .registers 3

    .line 1635
    invoke-virtual {p0, p1}, Landroidx/media3/ui/PlayerControlView;->read(Landroid/view/KeyEvent;)Z

    move-result v0

    if-nez v0, :cond_e

    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result p0

    if-nez p0, :cond_e

    const/4 p0, 0x0

    return p0

    :cond_e
    const/4 p0, 0x1

    return p0
.end method

.method public onAttachedToWindow()V
    .registers 2

    .line 1615
    invoke-super {p0}, Landroid/widget/FrameLayout;->onAttachedToWindow()V

    .line 1616
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView;->AudioAttributesImplApi26Parcelizer:Lo/containsValue;

    invoke-virtual {v0}, Lo/containsValue;->write()V

    const/4 v0, 0x1

    .line 1617
    iput-boolean v0, p0, Landroidx/media3/ui/PlayerControlView;->onMediaButtonEvent:Z

    .line 1618
    invoke-virtual {p0}, Landroidx/media3/ui/PlayerControlView;->IconCompatParcelizer()Z

    move-result v0

    if-eqz v0, :cond_16

    .line 1619
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView;->AudioAttributesImplApi26Parcelizer:Lo/containsValue;

    invoke-virtual {v0}, Lo/containsValue;->MediaBrowserCompatCustomActionResultReceiver()V

    .line 1621
    :cond_16
    invoke-virtual {p0}, Landroidx/media3/ui/PlayerControlView;->MediaBrowserCompatItemReceiver()V

    return-void
.end method

.method public onDetachedFromWindow()V
    .registers 2

    .line 1626
    invoke-super {p0}, Landroid/widget/FrameLayout;->onDetachedFromWindow()V

    .line 1627
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView;->AudioAttributesImplApi26Parcelizer:Lo/containsValue;

    invoke-virtual {v0}, Lo/containsValue;->read()V

    const/4 v0, 0x0

    .line 1628
    iput-boolean v0, p0, Landroidx/media3/ui/PlayerControlView;->onMediaButtonEvent:Z

    .line 1629
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView;->addContentView:Ljava/lang/Runnable;

    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 1630
    iget-object p0, p0, Landroidx/media3/ui/PlayerControlView;->AudioAttributesImplApi26Parcelizer:Lo/containsValue;

    invoke-virtual {p0}, Lo/containsValue;->MediaBrowserCompatItemReceiver()V

    return-void
.end method

.method protected onLayout(ZIIII)V
    .registers 6

    .line 1692
    invoke-super/range {p0 .. p5}, Landroid/widget/FrameLayout;->onLayout(ZIIII)V

    .line 1693
    iget-object p0, p0, Landroidx/media3/ui/PlayerControlView;->AudioAttributesImplApi26Parcelizer:Lo/containsValue;

    invoke-virtual {p0, p2, p3, p4, p5}, Lo/containsValue;->AudioAttributesCompatParcelizer(IIII)V

    return-void
.end method

.method public final read()Z
    .registers 1

    .line 1145
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    move-result p0

    if-nez p0, :cond_8

    const/4 p0, 0x1

    return p0

    :cond_8
    const/4 p0, 0x0

    return p0
.end method

.method public final read(Landroid/view/KeyEvent;)Z
    .registers 5

    .line 1646
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    .line 1647
    iget-object v1, p0, Landroidx/media3/ui/PlayerControlView;->onSetRating:Lo/isUnsafeBaseType;

    if-eqz v1, :cond_7f

    .line 1648
    invoke-static {v0}, Landroidx/media3/ui/PlayerControlView;->RemoteActionCompatParcelizer(I)Z

    move-result v2

    if-eqz v2, :cond_7f

    .line 1651
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    move-result v2

    if-nez v2, :cond_7d

    const/16 v2, 0x5a

    if-ne v0, v2, :cond_2b

    .line 1653
    invoke-interface {v1}, Lo/isUnsafeBaseType;->onRewind()I

    move-result p0

    const/4 p1, 0x4

    if-eq p0, p1, :cond_7d

    const/16 p0, 0xc

    .line 1654
    invoke-interface {v1, p0}, Lo/isUnsafeBaseType;->write(I)Z

    move-result p0

    if-eqz p0, :cond_7d

    .line 1655
    invoke-interface {v1}, Lo/isUnsafeBaseType;->MediaDescriptionCompat()V

    goto :goto_7d

    :cond_2b
    const/16 v2, 0x59

    if-ne v0, v2, :cond_3b

    const/16 v2, 0xb

    .line 1658
    invoke-interface {v1, v2}, Lo/isUnsafeBaseType;->write(I)Z

    move-result v2

    if-eqz v2, :cond_3b

    .line 1659
    invoke-interface {v1}, Lo/isUnsafeBaseType;->MediaBrowserCompatSearchResultReceiver()V

    goto :goto_7d

    .line 1660
    :cond_3b
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getRepeatCount()I

    move-result p1

    if-nez p1, :cond_7d

    const/16 p1, 0x4f

    if-eq v0, p1, :cond_78

    const/16 p1, 0x55

    if-eq v0, p1, :cond_78

    const/16 p0, 0x57

    if-eq v0, p0, :cond_6c

    const/16 p0, 0x58

    if-eq v0, p0, :cond_61

    const/16 p0, 0x7e

    if-eq v0, p0, :cond_5d

    const/16 p0, 0x7f

    if-ne v0, p0, :cond_7d

    .line 1670
    invoke-static {v1}, Lo/LaissezFaireSubTypeValidator;->write(Lo/isUnsafeBaseType;)Z

    goto :goto_7d

    .line 1667
    :cond_5d
    invoke-static {v1}, Lo/LaissezFaireSubTypeValidator;->AudioAttributesCompatParcelizer(Lo/isUnsafeBaseType;)Z

    goto :goto_7d

    :cond_61
    const/4 p0, 0x7

    .line 1678
    invoke-interface {v1, p0}, Lo/isUnsafeBaseType;->write(I)Z

    move-result p0

    if-eqz p0, :cond_7d

    .line 1679
    invoke-interface {v1}, Lo/isUnsafeBaseType;->MediaBrowserCompatMediaItem()V

    goto :goto_7d

    :cond_6c
    const/16 p0, 0x9

    .line 1673
    invoke-interface {v1, p0}, Lo/isUnsafeBaseType;->write(I)Z

    move-result p0

    if-eqz p0, :cond_7d

    .line 1674
    invoke-interface {v1}, Lo/isUnsafeBaseType;->RatingCompat()V

    goto :goto_7d

    .line 1664
    :cond_78
    iget-boolean p0, p0, Landroidx/media3/ui/PlayerControlView;->r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28:Z

    invoke-static {v1, p0}, Lo/LaissezFaireSubTypeValidator;->IconCompatParcelizer(Lo/isUnsafeBaseType;Z)Z

    :cond_7d
    :goto_7d
    const/4 p0, 0x1

    return p0

    :cond_7f
    const/4 p0, 0x0

    return p0
.end method

.method public setAnimationEnabled(Z)V
    .registers 2

    .line 1081
    iget-object p0, p0, Landroidx/media3/ui/PlayerControlView;->AudioAttributesImplApi26Parcelizer:Lo/containsValue;

    invoke-virtual {p0, p1}, Lo/containsValue;->write(Z)V

    return-void
.end method

.method public setExtraAdGroupMarkers([J[Z)V
    .registers 6

    const/4 v0, 0x0

    if-nez p1, :cond_c

    .line 876
    new-array p1, v0, [J

    iput-object p1, p0, Landroidx/media3/ui/PlayerControlView;->RatingCompat:[J

    .line 877
    new-array p1, v0, [Z

    iput-object p1, p0, Landroidx/media3/ui/PlayerControlView;->MediaBrowserCompatMediaItem:[Z

    goto :goto_1e

    .line 879
    :cond_c
    invoke-static {p2}, Lo/buildTypeSerializer;->IconCompatParcelizer(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [Z

    .line 880
    array-length v1, p1

    array-length v2, p2

    if-ne v1, v2, :cond_17

    const/4 v0, 0x1

    :cond_17
    invoke-static {v0}, Lo/buildTypeSerializer;->IconCompatParcelizer(Z)V

    .line 881
    iput-object p1, p0, Landroidx/media3/ui/PlayerControlView;->RatingCompat:[J

    .line 882
    iput-object p2, p0, Landroidx/media3/ui/PlayerControlView;->MediaBrowserCompatMediaItem:[Z

    .line 884
    :goto_1e
    invoke-direct {p0}, Landroidx/media3/ui/PlayerControlView;->onPlayFromMediaId()V

    return-void
.end method

.method public setOnFullScreenModeChangedListener(Landroidx/media3/ui/PlayerControlView$AudioAttributesCompatParcelizer;)V
    .registers 6
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1115
    iput-object p1, p0, Landroidx/media3/ui/PlayerControlView;->onPrepareFromMediaId:Landroidx/media3/ui/PlayerControlView$AudioAttributesCompatParcelizer;

    .line 1116
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView;->onAddQueueItem:Landroid/widget/ImageView;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz p1, :cond_a

    move v3, v1

    goto :goto_b

    :cond_a
    move v3, v2

    :goto_b
    invoke-static {v0, v3}, Landroidx/media3/ui/PlayerControlView;->RemoteActionCompatParcelizer(Landroid/view/View;Z)V

    .line 1117
    iget-object p0, p0, Landroidx/media3/ui/PlayerControlView;->onPlay:Landroid/widget/ImageView;

    if-eqz p1, :cond_13

    goto :goto_14

    :cond_13
    move v1, v2

    :goto_14
    invoke-static {p0, v1}, Landroidx/media3/ui/PlayerControlView;->RemoteActionCompatParcelizer(Landroid/view/View;Z)V

    return-void
.end method

.method public setPlayer(Lo/isUnsafeBaseType;)V
    .registers 6

    .line 823
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-ne v0, v1, :cond_e

    move v0, v3

    goto :goto_f

    :cond_e
    move v0, v2

    :goto_f
    invoke-static {v0}, Lo/buildTypeSerializer;->write(Z)V

    if-eqz p1, :cond_1e

    .line 825
    invoke-interface {p1}, Lo/isUnsafeBaseType;->onCommand()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    if-ne v0, v1, :cond_1f

    :cond_1e
    move v2, v3

    .line 824
    :cond_1f
    invoke-static {v2}, Lo/buildTypeSerializer;->IconCompatParcelizer(Z)V

    .line 826
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView;->onSetRating:Lo/isUnsafeBaseType;

    if-ne v0, p1, :cond_27

    return-void

    :cond_27
    if-eqz v0, :cond_2e

    .line 830
    iget-object v1, p0, Landroidx/media3/ui/PlayerControlView;->MediaBrowserCompatItemReceiver:Landroidx/media3/ui/PlayerControlView$read;

    invoke-interface {v0, v1}, Lo/isUnsafeBaseType;->write(Lo/isUnsafeBaseType$AudioAttributesCompatParcelizer;)V

    .line 832
    :cond_2e
    iput-object p1, p0, Landroidx/media3/ui/PlayerControlView;->onSetRating:Lo/isUnsafeBaseType;

    if-eqz p1, :cond_37

    .line 834
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView;->MediaBrowserCompatItemReceiver:Landroidx/media3/ui/PlayerControlView$read;

    invoke-interface {p1, v0}, Lo/isUnsafeBaseType;->read(Lo/isUnsafeBaseType$AudioAttributesCompatParcelizer;)V

    .line 836
    :cond_37
    invoke-virtual {p0}, Landroidx/media3/ui/PlayerControlView;->MediaBrowserCompatItemReceiver()V

    return-void
.end method

.method public setProgressUpdateListener(Landroidx/media3/ui/PlayerControlView$RemoteActionCompatParcelizer;)V
    .registers 2

    .line 918
    iput-object p1, p0, Landroidx/media3/ui/PlayerControlView;->onSetCaptioningEnabled:Landroidx/media3/ui/PlayerControlView$RemoteActionCompatParcelizer;

    return-void
.end method

.method public setRepeatToggleModes(I)V
    .registers 6

    .line 1001
    iput p1, p0, Landroidx/media3/ui/PlayerControlView;->MediaSessionCompatQueueItem:I

    .line 1002
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView;->onSetRating:Lo/isUnsafeBaseType;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_34

    const/16 v3, 0xf

    invoke-interface {v0, v3}, Lo/isUnsafeBaseType;->write(I)Z

    move-result v0

    if-eqz v0, :cond_34

    .line 1003
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView;->onSetRating:Lo/isUnsafeBaseType;

    invoke-interface {v0}, Lo/isUnsafeBaseType;->onSetShuffleMode()I

    move-result v0

    if-nez p1, :cond_20

    if-eqz v0, :cond_20

    .line 1006
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView;->onSetRating:Lo/isUnsafeBaseType;

    invoke-interface {v0, v2}, Lo/isUnsafeBaseType;->IconCompatParcelizer(I)V

    goto :goto_34

    :cond_20
    const/4 v3, 0x2

    if-ne p1, v1, :cond_2b

    if-ne v0, v3, :cond_2b

    .line 1009
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView;->onSetRating:Lo/isUnsafeBaseType;

    invoke-interface {v0, v1}, Lo/isUnsafeBaseType;->IconCompatParcelizer(I)V

    goto :goto_34

    :cond_2b
    if-ne p1, v3, :cond_34

    if-ne v0, v1, :cond_34

    .line 1012
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView;->onSetRating:Lo/isUnsafeBaseType;

    invoke-interface {v0, v3}, Lo/isUnsafeBaseType;->IconCompatParcelizer(I)V

    .line 1015
    :cond_34
    :goto_34
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView;->AudioAttributesImplApi26Parcelizer:Lo/containsValue;

    iget-object v3, p0, Landroidx/media3/ui/PlayerControlView;->ParcelableVolumeInfo:Landroid/widget/ImageView;

    if-eqz p1, :cond_3b

    goto :goto_3c

    :cond_3b
    move v1, v2

    :goto_3c
    invoke-virtual {v0, v3, v1}, Lo/containsValue;->RemoteActionCompatParcelizer(Landroid/view/View;Z)V

    .line 1017
    invoke-direct {p0}, Landroidx/media3/ui/PlayerControlView;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()V

    return-void
.end method

.method public setShowFastForwardButton(Z)V
    .registers 4

    .line 937
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView;->AudioAttributesImplApi26Parcelizer:Lo/containsValue;

    iget-object v1, p0, Landroidx/media3/ui/PlayerControlView;->MediaBrowserCompatSearchResultReceiver:Landroid/view/View;

    invoke-virtual {v0, v1, p1}, Lo/containsValue;->RemoteActionCompatParcelizer(Landroid/view/View;Z)V

    .line 938
    invoke-direct {p0}, Landroidx/media3/ui/PlayerControlView;->MediaBrowserCompatSearchResultReceiver()V

    return-void
.end method

.method public setShowMultiWindowTimeBar(Z)V
    .registers 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 845
    iput-boolean p1, p0, Landroidx/media3/ui/PlayerControlView;->r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0:Z

    .line 846
    invoke-direct {p0}, Landroidx/media3/ui/PlayerControlView;->onPlayFromMediaId()V

    return-void
.end method

.method public setShowNextButton(Z)V
    .registers 4

    .line 957
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView;->AudioAttributesImplApi26Parcelizer:Lo/containsValue;

    iget-object v1, p0, Landroidx/media3/ui/PlayerControlView;->onPlayFromUri:Landroid/widget/ImageView;

    invoke-virtual {v0, v1, p1}, Lo/containsValue;->RemoteActionCompatParcelizer(Landroid/view/View;Z)V

    .line 958
    invoke-direct {p0}, Landroidx/media3/ui/PlayerControlView;->MediaBrowserCompatSearchResultReceiver()V

    return-void
.end method

.method public setShowPlayButtonIfPlaybackIsSuppressed(Z)V
    .registers 2

    .line 859
    iput-boolean p1, p0, Landroidx/media3/ui/PlayerControlView;->r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28:Z

    .line 860
    invoke-direct {p0}, Landroidx/media3/ui/PlayerControlView;->MediaMetadataCompat()V

    return-void
.end method

.method public setShowPreviousButton(Z)V
    .registers 4

    .line 947
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView;->AudioAttributesImplApi26Parcelizer:Lo/containsValue;

    iget-object v1, p0, Landroidx/media3/ui/PlayerControlView;->onSetShuffleMode:Landroid/widget/ImageView;

    invoke-virtual {v0, v1, p1}, Lo/containsValue;->RemoteActionCompatParcelizer(Landroid/view/View;Z)V

    .line 948
    invoke-direct {p0}, Landroidx/media3/ui/PlayerControlView;->MediaBrowserCompatSearchResultReceiver()V

    return-void
.end method

.method public setShowRewindButton(Z)V
    .registers 4

    .line 927
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView;->AudioAttributesImplApi26Parcelizer:Lo/containsValue;

    iget-object v1, p0, Landroidx/media3/ui/PlayerControlView;->MediaSessionCompatResultReceiverWrapper:Landroid/view/View;

    invoke-virtual {v0, v1, p1}, Lo/containsValue;->RemoteActionCompatParcelizer(Landroid/view/View;Z)V

    .line 928
    invoke-direct {p0}, Landroidx/media3/ui/PlayerControlView;->MediaBrowserCompatSearchResultReceiver()V

    return-void
.end method

.method public setShowShuffleButton(Z)V
    .registers 4

    .line 1031
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView;->AudioAttributesImplApi26Parcelizer:Lo/containsValue;

    iget-object v1, p0, Landroidx/media3/ui/PlayerControlView;->r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8:Landroid/widget/ImageView;

    invoke-virtual {v0, v1, p1}, Lo/containsValue;->RemoteActionCompatParcelizer(Landroid/view/View;Z)V

    .line 1032
    invoke-direct {p0}, Landroidx/media3/ui/PlayerControlView;->onFastForward()V

    return-void
.end method

.method public setShowSubtitleButton(Z)V
    .registers 3

    .line 1046
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView;->AudioAttributesImplApi26Parcelizer:Lo/containsValue;

    iget-object p0, p0, Landroidx/media3/ui/PlayerControlView;->accessaddObserverForBackInvoker:Landroid/widget/ImageView;

    invoke-virtual {v0, p0, p1}, Lo/containsValue;->RemoteActionCompatParcelizer(Landroid/view/View;Z)V

    return-void
.end method

.method public setShowTimeoutMs(I)V
    .registers 2

    .line 980
    iput p1, p0, Landroidx/media3/ui/PlayerControlView;->_init_lambda3:I

    .line 981
    invoke-virtual {p0}, Landroidx/media3/ui/PlayerControlView;->IconCompatParcelizer()Z

    move-result p1

    if-eqz p1, :cond_d

    .line 982
    iget-object p0, p0, Landroidx/media3/ui/PlayerControlView;->AudioAttributesImplApi26Parcelizer:Lo/containsValue;

    invoke-virtual {p0}, Lo/containsValue;->MediaBrowserCompatCustomActionResultReceiver()V

    :cond_d
    return-void
.end method

.method public setShowVrButton(Z)V
    .registers 3

    .line 1060
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView;->AudioAttributesImplApi26Parcelizer:Lo/containsValue;

    iget-object p0, p0, Landroidx/media3/ui/PlayerControlView;->addOnPictureInPictureModeChangedListener:Landroid/widget/ImageView;

    invoke-virtual {v0, p0, p1}, Lo/containsValue;->RemoteActionCompatParcelizer(Landroid/view/View;Z)V

    return-void
.end method

.method public setTimeBarMinUpdateInterval(I)V
    .registers 4

    const/16 v0, 0x10

    const/16 v1, 0x3e8

    .line 1102
    invoke-static {p1, v0, v1}, Lo/LaissezFaireSubTypeValidator;->write(III)I

    move-result p1

    iput p1, p0, Landroidx/media3/ui/PlayerControlView;->menuHostHelperlambda0:I

    return-void
.end method

.method public setVrButtonListener(Landroid/view/View$OnClickListener;)V
    .registers 3

    .line 1069
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView;->addOnPictureInPictureModeChangedListener:Landroid/widget/ImageView;

    if-eqz v0, :cond_11

    .line 1070
    invoke-virtual {v0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    if-eqz p1, :cond_b

    const/4 p1, 0x1

    goto :goto_c

    :cond_b
    const/4 p1, 0x0

    .line 1071
    :goto_c
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView;->addOnPictureInPictureModeChangedListener:Landroid/widget/ImageView;

    invoke-direct {p0, p1, v0}, Landroidx/media3/ui/PlayerControlView;->AudioAttributesCompatParcelizer(ZLandroid/view/View;)V

    :cond_11
    return-void
.end method

.method public final write()V
    .registers 1

    .line 1135
    iget-object p0, p0, Landroidx/media3/ui/PlayerControlView;->AudioAttributesImplApi26Parcelizer:Lo/containsValue;

    invoke-virtual {p0}, Lo/containsValue;->AudioAttributesCompatParcelizer()V

    return-void
.end method

.method public final write(Landroidx/media3/ui/PlayerControlView$MediaBrowserCompatSearchResultReceiver;)V
    .registers 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 897
    iget-object p0, p0, Landroidx/media3/ui/PlayerControlView;->getOnBackPressedDispatcherannotations:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

###### Class androidx.media3.ui.PlayerControlView.AudioAttributesCompatParcelizer (androidx.media3.ui.PlayerControlView$AudioAttributesCompatParcelizer)
.class public interface abstract Landroidx/media3/ui/PlayerControlView$AudioAttributesCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/ui/PlayerControlView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "AudioAttributesCompatParcelizer"
.end annotation

.annotation runtime Ljava/lang/Deprecated;
.end annotation


# virtual methods
.method public abstract read()V
.end method

###### Class androidx.media3.ui.PlayerControlView.AudioAttributesImplApi21Parcelizer (androidx.media3.ui.PlayerControlView$AudioAttributesImplApi21Parcelizer)
.class final Landroidx/media3/ui/PlayerControlView$AudioAttributesImplApi21Parcelizer;
.super Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/ui/PlayerControlView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "AudioAttributesImplApi21Parcelizer"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer<",
        "Landroidx/media3/ui/PlayerControlView$MediaBrowserCompatItemReceiver;",
        ">;"
    }
.end annotation


# instance fields
.field private final AudioAttributesCompatParcelizer:[Landroid/graphics/drawable/Drawable;

.field private final IconCompatParcelizer:[Ljava/lang/String;

.field final synthetic RemoteActionCompatParcelizer:Landroidx/media3/ui/PlayerControlView;

.field private final read:[Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroidx/media3/ui/PlayerControlView;[Ljava/lang/String;[Landroid/graphics/drawable/Drawable;)V
    .registers 4

    .line 1927
    iput-object p1, p0, Landroidx/media3/ui/PlayerControlView$AudioAttributesImplApi21Parcelizer;->RemoteActionCompatParcelizer:Landroidx/media3/ui/PlayerControlView;

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;-><init>()V

    .line 1928
    iput-object p2, p0, Landroidx/media3/ui/PlayerControlView$AudioAttributesImplApi21Parcelizer;->IconCompatParcelizer:[Ljava/lang/String;

    .line 1929
    array-length p1, p2

    new-array p1, p1, [Ljava/lang/String;

    iput-object p1, p0, Landroidx/media3/ui/PlayerControlView$AudioAttributesImplApi21Parcelizer;->read:[Ljava/lang/String;

    .line 1930
    iput-object p3, p0, Landroidx/media3/ui/PlayerControlView$AudioAttributesImplApi21Parcelizer;->AudioAttributesCompatParcelizer:[Landroid/graphics/drawable/Drawable;

    return-void
.end method

.method private IconCompatParcelizer(Landroidx/media3/ui/PlayerControlView$MediaBrowserCompatItemReceiver;I)V
    .registers 7

    .line 1943
    invoke-direct {p0, p2}, Landroidx/media3/ui/PlayerControlView$AudioAttributesImplApi21Parcelizer;->read(I)Z

    move-result v0

    if-eqz v0, :cond_13

    .line 1944
    iget-object v0, p1, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->itemView:Landroid/view/View;

    new-instance v1, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    const/4 v2, -0x1

    const/4 v3, -0x2

    invoke-direct {v1, v2, v3}, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_1e

    .line 1948
    :cond_13
    iget-object v0, p1, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->itemView:Landroid/view/View;

    new-instance v1, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    const/4 v2, 0x0

    invoke-direct {v1, v2, v2}, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1951
    :goto_1e
    invoke-static {p1}, Landroidx/media3/ui/PlayerControlView$MediaBrowserCompatItemReceiver;->RemoteActionCompatParcelizer(Landroidx/media3/ui/PlayerControlView$MediaBrowserCompatItemReceiver;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Landroidx/media3/ui/PlayerControlView$AudioAttributesImplApi21Parcelizer;->IconCompatParcelizer:[Ljava/lang/String;

    aget-object v1, v1, p2

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1953
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView$AudioAttributesImplApi21Parcelizer;->read:[Ljava/lang/String;

    aget-object v0, v0, p2

    const/16 v1, 0x8

    if-nez v0, :cond_39

    .line 1954
    invoke-static {p1}, Landroidx/media3/ui/PlayerControlView$MediaBrowserCompatItemReceiver;->IconCompatParcelizer(Landroidx/media3/ui/PlayerControlView$MediaBrowserCompatItemReceiver;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_44

    .line 1956
    :cond_39
    invoke-static {p1}, Landroidx/media3/ui/PlayerControlView$MediaBrowserCompatItemReceiver;->IconCompatParcelizer(Landroidx/media3/ui/PlayerControlView$MediaBrowserCompatItemReceiver;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v2, p0, Landroidx/media3/ui/PlayerControlView$AudioAttributesImplApi21Parcelizer;->read:[Ljava/lang/String;

    aget-object v2, v2, p2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1959
    :goto_44
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView$AudioAttributesImplApi21Parcelizer;->AudioAttributesCompatParcelizer:[Landroid/graphics/drawable/Drawable;

    aget-object v0, v0, p2

    if-nez v0, :cond_52

    .line 1960
    invoke-static {p1}, Landroidx/media3/ui/PlayerControlView$MediaBrowserCompatItemReceiver;->read(Landroidx/media3/ui/PlayerControlView$MediaBrowserCompatItemReceiver;)Landroid/widget/ImageView;

    move-result-object p0

    invoke-virtual {p0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    return-void

    .line 1962
    :cond_52
    invoke-static {p1}, Landroidx/media3/ui/PlayerControlView$MediaBrowserCompatItemReceiver;->read(Landroidx/media3/ui/PlayerControlView$MediaBrowserCompatItemReceiver;)Landroid/widget/ImageView;

    move-result-object p1

    iget-object p0, p0, Landroidx/media3/ui/PlayerControlView$AudioAttributesImplApi21Parcelizer;->AudioAttributesCompatParcelizer:[Landroid/graphics/drawable/Drawable;

    aget-object p0, p0, p2

    invoke-virtual {p1, p0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method private read(Landroid/view/ViewGroup;)Landroidx/media3/ui/PlayerControlView$MediaBrowserCompatItemReceiver;
    .registers 5

    .line 1935
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView$AudioAttributesImplApi21Parcelizer;->RemoteActionCompatParcelizer:Landroidx/media3/ui/PlayerControlView;

    .line 1936
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lo/maximumCapacity$AudioAttributesImplApi21Parcelizer;->exo_styled_settings_list_item:I

    const/4 v2, 0x0

    .line 1937
    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 1938
    new-instance v0, Landroidx/media3/ui/PlayerControlView$MediaBrowserCompatItemReceiver;

    iget-object p0, p0, Landroidx/media3/ui/PlayerControlView$AudioAttributesImplApi21Parcelizer;->RemoteActionCompatParcelizer:Landroidx/media3/ui/PlayerControlView;

    invoke-direct {v0, p0, p1}, Landroidx/media3/ui/PlayerControlView$MediaBrowserCompatItemReceiver;-><init>(Landroidx/media3/ui/PlayerControlView;Landroid/view/View;)V

    return-object v0
.end method

.method private read(I)Z
    .registers 5

    .line 1986
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView$AudioAttributesImplApi21Parcelizer;->RemoteActionCompatParcelizer:Landroidx/media3/ui/PlayerControlView;

    invoke-static {v0}, Landroidx/media3/ui/PlayerControlView;->AudioAttributesImplApi26Parcelizer(Landroidx/media3/ui/PlayerControlView;)Lo/isUnsafeBaseType;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_a

    return v1

    :cond_a
    if-eqz p1, :cond_2e

    const/4 v0, 0x1

    if-eq p1, v0, :cond_10

    return v0

    .line 1991
    :cond_10
    iget-object p1, p0, Landroidx/media3/ui/PlayerControlView$AudioAttributesImplApi21Parcelizer;->RemoteActionCompatParcelizer:Landroidx/media3/ui/PlayerControlView;

    invoke-static {p1}, Landroidx/media3/ui/PlayerControlView;->AudioAttributesImplApi26Parcelizer(Landroidx/media3/ui/PlayerControlView;)Lo/isUnsafeBaseType;

    move-result-object p1

    const/16 v2, 0x1e

    invoke-interface {p1, v2}, Lo/isUnsafeBaseType;->write(I)Z

    move-result p1

    if-eqz p1, :cond_2d

    iget-object p0, p0, Landroidx/media3/ui/PlayerControlView$AudioAttributesImplApi21Parcelizer;->RemoteActionCompatParcelizer:Landroidx/media3/ui/PlayerControlView;

    .line 1992
    invoke-static {p0}, Landroidx/media3/ui/PlayerControlView;->AudioAttributesImplApi26Parcelizer(Landroidx/media3/ui/PlayerControlView;)Lo/isUnsafeBaseType;

    move-result-object p0

    const/16 p1, 0x1d

    invoke-interface {p0, p1}, Lo/isUnsafeBaseType;->write(I)Z

    move-result p0

    if-eqz p0, :cond_2d

    return v0

    :cond_2d
    return v1

    .line 1994
    :cond_2e
    iget-object p0, p0, Landroidx/media3/ui/PlayerControlView$AudioAttributesImplApi21Parcelizer;->RemoteActionCompatParcelizer:Landroidx/media3/ui/PlayerControlView;

    invoke-static {p0}, Landroidx/media3/ui/PlayerControlView;->AudioAttributesImplApi26Parcelizer(Landroidx/media3/ui/PlayerControlView;)Lo/isUnsafeBaseType;

    move-result-object p0

    const/16 p1, 0xd

    invoke-interface {p0, p1}, Lo/isUnsafeBaseType;->write(I)Z

    move-result p0

    return p0
.end method


# virtual methods
.method public final IconCompatParcelizer(ILjava/lang/String;)V
    .registers 3

    .line 1977
    iget-object p0, p0, Landroidx/media3/ui/PlayerControlView$AudioAttributesImplApi21Parcelizer;->read:[Ljava/lang/String;

    aput-object p2, p0, p1

    return-void
.end method

.method public final getItemCount()I
    .registers 1

    .line 1973
    iget-object p0, p0, Landroidx/media3/ui/PlayerControlView$AudioAttributesImplApi21Parcelizer;->IconCompatParcelizer:[Ljava/lang/String;

    array-length p0, p0

    return p0
.end method

.method public final getItemId(I)J
    .registers 2

    int-to-long p0, p1

    return-wide p0
.end method

.method public final synthetic onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;I)V
    .registers 3

    .line 1921
    check-cast p1, Landroidx/media3/ui/PlayerControlView$MediaBrowserCompatItemReceiver;

    invoke-direct {p0, p1, p2}, Landroidx/media3/ui/PlayerControlView$AudioAttributesImplApi21Parcelizer;->IconCompatParcelizer(Landroidx/media3/ui/PlayerControlView$MediaBrowserCompatItemReceiver;I)V

    return-void
.end method

.method public final synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;
    .registers 3

    .line 1921
    invoke-direct {p0, p1}, Landroidx/media3/ui/PlayerControlView$AudioAttributesImplApi21Parcelizer;->read(Landroid/view/ViewGroup;)Landroidx/media3/ui/PlayerControlView$MediaBrowserCompatItemReceiver;

    move-result-object p0

    return-object p0
.end method

.method public final read()Z
    .registers 3

    const/4 v0, 0x1

    .line 1981
    invoke-direct {p0, v0}, Landroidx/media3/ui/PlayerControlView$AudioAttributesImplApi21Parcelizer;->read(I)Z

    move-result v1

    if-nez v1, :cond_f

    const/4 v1, 0x0

    .line 1982
    invoke-direct {p0, v1}, Landroidx/media3/ui/PlayerControlView$AudioAttributesImplApi21Parcelizer;->read(I)Z

    move-result p0

    if-nez p0, :cond_f

    return v1

    :cond_f
    return v0
.end method

###### Class androidx.media3.ui.PlayerControlView.AudioAttributesImplApi26Parcelizer (androidx.media3.ui.PlayerControlView$AudioAttributesImplApi26Parcelizer)
.class public final Landroidx/media3/ui/PlayerControlView$AudioAttributesImplApi26Parcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/ui/PlayerControlView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "AudioAttributesImplApi26Parcelizer"
.end annotation


# instance fields
.field public final IconCompatParcelizer:Lo/collectAndResolveSubtypesByTypeId$write;

.field public final read:Ljava/lang/String;

.field public final write:I


# direct methods
.method public constructor <init>(Lo/collectAndResolveSubtypesByTypeId;IILjava/lang/String;)V
    .registers 5

    .line 2090
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2091
    invoke-virtual {p1}, Lo/collectAndResolveSubtypesByTypeId;->IconCompatParcelizer()Lo/initExtraTracks;

    move-result-object p1

    invoke-virtual {p1, p2}, Lo/initExtraTracks;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lo/collectAndResolveSubtypesByTypeId$write;

    iput-object p1, p0, Landroidx/media3/ui/PlayerControlView$AudioAttributesImplApi26Parcelizer;->IconCompatParcelizer:Lo/collectAndResolveSubtypesByTypeId$write;

    .line 2092
    iput p3, p0, Landroidx/media3/ui/PlayerControlView$AudioAttributesImplApi26Parcelizer;->write:I

    .line 2093
    iput-object p4, p0, Landroidx/media3/ui/PlayerControlView$AudioAttributesImplApi26Parcelizer;->read:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final write()Z
    .registers 2

    .line 2097
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView$AudioAttributesImplApi26Parcelizer;->IconCompatParcelizer:Lo/collectAndResolveSubtypesByTypeId$write;

    iget p0, p0, Landroidx/media3/ui/PlayerControlView$AudioAttributesImplApi26Parcelizer;->write:I

    invoke-virtual {v0, p0}, Lo/collectAndResolveSubtypesByTypeId$write;->read(I)Z

    move-result p0

    return p0
.end method

###### Class androidx.media3.ui.PlayerControlView.AudioAttributesImplBaseParcelizer (androidx.media3.ui.PlayerControlView$AudioAttributesImplBaseParcelizer)
.class public final Landroidx/media3/ui/PlayerControlView$AudioAttributesImplBaseParcelizer;
.super Landroidx/media3/ui/PlayerControlView$MediaMetadataCompat;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/ui/PlayerControlView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "AudioAttributesImplBaseParcelizer"
.end annotation


# instance fields
.field final synthetic read:Landroidx/media3/ui/PlayerControlView;


# direct methods
.method private constructor <init>(Landroidx/media3/ui/PlayerControlView;)V
    .registers 2

    .line 2101
    iput-object p1, p0, Landroidx/media3/ui/PlayerControlView$AudioAttributesImplBaseParcelizer;->read:Landroidx/media3/ui/PlayerControlView;

    invoke-direct {p0, p1}, Landroidx/media3/ui/PlayerControlView$MediaMetadataCompat;-><init>(Landroidx/media3/ui/PlayerControlView;)V

    return-void
.end method

.method synthetic constructor <init>(Landroidx/media3/ui/PlayerControlView;B)V
    .registers 3

    .line 2101
    invoke-direct {p0, p1}, Landroidx/media3/ui/PlayerControlView$AudioAttributesImplBaseParcelizer;-><init>(Landroidx/media3/ui/PlayerControlView;)V

    return-void
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer(Landroidx/media3/ui/PlayerControlView$MediaBrowserCompatCustomActionResultReceiver;I)V
    .registers 3

    .line 2152
    invoke-super {p0, p1, p2}, Landroidx/media3/ui/PlayerControlView$MediaMetadataCompat;->AudioAttributesCompatParcelizer(Landroidx/media3/ui/PlayerControlView$MediaBrowserCompatCustomActionResultReceiver;I)V

    if-lez p2, :cond_1d

    .line 2154
    iget-object p0, p0, Landroidx/media3/ui/PlayerControlView$MediaMetadataCompat;->IconCompatParcelizer:Ljava/util/List;

    add-int/lit8 p2, p2, -0x1

    invoke-interface {p0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroidx/media3/ui/PlayerControlView$AudioAttributesImplApi26Parcelizer;

    .line 2155
    iget-object p1, p1, Landroidx/media3/ui/PlayerControlView$MediaBrowserCompatCustomActionResultReceiver;->RemoteActionCompatParcelizer:Landroid/view/View;

    invoke-virtual {p0}, Landroidx/media3/ui/PlayerControlView$AudioAttributesImplApi26Parcelizer;->write()Z

    move-result p0

    if-eqz p0, :cond_19

    const/4 p0, 0x0

    goto :goto_1a

    :cond_19
    const/4 p0, 0x4

    :goto_1a
    invoke-virtual {p1, p0}, Landroid/view/View;->setVisibility(I)V

    :cond_1d
    return-void
.end method

.method public final AudioAttributesCompatParcelizer(Ljava/util/List;)V
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/media3/ui/PlayerControlView$AudioAttributesImplApi26Parcelizer;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    move v1, v0

    .line 2105
    :goto_2
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_19

    .line 2106
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/media3/ui/PlayerControlView$AudioAttributesImplApi26Parcelizer;

    invoke-virtual {v2}, Landroidx/media3/ui/PlayerControlView$AudioAttributesImplApi26Parcelizer;->write()Z

    move-result v2

    if-eqz v2, :cond_16

    const/4 v0, 0x1

    goto :goto_19

    :cond_16
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    .line 2112
    :cond_19
    :goto_19
    iget-object v1, p0, Landroidx/media3/ui/PlayerControlView$AudioAttributesImplBaseParcelizer;->read:Landroidx/media3/ui/PlayerControlView;

    invoke-static {v1}, Landroidx/media3/ui/PlayerControlView;->onPrepareFromMediaId(Landroidx/media3/ui/PlayerControlView;)Landroid/widget/ImageView;

    move-result-object v1

    if-eqz v1, :cond_4f

    .line 2113
    iget-object v1, p0, Landroidx/media3/ui/PlayerControlView$AudioAttributesImplBaseParcelizer;->read:Landroidx/media3/ui/PlayerControlView;

    invoke-static {v1}, Landroidx/media3/ui/PlayerControlView;->onPrepareFromMediaId(Landroidx/media3/ui/PlayerControlView;)Landroid/widget/ImageView;

    move-result-object v1

    .line 2114
    iget-object v2, p0, Landroidx/media3/ui/PlayerControlView$AudioAttributesImplBaseParcelizer;->read:Landroidx/media3/ui/PlayerControlView;

    if-eqz v0, :cond_30

    invoke-static {v2}, Landroidx/media3/ui/PlayerControlView;->onPlayFromSearch(Landroidx/media3/ui/PlayerControlView;)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    goto :goto_34

    :cond_30
    invoke-static {v2}, Landroidx/media3/ui/PlayerControlView;->onPrepareFromUri(Landroidx/media3/ui/PlayerControlView;)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    .line 2113
    :goto_34
    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 2115
    iget-object v1, p0, Landroidx/media3/ui/PlayerControlView$AudioAttributesImplBaseParcelizer;->read:Landroidx/media3/ui/PlayerControlView;

    invoke-static {v1}, Landroidx/media3/ui/PlayerControlView;->onPrepareFromMediaId(Landroidx/media3/ui/PlayerControlView;)Landroid/widget/ImageView;

    move-result-object v1

    if-eqz v0, :cond_46

    .line 2116
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView$AudioAttributesImplBaseParcelizer;->read:Landroidx/media3/ui/PlayerControlView;

    invoke-static {v0}, Landroidx/media3/ui/PlayerControlView;->onRemoveQueueItemAt(Landroidx/media3/ui/PlayerControlView;)Ljava/lang/String;

    move-result-object v0

    goto :goto_4c

    :cond_46
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView$AudioAttributesImplBaseParcelizer;->read:Landroidx/media3/ui/PlayerControlView;

    invoke-static {v0}, Landroidx/media3/ui/PlayerControlView;->onRemoveQueueItem(Landroidx/media3/ui/PlayerControlView;)Ljava/lang/String;

    move-result-object v0

    .line 2115
    :goto_4c
    invoke-virtual {v1, v0}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 2118
    :cond_4f
    iput-object p1, p0, Landroidx/media3/ui/PlayerControlView$MediaMetadataCompat;->IconCompatParcelizer:Ljava/util/List;

    return-void
.end method

.method public final synthetic IconCompatParcelizer()V
    .registers 4

    .line 2135
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView$AudioAttributesImplBaseParcelizer;->read:Landroidx/media3/ui/PlayerControlView;

    invoke-static {v0}, Landroidx/media3/ui/PlayerControlView;->AudioAttributesImplApi26Parcelizer(Landroidx/media3/ui/PlayerControlView;)Lo/isUnsafeBaseType;

    move-result-object v0

    if-eqz v0, :cond_44

    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView$AudioAttributesImplBaseParcelizer;->read:Landroidx/media3/ui/PlayerControlView;

    .line 2136
    invoke-static {v0}, Landroidx/media3/ui/PlayerControlView;->AudioAttributesImplApi26Parcelizer(Landroidx/media3/ui/PlayerControlView;)Lo/isUnsafeBaseType;

    move-result-object v0

    const/16 v1, 0x1d

    invoke-interface {v0, v1}, Lo/isUnsafeBaseType;->write(I)Z

    move-result v0

    if-eqz v0, :cond_44

    .line 2137
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView$AudioAttributesImplBaseParcelizer;->read:Landroidx/media3/ui/PlayerControlView;

    .line 2138
    invoke-static {v0}, Landroidx/media3/ui/PlayerControlView;->AudioAttributesImplApi26Parcelizer(Landroidx/media3/ui/PlayerControlView;)Lo/isUnsafeBaseType;

    move-result-object v0

    invoke-interface {v0}, Lo/isUnsafeBaseType;->onStop()Lo/SubtypeResolver;

    move-result-object v0

    .line 2139
    iget-object v1, p0, Landroidx/media3/ui/PlayerControlView$AudioAttributesImplBaseParcelizer;->read:Landroidx/media3/ui/PlayerControlView;

    invoke-static {v1}, Landroidx/media3/ui/PlayerControlView;->AudioAttributesImplApi26Parcelizer(Landroidx/media3/ui/PlayerControlView;)Lo/isUnsafeBaseType;

    move-result-object v1

    .line 2141
    invoke-virtual {v0}, Lo/SubtypeResolver;->write()Lo/SubtypeResolver$AudioAttributesCompatParcelizer;

    move-result-object v0

    const/4 v2, 0x3

    .line 2142
    invoke-virtual {v0, v2}, Lo/SubtypeResolver$AudioAttributesCompatParcelizer;->write(I)Lo/SubtypeResolver$AudioAttributesCompatParcelizer;

    move-result-object v0

    const/4 v2, -0x3

    .line 2143
    invoke-virtual {v0, v2}, Lo/SubtypeResolver$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer(I)Lo/SubtypeResolver$AudioAttributesCompatParcelizer;

    move-result-object v0

    .line 2144
    invoke-virtual {v0}, Lo/SubtypeResolver$AudioAttributesCompatParcelizer;->read()Lo/SubtypeResolver;

    move-result-object v0

    .line 2139
    invoke-interface {v1, v0}, Lo/isUnsafeBaseType;->AudioAttributesCompatParcelizer(Lo/SubtypeResolver;)V

    .line 2145
    iget-object p0, p0, Landroidx/media3/ui/PlayerControlView$AudioAttributesImplBaseParcelizer;->read:Landroidx/media3/ui/PlayerControlView;

    invoke-static {p0}, Landroidx/media3/ui/PlayerControlView;->onPrepareFromSearch(Landroidx/media3/ui/PlayerControlView;)Landroid/widget/PopupWindow;

    move-result-object p0

    invoke-virtual {p0}, Landroid/widget/PopupWindow;->dismiss()V

    :cond_44
    return-void
.end method

.method public final synthetic onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;I)V
    .registers 3

    .line 2101
    check-cast p1, Landroidx/media3/ui/PlayerControlView$MediaBrowserCompatCustomActionResultReceiver;

    invoke-virtual {p0, p1, p2}, Landroidx/media3/ui/PlayerControlView$AudioAttributesImplBaseParcelizer;->AudioAttributesCompatParcelizer(Landroidx/media3/ui/PlayerControlView$MediaBrowserCompatCustomActionResultReceiver;I)V

    return-void
.end method

.method public final read(Landroidx/media3/ui/PlayerControlView$MediaBrowserCompatCustomActionResultReceiver;)V
    .registers 5

    .line 2124
    iget-object v0, p1, Landroidx/media3/ui/PlayerControlView$MediaBrowserCompatCustomActionResultReceiver;->IconCompatParcelizer:Landroid/widget/TextView;

    sget v1, Lo/maximumCapacity$MediaBrowserCompatCustomActionResultReceiver;->exo_track_selection_none:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    const/4 v0, 0x0

    move v1, v0

    .line 2126
    :goto_9
    iget-object v2, p0, Landroidx/media3/ui/PlayerControlView$MediaMetadataCompat;->IconCompatParcelizer:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_24

    .line 2127
    iget-object v2, p0, Landroidx/media3/ui/PlayerControlView$MediaMetadataCompat;->IconCompatParcelizer:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/media3/ui/PlayerControlView$AudioAttributesImplApi26Parcelizer;

    invoke-virtual {v2}, Landroidx/media3/ui/PlayerControlView$AudioAttributesImplApi26Parcelizer;->write()Z

    move-result v2

    if-eqz v2, :cond_21

    move v1, v0

    goto :goto_25

    :cond_21
    add-int/lit8 v1, v1, 0x1

    goto :goto_9

    :cond_24
    const/4 v1, 0x1

    .line 2132
    :goto_25
    iget-object v2, p1, Landroidx/media3/ui/PlayerControlView$MediaBrowserCompatCustomActionResultReceiver;->RemoteActionCompatParcelizer:Landroid/view/View;

    if-eqz v1, :cond_2a

    goto :goto_2b

    :cond_2a
    const/4 v0, 0x4

    :goto_2b
    invoke-virtual {v2, v0}, Landroid/view/View;->setVisibility(I)V

    .line 2133
    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->itemView:Landroid/view/View;

    new-instance v0, Lo/drainReadBuffers;

    invoke-direct {v0, p0}, Lo/drainReadBuffers;-><init>(Landroidx/media3/ui/PlayerControlView$AudioAttributesImplBaseParcelizer;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public final write(Ljava/lang/String;)V
    .registers 2

    return-void
.end method

###### Class kotlin.drainReadBuffers (o.drainReadBuffers)
.class public final synthetic Lo/drainReadBuffers;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic RemoteActionCompatParcelizer:Landroidx/media3/ui/PlayerControlView$AudioAttributesImplBaseParcelizer;


# direct methods
.method public synthetic constructor <init>(Landroidx/media3/ui/PlayerControlView$AudioAttributesImplBaseParcelizer;)V
    .registers 2

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo/drainReadBuffers;->RemoteActionCompatParcelizer:Landroidx/media3/ui/PlayerControlView$AudioAttributesImplBaseParcelizer;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .registers 2

    .line 0
    iget-object p0, p0, Lo/drainReadBuffers;->RemoteActionCompatParcelizer:Landroidx/media3/ui/PlayerControlView$AudioAttributesImplBaseParcelizer;

    invoke-virtual {p0}, Landroidx/media3/ui/PlayerControlView$AudioAttributesImplBaseParcelizer;->IconCompatParcelizer()V

    return-void
.end method

###### Class androidx.media3.ui.PlayerControlView.IconCompatParcelizer (androidx.media3.ui.PlayerControlView$IconCompatParcelizer)
.class public final Landroidx/media3/ui/PlayerControlView$IconCompatParcelizer;
.super Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/ui/PlayerControlView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "IconCompatParcelizer"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer<",
        "Landroidx/media3/ui/PlayerControlView$MediaBrowserCompatCustomActionResultReceiver;",
        ">;"
    }
.end annotation


# instance fields
.field private final AudioAttributesCompatParcelizer:[F

.field private final IconCompatParcelizer:[Ljava/lang/String;

.field private RemoteActionCompatParcelizer:I

.field final synthetic read:Landroidx/media3/ui/PlayerControlView;


# direct methods
.method public constructor <init>(Landroidx/media3/ui/PlayerControlView;[Ljava/lang/String;[F)V
    .registers 4

    .line 2026
    iput-object p1, p0, Landroidx/media3/ui/PlayerControlView$IconCompatParcelizer;->read:Landroidx/media3/ui/PlayerControlView;

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;-><init>()V

    .line 2027
    iput-object p2, p0, Landroidx/media3/ui/PlayerControlView$IconCompatParcelizer;->IconCompatParcelizer:[Ljava/lang/String;

    .line 2028
    iput-object p3, p0, Landroidx/media3/ui/PlayerControlView$IconCompatParcelizer;->AudioAttributesCompatParcelizer:[F

    return-void
.end method

.method private RemoteActionCompatParcelizer(Landroid/view/ViewGroup;)Landroidx/media3/ui/PlayerControlView$MediaBrowserCompatCustomActionResultReceiver;
    .registers 4

    .line 2050
    iget-object p0, p0, Landroidx/media3/ui/PlayerControlView$IconCompatParcelizer;->read:Landroidx/media3/ui/PlayerControlView;

    .line 2051
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p0

    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p0

    sget v0, Lo/maximumCapacity$AudioAttributesImplApi21Parcelizer;->exo_styled_sub_settings_list_item:I

    const/4 v1, 0x0

    .line 2052
    invoke-virtual {p0, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p0

    .line 2054
    new-instance p1, Landroidx/media3/ui/PlayerControlView$MediaBrowserCompatCustomActionResultReceiver;

    invoke-direct {p1, p0}, Landroidx/media3/ui/PlayerControlView$MediaBrowserCompatCustomActionResultReceiver;-><init>(Landroid/view/View;)V

    return-object p1
.end method

.method private RemoteActionCompatParcelizer(Landroidx/media3/ui/PlayerControlView$MediaBrowserCompatCustomActionResultReceiver;I)V
    .registers 6

    .line 2059
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView$IconCompatParcelizer;->IconCompatParcelizer:[Ljava/lang/String;

    array-length v0, v0

    if-ge p2, v0, :cond_e

    .line 2060
    iget-object v0, p1, Landroidx/media3/ui/PlayerControlView$MediaBrowserCompatCustomActionResultReceiver;->IconCompatParcelizer:Landroid/widget/TextView;

    iget-object v1, p0, Landroidx/media3/ui/PlayerControlView$IconCompatParcelizer;->IconCompatParcelizer:[Ljava/lang/String;

    aget-object v1, v1, p2

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2062
    :cond_e
    iget v0, p0, Landroidx/media3/ui/PlayerControlView$IconCompatParcelizer;->RemoteActionCompatParcelizer:I

    const/4 v1, 0x0

    if-ne p2, v0, :cond_1f

    .line 2063
    iget-object v0, p1, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->itemView:Landroid/view/View;

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Landroid/view/View;->setSelected(Z)V

    .line 2064
    iget-object v0, p1, Landroidx/media3/ui/PlayerControlView$MediaBrowserCompatCustomActionResultReceiver;->RemoteActionCompatParcelizer:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_2a

    .line 2066
    :cond_1f
    iget-object v0, p1, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->itemView:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setSelected(Z)V

    .line 2067
    iget-object v0, p1, Landroidx/media3/ui/PlayerControlView$MediaBrowserCompatCustomActionResultReceiver;->RemoteActionCompatParcelizer:Landroid/view/View;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 2069
    :goto_2a
    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->itemView:Landroid/view/View;

    new-instance v0, Lo/drainOnReadIfNeeded;

    invoke-direct {v0, p0, p2}, Lo/drainOnReadIfNeeded;-><init>(Landroidx/media3/ui/PlayerControlView$IconCompatParcelizer;I)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer()Ljava/lang/String;
    .registers 2

    .line 2045
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView$IconCompatParcelizer;->IconCompatParcelizer:[Ljava/lang/String;

    iget p0, p0, Landroidx/media3/ui/PlayerControlView$IconCompatParcelizer;->RemoteActionCompatParcelizer:I

    aget-object p0, v0, p0

    return-object p0
.end method

.method public final synthetic AudioAttributesCompatParcelizer(I)V
    .registers 4

    .line 2071
    iget v0, p0, Landroidx/media3/ui/PlayerControlView$IconCompatParcelizer;->RemoteActionCompatParcelizer:I

    if-eq p1, v0, :cond_d

    .line 2072
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView$IconCompatParcelizer;->read:Landroidx/media3/ui/PlayerControlView;

    iget-object v1, p0, Landroidx/media3/ui/PlayerControlView$IconCompatParcelizer;->AudioAttributesCompatParcelizer:[F

    aget p1, v1, p1

    invoke-static {v0, p1}, Landroidx/media3/ui/PlayerControlView;->IconCompatParcelizer(Landroidx/media3/ui/PlayerControlView;F)V

    .line 2074
    :cond_d
    iget-object p0, p0, Landroidx/media3/ui/PlayerControlView$IconCompatParcelizer;->read:Landroidx/media3/ui/PlayerControlView;

    invoke-static {p0}, Landroidx/media3/ui/PlayerControlView;->onPrepareFromSearch(Landroidx/media3/ui/PlayerControlView;)Landroid/widget/PopupWindow;

    move-result-object p0

    invoke-virtual {p0}, Landroid/widget/PopupWindow;->dismiss()V

    return-void
.end method

.method public final getItemCount()I
    .registers 1

    .line 2080
    iget-object p0, p0, Landroidx/media3/ui/PlayerControlView$IconCompatParcelizer;->IconCompatParcelizer:[Ljava/lang/String;

    array-length p0, p0

    return p0
.end method

.method public final synthetic onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;I)V
    .registers 3

    .line 2020
    check-cast p1, Landroidx/media3/ui/PlayerControlView$MediaBrowserCompatCustomActionResultReceiver;

    invoke-direct {p0, p1, p2}, Landroidx/media3/ui/PlayerControlView$IconCompatParcelizer;->RemoteActionCompatParcelizer(Landroidx/media3/ui/PlayerControlView$MediaBrowserCompatCustomActionResultReceiver;I)V

    return-void
.end method

.method public final synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;
    .registers 3

    .line 2020
    invoke-direct {p0, p1}, Landroidx/media3/ui/PlayerControlView$IconCompatParcelizer;->RemoteActionCompatParcelizer(Landroid/view/ViewGroup;)Landroidx/media3/ui/PlayerControlView$MediaBrowserCompatCustomActionResultReceiver;

    move-result-object p0

    return-object p0
.end method

.method public final write(F)V
    .registers 7

    const/4 v0, 0x0

    const v1, 0x7f7fffff    # Float.MAX_VALUE

    move v2, v1

    move v1, v0

    .line 2034
    :goto_6
    iget-object v3, p0, Landroidx/media3/ui/PlayerControlView$IconCompatParcelizer;->AudioAttributesCompatParcelizer:[F

    array-length v4, v3

    if-ge v0, v4, :cond_1c

    .line 2035
    aget v3, v3, v0

    sub-float v3, p1, v3

    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    move-result v3

    cmpg-float v4, v3, v2

    if-gez v4, :cond_19

    move v1, v0

    move v2, v3

    :cond_19
    add-int/lit8 v0, v0, 0x1

    goto :goto_6

    .line 2041
    :cond_1c
    iput v1, p0, Landroidx/media3/ui/PlayerControlView$IconCompatParcelizer;->RemoteActionCompatParcelizer:I

    return-void
.end method

###### Class kotlin.drainOnReadIfNeeded (o.drainOnReadIfNeeded)
.class public final synthetic Lo/drainOnReadIfNeeded;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic AudioAttributesCompatParcelizer:Landroidx/media3/ui/PlayerControlView$IconCompatParcelizer;

.field public final synthetic RemoteActionCompatParcelizer:I


# direct methods
.method public synthetic constructor <init>(Landroidx/media3/ui/PlayerControlView$IconCompatParcelizer;I)V
    .registers 3

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo/drainOnReadIfNeeded;->AudioAttributesCompatParcelizer:Landroidx/media3/ui/PlayerControlView$IconCompatParcelizer;

    iput p2, p0, Lo/drainOnReadIfNeeded;->RemoteActionCompatParcelizer:I

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .registers 2

    .line 0
    iget-object p1, p0, Lo/drainOnReadIfNeeded;->AudioAttributesCompatParcelizer:Landroidx/media3/ui/PlayerControlView$IconCompatParcelizer;

    iget p0, p0, Lo/drainOnReadIfNeeded;->RemoteActionCompatParcelizer:I

    invoke-virtual {p1, p0}, Landroidx/media3/ui/PlayerControlView$IconCompatParcelizer;->AudioAttributesCompatParcelizer(I)V

    return-void
.end method

###### Class androidx.media3.ui.PlayerControlView.MediaBrowserCompatCustomActionResultReceiver (androidx.media3.ui.PlayerControlView$MediaBrowserCompatCustomActionResultReceiver)
.class final Landroidx/media3/ui/PlayerControlView$MediaBrowserCompatCustomActionResultReceiver;
.super Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/ui/PlayerControlView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "MediaBrowserCompatCustomActionResultReceiver"
.end annotation


# instance fields
.field public final IconCompatParcelizer:Landroid/widget/TextView;

.field public final RemoteActionCompatParcelizer:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .registers 4

    .line 2316
    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;-><init>(Landroid/view/View;)V

    .line 2317
    sget v0, Lo/LaissezFaireSubTypeValidator;->MediaBrowserCompatCustomActionResultReceiver:I

    const/16 v1, 0x1a

    if-ge v0, v1, :cond_d

    const/4 v0, 0x1

    .line 2319
    invoke-virtual {p1, v0}, Landroid/view/View;->setFocusable(Z)V

    .line 2321
    :cond_d
    sget v0, Lo/maximumCapacity$AudioAttributesImplBaseParcelizer;->exo_text:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Landroidx/media3/ui/PlayerControlView$MediaBrowserCompatCustomActionResultReceiver;->IconCompatParcelizer:Landroid/widget/TextView;

    .line 2322
    sget v0, Lo/maximumCapacity$AudioAttributesImplBaseParcelizer;->exo_check:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Landroidx/media3/ui/PlayerControlView$MediaBrowserCompatCustomActionResultReceiver;->RemoteActionCompatParcelizer:Landroid/view/View;

    return-void
.end method

###### Class androidx.media3.ui.PlayerControlView.MediaBrowserCompatItemReceiver (androidx.media3.ui.PlayerControlView$MediaBrowserCompatItemReceiver)
.class public final Landroidx/media3/ui/PlayerControlView$MediaBrowserCompatItemReceiver;
.super Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/ui/PlayerControlView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "MediaBrowserCompatItemReceiver"
.end annotation


# instance fields
.field private final AudioAttributesCompatParcelizer:Landroid/widget/TextView;

.field private final IconCompatParcelizer:Landroid/widget/TextView;

.field final synthetic read:Landroidx/media3/ui/PlayerControlView;

.field private final write:Landroid/widget/ImageView;


# direct methods
.method public constructor <init>(Landroidx/media3/ui/PlayerControlView;Landroid/view/View;)V
    .registers 4

    .line 2007
    iput-object p1, p0, Landroidx/media3/ui/PlayerControlView$MediaBrowserCompatItemReceiver;->read:Landroidx/media3/ui/PlayerControlView;

    .line 2008
    invoke-direct {p0, p2}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;-><init>(Landroid/view/View;)V

    .line 2009
    sget p1, Lo/LaissezFaireSubTypeValidator;->MediaBrowserCompatCustomActionResultReceiver:I

    const/16 v0, 0x1a

    if-ge p1, v0, :cond_f

    const/4 p1, 0x1

    .line 2011
    invoke-virtual {p2, p1}, Landroid/view/View;->setFocusable(Z)V

    .line 2013
    :cond_f
    sget p1, Lo/maximumCapacity$AudioAttributesImplBaseParcelizer;->exo_main_text:I

    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Landroidx/media3/ui/PlayerControlView$MediaBrowserCompatItemReceiver;->IconCompatParcelizer:Landroid/widget/TextView;

    .line 2014
    sget p1, Lo/maximumCapacity$AudioAttributesImplBaseParcelizer;->exo_sub_text:I

    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Landroidx/media3/ui/PlayerControlView$MediaBrowserCompatItemReceiver;->AudioAttributesCompatParcelizer:Landroid/widget/TextView;

    .line 2015
    sget p1, Lo/maximumCapacity$AudioAttributesImplBaseParcelizer;->exo_icon:I

    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Landroidx/media3/ui/PlayerControlView$MediaBrowserCompatItemReceiver;->write:Landroid/widget/ImageView;

    .line 2016
    new-instance p1, Lo/drainReadBuffer;

    invoke-direct {p1, p0}, Lo/drainReadBuffer;-><init>(Landroidx/media3/ui/PlayerControlView$MediaBrowserCompatItemReceiver;)V

    invoke-virtual {p2, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method static synthetic IconCompatParcelizer(Landroidx/media3/ui/PlayerControlView$MediaBrowserCompatItemReceiver;)Landroid/widget/TextView;
    .registers 1

    .line 2001
    iget-object p0, p0, Landroidx/media3/ui/PlayerControlView$MediaBrowserCompatItemReceiver;->AudioAttributesCompatParcelizer:Landroid/widget/TextView;

    return-object p0
.end method

.method static synthetic RemoteActionCompatParcelizer(Landroidx/media3/ui/PlayerControlView$MediaBrowserCompatItemReceiver;)Landroid/widget/TextView;
    .registers 1

    .line 2001
    iget-object p0, p0, Landroidx/media3/ui/PlayerControlView$MediaBrowserCompatItemReceiver;->IconCompatParcelizer:Landroid/widget/TextView;

    return-object p0
.end method

.method static synthetic read(Landroidx/media3/ui/PlayerControlView$MediaBrowserCompatItemReceiver;)Landroid/widget/ImageView;
    .registers 1

    .line 2001
    iget-object p0, p0, Landroidx/media3/ui/PlayerControlView$MediaBrowserCompatItemReceiver;->write:Landroid/widget/ImageView;

    return-object p0
.end method


# virtual methods
.method public final synthetic read()V
    .registers 2

    .line 2016
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView$MediaBrowserCompatItemReceiver;->read:Landroidx/media3/ui/PlayerControlView;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->getBindingAdapterPosition()I

    move-result p0

    invoke-static {v0, p0}, Landroidx/media3/ui/PlayerControlView;->write(Landroidx/media3/ui/PlayerControlView;I)V

    return-void
.end method

###### Class kotlin.drainReadBuffer (o.drainReadBuffer)
.class public final synthetic Lo/drainReadBuffer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic read:Landroidx/media3/ui/PlayerControlView$MediaBrowserCompatItemReceiver;


# direct methods
.method public synthetic constructor <init>(Landroidx/media3/ui/PlayerControlView$MediaBrowserCompatItemReceiver;)V
    .registers 2

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo/drainReadBuffer;->read:Landroidx/media3/ui/PlayerControlView$MediaBrowserCompatItemReceiver;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .registers 2

    .line 0
    iget-object p0, p0, Lo/drainReadBuffer;->read:Landroidx/media3/ui/PlayerControlView$MediaBrowserCompatItemReceiver;

    invoke-virtual {p0}, Landroidx/media3/ui/PlayerControlView$MediaBrowserCompatItemReceiver;->read()V

    return-void
.end method

###### Class androidx.media3.ui.PlayerControlView.MediaBrowserCompatSearchResultReceiver (androidx.media3.ui.PlayerControlView$MediaBrowserCompatSearchResultReceiver)
.class public interface abstract Landroidx/media3/ui/PlayerControlView$MediaBrowserCompatSearchResultReceiver;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/ui/PlayerControlView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "MediaBrowserCompatSearchResultReceiver"
.end annotation

.annotation runtime Ljava/lang/Deprecated;
.end annotation


# virtual methods
.method public abstract RemoteActionCompatParcelizer()V
.end method

###### Class androidx.media3.ui.PlayerControlView.MediaMetadataCompat (androidx.media3.ui.PlayerControlView$MediaMetadataCompat)
.class public abstract Landroidx/media3/ui/PlayerControlView$MediaMetadataCompat;
.super Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/ui/PlayerControlView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401
    name = "MediaMetadataCompat"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer<",
        "Landroidx/media3/ui/PlayerControlView$MediaBrowserCompatCustomActionResultReceiver;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic AudioAttributesCompatParcelizer:Landroidx/media3/ui/PlayerControlView;

.field protected IconCompatParcelizer:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/media3/ui/PlayerControlView$AudioAttributesImplApi26Parcelizer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method protected constructor <init>(Landroidx/media3/ui/PlayerControlView;)V
    .registers 2

    .line 2244
    iput-object p1, p0, Landroidx/media3/ui/PlayerControlView$MediaMetadataCompat;->AudioAttributesCompatParcelizer:Landroidx/media3/ui/PlayerControlView;

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;-><init>()V

    .line 2245
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Landroidx/media3/ui/PlayerControlView$MediaMetadataCompat;->IconCompatParcelizer:Ljava/util/List;

    return-void
.end method

.method private IconCompatParcelizer(Landroid/view/ViewGroup;)Landroidx/media3/ui/PlayerControlView$MediaBrowserCompatCustomActionResultReceiver;
    .registers 4

    .line 2252
    iget-object p0, p0, Landroidx/media3/ui/PlayerControlView$MediaMetadataCompat;->AudioAttributesCompatParcelizer:Landroidx/media3/ui/PlayerControlView;

    .line 2253
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p0

    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p0

    sget v0, Lo/maximumCapacity$AudioAttributesImplApi21Parcelizer;->exo_styled_sub_settings_list_item:I

    const/4 v1, 0x0

    .line 2254
    invoke-virtual {p0, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p0

    .line 2256
    new-instance p1, Landroidx/media3/ui/PlayerControlView$MediaBrowserCompatCustomActionResultReceiver;

    invoke-direct {p1, p0}, Landroidx/media3/ui/PlayerControlView$MediaBrowserCompatCustomActionResultReceiver;-><init>(Landroid/view/View;)V

    return-object p1
.end method


# virtual methods
.method protected final AudioAttributesCompatParcelizer()V
    .registers 2

    .line 2306
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Landroidx/media3/ui/PlayerControlView$MediaMetadataCompat;->IconCompatParcelizer:Ljava/util/List;

    return-void
.end method

.method public AudioAttributesCompatParcelizer(Landroidx/media3/ui/PlayerControlView$MediaBrowserCompatCustomActionResultReceiver;I)V
    .registers 9

    .line 2265
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView$MediaMetadataCompat;->AudioAttributesCompatParcelizer:Landroidx/media3/ui/PlayerControlView;

    invoke-static {v0}, Landroidx/media3/ui/PlayerControlView;->AudioAttributesImplApi26Parcelizer(Landroidx/media3/ui/PlayerControlView;)Lo/isUnsafeBaseType;

    move-result-object v0

    if-nez v0, :cond_9

    return-void

    :cond_9
    if-nez p2, :cond_f

    .line 2270
    invoke-virtual {p0, p1}, Landroidx/media3/ui/PlayerControlView$MediaMetadataCompat;->read(Landroidx/media3/ui/PlayerControlView$MediaBrowserCompatCustomActionResultReceiver;)V

    return-void

    .line 2272
    :cond_f
    iget-object v1, p0, Landroidx/media3/ui/PlayerControlView$MediaMetadataCompat;->IconCompatParcelizer:Ljava/util/List;

    const/4 v2, 0x1

    sub-int/2addr p2, v2

    invoke-interface {v1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroidx/media3/ui/PlayerControlView$AudioAttributesImplApi26Parcelizer;

    .line 2273
    iget-object v1, p2, Landroidx/media3/ui/PlayerControlView$AudioAttributesImplApi26Parcelizer;->IconCompatParcelizer:Lo/collectAndResolveSubtypesByTypeId$write;

    invoke-virtual {v1}, Lo/collectAndResolveSubtypesByTypeId$write;->read()Lo/setName;

    move-result-object v1

    .line 2274
    invoke-interface {v0}, Lo/isUnsafeBaseType;->onStop()Lo/SubtypeResolver;

    move-result-object v3

    .line 2275
    iget-object v3, v3, Lo/SubtypeResolver;->onAddQueueItem:Lo/onMoovContainerAtomRead;

    .line 2276
    invoke-virtual {v3, v1}, Lo/onMoovContainerAtomRead;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    const/4 v4, 0x0

    if-eqz v3, :cond_33

    invoke-virtual {p2}, Landroidx/media3/ui/PlayerControlView$AudioAttributesImplApi26Parcelizer;->write()Z

    move-result v3

    if-eqz v3, :cond_33

    goto :goto_34

    :cond_33
    move v2, v4

    .line 2277
    :goto_34
    iget-object v3, p1, Landroidx/media3/ui/PlayerControlView$MediaBrowserCompatCustomActionResultReceiver;->IconCompatParcelizer:Landroid/widget/TextView;

    iget-object v5, p2, Landroidx/media3/ui/PlayerControlView$AudioAttributesImplApi26Parcelizer;->read:Ljava/lang/String;

    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2278
    iget-object v3, p1, Landroidx/media3/ui/PlayerControlView$MediaBrowserCompatCustomActionResultReceiver;->RemoteActionCompatParcelizer:Landroid/view/View;

    if-eqz v2, :cond_40

    goto :goto_41

    :cond_40
    const/4 v4, 0x4

    :goto_41
    invoke-virtual {v3, v4}, Landroid/view/View;->setVisibility(I)V

    .line 2279
    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->itemView:Landroid/view/View;

    new-instance v2, Lo/drainBuffers;

    invoke-direct {v2, p0, v0, v1, p2}, Lo/drainBuffers;-><init>(Landroidx/media3/ui/PlayerControlView$MediaMetadataCompat;Lo/isUnsafeBaseType;Lo/setName;Landroidx/media3/ui/PlayerControlView$AudioAttributesImplApi26Parcelizer;)V

    invoke-virtual {p1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public final synthetic IconCompatParcelizer(Lo/isUnsafeBaseType;Lo/setName;Landroidx/media3/ui/PlayerControlView$AudioAttributesImplApi26Parcelizer;)V
    .registers 7

    const/16 v0, 0x1d

    .line 2281
    invoke-interface {p1, v0}, Lo/isUnsafeBaseType;->write(I)Z

    move-result v0

    if-nez v0, :cond_9

    return-void

    .line 2285
    :cond_9
    invoke-interface {p1}, Lo/isUnsafeBaseType;->onStop()Lo/SubtypeResolver;

    move-result-object v0

    .line 2288
    invoke-virtual {v0}, Lo/SubtypeResolver;->write()Lo/SubtypeResolver$AudioAttributesCompatParcelizer;

    move-result-object v0

    iget v1, p3, Landroidx/media3/ui/PlayerControlView$AudioAttributesImplApi26Parcelizer;->write:I

    .line 2291
    new-instance v2, Lo/TypeDeserializer;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v1}, Lo/initExtraTracks;->read(Ljava/lang/Object;)Lo/initExtraTracks;

    move-result-object v1

    invoke-direct {v2, p2, v1}, Lo/TypeDeserializer;-><init>(Lo/setName;Ljava/util/List;)V

    .line 2289
    invoke-virtual {v0, v2}, Lo/SubtypeResolver$AudioAttributesCompatParcelizer;->write(Lo/TypeDeserializer;)Lo/SubtypeResolver$AudioAttributesCompatParcelizer;

    move-result-object p2

    iget-object v0, p3, Landroidx/media3/ui/PlayerControlView$AudioAttributesImplApi26Parcelizer;->IconCompatParcelizer:Lo/collectAndResolveSubtypesByTypeId$write;

    .line 2292
    invoke-virtual {v0}, Lo/collectAndResolveSubtypesByTypeId$write;->AudioAttributesCompatParcelizer()I

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {p2, v0, v1}, Lo/SubtypeResolver$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer(IZ)Lo/SubtypeResolver$AudioAttributesCompatParcelizer;

    move-result-object p2

    .line 2293
    invoke-virtual {p2}, Lo/SubtypeResolver$AudioAttributesCompatParcelizer;->read()Lo/SubtypeResolver;

    move-result-object p2

    .line 2286
    invoke-interface {p1, p2}, Lo/isUnsafeBaseType;->AudioAttributesCompatParcelizer(Lo/SubtypeResolver;)V

    .line 2294
    iget-object p1, p3, Landroidx/media3/ui/PlayerControlView$AudioAttributesImplApi26Parcelizer;->read:Ljava/lang/String;

    invoke-virtual {p0, p1}, Landroidx/media3/ui/PlayerControlView$MediaMetadataCompat;->write(Ljava/lang/String;)V

    .line 2295
    iget-object p0, p0, Landroidx/media3/ui/PlayerControlView$MediaMetadataCompat;->AudioAttributesCompatParcelizer:Landroidx/media3/ui/PlayerControlView;

    invoke-static {p0}, Landroidx/media3/ui/PlayerControlView;->onPrepareFromSearch(Landroidx/media3/ui/PlayerControlView;)Landroid/widget/PopupWindow;

    move-result-object p0

    invoke-virtual {p0}, Landroid/widget/PopupWindow;->dismiss()V

    return-void
.end method

.method public getItemCount()I
    .registers 2

    .line 2302
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView$MediaMetadataCompat;->IconCompatParcelizer:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_a

    const/4 p0, 0x0

    return p0

    :cond_a
    iget-object p0, p0, Landroidx/media3/ui/PlayerControlView$MediaMetadataCompat;->IconCompatParcelizer:Ljava/util/List;

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p0

    add-int/lit8 p0, p0, 0x1

    return p0
.end method

.method public synthetic onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;I)V
    .registers 3

    .line 2240
    check-cast p1, Landroidx/media3/ui/PlayerControlView$MediaBrowserCompatCustomActionResultReceiver;

    invoke-virtual {p0, p1, p2}, Landroidx/media3/ui/PlayerControlView$MediaMetadataCompat;->AudioAttributesCompatParcelizer(Landroidx/media3/ui/PlayerControlView$MediaBrowserCompatCustomActionResultReceiver;I)V

    return-void
.end method

.method public synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;
    .registers 3

    .line 2240
    invoke-direct {p0, p1}, Landroidx/media3/ui/PlayerControlView$MediaMetadataCompat;->IconCompatParcelizer(Landroid/view/ViewGroup;)Landroidx/media3/ui/PlayerControlView$MediaBrowserCompatCustomActionResultReceiver;

    move-result-object p0

    return-object p0
.end method

.method protected abstract read(Landroidx/media3/ui/PlayerControlView$MediaBrowserCompatCustomActionResultReceiver;)V
.end method

.method protected abstract write(Ljava/lang/String;)V
.end method

###### Class kotlin.drainBuffers (o.drainBuffers)
.class public final synthetic Lo/drainBuffers;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic AudioAttributesCompatParcelizer:Lo/isUnsafeBaseType;

.field public final synthetic RemoteActionCompatParcelizer:Landroidx/media3/ui/PlayerControlView$MediaMetadataCompat;

.field public final synthetic read:Lo/setName;

.field public final synthetic write:Landroidx/media3/ui/PlayerControlView$AudioAttributesImplApi26Parcelizer;


# direct methods
.method public synthetic constructor <init>(Landroidx/media3/ui/PlayerControlView$MediaMetadataCompat;Lo/isUnsafeBaseType;Lo/setName;Landroidx/media3/ui/PlayerControlView$AudioAttributesImplApi26Parcelizer;)V
    .registers 5

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo/drainBuffers;->RemoteActionCompatParcelizer:Landroidx/media3/ui/PlayerControlView$MediaMetadataCompat;

    iput-object p2, p0, Lo/drainBuffers;->AudioAttributesCompatParcelizer:Lo/isUnsafeBaseType;

    iput-object p3, p0, Lo/drainBuffers;->read:Lo/setName;

    iput-object p4, p0, Lo/drainBuffers;->write:Landroidx/media3/ui/PlayerControlView$AudioAttributesImplApi26Parcelizer;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .registers 4

    .line 0
    iget-object p1, p0, Lo/drainBuffers;->RemoteActionCompatParcelizer:Landroidx/media3/ui/PlayerControlView$MediaMetadataCompat;

    iget-object v0, p0, Lo/drainBuffers;->AudioAttributesCompatParcelizer:Lo/isUnsafeBaseType;

    iget-object v1, p0, Lo/drainBuffers;->read:Lo/setName;

    iget-object p0, p0, Lo/drainBuffers;->write:Landroidx/media3/ui/PlayerControlView$AudioAttributesImplApi26Parcelizer;

    invoke-virtual {p1, v0, v1, p0}, Landroidx/media3/ui/PlayerControlView$MediaMetadataCompat;->IconCompatParcelizer(Lo/isUnsafeBaseType;Lo/setName;Landroidx/media3/ui/PlayerControlView$AudioAttributesImplApi26Parcelizer;)V

    return-void
.end method

###### Class androidx.media3.ui.PlayerControlView.RemoteActionCompatParcelizer (androidx.media3.ui.PlayerControlView$RemoteActionCompatParcelizer)
.class public interface abstract Landroidx/media3/ui/PlayerControlView$RemoteActionCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/ui/PlayerControlView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "RemoteActionCompatParcelizer"
.end annotation

###### Class androidx.media3.ui.PlayerControlView.read (androidx.media3.ui.PlayerControlView$read)
.class final Landroidx/media3/ui/PlayerControlView$read;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/isUnsafeBaseType$AudioAttributesCompatParcelizer;
.implements Lo/PrivateMaxEntriesMapRemovalTask$write;
.implements Landroid/view/View$OnClickListener;
.implements Landroid/widget/PopupWindow$OnDismissListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/ui/PlayerControlView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "read"
.end annotation


# instance fields
.field final synthetic RemoteActionCompatParcelizer:Landroidx/media3/ui/PlayerControlView;


# direct methods
.method private constructor <init>(Landroidx/media3/ui/PlayerControlView;)V
    .registers 2

    .line 1788
    iput-object p1, p0, Landroidx/media3/ui/PlayerControlView$read;->RemoteActionCompatParcelizer:Landroidx/media3/ui/PlayerControlView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Landroidx/media3/ui/PlayerControlView;B)V
    .registers 3

    .line 1788
    invoke-direct {p0, p1}, Landroidx/media3/ui/PlayerControlView$read;-><init>(Landroidx/media3/ui/PlayerControlView;)V

    return-void
.end method


# virtual methods
.method public final IconCompatParcelizer(J)V
    .registers 5

    .line 1849
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView$read;->RemoteActionCompatParcelizer:Landroidx/media3/ui/PlayerControlView;

    invoke-static {v0}, Landroidx/media3/ui/PlayerControlView;->read(Landroidx/media3/ui/PlayerControlView;)Landroid/widget/TextView;

    move-result-object v0

    if-eqz v0, :cond_21

    .line 1850
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView$read;->RemoteActionCompatParcelizer:Landroidx/media3/ui/PlayerControlView;

    invoke-static {v0}, Landroidx/media3/ui/PlayerControlView;->read(Landroidx/media3/ui/PlayerControlView;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Landroidx/media3/ui/PlayerControlView$read;->RemoteActionCompatParcelizer:Landroidx/media3/ui/PlayerControlView;

    invoke-static {v1}, Landroidx/media3/ui/PlayerControlView;->write(Landroidx/media3/ui/PlayerControlView;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object p0, p0, Landroidx/media3/ui/PlayerControlView$read;->RemoteActionCompatParcelizer:Landroidx/media3/ui/PlayerControlView;

    invoke-static {p0}, Landroidx/media3/ui/PlayerControlView;->AudioAttributesImplBaseParcelizer(Landroidx/media3/ui/PlayerControlView;)Ljava/util/Formatter;

    move-result-object p0

    invoke-static {v1, p0, p1, p2}, Lo/LaissezFaireSubTypeValidator;->read(Ljava/lang/StringBuilder;Ljava/util/Formatter;J)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_21
    return-void
.end method

.method public final IconCompatParcelizer(Lo/isUnsafeBaseType;Lo/isUnsafeBaseType$RemoteActionCompatParcelizer;)V
    .registers 6

    const/4 p1, 0x4

    const/4 v0, 0x5

    const/16 v1, 0xd

    .line 1796
    filled-new-array {p1, v0, v1}, [I

    move-result-object v2

    invoke-virtual {p2, v2}, Lo/isUnsafeBaseType$RemoteActionCompatParcelizer;->read([I)Z

    move-result v2

    if-eqz v2, :cond_13

    .line 1800
    iget-object v2, p0, Landroidx/media3/ui/PlayerControlView$read;->RemoteActionCompatParcelizer:Landroidx/media3/ui/PlayerControlView;

    invoke-static {v2}, Landroidx/media3/ui/PlayerControlView;->onPause(Landroidx/media3/ui/PlayerControlView;)V

    :cond_13
    const/4 v2, 0x7

    .line 1802
    filled-new-array {p1, v0, v2, v1}, [I

    move-result-object p1

    invoke-virtual {p2, p1}, Lo/isUnsafeBaseType$RemoteActionCompatParcelizer;->read([I)Z

    move-result p1

    if-eqz p1, :cond_23

    .line 1807
    iget-object p1, p0, Landroidx/media3/ui/PlayerControlView$read;->RemoteActionCompatParcelizer:Landroidx/media3/ui/PlayerControlView;

    invoke-static {p1}, Landroidx/media3/ui/PlayerControlView;->onPlayFromUri(Landroidx/media3/ui/PlayerControlView;)V

    :cond_23
    const/16 p1, 0x8

    .line 1809
    filled-new-array {p1, v1}, [I

    move-result-object p1

    invoke-virtual {p2, p1}, Lo/isUnsafeBaseType$RemoteActionCompatParcelizer;->read([I)Z

    move-result p1

    if-eqz p1, :cond_34

    .line 1810
    iget-object p1, p0, Landroidx/media3/ui/PlayerControlView$read;->RemoteActionCompatParcelizer:Landroidx/media3/ui/PlayerControlView;

    invoke-static {p1}, Landroidx/media3/ui/PlayerControlView;->onRewind(Landroidx/media3/ui/PlayerControlView;)V

    :cond_34
    const/16 p1, 0x9

    .line 1812
    filled-new-array {p1, v1}, [I

    move-result-object p1

    invoke-virtual {p2, p1}, Lo/isUnsafeBaseType$RemoteActionCompatParcelizer;->read([I)Z

    move-result p1

    if-eqz p1, :cond_45

    .line 1814
    iget-object p1, p0, Landroidx/media3/ui/PlayerControlView$read;->RemoteActionCompatParcelizer:Landroidx/media3/ui/PlayerControlView;

    invoke-static {p1}, Landroidx/media3/ui/PlayerControlView;->onSeekTo(Landroidx/media3/ui/PlayerControlView;)V

    .line 1816
    :cond_45
    new-array p1, v2, [I

    fill-array-data p1, :array_8a

    invoke-virtual {p2, p1}, Lo/isUnsafeBaseType$RemoteActionCompatParcelizer;->read([I)Z

    move-result p1

    if-eqz p1, :cond_55

    .line 1824
    iget-object p1, p0, Landroidx/media3/ui/PlayerControlView$read;->RemoteActionCompatParcelizer:Landroidx/media3/ui/PlayerControlView;

    invoke-static {p1}, Landroidx/media3/ui/PlayerControlView;->onSetRepeatMode(Landroidx/media3/ui/PlayerControlView;)V

    :cond_55
    const/16 p1, 0xb

    const/4 v0, 0x0

    .line 1826
    filled-new-array {p1, v0, v1}, [I

    move-result-object p1

    invoke-virtual {p2, p1}, Lo/isUnsafeBaseType$RemoteActionCompatParcelizer;->read([I)Z

    move-result p1

    if-eqz p1, :cond_67

    .line 1828
    iget-object p1, p0, Landroidx/media3/ui/PlayerControlView$read;->RemoteActionCompatParcelizer:Landroidx/media3/ui/PlayerControlView;

    invoke-static {p1}, Landroidx/media3/ui/PlayerControlView;->onSetPlaybackSpeed(Landroidx/media3/ui/PlayerControlView;)V

    :cond_67
    const/16 p1, 0xc

    .line 1830
    filled-new-array {p1, v1}, [I

    move-result-object p1

    invoke-virtual {p2, p1}, Lo/isUnsafeBaseType$RemoteActionCompatParcelizer;->read([I)Z

    move-result p1

    if-eqz p1, :cond_78

    .line 1831
    iget-object p1, p0, Landroidx/media3/ui/PlayerControlView$read;->RemoteActionCompatParcelizer:Landroidx/media3/ui/PlayerControlView;

    invoke-static {p1}, Landroidx/media3/ui/PlayerControlView;->onSetCaptioningEnabled(Landroidx/media3/ui/PlayerControlView;)V

    :cond_78
    const/4 p1, 0x2

    .line 1833
    filled-new-array {p1, v1}, [I

    move-result-object p1

    invoke-virtual {p2, p1}, Lo/isUnsafeBaseType$RemoteActionCompatParcelizer;->read([I)Z

    move-result p1

    if-eqz p1, :cond_88

    .line 1834
    iget-object p0, p0, Landroidx/media3/ui/PlayerControlView$read;->RemoteActionCompatParcelizer:Landroidx/media3/ui/PlayerControlView;

    invoke-static {p0}, Landroidx/media3/ui/PlayerControlView;->RemoteActionCompatParcelizer(Landroidx/media3/ui/PlayerControlView;)V

    :cond_88
    return-void

    nop

    :array_8a
    .array-data 4
        0x8
        0x9
        0xb
        0x0
        0x10
        0x11
        0xd
    .end array-data
.end method

.method public final RemoteActionCompatParcelizer(J)V
    .registers 6

    .line 1840
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView$read;->RemoteActionCompatParcelizer:Landroidx/media3/ui/PlayerControlView;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Landroidx/media3/ui/PlayerControlView;->write(Landroidx/media3/ui/PlayerControlView;Z)Z

    .line 1841
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView$read;->RemoteActionCompatParcelizer:Landroidx/media3/ui/PlayerControlView;

    invoke-static {v0}, Landroidx/media3/ui/PlayerControlView;->read(Landroidx/media3/ui/PlayerControlView;)Landroid/widget/TextView;

    move-result-object v0

    if-eqz v0, :cond_27

    .line 1842
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView$read;->RemoteActionCompatParcelizer:Landroidx/media3/ui/PlayerControlView;

    invoke-static {v0}, Landroidx/media3/ui/PlayerControlView;->read(Landroidx/media3/ui/PlayerControlView;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Landroidx/media3/ui/PlayerControlView$read;->RemoteActionCompatParcelizer:Landroidx/media3/ui/PlayerControlView;

    invoke-static {v1}, Landroidx/media3/ui/PlayerControlView;->write(Landroidx/media3/ui/PlayerControlView;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Landroidx/media3/ui/PlayerControlView$read;->RemoteActionCompatParcelizer:Landroidx/media3/ui/PlayerControlView;

    invoke-static {v2}, Landroidx/media3/ui/PlayerControlView;->AudioAttributesImplBaseParcelizer(Landroidx/media3/ui/PlayerControlView;)Ljava/util/Formatter;

    move-result-object v2

    invoke-static {v1, v2, p1, p2}, Lo/LaissezFaireSubTypeValidator;->read(Ljava/lang/StringBuilder;Ljava/util/Formatter;J)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1844
    :cond_27
    iget-object p0, p0, Landroidx/media3/ui/PlayerControlView$read;->RemoteActionCompatParcelizer:Landroidx/media3/ui/PlayerControlView;

    invoke-static {p0}, Landroidx/media3/ui/PlayerControlView;->AudioAttributesImplApi21Parcelizer(Landroidx/media3/ui/PlayerControlView;)Lo/containsValue;

    move-result-object p0

    invoke-virtual {p0}, Lo/containsValue;->MediaBrowserCompatItemReceiver()V

    return-void
.end method

.method public final RemoteActionCompatParcelizer(JZ)V
    .registers 6

    .line 1856
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView$read;->RemoteActionCompatParcelizer:Landroidx/media3/ui/PlayerControlView;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroidx/media3/ui/PlayerControlView;->write(Landroidx/media3/ui/PlayerControlView;Z)Z

    if-nez p3, :cond_19

    .line 1857
    iget-object p3, p0, Landroidx/media3/ui/PlayerControlView$read;->RemoteActionCompatParcelizer:Landroidx/media3/ui/PlayerControlView;

    invoke-static {p3}, Landroidx/media3/ui/PlayerControlView;->AudioAttributesImplApi26Parcelizer(Landroidx/media3/ui/PlayerControlView;)Lo/isUnsafeBaseType;

    move-result-object p3

    if-eqz p3, :cond_19

    .line 1858
    iget-object p3, p0, Landroidx/media3/ui/PlayerControlView$read;->RemoteActionCompatParcelizer:Landroidx/media3/ui/PlayerControlView;

    invoke-static {p3}, Landroidx/media3/ui/PlayerControlView;->AudioAttributesImplApi26Parcelizer(Landroidx/media3/ui/PlayerControlView;)Lo/isUnsafeBaseType;

    move-result-object v0

    invoke-static {p3, v0, p1, p2}, Landroidx/media3/ui/PlayerControlView;->RemoteActionCompatParcelizer(Landroidx/media3/ui/PlayerControlView;Lo/isUnsafeBaseType;J)V

    .line 1860
    :cond_19
    iget-object p0, p0, Landroidx/media3/ui/PlayerControlView$read;->RemoteActionCompatParcelizer:Landroidx/media3/ui/PlayerControlView;

    invoke-static {p0}, Landroidx/media3/ui/PlayerControlView;->AudioAttributesImplApi21Parcelizer(Landroidx/media3/ui/PlayerControlView;)Lo/containsValue;

    move-result-object p0

    invoke-virtual {p0}, Lo/containsValue;->MediaBrowserCompatCustomActionResultReceiver()V

    return-void
.end method

.method public final onClick(Landroid/view/View;)V
    .registers 4

    .line 1872
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView$read;->RemoteActionCompatParcelizer:Landroidx/media3/ui/PlayerControlView;

    invoke-static {v0}, Landroidx/media3/ui/PlayerControlView;->AudioAttributesImplApi26Parcelizer(Landroidx/media3/ui/PlayerControlView;)Lo/isUnsafeBaseType;

    move-result-object v0

    if-eqz v0, :cond_138

    .line 1876
    iget-object v1, p0, Landroidx/media3/ui/PlayerControlView$read;->RemoteActionCompatParcelizer:Landroidx/media3/ui/PlayerControlView;

    invoke-static {v1}, Landroidx/media3/ui/PlayerControlView;->AudioAttributesImplApi21Parcelizer(Landroidx/media3/ui/PlayerControlView;)Lo/containsValue;

    move-result-object v1

    invoke-virtual {v1}, Lo/containsValue;->MediaBrowserCompatCustomActionResultReceiver()V

    .line 1877
    iget-object v1, p0, Landroidx/media3/ui/PlayerControlView$read;->RemoteActionCompatParcelizer:Landroidx/media3/ui/PlayerControlView;

    invoke-static {v1}, Landroidx/media3/ui/PlayerControlView;->MediaBrowserCompatItemReceiver(Landroidx/media3/ui/PlayerControlView;)Landroid/widget/ImageView;

    move-result-object v1

    if-ne v1, p1, :cond_25

    const/16 p0, 0x9

    .line 1878
    invoke-interface {v0, p0}, Lo/isUnsafeBaseType;->write(I)Z

    move-result p0

    if-eqz p0, :cond_138

    .line 1879
    invoke-interface {v0}, Lo/isUnsafeBaseType;->RatingCompat()V

    return-void

    .line 1881
    :cond_25
    iget-object v1, p0, Landroidx/media3/ui/PlayerControlView$read;->RemoteActionCompatParcelizer:Landroidx/media3/ui/PlayerControlView;

    invoke-static {v1}, Landroidx/media3/ui/PlayerControlView;->MediaDescriptionCompat(Landroidx/media3/ui/PlayerControlView;)Landroid/widget/ImageView;

    move-result-object v1

    if-ne v1, p1, :cond_38

    const/4 p0, 0x7

    .line 1882
    invoke-interface {v0, p0}, Lo/isUnsafeBaseType;->write(I)Z

    move-result p0

    if-eqz p0, :cond_138

    .line 1883
    invoke-interface {v0}, Lo/isUnsafeBaseType;->MediaBrowserCompatMediaItem()V

    return-void

    .line 1885
    :cond_38
    iget-object v1, p0, Landroidx/media3/ui/PlayerControlView$read;->RemoteActionCompatParcelizer:Landroidx/media3/ui/PlayerControlView;

    invoke-static {v1}, Landroidx/media3/ui/PlayerControlView;->RatingCompat(Landroidx/media3/ui/PlayerControlView;)Landroid/view/View;

    move-result-object v1

    if-ne v1, p1, :cond_53

    .line 1886
    invoke-interface {v0}, Lo/isUnsafeBaseType;->onRewind()I

    move-result p0

    const/4 p1, 0x4

    if-eq p0, p1, :cond_138

    const/16 p0, 0xc

    .line 1887
    invoke-interface {v0, p0}, Lo/isUnsafeBaseType;->write(I)Z

    move-result p0

    if-eqz p0, :cond_138

    .line 1888
    invoke-interface {v0}, Lo/isUnsafeBaseType;->MediaDescriptionCompat()V

    return-void

    .line 1890
    :cond_53
    iget-object v1, p0, Landroidx/media3/ui/PlayerControlView$read;->RemoteActionCompatParcelizer:Landroidx/media3/ui/PlayerControlView;

    invoke-static {v1}, Landroidx/media3/ui/PlayerControlView;->MediaMetadataCompat(Landroidx/media3/ui/PlayerControlView;)Landroid/view/View;

    move-result-object v1

    if-ne v1, p1, :cond_67

    const/16 p0, 0xb

    .line 1891
    invoke-interface {v0, p0}, Lo/isUnsafeBaseType;->write(I)Z

    move-result p0

    if-eqz p0, :cond_138

    .line 1892
    invoke-interface {v0}, Lo/isUnsafeBaseType;->MediaBrowserCompatSearchResultReceiver()V

    return-void

    .line 1894
    :cond_67
    iget-object v1, p0, Landroidx/media3/ui/PlayerControlView$read;->RemoteActionCompatParcelizer:Landroidx/media3/ui/PlayerControlView;

    invoke-static {v1}, Landroidx/media3/ui/PlayerControlView;->MediaBrowserCompatSearchResultReceiver(Landroidx/media3/ui/PlayerControlView;)Landroid/widget/ImageView;

    move-result-object v1

    if-ne v1, p1, :cond_79

    .line 1895
    iget-object p0, p0, Landroidx/media3/ui/PlayerControlView$read;->RemoteActionCompatParcelizer:Landroidx/media3/ui/PlayerControlView;

    invoke-static {p0}, Landroidx/media3/ui/PlayerControlView;->MediaBrowserCompatMediaItem(Landroidx/media3/ui/PlayerControlView;)Z

    move-result p0

    invoke-static {v0, p0}, Lo/LaissezFaireSubTypeValidator;->IconCompatParcelizer(Lo/isUnsafeBaseType;Z)Z

    return-void

    .line 1896
    :cond_79
    iget-object v1, p0, Landroidx/media3/ui/PlayerControlView$read;->RemoteActionCompatParcelizer:Landroidx/media3/ui/PlayerControlView;

    invoke-static {v1}, Landroidx/media3/ui/PlayerControlView;->handleMediaPlayPauseIfPendingOnHandler(Landroidx/media3/ui/PlayerControlView;)Landroid/widget/ImageView;

    move-result-object v1

    if-ne v1, p1, :cond_9b

    const/16 p1, 0xf

    .line 1897
    invoke-interface {v0, p1}, Lo/isUnsafeBaseType;->write(I)Z

    move-result p1

    if-eqz p1, :cond_138

    .line 1899
    invoke-interface {v0}, Lo/isUnsafeBaseType;->onSetShuffleMode()I

    move-result p1

    iget-object p0, p0, Landroidx/media3/ui/PlayerControlView$read;->RemoteActionCompatParcelizer:Landroidx/media3/ui/PlayerControlView;

    invoke-static {p0}, Landroidx/media3/ui/PlayerControlView;->onAddQueueItem(Landroidx/media3/ui/PlayerControlView;)I

    move-result p0

    invoke-static {p1, p0}, Lo/AsPropertyTypeSerializer;->AudioAttributesCompatParcelizer(II)I

    move-result p0

    .line 1898
    invoke-interface {v0, p0}, Lo/isUnsafeBaseType;->IconCompatParcelizer(I)V

    return-void

    .line 1901
    :cond_9b
    iget-object v1, p0, Landroidx/media3/ui/PlayerControlView$read;->RemoteActionCompatParcelizer:Landroidx/media3/ui/PlayerControlView;

    invoke-static {v1}, Landroidx/media3/ui/PlayerControlView;->onCustomAction(Landroidx/media3/ui/PlayerControlView;)Landroid/widget/ImageView;

    move-result-object v1

    if-ne v1, p1, :cond_b5

    const/16 p0, 0xe

    .line 1902
    invoke-interface {v0, p0}, Lo/isUnsafeBaseType;->write(I)Z

    move-result p0

    if-eqz p0, :cond_138

    .line 1903
    invoke-interface {v0}, Lo/isUnsafeBaseType;->onSetPlaybackSpeed()Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    invoke-interface {v0, p0}, Lo/isUnsafeBaseType;->IconCompatParcelizer(Z)V

    return-void

    .line 1905
    :cond_b5
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView$read;->RemoteActionCompatParcelizer:Landroidx/media3/ui/PlayerControlView;

    invoke-static {v0}, Landroidx/media3/ui/PlayerControlView;->onCommand(Landroidx/media3/ui/PlayerControlView;)Landroid/view/View;

    move-result-object v0

    if-ne v0, p1, :cond_d6

    .line 1906
    iget-object p1, p0, Landroidx/media3/ui/PlayerControlView$read;->RemoteActionCompatParcelizer:Landroidx/media3/ui/PlayerControlView;

    invoke-static {p1}, Landroidx/media3/ui/PlayerControlView;->AudioAttributesImplApi21Parcelizer(Landroidx/media3/ui/PlayerControlView;)Lo/containsValue;

    move-result-object p1

    invoke-virtual {p1}, Lo/containsValue;->MediaBrowserCompatItemReceiver()V

    .line 1907
    iget-object p1, p0, Landroidx/media3/ui/PlayerControlView$read;->RemoteActionCompatParcelizer:Landroidx/media3/ui/PlayerControlView;

    invoke-static {p1}, Landroidx/media3/ui/PlayerControlView;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(Landroidx/media3/ui/PlayerControlView;)Landroidx/media3/ui/PlayerControlView$AudioAttributesImplApi21Parcelizer;

    move-result-object v0

    iget-object p0, p0, Landroidx/media3/ui/PlayerControlView$read;->RemoteActionCompatParcelizer:Landroidx/media3/ui/PlayerControlView;

    invoke-static {p0}, Landroidx/media3/ui/PlayerControlView;->onCommand(Landroidx/media3/ui/PlayerControlView;)Landroid/view/View;

    move-result-object p0

    invoke-static {p1, v0, p0}, Landroidx/media3/ui/PlayerControlView;->read(Landroidx/media3/ui/PlayerControlView;Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;Landroid/view/View;)V

    return-void

    .line 1908
    :cond_d6
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView$read;->RemoteActionCompatParcelizer:Landroidx/media3/ui/PlayerControlView;

    invoke-static {v0}, Landroidx/media3/ui/PlayerControlView;->onPlayFromMediaId(Landroidx/media3/ui/PlayerControlView;)Landroid/view/View;

    move-result-object v0

    if-ne v0, p1, :cond_f7

    .line 1909
    iget-object p1, p0, Landroidx/media3/ui/PlayerControlView$read;->RemoteActionCompatParcelizer:Landroidx/media3/ui/PlayerControlView;

    invoke-static {p1}, Landroidx/media3/ui/PlayerControlView;->AudioAttributesImplApi21Parcelizer(Landroidx/media3/ui/PlayerControlView;)Lo/containsValue;

    move-result-object p1

    invoke-virtual {p1}, Lo/containsValue;->MediaBrowserCompatItemReceiver()V

    .line 1910
    iget-object p1, p0, Landroidx/media3/ui/PlayerControlView$read;->RemoteActionCompatParcelizer:Landroidx/media3/ui/PlayerControlView;

    invoke-static {p1}, Landroidx/media3/ui/PlayerControlView;->onPlay(Landroidx/media3/ui/PlayerControlView;)Landroidx/media3/ui/PlayerControlView$IconCompatParcelizer;

    move-result-object v0

    iget-object p0, p0, Landroidx/media3/ui/PlayerControlView$read;->RemoteActionCompatParcelizer:Landroidx/media3/ui/PlayerControlView;

    invoke-static {p0}, Landroidx/media3/ui/PlayerControlView;->onPlayFromMediaId(Landroidx/media3/ui/PlayerControlView;)Landroid/view/View;

    move-result-object p0

    invoke-static {p1, v0, p0}, Landroidx/media3/ui/PlayerControlView;->read(Landroidx/media3/ui/PlayerControlView;Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;Landroid/view/View;)V

    return-void

    .line 1911
    :cond_f7
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView$read;->RemoteActionCompatParcelizer:Landroidx/media3/ui/PlayerControlView;

    invoke-static {v0}, Landroidx/media3/ui/PlayerControlView;->onMediaButtonEvent(Landroidx/media3/ui/PlayerControlView;)Landroid/view/View;

    move-result-object v0

    if-ne v0, p1, :cond_118

    .line 1912
    iget-object p1, p0, Landroidx/media3/ui/PlayerControlView$read;->RemoteActionCompatParcelizer:Landroidx/media3/ui/PlayerControlView;

    invoke-static {p1}, Landroidx/media3/ui/PlayerControlView;->AudioAttributesImplApi21Parcelizer(Landroidx/media3/ui/PlayerControlView;)Lo/containsValue;

    move-result-object p1

    invoke-virtual {p1}, Lo/containsValue;->MediaBrowserCompatItemReceiver()V

    .line 1913
    iget-object p1, p0, Landroidx/media3/ui/PlayerControlView$read;->RemoteActionCompatParcelizer:Landroidx/media3/ui/PlayerControlView;

    invoke-static {p1}, Landroidx/media3/ui/PlayerControlView;->onFastForward(Landroidx/media3/ui/PlayerControlView;)Landroidx/media3/ui/PlayerControlView$write;

    move-result-object v0

    iget-object p0, p0, Landroidx/media3/ui/PlayerControlView$read;->RemoteActionCompatParcelizer:Landroidx/media3/ui/PlayerControlView;

    invoke-static {p0}, Landroidx/media3/ui/PlayerControlView;->onMediaButtonEvent(Landroidx/media3/ui/PlayerControlView;)Landroid/view/View;

    move-result-object p0

    invoke-static {p1, v0, p0}, Landroidx/media3/ui/PlayerControlView;->read(Landroidx/media3/ui/PlayerControlView;Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;Landroid/view/View;)V

    return-void

    .line 1914
    :cond_118
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView$read;->RemoteActionCompatParcelizer:Landroidx/media3/ui/PlayerControlView;

    invoke-static {v0}, Landroidx/media3/ui/PlayerControlView;->onPrepareFromMediaId(Landroidx/media3/ui/PlayerControlView;)Landroid/widget/ImageView;

    move-result-object v0

    if-ne v0, p1, :cond_138

    .line 1915
    iget-object p1, p0, Landroidx/media3/ui/PlayerControlView$read;->RemoteActionCompatParcelizer:Landroidx/media3/ui/PlayerControlView;

    invoke-static {p1}, Landroidx/media3/ui/PlayerControlView;->AudioAttributesImplApi21Parcelizer(Landroidx/media3/ui/PlayerControlView;)Lo/containsValue;

    move-result-object p1

    invoke-virtual {p1}, Lo/containsValue;->MediaBrowserCompatItemReceiver()V

    .line 1916
    iget-object p1, p0, Landroidx/media3/ui/PlayerControlView$read;->RemoteActionCompatParcelizer:Landroidx/media3/ui/PlayerControlView;

    invoke-static {p1}, Landroidx/media3/ui/PlayerControlView;->onPrepare(Landroidx/media3/ui/PlayerControlView;)Landroidx/media3/ui/PlayerControlView$AudioAttributesImplBaseParcelizer;

    move-result-object v0

    iget-object p0, p0, Landroidx/media3/ui/PlayerControlView$read;->RemoteActionCompatParcelizer:Landroidx/media3/ui/PlayerControlView;

    invoke-static {p0}, Landroidx/media3/ui/PlayerControlView;->onPrepareFromMediaId(Landroidx/media3/ui/PlayerControlView;)Landroid/widget/ImageView;

    move-result-object p0

    invoke-static {p1, v0, p0}, Landroidx/media3/ui/PlayerControlView;->read(Landroidx/media3/ui/PlayerControlView;Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;Landroid/view/View;)V

    :cond_138
    return-void
.end method

.method public final onDismiss()V
    .registers 2

    .line 1865
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView$read;->RemoteActionCompatParcelizer:Landroidx/media3/ui/PlayerControlView;

    invoke-static {v0}, Landroidx/media3/ui/PlayerControlView;->MediaBrowserCompatCustomActionResultReceiver(Landroidx/media3/ui/PlayerControlView;)Z

    move-result v0

    if-eqz v0, :cond_11

    .line 1866
    iget-object p0, p0, Landroidx/media3/ui/PlayerControlView$read;->RemoteActionCompatParcelizer:Landroidx/media3/ui/PlayerControlView;

    invoke-static {p0}, Landroidx/media3/ui/PlayerControlView;->AudioAttributesImplApi21Parcelizer(Landroidx/media3/ui/PlayerControlView;)Lo/containsValue;

    move-result-object p0

    invoke-virtual {p0}, Lo/containsValue;->MediaBrowserCompatCustomActionResultReceiver()V

    :cond_11
    return-void
.end method

###### Class androidx.media3.ui.PlayerControlView.write (androidx.media3.ui.PlayerControlView$write)
.class public final Landroidx/media3/ui/PlayerControlView$write;
.super Landroidx/media3/ui/PlayerControlView$MediaMetadataCompat;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/ui/PlayerControlView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "write"
.end annotation


# instance fields
.field final synthetic write:Landroidx/media3/ui/PlayerControlView;


# direct methods
.method private constructor <init>(Landroidx/media3/ui/PlayerControlView;)V
    .registers 2

    .line 2165
    iput-object p1, p0, Landroidx/media3/ui/PlayerControlView$write;->write:Landroidx/media3/ui/PlayerControlView;

    invoke-direct {p0, p1}, Landroidx/media3/ui/PlayerControlView$MediaMetadataCompat;-><init>(Landroidx/media3/ui/PlayerControlView;)V

    return-void
.end method

.method synthetic constructor <init>(Landroidx/media3/ui/PlayerControlView;B)V
    .registers 3

    .line 2165
    invoke-direct {p0, p1}, Landroidx/media3/ui/PlayerControlView$write;-><init>(Landroidx/media3/ui/PlayerControlView;)V

    return-void
.end method

.method private IconCompatParcelizer(Lo/SubtypeResolver;)Z
    .registers 6

    const/4 v0, 0x0

    move v1, v0

    .line 2198
    :goto_2
    iget-object v2, p0, Landroidx/media3/ui/PlayerControlView$MediaMetadataCompat;->IconCompatParcelizer:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_25

    .line 2199
    iget-object v2, p0, Landroidx/media3/ui/PlayerControlView$MediaMetadataCompat;->IconCompatParcelizer:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/media3/ui/PlayerControlView$AudioAttributesImplApi26Parcelizer;

    iget-object v2, v2, Landroidx/media3/ui/PlayerControlView$AudioAttributesImplApi26Parcelizer;->IconCompatParcelizer:Lo/collectAndResolveSubtypesByTypeId$write;

    invoke-virtual {v2}, Lo/collectAndResolveSubtypesByTypeId$write;->read()Lo/setName;

    move-result-object v2

    .line 2200
    iget-object v3, p1, Lo/SubtypeResolver;->onAddQueueItem:Lo/onMoovContainerAtomRead;

    invoke-virtual {v3, v2}, Lo/onMoovContainerAtomRead;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_22

    const/4 p0, 0x1

    return p0

    :cond_22
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_25
    return v0
.end method


# virtual methods
.method public final synthetic read()V
    .registers 5

    .line 2177
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView$write;->write:Landroidx/media3/ui/PlayerControlView;

    invoke-static {v0}, Landroidx/media3/ui/PlayerControlView;->AudioAttributesImplApi26Parcelizer(Landroidx/media3/ui/PlayerControlView;)Lo/isUnsafeBaseType;

    move-result-object v0

    if-eqz v0, :cond_5f

    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView$write;->write:Landroidx/media3/ui/PlayerControlView;

    .line 2178
    invoke-static {v0}, Landroidx/media3/ui/PlayerControlView;->AudioAttributesImplApi26Parcelizer(Landroidx/media3/ui/PlayerControlView;)Lo/isUnsafeBaseType;

    move-result-object v0

    const/16 v1, 0x1d

    invoke-interface {v0, v1}, Lo/isUnsafeBaseType;->write(I)Z

    move-result v0

    if-eqz v0, :cond_5f

    .line 2181
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView$write;->write:Landroidx/media3/ui/PlayerControlView;

    .line 2182
    invoke-static {v0}, Landroidx/media3/ui/PlayerControlView;->AudioAttributesImplApi26Parcelizer(Landroidx/media3/ui/PlayerControlView;)Lo/isUnsafeBaseType;

    move-result-object v0

    invoke-interface {v0}, Lo/isUnsafeBaseType;->onStop()Lo/SubtypeResolver;

    move-result-object v0

    .line 2183
    iget-object v1, p0, Landroidx/media3/ui/PlayerControlView$write;->write:Landroidx/media3/ui/PlayerControlView;

    invoke-static {v1}, Landroidx/media3/ui/PlayerControlView;->AudioAttributesImplApi26Parcelizer(Landroidx/media3/ui/PlayerControlView;)Lo/isUnsafeBaseType;

    move-result-object v1

    invoke-static {v1}, Lo/LaissezFaireSubTypeValidator;->IconCompatParcelizer(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/isUnsafeBaseType;

    .line 2186
    invoke-virtual {v0}, Lo/SubtypeResolver;->write()Lo/SubtypeResolver$AudioAttributesCompatParcelizer;

    move-result-object v0

    const/4 v2, 0x1

    .line 2187
    invoke-virtual {v0, v2}, Lo/SubtypeResolver$AudioAttributesCompatParcelizer;->write(I)Lo/SubtypeResolver$AudioAttributesCompatParcelizer;

    move-result-object v0

    const/4 v3, 0x0

    .line 2188
    invoke-virtual {v0, v2, v3}, Lo/SubtypeResolver$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer(IZ)Lo/SubtypeResolver$AudioAttributesCompatParcelizer;

    move-result-object v0

    .line 2189
    invoke-virtual {v0}, Lo/SubtypeResolver$AudioAttributesCompatParcelizer;->read()Lo/SubtypeResolver;

    move-result-object v0

    .line 2184
    invoke-interface {v1, v0}, Lo/isUnsafeBaseType;->AudioAttributesCompatParcelizer(Lo/SubtypeResolver;)V

    .line 2190
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView$write;->write:Landroidx/media3/ui/PlayerControlView;

    invoke-static {v0}, Landroidx/media3/ui/PlayerControlView;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(Landroidx/media3/ui/PlayerControlView;)Landroidx/media3/ui/PlayerControlView$AudioAttributesImplApi21Parcelizer;

    move-result-object v0

    iget-object v1, p0, Landroidx/media3/ui/PlayerControlView$write;->write:Landroidx/media3/ui/PlayerControlView;

    .line 2192
    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v3, Lo/maximumCapacity$MediaBrowserCompatCustomActionResultReceiver;->exo_track_selection_auto:I

    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 2190
    invoke-virtual {v0, v2, v1}, Landroidx/media3/ui/PlayerControlView$AudioAttributesImplApi21Parcelizer;->IconCompatParcelizer(ILjava/lang/String;)V

    .line 2193
    iget-object p0, p0, Landroidx/media3/ui/PlayerControlView$write;->write:Landroidx/media3/ui/PlayerControlView;

    invoke-static {p0}, Landroidx/media3/ui/PlayerControlView;->onPrepareFromSearch(Landroidx/media3/ui/PlayerControlView;)Landroid/widget/PopupWindow;

    move-result-object p0

    invoke-virtual {p0}, Landroid/widget/PopupWindow;->dismiss()V

    :cond_5f
    return-void
.end method

.method public final read(Landroidx/media3/ui/PlayerControlView$MediaBrowserCompatCustomActionResultReceiver;)V
    .registers 4

    .line 2170
    iget-object v0, p1, Landroidx/media3/ui/PlayerControlView$MediaBrowserCompatCustomActionResultReceiver;->IconCompatParcelizer:Landroid/widget/TextView;

    sget v1, Lo/maximumCapacity$MediaBrowserCompatCustomActionResultReceiver;->exo_track_selection_auto:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 2172
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView$write;->write:Landroidx/media3/ui/PlayerControlView;

    invoke-static {v0}, Landroidx/media3/ui/PlayerControlView;->AudioAttributesImplApi26Parcelizer(Landroidx/media3/ui/PlayerControlView;)Lo/isUnsafeBaseType;

    move-result-object v0

    invoke-static {v0}, Lo/buildTypeSerializer;->IconCompatParcelizer(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/isUnsafeBaseType;

    invoke-interface {v0}, Lo/isUnsafeBaseType;->onStop()Lo/SubtypeResolver;

    move-result-object v0

    .line 2173
    invoke-direct {p0, v0}, Landroidx/media3/ui/PlayerControlView$write;->IconCompatParcelizer(Lo/SubtypeResolver;)Z

    move-result v0

    .line 2174
    iget-object v1, p1, Landroidx/media3/ui/PlayerControlView$MediaBrowserCompatCustomActionResultReceiver;->RemoteActionCompatParcelizer:Landroid/view/View;

    if-eqz v0, :cond_21

    const/4 v0, 0x4

    goto :goto_22

    :cond_21
    const/4 v0, 0x0

    :goto_22
    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 2175
    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;->itemView:Landroid/view/View;

    new-instance v0, Lo/afterRead;

    invoke-direct {v0, p0}, Lo/afterRead;-><init>(Landroidx/media3/ui/PlayerControlView$write;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public final read(Ljava/util/List;)V
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/media3/ui/PlayerControlView$AudioAttributesImplApi26Parcelizer;",
            ">;)V"
        }
    .end annotation

    .line 2214
    iput-object p1, p0, Landroidx/media3/ui/PlayerControlView$MediaMetadataCompat;->IconCompatParcelizer:Ljava/util/List;

    .line 2216
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView$write;->write:Landroidx/media3/ui/PlayerControlView;

    invoke-static {v0}, Landroidx/media3/ui/PlayerControlView;->AudioAttributesImplApi26Parcelizer(Landroidx/media3/ui/PlayerControlView;)Lo/isUnsafeBaseType;

    move-result-object v0

    invoke-static {v0}, Lo/buildTypeSerializer;->IconCompatParcelizer(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/isUnsafeBaseType;

    invoke-interface {v0}, Lo/isUnsafeBaseType;->onStop()Lo/SubtypeResolver;

    move-result-object v0

    .line 2217
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_2f

    .line 2218
    iget-object p1, p0, Landroidx/media3/ui/PlayerControlView$write;->write:Landroidx/media3/ui/PlayerControlView;

    invoke-static {p1}, Landroidx/media3/ui/PlayerControlView;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(Landroidx/media3/ui/PlayerControlView;)Landroidx/media3/ui/PlayerControlView$AudioAttributesImplApi21Parcelizer;

    move-result-object p1

    iget-object p0, p0, Landroidx/media3/ui/PlayerControlView$write;->write:Landroidx/media3/ui/PlayerControlView;

    .line 2220
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    sget v0, Lo/maximumCapacity$MediaBrowserCompatCustomActionResultReceiver;->exo_track_selection_none:I

    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p0

    .line 2218
    invoke-virtual {p1, v2, p0}, Landroidx/media3/ui/PlayerControlView$AudioAttributesImplApi21Parcelizer;->IconCompatParcelizer(ILjava/lang/String;)V

    return-void

    .line 2223
    :cond_2f
    invoke-direct {p0, v0}, Landroidx/media3/ui/PlayerControlView$write;->IconCompatParcelizer(Lo/SubtypeResolver;)Z

    move-result v0

    if-nez v0, :cond_4b

    .line 2224
    iget-object p1, p0, Landroidx/media3/ui/PlayerControlView$write;->write:Landroidx/media3/ui/PlayerControlView;

    invoke-static {p1}, Landroidx/media3/ui/PlayerControlView;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(Landroidx/media3/ui/PlayerControlView;)Landroidx/media3/ui/PlayerControlView$AudioAttributesImplApi21Parcelizer;

    move-result-object p1

    iget-object p0, p0, Landroidx/media3/ui/PlayerControlView$write;->write:Landroidx/media3/ui/PlayerControlView;

    .line 2226
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    sget v0, Lo/maximumCapacity$MediaBrowserCompatCustomActionResultReceiver;->exo_track_selection_auto:I

    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p0

    .line 2224
    invoke-virtual {p1, v2, p0}, Landroidx/media3/ui/PlayerControlView$AudioAttributesImplApi21Parcelizer;->IconCompatParcelizer(ILjava/lang/String;)V

    return-void

    :cond_4b
    const/4 v0, 0x0

    .line 2228
    :goto_4c
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_6d

    .line 2229
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/media3/ui/PlayerControlView$AudioAttributesImplApi26Parcelizer;

    .line 2230
    invoke-virtual {v1}, Landroidx/media3/ui/PlayerControlView$AudioAttributesImplApi26Parcelizer;->write()Z

    move-result v3

    if-eqz v3, :cond_6a

    .line 2231
    iget-object p0, p0, Landroidx/media3/ui/PlayerControlView$write;->write:Landroidx/media3/ui/PlayerControlView;

    invoke-static {p0}, Landroidx/media3/ui/PlayerControlView;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(Landroidx/media3/ui/PlayerControlView;)Landroidx/media3/ui/PlayerControlView$AudioAttributesImplApi21Parcelizer;

    move-result-object p0

    iget-object p1, v1, Landroidx/media3/ui/PlayerControlView$AudioAttributesImplApi26Parcelizer;->read:Ljava/lang/String;

    invoke-virtual {p0, v2, p1}, Landroidx/media3/ui/PlayerControlView$AudioAttributesImplApi21Parcelizer;->IconCompatParcelizer(ILjava/lang/String;)V

    return-void

    :cond_6a
    add-int/lit8 v0, v0, 0x1

    goto :goto_4c

    :cond_6d
    return-void
.end method

.method public final write(Ljava/lang/String;)V
    .registers 3

    .line 2209
    iget-object p0, p0, Landroidx/media3/ui/PlayerControlView$write;->write:Landroidx/media3/ui/PlayerControlView;

    invoke-static {p0}, Landroidx/media3/ui/PlayerControlView;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(Landroidx/media3/ui/PlayerControlView;)Landroidx/media3/ui/PlayerControlView$AudioAttributesImplApi21Parcelizer;

    move-result-object p0

    const/4 v0, 0x1

    invoke-virtual {p0, v0, p1}, Landroidx/media3/ui/PlayerControlView$AudioAttributesImplApi21Parcelizer;->IconCompatParcelizer(ILjava/lang/String;)V

    return-void
.end method

###### Class kotlin.afterRead (o.afterRead)
.class public final synthetic Lo/afterRead;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic AudioAttributesCompatParcelizer:Landroidx/media3/ui/PlayerControlView$write;


# direct methods
.method public synthetic constructor <init>(Landroidx/media3/ui/PlayerControlView$write;)V
    .registers 2

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo/afterRead;->AudioAttributesCompatParcelizer:Landroidx/media3/ui/PlayerControlView$write;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .registers 2

    .line 0
    iget-object p0, p0, Lo/afterRead;->AudioAttributesCompatParcelizer:Landroidx/media3/ui/PlayerControlView$write;

    invoke-virtual {p0}, Landroidx/media3/ui/PlayerControlView$write;->read()V

    return-void
.end method

###### Class kotlin.afterWrite (o.afterWrite)
.class public final synthetic Lo/afterWrite;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic read:Landroidx/media3/ui/PlayerControlView;


# direct methods
.method public synthetic constructor <init>(Landroidx/media3/ui/PlayerControlView;)V
    .registers 2

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo/afterWrite;->read:Landroidx/media3/ui/PlayerControlView;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .registers 2

    .line 0
    iget-object p0, p0, Lo/afterWrite;->read:Landroidx/media3/ui/PlayerControlView;

    invoke-static {p0}, Landroidx/media3/ui/PlayerControlView;->IconCompatParcelizer(Landroidx/media3/ui/PlayerControlView;)V

    return-void
.end method

###### Class kotlin.applyRead (o.applyRead)
.class public final synthetic Lo/applyRead;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnLayoutChangeListener;


# instance fields
.field public final synthetic write:Landroidx/media3/ui/PlayerControlView;


# direct methods
.method public synthetic constructor <init>(Landroidx/media3/ui/PlayerControlView;)V
    .registers 2

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo/applyRead;->write:Landroidx/media3/ui/PlayerControlView;

    return-void
.end method


# virtual methods
.method public final onLayoutChange(Landroid/view/View;IIIIIIII)V
    .registers 20

    move-object v0, p0

    .line 0
    iget-object v0, v0, Lo/applyRead;->write:Landroidx/media3/ui/PlayerControlView;

    move-object v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    move/from16 v6, p6

    move/from16 v7, p7

    move/from16 v8, p8

    move/from16 v9, p9

    invoke-static/range {v0 .. v9}, Landroidx/media3/ui/PlayerControlView;->write(Landroidx/media3/ui/PlayerControlView;Landroid/view/View;IIIIIIII)V

    return-void
.end method

###### Class kotlin.readBufferIndex (o.readBufferIndex)
.class public final synthetic Lo/readBufferIndex;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic read:Landroidx/media3/ui/PlayerControlView;


# direct methods
.method public synthetic constructor <init>(Landroidx/media3/ui/PlayerControlView;)V
    .registers 2

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo/readBufferIndex;->read:Landroidx/media3/ui/PlayerControlView;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 1

    .line 0
    iget-object p0, p0, Lo/readBufferIndex;->read:Landroidx/media3/ui/PlayerControlView;

    invoke-static {p0}, Landroidx/media3/ui/PlayerControlView;->AudioAttributesCompatParcelizer(Landroidx/media3/ui/PlayerControlView;)V

    return-void
.end method
