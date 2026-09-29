###### Class android.support.v4.graphics.drawable.IconCompatParcelizer (android.support.v4.graphics.drawable.IconCompatParcelizer)
.class public final Landroid/support/v4/graphics/drawable/IconCompatParcelizer;
.super Landroidx/core/graphics/drawable/IconCompatParcelizer;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 8
    invoke-direct {p0}, Landroidx/core/graphics/drawable/IconCompatParcelizer;-><init>()V

    return-void
.end method

.method public static read(Lo/getAllPermissionGroups;)Landroidx/core/graphics/drawable/IconCompat;
    .registers 1

    .line 10
    invoke-static {p0}, Landroidx/core/graphics/drawable/IconCompatParcelizer;->read(Lo/getAllPermissionGroups;)Landroidx/core/graphics/drawable/IconCompat;

    move-result-object p0

    return-object p0
.end method

.method public static write(Landroidx/core/graphics/drawable/IconCompat;Lo/getAllPermissionGroups;)V
    .registers 2

    .line 14
    invoke-static {p0, p1}, Landroidx/core/graphics/drawable/IconCompatParcelizer;->write(Landroidx/core/graphics/drawable/IconCompat;Lo/getAllPermissionGroups;)V

    return-void
.end method
