###### Class androidx.appcompat.widget.ViewStubCompat (androidx.appcompat.widget.ViewStubCompat)
.class public final Landroidx/appcompat/widget/ViewStubCompat;
.super Landroid/view/View;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/appcompat/widget/ViewStubCompat$IconCompatParcelizer;
    }
.end annotation


# instance fields
.field private AudioAttributesCompatParcelizer:I

.field private IconCompatParcelizer:Landroidx/appcompat/widget/ViewStubCompat$IconCompatParcelizer;

.field private RemoteActionCompatParcelizer:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field private read:Landroid/view/LayoutInflater;

.field private write:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 4

    const/4 v0, 0x0

    .line 55
    invoke-direct {p0, p1, p2, v0}, Landroidx/appcompat/widget/ViewStubCompat;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 6

    .line 59
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 v0, 0x0

    .line 46
    iput v0, p0, Landroidx/appcompat/widget/ViewStubCompat;->write:I

    .line 61
    sget-object v1, Lo/_init_lambda5$AudioAttributesImplApi26Parcelizer;->ViewStubCompat:[I

    invoke-virtual {p1, p2, v1, p3, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 64
    sget p2, Lo/_init_lambda5$AudioAttributesImplApi26Parcelizer;->ViewStubCompat_android_inflatedId:I

    const/4 p3, -0x1

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p2

    iput p2, p0, Landroidx/appcompat/widget/ViewStubCompat;->AudioAttributesCompatParcelizer:I

    .line 65
    sget p2, Lo/_init_lambda5$AudioAttributesImplApi26Parcelizer;->ViewStubCompat_android_layout:I

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p2

    iput p2, p0, Landroidx/appcompat/widget/ViewStubCompat;->write:I

    .line 67
    sget p2, Lo/_init_lambda5$AudioAttributesImplApi26Parcelizer;->ViewStubCompat_android_id:I

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p2

    invoke-virtual {p0, p2}, Landroid/view/View;->setId(I)V

    .line 68
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    const/16 p1, 0x8

    .line 70
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    const/4 p1, 0x1

    .line 71
    invoke-virtual {p0, p1}, Landroid/view/View;->setWillNotDraw(Z)V

    return-void
.end method


# virtual methods
.method protected final dispatchDraw(Landroid/graphics/Canvas;)V
    .registers 2

    return-void
.end method

.method public final draw(Landroid/graphics/Canvas;)V
    .registers 2

    return-void
.end method

.method protected final onMeasure(II)V
    .registers 3

    const/4 p1, 0x0

    .line 151
    invoke-virtual {p0, p1, p1}, Landroidx/appcompat/widget/ViewStubCompat;->setMeasuredDimension(II)V

    return-void
.end method

.method public final setInflatedId(I)V
    .registers 2

    .line 99
    iput p1, p0, Landroidx/appcompat/widget/ViewStubCompat;->AudioAttributesCompatParcelizer:I

    return-void
.end method

.method public final setLayoutInflater(Landroid/view/LayoutInflater;)V
    .registers 2

    .line 139
    iput-object p1, p0, Landroidx/appcompat/widget/ViewStubCompat;->read:Landroid/view/LayoutInflater;

    return-void
.end method

.method public final setLayoutResource(I)V
    .registers 2

    .line 131
    iput p1, p0, Landroidx/appcompat/widget/ViewStubCompat;->write:I

    return-void
.end method

.method public final setOnInflateListener(Landroidx/appcompat/widget/ViewStubCompat$IconCompatParcelizer;)V
    .registers 2

    .line 250
    iput-object p1, p0, Landroidx/appcompat/widget/ViewStubCompat;->IconCompatParcelizer:Landroidx/appcompat/widget/ViewStubCompat$IconCompatParcelizer;

    return-void
.end method

.method public final setVisibility(I)V
    .registers 3

    .line 175
    iget-object v0, p0, Landroidx/appcompat/widget/ViewStubCompat;->RemoteActionCompatParcelizer:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_18

    .line 176
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/view/View;

    if-eqz p0, :cond_10

    .line 178
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    return-void

    .line 180
    :cond_10
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "setVisibility called on un-referenced view"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 183
    :cond_18
    invoke-super {p0, p1}, Landroid/view/View;->setVisibility(I)V

    if-eqz p1, :cond_21

    const/4 v0, 0x4

    if-eq p1, v0, :cond_21

    return-void

    .line 185
    :cond_21
    invoke-virtual {p0}, Landroidx/appcompat/widget/ViewStubCompat;->write()Landroid/view/View;

    return-void
.end method

.method public final write()Landroid/view/View;
    .registers 5

    .line 198
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    .line 200
    instance-of v1, v0, Landroid/view/ViewGroup;

    if-eqz v1, :cond_54

    .line 201
    iget v1, p0, Landroidx/appcompat/widget/ViewStubCompat;->write:I

    if-eqz v1, :cond_4c

    .line 202
    check-cast v0, Landroid/view/ViewGroup;

    .line 204
    iget-object v1, p0, Landroidx/appcompat/widget/ViewStubCompat;->read:Landroid/view/LayoutInflater;

    if-nez v1, :cond_1a

    .line 207
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    .line 209
    :cond_1a
    iget v2, p0, Landroidx/appcompat/widget/ViewStubCompat;->write:I

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v0, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    .line 212
    iget v2, p0, Landroidx/appcompat/widget/ViewStubCompat;->AudioAttributesCompatParcelizer:I

    const/4 v3, -0x1

    if-eq v2, v3, :cond_29

    .line 213
    invoke-virtual {v1, v2}, Landroid/view/View;->setId(I)V

    .line 216
    :cond_29
    invoke-virtual {v0, p0}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result v2

    .line 217
    invoke-virtual {v0, p0}, Landroid/view/ViewGroup;->removeViewInLayout(Landroid/view/View;)V

    .line 219
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    if-eqz v3, :cond_3a

    .line 221
    invoke-virtual {v0, v1, v2, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    goto :goto_3d

    .line 223
    :cond_3a
    invoke-virtual {v0, v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    .line 226
    :goto_3d
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Landroidx/appcompat/widget/ViewStubCompat;->RemoteActionCompatParcelizer:Ljava/lang/ref/WeakReference;

    .line 228
    iget-object v0, p0, Landroidx/appcompat/widget/ViewStubCompat;->IconCompatParcelizer:Landroidx/appcompat/widget/ViewStubCompat$IconCompatParcelizer;

    if-eqz v0, :cond_4b

    .line 229
    invoke-interface {v0, p0, v1}, Landroidx/appcompat/widget/ViewStubCompat$IconCompatParcelizer;->AudioAttributesCompatParcelizer(Landroidx/appcompat/widget/ViewStubCompat;Landroid/view/View;)V

    :cond_4b
    return-object v1

    .line 234
    :cond_4c
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "ViewStub must have a valid layoutResource"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 237
    :cond_54
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "ViewStub must have a non-null ViewGroup viewParent"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

###### Class androidx.appcompat.widget.ViewStubCompat.IconCompatParcelizer (androidx.appcompat.widget.ViewStubCompat$IconCompatParcelizer)
.class public interface abstract Landroidx/appcompat/widget/ViewStubCompat$IconCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/widget/ViewStubCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "IconCompatParcelizer"
.end annotation


# virtual methods
.method public abstract AudioAttributesCompatParcelizer(Landroidx/appcompat/widget/ViewStubCompat;Landroid/view/View;)V
.end method
