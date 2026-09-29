###### Class androidx.appcompat.widget.ListPopupWindow (androidx.appcompat.widget.ListPopupWindow)
.class public Landroidx/appcompat/widget/ListPopupWindow;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/removeOnContextAvailableListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/appcompat/widget/ListPopupWindow$RemoteActionCompatParcelizer;,
        Landroidx/appcompat/widget/ListPopupWindow$write;,
        Landroidx/appcompat/widget/ListPopupWindow$AudioAttributesCompatParcelizer;,
        Landroidx/appcompat/widget/ListPopupWindow$read;,
        Landroidx/appcompat/widget/ListPopupWindow$IconCompatParcelizer;,
        Landroidx/appcompat/widget/ListPopupWindow$MediaBrowserCompatCustomActionResultReceiver;,
        Landroidx/appcompat/widget/ListPopupWindow$MediaBrowserCompatItemReceiver;
    }
.end annotation


# instance fields
.field final AudioAttributesCompatParcelizer:Landroid/os/Handler;

.field final AudioAttributesImplApi21Parcelizer:Landroidx/appcompat/widget/ListPopupWindow$MediaBrowserCompatItemReceiver;

.field private AudioAttributesImplApi26Parcelizer:Landroid/view/View;

.field private AudioAttributesImplBaseParcelizer:I

.field IconCompatParcelizer:Lo/Keep;

.field MediaBrowserCompatCustomActionResultReceiver:Landroid/widget/PopupWindow;

.field private MediaBrowserCompatItemReceiver:Z

.field private MediaBrowserCompatMediaItem:I

.field private MediaBrowserCompatSearchResultReceiver:I

.field private MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Z

.field private MediaDescriptionCompat:I

.field private MediaMetadataCompat:Landroid/graphics/drawable/Drawable;

.field private RatingCompat:Z

.field private RemoteActionCompatParcelizer:Landroid/widget/ListAdapter;

.field private handleMediaPlayPauseIfPendingOnHandler:I

.field private onAddQueueItem:I

.field private onCommand:Landroid/graphics/Rect;

.field private final onCustomAction:Landroidx/appcompat/widget/ListPopupWindow$AudioAttributesCompatParcelizer;

.field private onFastForward:Landroid/widget/AdapterView$OnItemClickListener;

.field private onMediaButtonEvent:Landroid/database/DataSetObserver;

.field private onPause:Landroid/widget/AdapterView$OnItemSelectedListener;

.field private onPlay:Z

.field private onPlayFromMediaId:Z

.field private final onPlayFromSearch:Landroidx/appcompat/widget/ListPopupWindow$IconCompatParcelizer;

.field private onPlayFromUri:Landroid/view/View;

.field private onPrepare:Ljava/lang/Runnable;

.field private onPrepareFromMediaId:I

.field private onPrepareFromSearch:Z

.field private final onRemoveQueueItem:Landroid/graphics/Rect;

.field private final onRewind:Landroidx/appcompat/widget/ListPopupWindow$MediaBrowserCompatCustomActionResultReceiver;

.field read:I

