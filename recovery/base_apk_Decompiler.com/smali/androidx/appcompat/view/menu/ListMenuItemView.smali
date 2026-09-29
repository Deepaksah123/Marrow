###### Class androidx.appcompat.view.menu.ListMenuItemView (androidx.appcompat.view.menu.ListMenuItemView)
.class public Landroidx/appcompat/view/menu/ListMenuItemView;
.super Landroid/widget/LinearLayout;
.source "SourceFile"

# interfaces
.implements Lo/registerForActivityResult$AudioAttributesCompatParcelizer;
.implements Landroid/widget/AbsListView$SelectionBoundsAdjuster;


# instance fields
.field private AudioAttributesCompatParcelizer:Landroid/widget/LinearLayout;

.field private AudioAttributesImplApi21Parcelizer:Lo/onRetainNonConfigurationInstance;

.field private AudioAttributesImplApi26Parcelizer:Z

.field private AudioAttributesImplBaseParcelizer:Z

.field private IconCompatParcelizer:Z

.field private MediaBrowserCompatCustomActionResultReceiver:Landroid/widget/ImageView;

.field private MediaBrowserCompatItemReceiver:Landroid/view/LayoutInflater;

.field private MediaBrowserCompatMediaItem:Landroid/graphics/drawable/Drawable;

.field private MediaBrowserCompatSearchResultReceiver:I

.field private MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Landroid/widget/TextView;

.field private MediaDescriptionCompat:Landroid/widget/TextView;

.field private MediaMetadataCompat:Landroid/widget/ImageView;

.field private RatingCompat:Landroid/widget/RadioButton;

.field private RemoteActionCompatParcelizer:Landroid/widget/ImageView;

.field private handleMediaPlayPauseIfPendingOnHandler:Landroid/content/Context;

.field private read:Landroid/graphics/drawable/Drawable;

