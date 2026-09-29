###### Class androidx.appcompat.widget.AppCompatToggleButton (androidx.appcompat.widget.AppCompatToggleButton)
.class public Landroidx/appcompat/widget/AppCompatToggleButton;
.super Landroid/widget/ToggleButton;
.source "SourceFile"


# instance fields
.field private AudioAttributesCompatParcelizer:Lo/getEnabledChangedCallbackactivity_release;

.field private final IconCompatParcelizer:Lo/setEnabled;

.field private final RemoteActionCompatParcelizer:Lo/addCancellable;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 3

    const/4 v0, 0x0

    .line 65
    invoke-direct {p0, p1, v0}, Landroidx/appcompat/widget/AppCompatToggleButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 4

    const v0, 0x101004b

    .line 69
    invoke-direct {p0, p1, p2, v0}, Landroidx/appcompat/widget/AppCompatToggleButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 4

    .line 74
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/ToggleButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 76
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p0, p1}, Lo/setPositiveButton;->IconCompatParcelizer(Landroid/view/View;Landroid/content/Context;)V

    .line 78
    new-instance p1, Lo/addCancellable;

    invoke-direct {p1, p0}, Lo/addCancellable;-><init>(Landroid/view/View;)V

    iput-object p1, p0, Landroidx/appcompat/widget/AppCompatToggleButton;->RemoteActionCompatParcelizer:Lo/addCancellable;

    .line 79
    invoke-virtual {p1, p2, p3}, Lo/addCancellable;->IconCompatParcelizer(Landroid/util/AttributeSet;I)V

    .line 81
    new-instance p1, Lo/setEnabled;

    invoke-direct {p1, p0}, Lo/setEnabled;-><init>(Landroid/widget/TextView;)V

    iput-object p1, p0, Landroidx/appcompat/widget/AppCompatToggleButton;->IconCompatParcelizer:Lo/setEnabled;

    .line 82
    invoke-virtual {p1, p2, p3}, Lo/setEnabled;->read(Landroid/util/AttributeSet;I)V

    .line 84
    invoke-direct {p0}, Landroidx/appcompat/widget/AppCompatToggleButton;->RemoteActionCompatParcelizer()Lo/getEnabledChangedCallbackactivity_release;

    move-result-object p0

    .line 85
    invoke-virtual {p0, p2, p3}, Lo/getEnabledChangedCallbackactivity_release;->AudioAttributesCompatParcelizer(Landroid/util/AttributeSet;I)V

    return-void
.end method

.method private RemoteActionCompatParcelizer()Lo/getEnabledChangedCallbackactivity_release;
    .registers 2

    .line 183
    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatToggleButton;->AudioAttributesCompatParcelizer:Lo/getEnabledChangedCallbackactivity_release;

    if-nez v0, :cond_b

    .line 184
    new-instance v0, Lo/getEnabledChangedCallbackactivity_release;

    invoke-direct {v0, p0}, Lo/getEnabledChangedCallbackactivity_release;-><init>(Landroid/widget/TextView;)V

    iput-object v0, p0, Landroidx/appcompat/widget/AppCompatToggleButton;->AudioAttributesCompatParcelizer:Lo/getEnabledChangedCallbackactivity_release;

    .line 186
    :cond_b
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatToggleButton;->AudioAttributesCompatParcelizer:Lo/getEnabledChangedCallbackactivity_release;

    return-object p0
.end method


# virtual methods
.method protected drawableStateChanged()V
    .registers 2

    .line 162
    invoke-super {p0}, Landroid/widget/ToggleButton;->drawableStateChanged()V

    .line 163
    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatToggleButton;->RemoteActionCompatParcelizer:Lo/addCancellable;

    if-eqz v0, :cond_a

    .line 164
    invoke-virtual {v0}, Lo/addCancellable;->read()V

    .line 166
    :cond_a
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatToggleButton;->IconCompatParcelizer:Lo/setEnabled;

    if-eqz p0, :cond_11

    .line 167
    invoke-virtual {p0}, Lo/setEnabled;->AudioAttributesCompatParcelizer()V

    :cond_11
    return-void
.end method

.method public setAllCaps(Z)V
    .registers 2

    .line 191
    invoke-super {p0, p1}, Landroid/widget/ToggleButton;->setAllCaps(Z)V

    .line 192
    invoke-direct {p0}, Landroidx/appcompat/widget/AppCompatToggleButton;->RemoteActionCompatParcelizer()Lo/getEnabledChangedCallbackactivity_release;

    move-result-object p0

    invoke-virtual {p0, p1}, Lo/getEnabledChangedCallbackactivity_release;->write(Z)V

    return-void
.end method

