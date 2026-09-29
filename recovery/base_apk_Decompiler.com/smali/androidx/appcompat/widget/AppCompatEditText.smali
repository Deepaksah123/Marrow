###### Class androidx.appcompat.widget.AppCompatEditText (androidx.appcompat.widget.AppCompatEditText)
.class public Landroidx/appcompat/widget/AppCompatEditText;
.super Landroid/widget/EditText;
.source "SourceFile"

# interfaces
.implements Lo/finishRootArray;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/appcompat/widget/AppCompatEditText$read;
    }
.end annotation


# instance fields
.field private AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/AppCompatEditText$read;

.field private final AudioAttributesImplApi21Parcelizer:Lo/setEnabled;

.field private final IconCompatParcelizer:Lo/_addClassMixIns;

.field private final RemoteActionCompatParcelizer:Lo/isEnabled;

.field private final read:Lo/addCancellable;

.field private final write:Lo/setContentView;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 3

    const/4 v0, 0x0

    .line 91
    invoke-direct {p0, p1, v0}, Landroidx/appcompat/widget/AppCompatEditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 4

    .line 95
    sget v0, Lo/_init_lambda5$read;->editTextStyle:I

    invoke-direct {p0, p1, p2, v0}, Landroidx/appcompat/widget/AppCompatEditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 4

    .line 100
    invoke-static {p1}, Lo/setCheckable;->read(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p1

    invoke-direct {p0, p1, p2, p3}, Landroid/widget/EditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 102
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p0, p1}, Lo/setPositiveButton;->IconCompatParcelizer(Landroid/view/View;Landroid/content/Context;)V

    .line 104
    new-instance p1, Lo/addCancellable;

    invoke-direct {p1, p0}, Lo/addCancellable;-><init>(Landroid/view/View;)V

    iput-object p1, p0, Landroidx/appcompat/widget/AppCompatEditText;->read:Lo/addCancellable;

    .line 105
    invoke-virtual {p1, p2, p3}, Lo/addCancellable;->IconCompatParcelizer(Landroid/util/AttributeSet;I)V

    .line 107
    new-instance p1, Lo/setEnabled;

    invoke-direct {p1, p0}, Lo/setEnabled;-><init>(Landroid/widget/TextView;)V

    iput-object p1, p0, Landroidx/appcompat/widget/AppCompatEditText;->AudioAttributesImplApi21Parcelizer:Lo/setEnabled;

    .line 108
    invoke-virtual {p1, p2, p3}, Lo/setEnabled;->read(Landroid/util/AttributeSet;I)V

    .line 109
    invoke-virtual {p1}, Lo/setEnabled;->AudioAttributesCompatParcelizer()V

    .line 111
    new-instance p1, Lo/isEnabled;

    invoke-direct {p1, p0}, Lo/isEnabled;-><init>(Landroid/widget/TextView;)V

    iput-object p1, p0, Landroidx/appcompat/widget/AppCompatEditText;->RemoteActionCompatParcelizer:Lo/isEnabled;

    .line 113
    new-instance p1, Lo/_addClassMixIns;

    invoke-direct {p1}, Lo/_addClassMixIns;-><init>()V

    iput-object p1, p0, Landroidx/appcompat/widget/AppCompatEditText;->IconCompatParcelizer:Lo/_addClassMixIns;

    .line 114
    new-instance p1, Lo/setContentView;

    invoke-direct {p1, p0}, Lo/setContentView;-><init>(Landroid/widget/EditText;)V

    iput-object p1, p0, Landroidx/appcompat/widget/AppCompatEditText;->write:Lo/setContentView;

    .line 115
    invoke-virtual {p1, p2, p3}, Lo/setContentView;->write(Landroid/util/AttributeSet;I)V

    .line 116
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/AppCompatEditText;->RemoteActionCompatParcelizer(Lo/setContentView;)V

    return-void
.end method

