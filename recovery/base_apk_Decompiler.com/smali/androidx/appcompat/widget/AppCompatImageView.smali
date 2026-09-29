###### Class androidx.appcompat.widget.AppCompatImageView (androidx.appcompat.widget.AppCompatImageView)
.class public Landroidx/appcompat/widget/AppCompatImageView;
.super Landroid/widget/ImageView;
.source "SourceFile"


# instance fields
.field private final RemoteActionCompatParcelizer:Lo/handleOnBackCancelled;

.field private final read:Lo/addCancellable;

.field private write:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 3

    const/4 v0, 0x0

    .line 69
    invoke-direct {p0, p1, v0}, Landroidx/appcompat/widget/AppCompatImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 4

    const/4 v0, 0x0

    .line 73
    invoke-direct {p0, p1, p2, v0}, Landroidx/appcompat/widget/AppCompatImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 4

    .line 78
    invoke-static {p1}, Lo/setCheckable;->read(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p1

    invoke-direct {p0, p1, p2, p3}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p1, 0x0

    .line 66
    iput-boolean p1, p0, Landroidx/appcompat/widget/AppCompatImageView;->write:Z

    .line 80
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p0, p1}, Lo/setPositiveButton;->IconCompatParcelizer(Landroid/view/View;Landroid/content/Context;)V

    .line 82
    new-instance p1, Lo/addCancellable;

    invoke-direct {p1, p0}, Lo/addCancellable;-><init>(Landroid/view/View;)V

    iput-object p1, p0, Landroidx/appcompat/widget/AppCompatImageView;->read:Lo/addCancellable;

    .line 83
    invoke-virtual {p1, p2, p3}, Lo/addCancellable;->IconCompatParcelizer(Landroid/util/AttributeSet;I)V

    .line 85
    new-instance p1, Lo/handleOnBackCancelled;

    invoke-direct {p1, p0}, Lo/handleOnBackCancelled;-><init>(Landroid/widget/ImageView;)V

    iput-object p1, p0, Landroidx/appcompat/widget/AppCompatImageView;->RemoteActionCompatParcelizer:Lo/handleOnBackCancelled;

    .line 86
    invoke-virtual {p1, p2, p3}, Lo/handleOnBackCancelled;->RemoteActionCompatParcelizer(Landroid/util/AttributeSet;I)V

    return-void
.end method


# virtual methods
.method protected drawableStateChanged()V
    .registers 2

    .line 268
    invoke-super {p0}, Landroid/widget/ImageView;->drawableStateChanged()V

    .line 269
    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatImageView;->read:Lo/addCancellable;

    if-eqz v0, :cond_a

    .line 270
    invoke-virtual {v0}, Lo/addCancellable;->read()V

    .line 272
    :cond_a
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatImageView;->RemoteActionCompatParcelizer:Lo/handleOnBackCancelled;

    if-eqz p0, :cond_11

    .line 273
    invoke-virtual {p0}, Lo/handleOnBackCancelled;->IconCompatParcelizer()V

    :cond_11
    return-void
.end method

.method public hasOverlappingRendering()Z
    .registers 2

    .line 279
    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatImageView;->RemoteActionCompatParcelizer:Lo/handleOnBackCancelled;

    invoke-virtual {v0}, Lo/handleOnBackCancelled;->RemoteActionCompatParcelizer()Z

    move-result v0

    if-eqz v0, :cond_10

    invoke-super {p0}, Landroid/widget/ImageView;->hasOverlappingRendering()Z

    move-result p0

    if-eqz p0, :cond_10

    const/4 p0, 0x1

    return p0

    :cond_10
    const/4 p0, 0x0

    return p0
.end method

.method public setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
    .registers 2

    .line 148
    invoke-super {p0, p1}, Landroid/widget/ImageView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 149
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatImageView;->read:Lo/addCancellable;

    if-eqz p0, :cond_a

    .line 150
    invoke-virtual {p0, p1}, Lo/addCancellable;->AudioAttributesCompatParcelizer(Landroid/graphics/drawable/Drawable;)V

    :cond_a
    return-void
.end method

