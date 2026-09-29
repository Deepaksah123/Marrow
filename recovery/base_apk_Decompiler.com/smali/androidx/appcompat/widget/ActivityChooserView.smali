###### Class androidx.appcompat.widget.ActivityChooserView (androidx.appcompat.widget.ActivityChooserView)
.class public Landroidx/appcompat/widget/ActivityChooserView;
.super Landroid/view/ViewGroup;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/appcompat/widget/ActivityChooserView$read;,
        Landroidx/appcompat/widget/ActivityChooserView$AudioAttributesCompatParcelizer;,
        Landroidx/appcompat/widget/ActivityChooserView$InnerLayout;
    }
.end annotation


# instance fields
.field final AudioAttributesCompatParcelizer:Landroid/widget/FrameLayout;

.field private final AudioAttributesImplApi21Parcelizer:Landroid/view/View;

.field AudioAttributesImplApi26Parcelizer:Landroid/widget/PopupWindow$OnDismissListener;

.field final AudioAttributesImplBaseParcelizer:Landroid/database/DataSetObserver;

.field final IconCompatParcelizer:Landroid/widget/FrameLayout;

.field MediaBrowserCompatCustomActionResultReceiver:Lo/ThrowableDeserializer;

.field private final MediaBrowserCompatItemReceiver:Landroid/graphics/drawable/Drawable;

.field private MediaBrowserCompatMediaItem:Z

.field private MediaBrowserCompatSearchResultReceiver:I

.field private final MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:I

.field private final MediaDescriptionCompat:Landroidx/appcompat/widget/ActivityChooserView$AudioAttributesCompatParcelizer;

.field private final MediaMetadataCompat:Landroid/widget/ImageView;

.field private final RatingCompat:Landroid/widget/ImageView;

.field final RemoteActionCompatParcelizer:Landroidx/appcompat/widget/ActivityChooserView$read;

.field private final handleMediaPlayPauseIfPendingOnHandler:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

.field private onCustomAction:Landroidx/appcompat/widget/ListPopupWindow;

.field read:I

