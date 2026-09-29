###### Class androidx.appcompat.widget.AppCompatRadioButton (androidx.appcompat.widget.AppCompatRadioButton)
.class public Landroidx/appcompat/widget/AppCompatRadioButton;
.super Landroid/widget/RadioButton;
.source "SourceFile"

# interfaces
.implements Lo/_addFromBundleIfNotPresent;


# instance fields
.field private AudioAttributesCompatParcelizer:Lo/getEnabledChangedCallbackactivity_release;

.field private final RemoteActionCompatParcelizer:Lo/addCancellable;

.field private final read:Lo/startActivityForResult;

.field private final write:Lo/setEnabled;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 3

    const/4 v0, 0x0

    .line 70
    invoke-direct {p0, p1, v0}, Landroidx/appcompat/widget/AppCompatRadioButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 4

    .line 74
    sget v0, Lo/_init_lambda5$read;->radioButtonStyle:I

    invoke-direct {p0, p1, p2, v0}, Landroidx/appcompat/widget/AppCompatRadioButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 4

    .line 78
    invoke-static {p1}, Lo/setCheckable;->read(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p1

    invoke-direct {p0, p1, p2, p3}, Landroid/widget/RadioButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 80
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p0, p1}, Lo/setPositiveButton;->IconCompatParcelizer(Landroid/view/View;Landroid/content/Context;)V

    .line 82
    new-instance p1, Lo/startActivityForResult;

    invoke-direct {p1, p0}, Lo/startActivityForResult;-><init>(Landroid/widget/CompoundButton;)V

    iput-object p1, p0, Landroidx/appcompat/widget/AppCompatRadioButton;->read:Lo/startActivityForResult;

    .line 83
    invoke-virtual {p1, p2, p3}, Lo/startActivityForResult;->AudioAttributesCompatParcelizer(Landroid/util/AttributeSet;I)V

    .line 85
    new-instance p1, Lo/addCancellable;

    invoke-direct {p1, p0}, Lo/addCancellable;-><init>(Landroid/view/View;)V

    iput-object p1, p0, Landroidx/appcompat/widget/AppCompatRadioButton;->RemoteActionCompatParcelizer:Lo/addCancellable;

    .line 86
    invoke-virtual {p1, p2, p3}, Lo/addCancellable;->IconCompatParcelizer(Landroid/util/AttributeSet;I)V

    .line 88
    new-instance p1, Lo/setEnabled;

    invoke-direct {p1, p0}, Lo/setEnabled;-><init>(Landroid/widget/TextView;)V

    iput-object p1, p0, Landroidx/appcompat/widget/AppCompatRadioButton;->write:Lo/setEnabled;

    .line 89
    invoke-virtual {p1, p2, p3}, Lo/setEnabled;->read(Landroid/util/AttributeSet;I)V

    .line 90
    invoke-direct {p0}, Landroidx/appcompat/widget/AppCompatRadioButton;->IconCompatParcelizer()Lo/getEnabledChangedCallbackactivity_release;

    move-result-object p0

    .line 91
    invoke-virtual {p0, p2, p3}, Lo/getEnabledChangedCallbackactivity_release;->AudioAttributesCompatParcelizer(Landroid/util/AttributeSet;I)V

    return-void
.end method

.method private IconCompatParcelizer()Lo/getEnabledChangedCallbackactivity_release;
    .registers 2

    .line 99
    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatRadioButton;->AudioAttributesCompatParcelizer:Lo/getEnabledChangedCallbackactivity_release;

    if-nez v0, :cond_b

    .line 100
    new-instance v0, Lo/getEnabledChangedCallbackactivity_release;

    invoke-direct {v0, p0}, Lo/getEnabledChangedCallbackactivity_release;-><init>(Landroid/widget/TextView;)V

    iput-object v0, p0, Landroidx/appcompat/widget/AppCompatRadioButton;->AudioAttributesCompatParcelizer:Lo/getEnabledChangedCallbackactivity_release;

    .line 102
    :cond_b
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatRadioButton;->AudioAttributesCompatParcelizer:Lo/getEnabledChangedCallbackactivity_release;

    return-object p0
