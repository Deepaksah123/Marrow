###### Class androidx.appcompat.widget.SwitchCompat (androidx.appcompat.widget.SwitchCompat)
.class public Landroidx/appcompat/widget/SwitchCompat;
.super Landroid/widget/CompoundButton;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/appcompat/widget/SwitchCompat$RemoteActionCompatParcelizer;,
        Landroidx/appcompat/widget/SwitchCompat$AudioAttributesCompatParcelizer;
    }
.end annotation


# static fields
.field private static final AudioAttributesCompatParcelizer:[I

.field private static final RemoteActionCompatParcelizer:Landroid/util/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/Property<",
            "Landroidx/appcompat/widget/SwitchCompat;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private AudioAttributesImplApi21Parcelizer:Z

.field private AudioAttributesImplApi26Parcelizer:Z

.field private AudioAttributesImplBaseParcelizer:Z

.field IconCompatParcelizer:Landroid/animation/ObjectAnimator;

.field private MediaBrowserCompatCustomActionResultReceiver:Landroidx/appcompat/widget/SwitchCompat$AudioAttributesCompatParcelizer;

.field private MediaBrowserCompatItemReceiver:Z

.field private MediaBrowserCompatMediaItem:Z

.field private MediaBrowserCompatSearchResultReceiver:I

.field private MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:I

.field private MediaDescriptionCompat:Landroid/text/Layout;

.field private MediaMetadataCompat:Landroid/text/Layout;

.field private MediaSessionCompatResultReceiverWrapper:Landroid/view/VelocityTracker;

.field private RatingCompat:Z

.field private handleMediaPlayPauseIfPendingOnHandler:Z

.field private onAddQueueItem:I

.field private onCommand:I

.field private onCustomAction:I

.field private onFastForward:I

.field private onMediaButtonEvent:I

.field private onPause:I

.field private onPlay:Landroid/text/method/TransformationMethod;

.field private onPlayFromMediaId:I

.field private final onPlayFromSearch:Landroid/graphics/Rect;

.field private onPlayFromUri:Ljava/lang/CharSequence;

.field private final onPrepare:Lo/setEnabled;

.field private onPrepareFromMediaId:Ljava/lang/CharSequence;

.field private onPrepareFromSearch:Landroid/content/res/ColorStateList;

.field private final onPrepareFromUri:Landroid/text/TextPaint;

.field private onRemoveQueueItem:Ljava/lang/CharSequence;

.field private onRemoveQueueItemAt:Landroid/graphics/drawable/Drawable;

.field private onRewind:I

.field private onSeekTo:Ljava/lang/CharSequence;

.field private onSetCaptioningEnabled:Landroid/content/res/ColorStateList;

.field private onSetPlaybackSpeed:Landroid/graphics/PorterDuff$Mode;

.field private onSetRating:I

.field private onSetRepeatMode:I

.field private onSetShuffleMode:I

.field private onSkipToNext:Landroid/content/res/ColorStateList;

.field private onSkipToPrevious:Landroid/graphics/PorterDuff$Mode;

.field private onSkipToQueueItem:F

.field private onStop:F

.field read:F

.field private setSessionImpl:Landroid/graphics/drawable/Drawable;

.field private write:Lo/getEnabledChangedCallbackactivity_release;


# direct methods
.method static constructor <clinit>()V
    .registers 3

    .line 120
    new-instance v0, Landroidx/appcompat/widget/SwitchCompat$5;

    const-class v1, Ljava/lang/Float;

    const-string v2, "thumbPos"

    invoke-direct {v0, v1, v2}, Landroidx/appcompat/widget/SwitchCompat$5;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    sput-object v0, Landroidx/appcompat/widget/SwitchCompat;->RemoteActionCompatParcelizer:Landroid/util/Property;

    const v0, 0x10100a0

    .line 212
    filled-new-array {v0}, [I

    move-result-object v0

    sput-object v0, Landroidx/appcompat/widget/SwitchCompat;->AudioAttributesCompatParcelizer:[I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .registers 3

    const/4 v0, 0x0

    .line 222
    invoke-direct {p0, p1, v0}, Landroidx/appcompat/widget/SwitchCompat;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 4

    .line 233
    sget v0, Lo/_init_lambda5$read;->switchStyle:I

    invoke-direct {p0, p1, p2, v0}, Landroidx/appcompat/widget/SwitchCompat;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 15

    .line 247
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/CompoundButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 v0, 0x0

    .line 134
    iput-object v0, p0, Landroidx/appcompat/widget/SwitchCompat;->onSetCaptioningEnabled:Landroid/content/res/ColorStateList;

    .line 135
    iput-object v0, p0, Landroidx/appcompat/widget/SwitchCompat;->onSetPlaybackSpeed:Landroid/graphics/PorterDuff$Mode;

    const/4 v1, 0x0

    .line 136
    iput-boolean v1, p0, Landroidx/appcompat/widget/SwitchCompat;->AudioAttributesImplBaseParcelizer:Z

    .line 137
    iput-boolean v1, p0, Landroidx/appcompat/widget/SwitchCompat;->AudioAttributesImplApi26Parcelizer:Z

    .line 140
    iput-object v0, p0, Landroidx/appcompat/widget/SwitchCompat;->onSkipToNext:Landroid/content/res/ColorStateList;

    .line 141
    iput-object v0, p0, Landroidx/appcompat/widget/SwitchCompat;->onSkipToPrevious:Landroid/graphics/PorterDuff$Mode;

    .line 142
    iput-boolean v1, p0, Landroidx/appcompat/widget/SwitchCompat;->AudioAttributesImplApi21Parcelizer:Z

    .line 143
    iput-boolean v1, p0, Landroidx/appcompat/widget/SwitchCompat;->RatingCompat:Z

    .line 159
    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    move-result-object v2

    iput-object v2, p0, Landroidx/appcompat/widget/SwitchCompat;->MediaSessionCompatResultReceiverWrapper:Landroid/view/VelocityTracker;

    const/4 v2, 0x1

    .line 194
    iput-boolean v2, p0, Landroidx/appcompat/widget/SwitchCompat;->MediaBrowserCompatItemReceiver:Z

    .line 209
    new-instance v3, Landroid/graphics/Rect;

    invoke-direct {v3}, Landroid/graphics/Rect;-><init>()V

    iput-object v3, p0, Landroidx/appcompat/widget/SwitchCompat;->onPlayFromSearch:Landroid/graphics/Rect;

    .line 249
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-static {p0, v3}, Lo/setPositiveButton;->IconCompatParcelizer(Landroid/view/View;Landroid/content/Context;)V

    .line 251
    new-instance v3, Landroid/text/TextPaint;

    invoke-direct {v3, v2}, Landroid/text/TextPaint;-><init>(I)V

    iput-object v3, p0, Landroidx/appcompat/widget/SwitchCompat;->onPrepareFromUri:Landroid/text/TextPaint;

    .line 253
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    .line 254
    invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v4

    iget v4, v4, Landroid/util/DisplayMetrics;->density:F

    iput v4, v3, Landroid/text/TextPaint;->density:F

    .line 256
    sget-object v3, Lo/_init_lambda5$AudioAttributesImplApi26Parcelizer;->SwitchCompat:[I

    invoke-static {p1, p2, v3, p3, v1}, Lo/setTitle;->read(Landroid/content/Context;Landroid/util/AttributeSet;[III)Lo/setTitle;

    move-result-object v3

    .line 258
    sget-object v6, Lo/_init_lambda5$AudioAttributesImplApi26Parcelizer;->SwitchCompat:[I

    .line 260
    invoke-virtual {v3}, Lo/setTitle;->AudioAttributesCompatParcelizer()Landroid/content/res/TypedArray;

    move-result-object v8

    const/4 v10, 0x0

    move-object v4, p0

    move-object v5, p1

    move-object v7, p2

    move v9, p3

    .line 258
    invoke-static/range {v4 .. v10}, Lo/InvalidTypeIdException;->IconCompatParcelizer(Landroid/view/View;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;II)V

    .line 262
    sget v4, Lo/_init_lambda5$AudioAttributesImplApi26Parcelizer;->SwitchCompat_android_thumb:I

    invoke-virtual {v3, v4}, Lo/setTitle;->IconCompatParcelizer(I)Landroid/graphics/drawable/Drawable;

    move-result-object v4

    iput-object v4, p0, Landroidx/appcompat/widget/SwitchCompat;->onRemoveQueueItemAt:Landroid/graphics/drawable/Drawable;

    if-eqz v4, :cond_60

    .line 264
    invoke-virtual {v4, p0}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    .line 266
    :cond_60
    sget v4, Lo/_init_lambda5$AudioAttributesImplApi26Parcelizer;->SwitchCompat_track:I

    invoke-virtual {v3, v4}, Lo/setTitle;->IconCompatParcelizer(I)Landroid/graphics/drawable/Drawable;

    move-result-object v4

    iput-object v4, p0, Landroidx/appcompat/widget/SwitchCompat;->setSessionImpl:Landroid/graphics/drawable/Drawable;

    if-eqz v4, :cond_6d

    .line 268
    invoke-virtual {v4, p0}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    .line 270
    :cond_6d
    sget v4, Lo/_init_lambda5$AudioAttributesImplApi26Parcelizer;->SwitchCompat_android_textOn:I

    invoke-virtual {v3, v4}, Lo/setTitle;->AudioAttributesImplBaseParcelizer(I)Ljava/lang/CharSequence;

    move-result-object v4

    invoke-direct {p0, v4}, Landroidx/appcompat/widget/SwitchCompat;->IconCompatParcelizer(Ljava/lang/CharSequence;)V

    .line 271
    sget v4, Lo/_init_lambda5$AudioAttributesImplApi26Parcelizer;->SwitchCompat_android_textOff:I

    invoke-virtual {v3, v4}, Lo/setTitle;->AudioAttributesImplBaseParcelizer(I)Ljava/lang/CharSequence;

    move-result-object v4

    invoke-direct {p0, v4}, Landroidx/appcompat/widget/SwitchCompat;->RemoteActionCompatParcelizer(Ljava/lang/CharSequence;)V

    .line 272
    sget v4, Lo/_init_lambda5$AudioAttributesImplApi26Parcelizer;->SwitchCompat_showText:I

    invoke-virtual {v3, v4, v2}, Lo/setTitle;->AudioAttributesCompatParcelizer(IZ)Z

    move-result v4

    iput-boolean v4, p0, Landroidx/appcompat/widget/SwitchCompat;->MediaBrowserCompatMediaItem:Z

    .line 273
    sget v4, Lo/_init_lambda5$AudioAttributesImplApi26Parcelizer;->SwitchCompat_thumbTextPadding:I

    invoke-virtual {v3, v4, v1}, Lo/setTitle;->AudioAttributesCompatParcelizer(II)I

    move-result v4

    iput v4, p0, Landroidx/appcompat/widget/SwitchCompat;->onRewind:I

    .line 275
    sget v4, Lo/_init_lambda5$AudioAttributesImplApi26Parcelizer;->SwitchCompat_switchMinWidth:I

    invoke-virtual {v3, v4, v1}, Lo/setTitle;->AudioAttributesCompatParcelizer(II)I

    move-result v4

    iput v4, p0, Landroidx/appcompat/widget/SwitchCompat;->onCommand:I

    .line 277
    sget v4, Lo/_init_lambda5$AudioAttributesImplApi26Parcelizer;->SwitchCompat_switchPadding:I

    invoke-virtual {v3, v4, v1}, Lo/setTitle;->AudioAttributesCompatParcelizer(II)I

    move-result v4

    iput v4, p0, Landroidx/appcompat/widget/SwitchCompat;->onMediaButtonEvent:I

    .line 279
    sget v4, Lo/_init_lambda5$AudioAttributesImplApi26Parcelizer;->SwitchCompat_splitTrack:I

    invoke-virtual {v3, v4, v1}, Lo/setTitle;->AudioAttributesCompatParcelizer(IZ)Z

    move-result v4

    iput-boolean v4, p0, Landroidx/appcompat/widget/SwitchCompat;->handleMediaPlayPauseIfPendingOnHandler:Z

    .line 281
    sget v4, Lo/_init_lambda5$AudioAttributesImplApi26Parcelizer;->SwitchCompat_thumbTint:I

    invoke-virtual {v3, v4}, Lo/setTitle;->write(I)Landroid/content/res/ColorStateList;

    move-result-object v4

    if-eqz v4, :cond_b3

    .line 283
    iput-object v4, p0, Landroidx/appcompat/widget/SwitchCompat;->onSetCaptioningEnabled:Landroid/content/res/ColorStateList;

    .line 284
    iput-boolean v2, p0, Landroidx/appcompat/widget/SwitchCompat;->AudioAttributesImplBaseParcelizer:Z

    .line 286
    :cond_b3
    sget v4, Lo/_init_lambda5$AudioAttributesImplApi26Parcelizer;->SwitchCompat_thumbTintMode:I

    const/4 v5, -0x1

    .line 287
    invoke-virtual {v3, v4, v5}, Lo/setTitle;->read(II)I

    move-result v4

    .line 286
    invoke-static {v4, v0}, Lo/IntentSenderRequest;->write(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;

    move-result-object v4

    .line 288
    iget-object v6, p0, Landroidx/appcompat/widget/SwitchCompat;->onSetPlaybackSpeed:Landroid/graphics/PorterDuff$Mode;

    if-eq v6, v4, :cond_c6

    .line 289
    iput-object v4, p0, Landroidx/appcompat/widget/SwitchCompat;->onSetPlaybackSpeed:Landroid/graphics/PorterDuff$Mode;

    .line 290
    iput-boolean v2, p0, Landroidx/appcompat/widget/SwitchCompat;->AudioAttributesImplApi26Parcelizer:Z

    .line 292
    :cond_c6
    iget-boolean v4, p0, Landroidx/appcompat/widget/SwitchCompat;->AudioAttributesImplBaseParcelizer:Z

    if-nez v4, :cond_ce

    iget-boolean v4, p0, Landroidx/appcompat/widget/SwitchCompat;->AudioAttributesImplApi26Parcelizer:Z

    if-eqz v4, :cond_d1

    .line 293
    :cond_ce
    invoke-direct {p0}, Landroidx/appcompat/widget/SwitchCompat;->AudioAttributesImplBaseParcelizer()V

    .line 296
    :cond_d1
    sget v4, Lo/_init_lambda5$AudioAttributesImplApi26Parcelizer;->SwitchCompat_trackTint:I

    invoke-virtual {v3, v4}, Lo/setTitle;->write(I)Landroid/content/res/ColorStateList;

    move-result-object v4

    if-eqz v4, :cond_dd

    .line 298
    iput-object v4, p0, Landroidx/appcompat/widget/SwitchCompat;->onSkipToNext:Landroid/content/res/ColorStateList;

    .line 299
    iput-boolean v2, p0, Landroidx/appcompat/widget/SwitchCompat;->AudioAttributesImplApi21Parcelizer:Z

    .line 301
    :cond_dd
    sget v4, Lo/_init_lambda5$AudioAttributesImplApi26Parcelizer;->SwitchCompat_trackTintMode:I

    .line 302
    invoke-virtual {v3, v4, v5}, Lo/setTitle;->read(II)I

    move-result v4

    .line 301
    invoke-static {v4, v0}, Lo/IntentSenderRequest;->write(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;

    move-result-object v0

    .line 303
    iget-object v4, p0, Landroidx/appcompat/widget/SwitchCompat;->onSkipToPrevious:Landroid/graphics/PorterDuff$Mode;

    if-eq v4, v0, :cond_ef

    .line 304
    iput-object v0, p0, Landroidx/appcompat/widget/SwitchCompat;->onSkipToPrevious:Landroid/graphics/PorterDuff$Mode;

    .line 305
    iput-boolean v2, p0, Landroidx/appcompat/widget/SwitchCompat;->RatingCompat:Z

    .line 307
    :cond_ef
    iget-boolean v0, p0, Landroidx/appcompat/widget/SwitchCompat;->AudioAttributesImplApi21Parcelizer:Z

    if-nez v0, :cond_f7

    iget-boolean v0, p0, Landroidx/appcompat/widget/SwitchCompat;->RatingCompat:Z

    if-eqz v0, :cond_fa

    .line 308
    :cond_f7
    invoke-direct {p0}, Landroidx/appcompat/widget/SwitchCompat;->MediaBrowserCompatItemReceiver()V

    .line 311
    :cond_fa
    sget v0, Lo/_init_lambda5$AudioAttributesImplApi26Parcelizer;->SwitchCompat_switchTextAppearance:I

    invoke-virtual {v3, v0, v1}, Lo/setTitle;->MediaBrowserCompatItemReceiver(II)I

    move-result v0

    if-eqz v0, :cond_105

    .line 314
    invoke-virtual {p0, p1, v0}, Landroidx/appcompat/widget/SwitchCompat;->setSwitchTextAppearance(Landroid/content/Context;I)V

    .line 317
    :cond_105
    new-instance v0, Lo/setEnabled;

    invoke-direct {v0, p0}, Lo/setEnabled;-><init>(Landroid/widget/TextView;)V

    iput-object v0, p0, Landroidx/appcompat/widget/SwitchCompat;->onPrepare:Lo/setEnabled;

    .line 318
    invoke-virtual {v0, p2, p3}, Lo/setEnabled;->read(Landroid/util/AttributeSet;I)V

    .line 320
    invoke-virtual {v3}, Lo/setTitle;->write()V

    .line 322
    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object p1

    .line 323
    invoke-virtual {p1}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result v0

    iput v0, p0, Landroidx/appcompat/widget/SwitchCompat;->onSetRepeatMode:I

    .line 324
    invoke-virtual {p1}, Landroid/view/ViewConfiguration;->getScaledMinimumFlingVelocity()I

    move-result p1

    iput p1, p0, Landroidx/appcompat/widget/SwitchCompat;->MediaBrowserCompatSearchResultReceiver:I

    .line 326
    invoke-direct {p0}, Landroidx/appcompat/widget/SwitchCompat;->MediaMetadataCompat()Lo/getEnabledChangedCallbackactivity_release;

    move-result-object p1

    .line 327
    invoke-virtual {p1, p2, p3}, Lo/getEnabledChangedCallbackactivity_release;->AudioAttributesCompatParcelizer(Landroid/util/AttributeSet;I)V

    .line 330
    invoke-virtual {p0}, Landroid/view/View;->refreshDrawableState()V

    .line 331
    invoke-virtual {p0}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result p1

    invoke-virtual {p0, p1}, Landroid/widget/CompoundButton;->setChecked(Z)V

    return-void
.end method

.method private AudioAttributesCompatParcelizer(Ljava/lang/CharSequence;)Landroid/text/Layout;
    .registers 10

    .line 993
    iget-object v2, p0, Landroidx/appcompat/widget/SwitchCompat;->onPrepareFromUri:Landroid/text/TextPaint;

    if-eqz p1, :cond_f

    .line 995
    invoke-static {p1, v2}, Landroid/text/Layout;->getDesiredWidth(Ljava/lang/CharSequence;Landroid/text/TextPaint;)F

    move-result p0

    float-to-double v0, p0

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int p0, v0

    goto :goto_10

    :cond_f
    const/4 p0, 0x0

    :goto_10
    move v3, p0

    new-instance p0, Landroid/text/StaticLayout;

    sget-object v4, Landroid/text/Layout$Alignment;->ALIGN_NORMAL:Landroid/text/Layout$Alignment;

    const/high16 v5, 0x3f800000    # 1.0f

    const/4 v6, 0x0

    const/4 v7, 0x1

    move-object v0, p0

    move-object v1, p1

    invoke-direct/range {v0 .. v7}, Landroid/text/StaticLayout;-><init>(Ljava/lang/CharSequence;Landroid/text/TextPaint;ILandroid/text/Layout$Alignment;FFZ)V

    return-object p0
.end method

.method private AudioAttributesImplBaseParcelizer()V
    .registers 3

    .line 753
    iget-object v0, p0, Landroidx/appcompat/widget/SwitchCompat;->onRemoveQueueItemAt:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_3b

    iget-boolean v1, p0, Landroidx/appcompat/widget/SwitchCompat;->AudioAttributesImplBaseParcelizer:Z

    if-nez v1, :cond_c

    iget-boolean v1, p0, Landroidx/appcompat/widget/SwitchCompat;->AudioAttributesImplApi26Parcelizer:Z

    if-eqz v1, :cond_3b

    .line 754
    :cond_c
    invoke-static {v0}, Lo/findFormatOverrides;->AudioAttributesImplApi26Parcelizer(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Landroidx/appcompat/widget/SwitchCompat;->onRemoveQueueItemAt:Landroid/graphics/drawable/Drawable;

    .line 756
    iget-boolean v1, p0, Landroidx/appcompat/widget/SwitchCompat;->AudioAttributesImplBaseParcelizer:Z

    if-eqz v1, :cond_1f

    .line 757
    iget-object v1, p0, Landroidx/appcompat/widget/SwitchCompat;->onSetCaptioningEnabled:Landroid/content/res/ColorStateList;

    invoke-static {v0, v1}, Lo/findFormatOverrides;->AudioAttributesCompatParcelizer(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;)V

    .line 760
    :cond_1f
    iget-boolean v0, p0, Landroidx/appcompat/widget/SwitchCompat;->AudioAttributesImplApi26Parcelizer:Z

    if-eqz v0, :cond_2a

    .line 761
    iget-object v0, p0, Landroidx/appcompat/widget/SwitchCompat;->onRemoveQueueItemAt:Landroid/graphics/drawable/Drawable;

    iget-object v1, p0, Landroidx/appcompat/widget/SwitchCompat;->onSetPlaybackSpeed:Landroid/graphics/PorterDuff$Mode;

    invoke-static {v0, v1}, Lo/findFormatOverrides;->read(Landroid/graphics/drawable/Drawable;Landroid/graphics/PorterDuff$Mode;)V

    .line 766
    :cond_2a
    iget-object v0, p0, Landroidx/appcompat/widget/SwitchCompat;->onRemoveQueueItemAt:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->isStateful()Z

    move-result v0

    if-eqz v0, :cond_3b

    .line 767
    iget-object v0, p0, Landroidx/appcompat/widget/SwitchCompat;->onRemoveQueueItemAt:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0}, Landroid/view/View;->getDrawableState()[I

    move-result-object p0

    invoke-virtual {v0, p0}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    :cond_3b
    return-void
.end method

.method private static IconCompatParcelizer(FFF)F
    .registers 4

    cmpg-float v0, p0, p1

    if-gez v0, :cond_5

    return p1

    :cond_5
    cmpl-float p1, p0, p2

    if-lez p1, :cond_a

    return p2

    :cond_a
    return p0
.end method

.method private IconCompatParcelizer(Ljava/lang/CharSequence;)V
    .registers 2

    .line 811
    iput-object p1, p0, Landroidx/appcompat/widget/SwitchCompat;->onSeekTo:Ljava/lang/CharSequence;

    .line 812
    invoke-direct {p0, p1}, Landroidx/appcompat/widget/SwitchCompat;->write(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p1

    iput-object p1, p0, Landroidx/appcompat/widget/SwitchCompat;->onRemoveQueueItem:Ljava/lang/CharSequence;

    const/4 p1, 0x0

    .line 813
    iput-object p1, p0, Landroidx/appcompat/widget/SwitchCompat;->MediaMetadataCompat:Landroid/text/Layout;

    .line 814
    iget-boolean p1, p0, Landroidx/appcompat/widget/SwitchCompat;->MediaBrowserCompatMediaItem:Z

    if-eqz p1, :cond_12

    .line 815
    invoke-direct {p0}, Landroidx/appcompat/widget/SwitchCompat;->onCustomAction()V

    :cond_12
    return-void
.end method

.method private IconCompatParcelizer(FF)Z
    .registers 12

    .line 1003
    iget-object v0, p0, Landroidx/appcompat/widget/SwitchCompat;->onRemoveQueueItemAt:Landroid/graphics/drawable/Drawable;

    const/4 v1, 0x0

    if-nez v0, :cond_6

    return v1

    .line 1008
    :cond_6
    invoke-direct {p0}, Landroidx/appcompat/widget/SwitchCompat;->MediaBrowserCompatMediaItem()I

    move-result v0

    .line 1010
    iget-object v2, p0, Landroidx/appcompat/widget/SwitchCompat;->onRemoveQueueItemAt:Landroid/graphics/drawable/Drawable;

    iget-object v3, p0, Landroidx/appcompat/widget/SwitchCompat;->onPlayFromSearch:Landroid/graphics/Rect;

    invoke-virtual {v2, v3}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    .line 1011
    iget v2, p0, Landroidx/appcompat/widget/SwitchCompat;->onFastForward:I

    iget v3, p0, Landroidx/appcompat/widget/SwitchCompat;->onSetRepeatMode:I

    .line 1012
    iget v4, p0, Landroidx/appcompat/widget/SwitchCompat;->onAddQueueItem:I

    add-int/2addr v4, v0

    sub-int/2addr v4, v3

    .line 1013
    iget v0, p0, Landroidx/appcompat/widget/SwitchCompat;->onSetShuffleMode:I

    iget-object v5, p0, Landroidx/appcompat/widget/SwitchCompat;->onPlayFromSearch:Landroid/graphics/Rect;

    iget v5, v5, Landroid/graphics/Rect;->left:I

    iget-object v6, p0, Landroidx/appcompat/widget/SwitchCompat;->onPlayFromSearch:Landroid/graphics/Rect;

    iget v6, v6, Landroid/graphics/Rect;->right:I

    iget v7, p0, Landroidx/appcompat/widget/SwitchCompat;->onSetRepeatMode:I

    .line 1015
    iget p0, p0, Landroidx/appcompat/widget/SwitchCompat;->onCustomAction:I

    int-to-float v8, v4

    cmpl-float v8, p1, v8

    if-lez v8, :cond_43

    add-int/2addr v0, v4

    add-int/2addr v0, v5

    add-int/2addr v0, v6

    add-int/2addr v0, v7

    int-to-float v0, v0

    cmpg-float p1, p1, v0

    if-gez p1, :cond_43

    sub-int/2addr v2, v3

    int-to-float p1, v2

    cmpl-float p1, p2, p1

    if-lez p1, :cond_43

    add-int/2addr p0, v7

    int-to-float p0, p0

    cmpg-float p0, p2, p0

    if-gez p0, :cond_43

    const/4 p0, 0x1

    return p0

    :cond_43
    return v1
.end method

.method private MediaBrowserCompatItemReceiver()V
    .registers 3

    .line 624
    iget-object v0, p0, Landroidx/appcompat/widget/SwitchCompat;->setSessionImpl:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_3b

    iget-boolean v1, p0, Landroidx/appcompat/widget/SwitchCompat;->AudioAttributesImplApi21Parcelizer:Z

    if-nez v1, :cond_c

    iget-boolean v1, p0, Landroidx/appcompat/widget/SwitchCompat;->RatingCompat:Z

    if-eqz v1, :cond_3b

    .line 625
    :cond_c
    invoke-static {v0}, Lo/findFormatOverrides;->AudioAttributesImplApi26Parcelizer(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Landroidx/appcompat/widget/SwitchCompat;->setSessionImpl:Landroid/graphics/drawable/Drawable;

    .line 627
    iget-boolean v1, p0, Landroidx/appcompat/widget/SwitchCompat;->AudioAttributesImplApi21Parcelizer:Z

    if-eqz v1, :cond_1f

    .line 628
    iget-object v1, p0, Landroidx/appcompat/widget/SwitchCompat;->onSkipToNext:Landroid/content/res/ColorStateList;

    invoke-static {v0, v1}, Lo/findFormatOverrides;->AudioAttributesCompatParcelizer(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;)V

    .line 631
    :cond_1f
    iget-boolean v0, p0, Landroidx/appcompat/widget/SwitchCompat;->RatingCompat:Z

    if-eqz v0, :cond_2a

    .line 632
    iget-object v0, p0, Landroidx/appcompat/widget/SwitchCompat;->setSessionImpl:Landroid/graphics/drawable/Drawable;

    iget-object v1, p0, Landroidx/appcompat/widget/SwitchCompat;->onSkipToPrevious:Landroid/graphics/PorterDuff$Mode;

    invoke-static {v0, v1}, Lo/findFormatOverrides;->read(Landroid/graphics/drawable/Drawable;Landroid/graphics/PorterDuff$Mode;)V

    .line 637
    :cond_2a
    iget-object v0, p0, Landroidx/appcompat/widget/SwitchCompat;->setSessionImpl:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->isStateful()Z

    move-result v0

    if-eqz v0, :cond_3b

    .line 638
    iget-object v0, p0, Landroidx/appcompat/widget/SwitchCompat;->setSessionImpl:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0}, Landroid/view/View;->getDrawableState()[I

    move-result-object p0

    invoke-virtual {v0, p0}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    :cond_3b
    return-void
.end method

.method private MediaBrowserCompatMediaItem()I
    .registers 3

    .line 1422
    invoke-static {p0}, Lo/setChecked;->AudioAttributesCompatParcelizer(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_c

    const/high16 v0, 0x3f800000    # 1.0f

    .line 1423
    iget v1, p0, Landroidx/appcompat/widget/SwitchCompat;->read:F

    sub-float/2addr v0, v1

    goto :goto_e

    .line 1425
    :cond_c
    iget v0, p0, Landroidx/appcompat/widget/SwitchCompat;->read:F

    .line 1427
    :goto_e
    invoke-direct {p0}, Landroidx/appcompat/widget/SwitchCompat;->MediaBrowserCompatSearchResultReceiver()I

    move-result p0

    int-to-float p0, p0

    mul-float/2addr v0, p0

    const/high16 p0, 0x3f000000    # 0.5f

    add-float/2addr v0, p0

    float-to-int p0, v0

    return p0
.end method

.method private MediaBrowserCompatSearchResultReceiver()I
    .registers 4

    .line 1431
    iget-object v0, p0, Landroidx/appcompat/widget/SwitchCompat;->setSessionImpl:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_26

    .line 1432
    iget-object v1, p0, Landroidx/appcompat/widget/SwitchCompat;->onPlayFromSearch:Landroid/graphics/Rect;

    .line 1433
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    .line 1436
    iget-object v0, p0, Landroidx/appcompat/widget/SwitchCompat;->onRemoveQueueItemAt:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_12

    .line 1437
    invoke-static {v0}, Lo/IntentSenderRequest;->write(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Rect;

    move-result-object v0

    goto :goto_14

    .line 1439
    :cond_12
    sget-object v0, Lo/IntentSenderRequest;->write:Landroid/graphics/Rect;

    .line 1442
    :goto_14
    iget v2, p0, Landroidx/appcompat/widget/SwitchCompat;->onPause:I

    iget p0, p0, Landroidx/appcompat/widget/SwitchCompat;->onSetShuffleMode:I

    sub-int/2addr v2, p0

    iget p0, v1, Landroid/graphics/Rect;->left:I

    sub-int/2addr v2, p0

    iget p0, v1, Landroid/graphics/Rect;->right:I

    sub-int/2addr v2, p0

    iget p0, v0, Landroid/graphics/Rect;->left:I

    sub-int/2addr v2, p0

    iget p0, v0, Landroid/graphics/Rect;->right:I

    sub-int/2addr v2, p0

    return v2

    :cond_26
    const/4 p0, 0x0

    return p0
.end method

.method private MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()V
    .registers 3

    .line 1580
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_17

    .line 1583
    iget-object v0, p0, Landroidx/appcompat/widget/SwitchCompat;->onSeekTo:Ljava/lang/CharSequence;

    if-nez v0, :cond_14

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lo/_init_lambda5$AudioAttributesImplApi21Parcelizer;->abc_capital_on:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 1581
    :cond_14
    invoke-static {p0, v0}, Lo/InvalidTypeIdException;->RemoteActionCompatParcelizer(Landroid/view/View;Ljava/lang/CharSequence;)V

    :cond_17
    return-void
.end method

.method private MediaDescriptionCompat()Z
    .registers 2

    .line 1155
    iget p0, p0, Landroidx/appcompat/widget/SwitchCompat;->read:F

    const/high16 v0, 0x3f000000    # 0.5f

    cmpl-float p0, p0, v0

    if-lez p0, :cond_a

    const/4 p0, 0x1

    return p0

    :cond_a
    const/4 p0, 0x0

    return p0
.end method

.method private MediaMetadataCompat()Lo/getEnabledChangedCallbackactivity_release;
    .registers 2

    .line 1614
    iget-object v0, p0, Landroidx/appcompat/widget/SwitchCompat;->write:Lo/getEnabledChangedCallbackactivity_release;

    if-nez v0, :cond_b

    .line 1615
    new-instance v0, Lo/getEnabledChangedCallbackactivity_release;

    invoke-direct {v0, p0}, Lo/getEnabledChangedCallbackactivity_release;-><init>(Landroid/widget/TextView;)V

    iput-object v0, p0, Landroidx/appcompat/widget/SwitchCompat;->write:Lo/getEnabledChangedCallbackactivity_release;

    .line 1617
    :cond_b
    iget-object p0, p0, Landroidx/appcompat/widget/SwitchCompat;->write:Lo/getEnabledChangedCallbackactivity_release;

    return-object p0
.end method

.method private RatingCompat()V
    .registers 1

    .line 1149
    iget-object p0, p0, Landroidx/appcompat/widget/SwitchCompat;->IconCompatParcelizer:Landroid/animation/ObjectAnimator;

    if-eqz p0, :cond_7

    .line 1150
    invoke-virtual {p0}, Landroid/animation/ObjectAnimator;->cancel()V

    :cond_7
    return-void
.end method

.method private RemoteActionCompatParcelizer(Landroid/view/MotionEvent;)V
    .registers 8

    const/4 v0, 0x0

    .line 1111
    iput v0, p0, Landroidx/appcompat/widget/SwitchCompat;->onSetRating:I

    .line 1115
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_12

    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    move-result v1

    if-eqz v1, :cond_12

    move v1, v2

    goto :goto_13

    :cond_12
    move v1, v0

    .line 1116
    :goto_13
    invoke-virtual {p0}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v3

    if-eqz v1, :cond_48

    .line 1119
    iget-object v1, p0, Landroidx/appcompat/widget/SwitchCompat;->MediaSessionCompatResultReceiverWrapper:Landroid/view/VelocityTracker;

    const/16 v4, 0x3e8

    invoke-virtual {v1, v4}, Landroid/view/VelocityTracker;->computeCurrentVelocity(I)V

    .line 1120
    iget-object v1, p0, Landroidx/appcompat/widget/SwitchCompat;->MediaSessionCompatResultReceiverWrapper:Landroid/view/VelocityTracker;

    invoke-virtual {v1}, Landroid/view/VelocityTracker;->getXVelocity()F

    move-result v1

    .line 1121
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v4

    iget v5, p0, Landroidx/appcompat/widget/SwitchCompat;->MediaBrowserCompatSearchResultReceiver:I

    int-to-float v5, v5

    cmpl-float v4, v4, v5

    if-lez v4, :cond_43

    .line 1122
    invoke-static {p0}, Lo/setChecked;->AudioAttributesCompatParcelizer(Landroid/view/View;)Z

    move-result v4

    const/4 v5, 0x0

    if-eqz v4, :cond_3d

    cmpg-float v1, v1, v5

    if-gez v1, :cond_41

    goto :goto_49

    :cond_3d
    cmpl-float v1, v1, v5

    if-gtz v1, :cond_49

    :cond_41
    move v2, v0

    goto :goto_49

    .line 1124
    :cond_43
    invoke-direct {p0}, Landroidx/appcompat/widget/SwitchCompat;->MediaDescriptionCompat()Z

    move-result v2

    goto :goto_49

    :cond_48
    move v2, v3

    :cond_49
    :goto_49
    if-eq v2, v3, :cond_4e

    .line 1131
    invoke-virtual {p0, v0}, Landroid/view/View;->playSoundEffect(I)V

    .line 1134
    :cond_4e
    invoke-virtual {p0, v2}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 1135
    invoke-direct {p0, p1}, Landroidx/appcompat/widget/SwitchCompat;->read(Landroid/view/MotionEvent;)V

    return-void
.end method

.method private RemoteActionCompatParcelizer(Ljava/lang/CharSequence;)V
    .registers 2

    .line 850
    iput-object p1, p0, Landroidx/appcompat/widget/SwitchCompat;->onPrepareFromMediaId:Ljava/lang/CharSequence;

    .line 851
    invoke-direct {p0, p1}, Landroidx/appcompat/widget/SwitchCompat;->write(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p1

    iput-object p1, p0, Landroidx/appcompat/widget/SwitchCompat;->onPlayFromUri:Ljava/lang/CharSequence;

    const/4 p1, 0x0

    .line 852
    iput-object p1, p0, Landroidx/appcompat/widget/SwitchCompat;->MediaDescriptionCompat:Landroid/text/Layout;

    .line 853
    iget-boolean p1, p0, Landroidx/appcompat/widget/SwitchCompat;->MediaBrowserCompatMediaItem:Z

    if-eqz p1, :cond_12

    .line 854
    invoke-direct {p0}, Landroidx/appcompat/widget/SwitchCompat;->onCustomAction()V

    :cond_12
    return-void
.end method

.method private RemoteActionCompatParcelizer(Z)V
    .registers 6

    if-eqz p1, :cond_5

    const/high16 p1, 0x3f800000    # 1.0f

    goto :goto_6

    :cond_5
    const/4 p1, 0x0

    .line 1140
    :goto_6
    sget-object v0, Landroidx/appcompat/widget/SwitchCompat;->RemoteActionCompatParcelizer:Landroid/util/Property;

    const/4 v1, 0x1

    new-array v2, v1, [F

    const/4 v3, 0x0

    aput p1, v2, v3

    invoke-static {p0, v0, v2}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    move-result-object p1

    iput-object p1, p0, Landroidx/appcompat/widget/SwitchCompat;->IconCompatParcelizer:Landroid/animation/ObjectAnimator;

    const-wide/16 v2, 0xfa

    .line 1141
    invoke-virtual {p1, v2, v3}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 1143
    iget-object p1, p0, Landroidx/appcompat/widget/SwitchCompat;->IconCompatParcelizer:Landroid/animation/ObjectAnimator;

    invoke-static {p1, v1}, Landroidx/appcompat/widget/SwitchCompat$RemoteActionCompatParcelizer;->read(Landroid/animation/ObjectAnimator;Z)V

    .line 1145
    iget-object p0, p0, Landroidx/appcompat/widget/SwitchCompat;->IconCompatParcelizer:Landroid/animation/ObjectAnimator;

    invoke-virtual {p0}, Landroid/animation/ObjectAnimator;->start()V

    return-void
.end method

.method private handleMediaPlayPauseIfPendingOnHandler()V
    .registers 3

    .line 1589
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_17

    .line 1592
    iget-object v0, p0, Landroidx/appcompat/widget/SwitchCompat;->onPrepareFromMediaId:Ljava/lang/CharSequence;

    if-nez v0, :cond_14

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lo/_init_lambda5$AudioAttributesImplApi21Parcelizer;->abc_capital_off:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 1590
    :cond_14
    invoke-static {p0, v0}, Lo/InvalidTypeIdException;->RemoteActionCompatParcelizer(Landroid/view/View;Ljava/lang/CharSequence;)V

    :cond_17
    return-void
.end method

.method private onCustomAction()V
    .registers 4

    .line 1642
    iget-object v0, p0, Landroidx/appcompat/widget/SwitchCompat;->MediaBrowserCompatCustomActionResultReceiver:Landroidx/appcompat/widget/SwitchCompat$AudioAttributesCompatParcelizer;

    if-nez v0, :cond_29

    iget-object v0, p0, Landroidx/appcompat/widget/SwitchCompat;->write:Lo/getEnabledChangedCallbackactivity_release;

    invoke-virtual {v0}, Lo/getEnabledChangedCallbackactivity_release;->write()Z

    move-result v0

    if-eqz v0, :cond_29

    .line 1645
    invoke-static {}, Lo/_booleanType;->read()Z

    move-result v0

    if-eqz v0, :cond_29

    .line 1646
    invoke-static {}, Lo/_booleanType;->AudioAttributesCompatParcelizer()Lo/_booleanType;

    move-result-object v0

    .line 1647
    invoke-virtual {v0}, Lo/_booleanType;->IconCompatParcelizer()I

    move-result v1

    const/4 v2, 0x3

    if-eq v1, v2, :cond_1f

    if-nez v1, :cond_29

    .line 1651
    :cond_1f
    new-instance v1, Landroidx/appcompat/widget/SwitchCompat$AudioAttributesCompatParcelizer;

    invoke-direct {v1, p0}, Landroidx/appcompat/widget/SwitchCompat$AudioAttributesCompatParcelizer;-><init>(Landroidx/appcompat/widget/SwitchCompat;)V

    iput-object v1, p0, Landroidx/appcompat/widget/SwitchCompat;->MediaBrowserCompatCustomActionResultReceiver:Landroidx/appcompat/widget/SwitchCompat$AudioAttributesCompatParcelizer;

    .line 1652
    invoke-virtual {v0, v1}, Lo/_booleanType;->read(Lo/_booleanType$IconCompatParcelizer;)V

    :cond_29
    return-void
.end method

.method private read(Landroid/view/MotionEvent;)V
    .registers 3

    .line 1099
    invoke-static {p1}, Landroid/view/MotionEvent;->obtain(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    move-result-object p1

    const/4 v0, 0x3

    .line 1100
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->setAction(I)V

    .line 1101
    invoke-super {p0, p1}, Landroid/widget/CompoundButton;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 1102
    invoke-virtual {p1}, Landroid/view/MotionEvent;->recycle()V

    return-void
.end method

.method private write(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
    .registers 4

    .line 876
    invoke-direct {p0}, Landroidx/appcompat/widget/SwitchCompat;->MediaMetadataCompat()Lo/getEnabledChangedCallbackactivity_release;

    move-result-object v0

    iget-object v1, p0, Landroidx/appcompat/widget/SwitchCompat;->onPlay:Landroid/text/method/TransformationMethod;

    invoke-virtual {v0, v1}, Lo/getEnabledChangedCallbackactivity_release;->read(Landroid/text/method/TransformationMethod;)Landroid/text/method/TransformationMethod;

    move-result-object v0

    if-eqz v0, :cond_11

    .line 878
    invoke-interface {v0, p1, p0}, Landroid/text/method/TransformationMethod;->getTransformation(Ljava/lang/CharSequence;Landroid/view/View;)Ljava/lang/CharSequence;

    move-result-object p0

    return-object p0

    :cond_11
    return-object p1
.end method

.method private write(II)V
    .registers 4

    const/4 v0, 0x1

    if-eq p1, v0, :cond_11

    const/4 v0, 0x2

    if-eq p1, v0, :cond_e

    const/4 v0, 0x3

    if-eq p1, v0, :cond_b

    const/4 p1, 0x0

    goto :goto_13

    .line 394
    :cond_b
    sget-object p1, Landroid/graphics/Typeface;->MONOSPACE:Landroid/graphics/Typeface;

    goto :goto_13

    .line 390
    :cond_e
    sget-object p1, Landroid/graphics/Typeface;->SERIF:Landroid/graphics/Typeface;

    goto :goto_13

    .line 386
    :cond_11
    sget-object p1, Landroid/graphics/Typeface;->SANS_SERIF:Landroid/graphics/Typeface;

    .line 398
    :goto_13
    invoke-virtual {p0, p1, p2}, Landroidx/appcompat/widget/SwitchCompat;->setSwitchTypeface(Landroid/graphics/Typeface;I)V

    return-void
.end method


# virtual methods
.method protected final AudioAttributesCompatParcelizer()F
    .registers 1

    .line 1163
    iget p0, p0, Landroidx/appcompat/widget/SwitchCompat;->read:F

    return p0
.end method

.method public AudioAttributesImplApi21Parcelizer()Landroid/graphics/PorterDuff$Mode;
    .registers 1

    .line 620
    iget-object p0, p0, Landroidx/appcompat/widget/SwitchCompat;->onSkipToPrevious:Landroid/graphics/PorterDuff$Mode;

    return-object p0
.end method

.method AudioAttributesImplApi26Parcelizer()V
    .registers 2

    .line 1665
    iget-object v0, p0, Landroidx/appcompat/widget/SwitchCompat;->onSeekTo:Ljava/lang/CharSequence;

    invoke-direct {p0, v0}, Landroidx/appcompat/widget/SwitchCompat;->IconCompatParcelizer(Ljava/lang/CharSequence;)V

    .line 1666
    iget-object v0, p0, Landroidx/appcompat/widget/SwitchCompat;->onPrepareFromMediaId:Ljava/lang/CharSequence;

    invoke-direct {p0, v0}, Landroidx/appcompat/widget/SwitchCompat;->RemoteActionCompatParcelizer(Ljava/lang/CharSequence;)V

    .line 1667
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public IconCompatParcelizer()Landroid/graphics/drawable/Drawable;
    .registers 1

    .line 684
    iget-object p0, p0, Landroidx/appcompat/widget/SwitchCompat;->onRemoveQueueItemAt:Landroid/graphics/drawable/Drawable;

    return-object p0
.end method

.method public MediaBrowserCompatCustomActionResultReceiver()Landroid/content/res/ColorStateList;
    .registers 1

    .line 589
    iget-object p0, p0, Landroidx/appcompat/widget/SwitchCompat;->onSkipToNext:Landroid/content/res/ColorStateList;

    return-object p0
.end method

.method public RemoteActionCompatParcelizer()Landroid/graphics/drawable/Drawable;
    .registers 1

    .line 557
    iget-object p0, p0, Landroidx/appcompat/widget/SwitchCompat;->setSessionImpl:Landroid/graphics/drawable/Drawable;

    return-object p0
.end method

.method RemoteActionCompatParcelizer(F)V
    .registers 2

    .line 1172
    iput p1, p0, Landroidx/appcompat/widget/SwitchCompat;->read:F

    .line 1173
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public draw(Landroid/graphics/Canvas;)V
    .registers 12

    .line 1262
    iget-object v0, p0, Landroidx/appcompat/widget/SwitchCompat;->onPlayFromSearch:Landroid/graphics/Rect;

    .line 1263
    iget v1, p0, Landroidx/appcompat/widget/SwitchCompat;->onAddQueueItem:I

    .line 1264
    iget v2, p0, Landroidx/appcompat/widget/SwitchCompat;->onFastForward:I

    .line 1265
    iget v3, p0, Landroidx/appcompat/widget/SwitchCompat;->onPlayFromMediaId:I

    .line 1266
    iget v4, p0, Landroidx/appcompat/widget/SwitchCompat;->onCustomAction:I

    .line 1268
    invoke-direct {p0}, Landroidx/appcompat/widget/SwitchCompat;->MediaBrowserCompatMediaItem()I

    move-result v5

    add-int/2addr v5, v1

    .line 1271
    iget-object v6, p0, Landroidx/appcompat/widget/SwitchCompat;->onRemoveQueueItemAt:Landroid/graphics/drawable/Drawable;

    if-eqz v6, :cond_18

    .line 1272
    invoke-static {v6}, Lo/IntentSenderRequest;->write(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Rect;

    move-result-object v6

    goto :goto_1a

    .line 1274
    :cond_18
    sget-object v6, Lo/IntentSenderRequest;->write:Landroid/graphics/Rect;

    .line 1278
    :goto_1a
    iget-object v7, p0, Landroidx/appcompat/widget/SwitchCompat;->setSessionImpl:Landroid/graphics/drawable/Drawable;

    if-eqz v7, :cond_61

    .line 1279
    invoke-virtual {v7, v0}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    .line 1282
    iget v7, v0, Landroid/graphics/Rect;->left:I

    add-int/2addr v5, v7

    if-eqz v6, :cond_5a

    .line 1290
    iget v7, v6, Landroid/graphics/Rect;->left:I

    iget v8, v0, Landroid/graphics/Rect;->left:I

    if-le v7, v8, :cond_32

    .line 1291
    iget v7, v6, Landroid/graphics/Rect;->left:I

    iget v8, v0, Landroid/graphics/Rect;->left:I

    sub-int/2addr v7, v8

    add-int/2addr v1, v7

    .line 1293
    :cond_32
    iget v7, v6, Landroid/graphics/Rect;->top:I

    iget v8, v0, Landroid/graphics/Rect;->top:I

    if-le v7, v8, :cond_3f

    .line 1294
    iget v7, v6, Landroid/graphics/Rect;->top:I

    iget v8, v0, Landroid/graphics/Rect;->top:I

    sub-int/2addr v7, v8

    add-int/2addr v7, v2

    goto :goto_40

    :cond_3f
    move v7, v2

    .line 1296
    :goto_40
    iget v8, v6, Landroid/graphics/Rect;->right:I

    iget v9, v0, Landroid/graphics/Rect;->right:I

    if-le v8, v9, :cond_4c

    .line 1297
    iget v8, v6, Landroid/graphics/Rect;->right:I

    iget v9, v0, Landroid/graphics/Rect;->right:I

    sub-int/2addr v8, v9

    sub-int/2addr v3, v8

    .line 1299
    :cond_4c
    iget v8, v6, Landroid/graphics/Rect;->bottom:I

    iget v9, v0, Landroid/graphics/Rect;->bottom:I

    if-le v8, v9, :cond_5b

    .line 1300
    iget v6, v6, Landroid/graphics/Rect;->bottom:I

    iget v8, v0, Landroid/graphics/Rect;->bottom:I

    sub-int/2addr v6, v8

    sub-int v6, v4, v6

    goto :goto_5c

    :cond_5a
    move v7, v2

    :cond_5b
    move v6, v4

    .line 1303
    :goto_5c
    iget-object v8, p0, Landroidx/appcompat/widget/SwitchCompat;->setSessionImpl:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v8, v1, v7, v3, v6}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 1307
    :cond_61
    iget-object v1, p0, Landroidx/appcompat/widget/SwitchCompat;->onRemoveQueueItemAt:Landroid/graphics/drawable/Drawable;

    if-eqz v1, :cond_80

    .line 1308
    invoke-virtual {v1, v0}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    .line 1310
    iget v1, v0, Landroid/graphics/Rect;->left:I

    sub-int v1, v5, v1

    .line 1311
    iget v3, p0, Landroidx/appcompat/widget/SwitchCompat;->onSetShuffleMode:I

    add-int/2addr v5, v3

    iget v0, v0, Landroid/graphics/Rect;->right:I

    add-int/2addr v5, v0

    .line 1312
    iget-object v0, p0, Landroidx/appcompat/widget/SwitchCompat;->onRemoveQueueItemAt:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, v1, v2, v5, v4}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 1314
    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_80

    .line 1316
    invoke-static {v0, v1, v2, v5, v4}, Lo/findFormatOverrides;->write(Landroid/graphics/drawable/Drawable;IIII)V

    .line 1322
    :cond_80
    invoke-super {p0, p1}, Landroid/widget/CompoundButton;->draw(Landroid/graphics/Canvas;)V

    return-void
.end method

.method public drawableHotspotChanged(FF)V
    .registers 4

    .line 1483
    invoke-super {p0, p1, p2}, Landroid/widget/CompoundButton;->drawableHotspotChanged(FF)V

    .line 1486
    iget-object v0, p0, Landroidx/appcompat/widget/SwitchCompat;->onRemoveQueueItemAt:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_a

    .line 1487
    invoke-static {v0, p1, p2}, Lo/findFormatOverrides;->AudioAttributesCompatParcelizer(Landroid/graphics/drawable/Drawable;FF)V

    .line 1490
    :cond_a
    iget-object p0, p0, Landroidx/appcompat/widget/SwitchCompat;->setSessionImpl:Landroid/graphics/drawable/Drawable;

    if-eqz p0, :cond_11

    .line 1491
    invoke-static {p0, p1, p2}, Lo/findFormatOverrides;->AudioAttributesCompatParcelizer(Landroid/graphics/drawable/Drawable;FF)V

    :cond_11
    return-void
.end method

.method protected drawableStateChanged()V
    .registers 5

    .line 1460
    invoke-super {p0}, Landroid/widget/CompoundButton;->drawableStateChanged()V

    .line 1462
    invoke-virtual {p0}, Landroid/view/View;->getDrawableState()[I

    move-result-object v0

    .line 1465
    iget-object v1, p0, Landroidx/appcompat/widget/SwitchCompat;->onRemoveQueueItemAt:Landroid/graphics/drawable/Drawable;

    if-eqz v1, :cond_16

    .line 1466
    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->isStateful()Z

    move-result v2

    if-eqz v2, :cond_16

    .line 1467
    invoke-virtual {v1, v0}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    move-result v1

    goto :goto_17

    :cond_16
    const/4 v1, 0x0

    .line 1470
    :goto_17
    iget-object v2, p0, Landroidx/appcompat/widget/SwitchCompat;->setSessionImpl:Landroid/graphics/drawable/Drawable;

    if-eqz v2, :cond_26

    .line 1471
    invoke-virtual {v2}, Landroid/graphics/drawable/Drawable;->isStateful()Z

    move-result v3

    if-eqz v3, :cond_26

    .line 1472
    invoke-virtual {v2, v0}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    move-result v0

    or-int/2addr v1, v0

    :cond_26
    if-eqz v1, :cond_2b

    .line 1476
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    :cond_2b
    return-void
.end method

.method public getCompoundPaddingLeft()I
    .registers 3

    .line 1392
    invoke-static {p0}, Lo/setChecked;->AudioAttributesCompatParcelizer(Landroid/view/View;)Z

    move-result v0

    if-nez v0, :cond_b

    .line 1393
    invoke-super {p0}, Landroid/widget/CompoundButton;->getCompoundPaddingLeft()I

    move-result p0

    return p0

    .line 1395
    :cond_b
    invoke-super {p0}, Landroid/widget/CompoundButton;->getCompoundPaddingLeft()I

    move-result v0

    iget v1, p0, Landroidx/appcompat/widget/SwitchCompat;->onPause:I

    add-int/2addr v0, v1

    .line 1396
    invoke-virtual {p0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1f

    .line 1397
    iget p0, p0, Landroidx/appcompat/widget/SwitchCompat;->onMediaButtonEvent:I

    add-int/2addr v0, p0

    :cond_1f
    return v0
.end method

.method public getCompoundPaddingRight()I
    .registers 3

    .line 1404
    invoke-static {p0}, Lo/setChecked;->AudioAttributesCompatParcelizer(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_b

    .line 1405
    invoke-super {p0}, Landroid/widget/CompoundButton;->getCompoundPaddingRight()I

    move-result p0

    return p0

    .line 1407
    :cond_b
    invoke-super {p0}, Landroid/widget/CompoundButton;->getCompoundPaddingRight()I

    move-result v0

    iget v1, p0, Landroidx/appcompat/widget/SwitchCompat;->onPause:I

    add-int/2addr v0, v1

    .line 1408
    invoke-virtual {p0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1f

    .line 1409
    iget p0, p0, Landroidx/appcompat/widget/SwitchCompat;->onMediaButtonEvent:I

    add-int/2addr v0, p0

    :cond_1f
    return v0
.end method

.method public getCustomSelectionActionModeCallback()Landroid/view/ActionMode$Callback;
    .registers 1

    .line 1558
    invoke-super {p0}, Landroid/widget/CompoundButton;->getCustomSelectionActionModeCallback()Landroid/view/ActionMode$Callback;

    move-result-object p0

    .line 1557
    invoke-static {p0}, Lo/_addSuperTypes;->AudioAttributesCompatParcelizer(Landroid/view/ActionMode$Callback;)Landroid/view/ActionMode$Callback;

    move-result-object p0

    return-object p0
.end method

.method public jumpDrawablesToCurrentState()V
    .registers 2

    .line 1502
    invoke-super {p0}, Landroid/widget/CompoundButton;->jumpDrawablesToCurrentState()V

    .line 1504
    iget-object v0, p0, Landroidx/appcompat/widget/SwitchCompat;->onRemoveQueueItemAt:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_a

    .line 1505
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->jumpToCurrentState()V

    .line 1508
    :cond_a
    iget-object v0, p0, Landroidx/appcompat/widget/SwitchCompat;->setSessionImpl:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_11

    .line 1509
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->jumpToCurrentState()V

    .line 1512
    :cond_11
    iget-object v0, p0, Landroidx/appcompat/widget/SwitchCompat;->IconCompatParcelizer:Landroid/animation/ObjectAnimator;

    if-eqz v0, :cond_23

    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->isStarted()Z

    move-result v0

    if-eqz v0, :cond_23

    .line 1513
    iget-object v0, p0, Landroidx/appcompat/widget/SwitchCompat;->IconCompatParcelizer:Landroid/animation/ObjectAnimator;

    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->end()V

    const/4 v0, 0x0

    .line 1514
    iput-object v0, p0, Landroidx/appcompat/widget/SwitchCompat;->IconCompatParcelizer:Landroid/animation/ObjectAnimator;

    :cond_23
    return-void
.end method

.method public onCreateDrawableState(I)[I
    .registers 2

    add-int/lit8 p1, p1, 0x1

    .line 1451
    invoke-super {p0, p1}, Landroid/widget/CompoundButton;->onCreateDrawableState(I)[I

    move-result-object p1

    .line 1452
    invoke-virtual {p0}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result p0

    if-eqz p0, :cond_11

    .line 1453
    sget-object p0, Landroidx/appcompat/widget/SwitchCompat;->AudioAttributesCompatParcelizer:[I

    invoke-static {p1, p0}, Landroidx/appcompat/widget/SwitchCompat;->mergeDrawableStates([I[I)[I

    :cond_11
    return-object p1
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .registers 13

    .line 1327
    invoke-super {p0, p1}, Landroid/widget/CompoundButton;->onDraw(Landroid/graphics/Canvas;)V

    .line 1329
    iget-object v0, p0, Landroidx/appcompat/widget/SwitchCompat;->onPlayFromSearch:Landroid/graphics/Rect;

    .line 1330
    iget-object v1, p0, Landroidx/appcompat/widget/SwitchCompat;->setSessionImpl:Landroid/graphics/drawable/Drawable;

    if-eqz v1, :cond_d

    .line 1332
    invoke-virtual {v1, v0}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    goto :goto_10

    .line 1334
    :cond_d
    invoke-virtual {v0}, Landroid/graphics/Rect;->setEmpty()V

    .line 1337
    :goto_10
    iget v2, p0, Landroidx/appcompat/widget/SwitchCompat;->onFastForward:I

    .line 1338
    iget v3, p0, Landroidx/appcompat/widget/SwitchCompat;->onCustomAction:I

    .line 1339
    iget v4, v0, Landroid/graphics/Rect;->top:I

    .line 1340
    iget v5, v0, Landroid/graphics/Rect;->bottom:I

    .line 1342
    iget-object v6, p0, Landroidx/appcompat/widget/SwitchCompat;->onRemoveQueueItemAt:Landroid/graphics/drawable/Drawable;

    if-eqz v1, :cond_4a

    .line 1344
    iget-boolean v7, p0, Landroidx/appcompat/widget/SwitchCompat;->handleMediaPlayPauseIfPendingOnHandler:Z

    if-eqz v7, :cond_47

    if-eqz v6, :cond_47

    .line 1345
    invoke-static {v6}, Lo/IntentSenderRequest;->write(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Rect;

    move-result-object v7

    .line 1346
    invoke-virtual {v6, v0}, Landroid/graphics/drawable/Drawable;->copyBounds(Landroid/graphics/Rect;)V

    .line 1347
    iget v8, v0, Landroid/graphics/Rect;->left:I

    iget v9, v7, Landroid/graphics/Rect;->left:I

    add-int/2addr v8, v9

    iput v8, v0, Landroid/graphics/Rect;->left:I

    .line 1348
    iget v8, v0, Landroid/graphics/Rect;->right:I

    iget v7, v7, Landroid/graphics/Rect;->right:I

    sub-int/2addr v8, v7

    iput v8, v0, Landroid/graphics/Rect;->right:I

    .line 1350
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v7

    .line 1351
    sget-object v8, Landroid/graphics/Region$Op;->DIFFERENCE:Landroid/graphics/Region$Op;

    invoke-virtual {p1, v0, v8}, Landroid/graphics/Canvas;->clipRect(Landroid/graphics/Rect;Landroid/graphics/Region$Op;)Z

    .line 1352
    invoke-virtual {v1, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 1353
    invoke-virtual {p1, v7}, Landroid/graphics/Canvas;->restoreToCount(I)V

    goto :goto_4a

    .line 1355
    :cond_47
    invoke-virtual {v1, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 1359
    :cond_4a
    :goto_4a
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v0

    if-eqz v6, :cond_53

    .line 1362
    invoke-virtual {v6, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 1365
    :cond_53
    invoke-direct {p0}, Landroidx/appcompat/widget/SwitchCompat;->MediaDescriptionCompat()Z

    move-result v1

    if-eqz v1, :cond_5c

    iget-object v1, p0, Landroidx/appcompat/widget/SwitchCompat;->MediaMetadataCompat:Landroid/text/Layout;

    goto :goto_5e

    :cond_5c
    iget-object v1, p0, Landroidx/appcompat/widget/SwitchCompat;->MediaDescriptionCompat:Landroid/text/Layout;

    :goto_5e
    if-eqz v1, :cond_a3

    .line 1367
    invoke-virtual {p0}, Landroid/view/View;->getDrawableState()[I

    move-result-object v7

    .line 1368
    iget-object v8, p0, Landroidx/appcompat/widget/SwitchCompat;->onPrepareFromSearch:Landroid/content/res/ColorStateList;

    if-eqz v8, :cond_72

    .line 1369
    iget-object v9, p0, Landroidx/appcompat/widget/SwitchCompat;->onPrepareFromUri:Landroid/text/TextPaint;

    const/4 v10, 0x0

    invoke-virtual {v8, v7, v10}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    move-result v8

    invoke-virtual {v9, v8}, Landroid/graphics/Paint;->setColor(I)V

    .line 1371
    :cond_72
    iget-object v8, p0, Landroidx/appcompat/widget/SwitchCompat;->onPrepareFromUri:Landroid/text/TextPaint;

    iput-object v7, v8, Landroid/text/TextPaint;->drawableState:[I

    if-eqz v6, :cond_82

    .line 1375
    invoke-virtual {v6}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object p0

    .line 1376
    iget v6, p0, Landroid/graphics/Rect;->left:I

    iget p0, p0, Landroid/graphics/Rect;->right:I

    add-int/2addr v6, p0

    goto :goto_86

    .line 1378
    :cond_82
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v6

    .line 1381
    :goto_86
    div-int/lit8 v6, v6, 0x2

    invoke-virtual {v1}, Landroid/text/Layout;->getWidth()I

    move-result p0

    div-int/lit8 p0, p0, 0x2

    add-int/2addr v2, v4

    sub-int/2addr v3, v5

    add-int/2addr v2, v3

    .line 1382
    div-int/lit8 v2, v2, 0x2

    invoke-virtual {v1}, Landroid/text/Layout;->getHeight()I

    move-result v3

    div-int/lit8 v3, v3, 0x2

    sub-int/2addr v6, p0

    int-to-float p0, v6

    sub-int/2addr v2, v3

    int-to-float v2, v2

    .line 1383
    invoke-virtual {p1, p0, v2}, Landroid/graphics/Canvas;->translate(FF)V

    .line 1384
    invoke-virtual {v1, p1}, Landroid/text/Layout;->draw(Landroid/graphics/Canvas;)V

    .line 1387
    :cond_a3
    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->restoreToCount(I)V

    return-void
.end method

.method public onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V
    .registers 2

    .line 1520
    invoke-super {p0, p1}, Landroid/widget/CompoundButton;->onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V

    .line 1521
    const-string p0, "android.widget.Switch"

    invoke-virtual {p1, p0}, Landroid/view/accessibility/AccessibilityEvent;->setClassName(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V
    .registers 4

    .line 1526
    invoke-super {p0, p1}, Landroid/widget/CompoundButton;->onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 1527
    const-string v0, "android.widget.Switch"

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setClassName(Ljava/lang/CharSequence;)V

    .line 1528
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-ge v0, v1, :cond_40

    .line 1529
    invoke-virtual {p0}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v0

    if-eqz v0, :cond_17

    iget-object p0, p0, Landroidx/appcompat/widget/SwitchCompat;->onSeekTo:Ljava/lang/CharSequence;

    goto :goto_19

    :cond_17
    iget-object p0, p0, Landroidx/appcompat/widget/SwitchCompat;->onPrepareFromMediaId:Ljava/lang/CharSequence;

    .line 1530
    :goto_19
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_40

    .line 1531
    invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    .line 1532
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_2d

    .line 1533
    invoke-virtual {p1, p0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setText(Ljava/lang/CharSequence;)V

    return-void

    .line 1535
    :cond_2d
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 1536
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    const/16 v0, 0x20

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 1537
    invoke-virtual {p1, v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setText(Ljava/lang/CharSequence;)V

    :cond_40
    return-void
.end method

.method protected onLayout(ZIIII)V
    .registers 7

    .line 1206
    invoke-super/range {p0 .. p5}, Landroid/widget/CompoundButton;->onLayout(ZIIII)V

    .line 1210
    iget-object p1, p0, Landroidx/appcompat/widget/SwitchCompat;->onRemoveQueueItemAt:Landroid/graphics/drawable/Drawable;

    const/4 p2, 0x0

    if-eqz p1, :cond_2e

    .line 1211
    iget-object p1, p0, Landroidx/appcompat/widget/SwitchCompat;->onPlayFromSearch:Landroid/graphics/Rect;

    .line 1212
    iget-object p3, p0, Landroidx/appcompat/widget/SwitchCompat;->setSessionImpl:Landroid/graphics/drawable/Drawable;

    if-eqz p3, :cond_12

    .line 1213
    invoke-virtual {p3, p1}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    goto :goto_15

    .line 1215
    :cond_12
    invoke-virtual {p1}, Landroid/graphics/Rect;->setEmpty()V

    .line 1218
    :goto_15
    iget-object p3, p0, Landroidx/appcompat/widget/SwitchCompat;->onRemoveQueueItemAt:Landroid/graphics/drawable/Drawable;

    invoke-static {p3}, Lo/IntentSenderRequest;->write(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Rect;

    move-result-object p3

    .line 1219
    iget p4, p3, Landroid/graphics/Rect;->left:I

    iget p5, p1, Landroid/graphics/Rect;->left:I

    sub-int/2addr p4, p5

    invoke-static {p2, p4}, Ljava/lang/Math;->max(II)I

    move-result p4

    .line 1220
    iget p3, p3, Landroid/graphics/Rect;->right:I

    iget p1, p1, Landroid/graphics/Rect;->right:I

    sub-int/2addr p3, p1

    invoke-static {p2, p3}, Ljava/lang/Math;->max(II)I

    move-result p2

    goto :goto_2f

    :cond_2e
    move p4, p2

    .line 1225
    :goto_2f
    invoke-static {p0}, Lo/setChecked;->AudioAttributesCompatParcelizer(Landroid/view/View;)Z

    move-result p1

    if-eqz p1, :cond_40

    .line 1226
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result p1

    add-int/2addr p1, p4

    .line 1227
    iget p3, p0, Landroidx/appcompat/widget/SwitchCompat;->onPause:I

    add-int/2addr p3, p1

    sub-int/2addr p3, p4

    sub-int/2addr p3, p2

    goto :goto_51

    .line 1229
    :cond_40
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result p1

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result p3

    sub-int/2addr p1, p3

    sub-int p3, p1, p2

    .line 1230
    iget p1, p0, Landroidx/appcompat/widget/SwitchCompat;->onPause:I

    sub-int p1, p3, p1

    add-int/2addr p1, p4

    add-int/2addr p1, p2

    .line 1235
    :goto_51
    invoke-virtual {p0}, Landroid/widget/TextView;->getGravity()I

    move-result p2

    and-int/lit8 p2, p2, 0x70

    const/16 p4, 0x10

    if-eq p2, p4, :cond_74

    const/16 p4, 0x50

    if-eq p2, p4, :cond_66

    .line 1238
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result p2

    .line 1239
    iget p4, p0, Landroidx/appcompat/widget/SwitchCompat;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:I

    goto :goto_89

    .line 1249
    :cond_66
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result p2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result p4

    sub-int/2addr p2, p4

    .line 1250
    iget p4, p0, Landroidx/appcompat/widget/SwitchCompat;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:I

    sub-int p4, p2, p4

    goto :goto_8d

    .line 1243
    :cond_74
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result p2

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result p4

    add-int/2addr p2, p4

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result p4

    sub-int/2addr p2, p4

    div-int/lit8 p2, p2, 0x2

    iget p4, p0, Landroidx/appcompat/widget/SwitchCompat;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:I

    div-int/lit8 p5, p4, 0x2

    sub-int/2addr p2, p5

    :goto_89
    add-int/2addr p4, p2

    move v0, p4

    move p4, p2

    move p2, v0

    .line 1254
    :goto_8d
    iput p1, p0, Landroidx/appcompat/widget/SwitchCompat;->onAddQueueItem:I

    .line 1255
    iput p4, p0, Landroidx/appcompat/widget/SwitchCompat;->onFastForward:I

    .line 1256
    iput p2, p0, Landroidx/appcompat/widget/SwitchCompat;->onCustomAction:I

    .line 1257
    iput p3, p0, Landroidx/appcompat/widget/SwitchCompat;->onPlayFromMediaId:I

    return-void
.end method

.method public onMeasure(II)V
    .registers 9

    .line 914
    iget-boolean v0, p0, Landroidx/appcompat/widget/SwitchCompat;->MediaBrowserCompatMediaItem:Z

    if-eqz v0, :cond_1c

    .line 915
    iget-object v0, p0, Landroidx/appcompat/widget/SwitchCompat;->MediaMetadataCompat:Landroid/text/Layout;

    if-nez v0, :cond_10

    .line 916
    iget-object v0, p0, Landroidx/appcompat/widget/SwitchCompat;->onRemoveQueueItem:Ljava/lang/CharSequence;

    invoke-direct {p0, v0}, Landroidx/appcompat/widget/SwitchCompat;->AudioAttributesCompatParcelizer(Ljava/lang/CharSequence;)Landroid/text/Layout;

    move-result-object v0

    iput-object v0, p0, Landroidx/appcompat/widget/SwitchCompat;->MediaMetadataCompat:Landroid/text/Layout;

    .line 919
    :cond_10
    iget-object v0, p0, Landroidx/appcompat/widget/SwitchCompat;->MediaDescriptionCompat:Landroid/text/Layout;

    if-nez v0, :cond_1c

    .line 920
    iget-object v0, p0, Landroidx/appcompat/widget/SwitchCompat;->onPlayFromUri:Ljava/lang/CharSequence;

    invoke-direct {p0, v0}, Landroidx/appcompat/widget/SwitchCompat;->AudioAttributesCompatParcelizer(Ljava/lang/CharSequence;)Landroid/text/Layout;

    move-result-object v0

    iput-object v0, p0, Landroidx/appcompat/widget/SwitchCompat;->MediaDescriptionCompat:Landroid/text/Layout;

    .line 924
    :cond_1c
    iget-object v0, p0, Landroidx/appcompat/widget/SwitchCompat;->onPlayFromSearch:Landroid/graphics/Rect;

    .line 927
    iget-object v1, p0, Landroidx/appcompat/widget/SwitchCompat;->onRemoveQueueItemAt:Landroid/graphics/drawable/Drawable;

    const/4 v2, 0x0

    if-eqz v1, :cond_39

    .line 929
    invoke-virtual {v1, v0}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    .line 930
    iget-object v1, p0, Landroidx/appcompat/widget/SwitchCompat;->onRemoveQueueItemAt:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v1

    iget v3, v0, Landroid/graphics/Rect;->left:I

    sub-int/2addr v1, v3

    iget v3, v0, Landroid/graphics/Rect;->right:I

    sub-int/2addr v1, v3

    .line 931
    iget-object v3, p0, Landroidx/appcompat/widget/SwitchCompat;->onRemoveQueueItemAt:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v3}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v3

    goto :goto_3b

    :cond_39
    move v1, v2

    move v3, v1

    .line 938
    :goto_3b
    iget-boolean v4, p0, Landroidx/appcompat/widget/SwitchCompat;->MediaBrowserCompatMediaItem:Z

    if-eqz v4, :cond_55

    .line 939
    iget-object v4, p0, Landroidx/appcompat/widget/SwitchCompat;->MediaMetadataCompat:Landroid/text/Layout;

    invoke-virtual {v4}, Landroid/text/Layout;->getWidth()I

    move-result v4

    iget-object v5, p0, Landroidx/appcompat/widget/SwitchCompat;->MediaDescriptionCompat:Landroid/text/Layout;

    invoke-virtual {v5}, Landroid/text/Layout;->getWidth()I

    move-result v5

    invoke-static {v4, v5}, Ljava/lang/Math;->max(II)I

    move-result v4

    iget v5, p0, Landroidx/appcompat/widget/SwitchCompat;->onRewind:I

    shl-int/lit8 v5, v5, 0x1

    add-int/2addr v4, v5

    goto :goto_56

    :cond_55
    move v4, v2

    .line 945
    :goto_56
    invoke-static {v4, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    iput v1, p0, Landroidx/appcompat/widget/SwitchCompat;->onSetShuffleMode:I

    .line 948
    iget-object v1, p0, Landroidx/appcompat/widget/SwitchCompat;->setSessionImpl:Landroid/graphics/drawable/Drawable;

    if-eqz v1, :cond_6a

    .line 949
    invoke-virtual {v1, v0}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    .line 950
    iget-object v1, p0, Landroidx/appcompat/widget/SwitchCompat;->setSessionImpl:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v2

    goto :goto_6d

    .line 952
    :cond_6a
    invoke-virtual {v0}, Landroid/graphics/Rect;->setEmpty()V

    .line 958
    :goto_6d
    iget v1, v0, Landroid/graphics/Rect;->left:I

    .line 959
    iget v0, v0, Landroid/graphics/Rect;->right:I

    .line 960
    iget-object v4, p0, Landroidx/appcompat/widget/SwitchCompat;->onRemoveQueueItemAt:Landroid/graphics/drawable/Drawable;

    if-eqz v4, :cond_85

    .line 961
    invoke-static {v4}, Lo/IntentSenderRequest;->write(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Rect;

    move-result-object v4

    .line 962
    iget v5, v4, Landroid/graphics/Rect;->left:I

    invoke-static {v1, v5}, Ljava/lang/Math;->max(II)I

    move-result v1

    .line 963
    iget v4, v4, Landroid/graphics/Rect;->right:I

    invoke-static {v0, v4}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 967
    :cond_85
    iget-boolean v4, p0, Landroidx/appcompat/widget/SwitchCompat;->MediaBrowserCompatItemReceiver:Z

    if-eqz v4, :cond_96

    .line 968
    iget v4, p0, Landroidx/appcompat/widget/SwitchCompat;->onCommand:I

    iget v5, p0, Landroidx/appcompat/widget/SwitchCompat;->onSetShuffleMode:I

    shl-int/lit8 v5, v5, 0x1

    add-int/2addr v5, v1

    add-int/2addr v5, v0

    invoke-static {v4, v5}, Ljava/lang/Math;->max(II)I

    move-result v0

    goto :goto_98

    .line 969
    :cond_96
    iget v0, p0, Landroidx/appcompat/widget/SwitchCompat;->onCommand:I

    .line 970
    :goto_98
    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v1

    .line 971
    iput v0, p0, Landroidx/appcompat/widget/SwitchCompat;->onPause:I

    .line 972
    iput v1, p0, Landroidx/appcompat/widget/SwitchCompat;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:I

    .line 974
    invoke-super {p0, p1, p2}, Landroid/widget/CompoundButton;->onMeasure(II)V

    .line 976
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result p1

    if-ge p1, v1, :cond_b0

    .line 978
    invoke-virtual {p0}, Landroidx/appcompat/widget/SwitchCompat;->getMeasuredWidthAndState()I

    move-result p1

    invoke-virtual {p0, p1, v1}, Landroidx/appcompat/widget/SwitchCompat;->setMeasuredDimension(II)V

    :cond_b0
    return-void
.end method

.method public onPopulateAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V
    .registers 3

    .line 984
    invoke-super {p0, p1}, Landroid/widget/CompoundButton;->onPopulateAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V

    .line 986
    invoke-virtual {p0}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v0

    if-eqz v0, :cond_c

    iget-object p0, p0, Landroidx/appcompat/widget/SwitchCompat;->onSeekTo:Ljava/lang/CharSequence;

    goto :goto_e

    :cond_c
    iget-object p0, p0, Landroidx/appcompat/widget/SwitchCompat;->onPrepareFromMediaId:Ljava/lang/CharSequence;

    :goto_e
    if-eqz p0, :cond_17

    .line 988
    invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityEvent;->getText()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_17
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .registers 8

    .line 1021
    iget-object v0, p0, Landroidx/appcompat/widget/SwitchCompat;->MediaSessionCompatResultReceiverWrapper:Landroid/view/VelocityTracker;

    invoke-virtual {v0, p1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 1022
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_9a

    const/4 v2, 0x2

    if-eq v0, v1, :cond_86

    if-eq v0, v2, :cond_16

    const/4 v3, 0x3

    if-eq v0, v3, :cond_86

    goto/16 :goto_b4

    .line 1036
    :cond_16
    iget v0, p0, Landroidx/appcompat/widget/SwitchCompat;->onSetRating:I

    if-eq v0, v1, :cond_52

    if-ne v0, v2, :cond_b4

    .line 1056
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result p1

    .line 1057
    invoke-direct {p0}, Landroidx/appcompat/widget/SwitchCompat;->MediaBrowserCompatSearchResultReceiver()I

    move-result v0

    .line 1058
    iget v2, p0, Landroidx/appcompat/widget/SwitchCompat;->onSkipToQueueItem:F

    sub-float v2, p1, v2

    const/high16 v3, 0x3f800000    # 1.0f

    const/4 v4, 0x0

    if-eqz v0, :cond_30

    int-to-float v0, v0

    div-float/2addr v2, v0

    goto :goto_38

    :cond_30
    cmpl-float v0, v2, v4

    if-lez v0, :cond_36

    move v2, v3

    goto :goto_38

    :cond_36
    const/high16 v2, -0x40800000    # -1.0f

    .line 1067
    :goto_38
    invoke-static {p0}, Lo/setChecked;->AudioAttributesCompatParcelizer(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_3f

    neg-float v2, v2

    .line 1070
    :cond_3f
    iget v0, p0, Landroidx/appcompat/widget/SwitchCompat;->read:F

    add-float/2addr v0, v2

    invoke-static {v0, v4, v3}, Landroidx/appcompat/widget/SwitchCompat;->IconCompatParcelizer(FFF)F

    move-result v0

    .line 1071
    iget v2, p0, Landroidx/appcompat/widget/SwitchCompat;->read:F

    cmpl-float v2, v0, v2

    if-eqz v2, :cond_51

    .line 1072
    iput p1, p0, Landroidx/appcompat/widget/SwitchCompat;->onSkipToQueueItem:F

    .line 1073
    invoke-virtual {p0, v0}, Landroidx/appcompat/widget/SwitchCompat;->RemoteActionCompatParcelizer(F)V

    :cond_51
    return v1

    .line 1042
    :cond_52
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    .line 1043
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v3

    .line 1044
    iget v4, p0, Landroidx/appcompat/widget/SwitchCompat;->onSkipToQueueItem:F

    sub-float v4, v0, v4

    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    move-result v4

    iget v5, p0, Landroidx/appcompat/widget/SwitchCompat;->onSetRepeatMode:I

    int-to-float v5, v5

    cmpl-float v4, v4, v5

    if-gtz v4, :cond_78

    iget v4, p0, Landroidx/appcompat/widget/SwitchCompat;->onStop:F

    sub-float v4, v3, v4

    .line 1045
    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    move-result v4

    iget v5, p0, Landroidx/appcompat/widget/SwitchCompat;->onSetRepeatMode:I

    int-to-float v5, v5

    cmpl-float v4, v4, v5

    if-lez v4, :cond_b4

    .line 1046
    :cond_78
    iput v2, p0, Landroidx/appcompat/widget/SwitchCompat;->onSetRating:I

    .line 1047
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    invoke-interface {p1, v1}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 1048
    iput v0, p0, Landroidx/appcompat/widget/SwitchCompat;->onSkipToQueueItem:F

    .line 1049
    iput v3, p0, Landroidx/appcompat/widget/SwitchCompat;->onStop:F

    return v1

    .line 1083
    :cond_86
    iget v0, p0, Landroidx/appcompat/widget/SwitchCompat;->onSetRating:I

    if-ne v0, v2, :cond_91

    .line 1084
    invoke-direct {p0, p1}, Landroidx/appcompat/widget/SwitchCompat;->RemoteActionCompatParcelizer(Landroid/view/MotionEvent;)V

    .line 1086
    invoke-super {p0, p1}, Landroid/widget/CompoundButton;->onTouchEvent(Landroid/view/MotionEvent;)Z

    return v1

    :cond_91
    const/4 v0, 0x0

    .line 1089
    iput v0, p0, Landroidx/appcompat/widget/SwitchCompat;->onSetRating:I

    .line 1090
    iget-object v0, p0, Landroidx/appcompat/widget/SwitchCompat;->MediaSessionCompatResultReceiverWrapper:Landroid/view/VelocityTracker;

    invoke-virtual {v0}, Landroid/view/VelocityTracker;->clear()V

    goto :goto_b4

    .line 1025
    :cond_9a
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    .line 1026
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v2

    .line 1027
    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    move-result v3

    if-eqz v3, :cond_b4

    invoke-direct {p0, v0, v2}, Landroidx/appcompat/widget/SwitchCompat;->IconCompatParcelizer(FF)Z

    move-result v3

    if-eqz v3, :cond_b4

    .line 1028
    iput v1, p0, Landroidx/appcompat/widget/SwitchCompat;->onSetRating:I

    .line 1029
    iput v0, p0, Landroidx/appcompat/widget/SwitchCompat;->onSkipToQueueItem:F

    .line 1030
    iput v2, p0, Landroidx/appcompat/widget/SwitchCompat;->onStop:F

    .line 1095
    :cond_b4
    :goto_b4
    invoke-super {p0, p1}, Landroid/widget/CompoundButton;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p0

    return p0
.end method

.method public read()Landroid/graphics/PorterDuff$Mode;
    .registers 1

    .line 749
    iget-object p0, p0, Landroidx/appcompat/widget/SwitchCompat;->onSetPlaybackSpeed:Landroid/graphics/PorterDuff$Mode;

    return-object p0
.end method

.method protected final read(Z)V
    .registers 2

    .line 1568
    iput-boolean p1, p0, Landroidx/appcompat/widget/SwitchCompat;->MediaBrowserCompatItemReceiver:Z

    .line 1569
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setAllCaps(Z)V
    .registers 2

    .line 1599
    invoke-super {p0, p1}, Landroid/widget/CompoundButton;->setAllCaps(Z)V

    .line 1600
    invoke-direct {p0}, Landroidx/appcompat/widget/SwitchCompat;->MediaMetadataCompat()Lo/getEnabledChangedCallbackactivity_release;

    move-result-object p0

    invoke-virtual {p0, p1}, Lo/getEnabledChangedCallbackactivity_release;->write(Z)V

    return-void
.end method

.method public setChecked(Z)V
    .registers 3

    .line 1183
    invoke-super {p0, p1}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 1187
    invoke-virtual {p0}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result p1

    if-eqz p1, :cond_d

    .line 1190
    invoke-direct {p0}, Landroidx/appcompat/widget/SwitchCompat;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()V

    goto :goto_10

    .line 1192
    :cond_d
    invoke-direct {p0}, Landroidx/appcompat/widget/SwitchCompat;->handleMediaPlayPauseIfPendingOnHandler()V

    .line 1195
    :goto_10
    invoke-virtual {p0}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object v0

    if-eqz v0, :cond_20

    invoke-static {p0}, Lo/InvalidTypeIdException;->onSeekTo(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_20

    .line 1196
    invoke-direct {p0, p1}, Landroidx/appcompat/widget/SwitchCompat;->RemoteActionCompatParcelizer(Z)V

    return-void

    .line 1199
    :cond_20
    invoke-direct {p0}, Landroidx/appcompat/widget/SwitchCompat;->RatingCompat()V

    if-eqz p1, :cond_28

    const/high16 p1, 0x3f800000    # 1.0f

    goto :goto_29

    :cond_28
    const/4 p1, 0x0

    .line 1200
    :goto_29
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/SwitchCompat;->RemoteActionCompatParcelizer(F)V

    return-void
.end method

.method public setCustomSelectionActionModeCallback(Landroid/view/ActionMode$Callback;)V
    .registers 2

    .line 1551
    invoke-static {p0, p1}, Lo/_addSuperTypes;->write(Landroid/widget/TextView;Landroid/view/ActionMode$Callback;)Landroid/view/ActionMode$Callback;

    move-result-object p1

    .line 1550
    invoke-super {p0, p1}, Landroid/widget/CompoundButton;->setCustomSelectionActionModeCallback(Landroid/view/ActionMode$Callback;)V

    return-void
.end method

.method public setEmojiCompatEnabled(Z)V
    .registers 3

    .line 1622
    invoke-direct {p0}, Landroidx/appcompat/widget/SwitchCompat;->MediaMetadataCompat()Lo/getEnabledChangedCallbackactivity_release;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/getEnabledChangedCallbackactivity_release;->read(Z)V

    .line 1624
    iget-object p1, p0, Landroidx/appcompat/widget/SwitchCompat;->onSeekTo:Ljava/lang/CharSequence;

    invoke-direct {p0, p1}, Landroidx/appcompat/widget/SwitchCompat;->IconCompatParcelizer(Ljava/lang/CharSequence;)V

    .line 1625
    iget-object p1, p0, Landroidx/appcompat/widget/SwitchCompat;->onPrepareFromMediaId:Ljava/lang/CharSequence;

    invoke-direct {p0, p1}, Landroidx/appcompat/widget/SwitchCompat;->RemoteActionCompatParcelizer(Ljava/lang/CharSequence;)V

    .line 1626
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public setFilters([Landroid/text/InputFilter;)V
    .registers 3

    .line 1605
    invoke-direct {p0}, Landroidx/appcompat/widget/SwitchCompat;->MediaMetadataCompat()Lo/getEnabledChangedCallbackactivity_release;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/getEnabledChangedCallbackactivity_release;->AudioAttributesCompatParcelizer([Landroid/text/InputFilter;)[Landroid/text/InputFilter;

    move-result-object p1

    invoke-super {p0, p1}, Landroid/widget/CompoundButton;->setFilters([Landroid/text/InputFilter;)V

    return-void
.end method

.method public setShowText(Z)V
    .registers 3

    .line 890
    iget-boolean v0, p0, Landroidx/appcompat/widget/SwitchCompat;->MediaBrowserCompatMediaItem:Z

    if-eq v0, p1, :cond_e

    .line 891
    iput-boolean p1, p0, Landroidx/appcompat/widget/SwitchCompat;->MediaBrowserCompatMediaItem:Z

    .line 892
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    if-eqz p1, :cond_e

    .line 894
    invoke-direct {p0}, Landroidx/appcompat/widget/SwitchCompat;->onCustomAction()V

    :cond_e
    return-void
.end method

.method public setSplitTrack(Z)V
    .registers 2

    .line 782
    iput-boolean p1, p0, Landroidx/appcompat/widget/SwitchCompat;->handleMediaPlayPauseIfPendingOnHandler:Z

    .line 783
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setSwitchMinWidth(I)V
    .registers 2

    .line 478
    iput p1, p0, Landroidx/appcompat/widget/SwitchCompat;->onCommand:I

    .line 479
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public setSwitchPadding(I)V
    .registers 2

    .line 453
    iput p1, p0, Landroidx/appcompat/widget/SwitchCompat;->onMediaButtonEvent:I

    .line 454
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public setSwitchTextAppearance(Landroid/content/Context;I)V
    .registers 6

    .line 341
    sget-object v0, Lo/_init_lambda5$AudioAttributesImplApi26Parcelizer;->TextAppearance:[I

    invoke-static {p1, p2, v0}, Lo/setTitle;->AudioAttributesCompatParcelizer(Landroid/content/Context;I[I)Lo/setTitle;

    move-result-object p1

    .line 347
    sget p2, Lo/_init_lambda5$AudioAttributesImplApi26Parcelizer;->TextAppearance_android_textColor:I

    invoke-virtual {p1, p2}, Lo/setTitle;->write(I)Landroid/content/res/ColorStateList;

    move-result-object p2

    if-eqz p2, :cond_11

    .line 349
    iput-object p2, p0, Landroidx/appcompat/widget/SwitchCompat;->onPrepareFromSearch:Landroid/content/res/ColorStateList;

    goto :goto_17

    .line 352
    :cond_11
    invoke-virtual {p0}, Landroid/widget/TextView;->getTextColors()Landroid/content/res/ColorStateList;

    move-result-object p2

    iput-object p2, p0, Landroidx/appcompat/widget/SwitchCompat;->onPrepareFromSearch:Landroid/content/res/ColorStateList;

    .line 355
    :goto_17
    sget p2, Lo/_init_lambda5$AudioAttributesImplApi26Parcelizer;->TextAppearance_android_textSize:I

    const/4 v0, 0x0

    invoke-virtual {p1, p2, v0}, Lo/setTitle;->AudioAttributesCompatParcelizer(II)I

    move-result p2

    if-eqz p2, :cond_33

    int-to-float p2, p2

    .line 357
    iget-object v1, p0, Landroidx/appcompat/widget/SwitchCompat;->onPrepareFromUri:Landroid/text/TextPaint;

    invoke-virtual {v1}, Landroid/graphics/Paint;->getTextSize()F

    move-result v1

    cmpl-float v1, p2, v1

    if-eqz v1, :cond_33

    .line 358
    iget-object v1, p0, Landroidx/appcompat/widget/SwitchCompat;->onPrepareFromUri:Landroid/text/TextPaint;

    invoke-virtual {v1, p2}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 359
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 364
    :cond_33
    sget p2, Lo/_init_lambda5$AudioAttributesImplApi26Parcelizer;->TextAppearance_android_typeface:I

    const/4 v1, -0x1

    invoke-virtual {p1, p2, v1}, Lo/setTitle;->read(II)I

    move-result p2

    .line 365
    sget v2, Lo/_init_lambda5$AudioAttributesImplApi26Parcelizer;->TextAppearance_android_textStyle:I

    invoke-virtual {p1, v2, v1}, Lo/setTitle;->read(II)I

    move-result v1

    .line 367
    invoke-direct {p0, p2, v1}, Landroidx/appcompat/widget/SwitchCompat;->write(II)V

    .line 369
    sget p2, Lo/_init_lambda5$AudioAttributesImplApi26Parcelizer;->TextAppearance_textAllCaps:I

    invoke-virtual {p1, p2, v0}, Lo/setTitle;->AudioAttributesCompatParcelizer(IZ)Z

    move-result p2

    if-eqz p2, :cond_57

    .line 371
    new-instance p2, Lo/getLifecycle;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p2, v0}, Lo/getLifecycle;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Landroidx/appcompat/widget/SwitchCompat;->onPlay:Landroid/text/method/TransformationMethod;

    goto :goto_5a

    :cond_57
    const/4 p2, 0x0

    .line 373
    iput-object p2, p0, Landroidx/appcompat/widget/SwitchCompat;->onPlay:Landroid/text/method/TransformationMethod;

    .line 376
    :goto_5a
    iget-object p2, p0, Landroidx/appcompat/widget/SwitchCompat;->onSeekTo:Ljava/lang/CharSequence;

    invoke-direct {p0, p2}, Landroidx/appcompat/widget/SwitchCompat;->IconCompatParcelizer(Ljava/lang/CharSequence;)V

    .line 377
    iget-object p2, p0, Landroidx/appcompat/widget/SwitchCompat;->onPrepareFromMediaId:Ljava/lang/CharSequence;

    invoke-direct {p0, p2}, Landroidx/appcompat/widget/SwitchCompat;->RemoteActionCompatParcelizer(Ljava/lang/CharSequence;)V

    .line 379
    invoke-virtual {p1}, Lo/setTitle;->write()V

    return-void
.end method

.method public setSwitchTypeface(Landroid/graphics/Typeface;)V
    .registers 3

    .line 436
    iget-object v0, p0, Landroidx/appcompat/widget/SwitchCompat;->onPrepareFromUri:Landroid/text/TextPaint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->getTypeface()Landroid/graphics/Typeface;

    move-result-object v0

    if-eqz v0, :cond_14

    iget-object v0, p0, Landroidx/appcompat/widget/SwitchCompat;->onPrepareFromUri:Landroid/text/TextPaint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->getTypeface()Landroid/graphics/Typeface;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/graphics/Typeface;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1e

    :cond_14
    iget-object v0, p0, Landroidx/appcompat/widget/SwitchCompat;->onPrepareFromUri:Landroid/text/TextPaint;

    .line 437
    invoke-virtual {v0}, Landroid/graphics/Paint;->getTypeface()Landroid/graphics/Typeface;

    move-result-object v0

    if-nez v0, :cond_29

    if-eqz p1, :cond_29

    .line 438
    :cond_1e
    iget-object v0, p0, Landroidx/appcompat/widget/SwitchCompat;->onPrepareFromUri:Landroid/text/TextPaint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 440
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 441
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    :cond_29
    return-void
.end method

.method public setSwitchTypeface(Landroid/graphics/Typeface;I)V
    .registers 6

    const/4 v0, 0x0

    const/4 v1, 0x0

    if-lez p2, :cond_32

    if-nez p1, :cond_b

    .line 410
    invoke-static {p2}, Landroid/graphics/Typeface;->defaultFromStyle(I)Landroid/graphics/Typeface;

    move-result-object p1

    goto :goto_f

    .line 412
    :cond_b
    invoke-static {p1, p2}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    move-result-object p1

    .line 415
    :goto_f
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/SwitchCompat;->setSwitchTypeface(Landroid/graphics/Typeface;)V

    if-eqz p1, :cond_19

    .line 417
    invoke-virtual {p1}, Landroid/graphics/Typeface;->getStyle()I

    move-result p1

    goto :goto_1a

    :cond_19
    move p1, v1

    :goto_1a
    not-int p1, p1

    and-int/2addr p1, p2

    .line 419
    iget-object p2, p0, Landroidx/appcompat/widget/SwitchCompat;->onPrepareFromUri:Landroid/text/TextPaint;

    and-int/lit8 v2, p1, 0x1

    if-eqz v2, :cond_23

    const/4 v1, 0x1

    :cond_23
    invoke-virtual {p2, v1}, Landroid/graphics/Paint;->setFakeBoldText(Z)V

    .line 420
    iget-object p0, p0, Landroidx/appcompat/widget/SwitchCompat;->onPrepareFromUri:Landroid/text/TextPaint;

    and-int/lit8 p1, p1, 0x2

    if-eqz p1, :cond_2e

    const/high16 v0, -0x41800000    # -0.25f

    :cond_2e
    invoke-virtual {p0, v0}, Landroid/graphics/Paint;->setTextSkewX(F)V

    return-void

    .line 422
    :cond_32
    iget-object p2, p0, Landroidx/appcompat/widget/SwitchCompat;->onPrepareFromUri:Landroid/text/TextPaint;

    invoke-virtual {p2, v1}, Landroid/graphics/Paint;->setFakeBoldText(Z)V

    .line 423
    iget-object p2, p0, Landroidx/appcompat/widget/SwitchCompat;->onPrepareFromUri:Landroid/text/TextPaint;

    invoke-virtual {p2, v0}, Landroid/graphics/Paint;->setTextSkewX(F)V

    .line 424
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/SwitchCompat;->setSwitchTypeface(Landroid/graphics/Typeface;)V

    return-void
.end method

.method public setTextOff(Ljava/lang/CharSequence;)V
    .registers 2

    .line 864
    invoke-direct {p0, p1}, Landroidx/appcompat/widget/SwitchCompat;->RemoteActionCompatParcelizer(Ljava/lang/CharSequence;)V

    .line 865
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 866
    invoke-virtual {p0}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result p1

    if-nez p1, :cond_f

    .line 869
    invoke-direct {p0}, Landroidx/appcompat/widget/SwitchCompat;->handleMediaPlayPauseIfPendingOnHandler()V

    :cond_f
    return-void
.end method

.method public setTextOn(Ljava/lang/CharSequence;)V
    .registers 2

    .line 826
    invoke-direct {p0, p1}, Landroidx/appcompat/widget/SwitchCompat;->IconCompatParcelizer(Ljava/lang/CharSequence;)V

    .line 827
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 828
    invoke-virtual {p0}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result p1

    if-eqz p1, :cond_f

    .line 831
    invoke-direct {p0}, Landroidx/appcompat/widget/SwitchCompat;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()V

    :cond_f
    return-void
.end method

.method public setThumbDrawable(Landroid/graphics/drawable/Drawable;)V
    .registers 4

    .line 652
    iget-object v0, p0, Landroidx/appcompat/widget/SwitchCompat;->onRemoveQueueItemAt:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_8

    const/4 v1, 0x0

    .line 653
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    .line 655
    :cond_8
    iput-object p1, p0, Landroidx/appcompat/widget/SwitchCompat;->onRemoveQueueItemAt:Landroid/graphics/drawable/Drawable;

    if-eqz p1, :cond_f

    .line 657
    invoke-virtual {p1, p0}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    .line 659
    :cond_f
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public setThumbResource(I)V
    .registers 3

    .line 671
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Lo/getDefaultViewModelCreationExtras;->write(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/SwitchCompat;->setThumbDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setThumbTextPadding(I)V
    .registers 2

    .line 503
    iput p1, p0, Landroidx/appcompat/widget/SwitchCompat;->onRewind:I

    .line 504
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public setThumbTintList(Landroid/content/res/ColorStateList;)V
    .registers 2

    .line 702
    iput-object p1, p0, Landroidx/appcompat/widget/SwitchCompat;->onSetCaptioningEnabled:Landroid/content/res/ColorStateList;

    const/4 p1, 0x1

    .line 703
    iput-boolean p1, p0, Landroidx/appcompat/widget/SwitchCompat;->AudioAttributesImplBaseParcelizer:Z

    .line 705
    invoke-direct {p0}, Landroidx/appcompat/widget/SwitchCompat;->AudioAttributesImplBaseParcelizer()V

    return-void
.end method

.method public setThumbTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .registers 2

    .line 733
    iput-object p1, p0, Landroidx/appcompat/widget/SwitchCompat;->onSetPlaybackSpeed:Landroid/graphics/PorterDuff$Mode;

    const/4 p1, 0x1

    .line 734
    iput-boolean p1, p0, Landroidx/appcompat/widget/SwitchCompat;->AudioAttributesImplApi26Parcelizer:Z

    .line 736
    invoke-direct {p0}, Landroidx/appcompat/widget/SwitchCompat;->AudioAttributesImplBaseParcelizer()V

    return-void
.end method

.method public setTrackDrawable(Landroid/graphics/drawable/Drawable;)V
    .registers 4

    .line 527
    iget-object v0, p0, Landroidx/appcompat/widget/SwitchCompat;->setSessionImpl:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_8

    const/4 v1, 0x0

    .line 528
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    .line 530
    :cond_8
    iput-object p1, p0, Landroidx/appcompat/widget/SwitchCompat;->setSessionImpl:Landroid/graphics/drawable/Drawable;

    if-eqz p1, :cond_f

    .line 532
    invoke-virtual {p1, p0}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    .line 534
    :cond_f
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public setTrackResource(I)V
    .registers 3

    .line 545
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Lo/getDefaultViewModelCreationExtras;->write(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/SwitchCompat;->setTrackDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setTrackTintList(Landroid/content/res/ColorStateList;)V
    .registers 2

    .line 574
    iput-object p1, p0, Landroidx/appcompat/widget/SwitchCompat;->onSkipToNext:Landroid/content/res/ColorStateList;

    const/4 p1, 0x1

    .line 575
    iput-boolean p1, p0, Landroidx/appcompat/widget/SwitchCompat;->AudioAttributesImplApi21Parcelizer:Z

    .line 577
    invoke-direct {p0}, Landroidx/appcompat/widget/SwitchCompat;->MediaBrowserCompatItemReceiver()V

    return-void
.end method

.method public setTrackTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .registers 2

    .line 604
    iput-object p1, p0, Landroidx/appcompat/widget/SwitchCompat;->onSkipToPrevious:Landroid/graphics/PorterDuff$Mode;

    const/4 p1, 0x1

    .line 605
    iput-boolean p1, p0, Landroidx/appcompat/widget/SwitchCompat;->RatingCompat:Z

    .line 607
    invoke-direct {p0}, Landroidx/appcompat/widget/SwitchCompat;->MediaBrowserCompatItemReceiver()V

    return-void
.end method

.method public toggle()V
    .registers 2

    .line 1178
    invoke-virtual {p0}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, Landroid/widget/CompoundButton;->setChecked(Z)V

    return-void
.end method

.method protected verifyDrawable(Landroid/graphics/drawable/Drawable;)Z
    .registers 3

    .line 1497
    invoke-super {p0, p1}, Landroid/widget/CompoundButton;->verifyDrawable(Landroid/graphics/drawable/Drawable;)Z

    move-result v0

    if-nez v0, :cond_10

    iget-object v0, p0, Landroidx/appcompat/widget/SwitchCompat;->onRemoveQueueItemAt:Landroid/graphics/drawable/Drawable;

    if-eq p1, v0, :cond_10

    iget-object p0, p0, Landroidx/appcompat/widget/SwitchCompat;->setSessionImpl:Landroid/graphics/drawable/Drawable;

    if-eq p1, p0, :cond_10

    const/4 p0, 0x0

    return p0

    :cond_10
    const/4 p0, 0x1

    return p0
.end method

.method public write()Landroid/content/res/ColorStateList;
    .registers 1

    .line 717
    iget-object p0, p0, Landroidx/appcompat/widget/SwitchCompat;->onSetCaptioningEnabled:Landroid/content/res/ColorStateList;

    return-object p0
.end method

###### Class androidx.appcompat.widget.SwitchCompat.AnonymousClass5 (androidx.appcompat.widget.SwitchCompat$5)
.class Landroidx/appcompat/widget/SwitchCompat$5;
.super Landroid/util/Property;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/widget/SwitchCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/util/Property<",
        "Landroidx/appcompat/widget/SwitchCompat;",
        "Ljava/lang/Float;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>(Ljava/lang/Class;Ljava/lang/String;)V
    .registers 3

    .line 121
    invoke-direct {p0, p1, p2}, Landroid/util/Property;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public AudioAttributesCompatParcelizer(Landroidx/appcompat/widget/SwitchCompat;)Ljava/lang/Float;
    .registers 2

    .line 124
    iget p0, p1, Landroidx/appcompat/widget/SwitchCompat;->read:F

    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p0

    return-object p0
.end method

.method public synthetic get(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 2

    .line 121
    check-cast p1, Landroidx/appcompat/widget/SwitchCompat;

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/SwitchCompat$5;->AudioAttributesCompatParcelizer(Landroidx/appcompat/widget/SwitchCompat;)Ljava/lang/Float;

    move-result-object p0

    return-object p0
.end method

.method public read(Landroidx/appcompat/widget/SwitchCompat;Ljava/lang/Float;)V
    .registers 3

    .line 129
    invoke-virtual {p2}, Ljava/lang/Number;->floatValue()F

    move-result p0

    invoke-virtual {p1, p0}, Landroidx/appcompat/widget/SwitchCompat;->RemoteActionCompatParcelizer(F)V

    return-void
.end method

.method public synthetic set(Ljava/lang/Object;Ljava/lang/Object;)V
    .registers 3

    .line 121
    check-cast p1, Landroidx/appcompat/widget/SwitchCompat;

    check-cast p2, Ljava/lang/Float;

    invoke-virtual {p0, p1, p2}, Landroidx/appcompat/widget/SwitchCompat$5;->read(Landroidx/appcompat/widget/SwitchCompat;Ljava/lang/Float;)V

    return-void
.end method

###### Class androidx.appcompat.widget.SwitchCompat.AudioAttributesCompatParcelizer (androidx.appcompat.widget.SwitchCompat$AudioAttributesCompatParcelizer)
.class Landroidx/appcompat/widget/SwitchCompat$AudioAttributesCompatParcelizer;
.super Lo/_booleanType$IconCompatParcelizer;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/widget/SwitchCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "AudioAttributesCompatParcelizer"
.end annotation


# instance fields
.field private final IconCompatParcelizer:Ljava/lang/ref/Reference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/Reference<",
            "Landroidx/appcompat/widget/SwitchCompat;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Landroidx/appcompat/widget/SwitchCompat;)V
    .registers 3

    .line 1674
    invoke-direct {p0}, Lo/_booleanType$IconCompatParcelizer;-><init>()V

    .line 1675
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Landroidx/appcompat/widget/SwitchCompat$AudioAttributesCompatParcelizer;->IconCompatParcelizer:Ljava/lang/ref/Reference;

    return-void
.end method


# virtual methods
.method public RemoteActionCompatParcelizer(Ljava/lang/Throwable;)V
    .registers 2

    .line 1689
    iget-object p0, p0, Landroidx/appcompat/widget/SwitchCompat$AudioAttributesCompatParcelizer;->IconCompatParcelizer:Ljava/lang/ref/Reference;

    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroidx/appcompat/widget/SwitchCompat;

    if-eqz p0, :cond_d

    .line 1691
    invoke-virtual {p0}, Landroidx/appcompat/widget/SwitchCompat;->AudioAttributesImplApi26Parcelizer()V

    :cond_d
    return-void
.end method

.method public read()V
    .registers 1

    .line 1681
    iget-object p0, p0, Landroidx/appcompat/widget/SwitchCompat$AudioAttributesCompatParcelizer;->IconCompatParcelizer:Ljava/lang/ref/Reference;

    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroidx/appcompat/widget/SwitchCompat;

    if-eqz p0, :cond_d

    .line 1683
    invoke-virtual {p0}, Landroidx/appcompat/widget/SwitchCompat;->AudioAttributesImplApi26Parcelizer()V

    :cond_d
    return-void
.end method

###### Class androidx.appcompat.widget.SwitchCompat.RemoteActionCompatParcelizer (androidx.appcompat.widget.SwitchCompat$RemoteActionCompatParcelizer)
.class Landroidx/appcompat/widget/SwitchCompat$RemoteActionCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/widget/SwitchCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "RemoteActionCompatParcelizer"
.end annotation


# direct methods
.method static read(Landroid/animation/ObjectAnimator;Z)V
    .registers 2

    .line 1704
    invoke-virtual {p0, p1}, Landroid/animation/ObjectAnimator;->setAutoCancel(Z)V

    return-void
.end method
