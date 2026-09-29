###### Class androidx.appcompat.widget.AppCompatButton (androidx.appcompat.widget.AppCompatButton)
.class public Landroidx/appcompat/widget/AppCompatButton;
.super Landroid/widget/Button;
.source "SourceFile"


# instance fields
.field private final AudioAttributesCompatParcelizer:Lo/addCancellable;

.field private final RemoteActionCompatParcelizer:Lo/setEnabled;

.field private write:Lo/getEnabledChangedCallbackactivity_release;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 3

    const/4 v0, 0x0

    .line 72
    invoke-direct {p0, p1, v0}, Landroidx/appcompat/widget/AppCompatButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 4

    .line 76
    sget v0, Lo/_init_lambda5$read;->buttonStyle:I

    invoke-direct {p0, p1, p2, v0}, Landroidx/appcompat/widget/AppCompatButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 4

    .line 81
    invoke-static {p1}, Lo/setCheckable;->read(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p1

    invoke-direct {p0, p1, p2, p3}, Landroid/widget/Button;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 83
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p0, p1}, Lo/setPositiveButton;->IconCompatParcelizer(Landroid/view/View;Landroid/content/Context;)V

    .line 85
    new-instance p1, Lo/addCancellable;

    invoke-direct {p1, p0}, Lo/addCancellable;-><init>(Landroid/view/View;)V

    iput-object p1, p0, Landroidx/appcompat/widget/AppCompatButton;->AudioAttributesCompatParcelizer:Lo/addCancellable;

    .line 86
    invoke-virtual {p1, p2, p3}, Lo/addCancellable;->IconCompatParcelizer(Landroid/util/AttributeSet;I)V

    .line 88
    new-instance p1, Lo/setEnabled;

    invoke-direct {p1, p0}, Lo/setEnabled;-><init>(Landroid/widget/TextView;)V

    iput-object p1, p0, Landroidx/appcompat/widget/AppCompatButton;->RemoteActionCompatParcelizer:Lo/setEnabled;

    .line 89
    invoke-virtual {p1, p2, p3}, Lo/setEnabled;->read(Landroid/util/AttributeSet;I)V

    .line 90
    invoke-virtual {p1}, Lo/setEnabled;->AudioAttributesCompatParcelizer()V

    .line 92
    invoke-direct {p0}, Landroidx/appcompat/widget/AppCompatButton;->RemoteActionCompatParcelizer()Lo/getEnabledChangedCallbackactivity_release;

    move-result-object p0

    .line 93
    invoke-virtual {p0, p2, p3}, Lo/getEnabledChangedCallbackactivity_release;->AudioAttributesCompatParcelizer(Landroid/util/AttributeSet;I)V

    return-void
.end method

.method private RemoteActionCompatParcelizer()Lo/getEnabledChangedCallbackactivity_release;
    .registers 2

    .line 456
    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatButton;->write:Lo/getEnabledChangedCallbackactivity_release;

    if-nez v0, :cond_b

    .line 457
    new-instance v0, Lo/getEnabledChangedCallbackactivity_release;

    invoke-direct {v0, p0}, Lo/getEnabledChangedCallbackactivity_release;-><init>(Landroid/widget/TextView;)V

    iput-object v0, p0, Landroidx/appcompat/widget/AppCompatButton;->write:Lo/getEnabledChangedCallbackactivity_release;

    .line 459
    :cond_b
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatButton;->write:Lo/getEnabledChangedCallbackactivity_release;

    return-object p0
.end method


# virtual methods
.method public AudioAttributesCompatParcelizer()Landroid/graphics/PorterDuff$Mode;
    .registers 1

    .line 164
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatButton;->AudioAttributesCompatParcelizer:Lo/addCancellable;

    if-eqz p0, :cond_9

    .line 165
    invoke-virtual {p0}, Lo/addCancellable;->write()Landroid/graphics/PorterDuff$Mode;

    move-result-object p0

    return-object p0

    :cond_9
    const/4 p0, 0x0

    return-object p0
.end method