.field write:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 3

    const/4 v0, 0x0

    .line 201
    invoke-direct {p0, p1, v0}, Landroidx/appcompat/widget/ActivityChooserView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 4

    const/4 v0, 0x0

    .line 211
    invoke-direct {p0, p1, p2, v0}, Landroidx/appcompat/widget/ActivityChooserView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 14

    .line 223
    invoke-direct {p0, p1, p2, p3}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 135
    new-instance v0, Landroidx/appcompat/widget/ActivityChooserView$5;

    invoke-direct {v0, p0}, Landroidx/appcompat/widget/ActivityChooserView$5;-><init>(Landroidx/appcompat/widget/ActivityChooserView;)V

    iput-object v0, p0, Landroidx/appcompat/widget/ActivityChooserView;->AudioAttributesImplBaseParcelizer:Landroid/database/DataSetObserver;

    .line 149
    new-instance v0, Landroidx/appcompat/widget/ActivityChooserView$4;

    invoke-direct {v0, p0}, Landroidx/appcompat/widget/ActivityChooserView$4;-><init>(Landroidx/appcompat/widget/ActivityChooserView;)V

    iput-object v0, p0, Landroidx/appcompat/widget/ActivityChooserView;->handleMediaPlayPauseIfPendingOnHandler:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    const/4 v0, 0x4

    .line 183
    iput v0, p0, Landroidx/appcompat/widget/ActivityChooserView;->read:I

    .line 225
    sget-object v1, Lo/_init_lambda5$AudioAttributesImplApi26Parcelizer;->ActivityChooserView:[I

    const/4 v2, 0x0

    invoke-virtual {p1, p2, v1, p3, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v1

    .line 227
    sget-object v5, Lo/_init_lambda5$AudioAttributesImplApi26Parcelizer;->ActivityChooserView:[I

    const/4 v9, 0x0

    move-object v3, p0

    move-object v4, p1

    move-object v6, p2

    move-object v7, v1

    move v8, p3

    invoke-static/range {v3 .. v9}, Lo/InvalidTypeIdException;->IconCompatParcelizer(Landroid/view/View;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;II)V

    .line 230
    sget p2, Lo/_init_lambda5$AudioAttributesImplApi26Parcelizer;->ActivityChooserView_initialActivityCount:I

    invoke-virtual {v1, p2, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    iput p2, p0, Landroidx/appcompat/widget/ActivityChooserView;->read:I

    .line 234
    sget p2, Lo/_init_lambda5$AudioAttributesImplApi26Parcelizer;->ActivityChooserView_expandActivityOverflowButtonDrawable:I

    invoke-virtual {v1, p2}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    .line 237
    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    .line 239
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p3

    invoke-static {p3}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p3

    .line 240
    sget v0, Lo/_init_lambda5$MediaBrowserCompatCustomActionResultReceiver;->abc_activity_chooser_view:I

    const/4 v1, 0x1

    invoke-virtual {p3, v0, p0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 242
    new-instance p3, Landroidx/appcompat/widget/ActivityChooserView$AudioAttributesCompatParcelizer;

    invoke-direct {p3, p0}, Landroidx/appcompat/widget/ActivityChooserView$AudioAttributesCompatParcelizer;-><init>(Landroidx/appcompat/widget/ActivityChooserView;)V

    iput-object p3, p0, Landroidx/appcompat/widget/ActivityChooserView;->MediaDescriptionCompat:Landroidx/appcompat/widget/ActivityChooserView$AudioAttributesCompatParcelizer;

    .line 244
    sget v0, Lo/_init_lambda5$AudioAttributesImplBaseParcelizer;->activity_chooser_view_content:I

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Landroidx/appcompat/widget/ActivityChooserView;->AudioAttributesImplApi21Parcelizer:Landroid/view/View;

    .line 245
    invoke-virtual {v0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Landroidx/appcompat/widget/ActivityChooserView;->MediaBrowserCompatItemReceiver:Landroid/graphics/drawable/Drawable;

    .line 247
    sget v0, Lo/_init_lambda5$AudioAttributesImplBaseParcelizer;->default_activity_button:I

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    iput-object v0, p0, Landroidx/appcompat/widget/ActivityChooserView;->IconCompatParcelizer:Landroid/widget/FrameLayout;

    .line 248
    invoke-virtual {v0, p3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 249
    invoke-virtual {v0, p3}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 250
    sget v1, Lo/_init_lambda5$AudioAttributesImplBaseParcelizer;->image:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Landroidx/appcompat/widget/ActivityChooserView;->RatingCompat:Landroid/widget/ImageView;

    .line 252
    sget v0, Lo/_init_lambda5$AudioAttributesImplBaseParcelizer;->expand_activities_button:I

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    .line 253
    invoke-virtual {v0, p3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 254
    new-instance p3, Landroidx/appcompat/widget/ActivityChooserView$1;

    invoke-direct {p3, p0}, Landroidx/appcompat/widget/ActivityChooserView$1;-><init>(Landroidx/appcompat/widget/ActivityChooserView;)V

    invoke-virtual {v0, p3}, Landroid/widget/FrameLayout;->setAccessibilityDelegate(Landroid/view/View$AccessibilityDelegate;)V

    .line 261
    new-instance p3, Landroidx/appcompat/widget/ActivityChooserView$2;

    invoke-direct {p3, p0, v0}, Landroidx/appcompat/widget/ActivityChooserView$2;-><init>(Landroidx/appcompat/widget/ActivityChooserView;Landroid/view/View;)V

    invoke-virtual {v0, p3}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 279
    iput-object v0, p0, Landroidx/appcompat/widget/ActivityChooserView;->AudioAttributesCompatParcelizer:Landroid/widget/FrameLayout;

    .line 280
    sget p3, Lo/_init_lambda5$AudioAttributesImplBaseParcelizer;->image:I

    .line 281
    invoke-virtual {v0, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/ImageView;

    iput-object p3, p0, Landroidx/appcompat/widget/ActivityChooserView;->MediaMetadataCompat:Landroid/widget/ImageView;

    .line 282
    invoke-virtual {p3, p2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 284
    new-instance p2, Landroidx/appcompat/widget/ActivityChooserView$read;

    invoke-direct {p2, p0}, Landroidx/appcompat/widget/ActivityChooserView$read;-><init>(Landroidx/appcompat/widget/ActivityChooserView;)V

    iput-object p2, p0, Landroidx/appcompat/widget/ActivityChooserView;->RemoteActionCompatParcelizer:Landroidx/appcompat/widget/ActivityChooserView$read;

    .line 285
    new-instance p3, Landroidx/appcompat/widget/ActivityChooserView$3;

    invoke-direct {p3, p0}, Landroidx/appcompat/widget/ActivityChooserView$3;-><init>(Landroidx/appcompat/widget/ActivityChooserView;)V

    invoke-virtual {p2, p3}, Landroid/widget/BaseAdapter;->registerDataSetObserver(Landroid/database/DataSetObserver;)V

    .line 293
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    .line 294
    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p2

    iget p2, p2, Landroid/util/DisplayMetrics;->widthPixels:I

    div-int/lit8 p2, p2, 0x2

    sget p3, Lo/_init_lambda5$AudioAttributesCompatParcelizer;->abc_config_prefDialogWidth:I

    .line 295
    invoke-virtual {p1, p3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p1

    .line 294
    invoke-static {p2, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    iput p1, p0, Landroidx/appcompat/widget/ActivityChooserView;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:I

    return-void
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer()Z
    .registers 1

    .line 432
    invoke-virtual {p0}, Landroidx/appcompat/widget/ActivityChooserView;->IconCompatParcelizer()Landroidx/appcompat/widget/ListPopupWindow;

    move-result-object p0

    invoke-virtual {p0}, Landroidx/appcompat/widget/ListPopupWindow;->MediaBrowserCompatCustomActionResultReceiver()Z

    move-result p0

    return p0
.end method

.method final IconCompatParcelizer()Landroidx/appcompat/widget/ListPopupWindow;
    .registers 3

    .line 533
    iget-object v0, p0, Landroidx/appcompat/widget/ActivityChooserView;->onCustomAction:Landroidx/appcompat/widget/ListPopupWindow;

    if-nez v0, :cond_2d

    .line 534
    new-instance v0, Landroidx/appcompat/widget/ListPopupWindow;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroidx/appcompat/widget/ListPopupWindow;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Landroidx/appcompat/widget/ActivityChooserView;->onCustomAction:Landroidx/appcompat/widget/ListPopupWindow;

    .line 535
    iget-object v1, p0, Landroidx/appcompat/widget/ActivityChooserView;->RemoteActionCompatParcelizer:Landroidx/appcompat/widget/ActivityChooserView$read;

    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/ListPopupWindow;->RemoteActionCompatParcelizer(Landroid/widget/ListAdapter;)V

    .line 536
    iget-object v0, p0, Landroidx/appcompat/widget/ActivityChooserView;->onCustomAction:Landroidx/appcompat/widget/ListPopupWindow;

    invoke-virtual {v0, p0}, Landroidx/appcompat/widget/ListPopupWindow;->RemoteActionCompatParcelizer(Landroid/view/View;)V

    .line 537
    iget-object v0, p0, Landroidx/appcompat/widget/ActivityChooserView;->onCustomAction:Landroidx/appcompat/widget/ListPopupWindow;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/ListPopupWindow;->IconCompatParcelizer(Z)V

    .line 538
    iget-object v0, p0, Landroidx/appcompat/widget/ActivityChooserView;->onCustomAction:Landroidx/appcompat/widget/ListPopupWindow;

    iget-object v1, p0, Landroidx/appcompat/widget/ActivityChooserView;->MediaDescriptionCompat:Landroidx/appcompat/widget/ActivityChooserView$AudioAttributesCompatParcelizer;

    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/ListPopupWindow;->write(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 539
    iget-object v0, p0, Landroidx/appcompat/widget/ActivityChooserView;->onCustomAction:Landroidx/appcompat/widget/ListPopupWindow;

    iget-object v1, p0, Landroidx/appcompat/widget/ActivityChooserView;->MediaDescriptionCompat:Landroidx/appcompat/widget/ActivityChooserView$AudioAttributesCompatParcelizer;

    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/ListPopupWindow;->IconCompatParcelizer(Landroid/widget/PopupWindow$OnDismissListener;)V

    .line 541
    :cond_2d
    iget-object p0, p0, Landroidx/appcompat/widget/ActivityChooserView;->onCustomAction:Landroidx/appcompat/widget/ListPopupWindow;

    return-object p0
.end method

.method final IconCompatParcelizer(I)V
    .registers 7

    .line 371
    iget-object v0, p0, Landroidx/appcompat/widget/ActivityChooserView;->RemoteActionCompatParcelizer:Landroidx/appcompat/widget/ActivityChooserView$read;

    invoke-virtual {v0}, Landroidx/appcompat/widget/ActivityChooserView$read;->IconCompatParcelizer()Lo/removeOnNewIntentListener;

    move-result-object v0

    if-eqz v0, :cond_95

    .line 375
    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    iget-object v1, p0, Landroidx/appcompat/widget/ActivityChooserView;->handleMediaPlayPauseIfPendingOnHandler:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 377
    iget-object v0, p0, Landroidx/appcompat/widget/ActivityChooserView;->IconCompatParcelizer:Landroid/widget/FrameLayout;

    .line 378
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez v0, :cond_1d

    move v0, v1

    goto :goto_1e

    :cond_1d
    move v0, v2

    .line 380
    :goto_1e
    iget-object v3, p0, Landroidx/appcompat/widget/ActivityChooserView;->RemoteActionCompatParcelizer:Landroidx/appcompat/widget/ActivityChooserView$read;

    invoke-virtual {v3}, Landroidx/appcompat/widget/ActivityChooserView$read;->read()I

    move-result v3

    const v4, 0x7fffffff

    if-eq p1, v4, :cond_39

    add-int v4, p1, v0

    if-le v3, v4, :cond_39

    .line 384
    iget-object v3, p0, Landroidx/appcompat/widget/ActivityChooserView;->RemoteActionCompatParcelizer:Landroidx/appcompat/widget/ActivityChooserView$read;

    invoke-virtual {v3, v1}, Landroidx/appcompat/widget/ActivityChooserView$read;->AudioAttributesCompatParcelizer(Z)V

    .line 385
    iget-object v3, p0, Landroidx/appcompat/widget/ActivityChooserView;->RemoteActionCompatParcelizer:Landroidx/appcompat/widget/ActivityChooserView$read;

    sub-int/2addr p1, v1

    invoke-virtual {v3, p1}, Landroidx/appcompat/widget/ActivityChooserView$read;->write(I)V

    goto :goto_43

    .line 387
    :cond_39
    iget-object v3, p0, Landroidx/appcompat/widget/ActivityChooserView;->RemoteActionCompatParcelizer:Landroidx/appcompat/widget/ActivityChooserView$read;

    invoke-virtual {v3, v2}, Landroidx/appcompat/widget/ActivityChooserView$read;->AudioAttributesCompatParcelizer(Z)V

    .line 388
    iget-object v3, p0, Landroidx/appcompat/widget/ActivityChooserView;->RemoteActionCompatParcelizer:Landroidx/appcompat/widget/ActivityChooserView$read;

    invoke-virtual {v3, p1}, Landroidx/appcompat/widget/ActivityChooserView$read;->write(I)V

    .line 391
    :goto_43
    invoke-virtual {p0}, Landroidx/appcompat/widget/ActivityChooserView;->IconCompatParcelizer()Landroidx/appcompat/widget/ListPopupWindow;

    move-result-object p1

    .line 392
    invoke-virtual {p1}, Landroidx/appcompat/widget/ListPopupWindow;->MediaBrowserCompatCustomActionResultReceiver()Z

    move-result v3

    if-nez v3, :cond_94

    .line 393
    iget-boolean v3, p0, Landroidx/appcompat/widget/ActivityChooserView;->write:Z

    if-nez v3, :cond_59

    if-eqz v0, :cond_59

    .line 396
    iget-object v0, p0, Landroidx/appcompat/widget/ActivityChooserView;->RemoteActionCompatParcelizer:Landroidx/appcompat/widget/ActivityChooserView$read;

    invoke-virtual {v0, v2, v2}, Landroidx/appcompat/widget/ActivityChooserView$read;->read(ZZ)V

    goto :goto_5e

    .line 394
    :cond_59
    iget-object v3, p0, Landroidx/appcompat/widget/ActivityChooserView;->RemoteActionCompatParcelizer:Landroidx/appcompat/widget/ActivityChooserView$read;

    invoke-virtual {v3, v1, v0}, Landroidx/appcompat/widget/ActivityChooserView$read;->read(ZZ)V

    .line 398
    :goto_5e
    iget-object v0, p0, Landroidx/appcompat/widget/ActivityChooserView;->RemoteActionCompatParcelizer:Landroidx/appcompat/widget/ActivityChooserView$read;

    invoke-virtual {v0}, Landroidx/appcompat/widget/ActivityChooserView$read;->AudioAttributesImplApi21Parcelizer()I

    move-result v0

    iget v3, p0, Landroidx/appcompat/widget/ActivityChooserView;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:I

    invoke-static {v0, v3}, Ljava/lang/Math;->min(II)I

    move-result v0

    .line 399
    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/ListPopupWindow;->read(I)V

    .line 400
    invoke-virtual {p1}, Landroidx/appcompat/widget/ListPopupWindow;->AudioAttributesImplBaseParcelizer()V

    .line 401
    iget-object v0, p0, Landroidx/appcompat/widget/ActivityChooserView;->MediaBrowserCompatCustomActionResultReceiver:Lo/ThrowableDeserializer;

    if-eqz v0, :cond_77

    .line 402
    invoke-virtual {v0, v1}, Lo/ThrowableDeserializer;->RemoteActionCompatParcelizer(Z)V

    .line 404
    :cond_77
    invoke-virtual {p1}, Landroidx/appcompat/widget/ListPopupWindow;->a_()Landroid/widget/ListView;

    move-result-object v0

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p0

    sget v1, Lo/_init_lambda5$AudioAttributesImplApi21Parcelizer;->abc_activitychooserview_choose_application:I

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 406
    invoke-virtual {p1}, Landroidx/appcompat/widget/ListPopupWindow;->a_()Landroid/widget/ListView;

    move-result-object p0

    new-instance p1, Landroid/graphics/drawable/ColorDrawable;

    invoke-direct {p1, v2}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {p0, p1}, Landroid/widget/AbsListView;->setSelector(Landroid/graphics/drawable/Drawable;)V

    :cond_94
    return-void

    .line 372
    :cond_95
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "No data model. Did you call #setDataModel?"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public final RemoteActionCompatParcelizer()Z
    .registers 3

    .line 357
    invoke-virtual {p0}, Landroidx/appcompat/widget/ActivityChooserView;->AudioAttributesCompatParcelizer()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_14

    iget-boolean v0, p0, Landroidx/appcompat/widget/ActivityChooserView;->MediaBrowserCompatMediaItem:Z

    if-eqz v0, :cond_14

    .line 360
    iput-boolean v1, p0, Landroidx/appcompat/widget/ActivityChooserView;->write:Z

    .line 361
    iget v0, p0, Landroidx/appcompat/widget/ActivityChooserView;->read:I

    invoke-virtual {p0, v0}, Landroidx/appcompat/widget/ActivityChooserView;->IconCompatParcelizer(I)V

    const/4 p0, 0x1

    return p0

    :cond_14
    return v1
.end method

.method protected onAttachedToWindow()V
    .registers 3

    .line 437
    invoke-super {p0}, Landroid/view/ViewGroup;->onAttachedToWindow()V

    .line 438
    iget-object v0, p0, Landroidx/appcompat/widget/ActivityChooserView;->RemoteActionCompatParcelizer:Landroidx/appcompat/widget/ActivityChooserView$read;

    invoke-virtual {v0}, Landroidx/appcompat/widget/ActivityChooserView$read;->IconCompatParcelizer()Lo/removeOnNewIntentListener;

    move-result-object v0

    if-eqz v0, :cond_10

    .line 440
    iget-object v1, p0, Landroidx/appcompat/widget/ActivityChooserView;->AudioAttributesImplBaseParcelizer:Landroid/database/DataSetObserver;

    invoke-virtual {v0, v1}, Landroid/database/Observable;->registerObserver(Ljava/lang/Object;)V

    :cond_10
    const/4 v0, 0x1

    .line 442
    iput-boolean v0, p0, Landroidx/appcompat/widget/ActivityChooserView;->MediaBrowserCompatMediaItem:Z

    return-void
.end method

.method protected onDetachedFromWindow()V
    .registers 3

    .line 447
    invoke-super {p0}, Landroid/view/ViewGroup;->onDetachedFromWindow()V

    .line 448
    iget-object v0, p0, Landroidx/appcompat/widget/ActivityChooserView;->RemoteActionCompatParcelizer:Landroidx/appcompat/widget/ActivityChooserView$read;

    invoke-virtual {v0}, Landroidx/appcompat/widget/ActivityChooserView$read;->IconCompatParcelizer()Lo/removeOnNewIntentListener;

    move-result-object v0

    if-eqz v0, :cond_10

    .line 450
    iget-object v1, p0, Landroidx/appcompat/widget/ActivityChooserView;->AudioAttributesImplBaseParcelizer:Landroid/database/DataSetObserver;

    invoke-virtual {v0, v1}, Landroid/database/Observable;->unregisterObserver(Ljava/lang/Object;)V

    .line 452
    :cond_10
    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    .line 453
    invoke-virtual {v0}, Landroid/view/ViewTreeObserver;->isAlive()Z

    move-result v1

    if-eqz v1, :cond_1f

    .line 454
    iget-object v1, p0, Landroidx/appcompat/widget/ActivityChooserView;->handleMediaPlayPauseIfPendingOnHandler:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 456
    :cond_1f
    invoke-virtual {p0}, Landroidx/appcompat/widget/ActivityChooserView;->AudioAttributesCompatParcelizer()Z

    move-result v0

    if-eqz v0, :cond_28

    .line 457
    invoke-virtual {p0}, Landroidx/appcompat/widget/ActivityChooserView;->write()Z

    :cond_28
    const/4 v0, 0x0

    .line 459
    iput-boolean v0, p0, Landroidx/appcompat/widget/ActivityChooserView;->MediaBrowserCompatMediaItem:Z

    return-void
.end method

.method protected onLayout(ZIIII)V
    .registers 6

    .line 478
    iget-object p1, p0, Landroidx/appcompat/widget/ActivityChooserView;->AudioAttributesImplApi21Parcelizer:Landroid/view/View;

    sub-int/2addr p4, p2

    sub-int/2addr p5, p3

    const/4 p2, 0x0

    invoke-virtual {p1, p2, p2, p4, p5}, Landroid/view/View;->layout(IIII)V

    .line 479
    invoke-virtual {p0}, Landroidx/appcompat/widget/ActivityChooserView;->AudioAttributesCompatParcelizer()Z

    move-result p1

    if-nez p1, :cond_11

    .line 480
    invoke-virtual {p0}, Landroidx/appcompat/widget/ActivityChooserView;->write()Z

    :cond_11
    return-void
.end method

.method protected onMeasure(II)V
    .registers 5

    .line 464
    iget-object v0, p0, Landroidx/appcompat/widget/ActivityChooserView;->AudioAttributesImplApi21Parcelizer:Landroid/view/View;

    .line 468
    iget-object v1, p0, Landroidx/appcompat/widget/ActivityChooserView;->IconCompatParcelizer:Landroid/widget/FrameLayout;

    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    move-result v1

    if-eqz v1, :cond_14

    .line 469
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p2

    const/high16 v1, 0x40000000    # 2.0f

    invoke-static {p2, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p2

    .line 472
    :cond_14
    invoke-virtual {p0, v0, p1, p2}, Landroidx/appcompat/widget/ActivityChooserView;->measureChild(Landroid/view/View;II)V

    .line 473
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    move-result p1

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Landroidx/appcompat/widget/ActivityChooserView;->setMeasuredDimension(II)V

    return-void
.end method

.method final read()V
    .registers 5

    .line 549
    iget-object v0, p0, Landroidx/appcompat/widget/ActivityChooserView;->RemoteActionCompatParcelizer:Landroidx/appcompat/widget/ActivityChooserView$read;

    invoke-virtual {v0}, Landroidx/appcompat/widget/ActivityChooserView$read;->getCount()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-lez v0, :cond_10

    .line 550
    iget-object v0, p0, Landroidx/appcompat/widget/ActivityChooserView;->AudioAttributesCompatParcelizer:Landroid/widget/FrameLayout;

    invoke-virtual {v0, v2}, Landroid/view/View;->setEnabled(Z)V

    goto :goto_15

    .line 552
    :cond_10
    iget-object v0, p0, Landroidx/appcompat/widget/ActivityChooserView;->AudioAttributesCompatParcelizer:Landroid/widget/FrameLayout;

    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 555
    :goto_15
    iget-object v0, p0, Landroidx/appcompat/widget/ActivityChooserView;->RemoteActionCompatParcelizer:Landroidx/appcompat/widget/ActivityChooserView$read;

    invoke-virtual {v0}, Landroidx/appcompat/widget/ActivityChooserView$read;->read()I

    move-result v0

    .line 556
    iget-object v3, p0, Landroidx/appcompat/widget/ActivityChooserView;->RemoteActionCompatParcelizer:Landroidx/appcompat/widget/ActivityChooserView$read;

    invoke-virtual {v3}, Landroidx/appcompat/widget/ActivityChooserView$read;->AudioAttributesCompatParcelizer()I

    move-result v3

    if-eq v0, v2, :cond_2f

    if-le v0, v2, :cond_27

    if-gtz v3, :cond_2f

    .line 569
    :cond_27
    iget-object v0, p0, Landroidx/appcompat/widget/ActivityChooserView;->IconCompatParcelizer:Landroid/widget/FrameLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_66

    .line 558
    :cond_2f
    iget-object v0, p0, Landroidx/appcompat/widget/ActivityChooserView;->IconCompatParcelizer:Landroid/widget/FrameLayout;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 559
    iget-object v0, p0, Landroidx/appcompat/widget/ActivityChooserView;->RemoteActionCompatParcelizer:Landroidx/appcompat/widget/ActivityChooserView$read;

    invoke-virtual {v0}, Landroidx/appcompat/widget/ActivityChooserView$read;->write()Landroid/content/pm/ResolveInfo;

    move-result-object v0

    .line 560
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    .line 561
    iget-object v2, p0, Landroidx/appcompat/widget/ActivityChooserView;->RatingCompat:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/content/pm/ResolveInfo;->loadIcon(Landroid/content/pm/PackageManager;)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 562
    iget v2, p0, Landroidx/appcompat/widget/ActivityChooserView;->MediaBrowserCompatSearchResultReceiver:I

    if-eqz v2, :cond_66

    .line 563
    invoke-virtual {v0, v1}, Landroid/content/pm/ResolveInfo;->loadLabel(Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;

    move-result-object v0

    .line 564
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    iget v2, p0, Landroidx/appcompat/widget/ActivityChooserView;->MediaBrowserCompatSearchResultReceiver:I

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 566
    iget-object v1, p0, Landroidx/appcompat/widget/ActivityChooserView;->IconCompatParcelizer:Landroid/widget/FrameLayout;

    invoke-virtual {v1, v0}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 572
    :cond_66
    :goto_66
    iget-object v0, p0, Landroidx/appcompat/widget/ActivityChooserView;->IconCompatParcelizer:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_76

    .line 573
    iget-object v0, p0, Landroidx/appcompat/widget/ActivityChooserView;->AudioAttributesImplApi21Parcelizer:Landroid/view/View;

    iget-object p0, p0, Landroidx/appcompat/widget/ActivityChooserView;->MediaBrowserCompatItemReceiver:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p0}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void

    .line 575
    :cond_76
    iget-object p0, p0, Landroidx/appcompat/widget/ActivityChooserView;->AudioAttributesImplApi21Parcelizer:Landroid/view/View;

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setActivityChooserModel(Lo/removeOnNewIntentListener;)V
    .registers 3

    .line 305
    iget-object v0, p0, Landroidx/appcompat/widget/ActivityChooserView;->RemoteActionCompatParcelizer:Landroidx/appcompat/widget/ActivityChooserView$read;

    invoke-virtual {v0, p1}, Landroidx/appcompat/widget/ActivityChooserView$read;->IconCompatParcelizer(Lo/removeOnNewIntentListener;)V

    .line 306
    invoke-virtual {p0}, Landroidx/appcompat/widget/ActivityChooserView;->AudioAttributesCompatParcelizer()Z

    move-result p1

    if-eqz p1, :cond_11

    .line 307
    invoke-virtual {p0}, Landroidx/appcompat/widget/ActivityChooserView;->write()Z

    .line 308
    invoke-virtual {p0}, Landroidx/appcompat/widget/ActivityChooserView;->RemoteActionCompatParcelizer()Z

    :cond_11
    return-void
.end method

.method public setDefaultActionButtonContentDescription(I)V
    .registers 2

    .line 524
    iput p1, p0, Landroidx/appcompat/widget/ActivityChooserView;->MediaBrowserCompatSearchResultReceiver:I

    return-void
.end method

.method public setExpandActivityOverflowButtonContentDescription(I)V
    .registers 3

    .line 338
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    .line 339
    iget-object p0, p0, Landroidx/appcompat/widget/ActivityChooserView;->MediaMetadataCompat:Landroid/widget/ImageView;

    invoke-virtual {p0, p1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setExpandActivityOverflowButtonDrawable(Landroid/graphics/drawable/Drawable;)V
    .registers 2

    .line 324
    iget-object p0, p0, Landroidx/appcompat/widget/ActivityChooserView;->MediaMetadataCompat:Landroid/widget/ImageView;

    invoke-virtual {p0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setInitialActivityCount(I)V
    .registers 2

    .line 510
    iput p1, p0, Landroidx/appcompat/widget/ActivityChooserView;->read:I

    return-void
.end method

.method public setOnDismissListener(Landroid/widget/PopupWindow$OnDismissListener;)V
    .registers 2

    .line 498
    iput-object p1, p0, Landroidx/appcompat/widget/ActivityChooserView;->AudioAttributesImplApi26Parcelizer:Landroid/widget/PopupWindow$OnDismissListener;

    return-void
.end method

.method public setProvider(Lo/ThrowableDeserializer;)V
    .registers 2

    .line 348
    iput-object p1, p0, Landroidx/appcompat/widget/ActivityChooserView;->MediaBrowserCompatCustomActionResultReceiver:Lo/ThrowableDeserializer;

    return-void
.end method

.method public final write()Z
    .registers 3

    .line 416
    invoke-virtual {p0}, Landroidx/appcompat/widget/ActivityChooserView;->AudioAttributesCompatParcelizer()Z

    move-result v0

    if-eqz v0, :cond_1c

    .line 417
    invoke-virtual {p0}, Landroidx/appcompat/widget/ActivityChooserView;->IconCompatParcelizer()Landroidx/appcompat/widget/ListPopupWindow;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/appcompat/widget/ListPopupWindow;->write()V

    .line 418
    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    .line 419
    invoke-virtual {v0}, Landroid/view/ViewTreeObserver;->isAlive()Z

    move-result v1

    if-eqz v1, :cond_1c

    .line 420
    iget-object p0, p0, Landroidx/appcompat/widget/ActivityChooserView;->handleMediaPlayPauseIfPendingOnHandler:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    :cond_1c
    const/4 p0, 0x1

    return p0
.end method

###### Class androidx.appcompat.widget.ActivityChooserView.AnonymousClass1 (androidx.appcompat.widget.ActivityChooserView$1)
.class final Landroidx/appcompat/widget/ActivityChooserView$1;
.super Landroid/view/View$AccessibilityDelegate;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/appcompat/widget/ActivityChooserView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic read:Landroidx/appcompat/widget/ActivityChooserView;


# direct methods
.method constructor <init>(Landroidx/appcompat/widget/ActivityChooserView;)V
    .registers 2

    .line 254
    iput-object p1, p0, Landroidx/appcompat/widget/ActivityChooserView$1;->read:Landroidx/appcompat/widget/ActivityChooserView;

    invoke-direct {p0}, Landroid/view/View$AccessibilityDelegate;-><init>()V

    return-void
.end method


# virtual methods
.method public final onInitializeAccessibilityNodeInfo(Landroid/view/View;Landroid/view/accessibility/AccessibilityNodeInfo;)V
    .registers 3

    .line 257
    invoke-super {p0, p1, p2}, Landroid/view/View$AccessibilityDelegate;->onInitializeAccessibilityNodeInfo(Landroid/view/View;Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 258
    invoke-static {p2}, Lo/hasSuperClassStartingWith;->write(Landroid/view/accessibility/AccessibilityNodeInfo;)Lo/hasSuperClassStartingWith;

    move-result-object p0

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Lo/hasSuperClassStartingWith;->IconCompatParcelizer(Z)V

    return-void
.end method

###### Class androidx.appcompat.widget.ActivityChooserView.AnonymousClass2 (androidx.appcompat.widget.ActivityChooserView$2)
.class final Landroidx/appcompat/widget/ActivityChooserView$2;
.super Lo/ActivityResult;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/appcompat/widget/ActivityChooserView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/ActivityChooserView;


# direct methods
.method constructor <init>(Landroidx/appcompat/widget/ActivityChooserView;Landroid/view/View;)V
    .registers 3

    .line 261
    iput-object p1, p0, Landroidx/appcompat/widget/ActivityChooserView$2;->AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/ActivityChooserView;

    invoke-direct {p0, p2}, Lo/ActivityResult;-><init>(Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer()Lo/removeOnContextAvailableListener;
    .registers 1

    .line 264
    iget-object p0, p0, Landroidx/appcompat/widget/ActivityChooserView$2;->AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/ActivityChooserView;

    invoke-virtual {p0}, Landroidx/appcompat/widget/ActivityChooserView;->IconCompatParcelizer()Landroidx/appcompat/widget/ListPopupWindow;

    move-result-object p0

    return-object p0
.end method

.method public final read()Z
    .registers 1

    .line 269
    iget-object p0, p0, Landroidx/appcompat/widget/ActivityChooserView$2;->AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/ActivityChooserView;

    invoke-virtual {p0}, Landroidx/appcompat/widget/ActivityChooserView;->RemoteActionCompatParcelizer()Z

    const/4 p0, 0x1

    return p0
.end method

.method public final write()Z
    .registers 1

    .line 275
    iget-object p0, p0, Landroidx/appcompat/widget/ActivityChooserView$2;->AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/ActivityChooserView;

    invoke-virtual {p0}, Landroidx/appcompat/widget/ActivityChooserView;->write()Z

    const/4 p0, 0x1

    return p0
.end method

###### Class androidx.appcompat.widget.ActivityChooserView.AnonymousClass3 (androidx.appcompat.widget.ActivityChooserView$3)
.class final Landroidx/appcompat/widget/ActivityChooserView$3;
.super Landroid/database/DataSetObserver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/appcompat/widget/ActivityChooserView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic RemoteActionCompatParcelizer:Landroidx/appcompat/widget/ActivityChooserView;


# direct methods
.method constructor <init>(Landroidx/appcompat/widget/ActivityChooserView;)V
    .registers 2

    .line 285
    iput-object p1, p0, Landroidx/appcompat/widget/ActivityChooserView$3;->RemoteActionCompatParcelizer:Landroidx/appcompat/widget/ActivityChooserView;

    invoke-direct {p0}, Landroid/database/DataSetObserver;-><init>()V

    return-void
.end method


# virtual methods
.method public final onChanged()V
    .registers 1

    .line 288
    invoke-super {p0}, Landroid/database/DataSetObserver;->onChanged()V

    .line 289
    iget-object p0, p0, Landroidx/appcompat/widget/ActivityChooserView$3;->RemoteActionCompatParcelizer:Landroidx/appcompat/widget/ActivityChooserView;

    invoke-virtual {p0}, Landroidx/appcompat/widget/ActivityChooserView;->read()V

    return-void
.end method

###### Class androidx.appcompat.widget.ActivityChooserView.AnonymousClass4 (androidx.appcompat.widget.ActivityChooserView$4)
.class final Landroidx/appcompat/widget/ActivityChooserView$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/widget/ActivityChooserView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic IconCompatParcelizer:Landroidx/appcompat/widget/ActivityChooserView;


# direct methods
.method constructor <init>(Landroidx/appcompat/widget/ActivityChooserView;)V
    .registers 2

    .line 149
    iput-object p1, p0, Landroidx/appcompat/widget/ActivityChooserView$4;->IconCompatParcelizer:Landroidx/appcompat/widget/ActivityChooserView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onGlobalLayout()V
    .registers 2

    .line 152
    iget-object v0, p0, Landroidx/appcompat/widget/ActivityChooserView$4;->IconCompatParcelizer:Landroidx/appcompat/widget/ActivityChooserView;

    invoke-virtual {v0}, Landroidx/appcompat/widget/ActivityChooserView;->AudioAttributesCompatParcelizer()Z

    move-result v0

    if-eqz v0, :cond_31

    .line 153
    iget-object v0, p0, Landroidx/appcompat/widget/ActivityChooserView$4;->IconCompatParcelizer:Landroidx/appcompat/widget/ActivityChooserView;

    invoke-virtual {v0}, Landroid/view/View;->isShown()Z

    move-result v0

    if-nez v0, :cond_1a

    .line 154
    iget-object p0, p0, Landroidx/appcompat/widget/ActivityChooserView$4;->IconCompatParcelizer:Landroidx/appcompat/widget/ActivityChooserView;

    invoke-virtual {p0}, Landroidx/appcompat/widget/ActivityChooserView;->IconCompatParcelizer()Landroidx/appcompat/widget/ListPopupWindow;

    move-result-object p0

    invoke-virtual {p0}, Landroidx/appcompat/widget/ListPopupWindow;->write()V

    return-void

    .line 156
    :cond_1a
    iget-object v0, p0, Landroidx/appcompat/widget/ActivityChooserView$4;->IconCompatParcelizer:Landroidx/appcompat/widget/ActivityChooserView;

    invoke-virtual {v0}, Landroidx/appcompat/widget/ActivityChooserView;->IconCompatParcelizer()Landroidx/appcompat/widget/ListPopupWindow;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/appcompat/widget/ListPopupWindow;->AudioAttributesImplBaseParcelizer()V

    .line 157
    iget-object v0, p0, Landroidx/appcompat/widget/ActivityChooserView$4;->IconCompatParcelizer:Landroidx/appcompat/widget/ActivityChooserView;

    iget-object v0, v0, Landroidx/appcompat/widget/ActivityChooserView;->MediaBrowserCompatCustomActionResultReceiver:Lo/ThrowableDeserializer;

    if-eqz v0, :cond_31

    .line 158
    iget-object p0, p0, Landroidx/appcompat/widget/ActivityChooserView$4;->IconCompatParcelizer:Landroidx/appcompat/widget/ActivityChooserView;

    iget-object p0, p0, Landroidx/appcompat/widget/ActivityChooserView;->MediaBrowserCompatCustomActionResultReceiver:Lo/ThrowableDeserializer;

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lo/ThrowableDeserializer;->RemoteActionCompatParcelizer(Z)V

    :cond_31
    return-void
.end method

###### Class androidx.appcompat.widget.ActivityChooserView.AnonymousClass5 (androidx.appcompat.widget.ActivityChooserView$5)
.class final Landroidx/appcompat/widget/ActivityChooserView$5;
.super Landroid/database/DataSetObserver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/widget/ActivityChooserView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic write:Landroidx/appcompat/widget/ActivityChooserView;


# direct methods
.method constructor <init>(Landroidx/appcompat/widget/ActivityChooserView;)V
    .registers 2

    .line 135
    iput-object p1, p0, Landroidx/appcompat/widget/ActivityChooserView$5;->write:Landroidx/appcompat/widget/ActivityChooserView;

    invoke-direct {p0}, Landroid/database/DataSetObserver;-><init>()V

    return-void
.end method


# virtual methods
.method public final onChanged()V
    .registers 1

    .line 139
    invoke-super {p0}, Landroid/database/DataSetObserver;->onChanged()V

    .line 140
    iget-object p0, p0, Landroidx/appcompat/widget/ActivityChooserView$5;->write:Landroidx/appcompat/widget/ActivityChooserView;

    iget-object p0, p0, Landroidx/appcompat/widget/ActivityChooserView;->RemoteActionCompatParcelizer:Landroidx/appcompat/widget/ActivityChooserView$read;

    invoke-virtual {p0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    return-void
.end method

.method public final onInvalidated()V
    .registers 1

    .line 144
    invoke-super {p0}, Landroid/database/DataSetObserver;->onInvalidated()V

    .line 145
    iget-object p0, p0, Landroidx/appcompat/widget/ActivityChooserView$5;->write:Landroidx/appcompat/widget/ActivityChooserView;

    iget-object p0, p0, Landroidx/appcompat/widget/ActivityChooserView;->RemoteActionCompatParcelizer:Landroidx/appcompat/widget/ActivityChooserView$read;

    invoke-virtual {p0}, Landroid/widget/BaseAdapter;->notifyDataSetInvalidated()V

    return-void
.end method

###### Class androidx.appcompat.widget.ActivityChooserView.AudioAttributesCompatParcelizer (androidx.appcompat.widget.ActivityChooserView$AudioAttributesCompatParcelizer)
.class final Landroidx/appcompat/widget/ActivityChooserView$AudioAttributesCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;
.implements Landroid/view/View$OnClickListener;
.implements Landroid/view/View$OnLongClickListener;
.implements Landroid/widget/PopupWindow$OnDismissListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/widget/ActivityChooserView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "AudioAttributesCompatParcelizer"
.end annotation


# instance fields
.field final synthetic read:Landroidx/appcompat/widget/ActivityChooserView;


# direct methods
.method constructor <init>(Landroidx/appcompat/widget/ActivityChooserView;)V
    .registers 2

    .line 585
    iput-object p1, p0, Landroidx/appcompat/widget/ActivityChooserView$AudioAttributesCompatParcelizer;->read:Landroidx/appcompat/widget/ActivityChooserView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private AudioAttributesCompatParcelizer()V
    .registers 2

    .line 664
    iget-object v0, p0, Landroidx/appcompat/widget/ActivityChooserView$AudioAttributesCompatParcelizer;->read:Landroidx/appcompat/widget/ActivityChooserView;

    iget-object v0, v0, Landroidx/appcompat/widget/ActivityChooserView;->AudioAttributesImplApi26Parcelizer:Landroid/widget/PopupWindow$OnDismissListener;

    if-eqz v0, :cond_d

    .line 665
    iget-object p0, p0, Landroidx/appcompat/widget/ActivityChooserView$AudioAttributesCompatParcelizer;->read:Landroidx/appcompat/widget/ActivityChooserView;

    iget-object p0, p0, Landroidx/appcompat/widget/ActivityChooserView;->AudioAttributesImplApi26Parcelizer:Landroid/widget/PopupWindow$OnDismissListener;

    invoke-interface {p0}, Landroid/widget/PopupWindow$OnDismissListener;->onDismiss()V

    :cond_d
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .registers 3

    .line 623
    iget-object v0, p0, Landroidx/appcompat/widget/ActivityChooserView$AudioAttributesCompatParcelizer;->read:Landroidx/appcompat/widget/ActivityChooserView;

    iget-object v0, v0, Landroidx/appcompat/widget/ActivityChooserView;->IconCompatParcelizer:Landroid/widget/FrameLayout;

    if-ne p1, v0, :cond_2a

    .line 624
    iget-object p1, p0, Landroidx/appcompat/widget/ActivityChooserView$AudioAttributesCompatParcelizer;->read:Landroidx/appcompat/widget/ActivityChooserView;

    invoke-virtual {p1}, Landroidx/appcompat/widget/ActivityChooserView;->write()Z

    .line 625
    iget-object p1, p0, Landroidx/appcompat/widget/ActivityChooserView$AudioAttributesCompatParcelizer;->read:Landroidx/appcompat/widget/ActivityChooserView;

    iget-object p1, p1, Landroidx/appcompat/widget/ActivityChooserView;->RemoteActionCompatParcelizer:Landroidx/appcompat/widget/ActivityChooserView$read;

    invoke-virtual {p1}, Landroidx/appcompat/widget/ActivityChooserView$read;->write()Landroid/content/pm/ResolveInfo;

    move-result-object p1

    .line 626
    iget-object v0, p0, Landroidx/appcompat/widget/ActivityChooserView$AudioAttributesCompatParcelizer;->read:Landroidx/appcompat/widget/ActivityChooserView;

    iget-object v0, v0, Landroidx/appcompat/widget/ActivityChooserView;->RemoteActionCompatParcelizer:Landroidx/appcompat/widget/ActivityChooserView$read;

    invoke-virtual {v0}, Landroidx/appcompat/widget/ActivityChooserView$read;->IconCompatParcelizer()Lo/removeOnNewIntentListener;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/removeOnNewIntentListener;->RemoteActionCompatParcelizer(Landroid/content/pm/ResolveInfo;)I

    .line 627
    iget-object p0, p0, Landroidx/appcompat/widget/ActivityChooserView$AudioAttributesCompatParcelizer;->read:Landroidx/appcompat/widget/ActivityChooserView;

    iget-object p0, p0, Landroidx/appcompat/widget/ActivityChooserView;->RemoteActionCompatParcelizer:Landroidx/appcompat/widget/ActivityChooserView$read;

    invoke-virtual {p0}, Landroidx/appcompat/widget/ActivityChooserView$read;->IconCompatParcelizer()Lo/removeOnNewIntentListener;

    move-result-object p0

    invoke-virtual {p0}, Lo/removeOnNewIntentListener;->IconCompatParcelizer()Landroid/content/Intent;

    return-void

    .line 632
    :cond_2a
    iget-object v0, p0, Landroidx/appcompat/widget/ActivityChooserView$AudioAttributesCompatParcelizer;->read:Landroidx/appcompat/widget/ActivityChooserView;

    iget-object v0, v0, Landroidx/appcompat/widget/ActivityChooserView;->AudioAttributesCompatParcelizer:Landroid/widget/FrameLayout;

    if-ne p1, v0, :cond_3d

    .line 633
    iget-object p1, p0, Landroidx/appcompat/widget/ActivityChooserView$AudioAttributesCompatParcelizer;->read:Landroidx/appcompat/widget/ActivityChooserView;

    const/4 v0, 0x0

    iput-boolean v0, p1, Landroidx/appcompat/widget/ActivityChooserView;->write:Z

    .line 634
    iget-object p0, p0, Landroidx/appcompat/widget/ActivityChooserView$AudioAttributesCompatParcelizer;->read:Landroidx/appcompat/widget/ActivityChooserView;

    iget p1, p0, Landroidx/appcompat/widget/ActivityChooserView;->read:I

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/ActivityChooserView;->IconCompatParcelizer(I)V

    return-void

    .line 636
    :cond_3d
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p0
.end method

.method public final onDismiss()V
    .registers 2

    .line 657
    invoke-direct {p0}, Landroidx/appcompat/widget/ActivityChooserView$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer()V

    .line 658
    iget-object v0, p0, Landroidx/appcompat/widget/ActivityChooserView$AudioAttributesCompatParcelizer;->read:Landroidx/appcompat/widget/ActivityChooserView;

    iget-object v0, v0, Landroidx/appcompat/widget/ActivityChooserView;->MediaBrowserCompatCustomActionResultReceiver:Lo/ThrowableDeserializer;

    if-eqz v0, :cond_11

    .line 659
    iget-object p0, p0, Landroidx/appcompat/widget/ActivityChooserView$AudioAttributesCompatParcelizer;->read:Landroidx/appcompat/widget/ActivityChooserView;

    iget-object p0, p0, Landroidx/appcompat/widget/ActivityChooserView;->MediaBrowserCompatCustomActionResultReceiver:Lo/ThrowableDeserializer;

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/ThrowableDeserializer;->RemoteActionCompatParcelizer(Z)V

    :cond_11
    return-void
.end method

.method public final onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
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

    .line 591
    invoke-virtual {p1}, Landroid/widget/AdapterView;->getAdapter()Landroid/widget/Adapter;

    move-result-object p1

    check-cast p1, Landroidx/appcompat/widget/ActivityChooserView$read;

    .line 592
    invoke-virtual {p1, p3}, Landroid/widget/BaseAdapter;->getItemViewType(I)I

    move-result p1

    if-eqz p1, :cond_1e

    const/4 p2, 0x1

    if-ne p1, p2, :cond_18

    .line 595
    iget-object p0, p0, Landroidx/appcompat/widget/ActivityChooserView$AudioAttributesCompatParcelizer;->read:Landroidx/appcompat/widget/ActivityChooserView;

    const p1, 0x7fffffff

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/ActivityChooserView;->IconCompatParcelizer(I)V

    return-void

    .line 616
    :cond_18
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p0

    .line 598
    :cond_1e
    iget-object p1, p0, Landroidx/appcompat/widget/ActivityChooserView$AudioAttributesCompatParcelizer;->read:Landroidx/appcompat/widget/ActivityChooserView;

    invoke-virtual {p1}, Landroidx/appcompat/widget/ActivityChooserView;->write()Z

    .line 599
    iget-object p1, p0, Landroidx/appcompat/widget/ActivityChooserView$AudioAttributesCompatParcelizer;->read:Landroidx/appcompat/widget/ActivityChooserView;

    iget-boolean p1, p1, Landroidx/appcompat/widget/ActivityChooserView;->write:Z

    if-eqz p1, :cond_37

    if-lez p3, :cond_49

    .line 602
    iget-object p0, p0, Landroidx/appcompat/widget/ActivityChooserView$AudioAttributesCompatParcelizer;->read:Landroidx/appcompat/widget/ActivityChooserView;

    iget-object p0, p0, Landroidx/appcompat/widget/ActivityChooserView;->RemoteActionCompatParcelizer:Landroidx/appcompat/widget/ActivityChooserView$read;

    invoke-virtual {p0}, Landroidx/appcompat/widget/ActivityChooserView$read;->IconCompatParcelizer()Lo/removeOnNewIntentListener;

    move-result-object p0

    invoke-virtual {p0, p3}, Lo/removeOnNewIntentListener;->read(I)V

    return-void

    .line 607
    :cond_37
    iget-object p1, p0, Landroidx/appcompat/widget/ActivityChooserView$AudioAttributesCompatParcelizer;->read:Landroidx/appcompat/widget/ActivityChooserView;

    iget-object p1, p1, Landroidx/appcompat/widget/ActivityChooserView;->RemoteActionCompatParcelizer:Landroidx/appcompat/widget/ActivityChooserView$read;

    invoke-virtual {p1}, Landroidx/appcompat/widget/ActivityChooserView$read;->RemoteActionCompatParcelizer()Z

    .line 608
    iget-object p0, p0, Landroidx/appcompat/widget/ActivityChooserView$AudioAttributesCompatParcelizer;->read:Landroidx/appcompat/widget/ActivityChooserView;

    iget-object p0, p0, Landroidx/appcompat/widget/ActivityChooserView;->RemoteActionCompatParcelizer:Landroidx/appcompat/widget/ActivityChooserView$read;

    invoke-virtual {p0}, Landroidx/appcompat/widget/ActivityChooserView$read;->IconCompatParcelizer()Lo/removeOnNewIntentListener;

    move-result-object p0

    invoke-virtual {p0}, Lo/removeOnNewIntentListener;->IconCompatParcelizer()Landroid/content/Intent;

    :cond_49
    return-void
.end method

.method public final onLongClick(Landroid/view/View;)Z
    .registers 3

    .line 643
    iget-object v0, p0, Landroidx/appcompat/widget/ActivityChooserView$AudioAttributesCompatParcelizer;->read:Landroidx/appcompat/widget/ActivityChooserView;

    iget-object v0, v0, Landroidx/appcompat/widget/ActivityChooserView;->IconCompatParcelizer:Landroid/widget/FrameLayout;

    if-ne p1, v0, :cond_1d

    .line 644
    iget-object p1, p0, Landroidx/appcompat/widget/ActivityChooserView$AudioAttributesCompatParcelizer;->read:Landroidx/appcompat/widget/ActivityChooserView;

    iget-object p1, p1, Landroidx/appcompat/widget/ActivityChooserView;->RemoteActionCompatParcelizer:Landroidx/appcompat/widget/ActivityChooserView$read;

    invoke-virtual {p1}, Landroidx/appcompat/widget/ActivityChooserView$read;->getCount()I

    move-result p1

    const/4 v0, 0x1

    if-lez p1, :cond_1c

    .line 645
    iget-object p1, p0, Landroidx/appcompat/widget/ActivityChooserView$AudioAttributesCompatParcelizer;->read:Landroidx/appcompat/widget/ActivityChooserView;

    iput-boolean v0, p1, Landroidx/appcompat/widget/ActivityChooserView;->write:Z

    .line 646
    iget-object p0, p0, Landroidx/appcompat/widget/ActivityChooserView$AudioAttributesCompatParcelizer;->read:Landroidx/appcompat/widget/ActivityChooserView;

    iget p1, p0, Landroidx/appcompat/widget/ActivityChooserView;->read:I

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/ActivityChooserView;->IconCompatParcelizer(I)V

    :cond_1c
    return v0

    .line 649
    :cond_1d
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p0
.end method

###### Class androidx.appcompat.widget.ActivityChooserView.InnerLayout (androidx.appcompat.widget.ActivityChooserView$InnerLayout)
.class public Landroidx/appcompat/widget/ActivityChooserView$InnerLayout;
.super Landroid/widget/LinearLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/widget/ActivityChooserView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "InnerLayout"
.end annotation


# static fields
.field private static final read:[I


# direct methods
.method static constructor <clinit>()V
    .registers 1

    const v0, 0x10100d4

    .line 873
    filled-new-array {v0}, [I

    move-result-object v0

    sput-object v0, Landroidx/appcompat/widget/ActivityChooserView$InnerLayout;->read:[I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 4

    .line 878
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 879
    sget-object v0, Landroidx/appcompat/widget/ActivityChooserView$InnerLayout;->read:[I

    invoke-static {p1, p2, v0}, Lo/setTitle;->IconCompatParcelizer(Landroid/content/Context;Landroid/util/AttributeSet;[I)Lo/setTitle;

    move-result-object p1

    const/4 p2, 0x0

    .line 880
    invoke-virtual {p1, p2}, Lo/setTitle;->IconCompatParcelizer(I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    invoke-virtual {p0, p2}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 881
    invoke-virtual {p1}, Lo/setTitle;->write()V

    return-void
.end method

###### Class androidx.appcompat.widget.ActivityChooserView.read (androidx.appcompat.widget.ActivityChooserView$read)
.class final Landroidx/appcompat/widget/ActivityChooserView$read;
.super Landroid/widget/BaseAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/widget/ActivityChooserView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "read"
.end annotation


# instance fields
.field private AudioAttributesCompatParcelizer:Z

.field private AudioAttributesImplBaseParcelizer:Z

.field private IconCompatParcelizer:Z

.field private RemoteActionCompatParcelizer:I

.field final synthetic read:Landroidx/appcompat/widget/ActivityChooserView;

.field private write:Lo/removeOnNewIntentListener;


# direct methods
.method constructor <init>(Landroidx/appcompat/widget/ActivityChooserView;)V
    .registers 2

    .line 695
    iput-object p1, p0, Landroidx/appcompat/widget/ActivityChooserView$read;->read:Landroidx/appcompat/widget/ActivityChooserView;

    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    const/4 p1, 0x4

    .line 687
    iput p1, p0, Landroidx/appcompat/widget/ActivityChooserView$read;->RemoteActionCompatParcelizer:I

    return-void
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer()I
    .registers 1

    .line 844
    iget-object p0, p0, Landroidx/appcompat/widget/ActivityChooserView$read;->write:Lo/removeOnNewIntentListener;

    invoke-virtual {p0}, Lo/removeOnNewIntentListener;->read()I

    move-result p0

    return p0
.end method

.method public final AudioAttributesCompatParcelizer(Z)V
    .registers 3

    .line 833
    iget-boolean v0, p0, Landroidx/appcompat/widget/ActivityChooserView$read;->AudioAttributesImplBaseParcelizer:Z

    if-eq v0, p1, :cond_9

    .line 834
    iput-boolean p1, p0, Landroidx/appcompat/widget/ActivityChooserView$read;->AudioAttributesImplBaseParcelizer:Z

    .line 835
    invoke-virtual {p0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    :cond_9
    return-void
.end method

.method public final AudioAttributesImplApi21Parcelizer()I
    .registers 10

    .line 800
    iget v0, p0, Landroidx/appcompat/widget/ActivityChooserView$read;->RemoteActionCompatParcelizer:I

    const v1, 0x7fffffff

    .line 801
    iput v1, p0, Landroidx/appcompat/widget/ActivityChooserView$read;->RemoteActionCompatParcelizer:I

    const/4 v1, 0x0

    .line 806
    invoke-static {v1, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v2

    .line 807
    invoke-static {v1, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v3

    .line 808
    invoke-virtual {p0}, Landroidx/appcompat/widget/ActivityChooserView$read;->getCount()I

    move-result v4

    const/4 v5, 0x0

    move v6, v1

    move-object v7, v5

    :goto_17
    if-ge v1, v4, :cond_2b

    .line 811
    invoke-virtual {p0, v1, v7, v5}, Landroidx/appcompat/widget/ActivityChooserView$read;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v7

    .line 812
    invoke-virtual {v7, v2, v3}, Landroid/view/View;->measure(II)V

    .line 813
    invoke-virtual {v7}, Landroid/view/View;->getMeasuredWidth()I

    move-result v8

    invoke-static {v6, v8}, Ljava/lang/Math;->max(II)I

    move-result v6

    add-int/lit8 v1, v1, 0x1

    goto :goto_17

    .line 816
    :cond_2b
    iput v0, p0, Landroidx/appcompat/widget/ActivityChooserView$read;->RemoteActionCompatParcelizer:I

    return v6
.end method

.method public final IconCompatParcelizer()Lo/removeOnNewIntentListener;
    .registers 1

    .line 848
    iget-object p0, p0, Landroidx/appcompat/widget/ActivityChooserView$read;->write:Lo/removeOnNewIntentListener;

    return-object p0
.end method

.method public final IconCompatParcelizer(Lo/removeOnNewIntentListener;)V
    .registers 4

    .line 699
    iget-object v0, p0, Landroidx/appcompat/widget/ActivityChooserView$read;->read:Landroidx/appcompat/widget/ActivityChooserView;

    iget-object v0, v0, Landroidx/appcompat/widget/ActivityChooserView;->RemoteActionCompatParcelizer:Landroidx/appcompat/widget/ActivityChooserView$read;

    invoke-virtual {v0}, Landroidx/appcompat/widget/ActivityChooserView$read;->IconCompatParcelizer()Lo/removeOnNewIntentListener;

    move-result-object v0

    if-eqz v0, :cond_19

    .line 700
    iget-object v1, p0, Landroidx/appcompat/widget/ActivityChooserView$read;->read:Landroidx/appcompat/widget/ActivityChooserView;

    invoke-virtual {v1}, Landroid/view/View;->isShown()Z

    move-result v1

    if-eqz v1, :cond_19

    .line 701
    iget-object v1, p0, Landroidx/appcompat/widget/ActivityChooserView$read;->read:Landroidx/appcompat/widget/ActivityChooserView;

    iget-object v1, v1, Landroidx/appcompat/widget/ActivityChooserView;->AudioAttributesImplBaseParcelizer:Landroid/database/DataSetObserver;

    invoke-virtual {v0, v1}, Landroid/database/Observable;->unregisterObserver(Ljava/lang/Object;)V

    .line 703
    :cond_19
    iput-object p1, p0, Landroidx/appcompat/widget/ActivityChooserView$read;->write:Lo/removeOnNewIntentListener;

    if-eqz p1, :cond_2c

    .line 704
    iget-object v0, p0, Landroidx/appcompat/widget/ActivityChooserView$read;->read:Landroidx/appcompat/widget/ActivityChooserView;

    invoke-virtual {v0}, Landroid/view/View;->isShown()Z

    move-result v0

    if-eqz v0, :cond_2c

    .line 705
    iget-object v0, p0, Landroidx/appcompat/widget/ActivityChooserView$read;->read:Landroidx/appcompat/widget/ActivityChooserView;

    iget-object v0, v0, Landroidx/appcompat/widget/ActivityChooserView;->AudioAttributesImplBaseParcelizer:Landroid/database/DataSetObserver;

    invoke-virtual {p1, v0}, Landroid/database/Observable;->registerObserver(Ljava/lang/Object;)V

    .line 707
    :cond_2c
    invoke-virtual {p0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    return-void
.end method

.method public final RemoteActionCompatParcelizer()Z
    .registers 1

    .line 862
    iget-boolean p0, p0, Landroidx/appcompat/widget/ActivityChooserView$read;->AudioAttributesCompatParcelizer:Z

    return p0
.end method

.method public final getCount()I
    .registers 3

    .line 726
    iget-object v0, p0, Landroidx/appcompat/widget/ActivityChooserView$read;->write:Lo/removeOnNewIntentListener;

    invoke-virtual {v0}, Lo/removeOnNewIntentListener;->write()I

    move-result v0

    .line 727
    iget-boolean v1, p0, Landroidx/appcompat/widget/ActivityChooserView$read;->AudioAttributesCompatParcelizer:Z

    if-nez v1, :cond_14

    iget-object v1, p0, Landroidx/appcompat/widget/ActivityChooserView$read;->write:Lo/removeOnNewIntentListener;

    invoke-virtual {v1}, Lo/removeOnNewIntentListener;->RemoteActionCompatParcelizer()Landroid/content/pm/ResolveInfo;

    move-result-object v1

    if-eqz v1, :cond_14

    add-int/lit8 v0, v0, -0x1

    .line 730
    :cond_14
    iget v1, p0, Landroidx/appcompat/widget/ActivityChooserView$read;->RemoteActionCompatParcelizer:I

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    .line 731
    iget-boolean p0, p0, Landroidx/appcompat/widget/ActivityChooserView$read;->AudioAttributesImplBaseParcelizer:Z

    if-eqz p0, :cond_20

    add-int/lit8 v0, v0, 0x1

    :cond_20
    return v0
.end method

.method public final getItem(I)Ljava/lang/Object;
    .registers 3

    .line 739
    invoke-virtual {p0, p1}, Landroid/widget/BaseAdapter;->getItemViewType(I)I

    move-result v0

    if-eqz v0, :cond_11

    const/4 p0, 0x1

    if-ne v0, p0, :cond_b

    const/4 p0, 0x0

    return-object p0

    .line 749
    :cond_b
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p0

    .line 744
    :cond_11
    iget-boolean v0, p0, Landroidx/appcompat/widget/ActivityChooserView$read;->AudioAttributesCompatParcelizer:Z

    if-nez v0, :cond_1f

    iget-object v0, p0, Landroidx/appcompat/widget/ActivityChooserView$read;->write:Lo/removeOnNewIntentListener;

    invoke-virtual {v0}, Lo/removeOnNewIntentListener;->RemoteActionCompatParcelizer()Landroid/content/pm/ResolveInfo;

    move-result-object v0

    if-eqz v0, :cond_1f

    add-int/lit8 p1, p1, 0x1

    .line 747
    :cond_1f
    iget-object p0, p0, Landroidx/appcompat/widget/ActivityChooserView$read;->write:Lo/removeOnNewIntentListener;

    invoke-virtual {p0, p1}, Lo/removeOnNewIntentListener;->RemoteActionCompatParcelizer(I)Landroid/content/pm/ResolveInfo;

    move-result-object p0

    return-object p0
.end method

.method public final getItemId(I)J
    .registers 2

    int-to-long p0, p1

    return-wide p0
.end method

.method public final getItemViewType(I)I
    .registers 3

    .line 712
    iget-boolean v0, p0, Landroidx/appcompat/widget/ActivityChooserView$read;->AudioAttributesImplBaseParcelizer:Z

    if-eqz v0, :cond_d

    invoke-virtual {p0}, Landroidx/appcompat/widget/ActivityChooserView$read;->getCount()I

    move-result p0

    const/4 v0, 0x1

    sub-int/2addr p0, v0

    if-ne p1, p0, :cond_d

    return v0

    :cond_d
    const/4 p0, 0x0

    return p0
.end method

.method public final getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .registers 9

    .line 760
    invoke-virtual {p0, p1}, Landroid/widget/BaseAdapter;->getItemViewType(I)I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_44

    if-ne v0, v2, :cond_3e

    if-eqz p2, :cond_13

    .line 763
    invoke-virtual {p2}, Landroid/view/View;->getId()I

    move-result p1

    if-ne p1, v2, :cond_13

    return-object p2

    .line 764
    :cond_13
    iget-object p1, p0, Landroidx/appcompat/widget/ActivityChooserView$read;->read:Landroidx/appcompat/widget/ActivityChooserView;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    sget p2, Lo/_init_lambda5$MediaBrowserCompatCustomActionResultReceiver;->abc_activity_chooser_view_list_item:I

    invoke-virtual {p1, p2, p3, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 766
    invoke-virtual {p1, v2}, Landroid/view/View;->setId(I)V

    .line 767
    sget p2, Lo/_init_lambda5$AudioAttributesImplBaseParcelizer;->title:I

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    .line 768
    iget-object p0, p0, Landroidx/appcompat/widget/ActivityChooserView$read;->read:Landroidx/appcompat/widget/ActivityChooserView;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p0

    sget p3, Lo/_init_lambda5$AudioAttributesImplApi21Parcelizer;->abc_activity_chooser_view_see_all:I

    invoke-virtual {p0, p3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p2, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-object p1

    .line 793
    :cond_3e
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p0

    :cond_44
    if-eqz p2, :cond_4e

    .line 773
    invoke-virtual {p2}, Landroid/view/View;->getId()I

    move-result v0

    sget v3, Lo/_init_lambda5$AudioAttributesImplBaseParcelizer;->list_item:I

    if-eq v0, v3, :cond_5e

    .line 774
    :cond_4e
    iget-object p2, p0, Landroidx/appcompat/widget/ActivityChooserView$read;->read:Landroidx/appcompat/widget/ActivityChooserView;

    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    sget v0, Lo/_init_lambda5$MediaBrowserCompatCustomActionResultReceiver;->abc_activity_chooser_view_list_item:I

    invoke-virtual {p2, v0, p3, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    .line 777
    :cond_5e
    iget-object p3, p0, Landroidx/appcompat/widget/ActivityChooserView$read;->read:Landroidx/appcompat/widget/ActivityChooserView;

    invoke-virtual {p3}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p3

    invoke-virtual {p3}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p3

    .line 779
    sget v0, Lo/_init_lambda5$AudioAttributesImplBaseParcelizer;->icon:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 780
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/ActivityChooserView$read;->getItem(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/content/pm/ResolveInfo;

    .line 781
    invoke-virtual {v3, p3}, Landroid/content/pm/ResolveInfo;->loadIcon(Landroid/content/pm/PackageManager;)Landroid/graphics/drawable/Drawable;

    move-result-object v4

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 783
    sget v0, Lo/_init_lambda5$AudioAttributesImplBaseParcelizer;->title:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 784
    invoke-virtual {v3, p3}, Landroid/content/pm/ResolveInfo;->loadLabel(Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;

    move-result-object p3

    invoke-virtual {v0, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 786
    iget-boolean p3, p0, Landroidx/appcompat/widget/ActivityChooserView$read;->AudioAttributesCompatParcelizer:Z

    if-eqz p3, :cond_9a

    if-nez p1, :cond_9a

    iget-boolean p0, p0, Landroidx/appcompat/widget/ActivityChooserView$read;->IconCompatParcelizer:Z

    if-eqz p0, :cond_9a

    .line 787
    invoke-virtual {p2, v2}, Landroid/view/View;->setActivated(Z)V

    return-object p2

    .line 789
    :cond_9a
    invoke-virtual {p2, v1}, Landroid/view/View;->setActivated(Z)V

    return-object p2
.end method

.method public final getViewTypeCount()I
    .registers 1

    const/4 p0, 0x3

    return p0
.end method

.method public final read()I
    .registers 1

    .line 840
    iget-object p0, p0, Landroidx/appcompat/widget/ActivityChooserView$read;->write:Lo/removeOnNewIntentListener;

    invoke-virtual {p0}, Lo/removeOnNewIntentListener;->write()I

    move-result p0

    return p0
.end method

.method public final read(ZZ)V
    .registers 4

    .line 853
    iget-boolean v0, p0, Landroidx/appcompat/widget/ActivityChooserView$read;->AudioAttributesCompatParcelizer:Z

    if-ne v0, p1, :cond_9

    iget-boolean v0, p0, Landroidx/appcompat/widget/ActivityChooserView$read;->IconCompatParcelizer:Z

    if-ne v0, p2, :cond_9

    return-void

    .line 855
    :cond_9
    iput-boolean p1, p0, Landroidx/appcompat/widget/ActivityChooserView$read;->AudioAttributesCompatParcelizer:Z

    .line 856
    iput-boolean p2, p0, Landroidx/appcompat/widget/ActivityChooserView$read;->IconCompatParcelizer:Z

    .line 857
    invoke-virtual {p0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    return-void
.end method

.method public final write()Landroid/content/pm/ResolveInfo;
    .registers 1

    .line 829
    iget-object p0, p0, Landroidx/appcompat/widget/ActivityChooserView$read;->write:Lo/removeOnNewIntentListener;

    invoke-virtual {p0}, Lo/removeOnNewIntentListener;->RemoteActionCompatParcelizer()Landroid/content/pm/ResolveInfo;

    move-result-object p0

    return-object p0
.end method

.method public final write(I)V
    .registers 3

    .line 822
    iget v0, p0, Landroidx/appcompat/widget/ActivityChooserView$read;->RemoteActionCompatParcelizer:I

    if-eq v0, p1, :cond_9

    .line 823
    iput p1, p0, Landroidx/appcompat/widget/ActivityChooserView$read;->RemoteActionCompatParcelizer:I

    .line 824
    invoke-virtual {p0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    :cond_9
    return-void
.end method