.method public setBackgroundResource(I)V
    .registers 2

    .line 140
    invoke-super {p0, p1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 141
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatImageView;->read:Lo/addCancellable;

    if-eqz p0, :cond_a

    .line 142
    invoke-virtual {p0, p1}, Lo/addCancellable;->write(I)V

    :cond_a
    return-void
.end method

.method public setImageBitmap(Landroid/graphics/Bitmap;)V
    .registers 2

    .line 124
    invoke-super {p0, p1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 125
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatImageView;->RemoteActionCompatParcelizer:Lo/handleOnBackCancelled;

    if-eqz p0, :cond_a

    .line 126
    invoke-virtual {p0}, Lo/handleOnBackCancelled;->IconCompatParcelizer()V

    :cond_a
    return-void
.end method

.method public setImageDrawable(Landroid/graphics/drawable/Drawable;)V
    .registers 4

    .line 108
    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatImageView;->RemoteActionCompatParcelizer:Lo/handleOnBackCancelled;

    if-eqz v0, :cond_d

    if-eqz p1, :cond_d

    iget-boolean v1, p0, Landroidx/appcompat/widget/AppCompatImageView;->write:Z

    if-nez v1, :cond_d

    .line 110
    invoke-virtual {v0, p1}, Lo/handleOnBackCancelled;->AudioAttributesCompatParcelizer(Landroid/graphics/drawable/Drawable;)V

    .line 112
    :cond_d
    invoke-super {p0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 113
    iget-object p1, p0, Landroidx/appcompat/widget/AppCompatImageView;->RemoteActionCompatParcelizer:Lo/handleOnBackCancelled;

    if-eqz p1, :cond_20

    .line 114
    invoke-virtual {p1}, Lo/handleOnBackCancelled;->IconCompatParcelizer()V

    .line 115
    iget-boolean p1, p0, Landroidx/appcompat/widget/AppCompatImageView;->write:Z

    if-nez p1, :cond_20

    .line 117
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatImageView;->RemoteActionCompatParcelizer:Lo/handleOnBackCancelled;

    invoke-virtual {p0}, Lo/handleOnBackCancelled;->read()V

    :cond_20
    return-void
.end method

.method public setImageLevel(I)V
    .registers 2

    .line 284
    invoke-super {p0, p1}, Landroid/widget/ImageView;->setImageLevel(I)V

    const/4 p1, 0x1

    .line 285
    iput-boolean p1, p0, Landroidx/appcompat/widget/AppCompatImageView;->write:Z

    return-void
.end method

.method public setImageResource(I)V
    .registers 2

    .line 100
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatImageView;->RemoteActionCompatParcelizer:Lo/handleOnBackCancelled;

    if-eqz p0, :cond_7

    .line 102
    invoke-virtual {p0, p1}, Lo/handleOnBackCancelled;->IconCompatParcelizer(I)V

    :cond_7
    return-void
.end method

.method public setImageURI(Landroid/net/Uri;)V
    .registers 2

    .line 132
    invoke-super {p0, p1}, Landroid/widget/ImageView;->setImageURI(Landroid/net/Uri;)V

    .line 133
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatImageView;->RemoteActionCompatParcelizer:Lo/handleOnBackCancelled;

    if-eqz p0, :cond_a

    .line 134
    invoke-virtual {p0}, Lo/handleOnBackCancelled;->IconCompatParcelizer()V

    :cond_a
    return-void
.end method

.method public setSupportBackgroundTintList(Landroid/content/res/ColorStateList;)V
    .registers 2

    .line 163
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatImageView;->read:Lo/addCancellable;

    if-eqz p0, :cond_7

    .line 164
    invoke-virtual {p0, p1}, Lo/addCancellable;->AudioAttributesCompatParcelizer(Landroid/content/res/ColorStateList;)V

    :cond_7
    return-void
.end method

.method public setSupportBackgroundTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .registers 2

    .line 191
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatImageView;->read:Lo/addCancellable;

    if-eqz p0, :cond_7

    .line 192
    invoke-virtual {p0, p1}, Lo/addCancellable;->RemoteActionCompatParcelizer(Landroid/graphics/PorterDuff$Mode;)V

    :cond_7
    return-void
.end method

.method public setSupportImageTintList(Landroid/content/res/ColorStateList;)V
    .registers 2

    .line 219
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatImageView;->RemoteActionCompatParcelizer:Lo/handleOnBackCancelled;

    if-eqz p0, :cond_7

    .line 220
    invoke-virtual {p0, p1}, Lo/handleOnBackCancelled;->RemoteActionCompatParcelizer(Landroid/content/res/ColorStateList;)V

    :cond_7
    return-void
.end method

.method public setSupportImageTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .registers 2

    .line 247
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatImageView;->RemoteActionCompatParcelizer:Lo/handleOnBackCancelled;

    if-eqz p0, :cond_7

    .line 248
    invoke-virtual {p0, p1}, Lo/handleOnBackCancelled;->IconCompatParcelizer(Landroid/graphics/PorterDuff$Mode;)V

    :cond_7
    return-void
.end method
