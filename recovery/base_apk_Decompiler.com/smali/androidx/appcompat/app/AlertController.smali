###### Class androidx.appcompat.app.AlertController (androidx.appcompat.app.AlertController)
.class public final Landroidx/appcompat/app/AlertController;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/appcompat/app/AlertController$IconCompatParcelizer;,
        Landroidx/appcompat/app/AlertController$AudioAttributesCompatParcelizer;,
        Landroidx/appcompat/app/AlertController$RemoteActionCompatParcelizer;,
        Landroidx/appcompat/app/AlertController$RecycleListView;
    }
.end annotation


# instance fields
.field AudioAttributesCompatParcelizer:Landroid/widget/Button;

.field AudioAttributesImplApi21Parcelizer:Landroid/widget/Button;

.field AudioAttributesImplApi26Parcelizer:Landroid/os/Handler;

.field AudioAttributesImplBaseParcelizer:I

.field IconCompatParcelizer:Landroid/os/Message;

.field MediaBrowserCompatCustomActionResultReceiver:Landroid/os/Message;

.field final MediaBrowserCompatItemReceiver:Lo/menuHostHelperlambda0;

.field private MediaBrowserCompatMediaItem:I

.field MediaBrowserCompatSearchResultReceiver:I

.field private final MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:I

.field MediaDescriptionCompat:Landroid/widget/ListView;

.field MediaMetadataCompat:I

.field RatingCompat:I

.field RemoteActionCompatParcelizer:Landroid/os/Message;

.field private final handleMediaPlayPauseIfPendingOnHandler:Landroid/view/View$OnClickListener;

.field private onAddQueueItem:Ljava/lang/CharSequence;

.field private onCommand:Landroid/graphics/drawable/Drawable;

.field private onCustomAction:Landroid/graphics/drawable/Drawable;

.field private onFastForward:Ljava/lang/CharSequence;

.field private onMediaButtonEvent:Landroid/graphics/drawable/Drawable;

.field private onPause:Ljava/lang/CharSequence;

.field private onPlay:I

.field private onPlayFromMediaId:I

.field private onPlayFromSearch:Landroid/widget/ImageView;

.field private onPlayFromUri:Landroid/view/View;

.field private onPrepare:I

.field private onPrepareFromMediaId:Landroid/graphics/drawable/Drawable;

.field private final onPrepareFromSearch:Landroid/content/Context;

.field private onPrepareFromUri:Z

.field private onRemoveQueueItem:Landroid/widget/TextView;

.field private onRemoveQueueItemAt:Landroidx/core/widget/NestedScrollView;

.field private onRewind:I

.field private onSeekTo:Ljava/lang/CharSequence;

.field private onSetCaptioningEnabled:Landroid/widget/TextView;

.field private onSetPlaybackSpeed:Z

.field private onSetRating:Landroid/view/View;

.field private onSetRepeatMode:I

.field private onSetShuffleMode:Ljava/lang/CharSequence;

.field private final onSkipToPrevious:Landroid/view/Window;

.field read:Landroid/widget/Button;

