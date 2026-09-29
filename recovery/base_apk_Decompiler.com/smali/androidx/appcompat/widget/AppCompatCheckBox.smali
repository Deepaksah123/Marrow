###### Class androidx.appcompat.widget.AppCompatCheckBox (androidx.appcompat.widget.AppCompatCheckBox)
.class public Landroidx/appcompat/widget/AppCompatCheckBox;
.super Landroid/widget/CheckBox;
.source "SourceFile"

# interfaces
.implements Lo/_addFromBundleIfNotPresent;


# instance fields
.field private final AudioAttributesCompatParcelizer:Lo/addCancellable;

.field private final IconCompatParcelizer:Lo/setEnabled;

.field private final read:Lo/startActivityForResult;

.field private write:Lo/getEnabledChangedCallbackactivity_release;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 3

    const/4 v0, 0x0

    .line 70
    invoke-direct {p0, p1, v0}, Landroidx/appcompat/widget/AppCompatCheckBox;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 4

    .line 74
    sget v0, Lo/_init_lambda5$read;->checkboxStyle:I

    invoke-direct {p0, p1, p2, v0}, Landroidx/appcompat/widget/AppCompatCheckBox;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 4

    .line 79
    invoke-static {p1}, Lo/setCheckable;->read(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p1

    invoke-direct {p0, p1, p2, p3}, Landroid/widget/CheckBox;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 81
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p0, p1}, Lo/setPositiveButton;->IconCompatParcelizer(Landroid/view/View;Landroid/content/Context;)V

    .line 83
    new-instance p1, Lo/startActivityForResult;

    invoke-direct {p1, p0}, Lo/startActivityForResult;-><init>(Landroid/widget/CompoundButton;)V

    iput-object p1, p0, Landroidx/appcompat/widget/AppCompatCheckBox;->read:Lo/startActivityForResult;

    .line 84
    invoke-virtual {p1, p2, p3}, Lo/startActivityForResult;->AudioAttributesCompatParcelizer(Landroid/util/AttributeSet;I)V

    .line 86
    new-instance p1, Lo/addCancellable;

    invoke-direct {p1, p0}, Lo/addCancellable;-><init>(Landroid/view/View;)V

    iput-object p1, p0, Landroidx/appcompat/widget/AppCompatCheckBox;->AudioAttributesCompatParcelizer:Lo/addCancellable;

    .line 87
    invoke-virtual {p1, p2, p3}, Lo/addCancellable;->IconCompatParcelizer(Landroid/util/AttributeSet;I)V

    .line 89
    new-instance p1, Lo/setEnabled;

    invoke-direct {p1, p0}, Lo/setEnabled;-><init>(Landroid/widget/TextView;)V

    iput-object p1, p0, Landroidx/appcompat/widget/AppCompatCheckBox;->IconCompatParcelizer:Lo/setEnabled;

    .line 90
    invoke-virtual {p1, p2, p3}, Lo/setEnabled;->read(Landroid/util/AttributeSet;I)V

    .line 92
    invoke-direct {p0}, Landroidx/appcompat/widget/AppCompatCheckBox;->write()Lo/getEnabledChangedCallbackactivity_release;

    move-result-object p0

    .line 93
    invoke-virtual {p0, p2, p3}, Lo/getEnabledChangedCallbackactivity_release;->AudioAttributesCompatParcelizer(Landroid/util/AttributeSet;I)V

    return-void
.end method

.method private write()Lo/getEnabledChangedCallbackactivity_release;
    .registers 2

    .line 101
    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatCheckBox;->write:Lo/getEnabledChangedCallbackactivity_release;

    if-nez v0, :cond_b

    .line 102
    new-instance v0, Lo/getEnabledChangedCallbackactivity_release;

    invoke-direct {v0, p0}, Lo/getEnabledChangedCallbackactivity_release;-><init>(Landroid/widget/TextView;)V

    iput-object v0, p0, Landroidx/appcompat/widget/AppCompatCheckBox;->write:Lo/getEnabledChangedCallbackactivity_release;

    .line 104
    :cond_b
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatCheckBox;->write:Lo/getEnabledChangedCallbackactivity_release;

    return-object p0
