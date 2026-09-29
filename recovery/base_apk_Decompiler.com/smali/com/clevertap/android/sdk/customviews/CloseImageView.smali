###### Class com.clevertap.android.sdk.customviews.CloseImageView (com.clevertap.android.sdk.customviews.CloseImageView)
.class public final Lcom/clevertap/android/sdk/customviews/CloseImageView;
.super Landroidx/appcompat/widget/AppCompatImageView;
.source "SourceFile"


# instance fields
.field private final AudioAttributesCompatParcelizer:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 2

    .line 25
    invoke-direct {p0, p1}, Landroidx/appcompat/widget/AppCompatImageView;-><init>(Landroid/content/Context;)V

    .line 21
    invoke-direct {p0}, Lcom/clevertap/android/sdk/customviews/CloseImageView;->write()I

    move-result p1

    iput p1, p0, Lcom/clevertap/android/sdk/customviews/CloseImageView;->AudioAttributesCompatParcelizer:I

    const p1, 0x30a68

    .line 26
    invoke-virtual {p0, p1}, Landroid/view/View;->setId(I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 3

    .line 31
    invoke-direct {p0, p1, p2}, Landroidx/appcompat/widget/AppCompatImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 21
    invoke-direct {p0}, Lcom/clevertap/android/sdk/customviews/CloseImageView;->write()I

    move-result p1

    iput p1, p0, Lcom/clevertap/android/sdk/customviews/CloseImageView;->AudioAttributesCompatParcelizer:I

    const p1, 0x30a68

    .line 32
    invoke-virtual {p0, p1}, Landroid/view/View;->setId(I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 4

    .line 37
    invoke-direct {p0, p1, p2, p3}, Landroidx/appcompat/widget/AppCompatImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 21
    invoke-direct {p0}, Lcom/clevertap/android/sdk/customviews/CloseImageView;->write()I

    move-result p1

    iput p1, p0, Lcom/clevertap/android/sdk/customviews/CloseImageView;->AudioAttributesCompatParcelizer:I

    const p1, 0x30a68

    .line 38
    invoke-virtual {p0, p1}, Landroid/view/View;->setId(I)V

    return-void
.end method

.method private write()I
    .registers 3

    .line 72
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p0

    const/4 v0, 0x1

    const/high16 v1, 0x42200000    # 40.0f

    .line 71
    invoke-static {v0, v1, p0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result p0

    float-to-int p0, p0

    return p0
.end method


# virtual methods
.method protected final onDraw(Landroid/graphics/Canvas;)V
    .registers 5

    .line 44
    invoke-super {p0, p1}, Landroidx/appcompat/widget/AppCompatImageView;->onDraw(Landroid/graphics/Canvas;)V

    .line 47
    :try_start_3
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 49
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0803fc

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;ILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v0

    if-eqz v0, :cond_26

    .line 52
    iget p0, p0, Lcom/clevertap/android/sdk/customviews/CloseImageView;->AudioAttributesCompatParcelizer:I

    const/4 v1, 0x1

    invoke-static {v0, p0, p0, v1}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    move-result-object p0

    .line 54
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    const/4 v1, 0x0

    invoke-virtual {p1, p0, v1, v1, v0}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    return-void

    .line 56
    :cond_26
    invoke-static {}, Lo/RendererWakeupListener;->MediaMetadataCompat()V
    :try_end_29
    .catchall {:try_start_3 .. :try_end_29} :catchall_2a

    return-void

    .line 59
    :catchall_2a
    invoke-static {}, Lo/RendererWakeupListener;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()V

    return-void
.end method

.method protected final onMeasure(II)V
    .registers 3

    .line 66
    iget p1, p0, Lcom/clevertap/android/sdk/customviews/CloseImageView;->AudioAttributesCompatParcelizer:I

    invoke-virtual {p0, p1, p1}, Lcom/clevertap/android/sdk/customviews/CloseImageView;->setMeasuredDimension(II)V

    return-void
.end method
