###### Class androidx.appcompat.widget.AppCompatCheckedTextView (androidx.appcompat.widget.AppCompatCheckedTextView)
.class public Landroidx/appcompat/widget/AppCompatCheckedTextView;
.super Landroid/widget/CheckedTextView;
.source "SourceFile"


# instance fields
.field private AudioAttributesCompatParcelizer:Lo/getEnabledChangedCallbackactivity_release;

.field private final RemoteActionCompatParcelizer:Lo/addCancellable;

.field private final read:Lo/setEnabled;

.field private final write:Lo/reportFullyDrawn;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 3

    const/4 v0, 0x0

    .line 78
    invoke-direct {p0, p1, v0}, Landroidx/appcompat/widget/AppCompatCheckedTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 4

    .line 82
    sget v0, Lo/_init_lambda5$read;->checkedTextViewStyle:I

    invoke-direct {p0, p1, p2, v0}, Landroidx/appcompat/widget/AppCompatCheckedTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 4

    .line 87
    invoke-static {p1}, Lo/setCheckable;->read(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p1

    invoke-direct {p0, p1, p2, p3}, Landroid/widget/CheckedTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 89
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p0, p1}, Lo/setPositiveButton;->IconCompatParcelizer(Landroid/view/View;Landroid/content/Context;)V

    .line 91
    new-instance p1, Lo/setEnabled;

    invoke-direct {p1, p0}, Lo/setEnabled;-><init>(Landroid/widget/TextView;)V

    iput-object p1, p0, Landroidx/appcompat/widget/AppCompatCheckedTextView;->read:Lo/setEnabled;

    .line 92
    invoke-virtual {p1, p2, p3}, Lo/setEnabled;->read(Landroid/util/AttributeSet;I)V

    .line 93
    invoke-virtual {p1}, Lo/setEnabled;->AudioAttributesCompatParcelizer()V

    .line 95
    new-instance p1, Lo/addCancellable;

    invoke-direct {p1, p0}, Lo/addCancellable;-><init>(Landroid/view/View;)V

    iput-object p1, p0, Landroidx/appcompat/widget/AppCompatCheckedTextView;->RemoteActionCompatParcelizer:Lo/addCancellable;

    .line 96
    invoke-virtual {p1, p2, p3}, Lo/addCancellable;->IconCompatParcelizer(Landroid/util/AttributeSet;I)V

    .line 98
    new-instance p1, Lo/reportFullyDrawn;

    invoke-direct {p1, p0}, Lo/reportFullyDrawn;-><init>(Landroid/widget/CheckedTextView;)V

    iput-object p1, p0, Landroidx/appcompat/widget/AppCompatCheckedTextView;->write:Lo/reportFullyDrawn;

    .line 99
    invoke-virtual {p1, p2, p3}, Lo/reportFullyDrawn;->write(Landroid/util/AttributeSet;I)V

    .line 101
    invoke-direct {p0}, Landroidx/appcompat/widget/AppCompatCheckedTextView;->RemoteActionCompatParcelizer()Lo/getEnabledChangedCallbackactivity_release;

    move-result-object p0

    .line 102
    invoke-virtual {p0, p2, p3}, Lo/getEnabledChangedCallbackactivity_release;->AudioAttributesCompatParcelizer(Landroid/util/AttributeSet;I)V

    return-void
.end method

.method private RemoteActionCompatParcelizer()Lo/getEnabledChangedCallbackactivity_release;
    .registers 2

    .line 296
    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatCheckedTextView;->AudioAttributesCompatParcelizer:Lo/getEnabledChangedCallbackactivity_release;

    if-nez v0, :cond_b

    .line 297
    new-instance v0, Lo/getEnabledChangedCallbackactivity_release;

    invoke-direct {v0, p0}, Lo/getEnabledChangedCallbackactivity_release;-><init>(Landroid/widget/TextView;)V

    iput-object v0, p0, Landroidx/appcompat/widget/AppCompatCheckedTextView;->AudioAttributesCompatParcelizer:Lo/getEnabledChangedCallbackactivity_release;

    .line 299
    :cond_b
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatCheckedTextView;->AudioAttributesCompatParcelizer:Lo/getEnabledChangedCallbackactivity_release;

    return-object p0
.end method