.method public Z_()Landroid/content/res/ColorStateList;
    .registers 1

    .line 136
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatButton;->AudioAttributesCompatParcelizer:Lo/addCancellable;

    if-eqz p0, :cond_9

    .line 137
    invoke-virtual {p0}, Lo/addCancellable;->RemoteActionCompatParcelizer()Landroid/content/res/ColorStateList;

    move-result-object p0

    return-object p0

    :cond_9
    const/4 p0, 0x0

    return-object p0
.end method

.method protected drawableStateChanged()V
    .registers 2

    .line 170
    invoke-super {p0}, Landroid/widget/Button;->drawableStateChanged()V

    .line 171
    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatButton;->AudioAttributesCompatParcelizer:Lo/addCancellable;

    if-eqz v0, :cond_a

    .line 172
    invoke-virtual {v0}, Lo/addCancellable;->read()V

    .line 174
    :cond_a
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatButton;->RemoteActionCompatParcelizer:Lo/setEnabled;

    if-eqz p0, :cond_11

    .line 175
    invoke-virtual {p0}, Lo/setEnabled;->AudioAttributesCompatParcelizer()V

    :cond_11
    return-void
.end method

.method public getAutoSizeMaxTextSize()I
    .registers 2

    .line 340
    sget-boolean v0, Lo/setChecked;->RemoteActionCompatParcelizer:Z

    if-eqz v0, :cond_9

    .line 341
    invoke-super {p0}, Landroid/widget/Button;->getAutoSizeMaxTextSize()I

    move-result p0

    return p0

    .line 343
    :cond_9
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatButton;->RemoteActionCompatParcelizer:Lo/setEnabled;

    if-eqz p0, :cond_12

    .line 344
    invoke-virtual {p0}, Lo/setEnabled;->write()I

    move-result p0

    return p0

    :cond_12
    const/4 p0, -0x1

    return p0
.end method

.method public getAutoSizeMinTextSize()I
    .registers 2

    .line 324
    sget-boolean v0, Lo/setChecked;->RemoteActionCompatParcelizer:Z

    if-eqz v0, :cond_9

    .line 325
    invoke-super {p0}, Landroid/widget/Button;->getAutoSizeMinTextSize()I

    move-result p0

    return p0

    .line 327
    :cond_9
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatButton;->RemoteActionCompatParcelizer:Lo/setEnabled;

    if-eqz p0, :cond_12

    .line 328
    invoke-virtual {p0}, Lo/setEnabled;->read()I

    move-result p0

    return p0

    :cond_12
    const/4 p0, -0x1

    return p0
.end method

.method public getAutoSizeStepGranularity()I
    .registers 2

    .line 308
    sget-boolean v0, Lo/setChecked;->RemoteActionCompatParcelizer:Z

    if-eqz v0, :cond_9

    .line 309
    invoke-super {p0}, Landroid/widget/Button;->getAutoSizeStepGranularity()I

    move-result p0

    return p0

    .line 311
    :cond_9
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatButton;->RemoteActionCompatParcelizer:Lo/setEnabled;

    if-eqz p0, :cond_12

    .line 312
    invoke-virtual {p0}, Lo/setEnabled;->RemoteActionCompatParcelizer()I

    move-result p0

    return p0

    :cond_12
    const/4 p0, -0x1

    return p0
.end method

