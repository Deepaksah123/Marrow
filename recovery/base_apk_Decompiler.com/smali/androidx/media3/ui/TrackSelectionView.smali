###### Class androidx.media3.ui.TrackSelectionView (androidx.media3.ui.TrackSelectionView)
.class public Landroidx/media3/ui/TrackSelectionView;
.super Landroid/widget/LinearLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/media3/ui/TrackSelectionView$AudioAttributesCompatParcelizer;,
        Landroidx/media3/ui/TrackSelectionView$IconCompatParcelizer;,
        Landroidx/media3/ui/TrackSelectionView$RemoteActionCompatParcelizer;
    }
.end annotation


# instance fields
.field private AudioAttributesCompatParcelizer:Z

.field private final AudioAttributesImplApi21Parcelizer:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lo/setName;",
            "Lo/TypeDeserializer;",
            ">;"
        }
    .end annotation
.end field

.field private final AudioAttributesImplApi26Parcelizer:I

.field private AudioAttributesImplBaseParcelizer:Z

.field private final IconCompatParcelizer:Landroidx/media3/ui/TrackSelectionView$AudioAttributesCompatParcelizer;

.field private MediaBrowserCompatCustomActionResultReceiver:Landroidx/media3/ui/TrackSelectionView$RemoteActionCompatParcelizer;

.field private final MediaBrowserCompatItemReceiver:Landroid/view/LayoutInflater;

.field private final MediaBrowserCompatMediaItem:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lo/collectAndResolveSubtypesByTypeId$write;",
            ">;"
        }
    .end annotation
.end field

.field private MediaDescriptionCompat:Lo/PrivateMaxEntriesMapUpdateTask;

.field private MediaMetadataCompat:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator<",
            "Landroidx/media3/ui/TrackSelectionView$IconCompatParcelizer;",
            ">;"
        }
    .end annotation
.end field