.end method


# virtual methods
.method public drawableStateChanged()V
    .registers 2

    .line 251
    invoke-super {p0}, Landroid/widget/CheckBox;->drawableStateChanged()V

    .line 252
    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatCheckBox;->AudioAttributesCompatParcelizer:Lo/addCancellable;

    if-eqz v0, :cond_a

    .line 253
    invoke-virtual {v0}, Lo/addCancellable;->read()V

    .line 255
    :cond_a
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatCheckBox;->IconCompatParcelizer:Lo/setEnabled;

    if-eqz p0, :cond_11

    .line 256
    invoke-virtual {p0}, Lo/setEnabled;->AudioAttributesCompatParcelizer()V

    :cond_11
    return-void
.end method

.method public getCompoundPaddingLeft()I
    .registers 2

    .line 122
    invoke-super {p0}, Landroid/widget/CheckBox;->getCompoundPaddingLeft()I

    move-result v0

    .line 123
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatCheckBox;->read:Lo/startActivityForResult;

    if-eqz p0, :cond_d

    .line 124
    invoke-virtual {p0, v0}, Lo/startActivityForResult;->read(I)I

    move-result p0

    return p0

    :cond_d
    return v0
.end method

.method public read()Landroid/content/res/ColorStateList;
    .registers 1

    .line 148
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatCheckBox;->read:Lo/startActivityForResult;

    if-eqz p0, :cond_9

    .line 149
    invoke-virtual {p0}, Lo/startActivityForResult;->read()Landroid/content/res/ColorStateList;

    move-result-object p0

    return-object p0

    :cond_9
    const/4 p0, 0x0

    return-object p0
.end method

.method public setAllCaps(Z)V
    .registers 2

    .line 267
    invoke-super {p0, p1}, Landroid/widget/CheckBox;->setAllCaps(Z)V

    .line 268
    invoke-direct {p0}, Landroidx/appcompat/widget/AppCompatCheckBox;->write()Lo/getEnabledChangedCallbackactivity_release;

    move-result-object p0

    invoke-virtual {p0, p1}, Lo/getEnabledChangedCallbackactivity_release;->write(Z)V

    return-void
.end method

.method public setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
    .registers 2

    .line 235
    invoke-super {p0, p1}, Landroid/widget/CheckBox;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 236
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatCheckBox;->AudioAttributesCompatParcelizer:Lo/addCancellable;

    if-eqz p0, :cond_a

    .line 237
    invoke-virtual {p0, p1}, Lo/addCancellable;->AudioAttributesCompatParcelizer(Landroid/graphics/drawable/Drawable;)V

    :cond_a
    return-void
.end method

.method public setBackgroundResource(I)V
    .registers 2

    .line 243
    invoke-super {p0, p1}, Landroid/widget/CheckBox;->setBackgroundResource(I)V

    .line 244
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatCheckBox;->AudioAttributesCompatParcelizer:Lo/addCancellable;

    if-eqz p0, :cond_a

    .line 245
    invoke-virtual {p0, p1}, Lo/addCancellable;->write(I)V

    :cond_a
    return-void
.end method

