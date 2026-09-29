###### Class androidx.constraintlayout.utils.widget.MotionLabel (androidx.constraintlayout.utils.widget.MotionLabel)
.class public Landroidx/constraintlayout/utils/widget/MotionLabel;
.super Landroid/view/View;
.source "SourceFile"

# interfaces
.implements Lo/NumberDeserializersPrimitiveOrWrapperDeserializer;


# instance fields
.field private AudioAttributesCompatParcelizer:F

.field private AudioAttributesImplApi21Parcelizer:Ljava/lang/String;

.field private AudioAttributesImplApi26Parcelizer:I

.field private AudioAttributesImplBaseParcelizer:F

.field private IconCompatParcelizer:Z

.field private MediaBrowserCompatCustomActionResultReceiver:F

.field private MediaBrowserCompatItemReceiver:F

.field private MediaBrowserCompatMediaItem:Landroid/graphics/Matrix;

.field private MediaBrowserCompatSearchResultReceiver:Landroid/text/Layout;

.field private MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Landroid/graphics/Path;

.field private MediaDescriptionCompat:I

.field private MediaMetadataCompat:Z

.field private MediaSessionCompatQueueItem:F

.field private ParcelableVolumeInfo:Landroid/graphics/Paint;

.field private RatingCompat:I

.field private RemoteActionCompatParcelizer:I

.field private handleMediaPlayPauseIfPendingOnHandler:I

.field private onAddQueueItem:I

.field private onCommand:Landroid/graphics/RectF;

.field private onCustomAction:Landroid/text/TextPaint;

.field private onFastForward:Landroid/graphics/Paint;

.field private onMediaButtonEvent:F

.field private onPause:F

.field private onPlay:F

.field private onPlayFromMediaId:I

.field private onPlayFromSearch:Landroid/graphics/Rect;

.field private onPlayFromUri:Landroid/graphics/Bitmap;

.field private onPrepare:Ljava/lang/String;

.field private onPrepareFromMediaId:Landroid/graphics/Rect;

.field private onPrepareFromSearch:Landroid/graphics/drawable/Drawable;

.field private onPrepareFromUri:I

.field private onRemoveQueueItem:I

.field private onRemoveQueueItemAt:F

.field private onRewind:F

.field private onSeekTo:F

.field private onSetCaptioningEnabled:I

.field private onSetPlaybackSpeed:F

.field private onSetRating:F

.field private onSetRepeatMode:Landroid/graphics/BitmapShader;

.field private onSetShuffleMode:Landroid/graphics/Matrix;

.field private onSkipToNext:I

.field private onSkipToPrevious:F

.field private onSkipToQueueItem:Landroid/view/ViewOutlineProvider;

.field private onStop:F

.field private read:F

.field private setSessionImpl:Z