.field private RatingCompat:[[Landroid/widget/CheckedTextView;

.field private final RemoteActionCompatParcelizer:Landroid/widget/CheckedTextView;

.field private read:Z

.field private final write:Landroid/widget/CheckedTextView;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 3

    const/4 v0, 0x0

    .line 103
    invoke-direct {p0, p1, v0}, Landroidx/media3/ui/TrackSelectionView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 4

    const/4 v0, 0x0

    .line 108
    invoke-direct {p0, p1, p2, v0}, Landroidx/media3/ui/TrackSelectionView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 9

    .line 115
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p2, 0x1

    .line 116
    invoke-virtual {p0, p2}, Landroid/widget/LinearLayout;->setOrientation(I)V

    const/4 p3, 0x0

    .line 118
    invoke-virtual {p0, p3}, Landroidx/media3/ui/TrackSelectionView;->setSaveFromParentEnabled(Z)V

    .line 122
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v0

    const v1, 0x101030e

    filled-new-array {v1}, [I

    move-result-object v1

    .line 123
    invoke-virtual {v0, v1}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 124
    invoke-virtual {v0, p3, p3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v1

    iput v1, p0, Landroidx/media3/ui/TrackSelectionView;->AudioAttributesImplApi26Parcelizer:I

    .line 125
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 127
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    iput-object p1, p0, Landroidx/media3/ui/TrackSelectionView;->MediaBrowserCompatItemReceiver:Landroid/view/LayoutInflater;

    .line 128
    new-instance v0, Landroidx/media3/ui/TrackSelectionView$AudioAttributesCompatParcelizer;

    invoke-direct {v0, p0, p3}, Landroidx/media3/ui/TrackSelectionView$AudioAttributesCompatParcelizer;-><init>(Landroidx/media3/ui/TrackSelectionView;B)V

    iput-object v0, p0, Landroidx/media3/ui/TrackSelectionView;->IconCompatParcelizer:Landroidx/media3/ui/TrackSelectionView$AudioAttributesCompatParcelizer;

    .line 129
    new-instance v2, Lo/checkArgument;

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-direct {v2, v3}, Lo/checkArgument;-><init>(Landroid/content/res/Resources;)V

    iput-object v2, p0, Landroidx/media3/ui/TrackSelectionView;->MediaDescriptionCompat:Lo/PrivateMaxEntriesMapUpdateTask;

    .line 130
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, p0, Landroidx/media3/ui/TrackSelectionView;->MediaBrowserCompatMediaItem:Ljava/util/List;

    .line 131
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    iput-object v2, p0, Landroidx/media3/ui/TrackSelectionView;->AudioAttributesImplApi21Parcelizer:Ljava/util/Map;

    const v2, 0x109000f

    .line 136
    invoke-virtual {p1, v2, p0, p3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/CheckedTextView;

    iput-object v3, p0, Landroidx/media3/ui/TrackSelectionView;->RemoteActionCompatParcelizer:Landroid/widget/CheckedTextView;

    .line 137
    invoke-virtual {v3, v1}, Landroid/view/View;->setBackgroundResource(I)V

    .line 138
    sget v4, Lo/maximumCapacity$MediaBrowserCompatCustomActionResultReceiver;->exo_track_selection_none:I

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(I)V

    .line 139
    invoke-virtual {v3, p3}, Landroid/widget/CheckedTextView;->setEnabled(Z)V

    .line 140
    invoke-virtual {v3, p2}, Landroid/view/View;->setFocusable(Z)V

    .line 141
    invoke-virtual {v3, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const/16 v4, 0x8

    .line 142
    invoke-virtual {v3, v4}, Landroid/widget/CheckedTextView;->setVisibility(I)V

    .line 143
    invoke-virtual {p0, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 145
    sget v3, Lo/maximumCapacity$AudioAttributesImplApi21Parcelizer;->exo_list_divider:I

    invoke-virtual {p1, v3, p0, p3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v3

    invoke-virtual {p0, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 149
    invoke-virtual {p1, v2, p0, p3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/CheckedTextView;

    iput-object p1, p0, Landroidx/media3/ui/TrackSelectionView;->write:Landroid/widget/CheckedTextView;

    .line 150
    invoke-virtual {p1, v1}, Landroid/view/View;->setBackgroundResource(I)V

    .line 151
    sget v1, Lo/maximumCapacity$MediaBrowserCompatCustomActionResultReceiver;->exo_track_selection_auto:I

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setText(I)V

    .line 152
    invoke-virtual {p1, p3}, Landroid/widget/CheckedTextView;->setEnabled(Z)V

    .line 153
    invoke-virtual {p1, p2}, Landroid/view/View;->setFocusable(Z)V

    .line 154
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 155
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-void
.end method

.method private AudioAttributesCompatParcelizer()V
    .registers 2

    const/4 v0, 0x1

    .line 351
    iput-boolean v0, p0, Landroidx/media3/ui/TrackSelectionView;->AudioAttributesImplBaseParcelizer:Z

    .line 352
    iget-object p0, p0, Landroidx/media3/ui/TrackSelectionView;->AudioAttributesImplApi21Parcelizer:Ljava/util/Map;

    invoke-interface {p0}, Ljava/util/Map;->clear()V

    return-void
.end method

.method static synthetic AudioAttributesCompatParcelizer(Landroidx/media3/ui/TrackSelectionView;Landroid/view/View;)V
    .registers 2

    .line 43
    invoke-direct {p0, p1}, Landroidx/media3/ui/TrackSelectionView;->write(Landroid/view/View;)V

    return-void
.end method

.method private AudioAttributesCompatParcelizer(Lo/collectAndResolveSubtypesByTypeId$write;)Z
    .registers 2

    .line 406
    iget-boolean p0, p0, Landroidx/media3/ui/TrackSelectionView;->AudioAttributesCompatParcelizer:Z

    if-eqz p0, :cond_c

    invoke-virtual {p1}, Lo/collectAndResolveSubtypesByTypeId$write;->write()Z

    move-result p0

    if-eqz p0, :cond_c

    const/4 p0, 0x1

    return p0

    :cond_c
    const/4 p0, 0x0

    return p0
.end method

.method private IconCompatParcelizer()Z
    .registers 2

    .line 410
    iget-boolean v0, p0, Landroidx/media3/ui/TrackSelectionView;->read:Z

    if-eqz v0, :cond_e

    iget-object p0, p0, Landroidx/media3/ui/TrackSelectionView;->MediaBrowserCompatMediaItem:Ljava/util/List;

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p0

    const/4 v0, 0x1

    if-le p0, v0, :cond_e

    return v0

    :cond_e
    const/4 p0, 0x0

    return p0
.end method

.method private RemoteActionCompatParcelizer()V
    .registers 13

    .line 262
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    :goto_6
    const/4 v2, 0x3

    if-lt v0, v2, :cond_f

    .line 263
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->removeViewAt(I)V

    add-int/lit8 v0, v0, -0x1

    goto :goto_6

    .line 266
    :cond_f
    iget-object v0, p0, Landroidx/media3/ui/TrackSelectionView;->MediaBrowserCompatMediaItem:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const/4 v2, 0x0

    if-eqz v0, :cond_23

    .line 268
    iget-object v0, p0, Landroidx/media3/ui/TrackSelectionView;->RemoteActionCompatParcelizer:Landroid/widget/CheckedTextView;

    invoke-virtual {v0, v2}, Landroid/widget/CheckedTextView;->setEnabled(Z)V

    .line 269
    iget-object p0, p0, Landroidx/media3/ui/TrackSelectionView;->write:Landroid/widget/CheckedTextView;

    invoke-virtual {p0, v2}, Landroid/widget/CheckedTextView;->setEnabled(Z)V

    return-void

    .line 272
    :cond_23
    iget-object v0, p0, Landroidx/media3/ui/TrackSelectionView;->RemoteActionCompatParcelizer:Landroid/widget/CheckedTextView;

    invoke-virtual {v0, v1}, Landroid/widget/CheckedTextView;->setEnabled(Z)V

    .line 273
    iget-object v0, p0, Landroidx/media3/ui/TrackSelectionView;->write:Landroid/widget/CheckedTextView;

    invoke-virtual {v0, v1}, Landroid/widget/CheckedTextView;->setEnabled(Z)V

    .line 276
    iget-object v0, p0, Landroidx/media3/ui/TrackSelectionView;->MediaBrowserCompatMediaItem:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    new-array v0, v0, [[Landroid/widget/CheckedTextView;

    iput-object v0, p0, Landroidx/media3/ui/TrackSelectionView;->RatingCompat:[[Landroid/widget/CheckedTextView;

    .line 277
    invoke-direct {p0}, Landroidx/media3/ui/TrackSelectionView;->IconCompatParcelizer()Z

    move-result v0

    move v3, v2

    .line 278
    :goto_3c
    iget-object v4, p0, Landroidx/media3/ui/TrackSelectionView;->MediaBrowserCompatMediaItem:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-ge v3, v4, :cond_cc

    .line 279
    iget-object v4, p0, Landroidx/media3/ui/TrackSelectionView;->MediaBrowserCompatMediaItem:Ljava/util/List;

    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lo/collectAndResolveSubtypesByTypeId$write;

    .line 280
    invoke-direct {p0, v4}, Landroidx/media3/ui/TrackSelectionView;->AudioAttributesCompatParcelizer(Lo/collectAndResolveSubtypesByTypeId$write;)Z

    move-result v5

    .line 281
    iget-object v6, p0, Landroidx/media3/ui/TrackSelectionView;->RatingCompat:[[Landroid/widget/CheckedTextView;

    iget v7, v4, Lo/collectAndResolveSubtypesByTypeId$write;->IconCompatParcelizer:I

    new-array v7, v7, [Landroid/widget/CheckedTextView;

    aput-object v7, v6, v3

    .line 283
    iget v6, v4, Lo/collectAndResolveSubtypesByTypeId$write;->IconCompatParcelizer:I

    new-array v7, v6, [Landroidx/media3/ui/TrackSelectionView$IconCompatParcelizer;

    move v8, v2

    .line 284
    :goto_5d
    iget v9, v4, Lo/collectAndResolveSubtypesByTypeId$write;->IconCompatParcelizer:I

    if-ge v8, v9, :cond_6b

    .line 285
    new-instance v9, Landroidx/media3/ui/TrackSelectionView$IconCompatParcelizer;

    invoke-direct {v9, v4, v8}, Landroidx/media3/ui/TrackSelectionView$IconCompatParcelizer;-><init>(Lo/collectAndResolveSubtypesByTypeId$write;I)V

    aput-object v9, v7, v8

    add-int/lit8 v8, v8, 0x1

    goto :goto_5d

    :cond_6b
    move v8, v2

    :goto_6c
    if-ge v8, v6, :cond_c8

    if-nez v8, :cond_7b

    .line 293
    iget-object v9, p0, Landroidx/media3/ui/TrackSelectionView;->MediaBrowserCompatItemReceiver:Landroid/view/LayoutInflater;

    sget v10, Lo/maximumCapacity$AudioAttributesImplApi21Parcelizer;->exo_list_divider:I

    invoke-virtual {v9, v10, p0, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v9

    invoke-virtual {p0, v9}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    :cond_7b
    if-nez v5, :cond_83

    if-nez v0, :cond_83

    const v9, 0x109000f

    goto :goto_86

    :cond_83
    const v9, 0x1090010

    .line 299
    :goto_86
    iget-object v10, p0, Landroidx/media3/ui/TrackSelectionView;->MediaBrowserCompatItemReceiver:Landroid/view/LayoutInflater;

    .line 300
    invoke-virtual {v10, v9, p0, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v9

    check-cast v9, Landroid/widget/CheckedTextView;

    .line 301
    iget v10, p0, Landroidx/media3/ui/TrackSelectionView;->AudioAttributesImplApi26Parcelizer:I

    invoke-virtual {v9, v10}, Landroid/view/View;->setBackgroundResource(I)V

    .line 302
    iget-object v10, p0, Landroidx/media3/ui/TrackSelectionView;->MediaDescriptionCompat:Lo/PrivateMaxEntriesMapUpdateTask;

    aget-object v11, v7, v8

    invoke-virtual {v11}, Landroidx/media3/ui/TrackSelectionView$IconCompatParcelizer;->write()Lo/format;

    move-result-object v11

    invoke-interface {v10, v11}, Lo/PrivateMaxEntriesMapUpdateTask;->write(Lo/format;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 303
    aget-object v10, v7, v8

    invoke-virtual {v9, v10}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 304
    invoke-virtual {v4, v8}, Lo/collectAndResolveSubtypesByTypeId$write;->write(I)Z

    move-result v10

    if-eqz v10, :cond_b6

    .line 305
    invoke-virtual {v9, v1}, Landroid/view/View;->setFocusable(Z)V

    .line 306
    iget-object v10, p0, Landroidx/media3/ui/TrackSelectionView;->IconCompatParcelizer:Landroidx/media3/ui/TrackSelectionView$AudioAttributesCompatParcelizer;

    invoke-virtual {v9, v10}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_bc

    .line 308
    :cond_b6
    invoke-virtual {v9, v2}, Landroid/view/View;->setFocusable(Z)V

    .line 309
    invoke-virtual {v9, v2}, Landroid/widget/CheckedTextView;->setEnabled(Z)V

    .line 311
    :goto_bc
    iget-object v10, p0, Landroidx/media3/ui/TrackSelectionView;->RatingCompat:[[Landroid/widget/CheckedTextView;

    aget-object v10, v10, v3

    aput-object v9, v10, v8

    .line 312
    invoke-virtual {p0, v9}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    add-int/lit8 v8, v8, 0x1

    goto :goto_6c

    :cond_c8
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_3c

    .line 316
    :cond_cc
    invoke-direct {p0}, Landroidx/media3/ui/TrackSelectionView;->write()V

    return-void
.end method

.method private read()V
    .registers 2

    const/4 v0, 0x0

    .line 356
    iput-boolean v0, p0, Landroidx/media3/ui/TrackSelectionView;->AudioAttributesImplBaseParcelizer:Z

    .line 357
    iget-object p0, p0, Landroidx/media3/ui/TrackSelectionView;->AudioAttributesImplApi21Parcelizer:Ljava/util/Map;

    invoke-interface {p0}, Ljava/util/Map;->clear()V

    return-void
.end method

.method private read(Landroid/view/View;)V
    .registers 8

    const/4 v0, 0x0

    .line 361
    iput-boolean v0, p0, Landroidx/media3/ui/TrackSelectionView;->AudioAttributesImplBaseParcelizer:Z

    .line 362
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lo/buildTypeSerializer;->IconCompatParcelizer(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/media3/ui/TrackSelectionView$IconCompatParcelizer;

    .line 363
    iget-object v2, v1, Landroidx/media3/ui/TrackSelectionView$IconCompatParcelizer;->read:Lo/collectAndResolveSubtypesByTypeId$write;

    invoke-virtual {v2}, Lo/collectAndResolveSubtypesByTypeId$write;->read()Lo/setName;

    move-result-object v2

    .line 364
    iget v3, v1, Landroidx/media3/ui/TrackSelectionView$IconCompatParcelizer;->write:I

    .line 365
    iget-object v4, p0, Landroidx/media3/ui/TrackSelectionView;->AudioAttributesImplApi21Parcelizer:Ljava/util/Map;

    invoke-interface {v4, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lo/TypeDeserializer;

    if-nez v4, :cond_43

    .line 368
    iget-boolean p1, p0, Landroidx/media3/ui/TrackSelectionView;->read:Z

    if-nez p1, :cond_30

    iget-object p1, p0, Landroidx/media3/ui/TrackSelectionView;->AudioAttributesImplApi21Parcelizer:Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result p1

    if-lez p1, :cond_30

    .line 370
    iget-object p1, p0, Landroidx/media3/ui/TrackSelectionView;->AudioAttributesImplApi21Parcelizer:Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->clear()V

    .line 372
    :cond_30
    iget-object p0, p0, Landroidx/media3/ui/TrackSelectionView;->AudioAttributesImplApi21Parcelizer:Ljava/util/Map;

    .line 374
    new-instance p1, Lo/TypeDeserializer;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/initExtraTracks;->read(Ljava/lang/Object;)Lo/initExtraTracks;

    move-result-object v0

    invoke-direct {p1, v2, v0}, Lo/TypeDeserializer;-><init>(Lo/setName;Ljava/util/List;)V

    .line 372
    invoke-interface {p0, v2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 377
    :cond_43
    new-instance v5, Ljava/util/ArrayList;

    iget-object v4, v4, Lo/TypeDeserializer;->RemoteActionCompatParcelizer:Lo/initExtraTracks;

    invoke-direct {v5, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 378
    check-cast p1, Landroid/widget/CheckedTextView;

    invoke-virtual {p1}, Landroid/widget/CheckedTextView;->isChecked()Z

    move-result p1

    .line 379
    iget-object v1, v1, Landroidx/media3/ui/TrackSelectionView$IconCompatParcelizer;->read:Lo/collectAndResolveSubtypesByTypeId$write;

    invoke-direct {p0, v1}, Landroidx/media3/ui/TrackSelectionView;->AudioAttributesCompatParcelizer(Lo/collectAndResolveSubtypesByTypeId$write;)Z

    move-result v1

    if-nez v1, :cond_5e

    .line 380
    invoke-direct {p0}, Landroidx/media3/ui/TrackSelectionView;->IconCompatParcelizer()Z

    move-result v4

    if-eqz v4, :cond_5f

    :cond_5e
    const/4 v0, 0x1

    :cond_5f
    if-eqz p1, :cond_81

    if-eqz v0, :cond_81

    .line 383
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v5, p1}, Ljava/util/AbstractCollection;->remove(Ljava/lang/Object;)Z

    .line 384
    invoke-virtual {v5}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_76

    .line 386
    iget-object p0, p0, Landroidx/media3/ui/TrackSelectionView;->AudioAttributesImplApi21Parcelizer:Ljava/util/Map;

    invoke-interface {p0, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 388
    :cond_76
    iget-object p0, p0, Landroidx/media3/ui/TrackSelectionView;->AudioAttributesImplApi21Parcelizer:Ljava/util/Map;

    new-instance p1, Lo/TypeDeserializer;

    invoke-direct {p1, v2, v5}, Lo/TypeDeserializer;-><init>(Lo/setName;Ljava/util/List;)V

    invoke-interface {p0, v2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_81
    if-nez p1, :cond_a9

    if-eqz v1, :cond_97

    .line 393
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v5, p1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 394
    iget-object p0, p0, Landroidx/media3/ui/TrackSelectionView;->AudioAttributesImplApi21Parcelizer:Ljava/util/Map;

    new-instance p1, Lo/TypeDeserializer;

    invoke-direct {p1, v2, v5}, Lo/TypeDeserializer;-><init>(Lo/setName;Ljava/util/List;)V

    invoke-interface {p0, v2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 397
    :cond_97
    iget-object p0, p0, Landroidx/media3/ui/TrackSelectionView;->AudioAttributesImplApi21Parcelizer:Ljava/util/Map;

    .line 399
    new-instance p1, Lo/TypeDeserializer;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/initExtraTracks;->read(Ljava/lang/Object;)Lo/initExtraTracks;

    move-result-object v0

    invoke-direct {p1, v2, v0}, Lo/TypeDeserializer;-><init>(Lo/setName;Ljava/util/List;)V

    .line 397
    invoke-interface {p0, v2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_a9
    return-void
.end method

.method private static write(Ljava/util/Map;Ljava/util/List;)Ljava/util/Map;
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Lo/setName;",
            "Lo/TypeDeserializer;",
            ">;",
            "Ljava/util/List<",
            "Lo/collectAndResolveSubtypesByTypeId$write;",
            ">;)",
            "Ljava/util/Map<",
            "Lo/setName;",
            "Lo/TypeDeserializer;",
            ">;"
        }
    .end annotation

    .line 72
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const/4 v1, 0x0

    .line 73
    :goto_6
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_2c

    .line 74
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo/collectAndResolveSubtypesByTypeId$write;

    .line 75
    invoke-virtual {v2}, Lo/collectAndResolveSubtypesByTypeId$write;->read()Lo/setName;

    move-result-object v2

    invoke-interface {p0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo/TypeDeserializer;

    if-eqz v2, :cond_29

    .line 76
    invoke-virtual {v0}, Ljava/util/AbstractMap;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_29

    .line 77
    iget-object v3, v2, Lo/TypeDeserializer;->read:Lo/setName;

    invoke-virtual {v0, v3, v2}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_29
    add-int/lit8 v1, v1, 0x1

    goto :goto_6

    :cond_2c
    return-object v0
.end method

.method private write()V
    .registers 8

    .line 320
    iget-object v0, p0, Landroidx/media3/ui/TrackSelectionView;->RemoteActionCompatParcelizer:Landroid/widget/CheckedTextView;

    iget-boolean v1, p0, Landroidx/media3/ui/TrackSelectionView;->AudioAttributesImplBaseParcelizer:Z

    invoke-virtual {v0, v1}, Landroid/widget/CheckedTextView;->setChecked(Z)V

    .line 321
    iget-object v0, p0, Landroidx/media3/ui/TrackSelectionView;->write:Landroid/widget/CheckedTextView;

    iget-boolean v1, p0, Landroidx/media3/ui/TrackSelectionView;->AudioAttributesImplBaseParcelizer:Z

    const/4 v2, 0x0

    if-nez v1, :cond_18

    iget-object v1, p0, Landroidx/media3/ui/TrackSelectionView;->AudioAttributesImplApi21Parcelizer:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->size()I

    move-result v1

    if-nez v1, :cond_18

    const/4 v1, 0x1

    goto :goto_19

    :cond_18
    move v1, v2

    :goto_19
    invoke-virtual {v0, v1}, Landroid/widget/CheckedTextView;->setChecked(Z)V

    move v0, v2

    .line 322
    :goto_1d
    iget-object v1, p0, Landroidx/media3/ui/TrackSelectionView;->RatingCompat:[[Landroid/widget/CheckedTextView;

    array-length v1, v1

    if-ge v0, v1, :cond_6d

    .line 324
    iget-object v1, p0, Landroidx/media3/ui/TrackSelectionView;->AudioAttributesImplApi21Parcelizer:Ljava/util/Map;

    iget-object v3, p0, Landroidx/media3/ui/TrackSelectionView;->MediaBrowserCompatMediaItem:Ljava/util/List;

    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lo/collectAndResolveSubtypesByTypeId$write;

    invoke-virtual {v3}, Lo/collectAndResolveSubtypesByTypeId$write;->read()Lo/setName;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/TypeDeserializer;

    move v3, v2

    .line 325
    :goto_37
    iget-object v4, p0, Landroidx/media3/ui/TrackSelectionView;->RatingCompat:[[Landroid/widget/CheckedTextView;

    aget-object v4, v4, v0

    array-length v5, v4

    if-ge v3, v5, :cond_6a

    if-eqz v1, :cond_62

    .line 327
    aget-object v4, v4, v3

    invoke-virtual {v4}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4}, Lo/buildTypeSerializer;->IconCompatParcelizer(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/media3/ui/TrackSelectionView$IconCompatParcelizer;

    .line 328
    iget-object v5, p0, Landroidx/media3/ui/TrackSelectionView;->RatingCompat:[[Landroid/widget/CheckedTextView;

    aget-object v5, v5, v0

    aget-object v5, v5, v3

    iget-object v6, v1, Lo/TypeDeserializer;->RemoteActionCompatParcelizer:Lo/initExtraTracks;

    iget v4, v4, Landroidx/media3/ui/TrackSelectionView$IconCompatParcelizer;->write:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v6, v4}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    move-result v4

    invoke-virtual {v5, v4}, Landroid/widget/CheckedTextView;->setChecked(Z)V

    goto :goto_67

    .line 330
    :cond_62
    aget-object v4, v4, v3

    invoke-virtual {v4, v2}, Landroid/widget/CheckedTextView;->setChecked(Z)V

    :goto_67
    add-int/lit8 v3, v3, 0x1

    goto :goto_37

    :cond_6a
    add-int/lit8 v0, v0, 0x1

    goto :goto_1d

    :cond_6d
    return-void
.end method

.method private write(Landroid/view/View;)V
    .registers 3

    .line 337
    iget-object v0, p0, Landroidx/media3/ui/TrackSelectionView;->RemoteActionCompatParcelizer:Landroid/widget/CheckedTextView;

    if-ne p1, v0, :cond_8

    .line 338
    invoke-direct {p0}, Landroidx/media3/ui/TrackSelectionView;->AudioAttributesCompatParcelizer()V

    goto :goto_13

    .line 339
    :cond_8
    iget-object v0, p0, Landroidx/media3/ui/TrackSelectionView;->write:Landroid/widget/CheckedTextView;

    if-ne p1, v0, :cond_10

    .line 340
    invoke-direct {p0}, Landroidx/media3/ui/TrackSelectionView;->read()V

    goto :goto_13

    .line 342
    :cond_10
    invoke-direct {p0, p1}, Landroidx/media3/ui/TrackSelectionView;->read(Landroid/view/View;)V

    .line 344
    :goto_13
    invoke-direct {p0}, Landroidx/media3/ui/TrackSelectionView;->write()V

    return-void
.end method


# virtual methods
.method public setAllowAdaptiveSelections(Z)V
    .registers 3

    .line 168
    iget-boolean v0, p0, Landroidx/media3/ui/TrackSelectionView;->AudioAttributesCompatParcelizer:Z

    if-eq v0, p1, :cond_9

    .line 169
    iput-boolean p1, p0, Landroidx/media3/ui/TrackSelectionView;->AudioAttributesCompatParcelizer:Z

    .line 170
    invoke-direct {p0}, Landroidx/media3/ui/TrackSelectionView;->RemoteActionCompatParcelizer()V

    :cond_9
    return-void
.end method

.method public setAllowMultipleOverrides(Z)V
    .registers 3

    .line 181
    iget-boolean v0, p0, Landroidx/media3/ui/TrackSelectionView;->read:Z

    if-eq v0, p1, :cond_26

    .line 182
    iput-boolean p1, p0, Landroidx/media3/ui/TrackSelectionView;->read:Z

    if-nez p1, :cond_23

    .line 183
    iget-object p1, p0, Landroidx/media3/ui/TrackSelectionView;->AudioAttributesImplApi21Parcelizer:Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result p1

    const/4 v0, 0x1

    if-le p1, v0, :cond_23

    .line 185
    iget-object p1, p0, Landroidx/media3/ui/TrackSelectionView;->AudioAttributesImplApi21Parcelizer:Ljava/util/Map;

    iget-object v0, p0, Landroidx/media3/ui/TrackSelectionView;->MediaBrowserCompatMediaItem:Ljava/util/List;

    .line 186
    invoke-static {p1, v0}, Landroidx/media3/ui/TrackSelectionView;->write(Ljava/util/Map;Ljava/util/List;)Ljava/util/Map;

    move-result-object p1

    .line 187
    iget-object v0, p0, Landroidx/media3/ui/TrackSelectionView;->AudioAttributesImplApi21Parcelizer:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 188
    iget-object v0, p0, Landroidx/media3/ui/TrackSelectionView;->AudioAttributesImplApi21Parcelizer:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 190
    :cond_23
    invoke-direct {p0}, Landroidx/media3/ui/TrackSelectionView;->RemoteActionCompatParcelizer()V

    :cond_26
    return-void
.end method

.method public setShowDisableOption(Z)V
    .registers 2

    .line 200
    iget-object p0, p0, Landroidx/media3/ui/TrackSelectionView;->RemoteActionCompatParcelizer:Landroid/widget/CheckedTextView;

    if-eqz p1, :cond_6

    const/4 p1, 0x0

    goto :goto_8

    :cond_6
    const/16 p1, 0x8

    :goto_8
    invoke-virtual {p0, p1}, Landroid/widget/CheckedTextView;->setVisibility(I)V

    return-void
.end method

.method public setTrackNameProvider(Lo/PrivateMaxEntriesMapUpdateTask;)V
    .registers 2

    .line 210
    invoke-static {p1}, Lo/buildTypeSerializer;->IconCompatParcelizer(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lo/PrivateMaxEntriesMapUpdateTask;

    iput-object p1, p0, Landroidx/media3/ui/TrackSelectionView;->MediaDescriptionCompat:Lo/PrivateMaxEntriesMapUpdateTask;

    .line 211
    invoke-direct {p0}, Landroidx/media3/ui/TrackSelectionView;->RemoteActionCompatParcelizer()V

    return-void
.end method

###### Class androidx.media3.ui.TrackSelectionView.AudioAttributesCompatParcelizer (androidx.media3.ui.TrackSelectionView$AudioAttributesCompatParcelizer)
.class final Landroidx/media3/ui/TrackSelectionView$AudioAttributesCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/ui/TrackSelectionView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "AudioAttributesCompatParcelizer"
.end annotation


# instance fields
.field final synthetic AudioAttributesCompatParcelizer:Landroidx/media3/ui/TrackSelectionView;


# direct methods
.method private constructor <init>(Landroidx/media3/ui/TrackSelectionView;)V
    .registers 2

    .line 415
    iput-object p1, p0, Landroidx/media3/ui/TrackSelectionView$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer:Landroidx/media3/ui/TrackSelectionView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Landroidx/media3/ui/TrackSelectionView;B)V
    .registers 3

    .line 415
    invoke-direct {p0, p1}, Landroidx/media3/ui/TrackSelectionView$AudioAttributesCompatParcelizer;-><init>(Landroidx/media3/ui/TrackSelectionView;)V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .registers 2

    .line 419
    iget-object p0, p0, Landroidx/media3/ui/TrackSelectionView$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer:Landroidx/media3/ui/TrackSelectionView;

    invoke-static {p0, p1}, Landroidx/media3/ui/TrackSelectionView;->AudioAttributesCompatParcelizer(Landroidx/media3/ui/TrackSelectionView;Landroid/view/View;)V

    return-void
.end method

###### Class androidx.media3.ui.TrackSelectionView.IconCompatParcelizer (androidx.media3.ui.TrackSelectionView$IconCompatParcelizer)
.class final Landroidx/media3/ui/TrackSelectionView$IconCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/ui/TrackSelectionView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "IconCompatParcelizer"
.end annotation


# instance fields
.field public final read:Lo/collectAndResolveSubtypesByTypeId$write;

.field public final write:I


# direct methods
.method public constructor <init>(Lo/collectAndResolveSubtypesByTypeId$write;I)V
    .registers 3

    .line 427
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 428
    iput-object p1, p0, Landroidx/media3/ui/TrackSelectionView$IconCompatParcelizer;->read:Lo/collectAndResolveSubtypesByTypeId$write;

    .line 429
    iput p2, p0, Landroidx/media3/ui/TrackSelectionView$IconCompatParcelizer;->write:I

    return-void
.end method


# virtual methods
.method public final write()Lo/format;
    .registers 2

    .line 433
    iget-object v0, p0, Landroidx/media3/ui/TrackSelectionView$IconCompatParcelizer;->read:Lo/collectAndResolveSubtypesByTypeId$write;

    iget p0, p0, Landroidx/media3/ui/TrackSelectionView$IconCompatParcelizer;->write:I

    invoke-virtual {v0, p0}, Lo/collectAndResolveSubtypesByTypeId$write;->RemoteActionCompatParcelizer(I)Lo/format;

    move-result-object p0

    return-object p0
.end method

###### Class androidx.media3.ui.TrackSelectionView.RemoteActionCompatParcelizer (androidx.media3.ui.TrackSelectionView$RemoteActionCompatParcelizer)
.class public interface abstract Landroidx/media3/ui/TrackSelectionView$RemoteActionCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/ui/TrackSelectionView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "RemoteActionCompatParcelizer"
.end annotation