# virtual methods
.method protected drawableStateChanged()V
    .registers 2

    .line 253
    invoke-super {p0}, Landroid/widget/CheckedTextView;->drawableStateChanged()V

    .line 254
    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatCheckedTextView;->read:Lo/setEnabled;

    if-eqz v0, :cond_a

    .line 255
    invoke-virtual {v0}, Lo/setEnabled;->AudioAttributesCompatParcelizer()V

    .line 257
    :cond_a
    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatCheckedTextView;->RemoteActionCompatParcelizer:Lo/addCancellable;

    if-eqz v0, :cond_11

    .line 258
    invoke-virtual {v0}, Lo/addCancellable;->read()V

    .line 260
    :cond_11
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatCheckedTextView;->write:Lo/reportFullyDrawn;

    if-eqz p0, :cond_18

    .line 261
    invoke-virtual {p0}, Lo/reportFullyDrawn;->RemoteActionCompatParcelizer()V

    :cond_18
    return-void
.end method

.method public getCustomSelectionActionModeCallback()Landroid/view/ActionMode$Callback;
    .registers 1

    .line 287
    invoke-super {p0}, Landroid/widget/CheckedTextView;->getCustomSelectionActionModeCallback()Landroid/view/ActionMode$Callback;

    move-result-object p0

    .line 286
    invoke-static {p0}, Lo/_addSuperTypes;->AudioAttributesCompatParcelizer(Landroid/view/ActionMode$Callback;)Landroid/view/ActionMode$Callback;

    move-result-object p0

    return-object p0
.end method

.method public onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;
    .registers 3

    .line 268
    invoke-super {p0, p1}, Landroid/widget/CheckedTextView;->onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;

    move-result-object v0

    invoke-static {v0, p1, p0}, Lo/handleOnBackProgressed;->IconCompatParcelizer(Landroid/view/inputmethod/InputConnection;Landroid/view/inputmethod/EditorInfo;Landroid/view/View;)Landroid/view/inputmethod/InputConnection;

    move-result-object p0

    return-object p0
.end method

.method public setAllCaps(Z)V
    .registers 2

    .line 304
    invoke-super {p0, p1}, Landroid/widget/CheckedTextView;->setAllCaps(Z)V

    .line 305
    invoke-direct {p0}, Landroidx/appcompat/widget/AppCompatCheckedTextView;->RemoteActionCompatParcelizer()Lo/getEnabledChangedCallbackactivity_release;

    move-result-object p0

    invoke-virtual {p0, p1}, Lo/getEnabledChangedCallbackactivity_release;->write(Z)V

    return-void
.end method

.method public setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
    .registers 2

    .line 229
    invoke-super {p0, p1}, Landroid/widget/CheckedTextView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 230
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatCheckedTextView;->RemoteActionCompatParcelizer:Lo/addCancellable;

    if-eqz p0, :cond_a

    .line 231
    invoke-virtual {p0, p1}, Lo/addCancellable;->AudioAttributesCompatParcelizer(Landroid/graphics/drawable/Drawable;)V

    :cond_a
    return-void
.end method

.method public setBackgroundResource(I)V
    .registers 2

    .line 237
    invoke-super {p0, p1}, Landroid/widget/CheckedTextView;->setBackgroundResource(I)V

    .line 238
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatCheckedTextView;->RemoteActionCompatParcelizer:Lo/addCancellable;

    if-eqz p0, :cond_a

    .line 239
    invoke-virtual {p0, p1}, Lo/addCancellable;->write(I)V

    :cond_a
    return-void
.end method

