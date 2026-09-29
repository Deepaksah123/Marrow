###### Class androidx.appcompat.widget.Toolbar (androidx.appcompat.widget.Toolbar)
.class public Landroidx/appcompat/widget/Toolbar;
.super Landroid/view/ViewGroup;
.source "SourceFile"

# interfaces
.implements Lo/UntypedObjectDeserializerNR;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/appcompat/widget/Toolbar$AudioAttributesCompatParcelizer;,
        Landroidx/appcompat/widget/Toolbar$write;,
        Landroidx/appcompat/widget/Toolbar$LayoutParams;,
        Landroidx/appcompat/widget/Toolbar$IconCompatParcelizer;,
        Landroidx/appcompat/widget/Toolbar$SavedState;
    }
.end annotation


# instance fields
.field AudioAttributesCompatParcelizer:Landroid/view/View;

.field private AudioAttributesImplApi21Parcelizer:Lo/peekAvailableContext$AudioAttributesCompatParcelizer;

.field private AudioAttributesImplApi26Parcelizer:Landroid/window/OnBackInvokedCallback;

.field private AudioAttributesImplBaseParcelizer:Z

.field IconCompatParcelizer:I

.field MediaBrowserCompatCustomActionResultReceiver:Landroidx/appcompat/widget/ActionMenuView;

.field MediaBrowserCompatItemReceiver:Landroidx/appcompat/widget/Toolbar$IconCompatParcelizer;

.field private MediaBrowserCompatMediaItem:Landroid/window/OnBackInvokedDispatcher;

.field private MediaBrowserCompatSearchResultReceiver:Landroid/graphics/drawable/Drawable;

.field private MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Z

.field private MediaDescriptionCompat:I

.field private MediaMetadataCompat:Ljava/lang/CharSequence;

.field private MediaSessionCompatToken:Lo/setIcon;

.field private RatingCompat:Z

.field RemoteActionCompatParcelizer:Lo/onRequestPermissionsResult$RemoteActionCompatParcelizer;

.field private handleMediaPlayPauseIfPendingOnHandler:I

.field private onAddQueueItem:Landroidx/appcompat/widget/Toolbar$write;

.field private onCommand:Lo/setNegativeButton;

.field private onCustomAction:Z

.field private onFastForward:I

.field private final onMediaButtonEvent:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field private onPause:I

.field private final onPlay:Landroidx/appcompat/widget/ActionMenuView$RemoteActionCompatParcelizer;

.field private onPlayFromMediaId:Landroid/widget/ImageView;

.field private onPlayFromSearch:Landroid/widget/ImageButton;

.field private onPlayFromUri:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroid/view/MenuItem;",
            ">;"
        }
    .end annotation
.end field

.field private onPrepare:Landroid/content/Context;

.field private onPrepareFromMediaId:I

.field private onPrepareFromSearch:Landroidx/appcompat/widget/ActionMenuPresenter;

.field private onPrepareFromUri:I

.field private final onRemoveQueueItem:Ljava/lang/Runnable;

.field private onRemoveQueueItemAt:Landroid/content/res/ColorStateList;

.field private onRewind:Landroid/widget/TextView;

.field private onSeekTo:Ljava/lang/CharSequence;

.field private final onSetCaptioningEnabled:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field private onSetPlaybackSpeed:I

.field private onSetRating:I