.method public setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
    .registers 2

    .line 98
    invoke-super {p0, p1}, Landroid/widget/ToggleButton;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 99
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatToggleButton;->RemoteActionCompatParcelizer:Lo/addCancellable;

    if-eqz p0, :cond_a

    .line 100
    invoke-virtual {p0, p1}, Lo/addCancellable;->AudioAttributesCompatParcelizer(Landroid/graphics/drawable/Drawable;)V

    :cond_a
    return-void
.end method

.method public setBackgroundResource(I)V
    .registers 2

    .line 90
    invoke-super {p0, p1}, Landroid/widget/ToggleButton;->setBackgroundResource(I)V

    .line 91
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatToggleButton;->RemoteActionCompatParcelizer:Lo/addCancellable;

    if-eqz p0, :cond_a

    .line 92
    invoke-virtual {p0, p1}, Lo/addCancellable;->write(I)V

    :cond_a
    return-void
.end method

.method public setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    .registers 5

    .line 208
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/ToggleButton;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 209
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatToggleButton;->IconCompatParcelizer:Lo/setEnabled;

    if-eqz p0, :cond_a

    .line 210
    invoke-virtual {p0}, Lo/setEnabled;->AudioAttributesImplApi26Parcelizer()V

    :cond_a
    return-void
.end method

.method public setCompoundDrawablesRelative(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    .registers 5

    .line 218
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/ToggleButton;->setCompoundDrawablesRelative(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 219
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatToggleButton;->IconCompatParcelizer:Lo/setEnabled;

    if-eqz p0, :cond_a

    .line 220
    invoke-virtual {p0}, Lo/setEnabled;->AudioAttributesImplApi26Parcelizer()V

    :cond_a
    return-void
.end method

.method public setEmojiCompatEnabled(Z)V
    .registers 2

    .line 197
    invoke-direct {p0}, Landroidx/appcompat/widget/AppCompatToggleButton;->RemoteActionCompatParcelizer()Lo/getEnabledChangedCallbackactivity_release;

    move-result-object p0

    invoke-virtual {p0, p1}, Lo/getEnabledChangedCallbackactivity_release;->read(Z)V

    return-void
.end method

.method public setFilters([Landroid/text/InputFilter;)V
    .registers 3

    .line 173
    invoke-direct {p0}, Landroidx/appcompat/widget/AppCompatToggleButton;->RemoteActionCompatParcelizer()Lo/getEnabledChangedCallbackactivity_release;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/getEnabledChangedCallbackactivity_release;->AudioAttributesCompatParcelizer([Landroid/text/InputFilter;)[Landroid/text/InputFilter;

    move-result-object p1

    invoke-super {p0, p1}, Landroid/widget/ToggleButton;->setFilters([Landroid/text/InputFilter;)V

    return-void
.end method

.method public setSupportBackgroundTintList(Landroid/content/res/ColorStateList;)V
    .registers 2

    .line 113
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatToggleButton;->RemoteActionCompatParcelizer:Lo/addCancellable;

    if-eqz p0, :cond_7

    .line 114
    invoke-virtual {p0, p1}, Lo/addCancellable;->AudioAttributesCompatParcelizer(Landroid/content/res/ColorStateList;)V

    :cond_7
    return-void
.end method

.method public setSupportBackgroundTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .registers 2

    .line 141
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatToggleButton;->RemoteActionCompatParcelizer:Lo/addCancellable;

    if-eqz p0, :cond_7

    .line 142
    invoke-virtual {p0, p1}, Lo/addCancellable;->RemoteActionCompatParcelizer(Landroid/graphics/PorterDuff$Mode;)V

    :cond_7
    return-void
.end method

.method public setSupportCompoundDrawablesTintList(Landroid/content/res/ColorStateList;)V
    .registers 3

    .line 261
    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatToggleButton;->IconCompatParcelizer:Lo/setEnabled;

    invoke-virtual {v0, p1}, Lo/setEnabled;->RemoteActionCompatParcelizer(Landroid/content/res/ColorStateList;)V

    .line 262
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatToggleButton;->IconCompatParcelizer:Lo/setEnabled;

    invoke-virtual {p0}, Lo/setEnabled;->AudioAttributesCompatParcelizer()V

    return-void
.end method

.method public setSupportCompoundDrawablesTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .registers 3

    .line 301
    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatToggleButton;->IconCompatParcelizer:Lo/setEnabled;

    invoke-virtual {v0, p1}, Lo/setEnabled;->RemoteActionCompatParcelizer(Landroid/graphics/PorterDuff$Mode;)V

    .line 302
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatToggleButton;->IconCompatParcelizer:Lo/setEnabled;

    invoke-virtual {p0}, Lo/setEnabled;->AudioAttributesCompatParcelizer()V

    return-void
.end method
