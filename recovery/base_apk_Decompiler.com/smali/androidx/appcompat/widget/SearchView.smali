###### Class androidx.appcompat.widget.SearchView (androidx.appcompat.widget.SearchView)
.class public Landroidx/appcompat/widget/SearchView;
.super Landroidx/appcompat/widget/LinearLayoutCompat;
.source "SourceFile"

# interfaces
.implements Lo/invalidateMenu;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/appcompat/widget/SearchView$RemoteActionCompatParcelizer;,
        Landroidx/appcompat/widget/SearchView$write;,
        Landroidx/appcompat/widget/SearchView$IconCompatParcelizer;,
        Landroidx/appcompat/widget/SearchView$AudioAttributesCompatParcelizer;,
        Landroidx/appcompat/widget/SearchView$SavedState;,
        Landroidx/appcompat/widget/SearchView$SearchAutoComplete;,
        Landroidx/appcompat/widget/SearchView$read;
    }
.end annotation


# instance fields
.field final AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

.field private AudioAttributesImplApi21Parcelizer:Z

.field final AudioAttributesImplApi26Parcelizer:Landroid/widget/ImageView;

.field AudioAttributesImplBaseParcelizer:Landroid/app/SearchableInfo;

.field IconCompatParcelizer:Landroid/view/View$OnFocusChangeListener;

.field private MediaBrowserCompatCustomActionResultReceiver:Landroid/os/Bundle;

.field MediaBrowserCompatItemReceiver:Lo/_addSuperInterfaces;

.field private MediaBrowserCompatMediaItem:Z

.field private MediaBrowserCompatSearchResultReceiver:I

.field private MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Z

.field private final MediaDescriptionCompat:Landroid/widget/ImageView;

.field private final MediaMetadataCompat:Landroid/view/View;

.field private MediaSessionCompatQueueItem:Ljava/lang/CharSequence;

.field private MediaSessionCompatResultReceiverWrapper:Z

.field private final MediaSessionCompatToken:Ljava/lang/Runnable;

.field private final ParcelableVolumeInfo:Landroid/content/Intent;

.field private final PlaybackStateCompat:Landroid/content/Intent;

.field private final RatingCompat:Ljava/lang/CharSequence;

.field final RemoteActionCompatParcelizer:Landroid/widget/ImageView;

.field private handleMediaPlayPauseIfPendingOnHandler:I

.field private onAddQueueItem:Ljava/lang/CharSequence;

.field private onCommand:Z

.field private final onCustomAction:Landroid/view/View$OnClickListener;

.field private onFastForward:Landroidx/appcompat/widget/SearchView$write;

.field private onMediaButtonEvent:Landroidx/appcompat/widget/SearchView$IconCompatParcelizer;

.field private final onPause:Landroid/widget/AdapterView$OnItemSelectedListener;

.field private final onPlay:Landroid/widget/AdapterView$OnItemClickListener;

.field private final onPlayFromMediaId:Landroid/widget/TextView$OnEditorActionListener;

.field private onPlayFromSearch:Ljava/lang/CharSequence;

.field private onPlayFromUri:Landroid/view/View$OnClickListener;

.field private final onPrepare:Ljava/util/WeakHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/WeakHashMap<",
            "Ljava/lang/String;",
            "Landroid/graphics/drawable/Drawable$ConstantState;",
            ">;"
        }
    .end annotation
.end field

.field private onPrepareFromMediaId:Landroidx/appcompat/widget/SearchView$AudioAttributesCompatParcelizer;

.field private onPrepareFromSearch:Z

.field private final onPrepareFromUri:Landroid/graphics/drawable/Drawable;

.field private onRemoveQueueItem:Ljava/lang/Runnable;

.field private final onRemoveQueueItemAt:Landroid/view/View;

.field private onRewind:Landroid/graphics/Rect;

.field private final onSeekTo:Landroid/view/View;

.field private final onSetCaptioningEnabled:I

.field private onSetPlaybackSpeed:Landroid/graphics/Rect;

.field private onSetRating:Z

.field private final onSetRepeatMode:I

.field private final onSetShuffleMode:Landroid/view/View;

.field private onSkipToNext:Landroid/text/TextWatcher;

.field private onSkipToPrevious:Landroid/view/View$OnKeyListener;