.method public getAutoSizeTextAvailableSizes()[I
    .registers 2

    .line 356
    sget-boolean v0, Lo/setChecked;->RemoteActionCompatParcelizer:Z

    if-eqz v0, :cond_9

    .line 357
    invoke-super {p0}, Landroid/widget/Button;->getAutoSizeTextAvailableSizes()[I

    move-result-object p0

    return-object p0

    .line 359
    :cond_9
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatButton;->RemoteActionCompatParcelizer:Lo/setEnabled;

    if-eqz p0, :cond_12

    .line 360
    invoke-virtual {p0}, Lo/setEnabled;->AudioAttributesImplBaseParcelizer()[I

    move-result-object p0

    return-object p0

    :cond_12
    const/4 p0, 0x0

    .line 363
    new-array p0, p0, [I

    return-object p0
.end method

.method public getAutoSizeTextType()I
    .registers 3

    .line 290
    sget-boolean v0, Lo/setChecked;->RemoteActionCompatParcelizer:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_e

    .line 291
    invoke-super {p0}, Landroid/widget/Button;->getAutoSizeTextType()I

    move-result p0

    const/4 v0, 0x1

    if-ne p0, v0, :cond_d

    return v0

    :cond_d
    return v1

    .line 295
    :cond_e
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatButton;->RemoteActionCompatParcelizer:Lo/setEnabled;

    if-eqz p0, :cond_17

    .line 296
    invoke-virtual {p0}, Lo/setEnabled;->MediaBrowserCompatCustomActionResultReceiver()I

    move-result p0

    return p0

    :cond_17
    return v1
.end method

.method public getCustomSelectionActionModeCallback()Landroid/view/ActionMode$Callback;
    .registers 1

    .line 396
    invoke-super {p0}, Landroid/widget/Button;->getCustomSelectionActionModeCallback()Landroid/view/ActionMode$Callback;

    move-result-object p0

    .line 395
    invoke-static {p0}, Lo/_addSuperTypes;->AudioAttributesCompatParcelizer(Landroid/view/ActionMode$Callback;)Landroid/view/ActionMode$Callback;

    move-result-object p0

    return-object p0
.end method

.method public onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V
    .registers 2

    .line 189
    invoke-super {p0, p1}, Landroid/widget/Button;->onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V

    .line 190
    const-class p0, Landroid/widget/Button;

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Landroid/view/accessibility/AccessibilityEvent;->setClassName(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V
    .registers 2

    .line 195
    invoke-super {p0, p1}, Landroid/widget/Button;->onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 196
    const-class p0, Landroid/widget/Button;

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setClassName(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public onLayout(ZIIII)V
    .registers 12

    .line 201
    invoke-super/range {p0 .. p5}, Landroid/widget/Button;->onLayout(ZIIII)V

    .line 202
    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatButton;->RemoteActionCompatParcelizer:Lo/setEnabled;

    if-eqz v0, :cond_f

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    .line 203
    invoke-virtual/range {v0 .. v5}, Lo/setEnabled;->IconCompatParcelizer(ZIIII)V

    :cond_f
    return-void
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .registers 5

    .line 220
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/Button;->onTextChanged(Ljava/lang/CharSequence;III)V

    .line 221
    iget-object p1, p0, Landroidx/appcompat/widget/AppCompatButton;->RemoteActionCompatParcelizer:Lo/setEnabled;

    if-eqz p1, :cond_18

    sget-boolean p1, Lo/setChecked;->RemoteActionCompatParcelizer:Z

    if-nez p1, :cond_18

    iget-object p1, p0, Landroidx/appcompat/widget/AppCompatButton;->RemoteActionCompatParcelizer:Lo/setEnabled;

    .line 222
    invoke-virtual {p1}, Lo/setEnabled;->MediaBrowserCompatItemReceiver()Z

    move-result p1

    if-eqz p1, :cond_18

    .line 224
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatButton;->RemoteActionCompatParcelizer:Lo/setEnabled;

    invoke-virtual {p0}, Lo/setEnabled;->IconCompatParcelizer()V

    :cond_18
    return-void
.end method

.method public setAllCaps(Z)V
    .registers 2

    .line 464
    invoke-super {p0, p1}, Landroid/widget/Button;->setAllCaps(Z)V

    .line 465
    invoke-direct {p0}, Landroidx/appcompat/widget/AppCompatButton;->RemoteActionCompatParcelizer()Lo/getEnabledChangedCallbackactivity_release;

    move-result-object p0

    invoke-virtual {p0, p1}, Lo/getEnabledChangedCallbackactivity_release;->write(Z)V

    return-void
.end method

.method public setAutoSizeTextTypeUniformWithConfiguration(IIII)V
    .registers 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;
        }
    .end annotation

    .line 254
    sget-boolean v0, Lo/setChecked;->RemoteActionCompatParcelizer:Z

    if-eqz v0, :cond_8

    .line 255
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/Button;->setAutoSizeTextTypeUniformWithConfiguration(IIII)V

    return-void

    .line 258
    :cond_8
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatButton;->RemoteActionCompatParcelizer:Lo/setEnabled;

    if-eqz p0, :cond_f

    .line 259
    invoke-virtual {p0, p1, p2, p3, p4}, Lo/setEnabled;->read(IIII)V

    :cond_f
    return-void
.end method

.method public setAutoSizeTextTypeUniformWithPresetSizes([II)V
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;
        }
    .end annotation

    .line 272
    sget-boolean v0, Lo/setChecked;->RemoteActionCompatParcelizer:Z

    if-eqz v0, :cond_8

    .line 273
    invoke-super {p0, p1, p2}, Landroid/widget/Button;->setAutoSizeTextTypeUniformWithPresetSizes([II)V

    return-void

    .line 275
    :cond_8
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatButton;->RemoteActionCompatParcelizer:Lo/setEnabled;

    if-eqz p0, :cond_f

    .line 276
    invoke-virtual {p0, p1, p2}, Lo/setEnabled;->read([II)V

    :cond_f
    return-void
.end method

.method public setAutoSizeTextTypeWithDefaults(I)V
    .registers 3

    .line 235
    sget-boolean v0, Lo/setChecked;->RemoteActionCompatParcelizer:Z

    if-eqz v0, :cond_8

    .line 236
    invoke-super {p0, p1}, Landroid/widget/Button;->setAutoSizeTextTypeWithDefaults(I)V

    return-void

    .line 238
    :cond_8
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatButton;->RemoteActionCompatParcelizer:Lo/setEnabled;

    if-eqz p0, :cond_f

    .line 239
    invoke-virtual {p0, p1}, Lo/setEnabled;->write(I)V

    :cond_f
    return-void
.end method

.method public setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
    .registers 2

    .line 106
    invoke-super {p0, p1}, Landroid/widget/Button;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 107
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatButton;->AudioAttributesCompatParcelizer:Lo/addCancellable;

    if-eqz p0, :cond_a

    .line 108
    invoke-virtual {p0, p1}, Lo/addCancellable;->AudioAttributesCompatParcelizer(Landroid/graphics/drawable/Drawable;)V

    :cond_a
    return-void
.end method

.method public setBackgroundResource(I)V
    .registers 2

    .line 98
    invoke-super {p0, p1}, Landroid/widget/Button;->setBackgroundResource(I)V

    .line 99
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatButton;->AudioAttributesCompatParcelizer:Lo/addCancellable;

    if-eqz p0, :cond_a

    .line 100
    invoke-virtual {p0, p1}, Lo/addCancellable;->write(I)V

    :cond_a
    return-void
.end method

.method public setCustomSelectionActionModeCallback(Landroid/view/ActionMode$Callback;)V
    .registers 2

    .line 389
    invoke-static {p0, p1}, Lo/_addSuperTypes;->write(Landroid/widget/TextView;Landroid/view/ActionMode$Callback;)Landroid/view/ActionMode$Callback;

    move-result-object p1

    .line 388
    invoke-super {p0, p1}, Landroid/widget/Button;->setCustomSelectionActionModeCallback(Landroid/view/ActionMode$Callback;)V

    return-void
.end method

.method public setEmojiCompatEnabled(Z)V
    .registers 2

    .line 471
    invoke-direct {p0}, Landroidx/appcompat/widget/AppCompatButton;->RemoteActionCompatParcelizer()Lo/getEnabledChangedCallbackactivity_release;

    move-result-object p0

    invoke-virtual {p0, p1}, Lo/getEnabledChangedCallbackactivity_release;->read(Z)V

    return-void
.end method

.method public setFilters([Landroid/text/InputFilter;)V
    .registers 3

    .line 446
    invoke-direct {p0}, Landroidx/appcompat/widget/AppCompatButton;->RemoteActionCompatParcelizer()Lo/getEnabledChangedCallbackactivity_release;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/getEnabledChangedCallbackactivity_release;->AudioAttributesCompatParcelizer([Landroid/text/InputFilter;)[Landroid/text/InputFilter;

    move-result-object p1

    invoke-super {p0, p1}, Landroid/widget/Button;->setFilters([Landroid/text/InputFilter;)V

    return-void
.end method

.method public setSupportAllCaps(Z)V
    .registers 2

    .line 376
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatButton;->RemoteActionCompatParcelizer:Lo/setEnabled;

    if-eqz p0, :cond_7

    .line 377
    invoke-virtual {p0, p1}, Lo/setEnabled;->read(Z)V

    :cond_7
    return-void
.end method

.method public setSupportBackgroundTintList(Landroid/content/res/ColorStateList;)V
    .registers 2

    .line 121
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatButton;->AudioAttributesCompatParcelizer:Lo/addCancellable;

    if-eqz p0, :cond_7

    .line 122
    invoke-virtual {p0, p1}, Lo/addCancellable;->AudioAttributesCompatParcelizer(Landroid/content/res/ColorStateList;)V

    :cond_7
    return-void
.end method

.method public setSupportBackgroundTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .registers 2

    .line 149
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatButton;->AudioAttributesCompatParcelizer:Lo/addCancellable;

    if-eqz p0, :cond_7

    .line 150
    invoke-virtual {p0, p1}, Lo/addCancellable;->RemoteActionCompatParcelizer(Landroid/graphics/PorterDuff$Mode;)V

    :cond_7
    return-void
.end method

.method public setSupportCompoundDrawablesTintList(Landroid/content/res/ColorStateList;)V
    .registers 3

    .line 406
    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatButton;->RemoteActionCompatParcelizer:Lo/setEnabled;

    invoke-virtual {v0, p1}, Lo/setEnabled;->RemoteActionCompatParcelizer(Landroid/content/res/ColorStateList;)V

    .line 407
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatButton;->RemoteActionCompatParcelizer:Lo/setEnabled;

    invoke-virtual {p0}, Lo/setEnabled;->AudioAttributesCompatParcelizer()V

    return-void
.end method

.method public setSupportCompoundDrawablesTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .registers 3

    .line 428
    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatButton;->RemoteActionCompatParcelizer:Lo/setEnabled;

    invoke-virtual {v0, p1}, Lo/setEnabled;->RemoteActionCompatParcelizer(Landroid/graphics/PorterDuff$Mode;)V

    .line 429
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatButton;->RemoteActionCompatParcelizer:Lo/setEnabled;

    invoke-virtual {p0}, Lo/setEnabled;->AudioAttributesCompatParcelizer()V

    return-void
.end method

.method public setTextAppearance(Landroid/content/Context;I)V
    .registers 3

    .line 181
    invoke-super {p0, p1, p2}, Landroid/widget/Button;->setTextAppearance(Landroid/content/Context;I)V

    .line 182
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatButton;->RemoteActionCompatParcelizer:Lo/setEnabled;

    if-eqz p0, :cond_a

    .line 183
    invoke-virtual {p0, p1, p2}, Lo/setEnabled;->read(Landroid/content/Context;I)V

    :cond_a
    return-void
.end method

.method public setTextSize(IF)V
    .registers 4

    .line 209
    sget-boolean v0, Lo/setChecked;->RemoteActionCompatParcelizer:Z

    if-eqz v0, :cond_8

    .line 210
    invoke-super {p0, p1, p2}, Landroid/widget/Button;->setTextSize(IF)V

    return-void

    .line 212
    :cond_8
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatButton;->RemoteActionCompatParcelizer:Lo/setEnabled;

    if-eqz p0, :cond_f

    .line 213
    invoke-virtual {p0, p1, p2}, Lo/setEnabled;->AudioAttributesCompatParcelizer(IF)V

    :cond_f
    return-void
.end method