.method private AudioAttributesCompatParcelizer()Landroidx/appcompat/widget/AppCompatEditText$read;
    .registers 2

    .line 312
    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatEditText;->AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/AppCompatEditText$read;

    if-nez v0, :cond_b

    .line 313
    new-instance v0, Landroidx/appcompat/widget/AppCompatEditText$read;

    invoke-direct {v0, p0}, Landroidx/appcompat/widget/AppCompatEditText$read;-><init>(Landroidx/appcompat/widget/AppCompatEditText;)V

    iput-object v0, p0, Landroidx/appcompat/widget/AppCompatEditText;->AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/AppCompatEditText$read;

    .line 315
    :cond_b
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatEditText;->AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/AppCompatEditText$read;

    return-object p0
.end method

.method static synthetic IconCompatParcelizer(Landroidx/appcompat/widget/AppCompatEditText;Landroid/view/textclassifier/TextClassifier;)V
    .registers 2

    .line 78
    invoke-super {p0, p1}, Landroid/widget/EditText;->setTextClassifier(Landroid/view/textclassifier/TextClassifier;)V

    return-void
.end method

.method static synthetic RemoteActionCompatParcelizer(Landroidx/appcompat/widget/AppCompatEditText;)Landroid/view/textclassifier/TextClassifier;
    .registers 1

    .line 78
    invoke-super {p0}, Landroid/widget/EditText;->getTextClassifier()Landroid/view/textclassifier/TextClassifier;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public RemoteActionCompatParcelizer(Lo/StringDeserializer;)Lo/StringDeserializer;
    .registers 3

    .line 389
    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatEditText;->IconCompatParcelizer:Lo/_addClassMixIns;

    invoke-virtual {v0, p0, p1}, Lo/_addClassMixIns;->read(Landroid/view/View;Lo/StringDeserializer;)Lo/StringDeserializer;

    move-result-object p0

    return-object p0
.end method

.method RemoteActionCompatParcelizer(Lo/setContentView;)V
    .registers 7

    .line 140
    invoke-virtual {p0}, Landroid/widget/TextView;->getKeyListener()Landroid/text/method/KeyListener;

    move-result-object v0

    .line 141
    invoke-virtual {p1, v0}, Lo/setContentView;->write(Landroid/text/method/KeyListener;)Z

    move-result v1

    if-eqz v1, :cond_2f

    .line 142
    invoke-super {p0}, Landroid/widget/EditText;->isFocusable()Z

    move-result v1

    .line 143
    invoke-super {p0}, Landroid/widget/EditText;->isClickable()Z

    move-result v2

    .line 144
    invoke-super {p0}, Landroid/widget/EditText;->isLongClickable()Z

    move-result v3

    .line 145
    invoke-super {p0}, Landroid/widget/EditText;->getInputType()I

    move-result v4

    .line 146
    invoke-virtual {p1, v0}, Lo/setContentView;->RemoteActionCompatParcelizer(Landroid/text/method/KeyListener;)Landroid/text/method/KeyListener;

    move-result-object p1

    if-eq p1, v0, :cond_2f

    .line 150
    invoke-super {p0, p1}, Landroid/widget/EditText;->setKeyListener(Landroid/text/method/KeyListener;)V

    .line 152
    invoke-super {p0, v4}, Landroid/widget/EditText;->setRawInputType(I)V

    .line 153
    invoke-super {p0, v1}, Landroid/widget/EditText;->setFocusable(Z)V

    .line 154
    invoke-super {p0, v2}, Landroid/widget/EditText;->setClickable(Z)V

    .line 155
    invoke-super {p0, v3}, Landroid/widget/EditText;->setLongClickable(Z)V

    :cond_2f
    return-void
.end method

.method protected drawableStateChanged()V
    .registers 2

    .line 247
    invoke-super {p0}, Landroid/widget/EditText;->drawableStateChanged()V

    .line 248
    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatEditText;->read:Lo/addCancellable;

    if-eqz v0, :cond_a

    .line 249
    invoke-virtual {v0}, Lo/addCancellable;->read()V

    .line 251
    :cond_a
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatEditText;->AudioAttributesImplApi21Parcelizer:Lo/setEnabled;

    if-eqz p0, :cond_11

    .line 252
    invoke-virtual {p0}, Lo/setEnabled;->AudioAttributesCompatParcelizer()V

    :cond_11
    return-void
