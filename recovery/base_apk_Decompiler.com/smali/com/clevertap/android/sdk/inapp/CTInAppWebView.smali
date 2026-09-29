###### Class com.clevertap.android.sdk.inapp.CTInAppWebView (com.clevertap.android.sdk.inapp.CTInAppWebView)
.class public final Lcom/clevertap/android/sdk/inapp/CTInAppWebView;
.super Landroid/webkit/WebView;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/clevertap/android/sdk/inapp/CTInAppWebView$read;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0010\u0006\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0000\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\u0008\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000b\u0010\u000cB1\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\u0008\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u000b\u0010\rJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0014\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0017\u0010\u0015J\u000f\u0010\u0018\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0018\u0010\u0015J\u000f\u0010\u0019\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0019\u0010\u0015J\u000f\u0010\u001a\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u001a\u0010\u0015J\u0015\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u001b\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0015\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u001e\u00a2\u0006\u0004\u0008\u0018\u0010\u001fR\u0014\u0010\u001a\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010 R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008!\u0010\"R\u0014\u0010\u0018\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\"R\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\"R\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008#\u0010\"R\u0014\u0010\u0019\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010$R\u0011\u0010!\u001a\u00020%8\u0006\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010&R\"\u0010\'\u001a\u00020\u001e8\u0007@\u0007X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\'\u0010(\u001a\u0004\u0008\'\u0010)\"\u0004\u0008*\u0010\u001f"
    }
    d2 = {
        "Lcom/clevertap/android/sdk/inapp/CTInAppWebView;",
        "Landroid/webkit/WebView;",
        "Landroid/content/Context;",
        "p0",
        "",
        "p1",
        "p2",
        "p3",
        "p4",
        "",
        "p5",
        "<init>",
        "(Landroid/content/Context;IIIID)V",
        "(Landroid/content/Context;IIII)V",
        "",
        "onMeasure",
        "(II)V",
        "read",
        "()V",
        "(I)I",
        "RemoteActionCompatParcelizer",
        "()I",
        "AudioAttributesCompatParcelizer",
        "AudioAttributesImplApi21Parcelizer",
        "write",
        "MediaBrowserCompatItemReceiver",
        "IconCompatParcelizer",
        "Lo/r8lambdaY6x1WIS9rGRZELX3_b0HE2QA1H4;",
        "setJavaScriptInterface",
        "(Lo/r8lambdaY6x1WIS9rGRZELX3_b0HE2QA1H4;)V",
        "",
        "(Z)V",
        "Landroid/content/Context;",
        "AudioAttributesImplBaseParcelizer",
        "I",
        "AudioAttributesImplApi26Parcelizer",
        "D",
        "Landroid/graphics/Point;",
        "Landroid/graphics/Point;",
        "isFullscreen",
        "Z",
        "()Z",
        "setFullscreen"
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
.field public static final read:Lcom/clevertap/android/sdk/inapp/CTInAppWebView$read;


# instance fields
.field private final AudioAttributesCompatParcelizer:I

.field private final AudioAttributesImplApi21Parcelizer:I

.field private final AudioAttributesImplApi26Parcelizer:I

.field private final AudioAttributesImplBaseParcelizer:I

.field private final IconCompatParcelizer:Landroid/content/Context;

.field public final RemoteActionCompatParcelizer:Landroid/graphics/Point;

.field private isFullscreen:Z

.field private final write:D


# direct methods
.method static constructor <clinit>()V
    .registers 2

    .line 182
    new-instance v0, Lcom/clevertap/android/sdk/inapp/CTInAppWebView$read;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/clevertap/android/sdk/inapp/CTInAppWebView$read;-><init>(Lo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V

    sput-object v0, Lcom/clevertap/android/sdk/inapp/CTInAppWebView;->read:Lcom/clevertap/android/sdk/inapp/CTInAppWebView$read;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;IIII)V
    .registers 15

    const-string v0, ""

    invoke-static {p1, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/high16 v7, -0x4010000000000000L    # -1.0

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    move v6, p5

    .line 42
    invoke-direct/range {v1 .. v8}, Lcom/clevertap/android/sdk/inapp/CTInAppWebView;-><init>(Landroid/content/Context;IIIID)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;IIIID)V
    .registers 9

    const-string v0, ""

    invoke-static {p1, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    invoke-direct {p0, p1}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V

    .line 17
    iput-object p1, p0, Lcom/clevertap/android/sdk/inapp/CTInAppWebView;->IconCompatParcelizer:Landroid/content/Context;

    .line 18
    iput p2, p0, Lcom/clevertap/android/sdk/inapp/CTInAppWebView;->AudioAttributesImplBaseParcelizer:I

    .line 19
    iput p3, p0, Lcom/clevertap/android/sdk/inapp/CTInAppWebView;->AudioAttributesCompatParcelizer:I

    .line 20
    iput p4, p0, Lcom/clevertap/android/sdk/inapp/CTInAppWebView;->AudioAttributesImplApi21Parcelizer:I

    .line 21
    iput p5, p0, Lcom/clevertap/android/sdk/inapp/CTInAppWebView;->AudioAttributesImplApi26Parcelizer:I

    .line 22
    iput-wide p6, p0, Lcom/clevertap/android/sdk/inapp/CTInAppWebView;->write:D

    .line 31
    new-instance p1, Landroid/graphics/Point;

    invoke-direct {p1}, Landroid/graphics/Point;-><init>()V

    iput-object p1, p0, Lcom/clevertap/android/sdk/inapp/CTInAppWebView;->RemoteActionCompatParcelizer:Landroid/graphics/Point;

    const/4 p1, 0x0

    .line 45
    invoke-virtual {p0, p1}, Landroid/view/View;->setHorizontalScrollBarEnabled(Z)V

    .line 46
    invoke-virtual {p0, p1}, Landroid/view/View;->setVerticalScrollBarEnabled(Z)V

    .line 47
    invoke-virtual {p0, p1}, Landroid/view/View;->setHorizontalFadingEdgeEnabled(Z)V

    .line 48
    invoke-virtual {p0, p1}, Landroid/view/View;->setVerticalFadingEdgeEnabled(Z)V

    const/4 p2, 0x2

    .line 49
    invoke-virtual {p0, p2}, Lcom/clevertap/android/sdk/inapp/CTInAppWebView;->setOverScrollMode(I)V

    .line 50
    invoke-virtual {p0, p1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 52
    invoke-virtual {p0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object p1

    const/16 p2, 0x64

    invoke-virtual {p1, p2}, Landroid/webkit/WebSettings;->setTextZoom(I)V

    const p1, 0x2df85

    .line 53
    invoke-virtual {p0, p1}, Landroid/view/View;->setId(I)V

    return-void
.end method

.method private final AudioAttributesCompatParcelizer()I
    .registers 3

    .line 101
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_b

    .line 102
    invoke-direct {p0}, Lcom/clevertap/android/sdk/inapp/CTInAppWebView;->write()I

    move-result p0

    return p0

    .line 104
    :cond_b
    invoke-direct {p0}, Lcom/clevertap/android/sdk/inapp/CTInAppWebView;->IconCompatParcelizer()I

    move-result p0

    return p0
.end method

.method private final AudioAttributesImplApi21Parcelizer()I
    .registers 6

    .line 111
    iget-object v0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppWebView;->IconCompatParcelizer:Landroid/content/Context;

    const-string v1, "window"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Landroid/view/WindowManager;

    if-eqz v1, :cond_f

    check-cast v0, Landroid/view/WindowManager;

    goto :goto_10

    :cond_f
    const/4 v0, 0x0

    :goto_10
    if-nez v0, :cond_17

    .line 112
    invoke-direct {p0}, Lcom/clevertap/android/sdk/inapp/CTInAppWebView;->MediaBrowserCompatItemReceiver()I

    move-result p0

    return p0

    .line 114
    :cond_17
    invoke-interface {v0}, Landroid/view/WindowManager;->getCurrentWindowMetrics()Landroid/view/WindowMetrics;

    move-result-object v0

    const-string v1, ""

    invoke-static {v0, v1}, Lo/toMagicModuleMetaRepoModel;->AudioAttributesCompatParcelizer(Ljava/lang/Object;Ljava/lang/String;)V

    .line 115
    iget-boolean v2, p0, Lcom/clevertap/android/sdk/inapp/CTInAppWebView;->isFullscreen:Z

    if-eqz v2, :cond_2d

    .line 116
    invoke-virtual {v0}, Landroid/view/WindowMetrics;->getBounds()Landroid/graphics/Rect;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v0

    goto :goto_4f

    .line 118
    :cond_2d
    invoke-virtual {v0}, Landroid/view/WindowMetrics;->getWindowInsets()Landroid/view/WindowInsets;

    move-result-object v2

    .line 119
    invoke-static {}, Landroid/view/WindowInsets$Type;->systemBars()I

    move-result v3

    invoke-static {}, Landroid/view/WindowInsets$Type;->displayCutout()I

    move-result v4

    or-int/2addr v3, v4

    .line 118
    invoke-virtual {v2, v3}, Landroid/view/WindowInsets;->getInsetsIgnoringVisibility(I)Landroid/graphics/Insets;

    move-result-object v2

    invoke-static {v2, v1}, Lo/toMagicModuleMetaRepoModel;->AudioAttributesCompatParcelizer(Ljava/lang/Object;Ljava/lang/String;)V

    .line 121
    invoke-virtual {v0}, Landroid/view/WindowMetrics;->getBounds()Landroid/graphics/Rect;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v0

    iget v1, v2, Landroid/graphics/Insets;->left:I

    sub-int/2addr v0, v1

    iget v1, v2, Landroid/graphics/Insets;->right:I

    sub-int/2addr v0, v1

    .line 123
    :goto_4f
    iget p0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppWebView;->AudioAttributesImplApi21Parcelizer:I

    mul-int/2addr v0, p0

    int-to-float p0, v0

    const/high16 v0, 0x42c80000    # 100.0f

    div-float/2addr p0, v0

    float-to-int p0, p0

    return p0
.end method

.method private final IconCompatParcelizer()I
    .registers 2

    .line 153
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    .line 154
    iget v0, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    iget p0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppWebView;->AudioAttributesImplApi26Parcelizer:I

    mul-int/2addr v0, p0

    int-to-float p0, v0

    const/high16 v0, 0x42c80000    # 100.0f

    div-float/2addr p0, v0

    float-to-int p0, p0

    return p0
.end method

.method private final MediaBrowserCompatItemReceiver()I
    .registers 2

    .line 147
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    .line 148
    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    iget p0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppWebView;->AudioAttributesImplApi21Parcelizer:I

    mul-int/2addr v0, p0

    int-to-float p0, v0

    const/high16 v0, 0x42c80000    # 100.0f

    div-float/2addr p0, v0

    float-to-int p0, p0

    return p0
.end method

.method private final RemoteActionCompatParcelizer()I
    .registers 3

    .line 93
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_b

    .line 94
    invoke-direct {p0}, Lcom/clevertap/android/sdk/inapp/CTInAppWebView;->AudioAttributesImplApi21Parcelizer()I

    move-result p0

    return p0

    .line 96
    :cond_b
    invoke-direct {p0}, Lcom/clevertap/android/sdk/inapp/CTInAppWebView;->MediaBrowserCompatItemReceiver()I

    move-result p0

    return p0
.end method

.method private final read(I)I
    .registers 3

    int-to-float p1, p1

    .line 87
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p0

    const/4 v0, 0x1

    .line 84
    invoke-static {v0, p1, p0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result p0

    float-to-int p0, p0

    return p0
.end method

.method private final write()I
    .registers 6

    .line 130
    iget-object v0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppWebView;->IconCompatParcelizer:Landroid/content/Context;

    const-string v1, "window"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Landroid/view/WindowManager;

    if-eqz v1, :cond_f

    check-cast v0, Landroid/view/WindowManager;

    goto :goto_10

    :cond_f
    const/4 v0, 0x0

    :goto_10
    if-nez v0, :cond_17

    .line 131
    invoke-direct {p0}, Lcom/clevertap/android/sdk/inapp/CTInAppWebView;->IconCompatParcelizer()I

    move-result p0

    return p0

    .line 133
    :cond_17
    invoke-interface {v0}, Landroid/view/WindowManager;->getCurrentWindowMetrics()Landroid/view/WindowMetrics;

    move-result-object v0

    const-string v1, ""

    invoke-static {v0, v1}, Lo/toMagicModuleMetaRepoModel;->AudioAttributesCompatParcelizer(Ljava/lang/Object;Ljava/lang/String;)V

    .line 134
    iget-boolean v2, p0, Lcom/clevertap/android/sdk/inapp/CTInAppWebView;->isFullscreen:Z

    if-eqz v2, :cond_2d

    .line 135
    invoke-virtual {v0}, Landroid/view/WindowMetrics;->getBounds()Landroid/graphics/Rect;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result v0

    goto :goto_4f

    .line 137
    :cond_2d
    invoke-virtual {v0}, Landroid/view/WindowMetrics;->getWindowInsets()Landroid/view/WindowInsets;

    move-result-object v2

    .line 138
    invoke-static {}, Landroid/view/WindowInsets$Type;->systemBars()I

    move-result v3

    invoke-static {}, Landroid/view/WindowInsets$Type;->displayCutout()I

    move-result v4

    or-int/2addr v3, v4

    .line 137
    invoke-virtual {v2, v3}, Landroid/view/WindowInsets;->getInsetsIgnoringVisibility(I)Landroid/graphics/Insets;

    move-result-object v2

    invoke-static {v2, v1}, Lo/toMagicModuleMetaRepoModel;->AudioAttributesCompatParcelizer(Ljava/lang/Object;Ljava/lang/String;)V

    .line 140
    invoke-virtual {v0}, Landroid/view/WindowMetrics;->getBounds()Landroid/graphics/Rect;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result v0

    iget v1, v2, Landroid/graphics/Insets;->top:I

    sub-int/2addr v0, v1

    iget v1, v2, Landroid/graphics/Insets;->bottom:I

    sub-int/2addr v0, v1

    .line 142
    :goto_4f
    iget p0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppWebView;->AudioAttributesImplApi26Parcelizer:I

    mul-int/2addr v0, p0

    int-to-float p0, v0

    const/high16 v0, 0x42c80000    # 100.0f

    div-float/2addr p0, v0

    float-to-int p0, p0

    return p0
.end method


# virtual methods
.method public final isFullscreen()Z
    .registers 1

    .line 33
    iget-boolean p0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppWebView;->isFullscreen:Z

    return p0
.end method

.method protected final onMeasure(II)V
    .registers 3

    .line 57
    invoke-super {p0, p1, p2}, Landroid/webkit/WebView;->onMeasure(II)V

    .line 58
    invoke-virtual {p0}, Lcom/clevertap/android/sdk/inapp/CTInAppWebView;->read()V

    .line 59
    iget-object p1, p0, Lcom/clevertap/android/sdk/inapp/CTInAppWebView;->RemoteActionCompatParcelizer:Landroid/graphics/Point;

    iget p1, p1, Landroid/graphics/Point;->x:I

    iget-object p2, p0, Lcom/clevertap/android/sdk/inapp/CTInAppWebView;->RemoteActionCompatParcelizer:Landroid/graphics/Point;

    iget p2, p2, Landroid/graphics/Point;->y:I

    invoke-virtual {p0, p1, p2}, Lcom/clevertap/android/sdk/inapp/CTInAppWebView;->setMeasuredDimension(II)V

    return-void
.end method

.method public final read()V
    .registers 6

    .line 64
    iget v0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppWebView;->AudioAttributesImplBaseParcelizer:I

    if-lez v0, :cond_9

    .line 65
    invoke-direct {p0, v0}, Lcom/clevertap/android/sdk/inapp/CTInAppWebView;->read(I)I

    move-result v0

    goto :goto_d

    .line 67
    :cond_9
    invoke-direct {p0}, Lcom/clevertap/android/sdk/inapp/CTInAppWebView;->RemoteActionCompatParcelizer()I

    move-result v0

    .line 70
    :goto_d
    iget v1, p0, Lcom/clevertap/android/sdk/inapp/CTInAppWebView;->AudioAttributesCompatParcelizer:I

    if-lez v1, :cond_16

    .line 71
    invoke-direct {p0, v1}, Lcom/clevertap/android/sdk/inapp/CTInAppWebView;->read(I)I

    move-result v1

    goto :goto_2c

    .line 72
    :cond_16
    iget-wide v1, p0, Lcom/clevertap/android/sdk/inapp/CTInAppWebView;->write:D

    const-wide/high16 v3, -0x4010000000000000L    # -1.0

    cmpg-double v3, v1, v3

    if-eqz v3, :cond_28

    const-wide/16 v3, 0x0

    cmpl-double v3, v1, v3

    if-lez v3, :cond_28

    int-to-double v3, v0

    div-double/2addr v3, v1

    double-to-int v1, v3

    goto :goto_2c

    .line 75
    :cond_28
    invoke-direct {p0}, Lcom/clevertap/android/sdk/inapp/CTInAppWebView;->AudioAttributesCompatParcelizer()I

    move-result v1

    .line 78
    :goto_2c
    iget-object v2, p0, Lcom/clevertap/android/sdk/inapp/CTInAppWebView;->RemoteActionCompatParcelizer:Landroid/graphics/Point;

    iput v0, v2, Landroid/graphics/Point;->x:I

    .line 79
    iget-object p0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppWebView;->RemoteActionCompatParcelizer:Landroid/graphics/Point;

    iput v1, p0, Landroid/graphics/Point;->y:I

    return-void
.end method

.method public final setFullscreen(Z)V
    .registers 2

    .line 33
    iput-boolean p1, p0, Lcom/clevertap/android/sdk/inapp/CTInAppWebView;->isFullscreen:Z

    return-void
.end method

.method public final setJavaScriptInterface(Lo/r8lambdaY6x1WIS9rGRZELX3_b0HE2QA1H4;)V
    .registers 4

    const-string v0, ""

    invoke-static {p1, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    .line 159
    invoke-virtual {p0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    const/4 v1, 0x1

    .line 160
    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    const/4 v1, 0x0

    .line 161
    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setJavaScriptCanOpenWindowsAutomatically(Z)V

    .line 162
    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setAllowContentAccess(Z)V

    .line 163
    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setAllowFileAccess(Z)V

    .line 164
    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setAllowFileAccessFromFileURLs(Z)V

    .line 167
    const-string v0, "CleverTap"

    invoke-virtual {p0, p1, v0}, Landroid/webkit/WebView;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final write(Z)V
    .registers 3

    .line 174
    invoke-virtual {p0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 175
    invoke-virtual {p0}, Landroid/view/View;->destroyDrawingCache()V

    .line 176
    const-string v0, "about:blank"

    invoke-virtual {p0, v0}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    if-eqz p1, :cond_12

    .line 178
    const-string p1, "CleverTap"

    invoke-virtual {p0, p1}, Lcom/clevertap/android/sdk/inapp/CTInAppWebView;->removeJavascriptInterface(Ljava/lang/String;)V

    .line 180
    :cond_12
    invoke-virtual {p0}, Landroid/webkit/WebView;->clearHistory()V

    .line 181
    invoke-virtual {p0}, Landroid/webkit/WebView;->destroy()V

    return-void
.end method

###### Class com.clevertap.android.sdk.inapp.CTInAppWebView.Companion (com.clevertap.android.sdk.inapp.CTInAppWebView$read)
.class public final Lcom/clevertap/android/sdk/inapp/CTInAppWebView$read;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/clevertap/android/sdk/inapp/CTInAppWebView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "read"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lcom/clevertap/android/sdk/inapp/CTInAppWebView$read;",
        "",
        "<init>",
        "()V"
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

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V
    .registers 2

    .line 26
    invoke-direct {p0}, Lcom/clevertap/android/sdk/inapp/CTInAppWebView$read;-><init>()V

    return-void
.end method