.field private write:Landroid/widget/CheckBox;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 4

    .line 74
    sget v0, Lo/_init_lambda5$read;->listMenuViewStyle:I

    invoke-direct {p0, p1, p2, v0}, Landroidx/appcompat/view/menu/ListMenuItemView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 7

    .line 78
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 80
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget-object v1, Lo/_init_lambda5$AudioAttributesImplApi26Parcelizer;->MenuView:[I

    const/4 v2, 0x0

    invoke-static {v0, p2, v1, p3, v2}, Lo/setTitle;->read(Landroid/content/Context;Landroid/util/AttributeSet;[III)Lo/setTitle;

    move-result-object p2

    .line 83
    sget p3, Lo/_init_lambda5$AudioAttributesImplApi26Parcelizer;->MenuView_android_itemBackground:I

    invoke-virtual {p2, p3}, Lo/setTitle;->IconCompatParcelizer(I)Landroid/graphics/drawable/Drawable;

    move-result-object p3

    iput-object p3, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->read:Landroid/graphics/drawable/Drawable;

    .line 84
    sget p3, Lo/_init_lambda5$AudioAttributesImplApi26Parcelizer;->MenuView_android_itemTextAppearance:I

    const/4 v0, -0x1

    invoke-virtual {p2, p3, v0}, Lo/setTitle;->MediaBrowserCompatItemReceiver(II)I

    move-result p3

    iput p3, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->MediaBrowserCompatSearchResultReceiver:I

    .line 86
    sget p3, Lo/_init_lambda5$AudioAttributesImplApi26Parcelizer;->MenuView_preserveIconSpacing:I

    invoke-virtual {p2, p3, v2}, Lo/setTitle;->AudioAttributesCompatParcelizer(IZ)Z

    move-result p3

    iput-boolean p3, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->AudioAttributesImplBaseParcelizer:Z

    .line 88
    iput-object p1, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->handleMediaPlayPauseIfPendingOnHandler:Landroid/content/Context;

    .line 89
    sget p3, Lo/_init_lambda5$AudioAttributesImplApi26Parcelizer;->MenuView_subMenuArrow:I

    invoke-virtual {p2, p3}, Lo/setTitle;->IconCompatParcelizer(I)Landroid/graphics/drawable/Drawable;

    move-result-object p3

    iput-object p3, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->MediaBrowserCompatMediaItem:Landroid/graphics/drawable/Drawable;

    .line 91
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object p1

    const p3, 0x1010129

    filled-new-array {p3}, [I

    move-result-object p3

    sget v0, Lo/_init_lambda5$read;->dropDownListViewStyle:I

    const/4 v1, 0x0

    .line 92
    invoke-virtual {p1, v1, p3, v0, v2}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 94
    invoke-virtual {p1, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result p3

    iput-boolean p3, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->AudioAttributesImplApi26Parcelizer:Z

    .line 96
    invoke-virtual {p2}, Lo/setTitle;->write()V

    .line 97
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method private AudioAttributesCompatParcelizer()V
    .registers 4

    .line 294
    invoke-direct {p0}, Landroidx/appcompat/view/menu/ListMenuItemView;->RemoteActionCompatParcelizer()Landroid/view/LayoutInflater;

    move-result-object v0

    .line 295
    sget v1, Lo/_init_lambda5$MediaBrowserCompatCustomActionResultReceiver;->abc_list_menu_item_icon:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p0, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->MediaBrowserCompatCustomActionResultReceiver:Landroid/widget/ImageView;

    .line 297
    invoke-direct {p0, v0, v2}, Landroidx/appcompat/view/menu/ListMenuItemView;->write(Landroid/view/View;I)V

    return-void
.end method

.method private IconCompatParcelizer(Landroid/view/View;)V
    .registers 3

    const/4 v0, -0x1

    .line 138
    invoke-direct {p0, p1, v0}, Landroidx/appcompat/view/menu/ListMenuItemView;->write(Landroid/view/View;I)V

    return-void
.end method

.method private MediaBrowserCompatCustomActionResultReceiver()V
    .registers 4

    .line 301
    invoke-direct {p0}, Landroidx/appcompat/view/menu/ListMenuItemView;->RemoteActionCompatParcelizer()Landroid/view/LayoutInflater;

    move-result-object v0

    .line 302
    sget v1, Lo/_init_lambda5$MediaBrowserCompatCustomActionResultReceiver;->abc_list_menu_item_radio:I

    const/4 v2, 0x0

    .line 303
    invoke-virtual {v0, v1, p0, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RadioButton;

    iput-object v0, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->RatingCompat:Landroid/widget/RadioButton;

    .line 305
    invoke-direct {p0, v0}, Landroidx/appcompat/view/menu/ListMenuItemView;->IconCompatParcelizer(Landroid/view/View;)V

    return-void
.end method

.method private RemoteActionCompatParcelizer()Landroid/view/LayoutInflater;
    .registers 2

    .line 327
    iget-object v0, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->MediaBrowserCompatItemReceiver:Landroid/view/LayoutInflater;

    if-nez v0, :cond_e

    .line 328
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iput-object v0, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->MediaBrowserCompatItemReceiver:Landroid/view/LayoutInflater;

    .line 330
    :cond_e
    iget-object p0, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->MediaBrowserCompatItemReceiver:Landroid/view/LayoutInflater;

    return-object p0
.end method

.method private RemoteActionCompatParcelizer(Z)V
    .registers 2

    .line 235
    iget-object p0, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->MediaMetadataCompat:Landroid/widget/ImageView;

    if-eqz p0, :cond_d

    if-eqz p1, :cond_8

    const/4 p1, 0x0

    goto :goto_a

    :cond_8
    const/16 p1, 0x8

    .line 236
    :goto_a
    invoke-virtual {p0, p1}, Landroid/widget/ImageView;->setVisibility(I)V

    :cond_d
    return-void
.end method

.method private read()V
    .registers 4

    .line 309
    invoke-direct {p0}, Landroidx/appcompat/view/menu/ListMenuItemView;->RemoteActionCompatParcelizer()Landroid/view/LayoutInflater;

    move-result-object v0

    .line 310
    sget v1, Lo/_init_lambda5$MediaBrowserCompatCustomActionResultReceiver;->abc_list_menu_item_checkbox:I

    const/4 v2, 0x0

    .line 311
    invoke-virtual {v0, v1, p0, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    iput-object v0, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->write:Landroid/widget/CheckBox;

    .line 313
    invoke-direct {p0, v0}, Landroidx/appcompat/view/menu/ListMenuItemView;->IconCompatParcelizer(Landroid/view/View;)V

    return-void
.end method

.method private write(Landroid/view/View;I)V
    .registers 4

    .line 142
    iget-object v0, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->AudioAttributesCompatParcelizer:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_8

    .line 143
    invoke-virtual {v0, p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    return-void

    .line 145
    :cond_8
    invoke-virtual {p0, p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    return-void
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer(Lo/onRetainNonConfigurationInstance;)V
    .registers 4

    .line 124
    iput-object p1, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->AudioAttributesImplApi21Parcelizer:Lo/onRetainNonConfigurationInstance;

    .line 126
    invoke-virtual {p1}, Lo/onRetainNonConfigurationInstance;->isVisible()Z

    move-result v0

    if-eqz v0, :cond_a

    const/4 v0, 0x0

    goto :goto_c

    :cond_a
    const/16 v0, 0x8

    :goto_c
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    .line 128
    invoke-virtual {p1, p0}, Lo/onRetainNonConfigurationInstance;->IconCompatParcelizer(Lo/registerForActivityResult$AudioAttributesCompatParcelizer;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroidx/appcompat/view/menu/ListMenuItemView;->setTitle(Ljava/lang/CharSequence;)V

    .line 129
    invoke-virtual {p1}, Lo/onRetainNonConfigurationInstance;->isCheckable()Z

    move-result v0

    invoke-virtual {p0, v0}, Landroidx/appcompat/view/menu/ListMenuItemView;->setCheckable(Z)V

    .line 130
    invoke-virtual {p1}, Lo/onRetainNonConfigurationInstance;->RatingCompat()Z

    move-result v0

    invoke-virtual {p1}, Lo/onRetainNonConfigurationInstance;->read()C

    move-result v1

    invoke-virtual {p0, v0, v1}, Landroidx/appcompat/view/menu/ListMenuItemView;->setShortcut(ZC)V

    .line 131
    invoke-virtual {p1}, Lo/onRetainNonConfigurationInstance;->getIcon()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroidx/appcompat/view/menu/ListMenuItemView;->setIcon(Landroid/graphics/drawable/Drawable;)V

    .line 132
    invoke-virtual {p1}, Lo/onRetainNonConfigurationInstance;->isEnabled()Z

    move-result v0

    invoke-virtual {p0, v0}, Landroid/view/View;->setEnabled(Z)V

    .line 133
    invoke-virtual {p1}, Lo/onRetainNonConfigurationInstance;->hasSubMenu()Z

    move-result v0

    invoke-direct {p0, v0}, Landroidx/appcompat/view/menu/ListMenuItemView;->RemoteActionCompatParcelizer(Z)V

    .line 134
    invoke-virtual {p1}, Lo/onRetainNonConfigurationInstance;->getContentDescription()Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final IconCompatParcelizer()Lo/onRetainNonConfigurationInstance;
    .registers 1

    .line 166
    iget-object p0, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->AudioAttributesImplApi21Parcelizer:Lo/onRetainNonConfigurationInstance;

    return-object p0
.end method

.method public adjustListItemSelectionBounds(Landroid/graphics/Rect;)V
    .registers 5

    .line 347
    iget-object v0, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->RemoteActionCompatParcelizer:Landroid/widget/ImageView;

    if-eqz v0, :cond_23

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_23

    .line 352
    iget-object v0, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->RemoteActionCompatParcelizer:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout$LayoutParams;

    .line 353
    iget v1, p1, Landroid/graphics/Rect;->top:I

    iget-object p0, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->RemoteActionCompatParcelizer:Landroid/widget/ImageView;

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result p0

    iget v2, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    add-int/2addr p0, v2

    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    add-int/2addr p0, v0

    add-int/2addr v1, p0

    iput v1, p1, Landroid/graphics/Rect;->top:I

    :cond_23
    return-void
.end method

.method protected onFinishInflate()V
    .registers 4

    .line 102
    invoke-super {p0}, Landroid/widget/LinearLayout;->onFinishInflate()V

    .line 104
    iget-object v0, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->read:Landroid/graphics/drawable/Drawable;

    invoke-static {p0, v0}, Lo/InvalidTypeIdException;->read(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V

    .line 106
    sget v0, Lo/_init_lambda5$AudioAttributesImplBaseParcelizer;->title:I

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Landroid/widget/TextView;

    .line 107
    iget v1, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->MediaBrowserCompatSearchResultReceiver:I

    const/4 v2, -0x1

    if-eq v1, v2, :cond_1c

    .line 108
    iget-object v2, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->handleMediaPlayPauseIfPendingOnHandler:Landroid/content/Context;

    invoke-virtual {v0, v2, v1}, Landroid/widget/TextView;->setTextAppearance(Landroid/content/Context;I)V

    .line 112
    :cond_1c
    sget v0, Lo/_init_lambda5$AudioAttributesImplBaseParcelizer;->shortcut:I

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->MediaDescriptionCompat:Landroid/widget/TextView;

    .line 113
    sget v0, Lo/_init_lambda5$AudioAttributesImplBaseParcelizer;->submenuarrow:I

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->MediaMetadataCompat:Landroid/widget/ImageView;

    if-eqz v0, :cond_37

    .line 115
    iget-object v1, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->MediaBrowserCompatMediaItem:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 117
    :cond_37
    sget v0, Lo/_init_lambda5$AudioAttributesImplBaseParcelizer;->group_divider:I

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->RemoteActionCompatParcelizer:Landroid/widget/ImageView;

    .line 119
    sget v0, Lo/_init_lambda5$AudioAttributesImplBaseParcelizer;->content:I

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->AudioAttributesCompatParcelizer:Landroid/widget/LinearLayout;

    return-void
.end method

.method protected onMeasure(II)V
    .registers 6

    .line 282
    iget-object v0, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->MediaBrowserCompatCustomActionResultReceiver:Landroid/widget/ImageView;

    if-eqz v0, :cond_20

    iget-boolean v0, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->AudioAttributesImplBaseParcelizer:Z

    if-eqz v0, :cond_20

    .line 284
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    .line 285
    iget-object v1, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->MediaBrowserCompatCustomActionResultReceiver:Landroid/widget/ImageView;

    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroid/widget/LinearLayout$LayoutParams;

    .line 286
    iget v2, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    if-lez v2, :cond_20

    iget v2, v1, Landroid/view/ViewGroup$LayoutParams;->width:I

    if-gtz v2, :cond_20

    .line 287
    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    iput v0, v1, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 290
    :cond_20
    invoke-super {p0, p1, p2}, Landroid/widget/LinearLayout;->onMeasure(II)V

    return-void
.end method

.method public setCheckable(Z)V
    .registers 5

    if-nez p1, :cond_a

    .line 171
    iget-object v0, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->RatingCompat:Landroid/widget/RadioButton;

    if-nez v0, :cond_a

    iget-object v0, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->write:Landroid/widget/CheckBox;

    if-eqz v0, :cond_5a

    .line 180
    :cond_a
    iget-object v0, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->AudioAttributesImplApi21Parcelizer:Lo/onRetainNonConfigurationInstance;

    invoke-virtual {v0}, Lo/onRetainNonConfigurationInstance;->MediaBrowserCompatCustomActionResultReceiver()Z

    move-result v0

    if-eqz v0, :cond_1e

    .line 181
    iget-object v0, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->RatingCompat:Landroid/widget/RadioButton;

    if-nez v0, :cond_19

    .line 182
    invoke-direct {p0}, Landroidx/appcompat/view/menu/ListMenuItemView;->MediaBrowserCompatCustomActionResultReceiver()V

    .line 184
    :cond_19
    iget-object v0, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->RatingCompat:Landroid/widget/RadioButton;

    .line 185
    iget-object v1, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->write:Landroid/widget/CheckBox;

    goto :goto_29

    .line 187
    :cond_1e
    iget-object v0, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->write:Landroid/widget/CheckBox;

    if-nez v0, :cond_25

    .line 188
    invoke-direct {p0}, Landroidx/appcompat/view/menu/ListMenuItemView;->read()V

    .line 190
    :cond_25
    iget-object v0, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->write:Landroid/widget/CheckBox;

    .line 191
    iget-object v1, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->RatingCompat:Landroid/widget/RadioButton;

    :goto_29
    const/16 v2, 0x8

    if-eqz p1, :cond_4c

    .line 195
    iget-object p0, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->AudioAttributesImplApi21Parcelizer:Lo/onRetainNonConfigurationInstance;

    invoke-virtual {p0}, Lo/onRetainNonConfigurationInstance;->isChecked()Z

    move-result p0

    invoke-virtual {v0, p0}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 197
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result p0

    if-eqz p0, :cond_40

    const/4 p0, 0x0

    .line 198
    invoke-virtual {v0, p0}, Landroid/view/View;->setVisibility(I)V

    :cond_40
    if-eqz v1, :cond_5a

    .line 202
    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    move-result p0

    if-eq p0, v2, :cond_5a

    .line 203
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    return-void

    .line 206
    :cond_4c
    iget-object p1, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->write:Landroid/widget/CheckBox;

    if-eqz p1, :cond_53

    .line 207
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 209
    :cond_53
    iget-object p0, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->RatingCompat:Landroid/widget/RadioButton;

    if-eqz p0, :cond_5a

    .line 210
    invoke-virtual {p0, v2}, Landroid/view/View;->setVisibility(I)V

    :cond_5a
    return-void
.end method

.method public setChecked(Z)V
    .registers 3

    .line 219
    iget-object v0, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->AudioAttributesImplApi21Parcelizer:Lo/onRetainNonConfigurationInstance;

    invoke-virtual {v0}, Lo/onRetainNonConfigurationInstance;->MediaBrowserCompatCustomActionResultReceiver()Z

    move-result v0

    if-eqz v0, :cond_12

    .line 220
    iget-object v0, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->RatingCompat:Landroid/widget/RadioButton;

    if-nez v0, :cond_f

    .line 221
    invoke-direct {p0}, Landroidx/appcompat/view/menu/ListMenuItemView;->MediaBrowserCompatCustomActionResultReceiver()V

    .line 223
    :cond_f
    iget-object p0, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->RatingCompat:Landroid/widget/RadioButton;

    goto :goto_1b

    .line 225
    :cond_12
    iget-object v0, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->write:Landroid/widget/CheckBox;

    if-nez v0, :cond_19

    .line 226
    invoke-direct {p0}, Landroidx/appcompat/view/menu/ListMenuItemView;->read()V

    .line 228
    :cond_19
    iget-object p0, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->write:Landroid/widget/CheckBox;

    .line 231
    :goto_1b
    invoke-virtual {p0, p1}, Landroid/widget/CompoundButton;->setChecked(Z)V

    return-void
.end method

.method public setForceShowIcon(Z)V
    .registers 2

    .line 150
    iput-boolean p1, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->IconCompatParcelizer:Z

    iput-boolean p1, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->AudioAttributesImplBaseParcelizer:Z

    return-void
.end method

.method public setGroupDividerEnabled(Z)V
    .registers 3

    .line 339
    iget-object v0, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->RemoteActionCompatParcelizer:Landroid/widget/ImageView;

    if-eqz v0, :cond_11

    .line 341
    iget-boolean p0, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->AudioAttributesImplApi26Parcelizer:Z

    if-nez p0, :cond_c

    if-eqz p1, :cond_c

    const/4 p0, 0x0

    goto :goto_e

    :cond_c
    const/16 p0, 0x8

    .line 340
    :goto_e
    invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setVisibility(I)V

    :cond_11
    return-void
.end method

.method public setIcon(Landroid/graphics/drawable/Drawable;)V
    .registers 6

    .line 256
    iget-object v0, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->AudioAttributesImplApi21Parcelizer:Lo/onRetainNonConfigurationInstance;

    invoke-virtual {v0}, Lo/onRetainNonConfigurationInstance;->MediaBrowserCompatSearchResultReceiver()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_f

    iget-boolean v0, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->IconCompatParcelizer:Z

    if-nez v0, :cond_f

    move v0, v1

    goto :goto_10

    :cond_f
    const/4 v0, 0x1

    :goto_10
    if-nez v0, :cond_16

    .line 257
    iget-boolean v2, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->AudioAttributesImplBaseParcelizer:Z

    if-eqz v2, :cond_48

    .line 261
    :cond_16
    iget-object v2, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->MediaBrowserCompatCustomActionResultReceiver:Landroid/widget/ImageView;

    if-nez v2, :cond_20

    if-nez p1, :cond_20

    iget-boolean v3, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->AudioAttributesImplBaseParcelizer:Z

    if-eqz v3, :cond_48

    :cond_20
    if-nez v2, :cond_25

    .line 266
    invoke-direct {p0}, Landroidx/appcompat/view/menu/ListMenuItemView;->AudioAttributesCompatParcelizer()V

    :cond_25
    if-nez p1, :cond_33

    .line 269
    iget-boolean v2, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->AudioAttributesImplBaseParcelizer:Z

    if-nez v2, :cond_33

    .line 276
    iget-object p0, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->MediaBrowserCompatCustomActionResultReceiver:Landroid/widget/ImageView;

    const/16 p1, 0x8

    invoke-virtual {p0, p1}, Landroid/widget/ImageView;->setVisibility(I)V

    return-void

    .line 270
    :cond_33
    iget-object v2, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->MediaBrowserCompatCustomActionResultReceiver:Landroid/widget/ImageView;

    if-nez v0, :cond_38

    const/4 p1, 0x0

    :cond_38
    invoke-virtual {v2, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 272
    iget-object p1, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->MediaBrowserCompatCustomActionResultReceiver:Landroid/widget/ImageView;

    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    move-result p1

    if-eqz p1, :cond_48

    .line 273
    iget-object p0, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->MediaBrowserCompatCustomActionResultReceiver:Landroid/widget/ImageView;

    invoke-virtual {p0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    :cond_48
    return-void
.end method

.method public setShortcut(ZC)V
    .registers 4

    if-eqz p1, :cond_c

    .line 242
    iget-object p1, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->AudioAttributesImplApi21Parcelizer:Lo/onRetainNonConfigurationInstance;

    invoke-virtual {p1}, Lo/onRetainNonConfigurationInstance;->RatingCompat()Z

    move-result p1

    if-eqz p1, :cond_c

    const/4 p1, 0x0

    goto :goto_e

    :cond_c
    const/16 p1, 0x8

    :goto_e
    if-nez p1, :cond_1b

    .line 246
    iget-object p2, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->MediaDescriptionCompat:Landroid/widget/TextView;

    iget-object v0, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->AudioAttributesImplApi21Parcelizer:Lo/onRetainNonConfigurationInstance;

    invoke-virtual {v0}, Lo/onRetainNonConfigurationInstance;->AudioAttributesCompatParcelizer()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 249
    :cond_1b
    iget-object p2, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->MediaDescriptionCompat:Landroid/widget/TextView;

    invoke-virtual {p2}, Landroid/view/View;->getVisibility()I

    move-result p2

    if-eq p2, p1, :cond_28

    .line 250
    iget-object p0, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->MediaDescriptionCompat:Landroid/widget/TextView;

    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    :cond_28
    return-void
.end method

.method public setTitle(Ljava/lang/CharSequence;)V
    .registers 3

    if-eqz p1, :cond_16

    .line 156
    iget-object v0, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 158
    iget-object p1, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Landroid/widget/TextView;

    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    move-result p1

    if-eqz p1, :cond_25

    iget-object p0, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Landroid/widget/TextView;

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    return-void

    .line 160
    :cond_16
    iget-object p1, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Landroid/widget/TextView;

    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    move-result p1

    const/16 v0, 0x8

    if-eq p1, v0, :cond_25

    iget-object p0, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Landroid/widget/TextView;

    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    :cond_25
    return-void
.end method

.method public final write()Z
    .registers 1

    const/4 p0, 0x0

    return p0
.end method