.field private write:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 4

    const/4 v0, 0x0

    .line 227
    sget v1, Lo/_init_lambda5$read;->listPopupWindowStyle:I

    invoke-direct {p0, p1, v0, v1}, Landroidx/appcompat/widget/ListPopupWindow;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 4

    .line 238
    sget v0, Lo/_init_lambda5$read;->listPopupWindowStyle:I

    invoke-direct {p0, p1, p2, v0}, Landroidx/appcompat/widget/ListPopupWindow;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 5

    const/4 v0, 0x0

    .line 251
    invoke-direct {p0, p1, p2, p3, v0}, Landroidx/appcompat/widget/ListPopupWindow;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .registers 8

    .line 264
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x2

    .line 118
    iput v0, p0, Landroidx/appcompat/widget/ListPopupWindow;->MediaBrowserCompatMediaItem:I

    .line 119
    iput v0, p0, Landroidx/appcompat/widget/ListPopupWindow;->handleMediaPlayPauseIfPendingOnHandler:I

    const/16 v0, 0x3ea

    .line 122
    iput v0, p0, Landroidx/appcompat/widget/ListPopupWindow;->onAddQueueItem:I

    const/4 v0, 0x0

    .line 127
    iput v0, p0, Landroidx/appcompat/widget/ListPopupWindow;->AudioAttributesImplBaseParcelizer:I

    .line 129
    iput-boolean v0, p0, Landroidx/appcompat/widget/ListPopupWindow;->MediaBrowserCompatItemReceiver:Z

    .line 130
    iput-boolean v0, p0, Landroidx/appcompat/widget/ListPopupWindow;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Z

    const v1, 0x7fffffff

    .line 131
    iput v1, p0, Landroidx/appcompat/widget/ListPopupWindow;->read:I

    .line 134
    iput v0, p0, Landroidx/appcompat/widget/ListPopupWindow;->onPrepareFromMediaId:I

    .line 145
    new-instance v1, Landroidx/appcompat/widget/ListPopupWindow$MediaBrowserCompatItemReceiver;

    invoke-direct {v1, p0}, Landroidx/appcompat/widget/ListPopupWindow$MediaBrowserCompatItemReceiver;-><init>(Landroidx/appcompat/widget/ListPopupWindow;)V

    iput-object v1, p0, Landroidx/appcompat/widget/ListPopupWindow;->AudioAttributesImplApi21Parcelizer:Landroidx/appcompat/widget/ListPopupWindow$MediaBrowserCompatItemReceiver;

    .line 146
    new-instance v1, Landroidx/appcompat/widget/ListPopupWindow$MediaBrowserCompatCustomActionResultReceiver;

    invoke-direct {v1, p0}, Landroidx/appcompat/widget/ListPopupWindow$MediaBrowserCompatCustomActionResultReceiver;-><init>(Landroidx/appcompat/widget/ListPopupWindow;)V

    iput-object v1, p0, Landroidx/appcompat/widget/ListPopupWindow;->onRewind:Landroidx/appcompat/widget/ListPopupWindow$MediaBrowserCompatCustomActionResultReceiver;

    .line 147
    new-instance v1, Landroidx/appcompat/widget/ListPopupWindow$IconCompatParcelizer;

    invoke-direct {v1, p0}, Landroidx/appcompat/widget/ListPopupWindow$IconCompatParcelizer;-><init>(Landroidx/appcompat/widget/ListPopupWindow;)V

    iput-object v1, p0, Landroidx/appcompat/widget/ListPopupWindow;->onPlayFromSearch:Landroidx/appcompat/widget/ListPopupWindow$IconCompatParcelizer;

    .line 148
    new-instance v1, Landroidx/appcompat/widget/ListPopupWindow$AudioAttributesCompatParcelizer;

    invoke-direct {v1, p0}, Landroidx/appcompat/widget/ListPopupWindow$AudioAttributesCompatParcelizer;-><init>(Landroidx/appcompat/widget/ListPopupWindow;)V

    iput-object v1, p0, Landroidx/appcompat/widget/ListPopupWindow;->onCustomAction:Landroidx/appcompat/widget/ListPopupWindow$AudioAttributesCompatParcelizer;

    .line 153
    new-instance v1, Landroid/graphics/Rect;

    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    iput-object v1, p0, Landroidx/appcompat/widget/ListPopupWindow;->onRemoveQueueItem:Landroid/graphics/Rect;

    .line 265
    iput-object p1, p0, Landroidx/appcompat/widget/ListPopupWindow;->write:Landroid/content/Context;

    .line 266
    new-instance v1, Landroid/os/Handler;

    invoke-virtual {p1}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v1, p0, Landroidx/appcompat/widget/ListPopupWindow;->AudioAttributesCompatParcelizer:Landroid/os/Handler;

    .line 268
    sget-object v1, Lo/_init_lambda5$AudioAttributesImplApi26Parcelizer;->ListPopupWindow:[I

    invoke-virtual {p1, p2, v1, p3, p4}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v1

    .line 270
    sget v2, Lo/_init_lambda5$AudioAttributesImplApi26Parcelizer;->ListPopupWindow_android_dropDownHorizontalOffset:I

    invoke-virtual {v1, v2, v0}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v2

    iput v2, p0, Landroidx/appcompat/widget/ListPopupWindow;->MediaBrowserCompatSearchResultReceiver:I

    .line 272
    sget v2, Lo/_init_lambda5$AudioAttributesImplApi26Parcelizer;->ListPopupWindow_android_dropDownVerticalOffset:I

    invoke-virtual {v1, v2, v0}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v0

    iput v0, p0, Landroidx/appcompat/widget/ListPopupWindow;->MediaDescriptionCompat:I

    const/4 v2, 0x1

    if-eqz v0, :cond_65

    .line 275
    iput-boolean v2, p0, Landroidx/appcompat/widget/ListPopupWindow;->RatingCompat:Z

    .line 277
    :cond_65
    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    .line 279
    new-instance v0, Landroidx/appcompat/widget/AppCompatPopupWindow;

    invoke-direct {v0, p1, p2, p3, p4}, Landroidx/appcompat/widget/AppCompatPopupWindow;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    iput-object v0, p0, Landroidx/appcompat/widget/ListPopupWindow;->MediaBrowserCompatCustomActionResultReceiver:Landroid/widget/PopupWindow;

    .line 280
    invoke-virtual {v0, v2}, Landroid/widget/PopupWindow;->setInputMethodMode(I)V

    return-void
.end method

.method private AudioAttributesImplApi21Parcelizer()V
    .registers 3

    .line 792
    iget-object v0, p0, Landroidx/appcompat/widget/ListPopupWindow;->onPlayFromUri:Landroid/view/View;

    if-eqz v0, :cond_13

    .line 793
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    .line 794
    instance-of v1, v0, Landroid/view/ViewGroup;

    if-eqz v1, :cond_13

    .line 795
    check-cast v0, Landroid/view/ViewGroup;

    .line 796
    iget-object p0, p0, Landroidx/appcompat/widget/ListPopupWindow;->onPlayFromUri:Landroid/view/View;

    invoke-virtual {v0, p0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_13
    return-void
.end method

.method private MediaBrowserCompatItemReceiver()I
    .registers 13

    .line 1161
    iget-object v0, p0, Landroidx/appcompat/widget/ListPopupWindow;->IconCompatParcelizer:Lo/Keep;

    const/high16 v1, -0x80000000

    const/4 v2, -0x1

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-nez v0, :cond_a6

    .line 1162
    iget-object v0, p0, Landroidx/appcompat/widget/ListPopupWindow;->write:Landroid/content/Context;

    .line 1170
    new-instance v5, Landroidx/appcompat/widget/ListPopupWindow$3;

    invoke-direct {v5, p0}, Landroidx/appcompat/widget/ListPopupWindow$3;-><init>(Landroidx/appcompat/widget/ListPopupWindow;)V

    iput-object v5, p0, Landroidx/appcompat/widget/ListPopupWindow;->onPrepare:Ljava/lang/Runnable;

    .line 1181
    iget-boolean v5, p0, Landroidx/appcompat/widget/ListPopupWindow;->onPlayFromMediaId:Z

    xor-int/2addr v5, v4

    invoke-virtual {p0, v0, v5}, Landroidx/appcompat/widget/ListPopupWindow;->AudioAttributesCompatParcelizer(Landroid/content/Context;Z)Lo/Keep;

    move-result-object v5

    iput-object v5, p0, Landroidx/appcompat/widget/ListPopupWindow;->IconCompatParcelizer:Lo/Keep;

    .line 1182
    iget-object v6, p0, Landroidx/appcompat/widget/ListPopupWindow;->MediaMetadataCompat:Landroid/graphics/drawable/Drawable;

    if-eqz v6, :cond_22

    .line 1183
    invoke-virtual {v5, v6}, Landroid/widget/AbsListView;->setSelector(Landroid/graphics/drawable/Drawable;)V

    .line 1185
    :cond_22
    iget-object v5, p0, Landroidx/appcompat/widget/ListPopupWindow;->IconCompatParcelizer:Lo/Keep;

    iget-object v6, p0, Landroidx/appcompat/widget/ListPopupWindow;->RemoteActionCompatParcelizer:Landroid/widget/ListAdapter;

    invoke-virtual {v5, v6}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 1186
    iget-object v5, p0, Landroidx/appcompat/widget/ListPopupWindow;->IconCompatParcelizer:Lo/Keep;

    iget-object v6, p0, Landroidx/appcompat/widget/ListPopupWindow;->onFastForward:Landroid/widget/AdapterView$OnItemClickListener;

    invoke-virtual {v5, v6}, Landroid/widget/AdapterView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 1187
    iget-object v5, p0, Landroidx/appcompat/widget/ListPopupWindow;->IconCompatParcelizer:Lo/Keep;

    invoke-virtual {v5, v4}, Landroid/view/View;->setFocusable(Z)V

    .line 1188
    iget-object v5, p0, Landroidx/appcompat/widget/ListPopupWindow;->IconCompatParcelizer:Lo/Keep;

    invoke-virtual {v5, v4}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 1189
    iget-object v5, p0, Landroidx/appcompat/widget/ListPopupWindow;->IconCompatParcelizer:Lo/Keep;

    new-instance v6, Landroidx/appcompat/widget/ListPopupWindow$2;

    invoke-direct {v6, p0}, Landroidx/appcompat/widget/ListPopupWindow$2;-><init>(Landroidx/appcompat/widget/ListPopupWindow;)V

    invoke-virtual {v5, v6}, Landroid/widget/AdapterView;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    .line 1207
    iget-object v5, p0, Landroidx/appcompat/widget/ListPopupWindow;->IconCompatParcelizer:Lo/Keep;

    iget-object v6, p0, Landroidx/appcompat/widget/ListPopupWindow;->onPlayFromSearch:Landroidx/appcompat/widget/ListPopupWindow$IconCompatParcelizer;

    invoke-virtual {v5, v6}, Landroid/widget/AbsListView;->setOnScrollListener(Landroid/widget/AbsListView$OnScrollListener;)V

    .line 1209
    iget-object v5, p0, Landroidx/appcompat/widget/ListPopupWindow;->onPause:Landroid/widget/AdapterView$OnItemSelectedListener;

    if-eqz v5, :cond_54

    .line 1210
    iget-object v6, p0, Landroidx/appcompat/widget/ListPopupWindow;->IconCompatParcelizer:Lo/Keep;

    invoke-virtual {v6, v5}, Landroid/widget/AdapterView;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    .line 1213
    :cond_54
    iget-object v5, p0, Landroidx/appcompat/widget/ListPopupWindow;->IconCompatParcelizer:Lo/Keep;

    .line 1215
    iget-object v6, p0, Landroidx/appcompat/widget/ListPopupWindow;->onPlayFromUri:Landroid/view/View;

    if-eqz v6, :cond_9f

    .line 1219
    new-instance v7, Landroid/widget/LinearLayout;

    invoke-direct {v7, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 1220
    invoke-virtual {v7, v4}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 1222
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    const/high16 v8, 0x3f800000    # 1.0f

    invoke-direct {v0, v2, v3, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 1226
    iget v8, p0, Landroidx/appcompat/widget/ListPopupWindow;->onPrepareFromMediaId:I

    if-eqz v8, :cond_77

    if-eq v8, v4, :cond_70

    goto :goto_7d

    .line 1228
    :cond_70
    invoke-virtual {v7, v5, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 1229
    invoke-virtual {v7, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    goto :goto_7d

    .line 1233
    :cond_77
    invoke-virtual {v7, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1234
    invoke-virtual {v7, v5, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 1246
    :goto_7d
    iget v0, p0, Landroidx/appcompat/widget/ListPopupWindow;->handleMediaPlayPauseIfPendingOnHandler:I

    if-ltz v0, :cond_83

    move v5, v1

    goto :goto_85

    :cond_83
    move v0, v3

    move v5, v0

    .line 1253
    :goto_85
    invoke-static {v0, v5}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    .line 1255
    invoke-virtual {v6, v0, v3}, Landroid/view/View;->measure(II)V

    .line 1257
    invoke-virtual {v6}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout$LayoutParams;

    .line 1258
    invoke-virtual {v6}, Landroid/view/View;->getMeasuredHeight()I

    move-result v5

    iget v6, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    add-int/2addr v5, v6

    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    add-int/2addr v5, v0

    move v0, v5

    move-object v5, v7

    goto :goto_a0

    :cond_9f
    move v0, v3

    .line 1264
    :goto_a0
    iget-object v6, p0, Landroidx/appcompat/widget/ListPopupWindow;->MediaBrowserCompatCustomActionResultReceiver:Landroid/widget/PopupWindow;

    invoke-virtual {v6, v5}, Landroid/widget/PopupWindow;->setContentView(Landroid/view/View;)V

    goto :goto_c4

    .line 1266
    :cond_a6
    iget-object v0, p0, Landroidx/appcompat/widget/ListPopupWindow;->MediaBrowserCompatCustomActionResultReceiver:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->getContentView()Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    .line 1267
    iget-object v0, p0, Landroidx/appcompat/widget/ListPopupWindow;->onPlayFromUri:Landroid/view/View;

    if-eqz v0, :cond_c3

    .line 1270
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v5

    check-cast v5, Landroid/widget/LinearLayout$LayoutParams;

    .line 1271
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    iget v6, v5, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    add-int/2addr v0, v6

    iget v5, v5, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    add-int/2addr v0, v5

    goto :goto_c4

    :cond_c3
    move v0, v3

    .line 1279
    :goto_c4
    iget-object v5, p0, Landroidx/appcompat/widget/ListPopupWindow;->MediaBrowserCompatCustomActionResultReceiver:Landroid/widget/PopupWindow;

    invoke-virtual {v5}, Landroid/widget/PopupWindow;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v5

    if-eqz v5, :cond_e6

    .line 1281
    iget-object v6, p0, Landroidx/appcompat/widget/ListPopupWindow;->onRemoveQueueItem:Landroid/graphics/Rect;

    invoke-virtual {v5, v6}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    .line 1282
    iget-object v5, p0, Landroidx/appcompat/widget/ListPopupWindow;->onRemoveQueueItem:Landroid/graphics/Rect;

    iget v5, v5, Landroid/graphics/Rect;->top:I

    iget-object v6, p0, Landroidx/appcompat/widget/ListPopupWindow;->onRemoveQueueItem:Landroid/graphics/Rect;

    iget v6, v6, Landroid/graphics/Rect;->bottom:I

    add-int/2addr v5, v6

    .line 1286
    iget-boolean v6, p0, Landroidx/appcompat/widget/ListPopupWindow;->RatingCompat:Z

    if-nez v6, :cond_ec

    .line 1287
    iget-object v6, p0, Landroidx/appcompat/widget/ListPopupWindow;->onRemoveQueueItem:Landroid/graphics/Rect;

    iget v6, v6, Landroid/graphics/Rect;->top:I

    neg-int v6, v6

    iput v6, p0, Landroidx/appcompat/widget/ListPopupWindow;->MediaDescriptionCompat:I

    goto :goto_ec

    .line 1290
    :cond_e6
    iget-object v5, p0, Landroidx/appcompat/widget/ListPopupWindow;->onRemoveQueueItem:Landroid/graphics/Rect;

    invoke-virtual {v5}, Landroid/graphics/Rect;->setEmpty()V

    move v5, v3

    .line 1295
    :cond_ec
    :goto_ec
    iget-object v6, p0, Landroidx/appcompat/widget/ListPopupWindow;->MediaBrowserCompatCustomActionResultReceiver:Landroid/widget/PopupWindow;

    .line 1296
    invoke-virtual {v6}, Landroid/widget/PopupWindow;->getInputMethodMode()I

    move-result v6

    const/4 v7, 0x2

    if-eq v6, v7, :cond_f6

    goto :goto_f7

    :cond_f6
    move v3, v4

    .line 1297
    :goto_f7
    invoke-virtual {p0}, Landroidx/appcompat/widget/ListPopupWindow;->MediaBrowserCompatSearchResultReceiver()Landroid/view/View;

    move-result-object v4

    iget v6, p0, Landroidx/appcompat/widget/ListPopupWindow;->MediaDescriptionCompat:I

    invoke-direct {p0, v4, v6, v3}, Landroidx/appcompat/widget/ListPopupWindow;->write(Landroid/view/View;IZ)I

    move-result v3

    .line 1299
    iget-boolean v4, p0, Landroidx/appcompat/widget/ListPopupWindow;->MediaBrowserCompatItemReceiver:Z

    if-nez v4, :cond_16b

    iget v4, p0, Landroidx/appcompat/widget/ListPopupWindow;->MediaBrowserCompatMediaItem:I

    if-eq v4, v2, :cond_16b

    .line 1304
    iget v4, p0, Landroidx/appcompat/widget/ListPopupWindow;->handleMediaPlayPauseIfPendingOnHandler:I

    const/4 v6, -0x2

    if-eq v4, v6, :cond_132

    const/high16 v1, 0x40000000    # 2.0f

    if-eq v4, v2, :cond_117

    .line 1318
    invoke-static {v4, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v1

    goto :goto_14c

    .line 1312
    :cond_117
    iget-object v2, p0, Landroidx/appcompat/widget/ListPopupWindow;->write:Landroid/content/Context;

    .line 1313
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    iget v2, v2, Landroid/util/DisplayMetrics;->widthPixels:I

    iget-object v4, p0, Landroidx/appcompat/widget/ListPopupWindow;->onRemoveQueueItem:Landroid/graphics/Rect;

    iget v4, v4, Landroid/graphics/Rect;->left:I

    iget-object v6, p0, Landroidx/appcompat/widget/ListPopupWindow;->onRemoveQueueItem:Landroid/graphics/Rect;

    iget v6, v6, Landroid/graphics/Rect;->right:I

    add-int/2addr v4, v6

    sub-int/2addr v2, v4

    .line 1312
    invoke-static {v2, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v1

    goto :goto_14c

    .line 1306
    :cond_132
    iget-object v2, p0, Landroidx/appcompat/widget/ListPopupWindow;->write:Landroid/content/Context;

    .line 1307
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    iget v2, v2, Landroid/util/DisplayMetrics;->widthPixels:I

    iget-object v4, p0, Landroidx/appcompat/widget/ListPopupWindow;->onRemoveQueueItem:Landroid/graphics/Rect;

    iget v4, v4, Landroid/graphics/Rect;->left:I

    iget-object v6, p0, Landroidx/appcompat/widget/ListPopupWindow;->onRemoveQueueItem:Landroid/graphics/Rect;

    iget v6, v6, Landroid/graphics/Rect;->right:I

    add-int/2addr v4, v6

    sub-int/2addr v2, v4

    .line 1306
    invoke-static {v2, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v1

    :goto_14c
    move v7, v1

    .line 1324
    iget-object v6, p0, Landroidx/appcompat/widget/ListPopupWindow;->IconCompatParcelizer:Lo/Keep;

    const/4 v8, 0x0

    const/4 v9, -0x1

    sub-int v10, v3, v0

    const/4 v11, -0x1

    invoke-virtual/range {v6 .. v11}, Lo/Keep;->read(IIIII)I

    move-result v1

    if-lez v1, :cond_169

    .line 1327
    iget-object v2, p0, Landroidx/appcompat/widget/ListPopupWindow;->IconCompatParcelizer:Lo/Keep;

    invoke-virtual {v2}, Landroid/view/View;->getPaddingTop()I

    move-result v2

    iget-object p0, p0, Landroidx/appcompat/widget/ListPopupWindow;->IconCompatParcelizer:Lo/Keep;

    .line 1328
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result p0

    add-int/2addr v2, p0

    add-int/2addr v5, v2

    add-int/2addr v0, v5

    :cond_169
    add-int/2addr v1, v0

    return v1

    :cond_16b
    add-int/2addr v3, v5

    return v3
.end method

.method private write(Landroid/view/View;IZ)I
    .registers 4

    .line 1460
    iget-object p0, p0, Landroidx/appcompat/widget/ListPopupWindow;->MediaBrowserCompatCustomActionResultReceiver:Landroid/widget/PopupWindow;

    invoke-static {p0, p1, p2, p3}, Landroidx/appcompat/widget/ListPopupWindow$RemoteActionCompatParcelizer;->AudioAttributesCompatParcelizer(Landroid/widget/PopupWindow;Landroid/view/View;IZ)I

    move-result p0

    return p0
.end method

.method private write(Z)V
    .registers 2

    .line 1443
    iget-object p0, p0, Landroidx/appcompat/widget/ListPopupWindow;->MediaBrowserCompatCustomActionResultReceiver:Landroid/widget/PopupWindow;

    invoke-static {p0, p1}, Landroidx/appcompat/widget/ListPopupWindow$write;->IconCompatParcelizer(Landroid/widget/PopupWindow;Z)V

    return-void
.end method


# virtual methods
.method public AudioAttributesCompatParcelizer()I
    .registers 1

    .line 480
    iget p0, p0, Landroidx/appcompat/widget/ListPopupWindow;->MediaBrowserCompatSearchResultReceiver:I

    return p0
.end method

.method AudioAttributesCompatParcelizer(Landroid/content/Context;Z)Lo/Keep;
    .registers 3

    .line 953
    new-instance p0, Lo/Keep;

    invoke-direct {p0, p1, p2}, Lo/Keep;-><init>(Landroid/content/Context;Z)V

    return-object p0
.end method

.method public AudioAttributesCompatParcelizer(I)V
    .registers 2

    .line 444
    iget-object p0, p0, Landroidx/appcompat/widget/ListPopupWindow;->MediaBrowserCompatCustomActionResultReceiver:Landroid/widget/PopupWindow;

    invoke-virtual {p0, p1}, Landroid/widget/PopupWindow;->setAnimationStyle(I)V

    return-void
.end method

.method public AudioAttributesCompatParcelizer(Landroid/graphics/Rect;)V
    .registers 3

    if-eqz p1, :cond_8

    .line 520
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0, p1}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V

    goto :goto_9

    :cond_8
    const/4 v0, 0x0

    :goto_9
    iput-object v0, p0, Landroidx/appcompat/widget/ListPopupWindow;->onCommand:Landroid/graphics/Rect;

    return-void
.end method

.method public AudioAttributesCompatParcelizer(Z)V
    .registers 3

    const/4 v0, 0x1

    .line 1341
    iput-boolean v0, p0, Landroidx/appcompat/widget/ListPopupWindow;->onPrepareFromSearch:Z

    .line 1342
    iput-boolean p1, p0, Landroidx/appcompat/widget/ListPopupWindow;->onPlay:Z

    return-void
.end method

.method public AudioAttributesImplApi21Parcelizer(I)V
    .registers 2

    .line 541
    iput p1, p0, Landroidx/appcompat/widget/ListPopupWindow;->AudioAttributesImplBaseParcelizer:I

    return-void
.end method

.method public AudioAttributesImplApi26Parcelizer()V
    .registers 2

    .line 849
    iget-object p0, p0, Landroidx/appcompat/widget/ListPopupWindow;->IconCompatParcelizer:Lo/Keep;

    if-eqz p0, :cond_b

    const/4 v0, 0x1

    .line 852
    invoke-virtual {p0, v0}, Lo/Keep;->RemoteActionCompatParcelizer(Z)V

    .line 854
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    :cond_b
    return-void
.end method

.method public AudioAttributesImplApi26Parcelizer(I)V
    .registers 3

    .line 833
    iget-object v0, p0, Landroidx/appcompat/widget/ListPopupWindow;->IconCompatParcelizer:Lo/Keep;

    .line 834
    invoke-virtual {p0}, Landroidx/appcompat/widget/ListPopupWindow;->MediaBrowserCompatCustomActionResultReceiver()Z

    move-result p0

    if-eqz p0, :cond_1b

    if-eqz v0, :cond_1b

    const/4 p0, 0x0

    .line 835
    invoke-virtual {v0, p0}, Lo/Keep;->RemoteActionCompatParcelizer(Z)V

    .line 836
    invoke-virtual {v0, p1}, Landroid/widget/AdapterView;->setSelection(I)V

    .line 838
    invoke-virtual {v0}, Lo/Keep;->getChoiceMode()I

    move-result p0

    if-eqz p0, :cond_1b

    const/4 p0, 0x1

    .line 839
    invoke-virtual {v0, p1, p0}, Lo/Keep;->setItemChecked(IZ)V

    :cond_1b
    return-void
.end method

.method public AudioAttributesImplBaseParcelizer()V
    .registers 13

    .line 666
    invoke-direct {p0}, Landroidx/appcompat/widget/ListPopupWindow;->MediaBrowserCompatItemReceiver()I

    move-result v0

    .line 668
    invoke-virtual {p0}, Landroidx/appcompat/widget/ListPopupWindow;->onCommand()Z

    move-result v1

    .line 669
    iget-object v2, p0, Landroidx/appcompat/widget/ListPopupWindow;->MediaBrowserCompatCustomActionResultReceiver:Landroid/widget/PopupWindow;

    iget v3, p0, Landroidx/appcompat/widget/ListPopupWindow;->onAddQueueItem:I

    invoke-static {v2, v3}, Lo/AnnotatedClassCreators;->RemoteActionCompatParcelizer(Landroid/widget/PopupWindow;I)V

    .line 671
    iget-object v2, p0, Landroidx/appcompat/widget/ListPopupWindow;->MediaBrowserCompatCustomActionResultReceiver:Landroid/widget/PopupWindow;

    invoke-virtual {v2}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v2

    const/4 v3, -0x2

    const/4 v4, 0x0

    const/4 v5, -0x1

    const/4 v6, 0x1

    if-eqz v2, :cond_8c

    .line 672
    invoke-virtual {p0}, Landroidx/appcompat/widget/ListPopupWindow;->MediaBrowserCompatSearchResultReceiver()Landroid/view/View;

    move-result-object v2

    invoke-static {v2}, Lo/InvalidTypeIdException;->onPlayFromSearch(Landroid/view/View;)Z

    move-result v2

    if-eqz v2, :cond_107

    .line 677
    iget v2, p0, Landroidx/appcompat/widget/ListPopupWindow;->handleMediaPlayPauseIfPendingOnHandler:I

    if-ne v2, v5, :cond_2b

    move v2, v5

    goto :goto_35

    :cond_2b
    if-ne v2, v3, :cond_35

    .line 682
    invoke-virtual {p0}, Landroidx/appcompat/widget/ListPopupWindow;->MediaBrowserCompatSearchResultReceiver()Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    move-result v2

    .line 688
    :cond_35
    :goto_35
    iget v7, p0, Landroidx/appcompat/widget/ListPopupWindow;->MediaBrowserCompatMediaItem:I

    if-ne v7, v5, :cond_62

    if-nez v1, :cond_3c

    move v0, v5

    :cond_3c
    if-eqz v1, :cond_50

    .line 693
    iget-object v1, p0, Landroidx/appcompat/widget/ListPopupWindow;->MediaBrowserCompatCustomActionResultReceiver:Landroid/widget/PopupWindow;

    iget v3, p0, Landroidx/appcompat/widget/ListPopupWindow;->handleMediaPlayPauseIfPendingOnHandler:I

    if-ne v3, v5, :cond_46

    move v3, v5

    goto :goto_47

    :cond_46
    move v3, v4

    :goto_47
    invoke-virtual {v1, v3}, Landroid/widget/PopupWindow;->setWidth(I)V

    .line 695
    iget-object v1, p0, Landroidx/appcompat/widget/ListPopupWindow;->MediaBrowserCompatCustomActionResultReceiver:Landroid/widget/PopupWindow;

    invoke-virtual {v1, v4}, Landroid/widget/PopupWindow;->setHeight(I)V

    goto :goto_65

    .line 697
    :cond_50
    iget-object v1, p0, Landroidx/appcompat/widget/ListPopupWindow;->MediaBrowserCompatCustomActionResultReceiver:Landroid/widget/PopupWindow;

    iget v3, p0, Landroidx/appcompat/widget/ListPopupWindow;->handleMediaPlayPauseIfPendingOnHandler:I

    if-ne v3, v5, :cond_58

    move v3, v5

    goto :goto_59

    :cond_58
    move v3, v4

    :goto_59
    invoke-virtual {v1, v3}, Landroid/widget/PopupWindow;->setWidth(I)V

    .line 699
    iget-object v1, p0, Landroidx/appcompat/widget/ListPopupWindow;->MediaBrowserCompatCustomActionResultReceiver:Landroid/widget/PopupWindow;

    invoke-virtual {v1, v5}, Landroid/widget/PopupWindow;->setHeight(I)V

    goto :goto_65

    :cond_62
    if-eq v7, v3, :cond_65

    move v0, v7

    .line 707
    :cond_65
    :goto_65
    iget-object v1, p0, Landroidx/appcompat/widget/ListPopupWindow;->MediaBrowserCompatCustomActionResultReceiver:Landroid/widget/PopupWindow;

    iget-boolean v3, p0, Landroidx/appcompat/widget/ListPopupWindow;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Z

    if-nez v3, :cond_71

    iget-boolean v3, p0, Landroidx/appcompat/widget/ListPopupWindow;->MediaBrowserCompatItemReceiver:Z

    if-eqz v3, :cond_70

    goto :goto_71

    :cond_70
    move v4, v6

    :cond_71
    :goto_71
    invoke-virtual {v1, v4}, Landroid/widget/PopupWindow;->setOutsideTouchable(Z)V

    .line 709
    iget-object v6, p0, Landroidx/appcompat/widget/ListPopupWindow;->MediaBrowserCompatCustomActionResultReceiver:Landroid/widget/PopupWindow;

    invoke-virtual {p0}, Landroidx/appcompat/widget/ListPopupWindow;->MediaBrowserCompatSearchResultReceiver()Landroid/view/View;

    move-result-object v7

    iget v8, p0, Landroidx/appcompat/widget/ListPopupWindow;->MediaBrowserCompatSearchResultReceiver:I

    iget v9, p0, Landroidx/appcompat/widget/ListPopupWindow;->MediaDescriptionCompat:I

    if-gez v2, :cond_82

    move v10, v5

    goto :goto_83

    :cond_82
    move v10, v2

    :goto_83
    if-gez v0, :cond_87

    move v11, v5

    goto :goto_88

    :cond_87
    move v11, v0

    :goto_88
    invoke-virtual/range {v6 .. v11}, Landroid/widget/PopupWindow;->update(Landroid/view/View;IIII)V

    return-void

    .line 714
    :cond_8c
    iget v1, p0, Landroidx/appcompat/widget/ListPopupWindow;->handleMediaPlayPauseIfPendingOnHandler:I

    if-ne v1, v5, :cond_92

    move v1, v5

    goto :goto_9c

    :cond_92
    if-ne v1, v3, :cond_9c

    .line 718
    invoke-virtual {p0}, Landroidx/appcompat/widget/ListPopupWindow;->MediaBrowserCompatSearchResultReceiver()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    move-result v1

    .line 725
    :cond_9c
    :goto_9c
    iget v2, p0, Landroidx/appcompat/widget/ListPopupWindow;->MediaBrowserCompatMediaItem:I

    if-ne v2, v5, :cond_a2

    move v0, v5

    goto :goto_a5

    :cond_a2
    if-eq v2, v3, :cond_a5

    move v0, v2

    .line 735
    :cond_a5
    :goto_a5
    iget-object v2, p0, Landroidx/appcompat/widget/ListPopupWindow;->MediaBrowserCompatCustomActionResultReceiver:Landroid/widget/PopupWindow;

    invoke-virtual {v2, v1}, Landroid/widget/PopupWindow;->setWidth(I)V

    .line 736
    iget-object v1, p0, Landroidx/appcompat/widget/ListPopupWindow;->MediaBrowserCompatCustomActionResultReceiver:Landroid/widget/PopupWindow;

    invoke-virtual {v1, v0}, Landroid/widget/PopupWindow;->setHeight(I)V

    .line 737
    invoke-direct {p0, v6}, Landroidx/appcompat/widget/ListPopupWindow;->write(Z)V

    .line 741
    iget-object v0, p0, Landroidx/appcompat/widget/ListPopupWindow;->MediaBrowserCompatCustomActionResultReceiver:Landroid/widget/PopupWindow;

    iget-boolean v1, p0, Landroidx/appcompat/widget/ListPopupWindow;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Z

    if-nez v1, :cond_bd

    iget-boolean v1, p0, Landroidx/appcompat/widget/ListPopupWindow;->MediaBrowserCompatItemReceiver:Z

    if-nez v1, :cond_bd

    move v4, v6

    :cond_bd
    invoke-virtual {v0, v4}, Landroid/widget/PopupWindow;->setOutsideTouchable(Z)V

    .line 742
    iget-object v0, p0, Landroidx/appcompat/widget/ListPopupWindow;->MediaBrowserCompatCustomActionResultReceiver:Landroid/widget/PopupWindow;

    iget-object v1, p0, Landroidx/appcompat/widget/ListPopupWindow;->onRewind:Landroidx/appcompat/widget/ListPopupWindow$MediaBrowserCompatCustomActionResultReceiver;

    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setTouchInterceptor(Landroid/view/View$OnTouchListener;)V

    .line 743
    iget-boolean v0, p0, Landroidx/appcompat/widget/ListPopupWindow;->onPrepareFromSearch:Z

    if-eqz v0, :cond_d2

    .line 744
    iget-object v0, p0, Landroidx/appcompat/widget/ListPopupWindow;->MediaBrowserCompatCustomActionResultReceiver:Landroid/widget/PopupWindow;

    iget-boolean v1, p0, Landroidx/appcompat/widget/ListPopupWindow;->onPlay:Z

    invoke-static {v0, v1}, Lo/AnnotatedClassCreators;->read(Landroid/widget/PopupWindow;Z)V

    .line 755
    :cond_d2
    iget-object v0, p0, Landroidx/appcompat/widget/ListPopupWindow;->MediaBrowserCompatCustomActionResultReceiver:Landroid/widget/PopupWindow;

    iget-object v1, p0, Landroidx/appcompat/widget/ListPopupWindow;->onCommand:Landroid/graphics/Rect;

    invoke-static {v0, v1}, Landroidx/appcompat/widget/ListPopupWindow$write;->read(Landroid/widget/PopupWindow;Landroid/graphics/Rect;)V

    .line 757
    iget-object v0, p0, Landroidx/appcompat/widget/ListPopupWindow;->MediaBrowserCompatCustomActionResultReceiver:Landroid/widget/PopupWindow;

    invoke-virtual {p0}, Landroidx/appcompat/widget/ListPopupWindow;->MediaBrowserCompatSearchResultReceiver()Landroid/view/View;

    move-result-object v1

    iget v2, p0, Landroidx/appcompat/widget/ListPopupWindow;->MediaBrowserCompatSearchResultReceiver:I

    iget v3, p0, Landroidx/appcompat/widget/ListPopupWindow;->MediaDescriptionCompat:I

    iget v4, p0, Landroidx/appcompat/widget/ListPopupWindow;->AudioAttributesImplBaseParcelizer:I

    invoke-static {v0, v1, v2, v3, v4}, Lo/AnnotatedClassCreators;->read(Landroid/widget/PopupWindow;Landroid/view/View;III)V

    .line 759
    iget-object v0, p0, Landroidx/appcompat/widget/ListPopupWindow;->IconCompatParcelizer:Lo/Keep;

    invoke-virtual {v0, v5}, Landroid/widget/AdapterView;->setSelection(I)V

    .line 761
    iget-boolean v0, p0, Landroidx/appcompat/widget/ListPopupWindow;->onPlayFromMediaId:Z

    if-eqz v0, :cond_f9

    iget-object v0, p0, Landroidx/appcompat/widget/ListPopupWindow;->IconCompatParcelizer:Lo/Keep;

    invoke-virtual {v0}, Landroid/view/View;->isInTouchMode()Z

    move-result v0

    if-eqz v0, :cond_fc

    .line 762
    :cond_f9
    invoke-virtual {p0}, Landroidx/appcompat/widget/ListPopupWindow;->AudioAttributesImplApi26Parcelizer()V

    .line 764
    :cond_fc
    iget-boolean v0, p0, Landroidx/appcompat/widget/ListPopupWindow;->onPlayFromMediaId:Z

    if-nez v0, :cond_107

    .line 765
    iget-object v0, p0, Landroidx/appcompat/widget/ListPopupWindow;->AudioAttributesCompatParcelizer:Landroid/os/Handler;

    iget-object p0, p0, Landroidx/appcompat/widget/ListPopupWindow;->onCustomAction:Landroidx/appcompat/widget/ListPopupWindow$AudioAttributesCompatParcelizer;

    invoke-virtual {v0, p0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_107
    return-void
.end method

.method public AudioAttributesImplBaseParcelizer(I)V
    .registers 2

    .line 315
    iput p1, p0, Landroidx/appcompat/widget/ListPopupWindow;->onPrepareFromMediaId:I

    return-void
.end method

.method public IconCompatParcelizer()I
    .registers 2

    .line 496
    iget-boolean v0, p0, Landroidx/appcompat/widget/ListPopupWindow;->RatingCompat:Z

    if-nez v0, :cond_6

    const/4 p0, 0x0

    return p0

    .line 499
    :cond_6
    iget p0, p0, Landroidx/appcompat/widget/ListPopupWindow;->MediaDescriptionCompat:I

    return p0
.end method

.method public IconCompatParcelizer(I)V
    .registers 2

    .line 508
    iput p1, p0, Landroidx/appcompat/widget/ListPopupWindow;->MediaDescriptionCompat:I

    const/4 p1, 0x1

    .line 509
    iput-boolean p1, p0, Landroidx/appcompat/widget/ListPopupWindow;->RatingCompat:Z

    return-void
.end method

.method public IconCompatParcelizer(Landroid/widget/AdapterView$OnItemSelectedListener;)V
    .registers 2

    .line 633
    iput-object p1, p0, Landroidx/appcompat/widget/ListPopupWindow;->onPause:Landroid/widget/AdapterView$OnItemSelectedListener;

    return-void
.end method

.method public IconCompatParcelizer(Landroid/widget/PopupWindow$OnDismissListener;)V
    .registers 2

    .line 788
    iget-object p0, p0, Landroidx/appcompat/widget/ListPopupWindow;->MediaBrowserCompatCustomActionResultReceiver:Landroid/widget/PopupWindow;

    invoke-virtual {p0, p1}, Landroid/widget/PopupWindow;->setOnDismissListener(Landroid/widget/PopupWindow$OnDismissListener;)V

    return-void
.end method

.method public IconCompatParcelizer(Z)V
    .registers 2

    .line 338
    iput-boolean p1, p0, Landroidx/appcompat/widget/ListPopupWindow;->onPlayFromMediaId:Z

    .line 339
    iget-object p0, p0, Landroidx/appcompat/widget/ListPopupWindow;->MediaBrowserCompatCustomActionResultReceiver:Landroid/widget/PopupWindow;

    invoke-virtual {p0, p1}, Landroid/widget/PopupWindow;->setFocusable(Z)V

    return-void
.end method

.method public MediaBrowserCompatCustomActionResultReceiver(I)V
    .registers 2

    .line 558
    iput p1, p0, Landroidx/appcompat/widget/ListPopupWindow;->handleMediaPlayPauseIfPendingOnHandler:I

    return-void
.end method

.method public MediaBrowserCompatCustomActionResultReceiver()Z
    .registers 1

    .line 863
    iget-object p0, p0, Landroidx/appcompat/widget/ListPopupWindow;->MediaBrowserCompatCustomActionResultReceiver:Landroid/widget/PopupWindow;

    invoke-virtual {p0}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result p0

    return p0
.end method

.method public MediaBrowserCompatItemReceiver(I)V
    .registers 2

    .line 814
    iget-object p0, p0, Landroidx/appcompat/widget/ListPopupWindow;->MediaBrowserCompatCustomActionResultReceiver:Landroid/widget/PopupWindow;

    invoke-virtual {p0, p1}, Landroid/widget/PopupWindow;->setInputMethodMode(I)V

    return-void
.end method

.method public MediaBrowserCompatMediaItem()Landroid/view/View;
    .registers 2

    .line 937
    invoke-virtual {p0}, Landroidx/appcompat/widget/ListPopupWindow;->MediaBrowserCompatCustomActionResultReceiver()Z

    move-result v0

    if-nez v0, :cond_8

    const/4 p0, 0x0

    return-object p0

    .line 940
    :cond_8
    iget-object p0, p0, Landroidx/appcompat/widget/ListPopupWindow;->IconCompatParcelizer:Lo/Keep;

    invoke-virtual {p0}, Landroid/widget/AdapterView;->getSelectedView()Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public MediaBrowserCompatSearchResultReceiver()Landroid/view/View;
    .registers 1

    .line 463
    iget-object p0, p0, Landroidx/appcompat/widget/ListPopupWindow;->AudioAttributesImplApi26Parcelizer:Landroid/view/View;

    return-object p0
.end method

.method public MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()I
    .registers 1

    .line 548
    iget p0, p0, Landroidx/appcompat/widget/ListPopupWindow;->handleMediaPlayPauseIfPendingOnHandler:I

    return p0
.end method

.method public MediaDescriptionCompat()Ljava/lang/Object;
    .registers 2

    .line 898
    invoke-virtual {p0}, Landroidx/appcompat/widget/ListPopupWindow;->MediaBrowserCompatCustomActionResultReceiver()Z

    move-result v0

    if-nez v0, :cond_8

    const/4 p0, 0x0

    return-object p0

    .line 901
    :cond_8
    iget-object p0, p0, Landroidx/appcompat/widget/ListPopupWindow;->IconCompatParcelizer:Lo/Keep;

    invoke-virtual {p0}, Landroid/widget/AdapterView;->getSelectedItem()Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public MediaMetadataCompat()J
    .registers 3

    .line 924
    invoke-virtual {p0}, Landroidx/appcompat/widget/ListPopupWindow;->MediaBrowserCompatCustomActionResultReceiver()Z

    move-result v0

    if-nez v0, :cond_9

    const-wide/high16 v0, -0x8000000000000000L

    return-wide v0

    .line 927
    :cond_9
    iget-object p0, p0, Landroidx/appcompat/widget/ListPopupWindow;->IconCompatParcelizer:Lo/Keep;

    invoke-virtual {p0}, Landroid/widget/AdapterView;->getSelectedItemId()J

    move-result-wide v0

    return-wide v0
.end method

.method public RatingCompat()I
    .registers 2

    .line 911
    invoke-virtual {p0}, Landroidx/appcompat/widget/ListPopupWindow;->MediaBrowserCompatCustomActionResultReceiver()Z

    move-result v0

    if-nez v0, :cond_8

    const/4 p0, -0x1

    return p0

    .line 914
    :cond_8
    iget-object p0, p0, Landroidx/appcompat/widget/ListPopupWindow;->IconCompatParcelizer:Lo/Keep;

    invoke-virtual {p0}, Landroid/widget/AdapterView;->getSelectedItemPosition()I

    move-result p0

    return p0
.end method

.method public RemoteActionCompatParcelizer()Landroid/graphics/drawable/Drawable;
    .registers 1

    .line 426
    iget-object p0, p0, Landroidx/appcompat/widget/ListPopupWindow;->MediaBrowserCompatCustomActionResultReceiver:Landroid/widget/PopupWindow;

    invoke-virtual {p0}, Landroid/widget/PopupWindow;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object p0

    return-object p0
.end method

.method public RemoteActionCompatParcelizer(Landroid/view/View;)V
    .registers 2

    .line 473
    iput-object p1, p0, Landroidx/appcompat/widget/ListPopupWindow;->AudioAttributesImplApi26Parcelizer:Landroid/view/View;

    return-void
.end method

.method public RemoteActionCompatParcelizer(Landroid/widget/ListAdapter;)V
    .registers 4

    .line 290
    iget-object v0, p0, Landroidx/appcompat/widget/ListPopupWindow;->onMediaButtonEvent:Landroid/database/DataSetObserver;

    if-nez v0, :cond_c

    .line 291
    new-instance v0, Landroidx/appcompat/widget/ListPopupWindow$read;

    invoke-direct {v0, p0}, Landroidx/appcompat/widget/ListPopupWindow$read;-><init>(Landroidx/appcompat/widget/ListPopupWindow;)V

    iput-object v0, p0, Landroidx/appcompat/widget/ListPopupWindow;->onMediaButtonEvent:Landroid/database/DataSetObserver;

    goto :goto_13

    .line 292
    :cond_c
    iget-object v1, p0, Landroidx/appcompat/widget/ListPopupWindow;->RemoteActionCompatParcelizer:Landroid/widget/ListAdapter;

    if-eqz v1, :cond_13

    .line 293
    invoke-interface {v1, v0}, Landroid/widget/ListAdapter;->unregisterDataSetObserver(Landroid/database/DataSetObserver;)V

    .line 295
    :cond_13
    :goto_13
    iput-object p1, p0, Landroidx/appcompat/widget/ListPopupWindow;->RemoteActionCompatParcelizer:Landroid/widget/ListAdapter;

    if-eqz p1, :cond_1c

    .line 297
    iget-object v0, p0, Landroidx/appcompat/widget/ListPopupWindow;->onMediaButtonEvent:Landroid/database/DataSetObserver;

    invoke-interface {p1, v0}, Landroid/widget/ListAdapter;->registerDataSetObserver(Landroid/database/DataSetObserver;)V

    .line 300
    :cond_1c
    iget-object p1, p0, Landroidx/appcompat/widget/ListPopupWindow;->IconCompatParcelizer:Lo/Keep;

    if-eqz p1, :cond_25

    .line 301
    iget-object p0, p0, Landroidx/appcompat/widget/ListPopupWindow;->RemoteActionCompatParcelizer:Landroid/widget/ListAdapter;

    invoke-virtual {p1, p0}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    :cond_25
    return-void
.end method

.method public a_()Landroid/widget/ListView;
    .registers 1

    .line 949
    iget-object p0, p0, Landroidx/appcompat/widget/ListPopupWindow;->IconCompatParcelizer:Lo/Keep;

    return-object p0
.end method

.method public handleMediaPlayPauseIfPendingOnHandler()Z
    .registers 1

    .line 348
    iget-boolean p0, p0, Landroidx/appcompat/widget/ListPopupWindow;->onPlayFromMediaId:Z

    return p0
.end method

.method public onCommand()Z
    .registers 2

    .line 871
    iget-object p0, p0, Landroidx/appcompat/widget/ListPopupWindow;->MediaBrowserCompatCustomActionResultReceiver:Landroid/widget/PopupWindow;

    invoke-virtual {p0}, Landroid/widget/PopupWindow;->getInputMethodMode()I

    move-result p0

    const/4 v0, 0x2

    if-ne p0, v0, :cond_b

    const/4 p0, 0x1

    return p0

    :cond_b
    const/4 p0, 0x0

    return p0
.end method

.method public read(I)V
    .registers 4

    .line 568
    iget-object v0, p0, Landroidx/appcompat/widget/ListPopupWindow;->MediaBrowserCompatCustomActionResultReceiver:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_1a

    .line 570
    iget-object v1, p0, Landroidx/appcompat/widget/ListPopupWindow;->onRemoveQueueItem:Landroid/graphics/Rect;

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    .line 571
    iget-object v0, p0, Landroidx/appcompat/widget/ListPopupWindow;->onRemoveQueueItem:Landroid/graphics/Rect;

    iget v0, v0, Landroid/graphics/Rect;->left:I

    iget-object v1, p0, Landroidx/appcompat/widget/ListPopupWindow;->onRemoveQueueItem:Landroid/graphics/Rect;

    iget v1, v1, Landroid/graphics/Rect;->right:I

    add-int/2addr v0, v1

    add-int/2addr v0, p1

    iput v0, p0, Landroidx/appcompat/widget/ListPopupWindow;->handleMediaPlayPauseIfPendingOnHandler:I

    return-void

    .line 573
    :cond_1a
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/ListPopupWindow;->MediaBrowserCompatCustomActionResultReceiver(I)V

    return-void
.end method

.method public write()V
    .registers 3

    .line 775
    iget-object v0, p0, Landroidx/appcompat/widget/ListPopupWindow;->MediaBrowserCompatCustomActionResultReceiver:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    .line 776
    invoke-direct {p0}, Landroidx/appcompat/widget/ListPopupWindow;->AudioAttributesImplApi21Parcelizer()V

    .line 777
    iget-object v0, p0, Landroidx/appcompat/widget/ListPopupWindow;->MediaBrowserCompatCustomActionResultReceiver:Landroid/widget/PopupWindow;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setContentView(Landroid/view/View;)V

    .line 778
    iput-object v1, p0, Landroidx/appcompat/widget/ListPopupWindow;->IconCompatParcelizer:Lo/Keep;

    .line 779
    iget-object v0, p0, Landroidx/appcompat/widget/ListPopupWindow;->AudioAttributesCompatParcelizer:Landroid/os/Handler;

    iget-object p0, p0, Landroidx/appcompat/widget/ListPopupWindow;->AudioAttributesImplApi21Parcelizer:Landroidx/appcompat/widget/ListPopupWindow$MediaBrowserCompatItemReceiver;

    invoke-virtual {v0, p0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    return-void
.end method

.method public write(I)V
    .registers 2

    .line 489
    iput p1, p0, Landroidx/appcompat/widget/ListPopupWindow;->MediaBrowserCompatSearchResultReceiver:I

    return-void
.end method

.method public write(Landroid/graphics/drawable/Drawable;)V
    .registers 2

    .line 435
    iget-object p0, p0, Landroidx/appcompat/widget/ListPopupWindow;->MediaBrowserCompatCustomActionResultReceiver:Landroid/widget/PopupWindow;

    invoke-virtual {p0, p1}, Landroid/widget/PopupWindow;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public write(Landroid/widget/AdapterView$OnItemClickListener;)V
    .registers 2

    .line 622
    iput-object p1, p0, Landroidx/appcompat/widget/ListPopupWindow;->onFastForward:Landroid/widget/AdapterView$OnItemClickListener;

    return-void
.end method

###### Class androidx.appcompat.widget.ListPopupWindow.AnonymousClass2 (androidx.appcompat.widget.ListPopupWindow$2)
.class final Landroidx/appcompat/widget/ListPopupWindow$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemSelectedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/appcompat/widget/ListPopupWindow;->MediaBrowserCompatItemReceiver()I
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic read:Landroidx/appcompat/widget/ListPopupWindow;


# direct methods
.method constructor <init>(Landroidx/appcompat/widget/ListPopupWindow;)V
    .registers 2

    .line 1189
    iput-object p1, p0, Landroidx/appcompat/widget/ListPopupWindow$2;->read:Landroidx/appcompat/widget/ListPopupWindow;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onItemSelected(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
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

    const/4 p1, -0x1

    if-eq p3, p1, :cond_d

    .line 1195
    iget-object p0, p0, Landroidx/appcompat/widget/ListPopupWindow$2;->read:Landroidx/appcompat/widget/ListPopupWindow;

    iget-object p0, p0, Landroidx/appcompat/widget/ListPopupWindow;->IconCompatParcelizer:Lo/Keep;

    if-eqz p0, :cond_d

    const/4 p1, 0x0

    .line 1198
    invoke-virtual {p0, p1}, Lo/Keep;->RemoteActionCompatParcelizer(Z)V

    :cond_d
    return-void
.end method

.method public final onNothingSelected(Landroid/widget/AdapterView;)V
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView<",
            "*>;)V"
        }
    .end annotation

    return-void
.end method

###### Class androidx.appcompat.widget.ListPopupWindow.AnonymousClass3 (androidx.appcompat.widget.ListPopupWindow$3)
.class final Landroidx/appcompat/widget/ListPopupWindow$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/appcompat/widget/ListPopupWindow;->MediaBrowserCompatItemReceiver()I
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic IconCompatParcelizer:Landroidx/appcompat/widget/ListPopupWindow;


# direct methods
.method constructor <init>(Landroidx/appcompat/widget/ListPopupWindow;)V
    .registers 2

    .line 1170
    iput-object p1, p0, Landroidx/appcompat/widget/ListPopupWindow$3;->IconCompatParcelizer:Landroidx/appcompat/widget/ListPopupWindow;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 2

    .line 1174
    iget-object v0, p0, Landroidx/appcompat/widget/ListPopupWindow$3;->IconCompatParcelizer:Landroidx/appcompat/widget/ListPopupWindow;

    invoke-virtual {v0}, Landroidx/appcompat/widget/ListPopupWindow;->MediaBrowserCompatSearchResultReceiver()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_13

    .line 1175
    invoke-virtual {v0}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object v0

    if-eqz v0, :cond_13

    .line 1176
    iget-object p0, p0, Landroidx/appcompat/widget/ListPopupWindow$3;->IconCompatParcelizer:Landroidx/appcompat/widget/ListPopupWindow;

    invoke-virtual {p0}, Landroidx/appcompat/widget/ListPopupWindow;->AudioAttributesImplBaseParcelizer()V

    :cond_13
    return-void
.end method

###### Class androidx.appcompat.widget.ListPopupWindow.AudioAttributesCompatParcelizer (androidx.appcompat.widget.ListPopupWindow$AudioAttributesCompatParcelizer)
.class final Landroidx/appcompat/widget/ListPopupWindow$AudioAttributesCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/widget/ListPopupWindow;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "AudioAttributesCompatParcelizer"
.end annotation


# instance fields
.field final synthetic AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/ListPopupWindow;


# direct methods
.method constructor <init>(Landroidx/appcompat/widget/ListPopupWindow;)V
    .registers 2

    .line 1364
    iput-object p1, p0, Landroidx/appcompat/widget/ListPopupWindow$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/ListPopupWindow;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 1

    .line 1369
    iget-object p0, p0, Landroidx/appcompat/widget/ListPopupWindow$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/ListPopupWindow;

    invoke-virtual {p0}, Landroidx/appcompat/widget/ListPopupWindow;->AudioAttributesImplApi26Parcelizer()V

    return-void
.end method

###### Class androidx.appcompat.widget.ListPopupWindow.IconCompatParcelizer (androidx.appcompat.widget.ListPopupWindow$IconCompatParcelizer)
.class final Landroidx/appcompat/widget/ListPopupWindow$IconCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AbsListView$OnScrollListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/widget/ListPopupWindow;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "IconCompatParcelizer"
.end annotation


# instance fields
.field final synthetic RemoteActionCompatParcelizer:Landroidx/appcompat/widget/ListPopupWindow;


# direct methods
.method constructor <init>(Landroidx/appcompat/widget/ListPopupWindow;)V
    .registers 2

    .line 1410
    iput-object p1, p0, Landroidx/appcompat/widget/ListPopupWindow$IconCompatParcelizer;->RemoteActionCompatParcelizer:Landroidx/appcompat/widget/ListPopupWindow;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onScroll(Landroid/widget/AbsListView;III)V
    .registers 5

    return-void
.end method

.method public final onScrollStateChanged(Landroid/widget/AbsListView;I)V
    .registers 3

    const/4 p1, 0x1

    if-ne p2, p1, :cond_27

    .line 1421
    iget-object p1, p0, Landroidx/appcompat/widget/ListPopupWindow$IconCompatParcelizer;->RemoteActionCompatParcelizer:Landroidx/appcompat/widget/ListPopupWindow;

    .line 1422
    invoke-virtual {p1}, Landroidx/appcompat/widget/ListPopupWindow;->onCommand()Z

    move-result p1

    if-nez p1, :cond_27

    iget-object p1, p0, Landroidx/appcompat/widget/ListPopupWindow$IconCompatParcelizer;->RemoteActionCompatParcelizer:Landroidx/appcompat/widget/ListPopupWindow;

    iget-object p1, p1, Landroidx/appcompat/widget/ListPopupWindow;->MediaBrowserCompatCustomActionResultReceiver:Landroid/widget/PopupWindow;

    invoke-virtual {p1}, Landroid/widget/PopupWindow;->getContentView()Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_27

    .line 1423
    iget-object p1, p0, Landroidx/appcompat/widget/ListPopupWindow$IconCompatParcelizer;->RemoteActionCompatParcelizer:Landroidx/appcompat/widget/ListPopupWindow;

    iget-object p1, p1, Landroidx/appcompat/widget/ListPopupWindow;->AudioAttributesCompatParcelizer:Landroid/os/Handler;

    iget-object p2, p0, Landroidx/appcompat/widget/ListPopupWindow$IconCompatParcelizer;->RemoteActionCompatParcelizer:Landroidx/appcompat/widget/ListPopupWindow;

    iget-object p2, p2, Landroidx/appcompat/widget/ListPopupWindow;->AudioAttributesImplApi21Parcelizer:Landroidx/appcompat/widget/ListPopupWindow$MediaBrowserCompatItemReceiver;

    invoke-virtual {p1, p2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 1424
    iget-object p0, p0, Landroidx/appcompat/widget/ListPopupWindow$IconCompatParcelizer;->RemoteActionCompatParcelizer:Landroidx/appcompat/widget/ListPopupWindow;

    iget-object p0, p0, Landroidx/appcompat/widget/ListPopupWindow;->AudioAttributesImplApi21Parcelizer:Landroidx/appcompat/widget/ListPopupWindow$MediaBrowserCompatItemReceiver;

    invoke-virtual {p0}, Landroidx/appcompat/widget/ListPopupWindow$MediaBrowserCompatItemReceiver;->run()V

    :cond_27
    return-void
.end method

###### Class androidx.appcompat.widget.ListPopupWindow.MediaBrowserCompatCustomActionResultReceiver (androidx.appcompat.widget.ListPopupWindow$MediaBrowserCompatCustomActionResultReceiver)
.class final Landroidx/appcompat/widget/ListPopupWindow$MediaBrowserCompatCustomActionResultReceiver;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/widget/ListPopupWindow;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "MediaBrowserCompatCustomActionResultReceiver"
.end annotation


# instance fields
.field final synthetic write:Landroidx/appcompat/widget/ListPopupWindow;


# direct methods
.method constructor <init>(Landroidx/appcompat/widget/ListPopupWindow;)V
    .registers 2

    .line 1389
    iput-object p1, p0, Landroidx/appcompat/widget/ListPopupWindow$MediaBrowserCompatCustomActionResultReceiver;->write:Landroidx/appcompat/widget/ListPopupWindow;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .registers 5

    .line 1394
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result p1

    .line 1395
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    float-to-int v0, v0

    .line 1396
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result p2

    float-to-int p2, p2

    if-nez p1, :cond_46

    .line 1398
    iget-object v1, p0, Landroidx/appcompat/widget/ListPopupWindow$MediaBrowserCompatCustomActionResultReceiver;->write:Landroidx/appcompat/widget/ListPopupWindow;

    iget-object v1, v1, Landroidx/appcompat/widget/ListPopupWindow;->MediaBrowserCompatCustomActionResultReceiver:Landroid/widget/PopupWindow;

    if-eqz v1, :cond_46

    iget-object v1, p0, Landroidx/appcompat/widget/ListPopupWindow$MediaBrowserCompatCustomActionResultReceiver;->write:Landroidx/appcompat/widget/ListPopupWindow;

    iget-object v1, v1, Landroidx/appcompat/widget/ListPopupWindow;->MediaBrowserCompatCustomActionResultReceiver:Landroid/widget/PopupWindow;

    .line 1399
    invoke-virtual {v1}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v1

    if-eqz v1, :cond_46

    if-ltz v0, :cond_46

    iget-object v1, p0, Landroidx/appcompat/widget/ListPopupWindow$MediaBrowserCompatCustomActionResultReceiver;->write:Landroidx/appcompat/widget/ListPopupWindow;

    iget-object v1, v1, Landroidx/appcompat/widget/ListPopupWindow;->MediaBrowserCompatCustomActionResultReceiver:Landroid/widget/PopupWindow;

    .line 1400
    invoke-virtual {v1}, Landroid/widget/PopupWindow;->getWidth()I

    move-result v1

    if-ge v0, v1, :cond_46

    if-ltz p2, :cond_46

    iget-object v0, p0, Landroidx/appcompat/widget/ListPopupWindow$MediaBrowserCompatCustomActionResultReceiver;->write:Landroidx/appcompat/widget/ListPopupWindow;

    iget-object v0, v0, Landroidx/appcompat/widget/ListPopupWindow;->MediaBrowserCompatCustomActionResultReceiver:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->getHeight()I

    move-result v0

    if-ge p2, v0, :cond_46

    .line 1401
    iget-object p1, p0, Landroidx/appcompat/widget/ListPopupWindow$MediaBrowserCompatCustomActionResultReceiver;->write:Landroidx/appcompat/widget/ListPopupWindow;

    iget-object p1, p1, Landroidx/appcompat/widget/ListPopupWindow;->AudioAttributesCompatParcelizer:Landroid/os/Handler;

    iget-object p0, p0, Landroidx/appcompat/widget/ListPopupWindow$MediaBrowserCompatCustomActionResultReceiver;->write:Landroidx/appcompat/widget/ListPopupWindow;

    iget-object p0, p0, Landroidx/appcompat/widget/ListPopupWindow;->AudioAttributesImplApi21Parcelizer:Landroidx/appcompat/widget/ListPopupWindow$MediaBrowserCompatItemReceiver;

    const-wide/16 v0, 0xfa

    invoke-virtual {p1, p0, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_54

    :cond_46
    const/4 p2, 0x1

    if-ne p1, p2, :cond_54

    .line 1403
    iget-object p1, p0, Landroidx/appcompat/widget/ListPopupWindow$MediaBrowserCompatCustomActionResultReceiver;->write:Landroidx/appcompat/widget/ListPopupWindow;

    iget-object p1, p1, Landroidx/appcompat/widget/ListPopupWindow;->AudioAttributesCompatParcelizer:Landroid/os/Handler;

    iget-object p0, p0, Landroidx/appcompat/widget/ListPopupWindow$MediaBrowserCompatCustomActionResultReceiver;->write:Landroidx/appcompat/widget/ListPopupWindow;

    iget-object p0, p0, Landroidx/appcompat/widget/ListPopupWindow;->AudioAttributesImplApi21Parcelizer:Landroidx/appcompat/widget/ListPopupWindow$MediaBrowserCompatItemReceiver;

    invoke-virtual {p1, p0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    :cond_54
    :goto_54
    const/4 p0, 0x0

    return p0
.end method

###### Class androidx.appcompat.widget.ListPopupWindow.MediaBrowserCompatItemReceiver (androidx.appcompat.widget.ListPopupWindow$MediaBrowserCompatItemReceiver)
.class final Landroidx/appcompat/widget/ListPopupWindow$MediaBrowserCompatItemReceiver;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/widget/ListPopupWindow;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "MediaBrowserCompatItemReceiver"
.end annotation


# instance fields
.field final synthetic read:Landroidx/appcompat/widget/ListPopupWindow;


# direct methods
.method constructor <init>(Landroidx/appcompat/widget/ListPopupWindow;)V
    .registers 2

    .line 1374
    iput-object p1, p0, Landroidx/appcompat/widget/ListPopupWindow$MediaBrowserCompatItemReceiver;->read:Landroidx/appcompat/widget/ListPopupWindow;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 3

    .line 1379
    iget-object v0, p0, Landroidx/appcompat/widget/ListPopupWindow$MediaBrowserCompatItemReceiver;->read:Landroidx/appcompat/widget/ListPopupWindow;

    iget-object v0, v0, Landroidx/appcompat/widget/ListPopupWindow;->IconCompatParcelizer:Lo/Keep;

    if-eqz v0, :cond_3d

    iget-object v0, p0, Landroidx/appcompat/widget/ListPopupWindow$MediaBrowserCompatItemReceiver;->read:Landroidx/appcompat/widget/ListPopupWindow;

    iget-object v0, v0, Landroidx/appcompat/widget/ListPopupWindow;->IconCompatParcelizer:Lo/Keep;

    invoke-static {v0}, Lo/InvalidTypeIdException;->onPlayFromSearch(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_3d

    iget-object v0, p0, Landroidx/appcompat/widget/ListPopupWindow$MediaBrowserCompatItemReceiver;->read:Landroidx/appcompat/widget/ListPopupWindow;

    iget-object v0, v0, Landroidx/appcompat/widget/ListPopupWindow;->IconCompatParcelizer:Lo/Keep;

    .line 1380
    invoke-virtual {v0}, Landroid/widget/AdapterView;->getCount()I

    move-result v0

    iget-object v1, p0, Landroidx/appcompat/widget/ListPopupWindow$MediaBrowserCompatItemReceiver;->read:Landroidx/appcompat/widget/ListPopupWindow;

    iget-object v1, v1, Landroidx/appcompat/widget/ListPopupWindow;->IconCompatParcelizer:Lo/Keep;

    invoke-virtual {v1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    if-le v0, v1, :cond_3d

    iget-object v0, p0, Landroidx/appcompat/widget/ListPopupWindow$MediaBrowserCompatItemReceiver;->read:Landroidx/appcompat/widget/ListPopupWindow;

    iget-object v0, v0, Landroidx/appcompat/widget/ListPopupWindow;->IconCompatParcelizer:Lo/Keep;

    .line 1381
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    iget-object v1, p0, Landroidx/appcompat/widget/ListPopupWindow$MediaBrowserCompatItemReceiver;->read:Landroidx/appcompat/widget/ListPopupWindow;

    iget v1, v1, Landroidx/appcompat/widget/ListPopupWindow;->read:I

    if-gt v0, v1, :cond_3d

    .line 1382
    iget-object v0, p0, Landroidx/appcompat/widget/ListPopupWindow$MediaBrowserCompatItemReceiver;->read:Landroidx/appcompat/widget/ListPopupWindow;

    iget-object v0, v0, Landroidx/appcompat/widget/ListPopupWindow;->MediaBrowserCompatCustomActionResultReceiver:Landroid/widget/PopupWindow;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setInputMethodMode(I)V

    .line 1383
    iget-object p0, p0, Landroidx/appcompat/widget/ListPopupWindow$MediaBrowserCompatItemReceiver;->read:Landroidx/appcompat/widget/ListPopupWindow;

    invoke-virtual {p0}, Landroidx/appcompat/widget/ListPopupWindow;->AudioAttributesImplBaseParcelizer()V

    :cond_3d
    return-void
.end method

###### Class androidx.appcompat.widget.ListPopupWindow.RemoteActionCompatParcelizer (androidx.appcompat.widget.ListPopupWindow$RemoteActionCompatParcelizer)
.class Landroidx/appcompat/widget/ListPopupWindow$RemoteActionCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/widget/ListPopupWindow;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "RemoteActionCompatParcelizer"
.end annotation


# direct methods
.method static AudioAttributesCompatParcelizer(Landroid/widget/PopupWindow;Landroid/view/View;IZ)I
    .registers 4

    .line 1491
    invoke-virtual {p0, p1, p2, p3}, Landroid/widget/PopupWindow;->getMaxAvailableHeight(Landroid/view/View;IZ)I

    move-result p0

    return p0
.end method

###### Class androidx.appcompat.widget.ListPopupWindow.read (androidx.appcompat.widget.ListPopupWindow$read)
.class final Landroidx/appcompat/widget/ListPopupWindow$read;
.super Landroid/database/DataSetObserver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/widget/ListPopupWindow;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "read"
.end annotation


# instance fields
.field final synthetic write:Landroidx/appcompat/widget/ListPopupWindow;


# direct methods
.method constructor <init>(Landroidx/appcompat/widget/ListPopupWindow;)V
    .registers 2

    .line 1346
    iput-object p1, p0, Landroidx/appcompat/widget/ListPopupWindow$read;->write:Landroidx/appcompat/widget/ListPopupWindow;

    invoke-direct {p0}, Landroid/database/DataSetObserver;-><init>()V

    return-void
.end method


# virtual methods
.method public final onChanged()V
    .registers 2

    .line 1351
    iget-object v0, p0, Landroidx/appcompat/widget/ListPopupWindow$read;->write:Landroidx/appcompat/widget/ListPopupWindow;

    invoke-virtual {v0}, Landroidx/appcompat/widget/ListPopupWindow;->MediaBrowserCompatCustomActionResultReceiver()Z

    move-result v0

    if-eqz v0, :cond_d

    .line 1353
    iget-object p0, p0, Landroidx/appcompat/widget/ListPopupWindow$read;->write:Landroidx/appcompat/widget/ListPopupWindow;

    invoke-virtual {p0}, Landroidx/appcompat/widget/ListPopupWindow;->AudioAttributesImplBaseParcelizer()V

    :cond_d
    return-void
.end method

.method public final onInvalidated()V
    .registers 1

    .line 1359
    iget-object p0, p0, Landroidx/appcompat/widget/ListPopupWindow$read;->write:Landroidx/appcompat/widget/ListPopupWindow;

    invoke-virtual {p0}, Landroidx/appcompat/widget/ListPopupWindow;->write()V

    return-void
.end method

###### Class androidx.appcompat.widget.ListPopupWindow.write (androidx.appcompat.widget.ListPopupWindow$write)
.class Landroidx/appcompat/widget/ListPopupWindow$write;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/widget/ListPopupWindow;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "write"
.end annotation


# direct methods
.method static IconCompatParcelizer(Landroid/widget/PopupWindow;Z)V
    .registers 2

    .line 1478
    invoke-virtual {p0, p1}, Landroid/widget/PopupWindow;->setIsClippedToScreen(Z)V

    return-void
.end method

.method static read(Landroid/widget/PopupWindow;Landroid/graphics/Rect;)V
    .registers 2

    .line 1473
    invoke-virtual {p0, p1}, Landroid/widget/PopupWindow;->setEpicenterBounds(Landroid/graphics/Rect;)V

    return-void
.end method