.end method


# virtual methods
.method protected drawableStateChanged()V
    .registers 2

    .line 250
    invoke-super {p0}, Landroid/widget/RadioButton;->drawableStateChanged()V

    .line 251
    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatRadioButton;->RemoteActionCompatParcelizer:Lo/addCancellable;

    if-eqz v0, :cond_a

    .line 252
    invoke-virtual {v0}, Lo/addCancellable;->read()V

    .line 254
    :cond_a
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatRadioButton;->write:Lo/setEnabled;

    if-eqz p0, :cond_11

    .line 255
    invoke-virtual {p0}, Lo/setEnabled;->AudioAttributesCompatParcelizer()V

    :cond_11
    return-void
.end method

.method public getCompoundPaddingLeft()I
    .registers 2

    .line 120
    invoke-super {p0}, Landroid/widget/RadioButton;->getCompoundPaddingLeft()I

    move-result v0

    .line 121
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatRadioButton;->read:Lo/startActivityForResult;

    if-eqz p0, :cond_d

    .line 122
    invoke-virtual {p0, v0}, Lo/startActivityForResult;->read(I)I

    move-result p0

    return p0

    :cond_d
    return v0
.end method

.method public read()Landroid/content/res/ColorStateList;
    .registers 1

    .line 146
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatRadioButton;->read:Lo/startActivityForResult;

    if-eqz p0, :cond_9

    .line 147
    invoke-virtual {p0}, Lo/startActivityForResult;->read()Landroid/content/res/ColorStateList;

    move-result-object p0

    return-object p0

    :cond_9
    const/4 p0, 0x0

    return-object p0
.end method

.method public setAllCaps(Z)V
    .registers 2

    .line 266
    invoke-super {p0, p1}, Landroid/widget/RadioButton;->setAllCaps(Z)V

    .line 267
    invoke-direct {p0}, Landroidx/appcompat/widget/AppCompatRadioButton;->IconCompatParcelizer()Lo/getEnabledChangedCallbackactivity_release;

    move-result-object p0

    invoke-virtual {p0, p1}, Lo/getEnabledChangedCallbackactivity_release;->write(Z)V

    return-void
.end method

.method public setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
    .registers 2

    .line 234
    invoke-super {p0, p1}, Landroid/widget/RadioButton;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 235
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatRadioButton;->RemoteActionCompatParcelizer:Lo/addCancellable;

    if-eqz p0, :cond_a

    .line 236
    invoke-virtual {p0, p1}, Lo/addCancellable;->AudioAttributesCompatParcelizer(Landroid/graphics/drawable/Drawable;)V

    :cond_a
    return-void
.end method

.method public setBackgroundResource(I)V
    .registers 2

    .line 242
    invoke-super {p0, p1}, Landroid/widget/RadioButton;->setBackgroundResource(I)V

    .line 243
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatRadioButton;->RemoteActionCompatParcelizer:Lo/addCancellable;

    if-eqz p0, :cond_a

    .line 244
    invoke-virtual {p0, p1}, Lo/addCancellable;->write(I)V

    :cond_a
    return-void
.end method