.method public setButtonDrawable(I)V
    .registers 3

    .line 117
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Lo/getDefaultViewModelCreationExtras;->write(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/widget/CompoundButton;->setButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setButtonDrawable(Landroid/graphics/drawable/Drawable;)V
    .registers 2

    .line 109
    invoke-super {p0, p1}, Landroid/widget/CheckBox;->setButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 110
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatCheckBox;->read:Lo/startActivityForResult;

    if-eqz p0, :cond_a

    .line 111
    invoke-virtual {p0}, Lo/startActivityForResult;->IconCompatParcelizer()V

    :cond_a
    return-void
.end method

.method public setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    .registers 5

    .line 284
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/CheckBox;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 285
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatCheckBox;->IconCompatParcelizer:Lo/setEnabled;

    if-eqz p0, :cond_a

    .line 286
    invoke-virtual {p0}, Lo/setEnabled;->AudioAttributesImplApi26Parcelizer()V

    :cond_a
    return-void
.end method

.method public setCompoundDrawablesRelative(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    .registers 5

    .line 294
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/CheckBox;->setCompoundDrawablesRelative(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 295
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatCheckBox;->IconCompatParcelizer:Lo/setEnabled;

    if-eqz p0, :cond_a

    .line 296
    invoke-virtual {p0}, Lo/setEnabled;->AudioAttributesImplApi26Parcelizer()V

    :cond_a
    return-void
.end method

.method public setEmojiCompatEnabled(Z)V
    .registers 2

    .line 273
    invoke-direct {p0}, Landroidx/appcompat/widget/AppCompatCheckBox;->write()Lo/getEnabledChangedCallbackactivity_release;

    move-result-object p0

    invoke-virtual {p0, p1}, Lo/getEnabledChangedCallbackactivity_release;->read(Z)V

    return-void
.end method

.method public setFilters([Landroid/text/InputFilter;)V
    .registers 3

    .line 262
    invoke-direct {p0}, Landroidx/appcompat/widget/AppCompatCheckBox;->write()Lo/getEnabledChangedCallbackactivity_release;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/getEnabledChangedCallbackactivity_release;->AudioAttributesCompatParcelizer([Landroid/text/InputFilter;)[Landroid/text/InputFilter;

    move-result-object p1

    invoke-super {p0, p1}, Landroid/widget/CheckBox;->setFilters([Landroid/text/InputFilter;)V

    return-void
.end method

.method public setSupportBackgroundTintList(Landroid/content/res/ColorStateList;)V
    .registers 2

    .line 186
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatCheckBox;->AudioAttributesCompatParcelizer:Lo/addCancellable;

    if-eqz p0, :cond_7

    .line 187
    invoke-virtual {p0, p1}, Lo/addCancellable;->AudioAttributesCompatParcelizer(Landroid/content/res/ColorStateList;)V

    :cond_7
    return-void
.end method

.method public setSupportBackgroundTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .registers 2

    .line 214
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatCheckBox;->AudioAttributesCompatParcelizer:Lo/addCancellable;

    if-eqz p0, :cond_7

    .line 215
    invoke-virtual {p0, p1}, Lo/addCancellable;->RemoteActionCompatParcelizer(Landroid/graphics/PorterDuff$Mode;)V

    :cond_7
    return-void
.end method

.method public setSupportButtonTintList(Landroid/content/res/ColorStateList;)V
    .registers 2

    .line 135
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatCheckBox;->read:Lo/startActivityForResult;

    if-eqz p0, :cond_7

    .line 136
    invoke-virtual {p0, p1}, Lo/startActivityForResult;->write(Landroid/content/res/ColorStateList;)V

    :cond_7
    return-void
.end method

.method public setSupportButtonTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .registers 2

    .line 160
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatCheckBox;->read:Lo/startActivityForResult;

    if-eqz p0, :cond_7

    .line 161
    invoke-virtual {p0, p1}, Lo/startActivityForResult;->write(Landroid/graphics/PorterDuff$Mode;)V

    :cond_7
    return-void
.end method

.method public setSupportCompoundDrawablesTintList(Landroid/content/res/ColorStateList;)V
    .registers 3

    .line 337
    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatCheckBox;->IconCompatParcelizer:Lo/setEnabled;

    invoke-virtual {v0, p1}, Lo/setEnabled;->RemoteActionCompatParcelizer(Landroid/content/res/ColorStateList;)V

    .line 338
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatCheckBox;->IconCompatParcelizer:Lo/setEnabled;

    invoke-virtual {p0}, Lo/setEnabled;->AudioAttributesCompatParcelizer()V

    return-void
.end method

.method public setSupportCompoundDrawablesTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .registers 3

    .line 377
    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatCheckBox;->IconCompatParcelizer:Lo/setEnabled;

    invoke-virtual {v0, p1}, Lo/setEnabled;->RemoteActionCompatParcelizer(Landroid/graphics/PorterDuff$Mode;)V

    .line 378
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatCheckBox;->IconCompatParcelizer:Lo/setEnabled;

    invoke-virtual {p0}, Lo/setEnabled;->AudioAttributesCompatParcelizer()V

    return-void
.end method
