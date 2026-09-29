###### Class androidx.appcompat.widget.AppCompatSpinner (androidx.appcompat.widget.AppCompatSpinner)
.class public Landroidx/appcompat/widget/AppCompatSpinner;
.super Landroid/widget/Spinner;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/appcompat/widget/AppCompatSpinner$RemoteActionCompatParcelizer;,
        Landroidx/appcompat/widget/AppCompatSpinner$AudioAttributesCompatParcelizer;,
        Landroidx/appcompat/widget/AppCompatSpinner$IconCompatParcelizer;,
        Landroidx/appcompat/widget/AppCompatSpinner$read;,
        Landroidx/appcompat/widget/AppCompatSpinner$write;,
        Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatItemReceiver;,
        Landroidx/appcompat/widget/AppCompatSpinner$SavedState;,
        Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatCustomActionResultReceiver;
    }
.end annotation


# static fields
.field private static final RemoteActionCompatParcelizer:[I


# instance fields
.field AudioAttributesCompatParcelizer:I

.field private AudioAttributesImplApi21Parcelizer:Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatCustomActionResultReceiver;

.field private final AudioAttributesImplApi26Parcelizer:Landroid/content/Context;

.field private AudioAttributesImplBaseParcelizer:Landroid/widget/SpinnerAdapter;

.field final IconCompatParcelizer:Landroid/graphics/Rect;

.field private final MediaBrowserCompatCustomActionResultReceiver:Z

.field private final read:Lo/addCancellable;

.field private write:Lo/ActivityResult;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    const v0, 0x10102f1

    .line 87
    filled-new-array {v0}, [I

    move-result-object v0

    sput-object v0, Landroidx/appcompat/widget/AppCompatSpinner;->RemoteActionCompatParcelizer:[I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .registers 3

    const/4 v0, 0x0

    .line 124
    invoke-direct {p0, p1, v0}, Landroidx/appcompat/widget/AppCompatSpinner;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 4

    .line 152
    sget v0, Lo/_init_lambda5$read;->spinnerStyle:I

    invoke-direct {p0, p1, p2, v0}, Landroidx/appcompat/widget/AppCompatSpinner;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 5

    const/4 v0, -0x1

    .line 168
    invoke-direct {p0, p1, p2, p3, v0}, Landroidx/appcompat/widget/AppCompatSpinner;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .registers 11

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move v4, p4

    .line 188
    invoke-direct/range {v0 .. v5}, Landroidx/appcompat/widget/AppCompatSpinner;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILandroid/content/res/Resources$Theme;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;IILandroid/content/res/Resources$Theme;)V
    .registers 11

    .line 217
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/Spinner;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 114
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Landroidx/appcompat/widget/AppCompatSpinner;->IconCompatParcelizer:Landroid/graphics/Rect;

    .line 219
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {p0, v0}, Lo/setPositiveButton;->IconCompatParcelizer(Landroid/view/View;Landroid/content/Context;)V

    .line 221
    sget-object v0, Lo/_init_lambda5$AudioAttributesImplApi26Parcelizer;->Spinner:[I

    const/4 v1, 0x0

    invoke-static {p1, p2, v0, p3, v1}, Lo/setTitle;->read(Landroid/content/Context;Landroid/util/AttributeSet;[III)Lo/setTitle;

    move-result-object v0

    .line 224
    new-instance v2, Lo/addCancellable;

    invoke-direct {v2, p0}, Lo/addCancellable;-><init>(Landroid/view/View;)V

    iput-object v2, p0, Landroidx/appcompat/widget/AppCompatSpinner;->read:Lo/addCancellable;

    if-eqz p5, :cond_29

    .line 227
    new-instance v2, Lo/initializeViewTreeOwners;

    invoke-direct {v2, p1, p5}, Lo/initializeViewTreeOwners;-><init>(Landroid/content/Context;Landroid/content/res/Resources$Theme;)V

    iput-object v2, p0, Landroidx/appcompat/widget/AppCompatSpinner;->AudioAttributesImplApi26Parcelizer:Landroid/content/Context;

    goto :goto_3b

    .line 229
    :cond_29
    sget p5, Lo/_init_lambda5$AudioAttributesImplApi26Parcelizer;->Spinner_popupTheme:I

    invoke-virtual {v0, p5, v1}, Lo/setTitle;->MediaBrowserCompatItemReceiver(II)I

    move-result p5

    if-eqz p5, :cond_39

    .line 231
    new-instance v2, Lo/initializeViewTreeOwners;

    invoke-direct {v2, p1, p5}, Lo/initializeViewTreeOwners;-><init>(Landroid/content/Context;I)V

    iput-object v2, p0, Landroidx/appcompat/widget/AppCompatSpinner;->AudioAttributesImplApi26Parcelizer:Landroid/content/Context;

    goto :goto_3b

    .line 233
    :cond_39
    iput-object p1, p0, Landroidx/appcompat/widget/AppCompatSpinner;->AudioAttributesImplApi26Parcelizer:Landroid/content/Context;

    :goto_3b
    const/4 p5, -0x1

    const/4 v2, 0x0

    if-ne p4, p5, :cond_62

    .line 240
    :try_start_3f
    sget-object p5, Landroidx/appcompat/widget/AppCompatSpinner;->RemoteActionCompatParcelizer:[I

    invoke-virtual {p1, p2, p5, p3, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p5
    :try_end_45
    .catch Ljava/lang/Exception; {:try_start_3f .. :try_end_45} :catch_5c
    .catchall {:try_start_3f .. :try_end_45} :catchall_55

    .line 242
    :try_start_45
    invoke-virtual {p5, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v3

    if-eqz v3, :cond_4f

    .line 243
    invoke-virtual {p5, v1, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p4
    :try_end_4f
    .catch Ljava/lang/Exception; {:try_start_45 .. :try_end_4f} :catch_5d
    .catchall {:try_start_45 .. :try_end_4f} :catchall_52

    :cond_4f
    if-eqz p5, :cond_62

    goto :goto_5f

    :catchall_52
    move-exception p0

    move-object v2, p5

    goto :goto_56

    :catchall_55
    move-exception p0

    :goto_56
    if-eqz v2, :cond_5b

    .line 249
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    .line 251
    :cond_5b
    throw p0

    :catch_5c
    move-object p5, v2

    :catch_5d
    if-eqz p5, :cond_62

    .line 249
    :goto_5f
    invoke-virtual {p5}, Landroid/content/res/TypedArray;->recycle()V

    :cond_62
    const/4 p5, 0x1

    if-eqz p4, :cond_9e

    if-ne p4, p5, :cond_ae

    .line 261
    new-instance p4, Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatItemReceiver;

    iget-object v3, p0, Landroidx/appcompat/widget/AppCompatSpinner;->AudioAttributesImplApi26Parcelizer:Landroid/content/Context;

    invoke-direct {p4, p0, v3, p2, p3}, Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatItemReceiver;-><init>(Landroidx/appcompat/widget/AppCompatSpinner;Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 262
    iget-object v3, p0, Landroidx/appcompat/widget/AppCompatSpinner;->AudioAttributesImplApi26Parcelizer:Landroid/content/Context;

    sget-object v4, Lo/_init_lambda5$AudioAttributesImplApi26Parcelizer;->Spinner:[I

    invoke-static {v3, p2, v4, p3, v1}, Lo/setTitle;->read(Landroid/content/Context;Landroid/util/AttributeSet;[III)Lo/setTitle;

    move-result-object v1

    .line 264
    sget v3, Lo/_init_lambda5$AudioAttributesImplApi26Parcelizer;->Spinner_android_dropDownWidth:I

    const/4 v4, -0x2

    invoke-virtual {v1, v3, v4}, Lo/setTitle;->IconCompatParcelizer(II)I

    move-result v3

    iput v3, p0, Landroidx/appcompat/widget/AppCompatSpinner;->AudioAttributesCompatParcelizer:I

    .line 266
    sget v3, Lo/_init_lambda5$AudioAttributesImplApi26Parcelizer;->Spinner_android_popupBackground:I

    .line 267
    invoke-virtual {v1, v3}, Lo/setTitle;->IconCompatParcelizer(I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    .line 266
    invoke-virtual {p4, v3}, Landroidx/appcompat/widget/ListPopupWindow;->write(Landroid/graphics/drawable/Drawable;)V

    .line 268
    sget v3, Lo/_init_lambda5$AudioAttributesImplApi26Parcelizer;->Spinner_android_prompt:I

    invoke-virtual {v0, v3}, Lo/setTitle;->AudioAttributesImplApi21Parcelizer(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p4, v3}, Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatItemReceiver;->RemoteActionCompatParcelizer(Ljava/lang/CharSequence;)V

    .line 269
    invoke-virtual {v1}, Lo/setTitle;->write()V

    .line 271
    iput-object p4, p0, Landroidx/appcompat/widget/AppCompatSpinner;->AudioAttributesImplApi21Parcelizer:Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatCustomActionResultReceiver;

    .line 272
    new-instance v1, Landroidx/appcompat/widget/AppCompatSpinner$5;

    invoke-direct {v1, p0, p0, p4}, Landroidx/appcompat/widget/AppCompatSpinner$5;-><init>(Landroidx/appcompat/widget/AppCompatSpinner;Landroid/view/View;Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatItemReceiver;)V

    iput-object v1, p0, Landroidx/appcompat/widget/AppCompatSpinner;->write:Lo/ActivityResult;

    goto :goto_ae

    .line 256
    :cond_9e
    new-instance p4, Landroidx/appcompat/widget/AppCompatSpinner$read;

    invoke-direct {p4, p0}, Landroidx/appcompat/widget/AppCompatSpinner$read;-><init>(Landroidx/appcompat/widget/AppCompatSpinner;)V

    iput-object p4, p0, Landroidx/appcompat/widget/AppCompatSpinner;->AudioAttributesImplApi21Parcelizer:Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatCustomActionResultReceiver;

    .line 257
    sget v1, Lo/_init_lambda5$AudioAttributesImplApi26Parcelizer;->Spinner_android_prompt:I

    invoke-virtual {v0, v1}, Lo/setTitle;->AudioAttributesImplApi21Parcelizer(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {p4, v1}, Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatCustomActionResultReceiver;->RemoteActionCompatParcelizer(Ljava/lang/CharSequence;)V

    .line 290
    :cond_ae
    :goto_ae
    sget p4, Lo/_init_lambda5$AudioAttributesImplApi26Parcelizer;->Spinner_android_entries:I

    invoke-virtual {v0, p4}, Lo/setTitle;->MediaBrowserCompatItemReceiver(I)[Ljava/lang/CharSequence;

    move-result-object p4

    if-eqz p4, :cond_c6

    .line 292
    new-instance v1, Landroid/widget/ArrayAdapter;

    const v3, 0x1090008

    invoke-direct {v1, p1, v3, p4}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;I[Ljava/lang/Object;)V

    .line 294
    sget p1, Lo/_init_lambda5$MediaBrowserCompatCustomActionResultReceiver;->support_simple_spinner_dropdown_item:I

    invoke-virtual {v1, p1}, Landroid/widget/ArrayAdapter;->setDropDownViewResource(I)V

    .line 295
    invoke-virtual {p0, v1}, Landroid/widget/AbsSpinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    .line 298
    :cond_c6
    invoke-virtual {v0}, Lo/setTitle;->write()V

    .line 300
    iput-boolean p5, p0, Landroidx/appcompat/widget/AppCompatSpinner;->MediaBrowserCompatCustomActionResultReceiver:Z

    .line 304
    iget-object p1, p0, Landroidx/appcompat/widget/AppCompatSpinner;->AudioAttributesImplBaseParcelizer:Landroid/widget/SpinnerAdapter;

    if-eqz p1, :cond_d4

    .line 305
    invoke-virtual {p0, p1}, Landroid/widget/AbsSpinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    .line 306
    iput-object v2, p0, Landroidx/appcompat/widget/AppCompatSpinner;->AudioAttributesImplBaseParcelizer:Landroid/widget/SpinnerAdapter;

    .line 309
    :cond_d4
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatSpinner;->read:Lo/addCancellable;

    invoke-virtual {p0, p2, p3}, Lo/addCancellable;->IconCompatParcelizer(Landroid/util/AttributeSet;I)V

    return-void
.end method


# virtual methods
.method IconCompatParcelizer(Landroid/widget/SpinnerAdapter;Landroid/graphics/drawable/Drawable;)I
    .registers 13

    const/4 v0, 0x0

    if-nez p1, :cond_4

    return v0

    .line 574
    :cond_4
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v1

    invoke-static {v1, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v1

    .line 576
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v2

    invoke-static {v2, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v2

    .line 580
    invoke-virtual {p0}, Landroid/widget/AdapterView;->getSelectedItemPosition()I

    move-result v3

    invoke-static {v0, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    .line 581
    invoke-interface {p1}, Landroid/widget/SpinnerAdapter;->getCount()I

    move-result v4

    add-int/lit8 v5, v3, 0xf

    invoke-static {v4, v5}, Ljava/lang/Math;->min(II)I

    move-result v4

    sub-int v5, v4, v3

    rsub-int/lit8 v5, v5, 0xf

    sub-int/2addr v3, v5

    .line 583
    invoke-static {v0, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    const/4 v5, 0x0

    move v6, v3

    move-object v7, v5

    move v3, v0

    :goto_33
    if-ge v6, v4, :cond_5e

    .line 585
    invoke-interface {p1, v6}, Landroid/widget/SpinnerAdapter;->getItemViewType(I)I

    move-result v8

    if-eq v8, v3, :cond_3d

    move-object v7, v5

    move v3, v8

    .line 590
    :cond_3d
    invoke-interface {p1, v6, v7, p0}, Landroid/widget/SpinnerAdapter;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v7

    .line 591
    invoke-virtual {v7}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v8

    if-nez v8, :cond_50

    .line 592
    new-instance v8, Landroid/view/ViewGroup$LayoutParams;

    const/4 v9, -0x2

    invoke-direct {v8, v9, v9}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v7, v8}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 596
    :cond_50
    invoke-virtual {v7, v1, v2}, Landroid/view/View;->measure(II)V

    .line 597
    invoke-virtual {v7}, Landroid/view/View;->getMeasuredWidth()I

    move-result v8

    invoke-static {v0, v8}, Ljava/lang/Math;->max(II)I

    move-result v0

    add-int/lit8 v6, v6, 0x1

    goto :goto_33

    :cond_5e
    if-eqz p2, :cond_6f

    .line 602
    iget-object p1, p0, Landroidx/appcompat/widget/AppCompatSpinner;->IconCompatParcelizer:Landroid/graphics/Rect;

    invoke-virtual {p2, p1}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    .line 603
    iget-object p1, p0, Landroidx/appcompat/widget/AppCompatSpinner;->IconCompatParcelizer:Landroid/graphics/Rect;

    iget p1, p1, Landroid/graphics/Rect;->left:I

    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatSpinner;->IconCompatParcelizer:Landroid/graphics/Rect;

    iget p0, p0, Landroid/graphics/Rect;->right:I

    add-int/2addr p1, p0

    add-int/2addr v0, p1

    :cond_6f
    return v0
.end method

.method IconCompatParcelizer()V
    .registers 3

    .line 616
    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatSpinner;->AudioAttributesImplApi21Parcelizer:Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatCustomActionResultReceiver;

    invoke-static {p0}, Landroidx/appcompat/widget/AppCompatSpinner$AudioAttributesCompatParcelizer;->write(Landroid/view/View;)I

    move-result v1

    invoke-static {p0}, Landroidx/appcompat/widget/AppCompatSpinner$AudioAttributesCompatParcelizer;->RemoteActionCompatParcelizer(Landroid/view/View;)I

    move-result p0

    invoke-interface {v0, v1, p0}, Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatCustomActionResultReceiver;->IconCompatParcelizer(II)V

    return-void
.end method

.method protected drawableStateChanged()V
    .registers 1

    .line 559
    invoke-super {p0}, Landroid/widget/Spinner;->drawableStateChanged()V

    .line 560
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatSpinner;->read:Lo/addCancellable;

    if-eqz p0, :cond_a

    .line 561
    invoke-virtual {p0}, Lo/addCancellable;->read()V

    :cond_a
    return-void
.end method

.method public getDropDownHorizontalOffset()I
    .registers 2

    .line 381
    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatSpinner;->AudioAttributesImplApi21Parcelizer:Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatCustomActionResultReceiver;

    if-eqz v0, :cond_9

    .line 382
    invoke-interface {v0}, Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatCustomActionResultReceiver;->AudioAttributesCompatParcelizer()I

    move-result p0

    return p0

    .line 384
    :cond_9
    invoke-super {p0}, Landroid/widget/Spinner;->getDropDownHorizontalOffset()I

    move-result p0

    return p0
.end method

.method public getDropDownVerticalOffset()I
    .registers 2

    .line 355
    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatSpinner;->AudioAttributesImplApi21Parcelizer:Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatCustomActionResultReceiver;

    if-eqz v0, :cond_9

    .line 356
    invoke-interface {v0}, Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatCustomActionResultReceiver;->IconCompatParcelizer()I

    move-result p0

    return p0

    .line 358
    :cond_9
    invoke-super {p0}, Landroid/widget/Spinner;->getDropDownVerticalOffset()I

    move-result p0

    return p0
.end method

.method public getDropDownWidth()I
    .registers 2

    .line 400
    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatSpinner;->AudioAttributesImplApi21Parcelizer:Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatCustomActionResultReceiver;

    if-eqz v0, :cond_7

    .line 401
    iget p0, p0, Landroidx/appcompat/widget/AppCompatSpinner;->AudioAttributesCompatParcelizer:I

    return p0

    .line 403
    :cond_7
    invoke-super {p0}, Landroid/widget/Spinner;->getDropDownWidth()I

    move-result p0

    return p0
.end method

.method public getPopupBackground()Landroid/graphics/drawable/Drawable;
    .registers 2

    .line 336
    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatSpinner;->AudioAttributesImplApi21Parcelizer:Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatCustomActionResultReceiver;

    if-eqz v0, :cond_9

    .line 337
    invoke-interface {v0}, Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatCustomActionResultReceiver;->RemoteActionCompatParcelizer()Landroid/graphics/drawable/Drawable;

    move-result-object p0

    return-object p0

    .line 339
    :cond_9
    invoke-super {p0}, Landroid/widget/Spinner;->getPopupBackground()Landroid/graphics/drawable/Drawable;

    move-result-object p0

    return-object p0
.end method

.method public getPopupContext()Landroid/content/Context;
    .registers 1

    .line 317
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatSpinner;->AudioAttributesImplApi26Parcelizer:Landroid/content/Context;

    return-object p0
.end method

.method public getPrompt()Ljava/lang/CharSequence;
    .registers 2

    .line 480
    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatSpinner;->AudioAttributesImplApi21Parcelizer:Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatCustomActionResultReceiver;

    if-eqz v0, :cond_9

    invoke-interface {v0}, Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatCustomActionResultReceiver;->read()Ljava/lang/CharSequence;

    move-result-object p0

    return-object p0

    :cond_9
    invoke-super {p0}, Landroid/widget/Spinner;->getPrompt()Ljava/lang/CharSequence;

    move-result-object p0

    return-object p0
.end method

.method protected onDetachedFromWindow()V
    .registers 2

    .line 427
    invoke-super {p0}, Landroid/widget/Spinner;->onDetachedFromWindow()V

    .line 429
    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatSpinner;->AudioAttributesImplApi21Parcelizer:Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatCustomActionResultReceiver;

    if-eqz v0, :cond_12

    invoke-interface {v0}, Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatCustomActionResultReceiver;->MediaBrowserCompatCustomActionResultReceiver()Z

    move-result v0

    if-eqz v0, :cond_12

    .line 430
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatSpinner;->AudioAttributesImplApi21Parcelizer:Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatCustomActionResultReceiver;

    invoke-interface {p0}, Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatCustomActionResultReceiver;->write()V

    :cond_12
    return-void
.end method

.method protected onMeasure(II)V
    .registers 5

    .line 444
    invoke-super {p0, p1, p2}, Landroid/widget/Spinner;->onMeasure(II)V

    .line 446
    iget-object p2, p0, Landroidx/appcompat/widget/AppCompatSpinner;->AudioAttributesImplApi21Parcelizer:Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatCustomActionResultReceiver;

    if-eqz p2, :cond_32

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result p2

    const/high16 v0, -0x80000000

    if-ne p2, v0, :cond_32

    .line 447
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result p2

    .line 449
    invoke-virtual {p0}, Landroid/widget/AbsSpinner;->getAdapter()Landroid/widget/SpinnerAdapter;

    move-result-object v0

    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Landroidx/appcompat/widget/AppCompatSpinner;->IconCompatParcelizer(Landroid/widget/SpinnerAdapter;Landroid/graphics/drawable/Drawable;)I

    move-result v0

    .line 448
    invoke-static {p2, v0}, Ljava/lang/Math;->max(II)I

    move-result p2

    .line 450
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    .line 448
    invoke-static {p2, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    .line 451
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result p2

    .line 448
    invoke-virtual {p0, p1, p2}, Landroidx/appcompat/widget/AppCompatSpinner;->setMeasuredDimension(II)V

    :cond_32
    return-void
.end method

.method public onRestoreInstanceState(Landroid/os/Parcelable;)V
    .registers 3

    .line 633
    check-cast p1, Landroidx/appcompat/widget/AppCompatSpinner$SavedState;

    .line 635
    invoke-virtual {p1}, Landroid/view/AbsSavedState;->getSuperState()Landroid/os/Parcelable;

    move-result-object v0

    invoke-super {p0, v0}, Landroid/widget/Spinner;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 637
    iget-boolean p1, p1, Landroidx/appcompat/widget/AppCompatSpinner$SavedState;->IconCompatParcelizer:Z

    if-eqz p1, :cond_1b

    .line 638
    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object p1

    if-eqz p1, :cond_1b

    .line 640
    new-instance v0, Landroidx/appcompat/widget/AppCompatSpinner$4;

    invoke-direct {v0, p0}, Landroidx/appcompat/widget/AppCompatSpinner$4;-><init>(Landroidx/appcompat/widget/AppCompatSpinner;)V

    .line 656
    invoke-virtual {p1, v0}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    :cond_1b
    return-void
.end method

.method public onSaveInstanceState()Landroid/os/Parcelable;
    .registers 3

    .line 626
    new-instance v0, Landroidx/appcompat/widget/AppCompatSpinner$SavedState;

    invoke-super {p0}, Landroid/widget/Spinner;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v1

    invoke-direct {v0, v1}, Landroidx/appcompat/widget/AppCompatSpinner$SavedState;-><init>(Landroid/os/Parcelable;)V

    .line 627
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatSpinner;->AudioAttributesImplApi21Parcelizer:Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatCustomActionResultReceiver;

    if-eqz p0, :cond_15

    invoke-interface {p0}, Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatCustomActionResultReceiver;->MediaBrowserCompatCustomActionResultReceiver()Z

    move-result p0

    if-eqz p0, :cond_15

    const/4 p0, 0x1

    goto :goto_16

    :cond_15
    const/4 p0, 0x0

    :goto_16
    iput-boolean p0, v0, Landroidx/appcompat/widget/AppCompatSpinner$SavedState;->IconCompatParcelizer:Z

    return-object v0
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .registers 3

    .line 436
    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatSpinner;->write:Lo/ActivityResult;

    if-eqz v0, :cond_c

    invoke-virtual {v0, p0, p1}, Lo/ActivityResult;->onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z

    move-result v0

    if-eqz v0, :cond_c

    const/4 p0, 0x1

    return p0

    .line 439
    :cond_c
    invoke-super {p0, p1}, Landroid/widget/Spinner;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p0

    return p0
.end method

.method public performClick()Z
    .registers 2

    .line 457
    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatSpinner;->AudioAttributesImplApi21Parcelizer:Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatCustomActionResultReceiver;

    if-eqz v0, :cond_f

    .line 459
    invoke-interface {v0}, Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatCustomActionResultReceiver;->MediaBrowserCompatCustomActionResultReceiver()Z

    move-result v0

    if-nez v0, :cond_d

    .line 460
    invoke-virtual {p0}, Landroidx/appcompat/widget/AppCompatSpinner;->IconCompatParcelizer()V

    :cond_d
    const/4 p0, 0x1

    return p0

    .line 466
    :cond_f
    invoke-super {p0}, Landroid/widget/Spinner;->performClick()Z

    move-result p0

    return p0
.end method

.method public bridge synthetic setAdapter(Landroid/widget/Adapter;)V
    .registers 2

    .line 82
    check-cast p1, Landroid/widget/SpinnerAdapter;

    invoke-virtual {p0, p1}, Landroid/widget/AbsSpinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    return-void
.end method

.method public setAdapter(Landroid/widget/SpinnerAdapter;)V
    .registers 4

    .line 412
    iget-boolean v0, p0, Landroidx/appcompat/widget/AppCompatSpinner;->MediaBrowserCompatCustomActionResultReceiver:Z

    if-nez v0, :cond_7

    .line 413
    iput-object p1, p0, Landroidx/appcompat/widget/AppCompatSpinner;->AudioAttributesImplBaseParcelizer:Landroid/widget/SpinnerAdapter;

    return-void

    .line 417
    :cond_7
    invoke-super {p0, p1}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    .line 419
    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatSpinner;->AudioAttributesImplApi21Parcelizer:Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatCustomActionResultReceiver;

    if-eqz v0, :cond_24

    .line 420
    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatSpinner;->AudioAttributesImplApi26Parcelizer:Landroid/content/Context;

    if-nez v0, :cond_16

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 421
    :cond_16
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatSpinner;->AudioAttributesImplApi21Parcelizer:Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatCustomActionResultReceiver;

    new-instance v1, Landroidx/appcompat/widget/AppCompatSpinner$write;

    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v0

    invoke-direct {v1, p1, v0}, Landroidx/appcompat/widget/AppCompatSpinner$write;-><init>(Landroid/widget/SpinnerAdapter;Landroid/content/res/Resources$Theme;)V

    invoke-interface {p0, v1}, Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatCustomActionResultReceiver;->RemoteActionCompatParcelizer(Landroid/widget/ListAdapter;)V

    :cond_24
    return-void
.end method

.method public setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
    .registers 2

    .line 493
    invoke-super {p0, p1}, Landroid/widget/Spinner;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 494
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatSpinner;->read:Lo/addCancellable;

    if-eqz p0, :cond_a

    .line 495
    invoke-virtual {p0, p1}, Lo/addCancellable;->AudioAttributesCompatParcelizer(Landroid/graphics/drawable/Drawable;)V

    :cond_a
    return-void
.end method

.method public setBackgroundResource(I)V
    .registers 2

    .line 485
    invoke-super {p0, p1}, Landroid/widget/Spinner;->setBackgroundResource(I)V

    .line 486
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatSpinner;->read:Lo/addCancellable;

    if-eqz p0, :cond_a

    .line 487
    invoke-virtual {p0, p1}, Lo/addCancellable;->write(I)V

    :cond_a
    return-void
.end method

.method public setDropDownHorizontalOffset(I)V
    .registers 3

    .line 365
    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatSpinner;->AudioAttributesImplApi21Parcelizer:Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatCustomActionResultReceiver;

    if-eqz v0, :cond_d

    .line 366
    invoke-interface {v0, p1}, Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatCustomActionResultReceiver;->RemoteActionCompatParcelizer(I)V

    .line 367
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatSpinner;->AudioAttributesImplApi21Parcelizer:Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatCustomActionResultReceiver;

    invoke-interface {p0, p1}, Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatCustomActionResultReceiver;->write(I)V

    return-void

    .line 369
    :cond_d
    invoke-super {p0, p1}, Landroid/widget/Spinner;->setDropDownHorizontalOffset(I)V

    return-void
.end method

.method public setDropDownVerticalOffset(I)V
    .registers 3

    .line 346
    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatSpinner;->AudioAttributesImplApi21Parcelizer:Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatCustomActionResultReceiver;

    if-eqz v0, :cond_8

    .line 347
    invoke-interface {v0, p1}, Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatCustomActionResultReceiver;->IconCompatParcelizer(I)V

    return-void

    .line 349
    :cond_8
    invoke-super {p0, p1}, Landroid/widget/Spinner;->setDropDownVerticalOffset(I)V

    return-void
.end method

.method public setDropDownWidth(I)V
    .registers 3

    .line 391
    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatSpinner;->AudioAttributesImplApi21Parcelizer:Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatCustomActionResultReceiver;

    if-eqz v0, :cond_7

    .line 392
    iput p1, p0, Landroidx/appcompat/widget/AppCompatSpinner;->AudioAttributesCompatParcelizer:I

    return-void

    .line 394
    :cond_7
    invoke-super {p0, p1}, Landroid/widget/Spinner;->setDropDownWidth(I)V

    return-void
.end method

.method public setPopupBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
    .registers 3

    .line 322
    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatSpinner;->AudioAttributesImplApi21Parcelizer:Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatCustomActionResultReceiver;

    if-eqz v0, :cond_8

    .line 323
    invoke-interface {v0, p1}, Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatCustomActionResultReceiver;->write(Landroid/graphics/drawable/Drawable;)V

    return-void

    .line 325
    :cond_8
    invoke-super {p0, p1}, Landroid/widget/Spinner;->setPopupBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setPopupBackgroundResource(I)V
    .registers 3

    .line 331
    invoke-virtual {p0}, Landroidx/appcompat/widget/AppCompatSpinner;->getPopupContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Lo/getDefaultViewModelCreationExtras;->write(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/AppCompatSpinner;->setPopupBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setPrompt(Ljava/lang/CharSequence;)V
    .registers 3

    .line 471
    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatSpinner;->AudioAttributesImplApi21Parcelizer:Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatCustomActionResultReceiver;

    if-eqz v0, :cond_8

    .line 472
    invoke-interface {v0, p1}, Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatCustomActionResultReceiver;->RemoteActionCompatParcelizer(Ljava/lang/CharSequence;)V

    return-void

    .line 474
    :cond_8
    invoke-super {p0, p1}, Landroid/widget/Spinner;->setPrompt(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setSupportBackgroundTintList(Landroid/content/res/ColorStateList;)V
    .registers 2

    .line 509
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatSpinner;->read:Lo/addCancellable;

    if-eqz p0, :cond_7

    .line 510
    invoke-virtual {p0, p1}, Lo/addCancellable;->AudioAttributesCompatParcelizer(Landroid/content/res/ColorStateList;)V

    :cond_7
    return-void
.end method

.method public setSupportBackgroundTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .registers 2

    .line 538
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatSpinner;->read:Lo/addCancellable;

    if-eqz p0, :cond_7

    .line 539
    invoke-virtual {p0, p1}, Lo/addCancellable;->RemoteActionCompatParcelizer(Landroid/graphics/PorterDuff$Mode;)V

    :cond_7
    return-void
.end method

.method final write()Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatCustomActionResultReceiver;
    .registers 1

    .line 611
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatSpinner;->AudioAttributesImplApi21Parcelizer:Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatCustomActionResultReceiver;

    return-object p0
.end method

###### Class androidx.appcompat.widget.AppCompatSpinner.AnonymousClass4 (androidx.appcompat.widget.AppCompatSpinner$4)
.class Landroidx/appcompat/widget/AppCompatSpinner$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/appcompat/widget/AppCompatSpinner;->onRestoreInstanceState(Landroid/os/Parcelable;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic RemoteActionCompatParcelizer:Landroidx/appcompat/widget/AppCompatSpinner;


# direct methods
.method constructor <init>(Landroidx/appcompat/widget/AppCompatSpinner;)V
    .registers 2

    .line 640
    iput-object p1, p0, Landroidx/appcompat/widget/AppCompatSpinner$4;->RemoteActionCompatParcelizer:Landroidx/appcompat/widget/AppCompatSpinner;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onGlobalLayout()V
    .registers 2

    .line 643
    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatSpinner$4;->RemoteActionCompatParcelizer:Landroidx/appcompat/widget/AppCompatSpinner;

    invoke-virtual {v0}, Landroidx/appcompat/widget/AppCompatSpinner;->write()Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatCustomActionResultReceiver;

    move-result-object v0

    invoke-interface {v0}, Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatCustomActionResultReceiver;->MediaBrowserCompatCustomActionResultReceiver()Z

    move-result v0

    if-nez v0, :cond_11

    .line 644
    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatSpinner$4;->RemoteActionCompatParcelizer:Landroidx/appcompat/widget/AppCompatSpinner;

    invoke-virtual {v0}, Landroidx/appcompat/widget/AppCompatSpinner;->IconCompatParcelizer()V

    .line 646
    :cond_11
    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatSpinner$4;->RemoteActionCompatParcelizer:Landroidx/appcompat/widget/AppCompatSpinner;

    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    if-eqz v0, :cond_1c

    .line 649
    invoke-static {v0, p0}, Landroidx/appcompat/widget/AppCompatSpinner$RemoteActionCompatParcelizer;->AudioAttributesCompatParcelizer(Landroid/view/ViewTreeObserver;Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    :cond_1c
    return-void
.end method

###### Class androidx.appcompat.widget.AppCompatSpinner.AnonymousClass5 (androidx.appcompat.widget.AppCompatSpinner$5)
.class Landroidx/appcompat/widget/AppCompatSpinner$5;
.super Lo/ActivityResult;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/appcompat/widget/AppCompatSpinner;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILandroid/content/res/Resources$Theme;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatItemReceiver;

.field final synthetic read:Landroidx/appcompat/widget/AppCompatSpinner;


# direct methods
.method constructor <init>(Landroidx/appcompat/widget/AppCompatSpinner;Landroid/view/View;Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatItemReceiver;)V
    .registers 4

    .line 272
    iput-object p1, p0, Landroidx/appcompat/widget/AppCompatSpinner$5;->read:Landroidx/appcompat/widget/AppCompatSpinner;

    iput-object p3, p0, Landroidx/appcompat/widget/AppCompatSpinner$5;->AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatItemReceiver;

    invoke-direct {p0, p2}, Lo/ActivityResult;-><init>(Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public AudioAttributesCompatParcelizer()Lo/removeOnContextAvailableListener;
    .registers 1

    .line 275
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatSpinner$5;->AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatItemReceiver;

    return-object p0
.end method

.method public read()Z
    .registers 2

    .line 281
    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatSpinner$5;->read:Landroidx/appcompat/widget/AppCompatSpinner;

    invoke-virtual {v0}, Landroidx/appcompat/widget/AppCompatSpinner;->write()Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatCustomActionResultReceiver;

    move-result-object v0

    invoke-interface {v0}, Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatCustomActionResultReceiver;->MediaBrowserCompatCustomActionResultReceiver()Z

    move-result v0

    if-nez v0, :cond_11

    .line 282
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatSpinner$5;->read:Landroidx/appcompat/widget/AppCompatSpinner;

    invoke-virtual {p0}, Landroidx/appcompat/widget/AppCompatSpinner;->IconCompatParcelizer()V

    :cond_11
    const/4 p0, 0x1

    return p0
.end method

###### Class androidx.appcompat.widget.AppCompatSpinner.AudioAttributesCompatParcelizer (androidx.appcompat.widget.AppCompatSpinner$AudioAttributesCompatParcelizer)
.class final Landroidx/appcompat/widget/AppCompatSpinner$AudioAttributesCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/widget/AppCompatSpinner;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "AudioAttributesCompatParcelizer"
.end annotation


# direct methods
.method static AudioAttributesCompatParcelizer(Landroid/view/View;I)V
    .registers 2

    .line 1162
    invoke-virtual {p0, p1}, Landroid/view/View;->setTextDirection(I)V

    return-void
.end method

.method static RemoteActionCompatParcelizer(Landroid/view/View;)I
    .registers 1

    .line 1147
    invoke-virtual {p0}, Landroid/view/View;->getTextAlignment()I

    move-result p0

    return p0
.end method

.method static RemoteActionCompatParcelizer(Landroid/view/View;I)V
    .registers 2

    .line 1152
    invoke-virtual {p0, p1}, Landroid/view/View;->setTextAlignment(I)V

    return-void
.end method

.method static write(Landroid/view/View;)I
    .registers 1

    .line 1157
    invoke-virtual {p0}, Landroid/view/View;->getTextDirection()I

    move-result p0

    return p0
.end method

###### Class androidx.appcompat.widget.AppCompatSpinner.IconCompatParcelizer (androidx.appcompat.widget.AppCompatSpinner$IconCompatParcelizer)
.class final Landroidx/appcompat/widget/AppCompatSpinner$IconCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/widget/AppCompatSpinner;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "IconCompatParcelizer"
.end annotation


# direct methods
.method static RemoteActionCompatParcelizer(Landroid/widget/ThemedSpinnerAdapter;Landroid/content/res/Resources$Theme;)V
    .registers 3

    .line 1133
    invoke-interface {p0}, Landroid/widget/ThemedSpinnerAdapter;->getDropDownViewTheme()Landroid/content/res/Resources$Theme;

    move-result-object v0

    invoke-static {v0, p1}, Lo/configureFromStringCreator;->RemoteActionCompatParcelizer(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_d

    .line 1134
    invoke-interface {p0, p1}, Landroid/widget/ThemedSpinnerAdapter;->setDropDownViewTheme(Landroid/content/res/Resources$Theme;)V

    :cond_d
    return-void
.end method

###### Class androidx.appcompat.widget.AppCompatSpinner.MediaBrowserCompatCustomActionResultReceiver (androidx.appcompat.widget.AppCompatSpinner$MediaBrowserCompatCustomActionResultReceiver)
.class interface abstract Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatCustomActionResultReceiver;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/widget/AppCompatSpinner;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x608
    name = "MediaBrowserCompatCustomActionResultReceiver"
.end annotation


# virtual methods
.method public abstract AudioAttributesCompatParcelizer()I
.end method

.method public abstract IconCompatParcelizer()I
.end method

.method public abstract IconCompatParcelizer(I)V
.end method

.method public abstract IconCompatParcelizer(II)V
.end method

.method public abstract MediaBrowserCompatCustomActionResultReceiver()Z
.end method

.method public abstract RemoteActionCompatParcelizer()Landroid/graphics/drawable/Drawable;
.end method

.method public abstract RemoteActionCompatParcelizer(I)V
.end method

.method public abstract RemoteActionCompatParcelizer(Landroid/widget/ListAdapter;)V
.end method

.method public abstract RemoteActionCompatParcelizer(Ljava/lang/CharSequence;)V
.end method

.method public abstract read()Ljava/lang/CharSequence;
.end method

.method public abstract write()V
.end method

.method public abstract write(I)V
.end method

.method public abstract write(Landroid/graphics/drawable/Drawable;)V
.end method

###### Class androidx.appcompat.widget.AppCompatSpinner.MediaBrowserCompatItemReceiver (androidx.appcompat.widget.AppCompatSpinner$MediaBrowserCompatItemReceiver)
.class Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatItemReceiver;
.super Landroidx/appcompat/widget/ListPopupWindow;
.source "SourceFile"

# interfaces
.implements Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatCustomActionResultReceiver;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/widget/AppCompatSpinner;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "MediaBrowserCompatItemReceiver"
.end annotation


# instance fields
.field private AudioAttributesImplApi26Parcelizer:Ljava/lang/CharSequence;

.field private AudioAttributesImplBaseParcelizer:I

.field private final MediaBrowserCompatItemReceiver:Landroid/graphics/Rect;

.field final synthetic RemoteActionCompatParcelizer:Landroidx/appcompat/widget/AppCompatSpinner;

.field write:Landroid/widget/ListAdapter;


# direct methods
.method public constructor <init>(Landroidx/appcompat/widget/AppCompatSpinner;Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 5

    .line 974
    iput-object p1, p0, Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatItemReceiver;->RemoteActionCompatParcelizer:Landroidx/appcompat/widget/AppCompatSpinner;

    .line 975
    invoke-direct {p0, p2, p3, p4}, Landroidx/appcompat/widget/ListPopupWindow;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 971
    new-instance p2, Landroid/graphics/Rect;

    invoke-direct {p2}, Landroid/graphics/Rect;-><init>()V

    iput-object p2, p0, Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatItemReceiver;->MediaBrowserCompatItemReceiver:Landroid/graphics/Rect;

    .line 977
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/ListPopupWindow;->RemoteActionCompatParcelizer(Landroid/view/View;)V

    const/4 p2, 0x1

    .line 978
    invoke-virtual {p0, p2}, Landroidx/appcompat/widget/ListPopupWindow;->IconCompatParcelizer(Z)V

    const/4 p2, 0x0

    .line 979
    invoke-virtual {p0, p2}, Landroidx/appcompat/widget/ListPopupWindow;->AudioAttributesImplBaseParcelizer(I)V

    .line 981
    new-instance p2, Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatItemReceiver$4;

    invoke-direct {p2, p0, p1}, Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatItemReceiver$4;-><init>(Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatItemReceiver;Landroidx/appcompat/widget/AppCompatSpinner;)V

    invoke-virtual {p0, p2}, Landroidx/appcompat/widget/ListPopupWindow;->write(Landroid/widget/AdapterView$OnItemClickListener;)V

    return-void
.end method

.method static synthetic read(Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatItemReceiver;)V
    .registers 1

    .line 968
    invoke-super {p0}, Landroidx/appcompat/widget/ListPopupWindow;->AudioAttributesImplBaseParcelizer()V

    return-void
.end method


# virtual methods
.method AudioAttributesCompatParcelizer(Landroid/view/View;)Z
    .registers 3

    .line 1108
    invoke-static {p1}, Lo/InvalidTypeIdException;->onPlayFromSearch(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_10

    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatItemReceiver;->MediaBrowserCompatItemReceiver:Landroid/graphics/Rect;

    invoke-virtual {p1, p0}, Landroid/view/View;->getGlobalVisibleRect(Landroid/graphics/Rect;)Z

    move-result p0

    if-eqz p0, :cond_10

    const/4 p0, 0x1

    return p0

    :cond_10
    const/4 p0, 0x0

    return p0
.end method

.method public AudioAttributesImplApi21Parcelizer()I
    .registers 1

    .line 1118
    iget p0, p0, Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatItemReceiver;->AudioAttributesImplBaseParcelizer:I

    return p0
.end method

.method public IconCompatParcelizer(II)V
    .registers 6

    .line 1051
    invoke-virtual {p0}, Landroidx/appcompat/widget/ListPopupWindow;->MediaBrowserCompatCustomActionResultReceiver()Z

    move-result v0

    .line 1053
    invoke-virtual {p0}, Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatItemReceiver;->MediaBrowserCompatItemReceiver()V

    const/4 v1, 0x2

    .line 1055
    invoke-virtual {p0, v1}, Landroidx/appcompat/widget/ListPopupWindow;->MediaBrowserCompatItemReceiver(I)V

    .line 1056
    invoke-super {p0}, Landroidx/appcompat/widget/ListPopupWindow;->AudioAttributesImplBaseParcelizer()V

    .line 1057
    invoke-virtual {p0}, Landroidx/appcompat/widget/ListPopupWindow;->a_()Landroid/widget/ListView;

    move-result-object v1

    const/4 v2, 0x1

    .line 1058
    invoke-virtual {v1, v2}, Landroid/widget/ListView;->setChoiceMode(I)V

    .line 1060
    invoke-static {v1, p1}, Landroidx/appcompat/widget/AppCompatSpinner$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer(Landroid/view/View;I)V

    .line 1061
    invoke-static {v1, p2}, Landroidx/appcompat/widget/AppCompatSpinner$AudioAttributesCompatParcelizer;->RemoteActionCompatParcelizer(Landroid/view/View;I)V

    .line 1063
    iget-object p1, p0, Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatItemReceiver;->RemoteActionCompatParcelizer:Landroidx/appcompat/widget/AppCompatSpinner;

    invoke-virtual {p1}, Landroid/widget/AdapterView;->getSelectedItemPosition()I

    move-result p1

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/ListPopupWindow;->AudioAttributesImplApi26Parcelizer(I)V

    if-nez v0, :cond_3f

    .line 1074
    iget-object p1, p0, Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatItemReceiver;->RemoteActionCompatParcelizer:Landroidx/appcompat/widget/AppCompatSpinner;

    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object p1

    if-eqz p1, :cond_3f

    .line 1076
    new-instance p2, Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatItemReceiver$2;

    invoke-direct {p2, p0}, Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatItemReceiver$2;-><init>(Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatItemReceiver;)V

    .line 1091
    invoke-virtual {p1, p2}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 1092
    new-instance p1, Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatItemReceiver$3;

    invoke-direct {p1, p0, p2}, Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatItemReceiver$3;-><init>(Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatItemReceiver;Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/ListPopupWindow;->IconCompatParcelizer(Landroid/widget/PopupWindow$OnDismissListener;)V

    :cond_3f
    return-void
.end method

.method MediaBrowserCompatItemReceiver()V
    .registers 8

    .line 1012
    invoke-virtual {p0}, Landroidx/appcompat/widget/ListPopupWindow;->RemoteActionCompatParcelizer()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_24

    .line 1015
    iget-object v1, p0, Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatItemReceiver;->RemoteActionCompatParcelizer:Landroidx/appcompat/widget/AppCompatSpinner;

    iget-object v1, v1, Landroidx/appcompat/widget/AppCompatSpinner;->IconCompatParcelizer:Landroid/graphics/Rect;

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    .line 1016
    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatItemReceiver;->RemoteActionCompatParcelizer:Landroidx/appcompat/widget/AppCompatSpinner;

    invoke-static {v0}, Lo/setChecked;->AudioAttributesCompatParcelizer(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_1c

    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatItemReceiver;->RemoteActionCompatParcelizer:Landroidx/appcompat/widget/AppCompatSpinner;

    iget-object v0, v0, Landroidx/appcompat/widget/AppCompatSpinner;->IconCompatParcelizer:Landroid/graphics/Rect;

    iget v0, v0, Landroid/graphics/Rect;->right:I

    goto :goto_32

    .line 1017
    :cond_1c
    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatItemReceiver;->RemoteActionCompatParcelizer:Landroidx/appcompat/widget/AppCompatSpinner;

    iget-object v0, v0, Landroidx/appcompat/widget/AppCompatSpinner;->IconCompatParcelizer:Landroid/graphics/Rect;

    iget v0, v0, Landroid/graphics/Rect;->left:I

    neg-int v0, v0

    goto :goto_32

    .line 1019
    :cond_24
    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatItemReceiver;->RemoteActionCompatParcelizer:Landroidx/appcompat/widget/AppCompatSpinner;

    iget-object v0, v0, Landroidx/appcompat/widget/AppCompatSpinner;->IconCompatParcelizer:Landroid/graphics/Rect;

    iget-object v1, p0, Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatItemReceiver;->RemoteActionCompatParcelizer:Landroidx/appcompat/widget/AppCompatSpinner;

    iget-object v1, v1, Landroidx/appcompat/widget/AppCompatSpinner;->IconCompatParcelizer:Landroid/graphics/Rect;

    const/4 v2, 0x0

    iput v2, v1, Landroid/graphics/Rect;->right:I

    iput v2, v0, Landroid/graphics/Rect;->left:I

    move v0, v2

    .line 1022
    :goto_32
    iget-object v1, p0, Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatItemReceiver;->RemoteActionCompatParcelizer:Landroidx/appcompat/widget/AppCompatSpinner;

    invoke-virtual {v1}, Landroid/view/View;->getPaddingLeft()I

    move-result v1

    .line 1023
    iget-object v2, p0, Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatItemReceiver;->RemoteActionCompatParcelizer:Landroidx/appcompat/widget/AppCompatSpinner;

    invoke-virtual {v2}, Landroid/view/View;->getPaddingRight()I

    move-result v2

    .line 1024
    iget-object v3, p0, Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatItemReceiver;->RemoteActionCompatParcelizer:Landroidx/appcompat/widget/AppCompatSpinner;

    invoke-virtual {v3}, Landroid/view/View;->getWidth()I

    move-result v3

    .line 1025
    iget-object v4, p0, Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatItemReceiver;->RemoteActionCompatParcelizer:Landroidx/appcompat/widget/AppCompatSpinner;

    iget v4, v4, Landroidx/appcompat/widget/AppCompatSpinner;->AudioAttributesCompatParcelizer:I

    const/4 v5, -0x2

    if-ne v4, v5, :cond_85

    .line 1026
    iget-object v4, p0, Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatItemReceiver;->RemoteActionCompatParcelizer:Landroidx/appcompat/widget/AppCompatSpinner;

    iget-object v5, p0, Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatItemReceiver;->write:Landroid/widget/ListAdapter;

    check-cast v5, Landroid/widget/SpinnerAdapter;

    .line 1027
    invoke-virtual {p0}, Landroidx/appcompat/widget/ListPopupWindow;->RemoteActionCompatParcelizer()Landroid/graphics/drawable/Drawable;

    move-result-object v6

    .line 1026
    invoke-virtual {v4, v5, v6}, Landroidx/appcompat/widget/AppCompatSpinner;->IconCompatParcelizer(Landroid/widget/SpinnerAdapter;Landroid/graphics/drawable/Drawable;)I

    move-result v4

    .line 1028
    iget-object v5, p0, Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatItemReceiver;->RemoteActionCompatParcelizer:Landroidx/appcompat/widget/AppCompatSpinner;

    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    .line 1029
    invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v5

    iget v5, v5, Landroid/util/DisplayMetrics;->widthPixels:I

    iget-object v6, p0, Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatItemReceiver;->RemoteActionCompatParcelizer:Landroidx/appcompat/widget/AppCompatSpinner;

    iget-object v6, v6, Landroidx/appcompat/widget/AppCompatSpinner;->IconCompatParcelizer:Landroid/graphics/Rect;

    iget v6, v6, Landroid/graphics/Rect;->left:I

    sub-int/2addr v5, v6

    iget-object v6, p0, Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatItemReceiver;->RemoteActionCompatParcelizer:Landroidx/appcompat/widget/AppCompatSpinner;

    iget-object v6, v6, Landroidx/appcompat/widget/AppCompatSpinner;->IconCompatParcelizer:Landroid/graphics/Rect;

    iget v6, v6, Landroid/graphics/Rect;->right:I

    sub-int/2addr v5, v6

    if-le v4, v5, :cond_7a

    move v4, v5

    :cond_7a
    sub-int v5, v3, v1

    sub-int/2addr v5, v2

    .line 1033
    invoke-static {v4, v5}, Ljava/lang/Math;->max(II)I

    move-result v4

    invoke-virtual {p0, v4}, Landroidx/appcompat/widget/ListPopupWindow;->read(I)V

    goto :goto_9a

    .line 1035
    :cond_85
    iget-object v4, p0, Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatItemReceiver;->RemoteActionCompatParcelizer:Landroidx/appcompat/widget/AppCompatSpinner;

    iget v4, v4, Landroidx/appcompat/widget/AppCompatSpinner;->AudioAttributesCompatParcelizer:I

    const/4 v5, -0x1

    if-ne v4, v5, :cond_93

    sub-int v4, v3, v1

    sub-int/2addr v4, v2

    .line 1036
    invoke-virtual {p0, v4}, Landroidx/appcompat/widget/ListPopupWindow;->read(I)V

    goto :goto_9a

    .line 1038
    :cond_93
    iget-object v4, p0, Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatItemReceiver;->RemoteActionCompatParcelizer:Landroidx/appcompat/widget/AppCompatSpinner;

    iget v4, v4, Landroidx/appcompat/widget/AppCompatSpinner;->AudioAttributesCompatParcelizer:I

    invoke-virtual {p0, v4}, Landroidx/appcompat/widget/ListPopupWindow;->read(I)V

    .line 1040
    :goto_9a
    iget-object v4, p0, Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatItemReceiver;->RemoteActionCompatParcelizer:Landroidx/appcompat/widget/AppCompatSpinner;

    invoke-static {v4}, Lo/setChecked;->AudioAttributesCompatParcelizer(Landroid/view/View;)Z

    move-result v4

    if-eqz v4, :cond_af

    .line 1041
    invoke-virtual {p0}, Landroidx/appcompat/widget/ListPopupWindow;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()I

    move-result v1

    sub-int/2addr v3, v2

    sub-int/2addr v3, v1

    .line 1042
    invoke-virtual {p0}, Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatItemReceiver;->AudioAttributesImplApi21Parcelizer()I

    move-result v1

    sub-int/2addr v3, v1

    add-int/2addr v0, v3

    goto :goto_b5

    .line 1044
    :cond_af
    invoke-virtual {p0}, Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatItemReceiver;->AudioAttributesImplApi21Parcelizer()I

    move-result v2

    add-int/2addr v1, v2

    add-int/2addr v0, v1

    .line 1046
    :goto_b5
    invoke-virtual {p0, v0}, Landroidx/appcompat/widget/ListPopupWindow;->write(I)V

    return-void
.end method

.method public RemoteActionCompatParcelizer(I)V
    .registers 2

    .line 1113
    iput p1, p0, Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatItemReceiver;->AudioAttributesImplBaseParcelizer:I

    return-void
.end method

.method public RemoteActionCompatParcelizer(Landroid/widget/ListAdapter;)V
    .registers 2

    .line 996
    invoke-super {p0, p1}, Landroidx/appcompat/widget/ListPopupWindow;->RemoteActionCompatParcelizer(Landroid/widget/ListAdapter;)V

    .line 997
    iput-object p1, p0, Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatItemReceiver;->write:Landroid/widget/ListAdapter;

    return-void
.end method

.method public RemoteActionCompatParcelizer(Ljava/lang/CharSequence;)V
    .registers 2

    .line 1008
    iput-object p1, p0, Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatItemReceiver;->AudioAttributesImplApi26Parcelizer:Ljava/lang/CharSequence;

    return-void
.end method

.method public read()Ljava/lang/CharSequence;
    .registers 1

    .line 1002
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatItemReceiver;->AudioAttributesImplApi26Parcelizer:Ljava/lang/CharSequence;

    return-object p0
.end method

###### Class androidx.appcompat.widget.AppCompatSpinner.MediaBrowserCompatItemReceiver.AnonymousClass2 (androidx.appcompat.widget.AppCompatSpinner$MediaBrowserCompatItemReceiver$2)
.class Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatItemReceiver$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatItemReceiver;->IconCompatParcelizer(II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatItemReceiver;


# direct methods
.method constructor <init>(Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatItemReceiver;)V
    .registers 2

    .line 1077
    iput-object p1, p0, Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatItemReceiver$2;->AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatItemReceiver;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onGlobalLayout()V
    .registers 3

    .line 1080
    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatItemReceiver$2;->AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatItemReceiver;

    iget-object v1, v0, Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatItemReceiver;->RemoteActionCompatParcelizer:Landroidx/appcompat/widget/AppCompatSpinner;

    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatItemReceiver;->AudioAttributesCompatParcelizer(Landroid/view/View;)Z

    move-result v0

    if-nez v0, :cond_10

    .line 1081
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatItemReceiver$2;->AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatItemReceiver;

    invoke-virtual {p0}, Landroidx/appcompat/widget/ListPopupWindow;->write()V

    return-void

    .line 1083
    :cond_10
    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatItemReceiver$2;->AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatItemReceiver;

    invoke-virtual {v0}, Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatItemReceiver;->MediaBrowserCompatItemReceiver()V

    .line 1087
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatItemReceiver$2;->AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatItemReceiver;

    invoke-static {p0}, Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatItemReceiver;->read(Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatItemReceiver;)V

    return-void
.end method

###### Class androidx.appcompat.widget.AppCompatSpinner.MediaBrowserCompatItemReceiver.AnonymousClass3 (androidx.appcompat.widget.AppCompatSpinner$MediaBrowserCompatItemReceiver$3)
.class Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatItemReceiver$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/PopupWindow$OnDismissListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatItemReceiver;->IconCompatParcelizer(II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic AudioAttributesCompatParcelizer:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

.field final synthetic write:Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatItemReceiver;


# direct methods
.method constructor <init>(Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatItemReceiver;Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V
    .registers 3

    .line 1092
    iput-object p1, p0, Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatItemReceiver$3;->write:Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatItemReceiver;

    iput-object p2, p0, Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatItemReceiver$3;->AudioAttributesCompatParcelizer:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onDismiss()V
    .registers 2

    .line 1095
    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatItemReceiver$3;->write:Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatItemReceiver;

    iget-object v0, v0, Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatItemReceiver;->RemoteActionCompatParcelizer:Landroidx/appcompat/widget/AppCompatSpinner;

    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    if-eqz v0, :cond_f

    .line 1097
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatItemReceiver$3;->AudioAttributesCompatParcelizer:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    :cond_f
    return-void
.end method

###### Class androidx.appcompat.widget.AppCompatSpinner.MediaBrowserCompatItemReceiver.AnonymousClass4 (androidx.appcompat.widget.AppCompatSpinner$MediaBrowserCompatItemReceiver$4)
.class Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatItemReceiver$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatItemReceiver;-><init>(Landroidx/appcompat/widget/AppCompatSpinner;Landroid/content/Context;Landroid/util/AttributeSet;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/AppCompatSpinner;

.field final synthetic RemoteActionCompatParcelizer:Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatItemReceiver;


# direct methods
.method constructor <init>(Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatItemReceiver;Landroidx/appcompat/widget/AppCompatSpinner;)V
    .registers 3

    .line 981
    iput-object p1, p0, Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatItemReceiver$4;->RemoteActionCompatParcelizer:Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatItemReceiver;

    iput-object p2, p0, Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatItemReceiver$4;->AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/AppCompatSpinner;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView<",
            "*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    .line 984
    iget-object p1, p0, Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatItemReceiver$4;->RemoteActionCompatParcelizer:Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatItemReceiver;

    iget-object p1, p1, Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatItemReceiver;->RemoteActionCompatParcelizer:Landroidx/appcompat/widget/AppCompatSpinner;

    invoke-virtual {p1, p3}, Landroid/widget/AdapterView;->setSelection(I)V

    .line 985
    iget-object p1, p0, Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatItemReceiver$4;->RemoteActionCompatParcelizer:Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatItemReceiver;

    iget-object p1, p1, Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatItemReceiver;->RemoteActionCompatParcelizer:Landroidx/appcompat/widget/AppCompatSpinner;

    invoke-virtual {p1}, Landroid/widget/AdapterView;->getOnItemClickListener()Landroid/widget/AdapterView$OnItemClickListener;

    move-result-object p1

    if-eqz p1, :cond_20

    .line 986
    iget-object p1, p0, Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatItemReceiver$4;->RemoteActionCompatParcelizer:Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatItemReceiver;

    iget-object p1, p1, Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatItemReceiver;->RemoteActionCompatParcelizer:Landroidx/appcompat/widget/AppCompatSpinner;

    iget-object p4, p0, Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatItemReceiver$4;->RemoteActionCompatParcelizer:Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatItemReceiver;

    iget-object p4, p4, Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatItemReceiver;->write:Landroid/widget/ListAdapter;

    .line 987
    invoke-interface {p4, p3}, Landroid/widget/ListAdapter;->getItemId(I)J

    move-result-wide p4

    invoke-virtual {p1, p2, p3, p4, p5}, Landroid/widget/AdapterView;->performItemClick(Landroid/view/View;IJ)Z

    .line 989
    :cond_20
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatItemReceiver$4;->RemoteActionCompatParcelizer:Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatItemReceiver;

    invoke-virtual {p0}, Landroidx/appcompat/widget/ListPopupWindow;->write()V

    return-void
.end method

###### Class androidx.appcompat.widget.AppCompatSpinner.RemoteActionCompatParcelizer (androidx.appcompat.widget.AppCompatSpinner$RemoteActionCompatParcelizer)
.class final Landroidx/appcompat/widget/AppCompatSpinner$RemoteActionCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/widget/AppCompatSpinner;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "RemoteActionCompatParcelizer"
.end annotation


# direct methods
.method static AudioAttributesCompatParcelizer(Landroid/view/ViewTreeObserver;Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V
    .registers 2

    .line 1177
    invoke-virtual {p0, p1}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    return-void
.end method

###### Class androidx.appcompat.widget.AppCompatSpinner.SavedState (androidx.appcompat.widget.AppCompatSpinner$SavedState)
.class Landroidx/appcompat/widget/AppCompatSpinner$SavedState;
.super Landroid/view/View$BaseSavedState;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/widget/AppCompatSpinner;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "SavedState"
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Landroidx/appcompat/widget/AppCompatSpinner$SavedState;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field IconCompatParcelizer:Z


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 679
    new-instance v0, Landroidx/appcompat/widget/AppCompatSpinner$SavedState$1;

    invoke-direct {v0}, Landroidx/appcompat/widget/AppCompatSpinner$SavedState$1;-><init>()V

    sput-object v0, Landroidx/appcompat/widget/AppCompatSpinner$SavedState;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(Landroid/os/Parcel;)V
    .registers 2

    .line 669
    invoke-direct {p0, p1}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcel;)V

    .line 670
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result p1

    if-eqz p1, :cond_b

    const/4 p1, 0x1

    goto :goto_c

    :cond_b
    const/4 p1, 0x0

    :goto_c
    iput-boolean p1, p0, Landroidx/appcompat/widget/AppCompatSpinner$SavedState;->IconCompatParcelizer:Z

    return-void
.end method

.method constructor <init>(Landroid/os/Parcelable;)V
    .registers 2

    .line 665
    invoke-direct {p0, p1}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcelable;)V

    return-void
.end method


# virtual methods
.method public writeToParcel(Landroid/os/Parcel;I)V
    .registers 3

    .line 675
    invoke-super {p0, p1, p2}, Landroid/view/View$BaseSavedState;->writeToParcel(Landroid/os/Parcel;I)V

    .line 676
    iget-boolean p0, p0, Landroidx/appcompat/widget/AppCompatSpinner$SavedState;->IconCompatParcelizer:Z

    int-to-byte p0, p0

    invoke-virtual {p1, p0}, Landroid/os/Parcel;->writeByte(B)V

    return-void
.end method

###### Class androidx.appcompat.widget.AppCompatSpinner.SavedState.AnonymousClass1 (androidx.appcompat.widget.AppCompatSpinner$SavedState$1)
.class Landroidx/appcompat/widget/AppCompatSpinner$SavedState$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/widget/AppCompatSpinner$SavedState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Landroidx/appcompat/widget/AppCompatSpinner$SavedState;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .registers 1

    .line 680
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public AudioAttributesCompatParcelizer(I)[Landroidx/appcompat/widget/AppCompatSpinner$SavedState;
    .registers 2

    .line 688
    new-array p0, p1, [Landroidx/appcompat/widget/AppCompatSpinner$SavedState;

    return-object p0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .registers 2

    .line 680
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/AppCompatSpinner$SavedState$1;->write(Landroid/os/Parcel;)Landroidx/appcompat/widget/AppCompatSpinner$SavedState;

    move-result-object p0

    return-object p0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .registers 2

    .line 680
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/AppCompatSpinner$SavedState$1;->AudioAttributesCompatParcelizer(I)[Landroidx/appcompat/widget/AppCompatSpinner$SavedState;

    move-result-object p0

    return-object p0
.end method

.method public write(Landroid/os/Parcel;)Landroidx/appcompat/widget/AppCompatSpinner$SavedState;
    .registers 2

    .line 683
    new-instance p0, Landroidx/appcompat/widget/AppCompatSpinner$SavedState;

    invoke-direct {p0, p1}, Landroidx/appcompat/widget/AppCompatSpinner$SavedState;-><init>(Landroid/os/Parcel;)V

    return-object p0
.end method

###### Class androidx.appcompat.widget.AppCompatSpinner.read (androidx.appcompat.widget.AppCompatSpinner$read)
.class Landroidx/appcompat/widget/AppCompatSpinner$read;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/appcompat/widget/AppCompatSpinner$MediaBrowserCompatCustomActionResultReceiver;
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/widget/AppCompatSpinner;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "read"
.end annotation


# instance fields
.field private IconCompatParcelizer:Landroid/widget/ListAdapter;

.field RemoteActionCompatParcelizer:Lo/createFullyDrawnExecutor;

.field private read:Ljava/lang/CharSequence;

.field final synthetic write:Landroidx/appcompat/widget/AppCompatSpinner;


# direct methods
.method constructor <init>(Landroidx/appcompat/widget/AppCompatSpinner;)V
    .registers 2

    .line 864
    iput-object p1, p0, Landroidx/appcompat/widget/AppCompatSpinner$read;->write:Landroidx/appcompat/widget/AppCompatSpinner;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public AudioAttributesCompatParcelizer()I
    .registers 1

    const/4 p0, 0x0

    return p0
.end method

.method public IconCompatParcelizer()I
    .registers 1

    const/4 p0, 0x0

    return p0
.end method

.method public IconCompatParcelizer(I)V
    .registers 2

    return-void
.end method

.method public IconCompatParcelizer(II)V
    .registers 6

    .line 900
    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatSpinner$read;->IconCompatParcelizer:Landroid/widget/ListAdapter;

    if-nez v0, :cond_5

    return-void

    .line 903
    :cond_5
    new-instance v0, Lo/createFullyDrawnExecutor$AudioAttributesCompatParcelizer;

    iget-object v1, p0, Landroidx/appcompat/widget/AppCompatSpinner$read;->write:Landroidx/appcompat/widget/AppCompatSpinner;

    invoke-virtual {v1}, Landroidx/appcompat/widget/AppCompatSpinner;->getPopupContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/createFullyDrawnExecutor$AudioAttributesCompatParcelizer;-><init>(Landroid/content/Context;)V

    .line 904
    iget-object v1, p0, Landroidx/appcompat/widget/AppCompatSpinner$read;->read:Ljava/lang/CharSequence;

    if-eqz v1, :cond_17

    .line 905
    invoke-virtual {v0, v1}, Lo/createFullyDrawnExecutor$AudioAttributesCompatParcelizer;->setTitle(Ljava/lang/CharSequence;)Lo/createFullyDrawnExecutor$AudioAttributesCompatParcelizer;

    .line 907
    :cond_17
    iget-object v1, p0, Landroidx/appcompat/widget/AppCompatSpinner$read;->IconCompatParcelizer:Landroid/widget/ListAdapter;

    iget-object v2, p0, Landroidx/appcompat/widget/AppCompatSpinner$read;->write:Landroidx/appcompat/widget/AppCompatSpinner;

    .line 908
    invoke-virtual {v2}, Landroid/widget/AdapterView;->getSelectedItemPosition()I

    move-result v2

    .line 907
    invoke-virtual {v0, v1, v2, p0}, Lo/createFullyDrawnExecutor$AudioAttributesCompatParcelizer;->IconCompatParcelizer(Landroid/widget/ListAdapter;ILandroid/content/DialogInterface$OnClickListener;)Lo/createFullyDrawnExecutor$AudioAttributesCompatParcelizer;

    move-result-object v0

    .line 908
    invoke-virtual {v0}, Lo/createFullyDrawnExecutor$AudioAttributesCompatParcelizer;->create()Lo/createFullyDrawnExecutor;

    move-result-object v0

    iput-object v0, p0, Landroidx/appcompat/widget/AppCompatSpinner$read;->RemoteActionCompatParcelizer:Lo/createFullyDrawnExecutor;

    .line 909
    invoke-virtual {v0}, Lo/createFullyDrawnExecutor;->IconCompatParcelizer()Landroid/widget/ListView;

    move-result-object v0

    .line 911
    invoke-static {v0, p1}, Landroidx/appcompat/widget/AppCompatSpinner$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer(Landroid/view/View;I)V

    .line 912
    invoke-static {v0, p2}, Landroidx/appcompat/widget/AppCompatSpinner$AudioAttributesCompatParcelizer;->RemoteActionCompatParcelizer(Landroid/view/View;I)V

    .line 914
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatSpinner$read;->RemoteActionCompatParcelizer:Lo/createFullyDrawnExecutor;

    invoke-virtual {p0}, Landroid/app/Dialog;->show()V

    return-void
.end method

.method public MediaBrowserCompatCustomActionResultReceiver()Z
    .registers 1

    .line 880
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatSpinner$read;->RemoteActionCompatParcelizer:Lo/createFullyDrawnExecutor;

    if-eqz p0, :cond_9

    invoke-virtual {p0}, Landroid/app/Dialog;->isShowing()Z

    move-result p0

    return p0

    :cond_9
    const/4 p0, 0x0

    return p0
.end method

.method public RemoteActionCompatParcelizer()Landroid/graphics/drawable/Drawable;
    .registers 1

    const/4 p0, 0x0

    return-object p0
.end method

.method public RemoteActionCompatParcelizer(I)V
    .registers 2

    return-void
.end method

.method public RemoteActionCompatParcelizer(Landroid/widget/ListAdapter;)V
    .registers 2

    .line 885
    iput-object p1, p0, Landroidx/appcompat/widget/AppCompatSpinner$read;->IconCompatParcelizer:Landroid/widget/ListAdapter;

    return-void
.end method

.method public RemoteActionCompatParcelizer(Ljava/lang/CharSequence;)V
    .registers 2

    .line 890
    iput-object p1, p0, Landroidx/appcompat/widget/AppCompatSpinner$read;->read:Ljava/lang/CharSequence;

    return-void
.end method

.method public onClick(Landroid/content/DialogInterface;I)V
    .registers 6

    .line 919
    iget-object p1, p0, Landroidx/appcompat/widget/AppCompatSpinner$read;->write:Landroidx/appcompat/widget/AppCompatSpinner;

    invoke-virtual {p1, p2}, Landroid/widget/AdapterView;->setSelection(I)V

    .line 920
    iget-object p1, p0, Landroidx/appcompat/widget/AppCompatSpinner$read;->write:Landroidx/appcompat/widget/AppCompatSpinner;

    invoke-virtual {p1}, Landroid/widget/AdapterView;->getOnItemClickListener()Landroid/widget/AdapterView$OnItemClickListener;

    move-result-object p1

    if-eqz p1, :cond_19

    .line 921
    iget-object p1, p0, Landroidx/appcompat/widget/AppCompatSpinner$read;->write:Landroidx/appcompat/widget/AppCompatSpinner;

    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatSpinner$read;->IconCompatParcelizer:Landroid/widget/ListAdapter;

    invoke-interface {v0, p2}, Landroid/widget/ListAdapter;->getItemId(I)J

    move-result-wide v0

    const/4 v2, 0x0

    invoke-virtual {p1, v2, p2, v0, v1}, Landroid/widget/AdapterView;->performItemClick(Landroid/view/View;IJ)Z

    .line 923
    :cond_19
    invoke-virtual {p0}, Landroidx/appcompat/widget/AppCompatSpinner$read;->write()V

    return-void
.end method

.method public read()Ljava/lang/CharSequence;
    .registers 1

    .line 895
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatSpinner$read;->read:Ljava/lang/CharSequence;

    return-object p0
.end method

.method public write()V
    .registers 2

    .line 872
    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatSpinner$read;->RemoteActionCompatParcelizer:Lo/createFullyDrawnExecutor;

    if-eqz v0, :cond_a

    .line 873
    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    const/4 v0, 0x0

    .line 874
    iput-object v0, p0, Landroidx/appcompat/widget/AppCompatSpinner$read;->RemoteActionCompatParcelizer:Lo/createFullyDrawnExecutor;

    :cond_a
    return-void
.end method

.method public write(I)V
    .registers 2

    return-void
.end method

.method public write(Landroid/graphics/drawable/Drawable;)V
    .registers 2

    return-void
.end method

###### Class androidx.appcompat.widget.AppCompatSpinner.write (androidx.appcompat.widget.AppCompatSpinner$write)
.class Landroidx/appcompat/widget/AppCompatSpinner$write;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/ListAdapter;
.implements Landroid/widget/SpinnerAdapter;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/widget/AppCompatSpinner;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "write"
.end annotation


# instance fields
.field private RemoteActionCompatParcelizer:Landroid/widget/ListAdapter;

.field private read:Landroid/widget/SpinnerAdapter;


# direct methods
.method public constructor <init>(Landroid/widget/SpinnerAdapter;Landroid/content/res/Resources$Theme;)V
    .registers 4

    .line 711
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 712
    iput-object p1, p0, Landroidx/appcompat/widget/AppCompatSpinner$write;->read:Landroid/widget/SpinnerAdapter;

    .line 714
    instance-of v0, p1, Landroid/widget/ListAdapter;

    if-eqz v0, :cond_e

    .line 715
    move-object v0, p1

    check-cast v0, Landroid/widget/ListAdapter;

    iput-object v0, p0, Landroidx/appcompat/widget/AppCompatSpinner$write;->RemoteActionCompatParcelizer:Landroid/widget/ListAdapter;

    :cond_e
    if-eqz p2, :cond_20

    .line 719
    instance-of p0, p1, Landroid/widget/ThemedSpinnerAdapter;

    if-eqz p0, :cond_1a

    .line 721
    check-cast p1, Landroid/widget/ThemedSpinnerAdapter;

    .line 723
    invoke-static {p1, p2}, Landroidx/appcompat/widget/AppCompatSpinner$IconCompatParcelizer;->RemoteActionCompatParcelizer(Landroid/widget/ThemedSpinnerAdapter;Landroid/content/res/Resources$Theme;)V

    return-void

    .line 724
    :cond_1a
    instance-of p0, p1, Lo/setBackgroundResource;

    if-eqz p0, :cond_20

    .line 725
    check-cast p1, Lo/setBackgroundResource;

    :cond_20
    return-void
.end method


# virtual methods
.method public areAllItemsEnabled()Z
    .registers 1

    .line 784
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatSpinner$write;->RemoteActionCompatParcelizer:Landroid/widget/ListAdapter;

    if-eqz p0, :cond_9

    .line 786
    invoke-interface {p0}, Landroid/widget/ListAdapter;->areAllItemsEnabled()Z

    move-result p0

    return p0

    :cond_9
    const/4 p0, 0x1

    return p0
.end method

.method public getCount()I
    .registers 1

    .line 735
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatSpinner$write;->read:Landroid/widget/SpinnerAdapter;

    if-nez p0, :cond_6

    const/4 p0, 0x0

    return p0

    :cond_6
    invoke-interface {p0}, Landroid/widget/SpinnerAdapter;->getCount()I

    move-result p0

    return p0
.end method

.method public getDropDownView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .registers 4

    .line 755
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatSpinner$write;->read:Landroid/widget/SpinnerAdapter;

    if-nez p0, :cond_6

    const/4 p0, 0x0

    return-object p0

    .line 756
    :cond_6
    invoke-interface {p0, p1, p2, p3}, Landroid/widget/SpinnerAdapter;->getDropDownView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public getItem(I)Ljava/lang/Object;
    .registers 2

    .line 740
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatSpinner$write;->read:Landroid/widget/SpinnerAdapter;

    if-nez p0, :cond_6

    const/4 p0, 0x0

    return-object p0

    :cond_6
    invoke-interface {p0, p1}, Landroid/widget/SpinnerAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public getItemId(I)J
    .registers 2

    .line 745
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatSpinner$write;->read:Landroid/widget/SpinnerAdapter;

    if-nez p0, :cond_7

    const-wide/16 p0, -0x1

    return-wide p0

    :cond_7
    invoke-interface {p0, p1}, Landroid/widget/SpinnerAdapter;->getItemId(I)J

    move-result-wide p0

    return-wide p0
.end method

.method public getItemViewType(I)I
    .registers 2

    const/4 p0, 0x0

    return p0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .registers 4

    .line 750
    invoke-virtual {p0, p1, p2, p3}, Landroidx/appcompat/widget/AppCompatSpinner$write;->getDropDownView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public getViewTypeCount()I
    .registers 1

    const/4 p0, 0x1

    return p0
.end method

.method public hasStableIds()Z
    .registers 1

    .line 761
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatSpinner$write;->read:Landroid/widget/SpinnerAdapter;

    if-eqz p0, :cond_c

    invoke-interface {p0}, Landroid/widget/SpinnerAdapter;->hasStableIds()Z

    move-result p0

    if-eqz p0, :cond_c

    const/4 p0, 0x1

    return p0

    :cond_c
    const/4 p0, 0x0

    return p0
.end method

.method public isEmpty()Z
    .registers 1

    .line 818
    invoke-virtual {p0}, Landroidx/appcompat/widget/AppCompatSpinner$write;->getCount()I

    move-result p0

    if-nez p0, :cond_8

    const/4 p0, 0x1

    return p0

    :cond_8
    const/4 p0, 0x0

    return p0
.end method

.method public isEnabled(I)Z
    .registers 2

    .line 798
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatSpinner$write;->RemoteActionCompatParcelizer:Landroid/widget/ListAdapter;

    if-eqz p0, :cond_9

    .line 800
    invoke-interface {p0, p1}, Landroid/widget/ListAdapter;->isEnabled(I)Z

    move-result p0

    return p0

    :cond_9
    const/4 p0, 0x1

    return p0
.end method

.method public registerDataSetObserver(Landroid/database/DataSetObserver;)V
    .registers 2

    .line 766
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatSpinner$write;->read:Landroid/widget/SpinnerAdapter;

    if-eqz p0, :cond_7

    .line 767
    invoke-interface {p0, p1}, Landroid/widget/SpinnerAdapter;->registerDataSetObserver(Landroid/database/DataSetObserver;)V

    :cond_7
    return-void
.end method

.method public unregisterDataSetObserver(Landroid/database/DataSetObserver;)V
    .registers 2

    .line 773
    iget-object p0, p0, Landroidx/appcompat/widget/AppCompatSpinner$write;->read:Landroid/widget/SpinnerAdapter;

    if-eqz p0, :cond_7

    .line 774
    invoke-interface {p0, p1}, Landroid/widget/SpinnerAdapter;->unregisterDataSetObserver(Landroid/database/DataSetObserver;)V

    :cond_7
    return-void
.end method