.end method

.method public getCustomSelectionActionModeCallback()Landroid/view/ActionMode$Callback;
    .registers 1

    .line 305
    invoke-super {p0}, Landroid/widget/EditText;->getCustomSelectionActionModeCallback()Landroid/view/ActionMode$Callback;

    move-result-object p0

    .line 304
    invoke-static {p0}, Lo/_addSuperTypes;->AudioAttributesCompatParcelizer(Landroid/view/ActionMode$Callback;)Landroid/view/ActionMode$Callback;

    move-result-object p0

    return-object p0
.end method

.method public getText()Landroid/text/Editable;
    .registers 1

    .line 166
    invoke-super {p0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic getText()Ljava/lang/CharSequence;
    .registers 1

    .line 77
    invoke-virtual {p0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p0

    return-object p0
.end method

.method public getTextClassifier()Landroid/view/textclassifier/TextClassifier;
    .registers 1

    .line 343
    invoke-direct {p0}, Landroidx/appcompat/widget/AppCompatEditText;->AudioAttributesCompatParcelizer()Landroidx/appcompat/widget/AppCompatEditText$read;

    move-result-object p0

    invoke-virtual {p0}, Landroidx/appcompat/widget/AppCompatEditText$read;->RemoteActionCompatParcelizer()Landroid/view/textclassifier/TextClassifier;

    move-result-object p0

    return-object p0
.end method

.method public onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;
    .registers 5

    .line 273
    invoke-super {p0, p1}, Landroid/widget/EditText;->onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;

    move-result-object v0

    .line 274
    iget-object v1, p0, Landroidx/appcompat/widget/AppCompatEditText;->AudioAttributesImplApi21Parcelizer:Lo/setEnabled;

    invoke-virtual {v1, p0, v0, p1}, Lo/setEnabled;->write(Landroid/widget/TextView;Landroid/view/inputmethod/InputConnection;Landroid/view/inputmethod/EditorInfo;)V

    .line 275
    invoke-static {v0, p1, p0}, Lo/handleOnBackProgressed;->IconCompatParcelizer(Landroid/view/inputmethod/InputConnection;Landroid/view/inputmethod/EditorInfo;Landroid/view/View;)Landroid/view/inputmethod/InputConnection;

    move-result-object v0

    if-eqz v0, :cond_22

    .line 280
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1e

    if-gt v1, v2, :cond_22

    .line 281
    invoke-static {p0}, Lo/InvalidTypeIdException;->MediaDescriptionCompat(Landroid/view/View;)[Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_22

    .line 283
    invoke-static {p1, v1}, Lo/forRecord;->write(Landroid/view/inputmethod/EditorInfo;[Ljava/lang/String;)V

    .line 284
    invoke-static {p0, v0, p1}, Lo/Annotated;->IconCompatParcelizer(Landroid/view/View;Landroid/view/inputmethod/InputConnection;Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;

    move-result-object v0

    .line 287
    :cond_22
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatEditText;->write:Lo/setContentView;

    invoke-virtual {p0, v0, p1}, Lo/setContentView;->read(Landroid/view/inputmethod/InputConnection;Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;

    move-result-object p0

    return-object p0
.end method

.method public onDragEvent(Landroid/view/DragEvent;)Z
    .registers 3

    .line 350
    invoke-static {p0, p1}, Lo/handleOnBackPressed;->write(Landroid/view/View;Landroid/view/DragEvent;)Z

    move-result v0

    if-eqz v0, :cond_8

    const/4 p0, 0x1

    return p0

    .line 353
    :cond_8
    invoke-super {p0, p1}, Landroid/widget/EditText;->onDragEvent(Landroid/view/DragEvent;)Z

    move-result p0

    return p0
.end method

.method public onTextContextMenuItem(I)Z
    .registers 3

    .line 364
    invoke-static {p0, p1}, Lo/handleOnBackPressed;->RemoteActionCompatParcelizer(Landroid/widget/TextView;I)Z

    move-result v0

    if-eqz v0, :cond_8

    const/4 p0, 0x1

    return p0

    .line 367
    :cond_8
    invoke-super {p0, p1}, Landroid/widget/EditText;->onTextContextMenuItem(I)Z

    move-result p0

    return p0
.end method

.method public setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
    .registers 2

    .line 183
    invoke-super {p0, p1}, Landroid/widget/EditText;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 184
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatEditText;->read:Lo/addCancellable;

    if-eqz p0, :cond_a

    .line 185
    invoke-virtual {p0, p1}, Lo/addCancellable;->AudioAttributesCompatParcelizer(Landroid/graphics/drawable/Drawable;)V

    :cond_a
    return-void
.end method

.method public setBackgroundResource(I)V
    .registers 2

    .line 175
    invoke-super {p0, p1}, Landroid/widget/EditText;->setBackgroundResource(I)V

    .line 176
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatEditText;->read:Lo/addCancellable;

    if-eqz p0, :cond_a

    .line 177
    invoke-virtual {p0, p1}, Lo/addCancellable;->write(I)V

    :cond_a
    return-void
.end method

.method public setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    .registers 5

    .line 416
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/EditText;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 417
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatEditText;->AudioAttributesImplApi21Parcelizer:Lo/setEnabled;

    if-eqz p0, :cond_a

    .line 418
    invoke-virtual {p0}, Lo/setEnabled;->AudioAttributesImplApi26Parcelizer()V

    :cond_a
    return-void
.end method

.method public setCompoundDrawablesRelative(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    .registers 5

    .line 426
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/EditText;->setCompoundDrawablesRelative(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 427
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatEditText;->AudioAttributesImplApi21Parcelizer:Lo/setEnabled;

    if-eqz p0, :cond_a

    .line 428
    invoke-virtual {p0}, Lo/setEnabled;->AudioAttributesImplApi26Parcelizer()V

    :cond_a
    return-void
.end method

.method public setCustomSelectionActionModeCallback(Landroid/view/ActionMode$Callback;)V
    .registers 2

    .line 298
    invoke-static {p0, p1}, Lo/_addSuperTypes;->write(Landroid/widget/TextView;Landroid/view/ActionMode$Callback;)Landroid/view/ActionMode$Callback;

    move-result-object p1

    .line 297
    invoke-super {p0, p1}, Landroid/widget/EditText;->setCustomSelectionActionModeCallback(Landroid/view/ActionMode$Callback;)V

    return-void
.end method

.method public setEmojiCompatEnabled(Z)V
    .registers 2

    .line 405
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatEditText;->write:Lo/setContentView;

    invoke-virtual {p0, p1}, Lo/setContentView;->AudioAttributesCompatParcelizer(Z)V

    return-void
.end method

.method public setKeyListener(Landroid/text/method/KeyListener;)V
    .registers 3

    .line 400
    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatEditText;->write:Lo/setContentView;

    invoke-virtual {v0, p1}, Lo/setContentView;->RemoteActionCompatParcelizer(Landroid/text/method/KeyListener;)Landroid/text/method/KeyListener;

    move-result-object p1

    invoke-super {p0, p1}, Landroid/widget/EditText;->setKeyListener(Landroid/text/method/KeyListener;)V

    return-void
.end method

.method public setSupportBackgroundTintList(Landroid/content/res/ColorStateList;)V
    .registers 2

    .line 198
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatEditText;->read:Lo/addCancellable;

    if-eqz p0, :cond_7

    .line 199
    invoke-virtual {p0, p1}, Lo/addCancellable;->AudioAttributesCompatParcelizer(Landroid/content/res/ColorStateList;)V

    :cond_7
    return-void
.end method

.method public setSupportBackgroundTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .registers 2

    .line 226
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatEditText;->read:Lo/addCancellable;

    if-eqz p0, :cond_7

    .line 227
    invoke-virtual {p0, p1}, Lo/addCancellable;->RemoteActionCompatParcelizer(Landroid/graphics/PorterDuff$Mode;)V

    :cond_7
    return-void
.end method

.method public setSupportCompoundDrawablesTintList(Landroid/content/res/ColorStateList;)V
    .registers 3

    .line 469
    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatEditText;->AudioAttributesImplApi21Parcelizer:Lo/setEnabled;

    invoke-virtual {v0, p1}, Lo/setEnabled;->RemoteActionCompatParcelizer(Landroid/content/res/ColorStateList;)V

    .line 470
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatEditText;->AudioAttributesImplApi21Parcelizer:Lo/setEnabled;

    invoke-virtual {p0}, Lo/setEnabled;->AudioAttributesCompatParcelizer()V

    return-void
.end method

.method public setSupportCompoundDrawablesTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .registers 3

    .line 509
    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatEditText;->AudioAttributesImplApi21Parcelizer:Lo/setEnabled;

    invoke-virtual {v0, p1}, Lo/setEnabled;->RemoteActionCompatParcelizer(Landroid/graphics/PorterDuff$Mode;)V

    .line 510
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatEditText;->AudioAttributesImplApi21Parcelizer:Lo/setEnabled;

    invoke-virtual {p0}, Lo/setEnabled;->AudioAttributesCompatParcelizer()V

    return-void
.end method

.method public setTextAppearance(Landroid/content/Context;I)V
    .registers 3

    .line 258
    invoke-super {p0, p1, p2}, Landroid/widget/EditText;->setTextAppearance(Landroid/content/Context;I)V

    .line 259
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatEditText;->AudioAttributesImplApi21Parcelizer:Lo/setEnabled;

    if-eqz p0, :cond_a

    .line 260
    invoke-virtual {p0, p1, p2}, Lo/setEnabled;->read(Landroid/content/Context;I)V

    :cond_a
    return-void
.end method

.method public setTextClassifier(Landroid/view/textclassifier/TextClassifier;)V
    .registers 2

    .line 325
    invoke-direct {p0}, Landroidx/appcompat/widget/AppCompatEditText;->AudioAttributesCompatParcelizer()Landroidx/appcompat/widget/AppCompatEditText$read;

    move-result-object p0

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/AppCompatEditText$read;->RemoteActionCompatParcelizer(Landroid/view/textclassifier/TextClassifier;)V

    return-void
.end method

###### Class androidx.appcompat.widget.AppCompatEditText.read (androidx.appcompat.widget.AppCompatEditText$read)
.class Landroidx/appcompat/widget/AppCompatEditText$read;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/widget/AppCompatEditText;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "read"
.end annotation


# instance fields
.field final synthetic IconCompatParcelizer:Landroidx/appcompat/widget/AppCompatEditText;


# direct methods
.method constructor <init>(Landroidx/appcompat/widget/AppCompatEditText;)V
    .registers 2

    .line 514
    iput-object p1, p0, Landroidx/appcompat/widget/AppCompatEditText$read;->IconCompatParcelizer:Landroidx/appcompat/widget/AppCompatEditText;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public RemoteActionCompatParcelizer()Landroid/view/textclassifier/TextClassifier;
    .registers 1

    .line 518
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatEditText$read;->IconCompatParcelizer:Landroidx/appcompat/widget/AppCompatEditText;

    invoke-static {p0}, Landroidx/appcompat/widget/AppCompatEditText;->RemoteActionCompatParcelizer(Landroidx/appcompat/widget/AppCompatEditText;)Landroid/view/textclassifier/TextClassifier;

    move-result-object p0

    return-object p0
.end method

.method public RemoteActionCompatParcelizer(Landroid/view/textclassifier/TextClassifier;)V
    .registers 2

    .line 522
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatEditText$read;->IconCompatParcelizer:Landroidx/appcompat/widget/AppCompatEditText;

    invoke-static {p0, p1}, Landroidx/appcompat/widget/AppCompatEditText;->IconCompatParcelizer(Landroidx/appcompat/widget/AppCompatEditText;Landroid/view/textclassifier/TextClassifier;)V

    return-void
.end method
