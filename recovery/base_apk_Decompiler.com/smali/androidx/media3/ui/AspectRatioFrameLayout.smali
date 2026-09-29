###### Class androidx.media3.ui.AspectRatioFrameLayout (androidx.media3.ui.AspectRatioFrameLayout)
.class public final Landroidx/media3/ui/AspectRatioFrameLayout;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/media3/ui/AspectRatioFrameLayout$IconCompatParcelizer;,
        Landroidx/media3/ui/AspectRatioFrameLayout$AudioAttributesCompatParcelizer;
    }
.end annotation


# instance fields
.field private final IconCompatParcelizer:Landroidx/media3/ui/AspectRatioFrameLayout$AudioAttributesCompatParcelizer;

.field private RemoteActionCompatParcelizer:Landroidx/media3/ui/AspectRatioFrameLayout$IconCompatParcelizer;

.field private read:F

.field private write:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 3

    const/4 v0, 0x0

    .line 107
    invoke-direct {p0, p1, v0}, Landroidx/media3/ui/AspectRatioFrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 5

    .line 111
    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 v0, 0x0

    .line 112
    iput v0, p0, Landroidx/media3/ui/AspectRatioFrameLayout;->write:I

    if-eqz p2, :cond_23

    .line 116
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object p1

    sget-object v1, Lo/maximumCapacity$MediaDescriptionCompat;->AspectRatioFrameLayout:[I

    .line 117
    invoke-virtual {p1, p2, v1, v0, v0}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 119
    :try_start_12
    sget p2, Lo/maximumCapacity$MediaDescriptionCompat;->AspectRatioFrameLayout_resize_mode:I

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    iput p2, p0, Landroidx/media3/ui/AspectRatioFrameLayout;->write:I
    :try_end_1a
    .catchall {:try_start_12 .. :try_end_1a} :catchall_1e

    .line 121
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    goto :goto_23

    :catchall_1e
    move-exception p0

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 122
    throw p0

    .line 124
    :cond_23
    :goto_23
    new-instance p1, Landroidx/media3/ui/AspectRatioFrameLayout$AudioAttributesCompatParcelizer;

    invoke-direct {p1, p0, v0}, Landroidx/media3/ui/AspectRatioFrameLayout$AudioAttributesCompatParcelizer;-><init>(Landroidx/media3/ui/AspectRatioFrameLayout;B)V

    iput-object p1, p0, Landroidx/media3/ui/AspectRatioFrameLayout;->IconCompatParcelizer:Landroidx/media3/ui/AspectRatioFrameLayout$AudioAttributesCompatParcelizer;

    return-void
.end method

.method static synthetic AudioAttributesCompatParcelizer(Landroidx/media3/ui/AspectRatioFrameLayout;)Landroidx/media3/ui/AspectRatioFrameLayout$IconCompatParcelizer;
    .registers 1

    .line 34
    iget-object p0, p0, Landroidx/media3/ui/AspectRatioFrameLayout;->RemoteActionCompatParcelizer:Landroidx/media3/ui/AspectRatioFrameLayout$IconCompatParcelizer;

    return-object p0
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer()I
    .registers 1

    .line 151
    iget p0, p0, Landroidx/media3/ui/AspectRatioFrameLayout;->write:I

    return p0
.end method

.method protected final onMeasure(II)V
    .registers 11

    .line 168
    invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->onMeasure(II)V

    .line 169
    iget p1, p0, Landroidx/media3/ui/AspectRatioFrameLayout;->read:F

    const/4 p2, 0x0

    cmpg-float p1, p1, p2

    if-gtz p1, :cond_b

    return-void

    .line 174
    :cond_b
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result p1

    .line 175
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    int-to-float v1, p1

    int-to-float v2, v0

    div-float v3, v1, v2

    .line 177
    iget v4, p0, Landroidx/media3/ui/AspectRatioFrameLayout;->read:F

    div-float/2addr v4, v3

    const/high16 v5, 0x3f800000    # 1.0f

    sub-float/2addr v4, v5

    .line 178
    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    move-result v5

    const v6, 0x3c23d70a    # 0.01f

    cmpg-float v5, v5, v6

    if-gtz v5, :cond_31

    .line 180
    iget-object p1, p0, Landroidx/media3/ui/AspectRatioFrameLayout;->IconCompatParcelizer:Landroidx/media3/ui/AspectRatioFrameLayout$AudioAttributesCompatParcelizer;

    iget p0, p0, Landroidx/media3/ui/AspectRatioFrameLayout;->read:F

    const/4 p2, 0x0

    invoke-virtual {p1, p0, v3, p2}, Landroidx/media3/ui/AspectRatioFrameLayout$AudioAttributesCompatParcelizer;->IconCompatParcelizer(FFZ)V

    return-void

    .line 184
    :cond_31
    iget v5, p0, Landroidx/media3/ui/AspectRatioFrameLayout;->write:I

    const/4 v6, 0x1

    if-eqz v5, :cond_43

    if-eq v5, v6, :cond_4c

    const/4 v7, 0x2

    if-eq v5, v7, :cond_47

    const/4 v7, 0x4

    if-ne v5, v7, :cond_50

    cmpl-float p2, v4, p2

    if-lez p2, :cond_4c

    goto :goto_47

    :cond_43
    cmpl-float p2, v4, p2

    if-gtz p2, :cond_4c

    .line 189
    :cond_47
    :goto_47
    iget p1, p0, Landroidx/media3/ui/AspectRatioFrameLayout;->read:F

    mul-float/2addr v2, p1

    float-to-int p1, v2

    goto :goto_50

    .line 186
    :cond_4c
    iget p2, p0, Landroidx/media3/ui/AspectRatioFrameLayout;->read:F

    div-float/2addr v1, p2

    float-to-int v0, v1

    .line 210
    :cond_50
    :goto_50
    iget-object p2, p0, Landroidx/media3/ui/AspectRatioFrameLayout;->IconCompatParcelizer:Landroidx/media3/ui/AspectRatioFrameLayout$AudioAttributesCompatParcelizer;

    iget v1, p0, Landroidx/media3/ui/AspectRatioFrameLayout;->read:F

    invoke-virtual {p2, v1, v3, v6}, Landroidx/media3/ui/AspectRatioFrameLayout$AudioAttributesCompatParcelizer;->IconCompatParcelizer(FFZ)V

    const/high16 p2, 0x40000000    # 2.0f

    .line 212
    invoke-static {p1, p2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p1

    .line 213
    invoke-static {v0, p2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p2

    .line 211
    invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->onMeasure(II)V

    return-void
.end method

.method public final setAspectRatio(F)V
    .registers 3

    .line 133
    iget v0, p0, Landroidx/media3/ui/AspectRatioFrameLayout;->read:F

    cmpl-float v0, v0, p1

    if-eqz v0, :cond_b

    .line 134
    iput p1, p0, Landroidx/media3/ui/AspectRatioFrameLayout;->read:F

    .line 135
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    :cond_b
    return-void
.end method

.method public final setAspectRatioListener(Landroidx/media3/ui/AspectRatioFrameLayout$IconCompatParcelizer;)V
    .registers 2

    .line 146
    iput-object p1, p0, Landroidx/media3/ui/AspectRatioFrameLayout;->RemoteActionCompatParcelizer:Landroidx/media3/ui/AspectRatioFrameLayout$IconCompatParcelizer;

    return-void
.end method

.method public final setResizeMode(I)V
    .registers 3

    .line 160
    iget v0, p0, Landroidx/media3/ui/AspectRatioFrameLayout;->write:I

    if-eq v0, p1, :cond_9

    .line 161
    iput p1, p0, Landroidx/media3/ui/AspectRatioFrameLayout;->write:I

    .line 162
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    :cond_9
    return-void
.end method

###### Class androidx.media3.ui.AspectRatioFrameLayout.AudioAttributesCompatParcelizer (androidx.media3.ui.AspectRatioFrameLayout$AudioAttributesCompatParcelizer)
.class final Landroidx/media3/ui/AspectRatioFrameLayout$AudioAttributesCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/ui/AspectRatioFrameLayout;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "AudioAttributesCompatParcelizer"
.end annotation


# instance fields
.field final synthetic AudioAttributesCompatParcelizer:Landroidx/media3/ui/AspectRatioFrameLayout;

.field private IconCompatParcelizer:F

.field private RemoteActionCompatParcelizer:Z

.field private read:Z

.field private write:F


# direct methods
.method private constructor <init>(Landroidx/media3/ui/AspectRatioFrameLayout;)V
    .registers 2

    .line 217
    iput-object p1, p0, Landroidx/media3/ui/AspectRatioFrameLayout$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer:Landroidx/media3/ui/AspectRatioFrameLayout;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Landroidx/media3/ui/AspectRatioFrameLayout;B)V
    .registers 3

    .line 217
    invoke-direct {p0, p1}, Landroidx/media3/ui/AspectRatioFrameLayout$AudioAttributesCompatParcelizer;-><init>(Landroidx/media3/ui/AspectRatioFrameLayout;)V

    return-void
.end method


# virtual methods
.method public final IconCompatParcelizer(FFZ)V
    .registers 4

    .line 226
    iput p1, p0, Landroidx/media3/ui/AspectRatioFrameLayout$AudioAttributesCompatParcelizer;->write:F

    .line 227
    iput p2, p0, Landroidx/media3/ui/AspectRatioFrameLayout$AudioAttributesCompatParcelizer;->IconCompatParcelizer:F

    .line 228
    iput-boolean p3, p0, Landroidx/media3/ui/AspectRatioFrameLayout$AudioAttributesCompatParcelizer;->read:Z

    .line 230
    iget-boolean p1, p0, Landroidx/media3/ui/AspectRatioFrameLayout$AudioAttributesCompatParcelizer;->RemoteActionCompatParcelizer:Z

    if-nez p1, :cond_12

    const/4 p1, 0x1

    .line 231
    iput-boolean p1, p0, Landroidx/media3/ui/AspectRatioFrameLayout$AudioAttributesCompatParcelizer;->RemoteActionCompatParcelizer:Z

    .line 232
    iget-object p1, p0, Landroidx/media3/ui/AspectRatioFrameLayout$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer:Landroidx/media3/ui/AspectRatioFrameLayout;

    invoke-virtual {p1, p0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    :cond_12
    return-void
.end method

.method public final run()V
    .registers 2

    const/4 v0, 0x0

    .line 238
    iput-boolean v0, p0, Landroidx/media3/ui/AspectRatioFrameLayout$AudioAttributesCompatParcelizer;->RemoteActionCompatParcelizer:Z

    .line 239
    iget-object v0, p0, Landroidx/media3/ui/AspectRatioFrameLayout$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer:Landroidx/media3/ui/AspectRatioFrameLayout;

    invoke-static {v0}, Landroidx/media3/ui/AspectRatioFrameLayout;->AudioAttributesCompatParcelizer(Landroidx/media3/ui/AspectRatioFrameLayout;)Landroidx/media3/ui/AspectRatioFrameLayout$IconCompatParcelizer;

    move-result-object v0

    if-nez v0, :cond_c

    return-void

    .line 242
    :cond_c
    iget-object p0, p0, Landroidx/media3/ui/AspectRatioFrameLayout$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer:Landroidx/media3/ui/AspectRatioFrameLayout;

    invoke-static {p0}, Landroidx/media3/ui/AspectRatioFrameLayout;->AudioAttributesCompatParcelizer(Landroidx/media3/ui/AspectRatioFrameLayout;)Landroidx/media3/ui/AspectRatioFrameLayout$IconCompatParcelizer;

    return-void
.end method

###### Class androidx.media3.ui.AspectRatioFrameLayout.IconCompatParcelizer (androidx.media3.ui.AspectRatioFrameLayout$IconCompatParcelizer)
.class public interface abstract Landroidx/media3/ui/AspectRatioFrameLayout$IconCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/ui/AspectRatioFrameLayout;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "IconCompatParcelizer"
.end annotation
