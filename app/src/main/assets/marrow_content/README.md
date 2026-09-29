# Marrow Content

This folder contains only Marrow educational content materialized from WEBREPLITX5. Edition 8 QBank is the active QBank source. Legacy/duplicate Marrow6 content is intentionally excluded.
EOF

echo "Marrow source synced into $DEST"
find "$DEST" -type f | wc -l
du -sh "$DEST"
