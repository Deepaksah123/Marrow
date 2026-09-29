###### Class androidx.media3.ui.LegacyPlayerControlView (androidx.media3.ui.LegacyPlayerControlView)
.class public Landroidx/media3/ui/LegacyPlayerControlView;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/media3/ui/LegacyPlayerControlView$RemoteActionCompatParcelizer;,
        Landroidx/media3/ui/LegacyPlayerControlView$AudioAttributesCompatParcelizer;,
        Landroidx/media3/ui/LegacyPlayerControlView$write;,
        Landroidx/media3/ui/LegacyPlayerControlView$IconCompatParcelizer;
    }
.end annotation


# instance fields
.field private final AudioAttributesCompatParcelizer:Landroidx/media3/ui/LegacyPlayerControlView$AudioAttributesCompatParcelizer;

.field private AudioAttributesImplApi21Parcelizer:[J

.field private AudioAttributesImplApi26Parcelizer:J

.field private final AudioAttributesImplBaseParcelizer:Landroid/widget/TextView;

.field private final IconCompatParcelizer:F

.field private MediaBrowserCompatCustomActionResultReceiver:J

.field private MediaBrowserCompatItemReceiver:[Z

.field private final MediaBrowserCompatMediaItem:Ljava/lang/Runnable;

.field private MediaBrowserCompatSearchResultReceiver:J

.field private MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Z

.field private final MediaDescriptionCompat:Ljava/lang/StringBuilder;

.field private final MediaMetadataCompat:Ljava/util/Formatter;

.field private final MediaSessionCompatQueueItem:Lo/PrivateMaxEntriesMapRemovalTask;

.field private final MediaSessionCompatResultReceiverWrapper:Ljava/lang/String;

.field private final MediaSessionCompatToken:Landroid/graphics/drawable/Drawable;

.field private final ParcelableVolumeInfo:Ljava/lang/String;

.field private final PlaybackStateCompat:Landroid/graphics/drawable/Drawable;

.field private final PlaybackStateCompatCustomAction:Ljava/util/concurrent/CopyOnWriteArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArrayList<",
            "Landroidx/media3/ui/LegacyPlayerControlView$IconCompatParcelizer;",
            ">;"
        }
    .end annotation
.end field

.field private final RatingCompat:Landroid/view/View;

.field private RemoteActionCompatParcelizer:[J

.field private final ResultReceiver:Lo/PolymorphicTypeValidator$IconCompatParcelizer;

.field private final handleMediaPlayPauseIfPendingOnHandler:Landroid/view/View;

.field private final onAddQueueItem:Lo/PolymorphicTypeValidator$AudioAttributesCompatParcelizer;

.field private final onCommand:Landroid/view/View;

.field private onCustomAction:Z

.field private onFastForward:Lo/isUnsafeBaseType;

.field private final onMediaButtonEvent:Landroid/widget/TextView;

.field private final onPause:Landroid/view/View;

.field private onPlay:[Z

.field private final onPlayFromMediaId:Landroid/view/View;

.field private final onPlayFromSearch:Landroid/graphics/drawable/Drawable;

.field private onPlayFromUri:Landroidx/media3/ui/LegacyPlayerControlView$write;

.field private final onPrepare:Landroid/graphics/drawable/Drawable;

.field private final onPrepareFromMediaId:Ljava/lang/String;

.field private final onPrepareFromSearch:Ljava/lang/String;

.field private final onPrepareFromUri:Landroid/view/View;

.field private final onRemoveQueueItem:Landroid/widget/ImageView;

.field private onRemoveQueueItemAt:I

.field private final onRewind:Ljava/lang/String;

.field private final onSeekTo:Landroid/graphics/drawable/Drawable;

.field private onSetCaptioningEnabled:Z

.field private onSetPlaybackSpeed:Z

.field private onSetRating:Z

.field private onSetRepeatMode:Z

.field private onSetShuffleMode:Z

.field private final onSkipToNext:Landroid/widget/ImageView;

.field private onSkipToPrevious:Z

.field private onSkipToQueueItem:Z

.field private onStop:I

.field private final r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw:Ljava/lang/Runnable;

.field private r8lambdaKUbBm7ckfqTc9QCgukC86fguu4:I

.field private final r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM:Landroid/view/View;

.field private final read:F

.field private setSessionImpl:Z

.field private write:J


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 252
    const-string v0, "media3.ui"

    invoke-static {v0}, Lo/isSafeSubType;->AudioAttributesCompatParcelizer(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .registers 3

    const/4 v0, 0x0

    .line 354
    invoke-direct {p0, p1, v0}, Landroidx/media3/ui/LegacyPlayerControlView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 4

    const/4 v0, 0x0

    .line 358
    invoke-direct {p0, p1, p2, v0}, Landroidx/media3/ui/LegacyPlayerControlView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 4

    .line 362
    invoke-direct {p0, p1, p2, p3, p2}, Landroidx/media3/ui/LegacyPlayerControlView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;ILandroid/util/AttributeSet;)V

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;ILandroid/util/AttributeSet;)V
    .registers 10

    .line 375
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 376
    sget p2, Lo/maximumCapacity$AudioAttributesImplApi21Parcelizer;->exo_legacy_player_control_view:I

    const/4 v0, 0x1

    .line 377
    iput-boolean v0, p0, Landroidx/media3/ui/LegacyPlayerControlView;->onSetCaptioningEnabled:Z

    const/16 v1, 0x1388

    .line 378
    iput v1, p0, Landroidx/media3/ui/LegacyPlayerControlView;->onStop:I

    const/4 v1, 0x0

    .line 379
    iput v1, p0, Landroidx/media3/ui/LegacyPlayerControlView;->onRemoveQueueItemAt:I

    const/16 v2, 0xc8

    .line 380
    iput v2, p0, Landroidx/media3/ui/LegacyPlayerControlView;->r8lambdaKUbBm7ckfqTc9QCgukC86fguu4:I

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 381
    iput-wide v2, p0, Landroidx/media3/ui/LegacyPlayerControlView;->MediaBrowserCompatSearchResultReceiver:J

    .line 382
    iput-boolean v0, p0, Landroidx/media3/ui/LegacyPlayerControlView;->onSkipToPrevious:Z

    .line 383
    iput-boolean v0, p0, Landroidx/media3/ui/LegacyPlayerControlView;->onSetPlaybackSpeed:Z

    .line 384
    iput-boolean v0, p0, Landroidx/media3/ui/LegacyPlayerControlView;->onSkipToQueueItem:Z

    .line 385
    iput-boolean v0, p0, Landroidx/media3/ui/LegacyPlayerControlView;->onSetRepeatMode:Z

    .line 386
    iput-boolean v1, p0, Landroidx/media3/ui/LegacyPlayerControlView;->setSessionImpl:Z

    if-eqz p4, :cond_8e

    .line 390
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v0

    sget-object v4, Lo/maximumCapacity$MediaDescriptionCompat;->LegacyPlayerControlView:[I

    .line 391
    invoke-virtual {v0, p4, v4, p3, v1}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p3

    .line 397
    :try_start_30
    sget v0, Lo/maximumCapacity$MediaDescriptionCompat;->LegacyPlayerControlView_show_timeout:I

    iget v4, p0, Landroidx/media3/ui/LegacyPlayerControlView;->onStop:I

    invoke-virtual {p3, v0, v4}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    iput v0, p0, Landroidx/media3/ui/LegacyPlayerControlView;->onStop:I

    .line 398
    sget v0, Lo/maximumCapacity$MediaDescriptionCompat;->LegacyPlayerControlView_controller_layout_id:I

    .line 399
    invoke-virtual {p3, v0, p2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p2

    .line 401
    iget v0, p0, Landroidx/media3/ui/LegacyPlayerControlView;->onRemoveQueueItemAt:I

    invoke-static {p3, v0}, Landroidx/media3/ui/LegacyPlayerControlView;->AudioAttributesCompatParcelizer(Landroid/content/res/TypedArray;I)I

    move-result v0

    iput v0, p0, Landroidx/media3/ui/LegacyPlayerControlView;->onRemoveQueueItemAt:I

    .line 402
    sget v0, Lo/maximumCapacity$MediaDescriptionCompat;->LegacyPlayerControlView_show_rewind_button:I

    iget-boolean v4, p0, Landroidx/media3/ui/LegacyPlayerControlView;->onSkipToPrevious:Z

    .line 403
    invoke-virtual {p3, v0, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    iput-boolean v0, p0, Landroidx/media3/ui/LegacyPlayerControlView;->onSkipToPrevious:Z

    .line 404
    sget v0, Lo/maximumCapacity$MediaDescriptionCompat;->LegacyPlayerControlView_show_fastforward_button:I

    iget-boolean v4, p0, Landroidx/media3/ui/LegacyPlayerControlView;->onSetPlaybackSpeed:Z

    .line 405
    invoke-virtual {p3, v0, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    iput-boolean v0, p0, Landroidx/media3/ui/LegacyPlayerControlView;->onSetPlaybackSpeed:Z

    .line 407
    sget v0, Lo/maximumCapacity$MediaDescriptionCompat;->LegacyPlayerControlView_show_previous_button:I

    iget-boolean v4, p0, Landroidx/media3/ui/LegacyPlayerControlView;->onSkipToQueueItem:Z

    .line 408
    invoke-virtual {p3, v0, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    iput-boolean v0, p0, Landroidx/media3/ui/LegacyPlayerControlView;->onSkipToQueueItem:Z

    .line 410
    sget v0, Lo/maximumCapacity$MediaDescriptionCompat;->LegacyPlayerControlView_show_next_button:I

    iget-boolean v4, p0, Landroidx/media3/ui/LegacyPlayerControlView;->onSetRepeatMode:Z

    .line 411
    invoke-virtual {p3, v0, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    iput-boolean v0, p0, Landroidx/media3/ui/LegacyPlayerControlView;->onSetRepeatMode:Z

    .line 412
    sget v0, Lo/maximumCapacity$MediaDescriptionCompat;->LegacyPlayerControlView_show_shuffle_button:I

    iget-boolean v4, p0, Landroidx/media3/ui/LegacyPlayerControlView;->setSessionImpl:Z

    .line 413
    invoke-virtual {p3, v0, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    iput-boolean v0, p0, Landroidx/media3/ui/LegacyPlayerControlView;->setSessionImpl:Z

    .line 415
    sget v0, Lo/maximumCapacity$MediaDescriptionCompat;->LegacyPlayerControlView_time_bar_min_update_interval:I

    iget v4, p0, Landroidx/media3/ui/LegacyPlayerControlView;->r8lambdaKUbBm7ckfqTc9QCgukC86fguu4:I

    .line 416
    invoke-virtual {p3, v0, v4}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    .line 415
    invoke-virtual {p0, v0}, Landroidx/media3/ui/LegacyPlayerControlView;->setTimeBarMinUpdateInterval(I)V
    :try_end_85
    .catchall {:try_start_30 .. :try_end_85} :catchall_89

    .line 420
    invoke-virtual {p3}, Landroid/content/res/TypedArray;->recycle()V

    goto :goto_8e

    :catchall_89
    move-exception p0

    invoke-virtual {p3}, Landroid/content/res/TypedArray;->recycle()V

    .line 421
    throw p0

    .line 423
    :cond_8e
    :goto_8e
    new-instance p3, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {p3}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object p3, p0, Landroidx/media3/ui/LegacyPlayerControlView;->PlaybackStateCompatCustomAction:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 424
    new-instance p3, Lo/PolymorphicTypeValidator$AudioAttributesCompatParcelizer;

    invoke-direct {p3}, Lo/PolymorphicTypeValidator$AudioAttributesCompatParcelizer;-><init>()V

    iput-object p3, p0, Landroidx/media3/ui/LegacyPlayerControlView;->onAddQueueItem:Lo/PolymorphicTypeValidator$AudioAttributesCompatParcelizer;

    .line 425
    new-instance p3, Lo/PolymorphicTypeValidator$IconCompatParcelizer;

    invoke-direct {p3}, Lo/PolymorphicTypeValidator$IconCompatParcelizer;-><init>()V

    iput-object p3, p0, Landroidx/media3/ui/LegacyPlayerControlView;->ResultReceiver:Lo/PolymorphicTypeValidator$IconCompatParcelizer;

    .line 426
    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    iput-object p3, p0, Landroidx/media3/ui/LegacyPlayerControlView;->MediaDescriptionCompat:Ljava/lang/StringBuilder;

    .line 427
    new-instance v0, Ljava/util/Formatter;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v4

    invoke-direct {v0, p3, v4}, Ljava/util/Formatter;-><init>(Ljava/lang/Appendable;Ljava/util/Locale;)V

    iput-object v0, p0, Landroidx/media3/ui/LegacyPlayerControlView;->MediaMetadataCompat:Ljava/util/Formatter;

    .line 428
    new-array p3, v1, [J

    iput-object p3, p0, Landroidx/media3/ui/LegacyPlayerControlView;->RemoteActionCompatParcelizer:[J

    .line 429
    new-array p3, v1, [Z

    iput-object p3, p0, Landroidx/media3/ui/LegacyPlayerControlView;->onPlay:[Z

    .line 430
    new-array p3, v1, [J

    iput-object p3, p0, Landroidx/media3/ui/LegacyPlayerControlView;->AudioAttributesImplApi21Parcelizer:[J

    .line 431
    new-array p3, v1, [Z

    iput-object p3, p0, Landroidx/media3/ui/LegacyPlayerControlView;->MediaBrowserCompatItemReceiver:[Z

    .line 432
    new-instance p3, Landroidx/media3/ui/LegacyPlayerControlView$AudioAttributesCompatParcelizer;

    invoke-direct {p3, p0, v1}, Landroidx/media3/ui/LegacyPlayerControlView$AudioAttributesCompatParcelizer;-><init>(Landroidx/media3/ui/LegacyPlayerControlView;B)V

    iput-object p3, p0, Landroidx/media3/ui/LegacyPlayerControlView;->AudioAttributesCompatParcelizer:Landroidx/media3/ui/LegacyPlayerControlView$AudioAttributesCompatParcelizer;

    .line 433
    new-instance v0, Lo/checkState;

    invoke-direct {v0, p0}, Lo/checkState;-><init>(Landroidx/media3/ui/LegacyPlayerControlView;)V

    iput-object v0, p0, Landroidx/media3/ui/LegacyPlayerControlView;->r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw:Ljava/lang/Runnable;

    .line 434
    new-instance v0, Lo/containsKey;

    invoke-direct {v0, p0}, Lo/containsKey;-><init>(Landroidx/media3/ui/LegacyPlayerControlView;)V

    iput-object v0, p0, Landroidx/media3/ui/LegacyPlayerControlView;->MediaBrowserCompatMediaItem:Ljava/lang/Runnable;

    .line 436
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    invoke-virtual {v0, p2, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    const/high16 p2, 0x40000

    .line 437
    invoke-virtual {p0, p2}, Landroid/view/ViewGroup;->setDescendantFocusability(I)V

    .line 439
    sget p2, Lo/maximumCapacity$AudioAttributesImplBaseParcelizer;->exo_progress:I

    invoke-virtual {p0, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lo/PrivateMaxEntriesMapRemovalTask;

    .line 440
    sget v0, Lo/maximumCapacity$AudioAttributesImplBaseParcelizer;->exo_progress_placeholder:I

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    if-eqz p2, :cond_f9

    .line 442
    iput-object p2, p0, Landroidx/media3/ui/LegacyPlayerControlView;->MediaSessionCompatQueueItem:Lo/PrivateMaxEntriesMapRemovalTask;

    goto :goto_122

    :cond_f9
    const/4 p2, 0x0

    if-eqz v0, :cond_120

    .line 446
    new-instance v4, Landroidx/media3/ui/DefaultTimeBar;

    invoke-direct {v4, p1, p2, v1, p4}, Landroidx/media3/ui/DefaultTimeBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;ILandroid/util/AttributeSet;)V

    .line 447
    sget p2, Lo/maximumCapacity$AudioAttributesImplBaseParcelizer;->exo_progress:I

    invoke-virtual {v4, p2}, Landroid/view/View;->setId(I)V

    .line 448
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p2

    invoke-virtual {v4, p2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 449
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p2

    check-cast p2, Landroid/view/ViewGroup;

    .line 450
    invoke-virtual {p2, v0}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result p4

    .line 451
    invoke-virtual {p2, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 452
    invoke-virtual {p2, v4, p4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    .line 453
    iput-object v4, p0, Landroidx/media3/ui/LegacyPlayerControlView;->MediaSessionCompatQueueItem:Lo/PrivateMaxEntriesMapRemovalTask;

    goto :goto_122

    .line 455
    :cond_120
    iput-object p2, p0, Landroidx/media3/ui/LegacyPlayerControlView;->MediaSessionCompatQueueItem:Lo/PrivateMaxEntriesMapRemovalTask;

    .line 457
    :goto_122
    sget p2, Lo/maximumCapacity$AudioAttributesImplBaseParcelizer;->exo_duration:I

    invoke-virtual {p0, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    iput-object p2, p0, Landroidx/media3/ui/LegacyPlayerControlView;->AudioAttributesImplBaseParcelizer:Landroid/widget/TextView;

    .line 458
    sget p2, Lo/maximumCapacity$AudioAttributesImplBaseParcelizer;->exo_position:I

    invoke-virtual {p0, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    iput-object p2, p0, Landroidx/media3/ui/LegacyPlayerControlView;->onMediaButtonEvent:Landroid/widget/TextView;

    .line 460
    iget-object p2, p0, Landroidx/media3/ui/LegacyPlayerControlView;->MediaSessionCompatQueueItem:Lo/PrivateMaxEntriesMapRemovalTask;

    if-eqz p2, :cond_13d

    .line 461
    invoke-interface {p2, p3}, Lo/PrivateMaxEntriesMapRemovalTask;->read(Lo/PrivateMaxEntriesMapRemovalTask$write;)V

    .line 463
    :cond_13d
    sget p2, Lo/maximumCapacity$AudioAttributesImplBaseParcelizer;->exo_play:I

    invoke-virtual {p0, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    iput-object p2, p0, Landroidx/media3/ui/LegacyPlayerControlView;->onPause:Landroid/view/View;

    if-eqz p2, :cond_14a

    .line 465
    invoke-virtual {p2, p3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 467
    :cond_14a
    sget p2, Lo/maximumCapacity$AudioAttributesImplBaseParcelizer;->exo_pause:I

    invoke-virtual {p0, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    iput-object p2, p0, Landroidx/media3/ui/LegacyPlayerControlView;->onCommand:Landroid/view/View;

    if-eqz p2, :cond_157

    .line 469
    invoke-virtual {p2, p3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 471
    :cond_157
    sget p2, Lo/maximumCapacity$AudioAttributesImplBaseParcelizer;->exo_prev:I

    invoke-virtual {p0, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    iput-object p2, p0, Landroidx/media3/ui/LegacyPlayerControlView;->onPlayFromMediaId:Landroid/view/View;

    if-eqz p2, :cond_164

    .line 473
    invoke-virtual {p2, p3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 475
    :cond_164
    sget p2, Lo/maximumCapacity$AudioAttributesImplBaseParcelizer;->exo_next:I

    invoke-virtual {p0, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    iput-object p2, p0, Landroidx/media3/ui/LegacyPlayerControlView;->handleMediaPlayPauseIfPendingOnHandler:Landroid/view/View;

    if-eqz p2, :cond_171

    .line 477
    invoke-virtual {p2, p3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 479
    :cond_171
    sget p2, Lo/maximumCapacity$AudioAttributesImplBaseParcelizer;->exo_rew:I

    invoke-virtual {p0, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    iput-object p2, p0, Landroidx/media3/ui/LegacyPlayerControlView;->onPrepareFromUri:Landroid/view/View;

    if-eqz p2, :cond_17e

    .line 481
    invoke-virtual {p2, p3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 483
    :cond_17e
    sget p2, Lo/maximumCapacity$AudioAttributesImplBaseParcelizer;->exo_ffwd:I

    invoke-virtual {p0, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    iput-object p2, p0, Landroidx/media3/ui/LegacyPlayerControlView;->RatingCompat:Landroid/view/View;

    if-eqz p2, :cond_18b

    .line 485
    invoke-virtual {p2, p3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 487
    :cond_18b
    sget p2, Lo/maximumCapacity$AudioAttributesImplBaseParcelizer;->exo_repeat_toggle:I

    invoke-virtual {p0, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/ImageView;

    iput-object p2, p0, Landroidx/media3/ui/LegacyPlayerControlView;->onRemoveQueueItem:Landroid/widget/ImageView;

    if-eqz p2, :cond_19a

    .line 489
    invoke-virtual {p2, p3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 491
    :cond_19a
    sget p2, Lo/maximumCapacity$AudioAttributesImplBaseParcelizer;->exo_shuffle:I

    invoke-virtual {p0, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/ImageView;

    iput-object p2, p0, Landroidx/media3/ui/LegacyPlayerControlView;->onSkipToNext:Landroid/widget/ImageView;

    if-eqz p2, :cond_1a9

    .line 493
    invoke-virtual {p2, p3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 495
    :cond_1a9
    sget p2, Lo/maximumCapacity$AudioAttributesImplBaseParcelizer;->exo_vr:I

    invoke-virtual {p0, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    iput-object p2, p0, Landroidx/media3/ui/LegacyPlayerControlView;->r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM:Landroid/view/View;

    .line 496
    invoke-virtual {p0, v1}, Landroidx/media3/ui/LegacyPlayerControlView;->setShowVrButton(Z)V

    .line 497
    invoke-direct {p0, v1, v1, p2}, Landroidx/media3/ui/LegacyPlayerControlView;->RemoteActionCompatParcelizer(ZZLandroid/view/View;)V

    .line 499
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    .line 501
    sget p3, Lo/maximumCapacity$MediaBrowserCompatItemReceiver;->exo_media_button_opacity_percentage_enabled:I

    .line 502
    invoke-virtual {p2, p3}, Landroid/content/res/Resources;->getInteger(I)I

    move-result p3

    int-to-float p3, p3

    const/high16 p4, 0x42c80000    # 100.0f

    div-float/2addr p3, p4

    iput p3, p0, Landroidx/media3/ui/LegacyPlayerControlView;->IconCompatParcelizer:F

    .line 503
    sget p3, Lo/maximumCapacity$MediaBrowserCompatItemReceiver;->exo_media_button_opacity_percentage_disabled:I

    .line 504
    invoke-virtual {p2, p3}, Landroid/content/res/Resources;->getInteger(I)I

    move-result p3

    int-to-float p3, p3

    div-float/2addr p3, p4

    iput p3, p0, Landroidx/media3/ui/LegacyPlayerControlView;->read:F

    .line 506
    sget p3, Lo/maximumCapacity$write;->exo_legacy_controls_repeat_off:I

    .line 507
    invoke-static {p1, p2, p3}, Lo/LaissezFaireSubTypeValidator;->read(Landroid/content/Context;Landroid/content/res/Resources;I)Landroid/graphics/drawable/Drawable;

    move-result-object p3

    iput-object p3, p0, Landroidx/media3/ui/LegacyPlayerControlView;->onPrepare:Landroid/graphics/drawable/Drawable;

    .line 508
    sget p3, Lo/maximumCapacity$write;->exo_legacy_controls_repeat_one:I

    .line 509
    invoke-static {p1, p2, p3}, Lo/LaissezFaireSubTypeValidator;->read(Landroid/content/Context;Landroid/content/res/Resources;I)Landroid/graphics/drawable/Drawable;

    move-result-object p3

    iput-object p3, p0, Landroidx/media3/ui/LegacyPlayerControlView;->onSeekTo:Landroid/graphics/drawable/Drawable;

    .line 510
    sget p3, Lo/maximumCapacity$write;->exo_legacy_controls_repeat_all:I

    .line 511
    invoke-static {p1, p2, p3}, Lo/LaissezFaireSubTypeValidator;->read(Landroid/content/Context;Landroid/content/res/Resources;I)Landroid/graphics/drawable/Drawable;

    move-result-object p3

    iput-object p3, p0, Landroidx/media3/ui/LegacyPlayerControlView;->onPlayFromSearch:Landroid/graphics/drawable/Drawable;

    .line 512
    sget p3, Lo/maximumCapacity$write;->exo_legacy_controls_shuffle_on:I

    .line 513
    invoke-static {p1, p2, p3}, Lo/LaissezFaireSubTypeValidator;->read(Landroid/content/Context;Landroid/content/res/Resources;I)Landroid/graphics/drawable/Drawable;

    move-result-object p3

    iput-object p3, p0, Landroidx/media3/ui/LegacyPlayerControlView;->PlaybackStateCompat:Landroid/graphics/drawable/Drawable;

    .line 514
    sget p3, Lo/maximumCapacity$write;->exo_legacy_controls_shuffle_off:I

    .line 515
    invoke-static {p1, p2, p3}, Lo/LaissezFaireSubTypeValidator;->read(Landroid/content/Context;Landroid/content/res/Resources;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    iput-object p1, p0, Landroidx/media3/ui/LegacyPlayerControlView;->MediaSessionCompatToken:Landroid/graphics/drawable/Drawable;

    .line 516
    sget p1, Lo/maximumCapacity$MediaBrowserCompatCustomActionResultReceiver;->exo_controls_repeat_off_description:I

    .line 517
    invoke-virtual {p2, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Landroidx/media3/ui/LegacyPlayerControlView;->onPrepareFromSearch:Ljava/lang/String;

    .line 518
    sget p1, Lo/maximumCapacity$MediaBrowserCompatCustomActionResultReceiver;->exo_controls_repeat_one_description:I

    .line 519
    invoke-virtual {p2, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Landroidx/media3/ui/LegacyPlayerControlView;->onRewind:Ljava/lang/String;

    .line 520
    sget p1, Lo/maximumCapacity$MediaBrowserCompatCustomActionResultReceiver;->exo_controls_repeat_all_description:I

    .line 521
    invoke-virtual {p2, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Landroidx/media3/ui/LegacyPlayerControlView;->onPrepareFromMediaId:Ljava/lang/String;

    .line 522
    sget p1, Lo/maximumCapacity$MediaBrowserCompatCustomActionResultReceiver;->exo_controls_shuffle_on_description:I

    invoke-virtual {p2, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Landroidx/media3/ui/LegacyPlayerControlView;->ParcelableVolumeInfo:Ljava/lang/String;

    .line 523
    sget p1, Lo/maximumCapacity$MediaBrowserCompatCustomActionResultReceiver;->exo_controls_shuffle_off_description:I

    .line 524
    invoke-virtual {p2, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Landroidx/media3/ui/LegacyPlayerControlView;->MediaSessionCompatResultReceiverWrapper:Ljava/lang/String;

    .line 526
    iput-wide v2, p0, Landroidx/media3/ui/LegacyPlayerControlView;->AudioAttributesImplApi26Parcelizer:J

    .line 527
    iput-wide v2, p0, Landroidx/media3/ui/LegacyPlayerControlView;->write:J

    return-void
.end method

.method private static AudioAttributesCompatParcelizer(Landroid/content/res/TypedArray;I)I
    .registers 3

    .line 1275
    sget v0, Lo/maximumCapacity$MediaDescriptionCompat;->LegacyPlayerControlView_repeat_toggle_modes:I

    invoke-virtual {p0, v0, p1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p0

    return p0
.end method

.method private AudioAttributesCompatParcelizer()V
    .registers 5

    .line 833
    iget-object v0, p0, Landroidx/media3/ui/LegacyPlayerControlView;->MediaBrowserCompatMediaItem:Ljava/lang/Runnable;

    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 834
    iget v0, p0, Landroidx/media3/ui/LegacyPlayerControlView;->onStop:I

    if-lez v0, :cond_1d

    .line 835
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    iget v2, p0, Landroidx/media3/ui/LegacyPlayerControlView;->onStop:I

    int-to-long v2, v2

    add-long/2addr v0, v2

    iput-wide v0, p0, Landroidx/media3/ui/LegacyPlayerControlView;->MediaBrowserCompatSearchResultReceiver:J

    .line 836
    iget-boolean v0, p0, Landroidx/media3/ui/LegacyPlayerControlView;->onCustomAction:Z

    if-eqz v0, :cond_1c

    .line 837
    iget-object v0, p0, Landroidx/media3/ui/LegacyPlayerControlView;->MediaBrowserCompatMediaItem:Ljava/lang/Runnable;

    invoke-virtual {p0, v0, v2, v3}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_1c
    return-void

    :cond_1d
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 840
    iput-wide v0, p0, Landroidx/media3/ui/LegacyPlayerControlView;->MediaBrowserCompatSearchResultReceiver:J

    return-void
.end method

.method static synthetic AudioAttributesCompatParcelizer(Landroidx/media3/ui/LegacyPlayerControlView;)V
    .registers 1

    .line 249
    invoke-direct {p0}, Landroidx/media3/ui/LegacyPlayerControlView;->AudioAttributesImplApi26Parcelizer()V

    return-void
.end method

.method private AudioAttributesCompatParcelizer(Lo/isUnsafeBaseType;J)V
    .registers 10

    .line 1127
    invoke-interface {p1}, Lo/isUnsafeBaseType;->onPrepare()Lo/PolymorphicTypeValidator;

    move-result-object v0

    .line 1128
    iget-boolean v1, p0, Landroidx/media3/ui/LegacyPlayerControlView;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Z

    if-eqz v1, :cond_2b

    invoke-virtual {v0}, Lo/PolymorphicTypeValidator;->RemoteActionCompatParcelizer()Z

    move-result v1

    if-nez v1, :cond_2b

    .line 1129
    invoke-virtual {v0}, Lo/PolymorphicTypeValidator;->AudioAttributesCompatParcelizer()I

    move-result v1

    const/4 v2, 0x0

    .line 1132
    :goto_13
    iget-object v3, p0, Landroidx/media3/ui/LegacyPlayerControlView;->ResultReceiver:Lo/PolymorphicTypeValidator$IconCompatParcelizer;

    invoke-virtual {v0, v2, v3}, Lo/PolymorphicTypeValidator;->RemoteActionCompatParcelizer(ILo/PolymorphicTypeValidator$IconCompatParcelizer;)Lo/PolymorphicTypeValidator$IconCompatParcelizer;

    move-result-object v3

    invoke-virtual {v3}, Lo/PolymorphicTypeValidator$IconCompatParcelizer;->write()J

    move-result-wide v3

    cmp-long v5, p2, v3

    if-ltz v5, :cond_2f

    add-int/lit8 v5, v1, -0x1

    if-ne v2, v5, :cond_27

    move-wide p2, v3

    goto :goto_2f

    :cond_27
    sub-long/2addr p2, v3

    add-int/lit8 v2, v2, 0x1

    goto :goto_13

    .line 1144
    :cond_2b
    invoke-interface {p1}, Lo/isUnsafeBaseType;->onMediaButtonEvent()I

    move-result v2

    .line 1146
    :cond_2f
    :goto_2f
    invoke-static {p1, v2, p2, p3}, Landroidx/media3/ui/LegacyPlayerControlView;->RemoteActionCompatParcelizer(Lo/isUnsafeBaseType;IJ)V

    .line 1147
    invoke-direct {p0}, Landroidx/media3/ui/LegacyPlayerControlView;->MediaBrowserCompatItemReceiver()V

    return-void
.end method

.method private static AudioAttributesCompatParcelizer(I)Z
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

.method static synthetic AudioAttributesImplApi21Parcelizer(Landroidx/media3/ui/LegacyPlayerControlView;)Landroid/view/View;
    .registers 1

    .line 249
    iget-object p0, p0, Landroidx/media3/ui/LegacyPlayerControlView;->onPrepareFromUri:Landroid/view/View;

    return-object p0
.end method

.method private AudioAttributesImplApi21Parcelizer()V
    .registers 8

    .line 884
    invoke-direct {p0}, Landroidx/media3/ui/LegacyPlayerControlView;->MediaBrowserCompatMediaItem()Z

    move-result v0

    if-eqz v0, :cond_53

    iget-boolean v0, p0, Landroidx/media3/ui/LegacyPlayerControlView;->onCustomAction:Z

    if-eqz v0, :cond_53

    .line 888
    iget-object v0, p0, Landroidx/media3/ui/LegacyPlayerControlView;->onFastForward:Lo/isUnsafeBaseType;

    if-eqz v0, :cond_2b

    const/4 v1, 0x5

    .line 895
    invoke-interface {v0, v1}, Lo/isUnsafeBaseType;->write(I)Z

    move-result v1

    const/4 v2, 0x7

    .line 896
    invoke-interface {v0, v2}, Lo/isUnsafeBaseType;->write(I)Z

    move-result v2

    const/16 v3, 0xb

    .line 897
    invoke-interface {v0, v3}, Lo/isUnsafeBaseType;->write(I)Z

    move-result v3

    const/16 v4, 0xc

    .line 898
    invoke-interface {v0, v4}, Lo/isUnsafeBaseType;->write(I)Z

    move-result v4

    const/16 v5, 0x9

    .line 899
    invoke-interface {v0, v5}, Lo/isUnsafeBaseType;->write(I)Z

    move-result v0

    goto :goto_30

    :cond_2b
    const/4 v1, 0x0

    move v0, v1

    move v2, v0

    move v3, v2

    move v4, v3

    .line 902
    :goto_30
    iget-boolean v5, p0, Landroidx/media3/ui/LegacyPlayerControlView;->onSkipToQueueItem:Z

    iget-object v6, p0, Landroidx/media3/ui/LegacyPlayerControlView;->onPlayFromMediaId:Landroid/view/View;

    invoke-direct {p0, v5, v2, v6}, Landroidx/media3/ui/LegacyPlayerControlView;->RemoteActionCompatParcelizer(ZZLandroid/view/View;)V

    .line 903
    iget-boolean v2, p0, Landroidx/media3/ui/LegacyPlayerControlView;->onSkipToPrevious:Z

    iget-object v5, p0, Landroidx/media3/ui/LegacyPlayerControlView;->onPrepareFromUri:Landroid/view/View;

    invoke-direct {p0, v2, v3, v5}, Landroidx/media3/ui/LegacyPlayerControlView;->RemoteActionCompatParcelizer(ZZLandroid/view/View;)V

    .line 904
    iget-boolean v2, p0, Landroidx/media3/ui/LegacyPlayerControlView;->onSetPlaybackSpeed:Z

    iget-object v3, p0, Landroidx/media3/ui/LegacyPlayerControlView;->RatingCompat:Landroid/view/View;

    invoke-direct {p0, v2, v4, v3}, Landroidx/media3/ui/LegacyPlayerControlView;->RemoteActionCompatParcelizer(ZZLandroid/view/View;)V

    .line 905
    iget-boolean v2, p0, Landroidx/media3/ui/LegacyPlayerControlView;->onSetRepeatMode:Z

    iget-object v3, p0, Landroidx/media3/ui/LegacyPlayerControlView;->handleMediaPlayPauseIfPendingOnHandler:Landroid/view/View;

    invoke-direct {p0, v2, v0, v3}, Landroidx/media3/ui/LegacyPlayerControlView;->RemoteActionCompatParcelizer(ZZLandroid/view/View;)V

    .line 906
    iget-object p0, p0, Landroidx/media3/ui/LegacyPlayerControlView;->MediaSessionCompatQueueItem:Lo/PrivateMaxEntriesMapRemovalTask;

    if-eqz p0, :cond_53

    .line 907
    invoke-interface {p0, v1}, Lo/PrivateMaxEntriesMapRemovalTask;->setEnabled(Z)V

    :cond_53
    return-void
.end method

.method static synthetic AudioAttributesImplApi26Parcelizer(Landroidx/media3/ui/LegacyPlayerControlView;)Landroid/view/View;
    .registers 1

    .line 249
    iget-object p0, p0, Landroidx/media3/ui/LegacyPlayerControlView;->RatingCompat:Landroid/view/View;

    return-object p0
.end method

.method private AudioAttributesImplApi26Parcelizer()V
    .registers 10

    .line 853
    invoke-direct {p0}, Landroidx/media3/ui/LegacyPlayerControlView;->MediaBrowserCompatMediaItem()Z

    move-result v0

    if-eqz v0, :cond_7d

    iget-boolean v0, p0, Landroidx/media3/ui/LegacyPlayerControlView;->onCustomAction:Z

    if-eqz v0, :cond_7d

    .line 858
    iget-object v0, p0, Landroidx/media3/ui/LegacyPlayerControlView;->onFastForward:Lo/isUnsafeBaseType;

    iget-boolean v1, p0, Landroidx/media3/ui/LegacyPlayerControlView;->onSetCaptioningEnabled:Z

    invoke-static {v0, v1}, Lo/LaissezFaireSubTypeValidator;->RemoteActionCompatParcelizer(Lo/isUnsafeBaseType;Z)Z

    move-result v0

    .line 859
    iget-object v1, p0, Landroidx/media3/ui/LegacyPlayerControlView;->onPause:Landroid/view/View;

    const/16 v2, 0x8

    const/16 v3, 0x15

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v1, :cond_45

    if-nez v0, :cond_26

    .line 860
    invoke-virtual {v1}, Landroid/view/View;->isFocused()Z

    move-result v1

    if-eqz v1, :cond_26

    move v1, v4

    goto :goto_27

    :cond_26
    move v1, v5

    .line 862
    :goto_27
    sget v6, Lo/LaissezFaireSubTypeValidator;->MediaBrowserCompatCustomActionResultReceiver:I

    if-ge v6, v3, :cond_2d

    move v6, v1

    goto :goto_3a

    :cond_2d
    if-nez v0, :cond_39

    .line 864
    iget-object v6, p0, Landroidx/media3/ui/LegacyPlayerControlView;->onPause:Landroid/view/View;

    invoke-static {v6}, Landroidx/media3/ui/LegacyPlayerControlView$RemoteActionCompatParcelizer;->IconCompatParcelizer(Landroid/view/View;)Z

    move-result v6

    if-eqz v6, :cond_39

    move v6, v4

    goto :goto_3a

    :cond_39
    move v6, v5

    .line 865
    :goto_3a
    iget-object v7, p0, Landroidx/media3/ui/LegacyPlayerControlView;->onPause:Landroid/view/View;

    if-eqz v0, :cond_40

    move v8, v5

    goto :goto_41

    :cond_40
    move v8, v2

    :goto_41
    invoke-virtual {v7, v8}, Landroid/view/View;->setVisibility(I)V

    goto :goto_47

    :cond_45
    move v1, v5

    move v6, v1

    .line 867
    :goto_47
    iget-object v7, p0, Landroidx/media3/ui/LegacyPlayerControlView;->onCommand:Landroid/view/View;

    if-eqz v7, :cond_73

    if-eqz v0, :cond_55

    .line 868
    invoke-virtual {v7}, Landroid/view/View;->isFocused()Z

    move-result v7

    if-eqz v7, :cond_55

    move v7, v4

    goto :goto_56

    :cond_55
    move v7, v5

    :goto_56
    or-int/2addr v1, v7

    .line 870
    sget v7, Lo/LaissezFaireSubTypeValidator;->MediaBrowserCompatCustomActionResultReceiver:I

    if-ge v7, v3, :cond_5d

    move v4, v1

    goto :goto_69

    :cond_5d
    if-eqz v0, :cond_68

    .line 872
    iget-object v3, p0, Landroidx/media3/ui/LegacyPlayerControlView;->onCommand:Landroid/view/View;

    invoke-static {v3}, Landroidx/media3/ui/LegacyPlayerControlView$RemoteActionCompatParcelizer;->IconCompatParcelizer(Landroid/view/View;)Z

    move-result v3

    if-eqz v3, :cond_68

    goto :goto_69

    :cond_68
    move v4, v5

    :goto_69
    or-int/2addr v6, v4

    .line 873
    iget-object v3, p0, Landroidx/media3/ui/LegacyPlayerControlView;->onCommand:Landroid/view/View;

    if-eqz v0, :cond_6f

    goto :goto_70

    :cond_6f
    move v2, v5

    :goto_70
    invoke-virtual {v3, v2}, Landroid/view/View;->setVisibility(I)V

    :cond_73
    if-eqz v1, :cond_78

    .line 876
    invoke-direct {p0}, Landroidx/media3/ui/LegacyPlayerControlView;->read()V

    :cond_78
    if-eqz v6, :cond_7d

    .line 879
    invoke-direct {p0}, Landroidx/media3/ui/LegacyPlayerControlView;->RemoteActionCompatParcelizer()V

    :cond_7d
    return-void
.end method

.method static synthetic AudioAttributesImplBaseParcelizer(Landroidx/media3/ui/LegacyPlayerControlView;)Landroid/view/View;
    .registers 1

    .line 249
    iget-object p0, p0, Landroidx/media3/ui/LegacyPlayerControlView;->onPlayFromMediaId:Landroid/view/View;

    return-object p0
.end method

.method private AudioAttributesImplBaseParcelizer()V
    .registers 5

    .line 912
    invoke-direct {p0}, Landroidx/media3/ui/LegacyPlayerControlView;->MediaBrowserCompatMediaItem()Z

    move-result v0

    if-eqz v0, :cond_6d

    iget-boolean v0, p0, Landroidx/media3/ui/LegacyPlayerControlView;->onCustomAction:Z

    if-eqz v0, :cond_6d

    iget-object v0, p0, Landroidx/media3/ui/LegacyPlayerControlView;->onRemoveQueueItem:Landroid/widget/ImageView;

    if-eqz v0, :cond_6d

    .line 916
    iget v1, p0, Landroidx/media3/ui/LegacyPlayerControlView;->onRemoveQueueItemAt:I

    const/4 v2, 0x0

    if-nez v1, :cond_17

    .line 917
    invoke-direct {p0, v2, v2, v0}, Landroidx/media3/ui/LegacyPlayerControlView;->RemoteActionCompatParcelizer(ZZLandroid/view/View;)V

    return-void

    .line 921
    :cond_17
    iget-object v1, p0, Landroidx/media3/ui/LegacyPlayerControlView;->onFastForward:Lo/isUnsafeBaseType;

    const/4 v3, 0x1

    if-nez v1, :cond_2e

    .line 923
    invoke-direct {p0, v3, v2, v0}, Landroidx/media3/ui/LegacyPlayerControlView;->RemoteActionCompatParcelizer(ZZLandroid/view/View;)V

    .line 924
    iget-object v0, p0, Landroidx/media3/ui/LegacyPlayerControlView;->onRemoveQueueItem:Landroid/widget/ImageView;

    iget-object v1, p0, Landroidx/media3/ui/LegacyPlayerControlView;->onPrepare:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 925
    iget-object v0, p0, Landroidx/media3/ui/LegacyPlayerControlView;->onRemoveQueueItem:Landroid/widget/ImageView;

    iget-object p0, p0, Landroidx/media3/ui/LegacyPlayerControlView;->onPrepareFromSearch:Ljava/lang/String;

    invoke-virtual {v0, p0}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    return-void

    .line 929
    :cond_2e
    invoke-direct {p0, v3, v3, v0}, Landroidx/media3/ui/LegacyPlayerControlView;->RemoteActionCompatParcelizer(ZZLandroid/view/View;)V

    .line 930
    invoke-interface {v1}, Lo/isUnsafeBaseType;->onSetShuffleMode()I

    move-result v0

    if-eqz v0, :cond_5a

    if-eq v0, v3, :cond_4b

    const/4 v1, 0x2

    if-ne v0, v1, :cond_68

    .line 940
    iget-object v0, p0, Landroidx/media3/ui/LegacyPlayerControlView;->onRemoveQueueItem:Landroid/widget/ImageView;

    iget-object v1, p0, Landroidx/media3/ui/LegacyPlayerControlView;->onPlayFromSearch:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 941
    iget-object v0, p0, Landroidx/media3/ui/LegacyPlayerControlView;->onRemoveQueueItem:Landroid/widget/ImageView;

    iget-object v1, p0, Landroidx/media3/ui/LegacyPlayerControlView;->onPrepareFromMediaId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    goto :goto_68

    .line 936
    :cond_4b
    iget-object v0, p0, Landroidx/media3/ui/LegacyPlayerControlView;->onRemoveQueueItem:Landroid/widget/ImageView;

    iget-object v1, p0, Landroidx/media3/ui/LegacyPlayerControlView;->onSeekTo:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 937
    iget-object v0, p0, Landroidx/media3/ui/LegacyPlayerControlView;->onRemoveQueueItem:Landroid/widget/ImageView;

    iget-object v1, p0, Landroidx/media3/ui/LegacyPlayerControlView;->onRewind:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    goto :goto_68

    .line 932
    :cond_5a
    iget-object v0, p0, Landroidx/media3/ui/LegacyPlayerControlView;->onRemoveQueueItem:Landroid/widget/ImageView;

    iget-object v1, p0, Landroidx/media3/ui/LegacyPlayerControlView;->onPrepare:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 933
    iget-object v0, p0, Landroidx/media3/ui/LegacyPlayerControlView;->onRemoveQueueItem:Landroid/widget/ImageView;

    iget-object v1, p0, Landroidx/media3/ui/LegacyPlayerControlView;->onPrepareFromSearch:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 946
    :cond_68
    :goto_68
    iget-object p0, p0, Landroidx/media3/ui/LegacyPlayerControlView;->onRemoveQueueItem:Landroid/widget/ImageView;

    invoke-virtual {p0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    :cond_6d
    return-void
.end method

.method static synthetic IconCompatParcelizer(Landroidx/media3/ui/LegacyPlayerControlView;)Lo/isUnsafeBaseType;
    .registers 1

    .line 249
    iget-object p0, p0, Landroidx/media3/ui/LegacyPlayerControlView;->onFastForward:Lo/isUnsafeBaseType;

    return-object p0
.end method

.method private IconCompatParcelizer(Landroid/view/KeyEvent;)Z
    .registers 5

    .line 1202
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    .line 1203
    iget-object v1, p0, Landroidx/media3/ui/LegacyPlayerControlView;->onFastForward:Lo/isUnsafeBaseType;

    if-eqz v1, :cond_60

    .line 1204
    invoke-static {v0}, Landroidx/media3/ui/LegacyPlayerControlView;->AudioAttributesCompatParcelizer(I)Z

    move-result v2

    if-eqz v2, :cond_60

    .line 1207
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    move-result v2

    if-nez v2, :cond_5e

    const/16 v2, 0x5a

    if-ne v0, v2, :cond_23

    .line 1209
    invoke-interface {v1}, Lo/isUnsafeBaseType;->onRewind()I

    move-result p0

    const/4 p1, 0x4

    if-eq p0, p1, :cond_5e

    .line 1210
    invoke-interface {v1}, Lo/isUnsafeBaseType;->MediaDescriptionCompat()V

    goto :goto_5e

    :cond_23
    const/16 v2, 0x59

    if-ne v0, v2, :cond_2b

    .line 1213
    invoke-interface {v1}, Lo/isUnsafeBaseType;->MediaBrowserCompatSearchResultReceiver()V

    goto :goto_5e

    .line 1214
    :cond_2b
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getRepeatCount()I

    move-result p1

    if-nez p1, :cond_5e

    const/16 p1, 0x4f

    if-eq v0, p1, :cond_59

    const/16 p1, 0x55

    if-eq v0, p1, :cond_59

    const/16 p0, 0x57

    if-eq v0, p0, :cond_55

    const/16 p0, 0x58

    if-eq v0, p0, :cond_51

    const/16 p0, 0x7e

    if-eq v0, p0, :cond_4d

    const/16 p0, 0x7f

    if-ne v0, p0, :cond_5e

    .line 1224
    invoke-static {v1}, Lo/LaissezFaireSubTypeValidator;->write(Lo/isUnsafeBaseType;)Z

    goto :goto_5e

    .line 1221
    :cond_4d
    invoke-static {v1}, Lo/LaissezFaireSubTypeValidator;->AudioAttributesCompatParcelizer(Lo/isUnsafeBaseType;)Z

    goto :goto_5e

    .line 1230
    :cond_51
    invoke-interface {v1}, Lo/isUnsafeBaseType;->MediaBrowserCompatMediaItem()V

    goto :goto_5e

    .line 1227
    :cond_55
    invoke-interface {v1}, Lo/isUnsafeBaseType;->RatingCompat()V

    goto :goto_5e

    .line 1218
    :cond_59
    iget-boolean p0, p0, Landroidx/media3/ui/LegacyPlayerControlView;->onSetCaptioningEnabled:Z

    invoke-static {v1, p0}, Lo/LaissezFaireSubTypeValidator;->IconCompatParcelizer(Lo/isUnsafeBaseType;Z)Z

    :cond_5e
    :goto_5e
    const/4 p0, 0x1

    return p0

    :cond_60
    const/4 p0, 0x0

    return p0
.end method

.method static synthetic MediaBrowserCompatCustomActionResultReceiver(Landroidx/media3/ui/LegacyPlayerControlView;)Landroid/view/View;
    .registers 1

    .line 249
    iget-object p0, p0, Landroidx/media3/ui/LegacyPlayerControlView;->onCommand:Landroid/view/View;

    return-object p0
.end method

.method private MediaBrowserCompatCustomActionResultReceiver()V
    .registers 5

    .line 950
    invoke-direct {p0}, Landroidx/media3/ui/LegacyPlayerControlView;->MediaBrowserCompatMediaItem()Z

    move-result v0

    if-eqz v0, :cond_51

    iget-boolean v0, p0, Landroidx/media3/ui/LegacyPlayerControlView;->onCustomAction:Z

    if-eqz v0, :cond_51

    iget-object v0, p0, Landroidx/media3/ui/LegacyPlayerControlView;->onSkipToNext:Landroid/widget/ImageView;

    if-eqz v0, :cond_51

    .line 954
    iget-object v1, p0, Landroidx/media3/ui/LegacyPlayerControlView;->onFastForward:Lo/isUnsafeBaseType;

    .line 955
    iget-boolean v2, p0, Landroidx/media3/ui/LegacyPlayerControlView;->setSessionImpl:Z

    const/4 v3, 0x0

    if-nez v2, :cond_19

    .line 956
    invoke-direct {p0, v3, v3, v0}, Landroidx/media3/ui/LegacyPlayerControlView;->RemoteActionCompatParcelizer(ZZLandroid/view/View;)V

    return-void

    :cond_19
    const/4 v2, 0x1

    if-nez v1, :cond_2e

    .line 958
    invoke-direct {p0, v2, v3, v0}, Landroidx/media3/ui/LegacyPlayerControlView;->RemoteActionCompatParcelizer(ZZLandroid/view/View;)V

    .line 959
    iget-object v0, p0, Landroidx/media3/ui/LegacyPlayerControlView;->onSkipToNext:Landroid/widget/ImageView;

    iget-object v1, p0, Landroidx/media3/ui/LegacyPlayerControlView;->MediaSessionCompatToken:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 960
    iget-object v0, p0, Landroidx/media3/ui/LegacyPlayerControlView;->onSkipToNext:Landroid/widget/ImageView;

    iget-object p0, p0, Landroidx/media3/ui/LegacyPlayerControlView;->MediaSessionCompatResultReceiverWrapper:Ljava/lang/String;

    invoke-virtual {v0, p0}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    return-void

    .line 962
    :cond_2e
    invoke-direct {p0, v2, v2, v0}, Landroidx/media3/ui/LegacyPlayerControlView;->RemoteActionCompatParcelizer(ZZLandroid/view/View;)V

    .line 963
    iget-object v0, p0, Landroidx/media3/ui/LegacyPlayerControlView;->onSkipToNext:Landroid/widget/ImageView;

    .line 964
    invoke-interface {v1}, Lo/isUnsafeBaseType;->onSetPlaybackSpeed()Z

    move-result v2

    if-eqz v2, :cond_3c

    iget-object v2, p0, Landroidx/media3/ui/LegacyPlayerControlView;->PlaybackStateCompat:Landroid/graphics/drawable/Drawable;

    goto :goto_3e

    :cond_3c
    iget-object v2, p0, Landroidx/media3/ui/LegacyPlayerControlView;->MediaSessionCompatToken:Landroid/graphics/drawable/Drawable;

    .line 963
    :goto_3e
    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 965
    iget-object v0, p0, Landroidx/media3/ui/LegacyPlayerControlView;->onSkipToNext:Landroid/widget/ImageView;

    .line 966
    invoke-interface {v1}, Lo/isUnsafeBaseType;->onSetPlaybackSpeed()Z

    move-result v1

    if-eqz v1, :cond_4c

    .line 967
    iget-object p0, p0, Landroidx/media3/ui/LegacyPlayerControlView;->ParcelableVolumeInfo:Ljava/lang/String;

    goto :goto_4e

    .line 968
    :cond_4c
    iget-object p0, p0, Landroidx/media3/ui/LegacyPlayerControlView;->MediaSessionCompatResultReceiverWrapper:Ljava/lang/String;

    .line 965
    :goto_4e
    invoke-virtual {v0, p0}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    :cond_51
    return-void
.end method

.method static synthetic MediaBrowserCompatItemReceiver(Landroidx/media3/ui/LegacyPlayerControlView;)Landroid/view/View;
    .registers 1

    .line 249
    iget-object p0, p0, Landroidx/media3/ui/LegacyPlayerControlView;->onPause:Landroid/view/View;

    return-object p0
.end method

.method private MediaBrowserCompatItemReceiver()V
    .registers 13

    .line 1045
    invoke-direct {p0}, Landroidx/media3/ui/LegacyPlayerControlView;->MediaBrowserCompatMediaItem()Z

    move-result v0

    if-eqz v0, :cond_9f

    iget-boolean v0, p0, Landroidx/media3/ui/LegacyPlayerControlView;->onCustomAction:Z

    if-eqz v0, :cond_9f

    .line 1049
    iget-object v0, p0, Landroidx/media3/ui/LegacyPlayerControlView;->onFastForward:Lo/isUnsafeBaseType;

    if-eqz v0, :cond_1d

    .line 1053
    iget-wide v1, p0, Landroidx/media3/ui/LegacyPlayerControlView;->MediaBrowserCompatCustomActionResultReceiver:J

    invoke-interface {v0}, Lo/isUnsafeBaseType;->onAddQueueItem()J

    move-result-wide v3

    add-long/2addr v1, v3

    .line 1054
    iget-wide v3, p0, Landroidx/media3/ui/LegacyPlayerControlView;->MediaBrowserCompatCustomActionResultReceiver:J

    invoke-interface {v0}, Lo/isUnsafeBaseType;->onCustomAction()J

    move-result-wide v5

    add-long/2addr v3, v5

    goto :goto_20

    :cond_1d
    const-wide/16 v1, 0x0

    move-wide v3, v1

    .line 1056
    :goto_20
    iget-wide v5, p0, Landroidx/media3/ui/LegacyPlayerControlView;->AudioAttributesImplApi26Parcelizer:J

    cmp-long v5, v1, v5

    const/4 v6, 0x1

    if-eqz v5, :cond_29

    move v5, v6

    goto :goto_2a

    :cond_29
    const/4 v5, 0x0

    .line 1058
    :goto_2a
    iput-wide v1, p0, Landroidx/media3/ui/LegacyPlayerControlView;->AudioAttributesImplApi26Parcelizer:J

    .line 1059
    iput-wide v3, p0, Landroidx/media3/ui/LegacyPlayerControlView;->write:J

    .line 1063
    iget-object v7, p0, Landroidx/media3/ui/LegacyPlayerControlView;->onMediaButtonEvent:Landroid/widget/TextView;

    if-eqz v7, :cond_43

    iget-boolean v8, p0, Landroidx/media3/ui/LegacyPlayerControlView;->onSetShuffleMode:Z

    if-nez v8, :cond_43

    if-eqz v5, :cond_43

    .line 1064
    iget-object v5, p0, Landroidx/media3/ui/LegacyPlayerControlView;->MediaDescriptionCompat:Ljava/lang/StringBuilder;

    iget-object v8, p0, Landroidx/media3/ui/LegacyPlayerControlView;->MediaMetadataCompat:Ljava/util/Formatter;

    invoke-static {v5, v8, v1, v2}, Lo/LaissezFaireSubTypeValidator;->read(Ljava/lang/StringBuilder;Ljava/util/Formatter;J)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v7, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1066
    :cond_43
    iget-object v5, p0, Landroidx/media3/ui/LegacyPlayerControlView;->MediaSessionCompatQueueItem:Lo/PrivateMaxEntriesMapRemovalTask;

    if-eqz v5, :cond_4f

    .line 1067
    invoke-interface {v5, v1, v2}, Lo/PrivateMaxEntriesMapRemovalTask;->setPosition(J)V

    .line 1068
    iget-object v5, p0, Landroidx/media3/ui/LegacyPlayerControlView;->MediaSessionCompatQueueItem:Lo/PrivateMaxEntriesMapRemovalTask;

    invoke-interface {v5, v3, v4}, Lo/PrivateMaxEntriesMapRemovalTask;->setBufferedPosition(J)V

    .line 1075
    :cond_4f
    iget-object v3, p0, Landroidx/media3/ui/LegacyPlayerControlView;->r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw:Ljava/lang/Runnable;

    invoke-virtual {p0, v3}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    if-nez v0, :cond_58

    move v3, v6

    goto :goto_5c

    .line 1076
    :cond_58
    invoke-interface {v0}, Lo/isUnsafeBaseType;->onRewind()I

    move-result v3

    :goto_5c
    const-wide/16 v4, 0x3e8

    if-eqz v0, :cond_95

    .line 1077
    invoke-interface {v0}, Lo/isUnsafeBaseType;->AudioAttributesImplBaseParcelizer()Z

    move-result v7

    if-eqz v7, :cond_95

    .line 1079
    iget-object v3, p0, Landroidx/media3/ui/LegacyPlayerControlView;->MediaSessionCompatQueueItem:Lo/PrivateMaxEntriesMapRemovalTask;

    if-eqz v3, :cond_6f

    invoke-interface {v3}, Lo/PrivateMaxEntriesMapRemovalTask;->write()J

    move-result-wide v6

    goto :goto_70

    :cond_6f
    move-wide v6, v4

    .line 1083
    :goto_70
    rem-long/2addr v1, v4

    sub-long v1, v4, v1

    invoke-static {v6, v7, v1, v2}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v1

    .line 1086
    invoke-interface {v0}, Lo/isUnsafeBaseType;->onRemoveQueueItemAt()Lo/DefaultBaseTypeLimitingValidatorUnsafeBaseTypes;

    move-result-object v0

    iget v0, v0, Lo/DefaultBaseTypeLimitingValidatorUnsafeBaseTypes;->AudioAttributesCompatParcelizer:F

    const/4 v3, 0x0

    cmpl-float v3, v0, v3

    if-lez v3, :cond_85

    long-to-float v1, v1

    div-float/2addr v1, v0

    float-to-long v4, v1

    :cond_85
    move-wide v6, v4

    .line 1091
    iget v0, p0, Landroidx/media3/ui/LegacyPlayerControlView;->r8lambdaKUbBm7ckfqTc9QCgukC86fguu4:I

    int-to-long v8, v0

    const-wide/16 v10, 0x3e8

    invoke-static/range {v6 .. v11}, Lo/LaissezFaireSubTypeValidator;->read(JJJ)J

    move-result-wide v0

    .line 1092
    iget-object v2, p0, Landroidx/media3/ui/LegacyPlayerControlView;->r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw:Ljava/lang/Runnable;

    invoke-virtual {p0, v2, v0, v1}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void

    :cond_95
    const/4 v0, 0x4

    if-eq v3, v0, :cond_9f

    if-eq v3, v6, :cond_9f

    .line 1094
    iget-object v0, p0, Landroidx/media3/ui/LegacyPlayerControlView;->r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw:Ljava/lang/Runnable;

    invoke-virtual {p0, v0, v4, v5}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_9f
    return-void
.end method

.method static synthetic MediaBrowserCompatMediaItem(Landroidx/media3/ui/LegacyPlayerControlView;)Landroid/widget/ImageView;
    .registers 1

    .line 249
    iget-object p0, p0, Landroidx/media3/ui/LegacyPlayerControlView;->onSkipToNext:Landroid/widget/ImageView;

    return-object p0
.end method

.method private MediaBrowserCompatMediaItem()Z
    .registers 1

    .line 829
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    move-result p0

    if-nez p0, :cond_8

    const/4 p0, 0x1

    return p0

    :cond_8
    const/4 p0, 0x0

    return p0
.end method

.method static synthetic MediaBrowserCompatSearchResultReceiver(Landroidx/media3/ui/LegacyPlayerControlView;)I
    .registers 1

    .line 249
    iget p0, p0, Landroidx/media3/ui/LegacyPlayerControlView;->onRemoveQueueItemAt:I

    return p0
.end method

.method private MediaBrowserCompatSearchResultReceiver()Z
    .registers 1

    .line 754
    iget-object p0, p0, Landroidx/media3/ui/LegacyPlayerControlView;->r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM:Landroid/view/View;

    if-eqz p0, :cond_c

    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    move-result p0

    if-nez p0, :cond_c

    const/4 p0, 0x1

    return p0

    :cond_c
    const/4 p0, 0x0

    return p0
.end method

.method static synthetic MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(Landroidx/media3/ui/LegacyPlayerControlView;)Ljava/lang/StringBuilder;
    .registers 1

    .line 249
    iget-object p0, p0, Landroidx/media3/ui/LegacyPlayerControlView;->MediaDescriptionCompat:Ljava/lang/StringBuilder;

    return-object p0
.end method

.method static synthetic MediaDescriptionCompat(Landroidx/media3/ui/LegacyPlayerControlView;)V
    .registers 1

    .line 249
    invoke-direct {p0}, Landroidx/media3/ui/LegacyPlayerControlView;->MediaBrowserCompatItemReceiver()V

    return-void
.end method

.method static synthetic MediaMetadataCompat(Landroidx/media3/ui/LegacyPlayerControlView;)Landroid/widget/ImageView;
    .registers 1

    .line 249
    iget-object p0, p0, Landroidx/media3/ui/LegacyPlayerControlView;->onRemoveQueueItem:Landroid/widget/ImageView;

    return-object p0
.end method

.method private MediaMetadataCompat()V
    .registers 22

    move-object/from16 v0, p0

    .line 973
    iget-object v1, v0, Landroidx/media3/ui/LegacyPlayerControlView;->onFastForward:Lo/isUnsafeBaseType;

    if-nez v1, :cond_7

    return-void

    .line 977
    :cond_7
    iget-boolean v2, v0, Landroidx/media3/ui/LegacyPlayerControlView;->onSetRating:Z

    const/4 v4, 0x1

    if-eqz v2, :cond_1a

    .line 978
    invoke-interface {v1}, Lo/isUnsafeBaseType;->onPrepare()Lo/PolymorphicTypeValidator;

    move-result-object v2

    iget-object v5, v0, Landroidx/media3/ui/LegacyPlayerControlView;->ResultReceiver:Lo/PolymorphicTypeValidator$IconCompatParcelizer;

    invoke-static {v2, v5}, Landroidx/media3/ui/LegacyPlayerControlView;->read(Lo/PolymorphicTypeValidator;Lo/PolymorphicTypeValidator$IconCompatParcelizer;)Z

    move-result v2

    if-eqz v2, :cond_1a

    move v2, v4

    goto :goto_1b

    :cond_1a
    const/4 v2, 0x0

    :goto_1b
    iput-boolean v2, v0, Landroidx/media3/ui/LegacyPlayerControlView;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Z

    const-wide/16 v5, 0x0

    .line 979
    iput-wide v5, v0, Landroidx/media3/ui/LegacyPlayerControlView;->MediaBrowserCompatCustomActionResultReceiver:J

    .line 982
    invoke-interface {v1}, Lo/isUnsafeBaseType;->onPrepare()Lo/PolymorphicTypeValidator;

    move-result-object v2

    .line 983
    invoke-virtual {v2}, Lo/PolymorphicTypeValidator;->RemoteActionCompatParcelizer()Z

    move-result v7

    if-nez v7, :cond_fd

    .line 984
    invoke-interface {v1}, Lo/isUnsafeBaseType;->onMediaButtonEvent()I

    move-result v1

    .line 985
    iget-boolean v7, v0, Landroidx/media3/ui/LegacyPlayerControlView;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Z

    if-eqz v7, :cond_35

    const/4 v8, 0x0

    goto :goto_36

    :cond_35
    move v8, v1

    :goto_36
    if-eqz v7, :cond_3e

    .line 986
    invoke-virtual {v2}, Lo/PolymorphicTypeValidator;->AudioAttributesCompatParcelizer()I

    move-result v7

    sub-int/2addr v7, v4

    goto :goto_3f

    :cond_3e
    move v7, v1

    :goto_3f
    move-wide v9, v5

    const/4 v11, 0x0

    :goto_41
    if-gt v8, v7, :cond_fb

    if-ne v8, v1, :cond_4b

    .line 989
    invoke-static {v9, v10}, Lo/LaissezFaireSubTypeValidator;->AudioAttributesCompatParcelizer(J)J

    move-result-wide v12

    iput-wide v12, v0, Landroidx/media3/ui/LegacyPlayerControlView;->MediaBrowserCompatCustomActionResultReceiver:J

    .line 991
    :cond_4b
    iget-object v12, v0, Landroidx/media3/ui/LegacyPlayerControlView;->ResultReceiver:Lo/PolymorphicTypeValidator$IconCompatParcelizer;

    invoke-virtual {v2, v8, v12}, Lo/PolymorphicTypeValidator;->RemoteActionCompatParcelizer(ILo/PolymorphicTypeValidator$IconCompatParcelizer;)Lo/PolymorphicTypeValidator$IconCompatParcelizer;

    .line 992
    iget-object v12, v0, Landroidx/media3/ui/LegacyPlayerControlView;->ResultReceiver:Lo/PolymorphicTypeValidator$IconCompatParcelizer;

    iget-wide v12, v12, Lo/PolymorphicTypeValidator$IconCompatParcelizer;->IconCompatParcelizer:J

    const-wide v14, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v12, v12, v14

    if-nez v12, :cond_65

    .line 993
    iget-boolean v1, v0, Landroidx/media3/ui/LegacyPlayerControlView;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Z

    xor-int/2addr v1, v4

    invoke-static {v1}, Lo/buildTypeSerializer;->write(Z)V

    goto/16 :goto_fb

    .line 996
    :cond_65
    iget-object v12, v0, Landroidx/media3/ui/LegacyPlayerControlView;->ResultReceiver:Lo/PolymorphicTypeValidator$IconCompatParcelizer;

    iget v12, v12, Lo/PolymorphicTypeValidator$IconCompatParcelizer;->RemoteActionCompatParcelizer:I

    :goto_69
    iget-object v13, v0, Landroidx/media3/ui/LegacyPlayerControlView;->ResultReceiver:Lo/PolymorphicTypeValidator$IconCompatParcelizer;

    iget v13, v13, Lo/PolymorphicTypeValidator$IconCompatParcelizer;->AudioAttributesImplBaseParcelizer:I

    if-gt v12, v13, :cond_ee

    .line 997
    iget-object v13, v0, Landroidx/media3/ui/LegacyPlayerControlView;->onAddQueueItem:Lo/PolymorphicTypeValidator$AudioAttributesCompatParcelizer;

    invoke-virtual {v2, v12, v13}, Lo/PolymorphicTypeValidator;->AudioAttributesCompatParcelizer(ILo/PolymorphicTypeValidator$AudioAttributesCompatParcelizer;)Lo/PolymorphicTypeValidator$AudioAttributesCompatParcelizer;

    .line 998
    iget-object v13, v0, Landroidx/media3/ui/LegacyPlayerControlView;->onAddQueueItem:Lo/PolymorphicTypeValidator$AudioAttributesCompatParcelizer;

    invoke-virtual {v13}, Lo/PolymorphicTypeValidator$AudioAttributesCompatParcelizer;->AudioAttributesImplBaseParcelizer()I

    move-result v13

    .line 999
    iget-object v3, v0, Landroidx/media3/ui/LegacyPlayerControlView;->onAddQueueItem:Lo/PolymorphicTypeValidator$AudioAttributesCompatParcelizer;

    invoke-virtual {v3}, Lo/PolymorphicTypeValidator$AudioAttributesCompatParcelizer;->write()I

    move-result v3

    :goto_80
    if-ge v13, v3, :cond_e7

    .line 1001
    iget-object v4, v0, Landroidx/media3/ui/LegacyPlayerControlView;->onAddQueueItem:Lo/PolymorphicTypeValidator$AudioAttributesCompatParcelizer;

    invoke-virtual {v4, v13}, Lo/PolymorphicTypeValidator$AudioAttributesCompatParcelizer;->write(I)J

    move-result-wide v17

    const-wide/high16 v19, -0x8000000000000000L

    cmp-long v4, v17, v19

    if-nez v4, :cond_9d

    .line 1003
    iget-object v4, v0, Landroidx/media3/ui/LegacyPlayerControlView;->onAddQueueItem:Lo/PolymorphicTypeValidator$AudioAttributesCompatParcelizer;

    iget-wide v5, v4, Lo/PolymorphicTypeValidator$AudioAttributesCompatParcelizer;->read:J

    cmp-long v4, v5, v14

    if-nez v4, :cond_97

    goto :goto_e0

    .line 1007
    :cond_97
    iget-object v4, v0, Landroidx/media3/ui/LegacyPlayerControlView;->onAddQueueItem:Lo/PolymorphicTypeValidator$AudioAttributesCompatParcelizer;

    iget-wide v4, v4, Lo/PolymorphicTypeValidator$AudioAttributesCompatParcelizer;->read:J

    move-wide/from16 v17, v4

    .line 1009
    :cond_9d
    iget-object v4, v0, Landroidx/media3/ui/LegacyPlayerControlView;->onAddQueueItem:Lo/PolymorphicTypeValidator$AudioAttributesCompatParcelizer;

    invoke-virtual {v4}, Lo/PolymorphicTypeValidator$AudioAttributesCompatParcelizer;->IconCompatParcelizer()J

    move-result-wide v4

    add-long v17, v17, v4

    const-wide/16 v4, 0x0

    cmp-long v6, v17, v4

    if-ltz v6, :cond_e0

    .line 1011
    iget-object v6, v0, Landroidx/media3/ui/LegacyPlayerControlView;->RemoteActionCompatParcelizer:[J

    array-length v4, v6

    if-ne v11, v4, :cond_c8

    .line 1012
    array-length v4, v6

    if-nez v4, :cond_b6

    const/4 v4, 0x1

    const/4 v5, 0x1

    goto :goto_b9

    :cond_b6
    array-length v4, v6

    const/4 v5, 0x1

    shl-int/2addr v4, v5

    .line 1013
    :goto_b9
    invoke-static {v6, v4}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object v6

    iput-object v6, v0, Landroidx/media3/ui/LegacyPlayerControlView;->RemoteActionCompatParcelizer:[J

    .line 1014
    iget-object v6, v0, Landroidx/media3/ui/LegacyPlayerControlView;->onPlay:[Z

    invoke-static {v6, v4}, Ljava/util/Arrays;->copyOf([ZI)[Z

    move-result-object v4

    iput-object v4, v0, Landroidx/media3/ui/LegacyPlayerControlView;->onPlay:[Z

    goto :goto_c9

    :cond_c8
    const/4 v5, 0x1

    .line 1016
    :goto_c9
    iget-object v4, v0, Landroidx/media3/ui/LegacyPlayerControlView;->RemoteActionCompatParcelizer:[J

    add-long v17, v17, v9

    invoke-static/range {v17 .. v18}, Lo/LaissezFaireSubTypeValidator;->AudioAttributesCompatParcelizer(J)J

    move-result-wide v16

    aput-wide v16, v4, v11

    .line 1017
    iget-object v4, v0, Landroidx/media3/ui/LegacyPlayerControlView;->onPlay:[Z

    iget-object v6, v0, Landroidx/media3/ui/LegacyPlayerControlView;->onAddQueueItem:Lo/PolymorphicTypeValidator$AudioAttributesCompatParcelizer;

    invoke-virtual {v6, v13}, Lo/PolymorphicTypeValidator$AudioAttributesCompatParcelizer;->IconCompatParcelizer(I)Z

    move-result v6

    aput-boolean v6, v4, v11

    add-int/lit8 v11, v11, 0x1

    goto :goto_e1

    :cond_e0
    :goto_e0
    const/4 v5, 0x1

    :goto_e1
    add-int/lit8 v13, v13, 0x1

    move v4, v5

    const-wide/16 v5, 0x0

    goto :goto_80

    :cond_e7
    move v5, v4

    add-int/lit8 v12, v12, 0x1

    const-wide/16 v5, 0x0

    goto/16 :goto_69

    :cond_ee
    move v5, v4

    .line 1022
    iget-object v3, v0, Landroidx/media3/ui/LegacyPlayerControlView;->ResultReceiver:Lo/PolymorphicTypeValidator$IconCompatParcelizer;

    iget-wide v3, v3, Lo/PolymorphicTypeValidator$IconCompatParcelizer;->IconCompatParcelizer:J

    add-long/2addr v9, v3

    add-int/lit8 v8, v8, 0x1

    move v4, v5

    const-wide/16 v5, 0x0

    goto/16 :goto_41

    :cond_fb
    :goto_fb
    move-wide v5, v9

    goto :goto_100

    :cond_fd
    const-wide/16 v5, 0x0

    const/4 v11, 0x0

    .line 1025
    :goto_100
    invoke-static {v5, v6}, Lo/LaissezFaireSubTypeValidator;->AudioAttributesCompatParcelizer(J)J

    move-result-wide v1

    .line 1026
    iget-object v3, v0, Landroidx/media3/ui/LegacyPlayerControlView;->AudioAttributesImplBaseParcelizer:Landroid/widget/TextView;

    if-eqz v3, :cond_113

    .line 1027
    iget-object v4, v0, Landroidx/media3/ui/LegacyPlayerControlView;->MediaDescriptionCompat:Ljava/lang/StringBuilder;

    iget-object v5, v0, Landroidx/media3/ui/LegacyPlayerControlView;->MediaMetadataCompat:Ljava/util/Formatter;

    invoke-static {v4, v5, v1, v2}, Lo/LaissezFaireSubTypeValidator;->read(Ljava/lang/StringBuilder;Ljava/util/Formatter;J)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1029
    :cond_113
    iget-object v3, v0, Landroidx/media3/ui/LegacyPlayerControlView;->MediaSessionCompatQueueItem:Lo/PrivateMaxEntriesMapRemovalTask;

    if-eqz v3, :cond_14a

    .line 1030
    invoke-interface {v3, v1, v2}, Lo/PrivateMaxEntriesMapRemovalTask;->setDuration(J)V

    .line 1031
    iget-object v1, v0, Landroidx/media3/ui/LegacyPlayerControlView;->AudioAttributesImplApi21Parcelizer:[J

    array-length v1, v1

    add-int v2, v11, v1

    .line 1033
    iget-object v3, v0, Landroidx/media3/ui/LegacyPlayerControlView;->RemoteActionCompatParcelizer:[J

    array-length v4, v3

    if-le v2, v4, :cond_132

    .line 1034
    invoke-static {v3, v2}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object v3

    iput-object v3, v0, Landroidx/media3/ui/LegacyPlayerControlView;->RemoteActionCompatParcelizer:[J

    .line 1035
    iget-object v3, v0, Landroidx/media3/ui/LegacyPlayerControlView;->onPlay:[Z

    invoke-static {v3, v2}, Ljava/util/Arrays;->copyOf([ZI)[Z

    move-result-object v3

    iput-object v3, v0, Landroidx/media3/ui/LegacyPlayerControlView;->onPlay:[Z

    .line 1037
    :cond_132
    iget-object v3, v0, Landroidx/media3/ui/LegacyPlayerControlView;->AudioAttributesImplApi21Parcelizer:[J

    iget-object v4, v0, Landroidx/media3/ui/LegacyPlayerControlView;->RemoteActionCompatParcelizer:[J

    const/4 v5, 0x0

    invoke-static {v3, v5, v4, v11, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1038
    iget-object v3, v0, Landroidx/media3/ui/LegacyPlayerControlView;->MediaBrowserCompatItemReceiver:[Z

    iget-object v4, v0, Landroidx/media3/ui/LegacyPlayerControlView;->onPlay:[Z

    invoke-static {v3, v5, v4, v11, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1039
    iget-object v1, v0, Landroidx/media3/ui/LegacyPlayerControlView;->MediaSessionCompatQueueItem:Lo/PrivateMaxEntriesMapRemovalTask;

    iget-object v3, v0, Landroidx/media3/ui/LegacyPlayerControlView;->RemoteActionCompatParcelizer:[J

    iget-object v4, v0, Landroidx/media3/ui/LegacyPlayerControlView;->onPlay:[Z

    invoke-interface {v1, v3, v4, v2}, Lo/PrivateMaxEntriesMapRemovalTask;->setAdGroupTimesMs([J[ZI)V

    .line 1041
    :cond_14a
    invoke-direct/range {p0 .. p0}, Landroidx/media3/ui/LegacyPlayerControlView;->MediaBrowserCompatItemReceiver()V

    return-void
.end method

.method static synthetic RatingCompat(Landroidx/media3/ui/LegacyPlayerControlView;)V
    .registers 1

    .line 249
    invoke-direct {p0}, Landroidx/media3/ui/LegacyPlayerControlView;->AudioAttributesImplBaseParcelizer()V

    return-void
.end method

.method private RemoteActionCompatParcelizer()V
    .registers 4

    .line 1108
    iget-object v0, p0, Landroidx/media3/ui/LegacyPlayerControlView;->onFastForward:Lo/isUnsafeBaseType;

    iget-boolean v1, p0, Landroidx/media3/ui/LegacyPlayerControlView;->onSetCaptioningEnabled:Z

    invoke-static {v0, v1}, Lo/LaissezFaireSubTypeValidator;->RemoteActionCompatParcelizer(Lo/isUnsafeBaseType;Z)Z

    move-result v0

    const/16 v1, 0x8

    if-eqz v0, :cond_14

    .line 1109
    iget-object v2, p0, Landroidx/media3/ui/LegacyPlayerControlView;->onPause:Landroid/view/View;

    if-eqz v2, :cond_14

    .line 1110
    invoke-virtual {v2, v1}, Landroid/view/View;->sendAccessibilityEvent(I)V

    return-void

    :cond_14
    if-nez v0, :cond_1d

    .line 1111
    iget-object p0, p0, Landroidx/media3/ui/LegacyPlayerControlView;->onCommand:Landroid/view/View;

    if-eqz p0, :cond_1d

    .line 1112
    invoke-virtual {p0, v1}, Landroid/view/View;->sendAccessibilityEvent(I)V

    :cond_1d
    return-void
.end method

.method public static synthetic RemoteActionCompatParcelizer(Landroidx/media3/ui/LegacyPlayerControlView;)V
    .registers 1

    .line 1276
    invoke-direct {p0}, Landroidx/media3/ui/LegacyPlayerControlView;->MediaBrowserCompatItemReceiver()V

    return-void
.end method

.method private static RemoteActionCompatParcelizer(Lo/isUnsafeBaseType;IJ)V
    .registers 4

    .line 1151
    invoke-interface {p0, p1, p2, p3}, Lo/isUnsafeBaseType;->IconCompatParcelizer(IJ)V

    return-void
.end method

.method private RemoteActionCompatParcelizer(ZZLandroid/view/View;)V
    .registers 4

    if-nez p3, :cond_3

    return-void

    .line 1120
    :cond_3
    invoke-virtual {p3, p2}, Landroid/view/View;->setEnabled(Z)V

    if-eqz p2, :cond_b

    .line 1121
    iget p0, p0, Landroidx/media3/ui/LegacyPlayerControlView;->IconCompatParcelizer:F

    goto :goto_d

    :cond_b
    iget p0, p0, Landroidx/media3/ui/LegacyPlayerControlView;->read:F

    :goto_d
    invoke-virtual {p3, p0}, Landroid/view/View;->setAlpha(F)V

    if-eqz p1, :cond_14

    const/4 p0, 0x0

    goto :goto_16

    :cond_14
    const/16 p0, 0x8

    .line 1122
    :goto_16
    invoke-virtual {p3, p0}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method static synthetic RemoteActionCompatParcelizer(Landroidx/media3/ui/LegacyPlayerControlView;Z)Z
    .registers 2

    .line 249
    iput-boolean p1, p0, Landroidx/media3/ui/LegacyPlayerControlView;->onSetShuffleMode:Z

    return p1
.end method

.method static synthetic handleMediaPlayPauseIfPendingOnHandler(Landroidx/media3/ui/LegacyPlayerControlView;)Landroid/widget/TextView;
    .registers 1

    .line 249
    iget-object p0, p0, Landroidx/media3/ui/LegacyPlayerControlView;->onMediaButtonEvent:Landroid/widget/TextView;

    return-object p0
.end method

.method static synthetic onAddQueueItem(Landroidx/media3/ui/LegacyPlayerControlView;)V
    .registers 1

    .line 249
    invoke-direct {p0}, Landroidx/media3/ui/LegacyPlayerControlView;->MediaBrowserCompatCustomActionResultReceiver()V

    return-void
.end method

.method static synthetic onCommand(Landroidx/media3/ui/LegacyPlayerControlView;)V
    .registers 1

    .line 249
    invoke-direct {p0}, Landroidx/media3/ui/LegacyPlayerControlView;->AudioAttributesImplApi21Parcelizer()V

    return-void
.end method

.method static synthetic onCustomAction(Landroidx/media3/ui/LegacyPlayerControlView;)V
    .registers 1

    .line 249
    invoke-direct {p0}, Landroidx/media3/ui/LegacyPlayerControlView;->MediaMetadataCompat()V

    return-void
.end method

.method static synthetic read(Landroidx/media3/ui/LegacyPlayerControlView;)Ljava/util/Formatter;
    .registers 1

    .line 249
    iget-object p0, p0, Landroidx/media3/ui/LegacyPlayerControlView;->MediaMetadataCompat:Ljava/util/Formatter;

    return-object p0
.end method

.method private read()V
    .registers 3

    .line 1099
    iget-object v0, p0, Landroidx/media3/ui/LegacyPlayerControlView;->onFastForward:Lo/isUnsafeBaseType;

    iget-boolean v1, p0, Landroidx/media3/ui/LegacyPlayerControlView;->onSetCaptioningEnabled:Z

    invoke-static {v0, v1}, Lo/LaissezFaireSubTypeValidator;->RemoteActionCompatParcelizer(Lo/isUnsafeBaseType;Z)Z

    move-result v0

    if-eqz v0, :cond_12

    .line 1100
    iget-object v1, p0, Landroidx/media3/ui/LegacyPlayerControlView;->onPause:Landroid/view/View;

    if-eqz v1, :cond_12

    .line 1101
    invoke-virtual {v1}, Landroid/view/View;->requestFocus()Z

    return-void

    :cond_12
    if-nez v0, :cond_1b

    .line 1102
    iget-object p0, p0, Landroidx/media3/ui/LegacyPlayerControlView;->onCommand:Landroid/view/View;

    if-eqz p0, :cond_1b

    .line 1103
    invoke-virtual {p0}, Landroid/view/View;->requestFocus()Z

    :cond_1b
    return-void
.end method

.method static synthetic read(Landroidx/media3/ui/LegacyPlayerControlView;Lo/isUnsafeBaseType;J)V
    .registers 4

    .line 249
    invoke-direct {p0, p1, p2, p3}, Landroidx/media3/ui/LegacyPlayerControlView;->AudioAttributesCompatParcelizer(Lo/isUnsafeBaseType;J)V

    return-void
.end method

.method private static read(Lo/PolymorphicTypeValidator;Lo/PolymorphicTypeValidator$IconCompatParcelizer;)Z
    .registers 9

    .line 1260
    invoke-virtual {p0}, Lo/PolymorphicTypeValidator;->AudioAttributesCompatParcelizer()I

    move-result v0

    const/16 v1, 0x64

    const/4 v2, 0x0

    if-le v0, v1, :cond_a

    return v2

    .line 1263
    :cond_a
    invoke-virtual {p0}, Lo/PolymorphicTypeValidator;->AudioAttributesCompatParcelizer()I

    move-result v0

    move v1, v2

    :goto_f
    if-ge v1, v0, :cond_24

    .line 1265
    invoke-virtual {p0, v1, p1}, Lo/PolymorphicTypeValidator;->RemoteActionCompatParcelizer(ILo/PolymorphicTypeValidator$IconCompatParcelizer;)Lo/PolymorphicTypeValidator$IconCompatParcelizer;

    move-result-object v3

    iget-wide v3, v3, Lo/PolymorphicTypeValidator$IconCompatParcelizer;->IconCompatParcelizer:J

    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v3, v3, v5

    if-nez v3, :cond_21

    return v2

    :cond_21
    add-int/lit8 v1, v1, 0x1

    goto :goto_f

    :cond_24
    const/4 p0, 0x1

    return p0
.end method

.method static synthetic write(Landroidx/media3/ui/LegacyPlayerControlView;)Landroid/view/View;
    .registers 1

    .line 249
    iget-object p0, p0, Landroidx/media3/ui/LegacyPlayerControlView;->handleMediaPlayPauseIfPendingOnHandler:Landroid/view/View;

    return-object p0
.end method

.method private write()V
    .registers 1

    .line 845
    invoke-direct {p0}, Landroidx/media3/ui/LegacyPlayerControlView;->AudioAttributesImplApi26Parcelizer()V

    .line 846
    invoke-direct {p0}, Landroidx/media3/ui/LegacyPlayerControlView;->AudioAttributesImplApi21Parcelizer()V

    .line 847
    invoke-direct {p0}, Landroidx/media3/ui/LegacyPlayerControlView;->AudioAttributesImplBaseParcelizer()V

    .line 848
    invoke-direct {p0}, Landroidx/media3/ui/LegacyPlayerControlView;->MediaBrowserCompatCustomActionResultReceiver()V

    .line 849
    invoke-direct {p0}, Landroidx/media3/ui/LegacyPlayerControlView;->MediaMetadataCompat()V

    return-void
.end method


# virtual methods
.method public final IconCompatParcelizer()V
    .registers 3

    .line 816
    invoke-direct {p0}, Landroidx/media3/ui/LegacyPlayerControlView;->MediaBrowserCompatMediaItem()Z

    move-result v0

    if-eqz v0, :cond_32

    const/16 v0, 0x8

    .line 817
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    .line 818
    iget-object v0, p0, Landroidx/media3/ui/LegacyPlayerControlView;->PlaybackStateCompatCustomAction:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_11
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_21

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/media3/ui/LegacyPlayerControlView$IconCompatParcelizer;

    .line 819
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    goto :goto_11

    .line 821
    :cond_21
    iget-object v0, p0, Landroidx/media3/ui/LegacyPlayerControlView;->r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw:Ljava/lang/Runnable;

    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 822
    iget-object v0, p0, Landroidx/media3/ui/LegacyPlayerControlView;->MediaBrowserCompatMediaItem:Ljava/lang/Runnable;

    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 823
    iput-wide v0, p0, Landroidx/media3/ui/LegacyPlayerControlView;->MediaBrowserCompatSearchResultReceiver:J

    :cond_32
    return-void
.end method

.method public dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .registers 3

    .line 1191
    invoke-direct {p0, p1}, Landroidx/media3/ui/LegacyPlayerControlView;->IconCompatParcelizer(Landroid/view/KeyEvent;)Z

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

.method public final dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .registers 4

    .line 1181
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    if-nez v0, :cond_c

    .line 1182
    iget-object v0, p0, Landroidx/media3/ui/LegacyPlayerControlView;->MediaBrowserCompatMediaItem:Ljava/lang/Runnable;

    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    goto :goto_16

    .line 1183
    :cond_c
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_16

    .line 1184
    invoke-direct {p0}, Landroidx/media3/ui/LegacyPlayerControlView;->AudioAttributesCompatParcelizer()V

    .line 1186
    :cond_16
    :goto_16
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p0

    return p0
.end method

.method public onAttachedToWindow()V
    .registers 5

    .line 1156
    invoke-super {p0}, Landroid/widget/FrameLayout;->onAttachedToWindow()V

    const/4 v0, 0x1

    .line 1157
    iput-boolean v0, p0, Landroidx/media3/ui/LegacyPlayerControlView;->onCustomAction:Z

    .line 1158
    iget-wide v0, p0, Landroidx/media3/ui/LegacyPlayerControlView;->MediaBrowserCompatSearchResultReceiver:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v2, v0, v2

    if-eqz v2, :cond_26

    .line 1159
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v2

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-gtz v2, :cond_20

    .line 1161
    invoke-virtual {p0}, Landroidx/media3/ui/LegacyPlayerControlView;->IconCompatParcelizer()V

    goto :goto_2f

    .line 1163
    :cond_20
    iget-object v2, p0, Landroidx/media3/ui/LegacyPlayerControlView;->MediaBrowserCompatMediaItem:Ljava/lang/Runnable;

    invoke-virtual {p0, v2, v0, v1}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_2f

    .line 1165
    :cond_26
    invoke-direct {p0}, Landroidx/media3/ui/LegacyPlayerControlView;->MediaBrowserCompatMediaItem()Z

    move-result v0

    if-eqz v0, :cond_2f

    .line 1166
    invoke-direct {p0}, Landroidx/media3/ui/LegacyPlayerControlView;->AudioAttributesCompatParcelizer()V

    .line 1168
    :cond_2f
    :goto_2f
    invoke-direct {p0}, Landroidx/media3/ui/LegacyPlayerControlView;->write()V

    return-void
.end method

.method public onDetachedFromWindow()V
    .registers 2

    .line 1173
    invoke-super {p0}, Landroid/widget/FrameLayout;->onDetachedFromWindow()V

    const/4 v0, 0x0

    .line 1174
    iput-boolean v0, p0, Landroidx/media3/ui/LegacyPlayerControlView;->onCustomAction:Z

    .line 1175
    iget-object v0, p0, Landroidx/media3/ui/LegacyPlayerControlView;->r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw:Ljava/lang/Runnable;

    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 1176
    iget-object v0, p0, Landroidx/media3/ui/LegacyPlayerControlView;->MediaBrowserCompatMediaItem:Ljava/lang/Runnable;

    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public setExtraAdGroupMarkers([J[Z)V
    .registers 6

    const/4 v0, 0x0

    if-nez p1, :cond_c

    .line 600
    new-array p1, v0, [J

    iput-object p1, p0, Landroidx/media3/ui/LegacyPlayerControlView;->AudioAttributesImplApi21Parcelizer:[J

    .line 601
    new-array p1, v0, [Z

    iput-object p1, p0, Landroidx/media3/ui/LegacyPlayerControlView;->MediaBrowserCompatItemReceiver:[Z

    goto :goto_1e

    .line 603
    :cond_c
    invoke-static {p2}, Lo/buildTypeSerializer;->IconCompatParcelizer(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [Z

    .line 604
    array-length v1, p1

    array-length v2, p2

    if-ne v1, v2, :cond_17

    const/4 v0, 0x1

    :cond_17
    invoke-static {v0}, Lo/buildTypeSerializer;->IconCompatParcelizer(Z)V

    .line 605
    iput-object p1, p0, Landroidx/media3/ui/LegacyPlayerControlView;->AudioAttributesImplApi21Parcelizer:[J

    .line 606
    iput-object p2, p0, Landroidx/media3/ui/LegacyPlayerControlView;->MediaBrowserCompatItemReceiver:[Z

    .line 608
    :goto_1e
    invoke-direct {p0}, Landroidx/media3/ui/LegacyPlayerControlView;->MediaMetadataCompat()V

    return-void
.end method

.method public setPlayer(Lo/isUnsafeBaseType;)V
    .registers 6

    .line 547
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

    .line 549
    invoke-interface {p1}, Lo/isUnsafeBaseType;->onCommand()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    if-ne v0, v1, :cond_1f

    :cond_1e
    move v2, v3

    .line 548
    :cond_1f
    invoke-static {v2}, Lo/buildTypeSerializer;->IconCompatParcelizer(Z)V

    .line 550
    iget-object v0, p0, Landroidx/media3/ui/LegacyPlayerControlView;->onFastForward:Lo/isUnsafeBaseType;

    if-ne v0, p1, :cond_27

    return-void

    :cond_27
    if-eqz v0, :cond_2e

    .line 554
    iget-object v1, p0, Landroidx/media3/ui/LegacyPlayerControlView;->AudioAttributesCompatParcelizer:Landroidx/media3/ui/LegacyPlayerControlView$AudioAttributesCompatParcelizer;

    invoke-interface {v0, v1}, Lo/isUnsafeBaseType;->write(Lo/isUnsafeBaseType$AudioAttributesCompatParcelizer;)V

    .line 556
    :cond_2e
    iput-object p1, p0, Landroidx/media3/ui/LegacyPlayerControlView;->onFastForward:Lo/isUnsafeBaseType;

    if-eqz p1, :cond_37

    .line 558
    iget-object v0, p0, Landroidx/media3/ui/LegacyPlayerControlView;->AudioAttributesCompatParcelizer:Landroidx/media3/ui/LegacyPlayerControlView$AudioAttributesCompatParcelizer;

    invoke-interface {p1, v0}, Lo/isUnsafeBaseType;->read(Lo/isUnsafeBaseType$AudioAttributesCompatParcelizer;)V

    .line 560
    :cond_37
    invoke-direct {p0}, Landroidx/media3/ui/LegacyPlayerControlView;->write()V

    return-void
.end method

.method public setProgressUpdateListener(Landroidx/media3/ui/LegacyPlayerControlView$write;)V
    .registers 2

    .line 636
    iput-object p1, p0, Landroidx/media3/ui/LegacyPlayerControlView;->onPlayFromUri:Landroidx/media3/ui/LegacyPlayerControlView$write;

    return-void
.end method

.method public setRepeatToggleModes(I)V
    .registers 5

    .line 720
    iput p1, p0, Landroidx/media3/ui/LegacyPlayerControlView;->onRemoveQueueItemAt:I

    .line 721
    iget-object v0, p0, Landroidx/media3/ui/LegacyPlayerControlView;->onFastForward:Lo/isUnsafeBaseType;

    if-eqz v0, :cond_2a

    .line 722
    invoke-interface {v0}, Lo/isUnsafeBaseType;->onSetShuffleMode()I

    move-result v0

    if-nez p1, :cond_15

    if-eqz v0, :cond_15

    .line 725
    iget-object p1, p0, Landroidx/media3/ui/LegacyPlayerControlView;->onFastForward:Lo/isUnsafeBaseType;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Lo/isUnsafeBaseType;->IconCompatParcelizer(I)V

    goto :goto_2a

    :cond_15
    const/4 v1, 0x2

    const/4 v2, 0x1

    if-ne p1, v2, :cond_21

    if-ne v0, v1, :cond_21

    .line 728
    iget-object p1, p0, Landroidx/media3/ui/LegacyPlayerControlView;->onFastForward:Lo/isUnsafeBaseType;

    invoke-interface {p1, v2}, Lo/isUnsafeBaseType;->IconCompatParcelizer(I)V

    goto :goto_2a

    :cond_21
    if-ne p1, v1, :cond_2a

    if-ne v0, v2, :cond_2a

    .line 731
    iget-object p1, p0, Landroidx/media3/ui/LegacyPlayerControlView;->onFastForward:Lo/isUnsafeBaseType;

    invoke-interface {p1, v1}, Lo/isUnsafeBaseType;->IconCompatParcelizer(I)V

    .line 734
    :cond_2a
    :goto_2a
    invoke-direct {p0}, Landroidx/media3/ui/LegacyPlayerControlView;->AudioAttributesImplBaseParcelizer()V

    return-void
.end method

.method public setShowFastForwardButton(Z)V
    .registers 2

    .line 655
    iput-boolean p1, p0, Landroidx/media3/ui/LegacyPlayerControlView;->onSetPlaybackSpeed:Z

    .line 656
    invoke-direct {p0}, Landroidx/media3/ui/LegacyPlayerControlView;->AudioAttributesImplApi21Parcelizer()V

    return-void
.end method

.method public setShowMultiWindowTimeBar(Z)V
    .registers 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 569
    iput-boolean p1, p0, Landroidx/media3/ui/LegacyPlayerControlView;->onSetRating:Z

    .line 570
    invoke-direct {p0}, Landroidx/media3/ui/LegacyPlayerControlView;->MediaMetadataCompat()V

    return-void
.end method

.method public setShowNextButton(Z)V
    .registers 2

    .line 675
    iput-boolean p1, p0, Landroidx/media3/ui/LegacyPlayerControlView;->onSetRepeatMode:Z

    .line 676
    invoke-direct {p0}, Landroidx/media3/ui/LegacyPlayerControlView;->AudioAttributesImplApi21Parcelizer()V

    return-void
.end method

.method public setShowPlayButtonIfPlaybackIsSuppressed(Z)V
    .registers 2

    .line 583
    iput-boolean p1, p0, Landroidx/media3/ui/LegacyPlayerControlView;->onSetCaptioningEnabled:Z

    .line 584
    invoke-direct {p0}, Landroidx/media3/ui/LegacyPlayerControlView;->AudioAttributesImplApi26Parcelizer()V

    return-void
.end method

.method public setShowPreviousButton(Z)V
    .registers 2

    .line 665
    iput-boolean p1, p0, Landroidx/media3/ui/LegacyPlayerControlView;->onSkipToQueueItem:Z

    .line 666
    invoke-direct {p0}, Landroidx/media3/ui/LegacyPlayerControlView;->AudioAttributesImplApi21Parcelizer()V

    return-void
.end method

.method public setShowRewindButton(Z)V
    .registers 2

    .line 645
    iput-boolean p1, p0, Landroidx/media3/ui/LegacyPlayerControlView;->onSkipToPrevious:Z

    .line 646
    invoke-direct {p0}, Landroidx/media3/ui/LegacyPlayerControlView;->AudioAttributesImplApi21Parcelizer()V

    return-void
.end method

.method public setShowShuffleButton(Z)V
    .registers 2

    .line 748
    iput-boolean p1, p0, Landroidx/media3/ui/LegacyPlayerControlView;->setSessionImpl:Z

    .line 749
    invoke-direct {p0}, Landroidx/media3/ui/LegacyPlayerControlView;->MediaBrowserCompatCustomActionResultReceiver()V

    return-void
.end method

.method public setShowTimeoutMs(I)V
    .registers 2

    .line 698
    iput p1, p0, Landroidx/media3/ui/LegacyPlayerControlView;->onStop:I

    .line 699
    invoke-direct {p0}, Landroidx/media3/ui/LegacyPlayerControlView;->MediaBrowserCompatMediaItem()Z

    move-result p1

    if-eqz p1, :cond_b

    .line 701
    invoke-direct {p0}, Landroidx/media3/ui/LegacyPlayerControlView;->AudioAttributesCompatParcelizer()V

    :cond_b
    return-void
.end method

.method public setShowVrButton(Z)V
    .registers 2

    .line 763
    iget-object p0, p0, Landroidx/media3/ui/LegacyPlayerControlView;->r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM:Landroid/view/View;

    if-eqz p0, :cond_d

    if-eqz p1, :cond_8

    const/4 p1, 0x0

    goto :goto_a

    :cond_8
    const/16 p1, 0x8

    .line 764
    :goto_a
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    :cond_d
    return-void
.end method

.method public setTimeBarMinUpdateInterval(I)V
    .registers 4

    const/16 v0, 0x10

    const/16 v1, 0x3e8

    .line 793
    invoke-static {p1, v0, v1}, Lo/LaissezFaireSubTypeValidator;->write(III)I

    move-result p1

    iput p1, p0, Landroidx/media3/ui/LegacyPlayerControlView;->r8lambdaKUbBm7ckfqTc9QCgukC86fguu4:I

    return-void
.end method

.method public setVrButtonListener(Landroid/view/View$OnClickListener;)V
    .registers 4

    .line 774
    iget-object v0, p0, Landroidx/media3/ui/LegacyPlayerControlView;->r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM:Landroid/view/View;

    if-eqz v0, :cond_15

    .line 775
    invoke-virtual {v0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 776
    invoke-direct {p0}, Landroidx/media3/ui/LegacyPlayerControlView;->MediaBrowserCompatSearchResultReceiver()Z

    move-result v0

    if-eqz p1, :cond_f

    const/4 p1, 0x1

    goto :goto_10

    :cond_f
    const/4 p1, 0x0

    :goto_10
    iget-object v1, p0, Landroidx/media3/ui/LegacyPlayerControlView;->r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM:Landroid/view/View;

    invoke-direct {p0, v0, p1, v1}, Landroidx/media3/ui/LegacyPlayerControlView;->RemoteActionCompatParcelizer(ZZLandroid/view/View;)V

    :cond_15
    return-void
.end method

###### Class androidx.media3.ui.LegacyPlayerControlView.AudioAttributesCompatParcelizer (androidx.media3.ui.LegacyPlayerControlView$AudioAttributesCompatParcelizer)
.class final Landroidx/media3/ui/LegacyPlayerControlView$AudioAttributesCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/isUnsafeBaseType$AudioAttributesCompatParcelizer;
.implements Lo/PrivateMaxEntriesMapRemovalTask$write;
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/ui/LegacyPlayerControlView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "AudioAttributesCompatParcelizer"
.end annotation


# instance fields
.field final synthetic IconCompatParcelizer:Landroidx/media3/ui/LegacyPlayerControlView;


# direct methods
.method private constructor <init>(Landroidx/media3/ui/LegacyPlayerControlView;)V
    .registers 2

    .line 1278
    iput-object p1, p0, Landroidx/media3/ui/LegacyPlayerControlView$AudioAttributesCompatParcelizer;->IconCompatParcelizer:Landroidx/media3/ui/LegacyPlayerControlView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Landroidx/media3/ui/LegacyPlayerControlView;B)V
    .registers 3

    .line 1278
    invoke-direct {p0, p1}, Landroidx/media3/ui/LegacyPlayerControlView$AudioAttributesCompatParcelizer;-><init>(Landroidx/media3/ui/LegacyPlayerControlView;)V

    return-void
.end method


# virtual methods
.method public final IconCompatParcelizer(J)V
    .registers 5

    .line 1319
    iget-object v0, p0, Landroidx/media3/ui/LegacyPlayerControlView$AudioAttributesCompatParcelizer;->IconCompatParcelizer:Landroidx/media3/ui/LegacyPlayerControlView;

    invoke-static {v0}, Landroidx/media3/ui/LegacyPlayerControlView;->handleMediaPlayPauseIfPendingOnHandler(Landroidx/media3/ui/LegacyPlayerControlView;)Landroid/widget/TextView;

    move-result-object v0

    if-eqz v0, :cond_21

    .line 1320
    iget-object v0, p0, Landroidx/media3/ui/LegacyPlayerControlView$AudioAttributesCompatParcelizer;->IconCompatParcelizer:Landroidx/media3/ui/LegacyPlayerControlView;

    invoke-static {v0}, Landroidx/media3/ui/LegacyPlayerControlView;->handleMediaPlayPauseIfPendingOnHandler(Landroidx/media3/ui/LegacyPlayerControlView;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Landroidx/media3/ui/LegacyPlayerControlView$AudioAttributesCompatParcelizer;->IconCompatParcelizer:Landroidx/media3/ui/LegacyPlayerControlView;

    invoke-static {v1}, Landroidx/media3/ui/LegacyPlayerControlView;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(Landroidx/media3/ui/LegacyPlayerControlView;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object p0, p0, Landroidx/media3/ui/LegacyPlayerControlView$AudioAttributesCompatParcelizer;->IconCompatParcelizer:Landroidx/media3/ui/LegacyPlayerControlView;

    invoke-static {p0}, Landroidx/media3/ui/LegacyPlayerControlView;->read(Landroidx/media3/ui/LegacyPlayerControlView;)Ljava/util/Formatter;

    move-result-object p0

    invoke-static {v1, p0, p1, p2}, Lo/LaissezFaireSubTypeValidator;->read(Ljava/lang/StringBuilder;Ljava/util/Formatter;J)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_21
    return-void
.end method

.method public final IconCompatParcelizer(Lo/isUnsafeBaseType;Lo/isUnsafeBaseType$RemoteActionCompatParcelizer;)V
    .registers 7

    const/4 p1, 0x4

    const/4 v0, 0x5

    .line 1283
    filled-new-array {p1, v0}, [I

    move-result-object v1

    invoke-virtual {p2, v1}, Lo/isUnsafeBaseType$RemoteActionCompatParcelizer;->read([I)Z

    move-result v1

    if-eqz v1, :cond_11

    .line 1284
    iget-object v1, p0, Landroidx/media3/ui/LegacyPlayerControlView$AudioAttributesCompatParcelizer;->IconCompatParcelizer:Landroidx/media3/ui/LegacyPlayerControlView;

    invoke-static {v1}, Landroidx/media3/ui/LegacyPlayerControlView;->AudioAttributesCompatParcelizer(Landroidx/media3/ui/LegacyPlayerControlView;)V

    :cond_11
    const/4 v1, 0x7

    .line 1286
    filled-new-array {p1, v0, v1}, [I

    move-result-object p1

    invoke-virtual {p2, p1}, Lo/isUnsafeBaseType$RemoteActionCompatParcelizer;->read([I)Z

    move-result p1

    if-eqz p1, :cond_21

    .line 1288
    iget-object p1, p0, Landroidx/media3/ui/LegacyPlayerControlView$AudioAttributesCompatParcelizer;->IconCompatParcelizer:Landroidx/media3/ui/LegacyPlayerControlView;

    invoke-static {p1}, Landroidx/media3/ui/LegacyPlayerControlView;->MediaDescriptionCompat(Landroidx/media3/ui/LegacyPlayerControlView;)V

    :cond_21
    const/16 p1, 0x8

    .line 1290
    invoke-virtual {p2, p1}, Lo/isUnsafeBaseType$RemoteActionCompatParcelizer;->AudioAttributesCompatParcelizer(I)Z

    move-result v0

    if-eqz v0, :cond_2e

    .line 1291
    iget-object v0, p0, Landroidx/media3/ui/LegacyPlayerControlView$AudioAttributesCompatParcelizer;->IconCompatParcelizer:Landroidx/media3/ui/LegacyPlayerControlView;

    invoke-static {v0}, Landroidx/media3/ui/LegacyPlayerControlView;->RatingCompat(Landroidx/media3/ui/LegacyPlayerControlView;)V

    :cond_2e
    const/16 v0, 0x9

    .line 1293
    invoke-virtual {p2, v0}, Lo/isUnsafeBaseType$RemoteActionCompatParcelizer;->AudioAttributesCompatParcelizer(I)Z

    move-result v1

    if-eqz v1, :cond_3b

    .line 1294
    iget-object v1, p0, Landroidx/media3/ui/LegacyPlayerControlView$AudioAttributesCompatParcelizer;->IconCompatParcelizer:Landroidx/media3/ui/LegacyPlayerControlView;

    invoke-static {v1}, Landroidx/media3/ui/LegacyPlayerControlView;->onAddQueueItem(Landroidx/media3/ui/LegacyPlayerControlView;)V

    :cond_3b
    const/16 v1, 0xd

    const/16 v2, 0xb

    const/4 v3, 0x0

    .line 1296
    filled-new-array {p1, v0, v2, v3, v1}, [I

    move-result-object p1

    invoke-virtual {p2, p1}, Lo/isUnsafeBaseType$RemoteActionCompatParcelizer;->read([I)Z

    move-result p1

    if-eqz p1, :cond_4f

    .line 1302
    iget-object p1, p0, Landroidx/media3/ui/LegacyPlayerControlView$AudioAttributesCompatParcelizer;->IconCompatParcelizer:Landroidx/media3/ui/LegacyPlayerControlView;

    invoke-static {p1}, Landroidx/media3/ui/LegacyPlayerControlView;->onCommand(Landroidx/media3/ui/LegacyPlayerControlView;)V

    .line 1304
    :cond_4f
    filled-new-array {v2, v3}, [I

    move-result-object p1

    invoke-virtual {p2, p1}, Lo/isUnsafeBaseType$RemoteActionCompatParcelizer;->read([I)Z

    move-result p1

    if-eqz p1, :cond_5e

    .line 1305
    iget-object p0, p0, Landroidx/media3/ui/LegacyPlayerControlView$AudioAttributesCompatParcelizer;->IconCompatParcelizer:Landroidx/media3/ui/LegacyPlayerControlView;

    invoke-static {p0}, Landroidx/media3/ui/LegacyPlayerControlView;->onCustomAction(Landroidx/media3/ui/LegacyPlayerControlView;)V

    :cond_5e
    return-void
.end method

.method public final RemoteActionCompatParcelizer(J)V
    .registers 5

    .line 1311
    iget-object v0, p0, Landroidx/media3/ui/LegacyPlayerControlView$AudioAttributesCompatParcelizer;->IconCompatParcelizer:Landroidx/media3/ui/LegacyPlayerControlView;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Landroidx/media3/ui/LegacyPlayerControlView;->RemoteActionCompatParcelizer(Landroidx/media3/ui/LegacyPlayerControlView;Z)Z

    .line 1312
    iget-object v0, p0, Landroidx/media3/ui/LegacyPlayerControlView$AudioAttributesCompatParcelizer;->IconCompatParcelizer:Landroidx/media3/ui/LegacyPlayerControlView;

    invoke-static {v0}, Landroidx/media3/ui/LegacyPlayerControlView;->handleMediaPlayPauseIfPendingOnHandler(Landroidx/media3/ui/LegacyPlayerControlView;)Landroid/widget/TextView;

    move-result-object v0

    if-eqz v0, :cond_27

    .line 1313
    iget-object v0, p0, Landroidx/media3/ui/LegacyPlayerControlView$AudioAttributesCompatParcelizer;->IconCompatParcelizer:Landroidx/media3/ui/LegacyPlayerControlView;

    invoke-static {v0}, Landroidx/media3/ui/LegacyPlayerControlView;->handleMediaPlayPauseIfPendingOnHandler(Landroidx/media3/ui/LegacyPlayerControlView;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Landroidx/media3/ui/LegacyPlayerControlView$AudioAttributesCompatParcelizer;->IconCompatParcelizer:Landroidx/media3/ui/LegacyPlayerControlView;

    invoke-static {v1}, Landroidx/media3/ui/LegacyPlayerControlView;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(Landroidx/media3/ui/LegacyPlayerControlView;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object p0, p0, Landroidx/media3/ui/LegacyPlayerControlView$AudioAttributesCompatParcelizer;->IconCompatParcelizer:Landroidx/media3/ui/LegacyPlayerControlView;

    invoke-static {p0}, Landroidx/media3/ui/LegacyPlayerControlView;->read(Landroidx/media3/ui/LegacyPlayerControlView;)Ljava/util/Formatter;

    move-result-object p0

    invoke-static {v1, p0, p1, p2}, Lo/LaissezFaireSubTypeValidator;->read(Ljava/lang/StringBuilder;Ljava/util/Formatter;J)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_27
    return-void
.end method

.method public final RemoteActionCompatParcelizer(JZ)V
    .registers 6

    .line 1326
    iget-object v0, p0, Landroidx/media3/ui/LegacyPlayerControlView$AudioAttributesCompatParcelizer;->IconCompatParcelizer:Landroidx/media3/ui/LegacyPlayerControlView;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroidx/media3/ui/LegacyPlayerControlView;->RemoteActionCompatParcelizer(Landroidx/media3/ui/LegacyPlayerControlView;Z)Z

    if-nez p3, :cond_19

    .line 1327
    iget-object p3, p0, Landroidx/media3/ui/LegacyPlayerControlView$AudioAttributesCompatParcelizer;->IconCompatParcelizer:Landroidx/media3/ui/LegacyPlayerControlView;

    invoke-static {p3}, Landroidx/media3/ui/LegacyPlayerControlView;->IconCompatParcelizer(Landroidx/media3/ui/LegacyPlayerControlView;)Lo/isUnsafeBaseType;

    move-result-object p3

    if-eqz p3, :cond_19

    .line 1328
    iget-object p0, p0, Landroidx/media3/ui/LegacyPlayerControlView$AudioAttributesCompatParcelizer;->IconCompatParcelizer:Landroidx/media3/ui/LegacyPlayerControlView;

    invoke-static {p0}, Landroidx/media3/ui/LegacyPlayerControlView;->IconCompatParcelizer(Landroidx/media3/ui/LegacyPlayerControlView;)Lo/isUnsafeBaseType;

    move-result-object p3

    invoke-static {p0, p3, p1, p2}, Landroidx/media3/ui/LegacyPlayerControlView;->read(Landroidx/media3/ui/LegacyPlayerControlView;Lo/isUnsafeBaseType;J)V

    :cond_19
    return-void
.end method

.method public final onClick(Landroid/view/View;)V
    .registers 4

    .line 1334
    iget-object v0, p0, Landroidx/media3/ui/LegacyPlayerControlView$AudioAttributesCompatParcelizer;->IconCompatParcelizer:Landroidx/media3/ui/LegacyPlayerControlView;

    invoke-static {v0}, Landroidx/media3/ui/LegacyPlayerControlView;->IconCompatParcelizer(Landroidx/media3/ui/LegacyPlayerControlView;)Lo/isUnsafeBaseType;

    move-result-object v0

    if-eqz v0, :cond_82

    .line 1338
    iget-object v1, p0, Landroidx/media3/ui/LegacyPlayerControlView$AudioAttributesCompatParcelizer;->IconCompatParcelizer:Landroidx/media3/ui/LegacyPlayerControlView;

    invoke-static {v1}, Landroidx/media3/ui/LegacyPlayerControlView;->write(Landroidx/media3/ui/LegacyPlayerControlView;)Landroid/view/View;

    move-result-object v1

    if-ne v1, p1, :cond_14

    .line 1339
    invoke-interface {v0}, Lo/isUnsafeBaseType;->RatingCompat()V

    return-void

    .line 1340
    :cond_14
    iget-object v1, p0, Landroidx/media3/ui/LegacyPlayerControlView$AudioAttributesCompatParcelizer;->IconCompatParcelizer:Landroidx/media3/ui/LegacyPlayerControlView;

    invoke-static {v1}, Landroidx/media3/ui/LegacyPlayerControlView;->AudioAttributesImplBaseParcelizer(Landroidx/media3/ui/LegacyPlayerControlView;)Landroid/view/View;

    move-result-object v1

    if-ne v1, p1, :cond_20

    .line 1341
    invoke-interface {v0}, Lo/isUnsafeBaseType;->MediaBrowserCompatMediaItem()V

    return-void

    .line 1342
    :cond_20
    iget-object v1, p0, Landroidx/media3/ui/LegacyPlayerControlView$AudioAttributesCompatParcelizer;->IconCompatParcelizer:Landroidx/media3/ui/LegacyPlayerControlView;

    invoke-static {v1}, Landroidx/media3/ui/LegacyPlayerControlView;->AudioAttributesImplApi26Parcelizer(Landroidx/media3/ui/LegacyPlayerControlView;)Landroid/view/View;

    move-result-object v1

    if-ne v1, p1, :cond_33

    .line 1343
    invoke-interface {v0}, Lo/isUnsafeBaseType;->onRewind()I

    move-result p0

    const/4 p1, 0x4

    if-eq p0, p1, :cond_82

    .line 1344
    invoke-interface {v0}, Lo/isUnsafeBaseType;->MediaDescriptionCompat()V

    return-void

    .line 1346
    :cond_33
    iget-object v1, p0, Landroidx/media3/ui/LegacyPlayerControlView$AudioAttributesCompatParcelizer;->IconCompatParcelizer:Landroidx/media3/ui/LegacyPlayerControlView;

    invoke-static {v1}, Landroidx/media3/ui/LegacyPlayerControlView;->AudioAttributesImplApi21Parcelizer(Landroidx/media3/ui/LegacyPlayerControlView;)Landroid/view/View;

    move-result-object v1

    if-ne v1, p1, :cond_3f

    .line 1347
    invoke-interface {v0}, Lo/isUnsafeBaseType;->MediaBrowserCompatSearchResultReceiver()V

    return-void

    .line 1348
    :cond_3f
    iget-object v1, p0, Landroidx/media3/ui/LegacyPlayerControlView$AudioAttributesCompatParcelizer;->IconCompatParcelizer:Landroidx/media3/ui/LegacyPlayerControlView;

    invoke-static {v1}, Landroidx/media3/ui/LegacyPlayerControlView;->MediaBrowserCompatItemReceiver(Landroidx/media3/ui/LegacyPlayerControlView;)Landroid/view/View;

    move-result-object v1

    if-ne v1, p1, :cond_4b

    .line 1349
    invoke-static {v0}, Lo/LaissezFaireSubTypeValidator;->AudioAttributesCompatParcelizer(Lo/isUnsafeBaseType;)Z

    return-void

    .line 1350
    :cond_4b
    iget-object v1, p0, Landroidx/media3/ui/LegacyPlayerControlView$AudioAttributesCompatParcelizer;->IconCompatParcelizer:Landroidx/media3/ui/LegacyPlayerControlView;

    invoke-static {v1}, Landroidx/media3/ui/LegacyPlayerControlView;->MediaBrowserCompatCustomActionResultReceiver(Landroidx/media3/ui/LegacyPlayerControlView;)Landroid/view/View;

    move-result-object v1

    if-ne v1, p1, :cond_57

    .line 1351
    invoke-static {v0}, Lo/LaissezFaireSubTypeValidator;->write(Lo/isUnsafeBaseType;)Z

    return-void

    .line 1352
    :cond_57
    iget-object v1, p0, Landroidx/media3/ui/LegacyPlayerControlView$AudioAttributesCompatParcelizer;->IconCompatParcelizer:Landroidx/media3/ui/LegacyPlayerControlView;

    invoke-static {v1}, Landroidx/media3/ui/LegacyPlayerControlView;->MediaMetadataCompat(Landroidx/media3/ui/LegacyPlayerControlView;)Landroid/widget/ImageView;

    move-result-object v1

    if-ne v1, p1, :cond_71

    .line 1354
    invoke-interface {v0}, Lo/isUnsafeBaseType;->onSetShuffleMode()I

    move-result p1

    iget-object p0, p0, Landroidx/media3/ui/LegacyPlayerControlView$AudioAttributesCompatParcelizer;->IconCompatParcelizer:Landroidx/media3/ui/LegacyPlayerControlView;

    invoke-static {p0}, Landroidx/media3/ui/LegacyPlayerControlView;->MediaBrowserCompatSearchResultReceiver(Landroidx/media3/ui/LegacyPlayerControlView;)I

    move-result p0

    invoke-static {p1, p0}, Lo/AsPropertyTypeSerializer;->AudioAttributesCompatParcelizer(II)I

    move-result p0

    .line 1353
    invoke-interface {v0, p0}, Lo/isUnsafeBaseType;->IconCompatParcelizer(I)V

    return-void

    .line 1355
    :cond_71
    iget-object p0, p0, Landroidx/media3/ui/LegacyPlayerControlView$AudioAttributesCompatParcelizer;->IconCompatParcelizer:Landroidx/media3/ui/LegacyPlayerControlView;

    invoke-static {p0}, Landroidx/media3/ui/LegacyPlayerControlView;->MediaBrowserCompatMediaItem(Landroidx/media3/ui/LegacyPlayerControlView;)Landroid/widget/ImageView;

    move-result-object p0

    if-ne p0, p1, :cond_82

    .line 1356
    invoke-interface {v0}, Lo/isUnsafeBaseType;->onSetPlaybackSpeed()Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    invoke-interface {v0, p0}, Lo/isUnsafeBaseType;->IconCompatParcelizer(Z)V

    :cond_82
    return-void
.end method

###### Class androidx.media3.ui.LegacyPlayerControlView.IconCompatParcelizer (androidx.media3.ui.LegacyPlayerControlView$IconCompatParcelizer)
.class public interface abstract Landroidx/media3/ui/LegacyPlayerControlView$IconCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/ui/LegacyPlayerControlView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "IconCompatParcelizer"
.end annotation

###### Class androidx.media3.ui.LegacyPlayerControlView.RemoteActionCompatParcelizer (androidx.media3.ui.LegacyPlayerControlView$RemoteActionCompatParcelizer)
.class final Landroidx/media3/ui/LegacyPlayerControlView$RemoteActionCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/ui/LegacyPlayerControlView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "RemoteActionCompatParcelizer"
.end annotation


# direct methods
.method public static IconCompatParcelizer(Landroid/view/View;)Z
    .registers 1

    .line 1365
    invoke-virtual {p0}, Landroid/view/View;->isAccessibilityFocused()Z

    move-result p0

    return p0
.end method

###### Class androidx.media3.ui.LegacyPlayerControlView.write (androidx.media3.ui.LegacyPlayerControlView$write)
.class public interface abstract Landroidx/media3/ui/LegacyPlayerControlView$write;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/ui/LegacyPlayerControlView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "write"
.end annotation

###### Class kotlin.checkState (o.checkState)
.class public final synthetic Lo/checkState;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic write:Landroidx/media3/ui/LegacyPlayerControlView;


# direct methods
.method public synthetic constructor <init>(Landroidx/media3/ui/LegacyPlayerControlView;)V
    .registers 2

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo/checkState;->write:Landroidx/media3/ui/LegacyPlayerControlView;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 1

    .line 0
    iget-object p0, p0, Lo/checkState;->write:Landroidx/media3/ui/LegacyPlayerControlView;

    invoke-static {p0}, Landroidx/media3/ui/LegacyPlayerControlView;->RemoteActionCompatParcelizer(Landroidx/media3/ui/LegacyPlayerControlView;)V

    return-void
.end method

###### Class kotlin.containsKey (o.containsKey)
.class public final synthetic Lo/containsKey;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic AudioAttributesCompatParcelizer:Landroidx/media3/ui/LegacyPlayerControlView;


# direct methods
.method public synthetic constructor <init>(Landroidx/media3/ui/LegacyPlayerControlView;)V
    .registers 2

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo/containsKey;->AudioAttributesCompatParcelizer:Landroidx/media3/ui/LegacyPlayerControlView;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 1

    .line 0
    iget-object p0, p0, Lo/containsKey;->AudioAttributesCompatParcelizer:Landroidx/media3/ui/LegacyPlayerControlView;

    invoke-virtual {p0}, Landroidx/media3/ui/LegacyPlayerControlView;->IconCompatParcelizer()V

    return-void
.end method