.field write:Landroid/widget/ListAdapter;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lo/menuHostHelperlambda0;Landroid/view/Window;)V
    .registers 7

    .line 182
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 82
    iput-boolean v0, p0, Landroidx/appcompat/app/AlertController;->onSetPlaybackSpeed:Z

    .line 101
    iput v0, p0, Landroidx/appcompat/app/AlertController;->onPrepare:I

    const/4 v1, -0x1

    .line 111
    iput v1, p0, Landroidx/appcompat/app/AlertController;->AudioAttributesImplBaseParcelizer:I

    .line 122
    iput v0, p0, Landroidx/appcompat/app/AlertController;->onPlayFromMediaId:I

    .line 126
    new-instance v1, Landroidx/appcompat/app/AlertController$5;

    invoke-direct {v1, p0}, Landroidx/appcompat/app/AlertController$5;-><init>(Landroidx/appcompat/app/AlertController;)V

    iput-object v1, p0, Landroidx/appcompat/app/AlertController;->handleMediaPlayPauseIfPendingOnHandler:Landroid/view/View$OnClickListener;

    .line 183
    iput-object p1, p0, Landroidx/appcompat/app/AlertController;->onPrepareFromSearch:Landroid/content/Context;

    .line 184
    iput-object p2, p0, Landroidx/appcompat/app/AlertController;->MediaBrowserCompatItemReceiver:Lo/menuHostHelperlambda0;

    .line 185
    iput-object p3, p0, Landroidx/appcompat/app/AlertController;->onSkipToPrevious:Landroid/view/Window;

    .line 186
    new-instance p3, Landroidx/appcompat/app/AlertController$AudioAttributesCompatParcelizer;

    invoke-direct {p3, p2}, Landroidx/appcompat/app/AlertController$AudioAttributesCompatParcelizer;-><init>(Landroid/content/DialogInterface;)V

    iput-object p3, p0, Landroidx/appcompat/app/AlertController;->AudioAttributesImplApi26Parcelizer:Landroid/os/Handler;

    .line 188
    sget-object p3, Lo/_init_lambda5$AudioAttributesImplApi26Parcelizer;->AlertDialog:[I

    sget v1, Lo/_init_lambda5$read;->alertDialogStyle:I

    const/4 v2, 0x0

    invoke-virtual {p1, v2, p3, v1, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 191
    sget p3, Lo/_init_lambda5$AudioAttributesImplApi26Parcelizer;->AlertDialog_android_layout:I

    invoke-virtual {p1, p3, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p3

    iput p3, p0, Landroidx/appcompat/app/AlertController;->MediaBrowserCompatMediaItem:I

    .line 192
    sget p3, Lo/_init_lambda5$AudioAttributesImplApi26Parcelizer;->AlertDialog_buttonPanelSideLayout:I

    invoke-virtual {p1, p3, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p3

    iput p3, p0, Landroidx/appcompat/app/AlertController;->onPlay:I

    .line 194
    sget p3, Lo/_init_lambda5$AudioAttributesImplApi26Parcelizer;->AlertDialog_listLayout:I

    invoke-virtual {p1, p3, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p3

    iput p3, p0, Landroidx/appcompat/app/AlertController;->MediaMetadataCompat:I

    .line 195
    sget p3, Lo/_init_lambda5$AudioAttributesImplApi26Parcelizer;->AlertDialog_multiChoiceItemLayout:I

    invoke-virtual {p1, p3, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p3

    iput p3, p0, Landroidx/appcompat/app/AlertController;->onRewind:I

    .line 196
    sget p3, Lo/_init_lambda5$AudioAttributesImplApi26Parcelizer;->AlertDialog_singleChoiceItemLayout:I

    .line 197
    invoke-virtual {p1, p3, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p3

    iput p3, p0, Landroidx/appcompat/app/AlertController;->MediaBrowserCompatSearchResultReceiver:I

    .line 198
    sget p3, Lo/_init_lambda5$AudioAttributesImplApi26Parcelizer;->AlertDialog_listItemLayout:I

    invoke-virtual {p1, p3, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p3

    iput p3, p0, Landroidx/appcompat/app/AlertController;->RatingCompat:I

    .line 199
    sget p3, Lo/_init_lambda5$AudioAttributesImplApi26Parcelizer;->AlertDialog_showTitle:I

    const/4 v1, 0x1

    invoke-virtual {p1, p3, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p3

    iput-boolean p3, p0, Landroidx/appcompat/app/AlertController;->onPrepareFromUri:Z

    .line 200
    sget p3, Lo/_init_lambda5$AudioAttributesImplApi26Parcelizer;->AlertDialog_buttonIconDimen:I

    invoke-virtual {p1, p3, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p3

    iput p3, p0, Landroidx/appcompat/app/AlertController;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:I

    .line 202
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 205
    invoke-virtual {p2, v1}, Lo/menuHostHelperlambda0;->IconCompatParcelizer(I)Z

    return-void
.end method

.method private IconCompatParcelizer(Landroid/view/ViewGroup;)V
    .registers 7

    .line 673
    iget-object v0, p0, Landroidx/appcompat/app/AlertController;->onPlayFromUri:Landroid/view/View;

    const/16 v1, 0x8

    if-eqz v0, :cond_1f

    .line 675
    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    const/4 v2, -0x1

    const/4 v3, -0x2

    invoke-direct {v0, v2, v3}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 678
    iget-object v2, p0, Landroidx/appcompat/app/AlertController;->onPlayFromUri:Landroid/view/View;

    const/4 v3, 0x0

    invoke-virtual {p1, v2, v3, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 681
    iget-object p0, p0, Landroidx/appcompat/app/AlertController;->onSkipToPrevious:Landroid/view/Window;

    sget p1, Lo/_init_lambda5$AudioAttributesImplBaseParcelizer;->title_template:I

    invoke-virtual {p0, p1}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    move-result-object p0

    .line 682
    invoke-virtual {p0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void

    .line 684
    :cond_1f
    iget-object v0, p0, Landroidx/appcompat/app/AlertController;->onSkipToPrevious:Landroid/view/Window;

    const v2, 0x1020006

    invoke-virtual {v0, v2}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Landroidx/appcompat/app/AlertController;->onPlayFromSearch:Landroid/widget/ImageView;

    .line 686
    iget-object v0, p0, Landroidx/appcompat/app/AlertController;->onSetShuffleMode:Ljava/lang/CharSequence;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_76

    .line 687
    iget-boolean v0, p0, Landroidx/appcompat/app/AlertController;->onPrepareFromUri:Z

    if-eqz v0, :cond_76

    .line 689
    iget-object p1, p0, Landroidx/appcompat/app/AlertController;->onSkipToPrevious:Landroid/view/Window;

    sget v0, Lo/_init_lambda5$AudioAttributesImplBaseParcelizer;->alertTitle:I

    invoke-virtual {p1, v0}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Landroidx/appcompat/app/AlertController;->onSetCaptioningEnabled:Landroid/widget/TextView;

    .line 690
    iget-object v0, p0, Landroidx/appcompat/app/AlertController;->onSetShuffleMode:Ljava/lang/CharSequence;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 697
    iget-object p1, p0, Landroidx/appcompat/app/AlertController;->onPrepareFromMediaId:Landroid/graphics/drawable/Drawable;

    if-eqz p1, :cond_53

    .line 698
    iget-object p0, p0, Landroidx/appcompat/app/AlertController;->onPlayFromSearch:Landroid/widget/ImageView;

    invoke-virtual {p0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void

    .line 702
    :cond_53
    iget-object p1, p0, Landroidx/appcompat/app/AlertController;->onSetCaptioningEnabled:Landroid/widget/TextView;

    iget-object v0, p0, Landroidx/appcompat/app/AlertController;->onPlayFromSearch:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    move-result v0

    iget-object v2, p0, Landroidx/appcompat/app/AlertController;->onPlayFromSearch:Landroid/widget/ImageView;

    .line 703
    invoke-virtual {v2}, Landroid/view/View;->getPaddingTop()I

    move-result v2

    iget-object v3, p0, Landroidx/appcompat/app/AlertController;->onPlayFromSearch:Landroid/widget/ImageView;

    .line 704
    invoke-virtual {v3}, Landroid/view/View;->getPaddingRight()I

    move-result v3

    iget-object v4, p0, Landroidx/appcompat/app/AlertController;->onPlayFromSearch:Landroid/widget/ImageView;

    .line 705
    invoke-virtual {v4}, Landroid/view/View;->getPaddingBottom()I

    move-result v4

    .line 702
    invoke-virtual {p1, v0, v2, v3, v4}, Landroid/view/View;->setPadding(IIII)V

    .line 706
    iget-object p0, p0, Landroidx/appcompat/app/AlertController;->onPlayFromSearch:Landroid/widget/ImageView;

    invoke-virtual {p0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    return-void

    .line 710
    :cond_76
    iget-object v0, p0, Landroidx/appcompat/app/AlertController;->onSkipToPrevious:Landroid/view/Window;

    sget v2, Lo/_init_lambda5$AudioAttributesImplBaseParcelizer;->title_template:I

    invoke-virtual {v0, v2}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 711
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 712
    iget-object p0, p0, Landroidx/appcompat/app/AlertController;->onPlayFromSearch:Landroid/widget/ImageView;

    invoke-virtual {p0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 713
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method private RemoteActionCompatParcelizer()I
    .registers 2

    .line 237
    iget v0, p0, Landroidx/appcompat/app/AlertController;->onPlay:I

    if-nez v0, :cond_7

    .line 238
    iget p0, p0, Landroidx/appcompat/app/AlertController;->MediaBrowserCompatMediaItem:I

    return p0

    .line 243
    :cond_7
    iget p0, p0, Landroidx/appcompat/app/AlertController;->MediaBrowserCompatMediaItem:I

    return p0
.end method

.method private RemoteActionCompatParcelizer(Landroid/view/ViewGroup;)V
    .registers 5

    .line 719
    iget-object v0, p0, Landroidx/appcompat/app/AlertController;->onSkipToPrevious:Landroid/view/Window;

    sget v1, Lo/_init_lambda5$AudioAttributesImplBaseParcelizer;->scrollView:I

    invoke-virtual {v0, v1}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/core/widget/NestedScrollView;

    iput-object v0, p0, Landroidx/appcompat/app/AlertController;->onRemoveQueueItemAt:Landroidx/core/widget/NestedScrollView;

    const/4 v1, 0x0

    .line 720
    invoke-virtual {v0, v1}, Landroid/view/View;->setFocusable(Z)V

    .line 721
    iget-object v0, p0, Landroidx/appcompat/app/AlertController;->onRemoveQueueItemAt:Landroidx/core/widget/NestedScrollView;

    invoke-virtual {v0, v1}, Landroidx/core/widget/NestedScrollView;->setNestedScrollingEnabled(Z)V

    const v0, 0x102000b

    .line 724
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Landroidx/appcompat/app/AlertController;->onRemoveQueueItem:Landroid/widget/TextView;

    if-nez v0, :cond_23

    return-void

    :cond_23
    const/16 v1, 0x8

    .line 732
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 733
    iget-object v0, p0, Landroidx/appcompat/app/AlertController;->onRemoveQueueItemAt:Landroidx/core/widget/NestedScrollView;

    iget-object v2, p0, Landroidx/appcompat/app/AlertController;->onRemoveQueueItem:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 735
    iget-object v0, p0, Landroidx/appcompat/app/AlertController;->MediaDescriptionCompat:Landroid/widget/ListView;

    if-eqz v0, :cond_50

    .line 736
    iget-object p1, p0, Landroidx/appcompat/app/AlertController;->onRemoveQueueItemAt:Landroidx/core/widget/NestedScrollView;

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    check-cast p1, Landroid/view/ViewGroup;

    .line 737
    iget-object v0, p0, Landroidx/appcompat/app/AlertController;->onRemoveQueueItemAt:Landroidx/core/widget/NestedScrollView;

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result v0

    .line 738
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->removeViewAt(I)V

    .line 739
    iget-object p0, p0, Landroidx/appcompat/app/AlertController;->MediaDescriptionCompat:Landroid/widget/ListView;

    new-instance v1, Landroid/view/ViewGroup$LayoutParams;

    const/4 v2, -0x1

    invoke-direct {v1, v2, v2}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {p1, p0, v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    return-void

    .line 742
    :cond_50
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method private RemoteActionCompatParcelizer(Landroid/view/ViewGroup;Landroid/view/View;I)V
    .registers 6

    .line 560
    iget-object v0, p0, Landroidx/appcompat/app/AlertController;->onSkipToPrevious:Landroid/view/Window;

    sget v1, Lo/_init_lambda5$AudioAttributesImplBaseParcelizer;->scrollIndicatorUp:I

    invoke-virtual {v0, v1}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 561
    iget-object p0, p0, Landroidx/appcompat/app/AlertController;->onSkipToPrevious:Landroid/view/Window;

    sget v1, Lo/_init_lambda5$AudioAttributesImplBaseParcelizer;->scrollIndicatorDown:I

    invoke-virtual {p0, v1}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    move-result-object p0

    const/4 v1, 0x3

    .line 565
    invoke-static {p2, p3, v1}, Lo/InvalidTypeIdException;->RemoteActionCompatParcelizer(Landroid/view/View;II)V

    if-eqz v0, :cond_19

    .line 568
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_19
    if-eqz p0, :cond_1e

    .line 571
    invoke-virtual {p1, p0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_1e
    return-void
.end method

.method private static RemoteActionCompatParcelizer(Landroid/widget/Button;)V
    .registers 3

    .line 829
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v1, 0x1

    .line 830
    iput v1, v0, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    const/high16 v1, 0x3f000000    # 0.5f

    .line 831
    iput v1, v0, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    .line 832
    invoke-virtual {p0, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method private static read(Landroid/view/View;Landroid/view/View;)Landroid/view/ViewGroup;
    .registers 4

    if-nez p0, :cond_f

    .line 443
    instance-of p0, p1, Landroid/view/ViewStub;

    if-eqz p0, :cond_c

    .line 444
    check-cast p1, Landroid/view/ViewStub;

    invoke-virtual {p1}, Landroid/view/ViewStub;->inflate()Landroid/view/View;

    move-result-object p1

    .line 447
    :cond_c
    check-cast p1, Landroid/view/ViewGroup;

    return-object p1

    :cond_f
    if-eqz p1, :cond_1e

    .line 452
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    .line 453
    instance-of v1, v0, Landroid/view/ViewGroup;

    if-eqz v1, :cond_1e

    .line 454
    check-cast v0, Landroid/view/ViewGroup;

    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 459
    :cond_1e
    instance-of p1, p0, Landroid/view/ViewStub;

    if-eqz p1, :cond_28

    .line 460
    check-cast p0, Landroid/view/ViewStub;

    invoke-virtual {p0}, Landroid/view/ViewStub;->inflate()Landroid/view/View;

    move-result-object p0

    .line 463
    :cond_28
    check-cast p0, Landroid/view/ViewGroup;

    return-object p0
.end method

.method private read(Landroid/view/ViewGroup;)V
    .registers 9

    const v0, 0x1020019

    .line 763
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Landroidx/appcompat/app/AlertController;->AudioAttributesImplApi21Parcelizer:Landroid/widget/Button;

    .line 764
    iget-object v1, p0, Landroidx/appcompat/app/AlertController;->handleMediaPlayPauseIfPendingOnHandler:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 766
    iget-object v0, p0, Landroidx/appcompat/app/AlertController;->onFastForward:Ljava/lang/CharSequence;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x1

    const/16 v2, 0x8

    const/4 v3, 0x0

    const/4 v4, 0x0

    if-eqz v0, :cond_28

    iget-object v0, p0, Landroidx/appcompat/app/AlertController;->onMediaButtonEvent:Landroid/graphics/drawable/Drawable;

    if-nez v0, :cond_28

    .line 767
    iget-object v0, p0, Landroidx/appcompat/app/AlertController;->AudioAttributesImplApi21Parcelizer:Landroid/widget/Button;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    move v0, v4

    goto :goto_45

    .line 769
    :cond_28
    iget-object v0, p0, Landroidx/appcompat/app/AlertController;->AudioAttributesImplApi21Parcelizer:Landroid/widget/Button;

    iget-object v5, p0, Landroidx/appcompat/app/AlertController;->onFastForward:Ljava/lang/CharSequence;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 770
    iget-object v0, p0, Landroidx/appcompat/app/AlertController;->onMediaButtonEvent:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_3f

    .line 771
    iget v5, p0, Landroidx/appcompat/app/AlertController;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:I

    invoke-virtual {v0, v4, v4, v5, v5}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 772
    iget-object v0, p0, Landroidx/appcompat/app/AlertController;->AudioAttributesImplApi21Parcelizer:Landroid/widget/Button;

    iget-object v5, p0, Landroidx/appcompat/app/AlertController;->onMediaButtonEvent:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, v5, v3, v3, v3}, Landroid/widget/TextView;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 774
    :cond_3f
    iget-object v0, p0, Landroidx/appcompat/app/AlertController;->AudioAttributesImplApi21Parcelizer:Landroid/widget/Button;

    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    move v0, v1

    :goto_45
    const v5, 0x102001a

    .line 778
    invoke-virtual {p1, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/Button;

    iput-object v5, p0, Landroidx/appcompat/app/AlertController;->read:Landroid/widget/Button;

    .line 779
    iget-object v6, p0, Landroidx/appcompat/app/AlertController;->handleMediaPlayPauseIfPendingOnHandler:Landroid/view/View$OnClickListener;

    invoke-virtual {v5, v6}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 781
    iget-object v5, p0, Landroidx/appcompat/app/AlertController;->onAddQueueItem:Ljava/lang/CharSequence;

    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_67

    iget-object v5, p0, Landroidx/appcompat/app/AlertController;->onCustomAction:Landroid/graphics/drawable/Drawable;

    if-nez v5, :cond_67

    .line 782
    iget-object v5, p0, Landroidx/appcompat/app/AlertController;->read:Landroid/widget/Button;

    invoke-virtual {v5, v2}, Landroid/view/View;->setVisibility(I)V

    goto :goto_85

    .line 784
    :cond_67
    iget-object v5, p0, Landroidx/appcompat/app/AlertController;->read:Landroid/widget/Button;

    iget-object v6, p0, Landroidx/appcompat/app/AlertController;->onAddQueueItem:Ljava/lang/CharSequence;

    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 785
    iget-object v5, p0, Landroidx/appcompat/app/AlertController;->onCustomAction:Landroid/graphics/drawable/Drawable;

    if-eqz v5, :cond_7e

    .line 786
    iget v6, p0, Landroidx/appcompat/app/AlertController;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:I

    invoke-virtual {v5, v4, v4, v6, v6}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 787
    iget-object v5, p0, Landroidx/appcompat/app/AlertController;->read:Landroid/widget/Button;

    iget-object v6, p0, Landroidx/appcompat/app/AlertController;->onCustomAction:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v5, v6, v3, v3, v3}, Landroid/widget/TextView;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 789
    :cond_7e
    iget-object v5, p0, Landroidx/appcompat/app/AlertController;->read:Landroid/widget/Button;

    invoke-virtual {v5, v4}, Landroid/view/View;->setVisibility(I)V

    or-int/lit8 v0, v0, 0x2

    :goto_85
    const v5, 0x102001b

    .line 793
    invoke-virtual {p1, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/Button;

    iput-object v5, p0, Landroidx/appcompat/app/AlertController;->AudioAttributesCompatParcelizer:Landroid/widget/Button;

    .line 794
    iget-object v6, p0, Landroidx/appcompat/app/AlertController;->handleMediaPlayPauseIfPendingOnHandler:Landroid/view/View$OnClickListener;

    invoke-virtual {v5, v6}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 796
    iget-object v5, p0, Landroidx/appcompat/app/AlertController;->onPause:Ljava/lang/CharSequence;

    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_a7

    iget-object v5, p0, Landroidx/appcompat/app/AlertController;->onCommand:Landroid/graphics/drawable/Drawable;

    if-nez v5, :cond_a7

    .line 797
    iget-object v3, p0, Landroidx/appcompat/app/AlertController;->AudioAttributesCompatParcelizer:Landroid/widget/Button;

    invoke-virtual {v3, v2}, Landroid/view/View;->setVisibility(I)V

    goto :goto_c5

    .line 799
    :cond_a7
    iget-object v5, p0, Landroidx/appcompat/app/AlertController;->AudioAttributesCompatParcelizer:Landroid/widget/Button;

    iget-object v6, p0, Landroidx/appcompat/app/AlertController;->onPause:Ljava/lang/CharSequence;

    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 800
    iget-object v5, p0, Landroidx/appcompat/app/AlertController;->onCommand:Landroid/graphics/drawable/Drawable;

    if-eqz v5, :cond_be

    .line 801
    iget v6, p0, Landroidx/appcompat/app/AlertController;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:I

    invoke-virtual {v5, v4, v4, v6, v6}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 802
    iget-object v5, p0, Landroidx/appcompat/app/AlertController;->AudioAttributesCompatParcelizer:Landroid/widget/Button;

    iget-object v6, p0, Landroidx/appcompat/app/AlertController;->onCommand:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v5, v6, v3, v3, v3}, Landroid/widget/TextView;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 804
    :cond_be
    iget-object v3, p0, Landroidx/appcompat/app/AlertController;->AudioAttributesCompatParcelizer:Landroid/widget/Button;

    invoke-virtual {v3, v4}, Landroid/view/View;->setVisibility(I)V

    or-int/lit8 v0, v0, 0x4

    .line 808
    :goto_c5
    iget-object v3, p0, Landroidx/appcompat/app/AlertController;->onPrepareFromSearch:Landroid/content/Context;

    invoke-static {v3}, Landroidx/appcompat/app/AlertController;->read(Landroid/content/Context;)Z

    move-result v3

    if-eqz v3, :cond_e6

    if-ne v0, v1, :cond_d5

    .line 814
    iget-object p0, p0, Landroidx/appcompat/app/AlertController;->AudioAttributesImplApi21Parcelizer:Landroid/widget/Button;

    invoke-static {p0}, Landroidx/appcompat/app/AlertController;->RemoteActionCompatParcelizer(Landroid/widget/Button;)V

    goto :goto_e6

    :cond_d5
    const/4 v1, 0x2

    if-ne v0, v1, :cond_de

    .line 816
    iget-object p0, p0, Landroidx/appcompat/app/AlertController;->read:Landroid/widget/Button;

    invoke-static {p0}, Landroidx/appcompat/app/AlertController;->RemoteActionCompatParcelizer(Landroid/widget/Button;)V

    goto :goto_e6

    :cond_de
    const/4 v1, 0x4

    if-ne v0, v1, :cond_e6

    .line 818
    iget-object p0, p0, Landroidx/appcompat/app/AlertController;->AudioAttributesCompatParcelizer:Landroid/widget/Button;

    invoke-static {p0}, Landroidx/appcompat/app/AlertController;->RemoteActionCompatParcelizer(Landroid/widget/Button;)V

    :cond_e6
    :goto_e6
    if-eqz v0, :cond_e9

    return-void

    .line 824
    :cond_e9
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method private static read(Landroid/content/Context;)Z
    .registers 4

    .line 177
    new-instance v0, Landroid/util/TypedValue;

    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    .line 178
    invoke-virtual {p0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object p0

    sget v1, Lo/_init_lambda5$read;->alertDialogCenterButtons:I

    const/4 v2, 0x1

    invoke-virtual {p0, v1, v0, v2}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 179
    iget p0, v0, Landroid/util/TypedValue;->data:I

    if-eqz p0, :cond_14

    return v2

    :cond_14
    const/4 p0, 0x0

    return p0
.end method

.method private static read(Landroid/view/View;)Z
    .registers 5

    .line 209
    invoke-virtual {p0}, Landroid/view/View;->onCheckIsTextEditor()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_8

    return v1

    .line 213
    :cond_8
    instance-of v0, p0, Landroid/view/ViewGroup;

    const/4 v2, 0x0

    if-nez v0, :cond_e

    return v2

    .line 217
    :cond_e
    check-cast p0, Landroid/view/ViewGroup;

    .line 218
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    :cond_14
    if-lez v0, :cond_23

    add-int/lit8 v0, v0, -0x1

    .line 221
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    .line 222
    invoke-static {v3}, Landroidx/appcompat/app/AlertController;->read(Landroid/view/View;)Z

    move-result v3

    if-eqz v3, :cond_14

    return v1

    :cond_23
    return v2
.end method

.method private write()V
    .registers 9

    .line 467
    iget-object v0, p0, Landroidx/appcompat/app/AlertController;->onSkipToPrevious:Landroid/view/Window;

    sget v1, Lo/_init_lambda5$AudioAttributesImplBaseParcelizer;->parentPanel:I

    invoke-virtual {v0, v1}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 468
    sget v1, Lo/_init_lambda5$AudioAttributesImplBaseParcelizer;->topPanel:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    .line 469
    sget v2, Lo/_init_lambda5$AudioAttributesImplBaseParcelizer;->contentPanel:I

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    .line 470
    sget v3, Lo/_init_lambda5$AudioAttributesImplBaseParcelizer;->buttonPanel:I

    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    .line 474
    sget v4, Lo/_init_lambda5$AudioAttributesImplBaseParcelizer;->customPanel:I

    invoke-virtual {v0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    .line 475
    invoke-direct {p0, v0}, Landroidx/appcompat/app/AlertController;->write(Landroid/view/ViewGroup;)V

    .line 477
    sget v4, Lo/_init_lambda5$AudioAttributesImplBaseParcelizer;->topPanel:I

    invoke-virtual {v0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    .line 478
    sget v5, Lo/_init_lambda5$AudioAttributesImplBaseParcelizer;->contentPanel:I

    invoke-virtual {v0, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    .line 479
    sget v6, Lo/_init_lambda5$AudioAttributesImplBaseParcelizer;->buttonPanel:I

    invoke-virtual {v0, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    .line 482
    invoke-static {v4, v1}, Landroidx/appcompat/app/AlertController;->read(Landroid/view/View;Landroid/view/View;)Landroid/view/ViewGroup;

    move-result-object v1

    .line 483
    invoke-static {v5, v2}, Landroidx/appcompat/app/AlertController;->read(Landroid/view/View;Landroid/view/View;)Landroid/view/ViewGroup;

    move-result-object v2

    .line 484
    invoke-static {v6, v3}, Landroidx/appcompat/app/AlertController;->read(Landroid/view/View;Landroid/view/View;)Landroid/view/ViewGroup;

    move-result-object v3

    .line 486
    invoke-direct {p0, v2}, Landroidx/appcompat/app/AlertController;->RemoteActionCompatParcelizer(Landroid/view/ViewGroup;)V

    .line 487
    invoke-direct {p0, v3}, Landroidx/appcompat/app/AlertController;->read(Landroid/view/ViewGroup;)V

    .line 488
    invoke-direct {p0, v1}, Landroidx/appcompat/app/AlertController;->IconCompatParcelizer(Landroid/view/ViewGroup;)V

    const/16 v4, 0x8

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v0, :cond_5a

    .line 491
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-eq v0, v4, :cond_5a

    move v0, v5

    goto :goto_5b

    :cond_5a
    move v0, v6

    :goto_5b
    if-eqz v1, :cond_65

    .line 493
    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    move-result v7

    if-eq v7, v4, :cond_65

    move v7, v5

    goto :goto_66

    :cond_65
    move v7, v6

    :goto_66
    if-eqz v3, :cond_70

    .line 495
    invoke-virtual {v3}, Landroid/view/View;->getVisibility()I

    move-result v3

    if-eq v3, v4, :cond_70

    move v3, v5

    goto :goto_71

    :cond_70
    move v3, v6

    :goto_71
    if-nez v3, :cond_80

    if-eqz v2, :cond_80

    .line 500
    sget v4, Lo/_init_lambda5$AudioAttributesImplBaseParcelizer;->textSpacerNoButtons:I

    invoke-virtual {v2, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    if-eqz v4, :cond_80

    .line 502
    invoke-virtual {v4, v6}, Landroid/view/View;->setVisibility(I)V

    :cond_80
    if-eqz v7, :cond_9b

    .line 509
    iget-object v4, p0, Landroidx/appcompat/app/AlertController;->onRemoveQueueItemAt:Landroidx/core/widget/NestedScrollView;

    if-eqz v4, :cond_89

    .line 510
    invoke-virtual {v4, v5}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    .line 515
    :cond_89
    iget-object v4, p0, Landroidx/appcompat/app/AlertController;->MediaDescriptionCompat:Landroid/widget/ListView;

    if-nez v4, :cond_8f

    const/4 v1, 0x0

    goto :goto_95

    .line 516
    :cond_8f
    sget v4, Lo/_init_lambda5$AudioAttributesImplBaseParcelizer;->titleDividerNoCustom:I

    invoke-virtual {v1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    :goto_95
    if-eqz v1, :cond_a8

    .line 520
    invoke-virtual {v1, v6}, Landroid/view/View;->setVisibility(I)V

    goto :goto_a8

    :cond_9b
    if-eqz v2, :cond_a8

    .line 524
    sget v1, Lo/_init_lambda5$AudioAttributesImplBaseParcelizer;->textSpacerNoTitle:I

    invoke-virtual {v2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    if-eqz v1, :cond_a8

    .line 526
    invoke-virtual {v1, v6}, Landroid/view/View;->setVisibility(I)V

    .line 531
    :cond_a8
    :goto_a8
    iget-object v1, p0, Landroidx/appcompat/app/AlertController;->MediaDescriptionCompat:Landroid/widget/ListView;

    instance-of v4, v1, Landroidx/appcompat/app/AlertController$RecycleListView;

    if-eqz v4, :cond_b3

    .line 532
    check-cast v1, Landroidx/appcompat/app/AlertController$RecycleListView;

    invoke-virtual {v1, v7, v3}, Landroidx/appcompat/app/AlertController$RecycleListView;->setHasDecor(ZZ)V

    :cond_b3
    if-nez v0, :cond_c5

    .line 537
    iget-object v0, p0, Landroidx/appcompat/app/AlertController;->MediaDescriptionCompat:Landroid/widget/ListView;

    if-nez v0, :cond_bb

    iget-object v0, p0, Landroidx/appcompat/app/AlertController;->onRemoveQueueItemAt:Landroidx/core/widget/NestedScrollView;

    :cond_bb
    if-eqz v0, :cond_c5

    if-eqz v3, :cond_c0

    const/4 v6, 0x2

    :cond_c0
    or-int v1, v7, v6

    .line 541
    invoke-direct {p0, v2, v0, v1}, Landroidx/appcompat/app/AlertController;->RemoteActionCompatParcelizer(Landroid/view/ViewGroup;Landroid/view/View;I)V

    .line 546
    :cond_c5
    iget-object v0, p0, Landroidx/appcompat/app/AlertController;->MediaDescriptionCompat:Landroid/widget/ListView;

    if-eqz v0, :cond_da

    .line 547
    iget-object v1, p0, Landroidx/appcompat/app/AlertController;->write:Landroid/widget/ListAdapter;

    if-eqz v1, :cond_da

    .line 548
    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 549
    iget p0, p0, Landroidx/appcompat/app/AlertController;->AudioAttributesImplBaseParcelizer:I

    if-ltz p0, :cond_da

    .line 551
    invoke-virtual {v0, p0, v5}, Landroid/widget/ListView;->setItemChecked(IZ)V

    .line 552
    invoke-virtual {v0, p0}, Landroid/widget/AdapterView;->setSelection(I)V

    :cond_da
    return-void
.end method

.method private write(Landroid/view/ViewGroup;)V
    .registers 6

    .line 640
    iget-object v0, p0, Landroidx/appcompat/app/AlertController;->onSetRating:Landroid/view/View;

    if-nez v0, :cond_5

    const/4 v0, 0x0

    :cond_5
    if-eqz v0, :cond_9

    const/4 v1, 0x1

    goto :goto_a

    :cond_9
    const/4 v1, 0x0

    :goto_a
    if-eqz v1, :cond_12

    .line 650
    invoke-static {v0}, Landroidx/appcompat/app/AlertController;->read(Landroid/view/View;)Z

    move-result v2

    if-nez v2, :cond_19

    .line 651
    :cond_12
    iget-object v2, p0, Landroidx/appcompat/app/AlertController;->onSkipToPrevious:Landroid/view/Window;

    const/high16 v3, 0x20000

    invoke-virtual {v2, v3, v3}, Landroid/view/Window;->setFlags(II)V

    :cond_19
    if-eqz v1, :cond_3c

    .line 656
    iget-object v1, p0, Landroidx/appcompat/app/AlertController;->onSkipToPrevious:Landroid/view/Window;

    sget v2, Lo/_init_lambda5$AudioAttributesImplBaseParcelizer;->custom:I

    invoke-virtual {v1, v2}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/FrameLayout;

    .line 657
    new-instance v2, Landroid/view/ViewGroup$LayoutParams;

    const/4 v3, -0x1

    invoke-direct {v2, v3, v3}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v1, v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 664
    iget-object p0, p0, Landroidx/appcompat/app/AlertController;->MediaDescriptionCompat:Landroid/widget/ListView;

    if-eqz p0, :cond_3b

    .line 665
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p0

    check-cast p0, Landroidx/appcompat/widget/LinearLayoutCompat$LayoutParams;

    const/4 p1, 0x0

    iput p1, p0, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    :cond_3b
    return-void

    :cond_3c
    const/16 p0, 0x8

    .line 668
    invoke-virtual {p1, p0}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method


# virtual methods
.method public final IconCompatParcelizer()Landroid/widget/ListView;
    .registers 1

    .line 404
    iget-object p0, p0, Landroidx/appcompat/app/AlertController;->MediaDescriptionCompat:Landroid/widget/ListView;

    return-object p0
.end method

.method public final IconCompatParcelizer(ILjava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;Landroid/graphics/drawable/Drawable;)V
    .registers 6

    if-eqz p3, :cond_9

    .line 324
    iget-object v0, p0, Landroidx/appcompat/app/AlertController;->AudioAttributesImplApi26Parcelizer:Landroid/os/Handler;

    invoke-virtual {v0, p1, p3}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p3

    goto :goto_a

    :cond_9
    const/4 p3, 0x0

    :goto_a
    const/4 v0, -0x3

    if-eq p1, v0, :cond_29

    const/4 v0, -0x2

    if-eq p1, v0, :cond_22

    const/4 v0, -0x1

    if-ne p1, v0, :cond_1a

    .line 330
    iput-object p2, p0, Landroidx/appcompat/app/AlertController;->onFastForward:Ljava/lang/CharSequence;

    .line 331
    iput-object p3, p0, Landroidx/appcompat/app/AlertController;->MediaBrowserCompatCustomActionResultReceiver:Landroid/os/Message;

    .line 332
    iput-object p4, p0, Landroidx/appcompat/app/AlertController;->onMediaButtonEvent:Landroid/graphics/drawable/Drawable;

    return-void

    .line 348
    :cond_1a
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Button does not exist"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 336
    :cond_22
    iput-object p2, p0, Landroidx/appcompat/app/AlertController;->onAddQueueItem:Ljava/lang/CharSequence;

    .line 337
    iput-object p3, p0, Landroidx/appcompat/app/AlertController;->IconCompatParcelizer:Landroid/os/Message;

    .line 338
    iput-object p4, p0, Landroidx/appcompat/app/AlertController;->onCustomAction:Landroid/graphics/drawable/Drawable;

    return-void

    .line 342
    :cond_29
    iput-object p2, p0, Landroidx/appcompat/app/AlertController;->onPause:Ljava/lang/CharSequence;

    .line 343
    iput-object p3, p0, Landroidx/appcompat/app/AlertController;->RemoteActionCompatParcelizer:Landroid/os/Message;

    .line 344
    iput-object p4, p0, Landroidx/appcompat/app/AlertController;->onCommand:Landroid/graphics/drawable/Drawable;

    return-void
.end method

.method public final IconCompatParcelizer(Landroid/view/KeyEvent;)Z
    .registers 2

    .line 427
    iget-object p0, p0, Landroidx/appcompat/app/AlertController;->onRemoveQueueItemAt:Landroidx/core/widget/NestedScrollView;

    if-eqz p0, :cond_c

    invoke-virtual {p0, p1}, Landroidx/core/widget/NestedScrollView;->write(Landroid/view/KeyEvent;)Z

    move-result p0

    if-eqz p0, :cond_c

    const/4 p0, 0x1

    return p0

    :cond_c
    const/4 p0, 0x0

    return p0
.end method

.method public final RemoteActionCompatParcelizer(Landroid/view/View;)V
    .registers 2

    .line 280
    iput-object p1, p0, Landroidx/appcompat/app/AlertController;->onSetRating:Landroid/view/View;

    const/4 p1, 0x0

    .line 281
    iput p1, p0, Landroidx/appcompat/app/AlertController;->onSetRepeatMode:I

    .line 282
    iput-boolean p1, p0, Landroidx/appcompat/app/AlertController;->onSetPlaybackSpeed:Z

    return-void
.end method

.method public final read()V
    .registers 3

    .line 231
    invoke-direct {p0}, Landroidx/appcompat/app/AlertController;->RemoteActionCompatParcelizer()I

    move-result v0

    .line 232
    iget-object v1, p0, Landroidx/appcompat/app/AlertController;->MediaBrowserCompatItemReceiver:Lo/menuHostHelperlambda0;

    invoke-virtual {v1, v0}, Landroid/app/Dialog;->setContentView(I)V

    .line 233
    invoke-direct {p0}, Landroidx/appcompat/app/AlertController;->write()V

    return-void
.end method

.method public final read(Ljava/lang/CharSequence;)V
    .registers 2

    .line 247
    iput-object p1, p0, Landroidx/appcompat/app/AlertController;->onSetShuffleMode:Ljava/lang/CharSequence;

    .line 248
    iget-object p0, p0, Landroidx/appcompat/app/AlertController;->onSetCaptioningEnabled:Landroid/widget/TextView;

    if-eqz p0, :cond_9

    .line 249
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_9
    return-void
.end method

.method public final write(Landroid/graphics/drawable/Drawable;)V
    .registers 4

    .line 378
    iput-object p1, p0, Landroidx/appcompat/app/AlertController;->onPrepareFromMediaId:Landroid/graphics/drawable/Drawable;

    const/4 v0, 0x0

    .line 379
    iput v0, p0, Landroidx/appcompat/app/AlertController;->onPrepare:I

    .line 381
    iget-object v1, p0, Landroidx/appcompat/app/AlertController;->onPlayFromSearch:Landroid/widget/ImageView;

    if-eqz v1, :cond_19

    if-eqz p1, :cond_14

    .line 383
    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 384
    iget-object p0, p0, Landroidx/appcompat/app/AlertController;->onPlayFromSearch:Landroid/widget/ImageView;

    invoke-virtual {p0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void

    :cond_14
    const/16 p0, 0x8

    .line 386
    invoke-virtual {v1, p0}, Landroid/widget/ImageView;->setVisibility(I)V

    :cond_19
    return-void
.end method

.method public final write(Landroid/view/View;)V
    .registers 2

    .line 257
    iput-object p1, p0, Landroidx/appcompat/app/AlertController;->onPlayFromUri:Landroid/view/View;

    return-void
.end method

.method public final write(Landroid/view/KeyEvent;)Z
    .registers 2

    .line 422
    iget-object p0, p0, Landroidx/appcompat/app/AlertController;->onRemoveQueueItemAt:Landroidx/core/widget/NestedScrollView;

    if-eqz p0, :cond_c

    invoke-virtual {p0, p1}, Landroidx/core/widget/NestedScrollView;->write(Landroid/view/KeyEvent;)Z

    move-result p0

    if-eqz p0, :cond_c

    const/4 p0, 0x1

    return p0

    :cond_c
    const/4 p0, 0x0

    return p0
.end method

###### Class androidx.appcompat.app.AlertController.AnonymousClass5 (androidx.appcompat.app.AlertController$5)
.class final Landroidx/appcompat/app/AlertController$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/app/AlertController;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic IconCompatParcelizer:Landroidx/appcompat/app/AlertController;


# direct methods
.method constructor <init>(Landroidx/appcompat/app/AlertController;)V
    .registers 2

    .line 126
    iput-object p1, p0, Landroidx/appcompat/app/AlertController$5;->IconCompatParcelizer:Landroidx/appcompat/app/AlertController;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .registers 3

    .line 130
    iget-object v0, p0, Landroidx/appcompat/app/AlertController$5;->IconCompatParcelizer:Landroidx/appcompat/app/AlertController;

    iget-object v0, v0, Landroidx/appcompat/app/AlertController;->AudioAttributesImplApi21Parcelizer:Landroid/widget/Button;

    if-ne p1, v0, :cond_15

    iget-object v0, p0, Landroidx/appcompat/app/AlertController$5;->IconCompatParcelizer:Landroidx/appcompat/app/AlertController;

    iget-object v0, v0, Landroidx/appcompat/app/AlertController;->MediaBrowserCompatCustomActionResultReceiver:Landroid/os/Message;

    if-eqz v0, :cond_15

    .line 131
    iget-object p1, p0, Landroidx/appcompat/app/AlertController$5;->IconCompatParcelizer:Landroidx/appcompat/app/AlertController;

    iget-object p1, p1, Landroidx/appcompat/app/AlertController;->MediaBrowserCompatCustomActionResultReceiver:Landroid/os/Message;

    invoke-static {p1}, Landroid/os/Message;->obtain(Landroid/os/Message;)Landroid/os/Message;

    move-result-object p1

    goto :goto_40

    .line 132
    :cond_15
    iget-object v0, p0, Landroidx/appcompat/app/AlertController$5;->IconCompatParcelizer:Landroidx/appcompat/app/AlertController;

    iget-object v0, v0, Landroidx/appcompat/app/AlertController;->read:Landroid/widget/Button;

    if-ne p1, v0, :cond_2a

    iget-object v0, p0, Landroidx/appcompat/app/AlertController$5;->IconCompatParcelizer:Landroidx/appcompat/app/AlertController;

    iget-object v0, v0, Landroidx/appcompat/app/AlertController;->IconCompatParcelizer:Landroid/os/Message;

    if-eqz v0, :cond_2a

    .line 133
    iget-object p1, p0, Landroidx/appcompat/app/AlertController$5;->IconCompatParcelizer:Landroidx/appcompat/app/AlertController;

    iget-object p1, p1, Landroidx/appcompat/app/AlertController;->IconCompatParcelizer:Landroid/os/Message;

    invoke-static {p1}, Landroid/os/Message;->obtain(Landroid/os/Message;)Landroid/os/Message;

    move-result-object p1

    goto :goto_40

    .line 134
    :cond_2a
    iget-object v0, p0, Landroidx/appcompat/app/AlertController$5;->IconCompatParcelizer:Landroidx/appcompat/app/AlertController;

    iget-object v0, v0, Landroidx/appcompat/app/AlertController;->AudioAttributesCompatParcelizer:Landroid/widget/Button;

    if-ne p1, v0, :cond_3f

    iget-object p1, p0, Landroidx/appcompat/app/AlertController$5;->IconCompatParcelizer:Landroidx/appcompat/app/AlertController;

    iget-object p1, p1, Landroidx/appcompat/app/AlertController;->RemoteActionCompatParcelizer:Landroid/os/Message;

    if-eqz p1, :cond_3f

    .line 135
    iget-object p1, p0, Landroidx/appcompat/app/AlertController$5;->IconCompatParcelizer:Landroidx/appcompat/app/AlertController;

    iget-object p1, p1, Landroidx/appcompat/app/AlertController;->RemoteActionCompatParcelizer:Landroid/os/Message;

    invoke-static {p1}, Landroid/os/Message;->obtain(Landroid/os/Message;)Landroid/os/Message;

    move-result-object p1

    goto :goto_40

    :cond_3f
    const/4 p1, 0x0

    :goto_40
    if-eqz p1, :cond_45

    .line 141
    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    .line 145
    :cond_45
    iget-object p1, p0, Landroidx/appcompat/app/AlertController$5;->IconCompatParcelizer:Landroidx/appcompat/app/AlertController;

    iget-object p1, p1, Landroidx/appcompat/app/AlertController;->AudioAttributesImplApi26Parcelizer:Landroid/os/Handler;

    iget-object p0, p0, Landroidx/appcompat/app/AlertController$5;->IconCompatParcelizer:Landroidx/appcompat/app/AlertController;

    iget-object p0, p0, Landroidx/appcompat/app/AlertController;->MediaBrowserCompatItemReceiver:Lo/menuHostHelperlambda0;

    const/4 v0, 0x1

    invoke-virtual {p1, v0, p0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p0

    .line 146
    invoke-virtual {p0}, Landroid/os/Message;->sendToTarget()V

    return-void
.end method

###### Class androidx.appcompat.app.AlertController.AudioAttributesCompatParcelizer (androidx.appcompat.app.AlertController$AudioAttributesCompatParcelizer)
.class final Landroidx/appcompat/app/AlertController$AudioAttributesCompatParcelizer;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/app/AlertController;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "AudioAttributesCompatParcelizer"
.end annotation


# instance fields
.field private IconCompatParcelizer:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/content/DialogInterface;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/DialogInterface;)V
    .registers 3

    .line 156
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 157
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Landroidx/appcompat/app/AlertController$AudioAttributesCompatParcelizer;->IconCompatParcelizer:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .registers 4

    .line 162
    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, -0x3

    if-eq v0, v1, :cond_17

    const/4 v1, -0x2

    if-eq v0, v1, :cond_17

    const/4 v1, -0x1

    if-eq v0, v1, :cond_17

    const/4 p0, 0x1

    if-eq v0, p0, :cond_f

    return-void

    .line 171
    :cond_f
    iget-object p0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p0, Landroid/content/DialogInterface;

    invoke-interface {p0}, Landroid/content/DialogInterface;->dismiss()V

    return-void

    .line 167
    :cond_17
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Landroid/content/DialogInterface$OnClickListener;

    iget-object p0, p0, Landroidx/appcompat/app/AlertController$AudioAttributesCompatParcelizer;->IconCompatParcelizer:Ljava/lang/ref/WeakReference;

    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/content/DialogInterface;

    iget p1, p1, Landroid/os/Message;->what:I

    invoke-interface {v0, p0, p1}, Landroid/content/DialogInterface$OnClickListener;->onClick(Landroid/content/DialogInterface;I)V

    return-void
.end method

###### Class androidx.appcompat.app.AlertController.IconCompatParcelizer (androidx.appcompat.app.AlertController$IconCompatParcelizer)
.class public final Landroidx/appcompat/app/AlertController$IconCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/app/AlertController;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "IconCompatParcelizer"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/appcompat/app/AlertController$IconCompatParcelizer$AudioAttributesCompatParcelizer;
    }
.end annotation


# instance fields
.field public AudioAttributesCompatParcelizer:Landroid/view/View;

.field public AudioAttributesImplApi21Parcelizer:Ljava/lang/CharSequence;

.field public AudioAttributesImplApi26Parcelizer:Landroid/content/DialogInterface$OnClickListener;

.field public final AudioAttributesImplBaseParcelizer:Landroid/view/LayoutInflater;

.field public IconCompatParcelizer:Landroid/widget/ListAdapter;

.field public MediaBrowserCompatCustomActionResultReceiver:Z

.field public MediaBrowserCompatItemReceiver:Landroid/graphics/drawable/Drawable;

.field public MediaBrowserCompatMediaItem:Landroid/content/DialogInterface$OnDismissListener;

.field public MediaBrowserCompatSearchResultReceiver:Landroid/content/DialogInterface$OnClickListener;

.field public MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Landroid/view/View;

.field public MediaDescriptionCompat:Landroid/content/DialogInterface$OnCancelListener;

.field public MediaMetadataCompat:Landroid/content/DialogInterface$OnClickListener;

.field public RatingCompat:Landroid/content/DialogInterface$OnKeyListener;

.field public RemoteActionCompatParcelizer:I

.field public handleMediaPlayPauseIfPendingOnHandler:Ljava/lang/CharSequence;

.field public onAddQueueItem:I

.field public onCommand:Ljava/lang/CharSequence;

.field public onCustomAction:Z

.field private onFastForward:I

.field private onMediaButtonEvent:Landroid/database/Cursor;

.field private onPause:[Ljava/lang/CharSequence;

.field private onPlay:I

.field private onPlayFromMediaId:Z

.field private onPlayFromSearch:Ljava/lang/CharSequence;

.field private onPlayFromUri:Landroid/graphics/drawable/Drawable;

.field private onPrepare:Landroid/content/DialogInterface$OnMultiChoiceClickListener;

.field private onPrepareFromMediaId:Landroid/graphics/drawable/Drawable;

.field private onPrepareFromSearch:Ljava/lang/CharSequence;

.field private onPrepareFromUri:Z

.field private onRemoveQueueItem:Landroid/widget/AdapterView$OnItemSelectedListener;

.field private onRewind:Landroidx/appcompat/app/AlertController$IconCompatParcelizer$AudioAttributesCompatParcelizer;

.field private onSeekTo:Landroid/graphics/drawable/Drawable;

.field public final read:Landroid/content/Context;

.field public write:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 3

    .line 924
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 869
    iput v0, p0, Landroidx/appcompat/app/AlertController$IconCompatParcelizer;->onPlay:I

    .line 871
    iput v0, p0, Landroidx/appcompat/app/AlertController$IconCompatParcelizer;->onFastForward:I

    .line 897
    iput-boolean v0, p0, Landroidx/appcompat/app/AlertController$IconCompatParcelizer;->onCustomAction:Z

    const/4 v0, -0x1

    .line 901
    iput v0, p0, Landroidx/appcompat/app/AlertController$IconCompatParcelizer;->RemoteActionCompatParcelizer:I

    const/4 v0, 0x1

    .line 909
    iput-boolean v0, p0, Landroidx/appcompat/app/AlertController$IconCompatParcelizer;->onPrepareFromUri:Z

    .line 925
    iput-object p1, p0, Landroidx/appcompat/app/AlertController$IconCompatParcelizer;->read:Landroid/content/Context;

    .line 926
    iput-boolean v0, p0, Landroidx/appcompat/app/AlertController$IconCompatParcelizer;->write:Z

    .line 927
    const-string v0, "layout_inflater"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/LayoutInflater;

    iput-object p1, p0, Landroidx/appcompat/app/AlertController$IconCompatParcelizer;->AudioAttributesImplBaseParcelizer:Landroid/view/LayoutInflater;

    return-void
.end method

.method private AudioAttributesCompatParcelizer(Landroidx/appcompat/app/AlertController;)V
    .registers 7

    .line 988
    iget-object v0, p0, Landroidx/appcompat/app/AlertController$IconCompatParcelizer;->AudioAttributesImplBaseParcelizer:Landroid/view/LayoutInflater;

    iget v1, p1, Landroidx/appcompat/app/AlertController;->MediaMetadataCompat:I

    const/4 v2, 0x0

    .line 989
    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/appcompat/app/AlertController$RecycleListView;

    .line 1038
    iget-boolean v1, p0, Landroidx/appcompat/app/AlertController$IconCompatParcelizer;->MediaBrowserCompatCustomActionResultReceiver:Z

    if-eqz v1, :cond_12

    .line 1039
    iget v1, p1, Landroidx/appcompat/app/AlertController;->MediaBrowserCompatSearchResultReceiver:I

    goto :goto_14

    .line 1041
    :cond_12
    iget v1, p1, Landroidx/appcompat/app/AlertController;->RatingCompat:I

    .line 1047
    :goto_14
    iget-object v2, p0, Landroidx/appcompat/app/AlertController$IconCompatParcelizer;->IconCompatParcelizer:Landroid/widget/ListAdapter;

    if-nez v2, :cond_21

    .line 1050
    new-instance v2, Landroidx/appcompat/app/AlertController$RemoteActionCompatParcelizer;

    iget-object v3, p0, Landroidx/appcompat/app/AlertController$IconCompatParcelizer;->read:Landroid/content/Context;

    iget-object v4, p0, Landroidx/appcompat/app/AlertController$IconCompatParcelizer;->onPause:[Ljava/lang/CharSequence;

    invoke-direct {v2, v3, v1, v4}, Landroidx/appcompat/app/AlertController$RemoteActionCompatParcelizer;-><init>(Landroid/content/Context;I[Ljava/lang/CharSequence;)V

    .line 1061
    :cond_21
    iput-object v2, p1, Landroidx/appcompat/app/AlertController;->write:Landroid/widget/ListAdapter;

    .line 1062
    iget v1, p0, Landroidx/appcompat/app/AlertController$IconCompatParcelizer;->RemoteActionCompatParcelizer:I

    iput v1, p1, Landroidx/appcompat/app/AlertController;->AudioAttributesImplBaseParcelizer:I

    .line 1064
    iget-object v1, p0, Landroidx/appcompat/app/AlertController$IconCompatParcelizer;->MediaMetadataCompat:Landroid/content/DialogInterface$OnClickListener;

    if-eqz v1, :cond_33

    .line 1065
    new-instance v1, Landroidx/appcompat/app/AlertController$IconCompatParcelizer$3;

    invoke-direct {v1, p0, p1}, Landroidx/appcompat/app/AlertController$IconCompatParcelizer$3;-><init>(Landroidx/appcompat/app/AlertController$IconCompatParcelizer;Landroidx/appcompat/app/AlertController;)V

    invoke-virtual {v0, v1}, Landroid/widget/AdapterView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 1092
    :cond_33
    iget-boolean p0, p0, Landroidx/appcompat/app/AlertController$IconCompatParcelizer;->MediaBrowserCompatCustomActionResultReceiver:Z

    if-eqz p0, :cond_3b

    const/4 p0, 0x1

    .line 1093
    invoke-virtual {v0, p0}, Landroidx/appcompat/app/AlertController$RecycleListView;->setChoiceMode(I)V

    .line 1097
    :cond_3b
    iput-object v0, p1, Landroidx/appcompat/app/AlertController;->MediaDescriptionCompat:Landroid/widget/ListView;

    return-void
.end method


# virtual methods
.method public final IconCompatParcelizer(Landroidx/appcompat/app/AlertController;)V
    .registers 6

    .line 931
    iget-object v0, p0, Landroidx/appcompat/app/AlertController$IconCompatParcelizer;->AudioAttributesCompatParcelizer:Landroid/view/View;

    if-eqz v0, :cond_8

    .line 932
    invoke-virtual {p1, v0}, Landroidx/appcompat/app/AlertController;->write(Landroid/view/View;)V

    goto :goto_16

    .line 934
    :cond_8
    iget-object v0, p0, Landroidx/appcompat/app/AlertController$IconCompatParcelizer;->onCommand:Ljava/lang/CharSequence;

    if-eqz v0, :cond_f

    .line 935
    invoke-virtual {p1, v0}, Landroidx/appcompat/app/AlertController;->read(Ljava/lang/CharSequence;)V

    .line 937
    :cond_f
    iget-object v0, p0, Landroidx/appcompat/app/AlertController$IconCompatParcelizer;->MediaBrowserCompatItemReceiver:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_16

    .line 938
    invoke-virtual {p1, v0}, Landroidx/appcompat/app/AlertController;->write(Landroid/graphics/drawable/Drawable;)V

    .line 950
    :cond_16
    :goto_16
    iget-object v0, p0, Landroidx/appcompat/app/AlertController$IconCompatParcelizer;->handleMediaPlayPauseIfPendingOnHandler:Ljava/lang/CharSequence;

    if-nez v0, :cond_1b

    goto :goto_23

    .line 951
    :cond_1b
    iget-object v1, p0, Landroidx/appcompat/app/AlertController$IconCompatParcelizer;->MediaBrowserCompatSearchResultReceiver:Landroid/content/DialogInterface$OnClickListener;

    iget-object v2, p0, Landroidx/appcompat/app/AlertController$IconCompatParcelizer;->onSeekTo:Landroid/graphics/drawable/Drawable;

    const/4 v3, -0x1

    invoke-virtual {p1, v3, v0, v1, v2}, Landroidx/appcompat/app/AlertController;->IconCompatParcelizer(ILjava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;Landroid/graphics/drawable/Drawable;)V

    .line 954
    :goto_23
    iget-object v0, p0, Landroidx/appcompat/app/AlertController$IconCompatParcelizer;->AudioAttributesImplApi21Parcelizer:Ljava/lang/CharSequence;

    if-nez v0, :cond_28

    goto :goto_30

    .line 955
    :cond_28
    iget-object v1, p0, Landroidx/appcompat/app/AlertController$IconCompatParcelizer;->AudioAttributesImplApi26Parcelizer:Landroid/content/DialogInterface$OnClickListener;

    iget-object v2, p0, Landroidx/appcompat/app/AlertController$IconCompatParcelizer;->onPlayFromUri:Landroid/graphics/drawable/Drawable;

    const/4 v3, -0x2

    invoke-virtual {p1, v3, v0, v1, v2}, Landroidx/appcompat/app/AlertController;->IconCompatParcelizer(ILjava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;Landroid/graphics/drawable/Drawable;)V

    .line 964
    :goto_30
    iget-object v0, p0, Landroidx/appcompat/app/AlertController$IconCompatParcelizer;->IconCompatParcelizer:Landroid/widget/ListAdapter;

    if-eqz v0, :cond_37

    .line 965
    invoke-direct {p0, p1}, Landroidx/appcompat/app/AlertController$IconCompatParcelizer;->AudioAttributesCompatParcelizer(Landroidx/appcompat/app/AlertController;)V

    .line 967
    :cond_37
    iget-object p0, p0, Landroidx/appcompat/app/AlertController$IconCompatParcelizer;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Landroid/view/View;

    if-eqz p0, :cond_3e

    .line 972
    invoke-virtual {p1, p0}, Landroidx/appcompat/app/AlertController;->RemoteActionCompatParcelizer(Landroid/view/View;)V

    :cond_3e
    return-void
.end method

###### Class androidx.appcompat.app.AlertController.IconCompatParcelizer.AnonymousClass3 (androidx.appcompat.app.AlertController$IconCompatParcelizer$3)
.class final Landroidx/appcompat/app/AlertController$IconCompatParcelizer$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/appcompat/app/AlertController$IconCompatParcelizer;->AudioAttributesCompatParcelizer(Landroidx/appcompat/app/AlertController;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic AudioAttributesCompatParcelizer:Landroidx/appcompat/app/AlertController;

.field final synthetic read:Landroidx/appcompat/app/AlertController$IconCompatParcelizer;


# direct methods
.method constructor <init>(Landroidx/appcompat/app/AlertController$IconCompatParcelizer;Landroidx/appcompat/app/AlertController;)V
    .registers 3

    .line 1065
    iput-object p1, p0, Landroidx/appcompat/app/AlertController$IconCompatParcelizer$3;->read:Landroidx/appcompat/app/AlertController$IconCompatParcelizer;

    iput-object p2, p0, Landroidx/appcompat/app/AlertController$IconCompatParcelizer$3;->AudioAttributesCompatParcelizer:Landroidx/appcompat/app/AlertController;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView<",
            "*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    .line 1068
    iget-object p1, p0, Landroidx/appcompat/app/AlertController$IconCompatParcelizer$3;->read:Landroidx/appcompat/app/AlertController$IconCompatParcelizer;

    iget-object p1, p1, Landroidx/appcompat/app/AlertController$IconCompatParcelizer;->MediaMetadataCompat:Landroid/content/DialogInterface$OnClickListener;

    iget-object p2, p0, Landroidx/appcompat/app/AlertController$IconCompatParcelizer$3;->AudioAttributesCompatParcelizer:Landroidx/appcompat/app/AlertController;

    iget-object p2, p2, Landroidx/appcompat/app/AlertController;->MediaBrowserCompatItemReceiver:Lo/menuHostHelperlambda0;

    invoke-interface {p1, p2, p3}, Landroid/content/DialogInterface$OnClickListener;->onClick(Landroid/content/DialogInterface;I)V

    .line 1069
    iget-object p1, p0, Landroidx/appcompat/app/AlertController$IconCompatParcelizer$3;->read:Landroidx/appcompat/app/AlertController$IconCompatParcelizer;

    iget-boolean p1, p1, Landroidx/appcompat/app/AlertController$IconCompatParcelizer;->MediaBrowserCompatCustomActionResultReceiver:Z

    if-nez p1, :cond_18

    .line 1070
    iget-object p0, p0, Landroidx/appcompat/app/AlertController$IconCompatParcelizer$3;->AudioAttributesCompatParcelizer:Landroidx/appcompat/app/AlertController;

    iget-object p0, p0, Landroidx/appcompat/app/AlertController;->MediaBrowserCompatItemReceiver:Lo/menuHostHelperlambda0;

    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    :cond_18
    return-void
.end method

###### Class androidx.appcompat.app.AlertController.IconCompatParcelizer.AudioAttributesCompatParcelizer (androidx.appcompat.app.AlertController$IconCompatParcelizer$AudioAttributesCompatParcelizer)
.class public interface abstract Landroidx/appcompat/app/AlertController$IconCompatParcelizer$AudioAttributesCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/app/AlertController$IconCompatParcelizer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "AudioAttributesCompatParcelizer"
.end annotation

###### Class androidx.appcompat.app.AlertController.RecycleListView (androidx.appcompat.app.AlertController$RecycleListView)
.class public Landroidx/appcompat/app/AlertController$RecycleListView;
.super Landroid/widget/ListView;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/app/AlertController;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "RecycleListView"
.end annotation


# instance fields
.field private final IconCompatParcelizer:I

.field private final write:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 3

    const/4 v0, 0x0

    .line 840
    invoke-direct {p0, p1, v0}, Landroidx/appcompat/app/AlertController$RecycleListView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 4

    .line 844
    invoke-direct {p0, p1, p2}, Landroid/widget/ListView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 846
    sget-object v0, Lo/_init_lambda5$AudioAttributesImplApi26Parcelizer;->RecycleListView:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 848
    sget p2, Lo/_init_lambda5$AudioAttributesImplApi26Parcelizer;->RecycleListView_paddingBottomNoButtons:I

    const/4 v0, -0x1

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result p2

    iput p2, p0, Landroidx/appcompat/app/AlertController$RecycleListView;->write:I

    .line 850
    sget p2, Lo/_init_lambda5$AudioAttributesImplApi26Parcelizer;->RecycleListView_paddingTopNoTitle:I

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result p1

    iput p1, p0, Landroidx/appcompat/app/AlertController$RecycleListView;->IconCompatParcelizer:I

    return-void
.end method


# virtual methods
.method public setHasDecor(ZZ)V
    .registers 5

    if-eqz p2, :cond_5

    if-eqz p1, :cond_5

    return-void

    .line 856
    :cond_5
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v0

    if-eqz p1, :cond_10

    .line 857
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result p1

    goto :goto_12

    :cond_10
    iget p1, p0, Landroidx/appcompat/app/AlertController$RecycleListView;->IconCompatParcelizer:I

    .line 858
    :goto_12
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v1

    if-eqz p2, :cond_1d

    .line 859
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result p2

    goto :goto_1f

    :cond_1d
    iget p2, p0, Landroidx/appcompat/app/AlertController$RecycleListView;->write:I

    .line 860
    :goto_1f
    invoke-virtual {p0, v0, p1, v1, p2}, Landroid/view/View;->setPadding(IIII)V

    return-void
.end method

###### Class androidx.appcompat.app.AlertController.RemoteActionCompatParcelizer (androidx.appcompat.app.AlertController$RemoteActionCompatParcelizer)
.class final Landroidx/appcompat/app/AlertController$RemoteActionCompatParcelizer;
.super Landroid/widget/ArrayAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/app/AlertController;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "RemoteActionCompatParcelizer"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/widget/ArrayAdapter<",
        "Ljava/lang/CharSequence;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Landroid/content/Context;I[Ljava/lang/CharSequence;)V
    .registers 5

    const v0, 0x1020014

    .line 1104
    invoke-direct {p0, p1, p2, v0, p3}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;II[Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final getItemId(I)J
    .registers 2

    int-to-long p0, p1

    return-wide p0
.end method

.method public final hasStableIds()Z
    .registers 1

    const/4 p0, 0x1

    return p0
.end method
