###### Class androidx.appcompat.widget.AppCompatTextView (androidx.appcompat.widget.AppCompatTextView)
.class public Landroidx/appcompat/widget/AppCompatTextView;
.super Landroid/widget/TextView;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/appcompat/widget/AppCompatTextView$IconCompatParcelizer;,
        Landroidx/appcompat/widget/AppCompatTextView$write;,
        Landroidx/appcompat/widget/AppCompatTextView$read;
    }
.end annotation


# instance fields
.field private AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/AppCompatTextView$IconCompatParcelizer;

.field private final AudioAttributesImplBaseParcelizer:Lo/isEnabled;

.field private IconCompatParcelizer:Z

.field private final MediaBrowserCompatCustomActionResultReceiver:Lo/setEnabled;

.field private RemoteActionCompatParcelizer:Ljava/util/concurrent/Future;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/Future<",
            "Lo/configureFromLongCreator;",
            ">;"
        }
    .end annotation
.end field

.field private read:Lo/getEnabledChangedCallbackactivity_release;

.field private final write:Lo/addCancellable;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 3

    const/4 v0, 0x0

    .line 104
    invoke-direct {p0, p1, v0}, Landroidx/appcompat/widget/AppCompatTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 4

    const v0, 0x1010084

    .line 108
    invoke-direct {p0, p1, p2, v0}, Landroidx/appcompat/widget/AppCompatTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 4

    .line 113
    invoke-static {p1}, Lo/setCheckable;->read(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p1

    invoke-direct {p0, p1, p2, p3}, Landroid/widget/TextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p1, 0x0

    .line 95
    iput-boolean p1, p0, Landroidx/appcompat/widget/AppCompatTextView;->IconCompatParcelizer:Z

    const/4 p1, 0x0

    .line 97
    iput-object p1, p0, Landroidx/appcompat/widget/AppCompatTextView;->AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/AppCompatTextView$IconCompatParcelizer;

    .line 115
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p0, p1}, Lo/setPositiveButton;->IconCompatParcelizer(Landroid/view/View;Landroid/content/Context;)V

    .line 117
    new-instance p1, Lo/addCancellable;

    invoke-direct {p1, p0}, Lo/addCancellable;-><init>(Landroid/view/View;)V

    iput-object p1, p0, Landroidx/appcompat/widget/AppCompatTextView;->write:Lo/addCancellable;

    .line 118
    invoke-virtual {p1, p2, p3}, Lo/addCancellable;->IconCompatParcelizer(Landroid/util/AttributeSet;I)V

    .line 120
    new-instance p1, Lo/setEnabled;

    invoke-direct {p1, p0}, Lo/setEnabled;-><init>(Landroid/widget/TextView;)V

    iput-object p1, p0, Landroidx/appcompat/widget/AppCompatTextView;->MediaBrowserCompatCustomActionResultReceiver:Lo/setEnabled;

    .line 121
    invoke-virtual {p1, p2, p3}, Lo/setEnabled;->read(Landroid/util/AttributeSet;I)V

    .line 122
    invoke-virtual {p1}, Lo/setEnabled;->AudioAttributesCompatParcelizer()V

    .line 124
    new-instance p1, Lo/isEnabled;

    invoke-direct {p1, p0}, Lo/isEnabled;-><init>(Landroid/widget/TextView;)V

    iput-object p1, p0, Landroidx/appcompat/widget/AppCompatTextView;->AudioAttributesImplBaseParcelizer:Lo/isEnabled;

    .line 126
    invoke-direct {p0}, Landroidx/appcompat/widget/AppCompatTextView;->RemoteActionCompatParcelizer()Lo/getEnabledChangedCallbackactivity_release;

    move-result-object p0

    .line 127
    invoke-virtual {p0, p2, p3}, Lo/getEnabledChangedCallbackactivity_release;->AudioAttributesCompatParcelizer(Landroid/util/AttributeSet;I)V

    return-void
.end method

.method static synthetic AudioAttributesCompatParcelizer(Landroidx/appcompat/widget/AppCompatTextView;)I
    .registers 1

    .line 85
    invoke-super {p0}, Landroid/widget/TextView;->getAutoSizeMinTextSize()I

    move-result p0

    return p0
.end method

.method static synthetic AudioAttributesImplApi21Parcelizer(Landroidx/appcompat/widget/AppCompatTextView;)Landroid/view/textclassifier/TextClassifier;
    .registers 1

    .line 85
    invoke-super {p0}, Landroid/widget/TextView;->getTextClassifier()Landroid/view/textclassifier/TextClassifier;

    move-result-object p0

    return-object p0
.end method

.method static synthetic IconCompatParcelizer(Landroidx/appcompat/widget/AppCompatTextView;)I
    .registers 1

    .line 85
    invoke-super {p0}, Landroid/widget/TextView;->getAutoSizeMaxTextSize()I

    move-result p0

    return p0
.end method

.method static synthetic IconCompatParcelizer(Landroidx/appcompat/widget/AppCompatTextView;I)V
    .registers 2

    .line 85
    invoke-super {p0, p1}, Landroid/widget/TextView;->setFirstBaselineToTopHeight(I)V

    return-void
.end method