.field private write:F


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 7

    .line 116
    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 68
    new-instance v0, Landroid/text/TextPaint;

    invoke-direct {v0}, Landroid/text/TextPaint;-><init>()V

    iput-object v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onCustomAction:Landroid/text/TextPaint;

    .line 69
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Landroid/graphics/Path;

    const v0, 0xffff

    .line 70
    iput v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onRemoveQueueItem:I

    .line 71
    iput v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onPrepareFromUri:I

    const/4 v0, 0x0

    .line 72
    iput-boolean v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->setSessionImpl:Z

    const/4 v1, 0x0

    .line 73
    iput v1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onMediaButtonEvent:F

    const/high16 v2, 0x7fc00000    # Float.NaN

    .line 74
    iput v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onPause:F

    const/high16 v3, 0x42400000    # 48.0f

    .line 78
    iput v3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onSetRating:F

    .line 80
    iput v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->write:F

    .line 83
    iput v1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onRemoveQueueItemAt:F

    .line 84
    const-string v3, "Hello World"

    iput-object v3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onPrepare:Ljava/lang/String;

    const/4 v3, 0x1

    .line 85
    iput-boolean v3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->MediaMetadataCompat:Z

    .line 86
    new-instance v4, Landroid/graphics/Rect;

    invoke-direct {v4}, Landroid/graphics/Rect;-><init>()V

    iput-object v4, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onPlayFromSearch:Landroid/graphics/Rect;

    .line 88
    iput v3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->MediaDescriptionCompat:I

    .line 89
    iput v3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->handleMediaPlayPauseIfPendingOnHandler:I

    .line 90
    iput v3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onAddQueueItem:I

    .line 91
    iput v3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->RatingCompat:I

    const v3, 0x800033

    .line 98
    iput v3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->AudioAttributesImplApi26Parcelizer:I

    .line 99
    iput v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->RemoteActionCompatParcelizer:I

    .line 100
    iput-boolean v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->IconCompatParcelizer:Z

    .line 108
    iput v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onSetPlaybackSpeed:F

    .line 109
    iput v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onSkipToPrevious:F

    .line 110
    iput v1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onRewind:F

    .line 111
    iput v1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onSeekTo:F

    .line 112
    new-instance v1, Landroid/graphics/Paint;

    invoke-direct {v1}, Landroid/graphics/Paint;-><init>()V

    iput-object v1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->ParcelableVolumeInfo:Landroid/graphics/Paint;

    .line 113
    iput v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onSetCaptioningEnabled:I

    .line 827
    iput v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->AudioAttributesCompatParcelizer:F

    .line 828
    iput v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->read:F

    .line 829
    iput v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onStop:F

    .line 830
    iput v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onPlay:F

    const/4 v0, 0x0

    .line 117
    invoke-direct {p0, p1, v0}, Landroidx/constraintlayout/utils/widget/MotionLabel;->AudioAttributesCompatParcelizer(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 8

    .line 121
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 68
    new-instance v0, Landroid/text/TextPaint;

    invoke-direct {v0}, Landroid/text/TextPaint;-><init>()V

    iput-object v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onCustomAction:Landroid/text/TextPaint;

    .line 69
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Landroid/graphics/Path;

    const v0, 0xffff

    .line 70
    iput v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onRemoveQueueItem:I

    .line 71
    iput v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onPrepareFromUri:I

    const/4 v0, 0x0

    .line 72
    iput-boolean v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->setSessionImpl:Z

    const/4 v1, 0x0

    .line 73
    iput v1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onMediaButtonEvent:F

    const/high16 v2, 0x7fc00000    # Float.NaN

    .line 74
    iput v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onPause:F

    const/high16 v3, 0x42400000    # 48.0f

    .line 78
    iput v3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onSetRating:F

    .line 80
    iput v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->write:F

    .line 83
    iput v1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onRemoveQueueItemAt:F

    .line 84
    const-string v3, "Hello World"

    iput-object v3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onPrepare:Ljava/lang/String;

    const/4 v3, 0x1

    .line 85
    iput-boolean v3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->MediaMetadataCompat:Z

    .line 86
    new-instance v4, Landroid/graphics/Rect;

    invoke-direct {v4}, Landroid/graphics/Rect;-><init>()V

    iput-object v4, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onPlayFromSearch:Landroid/graphics/Rect;

    .line 88
    iput v3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->MediaDescriptionCompat:I

    .line 89
    iput v3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->handleMediaPlayPauseIfPendingOnHandler:I

    .line 90
    iput v3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onAddQueueItem:I

    .line 91
    iput v3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->RatingCompat:I

    const v3, 0x800033

    .line 98
    iput v3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->AudioAttributesImplApi26Parcelizer:I

    .line 99
    iput v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->RemoteActionCompatParcelizer:I

    .line 100
    iput-boolean v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->IconCompatParcelizer:Z

    .line 108
    iput v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onSetPlaybackSpeed:F

    .line 109
    iput v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onSkipToPrevious:F

    .line 110
    iput v1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onRewind:F

    .line 111
    iput v1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onSeekTo:F

    .line 112
    new-instance v1, Landroid/graphics/Paint;

    invoke-direct {v1}, Landroid/graphics/Paint;-><init>()V

    iput-object v1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->ParcelableVolumeInfo:Landroid/graphics/Paint;

    .line 113
    iput v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onSetCaptioningEnabled:I

    .line 827
    iput v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->AudioAttributesCompatParcelizer:F

    .line 828
    iput v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->read:F

    .line 829
    iput v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onStop:F

    .line 830
    iput v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onPlay:F

    .line 122
    invoke-direct {p0, p1, p2}, Landroidx/constraintlayout/utils/widget/MotionLabel;->AudioAttributesCompatParcelizer(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 8

    .line 126
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 68
    new-instance p3, Landroid/text/TextPaint;

    invoke-direct {p3}, Landroid/text/TextPaint;-><init>()V

    iput-object p3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onCustomAction:Landroid/text/TextPaint;

    .line 69
    new-instance p3, Landroid/graphics/Path;

    invoke-direct {p3}, Landroid/graphics/Path;-><init>()V

    iput-object p3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Landroid/graphics/Path;

    const p3, 0xffff

    .line 70
    iput p3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onRemoveQueueItem:I

    .line 71
    iput p3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onPrepareFromUri:I

    const/4 p3, 0x0

    .line 72
    iput-boolean p3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->setSessionImpl:Z

    const/4 v0, 0x0

    .line 73
    iput v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onMediaButtonEvent:F

    const/high16 v1, 0x7fc00000    # Float.NaN

    .line 74
    iput v1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onPause:F

    const/high16 v2, 0x42400000    # 48.0f

    .line 78
    iput v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onSetRating:F

    .line 80
    iput v1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->write:F

    .line 83
    iput v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onRemoveQueueItemAt:F

    .line 84
    const-string v2, "Hello World"

    iput-object v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onPrepare:Ljava/lang/String;

    const/4 v2, 0x1

    .line 85
    iput-boolean v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->MediaMetadataCompat:Z

    .line 86
    new-instance v3, Landroid/graphics/Rect;

    invoke-direct {v3}, Landroid/graphics/Rect;-><init>()V

    iput-object v3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onPlayFromSearch:Landroid/graphics/Rect;

    .line 88
    iput v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->MediaDescriptionCompat:I

    .line 89
    iput v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->handleMediaPlayPauseIfPendingOnHandler:I

    .line 90
    iput v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onAddQueueItem:I

    .line 91
    iput v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->RatingCompat:I

    const v2, 0x800033

    .line 98
    iput v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->AudioAttributesImplApi26Parcelizer:I

    .line 99
    iput p3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->RemoteActionCompatParcelizer:I

    .line 100
    iput-boolean p3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->IconCompatParcelizer:Z

    .line 108
    iput v1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onSetPlaybackSpeed:F

    .line 109
    iput v1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onSkipToPrevious:F

    .line 110
    iput v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onRewind:F

    .line 111
    iput v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onSeekTo:F

    .line 112
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->ParcelableVolumeInfo:Landroid/graphics/Paint;

    .line 113
    iput p3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onSetCaptioningEnabled:I

    .line 827
    iput v1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->AudioAttributesCompatParcelizer:F

    .line 828
    iput v1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->read:F

    .line 829
    iput v1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onStop:F

    .line 830
    iput v1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onPlay:F

    .line 127
    invoke-direct {p0, p1, p2}, Landroidx/constraintlayout/utils/widget/MotionLabel;->AudioAttributesCompatParcelizer(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method private AudioAttributesCompatParcelizer()V
    .registers 6

    .line 227
    iget-object v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onPrepareFromSearch:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_8a

    .line 228
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onSetShuffleMode:Landroid/graphics/Matrix;

    .line 229
    iget-object v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onPrepareFromSearch:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v0

    .line 230
    iget-object v1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onPrepareFromSearch:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v1

    const/16 v2, 0x80

    if-gtz v0, :cond_2e

    .line 232
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v0

    if-nez v0, :cond_2e

    .line 234
    iget v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onSkipToPrevious:F

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-eqz v0, :cond_2b

    move v0, v2

    goto :goto_2e

    :cond_2b
    iget v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onSkipToPrevious:F

    float-to-int v0, v0

    :cond_2e
    :goto_2e
    if-gtz v1, :cond_43

    .line 239
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v1

    if-nez v1, :cond_43

    .line 241
    iget v1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onSetPlaybackSpeed:F

    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    move-result v1

    if-eqz v1, :cond_40

    move v1, v2

    goto :goto_43

    :cond_40
    iget v1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onSetPlaybackSpeed:F

    float-to-int v1, v1

    .line 246
    :cond_43
    :goto_43
    iget v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onSetCaptioningEnabled:I

    if-eqz v2, :cond_4b

    .line 247
    div-int/lit8 v0, v0, 0x2

    .line 248
    div-int/lit8 v1, v1, 0x2

    .line 250
    :cond_4b
    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v0, v1, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onPlayFromUri:Landroid/graphics/Bitmap;

    .line 251
    new-instance v0, Landroid/graphics/Canvas;

    iget-object v1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onPlayFromUri:Landroid/graphics/Bitmap;

    invoke-direct {v0, v1}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 253
    iget-object v1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onPrepareFromSearch:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0}, Landroid/graphics/Canvas;->getWidth()I

    move-result v2

    invoke-virtual {v0}, Landroid/graphics/Canvas;->getHeight()I

    move-result v3

    const/4 v4, 0x0

    invoke-virtual {v1, v4, v4, v2, v3}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 254
    iget-object v1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onPrepareFromSearch:Landroid/graphics/drawable/Drawable;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Landroid/graphics/drawable/Drawable;->setFilterBitmap(Z)V

    .line 255
    iget-object v1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onPrepareFromSearch:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1, v0}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 256
    iget v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onSetCaptioningEnabled:I

    if-eqz v0, :cond_7f

    .line 257
    iget-object v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onPlayFromUri:Landroid/graphics/Bitmap;

    invoke-static {v0}, Landroidx/constraintlayout/utils/widget/MotionLabel;->read(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onPlayFromUri:Landroid/graphics/Bitmap;

    .line 259
    :cond_7f
    new-instance v0, Landroid/graphics/BitmapShader;

    iget-object v1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onPlayFromUri:Landroid/graphics/Bitmap;

    sget-object v2, Landroid/graphics/Shader$TileMode;->REPEAT:Landroid/graphics/Shader$TileMode;

    invoke-direct {v0, v1, v2, v2}, Landroid/graphics/BitmapShader;-><init>(Landroid/graphics/Bitmap;Landroid/graphics/Shader$TileMode;Landroid/graphics/Shader$TileMode;)V

    iput-object v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onSetRepeatMode:Landroid/graphics/BitmapShader;

    :cond_8a
    return-void
.end method

.method private AudioAttributesCompatParcelizer(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 8

    .line 131
    invoke-direct {p0, p1}, Landroidx/constraintlayout/utils/widget/MotionLabel;->IconCompatParcelizer(Landroid/content/Context;)V

    if-eqz p2, :cond_165

    .line 134
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    sget-object v0, Lo/_isBlank$read;->MotionLabel:[I

    .line 135
    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 136
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->getIndexCount()I

    move-result p2

    const/4 v0, 0x0

    move v1, v0

    :goto_15
    if-ge v1, p2, :cond_162

    .line 140
    invoke-virtual {p1, v1}, Landroid/content/res/TypedArray;->getIndex(I)I

    move-result v2

    .line 141
    sget v3, Lo/_isBlank$read;->MotionLabel_android_text:I

    if-ne v2, v3, :cond_28

    .line 142
    invoke-virtual {p1, v2}, Landroid/content/res/TypedArray;->getText(I)Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {p0, v2}, Landroidx/constraintlayout/utils/widget/MotionLabel;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_15e

    .line 143
    :cond_28
    sget v3, Lo/_isBlank$read;->MotionLabel_android_fontFamily:I

    if-ne v2, v3, :cond_34

    .line 144
    invoke-virtual {p1, v2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->AudioAttributesImplApi21Parcelizer:Ljava/lang/String;

    goto/16 :goto_15e

    .line 145
    :cond_34
    sget v3, Lo/_isBlank$read;->MotionLabel_scaleFromTextSize:I

    if-ne v2, v3, :cond_44

    .line 146
    iget v3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->write:F

    float-to-int v3, v3

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v2

    int-to-float v2, v2

    iput v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->write:F

    goto/16 :goto_15e

    .line 147
    :cond_44
    sget v3, Lo/_isBlank$read;->MotionLabel_android_textSize:I

    if-ne v2, v3, :cond_54

    .line 148
    iget v3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onSetRating:F

    float-to-int v3, v3

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v2

    int-to-float v2, v2

    iput v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onSetRating:F

    goto/16 :goto_15e

    .line 149
    :cond_54
    sget v3, Lo/_isBlank$read;->MotionLabel_android_textStyle:I

    if-ne v2, v3, :cond_62

    .line 150
    iget v3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onPlayFromMediaId:I

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v2

    iput v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onPlayFromMediaId:I

    goto/16 :goto_15e

    .line 151
    :cond_62
    sget v3, Lo/_isBlank$read;->MotionLabel_android_typeface:I

    if-ne v2, v3, :cond_70

    .line 152
    iget v3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onSkipToNext:I

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v2

    iput v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onSkipToNext:I

    goto/16 :goto_15e

    .line 153
    :cond_70
    sget v3, Lo/_isBlank$read;->MotionLabel_android_textColor:I

    if-ne v2, v3, :cond_7e

    .line 154
    iget v3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onRemoveQueueItem:I

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v2

    iput v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onRemoveQueueItem:I

    goto/16 :goto_15e

    .line 155
    :cond_7e
    sget v3, Lo/_isBlank$read;->MotionLabel_borderRound:I

    if-ne v2, v3, :cond_8f

    .line 156
    iget v3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onPause:F

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v2

    iput v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onPause:F

    .line 158
    invoke-virtual {p0, v2}, Landroidx/constraintlayout/utils/widget/MotionLabel;->setRound(F)V

    goto/16 :goto_15e

    .line 160
    :cond_8f
    sget v3, Lo/_isBlank$read;->MotionLabel_borderRoundPercent:I

    if-ne v2, v3, :cond_a0

    .line 161
    iget v3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onMediaButtonEvent:F

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v2

    iput v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onMediaButtonEvent:F

    .line 163
    invoke-virtual {p0, v2}, Landroidx/constraintlayout/utils/widget/MotionLabel;->setRoundPercent(F)V

    goto/16 :goto_15e

    .line 165
    :cond_a0
    sget v3, Lo/_isBlank$read;->MotionLabel_android_gravity:I

    if-ne v2, v3, :cond_ae

    const/4 v3, -0x1

    .line 166
    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v2

    invoke-virtual {p0, v2}, Landroidx/constraintlayout/utils/widget/MotionLabel;->setGravity(I)V

    goto/16 :goto_15e

    .line 167
    :cond_ae
    sget v3, Lo/_isBlank$read;->MotionLabel_android_autoSizeTextType:I

    if-ne v2, v3, :cond_ba

    .line 168
    invoke-virtual {p1, v2, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v2

    iput v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->RemoteActionCompatParcelizer:I

    goto/16 :goto_15e

    .line 169
    :cond_ba
    sget v3, Lo/_isBlank$read;->MotionLabel_textOutlineColor:I

    const/4 v4, 0x1

    if-ne v2, v3, :cond_cb

    .line 170
    iget v3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onPrepareFromUri:I

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v2

    iput v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onPrepareFromUri:I

    .line 171
    iput-boolean v4, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->setSessionImpl:Z

    goto/16 :goto_15e

    .line 172
    :cond_cb
    sget v3, Lo/_isBlank$read;->MotionLabel_textOutlineThickness:I

    if-ne v2, v3, :cond_db

    .line 173
    iget v3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onRemoveQueueItemAt:F

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v2

    iput v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onRemoveQueueItemAt:F

    .line 174
    iput-boolean v4, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->setSessionImpl:Z

    goto/16 :goto_15e

    .line 175
    :cond_db
    sget v3, Lo/_isBlank$read;->MotionLabel_textBackground:I

    if-ne v2, v3, :cond_e9

    .line 176
    invoke-virtual {p1, v2}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    iput-object v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onPrepareFromSearch:Landroid/graphics/drawable/Drawable;

    .line 177
    iput-boolean v4, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->setSessionImpl:Z

    goto/16 :goto_15e

    .line 178
    :cond_e9
    sget v3, Lo/_isBlank$read;->MotionLabel_textBackgroundPanX:I

    if-ne v2, v3, :cond_f7

    .line 179
    iget v3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->AudioAttributesCompatParcelizer:F

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v2

    iput v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->AudioAttributesCompatParcelizer:F

    goto/16 :goto_15e

    .line 180
    :cond_f7
    sget v3, Lo/_isBlank$read;->MotionLabel_textBackgroundPanY:I

    if-ne v2, v3, :cond_104

    .line 181
    iget v3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->read:F

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v2

    iput v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->read:F

    goto :goto_15e

    .line 182
    :cond_104
    sget v3, Lo/_isBlank$read;->MotionLabel_textPanX:I

    if-ne v2, v3, :cond_111

    .line 183
    iget v3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onRewind:F

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v2

    iput v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onRewind:F

    goto :goto_15e

    .line 184
    :cond_111
    sget v3, Lo/_isBlank$read;->MotionLabel_textPanY:I

    if-ne v2, v3, :cond_11e

    .line 185
    iget v3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onSeekTo:F

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v2

    iput v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onSeekTo:F

    goto :goto_15e

    .line 186
    :cond_11e
    sget v3, Lo/_isBlank$read;->MotionLabel_textBackgroundRotate:I

    if-ne v2, v3, :cond_12b

    .line 187
    iget v3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onPlay:F

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v2

    iput v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onPlay:F

    goto :goto_15e

    .line 188
    :cond_12b
    sget v3, Lo/_isBlank$read;->MotionLabel_textBackgroundZoom:I

    if-ne v2, v3, :cond_138

    .line 189
    iget v3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onStop:F

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v2

    iput v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onStop:F

    goto :goto_15e

    .line 190
    :cond_138
    sget v3, Lo/_isBlank$read;->MotionLabel_textureHeight:I

    if-ne v2, v3, :cond_145

    .line 191
    iget v3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onSetPlaybackSpeed:F

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v2

    iput v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onSetPlaybackSpeed:F

    goto :goto_15e

    .line 192
    :cond_145
    sget v3, Lo/_isBlank$read;->MotionLabel_textureWidth:I

    if-ne v2, v3, :cond_152

    .line 193
    iget v3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onSkipToPrevious:F

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v2

    iput v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onSkipToPrevious:F

    goto :goto_15e

    .line 194
    :cond_152
    sget v3, Lo/_isBlank$read;->MotionLabel_textureEffect:I

    if-ne v2, v3, :cond_15e

    .line 195
    iget v3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onSetCaptioningEnabled:I

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v2

    iput v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onSetCaptioningEnabled:I

    :cond_15e
    :goto_15e
    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_15

    .line 198
    :cond_162
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 201
    :cond_165
    invoke-direct {p0}, Landroidx/constraintlayout/utils/widget/MotionLabel;->AudioAttributesCompatParcelizer()V

    .line 202
    invoke-direct {p0}, Landroidx/constraintlayout/utils/widget/MotionLabel;->write()V

    return-void
.end method

.method private IconCompatParcelizer()F
    .registers 9

    .line 335
    iget v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->write:F

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    const/high16 v1, 0x3f800000    # 1.0f

    if-eqz v0, :cond_c

    move v0, v1

    goto :goto_11

    :cond_c
    iget v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onSetRating:F

    iget v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->write:F

    div-float/2addr v0, v2

    .line 337
    :goto_11
    iget-object v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onCustomAction:Landroid/text/TextPaint;

    invoke-virtual {v2}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    move-result-object v2

    .line 339
    iget v3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->AudioAttributesImplBaseParcelizer:F

    invoke-static {v3}, Ljava/lang/Float;->isNaN(F)Z

    move-result v3

    if-eqz v3, :cond_25

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v3

    int-to-float v3, v3

    goto :goto_27

    :cond_25
    iget v3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->AudioAttributesImplBaseParcelizer:F

    .line 340
    :goto_27
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v4

    int-to-float v4, v4

    .line 341
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v5

    int-to-float v5, v5

    .line 343
    iget v6, v2, Landroid/graphics/Paint$FontMetrics;->descent:F

    iget v7, v2, Landroid/graphics/Paint$FontMetrics;->ascent:F

    sub-float/2addr v3, v4

    sub-float/2addr v3, v5

    sub-float/2addr v6, v7

    mul-float/2addr v6, v0

    sub-float/2addr v3, v6

    .line 344
    iget p0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onSeekTo:F

    sub-float/2addr v1, p0

    mul-float/2addr v3, v1

    const/high16 p0, 0x40000000    # 2.0f

    div-float/2addr v3, p0

    iget p0, v2, Landroid/graphics/Paint$FontMetrics;->ascent:F

    mul-float/2addr v0, p0

    sub-float/2addr v3, v0

    return v3
.end method

.method static synthetic IconCompatParcelizer(Landroidx/constraintlayout/utils/widget/MotionLabel;)F
    .registers 1

    .line 66
    iget p0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onPause:F

    return p0
.end method

.method private IconCompatParcelizer(FFFF)V
    .registers 6

    .line 264
    iget-object v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onSetShuffleMode:Landroid/graphics/Matrix;

    if-nez v0, :cond_5

    return-void

    :cond_5
    sub-float/2addr p3, p1

    .line 268
    iput p3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->MediaBrowserCompatItemReceiver:F

    sub-float/2addr p4, p2

    .line 269
    iput p4, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->AudioAttributesImplBaseParcelizer:F

    .line 270
    invoke-direct {p0}, Landroidx/constraintlayout/utils/widget/MotionLabel;->RemoteActionCompatParcelizer()V

    return-void
.end method

.method private IconCompatParcelizer(Landroid/content/Context;)V
    .registers 5

    .line 348
    new-instance v0, Landroid/util/TypedValue;

    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    .line 349
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object p1

    .line 350
    sget v1, Lo/_init_lambda5$read;->colorPrimary:I

    const/4 v2, 0x1

    invoke-virtual {p1, v1, v0, v2}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 351
    iget-object p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onCustomAction:Landroid/text/TextPaint;

    iget v0, v0, Landroid/util/TypedValue;->data:I

    iput v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onRemoveQueueItem:I

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setColor(I)V

    return-void
.end method

.method private RemoteActionCompatParcelizer()V
    .registers 12

    .line 929
    iget v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->AudioAttributesCompatParcelizer:F

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_b

    move v0, v1

    goto :goto_d

    :cond_b
    iget v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->AudioAttributesCompatParcelizer:F

    .line 930
    :goto_d
    iget v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->read:F

    invoke-static {v2}, Ljava/lang/Float;->isNaN(F)Z

    move-result v2

    if-eqz v2, :cond_17

    move v2, v1

    goto :goto_19

    :cond_17
    iget v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->read:F

    .line 931
    :goto_19
    iget v3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onStop:F

    invoke-static {v3}, Ljava/lang/Float;->isNaN(F)Z

    move-result v3

    if-eqz v3, :cond_24

    const/high16 v3, 0x3f800000    # 1.0f

    goto :goto_26

    :cond_24
    iget v3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onStop:F

    .line 932
    :goto_26
    iget v4, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onPlay:F

    invoke-static {v4}, Ljava/lang/Float;->isNaN(F)Z

    move-result v4

    if-nez v4, :cond_30

    iget v1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onPlay:F

    .line 934
    :cond_30
    iget-object v4, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onSetShuffleMode:Landroid/graphics/Matrix;

    invoke-virtual {v4}, Landroid/graphics/Matrix;->reset()V

    .line 935
    iget-object v4, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onPlayFromUri:Landroid/graphics/Bitmap;

    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v4

    int-to-float v4, v4

    .line 936
    iget-object v5, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onPlayFromUri:Landroid/graphics/Bitmap;

    invoke-virtual {v5}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v5

    int-to-float v5, v5

    .line 937
    iget v6, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onSkipToPrevious:F

    invoke-static {v6}, Ljava/lang/Float;->isNaN(F)Z

    move-result v6

    if-eqz v6, :cond_4e

    iget v6, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->MediaBrowserCompatItemReceiver:F

    goto :goto_50

    :cond_4e
    iget v6, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onSkipToPrevious:F

    .line 938
    :goto_50
    iget v7, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onSetPlaybackSpeed:F

    invoke-static {v7}, Ljava/lang/Float;->isNaN(F)Z

    move-result v7

    if-eqz v7, :cond_5b

    iget v7, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->AudioAttributesImplBaseParcelizer:F

    goto :goto_5d

    :cond_5b
    iget v7, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onSetPlaybackSpeed:F

    :goto_5d
    mul-float v8, v4, v7

    mul-float v9, v5, v6

    cmpg-float v8, v8, v9

    if-gez v8, :cond_68

    div-float v8, v6, v4

    goto :goto_6a

    :cond_68
    div-float v8, v7, v5

    :goto_6a
    mul-float/2addr v3, v8

    .line 941
    iget-object v8, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onSetShuffleMode:Landroid/graphics/Matrix;

    invoke-virtual {v8, v3, v3}, Landroid/graphics/Matrix;->postScale(FF)Z

    mul-float/2addr v4, v3

    sub-float v8, v6, v4

    mul-float/2addr v3, v5

    sub-float v5, v7, v3

    .line 944
    iget v9, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onSetPlaybackSpeed:F

    invoke-static {v9}, Ljava/lang/Float;->isNaN(F)Z

    move-result v9

    const/high16 v10, 0x40000000    # 2.0f

    if-nez v9, :cond_83

    .line 945
    iget v5, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onSetPlaybackSpeed:F

    div-float/2addr v5, v10

    .line 947
    :cond_83
    iget v9, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onSkipToPrevious:F

    invoke-static {v9}, Ljava/lang/Float;->isNaN(F)Z

    move-result v9

    if-nez v9, :cond_8e

    .line 948
    iget v8, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onSkipToPrevious:F

    div-float/2addr v8, v10

    .line 953
    :cond_8e
    iget-object v9, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onSetShuffleMode:Landroid/graphics/Matrix;

    mul-float/2addr v0, v8

    add-float/2addr v0, v6

    sub-float/2addr v0, v4

    const/high16 v4, 0x3f000000    # 0.5f

    mul-float/2addr v0, v4

    mul-float/2addr v2, v5

    add-float/2addr v2, v7

    sub-float/2addr v2, v3

    mul-float/2addr v2, v4

    invoke-virtual {v9, v0, v2}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 954
    iget-object v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onSetShuffleMode:Landroid/graphics/Matrix;

    div-float/2addr v6, v10

    div-float/2addr v7, v10

    invoke-virtual {v0, v1, v6, v7}, Landroid/graphics/Matrix;->postRotate(FFF)Z

    .line 955
    iget-object v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onSetRepeatMode:Landroid/graphics/BitmapShader;

    iget-object p0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onSetShuffleMode:Landroid/graphics/Matrix;

    invoke-virtual {v0, p0}, Landroid/graphics/Shader;->setLocalMatrix(Landroid/graphics/Matrix;)V

    return-void
.end method

.method private RemoteActionCompatParcelizer(F)V
    .registers 12

    .line 375
    iget-boolean v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->setSessionImpl:Z

    const/high16 v1, 0x3f800000    # 1.0f

    if-nez v0, :cond_b

    cmpl-float v0, p1, v1

    if-nez v0, :cond_b

    return-void

    .line 378
    :cond_b
    iget-object v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Landroid/graphics/Path;

    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 379
    iget-object v3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onPrepare:Ljava/lang/String;

    .line 380
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v5

    .line 381
    iget-object v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onCustomAction:Landroid/text/TextPaint;

    iget-object v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onPlayFromSearch:Landroid/graphics/Rect;

    const/4 v9, 0x0

    invoke-virtual {v0, v3, v9, v5, v2}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 382
    iget-object v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onCustomAction:Landroid/text/TextPaint;

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    iget-object v8, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Landroid/graphics/Path;

    invoke-virtual/range {v2 .. v8}, Landroid/graphics/Paint;->getTextPath(Ljava/lang/String;IIFFLandroid/graphics/Path;)V

    cmpl-float v0, p1, v1

    if-eqz v0, :cond_3c

    .line 384
    invoke-static {}, Lo/NumberDeserializersShortDeserializer;->read()Ljava/lang/String;

    .line 385
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 386
    invoke-virtual {v0, p1, p1}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 387
    iget-object p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Landroid/graphics/Path;

    invoke-virtual {p1, v0}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V

    .line 389
    :cond_3c
    iget-object p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onPlayFromSearch:Landroid/graphics/Rect;

    iget v0, p1, Landroid/graphics/Rect;->right:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p1, Landroid/graphics/Rect;->right:I

    .line 390
    iget-object p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onPlayFromSearch:Landroid/graphics/Rect;

    iget v0, p1, Landroid/graphics/Rect;->left:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p1, Landroid/graphics/Rect;->left:I

    .line 391
    iget-object p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onPlayFromSearch:Landroid/graphics/Rect;

    iget v0, p1, Landroid/graphics/Rect;->bottom:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p1, Landroid/graphics/Rect;->bottom:I

    .line 392
    iget-object p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onPlayFromSearch:Landroid/graphics/Rect;

    iget v0, p1, Landroid/graphics/Rect;->top:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p1, Landroid/graphics/Rect;->top:I

    .line 394
    new-instance p1, Landroid/graphics/RectF;

    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    .line 395
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v0

    int-to-float v0, v0

    iput v0, p1, Landroid/graphics/RectF;->bottom:F

    .line 396
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v0

    int-to-float v0, v0

    iput v0, p1, Landroid/graphics/RectF;->right:F

    .line 397
    iput-boolean v9, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->MediaMetadataCompat:Z

    return-void
.end method

.method private RemoteActionCompatParcelizer(Ljava/lang/String;II)V
    .registers 8

    if-eqz p1, :cond_c

    .line 580
    invoke-static {p1, p3}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object p1

    if-eqz p1, :cond_d

    .line 582
    invoke-virtual {p0, p1}, Landroidx/constraintlayout/utils/widget/MotionLabel;->setTypeface(Landroid/graphics/Typeface;)V

    return-void

    :cond_c
    const/4 p1, 0x0

    :cond_d
    const/4 v0, 0x2

    const/4 v1, 0x1

    if-eq p2, v1, :cond_1c

    if-eq p2, v0, :cond_19

    const/4 v2, 0x3

    if-ne p2, v2, :cond_1e

    .line 594
    sget-object p1, Landroid/graphics/Typeface;->MONOSPACE:Landroid/graphics/Typeface;

    goto :goto_1e

    .line 591
    :cond_19
    sget-object p1, Landroid/graphics/Typeface;->SERIF:Landroid/graphics/Typeface;

    goto :goto_1e

    .line 588
    :cond_1c
    sget-object p1, Landroid/graphics/Typeface;->SANS_SERIF:Landroid/graphics/Typeface;

    :cond_1e
    :goto_1e
    const/4 p2, 0x0

    const/4 v2, 0x0

    if-lez p3, :cond_4f

    if-nez p1, :cond_29

    .line 600
    invoke-static {p3}, Landroid/graphics/Typeface;->defaultFromStyle(I)Landroid/graphics/Typeface;

    move-result-object p1

    goto :goto_2d

    .line 602
    :cond_29
    invoke-static {p1, p3}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    move-result-object p1

    .line 604
    :goto_2d
    invoke-virtual {p0, p1}, Landroidx/constraintlayout/utils/widget/MotionLabel;->setTypeface(Landroid/graphics/Typeface;)V

    if-eqz p1, :cond_37

    .line 606
    invoke-virtual {p1}, Landroid/graphics/Typeface;->getStyle()I

    move-result p1

    goto :goto_38

    :cond_37
    move p1, v2

    :goto_38
    not-int p1, p1

    and-int/2addr p1, p3

    .line 608
    iget-object p3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onCustomAction:Landroid/text/TextPaint;

    and-int/lit8 v3, p1, 0x1

    if-nez v3, :cond_41

    move v1, v2

    :cond_41
    invoke-virtual {p3, v1}, Landroid/graphics/Paint;->setFakeBoldText(Z)V

    .line 609
    iget-object p0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onCustomAction:Landroid/text/TextPaint;

    and-int/2addr p1, v0

    if-eqz p1, :cond_4b

    const/high16 p2, -0x41800000    # -0.25f

    :cond_4b
    invoke-virtual {p0, p2}, Landroid/graphics/Paint;->setTextSkewX(F)V

    return-void

    .line 611
    :cond_4f
    iget-object p3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onCustomAction:Landroid/text/TextPaint;

    invoke-virtual {p3, v2}, Landroid/graphics/Paint;->setFakeBoldText(Z)V

    .line 612
    iget-object p3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onCustomAction:Landroid/text/TextPaint;

    invoke-virtual {p3, p2}, Landroid/graphics/Paint;->setTextSkewX(F)V

    .line 613
    invoke-virtual {p0, p1}, Landroidx/constraintlayout/utils/widget/MotionLabel;->setTypeface(Landroid/graphics/Typeface;)V

    return-void
.end method

.method private read()F
    .registers 7

    .line 325
    iget v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->write:F

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    const/high16 v1, 0x3f800000    # 1.0f

    if-eqz v0, :cond_c

    move v0, v1

    goto :goto_11

    :cond_c
    iget v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onSetRating:F

    iget v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->write:F

    div-float/2addr v0, v2

    .line 327
    :goto_11
    iget-object v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onCustomAction:Landroid/text/TextPaint;

    iget-object v3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onPrepare:Ljava/lang/String;

    const/4 v4, 0x0

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v5

    invoke-virtual {v2, v3, v4, v5}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;II)F

    move-result v2

    .line 328
    iget v3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->MediaBrowserCompatItemReceiver:F

    invoke-static {v3}, Ljava/lang/Float;->isNaN(F)Z

    move-result v3

    if-eqz v3, :cond_2c

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v3

    int-to-float v3, v3

    goto :goto_2e

    :cond_2c
    iget v3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->MediaBrowserCompatItemReceiver:F

    .line 329
    :goto_2e
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v4

    int-to-float v4, v4

    .line 330
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v5

    int-to-float v5, v5

    sub-float/2addr v3, v4

    sub-float/2addr v3, v5

    mul-float/2addr v0, v2

    sub-float/2addr v3, v0

    .line 331
    iget p0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onRewind:F

    add-float/2addr p0, v1

    mul-float/2addr v3, p0

    const/high16 p0, 0x40000000    # 2.0f

    div-float/2addr v3, p0

    return v3
.end method

.method static synthetic read(Landroidx/constraintlayout/utils/widget/MotionLabel;)F
    .registers 1

    .line 66
    iget p0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onMediaButtonEvent:F

    return p0
.end method

.method private static read(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .registers 6

    .line 207
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    .line 208
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    .line 210
    div-int/lit8 v0, v0, 0x2

    .line 211
    div-int/lit8 v1, v1, 0x2

    const/4 v2, 0x1

    .line 213
    invoke-static {p0, v0, v1, v2}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    move-result-object p0

    const/4 v3, 0x0

    :goto_12
    const/4 v4, 0x4

    if-ge v3, v4, :cond_26

    const/16 v4, 0x20

    if-lt v0, v4, :cond_26

    if-lt v1, v4, :cond_26

    .line 219
    div-int/lit8 v0, v0, 0x2

    .line 220
    div-int/lit8 v1, v1, 0x2

    .line 221
    invoke-static {p0, v0, v1, v2}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    move-result-object p0

    add-int/lit8 v3, v3, 0x1

    goto :goto_12

    :cond_26
    return-object p0
.end method

.method private write()V
    .registers 4

    .line 360
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v0

    iput v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->MediaDescriptionCompat:I

    .line 361
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v0

    iput v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->handleMediaPlayPauseIfPendingOnHandler:I

    .line 362
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v0

    iput v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onAddQueueItem:I

    .line 363
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v0

    iput v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->RatingCompat:I

    .line 364
    iget-object v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->AudioAttributesImplApi21Parcelizer:Ljava/lang/String;

    iget v1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onSkipToNext:I

    iget v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onPlayFromMediaId:I

    invoke-direct {p0, v0, v1, v2}, Landroidx/constraintlayout/utils/widget/MotionLabel;->RemoteActionCompatParcelizer(Ljava/lang/String;II)V

    .line 365
    iget-object v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onCustomAction:Landroid/text/TextPaint;

    iget v1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onRemoveQueueItem:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 366
    iget-object v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onCustomAction:Landroid/text/TextPaint;

    iget v1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onRemoveQueueItemAt:F

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 367
    iget-object v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onCustomAction:Landroid/text/TextPaint;

    sget-object v1, Landroid/graphics/Paint$Style;->FILL_AND_STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 368
    iget-object v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onCustomAction:Landroid/text/TextPaint;

    const/16 v1, 0x80

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setFlags(I)V

    .line 369
    iget v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onSetRating:F

    invoke-virtual {p0, v0}, Landroidx/constraintlayout/utils/widget/MotionLabel;->setTextSize(F)V

    .line 370
    iget-object p0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onCustomAction:Landroid/text/TextPaint;

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    return-void
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer(FFFF)V
    .registers 13

    const/high16 v0, 0x3f000000    # 0.5f

    add-float v1, p1, v0

    float-to-int v1, v1

    int-to-float v2, v1

    sub-float v2, p1, v2

    .line 444
    iput v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->MediaBrowserCompatCustomActionResultReceiver:F

    add-float v2, p3, v0

    float-to-int v2, v2

    sub-int v3, v2, v1

    add-float v4, p4, v0

    float-to-int v4, v4

    add-float/2addr v0, p2

    float-to-int v0, v0

    sub-int v5, v4, v0

    sub-float v6, p3, p1

    .line 447
    iput v6, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->MediaBrowserCompatItemReceiver:F

    sub-float v7, p4, p2

    .line 448
    iput v7, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->AudioAttributesImplBaseParcelizer:F

    .line 449
    invoke-direct {p0, p1, p2, p3, p4}, Landroidx/constraintlayout/utils/widget/MotionLabel;->IconCompatParcelizer(FFFF)V

    .line 450
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result p1

    if-ne p1, v5, :cond_31

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result p1

    if-ne p1, v3, :cond_31

    .line 456
    invoke-super {p0, v1, v0, v2, v4}, Landroid/view/View;->layout(IIII)V

    goto :goto_41

    :cond_31
    const/high16 p1, 0x40000000    # 2.0f

    .line 451
    invoke-static {v3, p1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p2

    .line 452
    invoke-static {v5, p1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p1

    .line 453
    invoke-virtual {p0, p2, p1}, Landroid/view/View;->measure(II)V

    .line 454
    invoke-super {p0, v1, v0, v2, v4}, Landroid/view/View;->layout(IIII)V

    .line 458
    :goto_41
    iget-boolean p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->IconCompatParcelizer:Z

    if-eqz p1, :cond_d4

    .line 459
    iget-object p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onPrepareFromMediaId:Landroid/graphics/Rect;

    if-nez p1, :cond_66

    .line 460
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    iput-object p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onFastForward:Landroid/graphics/Paint;

    .line 461
    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    iput-object p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onPrepareFromMediaId:Landroid/graphics/Rect;

    .line 462
    iget-object p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onFastForward:Landroid/graphics/Paint;

    iget-object p2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onCustomAction:Landroid/text/TextPaint;

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->set(Landroid/graphics/Paint;)V

    .line 463
    iget-object p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onFastForward:Landroid/graphics/Paint;

    invoke-virtual {p1}, Landroid/graphics/Paint;->getTextSize()F

    move-result p1

    iput p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->MediaSessionCompatQueueItem:F

    .line 465
    :cond_66
    iput v6, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->MediaBrowserCompatItemReceiver:F

    .line 466
    iput v7, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->AudioAttributesImplBaseParcelizer:F

    .line 468
    iget-object p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onFastForward:Landroid/graphics/Paint;

    iget-object p2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onPrepare:Ljava/lang/String;

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p3

    iget-object p4, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onPrepareFromMediaId:Landroid/graphics/Rect;

    const/4 v0, 0x0

    invoke-virtual {p1, p2, v0, p3, p4}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 469
    iget-object p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onPrepareFromMediaId:Landroid/graphics/Rect;

    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    move-result p1

    .line 470
    iget-object p2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onPrepareFromMediaId:Landroid/graphics/Rect;

    invoke-virtual {p2}, Landroid/graphics/Rect;->height()I

    move-result p2

    int-to-float p2, p2

    const p3, 0x3fa66666    # 1.3f

    mul-float/2addr p2, p3

    .line 471
    iget p3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->handleMediaPlayPauseIfPendingOnHandler:I

    int-to-float p3, p3

    sub-float/2addr v6, p3

    iget p3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->MediaDescriptionCompat:I

    int-to-float p3, p3

    sub-float/2addr v6, p3

    .line 472
    iget p3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->RatingCompat:I

    int-to-float p3, p3

    sub-float/2addr v7, p3

    iget p3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onAddQueueItem:I

    int-to-float p3, p3

    sub-float/2addr v7, p3

    int-to-float p1, p1

    mul-float p3, p1, v7

    mul-float p4, p2, v6

    cmpl-float p3, p3, p4

    if-lez p3, :cond_ac

    .line 474
    iget-object p2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onCustomAction:Landroid/text/TextPaint;

    iget p3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->MediaSessionCompatQueueItem:F

    mul-float/2addr p3, v6

    div-float/2addr p3, p1

    invoke-virtual {p2, p3}, Landroid/graphics/Paint;->setTextSize(F)V

    goto :goto_b5

    .line 476
    :cond_ac
    iget-object p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onCustomAction:Landroid/text/TextPaint;

    iget p3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->MediaSessionCompatQueueItem:F

    mul-float/2addr p3, v7

    div-float/2addr p3, p2

    invoke-virtual {p1, p3}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 478
    :goto_b5
    iget-boolean p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->setSessionImpl:Z

    if-nez p1, :cond_c1

    iget p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->write:F

    invoke-static {p1}, Ljava/lang/Float;->isNaN(F)Z

    move-result p1

    if-nez p1, :cond_d4

    .line 479
    :cond_c1
    iget p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->write:F

    invoke-static {p1}, Ljava/lang/Float;->isNaN(F)Z

    move-result p1

    if-eqz p1, :cond_cc

    const/high16 p1, 0x3f800000    # 1.0f

    goto :goto_d1

    :cond_cc
    iget p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onSetRating:F

    iget p2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->write:F

    div-float/2addr p1, p2

    :goto_d1
    invoke-direct {p0, p1}, Landroidx/constraintlayout/utils/widget/MotionLabel;->RemoteActionCompatParcelizer(F)V

    :cond_d4
    return-void
.end method

.method public layout(IIII)V
    .registers 13

    .line 406
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->layout(IIII)V

    .line 407
    iget v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->write:F

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-eqz v0, :cond_e

    const/high16 v1, 0x3f800000    # 1.0f

    goto :goto_13

    .line 408
    :cond_e
    iget v1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onSetRating:F

    iget v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->write:F

    div-float/2addr v1, v2

    :goto_13
    sub-int v2, p3, p1

    int-to-float v2, v2

    .line 409
    iput v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->MediaBrowserCompatItemReceiver:F

    sub-int v2, p4, p2

    int-to-float v2, v2

    .line 410
    iput v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->AudioAttributesImplBaseParcelizer:F

    .line 411
    iget-boolean v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->IconCompatParcelizer:Z

    if-eqz v2, :cond_a5

    .line 413
    iget-object v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onPrepareFromMediaId:Landroid/graphics/Rect;

    if-nez v2, :cond_42

    .line 414
    new-instance v2, Landroid/graphics/Paint;

    invoke-direct {v2}, Landroid/graphics/Paint;-><init>()V

    iput-object v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onFastForward:Landroid/graphics/Paint;

    .line 415
    new-instance v2, Landroid/graphics/Rect;

    invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V

    iput-object v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onPrepareFromMediaId:Landroid/graphics/Rect;

    .line 416
    iget-object v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onFastForward:Landroid/graphics/Paint;

    iget-object v3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onCustomAction:Landroid/text/TextPaint;

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->set(Landroid/graphics/Paint;)V

    .line 417
    iget-object v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onFastForward:Landroid/graphics/Paint;

    invoke-virtual {v2}, Landroid/graphics/Paint;->getTextSize()F

    move-result v2

    iput v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->MediaSessionCompatQueueItem:F

    .line 420
    :cond_42
    iget-object v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onFastForward:Landroid/graphics/Paint;

    iget-object v3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onPrepare:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v4

    iget-object v5, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onPrepareFromMediaId:Landroid/graphics/Rect;

    const/4 v6, 0x0

    invoke-virtual {v2, v3, v6, v4, v5}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 421
    iget-object v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onPrepareFromMediaId:Landroid/graphics/Rect;

    invoke-virtual {v2}, Landroid/graphics/Rect;->width()I

    move-result v2

    .line 422
    iget-object v3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onPrepareFromMediaId:Landroid/graphics/Rect;

    invoke-virtual {v3}, Landroid/graphics/Rect;->height()I

    move-result v3

    int-to-float v3, v3

    const v4, 0x3fa66666    # 1.3f

    mul-float/2addr v3, v4

    float-to-int v3, v3

    .line 424
    iget v4, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->MediaBrowserCompatItemReceiver:F

    iget v5, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->handleMediaPlayPauseIfPendingOnHandler:I

    int-to-float v5, v5

    sub-float/2addr v4, v5

    iget v5, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->MediaDescriptionCompat:I

    int-to-float v5, v5

    sub-float/2addr v4, v5

    .line 425
    iget v5, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->AudioAttributesImplBaseParcelizer:F

    iget v6, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->RatingCompat:I

    int-to-float v6, v6

    sub-float/2addr v5, v6

    iget v6, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onAddQueueItem:I

    int-to-float v6, v6

    sub-float/2addr v5, v6

    if-eqz v0, :cond_96

    int-to-float v2, v2

    int-to-float v3, v3

    mul-float v6, v2, v5

    mul-float v7, v3, v4

    cmpl-float v6, v6, v7

    if-lez v6, :cond_8c

    .line 428
    iget-object v3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onCustomAction:Landroid/text/TextPaint;

    iget v5, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->MediaSessionCompatQueueItem:F

    mul-float/2addr v5, v4

    div-float/2addr v5, v2

    invoke-virtual {v3, v5}, Landroid/graphics/Paint;->setTextSize(F)V

    goto :goto_a5

    .line 430
    :cond_8c
    iget-object v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onCustomAction:Landroid/text/TextPaint;

    iget v4, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->MediaSessionCompatQueueItem:F

    mul-float/2addr v4, v5

    div-float/2addr v4, v3

    invoke-virtual {v2, v4}, Landroid/graphics/Paint;->setTextSize(F)V

    goto :goto_a5

    :cond_96
    int-to-float v1, v2

    int-to-float v2, v3

    mul-float v3, v1, v5

    mul-float v6, v2, v4

    cmpl-float v3, v3, v6

    if-lez v3, :cond_a3

    div-float v1, v4, v1

    goto :goto_a5

    :cond_a3
    div-float v1, v5, v2

    .line 436
    :cond_a5
    :goto_a5
    iget-boolean v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->setSessionImpl:Z

    if-nez v2, :cond_ac

    if-eqz v0, :cond_ac

    return-void

    :cond_ac
    int-to-float p1, p1

    int-to-float p2, p2

    int-to-float p3, p3

    int-to-float p4, p4

    .line 437
    invoke-direct {p0, p1, p2, p3, p4}, Landroidx/constraintlayout/utils/widget/MotionLabel;->IconCompatParcelizer(FFFF)V

    .line 438
    invoke-direct {p0, v1}, Landroidx/constraintlayout/utils/widget/MotionLabel;->RemoteActionCompatParcelizer(F)V

    return-void
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .registers 8

    .line 486
    iget v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->write:F

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    const/high16 v1, 0x3f800000    # 1.0f

    if-eqz v0, :cond_c

    move v0, v1

    goto :goto_11

    :cond_c
    iget v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onSetRating:F

    iget v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->write:F

    div-float/2addr v0, v2

    .line 487
    :goto_11
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 488
    iget-boolean v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->setSessionImpl:Z

    if-nez v2, :cond_37

    cmpl-float v1, v0, v1

    if-nez v1, :cond_37

    .line 489
    iget v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->MediaDescriptionCompat:I

    int-to-float v0, v0

    invoke-direct {p0}, Landroidx/constraintlayout/utils/widget/MotionLabel;->read()F

    move-result v1

    .line 490
    iget v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onAddQueueItem:I

    int-to-float v2, v2

    invoke-direct {p0}, Landroidx/constraintlayout/utils/widget/MotionLabel;->IconCompatParcelizer()F

    move-result v3

    .line 491
    iget-object v4, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onPrepare:Ljava/lang/String;

    iget v5, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->MediaBrowserCompatCustomActionResultReceiver:F

    add-float/2addr v0, v1

    add-float/2addr v5, v0

    add-float/2addr v2, v3

    iget-object p0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onCustomAction:Landroid/text/TextPaint;

    invoke-virtual {p1, v4, v5, v2, p0}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    return-void

    .line 494
    :cond_37
    iget-boolean v1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->MediaMetadataCompat:Z

    if-eqz v1, :cond_3e

    .line 495
    invoke-direct {p0, v0}, Landroidx/constraintlayout/utils/widget/MotionLabel;->RemoteActionCompatParcelizer(F)V

    .line 497
    :cond_3e
    iget-object v1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->MediaBrowserCompatMediaItem:Landroid/graphics/Matrix;

    if-nez v1, :cond_49

    .line 498
    new-instance v1, Landroid/graphics/Matrix;

    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    iput-object v1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->MediaBrowserCompatMediaItem:Landroid/graphics/Matrix;

    .line 500
    :cond_49
    iget-boolean v1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->setSessionImpl:Z

    if-eqz v1, :cond_e9

    .line 501
    iget-object v1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->ParcelableVolumeInfo:Landroid/graphics/Paint;

    iget-object v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onCustomAction:Landroid/text/TextPaint;

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->set(Landroid/graphics/Paint;)V

    .line 502
    iget-object v1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->MediaBrowserCompatMediaItem:Landroid/graphics/Matrix;

    invoke-virtual {v1}, Landroid/graphics/Matrix;->reset()V

    .line 503
    iget v1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->MediaDescriptionCompat:I

    int-to-float v1, v1

    invoke-direct {p0}, Landroidx/constraintlayout/utils/widget/MotionLabel;->read()F

    move-result v2

    add-float/2addr v1, v2

    .line 504
    iget v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onAddQueueItem:I

    int-to-float v2, v2

    invoke-direct {p0}, Landroidx/constraintlayout/utils/widget/MotionLabel;->IconCompatParcelizer()F

    move-result v3

    add-float/2addr v2, v3

    .line 505
    iget-object v3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->MediaBrowserCompatMediaItem:Landroid/graphics/Matrix;

    invoke-virtual {v3, v1, v2}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 506
    iget-object v3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->MediaBrowserCompatMediaItem:Landroid/graphics/Matrix;

    invoke-virtual {v3, v0, v0}, Landroid/graphics/Matrix;->preScale(FF)Z

    .line 507
    iget-object v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Landroid/graphics/Path;

    iget-object v3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->MediaBrowserCompatMediaItem:Landroid/graphics/Matrix;

    invoke-virtual {v0, v3}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V

    .line 509
    iget-object v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onSetRepeatMode:Landroid/graphics/BitmapShader;

    if-eqz v0, :cond_8c

    .line 510
    iget-object v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onCustomAction:Landroid/text/TextPaint;

    const/4 v3, 0x1

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setFilterBitmap(Z)V

    .line 511
    iget-object v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onCustomAction:Landroid/text/TextPaint;

    iget-object v3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onSetRepeatMode:Landroid/graphics/BitmapShader;

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    goto :goto_93

    .line 513
    :cond_8c
    iget-object v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onCustomAction:Landroid/text/TextPaint;

    iget v3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onRemoveQueueItem:I

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 515
    :goto_93
    iget-object v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onCustomAction:Landroid/text/TextPaint;

    sget-object v3, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 516
    iget-object v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onCustomAction:Landroid/text/TextPaint;

    iget v3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onRemoveQueueItemAt:F

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 517
    iget-object v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Landroid/graphics/Path;

    iget-object v3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onCustomAction:Landroid/text/TextPaint;

    invoke-virtual {p1, v0, v3}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 518
    iget-object v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onSetRepeatMode:Landroid/graphics/BitmapShader;

    if-eqz v0, :cond_b2

    .line 519
    iget-object v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onCustomAction:Landroid/text/TextPaint;

    const/4 v3, 0x0

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 521
    :cond_b2
    iget-object v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onCustomAction:Landroid/text/TextPaint;

    iget v3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onPrepareFromUri:I

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 522
    iget-object v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onCustomAction:Landroid/text/TextPaint;

    sget-object v3, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 523
    iget-object v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onCustomAction:Landroid/text/TextPaint;

    iget v3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onRemoveQueueItemAt:F

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 524
    iget-object v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Landroid/graphics/Path;

    iget-object v3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onCustomAction:Landroid/text/TextPaint;

    invoke-virtual {p1, v0, v3}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 526
    iget-object p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->MediaBrowserCompatMediaItem:Landroid/graphics/Matrix;

    invoke-virtual {p1}, Landroid/graphics/Matrix;->reset()V

    .line 527
    iget-object p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->MediaBrowserCompatMediaItem:Landroid/graphics/Matrix;

    neg-float v0, v1

    neg-float v1, v2

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 528
    iget-object p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Landroid/graphics/Path;

    iget-object v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->MediaBrowserCompatMediaItem:Landroid/graphics/Matrix;

    invoke-virtual {p1, v0}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V

    .line 529
    iget-object p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onCustomAction:Landroid/text/TextPaint;

    iget-object p0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->ParcelableVolumeInfo:Landroid/graphics/Paint;

    invoke-virtual {p1, p0}, Landroid/graphics/Paint;->set(Landroid/graphics/Paint;)V

    return-void

    .line 531
    :cond_e9
    iget v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->MediaDescriptionCompat:I

    int-to-float v0, v0

    invoke-direct {p0}, Landroidx/constraintlayout/utils/widget/MotionLabel;->read()F

    move-result v1

    add-float/2addr v0, v1

    .line 532
    iget v1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onAddQueueItem:I

    int-to-float v1, v1

    invoke-direct {p0}, Landroidx/constraintlayout/utils/widget/MotionLabel;->IconCompatParcelizer()F

    move-result v2

    add-float/2addr v1, v2

    .line 533
    iget-object v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->MediaBrowserCompatMediaItem:Landroid/graphics/Matrix;

    invoke-virtual {v2}, Landroid/graphics/Matrix;->reset()V

    .line 534
    iget-object v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->MediaBrowserCompatMediaItem:Landroid/graphics/Matrix;

    invoke-virtual {v2, v0, v1}, Landroid/graphics/Matrix;->preTranslate(FF)Z

    .line 535
    iget-object v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Landroid/graphics/Path;

    iget-object v3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->MediaBrowserCompatMediaItem:Landroid/graphics/Matrix;

    invoke-virtual {v2, v3}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V

    .line 536
    iget-object v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onCustomAction:Landroid/text/TextPaint;

    iget v3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onRemoveQueueItem:I

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 537
    iget-object v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onCustomAction:Landroid/text/TextPaint;

    sget-object v3, Landroid/graphics/Paint$Style;->FILL_AND_STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 538
    iget-object v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onCustomAction:Landroid/text/TextPaint;

    iget v3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onRemoveQueueItemAt:F

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 539
    iget-object v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Landroid/graphics/Path;

    iget-object v3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onCustomAction:Landroid/text/TextPaint;

    invoke-virtual {p1, v2, v3}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 540
    iget-object p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->MediaBrowserCompatMediaItem:Landroid/graphics/Matrix;

    invoke-virtual {p1}, Landroid/graphics/Matrix;->reset()V

    .line 541
    iget-object p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->MediaBrowserCompatMediaItem:Landroid/graphics/Matrix;

    neg-float v0, v0

    neg-float v1, v1

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Matrix;->preTranslate(FF)Z

    .line 542
    iget-object p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Landroid/graphics/Path;

    iget-object p0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->MediaBrowserCompatMediaItem:Landroid/graphics/Matrix;

    invoke-virtual {p1, p0}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V

    return-void
.end method

.method protected onMeasure(II)V
    .registers 11

    .line 639
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    .line 640
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v1

    .line 641
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    .line 642
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p2

    const/4 v2, 0x0

    .line 646
    iput-boolean v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->IconCompatParcelizer:Z

    .line 648
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v3

    iput v3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->MediaDescriptionCompat:I

    .line 649
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v3

    iput v3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->handleMediaPlayPauseIfPendingOnHandler:I

    .line 650
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v3

    iput v3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onAddQueueItem:I

    .line 651
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v3

    iput v3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->RatingCompat:I

    const/high16 v3, 0x40000000    # 2.0f

    if-ne v0, v3, :cond_39

    if-ne v1, v3, :cond_39

    .line 670
    iget v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->RemoteActionCompatParcelizer:I

    if-eqz v0, :cond_74

    const/4 v0, 0x1

    .line 671
    iput-boolean v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->IconCompatParcelizer:Z

    goto :goto_74

    .line 653
    :cond_39
    iget-object v4, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onCustomAction:Landroid/text/TextPaint;

    iget-object v5, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onPrepare:Ljava/lang/String;

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v6

    iget-object v7, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onPlayFromSearch:Landroid/graphics/Rect;

    invoke-virtual {v4, v5, v2, v6, v7}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    const v2, 0x3f7fff58    # 0.99999f

    if-eq v0, v3, :cond_54

    .line 656
    iget-object p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onPlayFromSearch:Landroid/graphics/Rect;

    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    move-result p1

    int-to-float p1, p1

    add-float/2addr p1, v2

    float-to-int p1, p1

    .line 658
    :cond_54
    iget v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->MediaDescriptionCompat:I

    iget v4, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->handleMediaPlayPauseIfPendingOnHandler:I

    add-int/2addr v0, v4

    add-int/2addr p1, v0

    if-eq v1, v3, :cond_74

    .line 661
    iget-object v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onCustomAction:Landroid/text/TextPaint;

    const/4 v3, 0x0

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->getFontMetricsInt(Landroid/graphics/Paint$FontMetricsInt;)I

    move-result v0

    int-to-float v0, v0

    add-float/2addr v0, v2

    float-to-int v0, v0

    const/high16 v2, -0x80000000

    if-ne v1, v2, :cond_6e

    .line 663
    invoke-static {p2, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    .line 667
    :cond_6e
    iget p2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onAddQueueItem:I

    iget v1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->RatingCompat:I

    add-int/2addr p2, v1

    add-int/2addr p2, v0

    .line 676
    :cond_74
    :goto_74
    invoke-virtual {p0, p1, p2}, Landroidx/constraintlayout/utils/widget/MotionLabel;->setMeasuredDimension(II)V

    return-void
.end method

.method public setGravity(I)V
    .registers 9

    const v0, 0x800007

    and-int v1, p1, v0

    const v2, 0x800003

    if-nez v1, :cond_b

    or-int/2addr p1, v2

    :cond_b
    and-int/lit8 v1, p1, 0x70

    if-nez v1, :cond_11

    or-int/lit8 p1, p1, 0x30

    .line 290
    :cond_11
    iget v1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->AudioAttributesImplApi26Parcelizer:I

    if-eq p1, v1, :cond_18

    .line 295
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 298
    :cond_18
    iput p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->AudioAttributesImplApi26Parcelizer:I

    and-int/lit8 v1, p1, 0x70

    const/4 v3, 0x0

    const/high16 v4, 0x3f800000    # 1.0f

    const/high16 v5, -0x40800000    # -1.0f

    const/16 v6, 0x30

    if-eq v1, v6, :cond_2f

    const/16 v6, 0x50

    if-eq v1, v6, :cond_2c

    .line 307
    iput v3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onSeekTo:F

    goto :goto_31

    .line 304
    :cond_2c
    iput v4, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onSeekTo:F

    goto :goto_31

    .line 301
    :cond_2f
    iput v5, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onSeekTo:F

    :goto_31
    and-int/2addr p1, v0

    const/4 v0, 0x3

    if-eq p1, v0, :cond_45

    const/4 v0, 0x5

    if-eq p1, v0, :cond_42

    if-eq p1, v2, :cond_45

    const v0, 0x800005

    if-eq p1, v0, :cond_42

    .line 320
    iput v3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onRewind:F

    return-void

    .line 317
    :cond_42
    iput v4, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onRewind:F

    return-void

    .line 313
    :cond_45
    iput v5, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onRewind:F

    return-void
.end method

.method public setRound(F)V
    .registers 6

    .line 738
    invoke-static {p1}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-eqz v0, :cond_12

    .line 739
    iput p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onPause:F

    .line 740
    iget p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onMediaButtonEvent:F

    const/high16 v0, -0x40800000    # -1.0f

    .line 741
    iput v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onMediaButtonEvent:F

    .line 742
    invoke-virtual {p0, p1}, Landroidx/constraintlayout/utils/widget/MotionLabel;->setRoundPercent(F)V

    return-void

    .line 745
    :cond_12
    iget v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onPause:F

    cmpl-float v0, v0, p1

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_1c

    move v0, v1

    goto :goto_1d

    :cond_1c
    move v0, v2

    .line 746
    :goto_1d
    iput p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onPause:F

    const/4 v3, 0x0

    cmpl-float p1, p1, v3

    if-eqz p1, :cond_6b

    .line 749
    iget-object p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Landroid/graphics/Path;

    if-nez p1, :cond_2f

    .line 750
    new-instance p1, Landroid/graphics/Path;

    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    iput-object p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Landroid/graphics/Path;

    .line 752
    :cond_2f
    iget-object p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onCommand:Landroid/graphics/RectF;

    if-nez p1, :cond_3a

    .line 753
    new-instance p1, Landroid/graphics/RectF;

    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    iput-object p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onCommand:Landroid/graphics/RectF;

    .line 756
    :cond_3a
    iget-object p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onSkipToQueueItem:Landroid/view/ViewOutlineProvider;

    if-nez p1, :cond_48

    .line 757
    new-instance p1, Landroidx/constraintlayout/utils/widget/MotionLabel$2;

    invoke-direct {p1, p0}, Landroidx/constraintlayout/utils/widget/MotionLabel$2;-><init>(Landroidx/constraintlayout/utils/widget/MotionLabel;)V

    iput-object p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onSkipToQueueItem:Landroid/view/ViewOutlineProvider;

    .line 765
    invoke-virtual {p0, p1}, Landroidx/constraintlayout/utils/widget/MotionLabel;->setOutlineProvider(Landroid/view/ViewOutlineProvider;)V

    .line 767
    :cond_48
    invoke-virtual {p0, v1}, Landroidx/constraintlayout/utils/widget/MotionLabel;->setClipToOutline(Z)V

    .line 770
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result p1

    .line 771
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v1

    .line 772
    iget-object v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onCommand:Landroid/graphics/RectF;

    int-to-float p1, p1

    int-to-float v1, v1

    invoke-virtual {v2, v3, v3, p1, v1}, Landroid/graphics/RectF;->set(FFFF)V

    .line 773
    iget-object p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Landroid/graphics/Path;

    invoke-virtual {p1}, Landroid/graphics/Path;->reset()V

    .line 774
    iget-object p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Landroid/graphics/Path;

    iget-object v1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onCommand:Landroid/graphics/RectF;

    iget v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onPause:F

    sget-object v3, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    invoke-virtual {p1, v1, v2, v2, v3}, Landroid/graphics/Path;->addRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Path$Direction;)V

    goto :goto_6e

    .line 777
    :cond_6b
    invoke-virtual {p0, v2}, Landroidx/constraintlayout/utils/widget/MotionLabel;->setClipToOutline(Z)V

    :goto_6e
    if-eqz v0, :cond_73

    .line 782
    invoke-virtual {p0}, Landroidx/constraintlayout/utils/widget/MotionLabel;->invalidateOutline()V

    :cond_73
    return-void
.end method

.method public setRoundPercent(F)V
    .registers 7

    .line 689
    iget v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onMediaButtonEvent:F

    cmpl-float v0, v0, p1

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_a

    move v0, v1

    goto :goto_b

    :cond_a
    move v0, v2

    .line 690
    :goto_b
    iput p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onMediaButtonEvent:F

    const/4 v3, 0x0

    cmpl-float p1, p1, v3

    if-eqz p1, :cond_62

    .line 692
    iget-object p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Landroid/graphics/Path;

    if-nez p1, :cond_1d

    .line 693
    new-instance p1, Landroid/graphics/Path;

    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    iput-object p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Landroid/graphics/Path;

    .line 695
    :cond_1d
    iget-object p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onCommand:Landroid/graphics/RectF;

    if-nez p1, :cond_28

    .line 696
    new-instance p1, Landroid/graphics/RectF;

    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    iput-object p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onCommand:Landroid/graphics/RectF;

    .line 699
    :cond_28
    iget-object p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onSkipToQueueItem:Landroid/view/ViewOutlineProvider;

    if-nez p1, :cond_36

    .line 700
    new-instance p1, Landroidx/constraintlayout/utils/widget/MotionLabel$4;

    invoke-direct {p1, p0}, Landroidx/constraintlayout/utils/widget/MotionLabel$4;-><init>(Landroidx/constraintlayout/utils/widget/MotionLabel;)V

    iput-object p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onSkipToQueueItem:Landroid/view/ViewOutlineProvider;

    .line 709
    invoke-virtual {p0, p1}, Landroidx/constraintlayout/utils/widget/MotionLabel;->setOutlineProvider(Landroid/view/ViewOutlineProvider;)V

    .line 711
    :cond_36
    invoke-virtual {p0, v1}, Landroidx/constraintlayout/utils/widget/MotionLabel;->setClipToOutline(Z)V

    .line 713
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result p1

    .line 714
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v1

    .line 715
    invoke-static {p1, v1}, Ljava/lang/Math;->min(II)I

    move-result v2

    int-to-float v2, v2

    iget v4, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onMediaButtonEvent:F

    mul-float/2addr v2, v4

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v2, v4

    .line 716
    iget-object v4, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onCommand:Landroid/graphics/RectF;

    int-to-float p1, p1

    int-to-float v1, v1

    invoke-virtual {v4, v3, v3, p1, v1}, Landroid/graphics/RectF;->set(FFFF)V

    .line 717
    iget-object p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Landroid/graphics/Path;

    invoke-virtual {p1}, Landroid/graphics/Path;->reset()V

    .line 718
    iget-object p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Landroid/graphics/Path;

    iget-object v1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onCommand:Landroid/graphics/RectF;

    sget-object v3, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    invoke-virtual {p1, v1, v2, v2, v3}, Landroid/graphics/Path;->addRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Path$Direction;)V

    goto :goto_65

    .line 721
    :cond_62
    invoke-virtual {p0, v2}, Landroidx/constraintlayout/utils/widget/MotionLabel;->setClipToOutline(Z)V

    :goto_65
    if-eqz v0, :cond_6a

    .line 726
    invoke-virtual {p0}, Landroidx/constraintlayout/utils/widget/MotionLabel;->invalidateOutline()V

    :cond_6a
    return-void
.end method

.method public setScaleFromTextSize(F)V
    .registers 2

    .line 1054
    iput p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->write:F

    return-void
.end method

.method public setText(Ljava/lang/CharSequence;)V
    .registers 2

    .line 355
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onPrepare:Ljava/lang/String;

    .line 356
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setTextBackgroundPanX(F)V
    .registers 2

    .line 886
    iput p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->AudioAttributesCompatParcelizer:F

    .line 887
    invoke-direct {p0}, Landroidx/constraintlayout/utils/widget/MotionLabel;->RemoteActionCompatParcelizer()V

    .line 888
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setTextBackgroundPanY(F)V
    .registers 2

    .line 901
    iput p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->read:F

    .line 902
    invoke-direct {p0}, Landroidx/constraintlayout/utils/widget/MotionLabel;->RemoteActionCompatParcelizer()V

    .line 903
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setTextBackgroundRotate(F)V
    .registers 2

    .line 923
    iput p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onPlay:F

    .line 924
    invoke-direct {p0}, Landroidx/constraintlayout/utils/widget/MotionLabel;->RemoteActionCompatParcelizer()V

    .line 925
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setTextBackgroundZoom(F)V
    .registers 2

    .line 912
    iput p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onStop:F

    .line 913
    invoke-direct {p0}, Landroidx/constraintlayout/utils/widget/MotionLabel;->RemoteActionCompatParcelizer()V

    .line 914
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setTextFillColor(I)V
    .registers 2

    .line 562
    iput p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onRemoveQueueItem:I

    .line 563
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setTextOutlineColor(I)V
    .registers 2

    .line 572
    iput p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onPrepareFromUri:I

    const/4 p1, 0x1

    .line 573
    iput-boolean p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->setSessionImpl:Z

    .line 574
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setTextOutlineThickness(F)V
    .registers 3

    .line 547
    iput p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onRemoveQueueItemAt:F

    const/4 v0, 0x1

    .line 548
    iput-boolean v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->setSessionImpl:Z

    .line 549
    invoke-static {p1}, Ljava/lang/Float;->isNaN(F)Z

    move-result p1

    if-eqz p1, :cond_12

    const/high16 p1, 0x3f800000    # 1.0f

    .line 550
    iput p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onRemoveQueueItemAt:F

    const/4 p1, 0x0

    .line 551
    iput-boolean p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->setSessionImpl:Z

    .line 553
    :cond_12
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setTextPanX(F)V
    .registers 2

    .line 973
    iput p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onRewind:F

    .line 974
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setTextPanY(F)V
    .registers 2

    .line 992
    iput p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onSeekTo:F

    .line 993
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setTextSize(F)V
    .registers 4

    .line 814
    iput p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onSetRating:F

    .line 815
    invoke-static {}, Lo/NumberDeserializersShortDeserializer;->read()Ljava/lang/String;

    iget v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->write:F

    .line 816
    iget-object v1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onCustomAction:Landroid/text/TextPaint;

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_11

    iget p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->write:F

    :cond_11
    invoke-virtual {v1, p1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 817
    iget p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->write:F

    invoke-static {p1}, Ljava/lang/Float;->isNaN(F)Z

    move-result p1

    if-eqz p1, :cond_1f

    const/high16 p1, 0x3f800000    # 1.0f

    goto :goto_24

    :cond_1f
    iget p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onSetRating:F

    iget v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->write:F

    div-float/2addr p1, v0

    :goto_24
    invoke-direct {p0, p1}, Landroidx/constraintlayout/utils/widget/MotionLabel;->RemoteActionCompatParcelizer(F)V

    .line 818
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 819
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setTextureHeight(F)V
    .registers 2

    .line 1011
    iput p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onSetPlaybackSpeed:F

    .line 1012
    invoke-direct {p0}, Landroidx/constraintlayout/utils/widget/MotionLabel;->RemoteActionCompatParcelizer()V

    .line 1013
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setTextureWidth(F)V
    .registers 2

    .line 1031
    iput p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onSkipToPrevious:F

    .line 1032
    invoke-direct {p0}, Landroidx/constraintlayout/utils/widget/MotionLabel;->RemoteActionCompatParcelizer()V

    .line 1033
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setTypeface(Landroid/graphics/Typeface;)V
    .registers 3

    .line 618
    iget-object v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onCustomAction:Landroid/text/TextPaint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->getTypeface()Landroid/graphics/Typeface;

    move-result-object v0

    if-eq v0, p1, :cond_d

    .line 619
    iget-object p0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->onCustomAction:Landroid/text/TextPaint;

    invoke-virtual {p0, p1}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    :cond_d
    return-void
.end method

###### Class androidx.constraintlayout.utils.widget.MotionLabel.AnonymousClass2 (androidx.constraintlayout.utils.widget.MotionLabel$2)
.class final Landroidx/constraintlayout/utils/widget/MotionLabel$2;
.super Landroid/view/ViewOutlineProvider;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/constraintlayout/utils/widget/MotionLabel;->setRound(F)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic AudioAttributesCompatParcelizer:Landroidx/constraintlayout/utils/widget/MotionLabel;


# direct methods
.method constructor <init>(Landroidx/constraintlayout/utils/widget/MotionLabel;)V
    .registers 2

    .line 757
    iput-object p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel$2;->AudioAttributesCompatParcelizer:Landroidx/constraintlayout/utils/widget/MotionLabel;

    invoke-direct {p0}, Landroid/view/ViewOutlineProvider;-><init>()V

    return-void
.end method


# virtual methods
.method public final getOutline(Landroid/view/View;Landroid/graphics/Outline;)V
    .registers 9

    .line 760
    iget-object p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel$2;->AudioAttributesCompatParcelizer:Landroidx/constraintlayout/utils/widget/MotionLabel;

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v3

    .line 761
    iget-object p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel$2;->AudioAttributesCompatParcelizer:Landroidx/constraintlayout/utils/widget/MotionLabel;

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v4

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 762
    iget-object p0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel$2;->AudioAttributesCompatParcelizer:Landroidx/constraintlayout/utils/widget/MotionLabel;

    invoke-static {p0}, Landroidx/constraintlayout/utils/widget/MotionLabel;->IconCompatParcelizer(Landroidx/constraintlayout/utils/widget/MotionLabel;)F

    move-result v5

    move-object v0, p2

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Outline;->setRoundRect(IIIIF)V

    return-void
.end method

###### Class androidx.constraintlayout.utils.widget.MotionLabel.AnonymousClass4 (androidx.constraintlayout.utils.widget.MotionLabel$4)
.class final Landroidx/constraintlayout/utils/widget/MotionLabel$4;
.super Landroid/view/ViewOutlineProvider;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/constraintlayout/utils/widget/MotionLabel;->setRoundPercent(F)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic IconCompatParcelizer:Landroidx/constraintlayout/utils/widget/MotionLabel;


# direct methods
.method constructor <init>(Landroidx/constraintlayout/utils/widget/MotionLabel;)V
    .registers 2

    .line 700
    iput-object p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel$4;->IconCompatParcelizer:Landroidx/constraintlayout/utils/widget/MotionLabel;

    invoke-direct {p0}, Landroid/view/ViewOutlineProvider;-><init>()V

    return-void
.end method


# virtual methods
.method public final getOutline(Landroid/view/View;Landroid/graphics/Outline;)V
    .registers 9

    .line 703
    iget-object p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel$4;->IconCompatParcelizer:Landroidx/constraintlayout/utils/widget/MotionLabel;

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v3

    .line 704
    iget-object p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel$4;->IconCompatParcelizer:Landroidx/constraintlayout/utils/widget/MotionLabel;

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v4

    .line 705
    invoke-static {v3, v4}, Ljava/lang/Math;->min(II)I

    move-result p1

    int-to-float p1, p1

    iget-object p0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel$4;->IconCompatParcelizer:Landroidx/constraintlayout/utils/widget/MotionLabel;

    invoke-static {p0}, Landroidx/constraintlayout/utils/widget/MotionLabel;->read(Landroidx/constraintlayout/utils/widget/MotionLabel;)F

    move-result p0

    mul-float/2addr p1, p0

    const/high16 p0, 0x40000000    # 2.0f

    div-float v5, p1, p0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v0, p2

    .line 706
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Outline;->setRoundRect(IIIIF)V

    return-void
.end method
