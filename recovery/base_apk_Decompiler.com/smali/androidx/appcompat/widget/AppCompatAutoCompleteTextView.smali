###### Class androidx.appcompat.widget.AppCompatAutoCompleteTextView (androidx.appcompat.widget.AppCompatAutoCompleteTextView)
.class public Landroidx/appcompat/widget/AppCompatAutoCompleteTextView;
.super Landroid/widget/AutoCompleteTextView;
.source "SourceFile"


# static fields
.field private static final read:[I


# instance fields
.field private final AudioAttributesCompatParcelizer:Lo/setEnabled;

.field private final IconCompatParcelizer:Lo/setContentView;

.field private final write:Lo/addCancellable;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    const v0, 0x1010176

    .line 65
    filled-new-array {v0}, [I

    move-result-object v0

    sput-object v0, Landroidx/appcompat/widget/AppCompatAutoCompleteTextView;->read:[I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .registers 3

    const/4 v0, 0x0

    .line 75
    invoke-direct {p0, p1, v0}, Landroidx/appcompat/widget/AppCompatAutoCompleteTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 4

    .line 79
    sget v0, Lo/_init_lambda5$read;->autoCompleteTextViewStyle:I

    invoke-direct {p0, p1, p2, v0}, Landroidx/appcompat/widget/AppCompatAutoCompleteTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 6

    .line 84
    invoke-static {p1}, Lo/setCheckable;->read(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p1

    invoke-direct {p0, p1, p2, p3}, Landroid/widget/AutoCompleteTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 86
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p0, p1}, Lo/setPositiveButton;->IconCompatParcelizer(Landroid/view/View;Landroid/content/Context;)V

    .line 88
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    sget-object v0, Landroidx/appcompat/widget/AppCompatAutoCompleteTextView;->read:[I

    const/4 v1, 0x0

    invoke-static {p1, p2, v0, p3, v1}, Lo/setTitle;->read(Landroid/content/Context;Landroid/util/AttributeSet;[III)Lo/setTitle;

    move-result-object p1

    .line 90
    invoke-virtual {p1, v1}, Lo/setTitle;->AudioAttributesImplApi26Parcelizer(I)Z

    move-result v0

    if-eqz v0, :cond_26

    .line 91
    invoke-virtual {p1, v1}, Lo/setTitle;->IconCompatParcelizer(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/widget/AutoCompleteTextView;->setDropDownBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 93
    :cond_26
    invoke-virtual {p1}, Lo/setTitle;->write()V

    .line 95
    new-instance p1, Lo/addCancellable;

    invoke-direct {p1, p0}, Lo/addCancellable;-><init>(Landroid/view/View;)V

    iput-object p1, p0, Landroidx/appcompat/widget/AppCompatAutoCompleteTextView;->write:Lo/addCancellable;

    .line 96
    invoke-virtual {p1, p2, p3}, Lo/addCancellable;->IconCompatParcelizer(Landroid/util/AttributeSet;I)V

    .line 98
    new-instance p1, Lo/setEnabled;

    invoke-direct {p1, p0}, Lo/setEnabled;-><init>(Landroid/widget/TextView;)V

    iput-object p1, p0, Landroidx/appcompat/widget/AppCompatAutoCompleteTextView;->AudioAttributesCompatParcelizer:Lo/setEnabled;

    .line 99
    invoke-virtual {p1, p2, p3}, Lo/setEnabled;->read(Landroid/util/AttributeSet;I)V

    .line 100
    invoke-virtual {p1}, Lo/setEnabled;->AudioAttributesCompatParcelizer()V

    .line 102
    new-instance p1, Lo/setContentView;

    invoke-direct {p1, p0}, Lo/setContentView;-><init>(Landroid/widget/EditText;)V

    iput-object p1, p0, Landroidx/appcompat/widget/AppCompatAutoCompleteTextView;->IconCompatParcelizer:Lo/setContentView;

    .line 103
    invoke-virtual {p1, p2, p3}, Lo/setContentView;->write(Landroid/util/AttributeSet;I)V

    .line 104
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/AppCompatAutoCompleteTextView;->RemoteActionCompatParcelizer(Lo/setContentView;)V

    return-void
.end method


# virtual methods
.method RemoteActionCompatParcelizer(Lo/setContentView;)V
    .registers 7

    .line 128
    invoke-virtual {p0}, Landroid/widget/TextView;->getKeyListener()Landroid/text/method/KeyListener;

    move-result-object v0

    .line 129
    invoke-virtual {p1, v0}, Lo/setContentView;->write(Landroid/text/method/KeyListener;)Z

    move-result v1

    if-eqz v1, :cond_2f

    .line 130
    invoke-super {p0}, Landroid/widget/AutoCompleteTextView;->isFocusable()Z

    move-result v1

    .line 131
    invoke-super {p0}, Landroid/widget/AutoCompleteTextView;->isClickable()Z

    move-result v2

    .line 132
    invoke-super {p0}, Landroid/widget/AutoCompleteTextView;->isLongClickable()Z

    move-result v3

    .line 133
    invoke-super {p0}, Landroid/widget/AutoCompleteTextView;->getInputType()I

    move-result v4

    .line 134
    invoke-virtual {p1, v0}, Lo/setContentView;->RemoteActionCompatParcelizer(Landroid/text/method/KeyListener;)Landroid/text/method/KeyListener;

    move-result-object p1

    if-eq p1, v0, :cond_2f

    .line 138
    invoke-super {p0, p1}, Landroid/widget/AutoCompleteTextView;->setKeyListener(Landroid/text/method/KeyListener;)V

    .line 140
    invoke-super {p0, v4}, Landroid/widget/AutoCompleteTextView;->setRawInputType(I)V

    .line 141
    invoke-super {p0, v1}, Landroid/widget/AutoCompleteTextView;->setFocusable(Z)V

    .line 142
    invoke-super {p0, v2}, Landroid/widget/AutoCompleteTextView;->setClickable(Z)V

    .line 143
    invoke-super {p0, v3}, Landroid/widget/AutoCompleteTextView;->setLongClickable(Z)V

    :cond_2f
    return-void
.end method

.method protected drawableStateChanged()V
    .registers 2

    .line 226
    invoke-super {p0}, Landroid/widget/AutoCompleteTextView;->drawableStateChanged()V

    .line 227
    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatAutoCompleteTextView;->write:Lo/addCancellable;

    if-eqz v0, :cond_a

    .line 228
    invoke-virtual {v0}, Lo/addCancellable;->read()V

    .line 230
    :cond_a
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatAutoCompleteTextView;->AudioAttributesCompatParcelizer:Lo/setEnabled;

    if-eqz p0, :cond_11

    .line 231
    invoke-virtual {p0}, Lo/setEnabled;->AudioAttributesCompatParcelizer()V

    :cond_11
    return-void
.end method

.method public getCustomSelectionActionModeCallback()Landroid/view/ActionMode$Callback;
    .registers 1

    .line 265
    invoke-super {p0}, Landroid/widget/AutoCompleteTextView;->getCustomSelectionActionModeCallback()Landroid/view/ActionMode$Callback;

    move-result-object p0

    .line 264
    invoke-static {p0}, Lo/_addSuperTypes;->AudioAttributesCompatParcelizer(Landroid/view/ActionMode$Callback;)Landroid/view/ActionMode$Callback;

    move-result-object p0

    return-object p0
.end method

.method public onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;
    .registers 3

    .line 246
    invoke-super {p0, p1}, Landroid/widget/AutoCompleteTextView;->onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;

    move-result-object v0

    .line 245
    invoke-static {v0, p1, p0}, Lo/handleOnBackProgressed;->IconCompatParcelizer(Landroid/view/inputmethod/InputConnection;Landroid/view/inputmethod/EditorInfo;Landroid/view/View;)Landroid/view/inputmethod/InputConnection;

    move-result-object v0

    .line 247
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatAutoCompleteTextView;->IconCompatParcelizer:Lo/setContentView;

    invoke-virtual {p0, v0, p1}, Lo/setContentView;->read(Landroid/view/inputmethod/InputConnection;Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;

    move-result-object p0

    return-object p0
.end method

.method public setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
    .registers 2

    .line 162
    invoke-super {p0, p1}, Landroid/widget/AutoCompleteTextView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 163
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatAutoCompleteTextView;->write:Lo/addCancellable;

    if-eqz p0, :cond_a

    .line 164
    invoke-virtual {p0, p1}, Lo/addCancellable;->AudioAttributesCompatParcelizer(Landroid/graphics/drawable/Drawable;)V

    :cond_a
    return-void
.end method

.method public setBackgroundResource(I)V
    .registers 2

    .line 154
    invoke-super {p0, p1}, Landroid/widget/AutoCompleteTextView;->setBackgroundResource(I)V

    .line 155
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatAutoCompleteTextView;->write:Lo/addCancellable;

    if-eqz p0, :cond_a

    .line 156
    invoke-virtual {p0, p1}, Lo/addCancellable;->write(I)V

    :cond_a
    return-void
.end method

.method public setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    .registers 5

    .line 292
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/AutoCompleteTextView;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 293
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatAutoCompleteTextView;->AudioAttributesCompatParcelizer:Lo/setEnabled;

    if-eqz p0, :cond_a

    .line 294
    invoke-virtual {p0}, Lo/setEnabled;->AudioAttributesImplApi26Parcelizer()V

    :cond_a
    return-void
.end method

.method public setCompoundDrawablesRelative(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    .registers 5

    .line 302
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/AutoCompleteTextView;->setCompoundDrawablesRelative(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 303
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatAutoCompleteTextView;->AudioAttributesCompatParcelizer:Lo/setEnabled;

    if-eqz p0, :cond_a

    .line 304
    invoke-virtual {p0}, Lo/setEnabled;->AudioAttributesImplApi26Parcelizer()V

    :cond_a
    return-void
.end method

.method public setCustomSelectionActionModeCallback(Landroid/view/ActionMode$Callback;)V
    .registers 2

    .line 258
    invoke-static {p0, p1}, Lo/_addSuperTypes;->write(Landroid/widget/TextView;Landroid/view/ActionMode$Callback;)Landroid/view/ActionMode$Callback;

    move-result-object p1

    .line 257
    invoke-super {p0, p1}, Landroid/widget/AutoCompleteTextView;->setCustomSelectionActionModeCallback(Landroid/view/ActionMode$Callback;)V

    return-void
.end method

.method public setDropDownBackgroundResource(I)V
    .registers 3

    .line 149
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Lo/getDefaultViewModelCreationExtras;->write(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/widget/AutoCompleteTextView;->setDropDownBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setEmojiCompatEnabled(Z)V
    .registers 2

    .line 281
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatAutoCompleteTextView;->IconCompatParcelizer:Lo/setContentView;

    invoke-virtual {p0, p1}, Lo/setContentView;->AudioAttributesCompatParcelizer(Z)V

    return-void
.end method

.method public setKeyListener(Landroid/text/method/KeyListener;)V
    .registers 3

    .line 276
    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatAutoCompleteTextView;->IconCompatParcelizer:Lo/setContentView;

    invoke-virtual {v0, p1}, Lo/setContentView;->RemoteActionCompatParcelizer(Landroid/text/method/KeyListener;)Landroid/text/method/KeyListener;

    move-result-object p1

    invoke-super {p0, p1}, Landroid/widget/AutoCompleteTextView;->setKeyListener(Landroid/text/method/KeyListener;)V

    return-void
.end method

.method public setSupportBackgroundTintList(Landroid/content/res/ColorStateList;)V
    .registers 2

    .line 177
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatAutoCompleteTextView;->write:Lo/addCancellable;

    if-eqz p0, :cond_7

    .line 178
    invoke-virtual {p0, p1}, Lo/addCancellable;->AudioAttributesCompatParcelizer(Landroid/content/res/ColorStateList;)V

    :cond_7
    return-void
.end method

.method public setSupportBackgroundTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .registers 2

    .line 205
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatAutoCompleteTextView;->write:Lo/addCancellable;

    if-eqz p0, :cond_7

    .line 206
    invoke-virtual {p0, p1}, Lo/addCancellable;->RemoteActionCompatParcelizer(Landroid/graphics/PorterDuff$Mode;)V

    :cond_7
    return-void
.end method

.method public setSupportCompoundDrawablesTintList(Landroid/content/res/ColorStateList;)V
    .registers 3

    .line 345
    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatAutoCompleteTextView;->AudioAttributesCompatParcelizer:Lo/setEnabled;

    invoke-virtual {v0, p1}, Lo/setEnabled;->RemoteActionCompatParcelizer(Landroid/content/res/ColorStateList;)V

    .line 346
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatAutoCompleteTextView;->AudioAttributesCompatParcelizer:Lo/setEnabled;

    invoke-virtual {p0}, Lo/setEnabled;->AudioAttributesCompatParcelizer()V

    return-void
.end method

.method public setSupportCompoundDrawablesTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .registers 3

    .line 385
    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatAutoCompleteTextView;->AudioAttributesCompatParcelizer:Lo/setEnabled;

    invoke-virtual {v0, p1}, Lo/setEnabled;->RemoteActionCompatParcelizer(Landroid/graphics/PorterDuff$Mode;)V

    .line 386
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatAutoCompleteTextView;->AudioAttributesCompatParcelizer:Lo/setEnabled;

    invoke-virtual {p0}, Lo/setEnabled;->AudioAttributesCompatParcelizer()V

    return-void
.end method

.method public setTextAppearance(Landroid/content/Context;I)V
    .registers 3

    .line 237
    invoke-super {p0, p1, p2}, Landroid/widget/AutoCompleteTextView;->setTextAppearance(Landroid/content/Context;I)V

    .line 238
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatAutoCompleteTextView;->AudioAttributesCompatParcelizer:Lo/setEnabled;

    if-eqz p0, :cond_a

    .line 239
    invoke-virtual {p0, p1, p2}, Lo/setEnabled;->read(Landroid/content/Context;I)V

    :cond_a
    return-void
.end method