.method static synthetic IconCompatParcelizer(Landroidx/appcompat/widget/AppCompatTextView;[II)V
    .registers 3

    .line 85
    invoke-super {p0, p1, p2}, Landroid/widget/TextView;->setAutoSizeTextTypeUniformWithPresetSizes([II)V

    return-void
.end method

.method private RemoteActionCompatParcelizer()Lo/getEnabledChangedCallbackactivity_release;
    .registers 2

    .line 136
    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatTextView;->read:Lo/getEnabledChangedCallbackactivity_release;

    if-nez v0, :cond_b

    .line 137
    new-instance v0, Lo/getEnabledChangedCallbackactivity_release;

    invoke-direct {v0, p0}, Lo/getEnabledChangedCallbackactivity_release;-><init>(Landroid/widget/TextView;)V

    iput-object v0, p0, Landroidx/appcompat/widget/AppCompatTextView;->read:Lo/getEnabledChangedCallbackactivity_release;

    .line 139
    :cond_b
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatTextView;->read:Lo/getEnabledChangedCallbackactivity_release;

    return-object p0
.end method

.method static synthetic RemoteActionCompatParcelizer(Landroidx/appcompat/widget/AppCompatTextView;I)V
    .registers 2

    .line 85
    invoke-super {p0, p1}, Landroid/widget/TextView;->setLastBaselineToBottomHeight(I)V

    return-void
.end method

.method static synthetic RemoteActionCompatParcelizer(Landroidx/appcompat/widget/AppCompatTextView;)[I
    .registers 1

    .line 85
    invoke-super {p0}, Landroid/widget/TextView;->getAutoSizeTextAvailableSizes()[I

    move-result-object p0

    return-object p0
.end method

.method static synthetic read(Landroidx/appcompat/widget/AppCompatTextView;)I
    .registers 1

    .line 85
    invoke-super {p0}, Landroid/widget/TextView;->getAutoSizeTextType()I

    move-result p0

    return p0
.end method

.method static synthetic read(Landroidx/appcompat/widget/AppCompatTextView;IIII)V
    .registers 5

    .line 85
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/TextView;->setAutoSizeTextTypeUniformWithConfiguration(IIII)V

    return-void
.end method

.method static synthetic read(Landroidx/appcompat/widget/AppCompatTextView;Landroid/view/textclassifier/TextClassifier;)V
    .registers 2

    .line 85
    invoke-super {p0, p1}, Landroid/widget/TextView;->setTextClassifier(Landroid/view/textclassifier/TextClassifier;)V

    return-void
.end method

.method static synthetic write(Landroidx/appcompat/widget/AppCompatTextView;)I
    .registers 1

    .line 85
    invoke-super {p0}, Landroid/widget/TextView;->getAutoSizeStepGranularity()I

    move-result p0

    return p0
.end method

.method private write()V
    .registers 3

    .line 546
    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatTextView;->RemoteActionCompatParcelizer:Ljava/util/concurrent/Future;

    if-eqz v0, :cond_11

    const/4 v1, 0x0

    .line 549
    :try_start_5
    iput-object v1, p0, Landroidx/appcompat/widget/AppCompatTextView;->RemoteActionCompatParcelizer:Ljava/util/concurrent/Future;

    .line 550
    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/configureFromLongCreator;

    invoke-static {p0, v0}, Lo/_addSuperTypes;->write(Landroid/widget/TextView;Lo/configureFromLongCreator;)V
    :try_end_10
    .catch Ljava/lang/InterruptedException; {:try_start_5 .. :try_end_10} :catch_11
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_5 .. :try_end_10} :catch_11

    nop

    :catch_11
    :cond_11
    return-void
.end method

.method static synthetic write(Landroidx/appcompat/widget/AppCompatTextView;I)V
    .registers 2

    .line 85
    invoke-super {p0, p1}, Landroid/widget/TextView;->setAutoSizeTextTypeWithDefaults(I)V

    return-void
.end method


# virtual methods
.method AudioAttributesImplApi21Parcelizer()Landroidx/appcompat/widget/AppCompatTextView$IconCompatParcelizer;
    .registers 2

    .line 791
    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatTextView;->AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/AppCompatTextView$IconCompatParcelizer;

    if-nez v0, :cond_b

    .line 793
    new-instance v0, Landroidx/appcompat/widget/AppCompatTextView$read;

    invoke-direct {v0, p0}, Landroidx/appcompat/widget/AppCompatTextView$read;-><init>(Landroidx/appcompat/widget/AppCompatTextView;)V

    iput-object v0, p0, Landroidx/appcompat/widget/AppCompatTextView;->AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/AppCompatTextView$IconCompatParcelizer;

    .line 798
    :cond_b
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatTextView;->AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/AppCompatTextView$IconCompatParcelizer;

    return-object p0
.end method

.method protected drawableStateChanged()V
    .registers 2

    .line 245
    invoke-super {p0}, Landroid/widget/TextView;->drawableStateChanged()V

    .line 246
    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatTextView;->write:Lo/addCancellable;

    if-eqz v0, :cond_a

    .line 247
    invoke-virtual {v0}, Lo/addCancellable;->read()V

    .line 249
    :cond_a
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatTextView;->MediaBrowserCompatCustomActionResultReceiver:Lo/setEnabled;

    if-eqz p0, :cond_11

    .line 250
    invoke-virtual {p0}, Lo/setEnabled;->AudioAttributesCompatParcelizer()V

    :cond_11
    return-void
.end method

.method public getAutoSizeMaxTextSize()I
    .registers 2

    .line 420
    sget-boolean v0, Lo/setChecked;->RemoteActionCompatParcelizer:Z

    if-eqz v0, :cond_d

    .line 421
    invoke-virtual {p0}, Landroidx/appcompat/widget/AppCompatTextView;->AudioAttributesImplApi21Parcelizer()Landroidx/appcompat/widget/AppCompatTextView$IconCompatParcelizer;

    move-result-object p0

    invoke-interface {p0}, Landroidx/appcompat/widget/AppCompatTextView$IconCompatParcelizer;->write()I

    move-result p0

    return p0

    .line 423
    :cond_d
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatTextView;->MediaBrowserCompatCustomActionResultReceiver:Lo/setEnabled;

    if-eqz p0, :cond_16

    .line 424
    invoke-virtual {p0}, Lo/setEnabled;->write()I

    move-result p0

    return p0

    :cond_16
    const/4 p0, -0x1

    return p0
.end method

.method public getAutoSizeMinTextSize()I
    .registers 2

    .line 401
    sget-boolean v0, Lo/setChecked;->RemoteActionCompatParcelizer:Z

    if-eqz v0, :cond_d

    .line 402
    invoke-virtual {p0}, Landroidx/appcompat/widget/AppCompatTextView;->AudioAttributesImplApi21Parcelizer()Landroidx/appcompat/widget/AppCompatTextView$IconCompatParcelizer;

    move-result-object p0

    invoke-interface {p0}, Landroidx/appcompat/widget/AppCompatTextView$IconCompatParcelizer;->RemoteActionCompatParcelizer()I

    move-result p0

    return p0

    .line 404
    :cond_d
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatTextView;->MediaBrowserCompatCustomActionResultReceiver:Lo/setEnabled;

    if-eqz p0, :cond_16

    .line 405
    invoke-virtual {p0}, Lo/setEnabled;->read()I

    move-result p0

    return p0

    :cond_16
    const/4 p0, -0x1

    return p0
.end method

.method public getAutoSizeStepGranularity()I
    .registers 2

    .line 382
    sget-boolean v0, Lo/setChecked;->RemoteActionCompatParcelizer:Z

    if-eqz v0, :cond_d

    .line 383
    invoke-virtual {p0}, Landroidx/appcompat/widget/AppCompatTextView;->AudioAttributesImplApi21Parcelizer()Landroidx/appcompat/widget/AppCompatTextView$IconCompatParcelizer;

    move-result-object p0

    invoke-interface {p0}, Landroidx/appcompat/widget/AppCompatTextView$IconCompatParcelizer;->IconCompatParcelizer()I

    move-result p0

    return p0

    .line 385
    :cond_d
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatTextView;->MediaBrowserCompatCustomActionResultReceiver:Lo/setEnabled;

    if-eqz p0, :cond_16

    .line 386
    invoke-virtual {p0}, Lo/setEnabled;->RemoteActionCompatParcelizer()I

    move-result p0

    return p0

    :cond_16
    const/4 p0, -0x1

    return p0
.end method

.method public getAutoSizeTextAvailableSizes()[I
    .registers 2

    .line 439
    sget-boolean v0, Lo/setChecked;->RemoteActionCompatParcelizer:Z

    if-eqz v0, :cond_d

    .line 440
    invoke-virtual {p0}, Landroidx/appcompat/widget/AppCompatTextView;->AudioAttributesImplApi21Parcelizer()Landroidx/appcompat/widget/AppCompatTextView$IconCompatParcelizer;

    move-result-object p0

    invoke-interface {p0}, Landroidx/appcompat/widget/AppCompatTextView$IconCompatParcelizer;->read()[I

    move-result-object p0

    return-object p0

    .line 442
    :cond_d
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatTextView;->MediaBrowserCompatCustomActionResultReceiver:Lo/setEnabled;

    if-eqz p0, :cond_16

    .line 443
    invoke-virtual {p0}, Lo/setEnabled;->AudioAttributesImplBaseParcelizer()[I

    move-result-object p0

    return-object p0

    :cond_16
    const/4 p0, 0x0

    .line 446
    new-array p0, p0, [I

    return-object p0
.end method

.method public getAutoSizeTextType()I
    .registers 3

    .line 360
    sget-boolean v0, Lo/setChecked;->RemoteActionCompatParcelizer:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_12

    .line 361
    invoke-virtual {p0}, Landroidx/appcompat/widget/AppCompatTextView;->AudioAttributesImplApi21Parcelizer()Landroidx/appcompat/widget/AppCompatTextView$IconCompatParcelizer;

    move-result-object p0

    invoke-interface {p0}, Landroidx/appcompat/widget/AppCompatTextView$IconCompatParcelizer;->AudioAttributesCompatParcelizer()I

    move-result p0

    const/4 v0, 0x1

    if-ne p0, v0, :cond_11

    return v0

    :cond_11
    return v1

    .line 366
    :cond_12
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatTextView;->MediaBrowserCompatCustomActionResultReceiver:Lo/setEnabled;

    if-eqz p0, :cond_1b

    .line 367
    invoke-virtual {p0}, Lo/setEnabled;->MediaBrowserCompatCustomActionResultReceiver()I

    move-result p0

    return p0

    :cond_1b
    return v1
.end method

.method public getCustomSelectionActionModeCallback()Landroid/view/ActionMode$Callback;
    .registers 1

    .line 506
    invoke-super {p0}, Landroid/widget/TextView;->getCustomSelectionActionModeCallback()Landroid/view/ActionMode$Callback;

    move-result-object p0

    .line 505
    invoke-static {p0}, Lo/_addSuperTypes;->AudioAttributesCompatParcelizer(Landroid/view/ActionMode$Callback;)Landroid/view/ActionMode$Callback;

    move-result-object p0

    return-object p0
.end method

.method public getFirstBaselineToTopHeight()I
    .registers 1

    .line 478
    invoke-static {p0}, Lo/_addSuperTypes;->write(Landroid/widget/TextView;)I

    move-result p0

    return p0
.end method

.method public getLastBaselineToBottomHeight()I
    .registers 1

    .line 483
    invoke-static {p0}, Lo/_addSuperTypes;->IconCompatParcelizer(Landroid/widget/TextView;)I

    move-result p0

    return p0
.end method

.method public getText()Ljava/lang/CharSequence;
    .registers 1

    .line 559
    invoke-direct {p0}, Landroidx/appcompat/widget/AppCompatTextView;->write()V

    .line 560
    invoke-super {p0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object p0

    return-object p0
.end method

.method public getTextClassifier()Landroid/view/textclassifier/TextClassifier;
    .registers 1

    .line 588
    invoke-virtual {p0}, Landroidx/appcompat/widget/AppCompatTextView;->AudioAttributesImplApi21Parcelizer()Landroidx/appcompat/widget/AppCompatTextView$IconCompatParcelizer;

    move-result-object p0

    invoke-interface {p0}, Landroidx/appcompat/widget/AppCompatTextView$IconCompatParcelizer;->AudioAttributesImplApi26Parcelizer()Landroid/view/textclassifier/TextClassifier;

    move-result-object p0

    return-object p0
.end method

.method public onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;
    .registers 4

    .line 451
    invoke-super {p0, p1}, Landroid/widget/TextView;->onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;

    move-result-object v0

    .line 452
    iget-object v1, p0, Landroidx/appcompat/widget/AppCompatTextView;->MediaBrowserCompatCustomActionResultReceiver:Lo/setEnabled;

    invoke-virtual {v1, p0, v0, p1}, Lo/setEnabled;->write(Landroid/widget/TextView;Landroid/view/inputmethod/InputConnection;Landroid/view/inputmethod/EditorInfo;)V

    .line 453
    invoke-static {v0, p1, p0}, Lo/handleOnBackProgressed;->IconCompatParcelizer(Landroid/view/inputmethod/InputConnection;Landroid/view/inputmethod/EditorInfo;Landroid/view/View;)Landroid/view/inputmethod/InputConnection;

    move-result-object p0

    return-object p0
.end method

.method protected onLayout(ZIIII)V
    .registers 12

    .line 256
    invoke-super/range {p0 .. p5}, Landroid/widget/TextView;->onLayout(ZIIII)V

    .line 257
    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatTextView;->MediaBrowserCompatCustomActionResultReceiver:Lo/setEnabled;

    if-eqz v0, :cond_f

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    .line 258
    invoke-virtual/range {v0 .. v5}, Lo/setEnabled;->IconCompatParcelizer(ZIIII)V

    :cond_f
    return-void
.end method

.method public onMeasure(II)V
    .registers 3

    .line 614
    invoke-direct {p0}, Landroidx/appcompat/widget/AppCompatTextView;->write()V

    .line 615
    invoke-super {p0, p1, p2}, Landroid/widget/TextView;->onMeasure(II)V

    return-void
.end method

.method protected onTextChanged(Ljava/lang/CharSequence;III)V
    .registers 5

    .line 275
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/TextView;->onTextChanged(Ljava/lang/CharSequence;III)V

    .line 276
    iget-object p1, p0, Landroidx/appcompat/widget/AppCompatTextView;->MediaBrowserCompatCustomActionResultReceiver:Lo/setEnabled;

    if-eqz p1, :cond_18

    sget-boolean p1, Lo/setChecked;->RemoteActionCompatParcelizer:Z

    if-nez p1, :cond_18

    iget-object p1, p0, Landroidx/appcompat/widget/AppCompatTextView;->MediaBrowserCompatCustomActionResultReceiver:Lo/setEnabled;

    .line 277
    invoke-virtual {p1}, Lo/setEnabled;->MediaBrowserCompatItemReceiver()Z

    move-result p1

    if-eqz p1, :cond_18

    .line 279
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatTextView;->MediaBrowserCompatCustomActionResultReceiver:Lo/setEnabled;

    invoke-virtual {p0}, Lo/setEnabled;->IconCompatParcelizer()V

    :cond_18
    return-void
.end method

.method public setAllCaps(Z)V
    .registers 2

    .line 229
    invoke-super {p0, p1}, Landroid/widget/TextView;->setAllCaps(Z)V

    .line 230
    invoke-direct {p0}, Landroidx/appcompat/widget/AppCompatTextView;->RemoteActionCompatParcelizer()Lo/getEnabledChangedCallbackactivity_release;

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

    .line 317
    sget-boolean v0, Lo/setChecked;->RemoteActionCompatParcelizer:Z

    if-eqz v0, :cond_c

    .line 318
    invoke-virtual {p0}, Landroidx/appcompat/widget/AppCompatTextView;->AudioAttributesImplApi21Parcelizer()Landroidx/appcompat/widget/AppCompatTextView$IconCompatParcelizer;

    move-result-object p0

    invoke-interface {p0, p1, p2, p3, p4}, Landroidx/appcompat/widget/AppCompatTextView$IconCompatParcelizer;->IconCompatParcelizer(IIII)V

    return-void

    .line 321
    :cond_c
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatTextView;->MediaBrowserCompatCustomActionResultReceiver:Lo/setEnabled;

    if-eqz p0, :cond_13

    .line 322
    invoke-virtual {p0, p1, p2, p3, p4}, Lo/setEnabled;->read(IIII)V

    :cond_13
    return-void
.end method

.method public setAutoSizeTextTypeUniformWithPresetSizes([II)V
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;
        }
    .end annotation

    .line 339
    sget-boolean v0, Lo/setChecked;->RemoteActionCompatParcelizer:Z

    if-eqz v0, :cond_c

    .line 340
    invoke-virtual {p0}, Landroidx/appcompat/widget/AppCompatTextView;->AudioAttributesImplApi21Parcelizer()Landroidx/appcompat/widget/AppCompatTextView$IconCompatParcelizer;

    move-result-object p0

    invoke-interface {p0, p1, p2}, Landroidx/appcompat/widget/AppCompatTextView$IconCompatParcelizer;->RemoteActionCompatParcelizer([II)V

    return-void

    .line 342
    :cond_c
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatTextView;->MediaBrowserCompatCustomActionResultReceiver:Lo/setEnabled;

    if-eqz p0, :cond_13

    .line 343
    invoke-virtual {p0, p1, p2}, Lo/setEnabled;->read([II)V

    :cond_13
    return-void
.end method

.method public setAutoSizeTextTypeWithDefaults(I)V
    .registers 3

    .line 294
    sget-boolean v0, Lo/setChecked;->RemoteActionCompatParcelizer:Z

    if-eqz v0, :cond_c

    .line 295
    invoke-virtual {p0}, Landroidx/appcompat/widget/AppCompatTextView;->AudioAttributesImplApi21Parcelizer()Landroidx/appcompat/widget/AppCompatTextView$IconCompatParcelizer;

    move-result-object p0

    invoke-interface {p0, p1}, Landroidx/appcompat/widget/AppCompatTextView$IconCompatParcelizer;->AudioAttributesCompatParcelizer(I)V

    return-void

    .line 297
    :cond_c
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatTextView;->MediaBrowserCompatCustomActionResultReceiver:Lo/setEnabled;

    if-eqz p0, :cond_13

    .line 298
    invoke-virtual {p0, p1}, Lo/setEnabled;->write(I)V

    :cond_13
    return-void
.end method

.method public setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
    .registers 2

    .line 152
    invoke-super {p0, p1}, Landroid/widget/TextView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 153
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatTextView;->write:Lo/addCancellable;

    if-eqz p0, :cond_a

    .line 154
    invoke-virtual {p0, p1}, Lo/addCancellable;->AudioAttributesCompatParcelizer(Landroid/graphics/drawable/Drawable;)V

    :cond_a
    return-void
.end method

.method public setBackgroundResource(I)V
    .registers 2

    .line 144
    invoke-super {p0, p1}, Landroid/widget/TextView;->setBackgroundResource(I)V

    .line 145
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatTextView;->write:Lo/addCancellable;

    if-eqz p0, :cond_a

    .line 146
    invoke-virtual {p0, p1}, Lo/addCancellable;->write(I)V

    :cond_a
    return-void
.end method

.method public setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    .registers 5

    .line 621
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/TextView;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 622
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatTextView;->MediaBrowserCompatCustomActionResultReceiver:Lo/setEnabled;

    if-eqz p0, :cond_a

    .line 623
    invoke-virtual {p0}, Lo/setEnabled;->AudioAttributesImplApi26Parcelizer()V

    :cond_a
    return-void
.end method

.method public setCompoundDrawablesRelative(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    .registers 5

    .line 631
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/TextView;->setCompoundDrawablesRelative(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 632
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatTextView;->MediaBrowserCompatCustomActionResultReceiver:Lo/setEnabled;

    if-eqz p0, :cond_a

    .line 633
    invoke-virtual {p0}, Lo/setEnabled;->AudioAttributesImplApi26Parcelizer()V

    :cond_a
    return-void
.end method

.method public setCompoundDrawablesRelativeWithIntrinsicBounds(IIII)V
    .registers 7

    .line 673
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz p1, :cond_c

    .line 675
    invoke-static {v0, p1}, Lo/getDefaultViewModelCreationExtras;->write(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    goto :goto_d

    :cond_c
    move-object p1, v1

    :goto_d
    if-eqz p2, :cond_14

    .line 676
    invoke-static {v0, p2}, Lo/getDefaultViewModelCreationExtras;->write(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    goto :goto_15

    :cond_14
    move-object p2, v1

    :goto_15
    if-eqz p3, :cond_1c

    .line 677
    invoke-static {v0, p3}, Lo/getDefaultViewModelCreationExtras;->write(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p3

    goto :goto_1d

    :cond_1c
    move-object p3, v1

    :goto_1d
    if-eqz p4, :cond_23

    .line 678
    invoke-static {v0, p4}, Lo/getDefaultViewModelCreationExtras;->write(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    .line 674
    :cond_23
    invoke-virtual {p0, p1, p2, p3, v1}, Landroidx/appcompat/widget/AppCompatTextView;->setCompoundDrawablesRelativeWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 679
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatTextView;->MediaBrowserCompatCustomActionResultReceiver:Lo/setEnabled;

    if-eqz p0, :cond_2d

    .line 680
    invoke-virtual {p0}, Lo/setEnabled;->AudioAttributesImplApi26Parcelizer()V

    :cond_2d
    return-void
.end method

.method public setCompoundDrawablesRelativeWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    .registers 5

    .line 663
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/TextView;->setCompoundDrawablesRelativeWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 664
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatTextView;->MediaBrowserCompatCustomActionResultReceiver:Lo/setEnabled;

    if-eqz p0, :cond_a

    .line 665
    invoke-virtual {p0}, Lo/setEnabled;->AudioAttributesImplApi26Parcelizer()V

    :cond_a
    return-void
.end method

.method public setCompoundDrawablesWithIntrinsicBounds(IIII)V
    .registers 7

    .line 648
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz p1, :cond_c

    .line 650
    invoke-static {v0, p1}, Lo/getDefaultViewModelCreationExtras;->write(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    goto :goto_d

    :cond_c
    move-object p1, v1

    :goto_d
    if-eqz p2, :cond_14

    .line 651
    invoke-static {v0, p2}, Lo/getDefaultViewModelCreationExtras;->write(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    goto :goto_15

    :cond_14
    move-object p2, v1

    :goto_15
    if-eqz p3, :cond_1c

    .line 652
    invoke-static {v0, p3}, Lo/getDefaultViewModelCreationExtras;->write(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p3

    goto :goto_1d

    :cond_1c
    move-object p3, v1

    :goto_1d
    if-eqz p4, :cond_23

    .line 653
    invoke-static {v0, p4}, Lo/getDefaultViewModelCreationExtras;->write(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    .line 649
    :cond_23
    invoke-virtual {p0, p1, p2, p3, v1}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 654
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatTextView;->MediaBrowserCompatCustomActionResultReceiver:Lo/setEnabled;

    if-eqz p0, :cond_2d

    .line 655
    invoke-virtual {p0}, Lo/setEnabled;->AudioAttributesImplApi26Parcelizer()V

    :cond_2d
    return-void
.end method

.method public setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    .registers 5

    .line 640
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 641
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatTextView;->MediaBrowserCompatCustomActionResultReceiver:Lo/setEnabled;

    if-eqz p0, :cond_a

    .line 642
    invoke-virtual {p0}, Lo/setEnabled;->AudioAttributesImplApi26Parcelizer()V

    :cond_a
    return-void
.end method

.method public setCustomSelectionActionModeCallback(Landroid/view/ActionMode$Callback;)V
    .registers 2

    .line 499
    invoke-static {p0, p1}, Lo/_addSuperTypes;->write(Landroid/widget/TextView;Landroid/view/ActionMode$Callback;)Landroid/view/ActionMode$Callback;

    move-result-object p1

    .line 498
    invoke-super {p0, p1}, Landroid/widget/TextView;->setCustomSelectionActionModeCallback(Landroid/view/ActionMode$Callback;)V

    return-void
.end method

.method public setEmojiCompatEnabled(Z)V
    .registers 2

    .line 235
    invoke-direct {p0}, Landroidx/appcompat/widget/AppCompatTextView;->RemoteActionCompatParcelizer()Lo/getEnabledChangedCallbackactivity_release;

    move-result-object p0

    invoke-virtual {p0, p1}, Lo/getEnabledChangedCallbackactivity_release;->read(Z)V

    return-void
.end method

.method public setFilters([Landroid/text/InputFilter;)V
    .registers 3

    .line 224
    invoke-direct {p0}, Landroidx/appcompat/widget/AppCompatTextView;->RemoteActionCompatParcelizer()Lo/getEnabledChangedCallbackactivity_release;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/getEnabledChangedCallbackactivity_release;->AudioAttributesCompatParcelizer([Landroid/text/InputFilter;)[Landroid/text/InputFilter;

    move-result-object p1

    invoke-super {p0, p1}, Landroid/widget/TextView;->setFilters([Landroid/text/InputFilter;)V

    return-void
.end method

.method public setFirstBaselineToTopHeight(I)V
    .registers 2

    .line 459
    invoke-virtual {p0}, Landroidx/appcompat/widget/AppCompatTextView;->AudioAttributesImplApi21Parcelizer()Landroidx/appcompat/widget/AppCompatTextView$IconCompatParcelizer;

    move-result-object p0

    invoke-interface {p0, p1}, Landroidx/appcompat/widget/AppCompatTextView$IconCompatParcelizer;->IconCompatParcelizer(I)V

    return-void
.end method

.method public setLastBaselineToBottomHeight(I)V
    .registers 2

    .line 469
    invoke-virtual {p0}, Landroidx/appcompat/widget/AppCompatTextView;->AudioAttributesImplApi21Parcelizer()Landroidx/appcompat/widget/AppCompatTextView$IconCompatParcelizer;

    move-result-object p0

    invoke-interface {p0, p1}, Landroidx/appcompat/widget/AppCompatTextView$IconCompatParcelizer;->RemoteActionCompatParcelizer(I)V

    return-void
.end method

.method public setLineHeight(I)V
    .registers 2

    .line 488
    invoke-static {p0, p1}, Lo/_addSuperTypes;->read(Landroid/widget/TextView;I)V

    return-void
.end method

.method public setPrecomputedText(Lo/configureFromLongCreator;)V
    .registers 2

    .line 542
    invoke-static {p0, p1}, Lo/_addSuperTypes;->write(Landroid/widget/TextView;Lo/configureFromLongCreator;)V

    return-void
.end method

.method public setSupportBackgroundTintList(Landroid/content/res/ColorStateList;)V
    .registers 2

    .line 167
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatTextView;->write:Lo/addCancellable;

    if-eqz p0, :cond_7

    .line 168
    invoke-virtual {p0, p1}, Lo/addCancellable;->AudioAttributesCompatParcelizer(Landroid/content/res/ColorStateList;)V

    :cond_7
    return-void
.end method

.method public setSupportBackgroundTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .registers 2

    .line 195
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatTextView;->write:Lo/addCancellable;

    if-eqz p0, :cond_7

    .line 196
    invoke-virtual {p0, p1}, Lo/addCancellable;->RemoteActionCompatParcelizer(Landroid/graphics/PorterDuff$Mode;)V

    :cond_7
    return-void
.end method

.method public setSupportCompoundDrawablesTintList(Landroid/content/res/ColorStateList;)V
    .registers 3

    .line 721
    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatTextView;->MediaBrowserCompatCustomActionResultReceiver:Lo/setEnabled;

    invoke-virtual {v0, p1}, Lo/setEnabled;->RemoteActionCompatParcelizer(Landroid/content/res/ColorStateList;)V

    .line 722
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatTextView;->MediaBrowserCompatCustomActionResultReceiver:Lo/setEnabled;

    invoke-virtual {p0}, Lo/setEnabled;->AudioAttributesCompatParcelizer()V

    return-void
.end method

.method public setSupportCompoundDrawablesTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .registers 3

    .line 761
    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatTextView;->MediaBrowserCompatCustomActionResultReceiver:Lo/setEnabled;

    invoke-virtual {v0, p1}, Lo/setEnabled;->RemoteActionCompatParcelizer(Landroid/graphics/PorterDuff$Mode;)V

    .line 762
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatTextView;->MediaBrowserCompatCustomActionResultReceiver:Lo/setEnabled;

    invoke-virtual {p0}, Lo/setEnabled;->AudioAttributesCompatParcelizer()V

    return-void
.end method

.method public setTextAppearance(Landroid/content/Context;I)V
    .registers 3

    .line 216
    invoke-super {p0, p1, p2}, Landroid/widget/TextView;->setTextAppearance(Landroid/content/Context;I)V

    .line 217
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatTextView;->MediaBrowserCompatCustomActionResultReceiver:Lo/setEnabled;

    if-eqz p0, :cond_a

    .line 218
    invoke-virtual {p0, p1, p2}, Lo/setEnabled;->read(Landroid/content/Context;I)V

    :cond_a
    return-void
.end method

.method public setTextClassifier(Landroid/view/textclassifier/TextClassifier;)V
    .registers 2

    .line 570
    invoke-virtual {p0}, Landroidx/appcompat/widget/AppCompatTextView;->AudioAttributesImplApi21Parcelizer()Landroidx/appcompat/widget/AppCompatTextView$IconCompatParcelizer;

    move-result-object p0

    invoke-interface {p0, p1}, Landroidx/appcompat/widget/AppCompatTextView$IconCompatParcelizer;->read(Landroid/view/textclassifier/TextClassifier;)V

    return-void
.end method

.method public setTextFuture(Ljava/util/concurrent/Future;)V
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Future<",
            "Lo/configureFromLongCreator;",
            ">;)V"
        }
    .end annotation

    .line 606
    iput-object p1, p0, Landroidx/appcompat/widget/AppCompatTextView;->RemoteActionCompatParcelizer:Ljava/util/concurrent/Future;

    if-eqz p1, :cond_7

    .line 608
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    :cond_7
    return-void
.end method

.method public setTextMetricsParamsCompat(Lo/configureFromLongCreator$AudioAttributesCompatParcelizer;)V
    .registers 2

    .line 529
    invoke-static {p0, p1}, Lo/_addSuperTypes;->IconCompatParcelizer(Landroid/widget/TextView;Lo/configureFromLongCreator$AudioAttributesCompatParcelizer;)V

    return-void
.end method

.method public setTextSize(IF)V
    .registers 4

    .line 264
    sget-boolean v0, Lo/setChecked;->RemoteActionCompatParcelizer:Z

    if-eqz v0, :cond_8

    .line 265
    invoke-super {p0, p1, p2}, Landroid/widget/TextView;->setTextSize(IF)V

    return-void

    .line 267
    :cond_8
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatTextView;->MediaBrowserCompatCustomActionResultReceiver:Lo/setEnabled;

    if-eqz p0, :cond_f

    .line 268
    invoke-virtual {p0, p1, p2}, Lo/setEnabled;->AudioAttributesCompatParcelizer(IF)V

    :cond_f
    return-void
.end method

.method public setTypeface(Landroid/graphics/Typeface;I)V
    .registers 5

    .line 767
    iget-boolean v0, p0, Landroidx/appcompat/widget/AppCompatTextView;->IconCompatParcelizer:Z

    if-eqz v0, :cond_5

    return-void

    :cond_5
    if-eqz p1, :cond_12

    if-lez p2, :cond_12

    .line 776
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1, p2}, Lo/findConvertingContentDeserializer;->read(Landroid/content/Context;Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    move-result-object v0

    goto :goto_13

    :cond_12
    const/4 v0, 0x0

    :goto_13
    const/4 v1, 0x1

    .line 779
    iput-boolean v1, p0, Landroidx/appcompat/widget/AppCompatTextView;->IconCompatParcelizer:Z

    if-eqz v0, :cond_19

    move-object p1, v0

    :cond_19
    const/4 v0, 0x0

    .line 781
    :try_start_1a
    invoke-super {p0, p1, p2}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V
    :try_end_1d
    .catchall {:try_start_1a .. :try_end_1d} :catchall_20

    .line 783
    iput-boolean v0, p0, Landroidx/appcompat/widget/AppCompatTextView;->IconCompatParcelizer:Z

    return-void

    :catchall_20
    move-exception p1

    iput-boolean v0, p0, Landroidx/appcompat/widget/AppCompatTextView;->IconCompatParcelizer:Z

    .line 784
    throw p1
.end method

###### Class androidx.appcompat.widget.AppCompatTextView.IconCompatParcelizer (androidx.appcompat.widget.AppCompatTextView$IconCompatParcelizer)
.class interface abstract Landroidx/appcompat/widget/AppCompatTextView$IconCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/widget/AppCompatTextView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x608
    name = "IconCompatParcelizer"
.end annotation


# virtual methods
.method public abstract AudioAttributesCompatParcelizer()I
.end method

.method public abstract AudioAttributesCompatParcelizer(I)V
.end method

.method public abstract AudioAttributesImplApi26Parcelizer()Landroid/view/textclassifier/TextClassifier;
.end method

.method public abstract IconCompatParcelizer()I
.end method

.method public abstract IconCompatParcelizer(I)V
.end method

.method public abstract IconCompatParcelizer(IIII)V
.end method

.method public abstract RemoteActionCompatParcelizer()I
.end method

.method public abstract RemoteActionCompatParcelizer(I)V
.end method

.method public abstract RemoteActionCompatParcelizer([II)V
.end method

.method public abstract read(Landroid/view/textclassifier/TextClassifier;)V
.end method

.method public abstract read()[I
.end method

.method public abstract write()I
.end method

###### Class androidx.appcompat.widget.AppCompatTextView.read (androidx.appcompat.widget.AppCompatTextView$read)
.class Landroidx/appcompat/widget/AppCompatTextView$read;
.super Landroidx/appcompat/widget/AppCompatTextView$write;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/widget/AppCompatTextView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "read"
.end annotation


# instance fields
.field final synthetic write:Landroidx/appcompat/widget/AppCompatTextView;


# direct methods
.method constructor <init>(Landroidx/appcompat/widget/AppCompatTextView;)V
    .registers 2

    .line 884
    iput-object p1, p0, Landroidx/appcompat/widget/AppCompatTextView$read;->write:Landroidx/appcompat/widget/AppCompatTextView;

    invoke-direct {p0, p1}, Landroidx/appcompat/widget/AppCompatTextView$write;-><init>(Landroidx/appcompat/widget/AppCompatTextView;)V

    return-void
.end method


# virtual methods
.method public IconCompatParcelizer(I)V
    .registers 2

    .line 888
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatTextView$read;->write:Landroidx/appcompat/widget/AppCompatTextView;

    invoke-static {p0, p1}, Landroidx/appcompat/widget/AppCompatTextView;->IconCompatParcelizer(Landroidx/appcompat/widget/AppCompatTextView;I)V

    return-void
.end method

.method public RemoteActionCompatParcelizer(I)V
    .registers 2

    .line 893
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatTextView$read;->write:Landroidx/appcompat/widget/AppCompatTextView;

    invoke-static {p0, p1}, Landroidx/appcompat/widget/AppCompatTextView;->RemoteActionCompatParcelizer(Landroidx/appcompat/widget/AppCompatTextView;I)V

    return-void
.end method

###### Class androidx.appcompat.widget.AppCompatTextView.write (androidx.appcompat.widget.AppCompatTextView$write)
.class Landroidx/appcompat/widget/AppCompatTextView$write;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/appcompat/widget/AppCompatTextView$IconCompatParcelizer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/widget/AppCompatTextView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "write"
.end annotation


# instance fields
.field final synthetic AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/AppCompatTextView;


# direct methods
.method constructor <init>(Landroidx/appcompat/widget/AppCompatTextView;)V
    .registers 2

    .line 823
    iput-object p1, p0, Landroidx/appcompat/widget/AppCompatTextView$write;->AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/AppCompatTextView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public AudioAttributesCompatParcelizer()I
    .registers 1

    .line 846
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatTextView$write;->AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/AppCompatTextView;

    invoke-static {p0}, Landroidx/appcompat/widget/AppCompatTextView;->read(Landroidx/appcompat/widget/AppCompatTextView;)I

    move-result p0

    return p0
.end method

.method public AudioAttributesCompatParcelizer(I)V
    .registers 2

    .line 868
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatTextView$write;->AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/AppCompatTextView;

    invoke-static {p0, p1}, Landroidx/appcompat/widget/AppCompatTextView;->write(Landroidx/appcompat/widget/AppCompatTextView;I)V

    return-void
.end method

.method public AudioAttributesImplApi26Parcelizer()Landroid/view/textclassifier/TextClassifier;
    .registers 1

    .line 851
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatTextView$write;->AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/AppCompatTextView;

    invoke-static {p0}, Landroidx/appcompat/widget/AppCompatTextView;->AudioAttributesImplApi21Parcelizer(Landroidx/appcompat/widget/AppCompatTextView;)Landroid/view/textclassifier/TextClassifier;

    move-result-object p0

    return-object p0
.end method

.method public IconCompatParcelizer()I
    .registers 1

    .line 836
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatTextView$write;->AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/AppCompatTextView;

    invoke-static {p0}, Landroidx/appcompat/widget/AppCompatTextView;->write(Landroidx/appcompat/widget/AppCompatTextView;)I

    move-result p0

    return p0
.end method

.method public IconCompatParcelizer(I)V
    .registers 2

    return-void
.end method

.method public IconCompatParcelizer(IIII)V
    .registers 5

    .line 857
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatTextView$write;->AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/AppCompatTextView;

    invoke-static {p0, p1, p2, p3, p4}, Landroidx/appcompat/widget/AppCompatTextView;->read(Landroidx/appcompat/widget/AppCompatTextView;IIII)V

    return-void
.end method

.method public RemoteActionCompatParcelizer()I
    .registers 1

    .line 831
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatTextView$write;->AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/AppCompatTextView;

    invoke-static {p0}, Landroidx/appcompat/widget/AppCompatTextView;->AudioAttributesCompatParcelizer(Landroidx/appcompat/widget/AppCompatTextView;)I

    move-result p0

    return p0
.end method

.method public RemoteActionCompatParcelizer(I)V
    .registers 2

    return-void
.end method

.method public RemoteActionCompatParcelizer([II)V
    .registers 3

    .line 863
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatTextView$write;->AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/AppCompatTextView;

    invoke-static {p0, p1, p2}, Landroidx/appcompat/widget/AppCompatTextView;->IconCompatParcelizer(Landroidx/appcompat/widget/AppCompatTextView;[II)V

    return-void
.end method

.method public read(Landroid/view/textclassifier/TextClassifier;)V
    .registers 2

    .line 873
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatTextView$write;->AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/AppCompatTextView;

    invoke-static {p0, p1}, Landroidx/appcompat/widget/AppCompatTextView;->read(Landroidx/appcompat/widget/AppCompatTextView;Landroid/view/textclassifier/TextClassifier;)V

    return-void
.end method

.method public read()[I
    .registers 1

    .line 841
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatTextView$write;->AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/AppCompatTextView;

    invoke-static {p0}, Landroidx/appcompat/widget/AppCompatTextView;->RemoteActionCompatParcelizer(Landroidx/appcompat/widget/AppCompatTextView;)[I

    move-result-object p0

    return-object p0
.end method

.method public write()I
    .registers 1

    .line 826
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatTextView$write;->AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/AppCompatTextView;

    invoke-static {p0}, Landroidx/appcompat/widget/AppCompatTextView;->IconCompatParcelizer(Landroidx/appcompat/widget/AppCompatTextView;)I

    move-result p0

    return p0
.end method
