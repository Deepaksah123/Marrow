###### Class androidx.appcompat.widget.ActionBarContextView (androidx.appcompat.widget.ActionBarContextView)
.class public Landroidx/appcompat/widget/ActionBarContextView;
.super Lo/removeOnPictureInPictureModeChangedListener;
.source "SourceFile"


# instance fields
.field private AudioAttributesImplApi21Parcelizer:Landroid/view/View;

.field private AudioAttributesImplApi26Parcelizer:I

.field private MediaBrowserCompatCustomActionResultReceiver:Landroid/view/View;

.field private MediaBrowserCompatItemReceiver:Landroid/view/View;

.field private MediaBrowserCompatMediaItem:Landroid/widget/LinearLayout;

.field private MediaBrowserCompatSearchResultReceiver:Landroid/widget/TextView;

.field private MediaDescriptionCompat:Ljava/lang/CharSequence;

.field private MediaMetadataCompat:I

.field private RatingCompat:Ljava/lang/CharSequence;

.field private onAddQueueItem:Landroid/widget/TextView;

.field private onCommand:Z

.field private onCustomAction:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 3

    const/4 v0, 0x0

    .line 58
    invoke-direct {p0, p1, v0}, Landroidx/appcompat/widget/ActionBarContextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 4

    .line 62
    sget v0, Lo/_init_lambda5$read;->actionModeStyle:I

    invoke-direct {p0, p1, p2, v0}, Landroidx/appcompat/widget/ActionBarContextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 6

    .line 67
    invoke-direct {p0, p1, p2, p3}, Lo/removeOnPictureInPictureModeChangedListener;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 69
    sget-object v0, Lo/_init_lambda5$AudioAttributesImplApi26Parcelizer;->ActionMode:[I

    const/4 v1, 0x0

    invoke-static {p1, p2, v0, p3, v1}, Lo/setTitle;->read(Landroid/content/Context;Landroid/util/AttributeSet;[III)Lo/setTitle;

    move-result-object p1

    .line 71
    sget p2, Lo/_init_lambda5$AudioAttributesImplApi26Parcelizer;->ActionMode_background:I

    invoke-virtual {p1, p2}, Lo/setTitle;->IconCompatParcelizer(I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    invoke-static {p0, p2}, Lo/InvalidTypeIdException;->read(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V

    .line 72
    sget p2, Lo/_init_lambda5$AudioAttributesImplApi26Parcelizer;->ActionMode_titleTextStyle:I

    invoke-virtual {p1, p2, v1}, Lo/setTitle;->MediaBrowserCompatItemReceiver(II)I

    move-result p2

    iput p2, p0, Landroidx/appcompat/widget/ActionBarContextView;->onCustomAction:I

    .line 74
    sget p2, Lo/_init_lambda5$AudioAttributesImplApi26Parcelizer;->ActionMode_subtitleTextStyle:I

    invoke-virtual {p1, p2, v1}, Lo/setTitle;->MediaBrowserCompatItemReceiver(II)I

    move-result p2

    iput p2, p0, Landroidx/appcompat/widget/ActionBarContextView;->MediaMetadataCompat:I

    .line 77
    sget p2, Lo/_init_lambda5$AudioAttributesImplApi26Parcelizer;->ActionMode_height:I

    invoke-virtual {p1, p2, v1}, Lo/setTitle;->IconCompatParcelizer(II)I

    move-result p2

    iput p2, p0, Lo/removeOnPictureInPictureModeChangedListener;->RemoteActionCompatParcelizer:I

    .line 80
    sget p2, Lo/_init_lambda5$AudioAttributesImplApi26Parcelizer;->ActionMode_closeItemLayout:I

    sget p3, Lo/_init_lambda5$MediaBrowserCompatCustomActionResultReceiver;->abc_action_mode_close_item_material:I

    invoke-virtual {p1, p2, p3}, Lo/setTitle;->MediaBrowserCompatItemReceiver(II)I

    move-result p2

    iput p2, p0, Landroidx/appcompat/widget/ActionBarContextView;->AudioAttributesImplApi26Parcelizer:I

    .line 84
    invoke-virtual {p1}, Lo/setTitle;->write()V

    return-void
.end method

.method private AudioAttributesImplApi26Parcelizer()V
    .registers 7

    .line 136
    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarContextView;->MediaBrowserCompatMediaItem:Landroid/widget/LinearLayout;

    if-nez v0, :cond_53

    .line 137
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    .line 138
    sget v1, Lo/_init_lambda5$MediaBrowserCompatCustomActionResultReceiver;->abc_action_bar_title_item:I

    invoke-virtual {v0, v1, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 139
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Landroidx/appcompat/widget/ActionBarContextView;->MediaBrowserCompatMediaItem:Landroid/widget/LinearLayout;

    .line 140
    sget v1, Lo/_init_lambda5$AudioAttributesImplBaseParcelizer;->action_bar_title:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Landroidx/appcompat/widget/ActionBarContextView;->onAddQueueItem:Landroid/widget/TextView;

    .line 141
    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarContextView;->MediaBrowserCompatMediaItem:Landroid/widget/LinearLayout;

    sget v1, Lo/_init_lambda5$AudioAttributesImplBaseParcelizer;->action_bar_subtitle:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Landroidx/appcompat/widget/ActionBarContextView;->MediaBrowserCompatSearchResultReceiver:Landroid/widget/TextView;

    .line 142
    iget v0, p0, Landroidx/appcompat/widget/ActionBarContextView;->onCustomAction:I

    if-eqz v0, :cond_44

    .line 143
    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarContextView;->onAddQueueItem:Landroid/widget/TextView;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    iget v2, p0, Landroidx/appcompat/widget/ActionBarContextView;->onCustomAction:I

    invoke-virtual {v0, v1, v2}, Landroid/widget/TextView;->setTextAppearance(Landroid/content/Context;I)V

    .line 145
    :cond_44
    iget v0, p0, Landroidx/appcompat/widget/ActionBarContextView;->MediaMetadataCompat:I

    if-eqz v0, :cond_53

    .line 146
    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarContextView;->MediaBrowserCompatSearchResultReceiver:Landroid/widget/TextView;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    iget v2, p0, Landroidx/appcompat/widget/ActionBarContextView;->MediaMetadataCompat:I

    invoke-virtual {v0, v1, v2}, Landroid/widget/TextView;->setTextAppearance(Landroid/content/Context;I)V

    .line 150
    :cond_53
    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarContextView;->onAddQueueItem:Landroid/widget/TextView;

    iget-object v1, p0, Landroidx/appcompat/widget/ActionBarContextView;->RatingCompat:Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 151
    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarContextView;->MediaBrowserCompatSearchResultReceiver:Landroid/widget/TextView;

    iget-object v1, p0, Landroidx/appcompat/widget/ActionBarContextView;->MediaDescriptionCompat:Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 153
    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarContextView;->RatingCompat:Ljava/lang/CharSequence;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    .line 154
    iget-object v1, p0, Landroidx/appcompat/widget/ActionBarContextView;->MediaDescriptionCompat:Ljava/lang/CharSequence;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    .line 155
    iget-object v2, p0, Landroidx/appcompat/widget/ActionBarContextView;->MediaBrowserCompatSearchResultReceiver:Landroid/widget/TextView;

    const/16 v3, 0x8

    const/4 v4, 0x0

    if-nez v1, :cond_76

    move v5, v4

    goto :goto_77

    :cond_76
    move v5, v3

    :goto_77
    invoke-virtual {v2, v5}, Landroid/view/View;->setVisibility(I)V

    .line 156
    iget-object v2, p0, Landroidx/appcompat/widget/ActionBarContextView;->MediaBrowserCompatMediaItem:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_80

    if-nez v1, :cond_81

    :cond_80
    move v3, v4

    :cond_81
    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 157
    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarContextView;->MediaBrowserCompatMediaItem:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-nez v0, :cond_91

    .line 158
    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarContextView;->MediaBrowserCompatMediaItem:Landroid/widget/LinearLayout;

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    :cond_91
    return-void
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer()V
    .registers 2

    .line 195
    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarContextView;->MediaBrowserCompatCustomActionResultReceiver:Landroid/view/View;

    if-nez v0, :cond_7

    .line 196
    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionBarContextView;->MediaBrowserCompatItemReceiver()V

    :cond_7
    return-void
.end method

.method public final IconCompatParcelizer()Ljava/lang/CharSequence;
    .registers 1

    .line 132
    iget-object p0, p0, Landroidx/appcompat/widget/ActionBarContextView;->MediaDescriptionCompat:Ljava/lang/CharSequence;

    return-object p0
.end method

.method public final IconCompatParcelizer(Lo/onActivityResult;)V
    .registers 5

    .line 163
    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarContextView;->MediaBrowserCompatCustomActionResultReceiver:Landroid/view/View;

    if-nez v0, :cond_19

    .line 164
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    .line 165
    iget v1, p0, Landroidx/appcompat/widget/ActionBarContextView;->AudioAttributesImplApi26Parcelizer:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p0, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Landroidx/appcompat/widget/ActionBarContextView;->MediaBrowserCompatCustomActionResultReceiver:Landroid/view/View;

    .line 166
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    goto :goto_24

    .line 167
    :cond_19
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-nez v0, :cond_24

    .line 168
    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarContextView;->MediaBrowserCompatCustomActionResultReceiver:Landroid/view/View;

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 171
    :cond_24
    :goto_24
    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarContextView;->MediaBrowserCompatCustomActionResultReceiver:Landroid/view/View;

    sget v1, Lo/_init_lambda5$AudioAttributesImplBaseParcelizer;->action_mode_close_button:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Landroidx/appcompat/widget/ActionBarContextView;->MediaBrowserCompatItemReceiver:Landroid/view/View;

    .line 172
    new-instance v1, Landroidx/appcompat/widget/ActionBarContextView$5;

    invoke-direct {v1, p0, p1}, Landroidx/appcompat/widget/ActionBarContextView$5;-><init>(Landroidx/appcompat/widget/ActionBarContextView;Lo/onActivityResult;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 179
    invoke-virtual {p1}, Lo/onActivityResult;->RemoteActionCompatParcelizer()Landroid/view/Menu;

    move-result-object p1

    check-cast p1, Lo/onRequestPermissionsResult;

    .line 180
    iget-object v0, p0, Lo/removeOnPictureInPictureModeChangedListener;->write:Landroidx/appcompat/widget/ActionMenuPresenter;

    if-eqz v0, :cond_45

    .line 181
    iget-object v0, p0, Lo/removeOnPictureInPictureModeChangedListener;->write:Landroidx/appcompat/widget/ActionMenuPresenter;

    invoke-virtual {v0}, Landroidx/appcompat/widget/ActionMenuPresenter;->RemoteActionCompatParcelizer()Z

    .line 183
    :cond_45
    new-instance v0, Landroidx/appcompat/widget/ActionMenuPresenter;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroidx/appcompat/widget/ActionMenuPresenter;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/removeOnPictureInPictureModeChangedListener;->write:Landroidx/appcompat/widget/ActionMenuPresenter;

    .line 184
    iget-object v0, p0, Lo/removeOnPictureInPictureModeChangedListener;->write:Landroidx/appcompat/widget/ActionMenuPresenter;

    invoke-virtual {v0}, Landroidx/appcompat/widget/ActionMenuPresenter;->MediaBrowserCompatMediaItem()V

    .line 186
    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    const/4 v1, -0x2

    const/4 v2, -0x1

    invoke-direct {v0, v1, v2}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 188
    iget-object v1, p0, Lo/removeOnPictureInPictureModeChangedListener;->write:Landroidx/appcompat/widget/ActionMenuPresenter;

    iget-object v2, p0, Lo/removeOnPictureInPictureModeChangedListener;->read:Landroid/content/Context;

    invoke-virtual {p1, v1, v2}, Lo/onRequestPermissionsResult;->write(Lo/peekAvailableContext;Landroid/content/Context;)V

    .line 189
    iget-object p1, p0, Lo/removeOnPictureInPictureModeChangedListener;->write:Landroidx/appcompat/widget/ActionMenuPresenter;

    invoke-virtual {p1, p0}, Lo/onConfigurationChanged;->RemoteActionCompatParcelizer(Landroid/view/ViewGroup;)Lo/registerForActivityResult;

    move-result-object p1

    check-cast p1, Landroidx/appcompat/widget/ActionMenuView;

    iput-object p1, p0, Lo/removeOnPictureInPictureModeChangedListener;->IconCompatParcelizer:Landroidx/appcompat/widget/ActionMenuView;

    .line 190
    iget-object p1, p0, Lo/removeOnPictureInPictureModeChangedListener;->IconCompatParcelizer:Landroidx/appcompat/widget/ActionMenuView;

    const/4 v1, 0x0

    invoke-static {p1, v1}, Lo/InvalidTypeIdException;->read(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V

    .line 191
    iget-object p1, p0, Lo/removeOnPictureInPictureModeChangedListener;->IconCompatParcelizer:Landroidx/appcompat/widget/ActionMenuView;

    invoke-virtual {p0, p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public final MediaBrowserCompatItemReceiver()V
    .registers 2

    .line 202
    invoke-virtual {p0}, Landroid/view/ViewGroup;->removeAllViews()V

    const/4 v0, 0x0

    .line 203
    iput-object v0, p0, Landroidx/appcompat/widget/ActionBarContextView;->AudioAttributesImplApi21Parcelizer:Landroid/view/View;

    .line 204
    iput-object v0, p0, Lo/removeOnPictureInPictureModeChangedListener;->IconCompatParcelizer:Landroidx/appcompat/widget/ActionMenuView;

    .line 205
    iput-object v0, p0, Lo/removeOnPictureInPictureModeChangedListener;->write:Landroidx/appcompat/widget/ActionMenuPresenter;

    .line 206
    iget-object p0, p0, Landroidx/appcompat/widget/ActionBarContextView;->MediaBrowserCompatItemReceiver:Landroid/view/View;

    if-eqz p0, :cond_11

    .line 207
    invoke-virtual {p0, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_11
    return-void
.end method

.method public final RemoteActionCompatParcelizer()Ljava/lang/CharSequence;
    .registers 1

    .line 128
    iget-object p0, p0, Landroidx/appcompat/widget/ActionBarContextView;->RatingCompat:Ljava/lang/CharSequence;

    return-object p0
.end method

.method protected generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    .registers 3

    .line 239
    new-instance p0, Landroid/view/ViewGroup$MarginLayoutParams;

    const/4 v0, -0x1

    const/4 v1, -0x2

    invoke-direct {p0, v0, v1}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(II)V

    return-object p0
.end method

.method public generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams;
    .registers 3

    .line 244
    new-instance v0, Landroid/view/ViewGroup$MarginLayoutParams;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p0

    invoke-direct {v0, p0, p1}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-object v0
.end method

.method public onDetachedFromWindow()V
    .registers 2

    .line 89
    invoke-super {p0}, Lo/removeOnPictureInPictureModeChangedListener;->onDetachedFromWindow()V

    .line 90
    iget-object v0, p0, Lo/removeOnPictureInPictureModeChangedListener;->write:Landroidx/appcompat/widget/ActionMenuPresenter;

    if-eqz v0, :cond_11

    .line 91
    iget-object v0, p0, Lo/removeOnPictureInPictureModeChangedListener;->write:Landroidx/appcompat/widget/ActionMenuPresenter;

    invoke-virtual {v0}, Landroidx/appcompat/widget/ActionMenuPresenter;->write()Z

    .line 92
    iget-object p0, p0, Lo/removeOnPictureInPictureModeChangedListener;->write:Landroidx/appcompat/widget/ActionMenuPresenter;

    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionMenuPresenter;->AudioAttributesImplApi21Parcelizer()Z

    :cond_11
    return-void
.end method

.method public bridge synthetic onHoverEvent(Landroid/view/MotionEvent;)Z
    .registers 2

    .line 41
    invoke-super {p0, p1}, Lo/removeOnPictureInPictureModeChangedListener;->onHoverEvent(Landroid/view/MotionEvent;)Z

    move-result p0

    return p0
.end method

.method protected onLayout(ZIIII)V
    .registers 10

    .line 329
    invoke-static {p0}, Lo/setChecked;->AudioAttributesCompatParcelizer(Landroid/view/View;)Z

    move-result p1

    if-eqz p1, :cond_e

    sub-int v0, p4, p2

    .line 330
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v1

    sub-int/2addr v0, v1

    goto :goto_12

    :cond_e
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v0

    .line 331
    :goto_12
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v1

    sub-int/2addr p5, p3

    .line 332
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result p3

    sub-int/2addr p5, p3

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result p3

    sub-int/2addr p5, p3

    .line 334
    iget-object p3, p0, Landroidx/appcompat/widget/ActionBarContextView;->MediaBrowserCompatCustomActionResultReceiver:Landroid/view/View;

    const/16 v2, 0x8

    if-eqz p3, :cond_52

    invoke-virtual {p3}, Landroid/view/View;->getVisibility()I

    move-result p3

    if-eq p3, v2, :cond_52

    .line 335
    iget-object p3, p0, Landroidx/appcompat/widget/ActionBarContextView;->MediaBrowserCompatCustomActionResultReceiver:Landroid/view/View;

    invoke-virtual {p3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p3

    check-cast p3, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz p1, :cond_3a

    .line 336
    iget v3, p3, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    goto :goto_3c

    :cond_3a
    iget v3, p3, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    :goto_3c
    if-eqz p1, :cond_41

    .line 337
    iget p3, p3, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    goto :goto_43

    :cond_41
    iget p3, p3, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 338
    :goto_43
    invoke-static {v0, v3, p1}, Landroidx/appcompat/widget/ActionBarContextView;->IconCompatParcelizer(IIZ)I

    move-result v0

    .line 339
    iget-object v3, p0, Landroidx/appcompat/widget/ActionBarContextView;->MediaBrowserCompatCustomActionResultReceiver:Landroid/view/View;

    invoke-static {v3, v0, v1, p5, p1}, Landroidx/appcompat/widget/ActionBarContextView;->read(Landroid/view/View;IIIZ)I

    move-result v3

    add-int/2addr v0, v3

    .line 340
    invoke-static {v0, p3, p1}, Landroidx/appcompat/widget/ActionBarContextView;->IconCompatParcelizer(IIZ)I

    move-result v0

    .line 343
    :cond_52
    iget-object p3, p0, Landroidx/appcompat/widget/ActionBarContextView;->MediaBrowserCompatMediaItem:Landroid/widget/LinearLayout;

    if-eqz p3, :cond_67

    iget-object v3, p0, Landroidx/appcompat/widget/ActionBarContextView;->AudioAttributesImplApi21Parcelizer:Landroid/view/View;

    if-nez v3, :cond_67

    invoke-virtual {p3}, Landroid/view/View;->getVisibility()I

    move-result p3

    if-eq p3, v2, :cond_67

    .line 344
    iget-object p3, p0, Landroidx/appcompat/widget/ActionBarContextView;->MediaBrowserCompatMediaItem:Landroid/widget/LinearLayout;

    invoke-static {p3, v0, v1, p5, p1}, Landroidx/appcompat/widget/ActionBarContextView;->read(Landroid/view/View;IIIZ)I

    move-result p3

    add-int/2addr v0, p3

    .line 347
    :cond_67
    iget-object p3, p0, Landroidx/appcompat/widget/ActionBarContextView;->AudioAttributesImplApi21Parcelizer:Landroid/view/View;

    if-eqz p3, :cond_6e

    .line 348
    invoke-static {p3, v0, v1, p5, p1}, Landroidx/appcompat/widget/ActionBarContextView;->read(Landroid/view/View;IIIZ)I

    :cond_6e
    if-eqz p1, :cond_75

    .line 351
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result p2

    goto :goto_7c

    :cond_75
    sub-int/2addr p4, p2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result p2

    sub-int p2, p4, p2

    .line 353
    :goto_7c
    iget-object p3, p0, Lo/removeOnPictureInPictureModeChangedListener;->IconCompatParcelizer:Landroidx/appcompat/widget/ActionMenuView;

    if-eqz p3, :cond_87

    .line 354
    iget-object p0, p0, Lo/removeOnPictureInPictureModeChangedListener;->IconCompatParcelizer:Landroidx/appcompat/widget/ActionMenuView;

    xor-int/lit8 p1, p1, 0x1

    invoke-static {p0, p2, v1, p5, p1}, Landroidx/appcompat/widget/ActionBarContextView;->read(Landroid/view/View;IIIZ)I

    :cond_87
    return-void
.end method

.method protected onMeasure(II)V
    .registers 13

    .line 249
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    const/high16 v1, 0x40000000    # 2.0f

    if-ne v0, v1, :cond_10d

    .line 255
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    if-eqz v0, :cond_ee

    .line 261
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    .line 263
    iget v0, p0, Lo/removeOnPictureInPictureModeChangedListener;->RemoteActionCompatParcelizer:I

    if-lez v0, :cond_19

    .line 264
    iget p2, p0, Lo/removeOnPictureInPictureModeChangedListener;->RemoteActionCompatParcelizer:I

    goto :goto_1d

    :cond_19
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p2

    .line 266
    :goto_1d
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v2

    add-int/2addr v0, v2

    .line 267
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v2

    sub-int v2, p1, v2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v3

    sub-int/2addr v2, v3

    sub-int v3, p2, v0

    const/high16 v4, -0x80000000

    .line 269
    invoke-static {v3, v4}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v5

    .line 271
    iget-object v6, p0, Landroidx/appcompat/widget/ActionBarContextView;->MediaBrowserCompatCustomActionResultReceiver:Landroid/view/View;

    if-eqz v6, :cond_4f

    .line 272
    invoke-static {v6, v2, v5}, Landroidx/appcompat/widget/ActionBarContextView;->write(Landroid/view/View;II)I

    move-result v2

    .line 273
    iget-object v6, p0, Landroidx/appcompat/widget/ActionBarContextView;->MediaBrowserCompatCustomActionResultReceiver:Landroid/view/View;

    invoke-virtual {v6}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v6

    check-cast v6, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 274
    iget v7, v6, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    iget v6, v6, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    add-int/2addr v7, v6

    sub-int/2addr v2, v7

    .line 277
    :cond_4f
    iget-object v6, p0, Lo/removeOnPictureInPictureModeChangedListener;->IconCompatParcelizer:Landroidx/appcompat/widget/ActionMenuView;

    if-eqz v6, :cond_61

    iget-object v6, p0, Lo/removeOnPictureInPictureModeChangedListener;->IconCompatParcelizer:Landroidx/appcompat/widget/ActionMenuView;

    invoke-virtual {v6}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v6

    if-ne v6, p0, :cond_61

    .line 278
    iget-object v6, p0, Lo/removeOnPictureInPictureModeChangedListener;->IconCompatParcelizer:Landroidx/appcompat/widget/ActionMenuView;

    invoke-static {v6, v2, v5}, Landroidx/appcompat/widget/ActionBarContextView;->write(Landroid/view/View;II)I

    move-result v2

    .line 282
    :cond_61
    iget-object v6, p0, Landroidx/appcompat/widget/ActionBarContextView;->MediaBrowserCompatMediaItem:Landroid/widget/LinearLayout;

    const/4 v7, 0x0

    if-eqz v6, :cond_95

    iget-object v8, p0, Landroidx/appcompat/widget/ActionBarContextView;->AudioAttributesImplApi21Parcelizer:Landroid/view/View;

    if-nez v8, :cond_95

    .line 283
    iget-boolean v8, p0, Landroidx/appcompat/widget/ActionBarContextView;->onCommand:Z

    if-eqz v8, :cond_91

    .line 284
    invoke-static {v7, v7}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v6

    .line 285
    iget-object v8, p0, Landroidx/appcompat/widget/ActionBarContextView;->MediaBrowserCompatMediaItem:Landroid/widget/LinearLayout;

    invoke-virtual {v8, v6, v5}, Landroid/view/View;->measure(II)V

    .line 286
    iget-object v5, p0, Landroidx/appcompat/widget/ActionBarContextView;->MediaBrowserCompatMediaItem:Landroid/widget/LinearLayout;

    invoke-virtual {v5}, Landroid/view/View;->getMeasuredWidth()I

    move-result v5

    if-gt v5, v2, :cond_81

    const/4 v6, 0x1

    goto :goto_82

    :cond_81
    move v6, v7

    :goto_82
    if-eqz v6, :cond_85

    sub-int/2addr v2, v5

    .line 291
    :cond_85
    iget-object v5, p0, Landroidx/appcompat/widget/ActionBarContextView;->MediaBrowserCompatMediaItem:Landroid/widget/LinearLayout;

    if-eqz v6, :cond_8b

    move v6, v7

    goto :goto_8d

    :cond_8b
    const/16 v6, 0x8

    :goto_8d
    invoke-virtual {v5, v6}, Landroid/view/View;->setVisibility(I)V

    goto :goto_95

    .line 293
    :cond_91
    invoke-static {v6, v2, v5}, Landroidx/appcompat/widget/ActionBarContextView;->write(Landroid/view/View;II)I

    move-result v2

    .line 297
    :cond_95
    :goto_95
    iget-object v5, p0, Landroidx/appcompat/widget/ActionBarContextView;->AudioAttributesImplApi21Parcelizer:Landroid/view/View;

    if-eqz v5, :cond_cc

    .line 298
    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v5

    .line 299
    iget v6, v5, Landroid/view/ViewGroup$LayoutParams;->width:I

    const/4 v8, -0x2

    if-eq v6, v8, :cond_a4

    move v6, v1

    goto :goto_a5

    :cond_a4
    move v6, v4

    .line 301
    :goto_a5
    iget v9, v5, Landroid/view/ViewGroup$LayoutParams;->width:I

    if-ltz v9, :cond_af

    .line 302
    iget v9, v5, Landroid/view/ViewGroup$LayoutParams;->width:I

    invoke-static {v9, v2}, Ljava/lang/Math;->min(II)I

    move-result v2

    .line 303
    :cond_af
    iget v9, v5, Landroid/view/ViewGroup$LayoutParams;->height:I

    if-eq v9, v8, :cond_b4

    goto :goto_b5

    :cond_b4
    move v1, v4

    .line 305
    :goto_b5
    iget v4, v5, Landroid/view/ViewGroup$LayoutParams;->height:I

    if-ltz v4, :cond_bf

    .line 306
    iget v4, v5, Landroid/view/ViewGroup$LayoutParams;->height:I

    invoke-static {v4, v3}, Ljava/lang/Math;->min(II)I

    move-result v3

    .line 307
    :cond_bf
    iget-object v4, p0, Landroidx/appcompat/widget/ActionBarContextView;->AudioAttributesImplApi21Parcelizer:Landroid/view/View;

    invoke-static {v2, v6}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v2

    .line 308
    invoke-static {v3, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v1

    .line 307
    invoke-virtual {v4, v2, v1}, Landroid/view/View;->measure(II)V

    .line 311
    :cond_cc
    iget v1, p0, Lo/removeOnPictureInPictureModeChangedListener;->RemoteActionCompatParcelizer:I

    if-gtz v1, :cond_ea

    .line 313
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result p2

    move v1, v7

    :goto_d5
    if-ge v7, p2, :cond_e6

    .line 315
    invoke-virtual {p0, v7}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 316
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredHeight()I

    move-result v2

    add-int/2addr v2, v0

    if-le v2, v1, :cond_e3

    move v1, v2

    :cond_e3
    add-int/lit8 v7, v7, 0x1

    goto :goto_d5

    .line 321
    :cond_e6
    invoke-virtual {p0, p1, v1}, Landroidx/appcompat/widget/ActionBarContextView;->setMeasuredDimension(II)V

    return-void

    .line 323
    :cond_ea
    invoke-virtual {p0, p1, p2}, Landroidx/appcompat/widget/ActionBarContextView;->setMeasuredDimension(II)V

    return-void

    .line 257
    :cond_ee
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " can only be used with android:layout_height=\"wrap_content\""

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 251
    :cond_10d
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " can only be used with android:layout_width=\"match_parent\" (or fill_parent)"

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic onTouchEvent(Landroid/view/MotionEvent;)Z
    .registers 2

    .line 41
    invoke-super {p0, p1}, Lo/removeOnPictureInPictureModeChangedListener;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p0

    return p0
.end method

.method public final read()Z
    .registers 2

    .line 213
    iget-object v0, p0, Lo/removeOnPictureInPictureModeChangedListener;->write:Landroidx/appcompat/widget/ActionMenuPresenter;

    if-eqz v0, :cond_b

    .line 214
    iget-object p0, p0, Lo/removeOnPictureInPictureModeChangedListener;->write:Landroidx/appcompat/widget/ActionMenuPresenter;

    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionMenuPresenter;->MediaBrowserCompatSearchResultReceiver()Z

    move-result p0

    return p0

    :cond_b
    const/4 p0, 0x0

    return p0
.end method

.method public setContentHeight(I)V
    .registers 2

    .line 98
    iput p1, p0, Lo/removeOnPictureInPictureModeChangedListener;->RemoteActionCompatParcelizer:I

    return-void
.end method

.method public setCustomView(Landroid/view/View;)V
    .registers 3

    .line 102
    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarContextView;->AudioAttributesImplApi21Parcelizer:Landroid/view/View;

    if-eqz v0, :cond_7

    .line 103
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 105
    :cond_7
    iput-object p1, p0, Landroidx/appcompat/widget/ActionBarContextView;->AudioAttributesImplApi21Parcelizer:Landroid/view/View;

    if-eqz p1, :cond_15

    .line 106
    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarContextView;->MediaBrowserCompatMediaItem:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_15

    .line 107
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    const/4 v0, 0x0

    .line 108
    iput-object v0, p0, Landroidx/appcompat/widget/ActionBarContextView;->MediaBrowserCompatMediaItem:Landroid/widget/LinearLayout;

    :cond_15
    if-eqz p1, :cond_1a

    .line 111
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 113
    :cond_1a
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public setSubtitle(Ljava/lang/CharSequence;)V
    .registers 2

    .line 123
    iput-object p1, p0, Landroidx/appcompat/widget/ActionBarContextView;->MediaDescriptionCompat:Ljava/lang/CharSequence;

    .line 124
    invoke-direct {p0}, Landroidx/appcompat/widget/ActionBarContextView;->AudioAttributesImplApi26Parcelizer()V

    return-void
.end method

.method public setTitle(Ljava/lang/CharSequence;)V
    .registers 2

    .line 117
    iput-object p1, p0, Landroidx/appcompat/widget/ActionBarContextView;->RatingCompat:Ljava/lang/CharSequence;

    .line 118
    invoke-direct {p0}, Landroidx/appcompat/widget/ActionBarContextView;->AudioAttributesImplApi26Parcelizer()V

    .line 119
    invoke-static {p0, p1}, Lo/InvalidTypeIdException;->read(Landroid/view/View;Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setTitleOptional(Z)V
    .registers 3

    .line 364
    iget-boolean v0, p0, Landroidx/appcompat/widget/ActionBarContextView;->onCommand:Z

    if-eq p1, v0, :cond_7

    .line 365
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 367
    :cond_7
    iput-boolean p1, p0, Landroidx/appcompat/widget/ActionBarContextView;->onCommand:Z

    return-void
.end method

.method public bridge synthetic setVisibility(I)V
    .registers 2

    .line 41
    invoke-super {p0, p1}, Lo/removeOnPictureInPictureModeChangedListener;->setVisibility(I)V

    return-void
.end method

.method public shouldDelayChildPressedState()Z
    .registers 1

    const/4 p0, 0x0

    return p0
.end method

.method public final bridge synthetic write(IJ)Lo/findTransient;
    .registers 4

    .line 41
    invoke-super {p0, p1, p2, p3}, Lo/removeOnPictureInPictureModeChangedListener;->write(IJ)Lo/findTransient;

    move-result-object p0

    return-object p0
.end method

.method public final write()Z
    .registers 1

    .line 371
    iget-boolean p0, p0, Landroidx/appcompat/widget/ActionBarContextView;->onCommand:Z

    return p0
.end method

###### Class androidx.appcompat.widget.ActionBarContextView.AnonymousClass5 (androidx.appcompat.widget.ActionBarContextView$5)
.class final Landroidx/appcompat/widget/ActionBarContextView$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/appcompat/widget/ActionBarContextView;->IconCompatParcelizer(Lo/onActivityResult;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic IconCompatParcelizer:Lo/onActivityResult;

.field final synthetic RemoteActionCompatParcelizer:Landroidx/appcompat/widget/ActionBarContextView;


# direct methods
.method constructor <init>(Landroidx/appcompat/widget/ActionBarContextView;Lo/onActivityResult;)V
    .registers 3

    .line 172
    iput-object p1, p0, Landroidx/appcompat/widget/ActionBarContextView$5;->RemoteActionCompatParcelizer:Landroidx/appcompat/widget/ActionBarContextView;

    iput-object p2, p0, Landroidx/appcompat/widget/ActionBarContextView$5;->IconCompatParcelizer:Lo/onActivityResult;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .registers 2

    .line 175
    iget-object p0, p0, Landroidx/appcompat/widget/ActionBarContextView$5;->IconCompatParcelizer:Lo/onActivityResult;

    invoke-virtual {p0}, Lo/onActivityResult;->IconCompatParcelizer()V

    return-void
.end method