.field private onSkipToQueueItem:[I

.field private onStop:[I

.field final read:Landroid/widget/ImageView;

.field private setSessionImpl:Landroidx/appcompat/widget/SearchView$read;

.field final write:Landroid/widget/ImageView;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 3

    const/4 v0, 0x0

    .line 272
    invoke-direct {p0, p1, v0}, Landroidx/appcompat/widget/SearchView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 4

    .line 276
    sget v0, Lo/_init_lambda5$read;->searchViewStyle:I

    invoke-direct {p0, p1, p2, v0}, Landroidx/appcompat/widget/SearchView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 20

    move-object/from16 v7, p0

    .line 280
    invoke-direct/range {p0 .. p3}, Landroidx/appcompat/widget/LinearLayoutCompat;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 136
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, v7, Landroidx/appcompat/widget/SearchView;->onRewind:Landroid/graphics/Rect;

    .line 137
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, v7, Landroidx/appcompat/widget/SearchView;->onSetPlaybackSpeed:Landroid/graphics/Rect;

    const/4 v0, 0x2

    .line 138
    new-array v1, v0, [I

    iput-object v1, v7, Landroidx/appcompat/widget/SearchView;->onStop:[I

    .line 139
    new-array v0, v0, [I

    iput-object v0, v7, Landroidx/appcompat/widget/SearchView;->onSkipToQueueItem:[I

    .line 183
    new-instance v0, Landroidx/appcompat/widget/SearchView$2;

    invoke-direct {v0, v7}, Landroidx/appcompat/widget/SearchView$2;-><init>(Landroidx/appcompat/widget/SearchView;)V

    iput-object v0, v7, Landroidx/appcompat/widget/SearchView;->MediaSessionCompatToken:Ljava/lang/Runnable;

    .line 190
    new-instance v0, Landroidx/appcompat/widget/SearchView$4;

    invoke-direct {v0, v7}, Landroidx/appcompat/widget/SearchView$4;-><init>(Landroidx/appcompat/widget/SearchView;)V

    iput-object v0, v7, Landroidx/appcompat/widget/SearchView;->onRemoveQueueItem:Ljava/lang/Runnable;

    .line 201
    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    iput-object v0, v7, Landroidx/appcompat/widget/SearchView;->onPrepare:Ljava/util/WeakHashMap;

    .line 993
    new-instance v8, Landroidx/appcompat/widget/SearchView$7;

    invoke-direct {v8, v7}, Landroidx/appcompat/widget/SearchView$7;-><init>(Landroidx/appcompat/widget/SearchView;)V

    iput-object v8, v7, Landroidx/appcompat/widget/SearchView;->onCustomAction:Landroid/view/View$OnClickListener;

    .line 1015
    new-instance v0, Landroidx/appcompat/widget/SearchView$10;

    invoke-direct {v0, v7}, Landroidx/appcompat/widget/SearchView$10;-><init>(Landroidx/appcompat/widget/SearchView;)V

    iput-object v0, v7, Landroidx/appcompat/widget/SearchView;->onSkipToPrevious:Landroid/view/View$OnKeyListener;

    .line 1178
    new-instance v9, Landroidx/appcompat/widget/SearchView$9;

    invoke-direct {v9, v7}, Landroidx/appcompat/widget/SearchView$9;-><init>(Landroidx/appcompat/widget/SearchView;)V

    iput-object v9, v7, Landroidx/appcompat/widget/SearchView;->onPlayFromMediaId:Landroid/widget/TextView$OnEditorActionListener;

    .line 1424
    new-instance v10, Landroidx/appcompat/widget/SearchView$8;

    invoke-direct {v10, v7}, Landroidx/appcompat/widget/SearchView$8;-><init>(Landroidx/appcompat/widget/SearchView;)V

    iput-object v10, v7, Landroidx/appcompat/widget/SearchView;->onPlay:Landroid/widget/AdapterView$OnItemClickListener;

    .line 1436
    new-instance v11, Landroidx/appcompat/widget/SearchView$6;

    invoke-direct {v11, v7}, Landroidx/appcompat/widget/SearchView$6;-><init>(Landroidx/appcompat/widget/SearchView;)V

    iput-object v11, v7, Landroidx/appcompat/widget/SearchView;->onPause:Landroid/widget/AdapterView$OnItemSelectedListener;

    .line 1730
    new-instance v0, Landroidx/appcompat/widget/SearchView$3;

    invoke-direct {v0, v7}, Landroidx/appcompat/widget/SearchView$3;-><init>(Landroidx/appcompat/widget/SearchView;)V

    iput-object v0, v7, Landroidx/appcompat/widget/SearchView;->onSkipToNext:Landroid/text/TextWatcher;

    .line 282
    sget-object v0, Lo/_init_lambda5$AudioAttributesImplApi26Parcelizer;->SearchView:[I

    const/4 v12, 0x0

    move-object/from16 v13, p1

    move-object/from16 v3, p2

    move/from16 v5, p3

    invoke-static {v13, v3, v0, v5, v12}, Lo/setTitle;->read(Landroid/content/Context;Landroid/util/AttributeSet;[III)Lo/setTitle;

    move-result-object v14

    .line 284
    sget-object v2, Lo/_init_lambda5$AudioAttributesImplApi26Parcelizer;->SearchView:[I

    .line 285
    invoke-virtual {v14}, Lo/setTitle;->AudioAttributesCompatParcelizer()Landroid/content/res/TypedArray;

    move-result-object v4

    const/4 v6, 0x0

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 284
    invoke-static/range {v0 .. v6}, Lo/InvalidTypeIdException;->IconCompatParcelizer(Landroid/view/View;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;II)V

    .line 287
    invoke-static/range {p1 .. p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    .line 288
    sget v1, Lo/_init_lambda5$AudioAttributesImplApi26Parcelizer;->SearchView_layout:I

    sget v2, Lo/_init_lambda5$MediaBrowserCompatCustomActionResultReceiver;->abc_search_view:I

    invoke-virtual {v14, v1, v2}, Lo/setTitle;->MediaBrowserCompatItemReceiver(II)I

    move-result v1

    const/4 v2, 0x1

    .line 290
    invoke-virtual {v0, v1, v7, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 292
    sget v0, Lo/_init_lambda5$AudioAttributesImplBaseParcelizer;->search_src_text:I

    invoke-virtual {v7, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    iput-object v0, v7, Landroidx/appcompat/widget/SearchView;->AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    .line 293
    invoke-virtual {v0, v7}, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->read(Landroidx/appcompat/widget/SearchView;)V

    .line 295
    sget v1, Lo/_init_lambda5$AudioAttributesImplBaseParcelizer;->search_edit_frame:I

    invoke-virtual {v7, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    iput-object v1, v7, Landroidx/appcompat/widget/SearchView;->onRemoveQueueItemAt:Landroid/view/View;

    .line 296
    sget v1, Lo/_init_lambda5$AudioAttributesImplBaseParcelizer;->search_plate:I

    invoke-virtual {v7, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    iput-object v1, v7, Landroidx/appcompat/widget/SearchView;->onSeekTo:Landroid/view/View;

    .line 297
    sget v3, Lo/_init_lambda5$AudioAttributesImplBaseParcelizer;->submit_area:I

    invoke-virtual {v7, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    iput-object v3, v7, Landroidx/appcompat/widget/SearchView;->onSetShuffleMode:Landroid/view/View;

    .line 298
    sget v4, Lo/_init_lambda5$AudioAttributesImplBaseParcelizer;->search_button:I

    invoke-virtual {v7, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/ImageView;

    iput-object v4, v7, Landroidx/appcompat/widget/SearchView;->RemoteActionCompatParcelizer:Landroid/widget/ImageView;

    .line 299
    sget v5, Lo/_init_lambda5$AudioAttributesImplBaseParcelizer;->search_go_btn:I

    invoke-virtual {v7, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/ImageView;

    iput-object v5, v7, Landroidx/appcompat/widget/SearchView;->read:Landroid/widget/ImageView;

    .line 300
    sget v6, Lo/_init_lambda5$AudioAttributesImplBaseParcelizer;->search_close_btn:I

    invoke-virtual {v7, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/ImageView;

    iput-object v6, v7, Landroidx/appcompat/widget/SearchView;->write:Landroid/widget/ImageView;

    .line 301
    sget v13, Lo/_init_lambda5$AudioAttributesImplBaseParcelizer;->search_voice_btn:I

    invoke-virtual {v7, v13}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v13

    check-cast v13, Landroid/widget/ImageView;

    iput-object v13, v7, Landroidx/appcompat/widget/SearchView;->AudioAttributesImplApi26Parcelizer:Landroid/widget/ImageView;

    .line 302
    sget v15, Lo/_init_lambda5$AudioAttributesImplBaseParcelizer;->search_mag_icon:I

    invoke-virtual {v7, v15}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v15

    check-cast v15, Landroid/widget/ImageView;

    iput-object v15, v7, Landroidx/appcompat/widget/SearchView;->MediaDescriptionCompat:Landroid/widget/ImageView;

    .line 305
    sget v2, Lo/_init_lambda5$AudioAttributesImplApi26Parcelizer;->SearchView_queryBackground:I

    .line 306
    invoke-virtual {v14, v2}, Lo/setTitle;->IconCompatParcelizer(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    .line 305
    invoke-static {v1, v2}, Lo/InvalidTypeIdException;->read(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V

    .line 307
    sget v1, Lo/_init_lambda5$AudioAttributesImplApi26Parcelizer;->SearchView_submitBackground:I

    .line 308
    invoke-virtual {v14, v1}, Lo/setTitle;->IconCompatParcelizer(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    .line 307
    invoke-static {v3, v1}, Lo/InvalidTypeIdException;->read(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V

    .line 309
    sget v1, Lo/_init_lambda5$AudioAttributesImplApi26Parcelizer;->SearchView_searchIcon:I

    invoke-virtual {v14, v1}, Lo/setTitle;->IconCompatParcelizer(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v4, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 310
    sget v1, Lo/_init_lambda5$AudioAttributesImplApi26Parcelizer;->SearchView_goIcon:I

    invoke-virtual {v14, v1}, Lo/setTitle;->IconCompatParcelizer(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v5, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 311
    sget v1, Lo/_init_lambda5$AudioAttributesImplApi26Parcelizer;->SearchView_closeIcon:I

    invoke-virtual {v14, v1}, Lo/setTitle;->IconCompatParcelizer(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v6, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 312
    sget v1, Lo/_init_lambda5$AudioAttributesImplApi26Parcelizer;->SearchView_voiceIcon:I

    invoke-virtual {v14, v1}, Lo/setTitle;->IconCompatParcelizer(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v13, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 313
    sget v1, Lo/_init_lambda5$AudioAttributesImplApi26Parcelizer;->SearchView_searchIcon:I

    invoke-virtual {v14, v1}, Lo/setTitle;->IconCompatParcelizer(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v15, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 315
    sget v1, Lo/_init_lambda5$AudioAttributesImplApi26Parcelizer;->SearchView_searchHintIcon:I

    invoke-virtual {v14, v1}, Lo/setTitle;->IconCompatParcelizer(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    iput-object v1, v7, Landroidx/appcompat/widget/SearchView;->onPrepareFromUri:Landroid/graphics/drawable/Drawable;

    .line 318
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lo/_init_lambda5$AudioAttributesImplApi21Parcelizer;->abc_searchview_description_search:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 317
    invoke-static {v4, v1}, Lo/setItemInvoker;->AudioAttributesCompatParcelizer(Landroid/view/View;Ljava/lang/CharSequence;)V

    .line 321
    sget v1, Lo/_init_lambda5$AudioAttributesImplApi26Parcelizer;->SearchView_suggestionRowLayout:I

    sget v2, Lo/_init_lambda5$MediaBrowserCompatCustomActionResultReceiver;->abc_search_dropdown_item_icons_2line:I

    invoke-virtual {v14, v1, v2}, Lo/setTitle;->MediaBrowserCompatItemReceiver(II)I

    move-result v1

    iput v1, v7, Landroidx/appcompat/widget/SearchView;->onSetRepeatMode:I

    .line 323
    sget v1, Lo/_init_lambda5$AudioAttributesImplApi26Parcelizer;->SearchView_commitIcon:I

    invoke-virtual {v14, v1, v12}, Lo/setTitle;->MediaBrowserCompatItemReceiver(II)I

    move-result v1

    iput v1, v7, Landroidx/appcompat/widget/SearchView;->onSetCaptioningEnabled:I

    .line 325
    invoke-virtual {v4, v8}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 326
    invoke-virtual {v6, v8}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 327
    invoke-virtual {v5, v8}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 328
    invoke-virtual {v13, v8}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 329
    invoke-virtual {v0, v8}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 331
    iget-object v1, v7, Landroidx/appcompat/widget/SearchView;->onSkipToNext:Landroid/text/TextWatcher;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 332
    invoke-virtual {v0, v9}, Landroid/widget/TextView;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    .line 333
    invoke-virtual {v0, v10}, Landroid/widget/AutoCompleteTextView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 334
    invoke-virtual {v0, v11}, Landroid/widget/AutoCompleteTextView;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    .line 335
    iget-object v1, v7, Landroidx/appcompat/widget/SearchView;->onSkipToPrevious:Landroid/view/View$OnKeyListener;

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    .line 338
    new-instance v1, Landroidx/appcompat/widget/SearchView$5;

    invoke-direct {v1, v7}, Landroidx/appcompat/widget/SearchView$5;-><init>(Landroidx/appcompat/widget/SearchView;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    .line 346
    sget v1, Lo/_init_lambda5$AudioAttributesImplApi26Parcelizer;->SearchView_iconifiedByDefault:I

    const/4 v2, 0x1

    invoke-virtual {v14, v1, v2}, Lo/setTitle;->AudioAttributesCompatParcelizer(IZ)Z

    move-result v1

    invoke-virtual {v7, v1}, Landroidx/appcompat/widget/SearchView;->setIconifiedByDefault(Z)V

    .line 348
    sget v1, Lo/_init_lambda5$AudioAttributesImplApi26Parcelizer;->SearchView_android_maxWidth:I

    const/4 v2, -0x1

    invoke-virtual {v14, v1, v2}, Lo/setTitle;->AudioAttributesCompatParcelizer(II)I

    move-result v1

    if-eq v1, v2, :cond_183

    .line 350
    invoke-virtual {v7, v1}, Landroidx/appcompat/widget/SearchView;->setMaxWidth(I)V

    .line 353
    :cond_183
    sget v1, Lo/_init_lambda5$AudioAttributesImplApi26Parcelizer;->SearchView_defaultQueryHint:I

    invoke-virtual {v14, v1}, Lo/setTitle;->AudioAttributesImplBaseParcelizer(I)Ljava/lang/CharSequence;

    move-result-object v1

    iput-object v1, v7, Landroidx/appcompat/widget/SearchView;->RatingCompat:Ljava/lang/CharSequence;

    .line 354
    sget v1, Lo/_init_lambda5$AudioAttributesImplApi26Parcelizer;->SearchView_queryHint:I

    invoke-virtual {v14, v1}, Lo/setTitle;->AudioAttributesImplBaseParcelizer(I)Ljava/lang/CharSequence;

    move-result-object v1

    iput-object v1, v7, Landroidx/appcompat/widget/SearchView;->onPlayFromSearch:Ljava/lang/CharSequence;

    .line 356
    sget v1, Lo/_init_lambda5$AudioAttributesImplApi26Parcelizer;->SearchView_android_imeOptions:I

    invoke-virtual {v14, v1, v2}, Lo/setTitle;->read(II)I

    move-result v1

    if-eq v1, v2, :cond_19e

    .line 358
    invoke-virtual {v7, v1}, Landroidx/appcompat/widget/SearchView;->setImeOptions(I)V

    .line 361
    :cond_19e
    sget v1, Lo/_init_lambda5$AudioAttributesImplApi26Parcelizer;->SearchView_android_inputType:I

    invoke-virtual {v14, v1, v2}, Lo/setTitle;->read(II)I

    move-result v1

    if-eq v1, v2, :cond_1a9

    .line 363
    invoke-virtual {v7, v1}, Landroidx/appcompat/widget/SearchView;->setInputType(I)V

    .line 367
    :cond_1a9
    sget v1, Lo/_init_lambda5$AudioAttributesImplApi26Parcelizer;->SearchView_android_focusable:I

    const/4 v2, 0x1

    invoke-virtual {v14, v1, v2}, Lo/setTitle;->AudioAttributesCompatParcelizer(IZ)Z

    move-result v1

    .line 368
    invoke-virtual {v7, v1}, Landroid/view/View;->setFocusable(Z)V

    .line 370
    invoke-virtual {v14}, Lo/setTitle;->write()V

    .line 373
    new-instance v1, Landroid/content/Intent;

    const-string v2, "android.speech.action.WEB_SEARCH"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    iput-object v1, v7, Landroidx/appcompat/widget/SearchView;->ParcelableVolumeInfo:Landroid/content/Intent;

    const/high16 v2, 0x10000000

    .line 374
    invoke-virtual {v1, v2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 375
    const-string v3, "android.speech.extra.LANGUAGE_MODEL"

    const-string v4, "web_search"

    invoke-virtual {v1, v3, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 378
    new-instance v1, Landroid/content/Intent;

    const-string v3, "android.speech.action.RECOGNIZE_SPEECH"

    invoke-direct {v1, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    iput-object v1, v7, Landroidx/appcompat/widget/SearchView;->PlaybackStateCompat:Landroid/content/Intent;

    .line 379
    invoke-virtual {v1, v2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 381
    invoke-virtual {v0}, Landroid/widget/AutoCompleteTextView;->getDropDownAnchor()I

    move-result v0

    invoke-virtual {v7, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, v7, Landroidx/appcompat/widget/SearchView;->MediaMetadataCompat:Landroid/view/View;

    if-eqz v0, :cond_1eb

    .line 383
    new-instance v1, Landroidx/appcompat/widget/SearchView$1;

    invoke-direct {v1, v7}, Landroidx/appcompat/widget/SearchView$1;-><init>(Landroidx/appcompat/widget/SearchView;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 392
    :cond_1eb
    iget-boolean v0, v7, Landroidx/appcompat/widget/SearchView;->onCommand:Z

    invoke-direct {v7, v0}, Landroidx/appcompat/widget/SearchView;->AudioAttributesCompatParcelizer(Z)V

    .line 393
    invoke-direct/range {p0 .. p0}, Landroidx/appcompat/widget/SearchView;->onFastForward()V

    return-void
.end method

.method private AudioAttributesCompatParcelizer(Landroid/content/Intent;Landroid/app/SearchableInfo;)Landroid/content/Intent;
    .registers 10

    .line 1599
    invoke-virtual {p2}, Landroid/app/SearchableInfo;->getSearchActivity()Landroid/content/ComponentName;

    move-result-object v0

    .line 1604
    new-instance v1, Landroid/content/Intent;

    const-string v2, "android.intent.action.SEARCH"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 1605
    invoke-virtual {v1, v0}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 1606
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    const/4 v3, 0x0

    const/high16 v4, 0x42000000    # 32.0f

    invoke-static {v2, v3, v1, v4}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v1

    .line 1613
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 1614
    iget-object v3, p0, Landroidx/appcompat/widget/SearchView;->MediaBrowserCompatCustomActionResultReceiver:Landroid/os/Bundle;

    if-eqz v3, :cond_27

    .line 1615
    const-string v4, "app_data"

    invoke-virtual {v2, v4, v3}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 1621
    :cond_27
    new-instance v3, Landroid/content/Intent;

    invoke-direct {v3, p1}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V

    .line 1629
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    .line 1630
    invoke-virtual {p2}, Landroid/app/SearchableInfo;->getVoiceLanguageModeId()I

    move-result p1

    if-eqz p1, :cond_3f

    .line 1631
    invoke-virtual {p2}, Landroid/app/SearchableInfo;->getVoiceLanguageModeId()I

    move-result p1

    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    goto :goto_41

    .line 1630
    :cond_3f
    const-string p1, "free_form"

    .line 1633
    :goto_41
    invoke-virtual {p2}, Landroid/app/SearchableInfo;->getVoicePromptTextId()I

    move-result v4

    const/4 v5, 0x0

    if-eqz v4, :cond_51

    .line 1634
    invoke-virtual {p2}, Landroid/app/SearchableInfo;->getVoicePromptTextId()I

    move-result v4

    invoke-virtual {p0, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    goto :goto_52

    :cond_51
    move-object v4, v5

    .line 1636
    :goto_52
    invoke-virtual {p2}, Landroid/app/SearchableInfo;->getVoiceLanguageId()I

    move-result v6

    if-eqz v6, :cond_61

    .line 1637
    invoke-virtual {p2}, Landroid/app/SearchableInfo;->getVoiceLanguageId()I

    move-result v6

    invoke-virtual {p0, v6}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p0

    goto :goto_62

    :cond_61
    move-object p0, v5

    .line 1639
    :goto_62
    invoke-virtual {p2}, Landroid/app/SearchableInfo;->getVoiceMaxResults()I

    move-result v6

    if-eqz v6, :cond_6d

    .line 1640
    invoke-virtual {p2}, Landroid/app/SearchableInfo;->getVoiceMaxResults()I

    move-result p2

    goto :goto_6e

    :cond_6d
    const/4 p2, 0x1

    .line 1643
    :goto_6e
    const-string v6, "android.speech.extra.LANGUAGE_MODEL"

    invoke-virtual {v3, v6, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1644
    const-string p1, "android.speech.extra.PROMPT"

    invoke-virtual {v3, p1, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1645
    const-string p1, "android.speech.extra.LANGUAGE"

    invoke-virtual {v3, p1, p0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1646
    const-string p0, "android.speech.extra.MAX_RESULTS"

    invoke-virtual {v3, p0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    if-nez v0, :cond_85

    goto :goto_89

    .line 1648
    :cond_85
    invoke-virtual {v0}, Landroid/content/ComponentName;->flattenToShortString()Ljava/lang/String;

    move-result-object v5

    .line 1647
    :goto_89
    const-string p0, "calling_package"

    invoke-virtual {v3, p0, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1651
    const-string p0, "android.speech.extra.RESULTS_PENDINGINTENT"

    invoke-virtual {v3, p0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 1652
    const-string p0, "android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE"

    invoke-virtual {v3, p0, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    return-object v3
.end method

.method private AudioAttributesCompatParcelizer(Z)V
    .registers 7

    .line 880
    iput-boolean p1, p0, Landroidx/appcompat/widget/SearchView;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Z

    const/4 v0, 0x0

    const/16 v1, 0x8

    if-eqz p1, :cond_9

    move v2, v0

    goto :goto_a

    :cond_9
    move v2, v1

    .line 884
    :goto_a
    iget-object v3, p0, Landroidx/appcompat/widget/SearchView;->AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v3}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v3

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    .line 886
    iget-object v4, p0, Landroidx/appcompat/widget/SearchView;->RemoteActionCompatParcelizer:Landroid/widget/ImageView;

    invoke-virtual {v4, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    xor-int/lit8 v2, v3, 0x1

    .line 887
    invoke-direct {p0, v2}, Landroidx/appcompat/widget/SearchView;->IconCompatParcelizer(Z)V

    .line 888
    iget-object v2, p0, Landroidx/appcompat/widget/SearchView;->onRemoveQueueItemAt:Landroid/view/View;

    if-eqz p1, :cond_24

    move p1, v1

    goto :goto_25

    :cond_24
    move p1, v0

    :goto_25
    invoke-virtual {v2, p1}, Landroid/view/View;->setVisibility(I)V

    .line 891
    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->MediaDescriptionCompat:Landroid/widget/ImageView;

    invoke-virtual {p1}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    if-eqz p1, :cond_34

    iget-boolean p1, p0, Landroidx/appcompat/widget/SearchView;->onCommand:Z

    if-eqz p1, :cond_35

    :cond_34
    move v0, v1

    .line 896
    :cond_35
    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->MediaDescriptionCompat:Landroid/widget/ImageView;

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 898
    invoke-direct {p0}, Landroidx/appcompat/widget/SearchView;->onPlayFromMediaId()V

    .line 899
    invoke-direct {p0, v3}, Landroidx/appcompat/widget/SearchView;->RemoteActionCompatParcelizer(Z)V

    .line 900
    invoke-direct {p0}, Landroidx/appcompat/widget/SearchView;->onPrepareFromSearch()V

    return-void
.end method

.method private IconCompatParcelizer(Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Landroid/content/Intent;
    .registers 8

    .line 1554
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0, p1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const/high16 p1, 0x10000000

    .line 1555
    invoke-virtual {v0, p1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    if-eqz p2, :cond_f

    .line 1560
    invoke-virtual {v0, p2}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 1562
    :cond_f
    const-string p1, "user_query"

    iget-object p2, p0, Landroidx/appcompat/widget/SearchView;->MediaSessionCompatQueueItem:Ljava/lang/CharSequence;

    invoke-virtual {v0, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/CharSequence;)Landroid/content/Intent;

    if-eqz p4, :cond_1d

    .line 1564
    const-string p1, "query"

    invoke-virtual {v0, p1, p4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    :cond_1d
    if-eqz p3, :cond_24

    .line 1567
    const-string p1, "intent_extra_data_key"

    invoke-virtual {v0, p1, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1569
    :cond_24
    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->MediaBrowserCompatCustomActionResultReceiver:Landroid/os/Bundle;

    if-eqz p1, :cond_2d

    .line 1570
    const-string p2, "app_data"

    invoke-virtual {v0, p2, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    :cond_2d
    if-eqz p5, :cond_39

    .line 1573
    const-string p1, "action_key"

    invoke-virtual {v0, p1, p5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 1574
    const-string p1, "action_msg"

    invoke-virtual {v0, p1, p6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1576
    :cond_39
    iget-object p0, p0, Landroidx/appcompat/widget/SearchView;->AudioAttributesImplBaseParcelizer:Landroid/app/SearchableInfo;

    invoke-virtual {p0}, Landroid/app/SearchableInfo;->getSearchActivity()Landroid/content/ComponentName;

    move-result-object p0

    invoke-virtual {v0, p0}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    return-object v0
.end method

.method private IconCompatParcelizer(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
    .registers 6

    .line 1105
    iget-boolean v0, p0, Landroidx/appcompat/widget/SearchView;->onCommand:Z

    if-eqz v0, :cond_32

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->onPrepareFromUri:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_32

    .line 1109
    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v0}, Landroid/widget/TextView;->getTextSize()F

    move-result v0

    float-to-double v0, v0

    const-wide/high16 v2, 0x3ff4000000000000L    # 1.25

    mul-double/2addr v0, v2

    double-to-int v0, v0

    .line 1110
    iget-object v1, p0, Landroidx/appcompat/widget/SearchView;->onPrepareFromUri:Landroid/graphics/drawable/Drawable;

    const/4 v2, 0x0

    invoke-virtual {v1, v2, v2, v0, v0}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 1112
    new-instance v0, Landroid/text/SpannableStringBuilder;

    const-string v1, "   "

    invoke-direct {v0, v1}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 1113
    new-instance v1, Landroid/text/style/ImageSpan;

    iget-object p0, p0, Landroidx/appcompat/widget/SearchView;->onPrepareFromUri:Landroid/graphics/drawable/Drawable;

    invoke-direct {v1, p0}, Landroid/text/style/ImageSpan;-><init>(Landroid/graphics/drawable/Drawable;)V

    const/4 p0, 0x2

    const/16 v2, 0x21

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v3, p0, v2}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 1114
    invoke-virtual {v0, p1}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    return-object v0

    :cond_32
    return-object p1
.end method

.method private IconCompatParcelizer(Z)V
    .registers 3

    .line 927
    iget-boolean v0, p0, Landroidx/appcompat/widget/SearchView;->onSetRating:Z

    if-eqz v0, :cond_18

    invoke-direct {p0}, Landroidx/appcompat/widget/SearchView;->onPlay()Z

    move-result v0

    if-eqz v0, :cond_18

    invoke-virtual {p0}, Landroid/view/View;->hasFocus()Z

    move-result v0

    if-eqz v0, :cond_18

    if-nez p1, :cond_16

    iget-boolean p1, p0, Landroidx/appcompat/widget/SearchView;->MediaSessionCompatResultReceiverWrapper:Z

    if-nez p1, :cond_18

    :cond_16
    const/4 p1, 0x0

    goto :goto_1a

    :cond_18
    const/16 p1, 0x8

    .line 931
    :goto_1a
    iget-object p0, p0, Landroidx/appcompat/widget/SearchView;->read:Landroid/widget/ImageView;

    invoke-virtual {p0, p1}, Landroid/widget/ImageView;->setVisibility(I)V

    return-void
.end method

.method private MediaBrowserCompatCustomActionResultReceiver(I)V
    .registers 4

    .line 1461
    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    .line 1462
    iget-object v1, p0, Landroidx/appcompat/widget/SearchView;->MediaBrowserCompatItemReceiver:Lo/_addSuperInterfaces;

    invoke-virtual {v1}, Lo/_addSuperInterfaces;->AudioAttributesCompatParcelizer()Landroid/database/Cursor;

    move-result-object v1

    if-nez v1, :cond_f

    return-void

    .line 1466
    :cond_f
    invoke-interface {v1, p1}, Landroid/database/Cursor;->moveToPosition(I)Z

    move-result p1

    if-eqz p1, :cond_25

    .line 1468
    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->MediaBrowserCompatItemReceiver:Lo/_addSuperInterfaces;

    invoke-virtual {p1, v1}, Lo/_addSuperInterfaces;->RemoteActionCompatParcelizer(Landroid/database/Cursor;)Ljava/lang/CharSequence;

    move-result-object p1

    if-eqz p1, :cond_21

    .line 1472
    invoke-direct {p0, p1}, Landroidx/appcompat/widget/SearchView;->read(Ljava/lang/CharSequence;)V

    return-void

    .line 1475
    :cond_21
    invoke-direct {p0, v0}, Landroidx/appcompat/widget/SearchView;->read(Ljava/lang/CharSequence;)V

    return-void

    .line 1479
    :cond_25
    invoke-direct {p0, v0}, Landroidx/appcompat/widget/SearchView;->read(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private MediaBrowserCompatItemReceiver(I)Z
    .registers 4

    .line 1494
    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->MediaBrowserCompatItemReceiver:Lo/_addSuperInterfaces;

    invoke-virtual {v0}, Lo/_addSuperInterfaces;->AudioAttributesCompatParcelizer()Landroid/database/Cursor;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_19

    .line 1495
    invoke-interface {v0, p1}, Landroid/database/Cursor;->moveToPosition(I)Z

    move-result p1

    if-eqz p1, :cond_19

    const/4 p1, 0x0

    .line 1497
    invoke-direct {p0, v0, v1, p1}, Landroidx/appcompat/widget/SearchView;->read(Landroid/database/Cursor;ILjava/lang/String;)Landroid/content/Intent;

    move-result-object p1

    .line 1500
    invoke-direct {p0, p1}, Landroidx/appcompat/widget/SearchView;->write(Landroid/content/Intent;)V

    const/4 p0, 0x1

    return p0

    :cond_19
    return v1
.end method

.method private MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()Z
    .registers 3

    .line 905
    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->AudioAttributesImplBaseParcelizer:Landroid/app/SearchableInfo;

    if-eqz v0, :cond_35

    invoke-virtual {v0}, Landroid/app/SearchableInfo;->getVoiceSearchEnabled()Z

    move-result v0

    if-eqz v0, :cond_35

    .line 907
    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->AudioAttributesImplBaseParcelizer:Landroid/app/SearchableInfo;

    invoke-virtual {v0}, Landroid/app/SearchableInfo;->getVoiceSearchLaunchWebSearch()Z

    move-result v0

    if-eqz v0, :cond_15

    .line 908
    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->ParcelableVolumeInfo:Landroid/content/Intent;

    goto :goto_21

    .line 909
    :cond_15
    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->AudioAttributesImplBaseParcelizer:Landroid/app/SearchableInfo;

    invoke-virtual {v0}, Landroid/app/SearchableInfo;->getVoiceSearchLaunchRecognizer()Z

    move-result v0

    if-eqz v0, :cond_20

    .line 910
    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->PlaybackStateCompat:Landroid/content/Intent;

    goto :goto_21

    :cond_20
    const/4 v0, 0x0

    :goto_21
    if-eqz v0, :cond_35

    .line 913
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p0

    const/high16 v1, 0x10000

    invoke-virtual {p0, v0, v1}, Landroid/content/pm/PackageManager;->resolveActivity(Landroid/content/Intent;I)Landroid/content/pm/ResolveInfo;

    move-result-object p0

    if-eqz p0, :cond_35

    const/4 p0, 0x1

    return p0

    :cond_35
    const/4 p0, 0x0

    return p0
.end method

.method private RemoteActionCompatParcelizer(Landroid/view/View;Landroid/graphics/Rect;)V
    .registers 6

    .line 862
    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->onStop:[I

    invoke-virtual {p1, v0}, Landroid/view/View;->getLocationInWindow([I)V

    .line 863
    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->onSkipToQueueItem:[I

    invoke-virtual {p0, v0}, Landroid/view/View;->getLocationInWindow([I)V

    .line 864
    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->onStop:[I

    const/4 v1, 0x1

    aget v2, v0, v1

    iget-object p0, p0, Landroidx/appcompat/widget/SearchView;->onSkipToQueueItem:[I

    aget v1, p0, v1

    sub-int/2addr v2, v1

    const/4 v1, 0x0

    .line 865
    aget v0, v0, v1

    aget p0, p0, v1

    sub-int/2addr v0, p0

    .line 866
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result p0

    add-int/2addr p0, v0

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result p1

    add-int/2addr p1, v2

    invoke-virtual {p2, v0, v2, p0, p1}, Landroid/graphics/Rect;->set(IIII)V

    return-void
.end method

.method private RemoteActionCompatParcelizer(Z)V
    .registers 4

    .line 1171
    iget-boolean v0, p0, Landroidx/appcompat/widget/SearchView;->MediaSessionCompatResultReceiverWrapper:Z

    const/16 v1, 0x8

    if-eqz v0, :cond_14

    invoke-direct {p0}, Landroidx/appcompat/widget/SearchView;->onPlayFromSearch()Z

    move-result v0

    if-nez v0, :cond_14

    if-eqz p1, :cond_14

    .line 1173
    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->read:Landroid/widget/ImageView;

    invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    const/4 v1, 0x0

    .line 1175
    :cond_14
    iget-object p0, p0, Landroidx/appcompat/widget/SearchView;->AudioAttributesImplApi26Parcelizer:Landroid/widget/ImageView;

    invoke-virtual {p0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    return-void
.end method

.method private handleMediaPlayPauseIfPendingOnHandler()V
    .registers 1

    .line 1219
    iget-object p0, p0, Landroidx/appcompat/widget/SearchView;->AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {p0}, Landroid/widget/AutoCompleteTextView;->dismissDropDown()V

    return-void
.end method

.method private onCommand()I
    .registers 2

    .line 875
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    sget v0, Lo/_init_lambda5$AudioAttributesCompatParcelizer;->abc_search_view_preferred_height:I

    .line 876
    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p0

    return p0
.end method

.method private onCustomAction()I
    .registers 2

    .line 870
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    sget v0, Lo/_init_lambda5$AudioAttributesCompatParcelizer;->abc_search_view_preferred_width:I

    .line 871
    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p0

    return p0
.end method

.method private onFastForward()V
    .registers 3

    .line 1119
    invoke-direct {p0}, Landroidx/appcompat/widget/SearchView;->onPrepare()Ljava/lang/CharSequence;

    move-result-object v0

    .line 1120
    iget-object v1, p0, Landroidx/appcompat/widget/SearchView;->AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    if-nez v0, :cond_a

    const-string v0, ""

    :cond_a
    invoke-direct {p0, v0}, Landroidx/appcompat/widget/SearchView;->IconCompatParcelizer(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p0

    invoke-virtual {v1, p0}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private onMediaButtonEvent()V
    .registers 2

    .line 957
    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->MediaSessionCompatToken:Ljava/lang/Runnable;

    invoke-virtual {p0, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method private onPause()V
    .registers 6

    .line 1127
    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    iget-object v1, p0, Landroidx/appcompat/widget/SearchView;->AudioAttributesImplBaseParcelizer:Landroid/app/SearchableInfo;

    invoke-virtual {v1}, Landroid/app/SearchableInfo;->getSuggestThreshold()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/AutoCompleteTextView;->setThreshold(I)V

    .line 1128
    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    iget-object v1, p0, Landroidx/appcompat/widget/SearchView;->AudioAttributesImplBaseParcelizer:Landroid/app/SearchableInfo;

    invoke-virtual {v1}, Landroid/app/SearchableInfo;->getImeOptions()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setImeOptions(I)V

    .line 1129
    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->AudioAttributesImplBaseParcelizer:Landroid/app/SearchableInfo;

    invoke-virtual {v0}, Landroid/app/SearchableInfo;->getInputType()I

    move-result v0

    and-int/lit8 v1, v0, 0xf

    const/4 v2, 0x1

    if-ne v1, v2, :cond_30

    const v1, -0x10001

    and-int/2addr v0, v1

    .line 1136
    iget-object v1, p0, Landroidx/appcompat/widget/SearchView;->AudioAttributesImplBaseParcelizer:Landroid/app/SearchableInfo;

    invoke-virtual {v1}, Landroid/app/SearchableInfo;->getSuggestAuthority()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_30

    const/high16 v1, 0x90000

    or-int/2addr v0, v1

    .line 1147
    :cond_30
    iget-object v1, p0, Landroidx/appcompat/widget/SearchView;->AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setInputType(I)V

    .line 1148
    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->MediaBrowserCompatItemReceiver:Lo/_addSuperInterfaces;

    if-eqz v0, :cond_3d

    const/4 v1, 0x0

    .line 1149
    invoke-virtual {v0, v1}, Lo/_addSuperInterfaces;->read(Landroid/database/Cursor;)V

    .line 1153
    :cond_3d
    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->AudioAttributesImplBaseParcelizer:Landroid/app/SearchableInfo;

    invoke-virtual {v0}, Landroid/app/SearchableInfo;->getSuggestAuthority()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_65

    .line 1154
    new-instance v0, Lo/setHasDecor;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v3, p0, Landroidx/appcompat/widget/SearchView;->AudioAttributesImplBaseParcelizer:Landroid/app/SearchableInfo;

    iget-object v4, p0, Landroidx/appcompat/widget/SearchView;->onPrepare:Ljava/util/WeakHashMap;

    invoke-direct {v0, v1, p0, v3, v4}, Lo/setHasDecor;-><init>(Landroid/content/Context;Landroidx/appcompat/widget/SearchView;Landroid/app/SearchableInfo;Ljava/util/WeakHashMap;)V

    iput-object v0, p0, Landroidx/appcompat/widget/SearchView;->MediaBrowserCompatItemReceiver:Lo/_addSuperInterfaces;

    .line 1156
    iget-object v1, p0, Landroidx/appcompat/widget/SearchView;->AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v1, v0}, Landroid/widget/AutoCompleteTextView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 1157
    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->MediaBrowserCompatItemReceiver:Lo/_addSuperInterfaces;

    check-cast v0, Lo/setHasDecor;

    .line 1158
    iget-boolean p0, p0, Landroidx/appcompat/widget/SearchView;->onPrepareFromSearch:Z

    if-eqz p0, :cond_62

    const/4 v2, 0x2

    .line 1157
    :cond_62
    invoke-virtual {v0, v2}, Lo/setHasDecor;->AudioAttributesCompatParcelizer(I)V

    :cond_65
    return-void
.end method

.method private onPlay()Z
    .registers 2

    .line 922
    iget-boolean v0, p0, Landroidx/appcompat/widget/SearchView;->onSetRating:Z

    if-nez v0, :cond_8

    iget-boolean v0, p0, Landroidx/appcompat/widget/SearchView;->MediaSessionCompatResultReceiverWrapper:Z

    if-eqz v0, :cond_10

    :cond_8
    invoke-direct {p0}, Landroidx/appcompat/widget/SearchView;->onPlayFromSearch()Z

    move-result p0

    if-nez p0, :cond_10

    const/4 p0, 0x1

    return p0

    :cond_10
    const/4 p0, 0x0

    return p0
.end method

.method private onPlayFromMediaId()V
    .registers 5

    .line 945
    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_17

    .line 948
    iget-boolean v2, p0, Landroidx/appcompat/widget/SearchView;->onCommand:Z

    if-eqz v2, :cond_15

    iget-boolean v2, p0, Landroidx/appcompat/widget/SearchView;->MediaBrowserCompatMediaItem:Z

    if-eqz v2, :cond_17

    :cond_15
    move v2, v1

    goto :goto_18

    :cond_17
    const/4 v2, 0x1

    .line 949
    :goto_18
    iget-object v3, p0, Landroidx/appcompat/widget/SearchView;->write:Landroid/widget/ImageView;

    if-eqz v2, :cond_1d

    goto :goto_1f

    :cond_1d
    const/16 v1, 0x8

    :goto_1f
    invoke-virtual {v3, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 950
    iget-object p0, p0, Landroidx/appcompat/widget/SearchView;->write:Landroid/widget/ImageView;

    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object p0

    if-eqz p0, :cond_34

    if-nez v0, :cond_2f

    .line 952
    sget-object v0, Landroidx/appcompat/widget/SearchView;->ENABLED_STATE_SET:[I

    goto :goto_31

    :cond_2f
    sget-object v0, Landroidx/appcompat/widget/SearchView;->EMPTY_STATE_SET:[I

    :goto_31
    invoke-virtual {p0, v0}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    :cond_34
    return-void
.end method

.method private onPlayFromSearch()Z
    .registers 1

    .line 693
    iget-boolean p0, p0, Landroidx/appcompat/widget/SearchView;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Z

    return p0
.end method

.method private onPrepare()Ljava/lang/CharSequence;
    .registers 2

    .line 628
    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->onPlayFromSearch:Ljava/lang/CharSequence;

    if-eqz v0, :cond_5

    return-object v0

    .line 630
    :cond_5
    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->AudioAttributesImplBaseParcelizer:Landroid/app/SearchableInfo;

    if-eqz v0, :cond_1e

    invoke-virtual {v0}, Landroid/app/SearchableInfo;->getHintId()I

    move-result v0

    if-eqz v0, :cond_1e

    .line 631
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    iget-object p0, p0, Landroidx/appcompat/widget/SearchView;->AudioAttributesImplBaseParcelizer:Landroid/app/SearchableInfo;

    invoke-virtual {p0}, Landroid/app/SearchableInfo;->getHintId()I

    move-result p0

    invoke-virtual {v0, p0}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    move-result-object p0

    return-object p0

    .line 633
    :cond_1e
    iget-object p0, p0, Landroidx/appcompat/widget/SearchView;->RatingCompat:Ljava/lang/CharSequence;

    return-object p0
.end method

.method private onPrepareFromSearch()V
    .registers 2

    .line 936
    invoke-direct {p0}, Landroidx/appcompat/widget/SearchView;->onPlay()Z

    move-result v0

    if-eqz v0, :cond_18

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->read:Landroid/widget/ImageView;

    .line 937
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_16

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->AudioAttributesImplApi26Parcelizer:Landroid/widget/ImageView;

    .line 938
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_18

    :cond_16
    const/4 v0, 0x0

    goto :goto_1a

    :cond_18
    const/16 v0, 0x8

    .line 941
    :goto_1a
    iget-object p0, p0, Landroidx/appcompat/widget/SearchView;->onSetShuffleMode:Landroid/view/View;

    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method private read(Landroid/database/Cursor;ILjava/lang/String;)Landroid/content/Intent;
    .registers 11

    const/4 p2, 0x0

    .line 1673
    :try_start_1
    const-string p3, "suggest_intent_action"

    invoke-static {p1, p3}, Lo/setHasDecor;->write(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    if-nez p3, :cond_f

    .line 1676
    iget-object p3, p0, Landroidx/appcompat/widget/SearchView;->AudioAttributesImplBaseParcelizer:Landroid/app/SearchableInfo;

    invoke-virtual {p3}, Landroid/app/SearchableInfo;->getSuggestIntentAction()Ljava/lang/String;

    move-result-object p3
    :try_end_f
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_f} :catch_61

    :cond_f
    if-nez p3, :cond_13

    .line 1679
    const-string p3, "android.intent.action.SEARCH"

    :cond_13
    move-object v1, p3

    .line 1683
    :try_start_14
    const-string p3, "suggest_intent_data"

    invoke-static {p1, p3}, Lo/setHasDecor;->write(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    if-nez p3, :cond_22

    .line 1685
    iget-object p3, p0, Landroidx/appcompat/widget/SearchView;->AudioAttributesImplBaseParcelizer:Landroid/app/SearchableInfo;

    invoke-virtual {p3}, Landroid/app/SearchableInfo;->getSuggestIntentData()Ljava/lang/String;

    move-result-object p3

    :cond_22
    if-eqz p3, :cond_44

    .line 1689
    const-string v0, "suggest_intent_data_id"

    invoke-static {p1, v0}, Lo/setHasDecor;->write(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_44

    .line 1691
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, "/"

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v0}, Landroid/net/Uri;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p3

    :cond_44
    if-nez p3, :cond_48

    move-object v2, p2

    goto :goto_4d

    .line 1694
    :cond_48
    invoke-static {p3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p3

    move-object v2, p3

    .line 1696
    :goto_4d
    const-string p3, "suggest_intent_query"

    invoke-static {p1, p3}, Lo/setHasDecor;->write(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 1697
    const-string p3, "suggest_intent_extra_data"

    invoke-static {p1, p3}, Lo/setHasDecor;->write(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    .line 1699
    invoke-direct/range {v0 .. v6}, Landroidx/appcompat/widget/SearchView;->IconCompatParcelizer(Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Landroid/content/Intent;

    move-result-object p0
    :try_end_60
    .catch Ljava/lang/RuntimeException; {:try_start_14 .. :try_end_60} :catch_61

    return-object p0

    .line 1703
    :catch_61
    :try_start_61
    invoke-interface {p1}, Landroid/database/Cursor;->getPosition()I
    :try_end_64
    .catch Ljava/lang/RuntimeException; {:try_start_61 .. :try_end_64} :catch_64

    :catch_64
    return-object p2
.end method

.method private read(Ljava/lang/CharSequence;)V
    .registers 3

    .line 1527
    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1529
    iget-object p0, p0, Landroidx/appcompat/widget/SearchView;->AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_f

    const/4 p1, 0x0

    goto :goto_13

    :cond_f
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    :goto_13
    invoke-virtual {p0, p1}, Landroid/widget/EditText;->setSelection(I)V

    return-void
.end method

.method private static write(Landroid/content/Intent;Landroid/app/SearchableInfo;)Landroid/content/Intent;
    .registers 3

    .line 1584
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0, p0}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V

    .line 1585
    invoke-virtual {p1}, Landroid/app/SearchableInfo;->getSearchActivity()Landroid/content/ComponentName;

    move-result-object p0

    if-nez p0, :cond_d

    const/4 p0, 0x0

    goto :goto_11

    .line 1587
    :cond_d
    invoke-virtual {p0}, Landroid/content/ComponentName;->flattenToShortString()Ljava/lang/String;

    move-result-object p0

    .line 1586
    :goto_11
    const-string p1, "calling_package"

    invoke-virtual {v0, p1, p0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    return-object v0
.end method

.method private write(Landroid/content/Intent;)V
    .registers 2

    if-nez p1, :cond_3

    return-void

    .line 1517
    :cond_3
    :try_start_3
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p0

    invoke-virtual {p0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_a
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_a} :catch_b

    return-void

    .line 1519
    :catch_b
    invoke-static {p1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    return-void
.end method

.method static write(Landroid/content/Context;)Z
    .registers 2

    .line 1723
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p0

    iget p0, p0, Landroid/content/res/Configuration;->orientation:I

    const/4 v0, 0x2

    if-ne p0, v0, :cond_f

    const/4 p0, 0x1

    return p0

    :cond_f
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method final AudioAttributesCompatParcelizer()V
    .registers 7

    .line 1381
    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->MediaMetadataCompat:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_5f

    .line 1382
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    .line 1383
    iget-object v1, p0, Landroidx/appcompat/widget/SearchView;->onSeekTo:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getPaddingLeft()I

    move-result v1

    .line 1384
    new-instance v2, Landroid/graphics/Rect;

    invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V

    .line 1385
    invoke-static {p0}, Lo/setChecked;->AudioAttributesCompatParcelizer(Landroid/view/View;)Z

    move-result v3

    .line 1386
    iget-boolean v4, p0, Landroidx/appcompat/widget/SearchView;->onCommand:Z

    if-eqz v4, :cond_32

    .line 1388
    sget v4, Lo/_init_lambda5$AudioAttributesCompatParcelizer;->abc_dropdownitem_icon_width:I

    .line 1387
    invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v4

    sget v5, Lo/_init_lambda5$AudioAttributesCompatParcelizer;->abc_dropdownitem_text_padding_left:I

    .line 1388
    invoke-virtual {v0, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    add-int/2addr v4, v0

    goto :goto_33

    :cond_32
    const/4 v4, 0x0

    .line 1390
    :goto_33
    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v0}, Landroid/widget/AutoCompleteTextView;->getDropDownBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    if-eqz v3, :cond_42

    .line 1393
    iget v0, v2, Landroid/graphics/Rect;->left:I

    neg-int v0, v0

    goto :goto_47

    .line 1395
    :cond_42
    iget v0, v2, Landroid/graphics/Rect;->left:I

    add-int/2addr v0, v4

    sub-int v0, v1, v0

    .line 1397
    :goto_47
    iget-object v3, p0, Landroidx/appcompat/widget/SearchView;->AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v3, v0}, Landroid/widget/AutoCompleteTextView;->setDropDownHorizontalOffset(I)V

    .line 1398
    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->MediaMetadataCompat:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v0

    iget v3, v2, Landroid/graphics/Rect;->left:I

    iget v2, v2, Landroid/graphics/Rect;->right:I

    .line 1400
    iget-object p0, p0, Landroidx/appcompat/widget/SearchView;->AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    add-int/2addr v0, v3

    add-int/2addr v0, v2

    add-int/2addr v0, v4

    sub-int/2addr v0, v1

    invoke-virtual {p0, v0}, Landroid/widget/AutoCompleteTextView;->setDropDownWidth(I)V

    :cond_5f
    return-void
.end method

.method public final AudioAttributesCompatParcelizer(Ljava/lang/CharSequence;)V
    .registers 2

    .line 990
    invoke-direct {p0, p1}, Landroidx/appcompat/widget/SearchView;->read(Ljava/lang/CharSequence;)V

    return-void
.end method

.method final AudioAttributesImplApi21Parcelizer()V
    .registers 3

    .line 1205
    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    if-eqz v0, :cond_2c

    .line 1206
    invoke-static {v0}, Landroid/text/TextUtils;->getTrimmedLength(Ljava/lang/CharSequence;)I

    move-result v1

    if-lez v1, :cond_2c

    .line 1207
    iget-object v1, p0, Landroidx/appcompat/widget/SearchView;->onMediaButtonEvent:Landroidx/appcompat/widget/SearchView$IconCompatParcelizer;

    if-eqz v1, :cond_18

    .line 1208
    invoke-interface {v1}, Landroidx/appcompat/widget/SearchView$IconCompatParcelizer;->AudioAttributesCompatParcelizer()Z

    move-result v1

    if-nez v1, :cond_2c

    .line 1209
    :cond_18
    iget-object v1, p0, Landroidx/appcompat/widget/SearchView;->AudioAttributesImplBaseParcelizer:Landroid/app/SearchableInfo;

    if-eqz v1, :cond_23

    .line 1210
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroidx/appcompat/widget/SearchView;->write(Ljava/lang/String;)V

    .line 1212
    :cond_23
    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->write(Z)V

    .line 1213
    invoke-direct {p0}, Landroidx/appcompat/widget/SearchView;->handleMediaPlayPauseIfPendingOnHandler()V

    :cond_2c
    return-void
.end method

.method final AudioAttributesImplApi26Parcelizer()V
    .registers 3

    const/4 v0, 0x0

    .line 1243
    invoke-direct {p0, v0}, Landroidx/appcompat/widget/SearchView;->AudioAttributesCompatParcelizer(Z)V

    .line 1244
    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    .line 1245
    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->write(Z)V

    .line 1246
    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->onPlayFromUri:Landroid/view/View$OnClickListener;

    if-eqz v0, :cond_16

    .line 1247
    invoke-interface {v0, p0}, Landroid/view/View$OnClickListener;->onClick(Landroid/view/View;)V

    :cond_16
    return-void
.end method

.method final AudioAttributesImplBaseParcelizer()V
    .registers 4

    .line 1223
    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    .line 1224
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_22

    .line 1225
    iget-boolean v0, p0, Landroidx/appcompat/widget/SearchView;->onCommand:Z

    if-eqz v0, :cond_21

    .line 1227
    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->onFastForward:Landroidx/appcompat/widget/SearchView$write;

    if-eqz v0, :cond_1b

    invoke-interface {v0}, Landroidx/appcompat/widget/SearchView$write;->AudioAttributesCompatParcelizer()Z

    move-result v0

    if-nez v0, :cond_21

    .line 1229
    :cond_1b
    invoke-virtual {p0}, Landroid/view/View;->clearFocus()V

    .line 1231
    invoke-direct {p0, v1}, Landroidx/appcompat/widget/SearchView;->AudioAttributesCompatParcelizer(Z)V

    :cond_21
    return-void

    .line 1235
    :cond_22
    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    const-string v2, ""

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1236
    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    .line 1237
    iget-object p0, p0, Landroidx/appcompat/widget/SearchView;->AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {p0, v1}, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->write(Z)V

    return-void
.end method

.method public final IconCompatParcelizer()V
    .registers 4

    .line 1308
    iget-boolean v0, p0, Landroidx/appcompat/widget/SearchView;->MediaBrowserCompatMediaItem:Z

    if-eqz v0, :cond_5

    return-void

    :cond_5
    const/4 v0, 0x1

    .line 1310
    iput-boolean v0, p0, Landroidx/appcompat/widget/SearchView;->MediaBrowserCompatMediaItem:Z

    .line 1311
    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v0}, Landroid/widget/TextView;->getImeOptions()I

    move-result v0

    iput v0, p0, Landroidx/appcompat/widget/SearchView;->MediaBrowserCompatSearchResultReceiver:I

    .line 1312
    iget-object v1, p0, Landroidx/appcompat/widget/SearchView;->AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    const/high16 v2, 0x2000000

    or-int/2addr v0, v2

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setImeOptions(I)V

    .line 1313
    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/4 v0, 0x0

    .line 1314
    invoke-virtual {p0, v0}, Landroidx/appcompat/widget/SearchView;->setIconified(Z)V

    return-void
.end method

.method public final MediaBrowserCompatCustomActionResultReceiver()I
    .registers 1

    .line 397
    iget p0, p0, Landroidx/appcompat/widget/SearchView;->onSetRepeatMode:I

    return p0
.end method

.method final MediaBrowserCompatItemReceiver()V
    .registers 2

    .line 1275
    invoke-direct {p0}, Landroidx/appcompat/widget/SearchView;->onPlayFromSearch()Z

    move-result v0

    invoke-direct {p0, v0}, Landroidx/appcompat/widget/SearchView;->AudioAttributesCompatParcelizer(Z)V

    .line 1278
    invoke-direct {p0}, Landroidx/appcompat/widget/SearchView;->onMediaButtonEvent()V

    .line 1279
    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v0}, Landroid/view/View;->hasFocus()Z

    move-result v0

    if-eqz v0, :cond_15

    .line 1280
    invoke-virtual {p0}, Landroidx/appcompat/widget/SearchView;->read()V

    :cond_15
    return-void
.end method

.method final MediaBrowserCompatMediaItem()V
    .registers 3

    .line 1253
    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->AudioAttributesImplBaseParcelizer:Landroid/app/SearchableInfo;

    if-eqz v0, :cond_2c

    .line 1258
    :try_start_4
    invoke-virtual {v0}, Landroid/app/SearchableInfo;->getVoiceSearchLaunchWebSearch()Z

    move-result v1

    if-eqz v1, :cond_18

    .line 1259
    iget-object v1, p0, Landroidx/appcompat/widget/SearchView;->ParcelableVolumeInfo:Landroid/content/Intent;

    invoke-static {v1, v0}, Landroidx/appcompat/widget/SearchView;->write(Landroid/content/Intent;Landroid/app/SearchableInfo;)Landroid/content/Intent;

    move-result-object v0

    .line 1261
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p0

    invoke-virtual {p0, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void

    .line 1262
    :cond_18
    invoke-virtual {v0}, Landroid/app/SearchableInfo;->getVoiceSearchLaunchRecognizer()Z

    move-result v1

    if-eqz v1, :cond_2c

    .line 1263
    iget-object v1, p0, Landroidx/appcompat/widget/SearchView;->PlaybackStateCompat:Landroid/content/Intent;

    invoke-direct {p0, v1, v0}, Landroidx/appcompat/widget/SearchView;->AudioAttributesCompatParcelizer(Landroid/content/Intent;Landroid/app/SearchableInfo;)Landroid/content/Intent;

    move-result-object v0

    .line 1265
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p0

    invoke-virtual {p0, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_2b
    .catch Landroid/content/ActivityNotFoundException; {:try_start_4 .. :try_end_2b} :catch_2c

    nop

    :catch_2c
    :cond_2c
    return-void
.end method

.method public final RemoteActionCompatParcelizer()I
    .registers 1

    .line 401
    iget p0, p0, Landroidx/appcompat/widget/SearchView;->onSetCaptioningEnabled:I

    return p0
.end method

.method public clearFocus()V
    .registers 3

    const/4 v0, 0x1

    .line 505
    iput-boolean v0, p0, Landroidx/appcompat/widget/SearchView;->AudioAttributesImplApi21Parcelizer:Z

    .line 506
    invoke-super {p0}, Landroidx/appcompat/widget/LinearLayoutCompat;->clearFocus()V

    .line 507
    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v0}, Landroid/view/View;->clearFocus()V

    .line 508
    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->write(Z)V

    .line 509
    iput-boolean v1, p0, Landroidx/appcompat/widget/SearchView;->AudioAttributesImplApi21Parcelizer:Z

    return-void
.end method

.method final onAddQueueItem()V
    .registers 3

    .line 961
    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v0}, Landroid/view/View;->hasFocus()Z

    move-result v0

    if-eqz v0, :cond_b

    .line 962
    sget-object v0, Landroidx/appcompat/widget/SearchView;->FOCUSED_STATE_SET:[I

    goto :goto_d

    :cond_b
    sget-object v0, Landroidx/appcompat/widget/SearchView;->EMPTY_STATE_SET:[I

    .line 963
    :goto_d
    iget-object v1, p0, Landroidx/appcompat/widget/SearchView;->onSeekTo:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-eqz v1, :cond_18

    .line 965
    invoke-virtual {v1, v0}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    .line 967
    :cond_18
    iget-object v1, p0, Landroidx/appcompat/widget/SearchView;->onSetShuffleMode:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-eqz v1, :cond_23

    .line 969
    invoke-virtual {v1, v0}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    .line 971
    :cond_23
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method protected onDetachedFromWindow()V
    .registers 2

    .line 976
    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->MediaSessionCompatToken:Ljava/lang/Runnable;

    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 977
    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->onRemoveQueueItem:Ljava/lang/Runnable;

    invoke-virtual {p0, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 978
    invoke-super {p0}, Landroidx/appcompat/widget/LinearLayoutCompat;->onDetachedFromWindow()V

    return-void
.end method

.method protected onLayout(ZIIII)V
    .registers 6

    .line 843
    invoke-super/range {p0 .. p5}, Landroidx/appcompat/widget/LinearLayoutCompat;->onLayout(ZIIII)V

    if-eqz p1, :cond_37

    .line 848
    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    iget-object p2, p0, Landroidx/appcompat/widget/SearchView;->onRewind:Landroid/graphics/Rect;

    invoke-direct {p0, p1, p2}, Landroidx/appcompat/widget/SearchView;->RemoteActionCompatParcelizer(Landroid/view/View;Landroid/graphics/Rect;)V

    .line 849
    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->onSetPlaybackSpeed:Landroid/graphics/Rect;

    iget-object p2, p0, Landroidx/appcompat/widget/SearchView;->onRewind:Landroid/graphics/Rect;

    iget p2, p2, Landroid/graphics/Rect;->left:I

    iget-object p4, p0, Landroidx/appcompat/widget/SearchView;->onRewind:Landroid/graphics/Rect;

    iget p4, p4, Landroid/graphics/Rect;->right:I

    sub-int/2addr p5, p3

    const/4 p3, 0x0

    invoke-virtual {p1, p2, p3, p4, p5}, Landroid/graphics/Rect;->set(IIII)V

    .line 851
    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->setSessionImpl:Landroidx/appcompat/widget/SearchView$read;

    if-nez p1, :cond_30

    .line 852
    new-instance p1, Landroidx/appcompat/widget/SearchView$read;

    iget-object p2, p0, Landroidx/appcompat/widget/SearchView;->onSetPlaybackSpeed:Landroid/graphics/Rect;

    iget-object p3, p0, Landroidx/appcompat/widget/SearchView;->onRewind:Landroid/graphics/Rect;

    iget-object p4, p0, Landroidx/appcompat/widget/SearchView;->AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-direct {p1, p2, p3, p4}, Landroidx/appcompat/widget/SearchView$read;-><init>(Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/view/View;)V

    iput-object p1, p0, Landroidx/appcompat/widget/SearchView;->setSessionImpl:Landroidx/appcompat/widget/SearchView$read;

    .line 854
    invoke-virtual {p0, p1}, Landroid/view/View;->setTouchDelegate(Landroid/view/TouchDelegate;)V

    return-void

    .line 856
    :cond_30
    iget-object p2, p0, Landroidx/appcompat/widget/SearchView;->onSetPlaybackSpeed:Landroid/graphics/Rect;

    iget-object p0, p0, Landroidx/appcompat/widget/SearchView;->onRewind:Landroid/graphics/Rect;

    invoke-virtual {p1, p2, p0}, Landroidx/appcompat/widget/SearchView$read;->AudioAttributesCompatParcelizer(Landroid/graphics/Rect;Landroid/graphics/Rect;)V

    :cond_37
    return-void
.end method

.method protected onMeasure(II)V
    .registers 6

    .line 794
    invoke-direct {p0}, Landroidx/appcompat/widget/SearchView;->onPlayFromSearch()Z

    move-result v0

    if-eqz v0, :cond_a

    .line 795
    invoke-super {p0, p1, p2}, Landroidx/appcompat/widget/LinearLayoutCompat;->onMeasure(II)V

    return-void

    .line 799
    :cond_a
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    .line 800
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    const/high16 v1, -0x80000000

    const/high16 v2, 0x40000000    # 2.0f

    if-eq v0, v1, :cond_2f

    if-eqz v0, :cond_26

    if-eq v0, v2, :cond_1d

    goto :goto_40

    .line 813
    :cond_1d
    iget v0, p0, Landroidx/appcompat/widget/SearchView;->handleMediaPlayPauseIfPendingOnHandler:I

    if-lez v0, :cond_40

    .line 814
    invoke-static {v0, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    goto :goto_40

    .line 819
    :cond_26
    iget p1, p0, Landroidx/appcompat/widget/SearchView;->handleMediaPlayPauseIfPendingOnHandler:I

    if-gtz p1, :cond_40

    invoke-direct {p0}, Landroidx/appcompat/widget/SearchView;->onCustomAction()I

    move-result p1

    goto :goto_40

    .line 805
    :cond_2f
    iget v0, p0, Landroidx/appcompat/widget/SearchView;->handleMediaPlayPauseIfPendingOnHandler:I

    if-lez v0, :cond_38

    .line 806
    invoke-static {v0, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    goto :goto_40

    .line 808
    :cond_38
    invoke-direct {p0}, Landroidx/appcompat/widget/SearchView;->onCustomAction()I

    move-result v0

    invoke-static {v0, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    .line 824
    :cond_40
    :goto_40
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    .line 825
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p2

    if-eq v0, v1, :cond_51

    if-nez v0, :cond_59

    .line 832
    invoke-direct {p0}, Landroidx/appcompat/widget/SearchView;->onCommand()I

    move-result p2

    goto :goto_59

    .line 829
    :cond_51
    invoke-direct {p0}, Landroidx/appcompat/widget/SearchView;->onCommand()I

    move-result v0

    invoke-static {v0, p2}, Ljava/lang/Math;->min(II)I

    move-result p2

    .line 837
    :cond_59
    :goto_59
    invoke-static {p1, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p1

    .line 838
    invoke-static {p2, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p2

    .line 837
    invoke-super {p0, p1, p2}, Landroidx/appcompat/widget/LinearLayoutCompat;->onMeasure(II)V

    return-void
.end method

.method protected onRestoreInstanceState(Landroid/os/Parcelable;)V
    .registers 3

    .line 1370
    instance-of v0, p1, Landroidx/appcompat/widget/SearchView$SavedState;

    if-nez v0, :cond_8

    .line 1371
    invoke-super {p0, p1}, Landroidx/appcompat/widget/LinearLayoutCompat;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    return-void

    .line 1374
    :cond_8
    check-cast p1, Landroidx/appcompat/widget/SearchView$SavedState;

    .line 1375
    invoke-virtual {p1}, Landroidx/customview/view/AbsSavedState;->read()Landroid/os/Parcelable;

    move-result-object v0

    invoke-super {p0, v0}, Landroidx/appcompat/widget/LinearLayoutCompat;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 1376
    iget-boolean p1, p1, Landroidx/appcompat/widget/SearchView$SavedState;->read:Z

    invoke-direct {p0, p1}, Landroidx/appcompat/widget/SearchView;->AudioAttributesCompatParcelizer(Z)V

    .line 1377
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method protected onSaveInstanceState()Landroid/os/Parcelable;
    .registers 3

    .line 1362
    invoke-super {p0}, Landroidx/appcompat/widget/LinearLayoutCompat;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v0

    .line 1363
    new-instance v1, Landroidx/appcompat/widget/SearchView$SavedState;

    invoke-direct {v1, v0}, Landroidx/appcompat/widget/SearchView$SavedState;-><init>(Landroid/os/Parcelable;)V

    .line 1364
    invoke-direct {p0}, Landroidx/appcompat/widget/SearchView;->onPlayFromSearch()Z

    move-result p0

    iput-boolean p0, v1, Landroidx/appcompat/widget/SearchView$SavedState;->read:Z

    return-object v1
.end method

.method public onWindowFocusChanged(Z)V
    .registers 2

    .line 1286
    invoke-super {p0, p1}, Landroidx/appcompat/widget/LinearLayoutCompat;->onWindowFocusChanged(Z)V

    .line 1288
    invoke-direct {p0}, Landroidx/appcompat/widget/SearchView;->onMediaButtonEvent()V

    return-void
.end method

.method final read()V
    .registers 1

    .line 1715
    iget-object p0, p0, Landroidx/appcompat/widget/SearchView;->AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-static {p0}, Landroidx/appcompat/widget/SearchView$RemoteActionCompatParcelizer;->AudioAttributesCompatParcelizer(Landroid/widget/AutoCompleteTextView;)V

    return-void
.end method

.method final read(I)Z
    .registers 4

    .line 1405
    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->onPrepareFromMediaId:Landroidx/appcompat/widget/SearchView$AudioAttributesCompatParcelizer;

    const/4 v1, 0x0

    if-eqz v0, :cond_c

    .line 1406
    invoke-interface {v0}, Landroidx/appcompat/widget/SearchView$AudioAttributesCompatParcelizer;->write()Z

    move-result v0

    if-eqz v0, :cond_c

    return v1

    .line 1407
    :cond_c
    invoke-direct {p0, p1}, Landroidx/appcompat/widget/SearchView;->MediaBrowserCompatItemReceiver(I)Z

    .line 1408
    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {p1, v1}, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->write(Z)V

    .line 1409
    invoke-direct {p0}, Landroidx/appcompat/widget/SearchView;->handleMediaPlayPauseIfPendingOnHandler()V

    const/4 p0, 0x1

    return p0
.end method

.method public requestFocus(ILandroid/graphics/Rect;)Z
    .registers 5

    .line 488
    iget-boolean v0, p0, Landroidx/appcompat/widget/SearchView;->AudioAttributesImplApi21Parcelizer:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_6

    return v1

    .line 490
    :cond_6
    invoke-virtual {p0}, Landroid/view/View;->isFocusable()Z

    move-result v0

    if-nez v0, :cond_d

    return v1

    .line 492
    :cond_d
    invoke-direct {p0}, Landroidx/appcompat/widget/SearchView;->onPlayFromSearch()Z

    move-result v0

    if-nez v0, :cond_1f

    .line 493
    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v0, p1, p2}, Landroid/view/View;->requestFocus(ILandroid/graphics/Rect;)Z

    move-result p1

    if-eqz p1, :cond_1e

    .line 495
    invoke-direct {p0, v1}, Landroidx/appcompat/widget/SearchView;->AudioAttributesCompatParcelizer(Z)V

    :cond_1e
    return p1

    .line 499
    :cond_1f
    invoke-super {p0, p1, p2}, Landroidx/appcompat/widget/LinearLayoutCompat;->requestFocus(ILandroid/graphics/Rect;)Z

    move-result p0

    return p0
.end method

.method public setAppSearchData(Landroid/os/Bundle;)V
    .registers 2

    .line 436
    iput-object p1, p0, Landroidx/appcompat/widget/SearchView;->MediaBrowserCompatCustomActionResultReceiver:Landroid/os/Bundle;

    return-void
.end method

.method public setIconified(Z)V
    .registers 2

    if-eqz p1, :cond_6

    .line 680
    invoke-virtual {p0}, Landroidx/appcompat/widget/SearchView;->AudioAttributesImplBaseParcelizer()V

    return-void

    .line 682
    :cond_6
    invoke-virtual {p0}, Landroidx/appcompat/widget/SearchView;->AudioAttributesImplApi26Parcelizer()V

    return-void
.end method

.method public setIconifiedByDefault(Z)V
    .registers 3

    .line 651
    iget-boolean v0, p0, Landroidx/appcompat/widget/SearchView;->onCommand:Z

    if-ne v0, p1, :cond_5

    return-void

    .line 652
    :cond_5
    iput-boolean p1, p0, Landroidx/appcompat/widget/SearchView;->onCommand:Z

    .line 653
    invoke-direct {p0, p1}, Landroidx/appcompat/widget/SearchView;->AudioAttributesCompatParcelizer(Z)V

    .line 654
    invoke-direct {p0}, Landroidx/appcompat/widget/SearchView;->onFastForward()V

    return-void
.end method

.method public setImeOptions(I)V
    .registers 2

    .line 448
    iget-object p0, p0, Landroidx/appcompat/widget/SearchView;->AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setImeOptions(I)V

    return-void
.end method

.method public setInputType(I)V
    .registers 2

    .line 472
    iget-object p0, p0, Landroidx/appcompat/widget/SearchView;->AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setInputType(I)V

    return-void
.end method

.method public setMaxWidth(I)V
    .registers 2

    .line 774
    iput p1, p0, Landroidx/appcompat/widget/SearchView;->handleMediaPlayPauseIfPendingOnHandler:I

    .line 776
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public setOnCloseListener(Landroidx/appcompat/widget/SearchView$write;)V
    .registers 2

    .line 528
    iput-object p1, p0, Landroidx/appcompat/widget/SearchView;->onFastForward:Landroidx/appcompat/widget/SearchView$write;

    return-void
.end method

.method public setOnQueryTextFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V
    .registers 2

    .line 537
    iput-object p1, p0, Landroidx/appcompat/widget/SearchView;->IconCompatParcelizer:Landroid/view/View$OnFocusChangeListener;

    return-void
.end method

.method public setOnQueryTextListener(Landroidx/appcompat/widget/SearchView$IconCompatParcelizer;)V
    .registers 2

    .line 519
    iput-object p1, p0, Landroidx/appcompat/widget/SearchView;->onMediaButtonEvent:Landroidx/appcompat/widget/SearchView$IconCompatParcelizer;

    return-void
.end method

.method public setOnSearchClickListener(Landroid/view/View$OnClickListener;)V
    .registers 2

    .line 558
    iput-object p1, p0, Landroidx/appcompat/widget/SearchView;->onPlayFromUri:Landroid/view/View$OnClickListener;

    return-void
.end method

.method public setOnSuggestionListener(Landroidx/appcompat/widget/SearchView$AudioAttributesCompatParcelizer;)V
    .registers 2

    .line 546
    iput-object p1, p0, Landroidx/appcompat/widget/SearchView;->onPrepareFromMediaId:Landroidx/appcompat/widget/SearchView$AudioAttributesCompatParcelizer;

    return-void
.end method

.method public setQuery(Ljava/lang/CharSequence;Z)V
    .registers 5

    .line 579
    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    if-eqz p1, :cond_12

    .line 581
    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v0}, Landroid/widget/TextView;->length()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setSelection(I)V

    .line 582
    iput-object p1, p0, Landroidx/appcompat/widget/SearchView;->MediaSessionCompatQueueItem:Ljava/lang/CharSequence;

    :cond_12
    if-eqz p2, :cond_1d

    .line 586
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_1d

    .line 587
    invoke-virtual {p0}, Landroidx/appcompat/widget/SearchView;->AudioAttributesImplApi21Parcelizer()V

    :cond_1d
    return-void
.end method

.method public setQueryHint(Ljava/lang/CharSequence;)V
    .registers 2

    .line 602
    iput-object p1, p0, Landroidx/appcompat/widget/SearchView;->onPlayFromSearch:Ljava/lang/CharSequence;

    .line 603
    invoke-direct {p0}, Landroidx/appcompat/widget/SearchView;->onFastForward()V

    return-void
.end method

.method public setQueryRefinementEnabled(Z)V
    .registers 3

    .line 733
    iput-boolean p1, p0, Landroidx/appcompat/widget/SearchView;->onPrepareFromSearch:Z

    .line 734
    iget-object p0, p0, Landroidx/appcompat/widget/SearchView;->MediaBrowserCompatItemReceiver:Lo/_addSuperInterfaces;

    instance-of v0, p0, Lo/setHasDecor;

    if-eqz v0, :cond_12

    .line 735
    check-cast p0, Lo/setHasDecor;

    if-eqz p1, :cond_e

    const/4 p1, 0x2

    goto :goto_f

    :cond_e
    const/4 p1, 0x1

    :goto_f
    invoke-virtual {p0, p1}, Lo/setHasDecor;->AudioAttributesCompatParcelizer(I)V

    :cond_12
    return-void
.end method

.method public setSearchableInfo(Landroid/app/SearchableInfo;)V
    .registers 3

    .line 413
    iput-object p1, p0, Landroidx/appcompat/widget/SearchView;->AudioAttributesImplBaseParcelizer:Landroid/app/SearchableInfo;

    if-eqz p1, :cond_a

    .line 415
    invoke-direct {p0}, Landroidx/appcompat/widget/SearchView;->onPause()V

    .line 416
    invoke-direct {p0}, Landroidx/appcompat/widget/SearchView;->onFastForward()V

    .line 419
    :cond_a
    invoke-direct {p0}, Landroidx/appcompat/widget/SearchView;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()Z

    move-result p1

    iput-boolean p1, p0, Landroidx/appcompat/widget/SearchView;->MediaSessionCompatResultReceiverWrapper:Z

    if-eqz p1, :cond_19

    .line 424
    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    const-string v0, "nm"

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setPrivateImeOptions(Ljava/lang/String;)V

    .line 426
    :cond_19
    invoke-direct {p0}, Landroidx/appcompat/widget/SearchView;->onPlayFromSearch()Z

    move-result p1

    invoke-direct {p0, p1}, Landroidx/appcompat/widget/SearchView;->AudioAttributesCompatParcelizer(Z)V

    return-void
.end method

.method public setSubmitButtonEnabled(Z)V
    .registers 2

    .line 705
    iput-boolean p1, p0, Landroidx/appcompat/widget/SearchView;->onSetRating:Z

    .line 706
    invoke-direct {p0}, Landroidx/appcompat/widget/SearchView;->onPlayFromSearch()Z

    move-result p1

    invoke-direct {p0, p1}, Landroidx/appcompat/widget/SearchView;->AudioAttributesCompatParcelizer(Z)V

    return-void
.end method

.method public setSuggestionsAdapter(Lo/_addSuperInterfaces;)V
    .registers 2

    .line 755
    iput-object p1, p0, Landroidx/appcompat/widget/SearchView;->MediaBrowserCompatItemReceiver:Lo/_addSuperInterfaces;

    .line 757
    iget-object p0, p0, Landroidx/appcompat/widget/SearchView;->AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {p0, p1}, Landroid/widget/AutoCompleteTextView;->setAdapter(Landroid/widget/ListAdapter;)V

    return-void
.end method

.method public final write()V
    .registers 4

    .line 1296
    const-string v0, ""

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroidx/appcompat/widget/SearchView;->setQuery(Ljava/lang/CharSequence;Z)V

    .line 1297
    invoke-virtual {p0}, Landroid/view/View;->clearFocus()V

    const/4 v0, 0x1

    .line 1298
    invoke-direct {p0, v0}, Landroidx/appcompat/widget/SearchView;->AudioAttributesCompatParcelizer(Z)V

    .line 1299
    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    iget v2, p0, Landroidx/appcompat/widget/SearchView;->MediaBrowserCompatSearchResultReceiver:I

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setImeOptions(I)V

    .line 1300
    iput-boolean v1, p0, Landroidx/appcompat/widget/SearchView;->MediaBrowserCompatMediaItem:Z

    return-void
.end method

.method final write(Ljava/lang/CharSequence;)V
    .registers 4

    .line 1191
    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    .line 1192
    iput-object v0, p0, Landroidx/appcompat/widget/SearchView;->MediaSessionCompatQueueItem:Ljava/lang/CharSequence;

    .line 1193
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    xor-int/lit8 v1, v0, 0x1

    .line 1194
    invoke-direct {p0, v1}, Landroidx/appcompat/widget/SearchView;->IconCompatParcelizer(Z)V

    .line 1195
    invoke-direct {p0, v0}, Landroidx/appcompat/widget/SearchView;->RemoteActionCompatParcelizer(Z)V

    .line 1196
    invoke-direct {p0}, Landroidx/appcompat/widget/SearchView;->onPlayFromMediaId()V

    .line 1197
    invoke-direct {p0}, Landroidx/appcompat/widget/SearchView;->onPrepareFromSearch()V

    .line 1198
    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->onMediaButtonEvent:Landroidx/appcompat/widget/SearchView$IconCompatParcelizer;

    if-eqz v0, :cond_23

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->onAddQueueItem:Ljava/lang/CharSequence;

    invoke-static {p1, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 1201
    :cond_23
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Landroidx/appcompat/widget/SearchView;->onAddQueueItem:Ljava/lang/CharSequence;

    return-void
.end method

.method final write(Ljava/lang/String;)V
    .registers 9

    .line 1534
    const-string v1, "android.intent.action.SEARCH"

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    move-object v4, p1

    invoke-direct/range {v0 .. v6}, Landroidx/appcompat/widget/SearchView;->IconCompatParcelizer(Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Landroid/content/Intent;

    move-result-object p1

    .line 1535
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p0

    invoke-virtual {p0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method final write(I)Z
    .registers 3

    .line 1416
    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->onPrepareFromMediaId:Landroidx/appcompat/widget/SearchView$AudioAttributesCompatParcelizer;

    if-eqz v0, :cond_c

    .line 1417
    invoke-interface {v0}, Landroidx/appcompat/widget/SearchView$AudioAttributesCompatParcelizer;->RemoteActionCompatParcelizer()Z

    move-result v0

    if-eqz v0, :cond_c

    const/4 p0, 0x0

    return p0

    .line 1418
    :cond_c
    invoke-direct {p0, p1}, Landroidx/appcompat/widget/SearchView;->MediaBrowserCompatCustomActionResultReceiver(I)V

    const/4 p0, 0x1

    return p0
.end method

.method final write(ILandroid/view/KeyEvent;)Z
    .registers 5

    .line 1060
    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->AudioAttributesImplBaseParcelizer:Landroid/app/SearchableInfo;

    const/4 v1, 0x0

    if-nez v0, :cond_6

    return v1

    .line 1063
    :cond_6
    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->MediaBrowserCompatItemReceiver:Lo/_addSuperInterfaces;

    if-nez v0, :cond_b

    return v1

    .line 1066
    :cond_b
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getAction()I

    move-result v0

    if-nez v0, :cond_60

    invoke-virtual {p2}, Landroid/view/KeyEvent;->hasNoModifiers()Z

    move-result p2

    if-eqz p2, :cond_60

    const/16 p2, 0x42

    if-eq p1, p2, :cond_55

    const/16 p2, 0x54

    if-eq p1, p2, :cond_55

    const/16 p2, 0x3d

    if-eq p1, p2, :cond_55

    const/16 p2, 0x15

    if-eq p1, p2, :cond_35

    const/16 v0, 0x16

    if-eq p1, v0, :cond_35

    const/16 p2, 0x13

    if-ne p1, p2, :cond_60

    .line 1093
    iget-object p0, p0, Landroidx/appcompat/widget/SearchView;->AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {p0}, Landroid/widget/AutoCompleteTextView;->getListSelection()I

    return v1

    :cond_35
    if-ne p1, p2, :cond_39

    move p1, v1

    goto :goto_3f

    .line 1083
    :cond_39
    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {p1}, Landroid/widget/TextView;->length()I

    move-result p1

    .line 1084
    :goto_3f
    iget-object p2, p0, Landroidx/appcompat/widget/SearchView;->AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {p2, p1}, Landroid/widget/EditText;->setSelection(I)V

    .line 1085
    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {p1, v1}, Landroid/widget/AutoCompleteTextView;->setListSelection(I)V

    .line 1086
    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {p1}, Landroid/widget/AutoCompleteTextView;->clearListSelection()V

    .line 1087
    iget-object p0, p0, Landroidx/appcompat/widget/SearchView;->AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {p0}, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->write()V

    const/4 p0, 0x1

    return p0

    .line 1071
    :cond_55
    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {p1}, Landroid/widget/AutoCompleteTextView;->getListSelection()I

    move-result p1

    .line 1072
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/SearchView;->read(I)Z

    move-result p0

    return p0

    :cond_60
    return v1
.end method

###### Class androidx.appcompat.widget.SearchView.AnonymousClass1 (androidx.appcompat.widget.SearchView$1)
.class final Landroidx/appcompat/widget/SearchView$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnLayoutChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/appcompat/widget/SearchView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic read:Landroidx/appcompat/widget/SearchView;


# direct methods
.method constructor <init>(Landroidx/appcompat/widget/SearchView;)V
    .registers 2

    .line 383
    iput-object p1, p0, Landroidx/appcompat/widget/SearchView$1;->read:Landroidx/appcompat/widget/SearchView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onLayoutChange(Landroid/view/View;IIIIIIII)V
    .registers 10

    .line 387
    iget-object p0, p0, Landroidx/appcompat/widget/SearchView$1;->read:Landroidx/appcompat/widget/SearchView;

    invoke-virtual {p0}, Landroidx/appcompat/widget/SearchView;->AudioAttributesCompatParcelizer()V

    return-void
.end method

###### Class androidx.appcompat.widget.SearchView.AnonymousClass10 (androidx.appcompat.widget.SearchView$10)
.class final Landroidx/appcompat/widget/SearchView$10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnKeyListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/widget/SearchView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic read:Landroidx/appcompat/widget/SearchView;


# direct methods
.method constructor <init>(Landroidx/appcompat/widget/SearchView;)V
    .registers 2

    .line 1015
    iput-object p1, p0, Landroidx/appcompat/widget/SearchView$10;->read:Landroidx/appcompat/widget/SearchView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onKey(Landroid/view/View;ILandroid/view/KeyEvent;)Z
    .registers 7

    .line 1019
    iget-object v0, p0, Landroidx/appcompat/widget/SearchView$10;->read:Landroidx/appcompat/widget/SearchView;

    iget-object v0, v0, Landroidx/appcompat/widget/SearchView;->AudioAttributesImplBaseParcelizer:Landroid/app/SearchableInfo;

    const/4 v1, 0x0

    if-nez v0, :cond_8

    return v1

    .line 1030
    :cond_8
    iget-object v0, p0, Landroidx/appcompat/widget/SearchView$10;->read:Landroidx/appcompat/widget/SearchView;

    iget-object v0, v0, Landroidx/appcompat/widget/SearchView;->AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v0}, Landroid/widget/AutoCompleteTextView;->isPopupShowing()Z

    move-result v0

    if-eqz v0, :cond_24

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView$10;->read:Landroidx/appcompat/widget/SearchView;

    iget-object v0, v0, Landroidx/appcompat/widget/SearchView;->AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    .line 1031
    invoke-virtual {v0}, Landroid/widget/AutoCompleteTextView;->getListSelection()I

    move-result v0

    const/4 v2, -0x1

    if-eq v0, v2, :cond_24

    .line 1032
    iget-object p0, p0, Landroidx/appcompat/widget/SearchView$10;->read:Landroidx/appcompat/widget/SearchView;

    invoke-virtual {p0, p2, p3}, Landroidx/appcompat/widget/SearchView;->write(ILandroid/view/KeyEvent;)Z

    move-result p0

    return p0

    .line 1037
    :cond_24
    iget-object v0, p0, Landroidx/appcompat/widget/SearchView$10;->read:Landroidx/appcompat/widget/SearchView;

    iget-object v0, v0, Landroidx/appcompat/widget/SearchView;->AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v0}, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->read()Z

    move-result v0

    if-nez v0, :cond_52

    invoke-virtual {p3}, Landroid/view/KeyEvent;->hasNoModifiers()Z

    move-result v0

    if-eqz v0, :cond_52

    .line 1038
    invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I

    move-result p3

    const/4 v0, 0x1

    if-ne p3, v0, :cond_52

    const/16 p3, 0x42

    if-ne p2, p3, :cond_52

    .line 1040
    invoke-virtual {p1}, Landroid/view/View;->cancelLongPress()V

    .line 1043
    iget-object p0, p0, Landroidx/appcompat/widget/SearchView$10;->read:Landroidx/appcompat/widget/SearchView;

    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p1

    .line 1044
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    .line 1043
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/SearchView;->write(Ljava/lang/String;)V

    return v0

    :cond_52
    return v1
.end method

###### Class androidx.appcompat.widget.SearchView.AnonymousClass2 (androidx.appcompat.widget.SearchView$2)
.class final Landroidx/appcompat/widget/SearchView$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/widget/SearchView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic RemoteActionCompatParcelizer:Landroidx/appcompat/widget/SearchView;


# direct methods
.method constructor <init>(Landroidx/appcompat/widget/SearchView;)V
    .registers 2

    .line 183
    iput-object p1, p0, Landroidx/appcompat/widget/SearchView$2;->RemoteActionCompatParcelizer:Landroidx/appcompat/widget/SearchView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 1

    .line 186
    iget-object p0, p0, Landroidx/appcompat/widget/SearchView$2;->RemoteActionCompatParcelizer:Landroidx/appcompat/widget/SearchView;

    invoke-virtual {p0}, Landroidx/appcompat/widget/SearchView;->onAddQueueItem()V

    return-void
.end method

###### Class androidx.appcompat.widget.SearchView.AnonymousClass3 (androidx.appcompat.widget.SearchView$3)
.class final Landroidx/appcompat/widget/SearchView$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/text/TextWatcher;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/widget/SearchView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic write:Landroidx/appcompat/widget/SearchView;


# direct methods
.method constructor <init>(Landroidx/appcompat/widget/SearchView;)V
    .registers 2

    .line 1730
    iput-object p1, p0, Landroidx/appcompat/widget/SearchView$3;->write:Landroidx/appcompat/widget/SearchView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final afterTextChanged(Landroid/text/Editable;)V
    .registers 2

    return-void
.end method

.method public final beforeTextChanged(Ljava/lang/CharSequence;III)V
    .registers 5

    return-void
.end method

.method public final onTextChanged(Ljava/lang/CharSequence;III)V
    .registers 5

    .line 1737
    iget-object p0, p0, Landroidx/appcompat/widget/SearchView$3;->write:Landroidx/appcompat/widget/SearchView;

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/SearchView;->write(Ljava/lang/CharSequence;)V

    return-void
.end method

###### Class androidx.appcompat.widget.SearchView.AnonymousClass4 (androidx.appcompat.widget.SearchView$4)
.class final Landroidx/appcompat/widget/SearchView$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/widget/SearchView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic RemoteActionCompatParcelizer:Landroidx/appcompat/widget/SearchView;


# direct methods
.method constructor <init>(Landroidx/appcompat/widget/SearchView;)V
    .registers 2

    .line 190
    iput-object p1, p0, Landroidx/appcompat/widget/SearchView$4;->RemoteActionCompatParcelizer:Landroidx/appcompat/widget/SearchView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 2

    .line 193
    iget-object v0, p0, Landroidx/appcompat/widget/SearchView$4;->RemoteActionCompatParcelizer:Landroidx/appcompat/widget/SearchView;

    iget-object v0, v0, Landroidx/appcompat/widget/SearchView;->MediaBrowserCompatItemReceiver:Lo/_addSuperInterfaces;

    instance-of v0, v0, Lo/setHasDecor;

    if-eqz v0, :cond_10

    .line 194
    iget-object p0, p0, Landroidx/appcompat/widget/SearchView$4;->RemoteActionCompatParcelizer:Landroidx/appcompat/widget/SearchView;

    iget-object p0, p0, Landroidx/appcompat/widget/SearchView;->MediaBrowserCompatItemReceiver:Lo/_addSuperInterfaces;

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/_addSuperInterfaces;->read(Landroid/database/Cursor;)V

    :cond_10
    return-void
.end method

###### Class androidx.appcompat.widget.SearchView.AnonymousClass5 (androidx.appcompat.widget.SearchView$5)
.class final Landroidx/appcompat/widget/SearchView$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnFocusChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/appcompat/widget/SearchView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic write:Landroidx/appcompat/widget/SearchView;


# direct methods
.method constructor <init>(Landroidx/appcompat/widget/SearchView;)V
    .registers 2

    .line 338
    iput-object p1, p0, Landroidx/appcompat/widget/SearchView$5;->write:Landroidx/appcompat/widget/SearchView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onFocusChange(Landroid/view/View;Z)V
    .registers 3

    .line 341
    iget-object p1, p0, Landroidx/appcompat/widget/SearchView$5;->write:Landroidx/appcompat/widget/SearchView;

    iget-object p1, p1, Landroidx/appcompat/widget/SearchView;->IconCompatParcelizer:Landroid/view/View$OnFocusChangeListener;

    if-eqz p1, :cond_f

    .line 342
    iget-object p1, p0, Landroidx/appcompat/widget/SearchView$5;->write:Landroidx/appcompat/widget/SearchView;

    iget-object p1, p1, Landroidx/appcompat/widget/SearchView;->IconCompatParcelizer:Landroid/view/View$OnFocusChangeListener;

    iget-object p0, p0, Landroidx/appcompat/widget/SearchView$5;->write:Landroidx/appcompat/widget/SearchView;

    invoke-interface {p1, p0, p2}, Landroid/view/View$OnFocusChangeListener;->onFocusChange(Landroid/view/View;Z)V

    :cond_f
    return-void
.end method

###### Class androidx.appcompat.widget.SearchView.AnonymousClass6 (androidx.appcompat.widget.SearchView$6)
.class final Landroidx/appcompat/widget/SearchView$6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemSelectedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/widget/SearchView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/SearchView;


# direct methods
.method constructor <init>(Landroidx/appcompat/widget/SearchView;)V
    .registers 2

    .line 1436
    iput-object p1, p0, Landroidx/appcompat/widget/SearchView$6;->AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/SearchView;

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

    .line 1444
    iget-object p0, p0, Landroidx/appcompat/widget/SearchView$6;->AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/SearchView;

    invoke-virtual {p0, p3}, Landroidx/appcompat/widget/SearchView;->write(I)Z

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

###### Class androidx.appcompat.widget.SearchView.AnonymousClass7 (androidx.appcompat.widget.SearchView$7)
.class final Landroidx/appcompat/widget/SearchView$7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/widget/SearchView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/SearchView;


# direct methods
.method constructor <init>(Landroidx/appcompat/widget/SearchView;)V
    .registers 2

    .line 993
    iput-object p1, p0, Landroidx/appcompat/widget/SearchView$7;->AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/SearchView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .registers 3

    .line 996
    iget-object v0, p0, Landroidx/appcompat/widget/SearchView$7;->AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/SearchView;

    iget-object v0, v0, Landroidx/appcompat/widget/SearchView;->RemoteActionCompatParcelizer:Landroid/widget/ImageView;

    if-ne p1, v0, :cond_c

    .line 997
    iget-object p0, p0, Landroidx/appcompat/widget/SearchView$7;->AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/SearchView;

    invoke-virtual {p0}, Landroidx/appcompat/widget/SearchView;->AudioAttributesImplApi26Parcelizer()V

    return-void

    .line 998
    :cond_c
    iget-object v0, p0, Landroidx/appcompat/widget/SearchView$7;->AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/SearchView;

    iget-object v0, v0, Landroidx/appcompat/widget/SearchView;->write:Landroid/widget/ImageView;

    if-ne p1, v0, :cond_18

    .line 999
    iget-object p0, p0, Landroidx/appcompat/widget/SearchView$7;->AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/SearchView;

    invoke-virtual {p0}, Landroidx/appcompat/widget/SearchView;->AudioAttributesImplBaseParcelizer()V

    return-void

    .line 1000
    :cond_18
    iget-object v0, p0, Landroidx/appcompat/widget/SearchView$7;->AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/SearchView;

    iget-object v0, v0, Landroidx/appcompat/widget/SearchView;->read:Landroid/widget/ImageView;

    if-ne p1, v0, :cond_24

    .line 1001
    iget-object p0, p0, Landroidx/appcompat/widget/SearchView$7;->AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/SearchView;

    invoke-virtual {p0}, Landroidx/appcompat/widget/SearchView;->AudioAttributesImplApi21Parcelizer()V

    return-void

    .line 1002
    :cond_24
    iget-object v0, p0, Landroidx/appcompat/widget/SearchView$7;->AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/SearchView;

    iget-object v0, v0, Landroidx/appcompat/widget/SearchView;->AudioAttributesImplApi26Parcelizer:Landroid/widget/ImageView;

    if-ne p1, v0, :cond_30

    .line 1003
    iget-object p0, p0, Landroidx/appcompat/widget/SearchView$7;->AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/SearchView;

    invoke-virtual {p0}, Landroidx/appcompat/widget/SearchView;->MediaBrowserCompatMediaItem()V

    return-void

    .line 1004
    :cond_30
    iget-object v0, p0, Landroidx/appcompat/widget/SearchView$7;->AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/SearchView;

    iget-object v0, v0, Landroidx/appcompat/widget/SearchView;->AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    if-ne p1, v0, :cond_3b

    .line 1005
    iget-object p0, p0, Landroidx/appcompat/widget/SearchView$7;->AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/SearchView;

    invoke-virtual {p0}, Landroidx/appcompat/widget/SearchView;->read()V

    :cond_3b
    return-void
.end method

###### Class androidx.appcompat.widget.SearchView.AnonymousClass8 (androidx.appcompat.widget.SearchView$8)
.class final Landroidx/appcompat/widget/SearchView$8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/widget/SearchView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic read:Landroidx/appcompat/widget/SearchView;


# direct methods
.method constructor <init>(Landroidx/appcompat/widget/SearchView;)V
    .registers 2

    .line 1424
    iput-object p1, p0, Landroidx/appcompat/widget/SearchView$8;->read:Landroidx/appcompat/widget/SearchView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
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

    .line 1432
    iget-object p0, p0, Landroidx/appcompat/widget/SearchView$8;->read:Landroidx/appcompat/widget/SearchView;

    invoke-virtual {p0, p3}, Landroidx/appcompat/widget/SearchView;->read(I)Z

    return-void
.end method

###### Class androidx.appcompat.widget.SearchView.AnonymousClass9 (androidx.appcompat.widget.SearchView$9)
.class final Landroidx/appcompat/widget/SearchView$9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/TextView$OnEditorActionListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/widget/SearchView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic read:Landroidx/appcompat/widget/SearchView;


# direct methods
.method constructor <init>(Landroidx/appcompat/widget/SearchView;)V
    .registers 2

    .line 1178
    iput-object p1, p0, Landroidx/appcompat/widget/SearchView$9;->read:Landroidx/appcompat/widget/SearchView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onEditorAction(Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z
    .registers 4

    .line 1185
    iget-object p0, p0, Landroidx/appcompat/widget/SearchView$9;->read:Landroidx/appcompat/widget/SearchView;

    invoke-virtual {p0}, Landroidx/appcompat/widget/SearchView;->AudioAttributesImplApi21Parcelizer()V

    const/4 p0, 0x1

    return p0
.end method

###### Class androidx.appcompat.widget.SearchView.AudioAttributesCompatParcelizer (androidx.appcompat.widget.SearchView$AudioAttributesCompatParcelizer)
.class public interface abstract Landroidx/appcompat/widget/SearchView$AudioAttributesCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/widget/SearchView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "AudioAttributesCompatParcelizer"
.end annotation


# virtual methods
.method public abstract RemoteActionCompatParcelizer()Z
.end method

.method public abstract write()Z
.end method

###### Class androidx.appcompat.widget.SearchView.IconCompatParcelizer (androidx.appcompat.widget.SearchView$IconCompatParcelizer)
.class public interface abstract Landroidx/appcompat/widget/SearchView$IconCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/widget/SearchView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "IconCompatParcelizer"
.end annotation


# virtual methods
.method public abstract AudioAttributesCompatParcelizer()Z
.end method

###### Class androidx.appcompat.widget.SearchView.RemoteActionCompatParcelizer (androidx.appcompat.widget.SearchView$RemoteActionCompatParcelizer)
.class Landroidx/appcompat/widget/SearchView$RemoteActionCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/widget/SearchView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "RemoteActionCompatParcelizer"
.end annotation


# direct methods
.method static AudioAttributesCompatParcelizer(Landroid/widget/AutoCompleteTextView;)V
    .registers 1

    .line 2137
    invoke-virtual {p0}, Landroid/widget/AutoCompleteTextView;->refreshAutoCompleteResults()V

    return-void
.end method

.method static RemoteActionCompatParcelizer(Landroidx/appcompat/widget/SearchView$SearchAutoComplete;I)V
    .registers 2

    .line 2132
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->setInputMethodMode(I)V

    return-void
.end method

###### Class androidx.appcompat.widget.SearchView.SavedState (androidx.appcompat.widget.SearchView$SavedState)
.class Landroidx/appcompat/widget/SearchView$SavedState;
.super Landroidx/customview/view/AbsSavedState;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/widget/SearchView;
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
            "Landroidx/appcompat/widget/SearchView$SavedState;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field read:Z


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 1342
    new-instance v0, Landroidx/appcompat/widget/SearchView$SavedState$5;

    invoke-direct {v0}, Landroidx/appcompat/widget/SearchView$SavedState$5;-><init>()V

    sput-object v0, Landroidx/appcompat/widget/SearchView$SavedState;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V
    .registers 3

    .line 1325
    invoke-direct {p0, p1, p2}, Landroidx/customview/view/AbsSavedState;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    const/4 p2, 0x0

    .line 1326
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->readValue(Ljava/lang/ClassLoader;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iput-boolean p1, p0, Landroidx/appcompat/widget/SearchView$SavedState;->read:Z

    return-void
.end method

.method constructor <init>(Landroid/os/Parcelable;)V
    .registers 2

    .line 1321
    invoke-direct {p0, p1}, Landroidx/customview/view/AbsSavedState;-><init>(Landroid/os/Parcelable;)V

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .registers 3

    .line 1337
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "SearchView.SavedState{"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1338
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " isIconified="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean p0, p0, Landroidx/appcompat/widget/SearchView$SavedState;->read:Z

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string p0, "}"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .registers 3

    .line 1331
    invoke-super {p0, p1, p2}, Landroidx/customview/view/AbsSavedState;->writeToParcel(Landroid/os/Parcel;I)V

    .line 1332
    iget-boolean p0, p0, Landroidx/appcompat/widget/SearchView$SavedState;->read:Z

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    invoke-virtual {p1, p0}, Landroid/os/Parcel;->writeValue(Ljava/lang/Object;)V

    return-void
.end method

###### Class androidx.appcompat.widget.SearchView.SavedState.AnonymousClass5 (androidx.appcompat.widget.SearchView$SavedState$5)
.class final Landroidx/appcompat/widget/SearchView$SavedState$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$ClassLoaderCreator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/widget/SearchView$SavedState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$ClassLoaderCreator<",
        "Landroidx/appcompat/widget/SearchView$SavedState;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .registers 1

    .line 1342
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static IconCompatParcelizer(Landroid/os/Parcel;)Landroidx/appcompat/widget/SearchView$SavedState;
    .registers 3

    .line 1350
    new-instance v0, Landroidx/appcompat/widget/SearchView$SavedState;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Landroidx/appcompat/widget/SearchView$SavedState;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0
.end method

.method private static read(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Landroidx/appcompat/widget/SearchView$SavedState;
    .registers 3

    .line 1345
    new-instance v0, Landroidx/appcompat/widget/SearchView$SavedState;

    invoke-direct {v0, p0, p1}, Landroidx/appcompat/widget/SearchView$SavedState;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0
.end method

.method private static write(I)[Landroidx/appcompat/widget/SearchView$SavedState;
    .registers 1

    .line 1355
    new-array p0, p0, [Landroidx/appcompat/widget/SearchView$SavedState;

    return-object p0
.end method


# virtual methods
.method public final synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .registers 2

    .line 1342
    invoke-static {p1}, Landroidx/appcompat/widget/SearchView$SavedState$5;->IconCompatParcelizer(Landroid/os/Parcel;)Landroidx/appcompat/widget/SearchView$SavedState;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic createFromParcel(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Ljava/lang/Object;
    .registers 3

    .line 1342
    invoke-static {p1, p2}, Landroidx/appcompat/widget/SearchView$SavedState$5;->read(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Landroidx/appcompat/widget/SearchView$SavedState;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .registers 2

    .line 1342
    invoke-static {p1}, Landroidx/appcompat/widget/SearchView$SavedState$5;->write(I)[Landroidx/appcompat/widget/SearchView$SavedState;

    move-result-object p0

    return-object p0
.end method

###### Class androidx.appcompat.widget.SearchView.SearchAutoComplete (androidx.appcompat.widget.SearchView$SearchAutoComplete)
.class public Landroidx/appcompat/widget/SearchView$SearchAutoComplete;
.super Landroidx/appcompat/widget/AppCompatAutoCompleteTextView;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/widget/SearchView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "SearchAutoComplete"
.end annotation


# instance fields
.field final AudioAttributesCompatParcelizer:Ljava/lang/Runnable;

.field private IconCompatParcelizer:I

.field private read:Z

.field private write:Landroidx/appcompat/widget/SearchView;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 3

    const/4 v0, 0x0

    .line 1859
    invoke-direct {p0, p1, v0}, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 4

    .line 1863
    sget v0, Lo/_init_lambda5$read;->autoCompleteTextViewStyle:I

    invoke-direct {p0, p1, p2, v0}, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 4

    .line 1867
    invoke-direct {p0, p1, p2, p3}, Landroidx/appcompat/widget/AppCompatAutoCompleteTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 1851
    new-instance p1, Landroidx/appcompat/widget/SearchView$SearchAutoComplete$2;

    invoke-direct {p1, p0}, Landroidx/appcompat/widget/SearchView$SearchAutoComplete$2;-><init>(Landroidx/appcompat/widget/SearchView$SearchAutoComplete;)V

    iput-object p1, p0, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->AudioAttributesCompatParcelizer:Ljava/lang/Runnable;

    .line 1868
    invoke-virtual {p0}, Landroid/widget/AutoCompleteTextView;->getThreshold()I

    move-result p1

    iput p1, p0, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->IconCompatParcelizer:I

    return-void
.end method

.method private RemoteActionCompatParcelizer()I
    .registers 4

    .line 1981
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p0

    .line 1982
    iget v0, p0, Landroid/content/res/Configuration;->screenWidthDp:I

    .line 1983
    iget v1, p0, Landroid/content/res/Configuration;->screenHeightDp:I

    const/16 v2, 0x3c0

    if-lt v0, v2, :cond_1c

    const/16 v2, 0x2d0

    if-lt v1, v2, :cond_1c

    .line 1985
    iget p0, p0, Landroid/content/res/Configuration;->orientation:I

    const/4 v2, 0x2

    if-ne p0, v2, :cond_1c

    const/16 p0, 0x100

    return p0

    :cond_1c
    const/16 p0, 0x258

    if-ge v0, p0, :cond_2b

    const/16 p0, 0x280

    if-lt v0, p0, :cond_28

    const/16 p0, 0x1e0

    if-ge v1, p0, :cond_2b

    :cond_28
    const/16 p0, 0xa0

    return p0

    :cond_2b
    const/16 p0, 0xc0

    return p0
.end method


# virtual methods
.method final AudioAttributesCompatParcelizer()V
    .registers 3

    .line 2009
    iget-boolean v0, p0, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->read:Z

    if-eqz v0, :cond_16

    .line 2011
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "input_method"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    const/4 v1, 0x0

    .line 2012
    invoke-virtual {v0, p0, v1}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z

    .line 2013
    iput-boolean v1, p0, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->read:Z

    :cond_16
    return-void
.end method

.method public enoughToFilter()Z
    .registers 2

    .line 1948
    iget v0, p0, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->IconCompatParcelizer:I

    if-lez v0, :cond_c

    invoke-super {p0}, Landroidx/appcompat/widget/AppCompatAutoCompleteTextView;->enoughToFilter()Z

    move-result p0

    if-nez p0, :cond_c

    const/4 p0, 0x0

    return p0

    :cond_c
    const/4 p0, 0x1

    return p0
.end method

.method public onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;
    .registers 3

    .line 2000
    invoke-super {p0, p1}, Landroidx/appcompat/widget/AppCompatAutoCompleteTextView;->onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;

    move-result-object p1

    .line 2001
    iget-boolean v0, p0, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->read:Z

    if-eqz v0, :cond_12

    .line 2002
    iget-object v0, p0, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->AudioAttributesCompatParcelizer:Ljava/lang/Runnable;

    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 2003
    iget-object v0, p0, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->AudioAttributesCompatParcelizer:Ljava/lang/Runnable;

    invoke-virtual {p0, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    :cond_12
    return-object p1
.end method

.method protected onFinishInflate()V
    .registers 4

    .line 1873
    invoke-super {p0}, Landroidx/appcompat/widget/AppCompatAutoCompleteTextView;->onFinishInflate()V

    .line 1874
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    .line 1876
    invoke-direct {p0}, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->RemoteActionCompatParcelizer()I

    move-result v1

    int-to-float v1, v1

    const/4 v2, 0x1

    .line 1875
    invoke-static {v2, v1, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v0

    float-to-int v0, v0

    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setMinWidth(I)V

    return-void
.end method

.method protected onFocusChanged(ZILandroid/graphics/Rect;)V
    .registers 4

    .line 1938
    invoke-super {p0, p1, p2, p3}, Landroidx/appcompat/widget/AppCompatAutoCompleteTextView;->onFocusChanged(ZILandroid/graphics/Rect;)V

    .line 1939
    iget-object p0, p0, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->write:Landroidx/appcompat/widget/SearchView;

    invoke-virtual {p0}, Landroidx/appcompat/widget/SearchView;->MediaBrowserCompatItemReceiver()V

    return-void
.end method

.method public onKeyPreIme(ILandroid/view/KeyEvent;)Z
    .registers 5

    const/4 v0, 0x4

    if-ne p1, v0, :cond_3f

    .line 1956
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getAction()I

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_1a

    invoke-virtual {p2}, Landroid/view/KeyEvent;->getRepeatCount()I

    move-result v0

    if-nez v0, :cond_1a

    .line 1957
    invoke-virtual {p0}, Landroid/view/View;->getKeyDispatcherState()Landroid/view/KeyEvent$DispatcherState;

    move-result-object p1

    if-eqz p1, :cond_19

    .line 1959
    invoke-virtual {p1, p2, p0}, Landroid/view/KeyEvent$DispatcherState;->startTracking(Landroid/view/KeyEvent;Ljava/lang/Object;)V

    :cond_19
    return v1

    .line 1962
    :cond_1a
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getAction()I

    move-result v0

    if-ne v0, v1, :cond_3f

    .line 1963
    invoke-virtual {p0}, Landroid/view/View;->getKeyDispatcherState()Landroid/view/KeyEvent$DispatcherState;

    move-result-object v0

    if-eqz v0, :cond_29

    .line 1965
    invoke-virtual {v0, p2}, Landroid/view/KeyEvent$DispatcherState;->handleUpEvent(Landroid/view/KeyEvent;)V

    .line 1967
    :cond_29
    invoke-virtual {p2}, Landroid/view/KeyEvent;->isTracking()Z

    move-result v0

    if-eqz v0, :cond_3f

    invoke-virtual {p2}, Landroid/view/KeyEvent;->isCanceled()Z

    move-result v0

    if-nez v0, :cond_3f

    .line 1968
    iget-object p1, p0, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->write:Landroidx/appcompat/widget/SearchView;

    invoke-virtual {p1}, Landroid/view/View;->clearFocus()V

    const/4 p1, 0x0

    .line 1969
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->write(Z)V

    return v1

    .line 1974
    :cond_3f
    invoke-super {p0, p1, p2}, Landroidx/appcompat/widget/AppCompatAutoCompleteTextView;->onKeyPreIme(ILandroid/view/KeyEvent;)Z

    move-result p0

    return p0
.end method

.method public onWindowFocusChanged(Z)V
    .registers 2

    .line 1920
    invoke-super {p0, p1}, Landroidx/appcompat/widget/AppCompatAutoCompleteTextView;->onWindowFocusChanged(Z)V

    if-eqz p1, :cond_23

    .line 1922
    iget-object p1, p0, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->write:Landroidx/appcompat/widget/SearchView;

    invoke-virtual {p1}, Landroid/view/View;->hasFocus()Z

    move-result p1

    if-eqz p1, :cond_23

    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    move-result p1

    if-nez p1, :cond_23

    const/4 p1, 0x1

    .line 1927
    iput-boolean p1, p0, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->read:Z

    .line 1930
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Landroidx/appcompat/widget/SearchView;->write(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_23

    .line 1931
    invoke-virtual {p0}, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->write()V

    :cond_23
    return-void
.end method

.method public performCompletion()V
    .registers 1

    return-void
.end method

.method final read(Landroidx/appcompat/widget/SearchView;)V
    .registers 2

    .line 1880
    iput-object p1, p0, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->write:Landroidx/appcompat/widget/SearchView;

    return-void
.end method

.method final read()Z
    .registers 1

    .line 1893
    invoke-virtual {p0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p0

    invoke-static {p0}, Landroid/text/TextUtils;->getTrimmedLength(Ljava/lang/CharSequence;)I

    move-result p0

    if-nez p0, :cond_c

    const/4 p0, 0x1

    return p0

    :cond_c
    const/4 p0, 0x0

    return p0
.end method

.method protected replaceText(Ljava/lang/CharSequence;)V
    .registers 2

    return-void
.end method

.method public setThreshold(I)V
    .registers 2

    .line 1885
    invoke-super {p0, p1}, Landroidx/appcompat/widget/AppCompatAutoCompleteTextView;->setThreshold(I)V

    .line 1886
    iput p1, p0, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->IconCompatParcelizer:I

    return-void
.end method

.method final write()V
    .registers 2

    const/4 v0, 0x1

    .line 2043
    invoke-static {p0, v0}, Landroidx/appcompat/widget/SearchView$RemoteActionCompatParcelizer;->RemoteActionCompatParcelizer(Landroidx/appcompat/widget/SearchView$SearchAutoComplete;I)V

    .line 2044
    invoke-virtual {p0}, Landroid/widget/AutoCompleteTextView;->enoughToFilter()Z

    move-result v0

    if-eqz v0, :cond_d

    .line 2045
    invoke-virtual {p0}, Landroid/widget/AutoCompleteTextView;->showDropDown()V

    :cond_d
    return-void
.end method

.method final write(Z)V
    .registers 4

    .line 2019
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "input_method"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    const/4 v1, 0x0

    if-nez p1, :cond_1e

    .line 2021
    iput-boolean v1, p0, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->read:Z

    .line 2022
    iget-object p1, p0, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->AudioAttributesCompatParcelizer:Ljava/lang/Runnable;

    invoke-virtual {p0, p1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 2023
    invoke-virtual {p0}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object p0

    invoke-virtual {v0, p0, v1}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    return-void

    .line 2027
    :cond_1e
    invoke-virtual {v0, p0}, Landroid/view/inputmethod/InputMethodManager;->isActive(Landroid/view/View;)Z

    move-result p1

    if-eqz p1, :cond_2f

    .line 2030
    iput-boolean v1, p0, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->read:Z

    .line 2031
    iget-object p1, p0, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->AudioAttributesCompatParcelizer:Ljava/lang/Runnable;

    invoke-virtual {p0, p1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 2032
    invoke-virtual {v0, p0, v1}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z

    return-void

    :cond_2f
    const/4 p1, 0x1

    .line 2038
    iput-boolean p1, p0, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->read:Z

    return-void
.end method

###### Class androidx.appcompat.widget.SearchView.SearchAutoComplete.AnonymousClass2 (androidx.appcompat.widget.SearchView$SearchAutoComplete$2)
.class final Landroidx/appcompat/widget/SearchView$SearchAutoComplete$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/widget/SearchView$SearchAutoComplete;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;


# direct methods
.method constructor <init>(Landroidx/appcompat/widget/SearchView$SearchAutoComplete;)V
    .registers 2

    .line 1851
    iput-object p1, p0, Landroidx/appcompat/widget/SearchView$SearchAutoComplete$2;->AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 1

    .line 1854
    iget-object p0, p0, Landroidx/appcompat/widget/SearchView$SearchAutoComplete$2;->AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {p0}, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->AudioAttributesCompatParcelizer()V

    return-void
.end method

###### Class androidx.appcompat.widget.SearchView.read (androidx.appcompat.widget.SearchView$read)
.class final Landroidx/appcompat/widget/SearchView$read;
.super Landroid/view/TouchDelegate;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/widget/SearchView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "read"
.end annotation


# instance fields
.field private final AudioAttributesCompatParcelizer:I

.field private final AudioAttributesImplApi21Parcelizer:Landroid/graphics/Rect;

.field private final IconCompatParcelizer:Landroid/graphics/Rect;

.field private RemoteActionCompatParcelizer:Z

.field private final read:Landroid/graphics/Rect;

.field private final write:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/view/View;)V
    .registers 5

    .line 1777
    invoke-direct {p0, p1, p3}, Landroid/view/TouchDelegate;-><init>(Landroid/graphics/Rect;Landroid/view/View;)V

    .line 1778
    invoke-virtual {p3}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result v0

    iput v0, p0, Landroidx/appcompat/widget/SearchView$read;->AudioAttributesCompatParcelizer:I

    .line 1779
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Landroidx/appcompat/widget/SearchView$read;->AudioAttributesImplApi21Parcelizer:Landroid/graphics/Rect;

    .line 1780
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Landroidx/appcompat/widget/SearchView$read;->read:Landroid/graphics/Rect;

    .line 1781
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Landroidx/appcompat/widget/SearchView$read;->IconCompatParcelizer:Landroid/graphics/Rect;

    .line 1782
    invoke-virtual {p0, p1, p2}, Landroidx/appcompat/widget/SearchView$read;->AudioAttributesCompatParcelizer(Landroid/graphics/Rect;Landroid/graphics/Rect;)V

    .line 1783
    iput-object p3, p0, Landroidx/appcompat/widget/SearchView$read;->write:Landroid/view/View;

    return-void
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer(Landroid/graphics/Rect;Landroid/graphics/Rect;)V
    .registers 4

    .line 1787
    iget-object v0, p0, Landroidx/appcompat/widget/SearchView$read;->AudioAttributesImplApi21Parcelizer:Landroid/graphics/Rect;

    invoke-virtual {v0, p1}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    .line 1788
    iget-object v0, p0, Landroidx/appcompat/widget/SearchView$read;->read:Landroid/graphics/Rect;

    invoke-virtual {v0, p1}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    .line 1789
    iget-object p1, p0, Landroidx/appcompat/widget/SearchView$read;->read:Landroid/graphics/Rect;

    iget v0, p0, Landroidx/appcompat/widget/SearchView$read;->AudioAttributesCompatParcelizer:I

    neg-int v0, v0

    invoke-virtual {p1, v0, v0}, Landroid/graphics/Rect;->inset(II)V

    .line 1790
    iget-object p0, p0, Landroidx/appcompat/widget/SearchView$read;->IconCompatParcelizer:Landroid/graphics/Rect;

    invoke-virtual {p0, p2}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    return-void
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .registers 10

    .line 1795
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    float-to-int v0, v0

    .line 1796
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    float-to-int v1, v1

    .line 1801
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v2

    const/4 v3, 0x2

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eqz v2, :cond_32

    if-eq v2, v5, :cond_1f

    if-eq v2, v3, :cond_1f

    const/4 v6, 0x3

    if-ne v2, v6, :cond_3e

    .line 1818
    iget-boolean v2, p0, Landroidx/appcompat/widget/SearchView$read;->RemoteActionCompatParcelizer:Z

    .line 1819
    iput-boolean v4, p0, Landroidx/appcompat/widget/SearchView$read;->RemoteActionCompatParcelizer:Z

    goto :goto_2e

    .line 1810
    :cond_1f
    iget-boolean v2, p0, Landroidx/appcompat/widget/SearchView$read;->RemoteActionCompatParcelizer:Z

    if-eqz v2, :cond_2e

    .line 1812
    iget-object v6, p0, Landroidx/appcompat/widget/SearchView$read;->read:Landroid/graphics/Rect;

    invoke-virtual {v6, v0, v1}, Landroid/graphics/Rect;->contains(II)Z

    move-result v6

    if-nez v6, :cond_2e

    move v5, v2

    move v2, v4

    goto :goto_40

    :cond_2e
    :goto_2e
    move v7, v5

    move v5, v2

    move v2, v7

    goto :goto_40

    .line 1803
    :cond_32
    iget-object v2, p0, Landroidx/appcompat/widget/SearchView$read;->AudioAttributesImplApi21Parcelizer:Landroid/graphics/Rect;

    invoke-virtual {v2, v0, v1}, Landroid/graphics/Rect;->contains(II)Z

    move-result v2

    if-eqz v2, :cond_3e

    .line 1804
    iput-boolean v5, p0, Landroidx/appcompat/widget/SearchView$read;->RemoteActionCompatParcelizer:Z

    move v2, v5

    goto :goto_40

    :cond_3e
    move v2, v5

    move v5, v4

    :goto_40
    if-eqz v5, :cond_76

    if-eqz v2, :cond_60

    .line 1823
    iget-object v2, p0, Landroidx/appcompat/widget/SearchView$read;->IconCompatParcelizer:Landroid/graphics/Rect;

    invoke-virtual {v2, v0, v1}, Landroid/graphics/Rect;->contains(II)Z

    move-result v2

    if-nez v2, :cond_60

    .line 1827
    iget-object v0, p0, Landroidx/appcompat/widget/SearchView$read;->write:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v0

    div-int/2addr v0, v3

    int-to-float v0, v0

    iget-object v1, p0, Landroidx/appcompat/widget/SearchView$read;->write:Landroid/view/View;

    .line 1828
    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    move-result v1

    div-int/2addr v1, v3

    int-to-float v1, v1

    .line 1827
    invoke-virtual {p1, v0, v1}, Landroid/view/MotionEvent;->setLocation(FF)V

    goto :goto_6f

    .line 1831
    :cond_60
    iget-object v2, p0, Landroidx/appcompat/widget/SearchView$read;->IconCompatParcelizer:Landroid/graphics/Rect;

    iget v2, v2, Landroid/graphics/Rect;->left:I

    sub-int/2addr v0, v2

    int-to-float v0, v0

    iget-object v2, p0, Landroidx/appcompat/widget/SearchView$read;->IconCompatParcelizer:Landroid/graphics/Rect;

    iget v2, v2, Landroid/graphics/Rect;->top:I

    sub-int/2addr v1, v2

    int-to-float v1, v1

    invoke-virtual {p1, v0, v1}, Landroid/view/MotionEvent;->setLocation(FF)V

    .line 1834
    :goto_6f
    iget-object p0, p0, Landroidx/appcompat/widget/SearchView$read;->write:Landroid/view/View;

    invoke-virtual {p0, p1}, Landroid/view/View;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p0

    return p0

    :cond_76
    return v4
.end method

###### Class androidx.appcompat.widget.SearchView.write (androidx.appcompat.widget.SearchView$write)
.class public interface abstract Landroidx/appcompat/widget/SearchView$write;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/widget/SearchView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "write"
.end annotation


# virtual methods
.method public abstract AudioAttributesCompatParcelizer()Z
.end method