.field private final onSetRepeatMode:[I

.field private onSetShuffleMode:I

.field private onSkipToNext:I

.field private onSkipToPrevious:Landroid/widget/TextView;

.field private onSkipToQueueItem:I

.field private onStop:Landroid/content/res/ColorStateList;

.field final read:Lo/mapObject;

.field private setSessionImpl:Ljava/lang/CharSequence;

.field write:Landroid/widget/ImageButton;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 3

    const/4 v0, 0x0

    .line 258
    invoke-direct {p0, p1, v0}, Landroidx/appcompat/widget/Toolbar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 4

    .line 262
    sget v0, Lo/_init_lambda5$read;->toolbarStyle:I

    invoke-direct {p0, p1, p2, v0}, Landroidx/appcompat/widget/Toolbar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 14

    .line 266
    invoke-direct {p0, p1, p2, p3}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const v0, 0x800013

    .line 194
    iput v0, p0, Landroidx/appcompat/widget/Toolbar;->onPause:I

    .line 206
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/appcompat/widget/Toolbar;->onSetCaptioningEnabled:Ljava/util/ArrayList;

    .line 209
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/appcompat/widget/Toolbar;->onMediaButtonEvent:Ljava/util/ArrayList;

    const/4 v0, 0x2

    .line 211
    new-array v0, v0, [I

    iput-object v0, p0, Landroidx/appcompat/widget/Toolbar;->onSetRepeatMode:[I

    .line 213
    new-instance v0, Lo/mapObject;

    new-instance v1, Lo/setPadding;

    invoke-direct {v1, p0}, Lo/setPadding;-><init>(Landroidx/appcompat/widget/Toolbar;)V

    invoke-direct {v0, v1}, Lo/mapObject;-><init>(Ljava/lang/Runnable;)V

    iput-object v0, p0, Landroidx/appcompat/widget/Toolbar;->read:Lo/mapObject;

    .line 214
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/appcompat/widget/Toolbar;->onPlayFromUri:Ljava/util/ArrayList;

    .line 217
    new-instance v0, Landroidx/appcompat/widget/Toolbar$5;

    invoke-direct {v0, p0}, Landroidx/appcompat/widget/Toolbar$5;-><init>(Landroidx/appcompat/widget/Toolbar;)V

    iput-object v0, p0, Landroidx/appcompat/widget/Toolbar;->onPlay:Landroidx/appcompat/widget/ActionMenuView$RemoteActionCompatParcelizer;

    .line 251
    new-instance v0, Landroidx/appcompat/widget/Toolbar$3;

    invoke-direct {v0, p0}, Landroidx/appcompat/widget/Toolbar$3;-><init>(Landroidx/appcompat/widget/Toolbar;)V

    iput-object v0, p0, Landroidx/appcompat/widget/Toolbar;->onRemoveQueueItem:Ljava/lang/Runnable;

    .line 269
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget-object v1, Lo/_init_lambda5$AudioAttributesImplApi26Parcelizer;->Toolbar:[I

    const/4 v2, 0x0

    invoke-static {v0, p2, v1, p3, v2}, Lo/setTitle;->read(Landroid/content/Context;Landroid/util/AttributeSet;[III)Lo/setTitle;

    move-result-object v0

    .line 271
    sget-object v5, Lo/_init_lambda5$AudioAttributesImplApi26Parcelizer;->Toolbar:[I

    .line 272
    invoke-virtual {v0}, Lo/setTitle;->AudioAttributesCompatParcelizer()Landroid/content/res/TypedArray;

    move-result-object v7

    const/4 v9, 0x0

    move-object v3, p0

    move-object v4, p1

    move-object v6, p2

    move v8, p3

    .line 271
    invoke-static/range {v3 .. v9}, Lo/InvalidTypeIdException;->IconCompatParcelizer(Landroid/view/View;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;II)V

    .line 274
    sget p1, Lo/_init_lambda5$AudioAttributesImplApi26Parcelizer;->Toolbar_titleTextAppearance:I

    invoke-virtual {v0, p1, v2}, Lo/setTitle;->MediaBrowserCompatItemReceiver(II)I

    move-result p1

    iput p1, p0, Landroidx/appcompat/widget/Toolbar;->onSkipToNext:I

    .line 275
    sget p1, Lo/_init_lambda5$AudioAttributesImplApi26Parcelizer;->Toolbar_subtitleTextAppearance:I

    invoke-virtual {v0, p1, v2}, Lo/setTitle;->MediaBrowserCompatItemReceiver(II)I

    move-result p1

    iput p1, p0, Landroidx/appcompat/widget/Toolbar;->onPrepareFromUri:I

    .line 276
    sget p1, Lo/_init_lambda5$AudioAttributesImplApi26Parcelizer;->Toolbar_android_gravity:I

    iget p2, p0, Landroidx/appcompat/widget/Toolbar;->onPause:I

    invoke-virtual {v0, p1, p2}, Lo/setTitle;->RemoteActionCompatParcelizer(II)I

    move-result p1

    iput p1, p0, Landroidx/appcompat/widget/Toolbar;->onPause:I

    .line 277
    sget p1, Lo/_init_lambda5$AudioAttributesImplApi26Parcelizer;->Toolbar_buttonGravity:I

    const/16 p2, 0x30

    invoke-virtual {v0, p1, p2}, Lo/setTitle;->RemoteActionCompatParcelizer(II)I

    move-result p1

    iput p1, p0, Landroidx/appcompat/widget/Toolbar;->IconCompatParcelizer:I

    .line 280
    sget p1, Lo/_init_lambda5$AudioAttributesImplApi26Parcelizer;->Toolbar_titleMargin:I

    invoke-virtual {v0, p1, v2}, Lo/setTitle;->write(II)I

    move-result p1

    .line 281
    sget p2, Lo/_init_lambda5$AudioAttributesImplApi26Parcelizer;->Toolbar_titleMargins:I

    invoke-virtual {v0, p2}, Lo/setTitle;->AudioAttributesImplApi26Parcelizer(I)Z

    move-result p2

    if-eqz p2, :cond_8d

    .line 283
    sget p2, Lo/_init_lambda5$AudioAttributesImplApi26Parcelizer;->Toolbar_titleMargins:I

    invoke-virtual {v0, p2, p1}, Lo/setTitle;->write(II)I

    move-result p1

    .line 285
    :cond_8d
    iput p1, p0, Landroidx/appcompat/widget/Toolbar;->onSetPlaybackSpeed:I

    iput p1, p0, Landroidx/appcompat/widget/Toolbar;->onSkipToQueueItem:I

    iput p1, p0, Landroidx/appcompat/widget/Toolbar;->onSetShuffleMode:I

    iput p1, p0, Landroidx/appcompat/widget/Toolbar;->onSetRating:I

    .line 287
    sget p1, Lo/_init_lambda5$AudioAttributesImplApi26Parcelizer;->Toolbar_titleMarginStart:I

    const/4 p2, -0x1

    invoke-virtual {v0, p1, p2}, Lo/setTitle;->write(II)I

    move-result p1

    if-ltz p1, :cond_a0

    .line 289
    iput p1, p0, Landroidx/appcompat/widget/Toolbar;->onSetRating:I

    .line 292
    :cond_a0
    sget p1, Lo/_init_lambda5$AudioAttributesImplApi26Parcelizer;->Toolbar_titleMarginEnd:I

    invoke-virtual {v0, p1, p2}, Lo/setTitle;->write(II)I

    move-result p1

    if-ltz p1, :cond_aa

    .line 294
    iput p1, p0, Landroidx/appcompat/widget/Toolbar;->onSetShuffleMode:I

    .line 297
    :cond_aa
    sget p1, Lo/_init_lambda5$AudioAttributesImplApi26Parcelizer;->Toolbar_titleMarginTop:I

    invoke-virtual {v0, p1, p2}, Lo/setTitle;->write(II)I

    move-result p1

    if-ltz p1, :cond_b4

    .line 299
    iput p1, p0, Landroidx/appcompat/widget/Toolbar;->onSkipToQueueItem:I

    .line 302
    :cond_b4
    sget p1, Lo/_init_lambda5$AudioAttributesImplApi26Parcelizer;->Toolbar_titleMarginBottom:I

    invoke-virtual {v0, p1, p2}, Lo/setTitle;->write(II)I

    move-result p1

    if-ltz p1, :cond_be

    .line 305
    iput p1, p0, Landroidx/appcompat/widget/Toolbar;->onSetPlaybackSpeed:I

    .line 308
    :cond_be
    sget p1, Lo/_init_lambda5$AudioAttributesImplApi26Parcelizer;->Toolbar_maxButtonHeight:I

    invoke-virtual {v0, p1, p2}, Lo/setTitle;->AudioAttributesCompatParcelizer(II)I

    move-result p1

    iput p1, p0, Landroidx/appcompat/widget/Toolbar;->onFastForward:I

    .line 310
    sget p1, Lo/_init_lambda5$AudioAttributesImplApi26Parcelizer;->Toolbar_contentInsetStart:I

    const/high16 p2, -0x80000000

    .line 311
    invoke-virtual {v0, p1, p2}, Lo/setTitle;->write(II)I

    move-result p1

    .line 313
    sget p3, Lo/_init_lambda5$AudioAttributesImplApi26Parcelizer;->Toolbar_contentInsetEnd:I

    .line 314
    invoke-virtual {v0, p3, p2}, Lo/setTitle;->write(II)I

    move-result p3

    .line 316
    sget v1, Lo/_init_lambda5$AudioAttributesImplApi26Parcelizer;->Toolbar_contentInsetLeft:I

    .line 317
    invoke-virtual {v0, v1, v2}, Lo/setTitle;->AudioAttributesCompatParcelizer(II)I

    move-result v1

    .line 318
    sget v3, Lo/_init_lambda5$AudioAttributesImplApi26Parcelizer;->Toolbar_contentInsetRight:I

    .line 319
    invoke-virtual {v0, v3, v2}, Lo/setTitle;->AudioAttributesCompatParcelizer(II)I

    move-result v3

    .line 321
    invoke-direct {p0}, Landroidx/appcompat/widget/Toolbar;->onPlayFromUri()V

    .line 322
    iget-object v4, p0, Landroidx/appcompat/widget/Toolbar;->onCommand:Lo/setNegativeButton;

    invoke-virtual {v4, v1, v3}, Lo/setNegativeButton;->AudioAttributesCompatParcelizer(II)V

    if-ne p1, p2, :cond_ec

    if-eq p3, p2, :cond_f1

    .line 326
    :cond_ec
    iget-object v1, p0, Landroidx/appcompat/widget/Toolbar;->onCommand:Lo/setNegativeButton;

    invoke-virtual {v1, p1, p3}, Lo/setNegativeButton;->RemoteActionCompatParcelizer(II)V

    .line 329
    :cond_f1
    sget p1, Lo/_init_lambda5$AudioAttributesImplApi26Parcelizer;->Toolbar_contentInsetStartWithNavigation:I

    invoke-virtual {v0, p1, p2}, Lo/setTitle;->write(II)I

    move-result p1

    iput p1, p0, Landroidx/appcompat/widget/Toolbar;->handleMediaPlayPauseIfPendingOnHandler:I

    .line 331
    sget p1, Lo/_init_lambda5$AudioAttributesImplApi26Parcelizer;->Toolbar_contentInsetEndWithActions:I

    invoke-virtual {v0, p1, p2}, Lo/setTitle;->write(II)I

    move-result p1

    iput p1, p0, Landroidx/appcompat/widget/Toolbar;->MediaDescriptionCompat:I

    .line 334
    sget p1, Lo/_init_lambda5$AudioAttributesImplApi26Parcelizer;->Toolbar_collapseIcon:I

    invoke-virtual {v0, p1}, Lo/setTitle;->IconCompatParcelizer(I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    iput-object p1, p0, Landroidx/appcompat/widget/Toolbar;->MediaBrowserCompatSearchResultReceiver:Landroid/graphics/drawable/Drawable;

    .line 335
    sget p1, Lo/_init_lambda5$AudioAttributesImplApi26Parcelizer;->Toolbar_collapseContentDescription:I

    invoke-virtual {v0, p1}, Lo/setTitle;->AudioAttributesImplBaseParcelizer(I)Ljava/lang/CharSequence;

    move-result-object p1

    iput-object p1, p0, Landroidx/appcompat/widget/Toolbar;->MediaMetadataCompat:Ljava/lang/CharSequence;

    .line 337
    sget p1, Lo/_init_lambda5$AudioAttributesImplApi26Parcelizer;->Toolbar_title:I

    invoke-virtual {v0, p1}, Lo/setTitle;->AudioAttributesImplBaseParcelizer(I)Ljava/lang/CharSequence;

    move-result-object p1

    .line 338
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-nez p2, :cond_120

    .line 339
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/Toolbar;->setTitle(Ljava/lang/CharSequence;)V

    .line 342
    :cond_120
    sget p1, Lo/_init_lambda5$AudioAttributesImplApi26Parcelizer;->Toolbar_subtitle:I

    invoke-virtual {v0, p1}, Lo/setTitle;->AudioAttributesImplBaseParcelizer(I)Ljava/lang/CharSequence;

    move-result-object p1

    .line 343
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-nez p2, :cond_12f

    .line 344
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/Toolbar;->setSubtitle(Ljava/lang/CharSequence;)V

    .line 348
    :cond_12f
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Landroidx/appcompat/widget/Toolbar;->onPrepare:Landroid/content/Context;

    .line 349
    sget p1, Lo/_init_lambda5$AudioAttributesImplApi26Parcelizer;->Toolbar_popupTheme:I

    invoke-virtual {v0, p1, v2}, Lo/setTitle;->MediaBrowserCompatItemReceiver(II)I

    move-result p1

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/Toolbar;->setPopupTheme(I)V

    .line 351
    sget p1, Lo/_init_lambda5$AudioAttributesImplApi26Parcelizer;->Toolbar_navigationIcon:I

    invoke-virtual {v0, p1}, Lo/setTitle;->IconCompatParcelizer(I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    if-eqz p1, :cond_149

    .line 353
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/Toolbar;->setNavigationIcon(Landroid/graphics/drawable/Drawable;)V

    .line 355
    :cond_149
    sget p1, Lo/_init_lambda5$AudioAttributesImplApi26Parcelizer;->Toolbar_navigationContentDescription:I

    invoke-virtual {v0, p1}, Lo/setTitle;->AudioAttributesImplBaseParcelizer(I)Ljava/lang/CharSequence;

    move-result-object p1

    .line 356
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-nez p2, :cond_158

    .line 357
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/Toolbar;->setNavigationContentDescription(Ljava/lang/CharSequence;)V

    .line 360
    :cond_158
    sget p1, Lo/_init_lambda5$AudioAttributesImplApi26Parcelizer;->Toolbar_logo:I

    invoke-virtual {v0, p1}, Lo/setTitle;->IconCompatParcelizer(I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    if-eqz p1, :cond_163

    .line 362
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/Toolbar;->setLogo(Landroid/graphics/drawable/Drawable;)V

    .line 365
    :cond_163
    sget p1, Lo/_init_lambda5$AudioAttributesImplApi26Parcelizer;->Toolbar_logoDescription:I

    invoke-virtual {v0, p1}, Lo/setTitle;->AudioAttributesImplBaseParcelizer(I)Ljava/lang/CharSequence;

    move-result-object p1

    .line 366
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-nez p2, :cond_172

    .line 367
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/Toolbar;->setLogoDescription(Ljava/lang/CharSequence;)V

    .line 370
    :cond_172
    sget p1, Lo/_init_lambda5$AudioAttributesImplApi26Parcelizer;->Toolbar_titleTextColor:I

    invoke-virtual {v0, p1}, Lo/setTitle;->AudioAttributesImplApi26Parcelizer(I)Z

    move-result p1

    if-eqz p1, :cond_183

    .line 371
    sget p1, Lo/_init_lambda5$AudioAttributesImplApi26Parcelizer;->Toolbar_titleTextColor:I

    invoke-virtual {v0, p1}, Lo/setTitle;->write(I)Landroid/content/res/ColorStateList;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/Toolbar;->setTitleTextColor(Landroid/content/res/ColorStateList;)V

    .line 374
    :cond_183
    sget p1, Lo/_init_lambda5$AudioAttributesImplApi26Parcelizer;->Toolbar_subtitleTextColor:I

    invoke-virtual {v0, p1}, Lo/setTitle;->AudioAttributesImplApi26Parcelizer(I)Z

    move-result p1

    if-eqz p1, :cond_194

    .line 375
    sget p1, Lo/_init_lambda5$AudioAttributesImplApi26Parcelizer;->Toolbar_subtitleTextColor:I

    invoke-virtual {v0, p1}, Lo/setTitle;->write(I)Landroid/content/res/ColorStateList;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/Toolbar;->setSubtitleTextColor(Landroid/content/res/ColorStateList;)V

    .line 378
    :cond_194
    sget p1, Lo/_init_lambda5$AudioAttributesImplApi26Parcelizer;->Toolbar_menu:I

    invoke-virtual {v0, p1}, Lo/setTitle;->AudioAttributesImplApi26Parcelizer(I)Z

    move-result p1

    if-eqz p1, :cond_1a5

    .line 379
    sget p1, Lo/_init_lambda5$AudioAttributesImplApi26Parcelizer;->Toolbar_menu:I

    invoke-virtual {v0, p1, v2}, Lo/setTitle;->MediaBrowserCompatItemReceiver(II)I

    move-result p1

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/Toolbar;->write(I)V

    .line 382
    :cond_1a5
    invoke-virtual {v0}, Lo/setTitle;->write()V

    return-void
.end method

.method private AudioAttributesCompatParcelizer(I)I
    .registers 3

    and-int/lit8 p1, p1, 0x70

    const/16 v0, 0x10

    if-eq p1, v0, :cond_13

    const/16 v0, 0x30

    if-eq p1, v0, :cond_13

    const/16 v0, 0x50

    if-eq p1, v0, :cond_13

    .line 2265
    iget p0, p0, Landroidx/appcompat/widget/Toolbar;->onPause:I

    and-int/lit8 p0, p0, 0x70

    return p0

    :cond_13
    return p1
.end method

.method private static AudioAttributesCompatParcelizer(Landroid/view/View;)I
    .registers 2

    .line 2324
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p0

    check-cast p0, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 2325
    invoke-static {p0}, Lo/mapArray;->write(Landroid/view/ViewGroup$MarginLayoutParams;)I

    move-result v0

    .line 2326
    invoke-static {p0}, Lo/mapArray;->RemoteActionCompatParcelizer(Landroid/view/ViewGroup$MarginLayoutParams;)I

    move-result p0

    add-int/2addr v0, p0

    return v0
.end method

.method private AudioAttributesCompatParcelizer(Landroid/util/AttributeSet;)Landroidx/appcompat/widget/Toolbar$LayoutParams;
    .registers 3

    .line 2336
    new-instance v0, Landroidx/appcompat/widget/Toolbar$LayoutParams;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p0

    invoke-direct {v0, p0, p1}, Landroidx/appcompat/widget/Toolbar$LayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-object v0
.end method

.method protected static AudioAttributesImplApi26Parcelizer()Landroidx/appcompat/widget/Toolbar$LayoutParams;
    .registers 1

    .line 2354
    new-instance v0, Landroidx/appcompat/widget/Toolbar$LayoutParams;

    invoke-direct {v0}, Landroidx/appcompat/widget/Toolbar$LayoutParams;-><init>()V

    return-object v0
.end method

.method private IconCompatParcelizer(I)I
    .registers 5

    .line 2306
    invoke-static {p0}, Lo/InvalidTypeIdException;->MediaBrowserCompatMediaItem(Landroid/view/View;)I

    move-result p0

    .line 2307
    invoke-static {p1, p0}, Lo/_clearIfStdImpl;->write(II)I

    move-result p1

    and-int/lit8 p1, p1, 0x7

    const/4 v0, 0x1

    if-eq p1, v0, :cond_17

    const/4 v1, 0x3

    if-eq p1, v1, :cond_17

    const/4 v2, 0x5

    if-eq p1, v2, :cond_17

    if-ne p0, v0, :cond_16

    return v2

    :cond_16
    return v1

    :cond_17
    return p1
.end method

.method private IconCompatParcelizer(Landroid/view/View;IIII)V
    .registers 12

    .line 1765
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 1768
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v2

    iget v3, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    iget v4, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    iget v5, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    add-int/2addr v1, v2

    add-int/2addr v1, v3

    add-int/2addr v1, v4

    add-int/2addr v1, p3

    .line 1767
    invoke-static {p2, v1, v5}, Landroidx/appcompat/widget/Toolbar;->getChildMeasureSpec(III)I

    move-result p2

    .line 1771
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result p3

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result p0

    iget v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iget v2, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    add-int/2addr p3, p0

    add-int/2addr p3, v1

    add-int/2addr p3, v2

    .line 1770
    invoke-static {p4, p3, v0}, Landroidx/appcompat/widget/Toolbar;->getChildMeasureSpec(III)I

    move-result p0

    .line 1774
    invoke-static {p0}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result p3

    const/high16 p4, 0x40000000    # 2.0f

    if-eq p3, p4, :cond_49

    if-ltz p5, :cond_49

    if-eqz p3, :cond_45

    .line 1777
    invoke-static {p0}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p0

    invoke-static {p0, p5}, Ljava/lang/Math;->min(II)I

    move-result p5

    .line 1779
    :cond_45
    invoke-static {p5, p4}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p0

    .line 1781
    :cond_49
    invoke-virtual {p1, p2, p0}, Landroid/view/View;->measure(II)V

    return-void
.end method

.method private IconCompatParcelizer(Landroid/view/View;Z)V
    .registers 5

    .line 1641
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    if-nez v0, :cond_b

    .line 1644
    invoke-static {}, Landroidx/appcompat/widget/Toolbar;->AudioAttributesImplApi26Parcelizer()Landroidx/appcompat/widget/Toolbar$LayoutParams;

    move-result-object v0

    goto :goto_18

    .line 1645
    :cond_b
    invoke-virtual {p0, v0}, Landroidx/appcompat/widget/Toolbar;->checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z

    move-result v1

    if-nez v1, :cond_16

    .line 1646
    invoke-static {v0}, Landroidx/appcompat/widget/Toolbar;->read(Landroid/view/ViewGroup$LayoutParams;)Landroidx/appcompat/widget/Toolbar$LayoutParams;

    move-result-object v0

    goto :goto_18

    .line 1648
    :cond_16
    check-cast v0, Landroidx/appcompat/widget/Toolbar$LayoutParams;

    :goto_18
    const/4 v1, 0x1

    .line 1650
    iput v1, v0, Landroidx/appcompat/widget/Toolbar$LayoutParams;->RemoteActionCompatParcelizer:I

    if-eqz p2, :cond_2a

    .line 1652
    iget-object p2, p0, Landroidx/appcompat/widget/Toolbar;->AudioAttributesCompatParcelizer:Landroid/view/View;

    if-eqz p2, :cond_2a

    .line 1653
    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1654
    iget-object p0, p0, Landroidx/appcompat/widget/Toolbar;->onMediaButtonEvent:Ljava/util/ArrayList;

    invoke-virtual {p0, p1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    return-void

    .line 1656
    :cond_2a
    invoke-virtual {p0, p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method private IconCompatParcelizer(Landroid/view/View;)Z
    .registers 3

    if-eqz p1, :cond_12

    .line 2320
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-ne v0, p0, :cond_12

    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    move-result p0

    const/16 p1, 0x8

    if-eq p0, p1, :cond_12

    const/4 p0, 0x1

    return p0

    :cond_12
    const/4 p0, 0x0

    return p0
.end method

.method private RemoteActionCompatParcelizer(Landroid/view/View;I[II)I
    .registers 9

    .line 2201
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/appcompat/widget/Toolbar$LayoutParams;

    .line 2202
    iget v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    const/4 v2, 0x0

    aget v3, p3, v2

    sub-int/2addr v1, v3

    .line 2203
    invoke-static {v2, v1}, Ljava/lang/Math;->max(II)I

    move-result v3

    add-int/2addr p2, v3

    neg-int v1, v1

    .line 2204
    invoke-static {v2, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    aput v1, p3, v2

    .line 2205
    invoke-direct {p0, p1, p4}, Landroidx/appcompat/widget/Toolbar;->read(Landroid/view/View;I)I

    move-result p0

    .line 2206
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    move-result p3

    add-int p4, p2, p3

    .line 2207
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    move-result v1

    add-int/2addr v1, p0

    invoke-virtual {p1, p2, p0, p4, v1}, Landroid/view/View;->layout(IIII)V

    .line 2208
    iget p0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    add-int/2addr p3, p0

    add-int/2addr p2, p3

    return p2
.end method

.method private static RemoteActionCompatParcelizer(Ljava/util/List;[I)I
    .registers 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/view/View;",
            ">;[I)I"
        }
    .end annotation

    const/4 v0, 0x0

    .line 2181
    aget v1, p1, v0

    const/4 v2, 0x1

    .line 2182
    aget p1, p1, v2

    .line 2184
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v2

    move v3, v0

    move v4, v3

    :goto_c
    if-ge v3, v2, :cond_3e

    .line 2186
    invoke-interface {p0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/view/View;

    .line 2187
    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v6

    check-cast v6, Landroidx/appcompat/widget/Toolbar$LayoutParams;

    .line 2188
    iget v7, v6, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    sub-int/2addr v7, v1

    .line 2189
    iget v1, v6, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    sub-int/2addr v1, p1

    .line 2190
    invoke-static {v0, v7}, Ljava/lang/Math;->max(II)I

    move-result p1

    .line 2191
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v6

    neg-int v7, v7

    .line 2192
    invoke-static {v0, v7}, Ljava/lang/Math;->max(II)I

    move-result v7

    neg-int v1, v1

    .line 2193
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    .line 2194
    invoke-virtual {v5}, Landroid/view/View;->getMeasuredWidth()I

    move-result v5

    add-int/2addr p1, v5

    add-int/2addr p1, v6

    add-int/2addr v4, p1

    add-int/lit8 v3, v3, 0x1

    move p1, v1

    move v1, v7

    goto :goto_c

    :cond_3e
    return v4
.end method

.method private onPlayFromSearch()V
    .registers 5

    .line 1601
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->onPlayFromSearch:Landroid/widget/ImageButton;

    if-nez v0, :cond_25

    .line 1602
    new-instance v0, Landroidx/appcompat/widget/AppCompatImageButton;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x0

    sget v3, Lo/_init_lambda5$read;->toolbarNavigationButtonStyle:I

    invoke-direct {v0, v1, v2, v3}, Landroidx/appcompat/widget/AppCompatImageButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    iput-object v0, p0, Landroidx/appcompat/widget/Toolbar;->onPlayFromSearch:Landroid/widget/ImageButton;

    .line 1604
    invoke-static {}, Landroidx/appcompat/widget/Toolbar;->AudioAttributesImplApi26Parcelizer()Landroidx/appcompat/widget/Toolbar$LayoutParams;

    move-result-object v0

    .line 1605
    iget v1, p0, Landroidx/appcompat/widget/Toolbar;->IconCompatParcelizer:I

    and-int/lit8 v1, v1, 0x70

    const v2, 0x800003

    or-int/2addr v1, v2

    iput v1, v0, Landroidx/appcompat/app/ActionBar$LayoutParams;->write:I

    .line 1606
    iget-object p0, p0, Landroidx/appcompat/widget/Toolbar;->onPlayFromSearch:Landroid/widget/ImageButton;

    invoke-virtual {p0, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_25
    return-void
.end method

.method private onPlayFromUri()V
    .registers 2

    .line 2422
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->onCommand:Lo/setNegativeButton;

    if-nez v0, :cond_b

    .line 2423
    new-instance v0, Lo/setNegativeButton;

    invoke-direct {v0}, Lo/setNegativeButton;-><init>()V

    iput-object v0, p0, Landroidx/appcompat/widget/Toolbar;->onCommand:Lo/setNegativeButton;

    :cond_b
    return-void
.end method

.method private onPrepare()V
    .registers 4

    .line 1252
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->MediaBrowserCompatCustomActionResultReceiver:Landroidx/appcompat/widget/ActionMenuView;

    if-nez v0, :cond_40

    .line 1253
    new-instance v0, Landroidx/appcompat/widget/ActionMenuView;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroidx/appcompat/widget/ActionMenuView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Landroidx/appcompat/widget/Toolbar;->MediaBrowserCompatCustomActionResultReceiver:Landroidx/appcompat/widget/ActionMenuView;

    .line 1254
    iget v1, p0, Landroidx/appcompat/widget/Toolbar;->onPrepareFromMediaId:I

    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/ActionMenuView;->setPopupTheme(I)V

    .line 1255
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->MediaBrowserCompatCustomActionResultReceiver:Landroidx/appcompat/widget/ActionMenuView;

    iget-object v1, p0, Landroidx/appcompat/widget/Toolbar;->onPlay:Landroidx/appcompat/widget/ActionMenuView$RemoteActionCompatParcelizer;

    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/ActionMenuView;->setOnMenuItemClickListener(Landroidx/appcompat/widget/ActionMenuView$RemoteActionCompatParcelizer;)V

    .line 1256
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->MediaBrowserCompatCustomActionResultReceiver:Landroidx/appcompat/widget/ActionMenuView;

    iget-object v1, p0, Landroidx/appcompat/widget/Toolbar;->AudioAttributesImplApi21Parcelizer:Lo/peekAvailableContext$AudioAttributesCompatParcelizer;

    new-instance v2, Landroidx/appcompat/widget/Toolbar$2;

    invoke-direct {v2, p0}, Landroidx/appcompat/widget/Toolbar$2;-><init>(Landroidx/appcompat/widget/Toolbar;)V

    invoke-virtual {v0, v1, v2}, Landroidx/appcompat/widget/ActionMenuView;->setMenuCallbacks(Lo/peekAvailableContext$AudioAttributesCompatParcelizer;Lo/onRequestPermissionsResult$RemoteActionCompatParcelizer;)V

    .line 1284
    invoke-static {}, Landroidx/appcompat/widget/Toolbar;->AudioAttributesImplApi26Parcelizer()Landroidx/appcompat/widget/Toolbar$LayoutParams;

    move-result-object v0

    .line 1285
    iget v1, p0, Landroidx/appcompat/widget/Toolbar;->IconCompatParcelizer:I

    and-int/lit8 v1, v1, 0x70

    const v2, 0x800005

    or-int/2addr v1, v2

    iput v1, v0, Landroidx/appcompat/app/ActionBar$LayoutParams;->write:I

    .line 1286
    iget-object v1, p0, Landroidx/appcompat/widget/Toolbar;->MediaBrowserCompatCustomActionResultReceiver:Landroidx/appcompat/widget/ActionMenuView;

    invoke-virtual {v1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1287
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->MediaBrowserCompatCustomActionResultReceiver:Landroidx/appcompat/widget/ActionMenuView;

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Landroidx/appcompat/widget/Toolbar;->IconCompatParcelizer(Landroid/view/View;Z)V

    :cond_40
    return-void
.end method

.method private onPrepareFromMediaId()V
    .registers 3

    .line 769
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->onPlayFromMediaId:Landroid/widget/ImageView;

    if-nez v0, :cond_f

    .line 770
    new-instance v0, Landroidx/appcompat/widget/AppCompatImageView;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroidx/appcompat/widget/AppCompatImageView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Landroidx/appcompat/widget/Toolbar;->onPlayFromMediaId:Landroid/widget/ImageView;

    :cond_f
    return-void
.end method

.method private onPrepareFromSearch()V
    .registers 4

    .line 1236
    invoke-direct {p0}, Landroidx/appcompat/widget/Toolbar;->onPrepare()V

    .line 1237
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->MediaBrowserCompatCustomActionResultReceiver:Landroidx/appcompat/widget/ActionMenuView;

    invoke-virtual {v0}, Landroidx/appcompat/widget/ActionMenuView;->AudioAttributesImplApi26Parcelizer()Lo/onRequestPermissionsResult;

    move-result-object v0

    if-nez v0, :cond_2e

    .line 1239
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->MediaBrowserCompatCustomActionResultReceiver:Landroidx/appcompat/widget/ActionMenuView;

    invoke-virtual {v0}, Landroidx/appcompat/widget/ActionMenuView;->read()Landroid/view/Menu;

    move-result-object v0

    check-cast v0, Lo/onRequestPermissionsResult;

    .line 1240
    iget-object v1, p0, Landroidx/appcompat/widget/Toolbar;->onAddQueueItem:Landroidx/appcompat/widget/Toolbar$write;

    if-nez v1, :cond_1e

    .line 1241
    new-instance v1, Landroidx/appcompat/widget/Toolbar$write;

    invoke-direct {v1, p0}, Landroidx/appcompat/widget/Toolbar$write;-><init>(Landroidx/appcompat/widget/Toolbar;)V

    iput-object v1, p0, Landroidx/appcompat/widget/Toolbar;->onAddQueueItem:Landroidx/appcompat/widget/Toolbar$write;

    .line 1243
    :cond_1e
    iget-object v1, p0, Landroidx/appcompat/widget/Toolbar;->MediaBrowserCompatCustomActionResultReceiver:Landroidx/appcompat/widget/ActionMenuView;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Landroidx/appcompat/widget/ActionMenuView;->setExpandedActionViewsExclusive(Z)V

    .line 1244
    iget-object v1, p0, Landroidx/appcompat/widget/Toolbar;->onAddQueueItem:Landroidx/appcompat/widget/Toolbar$write;

    iget-object v2, p0, Landroidx/appcompat/widget/Toolbar;->onPrepare:Landroid/content/Context;

    invoke-virtual {v0, v1, v2}, Lo/onRequestPermissionsResult;->write(Lo/peekAvailableContext;Landroid/content/Context;)V

    .line 1247
    invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->onPlayFromMediaId()V

    :cond_2e
    return-void
.end method

.method private onPrepareFromUri()Landroid/view/MenuInflater;
    .registers 2

    .line 1292
    new-instance v0, Lo/onMenuItemSelected;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p0

    invoke-direct {v0, p0}, Lo/onMenuItemSelected;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method private onRemoveQueueItem()Ljava/util/ArrayList;
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Landroid/view/MenuItem;",
            ">;"
        }
    .end annotation

    .line 2457
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 2459
    invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->MediaBrowserCompatCustomActionResultReceiver()Landroid/view/Menu;

    move-result-object p0

    const/4 v1, 0x0

    .line 2460
    :goto_a
    invoke-interface {p0}, Landroid/view/Menu;->size()I

    move-result v2

    if-ge v1, v2, :cond_1a

    .line 2461
    invoke-interface {p0, v1}, Landroid/view/Menu;->getItem(I)Landroid/view/MenuItem;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_a

    :cond_1a
    return-object v0
.end method

.method private onRemoveQueueItemAt()Z
    .registers 6

    .line 1814
    iget-boolean v0, p0, Landroidx/appcompat/widget/Toolbar;->RatingCompat:Z

    const/4 v1, 0x0

    if-nez v0, :cond_6

    return v1

    .line 1816
    :cond_6
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    move v2, v1

    :goto_b
    if-ge v2, v0, :cond_27

    .line 1818
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    .line 1819
    invoke-direct {p0, v3}, Landroidx/appcompat/widget/Toolbar;->IconCompatParcelizer(Landroid/view/View;)Z

    move-result v4

    if-eqz v4, :cond_24

    invoke-virtual {v3}, Landroid/view/View;->getMeasuredWidth()I

    move-result v4

    if-lez v4, :cond_24

    .line 1820
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredHeight()I

    move-result v3

    if-lez v3, :cond_24

    return v1

    :cond_24
    add-int/lit8 v2, v2, 0x1

    goto :goto_b

    :cond_27
    const/4 p0, 0x1

    return p0
.end method

.method private onRewind()V
    .registers 2

    .line 1696
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->onRemoveQueueItem:Ljava/lang/Runnable;

    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 1697
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->onRemoveQueueItem:Ljava/lang/Runnable;

    invoke-virtual {p0, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method private onSeekTo()V
    .registers 5

    .line 2468
    invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->MediaBrowserCompatCustomActionResultReceiver()Landroid/view/Menu;

    move-result-object v0

    .line 2469
    invoke-direct {p0}, Landroidx/appcompat/widget/Toolbar;->onRemoveQueueItem()Ljava/util/ArrayList;

    move-result-object v1

    .line 2470
    iget-object v2, p0, Landroidx/appcompat/widget/Toolbar;->read:Lo/mapObject;

    invoke-direct {p0}, Landroidx/appcompat/widget/Toolbar;->onPrepareFromUri()Landroid/view/MenuInflater;

    move-result-object v3

    invoke-virtual {v2, v0, v3}, Lo/mapObject;->write(Landroid/view/Menu;Landroid/view/MenuInflater;)V

    .line 2472
    invoke-direct {p0}, Landroidx/appcompat/widget/Toolbar;->onRemoveQueueItem()Ljava/util/ArrayList;

    move-result-object v0

    .line 2473
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->removeAll(Ljava/util/Collection;)Z

    .line 2474
    iput-object v0, p0, Landroidx/appcompat/widget/Toolbar;->onPlayFromUri:Ljava/util/ArrayList;

    return-void
.end method

.method private onSetCaptioningEnabled()I
    .registers 3

    .line 1595
    invoke-static {p0}, Lo/InvalidTypeIdException;->MediaBrowserCompatMediaItem(Landroid/view/View;)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_c

    .line 1596
    invoke-direct {p0}, Landroidx/appcompat/widget/Toolbar;->onStop()I

    move-result p0

    return p0

    .line 1597
    :cond_c
    invoke-direct {p0}, Landroidx/appcompat/widget/Toolbar;->onSetShuffleMode()I

    move-result p0

    return p0
.end method

.method private onSetPlaybackSpeed()I
    .registers 1

    .line 1361
    iget-object p0, p0, Landroidx/appcompat/widget/Toolbar;->onCommand:Lo/setNegativeButton;

    if-eqz p0, :cond_9

    invoke-virtual {p0}, Lo/setNegativeButton;->read()I

    move-result p0

    return p0

    :cond_9
    const/4 p0, 0x0

    return p0
.end method

.method private onSetRating()I
    .registers 3

    .line 1580
    invoke-static {p0}, Lo/InvalidTypeIdException;->MediaBrowserCompatMediaItem(Landroid/view/View;)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_c

    .line 1581
    invoke-direct {p0}, Landroidx/appcompat/widget/Toolbar;->onSetShuffleMode()I

    move-result p0

    return p0

    .line 1582
    :cond_c
    invoke-direct {p0}, Landroidx/appcompat/widget/Toolbar;->onStop()I

    move-result p0

    return p0
.end method

.method private onSetRepeatMode()I
    .registers 1

    .line 1382
    iget-object p0, p0, Landroidx/appcompat/widget/Toolbar;->onCommand:Lo/setNegativeButton;

    if-eqz p0, :cond_9

    invoke-virtual {p0}, Lo/setNegativeButton;->IconCompatParcelizer()I

    move-result p0

    return p0

    :cond_9
    const/4 p0, 0x0

    return p0
.end method

.method private onSetShuffleMode()I
    .registers 3

    .line 1561
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->MediaBrowserCompatCustomActionResultReceiver:Landroidx/appcompat/widget/ActionMenuView;

    if-eqz v0, :cond_20

    .line 1562
    invoke-virtual {v0}, Landroidx/appcompat/widget/ActionMenuView;->AudioAttributesImplApi26Parcelizer()Lo/onRequestPermissionsResult;

    move-result-object v0

    if-eqz v0, :cond_20

    .line 1563
    invoke-virtual {v0}, Lo/onRequestPermissionsResult;->hasVisibleItems()Z

    move-result v0

    if-eqz v0, :cond_20

    .line 1566
    invoke-direct {p0}, Landroidx/appcompat/widget/Toolbar;->onSetRepeatMode()I

    move-result v0

    iget p0, p0, Landroidx/appcompat/widget/Toolbar;->MediaDescriptionCompat:I

    const/4 v1, 0x0

    invoke-static {p0, v1}, Ljava/lang/Math;->max(II)I

    move-result p0

    invoke-static {v0, p0}, Ljava/lang/Math;->max(II)I

    move-result p0

    return p0

    .line 1567
    :cond_20
    invoke-direct {p0}, Landroidx/appcompat/widget/Toolbar;->onSetRepeatMode()I

    move-result p0

    return p0
.end method

.method private onStop()I
    .registers 3

    .line 1546
    invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->AudioAttributesImplApi21Parcelizer()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_16

    .line 1547
    invoke-direct {p0}, Landroidx/appcompat/widget/Toolbar;->onSetPlaybackSpeed()I

    move-result v0

    iget p0, p0, Landroidx/appcompat/widget/Toolbar;->handleMediaPlayPauseIfPendingOnHandler:I

    const/4 v1, 0x0

    invoke-static {p0, v1}, Ljava/lang/Math;->max(II)I

    move-result p0

    invoke-static {v0, p0}, Ljava/lang/Math;->max(II)I

    move-result p0

    return p0

    .line 1548
    :cond_16
    invoke-direct {p0}, Landroidx/appcompat/widget/Toolbar;->onSetPlaybackSpeed()I

    move-result p0

    return p0
.end method

.method private read(Landroid/view/View;I)I
    .registers 8

    .line 2226
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/appcompat/widget/Toolbar$LayoutParams;

    .line 2227
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    move-result p1

    const/4 v1, 0x0

    if-lez p2, :cond_12

    sub-int p2, p1, p2

    .line 2228
    div-int/lit8 p2, p2, 0x2

    goto :goto_13

    :cond_12
    move p2, v1

    .line 2229
    :goto_13
    iget v2, v0, Landroidx/appcompat/app/ActionBar$LayoutParams;->write:I

    invoke-direct {p0, v2}, Landroidx/appcompat/widget/Toolbar;->AudioAttributesCompatParcelizer(I)I

    move-result v2

    const/16 v3, 0x30

    if-eq v2, v3, :cond_5b

    const/16 v3, 0x50

    if-eq v2, v3, :cond_4c

    .line 2239
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result p2

    .line 2240
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v2

    .line 2241
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result p0

    sub-int v3, p0, p2

    sub-int/2addr v3, v2

    sub-int/2addr v3, p1

    .line 2243
    div-int/lit8 v3, v3, 0x2

    .line 2244
    iget v4, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    if-ge v3, v4, :cond_3a

    .line 2245
    iget v3, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    goto :goto_4a

    :cond_3a
    sub-int/2addr p0, v2

    sub-int/2addr p0, p1

    sub-int/2addr p0, v3

    sub-int/2addr p0, p2

    .line 2249
    iget p1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    if-ge p0, p1, :cond_4a

    .line 2250
    iget p1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    sub-int/2addr p1, p0

    sub-int/2addr v3, p1

    invoke-static {v1, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    :cond_4a
    :goto_4a
    add-int/2addr p2, v3

    return p2

    .line 2234
    :cond_4c
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result p0

    sub-int/2addr v1, p0

    sub-int/2addr v1, p1

    iget p0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    sub-int/2addr v1, p0

    sub-int/2addr v1, p2

    return v1

    .line 2231
    :cond_5b
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result p0

    sub-int/2addr p0, p2

    return p0
.end method

.method private read(Landroid/view/View;IIII[I)I
    .registers 14

    .line 1790
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 1792
    iget v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    const/4 v2, 0x0

    aget v3, p6, v2

    sub-int/2addr v1, v3

    .line 1793
    iget v3, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    const/4 v4, 0x1

    aget v5, p6, v4

    sub-int/2addr v3, v5

    .line 1794
    invoke-static {v2, v1}, Ljava/lang/Math;->max(II)I

    move-result v5

    .line 1795
    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v6

    add-int/2addr v5, v6

    neg-int v1, v1

    .line 1797
    invoke-static {v2, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    aput v1, p6, v2

    neg-int v1, v3

    .line 1798
    invoke-static {v2, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    aput v1, p6, v4

    .line 1801
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result p6

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v1

    iget v2, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    add-int/2addr p6, v1

    add-int/2addr p6, v5

    add-int/2addr p6, p3

    .line 1800
    invoke-static {p2, p6, v2}, Landroidx/appcompat/widget/Toolbar;->getChildMeasureSpec(III)I

    move-result p2

    .line 1803
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result p3

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result p0

    iget p6, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iget v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    add-int/2addr p3, p0

    add-int/2addr p3, p6

    add-int/2addr p3, v1

    add-int/2addr p3, p5

    .line 1802
    invoke-static {p4, p3, v0}, Landroidx/appcompat/widget/Toolbar;->getChildMeasureSpec(III)I

    move-result p0

    .line 1806
    invoke-virtual {p1, p2, p0}, Landroid/view/View;->measure(II)V

    .line 1807
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    move-result p0

    add-int/2addr p0, v5

    return p0
.end method

.method private static read(Landroid/view/ViewGroup$LayoutParams;)Landroidx/appcompat/widget/Toolbar$LayoutParams;
    .registers 2

    .line 2341
    instance-of v0, p0, Landroidx/appcompat/widget/Toolbar$LayoutParams;

    if-eqz v0, :cond_c

    .line 2342
    new-instance v0, Landroidx/appcompat/widget/Toolbar$LayoutParams;

    check-cast p0, Landroidx/appcompat/widget/Toolbar$LayoutParams;

    invoke-direct {v0, p0}, Landroidx/appcompat/widget/Toolbar$LayoutParams;-><init>(Landroidx/appcompat/widget/Toolbar$LayoutParams;)V

    return-object v0

    .line 2343
    :cond_c
    instance-of v0, p0, Landroidx/appcompat/app/ActionBar$LayoutParams;

    if-eqz v0, :cond_18

    .line 2344
    new-instance v0, Landroidx/appcompat/widget/Toolbar$LayoutParams;

    check-cast p0, Landroidx/appcompat/app/ActionBar$LayoutParams;

    invoke-direct {v0, p0}, Landroidx/appcompat/widget/Toolbar$LayoutParams;-><init>(Landroidx/appcompat/app/ActionBar$LayoutParams;)V

    return-object v0

    .line 2345
    :cond_18
    instance-of v0, p0, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz v0, :cond_24

    .line 2346
    new-instance v0, Landroidx/appcompat/widget/Toolbar$LayoutParams;

    check-cast p0, Landroid/view/ViewGroup$MarginLayoutParams;

    invoke-direct {v0, p0}, Landroidx/appcompat/widget/Toolbar$LayoutParams;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V

    return-object v0

    .line 2348
    :cond_24
    new-instance v0, Landroidx/appcompat/widget/Toolbar$LayoutParams;

    invoke-direct {v0, p0}, Landroidx/appcompat/widget/Toolbar$LayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    return-object v0
.end method

.method private read(Ljava/util/List;I)V
    .registers 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/view/View;",
            ">;I)V"
        }
    .end annotation

    .line 2277
    invoke-static {p0}, Lo/InvalidTypeIdException;->MediaBrowserCompatMediaItem(Landroid/view/View;)I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_a

    move v0, v2

    goto :goto_b

    :cond_a
    move v0, v1

    .line 2278
    :goto_b
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v3

    .line 2280
    invoke-static {p0}, Lo/InvalidTypeIdException;->MediaBrowserCompatMediaItem(Landroid/view/View;)I

    move-result v4

    .line 2279
    invoke-static {p2, v4}, Lo/_clearIfStdImpl;->write(II)I

    move-result p2

    .line 2282
    invoke-interface {p1}, Ljava/util/List;->clear()V

    if-eqz v0, :cond_41

    sub-int/2addr v3, v2

    :goto_1d
    if-ltz v3, :cond_65

    .line 2286
    invoke-virtual {p0, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 2287
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroidx/appcompat/widget/Toolbar$LayoutParams;

    .line 2288
    iget v2, v1, Landroidx/appcompat/widget/Toolbar$LayoutParams;->RemoteActionCompatParcelizer:I

    if-nez v2, :cond_3e

    invoke-direct {p0, v0}, Landroidx/appcompat/widget/Toolbar;->IconCompatParcelizer(Landroid/view/View;)Z

    move-result v2

    if-eqz v2, :cond_3e

    iget v1, v1, Landroidx/appcompat/app/ActionBar$LayoutParams;->write:I

    .line 2289
    invoke-direct {p0, v1}, Landroidx/appcompat/widget/Toolbar;->IconCompatParcelizer(I)I

    move-result v1

    if-ne v1, p2, :cond_3e

    .line 2290
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_3e
    add-int/lit8 v3, v3, -0x1

    goto :goto_1d

    :cond_41
    :goto_41
    if-ge v1, v3, :cond_65

    .line 2295
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 2296
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    check-cast v2, Landroidx/appcompat/widget/Toolbar$LayoutParams;

    .line 2297
    iget v4, v2, Landroidx/appcompat/widget/Toolbar$LayoutParams;->RemoteActionCompatParcelizer:I

    if-nez v4, :cond_62

    invoke-direct {p0, v0}, Landroidx/appcompat/widget/Toolbar;->IconCompatParcelizer(Landroid/view/View;)Z

    move-result v4

    if-eqz v4, :cond_62

    iget v2, v2, Landroidx/appcompat/app/ActionBar$LayoutParams;->write:I

    .line 2298
    invoke-direct {p0, v2}, Landroidx/appcompat/widget/Toolbar;->IconCompatParcelizer(I)I

    move-result v2

    if-ne v2, p2, :cond_62

    .line 2299
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_62
    add-int/lit8 v1, v1, 0x1

    goto :goto_41

    :cond_65
    return-void
.end method

.method private read(Landroid/view/View;)Z
    .registers 3

    .line 2394
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eq v0, p0, :cond_10

    iget-object p0, p0, Landroidx/appcompat/widget/Toolbar;->onMediaButtonEvent:Ljava/util/ArrayList;

    invoke-virtual {p0, p1}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_10

    const/4 p0, 0x0

    return p0

    :cond_10
    const/4 p0, 0x1

    return p0
.end method

.method private static write(Landroid/view/View;)I
    .registers 2

    .line 2330
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p0

    check-cast p0, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 2331
    iget v0, p0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iget p0, p0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    add-int/2addr v0, p0

    return v0
.end method

.method private write(Landroid/view/View;I[II)I
    .registers 10

    .line 2214
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/appcompat/widget/Toolbar$LayoutParams;

    .line 2215
    iget v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    const/4 v2, 0x1

    aget v3, p3, v2

    sub-int/2addr v1, v3

    const/4 v3, 0x0

    .line 2216
    invoke-static {v3, v1}, Ljava/lang/Math;->max(II)I

    move-result v4

    sub-int/2addr p2, v4

    neg-int v1, v1

    .line 2217
    invoke-static {v3, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    aput v1, p3, v2

    .line 2218
    invoke-direct {p0, p1, p4}, Landroidx/appcompat/widget/Toolbar;->read(Landroid/view/View;I)I

    move-result p0

    .line 2219
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    move-result p3

    sub-int p4, p2, p3

    .line 2220
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    move-result v1

    add-int/2addr v1, p0

    invoke-virtual {p1, p4, p0, p2, v1}, Landroid/view/View;->layout(IIII)V

    .line 2221
    iget p0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    add-int/2addr p3, p0

    sub-int/2addr p2, p3

    return p2
.end method


# virtual methods
.method final AudioAttributesCompatParcelizer()V
    .registers 5

    .line 1622
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->write:Landroid/widget/ImageButton;

    if-nez v0, :cond_3e

    .line 1623
    new-instance v0, Landroidx/appcompat/widget/AppCompatImageButton;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x0

    sget v3, Lo/_init_lambda5$read;->toolbarNavigationButtonStyle:I

    invoke-direct {v0, v1, v2, v3}, Landroidx/appcompat/widget/AppCompatImageButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    iput-object v0, p0, Landroidx/appcompat/widget/Toolbar;->write:Landroid/widget/ImageButton;

    .line 1625
    iget-object v1, p0, Landroidx/appcompat/widget/Toolbar;->MediaBrowserCompatSearchResultReceiver:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 1626
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->write:Landroid/widget/ImageButton;

    iget-object v1, p0, Landroidx/appcompat/widget/Toolbar;->MediaMetadataCompat:Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 1627
    invoke-static {}, Landroidx/appcompat/widget/Toolbar;->AudioAttributesImplApi26Parcelizer()Landroidx/appcompat/widget/Toolbar$LayoutParams;

    move-result-object v0

    .line 1628
    iget v1, p0, Landroidx/appcompat/widget/Toolbar;->IconCompatParcelizer:I

    and-int/lit8 v1, v1, 0x70

    const v2, 0x800003

    or-int/2addr v1, v2

    iput v1, v0, Landroidx/appcompat/app/ActionBar$LayoutParams;->write:I

    const/4 v1, 0x2

    .line 1629
    iput v1, v0, Landroidx/appcompat/widget/Toolbar$LayoutParams;->RemoteActionCompatParcelizer:I

    .line 1630
    iget-object v1, p0, Landroidx/appcompat/widget/Toolbar;->write:Landroid/widget/ImageButton;

    invoke-virtual {v1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1631
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->write:Landroid/widget/ImageButton;

    new-instance v1, Landroidx/appcompat/widget/Toolbar$4;

    invoke-direct {v1, p0}, Landroidx/appcompat/widget/Toolbar$4;-><init>(Landroidx/appcompat/widget/Toolbar;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_3e
    return-void
.end method

.method public final AudioAttributesImplApi21Parcelizer()Landroid/graphics/drawable/Drawable;
    .registers 1

    .line 1088
    iget-object p0, p0, Landroidx/appcompat/widget/Toolbar;->onPlayFromSearch:Landroid/widget/ImageButton;

    if-eqz p0, :cond_9

    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object p0

    return-object p0

    :cond_9
    const/4 p0, 0x0

    return-object p0
.end method

.method public final AudioAttributesImplBaseParcelizer()Landroid/graphics/drawable/Drawable;
    .registers 1

    .line 726
    iget-object p0, p0, Landroidx/appcompat/widget/Toolbar;->onPlayFromMediaId:Landroid/widget/ImageView;

    if-eqz p0, :cond_9

    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object p0

    return-object p0

    :cond_9
    const/4 p0, 0x0

    return-object p0
.end method

.method final IconCompatParcelizer()V
    .registers 3

    .line 2385
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->onMediaButtonEvent:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_8
    if-ltz v0, :cond_18

    .line 2388
    iget-object v1, p0, Landroidx/appcompat/widget/Toolbar;->onMediaButtonEvent:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    add-int/lit8 v0, v0, -0x1

    goto :goto_8

    .line 2390
    :cond_18
    iget-object p0, p0, Landroidx/appcompat/widget/Toolbar;->onMediaButtonEvent:Ljava/util/ArrayList;

    invoke-virtual {p0}, Ljava/util/AbstractCollection;->clear()V

    return-void
.end method

.method public final MediaBrowserCompatCustomActionResultReceiver()Landroid/view/Menu;
    .registers 1

    .line 1210
    invoke-direct {p0}, Landroidx/appcompat/widget/Toolbar;->onPrepareFromSearch()V

    .line 1211
    iget-object p0, p0, Landroidx/appcompat/widget/Toolbar;->MediaBrowserCompatCustomActionResultReceiver:Landroidx/appcompat/widget/ActionMenuView;

    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionMenuView;->read()Landroid/view/Menu;

    move-result-object p0

    return-object p0
.end method

.method public final MediaBrowserCompatItemReceiver()Ljava/lang/CharSequence;
    .registers 1

    .line 994
    iget-object p0, p0, Landroidx/appcompat/widget/Toolbar;->onPlayFromSearch:Landroid/widget/ImageButton;

    if-eqz p0, :cond_9

    invoke-virtual {p0}, Landroid/view/View;->getContentDescription()Ljava/lang/CharSequence;

    move-result-object p0

    return-object p0

    :cond_9
    const/4 p0, 0x0

    return-object p0
.end method

.method public final MediaBrowserCompatMediaItem()I
    .registers 1

    .line 522
    iget p0, p0, Landroidx/appcompat/widget/Toolbar;->onSetShuffleMode:I

    return p0
.end method

.method public final MediaBrowserCompatSearchResultReceiver()Ljava/lang/CharSequence;
    .registers 1

    .line 813
    iget-object p0, p0, Landroidx/appcompat/widget/Toolbar;->setSessionImpl:Ljava/lang/CharSequence;

    return-object p0
.end method

.method public final MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()V
    .registers 4

    .line 2513
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->onPlayFromUri:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1e

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/MenuItem;

    .line 2514
    invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->MediaBrowserCompatCustomActionResultReceiver()Landroid/view/Menu;

    move-result-object v2

    invoke-interface {v1}, Landroid/view/MenuItem;->getItemId()I

    move-result v1

    invoke-interface {v2, v1}, Landroid/view/Menu;->removeItem(I)V

    goto :goto_6

    .line 2516
    :cond_1e
    invoke-direct {p0}, Landroidx/appcompat/widget/Toolbar;->onSeekTo()V

    return-void
.end method

.method public final MediaDescriptionCompat()Ljava/lang/CharSequence;
    .registers 1

    .line 870
    iget-object p0, p0, Landroidx/appcompat/widget/Toolbar;->onSeekTo:Ljava/lang/CharSequence;

    return-object p0
.end method

.method public final MediaMetadataCompat()I
    .registers 1

    .line 476
    iget p0, p0, Landroidx/appcompat/widget/Toolbar;->onSetRating:I

    return p0
.end method

.method public final RatingCompat()I
    .registers 1

    .line 545
    iget p0, p0, Landroidx/appcompat/widget/Toolbar;->onSetPlaybackSpeed:I

    return p0
.end method

.method public final RemoteActionCompatParcelizer()V
    .registers 1

    .line 667
    iget-object p0, p0, Landroidx/appcompat/widget/Toolbar;->MediaBrowserCompatCustomActionResultReceiver:Landroidx/appcompat/widget/ActionMenuView;

    if-eqz p0, :cond_7

    .line 668
    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionMenuView;->RemoteActionCompatParcelizer()V

    :cond_7
    return-void
.end method

.method public final S_()V
    .registers 1

    .line 799
    iget-object p0, p0, Landroidx/appcompat/widget/Toolbar;->onAddQueueItem:Landroidx/appcompat/widget/Toolbar$write;

    if-nez p0, :cond_6

    const/4 p0, 0x0

    goto :goto_8

    .line 800
    :cond_6
    iget-object p0, p0, Landroidx/appcompat/widget/Toolbar$write;->write:Lo/onRetainNonConfigurationInstance;

    :goto_8
    if-eqz p0, :cond_d

    .line 802
    invoke-virtual {p0}, Lo/onRetainNonConfigurationInstance;->collapseActionView()Z

    :cond_d
    return-void
.end method

.method public addMenuProvider(Lo/UntypedObjectDeserializerNRScope;)V
    .registers 2

    .line 2480
    iget-object p0, p0, Landroidx/appcompat/widget/Toolbar;->read:Lo/mapObject;

    invoke-virtual {p0, p1}, Lo/mapObject;->AudioAttributesCompatParcelizer(Lo/UntypedObjectDeserializerNRScope;)V

    return-void
.end method

.method protected checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z
    .registers 2

    .line 2359
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z

    move-result p0

    if-eqz p0, :cond_c

    instance-of p0, p1, Landroidx/appcompat/widget/Toolbar$LayoutParams;

    if-eqz p0, :cond_c

    const/4 p0, 0x1

    return p0

    :cond_c
    const/4 p0, 0x0

    return p0
.end method

.method protected synthetic generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    .registers 1

    .line 158
    invoke-static {}, Landroidx/appcompat/widget/Toolbar;->AudioAttributesImplApi26Parcelizer()Landroidx/appcompat/widget/Toolbar$LayoutParams;

    move-result-object p0

    return-object p0
.end method

.method public synthetic generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams;
    .registers 2

    .line 158
    invoke-direct {p0, p1}, Landroidx/appcompat/widget/Toolbar;->AudioAttributesCompatParcelizer(Landroid/util/AttributeSet;)Landroidx/appcompat/widget/Toolbar$LayoutParams;

    move-result-object p0

    return-object p0
.end method

.method protected synthetic generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;
    .registers 2

    .line 158
    invoke-static {p1}, Landroidx/appcompat/widget/Toolbar;->read(Landroid/view/ViewGroup$LayoutParams;)Landroidx/appcompat/widget/Toolbar$LayoutParams;

    move-result-object p0

    return-object p0
.end method

.method public final handleMediaPlayPauseIfPendingOnHandler()Lo/ActionBarLayoutParams;
    .registers 3

    .line 2365
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->MediaSessionCompatToken:Lo/setIcon;

    if-nez v0, :cond_c

    .line 2366
    new-instance v0, Lo/setIcon;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lo/setIcon;-><init>(Landroidx/appcompat/widget/Toolbar;Z)V

    iput-object v0, p0, Landroidx/appcompat/widget/Toolbar;->MediaSessionCompatToken:Lo/setIcon;

    .line 2368
    :cond_c
    iget-object p0, p0, Landroidx/appcompat/widget/Toolbar;->MediaSessionCompatToken:Lo/setIcon;

    return-object p0
.end method

.method public final onAddQueueItem()Z
    .registers 1

    .line 785
    iget-object p0, p0, Landroidx/appcompat/widget/Toolbar;->onAddQueueItem:Landroidx/appcompat/widget/Toolbar$write;

    if-eqz p0, :cond_a

    iget-object p0, p0, Landroidx/appcompat/widget/Toolbar$write;->write:Lo/onRetainNonConfigurationInstance;

    if-eqz p0, :cond_a

    const/4 p0, 0x1

    return p0

    :cond_a
    const/4 p0, 0x0

    return p0
.end method

.method public onAttachedToWindow()V
    .registers 1

    .line 1709
    invoke-super {p0}, Landroid/view/ViewGroup;->onAttachedToWindow()V

    .line 1710
    invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->onPlayFromMediaId()V

    return-void
.end method

.method public final onCommand()Z
    .registers 1

    .line 620
    iget-object p0, p0, Landroidx/appcompat/widget/Toolbar;->MediaBrowserCompatCustomActionResultReceiver:Landroidx/appcompat/widget/ActionMenuView;

    if-eqz p0, :cond_c

    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionMenuView;->AudioAttributesCompatParcelizer()Z

    move-result p0

    if-eqz p0, :cond_c

    const/4 p0, 0x1

    return p0

    :cond_c
    const/4 p0, 0x0

    return p0
.end method

.method public final onCustomAction()I
    .registers 1

    .line 499
    iget p0, p0, Landroidx/appcompat/widget/Toolbar;->onSkipToQueueItem:I

    return p0
.end method

.method protected onDetachedFromWindow()V
    .registers 2

    .line 1702
    invoke-super {p0}, Landroid/view/ViewGroup;->onDetachedFromWindow()V

    .line 1703
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->onRemoveQueueItem:Ljava/lang/Runnable;

    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 1704
    invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->onPlayFromMediaId()V

    return-void
.end method

.method public final onFastForward()Z
    .registers 1

    .line 596
    iget-object p0, p0, Landroidx/appcompat/widget/Toolbar;->MediaBrowserCompatCustomActionResultReceiver:Landroidx/appcompat/widget/ActionMenuView;

    if-eqz p0, :cond_c

    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionMenuView;->MediaBrowserCompatItemReceiver()Z

    move-result p0

    if-eqz p0, :cond_c

    const/4 p0, 0x1

    return p0

    :cond_c
    const/4 p0, 0x0

    return p0
.end method

.method public onHoverEvent(Landroid/view/MotionEvent;)Z
    .registers 7

    .line 1744
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    const/4 v1, 0x0

    const/16 v2, 0x9

    if-ne v0, v2, :cond_b

    .line 1746
    iput-boolean v1, p0, Landroidx/appcompat/widget/Toolbar;->onCustomAction:Z

    .line 1749
    :cond_b
    iget-boolean v3, p0, Landroidx/appcompat/widget/Toolbar;->onCustomAction:Z

    const/4 v4, 0x1

    if-nez v3, :cond_1a

    .line 1750
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onHoverEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    if-ne v0, v2, :cond_1a

    if-nez p1, :cond_1a

    .line 1752
    iput-boolean v4, p0, Landroidx/appcompat/widget/Toolbar;->onCustomAction:Z

    :cond_1a
    const/16 p1, 0xa

    if-eq v0, p1, :cond_21

    const/4 p1, 0x3

    if-ne v0, p1, :cond_23

    .line 1757
    :cond_21
    iput-boolean v1, p0, Landroidx/appcompat/widget/Toolbar;->onCustomAction:Z

    :cond_23
    return v4
.end method

.method public onLayout(ZIIII)V
    .registers 25

    move-object/from16 v0, p0

    .line 1963
    invoke-static/range {p0 .. p0}, Lo/InvalidTypeIdException;->MediaBrowserCompatMediaItem(Landroid/view/View;)I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-ne v1, v3, :cond_c

    move v1, v3

    goto :goto_d

    :cond_c
    move v1, v2

    .line 1964
    :goto_d
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getWidth()I

    move-result v4

    .line 1965
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getHeight()I

    move-result v5

    .line 1966
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v6

    .line 1967
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingRight()I

    move-result v7

    .line 1968
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingTop()I

    move-result v8

    .line 1969
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v9

    sub-int v10, v4, v7

    .line 1973
    iget-object v11, v0, Landroidx/appcompat/widget/Toolbar;->onSetRepeatMode:[I

    .line 1974
    aput v2, v11, v3

    aput v2, v11, v2

    .line 1977
    invoke-static/range {p0 .. p0}, Lo/InvalidTypeIdException;->RatingCompat(Landroid/view/View;)I

    move-result v12

    if-ltz v12, :cond_3a

    sub-int v13, p5, p3

    .line 1978
    invoke-static {v12, v13}, Ljava/lang/Math;->min(II)I

    move-result v12

    goto :goto_3b

    :cond_3a
    move v12, v2

    .line 1980
    :goto_3b
    iget-object v13, v0, Landroidx/appcompat/widget/Toolbar;->onPlayFromSearch:Landroid/widget/ImageButton;

    invoke-direct {v0, v13}, Landroidx/appcompat/widget/Toolbar;->IconCompatParcelizer(Landroid/view/View;)Z

    move-result v13

    if-eqz v13, :cond_55

    if-eqz v1, :cond_4e

    .line 1982
    iget-object v13, v0, Landroidx/appcompat/widget/Toolbar;->onPlayFromSearch:Landroid/widget/ImageButton;

    invoke-direct {v0, v13, v10, v11, v12}, Landroidx/appcompat/widget/Toolbar;->write(Landroid/view/View;I[II)I

    move-result v13

    move v14, v13

    move v13, v6

    goto :goto_57

    .line 1985
    :cond_4e
    iget-object v13, v0, Landroidx/appcompat/widget/Toolbar;->onPlayFromSearch:Landroid/widget/ImageButton;

    invoke-direct {v0, v13, v6, v11, v12}, Landroidx/appcompat/widget/Toolbar;->RemoteActionCompatParcelizer(Landroid/view/View;I[II)I

    move-result v13

    goto :goto_56

    :cond_55
    move v13, v6

    :goto_56
    move v14, v10

    .line 1990
    :goto_57
    iget-object v15, v0, Landroidx/appcompat/widget/Toolbar;->write:Landroid/widget/ImageButton;

    invoke-direct {v0, v15}, Landroidx/appcompat/widget/Toolbar;->IconCompatParcelizer(Landroid/view/View;)Z

    move-result v15

    if-eqz v15, :cond_6e

    if-eqz v1, :cond_68

    .line 1992
    iget-object v15, v0, Landroidx/appcompat/widget/Toolbar;->write:Landroid/widget/ImageButton;

    invoke-direct {v0, v15, v14, v11, v12}, Landroidx/appcompat/widget/Toolbar;->write(Landroid/view/View;I[II)I

    move-result v14

    goto :goto_6e

    .line 1995
    :cond_68
    iget-object v15, v0, Landroidx/appcompat/widget/Toolbar;->write:Landroid/widget/ImageButton;

    invoke-direct {v0, v15, v13, v11, v12}, Landroidx/appcompat/widget/Toolbar;->RemoteActionCompatParcelizer(Landroid/view/View;I[II)I

    move-result v13

    .line 2000
    :cond_6e
    :goto_6e
    iget-object v15, v0, Landroidx/appcompat/widget/Toolbar;->MediaBrowserCompatCustomActionResultReceiver:Landroidx/appcompat/widget/ActionMenuView;

    invoke-direct {v0, v15}, Landroidx/appcompat/widget/Toolbar;->IconCompatParcelizer(Landroid/view/View;)Z

    move-result v15

    if-eqz v15, :cond_85

    if-eqz v1, :cond_7f

    .line 2002
    iget-object v15, v0, Landroidx/appcompat/widget/Toolbar;->MediaBrowserCompatCustomActionResultReceiver:Landroidx/appcompat/widget/ActionMenuView;

    invoke-direct {v0, v15, v13, v11, v12}, Landroidx/appcompat/widget/Toolbar;->RemoteActionCompatParcelizer(Landroid/view/View;I[II)I

    move-result v13

    goto :goto_85

    .line 2005
    :cond_7f
    iget-object v15, v0, Landroidx/appcompat/widget/Toolbar;->MediaBrowserCompatCustomActionResultReceiver:Landroidx/appcompat/widget/ActionMenuView;

    invoke-direct {v0, v15, v14, v11, v12}, Landroidx/appcompat/widget/Toolbar;->write(Landroid/view/View;I[II)I

    move-result v14

    .line 2010
    :cond_85
    :goto_85
    invoke-direct/range {p0 .. p0}, Landroidx/appcompat/widget/Toolbar;->onSetRating()I

    move-result v15

    .line 2011
    invoke-direct/range {p0 .. p0}, Landroidx/appcompat/widget/Toolbar;->onSetCaptioningEnabled()I

    move-result v16

    sub-int v3, v15, v13

    .line 2012
    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    aput v3, v11, v2

    sub-int v3, v10, v14

    sub-int v3, v16, v3

    .line 2013
    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    const/16 v17, 0x1

    aput v3, v11, v17

    .line 2014
    invoke-static {v13, v15}, Ljava/lang/Math;->max(II)I

    move-result v3

    sub-int v10, v10, v16

    .line 2015
    invoke-static {v14, v10}, Ljava/lang/Math;->min(II)I

    move-result v10

    .line 2017
    iget-object v13, v0, Landroidx/appcompat/widget/Toolbar;->AudioAttributesCompatParcelizer:Landroid/view/View;

    invoke-direct {v0, v13}, Landroidx/appcompat/widget/Toolbar;->IconCompatParcelizer(Landroid/view/View;)Z

    move-result v13

    if-eqz v13, :cond_c2

    if-eqz v1, :cond_bc

    .line 2019
    iget-object v13, v0, Landroidx/appcompat/widget/Toolbar;->AudioAttributesCompatParcelizer:Landroid/view/View;

    invoke-direct {v0, v13, v10, v11, v12}, Landroidx/appcompat/widget/Toolbar;->write(Landroid/view/View;I[II)I

    move-result v10

    goto :goto_c2

    .line 2022
    :cond_bc
    iget-object v13, v0, Landroidx/appcompat/widget/Toolbar;->AudioAttributesCompatParcelizer:Landroid/view/View;

    invoke-direct {v0, v13, v3, v11, v12}, Landroidx/appcompat/widget/Toolbar;->RemoteActionCompatParcelizer(Landroid/view/View;I[II)I

    move-result v3

    .line 2027
    :cond_c2
    :goto_c2
    iget-object v13, v0, Landroidx/appcompat/widget/Toolbar;->onPlayFromMediaId:Landroid/widget/ImageView;

    invoke-direct {v0, v13}, Landroidx/appcompat/widget/Toolbar;->IconCompatParcelizer(Landroid/view/View;)Z

    move-result v13

    if-eqz v13, :cond_d9

    if-eqz v1, :cond_d3

    .line 2029
    iget-object v13, v0, Landroidx/appcompat/widget/Toolbar;->onPlayFromMediaId:Landroid/widget/ImageView;

    invoke-direct {v0, v13, v10, v11, v12}, Landroidx/appcompat/widget/Toolbar;->write(Landroid/view/View;I[II)I

    move-result v10

    goto :goto_d9

    .line 2032
    :cond_d3
    iget-object v13, v0, Landroidx/appcompat/widget/Toolbar;->onPlayFromMediaId:Landroid/widget/ImageView;

    invoke-direct {v0, v13, v3, v11, v12}, Landroidx/appcompat/widget/Toolbar;->RemoteActionCompatParcelizer(Landroid/view/View;I[II)I

    move-result v3

    .line 2037
    :cond_d9
    :goto_d9
    iget-object v13, v0, Landroidx/appcompat/widget/Toolbar;->onSkipToPrevious:Landroid/widget/TextView;

    invoke-direct {v0, v13}, Landroidx/appcompat/widget/Toolbar;->IconCompatParcelizer(Landroid/view/View;)Z

    move-result v13

    .line 2038
    iget-object v14, v0, Landroidx/appcompat/widget/Toolbar;->onRewind:Landroid/widget/TextView;

    invoke-direct {v0, v14}, Landroidx/appcompat/widget/Toolbar;->IconCompatParcelizer(Landroid/view/View;)Z

    move-result v14

    if-eqz v13, :cond_fe

    .line 2041
    iget-object v15, v0, Landroidx/appcompat/widget/Toolbar;->onSkipToPrevious:Landroid/widget/TextView;

    invoke-virtual {v15}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v15

    check-cast v15, Landroidx/appcompat/widget/Toolbar$LayoutParams;

    .line 2042
    iget v2, v15, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    move/from16 p4, v7

    iget-object v7, v0, Landroidx/appcompat/widget/Toolbar;->onSkipToPrevious:Landroid/widget/TextView;

    invoke-virtual {v7}, Landroid/view/View;->getMeasuredHeight()I

    move-result v7

    iget v15, v15, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    add-int/2addr v2, v7

    add-int/2addr v2, v15

    goto :goto_101

    :cond_fe
    move/from16 p4, v7

    const/4 v2, 0x0

    :goto_101
    if-eqz v14, :cond_11b

    .line 2045
    iget-object v7, v0, Landroidx/appcompat/widget/Toolbar;->onRewind:Landroid/widget/TextView;

    invoke-virtual {v7}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v7

    check-cast v7, Landroidx/appcompat/widget/Toolbar$LayoutParams;

    .line 2046
    iget v15, v7, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    move/from16 v16, v4

    iget-object v4, v0, Landroidx/appcompat/widget/Toolbar;->onRewind:Landroid/widget/TextView;

    invoke-virtual {v4}, Landroid/view/View;->getMeasuredHeight()I

    move-result v4

    add-int/2addr v15, v4

    iget v4, v7, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    add-int/2addr v15, v4

    add-int/2addr v2, v15

    goto :goto_11d

    :cond_11b
    move/from16 v16, v4

    :goto_11d
    if-nez v13, :cond_127

    if-nez v14, :cond_127

    move/from16 v18, v6

    move/from16 p3, v12

    goto/16 :goto_21f

    :cond_127
    if-eqz v13, :cond_12c

    .line 2051
    iget-object v4, v0, Landroidx/appcompat/widget/Toolbar;->onSkipToPrevious:Landroid/widget/TextView;

    goto :goto_12e

    :cond_12c
    iget-object v4, v0, Landroidx/appcompat/widget/Toolbar;->onRewind:Landroid/widget/TextView;

    :goto_12e
    if-eqz v14, :cond_133

    .line 2052
    iget-object v7, v0, Landroidx/appcompat/widget/Toolbar;->onRewind:Landroid/widget/TextView;

    goto :goto_135

    :cond_133
    iget-object v7, v0, Landroidx/appcompat/widget/Toolbar;->onSkipToPrevious:Landroid/widget/TextView;

    .line 2053
    :goto_135
    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    check-cast v4, Landroidx/appcompat/widget/Toolbar$LayoutParams;

    .line 2054
    invoke-virtual {v7}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v7

    check-cast v7, Landroidx/appcompat/widget/Toolbar$LayoutParams;

    if-eqz v13, :cond_14b

    .line 2055
    iget-object v15, v0, Landroidx/appcompat/widget/Toolbar;->onSkipToPrevious:Landroid/widget/TextView;

    invoke-virtual {v15}, Landroid/view/View;->getMeasuredWidth()I

    move-result v15

    if-gtz v15, :cond_155

    :cond_14b
    if-eqz v14, :cond_158

    iget-object v15, v0, Landroidx/appcompat/widget/Toolbar;->onRewind:Landroid/widget/TextView;

    .line 2056
    invoke-virtual {v15}, Landroid/view/View;->getMeasuredWidth()I

    move-result v15

    if-lez v15, :cond_158

    :cond_155
    const/16 v17, 0x1

    goto :goto_15a

    :cond_158
    const/16 v17, 0x0

    .line 2058
    :goto_15a
    iget v15, v0, Landroidx/appcompat/widget/Toolbar;->onPause:I

    and-int/lit8 v15, v15, 0x70

    move/from16 v18, v6

    const/16 v6, 0x30

    if-eq v15, v6, :cond_1a3

    const/16 v6, 0x50

    if-eq v15, v6, :cond_197

    sub-int v6, v5, v8

    sub-int/2addr v6, v9

    sub-int/2addr v6, v2

    .line 2065
    div-int/lit8 v6, v6, 0x2

    .line 2066
    iget v15, v4, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    move/from16 p3, v12

    iget v12, v0, Landroidx/appcompat/widget/Toolbar;->onSkipToQueueItem:I

    add-int/2addr v15, v12

    if-ge v6, v15, :cond_17e

    .line 2067
    iget v2, v4, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iget v4, v0, Landroidx/appcompat/widget/Toolbar;->onSkipToQueueItem:I

    add-int v6, v2, v4

    goto :goto_195

    :cond_17e
    sub-int/2addr v5, v9

    sub-int/2addr v5, v2

    sub-int/2addr v5, v6

    sub-int/2addr v5, v8

    .line 2071
    iget v2, v4, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    iget v4, v0, Landroidx/appcompat/widget/Toolbar;->onSetPlaybackSpeed:I

    add-int/2addr v2, v4

    if-ge v5, v2, :cond_195

    .line 2072
    iget v2, v7, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    iget v4, v0, Landroidx/appcompat/widget/Toolbar;->onSetPlaybackSpeed:I

    add-int/2addr v2, v4

    sub-int/2addr v2, v5

    sub-int/2addr v6, v2

    const/4 v2, 0x0

    invoke-static {v2, v6}, Ljava/lang/Math;->max(II)I

    move-result v6

    :cond_195
    :goto_195
    add-int/2addr v8, v6

    goto :goto_1b0

    :cond_197
    move/from16 p3, v12

    sub-int/2addr v5, v9

    .line 2079
    iget v4, v7, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    sub-int/2addr v5, v4

    iget v4, v0, Landroidx/appcompat/widget/Toolbar;->onSetPlaybackSpeed:I

    sub-int/2addr v5, v4

    sub-int v8, v5, v2

    goto :goto_1b0

    :cond_1a3
    move/from16 p3, v12

    .line 2060
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingTop()I

    move-result v2

    iget v4, v4, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    add-int/2addr v2, v4

    iget v4, v0, Landroidx/appcompat/widget/Toolbar;->onSkipToQueueItem:I

    add-int v8, v2, v4

    :goto_1b0
    if-eqz v1, :cond_221

    if-eqz v17, :cond_1b7

    .line 2084
    iget v1, v0, Landroidx/appcompat/widget/Toolbar;->onSetRating:I

    goto :goto_1b8

    :cond_1b7
    const/4 v1, 0x0

    :goto_1b8
    const/4 v2, 0x1

    aget v4, v11, v2

    sub-int/2addr v1, v4

    const/4 v4, 0x0

    .line 2085
    invoke-static {v4, v1}, Ljava/lang/Math;->max(II)I

    move-result v5

    sub-int/2addr v10, v5

    neg-int v1, v1

    .line 2086
    invoke-static {v4, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    aput v1, v11, v2

    if-eqz v13, :cond_1ef

    .line 2091
    iget-object v1, v0, Landroidx/appcompat/widget/Toolbar;->onSkipToPrevious:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroidx/appcompat/widget/Toolbar$LayoutParams;

    .line 2092
    iget-object v2, v0, Landroidx/appcompat/widget/Toolbar;->onSkipToPrevious:Landroid/widget/TextView;

    invoke-virtual {v2}, Landroid/view/View;->getMeasuredWidth()I

    move-result v2

    sub-int v2, v10, v2

    .line 2093
    iget-object v4, v0, Landroidx/appcompat/widget/Toolbar;->onSkipToPrevious:Landroid/widget/TextView;

    invoke-virtual {v4}, Landroid/view/View;->getMeasuredHeight()I

    move-result v4

    add-int/2addr v4, v8

    .line 2094
    iget-object v5, v0, Landroidx/appcompat/widget/Toolbar;->onSkipToPrevious:Landroid/widget/TextView;

    invoke-virtual {v5, v2, v8, v10, v4}, Landroid/view/View;->layout(IIII)V

    .line 2095
    iget v5, v0, Landroidx/appcompat/widget/Toolbar;->onSetShuffleMode:I

    sub-int/2addr v2, v5

    .line 2096
    iget v1, v1, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    add-int v8, v4, v1

    goto :goto_1f0

    :cond_1ef
    move v2, v10

    :goto_1f0
    if-eqz v14, :cond_218

    .line 2099
    iget-object v1, v0, Landroidx/appcompat/widget/Toolbar;->onRewind:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroidx/appcompat/widget/Toolbar$LayoutParams;

    .line 2100
    iget v4, v1, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    add-int/2addr v8, v4

    .line 2101
    iget-object v4, v0, Landroidx/appcompat/widget/Toolbar;->onRewind:Landroid/widget/TextView;

    invoke-virtual {v4}, Landroid/view/View;->getMeasuredWidth()I

    move-result v4

    .line 2102
    iget-object v5, v0, Landroidx/appcompat/widget/Toolbar;->onRewind:Landroid/widget/TextView;

    invoke-virtual {v5}, Landroid/view/View;->getMeasuredHeight()I

    move-result v5

    .line 2103
    iget-object v6, v0, Landroidx/appcompat/widget/Toolbar;->onRewind:Landroid/widget/TextView;

    sub-int v4, v10, v4

    add-int/2addr v5, v8

    invoke-virtual {v6, v4, v8, v10, v5}, Landroid/view/View;->layout(IIII)V

    .line 2104
    iget v4, v0, Landroidx/appcompat/widget/Toolbar;->onSetShuffleMode:I

    sub-int v4, v10, v4

    .line 2105
    iget v1, v1, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    goto :goto_219

    :cond_218
    move v4, v10

    :goto_219
    if-eqz v17, :cond_21f

    .line 2108
    invoke-static {v2, v4}, Ljava/lang/Math;->min(II)I

    move-result v10

    :cond_21f
    :goto_21f
    const/4 v1, 0x0

    goto :goto_28b

    :cond_221
    if-eqz v17, :cond_227

    .line 2111
    iget v2, v0, Landroidx/appcompat/widget/Toolbar;->onSetRating:I

    const/4 v1, 0x0

    goto :goto_229

    :cond_227
    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_229
    aget v4, v11, v1

    sub-int/2addr v2, v4

    .line 2112
    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v4

    add-int/2addr v3, v4

    neg-int v2, v2

    .line 2113
    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    aput v2, v11, v1

    if-eqz v13, :cond_25d

    .line 2118
    iget-object v2, v0, Landroidx/appcompat/widget/Toolbar;->onSkipToPrevious:Landroid/widget/TextView;

    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    check-cast v2, Landroidx/appcompat/widget/Toolbar$LayoutParams;

    .line 2119
    iget-object v4, v0, Landroidx/appcompat/widget/Toolbar;->onSkipToPrevious:Landroid/widget/TextView;

    invoke-virtual {v4}, Landroid/view/View;->getMeasuredWidth()I

    move-result v4

    add-int/2addr v4, v3

    .line 2120
    iget-object v5, v0, Landroidx/appcompat/widget/Toolbar;->onSkipToPrevious:Landroid/widget/TextView;

    invoke-virtual {v5}, Landroid/view/View;->getMeasuredHeight()I

    move-result v5

    add-int/2addr v5, v8

    .line 2121
    iget-object v6, v0, Landroidx/appcompat/widget/Toolbar;->onSkipToPrevious:Landroid/widget/TextView;

    invoke-virtual {v6, v3, v8, v4, v5}, Landroid/view/View;->layout(IIII)V

    .line 2122
    iget v6, v0, Landroidx/appcompat/widget/Toolbar;->onSetShuffleMode:I

    add-int/2addr v4, v6

    .line 2123
    iget v2, v2, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    add-int v8, v5, v2

    goto :goto_25e

    :cond_25d
    move v4, v3

    :goto_25e
    if-eqz v14, :cond_284

    .line 2126
    iget-object v2, v0, Landroidx/appcompat/widget/Toolbar;->onRewind:Landroid/widget/TextView;

    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    check-cast v2, Landroidx/appcompat/widget/Toolbar$LayoutParams;

    .line 2127
    iget v5, v2, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    add-int/2addr v8, v5

    .line 2128
    iget-object v5, v0, Landroidx/appcompat/widget/Toolbar;->onRewind:Landroid/widget/TextView;

    invoke-virtual {v5}, Landroid/view/View;->getMeasuredWidth()I

    move-result v5

    add-int/2addr v5, v3

    .line 2129
    iget-object v6, v0, Landroidx/appcompat/widget/Toolbar;->onRewind:Landroid/widget/TextView;

    invoke-virtual {v6}, Landroid/view/View;->getMeasuredHeight()I

    move-result v6

    .line 2130
    iget-object v7, v0, Landroidx/appcompat/widget/Toolbar;->onRewind:Landroid/widget/TextView;

    add-int/2addr v6, v8

    invoke-virtual {v7, v3, v8, v5, v6}, Landroid/view/View;->layout(IIII)V

    .line 2131
    iget v6, v0, Landroidx/appcompat/widget/Toolbar;->onSetShuffleMode:I

    add-int/2addr v5, v6

    .line 2132
    iget v2, v2, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    goto :goto_285

    :cond_284
    move v5, v3

    :goto_285
    if-eqz v17, :cond_28b

    .line 2135
    invoke-static {v4, v5}, Ljava/lang/Math;->max(II)I

    move-result v3

    .line 2143
    :cond_28b
    :goto_28b
    iget-object v2, v0, Landroidx/appcompat/widget/Toolbar;->onSetCaptioningEnabled:Ljava/util/ArrayList;

    const/4 v4, 0x3

    invoke-direct {v0, v2, v4}, Landroidx/appcompat/widget/Toolbar;->read(Ljava/util/List;I)V

    .line 2144
    iget-object v2, v0, Landroidx/appcompat/widget/Toolbar;->onSetCaptioningEnabled:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/AbstractCollection;->size()I

    move-result v2

    move v4, v3

    move v3, v1

    :goto_299
    if-ge v3, v2, :cond_2ac

    .line 2146
    iget-object v5, v0, Landroidx/appcompat/widget/Toolbar;->onSetCaptioningEnabled:Ljava/util/ArrayList;

    invoke-virtual {v5, v3}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/view/View;

    move/from16 v12, p3

    invoke-direct {v0, v5, v4, v11, v12}, Landroidx/appcompat/widget/Toolbar;->RemoteActionCompatParcelizer(Landroid/view/View;I[II)I

    move-result v4

    add-int/lit8 v3, v3, 0x1

    goto :goto_299

    :cond_2ac
    move/from16 v12, p3

    .line 2150
    iget-object v2, v0, Landroidx/appcompat/widget/Toolbar;->onSetCaptioningEnabled:Ljava/util/ArrayList;

    const/4 v3, 0x5

    invoke-direct {v0, v2, v3}, Landroidx/appcompat/widget/Toolbar;->read(Ljava/util/List;I)V

    .line 2151
    iget-object v2, v0, Landroidx/appcompat/widget/Toolbar;->onSetCaptioningEnabled:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/AbstractCollection;->size()I

    move-result v2

    move v3, v1

    :goto_2bb
    if-ge v3, v2, :cond_2cc

    .line 2153
    iget-object v5, v0, Landroidx/appcompat/widget/Toolbar;->onSetCaptioningEnabled:Ljava/util/ArrayList;

    invoke-virtual {v5, v3}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/view/View;

    invoke-direct {v0, v5, v10, v11, v12}, Landroidx/appcompat/widget/Toolbar;->write(Landroid/view/View;I[II)I

    move-result v10

    add-int/lit8 v3, v3, 0x1

    goto :goto_2bb

    .line 2159
    :cond_2cc
    iget-object v2, v0, Landroidx/appcompat/widget/Toolbar;->onSetCaptioningEnabled:Ljava/util/ArrayList;

    const/4 v3, 0x1

    invoke-direct {v0, v2, v3}, Landroidx/appcompat/widget/Toolbar;->read(Ljava/util/List;I)V

    .line 2160
    iget-object v2, v0, Landroidx/appcompat/widget/Toolbar;->onSetCaptioningEnabled:Ljava/util/ArrayList;

    invoke-static {v2, v11}, Landroidx/appcompat/widget/Toolbar;->RemoteActionCompatParcelizer(Ljava/util/List;[I)I

    move-result v2

    sub-int v3, v16, v18

    sub-int v3, v3, p4

    .line 2161
    div-int/lit8 v3, v3, 0x2

    add-int v6, v18, v3

    .line 2162
    div-int/lit8 v3, v2, 0x2

    sub-int/2addr v6, v3

    add-int/2addr v2, v6

    if-lt v6, v4, :cond_2ed

    if-le v2, v10, :cond_2ec

    sub-int/2addr v2, v10

    sub-int v4, v6, v2

    goto :goto_2ed

    :cond_2ec
    move v4, v6

    .line 2171
    :cond_2ed
    :goto_2ed
    iget-object v2, v0, Landroidx/appcompat/widget/Toolbar;->onSetCaptioningEnabled:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/AbstractCollection;->size()I

    move-result v2

    :goto_2f3
    if-ge v1, v2, :cond_304

    .line 2173
    iget-object v3, v0, Landroidx/appcompat/widget/Toolbar;->onSetCaptioningEnabled:Ljava/util/ArrayList;

    invoke-virtual {v3, v1}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/View;

    invoke-direct {v0, v3, v4, v11, v12}, Landroidx/appcompat/widget/Toolbar;->RemoteActionCompatParcelizer(Landroid/view/View;I[II)I

    move-result v4

    add-int/lit8 v1, v1, 0x1

    goto :goto_2f3

    .line 2177
    :cond_304
    iget-object v0, v0, Landroidx/appcompat/widget/Toolbar;->onSetCaptioningEnabled:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->clear()V

    return-void
.end method

.method public onMeasure(II)V
    .registers 19

    move-object/from16 v7, p0

    .line 1833
    iget-object v8, v7, Landroidx/appcompat/widget/Toolbar;->onSetRepeatMode:[I

    .line 1836
    invoke-static/range {p0 .. p0}, Lo/setChecked;->AudioAttributesCompatParcelizer(Landroid/view/View;)Z

    move-result v6

    .line 1847
    iget-object v0, v7, Landroidx/appcompat/widget/Toolbar;->onPlayFromSearch:Landroid/widget/ImageButton;

    invoke-direct {v7, v0}, Landroidx/appcompat/widget/Toolbar;->IconCompatParcelizer(Landroid/view/View;)Z

    move-result v0

    const/4 v9, 0x0

    if-eqz v0, :cond_4a

    .line 1848
    iget-object v1, v7, Landroidx/appcompat/widget/Toolbar;->onPlayFromSearch:Landroid/widget/ImageButton;

    const/4 v3, 0x0

    iget v5, v7, Landroidx/appcompat/widget/Toolbar;->onFastForward:I

    move-object/from16 v0, p0

    move/from16 v2, p1

    move/from16 v4, p2

    invoke-direct/range {v0 .. v5}, Landroidx/appcompat/widget/Toolbar;->IconCompatParcelizer(Landroid/view/View;IIII)V

    .line 1850
    iget-object v0, v7, Landroidx/appcompat/widget/Toolbar;->onPlayFromSearch:Landroid/widget/ImageButton;

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    iget-object v1, v7, Landroidx/appcompat/widget/Toolbar;->onPlayFromSearch:Landroid/widget/ImageButton;

    invoke-static {v1}, Landroidx/appcompat/widget/Toolbar;->AudioAttributesCompatParcelizer(Landroid/view/View;)I

    move-result v1

    add-int/2addr v0, v1

    .line 1851
    iget-object v1, v7, Landroidx/appcompat/widget/Toolbar;->onPlayFromSearch:Landroid/widget/ImageButton;

    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    move-result v1

    iget-object v2, v7, Landroidx/appcompat/widget/Toolbar;->onPlayFromSearch:Landroid/widget/ImageButton;

    .line 1852
    invoke-static {v2}, Landroidx/appcompat/widget/Toolbar;->write(Landroid/view/View;)I

    move-result v2

    add-int/2addr v1, v2

    .line 1851
    invoke-static {v9, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    .line 1853
    iget-object v2, v7, Landroidx/appcompat/widget/Toolbar;->onPlayFromSearch:Landroid/widget/ImageButton;

    .line 1854
    invoke-virtual {v2}, Landroid/widget/ImageButton;->getMeasuredState()I

    move-result v2

    .line 1853
    invoke-static {v9, v2}, Landroid/view/View;->combineMeasuredStates(II)I

    move-result v2

    move v10, v1

    move v11, v2

    goto :goto_4d

    :cond_4a
    move v0, v9

    move v10, v0

    move v11, v10

    .line 1857
    :goto_4d
    iget-object v1, v7, Landroidx/appcompat/widget/Toolbar;->write:Landroid/widget/ImageButton;

    invoke-direct {v7, v1}, Landroidx/appcompat/widget/Toolbar;->IconCompatParcelizer(Landroid/view/View;)Z

    move-result v1

    if-eqz v1, :cond_8b

    .line 1858
    iget-object v1, v7, Landroidx/appcompat/widget/Toolbar;->write:Landroid/widget/ImageButton;

    const/4 v3, 0x0

    iget v5, v7, Landroidx/appcompat/widget/Toolbar;->onFastForward:I

    move-object/from16 v0, p0

    move/from16 v2, p1

    move/from16 v4, p2

    invoke-direct/range {v0 .. v5}, Landroidx/appcompat/widget/Toolbar;->IconCompatParcelizer(Landroid/view/View;IIII)V

    .line 1860
    iget-object v0, v7, Landroidx/appcompat/widget/Toolbar;->write:Landroid/widget/ImageButton;

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    iget-object v1, v7, Landroidx/appcompat/widget/Toolbar;->write:Landroid/widget/ImageButton;

    .line 1861
    invoke-static {v1}, Landroidx/appcompat/widget/Toolbar;->AudioAttributesCompatParcelizer(Landroid/view/View;)I

    move-result v1

    add-int/2addr v0, v1

    .line 1862
    iget-object v1, v7, Landroidx/appcompat/widget/Toolbar;->write:Landroid/widget/ImageButton;

    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    move-result v1

    iget-object v2, v7, Landroidx/appcompat/widget/Toolbar;->write:Landroid/widget/ImageButton;

    .line 1863
    invoke-static {v2}, Landroidx/appcompat/widget/Toolbar;->write(Landroid/view/View;)I

    move-result v2

    add-int/2addr v1, v2

    .line 1862
    invoke-static {v10, v1}, Ljava/lang/Math;->max(II)I

    move-result v10

    .line 1864
    iget-object v1, v7, Landroidx/appcompat/widget/Toolbar;->write:Landroid/widget/ImageButton;

    .line 1865
    invoke-virtual {v1}, Landroid/widget/ImageButton;->getMeasuredState()I

    move-result v1

    .line 1864
    invoke-static {v11, v1}, Landroid/view/View;->combineMeasuredStates(II)I

    move-result v11

    .line 1868
    :cond_8b
    invoke-direct/range {p0 .. p0}, Landroidx/appcompat/widget/Toolbar;->onStop()I

    move-result v1

    .line 1869
    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v12

    sub-int/2addr v1, v0

    .line 1870
    invoke-static {v9, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    aput v0, v8, v6

    .line 1873
    iget-object v0, v7, Landroidx/appcompat/widget/Toolbar;->MediaBrowserCompatCustomActionResultReceiver:Landroidx/appcompat/widget/ActionMenuView;

    invoke-direct {v7, v0}, Landroidx/appcompat/widget/Toolbar;->IconCompatParcelizer(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_d9

    .line 1874
    iget-object v1, v7, Landroidx/appcompat/widget/Toolbar;->MediaBrowserCompatCustomActionResultReceiver:Landroidx/appcompat/widget/ActionMenuView;

    iget v5, v7, Landroidx/appcompat/widget/Toolbar;->onFastForward:I

    move-object/from16 v0, p0

    move/from16 v2, p1

    move v3, v12

    move/from16 v4, p2

    invoke-direct/range {v0 .. v5}, Landroidx/appcompat/widget/Toolbar;->IconCompatParcelizer(Landroid/view/View;IIII)V

    .line 1876
    iget-object v0, v7, Landroidx/appcompat/widget/Toolbar;->MediaBrowserCompatCustomActionResultReceiver:Landroidx/appcompat/widget/ActionMenuView;

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    iget-object v1, v7, Landroidx/appcompat/widget/Toolbar;->MediaBrowserCompatCustomActionResultReceiver:Landroidx/appcompat/widget/ActionMenuView;

    invoke-static {v1}, Landroidx/appcompat/widget/Toolbar;->AudioAttributesCompatParcelizer(Landroid/view/View;)I

    move-result v1

    add-int/2addr v0, v1

    .line 1877
    iget-object v1, v7, Landroidx/appcompat/widget/Toolbar;->MediaBrowserCompatCustomActionResultReceiver:Landroidx/appcompat/widget/ActionMenuView;

    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    move-result v1

    iget-object v2, v7, Landroidx/appcompat/widget/Toolbar;->MediaBrowserCompatCustomActionResultReceiver:Landroidx/appcompat/widget/ActionMenuView;

    .line 1878
    invoke-static {v2}, Landroidx/appcompat/widget/Toolbar;->write(Landroid/view/View;)I

    move-result v2

    add-int/2addr v1, v2

    .line 1877
    invoke-static {v10, v1}, Ljava/lang/Math;->max(II)I

    move-result v10

    .line 1879
    iget-object v1, v7, Landroidx/appcompat/widget/Toolbar;->MediaBrowserCompatCustomActionResultReceiver:Landroidx/appcompat/widget/ActionMenuView;

    .line 1880
    invoke-virtual {v1}, Landroidx/appcompat/widget/ActionMenuView;->getMeasuredState()I

    move-result v1

    .line 1879
    invoke-static {v11, v1}, Landroid/view/View;->combineMeasuredStates(II)I

    move-result v11

    goto :goto_da

    :cond_d9
    move v0, v9

    .line 1883
    :goto_da
    invoke-direct/range {p0 .. p0}, Landroidx/appcompat/widget/Toolbar;->onSetShuffleMode()I

    move-result v1

    .line 1884
    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v2

    add-int/2addr v12, v2

    xor-int/lit8 v2, v6, 0x1

    sub-int/2addr v1, v0

    .line 1885
    invoke-static {v9, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    aput v0, v8, v2

    .line 1887
    iget-object v0, v7, Landroidx/appcompat/widget/Toolbar;->AudioAttributesCompatParcelizer:Landroid/view/View;

    invoke-direct {v7, v0}, Landroidx/appcompat/widget/Toolbar;->IconCompatParcelizer(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_11f

    .line 1888
    iget-object v1, v7, Landroidx/appcompat/widget/Toolbar;->AudioAttributesCompatParcelizer:Landroid/view/View;

    const/4 v5, 0x0

    move-object/from16 v0, p0

    move/from16 v2, p1

    move v3, v12

    move/from16 v4, p2

    move-object v6, v8

    invoke-direct/range {v0 .. v6}, Landroidx/appcompat/widget/Toolbar;->read(Landroid/view/View;IIII[I)I

    move-result v0

    add-int/2addr v12, v0

    .line 1890
    iget-object v0, v7, Landroidx/appcompat/widget/Toolbar;->AudioAttributesCompatParcelizer:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    iget-object v1, v7, Landroidx/appcompat/widget/Toolbar;->AudioAttributesCompatParcelizer:Landroid/view/View;

    .line 1891
    invoke-static {v1}, Landroidx/appcompat/widget/Toolbar;->write(Landroid/view/View;)I

    move-result v1

    add-int/2addr v0, v1

    .line 1890
    invoke-static {v10, v0}, Ljava/lang/Math;->max(II)I

    move-result v10

    .line 1892
    iget-object v0, v7, Landroidx/appcompat/widget/Toolbar;->AudioAttributesCompatParcelizer:Landroid/view/View;

    .line 1893
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredState()I

    move-result v0

    .line 1892
    invoke-static {v11, v0}, Landroid/view/View;->combineMeasuredStates(II)I

    move-result v11

    .line 1896
    :cond_11f
    iget-object v0, v7, Landroidx/appcompat/widget/Toolbar;->onPlayFromMediaId:Landroid/widget/ImageView;

    invoke-direct {v7, v0}, Landroidx/appcompat/widget/Toolbar;->IconCompatParcelizer(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_152

    .line 1897
    iget-object v1, v7, Landroidx/appcompat/widget/Toolbar;->onPlayFromMediaId:Landroid/widget/ImageView;

    const/4 v5, 0x0

    move-object/from16 v0, p0

    move/from16 v2, p1

    move v3, v12

    move/from16 v4, p2

    move-object v6, v8

    invoke-direct/range {v0 .. v6}, Landroidx/appcompat/widget/Toolbar;->read(Landroid/view/View;IIII[I)I

    move-result v0

    add-int/2addr v12, v0

    .line 1899
    iget-object v0, v7, Landroidx/appcompat/widget/Toolbar;->onPlayFromMediaId:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    iget-object v1, v7, Landroidx/appcompat/widget/Toolbar;->onPlayFromMediaId:Landroid/widget/ImageView;

    .line 1900
    invoke-static {v1}, Landroidx/appcompat/widget/Toolbar;->write(Landroid/view/View;)I

    move-result v1

    add-int/2addr v0, v1

    .line 1899
    invoke-static {v10, v0}, Ljava/lang/Math;->max(II)I

    move-result v10

    .line 1901
    iget-object v0, v7, Landroidx/appcompat/widget/Toolbar;->onPlayFromMediaId:Landroid/widget/ImageView;

    .line 1902
    invoke-virtual {v0}, Landroid/widget/ImageView;->getMeasuredState()I

    move-result v0

    .line 1901
    invoke-static {v11, v0}, Landroid/view/View;->combineMeasuredStates(II)I

    move-result v11

    .line 1905
    :cond_152
    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v13

    move v14, v9

    :goto_157
    if-ge v14, v13, :cond_196

    .line 1907
    invoke-virtual {v7, v14}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v15

    .line 1908
    invoke-virtual {v15}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/appcompat/widget/Toolbar$LayoutParams;

    .line 1909
    iget v0, v0, Landroidx/appcompat/widget/Toolbar$LayoutParams;->RemoteActionCompatParcelizer:I

    if-nez v0, :cond_193

    invoke-direct {v7, v15}, Landroidx/appcompat/widget/Toolbar;->IconCompatParcelizer(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_193

    const/4 v5, 0x0

    move-object/from16 v0, p0

    move-object v1, v15

    move/from16 v2, p1

    move v3, v12

    move/from16 v4, p2

    move-object v6, v8

    .line 1914
    invoke-direct/range {v0 .. v6}, Landroidx/appcompat/widget/Toolbar;->read(Landroid/view/View;IIII[I)I

    move-result v0

    add-int/2addr v12, v0

    .line 1916
    invoke-virtual {v15}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    invoke-static {v15}, Landroidx/appcompat/widget/Toolbar;->write(Landroid/view/View;)I

    move-result v1

    add-int/2addr v0, v1

    invoke-static {v10, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 1917
    invoke-virtual {v15}, Landroid/view/View;->getMeasuredState()I

    move-result v1

    invoke-static {v11, v1}, Landroid/view/View;->combineMeasuredStates(II)I

    move-result v1

    move v10, v0

    move v11, v1

    :cond_193
    add-int/lit8 v14, v14, 0x1

    goto :goto_157

    .line 1922
    :cond_196
    iget v0, v7, Landroidx/appcompat/widget/Toolbar;->onSkipToQueueItem:I

    iget v1, v7, Landroidx/appcompat/widget/Toolbar;->onSetPlaybackSpeed:I

    add-int v13, v0, v1

    .line 1923
    iget v0, v7, Landroidx/appcompat/widget/Toolbar;->onSetRating:I

    iget v1, v7, Landroidx/appcompat/widget/Toolbar;->onSetShuffleMode:I

    add-int v14, v0, v1

    .line 1924
    iget-object v0, v7, Landroidx/appcompat/widget/Toolbar;->onSkipToPrevious:Landroid/widget/TextView;

    invoke-direct {v7, v0}, Landroidx/appcompat/widget/Toolbar;->IconCompatParcelizer(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_1e1

    .line 1925
    iget-object v1, v7, Landroidx/appcompat/widget/Toolbar;->onSkipToPrevious:Landroid/widget/TextView;

    add-int v3, v12, v14

    move-object/from16 v0, p0

    move/from16 v2, p1

    move/from16 v4, p2

    move v5, v13

    move-object v6, v8

    invoke-direct/range {v0 .. v6}, Landroidx/appcompat/widget/Toolbar;->read(Landroid/view/View;IIII[I)I

    .line 1928
    iget-object v0, v7, Landroidx/appcompat/widget/Toolbar;->onSkipToPrevious:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    iget-object v1, v7, Landroidx/appcompat/widget/Toolbar;->onSkipToPrevious:Landroid/widget/TextView;

    invoke-static {v1}, Landroidx/appcompat/widget/Toolbar;->AudioAttributesCompatParcelizer(Landroid/view/View;)I

    move-result v1

    .line 1929
    iget-object v2, v7, Landroidx/appcompat/widget/Toolbar;->onSkipToPrevious:Landroid/widget/TextView;

    invoke-virtual {v2}, Landroid/view/View;->getMeasuredHeight()I

    move-result v2

    iget-object v3, v7, Landroidx/appcompat/widget/Toolbar;->onSkipToPrevious:Landroid/widget/TextView;

    invoke-static {v3}, Landroidx/appcompat/widget/Toolbar;->write(Landroid/view/View;)I

    move-result v3

    .line 1930
    iget-object v4, v7, Landroidx/appcompat/widget/Toolbar;->onSkipToPrevious:Landroid/widget/TextView;

    invoke-virtual {v4}, Landroid/widget/TextView;->getMeasuredState()I

    move-result v4

    invoke-static {v11, v4}, Landroid/view/View;->combineMeasuredStates(II)I

    move-result v11

    add-int/2addr v0, v1

    add-int/2addr v2, v3

    move v15, v2

    move v6, v11

    move v11, v0

    goto :goto_1e4

    :cond_1e1
    move v15, v9

    move v6, v11

    move v11, v15

    .line 1932
    :goto_1e4
    iget-object v0, v7, Landroidx/appcompat/widget/Toolbar;->onRewind:Landroid/widget/TextView;

    invoke-direct {v7, v0}, Landroidx/appcompat/widget/Toolbar;->IconCompatParcelizer(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_21b

    .line 1933
    iget-object v1, v7, Landroidx/appcompat/widget/Toolbar;->onRewind:Landroid/widget/TextView;

    add-int v3, v12, v14

    add-int v5, v13, v15

    move-object/from16 v0, p0

    move/from16 v2, p1

    move/from16 v4, p2

    move v13, v6

    move-object v6, v8

    invoke-direct/range {v0 .. v6}, Landroidx/appcompat/widget/Toolbar;->read(Landroid/view/View;IIII[I)I

    move-result v0

    invoke-static {v11, v0}, Ljava/lang/Math;->max(II)I

    move-result v11

    .line 1937
    iget-object v0, v7, Landroidx/appcompat/widget/Toolbar;->onRewind:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    iget-object v1, v7, Landroidx/appcompat/widget/Toolbar;->onRewind:Landroid/widget/TextView;

    .line 1938
    invoke-static {v1}, Landroidx/appcompat/widget/Toolbar;->write(Landroid/view/View;)I

    move-result v1

    add-int/2addr v0, v1

    add-int/2addr v15, v0

    .line 1939
    iget-object v0, v7, Landroidx/appcompat/widget/Toolbar;->onRewind:Landroid/widget/TextView;

    .line 1940
    invoke-virtual {v0}, Landroid/widget/TextView;->getMeasuredState()I

    move-result v0

    .line 1939
    invoke-static {v13, v0}, Landroid/view/View;->combineMeasuredStates(II)I

    move-result v6

    goto :goto_21c

    :cond_21b
    move v13, v6

    .line 1944
    :goto_21c
    invoke-static {v10, v15}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 1948
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v1

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingRight()I

    move-result v2

    .line 1949
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingTop()I

    move-result v3

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v4

    add-int/2addr v12, v11

    add-int/2addr v1, v2

    add-int/2addr v12, v1

    .line 1952
    invoke-virtual/range {p0 .. p0}, Landroidx/appcompat/widget/Toolbar;->getSuggestedMinimumWidth()I

    move-result v1

    invoke-static {v12, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    const/high16 v2, -0x1000000

    and-int/2addr v2, v6

    move/from16 v5, p1

    .line 1951
    invoke-static {v1, v5, v2}, Landroid/view/View;->resolveSizeAndState(III)I

    move-result v1

    add-int/2addr v3, v4

    add-int/2addr v0, v3

    .line 1955
    invoke-virtual/range {p0 .. p0}, Landroidx/appcompat/widget/Toolbar;->getSuggestedMinimumHeight()I

    move-result v2

    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    move-result v0

    shl-int/lit8 v2, v6, 0x10

    move/from16 v3, p2

    .line 1954
    invoke-static {v0, v3, v2}, Landroid/view/View;->resolveSizeAndState(III)I

    move-result v0

    .line 1958
    invoke-direct/range {p0 .. p0}, Landroidx/appcompat/widget/Toolbar;->onRemoveQueueItemAt()Z

    move-result v2

    if-eqz v2, :cond_25d

    goto :goto_25e

    :cond_25d
    move v9, v0

    :goto_25e
    invoke-virtual {v7, v1, v9}, Landroidx/appcompat/widget/Toolbar;->setMeasuredDimension(II)V

    return-void
.end method

.method final onMediaButtonEvent()V
    .registers 5

    .line 2372
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_6
    if-ltz v0, :cond_26

    .line 2375
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 2376
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    check-cast v2, Landroidx/appcompat/widget/Toolbar$LayoutParams;

    .line 2377
    iget v2, v2, Landroidx/appcompat/widget/Toolbar$LayoutParams;->RemoteActionCompatParcelizer:I

    const/4 v3, 0x2

    if-eq v2, v3, :cond_23

    iget-object v2, p0, Landroidx/appcompat/widget/Toolbar;->MediaBrowserCompatCustomActionResultReceiver:Landroidx/appcompat/widget/ActionMenuView;

    if-eq v1, v2, :cond_23

    .line 2378
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->removeViewAt(I)V

    .line 2379
    iget-object v2, p0, Landroidx/appcompat/widget/Toolbar;->onMediaButtonEvent:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    :cond_23
    add-int/lit8 v0, v0, -0x1

    goto :goto_6

    :cond_26
    return-void
.end method

.method public final onPause()Z
    .registers 1

    .line 602
    iget-object p0, p0, Landroidx/appcompat/widget/Toolbar;->MediaBrowserCompatCustomActionResultReceiver:Landroidx/appcompat/widget/ActionMenuView;

    if-eqz p0, :cond_c

    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionMenuView;->MediaBrowserCompatCustomActionResultReceiver()Z

    move-result p0

    if-eqz p0, :cond_c

    const/4 p0, 0x1

    return p0

    :cond_c
    const/4 p0, 0x0

    return p0
.end method

.method public final onPlay()Z
    .registers 1

    .line 611
    iget-object p0, p0, Landroidx/appcompat/widget/Toolbar;->MediaBrowserCompatCustomActionResultReceiver:Landroidx/appcompat/widget/ActionMenuView;

    if-eqz p0, :cond_c

    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionMenuView;->AudioAttributesImplApi21Parcelizer()Z

    move-result p0

    if-eqz p0, :cond_c

    const/4 p0, 0x1

    return p0

    :cond_c
    const/4 p0, 0x0

    return p0
.end method

.method final onPlayFromMediaId()V
    .registers 4

    .line 2525
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x21

    if-lt v0, v1, :cond_4a

    .line 2527
    invoke-static {p0}, Landroidx/appcompat/widget/Toolbar$AudioAttributesCompatParcelizer;->bF_(Landroid/view/View;)Landroid/window/OnBackInvokedDispatcher;

    move-result-object v0

    .line 2528
    invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->onAddQueueItem()Z

    move-result v1

    if-eqz v1, :cond_1e

    if-eqz v0, :cond_1e

    .line 2530
    invoke-static {p0}, Lo/InvalidTypeIdException;->onPlayFromSearch(Landroid/view/View;)Z

    move-result v1

    if-eqz v1, :cond_1e

    iget-boolean v1, p0, Landroidx/appcompat/widget/Toolbar;->AudioAttributesImplBaseParcelizer:Z

    if-eqz v1, :cond_1e

    const/4 v1, 0x1

    goto :goto_1f

    :cond_1e
    const/4 v1, 0x0

    :goto_1f
    if-eqz v1, :cond_3c

    .line 2533
    iget-object v2, p0, Landroidx/appcompat/widget/Toolbar;->MediaBrowserCompatMediaItem:Landroid/window/OnBackInvokedDispatcher;

    if-nez v2, :cond_3c

    .line 2534
    iget-object v1, p0, Landroidx/appcompat/widget/Toolbar;->AudioAttributesImplApi26Parcelizer:Landroid/window/OnBackInvokedCallback;

    if-nez v1, :cond_34

    .line 2535
    new-instance v1, Lo/ActionMenuItemView;

    invoke-direct {v1, p0}, Lo/ActionMenuItemView;-><init>(Landroidx/appcompat/widget/Toolbar;)V

    invoke-static {v1}, Landroidx/appcompat/widget/Toolbar$AudioAttributesCompatParcelizer;->bG_(Ljava/lang/Runnable;)Landroid/window/OnBackInvokedCallback;

    move-result-object v1

    iput-object v1, p0, Landroidx/appcompat/widget/Toolbar;->AudioAttributesImplApi26Parcelizer:Landroid/window/OnBackInvokedCallback;

    .line 2538
    :cond_34
    iget-object v1, p0, Landroidx/appcompat/widget/Toolbar;->AudioAttributesImplApi26Parcelizer:Landroid/window/OnBackInvokedCallback;

    invoke-static {v0, v1}, Landroidx/appcompat/widget/Toolbar$AudioAttributesCompatParcelizer;->RemoteActionCompatParcelizer(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 2540
    iput-object v0, p0, Landroidx/appcompat/widget/Toolbar;->MediaBrowserCompatMediaItem:Landroid/window/OnBackInvokedDispatcher;

    return-void

    :cond_3c
    if-nez v1, :cond_4a

    .line 2541
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->MediaBrowserCompatMediaItem:Landroid/window/OnBackInvokedDispatcher;

    if-eqz v0, :cond_4a

    .line 2542
    iget-object v1, p0, Landroidx/appcompat/widget/Toolbar;->AudioAttributesImplApi26Parcelizer:Landroid/window/OnBackInvokedCallback;

    invoke-static {v0, v1}, Landroidx/appcompat/widget/Toolbar$AudioAttributesCompatParcelizer;->IconCompatParcelizer(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v0, 0x0

    .line 2544
    iput-object v0, p0, Landroidx/appcompat/widget/Toolbar;->MediaBrowserCompatMediaItem:Landroid/window/OnBackInvokedDispatcher;

    :cond_4a
    return-void
.end method

.method public onRestoreInstanceState(Landroid/os/Parcelable;)V
    .registers 4

    .line 1674
    instance-of v0, p1, Landroidx/appcompat/widget/Toolbar$SavedState;

    if-nez v0, :cond_8

    .line 1675
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    return-void

    .line 1679
    :cond_8
    check-cast p1, Landroidx/appcompat/widget/Toolbar$SavedState;

    .line 1680
    invoke-virtual {p1}, Landroidx/customview/view/AbsSavedState;->read()Landroid/os/Parcelable;

    move-result-object v0

    invoke-super {p0, v0}, Landroid/view/ViewGroup;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 1682
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->MediaBrowserCompatCustomActionResultReceiver:Landroidx/appcompat/widget/ActionMenuView;

    if-eqz v0, :cond_1a

    invoke-virtual {v0}, Landroidx/appcompat/widget/ActionMenuView;->AudioAttributesImplApi26Parcelizer()Lo/onRequestPermissionsResult;

    move-result-object v0

    goto :goto_1b

    :cond_1a
    const/4 v0, 0x0

    .line 1683
    :goto_1b
    iget v1, p1, Landroidx/appcompat/widget/Toolbar$SavedState;->AudioAttributesCompatParcelizer:I

    if-eqz v1, :cond_30

    iget-object v1, p0, Landroidx/appcompat/widget/Toolbar;->onAddQueueItem:Landroidx/appcompat/widget/Toolbar$write;

    if-eqz v1, :cond_30

    if-eqz v0, :cond_30

    .line 1684
    iget v1, p1, Landroidx/appcompat/widget/Toolbar$SavedState;->AudioAttributesCompatParcelizer:I

    invoke-interface {v0, v1}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    if-eqz v0, :cond_30

    .line 1686
    invoke-interface {v0}, Landroid/view/MenuItem;->expandActionView()Z

    .line 1690
    :cond_30
    iget-boolean p1, p1, Landroidx/appcompat/widget/Toolbar$SavedState;->RemoteActionCompatParcelizer:Z

    if-eqz p1, :cond_37

    .line 1691
    invoke-direct {p0}, Landroidx/appcompat/widget/Toolbar;->onRewind()V

    :cond_37
    return-void
.end method

.method public onRtlPropertiesChanged(I)V
    .registers 3

    .line 563
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onRtlPropertiesChanged(I)V

    .line 566
    invoke-direct {p0}, Landroidx/appcompat/widget/Toolbar;->onPlayFromUri()V

    .line 567
    iget-object p0, p0, Landroidx/appcompat/widget/Toolbar;->onCommand:Lo/setNegativeButton;

    const/4 v0, 0x1

    if-eq p1, v0, :cond_c

    const/4 v0, 0x0

    :cond_c
    invoke-virtual {p0, v0}, Lo/setNegativeButton;->read(Z)V

    return-void
.end method

.method public onSaveInstanceState()Landroid/os/Parcelable;
    .registers 3

    .line 1662
    new-instance v0, Landroidx/appcompat/widget/Toolbar$SavedState;

    invoke-super {p0}, Landroid/view/ViewGroup;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v1

    invoke-direct {v0, v1}, Landroidx/appcompat/widget/Toolbar$SavedState;-><init>(Landroid/os/Parcelable;)V

    .line 1664
    iget-object v1, p0, Landroidx/appcompat/widget/Toolbar;->onAddQueueItem:Landroidx/appcompat/widget/Toolbar$write;

    if-eqz v1, :cond_1b

    iget-object v1, v1, Landroidx/appcompat/widget/Toolbar$write;->write:Lo/onRetainNonConfigurationInstance;

    if-eqz v1, :cond_1b

    .line 1665
    iget-object v1, p0, Landroidx/appcompat/widget/Toolbar;->onAddQueueItem:Landroidx/appcompat/widget/Toolbar$write;

    iget-object v1, v1, Landroidx/appcompat/widget/Toolbar$write;->write:Lo/onRetainNonConfigurationInstance;

    invoke-virtual {v1}, Lo/onRetainNonConfigurationInstance;->getItemId()I

    move-result v1

    iput v1, v0, Landroidx/appcompat/widget/Toolbar$SavedState;->AudioAttributesCompatParcelizer:I

    .line 1668
    :cond_1b
    invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->onFastForward()Z

    move-result p0

    iput-boolean p0, v0, Landroidx/appcompat/widget/Toolbar$SavedState;->RemoteActionCompatParcelizer:Z

    return-object v0
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .registers 6

    .line 1720
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_9

    .line 1722
    iput-boolean v1, p0, Landroidx/appcompat/widget/Toolbar;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Z

    .line 1725
    :cond_9
    iget-boolean v2, p0, Landroidx/appcompat/widget/Toolbar;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Z

    const/4 v3, 0x1

    if-nez v2, :cond_18

    .line 1726
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    if-nez v0, :cond_18

    if-nez p1, :cond_18

    .line 1728
    iput-boolean v3, p0, Landroidx/appcompat/widget/Toolbar;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Z

    :cond_18
    if-eq v0, v3, :cond_1d

    const/4 p1, 0x3

    if-ne v0, p1, :cond_1f

    .line 1733
    :cond_1d
    iput-boolean v1, p0, Landroidx/appcompat/widget/Toolbar;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Z

    :cond_1f
    return v3
.end method

.method public final read()Z
    .registers 2

    .line 586
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_12

    iget-object p0, p0, Landroidx/appcompat/widget/Toolbar;->MediaBrowserCompatCustomActionResultReceiver:Landroidx/appcompat/widget/ActionMenuView;

    if-eqz p0, :cond_12

    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionMenuView;->AudioAttributesImplBaseParcelizer()Z

    move-result p0

    if-eqz p0, :cond_12

    const/4 p0, 0x1

    return p0

    :cond_12
    const/4 p0, 0x0

    return p0
.end method

.method public removeMenuProvider(Lo/UntypedObjectDeserializerNRScope;)V
    .registers 2

    .line 2500
    iget-object p0, p0, Landroidx/appcompat/widget/Toolbar;->read:Lo/mapObject;

    invoke-virtual {p0, p1}, Lo/mapObject;->IconCompatParcelizer(Lo/UntypedObjectDeserializerNRScope;)V

    return-void
.end method

.method public setBackInvokedCallbackEnabled(Z)V
    .registers 3

    .line 399
    iget-boolean v0, p0, Landroidx/appcompat/widget/Toolbar;->AudioAttributesImplBaseParcelizer:Z

    if-eq v0, p1, :cond_9

    .line 400
    iput-boolean p1, p0, Landroidx/appcompat/widget/Toolbar;->AudioAttributesImplBaseParcelizer:Z

    .line 403
    invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->onPlayFromMediaId()V

    :cond_9
    return-void
.end method

.method public setCollapseContentDescription(I)V
    .registers 3

    if-eqz p1, :cond_b

    .line 1131
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    move-result-object p1

    goto :goto_c

    :cond_b
    const/4 p1, 0x0

    :goto_c
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/Toolbar;->setCollapseContentDescription(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setCollapseContentDescription(Ljava/lang/CharSequence;)V
    .registers 3

    .line 1145
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_9

    .line 1146
    invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->AudioAttributesCompatParcelizer()V

    .line 1148
    :cond_9
    iget-object p0, p0, Landroidx/appcompat/widget/Toolbar;->write:Landroid/widget/ImageButton;

    if-eqz p0, :cond_10

    .line 1149
    invoke-virtual {p0, p1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    :cond_10
    return-void
.end method

.method public setCollapseIcon(I)V
    .registers 3

    .line 1177
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Lo/getDefaultViewModelCreationExtras;->write(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/Toolbar;->setCollapseIcon(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setCollapseIcon(Landroid/graphics/drawable/Drawable;)V
    .registers 2

    if-eqz p1, :cond_b

    .line 1192
    invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->AudioAttributesCompatParcelizer()V

    .line 1193
    iget-object p0, p0, Landroidx/appcompat/widget/Toolbar;->write:Landroid/widget/ImageButton;

    invoke-virtual {p0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void

    .line 1194
    :cond_b
    iget-object p1, p0, Landroidx/appcompat/widget/Toolbar;->write:Landroid/widget/ImageButton;

    if-eqz p1, :cond_14

    .line 1195
    iget-object p0, p0, Landroidx/appcompat/widget/Toolbar;->MediaBrowserCompatSearchResultReceiver:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p1, p0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_14
    return-void
.end method

.method public setCollapsible(Z)V
    .registers 2

    .line 2404
    iput-boolean p1, p0, Landroidx/appcompat/widget/Toolbar;->RatingCompat:Z

    .line 2405
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public setContentInsetEndWithActions(I)V
    .registers 3

    if-gez p1, :cond_4

    const/high16 p1, -0x80000000

    .line 1529
    :cond_4
    iget v0, p0, Landroidx/appcompat/widget/Toolbar;->MediaDescriptionCompat:I

    if-eq p1, v0, :cond_13

    .line 1530
    iput p1, p0, Landroidx/appcompat/widget/Toolbar;->MediaDescriptionCompat:I

    .line 1531
    invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->AudioAttributesImplApi21Parcelizer()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    if-eqz p1, :cond_13

    .line 1532
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    :cond_13
    return-void
.end method

.method public setContentInsetStartWithNavigation(I)V
    .registers 3

    if-gez p1, :cond_4

    const/high16 p1, -0x80000000

    .line 1486
    :cond_4
    iget v0, p0, Landroidx/appcompat/widget/Toolbar;->handleMediaPlayPauseIfPendingOnHandler:I

    if-eq p1, v0, :cond_13

    .line 1487
    iput p1, p0, Landroidx/appcompat/widget/Toolbar;->handleMediaPlayPauseIfPendingOnHandler:I

    .line 1488
    invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->AudioAttributesImplApi21Parcelizer()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    if-eqz p1, :cond_13

    .line 1489
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    :cond_13
    return-void
.end method

.method public setContentInsetsAbsolute(II)V
    .registers 3

    .line 1404
    invoke-direct {p0}, Landroidx/appcompat/widget/Toolbar;->onPlayFromUri()V

    .line 1405
    iget-object p0, p0, Landroidx/appcompat/widget/Toolbar;->onCommand:Lo/setNegativeButton;

    invoke-virtual {p0, p1, p2}, Lo/setNegativeButton;->AudioAttributesCompatParcelizer(II)V

    return-void
.end method

.method public setContentInsetsRelative(II)V
    .registers 3

    .line 1339
    invoke-direct {p0}, Landroidx/appcompat/widget/Toolbar;->onPlayFromUri()V

    .line 1340
    iget-object p0, p0, Landroidx/appcompat/widget/Toolbar;->onCommand:Lo/setNegativeButton;

    invoke-virtual {p0, p1, p2}, Lo/setNegativeButton;->RemoteActionCompatParcelizer(II)V

    return-void
.end method

.method public setLogo(I)V
    .registers 3

    .line 580
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Lo/getDefaultViewModelCreationExtras;->write(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/Toolbar;->setLogo(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setLogo(Landroid/graphics/drawable/Drawable;)V
    .registers 4

    if-eqz p1, :cond_14

    .line 704
    invoke-direct {p0}, Landroidx/appcompat/widget/Toolbar;->onPrepareFromMediaId()V

    .line 705
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->onPlayFromMediaId:Landroid/widget/ImageView;

    invoke-direct {p0, v0}, Landroidx/appcompat/widget/Toolbar;->read(Landroid/view/View;)Z

    move-result v0

    if-nez v0, :cond_2a

    .line 706
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->onPlayFromMediaId:Landroid/widget/ImageView;

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1}, Landroidx/appcompat/widget/Toolbar;->IconCompatParcelizer(Landroid/view/View;Z)V

    goto :goto_2a

    .line 708
    :cond_14
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->onPlayFromMediaId:Landroid/widget/ImageView;

    if-eqz v0, :cond_2a

    invoke-direct {p0, v0}, Landroidx/appcompat/widget/Toolbar;->read(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_2a

    .line 709
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->onPlayFromMediaId:Landroid/widget/ImageView;

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 710
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->onMediaButtonEvent:Ljava/util/ArrayList;

    iget-object v1, p0, Landroidx/appcompat/widget/Toolbar;->onPlayFromMediaId:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Ljava/util/AbstractCollection;->remove(Ljava/lang/Object;)Z

    .line 712
    :cond_2a
    :goto_2a
    iget-object p0, p0, Landroidx/appcompat/widget/Toolbar;->onPlayFromMediaId:Landroid/widget/ImageView;

    if-eqz p0, :cond_31

    .line 713
    invoke-virtual {p0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_31
    return-void
.end method

.method public setLogoDescription(I)V
    .registers 3

    .line 738
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/Toolbar;->setLogoDescription(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setLogoDescription(Ljava/lang/CharSequence;)V
    .registers 3

    .line 750
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_9

    .line 751
    invoke-direct {p0}, Landroidx/appcompat/widget/Toolbar;->onPrepareFromMediaId()V

    .line 753
    :cond_9
    iget-object p0, p0, Landroidx/appcompat/widget/Toolbar;->onPlayFromMediaId:Landroid/widget/ImageView;

    if-eqz p0, :cond_10

    .line 754
    invoke-virtual {p0, p1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    :cond_10
    return-void
.end method

.method public setMenu(Lo/onRequestPermissionsResult;Landroidx/appcompat/widget/ActionMenuPresenter;)V
    .registers 6

    if-nez p1, :cond_6

    .line 626
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->MediaBrowserCompatCustomActionResultReceiver:Landroidx/appcompat/widget/ActionMenuView;

    if-eqz v0, :cond_11

    .line 630
    :cond_6
    invoke-direct {p0}, Landroidx/appcompat/widget/Toolbar;->onPrepare()V

    .line 631
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->MediaBrowserCompatCustomActionResultReceiver:Landroidx/appcompat/widget/ActionMenuView;

    invoke-virtual {v0}, Landroidx/appcompat/widget/ActionMenuView;->AudioAttributesImplApi26Parcelizer()Lo/onRequestPermissionsResult;

    move-result-object v0

    if-ne v0, p1, :cond_12

    :cond_11
    return-void

    :cond_12
    if-eqz v0, :cond_1e

    .line 637
    iget-object v1, p0, Landroidx/appcompat/widget/Toolbar;->onPrepareFromSearch:Landroidx/appcompat/widget/ActionMenuPresenter;

    invoke-virtual {v0, v1}, Lo/onRequestPermissionsResult;->RemoteActionCompatParcelizer(Lo/peekAvailableContext;)V

    .line 638
    iget-object v1, p0, Landroidx/appcompat/widget/Toolbar;->onAddQueueItem:Landroidx/appcompat/widget/Toolbar$write;

    invoke-virtual {v0, v1}, Lo/onRequestPermissionsResult;->RemoteActionCompatParcelizer(Lo/peekAvailableContext;)V

    .line 641
    :cond_1e
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->onAddQueueItem:Landroidx/appcompat/widget/Toolbar$write;

    if-nez v0, :cond_29

    .line 642
    new-instance v0, Landroidx/appcompat/widget/Toolbar$write;

    invoke-direct {v0, p0}, Landroidx/appcompat/widget/Toolbar$write;-><init>(Landroidx/appcompat/widget/Toolbar;)V

    iput-object v0, p0, Landroidx/appcompat/widget/Toolbar;->onAddQueueItem:Landroidx/appcompat/widget/Toolbar$write;

    :cond_29
    const/4 v0, 0x1

    .line 645
    invoke-virtual {p2, v0}, Landroidx/appcompat/widget/ActionMenuPresenter;->RemoteActionCompatParcelizer(Z)V

    if-eqz p1, :cond_3c

    .line 647
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->onPrepare:Landroid/content/Context;

    invoke-virtual {p1, p2, v0}, Lo/onRequestPermissionsResult;->write(Lo/peekAvailableContext;Landroid/content/Context;)V

    .line 648
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->onAddQueueItem:Landroidx/appcompat/widget/Toolbar$write;

    iget-object v1, p0, Landroidx/appcompat/widget/Toolbar;->onPrepare:Landroid/content/Context;

    invoke-virtual {p1, v0, v1}, Lo/onRequestPermissionsResult;->write(Lo/peekAvailableContext;Landroid/content/Context;)V

    goto :goto_51

    .line 650
    :cond_3c
    iget-object p1, p0, Landroidx/appcompat/widget/Toolbar;->onPrepare:Landroid/content/Context;

    const/4 v1, 0x0

    invoke-virtual {p2, p1, v1}, Lo/onConfigurationChanged;->read(Landroid/content/Context;Lo/onRequestPermissionsResult;)V

    .line 651
    iget-object p1, p0, Landroidx/appcompat/widget/Toolbar;->onAddQueueItem:Landroidx/appcompat/widget/Toolbar$write;

    iget-object v2, p0, Landroidx/appcompat/widget/Toolbar;->onPrepare:Landroid/content/Context;

    invoke-virtual {p1, v2, v1}, Landroidx/appcompat/widget/Toolbar$write;->read(Landroid/content/Context;Lo/onRequestPermissionsResult;)V

    .line 652
    invoke-virtual {p2, v0}, Lo/onConfigurationChanged;->AudioAttributesCompatParcelizer(Z)V

    .line 653
    iget-object p1, p0, Landroidx/appcompat/widget/Toolbar;->onAddQueueItem:Landroidx/appcompat/widget/Toolbar$write;

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/Toolbar$write;->AudioAttributesCompatParcelizer(Z)V

    .line 655
    :goto_51
    iget-object p1, p0, Landroidx/appcompat/widget/Toolbar;->MediaBrowserCompatCustomActionResultReceiver:Landroidx/appcompat/widget/ActionMenuView;

    iget v0, p0, Landroidx/appcompat/widget/Toolbar;->onPrepareFromMediaId:I

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/ActionMenuView;->setPopupTheme(I)V

    .line 656
    iget-object p1, p0, Landroidx/appcompat/widget/Toolbar;->MediaBrowserCompatCustomActionResultReceiver:Landroidx/appcompat/widget/ActionMenuView;

    invoke-virtual {p1, p2}, Landroidx/appcompat/widget/ActionMenuView;->setPresenter(Landroidx/appcompat/widget/ActionMenuPresenter;)V

    .line 657
    iput-object p2, p0, Landroidx/appcompat/widget/Toolbar;->onPrepareFromSearch:Landroidx/appcompat/widget/ActionMenuPresenter;

    .line 660
    invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->onPlayFromMediaId()V

    return-void
.end method

.method public setMenuCallbacks(Lo/peekAvailableContext$AudioAttributesCompatParcelizer;Lo/onRequestPermissionsResult$RemoteActionCompatParcelizer;)V
    .registers 3

    .line 2414
    iput-object p1, p0, Landroidx/appcompat/widget/Toolbar;->AudioAttributesImplApi21Parcelizer:Lo/peekAvailableContext$AudioAttributesCompatParcelizer;

    .line 2415
    iput-object p2, p0, Landroidx/appcompat/widget/Toolbar;->RemoteActionCompatParcelizer:Lo/onRequestPermissionsResult$RemoteActionCompatParcelizer;

    .line 2416
    iget-object p0, p0, Landroidx/appcompat/widget/Toolbar;->MediaBrowserCompatCustomActionResultReceiver:Landroidx/appcompat/widget/ActionMenuView;

    if-eqz p0, :cond_b

    .line 2417
    invoke-virtual {p0, p1, p2}, Landroidx/appcompat/widget/ActionMenuView;->setMenuCallbacks(Lo/peekAvailableContext$AudioAttributesCompatParcelizer;Lo/onRequestPermissionsResult$RemoteActionCompatParcelizer;)V

    :cond_b
    return-void
.end method

.method public setNavigationContentDescription(I)V
    .registers 3

    if-eqz p1, :cond_b

    .line 1008
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    move-result-object p1

    goto :goto_c

    :cond_b
    const/4 p1, 0x0

    :goto_c
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/Toolbar;->setNavigationContentDescription(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setNavigationContentDescription(Ljava/lang/CharSequence;)V
    .registers 3

    .line 1022
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_9

    .line 1023
    invoke-direct {p0}, Landroidx/appcompat/widget/Toolbar;->onPlayFromSearch()V

    .line 1025
    :cond_9
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->onPlayFromSearch:Landroid/widget/ImageButton;

    if-eqz v0, :cond_15

    .line 1026
    invoke-virtual {v0, p1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 1027
    iget-object p0, p0, Landroidx/appcompat/widget/Toolbar;->onPlayFromSearch:Landroid/widget/ImageButton;

    invoke-static {p0, p1}, Lo/setItemInvoker;->AudioAttributesCompatParcelizer(Landroid/view/View;Ljava/lang/CharSequence;)V

    :cond_15
    return-void
.end method

.method public setNavigationIcon(I)V
    .registers 3

    .line 1046
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Lo/getDefaultViewModelCreationExtras;->write(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/Toolbar;->setNavigationIcon(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setNavigationIcon(Landroid/graphics/drawable/Drawable;)V
    .registers 4

    if-eqz p1, :cond_14

    .line 1065
    invoke-direct {p0}, Landroidx/appcompat/widget/Toolbar;->onPlayFromSearch()V

    .line 1066
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->onPlayFromSearch:Landroid/widget/ImageButton;

    invoke-direct {p0, v0}, Landroidx/appcompat/widget/Toolbar;->read(Landroid/view/View;)Z

    move-result v0

    if-nez v0, :cond_2a

    .line 1067
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->onPlayFromSearch:Landroid/widget/ImageButton;

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1}, Landroidx/appcompat/widget/Toolbar;->IconCompatParcelizer(Landroid/view/View;Z)V

    goto :goto_2a

    .line 1069
    :cond_14
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->onPlayFromSearch:Landroid/widget/ImageButton;

    if-eqz v0, :cond_2a

    invoke-direct {p0, v0}, Landroidx/appcompat/widget/Toolbar;->read(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_2a

    .line 1070
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->onPlayFromSearch:Landroid/widget/ImageButton;

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 1071
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->onMediaButtonEvent:Ljava/util/ArrayList;

    iget-object v1, p0, Landroidx/appcompat/widget/Toolbar;->onPlayFromSearch:Landroid/widget/ImageButton;

    invoke-virtual {v0, v1}, Ljava/util/AbstractCollection;->remove(Ljava/lang/Object;)Z

    .line 1073
    :cond_2a
    :goto_2a
    iget-object p0, p0, Landroidx/appcompat/widget/Toolbar;->onPlayFromSearch:Landroid/widget/ImageButton;

    if-eqz p0, :cond_31

    .line 1074
    invoke-virtual {p0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_31
    return-void
.end method

.method public setNavigationOnClickListener(Landroid/view/View$OnClickListener;)V
    .registers 2

    .line 1101
    invoke-direct {p0}, Landroidx/appcompat/widget/Toolbar;->onPlayFromSearch()V

    .line 1102
    iget-object p0, p0, Landroidx/appcompat/widget/Toolbar;->onPlayFromSearch:Landroid/widget/ImageButton;

    invoke-virtual {p0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public setOnMenuItemClickListener(Landroidx/appcompat/widget/Toolbar$IconCompatParcelizer;)V
    .registers 2

    .line 1317
    iput-object p1, p0, Landroidx/appcompat/widget/Toolbar;->MediaBrowserCompatItemReceiver:Landroidx/appcompat/widget/Toolbar$IconCompatParcelizer;

    return-void
.end method

.method public setOverflowIcon(Landroid/graphics/drawable/Drawable;)V
    .registers 2

    .line 1220
    invoke-direct {p0}, Landroidx/appcompat/widget/Toolbar;->onPrepareFromSearch()V

    .line 1221
    iget-object p0, p0, Landroidx/appcompat/widget/Toolbar;->MediaBrowserCompatCustomActionResultReceiver:Landroidx/appcompat/widget/ActionMenuView;

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/ActionMenuView;->setOverflowIcon(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setPopupTheme(I)V
    .registers 4

    .line 426
    iget v0, p0, Landroidx/appcompat/widget/Toolbar;->onPrepareFromMediaId:I

    if-eq v0, p1, :cond_1a

    .line 427
    iput p1, p0, Landroidx/appcompat/widget/Toolbar;->onPrepareFromMediaId:I

    if-nez p1, :cond_f

    .line 429
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Landroidx/appcompat/widget/Toolbar;->onPrepare:Landroid/content/Context;

    return-void

    .line 431
    :cond_f
    new-instance v0, Landroid/view/ContextThemeWrapper;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    iput-object v0, p0, Landroidx/appcompat/widget/Toolbar;->onPrepare:Landroid/content/Context;

    :cond_1a
    return-void
.end method

.method public setSubtitle(I)V
    .registers 3

    .line 881
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/Toolbar;->setSubtitle(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setSubtitle(Ljava/lang/CharSequence;)V
    .registers 5

    .line 892
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_40

    .line 893
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->onRewind:Landroid/widget/TextView;

    if-nez v0, :cond_31

    .line 894
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 895
    new-instance v1, Landroidx/appcompat/widget/AppCompatTextView;

    invoke-direct {v1, v0}, Landroidx/appcompat/widget/AppCompatTextView;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Landroidx/appcompat/widget/Toolbar;->onRewind:Landroid/widget/TextView;

    .line 896
    invoke-virtual {v1}, Landroid/widget/TextView;->setSingleLine()V

    .line 897
    iget-object v1, p0, Landroidx/appcompat/widget/Toolbar;->onRewind:Landroid/widget/TextView;

    sget-object v2, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 898
    iget v1, p0, Landroidx/appcompat/widget/Toolbar;->onPrepareFromUri:I

    if-eqz v1, :cond_28

    .line 899
    iget-object v2, p0, Landroidx/appcompat/widget/Toolbar;->onRewind:Landroid/widget/TextView;

    invoke-virtual {v2, v0, v1}, Landroid/widget/TextView;->setTextAppearance(Landroid/content/Context;I)V

    .line 901
    :cond_28
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->onRemoveQueueItemAt:Landroid/content/res/ColorStateList;

    if-eqz v0, :cond_31

    .line 902
    iget-object v1, p0, Landroidx/appcompat/widget/Toolbar;->onRewind:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 905
    :cond_31
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->onRewind:Landroid/widget/TextView;

    invoke-direct {p0, v0}, Landroidx/appcompat/widget/Toolbar;->read(Landroid/view/View;)Z

    move-result v0

    if-nez v0, :cond_56

    .line 906
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->onRewind:Landroid/widget/TextView;

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1}, Landroidx/appcompat/widget/Toolbar;->IconCompatParcelizer(Landroid/view/View;Z)V

    goto :goto_56

    .line 908
    :cond_40
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->onRewind:Landroid/widget/TextView;

    if-eqz v0, :cond_56

    invoke-direct {p0, v0}, Landroidx/appcompat/widget/Toolbar;->read(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_56

    .line 909
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->onRewind:Landroid/widget/TextView;

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 910
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->onMediaButtonEvent:Ljava/util/ArrayList;

    iget-object v1, p0, Landroidx/appcompat/widget/Toolbar;->onRewind:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Ljava/util/AbstractCollection;->remove(Ljava/lang/Object;)Z

    .line 912
    :cond_56
    :goto_56
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->onRewind:Landroid/widget/TextView;

    if-eqz v0, :cond_5d

    .line 913
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 915
    :cond_5d
    iput-object p1, p0, Landroidx/appcompat/widget/Toolbar;->onSeekTo:Ljava/lang/CharSequence;

    return-void
.end method

.method public setSubtitleTextAppearance(Landroid/content/Context;I)V
    .registers 3

    .line 934
    iput p2, p0, Landroidx/appcompat/widget/Toolbar;->onPrepareFromUri:I

    .line 935
    iget-object p0, p0, Landroidx/appcompat/widget/Toolbar;->onRewind:Landroid/widget/TextView;

    if-eqz p0, :cond_9

    .line 936
    invoke-virtual {p0, p1, p2}, Landroid/widget/TextView;->setTextAppearance(Landroid/content/Context;I)V

    :cond_9
    return-void
.end method

.method public setSubtitleTextColor(I)V
    .registers 2

    .line 967
    invoke-static {p1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/Toolbar;->setSubtitleTextColor(Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public setSubtitleTextColor(Landroid/content/res/ColorStateList;)V
    .registers 2

    .line 976
    iput-object p1, p0, Landroidx/appcompat/widget/Toolbar;->onRemoveQueueItemAt:Landroid/content/res/ColorStateList;

    .line 977
    iget-object p0, p0, Landroidx/appcompat/widget/Toolbar;->onRewind:Landroid/widget/TextView;

    if-eqz p0, :cond_9

    .line 978
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    :cond_9
    return-void
.end method

.method public setTitle(I)V
    .registers 3

    .line 825
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/Toolbar;->setTitle(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setTitle(Ljava/lang/CharSequence;)V
    .registers 5

    .line 837
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_40

    .line 838
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->onSkipToPrevious:Landroid/widget/TextView;

    if-nez v0, :cond_31

    .line 839
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 840
    new-instance v1, Landroidx/appcompat/widget/AppCompatTextView;

    invoke-direct {v1, v0}, Landroidx/appcompat/widget/AppCompatTextView;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Landroidx/appcompat/widget/Toolbar;->onSkipToPrevious:Landroid/widget/TextView;

    .line 841
    invoke-virtual {v1}, Landroid/widget/TextView;->setSingleLine()V

    .line 842
    iget-object v1, p0, Landroidx/appcompat/widget/Toolbar;->onSkipToPrevious:Landroid/widget/TextView;

    sget-object v2, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 843
    iget v1, p0, Landroidx/appcompat/widget/Toolbar;->onSkipToNext:I

    if-eqz v1, :cond_28

    .line 844
    iget-object v2, p0, Landroidx/appcompat/widget/Toolbar;->onSkipToPrevious:Landroid/widget/TextView;

    invoke-virtual {v2, v0, v1}, Landroid/widget/TextView;->setTextAppearance(Landroid/content/Context;I)V

    .line 846
    :cond_28
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->onStop:Landroid/content/res/ColorStateList;

    if-eqz v0, :cond_31

    .line 847
    iget-object v1, p0, Landroidx/appcompat/widget/Toolbar;->onSkipToPrevious:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 850
    :cond_31
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->onSkipToPrevious:Landroid/widget/TextView;

    invoke-direct {p0, v0}, Landroidx/appcompat/widget/Toolbar;->read(Landroid/view/View;)Z

    move-result v0

    if-nez v0, :cond_56

    .line 851
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->onSkipToPrevious:Landroid/widget/TextView;

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1}, Landroidx/appcompat/widget/Toolbar;->IconCompatParcelizer(Landroid/view/View;Z)V

    goto :goto_56

    .line 853
    :cond_40
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->onSkipToPrevious:Landroid/widget/TextView;

    if-eqz v0, :cond_56

    invoke-direct {p0, v0}, Landroidx/appcompat/widget/Toolbar;->read(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_56

    .line 854
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->onSkipToPrevious:Landroid/widget/TextView;

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 855
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->onMediaButtonEvent:Ljava/util/ArrayList;

    iget-object v1, p0, Landroidx/appcompat/widget/Toolbar;->onSkipToPrevious:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Ljava/util/AbstractCollection;->remove(Ljava/lang/Object;)Z

    .line 857
    :cond_56
    :goto_56
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->onSkipToPrevious:Landroid/widget/TextView;

    if-eqz v0, :cond_5d

    .line 858
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 860
    :cond_5d
    iput-object p1, p0, Landroidx/appcompat/widget/Toolbar;->setSessionImpl:Ljava/lang/CharSequence;

    return-void
.end method

.method public setTitleMargin(IIII)V
    .registers 5

    .line 461
    iput p1, p0, Landroidx/appcompat/widget/Toolbar;->onSetRating:I

    .line 462
    iput p2, p0, Landroidx/appcompat/widget/Toolbar;->onSkipToQueueItem:I

    .line 463
    iput p3, p0, Landroidx/appcompat/widget/Toolbar;->onSetShuffleMode:I

    .line 464
    iput p4, p0, Landroidx/appcompat/widget/Toolbar;->onSetPlaybackSpeed:I

    .line 466
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public setTitleMarginBottom(I)V
    .registers 2

    .line 556
    iput p1, p0, Landroidx/appcompat/widget/Toolbar;->onSetPlaybackSpeed:I

    .line 557
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public setTitleMarginEnd(I)V
    .registers 2

    .line 533
    iput p1, p0, Landroidx/appcompat/widget/Toolbar;->onSetShuffleMode:I

    .line 535
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public setTitleMarginStart(I)V
    .registers 2

    .line 487
    iput p1, p0, Landroidx/appcompat/widget/Toolbar;->onSetRating:I

    .line 489
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public setTitleMarginTop(I)V
    .registers 2

    .line 510
    iput p1, p0, Landroidx/appcompat/widget/Toolbar;->onSkipToQueueItem:I

    .line 512
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public setTitleTextAppearance(Landroid/content/Context;I)V
    .registers 3

    .line 923
    iput p2, p0, Landroidx/appcompat/widget/Toolbar;->onSkipToNext:I

    .line 924
    iget-object p0, p0, Landroidx/appcompat/widget/Toolbar;->onSkipToPrevious:Landroid/widget/TextView;

    if-eqz p0, :cond_9

    .line 925
    invoke-virtual {p0, p1, p2}, Landroid/widget/TextView;->setTextAppearance(Landroid/content/Context;I)V

    :cond_9
    return-void
.end method

.method public setTitleTextColor(I)V
    .registers 2

    .line 946
    invoke-static {p1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/Toolbar;->setTitleTextColor(Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public setTitleTextColor(Landroid/content/res/ColorStateList;)V
    .registers 2

    .line 955
    iput-object p1, p0, Landroidx/appcompat/widget/Toolbar;->onStop:Landroid/content/res/ColorStateList;

    .line 956
    iget-object p0, p0, Landroidx/appcompat/widget/Toolbar;->onSkipToPrevious:Landroid/widget/TextView;

    if-eqz p0, :cond_9

    .line 957
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    :cond_9
    return-void
.end method

.method public write(I)V
    .registers 3

    .line 1305
    invoke-direct {p0}, Landroidx/appcompat/widget/Toolbar;->onPrepareFromUri()Landroid/view/MenuInflater;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->MediaBrowserCompatCustomActionResultReceiver()Landroid/view/Menu;

    move-result-object p0

    invoke-virtual {v0, p1, p0}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    return-void
.end method

###### Class androidx.appcompat.widget.Toolbar.AnonymousClass2 (androidx.appcompat.widget.Toolbar$2)
.class final Landroidx/appcompat/widget/Toolbar$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/onRequestPermissionsResult$RemoteActionCompatParcelizer;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/appcompat/widget/Toolbar;->onPrepare()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic write:Landroidx/appcompat/widget/Toolbar;


# direct methods
.method constructor <init>(Landroidx/appcompat/widget/Toolbar;)V
    .registers 2

    .line 1258
    iput-object p1, p0, Landroidx/appcompat/widget/Toolbar$2;->write:Landroidx/appcompat/widget/Toolbar;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final read(Lo/onRequestPermissionsResult;)V
    .registers 3

    .line 1274
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar$2;->write:Landroidx/appcompat/widget/Toolbar;

    iget-object v0, v0, Landroidx/appcompat/widget/Toolbar;->MediaBrowserCompatCustomActionResultReceiver:Landroidx/appcompat/widget/ActionMenuView;

    invoke-virtual {v0}, Landroidx/appcompat/widget/ActionMenuView;->MediaBrowserCompatItemReceiver()Z

    move-result v0

    if-nez v0, :cond_11

    .line 1275
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar$2;->write:Landroidx/appcompat/widget/Toolbar;

    iget-object v0, v0, Landroidx/appcompat/widget/Toolbar;->read:Lo/mapObject;

    invoke-virtual {v0, p1}, Lo/mapObject;->read(Landroid/view/Menu;)V

    .line 1278
    :cond_11
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar$2;->write:Landroidx/appcompat/widget/Toolbar;

    iget-object v0, v0, Landroidx/appcompat/widget/Toolbar;->RemoteActionCompatParcelizer:Lo/onRequestPermissionsResult$RemoteActionCompatParcelizer;

    if-eqz v0, :cond_1e

    .line 1279
    iget-object p0, p0, Landroidx/appcompat/widget/Toolbar$2;->write:Landroidx/appcompat/widget/Toolbar;

    iget-object p0, p0, Landroidx/appcompat/widget/Toolbar;->RemoteActionCompatParcelizer:Lo/onRequestPermissionsResult$RemoteActionCompatParcelizer;

    invoke-interface {p0, p1}, Lo/onRequestPermissionsResult$RemoteActionCompatParcelizer;->read(Lo/onRequestPermissionsResult;)V

    :cond_1e
    return-void
.end method

.method public final write(Lo/onRequestPermissionsResult;Landroid/view/MenuItem;)Z
    .registers 4

    .line 1266
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar$2;->write:Landroidx/appcompat/widget/Toolbar;

    iget-object v0, v0, Landroidx/appcompat/widget/Toolbar;->RemoteActionCompatParcelizer:Lo/onRequestPermissionsResult$RemoteActionCompatParcelizer;

    if-eqz v0, :cond_12

    iget-object p0, p0, Landroidx/appcompat/widget/Toolbar$2;->write:Landroidx/appcompat/widget/Toolbar;

    iget-object p0, p0, Landroidx/appcompat/widget/Toolbar;->RemoteActionCompatParcelizer:Lo/onRequestPermissionsResult$RemoteActionCompatParcelizer;

    .line 1267
    invoke-interface {p0, p1, p2}, Lo/onRequestPermissionsResult$RemoteActionCompatParcelizer;->write(Lo/onRequestPermissionsResult;Landroid/view/MenuItem;)Z

    move-result p0

    if-eqz p0, :cond_12

    const/4 p0, 0x1

    return p0

    :cond_12
    const/4 p0, 0x0

    return p0
.end method

###### Class androidx.appcompat.widget.Toolbar.AnonymousClass3 (androidx.appcompat.widget.Toolbar$3)
.class final Landroidx/appcompat/widget/Toolbar$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/widget/Toolbar;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic read:Landroidx/appcompat/widget/Toolbar;


# direct methods
.method constructor <init>(Landroidx/appcompat/widget/Toolbar;)V
    .registers 2

    .line 251
    iput-object p1, p0, Landroidx/appcompat/widget/Toolbar$3;->read:Landroidx/appcompat/widget/Toolbar;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 1

    .line 253
    iget-object p0, p0, Landroidx/appcompat/widget/Toolbar$3;->read:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->onPlay()Z

    return-void
.end method

###### Class androidx.appcompat.widget.Toolbar.AnonymousClass4 (androidx.appcompat.widget.Toolbar$4)
.class final Landroidx/appcompat/widget/Toolbar$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/appcompat/widget/Toolbar;->AudioAttributesCompatParcelizer()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic RemoteActionCompatParcelizer:Landroidx/appcompat/widget/Toolbar;


# direct methods
.method constructor <init>(Landroidx/appcompat/widget/Toolbar;)V
    .registers 2

    .line 1631
    iput-object p1, p0, Landroidx/appcompat/widget/Toolbar$4;->RemoteActionCompatParcelizer:Landroidx/appcompat/widget/Toolbar;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .registers 2

    .line 1634
    iget-object p0, p0, Landroidx/appcompat/widget/Toolbar$4;->RemoteActionCompatParcelizer:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->S_()V

    return-void
.end method

###### Class androidx.appcompat.widget.Toolbar.AnonymousClass5 (androidx.appcompat.widget.Toolbar$5)
.class final Landroidx/appcompat/widget/Toolbar$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/appcompat/widget/ActionMenuView$RemoteActionCompatParcelizer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/widget/Toolbar;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic write:Landroidx/appcompat/widget/Toolbar;


# direct methods
.method constructor <init>(Landroidx/appcompat/widget/Toolbar;)V
    .registers 2

    .line 218
    iput-object p1, p0, Landroidx/appcompat/widget/Toolbar$5;->write:Landroidx/appcompat/widget/Toolbar;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final write(Landroid/view/MenuItem;)Z
    .registers 3

    .line 221
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar$5;->write:Landroidx/appcompat/widget/Toolbar;

    iget-object v0, v0, Landroidx/appcompat/widget/Toolbar;->read:Lo/mapObject;

    invoke-virtual {v0, p1}, Lo/mapObject;->AudioAttributesCompatParcelizer(Landroid/view/MenuItem;)Z

    move-result v0

    if-eqz v0, :cond_c

    const/4 p0, 0x1

    return p0

    .line 224
    :cond_c
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar$5;->write:Landroidx/appcompat/widget/Toolbar;

    iget-object v0, v0, Landroidx/appcompat/widget/Toolbar;->MediaBrowserCompatItemReceiver:Landroidx/appcompat/widget/Toolbar$IconCompatParcelizer;

    if-eqz v0, :cond_1b

    .line 225
    iget-object p0, p0, Landroidx/appcompat/widget/Toolbar$5;->write:Landroidx/appcompat/widget/Toolbar;

    iget-object p0, p0, Landroidx/appcompat/widget/Toolbar;->MediaBrowserCompatItemReceiver:Landroidx/appcompat/widget/Toolbar$IconCompatParcelizer;

    invoke-interface {p0, p1}, Landroidx/appcompat/widget/Toolbar$IconCompatParcelizer;->read(Landroid/view/MenuItem;)Z

    move-result p0

    return p0

    :cond_1b
    const/4 p0, 0x0

    return p0
.end method

###### Class androidx.appcompat.widget.Toolbar.AudioAttributesCompatParcelizer (androidx.appcompat.widget.Toolbar$AudioAttributesCompatParcelizer)
.class Landroidx/appcompat/widget/Toolbar$AudioAttributesCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/widget/Toolbar;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "AudioAttributesCompatParcelizer"
.end annotation


# direct methods
.method static IconCompatParcelizer(Ljava/lang/Object;Ljava/lang/Object;)V
    .registers 2

    .line 2826
    check-cast p0, Landroid/window/OnBackInvokedDispatcher;

    .line 2827
    check-cast p1, Landroid/window/OnBackInvokedCallback;

    invoke-interface {p0, p1}, Landroid/window/OnBackInvokedDispatcher;->unregisterOnBackInvokedCallback(Landroid/window/OnBackInvokedCallback;)V

    return-void
.end method

.method static RemoteActionCompatParcelizer(Ljava/lang/Object;Ljava/lang/Object;)V
    .registers 3

    .line 2818
    check-cast p0, Landroid/window/OnBackInvokedDispatcher;

    const v0, 0xf4240

    .line 2819
    check-cast p1, Landroid/window/OnBackInvokedCallback;

    invoke-interface {p0, v0, p1}, Landroid/window/OnBackInvokedDispatcher;->registerOnBackInvokedCallback(ILandroid/window/OnBackInvokedCallback;)V

    return-void
.end method

.method static bF_(Landroid/view/View;)Landroid/window/OnBackInvokedDispatcher;
    .registers 1

    .line 2833
    invoke-virtual {p0}, Landroid/view/View;->findOnBackInvokedDispatcher()Landroid/window/OnBackInvokedDispatcher;

    move-result-object p0

    return-object p0
.end method

.method static bG_(Ljava/lang/Runnable;)Landroid/window/OnBackInvokedCallback;
    .registers 2

    .line 2839
    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lo/setExpandedFormat;

    invoke-direct {v0, p0}, Lo/setExpandedFormat;-><init>(Ljava/lang/Runnable;)V

    return-object v0
.end method

###### Class kotlin.setExpandedFormat (o.setExpandedFormat)
.class public final synthetic Lo/setExpandedFormat;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/window/OnBackInvokedCallback;


# instance fields
.field public final synthetic read:Ljava/lang/Runnable;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Runnable;)V
    .registers 2

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo/setExpandedFormat;->read:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public final onBackInvoked()V
    .registers 1

    .line 0
    iget-object p0, p0, Lo/setExpandedFormat;->read:Ljava/lang/Runnable;

    invoke-interface {p0}, Ljava/lang/Runnable;->run()V

    return-void
.end method

###### Class androidx.appcompat.widget.Toolbar.IconCompatParcelizer (androidx.appcompat.widget.Toolbar$IconCompatParcelizer)
.class public interface abstract Landroidx/appcompat/widget/Toolbar$IconCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/widget/Toolbar;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "IconCompatParcelizer"
.end annotation


# virtual methods
.method public abstract read(Landroid/view/MenuItem;)Z
.end method

###### Class androidx.appcompat.widget.Toolbar.LayoutParams (androidx.appcompat.widget.Toolbar$LayoutParams)
.class public Landroidx/appcompat/widget/Toolbar$LayoutParams;
.super Landroidx/appcompat/app/ActionBar$LayoutParams;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/widget/Toolbar;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "LayoutParams"
.end annotation


# instance fields
.field RemoteActionCompatParcelizer:I


# direct methods
.method public constructor <init>()V
    .registers 2

    const/4 v0, -0x2

    .line 2585
    invoke-direct {p0, v0, v0}, Landroidx/appcompat/app/ActionBar$LayoutParams;-><init>(II)V

    const/4 v0, 0x0

    .line 2578
    iput v0, p0, Landroidx/appcompat/widget/Toolbar$LayoutParams;->RemoteActionCompatParcelizer:I

    const v0, 0x800013

    .line 2586
    iput v0, p0, Landroidx/appcompat/app/ActionBar$LayoutParams;->write:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 3

    .line 2581
    invoke-direct {p0, p1, p2}, Landroidx/appcompat/app/ActionBar$LayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p1, 0x0

    .line 2578
    iput p1, p0, Landroidx/appcompat/widget/Toolbar$LayoutParams;->RemoteActionCompatParcelizer:I

    return-void
.end method

.method public constructor <init>(Landroid/view/ViewGroup$LayoutParams;)V
    .registers 2

    .line 2616
    invoke-direct {p0, p1}, Landroidx/appcompat/app/ActionBar$LayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    const/4 p1, 0x0

    .line 2578
    iput p1, p0, Landroidx/appcompat/widget/Toolbar$LayoutParams;->RemoteActionCompatParcelizer:I

    return-void
.end method

.method public constructor <init>(Landroid/view/ViewGroup$MarginLayoutParams;)V
    .registers 3

    .line 2609
    invoke-direct {p0, p1}, Landroidx/appcompat/app/ActionBar$LayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    const/4 v0, 0x0

    .line 2578
    iput v0, p0, Landroidx/appcompat/widget/Toolbar$LayoutParams;->RemoteActionCompatParcelizer:I

    .line 2612
    invoke-direct {p0, p1}, Landroidx/appcompat/widget/Toolbar$LayoutParams;->IconCompatParcelizer(Landroid/view/ViewGroup$MarginLayoutParams;)V

    return-void
.end method

.method public constructor <init>(Landroidx/appcompat/app/ActionBar$LayoutParams;)V
    .registers 2

    .line 2605
    invoke-direct {p0, p1}, Landroidx/appcompat/app/ActionBar$LayoutParams;-><init>(Landroidx/appcompat/app/ActionBar$LayoutParams;)V

    const/4 p1, 0x0

    .line 2578
    iput p1, p0, Landroidx/appcompat/widget/Toolbar$LayoutParams;->RemoteActionCompatParcelizer:I

    return-void
.end method

.method public constructor <init>(Landroidx/appcompat/widget/Toolbar$LayoutParams;)V
    .registers 3

    .line 2599
    invoke-direct {p0, p1}, Landroidx/appcompat/app/ActionBar$LayoutParams;-><init>(Landroidx/appcompat/app/ActionBar$LayoutParams;)V

    const/4 v0, 0x0

    .line 2578
    iput v0, p0, Landroidx/appcompat/widget/Toolbar$LayoutParams;->RemoteActionCompatParcelizer:I

    .line 2601
    iget p1, p1, Landroidx/appcompat/widget/Toolbar$LayoutParams;->RemoteActionCompatParcelizer:I

    iput p1, p0, Landroidx/appcompat/widget/Toolbar$LayoutParams;->RemoteActionCompatParcelizer:I

    return-void
.end method

.method private IconCompatParcelizer(Landroid/view/ViewGroup$MarginLayoutParams;)V
    .registers 3

    .line 2620
    iget v0, p1, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    iput v0, p0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 2621
    iget v0, p1, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iput v0, p0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 2622
    iget v0, p1, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    iput v0, p0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 2623
    iget p1, p1, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    iput p1, p0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    return-void
.end method

###### Class androidx.appcompat.widget.Toolbar.SavedState (androidx.appcompat.widget.Toolbar$SavedState)
.class public Landroidx/appcompat/widget/Toolbar$SavedState;
.super Landroidx/customview/view/AbsSavedState;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/widget/Toolbar;
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
            "Landroidx/appcompat/widget/Toolbar$SavedState;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field AudioAttributesCompatParcelizer:I

.field RemoteActionCompatParcelizer:Z


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 2652
    new-instance v0, Landroidx/appcompat/widget/Toolbar$SavedState$5;

    invoke-direct {v0}, Landroidx/appcompat/widget/Toolbar$SavedState$5;-><init>()V

    sput-object v0, Landroidx/appcompat/widget/Toolbar$SavedState;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V
    .registers 3

    .line 2636
    invoke-direct {p0, p1, p2}, Landroidx/customview/view/AbsSavedState;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    .line 2637
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p2

    iput p2, p0, Landroidx/appcompat/widget/Toolbar$SavedState;->AudioAttributesCompatParcelizer:I

    .line 2638
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    if-eqz p1, :cond_11

    const/4 p1, 0x1

    goto :goto_12

    :cond_11
    const/4 p1, 0x0

    :goto_12
    iput-boolean p1, p0, Landroidx/appcompat/widget/Toolbar$SavedState;->RemoteActionCompatParcelizer:Z

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcelable;)V
    .registers 2

    .line 2642
    invoke-direct {p0, p1}, Landroidx/customview/view/AbsSavedState;-><init>(Landroid/os/Parcelable;)V

    return-void
.end method


# virtual methods
.method public writeToParcel(Landroid/os/Parcel;I)V
    .registers 3

    .line 2647
    invoke-super {p0, p1, p2}, Landroidx/customview/view/AbsSavedState;->writeToParcel(Landroid/os/Parcel;I)V

    .line 2648
    iget p2, p0, Landroidx/appcompat/widget/Toolbar$SavedState;->AudioAttributesCompatParcelizer:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 2649
    iget-boolean p0, p0, Landroidx/appcompat/widget/Toolbar$SavedState;->RemoteActionCompatParcelizer:Z

    invoke-virtual {p1, p0}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method

###### Class androidx.appcompat.widget.Toolbar.SavedState.AnonymousClass5 (androidx.appcompat.widget.Toolbar$SavedState$5)
.class final Landroidx/appcompat/widget/Toolbar$SavedState$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$ClassLoaderCreator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/widget/Toolbar$SavedState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$ClassLoaderCreator<",
        "Landroidx/appcompat/widget/Toolbar$SavedState;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .registers 1

    .line 2652
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static IconCompatParcelizer(Landroid/os/Parcel;)Landroidx/appcompat/widget/Toolbar$SavedState;
    .registers 3

    .line 2660
    new-instance v0, Landroidx/appcompat/widget/Toolbar$SavedState;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Landroidx/appcompat/widget/Toolbar$SavedState;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0
.end method

.method private static RemoteActionCompatParcelizer(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Landroidx/appcompat/widget/Toolbar$SavedState;
    .registers 3

    .line 2655
    new-instance v0, Landroidx/appcompat/widget/Toolbar$SavedState;

    invoke-direct {v0, p0, p1}, Landroidx/appcompat/widget/Toolbar$SavedState;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0
.end method

.method private static write(I)[Landroidx/appcompat/widget/Toolbar$SavedState;
    .registers 1

    .line 2665
    new-array p0, p0, [Landroidx/appcompat/widget/Toolbar$SavedState;

    return-object p0
.end method


# virtual methods
.method public final synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .registers 2

    .line 2652
    invoke-static {p1}, Landroidx/appcompat/widget/Toolbar$SavedState$5;->IconCompatParcelizer(Landroid/os/Parcel;)Landroidx/appcompat/widget/Toolbar$SavedState;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic createFromParcel(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Ljava/lang/Object;
    .registers 3

    .line 2652
    invoke-static {p1, p2}, Landroidx/appcompat/widget/Toolbar$SavedState$5;->RemoteActionCompatParcelizer(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Landroidx/appcompat/widget/Toolbar$SavedState;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .registers 2

    .line 2652
    invoke-static {p1}, Landroidx/appcompat/widget/Toolbar$SavedState$5;->write(I)[Landroidx/appcompat/widget/Toolbar$SavedState;

    move-result-object p0

    return-object p0
.end method

###### Class androidx.appcompat.widget.Toolbar.write (androidx.appcompat.widget.Toolbar$write)
.class final Landroidx/appcompat/widget/Toolbar$write;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/peekAvailableContext;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/widget/Toolbar;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "write"
.end annotation


# instance fields
.field final synthetic IconCompatParcelizer:Landroidx/appcompat/widget/Toolbar;

.field private read:Lo/onRequestPermissionsResult;

.field write:Lo/onRetainNonConfigurationInstance;


# direct methods
.method constructor <init>(Landroidx/appcompat/widget/Toolbar;)V
    .registers 2

    .line 2674
    iput-object p1, p0, Landroidx/appcompat/widget/Toolbar$write;->IconCompatParcelizer:Landroidx/appcompat/widget/Toolbar;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer(Z)V
    .registers 5

    .line 2694
    iget-object p1, p0, Landroidx/appcompat/widget/Toolbar$write;->write:Lo/onRetainNonConfigurationInstance;

    if-eqz p1, :cond_22

    .line 2697
    iget-object p1, p0, Landroidx/appcompat/widget/Toolbar$write;->read:Lo/onRequestPermissionsResult;

    if-eqz p1, :cond_1d

    .line 2698
    invoke-virtual {p1}, Lo/onRequestPermissionsResult;->size()I

    move-result p1

    const/4 v0, 0x0

    :goto_d
    if-ge v0, p1, :cond_1d

    .line 2700
    iget-object v1, p0, Landroidx/appcompat/widget/Toolbar$write;->read:Lo/onRequestPermissionsResult;

    invoke-virtual {v1, v0}, Lo/onRequestPermissionsResult;->getItem(I)Landroid/view/MenuItem;

    move-result-object v1

    .line 2701
    iget-object v2, p0, Landroidx/appcompat/widget/Toolbar$write;->write:Lo/onRetainNonConfigurationInstance;

    if-ne v1, v2, :cond_1a

    return-void

    :cond_1a
    add-int/lit8 v0, v0, 0x1

    goto :goto_d

    .line 2710
    :cond_1d
    iget-object p1, p0, Landroidx/appcompat/widget/Toolbar$write;->write:Lo/onRetainNonConfigurationInstance;

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/Toolbar$write;->IconCompatParcelizer(Lo/onRetainNonConfigurationInstance;)Z

    :cond_22
    return-void
.end method

.method public final AudioAttributesCompatParcelizer()Z
    .registers 1

    const/4 p0, 0x0

    return p0
.end method

.method public final AudioAttributesImplApi26Parcelizer()Landroid/os/Parcelable;
    .registers 1

    const/4 p0, 0x0

    return-object p0
.end method

.method public final IconCompatParcelizer()I
    .registers 1

    const/4 p0, 0x0

    return p0
.end method

.method public final IconCompatParcelizer(Landroid/os/Parcelable;)V
    .registers 2

    return-void
.end method

.method public final IconCompatParcelizer(Lo/onRequestPermissionsResult;Z)V
    .registers 3

    return-void
.end method

.method public final IconCompatParcelizer(Lo/onRetainNonConfigurationInstance;)Z
    .registers 4

    .line 2775
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar$write;->IconCompatParcelizer:Landroidx/appcompat/widget/Toolbar;

    iget-object v0, v0, Landroidx/appcompat/widget/Toolbar;->AudioAttributesCompatParcelizer:Landroid/view/View;

    instance-of v0, v0, Lo/invalidateMenu;

    if-eqz v0, :cond_11

    .line 2776
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar$write;->IconCompatParcelizer:Landroidx/appcompat/widget/Toolbar;

    iget-object v0, v0, Landroidx/appcompat/widget/Toolbar;->AudioAttributesCompatParcelizer:Landroid/view/View;

    check-cast v0, Lo/invalidateMenu;

    invoke-interface {v0}, Lo/invalidateMenu;->write()V

    .line 2779
    :cond_11
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar$write;->IconCompatParcelizer:Landroidx/appcompat/widget/Toolbar;

    iget-object v1, v0, Landroidx/appcompat/widget/Toolbar;->AudioAttributesCompatParcelizer:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 2780
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar$write;->IconCompatParcelizer:Landroidx/appcompat/widget/Toolbar;

    iget-object v1, v0, Landroidx/appcompat/widget/Toolbar;->write:Landroid/widget/ImageButton;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 2781
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar$write;->IconCompatParcelizer:Landroidx/appcompat/widget/Toolbar;

    const/4 v1, 0x0

    iput-object v1, v0, Landroidx/appcompat/widget/Toolbar;->AudioAttributesCompatParcelizer:Landroid/view/View;

    .line 2783
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar$write;->IconCompatParcelizer:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v0}, Landroidx/appcompat/widget/Toolbar;->IconCompatParcelizer()V

    .line 2784
    iput-object v1, p0, Landroidx/appcompat/widget/Toolbar$write;->write:Lo/onRetainNonConfigurationInstance;

    .line 2785
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar$write;->IconCompatParcelizer:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v0}, Landroid/view/View;->requestLayout()V

    const/4 v0, 0x0

    .line 2786
    invoke-virtual {p1, v0}, Lo/onRetainNonConfigurationInstance;->IconCompatParcelizer(Z)V

    .line 2789
    iget-object p0, p0, Landroidx/appcompat/widget/Toolbar$write;->IconCompatParcelizer:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->onPlayFromMediaId()V

    const/4 p0, 0x1

    return p0
.end method

.method public final read(Landroid/content/Context;Lo/onRequestPermissionsResult;)V
    .registers 4

    .line 2680
    iget-object p1, p0, Landroidx/appcompat/widget/Toolbar$write;->read:Lo/onRequestPermissionsResult;

    if-eqz p1, :cond_b

    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar$write;->write:Lo/onRetainNonConfigurationInstance;

    if-eqz v0, :cond_b

    .line 2681
    invoke-virtual {p1, v0}, Lo/onRequestPermissionsResult;->RemoteActionCompatParcelizer(Lo/onRetainNonConfigurationInstance;)Z

    .line 2683
    :cond_b
    iput-object p2, p0, Landroidx/appcompat/widget/Toolbar$write;->read:Lo/onRequestPermissionsResult;

    return-void
.end method

.method public final read(Lo/peekAvailableContext$AudioAttributesCompatParcelizer;)V
    .registers 2

    return-void
.end method

.method public final read(Lo/onRetainNonConfigurationInstance;)Z
    .registers 5

    .line 2735
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar$write;->IconCompatParcelizer:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v0}, Landroidx/appcompat/widget/Toolbar;->AudioAttributesCompatParcelizer()V

    .line 2736
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar$write;->IconCompatParcelizer:Landroidx/appcompat/widget/Toolbar;

    iget-object v0, v0, Landroidx/appcompat/widget/Toolbar;->write:Landroid/widget/ImageButton;

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    .line 2737
    iget-object v1, p0, Landroidx/appcompat/widget/Toolbar$write;->IconCompatParcelizer:Landroidx/appcompat/widget/Toolbar;

    if-eq v0, v1, :cond_23

    .line 2738
    instance-of v2, v0, Landroid/view/ViewGroup;

    if-eqz v2, :cond_1c

    .line 2739
    check-cast v0, Landroid/view/ViewGroup;

    iget-object v1, v1, Landroidx/appcompat/widget/Toolbar;->write:Landroid/widget/ImageButton;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 2741
    :cond_1c
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar$write;->IconCompatParcelizer:Landroidx/appcompat/widget/Toolbar;

    iget-object v1, v0, Landroidx/appcompat/widget/Toolbar;->write:Landroid/widget/ImageButton;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 2743
    :cond_23
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar$write;->IconCompatParcelizer:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {p1}, Lo/onRetainNonConfigurationInstance;->getActionView()Landroid/view/View;

    move-result-object v1

    iput-object v1, v0, Landroidx/appcompat/widget/Toolbar;->AudioAttributesCompatParcelizer:Landroid/view/View;

    .line 2744
    iput-object p1, p0, Landroidx/appcompat/widget/Toolbar$write;->write:Lo/onRetainNonConfigurationInstance;

    .line 2745
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar$write;->IconCompatParcelizer:Landroidx/appcompat/widget/Toolbar;

    iget-object v0, v0, Landroidx/appcompat/widget/Toolbar;->AudioAttributesCompatParcelizer:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    .line 2746
    iget-object v1, p0, Landroidx/appcompat/widget/Toolbar$write;->IconCompatParcelizer:Landroidx/appcompat/widget/Toolbar;

    if-eq v0, v1, :cond_65

    .line 2747
    instance-of v2, v0, Landroid/view/ViewGroup;

    if-eqz v2, :cond_44

    .line 2748
    check-cast v0, Landroid/view/ViewGroup;

    iget-object v1, v1, Landroidx/appcompat/widget/Toolbar;->AudioAttributesCompatParcelizer:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 2750
    :cond_44
    invoke-static {}, Landroidx/appcompat/widget/Toolbar;->AudioAttributesImplApi26Parcelizer()Landroidx/appcompat/widget/Toolbar$LayoutParams;

    move-result-object v0

    .line 2751
    iget-object v1, p0, Landroidx/appcompat/widget/Toolbar$write;->IconCompatParcelizer:Landroidx/appcompat/widget/Toolbar;

    iget v1, v1, Landroidx/appcompat/widget/Toolbar;->IconCompatParcelizer:I

    and-int/lit8 v1, v1, 0x70

    const v2, 0x800003

    or-int/2addr v1, v2

    iput v1, v0, Landroidx/appcompat/app/ActionBar$LayoutParams;->write:I

    const/4 v1, 0x2

    .line 2752
    iput v1, v0, Landroidx/appcompat/widget/Toolbar$LayoutParams;->RemoteActionCompatParcelizer:I

    .line 2753
    iget-object v1, p0, Landroidx/appcompat/widget/Toolbar$write;->IconCompatParcelizer:Landroidx/appcompat/widget/Toolbar;

    iget-object v1, v1, Landroidx/appcompat/widget/Toolbar;->AudioAttributesCompatParcelizer:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 2754
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar$write;->IconCompatParcelizer:Landroidx/appcompat/widget/Toolbar;

    iget-object v1, v0, Landroidx/appcompat/widget/Toolbar;->AudioAttributesCompatParcelizer:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 2757
    :cond_65
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar$write;->IconCompatParcelizer:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v0}, Landroidx/appcompat/widget/Toolbar;->onMediaButtonEvent()V

    .line 2758
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar$write;->IconCompatParcelizer:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v0}, Landroid/view/View;->requestLayout()V

    const/4 v0, 0x1

    .line 2759
    invoke-virtual {p1, v0}, Lo/onRetainNonConfigurationInstance;->IconCompatParcelizer(Z)V

    .line 2761
    iget-object p1, p0, Landroidx/appcompat/widget/Toolbar$write;->IconCompatParcelizer:Landroidx/appcompat/widget/Toolbar;

    iget-object p1, p1, Landroidx/appcompat/widget/Toolbar;->AudioAttributesCompatParcelizer:Landroid/view/View;

    instance-of p1, p1, Lo/invalidateMenu;

    if-eqz p1, :cond_84

    .line 2762
    iget-object p1, p0, Landroidx/appcompat/widget/Toolbar$write;->IconCompatParcelizer:Landroidx/appcompat/widget/Toolbar;

    iget-object p1, p1, Landroidx/appcompat/widget/Toolbar;->AudioAttributesCompatParcelizer:Landroid/view/View;

    check-cast p1, Lo/invalidateMenu;

    invoke-interface {p1}, Lo/invalidateMenu;->IconCompatParcelizer()V

    .line 2766
    :cond_84
    iget-object p0, p0, Landroidx/appcompat/widget/Toolbar$write;->IconCompatParcelizer:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->onPlayFromMediaId()V

    return v0
.end method

.method public final write(Lo/removeOnTrimMemoryListener;)Z
    .registers 2

    const/4 p0, 0x0

    return p0
.end method

###### Class kotlin.ActionMenuItemView (o.ActionMenuItemView)
.class public final synthetic Lo/ActionMenuItemView;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic write:Landroidx/appcompat/widget/Toolbar;


# direct methods
.method public synthetic constructor <init>(Landroidx/appcompat/widget/Toolbar;)V
    .registers 2

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo/ActionMenuItemView;->write:Landroidx/appcompat/widget/Toolbar;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 1

    .line 0
    iget-object p0, p0, Lo/ActionMenuItemView;->write:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->S_()V

    return-void
.end method

###### Class kotlin.setPadding (o.setPadding)
.class public final synthetic Lo/setPadding;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic write:Landroidx/appcompat/widget/Toolbar;


# direct methods
.method public synthetic constructor <init>(Landroidx/appcompat/widget/Toolbar;)V
    .registers 2

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo/setPadding;->write:Landroidx/appcompat/widget/Toolbar;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 1

    .line 0
    iget-object p0, p0, Lo/setPadding;->write:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()V

    return-void
.end method