.method public setButtonDrawable(I)V
    .registers 3

    .line 115
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Lo/getDefaultViewModelCreationExtras;->write(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/widget/CompoundButton;->setButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setButtonDrawable(Landroid/graphics/drawable/Drawable;)V
    .registers 2

    .line 107
    invoke-super {p0, p1}, Landroid/widget/RadioButton;->setButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 108
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatRadioButton;->read:Lo/startActivityForResult;

    if-eqz p0, :cond_a

    .line 109
    invoke-virtual {p0}, Lo/startActivityForResult;->IconCompatParcelizer()V

    :cond_a
    return-void
.end method

.method public setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    .registers 5

    .line 283
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/RadioButton;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 284
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatRadioButton;->write:Lo/setEnabled;

    if-eqz p0, :cond_a

    .line 285
    invoke-virtual {p0}, Lo/setEnabled;->AudioAttributesImplApi26Parcelizer()V

    :cond_a
    return-void
.end method

.method public setCompoundDrawablesRelative(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    .registers 5

    .line 293
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/RadioButton;->setCompoundDrawablesRelative(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 294
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatRadioButton;->write:Lo/setEnabled;

    if-eqz p0, :cond_a

    .line 295
    invoke-virtual {p0}, Lo/setEnabled;->AudioAttributesImplApi26Parcelizer()V

    :cond_a
    return-void
.end method

.method public setEmojiCompatEnabled(Z)V
    .registers 2

    .line 272
    invoke-direct {p0}, Landroidx/appcompat/widget/AppCompatRadioButton;->IconCompatParcelizer()Lo/getEnabledChangedCallbackactivity_release;

    move-result-object p0

    invoke-virtual {p0, p1}, Lo/getEnabledChangedCallbackactivity_release;->read(Z)V

    return-void
.end method

.method public setFilters([Landroid/text/InputFilter;)V
    .registers 3

    .line 261
    invoke-direct {p0}, Landroidx/appcompat/widget/AppCompatRadioButton;->IconCompatParcelizer()Lo/getEnabledChangedCallbackactivity_release;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/getEnabledChangedCallbackactivity_release;->AudioAttributesCompatParcelizer([Landroid/text/InputFilter;)[Landroid/text/InputFilter;

    move-result-object p1

    invoke-super {p0, p1}, Landroid/widget/RadioButton;->setFilters([Landroid/text/InputFilter;)V

    return-void
.end method

.method public setSupportBackgroundTintList(Landroid/content/res/ColorStateList;)V
    .registers 2

    .line 185
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatRadioButton;->RemoteActionCompatParcelizer:Lo/addCancellable;

    if-eqz p0, :cond_7

    .line 186
    invoke-virtual {p0, p1}, Lo/addCancellable;->AudioAttributesCompatParcelizer(Landroid/content/res/ColorStateList;)V

    :cond_7
    return-void
.end method

.method public setSupportBackgroundTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .registers 2

    .line 213
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatRadioButton;->RemoteActionCompatParcelizer:Lo/addCancellable;

    if-eqz p0, :cond_7

    .line 214
    invoke-virtual {p0, p1}, Lo/addCancellable;->RemoteActionCompatParcelizer(Landroid/graphics/PorterDuff$Mode;)V

    :cond_7
    return-void
.end method

.method public setSupportButtonTintList(Landroid/content/res/ColorStateList;)V
    .registers 2

    .line 133
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatRadioButton;->read:Lo/startActivityForResult;

    if-eqz p0, :cond_7

    .line 134
    invoke-virtual {p0, p1}, Lo/startActivityForResult;->write(Landroid/content/res/ColorStateList;)V

    :cond_7
    return-void
.end method

.method public setSupportButtonTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .registers 2

    .line 158
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatRadioButton;->read:Lo/startActivityForResult;

    if-eqz p0, :cond_7

    .line 159
    invoke-virtual {p0, p1}, Lo/startActivityForResult;->write(Landroid/graphics/PorterDuff$Mode;)V

    :cond_7
    return-void
.end method

.method public setSupportCompoundDrawablesTintList(Landroid/content/res/ColorStateList;)V
    .registers 3

    .line 336
    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatRadioButton;->write:Lo/setEnabled;

    invoke-virtual {v0, p1}, Lo/setEnabled;->RemoteActionCompatParcelizer(Landroid/content/res/ColorStateList;)V

    .line 337
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatRadioButton;->write:Lo/setEnabled;

    invoke-virtual {p0}, Lo/setEnabled;->AudioAttributesCompatParcelizer()V

    return-void
.end method

.method public setSupportCompoundDrawablesTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .registers 3

    .line 376
    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatRadioButton;->write:Lo/setEnabled;

    invoke-virtual {v0, p1}, Lo/setEnabled;->RemoteActionCompatParcelizer(Landroid/graphics/PorterDuff$Mode;)V

    .line 377
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatRadioButton;->write:Lo/setEnabled;

    invoke-virtual {p0}, Lo/setEnabled;->AudioAttributesCompatParcelizer()V

    return-void
.end method