.method public setCheckMarkDrawable(I)V
    .registers 3

    .line 115
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Lo/getDefaultViewModelCreationExtras;->write(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/widget/CheckedTextView;->setCheckMarkDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setCheckMarkDrawable(Landroid/graphics/drawable/Drawable;)V
    .registers 2

    .line 107
    invoke-super {p0, p1}, Landroid/widget/CheckedTextView;->setCheckMarkDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 108
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatCheckedTextView;->write:Lo/reportFullyDrawn;

    if-eqz p0, :cond_a

    .line 109
    invoke-virtual {p0}, Lo/reportFullyDrawn;->write()V

    :cond_a
    return-void
.end method

.method public setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    .registers 5

    .line 322
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/CheckedTextView;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 323
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatCheckedTextView;->read:Lo/setEnabled;

    if-eqz p0, :cond_a

    .line 324
    invoke-virtual {p0}, Lo/setEnabled;->AudioAttributesImplApi26Parcelizer()V

    :cond_a
    return-void
.end method

.method public setCompoundDrawablesRelative(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    .registers 5

    .line 332
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/CheckedTextView;->setCompoundDrawablesRelative(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 333
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatCheckedTextView;->read:Lo/setEnabled;

    if-eqz p0, :cond_a

    .line 334
    invoke-virtual {p0}, Lo/setEnabled;->AudioAttributesImplApi26Parcelizer()V

    :cond_a
    return-void
.end method

.method public setCustomSelectionActionModeCallback(Landroid/view/ActionMode$Callback;)V
    .registers 2

    .line 280
    invoke-static {p0, p1}, Lo/_addSuperTypes;->write(Landroid/widget/TextView;Landroid/view/ActionMode$Callback;)Landroid/view/ActionMode$Callback;

    move-result-object p1

    .line 279
    invoke-super {p0, p1}, Landroid/widget/CheckedTextView;->setCustomSelectionActionModeCallback(Landroid/view/ActionMode$Callback;)V

    return-void
.end method

.method public setEmojiCompatEnabled(Z)V
    .registers 2

    .line 311
    invoke-direct {p0}, Landroidx/appcompat/widget/AppCompatCheckedTextView;->RemoteActionCompatParcelizer()Lo/getEnabledChangedCallbackactivity_release;

    move-result-object p0

    invoke-virtual {p0, p1}, Lo/getEnabledChangedCallbackactivity_release;->read(Z)V

    return-void
.end method

.method public setSupportBackgroundTintList(Landroid/content/res/ColorStateList;)V
    .registers 2

    .line 180
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatCheckedTextView;->RemoteActionCompatParcelizer:Lo/addCancellable;

    if-eqz p0, :cond_7

    .line 181
    invoke-virtual {p0, p1}, Lo/addCancellable;->AudioAttributesCompatParcelizer(Landroid/content/res/ColorStateList;)V

    :cond_7
    return-void
.end method

.method public setSupportBackgroundTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .registers 2

    .line 208
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatCheckedTextView;->RemoteActionCompatParcelizer:Lo/addCancellable;

    if-eqz p0, :cond_7

    .line 209
    invoke-virtual {p0, p1}, Lo/addCancellable;->RemoteActionCompatParcelizer(Landroid/graphics/PorterDuff$Mode;)V

    :cond_7
    return-void
.end method

.method public setSupportCheckMarkTintList(Landroid/content/res/ColorStateList;)V
    .registers 2

    .line 126
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatCheckedTextView;->write:Lo/reportFullyDrawn;

    if-eqz p0, :cond_7

    .line 127
    invoke-virtual {p0, p1}, Lo/reportFullyDrawn;->write(Landroid/content/res/ColorStateList;)V

    :cond_7
    return-void
.end method

.method public setSupportCheckMarkTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .registers 2

    .line 153
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatCheckedTextView;->write:Lo/reportFullyDrawn;

    if-eqz p0, :cond_7

    .line 154
    invoke-virtual {p0, p1}, Lo/reportFullyDrawn;->AudioAttributesCompatParcelizer(Landroid/graphics/PorterDuff$Mode;)V

    :cond_7
    return-void
.end method

.method public setSupportCompoundDrawablesTintList(Landroid/content/res/ColorStateList;)V
    .registers 3

    .line 375
    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatCheckedTextView;->read:Lo/setEnabled;

    invoke-virtual {v0, p1}, Lo/setEnabled;->RemoteActionCompatParcelizer(Landroid/content/res/ColorStateList;)V

    .line 376
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatCheckedTextView;->read:Lo/setEnabled;

    invoke-virtual {p0}, Lo/setEnabled;->AudioAttributesCompatParcelizer()V

    return-void
.end method

.method public setSupportCompoundDrawablesTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .registers 3

    .line 415
    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatCheckedTextView;->read:Lo/setEnabled;

    invoke-virtual {v0, p1}, Lo/setEnabled;->RemoteActionCompatParcelizer(Landroid/graphics/PorterDuff$Mode;)V

    .line 416
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatCheckedTextView;->read:Lo/setEnabled;

    invoke-virtual {p0}, Lo/setEnabled;->AudioAttributesCompatParcelizer()V

    return-void
.end method

.method public setTextAppearance(Landroid/content/Context;I)V
    .registers 3

    .line 245
    invoke-super {p0, p1, p2}, Landroid/widget/CheckedTextView;->setTextAppearance(Landroid/content/Context;I)V

    .line 246
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatCheckedTextView;->read:Lo/setEnabled;

    if-eqz p0, :cond_a

    .line 247
    invoke-virtual {p0, p1, p2}, Lo/setEnabled;->read(Landroid/content/Context;I)V

    :cond_a
    return-void
.end method
